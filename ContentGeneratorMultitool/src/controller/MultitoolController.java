package controller;

import java.util.ArrayList;

import model.Birthday;
import model.Email;
import model.Name;
import model.Password;


/**
 * The MultitoolController class contains the main logic for the program, including the methods for random generation, button handling, data loading/saving, etc.
 * 
 * @version 04/22/2024
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
	
	
	/**
	 * The MultitoolController constructor <br>
	 * Loads the user's save data and instantiates the necessary ArrayLists to store said data
	 */
	public MultitoolController() {
		password = new Password();
		name = new Name();
		email = new Email();
		birthday = new Birthday();
		
		passwords = new ArrayList<>();
		names = new ArrayList<>();
		emails = new ArrayList<>();
		birthdays = new ArrayList<>();
		
		loadPasswordData();
		loadNameData();
		loadEmailData();
		loadBirthdayData();
	}
	
	
	/**
	 * The loadPasswordData method loads the txt file containing the user's saved passwords into the passwords ArrayList
	 */
	private void loadPasswordData() {
		
	}
	
	/**
	 * The loadNameData method loads the txt file containing the user's saved names into the names ArrayList
	 */
	private void loadNameData() {
		
	}
	
	/**
	 * The loadEmailData method loads the txt file containing the user's saved emails into the emails ArrayList
	 */
	private void loadEmailData() {
		
	}
	
	/**
	 * The loadBirthdayData method loads the txt file containing the user's saved birthdays into the birthdays ArrayList
	 */
	private void loadBirthdayData() {
		
	}
	
}
