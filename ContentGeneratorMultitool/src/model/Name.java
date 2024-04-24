package model;

/**
 * The Name class contains a data formatting method for file storage
 * 
 * @version 4/24/2024
 * @author Andrew Polyak
 */
public class Name {

	/**
	 * Basic constructor for Name
	 */
	public Name () { }
	
	
	/**
	 * The formatData method returns the parameter with a newline so as to save the data in the correct structure
	 * @param name a String value representing the name saved by the user
	 * @return name + newline
	 */
	public String formatData(String name) {
		return name + "/n";
	}
	
}
