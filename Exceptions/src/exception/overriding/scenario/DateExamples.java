package exception.overriding.scenario;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateExamples {

	
	public static void main(String[] args) {
		
		
		SimpleDateFormat dtf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss") ;
		Date d =new Date();
		System.out.println(dtf.format(d));
		LocalDate lc = LocalDate.now();
		System.out.println(lc+ "  " + " today date ");
		LocalDate yesterdayDate=lc.minusDays(1);
		System.out.println(yesterdayDate+ "  " + " yesterDayDate date ");
		LocalDate tomorrowDate=lc.plusDays(1);
		System.out.println(tomorrowDate+ "  " + " tomorrowDate date ");
		
		LocalTime lcTime = LocalTime.now();
		System.out.println(lcTime);
		LocalTime previousHour = lcTime.minusHours(1);
		System.out.println(previousHour+ "  " + " Before time    ");
	}
}
