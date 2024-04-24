package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import model.Birthday;
import model.Email;
import model.Name;
import model.Password;


/**
 * The MultitoolController class contains the main logic for the program, including the methods for random generation, button handling, data loading/saving, etc.
 * 
 * @version 04/23/2024
 * @author Andrew Polyak
 */
public class MultitoolController {
	
	//TODO
	private Password password;
	
	//TODO
	private Name name;
	
	//TODO
	private Email email;
	
	//TODO
	private Birthday birthday;
	
	// TODO
	private ArrayList<String> passwords;
	
	//TODO
	private ArrayList<String> names;
	
	//TODO
	private ArrayList<String> emails;
	
	//TODO
	private ArrayList<String> birthdays;
	
	//TODO
	private ArrayList<String> firstNames;
	
	//TODO
	private ArrayList<String> lastNames;
	
	
	/**
	 * The MultitoolController constructor <br>
	 * Loads the user's save data and instantiates objects for Password, Name, Email, and Birthday to facilitate content generation
	 */
	public MultitoolController() {
		password = new Password();
		name = new Name();
		email = new Email();
		birthday = new Birthday();
		
		// Load saved data
		loadPasswordData();
		loadNameData();
		loadEmailData();
		loadBirthdayData();
		
		// Load generation resource data
		loadFirstNameDatabase();
		loadLastNameDatabase();
	}
	
	
	/**
	 * The loadPasswordData method loads the txt file containing the user's saved passwords into the passwords ArrayList
	 */
	private void loadPasswordData() {
		
		// Instantiate passwords, which will contain all passwords
		passwords = new ArrayList<>();
		
		// password is a String value which will contain each password read from the data file
		String password;
		
		File pwdb = new File("resources/saved-passwords.txt"); // pwdb (password database) 
		
		try {
			Scanner fileReader = new Scanner(pwdb);
			
			// For each line of pwdb, assign the line's data to password, then append that value to the passwords ArrayList
			while (fileReader.hasNext()) {
				password = fileReader.nextLine().trim();
				passwords.add(password);
			}
			fileReader.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	/**
	 * The savePasswordData method reads the ArrayList containing all passwords saved by the user, and
	 * formats + adds the data to the saved-passwords txt file
	 */
	private void savePasswordData() {
		try {
			FileWriter fileWriter = new FileWriter("resources/saved-passwords.txt");
			PrintWriter printWriter = new PrintWriter(fileWriter);
			
			// Write each saved password to the saved password database
			for (String password : passwords) {
				printWriter.write(this.password.formatData(password));
			}
			
			printWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	/**
	 * The loadNameData method loads the txt file containing the user's saved names into the names ArrayList
	 */
	private void loadNameData() {
		names = new ArrayList<>();
		
		// Instantiate names, which will contain all full names
				names = new ArrayList<>();
				
				// name is a String value which will contain each full name read from the data file
				String name;
				
				File ndb = new File("resources/saved-names.txt"); // ndb (name database) 
				
				try {
					Scanner fileReader = new Scanner(ndb);
					
					// For each line of ndb, assign the line's data to name, then append that value to the names ArrayList
					while (fileReader.hasNext()) {
						name = fileReader.nextLine().trim();
						names.add(name);
					}
					fileReader.close();
				} catch (FileNotFoundException e) {
					System.out.println(e.getMessage());
				}
	}
	
	
	/**
	 * The saveNameData method reads the ArrayList containing all names saved by the user, and
	 * formats + adds the data to the saved-names txt file
	 */
	private void saveNameData() {
		try {
			FileWriter fileWriter = new FileWriter("resources/saved-names.txt");
			PrintWriter printWriter = new PrintWriter(fileWriter);
			
			// Write each saved full name to the saved name database
			for (String name : names) {
				printWriter.write(this.name.formatData(name));
			}
			
			printWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	/**
	 * The loadEmailData method loads the txt file containing the user's saved emails into the emails ArrayList
	 */
	private void loadEmailData() {
		emails = new ArrayList<>();
		
		// Instantiate emails, which will contain all emails
		emails = new ArrayList<>();
		
		// email is a String value which will contain each email read from the data file
		String email;
		
		File edb = new File("resources/saved-emails.txt"); // edb (email database) 
		
		try {
			Scanner fileReader = new Scanner(edb);
			
			// For each line of edb, assign the line's data to email, then append that value to the emails ArrayList
			while (fileReader.hasNext()) {
				email = fileReader.nextLine().trim();
				emails.add(email);
			}
			fileReader.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	/**
	 * The saveEmailData method reads the ArrayList containing all emails saved by the user, and
	 * formats + adds the data to the saved-emails txt file
	 */
	private void saveEmailData() {
		try {
			FileWriter fileWriter = new FileWriter("resources/saved-emails.txt");
			PrintWriter printWriter = new PrintWriter(fileWriter);
			
			// Write each saved email to the saved email database
			for (String email : emails) {
				printWriter.write(this.email.formatData(email));
			}
			
			printWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	/**
	 * The loadBirthdayData method loads the txt file containing the user's saved birthdays into the birthdays ArrayList
	 */
	private void loadBirthdayData() {
		birthdays = new ArrayList<>();
		//TODO
	}
	
	
	/**
	 * TODO
	 */
	private void saveBirthdayData() {
		//TODO
	}
	
	
	/**
	 * The loadFirstNameDatabase method loads the txt file containing all potential first names that may be used for 
	 * name generation into the firstNames ArrayList
	 */
	private void loadFirstNameDatabase() {
		
		// Instantiate firstNames, which will contain all first names
		firstNames = new ArrayList<>();
		
		// firstName is a String value which will contain each first name read from the data file
		String firstName;
		
		File fndb = new File("resources/first-names.txt"); // fndb (first name database) 
		
		try {
			Scanner fileReader = new Scanner(fndb);
			
			// For each line of fndb, assign the line's data to firstName, then append that value to the firstNames ArrayList
			while (fileReader.hasNext()) {
				firstName = fileReader.nextLine().trim();
				firstNames.add(firstName);
			}
			fileReader.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	/**
	 * The loadLastNameDatabase method loads the txt file containing all potential last names that may be used for 
	 * name generation into the lastNames ArrayList
	 */
	private void loadLastNameDatabase() {

		// Instantiate lastNames, which will contain all last names
		lastNames = new ArrayList<>();
		
		// lastName is a String value which will contain each last name read from the data file
		String lastName;
		
		File lndb = new File("resources/last-names.txt"); // lndb (last name database) 
		
		try {
			Scanner fileReader = new Scanner(lndb);
			
			// For each line of lndb, assign the line's data to lastName, then append that value to the lastNames ArrayList
			while (fileReader.hasNext()) {
				lastName = fileReader.nextLine().trim();
				lastNames.add(lastName);
			}
			fileReader.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
	
}
