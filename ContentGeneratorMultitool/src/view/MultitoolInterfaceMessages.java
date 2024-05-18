package view;

/**
 * The MultitoolInterfaceMessages class contains the messages that may dynamically appear during runtime
 * 
 * @version 05/18/2024
 * @author Andrew Polyak
 */
public class MultitoolInterfaceMessages {

	
	// default MultitoolInterfaceMessages constructor
	public MultitoolInterfaceMessages() { }
	
	
	/**
	 * @return birthday generation message
	 */
	public String birthdayGeneratedMsg() {
		return "Birthday generated";
	}

	
	/**
	 * @return age range validation message
	 */
	public String lowerAgeHigherThanUpperMsg() {
		return "The lower range cannot be higher than the upper range";
	}

	
	/**
	 * @param lowerValue
	 * @param upperValue
	 * @return message indicating values of lowerValue and upperValue
	 */
	public String birthdayRangeMsg(int lowerValue, int upperValue) {
		return "Between " + lowerValue + " and " + upperValue + " years of age";
	}

	
	/**
	 * @return email generation message
	 */
	public String emailGeneratedMsg() {
		return "Email generated";
	}

	
	/**
	 * @return domain selection validation message
	 */
	public String selectedDomainMsg() {
		return "Please select at least one domain option";
	}

	
	/**
	 * @return name generation message
	 */
	public String nameGeneratedMsg() {
		return "Name generated";
	}

	
	/**
	 * @return password generation message
	 */
	public String passwordGeneratedMsg() {
		return "Secure password generated";
	}

	
	/**
	 * @return length input validation message
	 */
	public String invalidLengthMsg() {
		return "Invalid length input";
	}

}
