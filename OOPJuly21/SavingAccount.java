package OOPJuly21;

public class SavingAccount extends Account {
	public int getAmount() {
		int i =super.getAmount()+1000;
	   return i;
	}

	public static void main(String[] args) {
		SavingAccount s = new SavingAccount();
		Account a = new Account();
		Account sa = new SavingAccount();

		System.out.println(s.getAmount());
		System.out.println(a.getAmount());
		System.out.println(sa.getAmount());
	}

}
