import java.util.HashMap;
import java.util.Map.Entry;

public class Practice {
public static void main(String[] args) {
	String[] str= {"java","c","java","mysql"};
	
	findDuplicates(str);
	
	
}

private static void findDuplicates(String[] str) {
	HashMap<String, Integer> hs=new HashMap<String, Integer>();
	for(String s:str) {
		if(hs.containsKey(s)) {
			hs.put(s, hs.getOrDefault(s ,0)+1);
		}
		else {
		hs.put(s, 1);
		}
		
	}
	System.out.println(hs);
	

	for(Entry<String,Integer> et:hs.entrySet()) {
		if(et.getValue()>1) {
			System.out.println(et);
		}
	}


}
}
