package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import model.Birthday;
import model.Email;
import model.GeneratedData;
import model.Name;
import model.Password;


/**
 * The MultitoolController class contains the main logic for the program, including the methods for random generation, button handling logic, data loading/saving, etc.
 * 
 * @version 05/04/2024
 * @author Andrew Polyak
 */
public class MultitoolController {
	
	// TODO
	private DataController dataController;
	
	//TODO
	private GenerationController generate;
	
	// TODO
	private Password password;
	
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
    private ListView<String> savedBirthdays;

    // TODO
    @FXML
    private ListView<String> savedEmails;

    // TODO
    @FXML
    private ListView<String> savedNames;

    // TODO
    @FXML
    private ListView<String> savedNamesForEmail;

    // TODO
    @FXML
    private ListView<String> savedPasswords;

    // TODO
    @FXML
    private ToggleGroup specialChars;
	
	
	/**
	 * The MultitoolController constructor <br>
	 * TODO
	 */
	public MultitoolController() {
		// Instantiate generate, an instance of GenerationController, to manage generating the main content types
		generate = new GenerationController();
		
		//TODO
		dataController = new DataController();
		
		// Load data
		loadData();
	}
	
	
	/**
	 * TODO
	 */
	private void loadData() {
		// TODO
		password = new Password();
		
		// Load saved data
		passwords = dataController.loadPasswordData();
		names = dataController.loadNameData();
		emails = dataController.loadEmailData();
		birthdays = dataController.loadBirthdayData();
		
		// Load generation resource data
		firstNames = dataController.loadFirstNameDatabase();
		lastNames = dataController.loadLastNameDatabase();
	}
	
	
	/**
	 * TODO
	 * 
	 * @param event
	 */
	 @FXML
	 private void generateBirthday(ActionEvent event) {

    }

	 
	 /**
	 * TODO
	 * 
	 * @param event
	 */
    @FXML
    private void generateEmail(ActionEvent event) {

    }

    
    /**
	 * TODO
	 * 
	 * @param event
	 */
    @FXML
    private void generateName(ActionEvent event) {

    }

    
    /**
	 * TODO
	 * 
	 * @param event
	 */
    @FXML
    private void generatePasswordHandler(ActionEvent event) {
    	passwordGenerateBtn.setOnMouseClicked(e -> {
    		generatePassword();
    	});
    }

    
    /**
     * TODO
     */
    private void generatePassword() {
    	String generatedPassword; // generatedPassword is a String value representing the final generated password
		
		// Initialize password parameter check-selections to false
		boolean uppercase = false;
    	boolean lowercase = false;
    	boolean allSpecChar = false;
    	boolean ltdSpecChar = false;
    	boolean numbers = false;
    	boolean spaces = false;
    	
    	// Initialize and validate length
    	String length = passwordLength.getText();
    	boolean validLengthInput = validDigit(length);;
		
    	// If the length input is valid, then process the parameters
		if (validLengthInput) { 
			// Collect letter case parameters
    		if (passwordCaseUpper.isSelected()) {
    			uppercase = true;
    		}
    		if (passwordCaseLower.isSelected()) {
    			lowercase = true;
    		}
    		
    		// Collect special character parameters
    		if (passwordAllSpecChars.isSelected()) {
    			allSpecChar = true;
    		} else if (passwordLtdSpecialChars.isSelected()) {
    			ltdSpecChar = true;
    		}
    		
    		// Collect number parameters
    		if (passwordNumbers.isSelected()) {
    			numbers = true;
    		}
    		
    		// Collect space parameters
    		if (passwordSpaces.isSelected()) {
    			spaces = true;
    		}
			
    		// Generate the password
			generatedPassword = generate.generatePassword(uppercase, lowercase, allSpecChar, ltdSpecChar, numbers, spaces, Integer.parseInt(length));
    		
			// Inform the user that the password was generated
			passwordGenMsg.setFill(Color.rgb(99, 173, 242, 1));
    		passwordGenMsg.setText("Secure password generated"); // TODO add message to MultitoolInterfaceMessages to ensure MVC
    		
    		// Add the generated password's value to the relevant text box
    		generatedPasswordContainer.setText(generatedPassword);
    		
    		// Display the password to the user
    		displayPasswordPane.setVisible(true);
		} else {
			// The length is invalid; inform the user that it must be addressed
			passwordGenMsg.setFill(Color.rgb(228, 73, 73, 1));
			passwordGenMsg.setText("Invalid length input"); // TODO add message to MultitoolInterfaceMessages to ensure MVC
			
			// Hide the generated password pane from then user (there is nothing to display)
			displayPasswordPane.setVisible(false);
		}	
    }
    
