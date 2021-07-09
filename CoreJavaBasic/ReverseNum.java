package CoreJavaBasic;

public class ReverseNum {

	public static void main(String[] args) {
		int a=456789, reverse=0;
		while (a!=0) {
			int remainder = a % 10;
			 reverse = reverse*10+remainder;
			 a=a/10;
		}
				
		System.out.println("the reverse number is "+ reverse);
	}
}

