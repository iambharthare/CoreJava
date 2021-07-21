package OOPJul16;

public class SizeShape {
	private String color;
	private int borderWidth;
	public static final double PI =3.14;
	
	public SizeShape () {
		System.out.println("This is default constructor");
		
	}
	public SizeShape (String c , int w) {
		String color =c;
		int borderwidth =w ;
		System.out.println(c);
		System.out.println(w);
		
	}
	public String getColor() {
		return color;
	}
	public int getBorderWidth() {
		return borderWidth;
	}

	}
	
		
		
	


