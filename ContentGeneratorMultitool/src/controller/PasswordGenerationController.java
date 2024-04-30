package controller;

import java.security.SecureRandom;

import model.Password;


/**
 * The PasswordGenerationController class contains the logic for generating cryptographically secure passwords
 * 
 * @version 04/29/2024
 * @author Andrew Polyak
 */
public class PasswordGenerationController {
	
	// password is an instance of the Password class which contains all of the data for creating a password
	Password password;
	
	/*
	 * randomizer is an instance of the SecureRandom class which facilitates cryptographically strong pseudo-random number generation
	 * 
	 * Discovered from: https://www.baeldung.com/java-secure-random
	 */
	SecureRandom randomizer;
	
	
	/**
	 * The PasswordGenerationController constructor <br>
	 * Instantiates password and randomizer, which are, respectively, instances of Password and SecureRandom
	 */
	public PasswordGenerationController() {
		password = new Password();
		randomizer = new SecureRandom();
	}
	
	
	/**
	 * TODO
	 * 
	 * @param uppercase
	 * @param lowercase
	 * @param allChars
	 * @param ltdChars
	 * @param numbers
	 * @param space
	 * @param length
	 * @return TODO
	 */
	public String generatePassword(boolean uppercase, boolean lowercase, boolean allChars, boolean ltdChars, boolean numbers, boolean space, int length) {
		
		// TODO
		String password = "";
		
		// TODO
		String passwordContent = "";
		
		//TODO
		char nextChar;
		
		/*
		 * TODO
		 */
		if (uppercase) {
			passwordContent += this.password.getLettersUppercase();
		}
		if (lowercase) {
			passwordContent += this.password.getLettersLowercase();
		}
		if (allChars) {
			passwordContent += this.password.getSpecialCharactersAll();
		} else if (ltdChars) {
			passwordContent += this.password.getSpecialCharactersLtd();
		}
		if (numbers) {
			passwordContent += this.password.getNumbers();
		}
		if (space) {
			passwordContent += this.password.getSpace();
		}
		
		// TODO
		for (int charNum = 1; charNum <= length; charNum++) {
			nextChar = passwordContent.charAt(randomizer.nextInt(passwordContent.length()));
			password += nextChar;
		}
		
		return password;
		
	}
	
}
