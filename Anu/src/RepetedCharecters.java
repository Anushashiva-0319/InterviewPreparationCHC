import java.util.HashMap;

public class RepetedCharecters {
	
	static void duplicateCharacters(String str ) {
		
		char[] temp=str.toCharArray();
		
		HashMap<Character, Integer> hm =new HashMap<>();
		
		for(char charectervalue :temp) {
			if(hm.get(charectervalue)!=null) {
			hm.put(charectervalue, hm.get(charectervalue)+ 1);	
			}
			else {
				hm.put(charectervalue, 1);
			}
			}
		System.out.println(hm);
		
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		duplicateCharacters("ANUSHAKOLLI");
	}

}
