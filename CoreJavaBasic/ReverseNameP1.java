package CoreJavaBasic;

public class ReverseNameP1 {

	public static void main(String[] args) {
		//String name= "Shubham Bharthare";
		//for (int i=name.length(); i>0; i--)
			//System.out.print(name.charAt(i-1));
		
		
		StringBuffer sb = new StringBuffer ("Shubham Bharthare");
		sb.reverse ();
		System.out.println(sb);

	}

}
