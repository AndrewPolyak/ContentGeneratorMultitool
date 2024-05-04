package model;

public abstract class GeneratedData {

	/**
	 * The formatData method returns the parameter with a newline so as to save the data in the correct structure
	 * @param content a String value representing the specific content saved by the user
	 * @return content + newline
	 */
	public String formatData(String content) {
		return content + "/n";
	}
	
}
