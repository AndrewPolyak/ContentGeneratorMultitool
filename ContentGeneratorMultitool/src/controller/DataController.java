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
 * The DataController class contains the logic for loading and initializing all of the saved databases into the program
 * 
 * @version 5/17/2024
 * @author Andrew Polyak
 */
public class DataController {

	// passwords is an ArrayList of String values which represent all user-saved passwords
	private ArrayList<String> passwords;
	
	// names is an ArrayList of String values which represent all user-saved names
	private ArrayList<String> names;
	
	// emails is an ArrayList of String values which represent all user-saved emails
	private ArrayList<String> emails;
	
	// birthdays is an ArrayList of String values which represent all user-saved birthdays
	private ArrayList<String> birthdays;
	
	// firstNames is an ArrayList of String values which represents all possible first names which can be randomly generated
	private ArrayList<String> firstNames;
	
	// lastNames is an ArrayList of String values which represents all possible last names which can be randomly generated
	private ArrayList<String> lastNames;
		
	/**
	 * Default DataController constructor
	 */
	public DataController() { }
	
	
	/**
	 * The loadPasswordData method loads the txt file containing the user's saved passwords into the passwords ArrayList
	 */
	public ArrayList<String> loadPasswordData() {
		
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
		return passwords;
	}
	
	
	/**
	 * The savePasswordData method reads the ArrayList containing all passwords saved by the user, and
	 * formats + adds the data to the saved-passwords txt file
	 */
	public void savePasswordData(ArrayList<String> passwords, Password password) {
		try {
			FileWriter fileWriter = new FileWriter("resources/saved-passwords.txt");
			PrintWriter printWriter = new PrintWriter(fileWriter);
			
			// Write each saved password to the saved password database
			for (String pass : passwords) {
				printWriter.write(password.formatData(pass));
			}
			
			printWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	/**
	 * The loadNameData method loads the txt file containing the user's saved names into the names ArrayList
	 */
	public ArrayList<String> loadNameData() {
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
		return names;	
	}
	
	
	/**
	 * The saveNameData method reads the ArrayList containing all names saved by the user, and
	 * formats + adds the data to the saved-names txt file
	 */
	public void saveNameData(ArrayList<String> names, Name name) {
		try {
			FileWriter fileWriter = new FileWriter("resources/saved-names.txt");
			PrintWriter printWriter = new PrintWriter(fileWriter);
			
			// Write each saved full name to the saved name database
			for (String nam : names) {
				printWriter.write(name.formatData(nam));
			}
			
			printWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	/**
	 * The loadEmailData method loads the txt file containing the user's saved emails into the emails ArrayList
	 */
	public ArrayList<String> loadEmailData() {
		
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
		return emails;
	}
	
	
	/**
	 * The saveEmailData method reads the ArrayList containing all emails saved by the user, and
	 * formats + adds the data to the saved-emails txt file
	 */
	public void saveEmailData(ArrayList<String> emails, Email email) {
		try {
			FileWriter fileWriter = new FileWriter("resources/saved-emails.txt");
			PrintWriter printWriter = new PrintWriter(fileWriter);
			
			// Write each saved email to the saved email database
			for (String eml : emails) {
				printWriter.write(email.formatData(eml));
			}
			
			printWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	/**
	 * The loadBirthdayData method loads the txt file containing the user's saved birthdays into the birthdays ArrayList
	 */
	public ArrayList<String> loadBirthdayData() {

		// Instantiate birthdays, which will contain all birthdays
		birthdays = new ArrayList<>();
		
		// email is a String value which will contain each email read from the data file
		String birthday;
		
		File bdb = new File("resources/saved-birthdays.txt"); // bdb (birthday database) 
		
		try {
			Scanner fileReader = new Scanner(bdb);
			
			// For each line of bdb, assign the line's data to birthday, then append that value to the birthdays ArrayList
			while (fileReader.hasNext()) {
				birthday = fileReader.nextLine().trim();
				birthdays.add(birthday);
			}
			fileReader.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		return birthdays;
	}
	
	
	/**
	 * The saveBirthdayData method reads the ArrayList containing all birthdays saved by the user, and
	 * formats + adds the data to the saved-birthdays txt file
	 */
	public void saveBirthdayData(ArrayList<String> birthdays, Birthday birthday) {
		try {
			FileWriter fileWriter = new FileWriter("resources/saved-birthdays.txt");
			PrintWriter printWriter = new PrintWriter(fileWriter);
			
			// Write each saved birthday to the saved birthday database
			for (String bday : birthdays) {
				printWriter.write(birthday.formatData(bday));
			}
			
			printWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	/**
	 * The loadFirstNameDatabase method loads the txt file containing all potential first names that may be used for 
	 * name generation into the firstNames ArrayList
	 */
	public ArrayList<String> loadFirstNameDatabase() {
		
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
		return firstNames;
	}
	
	
	/**
	 * The loadLastNameDatabase method loads the txt file containing all potential last names that may be used for 
	 * name generation into the lastNames ArrayList
	 */
	public ArrayList<String> loadLastNameDatabase() {

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
		return lastNames;
	}
	
}
