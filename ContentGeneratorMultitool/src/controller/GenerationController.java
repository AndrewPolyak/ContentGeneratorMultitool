package controller;

import java.security.SecureRandom;
import java.time.Year;
import java.util.ArrayList;
import java.util.Calendar;

import model.Password;


/**
 * The GenerationController class contains the logic for randomly generating content within the program
 * 
 * @version 05/15/2024
 * @author Andrew Polyak
 */
public class GenerationController {
	
	// password is an instance of the Password class which contains all of the data for creating a password
	Password password;
	
	// calendar is an instance of the Calendar class
	Calendar calendar;
	
	/*
	 * randomizer is an instance of the SecureRandom class which facilitates cryptographically strong pseudo-random number generation
	 * 
	 * Discovered from: https://www.baeldung.com/java-secure-random
	 */
	SecureRandom randomizer;
	
	
	/**
	 * The GenerationController constructor <br>
	 * Instantiates password, calendar, and randomizer
	 */
	public GenerationController() {
		password = new Password();
		calendar = Calendar.getInstance();
		randomizer = new SecureRandom();
	}
	
	
	/**
	 * The generatePassword method takes in boolean values determining the password customization parameters, as well as the desired length of the password <br>
	 * Whatever parameters are selected then prompt the addition of the relevant characters to the password generation RNG pool <br>
	 * A randomized string of the desired length is then generated based on the RNG pool
	 * 
	 * @param uppercase a boolean value indicating whether to include uppercase letters (true) in the RNG pool or not (false)
	 * @param lowercase a boolean value indicating whether to include lowercase (true) in the RNG pool or not (false)
	 * @param allChars a boolean value indicating whether to include all special characters (true) in the RNG pool or not (false)
	 * @param ltdChars a boolean value indicating whether to include a limited selection of special characters (true) in the RNG pool or not (false)
	 * @param numbers a boolean value indicating whether to include numbers (true) in the RNG pool or not (false)
	 * @param space a boolean value indicating whether to include spaces (true) in the RNG pool or not (false)
	 * @param length an integer value representing the length of the password
	 * @return password
	 */
	public String generatePassword(boolean uppercase, boolean lowercase, boolean allChars, boolean ltdChars, boolean numbers, boolean space, int length) {
		String password = ""; // password represents the final generated password
		String passwordContent = ""; // passwordContent represents the pool of characters that may be used in the password
		
		// For each password customization parameter, if it is selected, add the relevant character(s) to passwordContent
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
		
		// Pick a random character from passwordContent and append it to password; repeat this for as many times as the desired length allows
		for (int charNum = 1; charNum <= length; charNum++) {
			password += passwordContent.charAt(randomizer.nextInt(passwordContent.length()));
		}
		
		return password;
	}
	
	
	/**
	 * The generateName method takes in ArrayLists containing first names and last names respectively <br>
	 * From each ArrayList, a random index is chosen and assigned to firstName and lastName <br>
	 * firstName and lastName are then capitalized to title case (names should be capitalized and appended to fullName
	 * 
	 * @param firstNames an ArrayList of String values representing the pool of first names
	 * @param lastNames an ArrayList of String values representing the pool of last names
	 * @return fullName
	 */
	public String generateName(ArrayList<String> firstNames, ArrayList<String> lastNames) {
		String firstName; // firstName represents the randomly picked first name
		String lastName; // lastName represents the randomly picked last name
		String fullName; // fullName represents the combination of firstName and lastName
		
		// Get a random first and last name
		firstName = firstNames.get(randomizer.nextInt(firstNames.size() - 1));
		lastName = lastNames.get(randomizer.nextInt(lastNames.size() - 1));
		
		// Assign title case to each name
		firstName = toTitleCase(firstName);
		lastName = toTitleCase(lastName);
		
		// Format the names to become a full name
		fullName = firstName + " " + lastName;
		
		return fullName;
	}
	
	
	/**
	 * The toTitleCase method capitalizes the first character of a String argument
	 * 
	 * @param word
	 * @return word
	 */
	private String toTitleCase(String word) {
		
		if (word.matches("\\d+")) {
			// Get the first letter of the name (firstCharLower), then capitalize it (firstCharUpper)
			char firstCharLower = word.charAt(0);
			char firstCharUpper = Character.toUpperCase(firstCharLower);
			
			// Replace the first character value with its capitalized version
			word = word.replaceFirst(String.valueOf(firstCharLower), String.valueOf(firstCharUpper));
		}
		
		return word;
	}


	/**
	 * TODO
	 * 
	 * @param domainNames
	 * @param fullName
	 * @return TODO
	 */
	public String generateEmail(ArrayList<String> domainNames, String fullName) {
		String email; // TODO
		String includedNumber = ""; // TODO
		String includedSeparator = ""; // TODO
		
		// TODO
		String fullNameSplit[] = fullName.split(" ");
		String firstName = fullNameSplit[0].toLowerCase();
		String lastName = fullNameSplit[1].toLowerCase();
		
		// TODO
		String domainName = domainNames.get(randomizer.nextInt(domainNames.size())).toLowerCase();
		
		// TODO
		boolean includeNumber = randomizer.nextBoolean();
		boolean includeSeparator = randomizer.nextBoolean();
		
		// If a number is randomly decided to be included, generate a random one between 0 and 99
		if (includeNumber) {
			int randomNumber = randomizer.nextInt(99);
			includedNumber = "" + randomNumber;
		}
		
		// If a separator is randomly decided to be included, randomly pick whether to include an underscore or a period
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
		
		// Format the email; includedSeparator and includedNumber may or may not be an empty String value
		email = firstName + includedSeparator + lastName + includedNumber + "@" + domainName + ".com";
		
		return email;
	}
	
	
	
	public String generateBirthday(int lowerAge, int upperAge) {
		int randomDate = randomizer.nextInt(31); // randomDate represents a random date of the month
		int randomMonth = randomizer.nextInt(12); // randomMonth represents a random month
		String currentYear = Year.now().toString(); // currentYear represents the real world current year
		int yearsRange = upperAge - lowerAge; // yearsRange represents the numerical range between the upper age and lower age limits
		
		calendar.clear();
		
		// For the sake of further processing, ensure the range value is at least 1
		if (yearsRange == 0) {
			yearsRange = 1;
		}
		
		// Pick out a random year which falls between the birth years of the provided ages
		int randomYear = lowerAge + randomizer.nextInt(yearsRange); // randomYear will be a number represented as "X years ago" (example: 20 years ago)
		int year = Integer.parseInt(currentYear) - randomYear; // year will be the current year minus the random year (example: 2024 - 20 = 2004 --> year = 2004)
		
		// Set the calendar to the randomly generated date
		calendar.set(year, randomMonth, randomDate);
		
		// Extract month, date, and year from the calendar's toString formatting
		String[] splittedDate = calendar.getTime().toString().split(" ");
		String monthFinal = splittedDate[1];
		String dateFinal = splittedDate[2];
		String yearFinal = splittedDate[5];
		
		// Format the data
		String birthday = monthFinal + "/" + dateFinal + "/" + yearFinal;
		
		return birthday;
	}
	
}
