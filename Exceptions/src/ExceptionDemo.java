
class Addition {
	static int b = 0;
}

public class ExceptionDemo extends Addition {
	public static void main(String[] args) {

		try {

			int a = 1;
			int c = a / b;
			System.out.println(c);
		}

		catch (ArithmeticException e) {
			e.printStackTrace();// it give exception name,reason,line no,class name,method name
			System.out.println(e.toString());// it give exception name,reason
			System.out.println(e.getMessage());// it give only reason
			System.out.println("can not divide any number with zero"); // user defined message for client understanding perpose

		} finally {
			System.out.println(Addition.b);
		}

	}

}
