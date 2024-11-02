package codingProject;

public class SpacedLogger implements Logger {
	
	// 5.  Implement the SpacedLogger methods

	@Override
	public void log(String log) {
		char [] logChar = log.toCharArray();
		
		for(char a : logChar) {
			System.out.print(a);
			System.out.print(" ");
		}
	}
	
	public void error (String error) {
		System.out.print("ERROR: ");
		char [] errorChar = error.toCharArray();
		
		for(char b : errorChar) {
			System.out.print(b);
			System.out.print(" ");			
		}
	}
}
