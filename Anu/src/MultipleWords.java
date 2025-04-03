import java.util.HashMap;
import java.util.Map.Entry;

public class MultipleWords {

	static void duplicateWords(String str) {
		HashMap<String, Integer> hm = new HashMap<>();
		String[] s = str.split(" ");
		for (String tempString : s) {
			if (hm.containsKey(tempString)) {
				hm.put(tempString, hm.getOrDefault(tempString, 0) + 1);
			} else {
				hm.put(tempString, 1);
			}
		}

		System.out.println(hm);

		for (Entry<String, Integer> hs : hm.entrySet()) {
			if (hs.getValue() > 1) {
				System.out.println(hs);
			}
		}

	}

	public static void main(String[] args) {
		duplicateWords("java is good java");

	}

}
