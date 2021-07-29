package ExHandlingJul22;

public class Program2 {
	public static void main(String[] args) {
		try{
			String s=null;
			String p="Shubham";
		System.out.println(p.length());
		System.out.println(p.charAt(10));
		
		}
		catch (NullPointerException e) {
			System.out.println("Null Pointer Error ");
			
		}
		catch(IndexOutOfBoundsException e){
			System.out.println("Index Error");
			}
		
		
		/*
		 * catch(IndexOutOfBoundsException | NullPointerException e) {
		 * System.err.println(e.getMessage());
		 * 
		 * }
		 */
		
		}

}
