public class Shiva {
	private static String getName(String name) {

		System.out.println(name);
		return name;
	}

	public static void main(String[] args) {

		Shiva.getName("shiva");
		System.out.println("-------------------------------------------------------");
		String str = "   anusha    kolli 123   ";
		str = str.trim();
		System.out.println(str.replaceAll("\\s", ""));
		StringBuffer st2 = new StringBuffer(str);
		st2 = st2.reverse();
		System.out.println(st2);
		System.out.println("-------------------------------------------------------");
		StringBuilder st = new StringBuilder(str);
		st = st.reverse();
		System.out.println(st);
		String st1 = str.replaceAll("\\s", "");
		System.out.println(st1);

	}
}
