package OOPJuly19;

public class Ptriangle extends PShape {
	private int base=0;
	private int height =0;
	
	public Ptriangle () {}
	public Ptriangle (int b,int h) {
		base=b;
		height=h;
	}
	public double area() {
		double a=0.5*base*height;
		return a;
	}
	
	

	public static void main(String[] args) {
		Ptriangle ps = new Ptriangle(35,62);
		double arr= ps.area();
		
		System.out.println("Area of triangle is: "+arr);
		
		
	}
	}

