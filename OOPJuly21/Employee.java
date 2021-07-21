package OOPJuly21;

public class Employee extends Person {
	protected String designation=null;
	
	public Employee() {
		System.out.println("Default Constructor");
	}
	
	public Employee(String fn, String ln, String des) {
		super(fn,ln);
		designation =des;
		System.out.println("3 parameters called:"+ firstName+lastName+ designation);
		}
	public void changeAddress(String c) {
		super.changeAddress();
		String add= c;
		System.out.println("Employee change address is :"+c);
	}
   
	public static void main(String[] args) {
		Employee e =new Employee("Rahul ", "Bairagi", "Electrical Engineer");
		e.changeAddress("Indore");
		}

}
