package OOPJuly19;

public class OverLoadingAddition {

	public int add (int a,int b) {
		return a+b;
		
	}
	public double add (int a,double b,int c) {
		return a+b+c;
	}
	public double add (double a, int b) {
		return a+b;
	}
}
