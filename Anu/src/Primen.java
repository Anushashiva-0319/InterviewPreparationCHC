import java.util.Scanner;

public class Primen {
	public static void main(String[] args) {

		int count = 0;
		System.out.println("enter n value");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int i = 2;
		while (i < n) {
			if (n % i == 1) {
				count++;
			}
			break;
		}
		if (count == 2)
			System.out.println("no is  prime");
		else
			System.out.println("Not a prime number ");

	}
}
