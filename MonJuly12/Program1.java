package MonJuly12;

public class Program1 {

			
	public  int sum (int a,int b){
		
	
		return (a+b);
	}
	private  int div (int a, int b) {
		return (b/a);
	}
	
	private  int multi (int a, int b) {
		return (a*b);
		
	}
		
	public static void main(String[] args) {
			Program1 s= new Program1 ();
			Program1 d=new Program1();
			Program1 m=new Program1();
			
			int c= s.sum(20, 40);
			int e=d.div(40,100);
			int f=m.multi(60, 3);
			
			System.out.println(c);
			System.out.println(e);	
			System.out.println(f);
			
		}

		
		

	}

