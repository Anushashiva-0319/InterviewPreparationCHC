public class Example {
	public static void main(String[] args) {
		String str = "adb";
		String p = "";
		permutation(p, str);
	}

	private static void permutation(String p, String str) {

		if (str.isEmpty()) {
			System.out.println(p);
			return;
		} 

			char ch = str.charAt(0);
			for (int i = 0; i <= p.length(); i++) {
				String f = p.substring(0, i);
				String x = p.substring(i, p.length());
				  permutation(f+ch+x, str.substring(1));
			}
		}
}
