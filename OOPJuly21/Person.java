package OOPJuly21;
public class Person {
	protected String firstName=null;
	protected String lastName=null;
	protected String address=null;
	
	public Person() {}
	
	public Person (String fn, String ln) {
		firstName = fn;
		lastName=ln;
		System.out.println("2 parameters called "+ firstName +lastName);
	}
	public Person (String fn, String ln,String address) {
		this(fn,ln);
		this.address=address;
		System.out.println("3 parameters called "+firstName +lastName + address);
		
	}
	public void changeAddress() {
		System.out.println("Person current address is Bhopal");
	
	}
	public static void main(String[] args) {
		Person p= new Person ("vijay", "chouhan", "bhopal");
		
	}
		
	}
