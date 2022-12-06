package codingAssignment;

//establishes our Logger interface which we use in the AsteriskLogger and SpacedLogger classes
public interface Logger {
	
	//below we create our methods in the logger. These act as abstract methods and will not have any info passed into them on this screen.
	public void log(String log);
	public void error(String error);
	

}
