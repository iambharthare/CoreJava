package Cloning;


	public class BankAccount implements Cloneable {

		public double balance = 0;

		public BankAccount() {
		}

		public BankAccount(double b) {
			balance = b;
		}

		@Override
		public Object clone() throws CloneNotSupportedException {
			return super.clone();
		}


}
