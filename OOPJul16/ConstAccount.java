package OOPJul16;

public class ConstAccount {
	private String number=null;
	private String accountType=null;
	private double balance=10000.00;
	
	public ConstAccount () {
		
	}
	
	public ConstAccount (String n, String at, double b) {
		String number =n ;
		String accountType = at;
		double balance = b;
		System.out.println("Account no. is: "+n);
		System.out.println("Account Type is: "+at);
		System.out.println("Balance is: "+b);
		
		
	}
	
	
	public String getNumber() {
		return number;
	}
	
	public String getAccountType() {
		return accountType;
	}
	
	public double getBalance() {
		return balance;
	}
   
	
	
}
