package CoreJavaBasic;

public class Factorial {

	public static void main(String[] args) {
		int i, factorial=1;
		int n=5;
		
	for(i=1; i<=5; i++) { 
		factorial = i*factorial;
	}
		
	System.out.println ("the factorial is "  + factorial);
			 
		
	}

}
