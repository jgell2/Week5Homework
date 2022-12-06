package codingAssignment;

public class App {
	
	
	//instantiates our Logger interface we made
	static Logger logger;
	
	//main method wee use to pass our code in
	public static void main(String[] args) {
		
		//creates an instance of the AsteriskLogger
		Logger logger = new AsteriskLogger();
		
		
		//assigns value to the log and error string variables established in the Logger methods for our AsteriskLogger
		logger.log("Hello");
		logger.error("Go Big Red");
		
		//creates an instance of the SpacedLogger
		Logger logger2 = new SpacedLogger();
		
		//assigns values to the log and error string variables in the Logger methods for our SpacedLogger
		logger2.log("Hello");
		logger2.error("Goodbye");
		
	}

}
