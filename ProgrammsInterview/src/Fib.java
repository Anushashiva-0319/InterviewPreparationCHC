import java.util.Scanner;

public class Fib {
	
	public static void main(String[] args) {
	
		
		int n,a=0,b=0,c=1;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter n value");
		n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			 a=b;
			 b=c;
			 c=a+b;
		
			 System.out.println(a);
			
		}
		
	}
}


