package OOPJul15;

public class TestAutomobile {

	public static void main(String[] args) {
		Automobile m= new Automobile ();
		
		m.setColor("Blue");
		m.setSpeed(60);
		m.setMake("2010");
	
		
		
		
		int b = m.getSpeed();
        int c = b+10;
        int d = c+10 ;
        int e = d+10 ;
        int f = e+10 ;
		
		if (gear()==1) {
			System.out.println("Speed is: "+b );
		}
		else if (gear()==2) {
			System.out.println("Speed is: "+c );
			
		}
		else if (gear()==3) {
			System.out.println("Speed is: "+d );
			
		}
		else if (gear()==4) {
			System.out.println("Speed is: "+e );
			
		}
		
		else{
			System.out.println("Speed is: "+30 );
		}
		
		
		System.out.println(m.getColor());
		System.out.println(m.getSpeed());
		System.out.println(m.getMake());
		
		
	

	}

	private static int gear() {
		return 3;
	}
	
	}