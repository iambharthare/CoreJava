package CoreJavaBasic;

public class DivisibleBy {

	public static void main(String[] args) {
		int a=196;
		int l=105;
		int n=0, sum=0;
		while (n/7==0) {
			
			n= ((a-1)/7)+1;
			sum=(n/2)*(a+l);
		}
		System.out.println(sum);
		System.out.println(n);

	}

}
