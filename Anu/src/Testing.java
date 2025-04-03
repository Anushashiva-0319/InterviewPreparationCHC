import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Testing {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 5, 6, 0, 0, 9, 8, 0, -1, -2));
		List<Integer> lists = list.stream().sorted().collect(Collectors.toList());
		List<Integer> listsss=	Stream.concat(list.stream().filter(x -> x != 0), list.stream().filter(x -> x == 0))
				.collect(Collectors.toList());
		System.out.println(listsss);
	}
}
