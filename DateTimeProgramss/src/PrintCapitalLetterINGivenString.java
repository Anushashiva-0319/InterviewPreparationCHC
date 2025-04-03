
public class PrintCapitalLetterINGivenString {

	static void give(String str) {
		StringBuilder st = new StringBuilder();
		for (char ch : str.toCharArray()) {

			if (Character.isLowerCase(ch)) {
				st.append(Character.toUpperCase(ch));
			} else {
				if(Character.isUpperCase(ch)) {
					st.append(Character.toLowerCase(ch));
				

			}
		}
		}
		System.out.println(st);
	}

	public static void main(String[] args) {
		give("me Anusha is good girl");
	}

}
