package controller;

import java.security.SecureRandom;
import java.time.Year;
import java.util.ArrayList;
import java.util.Calendar;

import model.Password;


/**
 * The GenerationController class contains the logic for randomly generating content within the program
 * 
 * @version 05/01/2024
 * @author Andrew Polyak
 */
public class GenerationController {
	
	// password is an instance of the Password class which contains all of the data for creating a password
	Password password;
	
	// TODO
	Calendar calendar;
	
	/*
	 * randomizer is an instance of the SecureRandom class which facilitates cryptographically strong pseudo-random number generation
	 * 
	 * Discovered from: https://www.baeldung.com/java-secure-random
	 */
	SecureRandom randomizer;
	
	
	/**
	 * The GenerationController constructor <br>
	 * TODO
	 */
	public GenerationController() {
		password = new Password();
		calendar = Calendar.getInstance();
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
	 * TODO
	 * 
	 * @param name
	 * @return
	 */
	private String toTitleCase(String name) {
		
		// Get the first letter of the name (firstCharLower), then capitalize it (firstCharUpper)
		char firstCharLower = name.charAt(0);
		char firstCharUpper = Character.toUpperCase(firstCharLower);
		
		// TODO
		name = name.replaceFirst(String.valueOf(firstCharLower), String.valueOf(firstCharUpper));
		
		return name;
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
		String domainName = domainNames.get(randomizer.nextInt(domainNames.size())).toLowerCase();
		
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
	
	
	
	public String generateBirthday(int lowerAge, int upperAge) {
		
		calendar.clear();
		
		// TODO
		String birthday;
		
		String month; // TODO
		String date; // TODO
		String year; // TODO
		
		// TODO
		int randomDate = randomizer.nextInt(31);
		
		// TODO
		int randomMonth = randomizer.nextInt(12);
		
		// TODO
		String currentYear = Year.now().toString();
		
		System.out.println(currentYear);
		
		// TODO
		int randomYear = Integer.parseInt(currentYear) - ((lowerAge) + randomizer.nextInt(upperAge - lowerAge)); // FIXME this line of logic doesn't work with the extremes
		
		// TODO
		calendar.set(randomYear, randomMonth, randomDate);
		
		// TODO
		String[] splittedDate = calendar.getTime().toString().split(" ");
		month = splittedDate[1];
		date = splittedDate[2];
		year = splittedDate[5];
		
		// Format the data
		birthday = month + "/" + date + "/" + year;
		
		return birthday;
	}
	
}
