package MonJuly12;

public class Hello1 {
	
	public int fun1 (int a,int b) {
		 return fun2 (a,b);
	}
	private int fun2 (int a,int b) {
		return (a+b);
	}

	public static void main(String[] args) {
		Hello1 d =new Hello1 ();
		
		int c =d.fun1(13, 15);
		System.out.println(c);
		
		
		
	

	}

}
