import java.util.HashMap;
import java.util.HashSet;

public class RemoveDuplicateElementsinUnsortedArray {

	public static void main(String[] args) {
		// int a[] = { 1, 1,2,2,3,4,5,5,6,6,7 }; //sorted array

		int a[] = { 1, 3, 4, 5, 7, 6, 3, 2, 1, 8 }; // unsorted array
		


		HashMap<Integer, Integer> hs = new HashMap<>();

		for (int i = 0; i < a.length; i++) {
			if (hs.containsKey(a[i])) {
				hs.put(a[i], hs.get(a[i] + 1)); 
				// System.out.println(a[i]);
				} 
			else { hs.put(a[i], 1);
				System.out.print(a[i] + " ," + ""); // after removing duplicate elements }

			}
		 
		  }
	}

}
