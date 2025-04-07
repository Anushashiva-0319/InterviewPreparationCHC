import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class AnushaGnanasri {


	public static void main(String[] args) {

		int a[] = { 1,1, 2, 3, 4, 5,6, 6, 1, 2, 7,7,3 };
		
		List<Integer> ls=Arrays.stream(a).boxed(). sorted((x,y)->x.compareTo(y)).collect(Collectors.toList());//sort(x,y)->xcom.//forEach(x->System.out.println(x));
		
		
		System.out.println(ls);
		//remove duplicate numbers from an array

		HashSet<Integer> hs = new HashSet<Integer>();
		for (int i = 0; i < a.length; i++) {

			hs.add(a[i]);

		}
		
		Iterator<Integer> it =hs.iterator();
		while(it.hasNext()) {
			
		}
//		System.out.println(it.next());
		
		
		
		HashMap<Integer, Integer> hs1 =new HashMap<Integer, Integer>();
		for(int i=0;i<a.length;i++) {
			if(!hs1.containsKey(a[i])) {
				//hs1.put(a[i], hs1.get (a[i]+1)); 
				hs1.put(a[i], 1);
			}
			//hs1.put(a[i], 1);
		}
		System.out.println("removed duplicate elements" + hs1);
		
	}
}