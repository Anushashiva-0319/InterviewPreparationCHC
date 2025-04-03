import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeEx {
public static void main(String[] args) {
	
	

	  DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm:ss");
	  LocalTime localTime = LocalTime.now();
	  System.out.println(dtf.format(localTime));            // 16:37:15

}
}
