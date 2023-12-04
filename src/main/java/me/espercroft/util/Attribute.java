package me.espercroft.util;

/**
 * A read-only entry among others found in a configuration.
 * 
 * @implNote For the content to be of use in processing, it should be casted by its original type.
 * The nature field hints at the type of the content; <em>VALUE</em> denotes that the original type is a String,
 * <em>ARRAY</em> denotes a List&lt;String&gt;, and <em>DICTIONARY</em> denotes a Map&lt;String,String&gt;.
 * <br><br>
 */
public class Attribute {
	final Object content;
	final Nature nature;
	final String keypath;
	public Attribute(String the_keypath, Object the_content, Nature the_nature) {
		content = the_content;
		nature = the_nature;
		keypath = the_keypath;
	}
}
