package ExHandlingJul22;
//order of catch blocks: Parent & Child
public class Program4 {
	public static void main(String[] args) {
		try {
			String b ="Vijay";
			
			System.out.println(b.charAt(9));
			System.out.println(b.length());
		}
		
//		catch(IndexOutOfBoundsException e) {
//			System.out.println("Index Error");
//			
//		}
		catch (Exception e) {
			System.out.println("Error: "+e.getMessage());
		}
		
		
	}

}
