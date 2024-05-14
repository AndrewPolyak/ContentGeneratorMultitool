package controller;

import java.util.ArrayList;

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
import javafx.scene.input.MouseEvent;
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
 * @version 05/05/2024
 * @author Andrew Polyak
 */
public class MultitoolController {
	
	// TODO
	private DataController dataController;
	
	//TODO
	private GenerationController generate;
	
	// TODO
	private Password password;
	
	//TODO
	private Name name;
	
	// TODO
	private Email email;
	
	// TODO
	private Birthday birthday;
	
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
	
	// ageLowerRange is a Slider object representing the value of the user-selected lower-age range slider for the birthday generator
    @FXML
    private Slider ageLowerRange;

    // ageUpperRange is a Slider object representing the value of the user-selected upper-age range slider for the birthday generator
    @FXML
    private Slider ageUpperRange;

    // birthdayGenMsg is a Text object representing the dynamic message displayed to the user once they click the generate birthday button
    @FXML
    private Text birthdayGenMsg;

    // birthdayGenerateBtn is a Button object representing the button the user can press to generate a birthday
    @FXML
    private Button birthdayGenerateBtn;
    
    // birtdayRangeMsg is a Text object representing the dynamic message displayed to the user to indicate the values of the lower and upper sliders
    @FXML
    private Text birthdayRangeMsg;

    // birthdayRemoveBtn is a Button object representing the button the user can press to remove their selected saved birthday
    @FXML
    private Button birthdayRemoveBtn;

    // birthdayRemoveBtn is a Button object representing the button the user can press to save their generated birthday
    @FXML
    private Button birthdaySaveBtn;

    // customEmailProvider is a TextField object representing the text field containing the user-customized email domain
    @FXML
    private TextField customEmailProvider;

    // displayBirthdayPane is an AnchorPane object containing the components which will display the generated birthday and save birthday button
    @FXML
    private AnchorPane displayBirthdayPane;

    // displayEmailPane is an AnchorPane object containing the components which will display the generated email and save email button
    @FXML
    private AnchorPane displayEmailPane;

    // displayNamePane is an AnchorPane object containing the components which will display the generated name and save name button
    @FXML
    private AnchorPane displayNamePane;

    // displayPasswordPane is an AnchorPane object containing the components which will display the generated password and save password button
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
    private CheckBox emailAddressTuta;

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
		name = new Name();
		email = new Email();
		birthday = new Birthday();
		
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
	 private void generateBirthdayHandler(ActionEvent event) {
		 birthdayGenerateBtn.setOnMouseClicked(e -> {
			 generateBirthday();
		 });
    }

	 
	 /**
	  * TODO
	  */
	 private void generateBirthday() {
		
		String birthday;
		 
		// Get the upper and lower age range values
		int lowerAge = (int) ageLowerRange.getValue();
		int upperAge = (int) ageUpperRange.getValue();
		 
		if (lowerAge <= upperAge) {
			birthday = generate.generateBirthday(lowerAge, upperAge);
			 
			// Inform the user that the birthday was generated
			birthdayGenMsg.setFill(Color.rgb(99, 173, 242, 1));
			birthdayGenMsg.setText("Birthday generated"); // TODO add message to MultitoolInterfaceMessages to ensure MVC
    		
    		// Display the birthday to the user
        	displayBirthdayPane.setVisible(true);
    		
    		// Add the generated birthday's value to the relevant text box
        	generatedBirthdayContainer.setText(birthday);
	        	
		 } else {
			// The lower age range is higher than the upper range; inform the user that it must be addressed
			 birthdayGenMsg.setFill(Color.rgb(228, 73, 73, 1));
			 birthdayGenMsg.setText("The lower range cannot be higher than the upper range"); // TODO add message to MultitoolInterfaceMessages to ensure MVC
		 }
		 
		 
		 
	}

	 
	 /**
	 * TODO
	 * 
	 * @param event
	 */
    @FXML
    private void lowerRangeMsgHandler(MouseEvent event) {
    	updateBirthdayRangeMsg();
    }
    
    
    /**
	 * TODO
	 * 
	 * @param event
	 */
    @FXML
    private void upperRangeMsgHandler(MouseEvent event) {
    	updateBirthdayRangeMsg();
    }
    
    
    /**
     * TODO
     */
    private void updateBirthdayRangeMsg() {
        int lowerValue = (int) ageLowerRange.getValue();
        int upperValue = (int) ageUpperRange.getValue();
        birthdayRangeMsg.setText("Between " + lowerValue + " and " + upperValue + " years of age"); // FIXME MVC
    }
	 

