package controller;

import java.io.File;
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
		
		loadPasswordData();
		loadNameData();
		loadEmailData();
		loadBirthdayData();
		
		loadFirstNameDatabase();
		loadLastNameDatabase();
	}
	
	
	/**
	 * The loadPasswordData method loads the txt file containing the user's saved passwords into the passwords ArrayList
	 */
	private void loadPasswordData() {
		passwords = new ArrayList<>();
	}
	
	/**
	 * The loadNameData method loads the txt file containing the user's saved names into the names ArrayList
	 */
	private void loadNameData() {
		names = new ArrayList<>();
	}
	
	/**
	 * The loadEmailData method loads the txt file containing the user's saved emails into the emails ArrayList
	 */
	private void loadEmailData() {
		emails = new ArrayList<>();
	}
	
	/**
	 * The loadBirthdayData method loads the txt file containing the user's saved birthdays into the birthdays ArrayList
	 */
	private void loadBirthdayData() {
		birthdays = new ArrayList<>();
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
		
		try {
			File fndb = new File("resources/first-names.txt"); // fndb (first name database) 
			Scanner fileReader = new Scanner(fndb);
			
			// For each line of fndb, assign the line's data to firstName, then append that value to the firstNames ArrayList
			while (fileReader.hasNext()) {
				firstName = fileReader.nextLine().trim();
				firstNames.add(firstName);
			}
			fileReader.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	/**
	 * TODO
	 */
	private void loadLastNameDatabase() {
		lastNames = new ArrayList<>();
	}
	
}
