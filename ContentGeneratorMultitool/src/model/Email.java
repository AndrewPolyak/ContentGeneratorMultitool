package model;

/**
 * The Email class contains a data formatting method for file storage
 * 
 * @version 4/24/2024
 * @author Andrew Polyak
 */
public class Email {

	/**
	 * Basic constructor for Email
	 */
	public Email () { }
	
	
	/**
	 * The formatData method returns the parameter with a newline so as to save the data in the correct structure
	 * @param email a String value representing the email saved by the user
	 * @return email + newline
	 */
	public String formatData(String email) {
		return email + "/n";
	}
	
}
