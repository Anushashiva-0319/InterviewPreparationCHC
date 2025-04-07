public class ConvertstringtoViceversa {

	public static void main(String[] args) {

		String st = "AnushaKolli";

		StringBuilder s = new StringBuilder();
		for (int i = 0; i < st.length(); i++) {
			char ch = st.charAt(i);
			if (Character.isUpperCase(ch)) {
				s.append(Character.toLowerCase(ch));
			} else if (Character.isLowerCase(ch)) {
				s.append(Character.toUpperCase(ch));
			} else {

			}
		}
		System.out.println(s);
	}
}
