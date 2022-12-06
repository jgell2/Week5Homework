package codingAssignment;

//implements the Logger interface into the AsteriskLogger class
public class AsteriskLogger implements Logger {

	@Override
	public void log(String log) {
		//this method prints out the string passed into the log variable and prints three asterisks before and after the string
		System.out.println("***"+log+"***");
		
	}

	@Override
	public void error(String error) {
		//this method prints out the string passed into the error variable in a box of asterisks where the message "Error: " precedes the string passed in
		for (int i =0; i<error.length()+13;i++) {
			System.out.print("*");			
		}
		/*for loop above creates the top of our box, the error.length()+13 parameter ensures that the length of the top is dynamic and will fit any string. The 13 comes from the
		 * number of additional characters included when preceding the string with three asterisks and "Error: " and then adding three asterisks after the error string
		 */
		System.out.println();
		//line break
		System.out.println("***Error: " + error+ "***");
		//prints the middle of our box, with "***Error:  " preceding our string and "***" after it being static
		for (int i =0; i<error.length()+13;i++) {
			System.out.print("*");			
		}
		//for loop above does the same thing as the first for loop but creates the bottom of the box and ensures it is dynamic
		System.out.println();
		//line break
	}

}
