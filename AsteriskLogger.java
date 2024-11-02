package codingProject;

public class AsteriskLogger implements Logger {
	
	// 4.  Implement the AsteriskLogger methods
	
	@Override
	public void log (String log) {
		System.out.println("***" + log + "***");
	}
	
	@Override
	public void error (String error) {
		System.out.println("****************" + "*".repeat(error.length()));
		System.out.println("*** ERROR: " + error + " ***");
		System.out.println("****************" + "*".repeat(error.length()));
	}

}
