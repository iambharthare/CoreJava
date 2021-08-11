package Cloning;

public class Customer implements Cloneable {

	/*
	 * public String name = null; public int account = 0; public String address =
	 * null;
	 * 
	 * public Customer(String n, String ad, int ac ) { name = n; account = ac;
	 * address = ad; }
	 * 
	 * 
	 * public Object clone() throws CloneNotSupportedException { //Customer c =
	 * (Customer) super.clone(); //c.account = (BankAccount) account.clone(); return
	 * super.clone(); }
	 */
	
       public String name = null;

		/**
		 * Customer's account, will be deep cloned
		 */
		public BankAccount account = null;

		/**
		 * Customer's Address. Shallow cloned
		 */
		//public CustomerAddress address = null;

		public Customer(String n) {
			name = n;
			account = new BankAccount(10);
			//address = new CustomerAddress();
		}

		/**
		 * Deep clone the Customer and Account object
		 */
		public Object clone() throws CloneNotSupportedException {
			Customer c = (Customer) super.clone();
			c.account = (BankAccount) account.clone();
			return c;
		}

	}
