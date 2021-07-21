package OOPJuly21;

public class Account {
	private String name=null;
	private String accountType=null;
	private int amount=2000;
	
	public Account () {}
	
	public Account (String ac, String at, int am) {
		String name =ac;
		String accountType=at;
		int amount=am;
		
	}

	public String getName() {
		return name;
	}

	public String getAccountType() {
		return accountType;
	}

	public int getAmount() {
		return amount;
	}

}
