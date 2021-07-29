package ExHandlingJul22;

public class Program1 {

	public static void main(String[] args) {
		try{int a=20;
		int b=0;
		int c=a/b;
		System.out.println(c);
		
		}	
		catch(ArithmeticException e) {
			System.out.println("Divide by Zero");
		}

	
	finally {
		
		System.out.println("this is finally");
	}

}}
