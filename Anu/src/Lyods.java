import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Lyods {

	public static void main(String[] args) {

		String str = "population";
		List<String> ls = new ArrayList<>(Arrays.asList(str.split("")));
		//System.out.println(ls);
		Map<Object, Long> ml = ls.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()));
		ml.entrySet().forEach(x -> System.out.println(x));
	}
}
