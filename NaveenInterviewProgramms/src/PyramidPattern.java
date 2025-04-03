
public class PyramidPattern {

	public static void main(String[] args) {
//		      *
//		     * *
//		    * * *
//		   * * * *
//		  * * * * *
//		

		for (int row = 1; row <= 5; row++) {
			for (int col = 5 - row; col >= 0; col--) {
				// prints space between two stars
				System.out.print(" ");
			}
			for (int k = 1; k <= row; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
