
public class ReverseTotalSentence {
	public static void main(String[] args) {

		String str = "Anusha kolli good";
		String[] s = str.split(" ");
		String rev = "";
		for (String st : s) {
			String revWord = "";
			for (int i = st.length() - 1; i >= 0; i--) {
				revWord = revWord + st.charAt(i);
			}
			rev = rev + revWord;
			
		}
		System.out.println(rev);
		
	}
}
