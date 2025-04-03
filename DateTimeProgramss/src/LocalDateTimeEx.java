import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeEx {

	public static void main(String[] args) {

		// SimpleDateFormat smt = new SimpleDateFormat("yyyy/mm/dd"); //
		// smt.format("here we have to pass only date Object")
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("YYYY/MM/dd hh:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(dtf.format(now)); // 2021/03/22 16:37:15

	}
}
