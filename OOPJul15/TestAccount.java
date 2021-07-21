package OOPJul15;

public class TestAccount {

	public static void main(String[] args) {
		Account a =new Account();
		

				
				a.setNumber(" AC bank 5456 ");
				a.setAccountType(" Joint  Account");
				
				double b= a.getBalance();
				double dp = deposit();
				double ft = fundTransfer();
				double pb = payBill();
				double wd = withdrawal();
				
				double add = b+dp;
				double transfer = add+ft;
				double payment = transfer-pb;
				double draw = payment-wd;
				
				System.out.println("The Number of this Account is -- "+a.getNumber());
				System.out.println("The type of this Account is -- "+a.getAccountType());
				System.out.println();
 				System.out.println("After Depositing your available balance is " +""+add);
				System.out.println("After making the FundTranfer of your available balance is "+transfer);
				System.out.println("After the Bill payment of your available balance is  "+payment);
				System.out.println("After the Withdrawal of your available balance is "+draw);
				System.out.println("current balance is "+ draw);
				

	

	}
	public static double deposit() {
		
		return 10000;
	}
	public static double withdrawal() {
		
		return 500;
	}
	public static double fundTransfer() {
		return 2000;
	}
	public static double payBill() {
		return 1000;
	}

}
