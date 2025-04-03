import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.Vector;

public class Tree {

	public static void main(String[] args) {

		TreeSet<Integer>  set=new TreeSet<>();
		set.add(10);
		set.add(1);
		set.add(13);
		set.add(12);
	//	set.add(null);
		
		
		Iterator<Integer> st=set.iterator();
		while(st.hasNext()) {
			System.out.println(st.next());
		}
	
	}
}
