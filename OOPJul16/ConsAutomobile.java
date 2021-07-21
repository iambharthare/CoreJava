package OOPJul16;

public class ConsAutomobile {
	private String Color;
	private int Speed;
	private String make;
	//private int gear=6;
	
	
	public ConsAutomobile(String c,int s, String i) {
		String color = c;
		int Speed =s;
		String make=i;
		System.out.println("color is: "+c);
		System.out.println("Speed is: "+s); 
		System.out.println("Made in: "+i); 
		
		
		
		
	}
	public String getColor() {
		return Color;
	}
	
	public int getSpeed() {
		return Speed;
	}
	
	public String getMake() {
		return make;
	}
	
	public int changegear (int a) {
		Speed=a*25 ;
		return Speed;
	}
	public int brake () {
		Speed=Speed-10;
				return Speed;
	}
	public int acceleration () {
		Speed = Speed+10;
		return Speed;
	}
	
	

}
