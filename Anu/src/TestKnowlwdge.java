public class TestKnowlwdge {

	public static void main(String[] args) {

		/*
		 * String str = "JAVA IS JAVA is My LOVE ANU LOVE"; String[] st = str.split("");
		 * 
		 * List<String> st1 =new ArrayList<>(Arrays.asList(str.split(" ")));
		 * 
		 * st1.stream().filter(Collectors.groupingBy(x->x),Collectors.counting());
		 */

		String str = "ANUSHAKOLLI good       ";
		
		
		String regex="[a-zA-Z0-9]";
		String st1 = str.replaceAll(regex, "");
		System.out.println(st1);

	}
}