	/**
	 * TODO
	 * 
	 * @param event
	 */
    @FXML
    private void generateEmailHandler(ActionEvent event) {
    	emailGenerateBtn.setOnMouseClicked(e -> {
    		generateEmail();
    	});
    }
    
    
    /**
     * TODO
     */
    private void generateEmail() {
		
    	// TODO
    	String email;
    	
    	// TODO
    	String domain;
    	
    	// TODO
    	String name = "";
    	
    	// TODO
    	ArrayList<String> domains = new ArrayList<>();
    	
    	// Collect all of the domains that the user wants to include
    	if (emailAddressGmail.isSelected()) {
    		domain = emailAddressGmail.getText();
    		domains.add(domain);
    	}
    	if (emailAddressOutlook.isSelected()) {
    		domain = emailAddressOutlook.getText();
    		domains.add(domain);
    	}
    	if (emailAddressYahoo.isSelected()) {
    		domain = emailAddressYahoo.getText();
    		domains.add(domain);
    	}
    	if (emailAddressProton.isSelected()) {
    		domain = emailAddressProton.getText();
    		domains.add(domain);
    	}
    	if (emailAddressICloud.isSelected()) {
    		domain = emailAddressICloud.getText();
    		domains.add(domain);
    	}
    	if (emailAddressTuta.isSelected()) {
    		domain = emailAddressTuta.getText();
    		domains.add(domain);
    	}
    	if (emailAddressYandex.isSelected()) {
    		domain = emailAddressYandex.getText();
    		domains.add(domain);
    	}
    	if (emailAddressZoho.isSelected()) {
    		domain = emailAddressZoho.getText();
    		domains.add(domain);
    	}
    	if (!customEmailProvider.getText().isBlank()) { // If the custom domain option is filled in, then use that option too
    		domain = customEmailProvider.getText();
    		domains.add(domain);
    	}
    	
    	// Check if the user has selected a saved name to include for the email; if so, set name's value to it
    	try {
    		name = savedNamesForEmail.getSelectionModel().getSelectedItem().replaceAll("Name: ", ""); // Remove the formatting
    	} catch(Exception e) { 
    		// If the user did not select a saved name, generate a random one
    		name = generate.generateName(firstNames, lastNames);
    	}
    	
    	// If at least one domain is selected, generate the email
    	if (!domains.isEmpty()) {
    		email = generate.generateEmail(domains, name);
    		
    		// Inform the user that the email was generated
        	emailGenMsg.setFill(Color.rgb(99, 173, 242, 1));
        	emailGenMsg.setText("Email generated"); // TODO add message to MultitoolInterfaceMessages to ensure MVC
    		
    		// Display the email to the user
        	displayEmailPane.setVisible(true);
    		
    		// Add the generated email's value to the relevant text box
        	generatedEmailContainer.setText(email);
    	} else { 
    		// No domains are selected; inform the user that it must be addressed
    		emailGenMsg.setFill(Color.rgb(228, 73, 73, 1));
    		emailGenMsg.setText("Please select at least one domain option"); // TODO add message to MultitoolInterfaceMessages to ensure MVC
			
			// Hide the generated password pane from then user (there is nothing to display)
    		displayEmailPane.setVisible(false);
    	}
	}


