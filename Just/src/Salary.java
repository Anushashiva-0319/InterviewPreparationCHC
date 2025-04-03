import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		float sal;
		Scanner s = new Scanner(System.in);
		System.out.println("enter salary");
		sal = s.nextFloat();
		while (sal > 10000) {
			sal = sal + 2000;
			System.out.println("salary is " + sal);
		}
		
		sal = sal + 1000;
		System.out.println("salary is + " + sal);
		}
	}

