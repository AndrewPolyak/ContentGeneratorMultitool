package model;

/**
 * TODO
 */
public class Password {

	// TODO
	private static final String LETTERS_LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
	
	// TODO
	private static final String LETTERS_UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	// TODO
	private static final String NUMBERS = "0123456789";
	
	// TODO
	private static final String SPECIAL_CHARACTERS_ALL = "!@#$%^&*()_-+={[}]:;<,>.?/~`|\\\"\'";
	
	// TODO
	private static final String SPECIAL_CHARACTERS_LIMITED = "!@#$%^&*()_-+={[}]:;<,>.?/~`|";
	
	// TODO
	private static final String SPACE = " ";
	
	
	/**
	 * Basic constructor for Password
	 */
	public Password() { }


	/**
	 * TODO
	 * 
	 * @return
	 */
	public static String getLettersLowercase() {
		return LETTERS_LOWERCASE;
	}

	
	/**
	 * TODO
	 * 
	 * @return
	 */
	public static String getLettersUppercase() {
		return LETTERS_UPPERCASE;
	}


	/**
	 * TODO
	 * 
	 * @return
	 */
	public static String getNumbers() {
		return NUMBERS;
	}


	/**
	 * TODO
	 * 
	 * @return
	 */
	public static String getSpecialCharactersAll() {
		return SPECIAL_CHARACTERS_ALL;
	}


	/**
	 * TODO
	 * 
	 * @return
	 */
	public static String getSpecialCharactersLimited() {
		return SPECIAL_CHARACTERS_LIMITED;
	}


	/**
	 * TODO
	 * 
	 * @return
	 */
	public static String getSpace() {
		return SPACE;
	}
	
}
