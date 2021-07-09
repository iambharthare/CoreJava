package CoreJavaBasic;

public class StringBUFFERRR {

	public static void main(String[] args) 
	{
	StringBuffer  sb = new StringBuffer("Shubham");
	sb.append ("Bharthare");
	System.out.println(sb);
	System.out.println(sb.length());
	System.out.println(sb.capacity());
	System.out.println(sb.charAt(5));
	System.out.println(sb.replace(0, 7, "Rahul "));
	System.out.println(sb.indexOf("Bharthare"));
	
    System.out.println(sb.reverse());
    
	}
}