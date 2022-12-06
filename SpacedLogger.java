package codingAssignment;


//implements our the Logger interface we made to the SpacedLogger class
public class SpacedLogger implements Logger {
	
	
	@Override
	public void log(String log) {
		//this method prints out a string passed in through variable log and inserts a space in between each character
		System.out.println(log.replace("", " ").trim());
		//using the replace method to replace all empty substrings with a space then used the trim method to cut off leading and trailing spaces
	}

	@Override
	public void error(String error) {
		//method prints out a string passed in through the variable error and inserts a space in between each character and adds a preceding message of "ERROR: " before the message
		System.out.println("ERROR: " + error.replace(""," ").trim());
		//utilized the same replace and trim methods to achieve the same result as we did above, only added the message "ERROR: " into the print line
	}

}
