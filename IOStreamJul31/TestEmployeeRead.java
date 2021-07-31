package IOStreamJul31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class TestEmployeeRead {

	public static void main(String[] args) throws Exception {
		FileInputStream file=new FileInputStream("C:\\object.ser");
		ObjectInputStream in=new ObjectInputStream(file);
		
		Employee e= (Employee)in.readObject();
		
		System.out.println("ID: "+e.getId());
		System.out.println("First Name is: "+ e.getFname());
		System.out.println("Last Name is: "+e.getLname());
		System.out.println("Address is: "+e.getAddress());
		System.out.println("Salary of the employee is: "+e.getSalary());
		
	   

	}

}
