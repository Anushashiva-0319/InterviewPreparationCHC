import java.util.HashMap;
import java.util.HashSet;

public class DuplicateElementinArray {

	public static void main(String[] args) {

		String a[] = { "anusha", "anjali", "jyothi", "anusha" };
		// normal way
		for(int i=0;i<a.length;i++) {
			for(int j=i+1; j<a.length;j++) {               // it has two for loops so timecomplexity increase like o(n2)
				if(a[i].equals(a[j])) {
					System.out.println("the duplicate element is :::" + a[i].hashCode());
				}
			}
		}
		
		System.out.println("***************************************************");
		
		// using hashset the timecomplexity is o(n)
		
		HashSet<String> hs =new HashSet<String>();
		for(String st:a) {
		
		if(hs.add(st)== false) {
			System.out.println("the duplicate element is :::" + st.hashCode());
		}
		}
		
		

		System.out.println("***************************************************");
		
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		for(String sana:a) {
			if(map.containsKey(sana)) {
				map.put(sana,map.get(sana)+1);
				
			}
			else {
			map.put(sana, 1);
			
			
		}
		for(java.util.Map.Entry<String, Integer> hst: map.entrySet()) {
			if(hst.getValue()>1) {
				System.out.println("the duplicate element is :::" + hst.getKey().hashCode());
			}
		}
	} 

}
}
