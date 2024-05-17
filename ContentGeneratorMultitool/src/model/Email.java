package model;

/**
 * The Email class contains the formatting logic for displaying an email in the saved emails database
 * 
 * @version 05/17/2024
 * @author Andrew Polyak
 */
public class Email extends GeneratedData {

	/**
	 * Default constructor for Email
	 */
	public Email() { }
	
	
	/**
	 * The formatEmail method formats the email to be properly displayed in the saved emails database
	 * 
	 * @param email
	 * @return formatted email
	 */
	public String formatEmail(String email) {
		return "Email: " + email;
	}
	
}
