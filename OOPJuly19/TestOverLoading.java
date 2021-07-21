package OOPJuly19;

public class TestOverLoading extends OverLoadingAddition {

	public static void main(String[] args) {
		TestOverLoading t =new TestOverLoading();
		
		double d=t.add(40.15, 101);
		int f= t.add(40,52);
		double e = t.add(412, 56.14, 9);
		
		System.out.println(d);
		System.out.println(f);
		System.out.println(e);
		
	}

}
