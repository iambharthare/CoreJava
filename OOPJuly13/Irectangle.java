package OOPJuly13;
public class Irectangle extends Ishape {
	private int length=0;
	private int width=0;
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int area() {
		int area =0;
		int ar=length*width;
		return ar ;
	}
	
	public static void main(String[] args) {
		Irectangle r =new Irectangle();
		r.setLength(5);
		r.setWidth(10);
		int ar =r.area();
		
		System.out.println( "area of the rectangle: "+ar);
		
		
		
	}
	
}


