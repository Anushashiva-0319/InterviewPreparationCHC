import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
// output like this [aad, aad, abb, prasad, mongoose, karthik, jayaprakasam]
public class Example {

	
	
	    public static void main(String[] args) {
	        List<String> input = Arrays.asList("abc cde aad","aad abb", "prasad ram", "monkey mongoose", "karthik jayaprakasam");

	        List<String> result = input.stream()
	           
	            .flatMap(line -> Arrays.stream(line.split(" ")))
	           
	            .filter(word -> hasDuplicateCharacters(word))
	           
	            .collect(Collectors.toList());

	        System.out.println(result);
	    }

	    
	    private static boolean hasDuplicateCharacters(String word) {
	        Set<Character> charSet = new HashSet<>();
	        for (char c : word.toCharArray()) {
	            if (!charSet.add(c)) {
	                return true; 
	            }
	        }
	        return false; 
	    }
	
}