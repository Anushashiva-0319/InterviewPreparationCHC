//  Write a program to replace lower-case characters with upper-case and vice-versa.

public class CaseSensitive {

	public static void main(String[] args) {

		String str = "Anusha";

		// System.out.println(caseChange(str));

	}

	static void caseChange(String st) {
		// StringBuilder to store the result
		StringBuilder swappedString = new StringBuilder();

		// Loop through each character in the string
		for (int i = 0; i < st.length(); i++) {
			char ch = st.charAt(i);

			// Swap case for each character
			if (Character.isLowerCase(ch)) {
				swappedString.append(Character.toUpperCase(ch));
			} else {
				swappedString.append(Character.toLowerCase(ch));
			}
		}

		System.out.println(swappedString.toString());

	}
}
