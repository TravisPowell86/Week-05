package codingProject;

public class App extends SpacedLogger {
	
	// 6.     Create a class named App that has a main method.
	
	public static void main(String[] args) {
		
		Logger log = new AsteriskLogger();
		
		log.log("Code monkey get up, get coffee.");
		System.out.println();
		
		log.log("Code monkey go to job.");
		System.out.println();
		
		log.log("Much rather wake up, eat a coffee cake,");
		System.out.println();
		
		log.log("Take bath, take nap.");
		System.out.println();
		
		SpacedLogger secondLog = new SpacedLogger();
		
		secondLog.log("Code monkey just keep on working.");
		System.out.println();
		System.out.println("See your soft, pretty face.");
		
		secondLog.error("Code monkey like Fritos.");
		System.out.println();
		System.out.println("Code monkey like Tab and Mountain Dew.");
		
		secondLog.log("Code monkey very simple man,");
		System.out.println();
		System.out.println("With big warm, fuzzy, secret heart.");
		
		secondLog.error("Code monkey like you.");
		System.out.println();
		System.out.println("Code monkey like you... a lot.");
	
		
	}

}
