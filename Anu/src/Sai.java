import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sai {

	public static void main(String[] args) {

		List<Integer> ls = new ArrayList<Integer>(Arrays.asList(1, 2, 4, 4, 5));
		ls.stream().filter(x->x%2==0).distinct().forEach(x->{
			System.out.println(x);
		});
	
}
}