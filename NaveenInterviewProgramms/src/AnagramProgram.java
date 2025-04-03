import java.util.Arrays;

public class AnagramProgram {

	public static Boolean checker(String str1, String str2) {
		char[] strChar = str1.toCharArray();
		char[] strChar2 = str2.toCharArray();

		Arrays.sort(strChar);
		Arrays.sort(strChar2);

		return Arrays.equals(strChar, strChar2);
	}

	public static void main(String[] args) {

		AnagramProgram an = new AnagramProgram();
		String str1 = "anusha";
		String str2 = "anu";
		checker(str1, str2);
		if(checker(str1, str2)) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}
}
