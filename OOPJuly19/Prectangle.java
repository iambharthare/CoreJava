package OOPJuly19;



public class Prectangle extends PShape {
	private int length ;
	private int width ;
	
	public Prectangle () {}
	public Prectangle (int l, int b) {
		length=l;
		width=b; 
		}
	public double area() {
		int ar = length*width ;
		return ar;
	}
	

	
	public static void main(String[] args) {
		PShape s =new Prectangle(5,15);
		double arr = s.area();
	System.out.println("Area of rectangle is: "+arr);

	}

}
