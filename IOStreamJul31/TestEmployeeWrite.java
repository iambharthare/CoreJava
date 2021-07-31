package IOStreamJul31;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestEmployeeWrite {

	public static void main(String[] args) throws Exception {
		Employee e =new Employee();
		
		e.setId(1);
		e.setFname("Srinath");
		e.setLname("Kapoor");
		e.setAddress("Bhopal");
		e.setSalary(25000);
		
		FileOutputStream fos=new FileOutputStream("c:\\object.ser");
		ObjectOutputStream os=new ObjectOutputStream(fos);
		
		os.writeObject(e);
		os.close();
		
		System.out.println("DONE");
		
		

	}

}
