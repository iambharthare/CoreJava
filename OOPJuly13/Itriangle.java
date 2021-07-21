package OOPJuly13;

public class Itriangle extends Ishape {
	private int base ;
	private int height;
	
	public Itriangle() {}
	
	public Itriangle (int b, int h)
	{
		 base=b;
		 height=h;
	}
	public int getBase() {
		return base;
	}

	public int getHeight() {
		return height;
	}
	 
	public double area () {
		 
		 double ar = 0.5*base*height; 
		 return ar;
		 }
	

	public static void main(String[] args) {
		Itriangle t = new Itriangle (5,10);
		 double ar=t.area();
		System.out.println(ar);
		
	
	
	}
	/*
	 * public int base () { int b = 10; return b; } public int height () { int h=20;
	 * return h;
	 * 
	 * };

	 */

}
