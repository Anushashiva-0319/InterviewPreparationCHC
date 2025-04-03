

/*Write a java program to count occurrences of each element in an array?------------->3 times *********
Input Array : [4, 5, 4, 5, 4, 6]
Element Count : {4=3, 5=2, 6=1}
*/

import java.util.HashMap;
import java.util.Map.Entry;

public class NumberOccuerence {

	public static void main(String[] args) {
		
		
		HashMap<Integer, Integer>  map =new HashMap<Integer, Integer>();
		int [] a= {4,5,4,5,4,6,11,12,11,13,11,12};
		for(Integer arr:a) {
			if(map.get(arr)!=null) {
				map.put(arr, map.get(arr)+1);
			}
			else {
				map.put(arr, 1);
			}
		}
		
		for(Entry<Integer,Integer>  entry:map.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry);
			}
		}
		
		
	}
}
