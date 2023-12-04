package me.espercroft.util;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Represents data that are stored or to be stored in a text-based configuration file.
 * </br></br>
 * Fetching and assigning data to a configuration will always require a keypath supplied as a parameter.
 * Keypaths are a combination of alphanumeric characters that may include a period (.) to denote a key separator (in the same sense as how (/) is the path separator for files in a filesystem)
 * </br></br>
 * The simplistic nature of accessing and modifying data in configurations impose
 * a number of restrictions on how data is structured. For one, there can never be anonymous
 * arrays. For there are no anonymous arrays, nested arrays are also not possible.
 * Also, dictionaries (an ordered set of key/value pairs) can never be anonymous as they are to be accessible by a keypath, and in turn dictionaries cannot be stored in an array.
 * </br></br>
 * @author Espercroft
 */
public abstract class Configuration{
	
	public abstract String fetch(String keypath) throws NoSuchElementException;
	
	public abstract void assign(String keypath, String value);
	
	public abstract void save() throws IOException;
	
	public abstract List<String> fetchArray(String keypath);
	
	public abstract void assignArray(String keypath, List<String> array);
	
	public abstract File file();
	
	public abstract boolean remove(String keypath);
}
