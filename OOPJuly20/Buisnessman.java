package OOPJuly20;

public class Buisnessman implements RichmanInterface, SocialWorkerInterface{
	
	@Override
	public void helpToOthers() {
		System.out.println("Help Others");
		}

	@Override
	public void earnMoney() {
	System.out.println("Earn Money");
	}

	@Override
	public void donation() {
		System.out.println("Donation");
		}

	@Override
	public void party() {
		System.out.println("Party");
		}
public static void main(String[] args) {
	RichmanInterface rm = new Buisnessman();
	rm.donation();
	rm.earnMoney();
	rm.party();
	

	 SocialWorkerInterface sw=new Buisnessman(); 
	 sw.helpToOthers();
	}

	
	 



}