	/**
	 * TODO
	 * 
	 * @param event
	 */
    @FXML
    private void generateNameHandler(ActionEvent event) {
    	nameGenerateBtn.setOnMouseClicked(e -> {
    		generateName();
    	});
    }

    
    /**
     * TODO
     */
    private void generateName() {
    	// Generate the name
		String name = generate.generateName(firstNames, lastNames);
		
		// Inform the user that the name was generated
		nameGenMsg.setFill(Color.rgb(99, 173, 242, 1));
		nameGenMsg.setText("Name generated"); // TODO add message to MultitoolInterfaceMessages to ensure MVC
		
		// Display the name to the user
		displayNamePane.setVisible(true);
		
		// Add the generated name's value to the relevant text box
		generatedNameContainer.setText(name);
		
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
    private void removeBirthdayHandler(ActionEvent event) {
    	birthdayRemoveBtn.setOnMouseClicked(e -> {
    		removeContent(savedBirthdays, birthdays);
    	});
    }

    
    /**
	 * TODO
	 * 
	 * @param event
	 */
    @FXML
    private void removeEmailHandler(ActionEvent event) {
    	emailRemoveBtn.setOnMouseClicked(e -> {
    		removeContent(savedEmails, emails);
    	});
    }

    
    /**
	 * TODO
	 * 
	 * @param event
	 */
    @FXML
    private void removeNameHandler(ActionEvent event) {
    	nameRemoveBtn.setOnMouseClicked(e -> {
    		removeContent(savedNames, names);
    	});
    }

    
    /**
	 * TODO
	 * 
	 * @param event
	 */
    @FXML
    private void removePasswordHandler(ActionEvent event) {
    	passwordRemoveBtn.setOnMouseClicked(e -> {
    		removeContent(savedPasswords, passwords);
    	});
    }
    
    
    /**
     * TODO
     */
    private void removeContent(ListView<String> savedContents, ArrayList<String> contents) {
    	// Get the index of the selected content-to-remove and remove said content from contents
    	int selectedContentIndex = savedContents.getSelectionModel().getSelectedIndex();
		if (selectedContentIndex >= 0) {
			contents.remove(selectedContentIndex);
		}
		
		// Empty ListView; we will re-add items soon
		savedContents.getItems().clear();
		
		// Create ObservableList and add items from ArrayList and add ObservableList contents to savedContents
        ObservableList<String> observableList = FXCollections.observableArrayList(contents);
        savedContents.getItems().addAll(observableList);
        
        removeSavedNamesForEmail();
    }
    
    
    /**
     * TODO
     */
    private void removeSavedNamesForEmail() {
    	// Get the index of the selected content-to-remove and remove said content from contents
    	int selectedContentIndex = savedNames.getSelectionModel().getSelectedIndex();
		if (selectedContentIndex >= 0) {
			names.remove(selectedContentIndex);
		}
		
		// Empty ListView; we will re-add items soon
		savedNamesForEmail.getItems().clear();
		
		// Create ObservableList and add items from ArrayList and add ObservableList contents to savedContents
        ObservableList<String> observableList = FXCollections.observableArrayList(names);
        savedNamesForEmail.getItems().addAll(observableList);
    }

    
    /**
	 * TODO
	 * 
	 * @param event
	 */
    @FXML
    private void saveBirthdayHandler(ActionEvent event) {
    	birthdaySaveBtn.setOnMouseClicked(e -> {
    		saveBirthday();
    	});
    }

    
    /**
     * TODO
     */
    private void saveBirthday() {
    	// Empty ListView; we will re-add contents soon
		savedBirthdays.getItems().clear();
		
		// Collect the generated birthday
		String birthday = generatedBirthdayContainer.getText();
		
		// Add the generated birthday to the ArrayList
		birthdays.add(this.birthday.formatBirthday(birthday));
		
		// Create ObservableList and add items from ArrayList and add ObservableList contents to savedBirthdays
        ObservableList<String> observableList = FXCollections.observableArrayList(birthdays);
        savedBirthdays.getItems().addAll(observableList);
	}


    /**
	 * TODO
	 * 
	 * @param event
	 */
    @FXML
    private void saveEmailHandler(ActionEvent event) {
    	emailSaveBtn.setOnMouseClicked(e -> {
    		saveEmail();
    	});
    }
    
    
    /**
     * TODO
     */
	private void saveEmail() {
		// Empty ListView; we will re-add contents soon
		savedEmails.getItems().clear();
		
		// Collect the generated email
		String email = generatedEmailContainer.getText();
		
		// Add the generated email to the ArrayList
		emails.add(this.email.formatEmail(email));
		
		// Create ObservableList and add items from ArrayList and add ObservableList contents to savedEmails
        ObservableList<String> observableList = FXCollections.observableArrayList(emails);
        savedEmails.getItems().addAll(observableList);
	}


	/**
	 * TODO
	 * 
	 * @param event
	 */
    @FXML
    private void saveNameHandler(ActionEvent event) {
    	nameSaveBtn.setOnMouseClicked(e -> {
    		saveName();
    	});
    }

    
    /**
     * TODO
     */
    private void saveName() {
    	// Empty ListView; we will re-add contents soon
		savedNames.getItems().clear();
		savedNamesForEmail.getItems().clear();
		
		// Collect the generated name
		String name = generatedNameContainer.getText();
		
		// Add the generated name to the ArrayList
		names.add(this.name.formatName(name));
		
		// Create ObservableList and add items from ArrayList and add ObservableList contents to savedNames
        ObservableList<String> observableList = FXCollections.observableArrayList(names);
        savedNames.getItems().addAll(observableList);
        savedNamesForEmail.getItems().addAll(observableList);
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
