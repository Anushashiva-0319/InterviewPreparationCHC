import java.util.Scanner;

public class InfiniteLoop {

	// to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter number value");
		int sum1 = 0;
		int sum = 0;
		while (true) {
			int n = sc.nextInt();
			if (n > 0) {
				sum1 = sum1 + n;
			} else if (n < 0) {
				sum = sum + n;
			} else if (n == 0) {
				break;
			} else {
				System.out.println("invalid input");
			}
			
		}
		System.out.println("sum of positive integers" + sum1);
		System.out.println("sum of negetive integers" + sum);
	}
}
