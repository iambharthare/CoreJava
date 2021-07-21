package OOPJul15;
import java.util.Date;
import java.text.SimpleDateFormat;

public class TestPerson {

	public static void main(String[] args)  throws Exception{
		
		Person p =new Person();
		p.setName("Rahul");
		p.setAddress("Bhopal");

		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
		Date d1 = sdf.parse("12/06/1995");
		p.setDOB(d1);
		Date c= p.getDOB();
		
		
		
		System.out.println("Name:- "+ p.getName());
		System.out.println("Date of Birth:- "+sdf.format(c));
		
		System.out.println("Address:- "+p.getAddress());

	}

}
