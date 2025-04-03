
public class LargestAndSmallestNum {
	public static void main(String[] args) {

		int a[] = { 712, 22, 33, -1,44,7890,44, 556, 7890 };
		int max = a[0];
		int min = a[0];
		int secondLarget = a[0];
		int secondMin = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {

				secondLarget = max;
				max = a[i];

			} else if (a[i] > secondLarget) {
				secondLarget = a[i];
			}

			else if (a[i] < min) {
				secondMin=min;
				min = a[i];

			}
			else if (a[i]< secondMin) {
				secondMin=a[i];
			}

		}
		System.out.println("maximum element in the array" + " " + max);
		System.out.println("secondLarget element in the array" + " " + secondLarget);
		System.out.println("minimum element in the array" + " " + min);
		System.out.println(" secondminimum element in the array" + " " + secondMin);
	}
}
