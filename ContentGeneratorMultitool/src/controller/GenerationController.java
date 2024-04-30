package controller;

import java.security.SecureRandom;
import java.util.ArrayList;

import model.Password;


/**
 * The GenerationController class contains the logic for randomly generating content within the program
 * 
 * @version 04/30/2024
 * @author Andrew Polyak
 */
public class GenerationController {
	
	// password is an instance of the Password class which contains all of the data for creating a password
	Password password;
	
	/*
	 * randomizer is an instance of the SecureRandom class which facilitates cryptographically strong pseudo-random number generation
	 * 
	 * Discovered from: https://www.baeldung.com/java-secure-random
	 */
	SecureRandom randomizer;
	
	
	/**
	 * The GenerationController constructor <br>
	 * Instantiates password and randomizer, which are, respectively, instances of Password and SecureRandom
	 */
	public GenerationController() {
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
	
	
	/**
	 * TODO
	 * 
	 * @param firstNames
	 * @param lastNames
	 * @return TODO
	 */
	public String generateName(ArrayList<String> firstNames, ArrayList<String> lastNames) {
		
		// TODO
		String firstName;
		
		// TODO
		String lastName;
		
		// TODO
		String fullName;
		
		firstName = firstNames.get(randomizer.nextInt(firstNames.size() - 1));
		lastName = lastNames.get(randomizer.nextInt(lastNames.size() - 1));
		
		fullName = firstName + " " + lastName;
		
		return fullName;
	}
	
	
	/**
	 * TODO
	 * 
	 * @param domainNames
	 * @param fullName
	 * @return TODO
	 */
	public String generateEmail(ArrayList<String> domainNames, String fullName) {
		
		String email;
		
		// TODO
		String fullNameSplit[] = fullName.split(" ");
		
		// TODO
		String firstName = fullNameSplit[0].toLowerCase();
			
		// TODO
		String lastName = fullNameSplit[1].toLowerCase();
		
		//TODO
		String domainName = domainNames.get(randomizer.nextInt(domainNames.size() - 1)).toLowerCase();
		
		// TODO
		boolean includeNumber = randomizer.nextBoolean();
		
		// TODO
		boolean includeSeparator = randomizer.nextBoolean();
		
		// TODO
		String includedNumber = "";
		
		// TODO
		String includedSeparator = "";
		
		// TODO
		if (includeNumber) {
			int randomNumber = randomizer.nextInt(99);
			includedNumber = "" + randomNumber;
		}
		
		// TODO
		if (includeSeparator) {
			int i = randomizer.nextInt(2);
			
			// 0 = period, 1 = underscore, 2 = no separator
			switch (i) {
			case 0 :
				includedSeparator = ".";
				break;
			case 1 :
				includedSeparator = "_";
				break;
			}	
		}
		
		email = firstName + includedSeparator + lastName + includedNumber + "@" + domainName + ".com";
		
		return email;
	}
	
	
}
