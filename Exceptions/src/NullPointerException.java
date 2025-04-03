
public class NullPointerException {
// we did not assign any value to Variable then we will get dis exception
	
	private static int getException(String name) {
		return name.length();
		
	};
	
	public static void main(String[] args) {
		//NullPointerException.getException("");
		System.out.println(getException(null));
		//System.out.println(name);
	}
	
	
}
