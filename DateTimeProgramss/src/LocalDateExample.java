

//For new Java 8 java.time.* APIs , we can use .now() to get the current date-time and format it with DateTimeFormatter.
//For legacy date-time APIs, we can use new Date() and Calendar.getInstance() to get the current date-time and format it with SimpleDateFormat.

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;



public class LocalDateExample {

	
	public static void main(String[] args) throws ParseException {
		
		DateTimeFormatter dtf= DateTimeFormatter.ofPattern("YYYY/MM/dd");
		SimpleDateFormat smt=new SimpleDateFormat("yyyy/mm/dd HH:mm:SSSS");
		LocalDate lc=  LocalDate.now();
		LocalTime lt= LocalTime.now();
		System.out.println(lc +"***********");
		System.out.println(lt +"***********");
		
		Date d =new Date();
		System.out.println(d);
		
		System.out.println(dtf.format(lc));
		System.out.println(smt.format(d));
		//System.out.println(dtf.parse("2024:12:12"));
	}
}
