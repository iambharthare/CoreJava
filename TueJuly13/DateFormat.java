package TueJuly13;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;



public class DateFormat {

	public static void main(String[] args) throws Exception {
		Date d=new Date();
		//System.out.println("Date:-"+d);
		SimpleDateFormat Date = new SimpleDateFormat ("dd/MM/yyyy");
		String str= Date.format(d);
		System.out.println(str);
		
		String str1="15/08/1947";
		Date d1 =Date.parse(str1);
		System.out.println(d1);
		
		

	}

}
