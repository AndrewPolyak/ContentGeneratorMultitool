package model;

/**
 * The Birthday class contains a data formatting method for file storage
 * 
 * @version 4/24/2024
 * @author Andrew Polyak
 */
public class Birthday {

	/**
	 * Basic constructor for Birthday
	 */
	public Birthday () { }
	
	
	/**
	 * The formatData method returns the parameter with a newline so as to save the data in the correct structure
	 * @param birthday a String value representing the birthday saved by the user
	 * @return birthday + newline
	 */
	public String formatData(String birthday) {
		return birthday + "/n";
	}
	
}
