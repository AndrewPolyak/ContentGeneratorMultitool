package model;

/**
 * The Birthday class contains the formatting logic for displaying a birthday in the saved birthdays database
 * 
 * @version 05/17/2024
 * @author Andrew Polyak
 */
public class Birthday extends GeneratedData {

	/**
	 * Default constructor for Birthday
	 */
	public Birthday() { }
	
	
	/**
	 * The formatBirthday method formats the birthday to be properly displayed in the saved birthdays database
	 * 
	 * @param birthday
	 * @return formatted birthday
	 */
	public String formatBirthday(String birthday) {
		return "Birthday: " + birthday;
	}
	
}
