package OOPJuly20;

public class TestShape extends Shape {
	private int radius =0;

	public TestShape() {}
	public TestShape (int r) {
		radius =r ;
	}

	@Override
	public double area() {
		double ar =Shape.PIE*radius*radius;
		return ar;
	}
	
	public static void main(String[] args) {
		Shape ts= new TestShape(5);
		double f=ts.area();
		System.out.println("area of Circle is: "+ f);
		

	}

}
