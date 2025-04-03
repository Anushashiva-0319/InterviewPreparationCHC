import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


//hello to world remove o letter and sort the sting length in ascending order in java
public class SortAscendingOrderbaseduponLengthofString {

	public static void main(String[] args) {

		String str = "hello to world";
	

		List<String> list = new ArrayList(Arrays.asList(str.split(" ")));

		String result = list.stream()
				// Remove 'o' from each word
				.map(word -> word.replace("o", ""))
				// Step 2: Sort the words by length in ascending order
				.sorted(Comparator.comparingInt(String::length))
				// Step 3: Join the words back into a single string
				.collect(Collectors.joining(" "));

		// Output the result
		System.out.println(result);
	}

}
