package OOPJul16;

public class TestAccount {

	public static void main(String[] args) {
		ConstAccount ct= new ConstAccount ("123456", "Savings", 10000.0);
		 
		
		double b =ct.getBalance();
		double d=deposit();
		double ft= fundTransfer();
		double wd= withdrawal();
		double pb= payBill();
		
		double add = b+d;
		double transfer = add+ft;
		double payment = transfer-pb;
		double draw = payment-wd;
		
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
