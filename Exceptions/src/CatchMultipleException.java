
public class CatchMultipleException {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };
		try {
			// int a[]=new int[7]; one way to declare array
			// int a[]= {1,2,3,4,5}; // another way of declare array
			a[5] = 7 / 0;
			a[6] = 8;
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}

		finally {
			System.exit(0);
			System.out.println(a + "finally block ");
		}

	}

}
