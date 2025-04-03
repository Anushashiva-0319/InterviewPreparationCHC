import java.util.Scanner;

public class Biggerno {

	public static void main(String[] args) {
		int a,b,c;
		Scanner s=new Scanner(System.in);
		System.out.println("entrr a,b,c");
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		
		if(a>b && a>c) {
			System.out.println("a is big" +a);
		}
		else if (b>c) {
			System.out.println("b is bigger" +b);
		}
		System.out.println("c is big" +c);
		}
	}

