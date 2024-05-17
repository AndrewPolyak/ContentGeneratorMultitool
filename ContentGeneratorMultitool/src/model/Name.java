package model;

/**
 * The Name class contains the formatting logic for displaying a name in the saved names database
 * 
 * @version 05/17/2024
 * @author Andrew Polyak
 */
public class Name extends GeneratedData {

	/**
	 * Default constructor for Name
	 */
	public Name() { }
	
	
	/**
	 * The formatName method formats the name to be properly displayed in the saved names database
	 * 
	 * @param name
	 * @return formatted name
	 */
	public String formatName(String name) {
		return "Name: " + name;
	}
	
}
