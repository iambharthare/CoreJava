package TueJuly13;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Practise {

	public static void main(String[] args) throws Exception {
		Date d= new Date();
		System.out.println("Date:"+d);
		
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy"); 
		String d1= sdf.format(d);
		System.out.println(d1);
		
		String d2 ="13/07/2021";
		Date k=sdf.parse(d2);
		System.out.println(k);
				
		
		

	}

}
