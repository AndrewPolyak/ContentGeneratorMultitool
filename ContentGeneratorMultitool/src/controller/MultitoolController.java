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
import model.Name;
import model.Password;


/**
 * The MultitoolController class contains the main logic for the program, including the methods for random generation, button handling logic, data loading/saving, etc.
 * 
 * @version 05/17/2024
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

    // birthdaySaveBtn is a Button object representing the button the user can press to save their generated birthday
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

    // emailAddressGmail is a CheckBox object representing the check box the user can select to add the Gmail domain to the email generator RNG pool
    @FXML
    private CheckBox emailAddressGmail;

    // emailAddressICloud is a CheckBox object representing the check box the user can select to add the iCloud domain to the email generator RNG pool
    @FXML
    private CheckBox emailAddressICloud;

    // emailAddressTuta is a CheckBox object representing the check box the user can select to add the Tuta domain to the email generator RNG pool
    @FXML
    private CheckBox emailAddressTuta;

    // emailAddressOutlook is a CheckBox object representing the check box the user can select to add the Outlook domain to the email generator RNG pool
    @FXML
    private CheckBox emailAddressOutlook;

    // emailAddressProton is a CheckBox object representing the check box the user can select to add the Proton domain to the email generator RNG pool
    @FXML
    private CheckBox emailAddressProton;

    // emailAddressYahoo is a CheckBox object representing the check box the user can select to add the Yahoo domain to the email generator RNG pool
    @FXML
    private CheckBox emailAddressYahoo;

    // emailAddressYandex is a CheckBox object representing the check box the user can select to add the Yandex domain to the email generator RNG pool
    @FXML
    private CheckBox emailAddressYandex;

    // emailAddressZoho is a CheckBox object representing the check box the user can select to add the Zoho domain to the email generator RNG pool
    @FXML
    private CheckBox emailAddressZoho;

    // emailGenMsg is a Text object representing the dynamic message displayed to the user once they click the generate email button
    @FXML
    private Text emailGenMsg;

    // emailGenerateBtn is a Button object representing the button the user can press to generate an email
    @FXML
    private Button emailGenerateBtn;

    // emailRemoveBtn is a Button object representing the button the user can press to remove their selected saved email
    @FXML
    private Button emailRemoveBtn;

    // emailSaveBtn is a Button object representing the button the user can press to save their generated email
    @FXML
    private Button emailSaveBtn;

    // generatedBirthdayContainer is a Textfield object containing the generated birthday for the user to see
    @FXML
    private TextField generatedBirthdayContainer;

    // generatedEmailContainer is a Textfield object containing the generated email for the user to see
    @FXML
    private TextField generatedEmailContainer;

    // generatedNameContainer is a Textfield object containing the generated name for the user to see
    @FXML
    private TextField generatedNameContainer;

    // generatedPasswordContainer is a Textfield object containing the generated password for the user to see
    @FXML
    private TextField generatedPasswordContainer;

    // nameGenMsg is a Text object representing the dynamic message displayed to the user once they click the generate name button
    @FXML
    private Text nameGenMsg;

    // nameGenerateBtn is a Button object representing the button the user can press to generate a name
    @FXML
    private Button nameGenerateBtn;

    // nameRemoveBtn is a Button object representing the button the user can press to remove their selected saved name
    @FXML
    private Button nameRemoveBtn;

    // nameSaveBtn is a Button object representing the button the user can press to save their generated name
    @FXML
    private Button nameSaveBtn;

    // passwordAllSpecChars is a RadioButton object which the user can select to enable all special characters within the password generation
    @FXML
    private RadioButton passwordAllSpecChars;

    // passwordCaseLower is a CheckBox object which the user can select to enable all lowercase characters within the password generation
    @FXML
    private CheckBox passwordCaseLower;

    // passwordCaseUpper is a CheckBox object which the user can select to enable all uppercase characters within the password generation
    @FXML
    private CheckBox passwordCaseUpper;

    // passwordGenMsg is a Text object representing the dynamic message displayed to the user once they click the generate password button
    @FXML
    private Text passwordGenMsg;

    // passwordGenerateBtn is a Button object representing the button the user can press to generate a password
    @FXML
    private Button passwordGenerateBtn;

    // passwordLength is a Textfield object where the user can input their desired password length
    @FXML
    private TextField passwordLength;

    // passwordLtdSpecChars is a RadioButton object which the user can select to enable limited special characters within the password generation
    @FXML
    private RadioButton passwordLtdSpecialChars;

    // passwordNumbers is a CheckBox object which the user can select to enable numerical characters within the password generation
    @FXML
    private CheckBox passwordNumbers;

    // passwordRemoveBtn is a Button object representing the button the user can press to remove their selected saved password
    @FXML
    private Button passwordRemoveBtn;

    // passwordSaveBtn is a Button object representing the button the user can press to save their generated password
    @FXML
    private Button passwordSaveBtn;
   
    // passwordSpaces is a CheckBox object which the user can select to enable space / whitespace characters within the password generation
    @FXML
    private CheckBox passwordSpaces;

    // passwordUsername is a Textfield object where the user can input the username associated with the generated password
    @FXML
    private TextField passwordUsername;
	
    // passwordWebsite is a Textfield object where the user can input the website associated with the generated password
    @FXML
    private TextField passwordWebsite;

    // removeBirthdayPane is an AnchorPane object containing the components which will allow the user to remove a selected saved birthday
    @FXML
    private AnchorPane removeBirthdayPane;

    // removeEmailPane is an AnchorPane object containing the components which will allow the user to remove a selected saved email
    @FXML
    private AnchorPane removeEmailPane;

    // removeNamePane is an AnchorPane object containing the components which will allow the user to remove a selected saved name
    @FXML
    private AnchorPane removeNamePane;

    // removePasswordPane is an AnchorPane object containing the components which will allow the user to remove a selected saved password
    @FXML
    private AnchorPane removePasswordPane;

    // savedBirthdays is a ListView object containing all of the user's saved birthdays
    @FXML
    private ListView<String> savedBirthdays;

    // savedEmails is a ListView object containing all of the user's saved emails
    @FXML
    private ListView<String> savedEmails;

    // savedNames is a ListView object containing all of the user's saved names
    @FXML
    private ListView<String> savedNames;

    // savedNamesForEmail is a ListView object containing all of the user's saved names, which the user can then use in email generation
    @FXML
    private ListView<String> savedNamesForEmail;

    // savedPasswords is a ListView object containing all of the user's saved passwords
    @FXML
    private ListView<String> savedPasswords;

    // specialChars is a ToggleGroup object which only allows the user to select only one special character option during password customization
    @FXML
    private ToggleGroup specialChars;
	
	
	/**
	 * The MultitoolController constructor <br>
	 * Instantiates the model classes, generation controller, data controller, and calls the loadData method
	 */
	public MultitoolController() {
		// Instantiate the model classes to allow for data formating
		password = new Password();
		name = new Name();
		email = new Email();
		birthday = new Birthday();
		
		// Instantiate generate, an instance of GenerationController, to manage generating the main content types
		generate = new GenerationController();
		
		// Instantiate dataController, an instance of DataController, to manage the loading of data
		dataController = new DataController();
		
		// Load data
		loadData();
	}
	
	
	/**
	 * The loadData method loads all saved data as well as the first and last name resources for name generation
	 */
	private void loadData() {
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
	 * The method generateBirthdayHandler triggers the generateBirthday method once the birthdayGenerateBtn is clicked
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
			birthdayGenMsg.setText("Birthday generated"); // FIXME add message to MultitoolInterfaceMessages to ensure MVC
    		
    		// Display the birthday to the user
        	displayBirthdayPane.setVisible(true);
    		
    		// Add the generated birthday's value to the relevant text box
        	generatedBirthdayContainer.setText(birthday);
	        	
		 } else {
			// The lower age range is higher than the upper range; inform the user that it must be addressed
			 birthdayGenMsg.setFill(Color.rgb(228, 73, 73, 1));
			 birthdayGenMsg.setText("The lower range cannot be higher than the upper range"); // FIXME add message to MultitoolInterfaceMessages to ensure MVC
		 }
	}

	 
	 /**
	 * The method lowerRangeMsgHandler triggers the updateBirthdayRangeMsg method while the mouse is dragging over the ageLowerRange slider
	 * 
	 * @param event
	 */
    @FXML
    private void lowerRangeMsgHandler(MouseEvent event) {
    	updateBirthdayRangeMsg();
    }
    
    
    /**
	 * The method upperRangeMsgHandler triggers the updateBirthdayRangeMsg method while the mouse is dragging over the ageUpperRange slider
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
	 * The method generateEmailHandler triggers the generateEmail method once the emailGenerateBtn is clicked
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
    	String email; // TODO
    	String domain; // TODO
    	String name = ""; // TODO
    	ArrayList<String> domains = new ArrayList<>(); // TODO
    	
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
        	emailGenMsg.setText("Email generated"); // FIXME add message to MultitoolInterfaceMessages to ensure MVC
    		
    		// Display the email to the user
        	displayEmailPane.setVisible(true);
    		
    		// Add the generated email's value to the relevant text box
        	generatedEmailContainer.setText(email);
    	} else { 
    		// No domains are selected; inform the user that it must be addressed
    		emailGenMsg.setFill(Color.rgb(228, 73, 73, 1));
    		emailGenMsg.setText("Please select at least one domain option"); // FIXME add message to MultitoolInterfaceMessages to ensure MVC
			
			// Hide the generated password pane from then user (there is nothing to display)
    		displayEmailPane.setVisible(false);
    	}
	}


	/**
	 * The method generateNameHandler triggers the generateName method once the nameGenerateBtn is clicked
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
		nameGenMsg.setText("Name generated"); // FIXME add message to MultitoolInterfaceMessages to ensure MVC
		
		// Display the name to the user
		displayNamePane.setVisible(true);
		
		// Add the generated name's value to the relevant text box
		generatedNameContainer.setText(name);
		
	}


	/**
	 * The method generatePasswordHandler triggers the generatePassword method once the passwordGenerateBtn is clicked
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
    		passwordGenMsg.setText("Secure password generated"); // FIXME add message to MultitoolInterfaceMessages to ensure MVC
    		
    		// Add the generated password's value to the relevant text box
    		generatedPasswordContainer.setText(generatedPassword);
    		
    		// Display the password to the user
    		displayPasswordPane.setVisible(true);
		} else {
			// The length is invalid; inform the user that it must be addressed
			passwordGenMsg.setFill(Color.rgb(228, 73, 73, 1));
			passwordGenMsg.setText("Invalid length input"); // FIXME add message to MultitoolInterfaceMessages to ensure MVC
			
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
	 * The method removeBirthdayHandler triggers the removeContent method once the birthdayRemoveBtn is clicked
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
	 * The method removeEmailHandler triggers the removeContent method once the emailRemoveBtn is clicked
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
	 * The method removeNameHandler triggers the removeContent method once the nameRemoveBtn is clicked
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
	 * The method removePasswordHandler triggers the removeContent method once the passwordRemoveBtn is clicked
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
     * 
     * @param savedContents
     * @param contents
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
	 * The method saveBirthdayHandler triggers the saveBirthday method once the birthdaySaveBtn is clicked
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
	 * The method saveEmailHandler triggers the saveEmail method once the emailSaveBtn is clicked
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
	 * The method saveNameHandler triggers the saveName method once the nameSaveBtn is clicked
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
	 * The method savePasswordHandler triggers the savePassword method once the passwordSaveBtn is clicked
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
