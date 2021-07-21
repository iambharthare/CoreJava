package OOPJul16;

public class TestAutomobile {

	public static void main(String[] args) {
		 ConsAutomobile ca= new ConsAutomobile ("Black",50, "2015");
			
			System.out.println(ca.changegear(8));
			System.out.println(ca.acceleration());
			System.out.println(ca.brake());
	

	}

}
