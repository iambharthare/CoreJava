package Cloning;

public class TestCloning {
	public static void main(String[] args) throws Exception {

		Customer c1 = new Customer("Ram");
		//c1.address.city = "Mumbai";
		c1.account.balance=40;

		Customer c2 = (Customer) c1.clone();
	    c2.name = "Balram";
		//c2.address="delhi";
		//c2.account=15000;
		c2.account.balance = 20;
		//c2.address.city = "Delhi";
		
		Customer c3 = (Customer) c1.clone();
	    c3.name = "Ramesh";

		System.out.println("Original Object ");
		System.out.println("Name : " + c1.name);
		System.out.println("Balance of Account : " + c1.account.balance);
		//System.out.println("City : " + c1.address.city);

		System.out.println("\n--------------------------");
		System.out.println("Cloned Object");
		System.out.println("Name : " + c2.name);
		System.out.println("Balance of Account : " + c2.account.balance);
		//System.out.println("City : " + c2.address.city);
		
		System.out.println("\n--------------------------");
		System.out.println("Cloned Object");
		System.out.println("Name : " + c3.name);
	}
}
