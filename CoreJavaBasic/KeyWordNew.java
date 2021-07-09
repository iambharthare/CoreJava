package CoreJavaBasic;

public class KeyWordNew
{

	public static void main(String[] args) {
		String s1 = "Shubham"; 
		String s2="bharthare";
		String s3="vikas";
		String s4= new String ("Shubham");
		String s5= new String ("Shubham");
		boolean result1= (s4==s4);
		boolean result2=s2.equals (s4);
		
		System.out.println(result1);
		System.out.println(result2);
		
	}

}
