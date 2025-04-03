import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarExample {

	
	//For the legacy java.util.Calendar, uses Calendar.getInstance() to get the current date time,
	//and format it with the SimpleDateFormat.


public static void main(String[] args) {
	
	
	  SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
      Calendar cal = Calendar.getInstance();
      System.out.println(dateFormat.format(cal.getTime()));   // 2021/03/22 16:37:15

	
}


}