    /**
     * If the input is a digit, return true; otherwise return false
     * 
     * @param input a String value representing the input to validate
     * @return true (valid) or false (invalid)
     */
    private boolean validDigit(String input) {
    	if (!input.matches("\\d+")) {
    		return false;
    	} else {
    		return true;
    	}
    	
	}


	/**
	 * TODO
	 * 
	 * @param event
	 */
    @FXML
    private void removeBirthday(ActionEvent event) {

    }

    
    /**
	 * TODO
	 * 
	 * @param event
	 */
    @FXML
    private void removeEmail(ActionEvent event) {

    }

    
    /**
	 * TODO
	 * 
	 * @param event
	 */
    @FXML
    private void removeName(ActionEvent event) {

    }

    
    /**
	 * TODO
	 * 
	 * @param event
	 */
    @FXML
    private void removePasswordHandler(ActionEvent event) {
    	passwordRemoveBtn.setOnMouseClicked(e -> {
    		removePassword();
    	});
    }
    
    
    /**
     * TODO
     */
    private void removePassword() {
    	// Get the index of the selected password-to-remove and remove said password from passwords
    	int selectedPasswordIndex = savedPasswords.getSelectionModel().getSelectedIndex();
		if (selectedPasswordIndex >= 0) {
			passwords.remove(selectedPasswordIndex);
		}
		
		// Empty ListView; we will re-add contents soon
    	savedPasswords.getItems().clear();
		
		// Create ObservableList and add items from ArrayList and add ObservableList contents to savedPasswords
        ObservableList<String> observableList = FXCollections.observableArrayList(passwords);
        savedPasswords.getItems().addAll(observableList);
    }

    
    /**
	 * TODO
	 * 
	 * @param event
	 */
    @FXML
    private void saveBirthday(ActionEvent event) {

    }

    
    /**
	 * TODO
	 * 
	 * @param event
	 */
    @FXML
    private void saveName(ActionEvent event) {

    }

    
    /**
	 * TODO
	 * 
	 * @param event
	 */
    @FXML
    private void savePasswordHandler(ActionEvent event) {
    	passwordSaveBtn.setOnMouseClicked(e -> {
    		savePassword();
    	});
    }
    
    
    /**
     * TODO
     */
    private void savePassword() {
    	// Empty ListView; we will re-add contents soon
		savedPasswords.getItems().clear();
		
		// Collect the user-inputted account data + generated password
		String password = generatedPasswordContainer.getText();
		String website = passwordWebsite.getText();
		String username = passwordUsername.getText();
		
		if (website.equals("") && username.equals("")) { // If only the password field contains a value, add only the password's value to the ArrayList
			passwords.add(this.password.formatPassword(password));
		} else if (website.equals("")) { // Only the password and username fields are filled; add those two to the ArrayList
			passwords.add(this.password.formatPasswordAndUsername(password, username));
		} else if (username.equals("")) { // Only the password and website fields are filled; add those two to the ArrayList
			passwords.add(this.password.formatPasswordAndWeb(password, website));
		} else { // All fields are filled; add all three to the ArrayList
			passwords.add(this.password.formatAccountDetails(password, website, username));
		}
		
		// Create ObservableList and add items from ArrayList and add ObservableList contents to savedPasswords
        ObservableList<String> observableList = FXCollections.observableArrayList(passwords);
        savedPasswords.getItems().addAll(observableList);
    }
	
}
