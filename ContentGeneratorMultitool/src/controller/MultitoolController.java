package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import model.Birthday;
import model.Email;
import model.Name;
import model.Password;


/**
 * The MultitoolController class contains the main logic for the program, including the methods for random generation, button handling logic, data loading/saving, etc.
 * 
 * @version 05/01/2024
 * @author Andrew Polyak
 */
public class MultitoolController {
	
	// passwords is an ArrayList of String values which represent all user-saved passwords
	private ArrayList<String> passwords;
	
	// TODO
	private Password password;
	
	// TODO
	private Name name;
	
	// TODO
	private Email email;
	
	// TODO
	private Birthday birthday;
	
	//TODO
	private GenerationController generate;
	
	// names is an ArrayList of String values which represent all user-saved names
	private ArrayList<Name> names;
	
	// emails is an ArrayList of String values which represent all user-saved emails
	private ArrayList<Email> emails;
	
	// birthdays is an ArrayList of String values which represent all user-saved birthdays
	private ArrayList<Birthday> birthdays;
	
	// firstNames is an ArrayList of String values which represents all possible first names which can be randomly generated
	private ArrayList<Name> firstNames;
	
	// lastNames is an ArrayList of String values which represents all possible last names which can be randomly generated
	private ArrayList<Name> lastNames;
	
	// TODO
    @FXML
    private Slider ageLowerRange;

    // TODO
    @FXML
    private Slider ageUpperRange;

    // TODO
    @FXML
    private Text birthdayGenMsg;

    // TODO
    @FXML
    private Button birthdayGenerateBtn;
    
    // TODO
    @FXML
    private Text birthdayRangeMsg;

    // TODO
    @FXML
    private Button birthdayRemoveBtn;

    // TODO
    @FXML
    private Button birthdaySaveBtn;

    // TODO
    @FXML
    private TextField customEmailProvider;

    // TODO
    @FXML
    private AnchorPane displayBirthdayPane;

    // TODO
    @FXML
    private AnchorPane displayEmailPane;

    // TODO
    @FXML
    private AnchorPane displayNamePane;

    // TODO
    @FXML
    private AnchorPane displayPasswordPane;

    // TODO
    @FXML
    private CheckBox emailAddressGmail;

    // TODO
    @FXML
    private CheckBox emailAddressICloud;

    // TODO
    @FXML
    private CheckBox emailAddressITuta;

    // TODO
    @FXML
    private CheckBox emailAddressOutlook;

    // TODO
    @FXML
    private CheckBox emailAddressProton;

    // TODO
    @FXML
    private CheckBox emailAddressYahoo;

    // TODO
    @FXML
    private CheckBox emailAddressYandex;

    // TODO
    @FXML
    private CheckBox emailAddressZoho;

    // TODO
    @FXML
    private Text emailGenMsg;

    // TODO
    @FXML
    private Button emailGenerateBtn;

    // TODO
    @FXML
    private Button emailRemoveBtn;

    // TODO
    @FXML
    private Button emailSaveBtn;

    // TODO
    @FXML
    private TextField generatedBirthdayContainer;

    // TODO
    @FXML
    private TextField generatedEmailContainer;

    // TODO
    @FXML
    private TextField generatedNameContainer;

    // TODO
    @FXML
    private TextField generatedPasswordContainer;

    // TODO
    @FXML
    private Text nameGenMsg;

    // TODO
    @FXML
    private Button nameGenerateBtn;

    // TODO
    @FXML
    private Button nameRemoveBtn;

    // TODO
    @FXML
    private Button nameSaveBtn;

    // TODO
    @FXML
    private RadioButton passwordAllSpecChars;

    // TODO
    @FXML
    private CheckBox passwordCaseLower;

    // TODO
    @FXML
    private CheckBox passwordCaseUpper;

    // TODO
    @FXML
    private Text passwordGenMsg;

    // TODO
    @FXML
    private Button passwordGenerateBtn;

    // TODO
    @FXML
    private TextField passwordLength;

    // TODO
    @FXML
    private RadioButton passwordLtdSpecialChars;

    // TODO
    @FXML
    private CheckBox passwordNumbers;

    // TODO
    @FXML
    private Button passwordRemoveBtn;

    // TODO
    @FXML
    private Button passwordSaveBtn;
   
    // TODO
    @FXML
    private CheckBox passwordSpaces;

    // TODO
    @FXML
    private Button passwordUpdateBtn;

    // TODO
    @FXML
    private TextField passwordUsername;
	
    // TODO
    @FXML
    private TextField passwordWebsite;

    // TODO
    @FXML
    private AnchorPane removeBirthdayPane;

    // TODO
    @FXML
    private AnchorPane removeEmailPane;

    // TODO
    @FXML
    private AnchorPane removeNamePane;

    // TODO
    @FXML
    private AnchorPane removePasswordPane;

    // TODO
    @FXML
    private ListView<Birthday> savedBirthdays;

    // TODO
    @FXML
    private ListView<Email> savedEmails;

    // TODO
    @FXML
    private ListView<Name> savedNames;

    // TODO
    @FXML
    private ListView<Name> savedNamesForEmail;

    // TODO
    @FXML
    private ListView<Password> savedPasswords;

    // TODO
    @FXML
    private ToggleGroup specialChars;

    // TODO
    @FXML
    private AnchorPane updatePasswordPane;
	
	
	/**
	 * The MultitoolController constructor <br>
	 * TODO
	 */
	public MultitoolController() {
		generate = new GenerationController();
		
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
	 * TODO
	 * 
	 * @param event
	 */
	 @FXML
    void generateBirthday(ActionEvent event) {

    }

	 
	 /**
	 * TODO
	 * 
	 * @param event
	 */
    @FXML
    void generateEmail(ActionEvent event) {

    }

    
    /**
	 * TODO
	 * 
	 * @param event
	 */
    @FXML
    void generateName(ActionEvent event) {

    }

    
    /**
	 * TODO
	 * 
	 * @param event
	 */
    @FXML
    void generatePassword(ActionEvent event) {

    }

    
    /**
	 * TODO
	 * 
	 * @param event
	 */
    @FXML
    void removeBirthday(ActionEvent event) {

    }

    
    /**
	 * TODO
	 * 
	 * @param event
	 */
    @FXML
    void removeEmail(ActionEvent event) {

    }

    
    /**
	 * TODO
	 * 
	 * @param event
	 */
    @FXML
    void removeName(ActionEvent event) {

    }

    
    /**
	 * TODO
	 * 
	 * @param event
	 */
    @FXML
    void removePassword(ActionEvent event) {

    }

    
    /**
	 * TODO
	 * 
	 * @param event
	 */
    @FXML
    void saveBirthday(ActionEvent event) {

    }

    
    /**
	 * TODO
	 * 
	 * @param event
	 */
    @FXML
    void saveName(ActionEvent event) {

    }

    
    /**
	 * TODO
	 * 
	 * @param event
	 */
    @FXML
    void savePassword(ActionEvent event) {

    }

    
    /**
	 * TODO
	 * 
	 * @param event
	 */
    @FXML
    void updatePassword(ActionEvent event) {

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
	}
	
	
	/**
	 * The saveBirthdayData method reads the ArrayList containing all birthdays saved by the user, and
	 * formats + adds the data to the saved-birthdays txt file
	 */
	private void saveBirthdayData() {
		try {
			FileWriter fileWriter = new FileWriter("resources/saved-birthdays.txt");
			PrintWriter printWriter = new PrintWriter(fileWriter);
			
			// Write each saved birthday to the saved birthday database
			for (String birthday : birthdays) {
				printWriter.write(this.birthday.formatData(birthday));
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
