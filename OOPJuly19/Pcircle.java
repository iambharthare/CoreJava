package OOPJuly19;

public class Pcircle extends PShape {
	private int radius;
	
	public Pcircle () {}
	public Pcircle (int r) {
		radius=r;
	}
	public double area() {
		double a=3.14*radius*radius ;
		return a;
		}

		public static void main(String[] args) {
			PShape c =new Pcircle (9);
			double arr =c.area();
			
			System.out.println("Area of Circle is: "+arr);
			

		}

}
