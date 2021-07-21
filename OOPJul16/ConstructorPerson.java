package OOPJul16;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class ConstructorPerson {
	private String name;
	private Date DOB;
	private String Address;
	
    public ConstructorPerson() {
		System.out.println("Default Constructor");
	}
    public ConstructorPerson (String n, String d) throws ParseException  {
        String name =n;
    	SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyy");
		Date d1 =sdf.parse(d);
		DOB=d1;
    	
    	
    }
    public ConstructorPerson (String a) {
    	String address=a;
    	System.out.println("Address is: "+a);
    			
    }
	public String getName() {
		return name;
	}
	
	
	public Date getDOB() {
		return DOB;
	}
	
	public String getAddress() {
		return Address;
	}

}



