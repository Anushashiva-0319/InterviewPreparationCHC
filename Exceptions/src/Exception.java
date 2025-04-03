
public class Exception {
	public static void main(String[] args) {
		try {
			int a[] = { 1, 3 };
			try {
				a[2]=9; 
				// array length is fixed already and it is 2 but
                //we want to insert one more element it gives ArrayIndexOutOfBoundsException
			}
			
			catch (ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
			}
			a[4] = 4 / 0;
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
	}
}
