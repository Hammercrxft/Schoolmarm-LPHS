package me.espercroft.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class RudimentaryConfig extends Configuration {
	private List<Attribute> dataContainer;
	private final File file;

	private RudimentaryConfig(File the_file) {
		dataContainer = new ArrayList<>();
		file = the_file;
	}

	private RudimentaryConfig(File the_file, List<Attribute> the_data) {
		dataContainer = the_data;
		file = the_file;
	}

	public static RudimentaryConfig newBlank(File the_target) {
		return new RudimentaryConfig(the_target);
	}

	public static RudimentaryConfig readFromFile(File the_target) throws FileNotFoundException {
		List<Attribute> tempRoot = new ArrayList<>();
		List<String> tempArray = null; //null if not currently working on an array
		String tempArrayKey = null;   //same thing here
		Long line_count = 0l;

		List<String> lines = new ArrayList<>();
		try (Scanner scn = new Scanner(the_target)) {
			while (scn.hasNextLine()) {
				lines.add(scn.nextLine());
			}
		}

		for (String line : lines) {
			line_count++;
			line.strip();
			//line.stripIndent();
			String[] tokens = line.split("\\s+");
			switch (tokens[0]) {
			case "attribute":
				tempRoot.add(new Attribute(
						tokens[1],
						concatLaterLaterTokens(tokens),
						Nature.VALUE));
				break;
			case "null_attribute":
				tempRoot.add(new Attribute(
						tokens[1],
						null,
						Nature.VALUE));
				break;
			case "array":
				if ((tempArray != null) && (tempArrayKey != null)) {
					throw new UnsupportedOperationException("Tried to define a new array while filling an array. Nested arrays are not supported.");
				}
				tempArray = new ArrayList<String>();
				tempArrayKey = concatLaterTokens(tokens);
				break;
			case "element":
				tempArray.add(concatLaterTokens(tokens));
				break;
			case "null_element":
				tempArray.add(null);
			case "array_end":
				if ((tempArray == null) && (tempArrayKey == null)) {
					throw new NoSuchElementException("Instruction 'array_end' was read but no array was being worked on. Configuration file is malformed.");
				}
				tempRoot.add(new Attribute(
						tempArrayKey,
						tempArray,
						Nature.ARRAY
						));
				tempArrayKey = null;
				tempArray = null;
				break;
			case "":
			case "#":
				break;
			default:
				throw new UnsupportedOperationException("Unexpected '"+tokens[0]+"' while reading line "+line_count);
			}
		}
		return new RudimentaryConfig(the_target, tempRoot);
	}
	
	public static String concatLaterTokens(String[] tokens) {
		if (tokens.length == 1) {
			return null;
		}
		StringBuilder sb = new StringBuilder();
		boolean gradeLevelSkipped = false;
		for (String token : tokens) {
			if (!gradeLevelSkipped) {
				gradeLevelSkipped = true;
				continue;
			}

			sb.append(token);
			sb.append(" ");
		}
		sb.deleteCharAt(sb.length() - 1);
		return sb.toString();
	}
	public static String concatLaterLaterTokens(String[] tokens) {
		if (tokens.length <= 2) {
			return null;
		}
		StringBuilder sb = new StringBuilder();
		boolean gradeLevelSkipped = false;
		boolean gradeLevelSkipped2 = false;
		for (String token : tokens) {
			if (!gradeLevelSkipped) {
				gradeLevelSkipped = true;
				continue;
			}
			if (!gradeLevelSkipped2) {
				gradeLevelSkipped2 = true;
				continue;
			}

			sb.append(token);
			sb.append(" ");
		}
		sb.deleteCharAt(sb.length() - 1);
		return sb.toString();
	}

	@Override
	public String fetch(String keypath) throws NoSuchElementException {
		for (Attribute item : dataContainer) {
			if (item.keypath.equals(keypath)) {
				if (item.nature != Nature.VALUE)
					throw new NoSuchElementException("Attribute '"+keypath+"' refers to an array, try fetchArray() instead.");
				return (String)item.content;
			}
		}
		throw new NoSuchElementException("No such attribute found with '"+keypath+"' keypath.");
	}

	@Override
	public void assign(String keypath, String value) {
		//check if the key already exists and yeet it if it does
		for (Attribute item : dataContainer) {
			if (item.keypath.equals(keypath)) {
				dataContainer.remove(item);
				return;
			}
		}
		dataContainer.add(new Attribute(
				keypath,
				value,
				Nature.VALUE
				));
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public void save() throws IOException {
		FileWriter write = new FileWriter(file);
		for (Attribute item : dataContainer) {
			switch(item.nature) {
			case ARRAY:
				write.append("array " + item.keypath);
				write.append('\n');
				if (item.content == null) {
					write.append("array_end");
					write.append('\n');
				} else {
					for (String specimen : (List<String>)item.content) {
						write.append("element "+specimen);
						write.append('\n');
					}
				}
				break;
			case DICTIONARY:
				//TODO if dictionaries are implemented, do me!
				break;
			case VALUE:
				if (item.content == null) {
					write.append("null_attribute " + item.keypath);
					write.append('\n');
				} else {
					write.append("attribute " + item.keypath + " " + ((String)item.content));
					write.append('\n');
				}
				break;
			}
		}
		write.close();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<String> fetchArray(String keypath) {
		for (Attribute item : dataContainer) {
			if (item.keypath.equals(keypath)) {
				if (item.nature != Nature.ARRAY)
					throw new NoSuchElementException("Attribute '"+keypath+"' refers to a value, try fetch() instead.");
				return (List<String>)item.content;
			}
		}
		throw new NoSuchElementException("No such attribute found with '"+keypath+"' keypath.");
	}

	@Override
	public void assignArray(String keypath, List<String> array) {
		//check if the key already exists and yeet it if it does
		for (Attribute item : dataContainer) {
			if (item.keypath.equals(keypath)) {
				dataContainer.remove(item);
				return;
			}
		}
		dataContainer.add(new Attribute(
				keypath,
				array,
				Nature.ARRAY
				));
	}
	
	@Override
	public boolean remove(String keypath) {
		for (Attribute item : dataContainer) {
			if (item.keypath.equals(keypath)) {
				dataContainer.remove(item);
				return true;
			}
		}
		return false;
	}

	@Override
	public File file() {
		return file;
	}
	
	@SuppressWarnings("unchecked")
	public void printStructure() {
		for (Attribute item : dataContainer) {
			switch (item.nature) {
			case ARRAY:
				System.out.println(item.keypath +" = {");
				for (String specimen : (List<String>)item.content) {
					System.out.println("  "+specimen+",");
				}
				System.out.println("}");
				break;
			case DICTIONARY:
				System.out.println("THIS IS A BUG IF YOU SEE ME!");
				break;
			case VALUE:
				if (item.content == null)
					System.out.println(item.keypath + " is null");
				else
					System.out.println(item.keypath + " = " + ((String)item.content));
				break;
			}
		}
	}


}
