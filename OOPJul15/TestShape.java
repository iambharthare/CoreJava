package OOPJul15;

public class TestShape {

	public static void main(String[] args) {
		Shape s= new Shape ();
		
		 s.setColor("Red");
		 s.setBorderWidth(6);
		
		System.out.println("Color:- "+ s.getColor());
		System.out.println("BorderWidth:- "+ s.getBorderWidth());


	}

}
