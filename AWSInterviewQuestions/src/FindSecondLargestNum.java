// list1 = [10, 20, 20, 4, 45, 45, 45, 99, 99]
//Removing duplicates from the list and find second largest num--------> 2 times *********

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindSecondLargestNum {

	public static void main(String[] args) {

		List<Integer> numbersList = Arrays.asList(10, 20, 20, 4, 45, 45, 45,100, 99, 99);
		Optional<Integer> secondLargest = numbersList.stream().distinct().sorted(Comparator.reverseOrder()).skip(1)
				.findFirst();

		System.out.println(secondLargest.get() + " second largest num in the list ");
		
//then we need to sort all the elements in descending order then we will call .sorted(Comparator.reverseOrder()) method 
// after sorting all the elements in descending order we want to skip first element then will call .skip(1) method. Now our second highest element at first number so now we will call .findFirst() method. 
	}

}
