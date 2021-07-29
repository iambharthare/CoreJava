package ExHandlingJul22;

public class Program3 {
	public static void main(String[] args) {
		try {
			String n = "Rahul";
			
			System.out.println(n.length());
			System.out.println(n.charAt(6));
		} 
		catch (RuntimeException r) {
			// r.printStackTrace();
			System.out.println(r.getMessage());

		}

	}

}
