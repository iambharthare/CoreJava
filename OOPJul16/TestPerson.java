package OOPJul16;
import java.util.Date;
import java.text.SimpleDateFormat;
public class TestPerson {

	public static void main(String[] args) throws Exception
	{
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		ConstructorPerson cp= new ConstructorPerson ("Shubham", "12/12/2012" );
	    Date  d1 = cp.getDOB();
	    System.out.println("Shubham " +sdf.format(d1));
		
		
		ConstructorPerson cp1 = new ConstructorPerson ("Bhopal");
		
		

	}

}
