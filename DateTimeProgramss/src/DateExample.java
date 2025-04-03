

import java.text.SimpleDateFormat;
import java.util.Date;
public class DateExample {

	public static void main(String[] args) {
		
		
		// java.util.Date (Legacy)For the legacy java.util.Date, uses new Date() or new Date(System.currentTimeMillis() 
		//to get the current date time, and format it with the SimpleDateFormat.

		
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

	      Date date = new Date();
	      System.out.println(dateFormat.format(date));    // 2021/03/22 16:37:15

	      // new Date() actually calls this new Date(long date)
	      Date date2 = new Date(System.currentTimeMillis());
	      System.out.println(dateFormat.format(date));    // 2021/03/22 16:37:15



}
	}
