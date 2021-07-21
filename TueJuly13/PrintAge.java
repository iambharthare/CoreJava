package TueJuly13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

public class PrintAge {
	
		public static void main(String[] args) throws ParseException {
			  LocalDate l = LocalDate.of(1997, 03, 24);
			  LocalDate now = LocalDate.now(); 
			  Period diff = Period.between(l, now); 
			  System.out.println(diff.getYears() + "-years, " + diff.getMonths() + "-months, " + diff.getDays() + "-days ");
			  System.out.println("Age : "+ diff.getYears()+" Years");


		}

	}



