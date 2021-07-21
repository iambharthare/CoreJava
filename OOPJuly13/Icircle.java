package OOPJuly13;

public class Icircle extends Ishape {

	public static void main(String[] args) {
		Icircle c=new Icircle ();
		c.setColor("red");
		
		double ar =c.area();
		System.out.println("Area of the circle is: "+ar);
		System.out.println("Color is: "+c.getColor());
		
		
		
		
	}
	public double area ()
	{
		double radius = 5;
		double ar = Ishape.PI*radius*radius; 
			return ar;
	}

}
