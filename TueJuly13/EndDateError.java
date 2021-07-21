package TueJuly13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
//import java.util.Calendar;
import java.util.Date;
//import java.util.GregorianCalendar;

public class EndDateError {
	public static void main(String[] args) throws ParseException {
		 Date k = new Date();
		 SimpleDateFormat sdk = new SimpleDateFormat( "dd/MM/yyyy");
		 
		 Date startDate = sdk.parse("13/08/2010");
		 Date endDate = sdk.parse("12/08/2010");
		 
		 System.out.println("Start Date is :"+ sdk.format(startDate));
		 System.out.println("End Date is :"+ sdk.format(endDate));
		 
		 if (startDate.getTime() > endDate.getTime()) {
			 System.err.println("error End date is less than Start Date");
			 
		 }else {
			 System.out.println("Code is Runing");
		 }
		 
	}
	}



	