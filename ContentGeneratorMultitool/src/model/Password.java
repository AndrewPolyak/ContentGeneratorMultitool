package model;

/**
 * The Password class contains various variables (and getters) for values which may be used in password creation
 * 
 * @version 4/22/2024
 * @author Andrew Polyak
 */
public class Password {

	// The constant String value LETTERS_LOWERCASE contains the entire lower-case English alphabet (a-z)
	private static final String LETTERS_LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
	
	// The constant String value LETTERS_UPPERCASE contains the entire upper-case English alphabet (A-Z)
	private static final String LETTERS_UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	// The constant String value NUMBERS contains all Hindu-Arabic numbers (0-9)
	private static final String NUMBERS = "0123456789";
	
	// The constant String value SPECIAL_CHARACTERS_ALL contains all special characters commonly found on keyboards
	private static final String SPECIAL_CHARACTERS_ALL = "!@#$%^&*()_-+={[}]:;<,>.?/~`|\\\"\'";
	
	// The constant String value SPECIAL_CHARACTERS_LTD contains all special characters commonly found on keyboards except for the following: " ' \
	private static final String SPECIAL_CHARACTERS_LTD = "!@#$%^&*()_-+={[}]:;<,>.?/~`|";
	
	// The constant String value SPACE contains a space character
	private static final String SPACE = " ";
	
	
	/**
	 * Basic constructor for Password
	 */
	public Password() { }


	/**
	 * The getLettersLowercase method returns the entire lower-case English alphabet (a-z) as a String value
	 * 
	 * @return TODO
	 */
	public static String getLettersLowercase() {
		return LETTERS_LOWERCASE;
	}

	
	/**
	 * The getLettersUppercase method returns the entire upper-case English alphabet (A-Z) as a String value
	 * 
	 * @return TODO
	 */
	public static String getLettersUppercase() {
		return LETTERS_UPPERCASE;
	}


	/**
	 * The getNumbers method returns all Hindu-Arabic numerals (0-9) as a String value
	 * 
	 * @return
	 */
	public static String getNumbers() {
		return NUMBERS;
	}


	/**
	 * The getSpecialCharactersAll method returns all special characters commonly found on keyboards as a String value
	 * 
	 * @return TODO
	 */
	public static String getSpecialCharactersAll() {
		return SPECIAL_CHARACTERS_ALL;
	}


	/**
	 * The getSpecialCharactersLtd method returns all special characters commonly found on keyboards except for the following: " ' \ as a String value
	 * 
	 * @return TODO
	 */
	public static String getSpecialCharactersLtd() {
		return SPECIAL_CHARACTERS_LTD;
	}


	/**
	 * The getSpace method returns a space character as a String value
	 * 
	 * @return TODO
	 */
	public static String getSpace() {
		return SPACE;
	}
	
	
	/**
	 * The formatData method returns the parameter with a newline so as to save the data in the correct structure
	 * @param password a String value representing the password saved by the user
	 * @return password + newline
	 */
	public String formatData(String password) {
		return password + "/n";
	}
	
}
