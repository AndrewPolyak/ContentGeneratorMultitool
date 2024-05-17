package model;

/**
 * The Password class contains various variables (and getters) for values which may be used in password creation,
 * as well as a data formatting method for file storage
 * 
 * @version 4/24/2024
 * @author Andrew Polyak
 */
public class Password extends GeneratedData {

	// The constant String value LETTERS_LOWERCASE contains the entire lower-case English alphabet (a-z)
	private final String LETTERS_LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
	
	// The constant String value LETTERS_UPPERCASE contains the entire upper-case English alphabet (A-Z)
	private final String LETTERS_UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	// The constant String value NUMBERS contains all Hindu-Arabic numbers (0-9)
	private final String NUMBERS = "0123456789";
	
	// The constant String value SPECIAL_CHARACTERS_ALL contains all special characters commonly found on keyboards
	private final String SPECIAL_CHARACTERS_ALL = "!@#$%^&*()_-+={[}]:;<,>.?/~`|\\\"\'";
	
	// The constant String value SPECIAL_CHARACTERS_LTD contains all special characters commonly found on keyboards except for the following: " ' \
	private final String SPECIAL_CHARACTERS_LTD = "!@#$%^&*()_-+={[}]:;<,>.?/~`|";
	
	// The constant String value SPACE contains a space character
	private final String SPACE = " ";
	
	
	/**
	 * Basic constructor for Password
	 */
	public Password() { }


	/**
	 * The getLettersLowercase method returns the entire lower-case English alphabet (a-z) as a String value
	 * 
	 * @return LETTERS_LOWERCASE
	 */
	public String getLettersLowercase() {
		return LETTERS_LOWERCASE;
	}

	
	/**
	 * The getLettersUppercase method returns the entire upper-case English alphabet (A-Z) as a String value
	 * 
	 * @return LETTERS_UPPERCASE
	 */
	public String getLettersUppercase() {
		return LETTERS_UPPERCASE;
	}


	/**
	 * The getNumbers method returns all Hindu-Arabic numerals (0-9) as a String value
	 * 
	 * @return NUMBERS
	 */
	public String getNumbers() {
		return NUMBERS;
	}


	/**
	 * The getSpecialCharactersAll method returns all special characters commonly found on keyboards as a String value
	 * 
	 * @return SPECIAL_CHARACTERS_ALL
	 */
	public String getSpecialCharactersAll() {
		return SPECIAL_CHARACTERS_ALL;
	}


	/**
	 * The getSpecialCharactersLtd method returns all special characters commonly found on keyboards except for the following: " ' \ as a String value
	 * 
	 * @return SPECIAL_CHARACTERS_LTD
	 */
	public String getSpecialCharactersLtd() {
		return SPECIAL_CHARACTERS_LTD;
	}


	/**
	 * The getSpace method returns a space character as a String value
	 * 
	 * @return SPACE
	 */
	public String getSpace() {
		return SPACE;
	}
	
	
	public String formatPassword(String password) {
		return "Password: " + password;
	}
	
	
	public String formatPasswordAndWeb(String password, String website) {
		return "Website: " + website + "; Password: " + password;
	}


	public String formatAccountDetails(String password, String website, String username) {
		return "Website: " + website + "; Username: " + username + "; Password: " + password;
	}
	
	
	public String formatPasswordAndUsername(String password, String username) {
		return "Username: " + username + "; Password: " + password;
	}
	
}
