
public class Method {
	static void prime(int n) {
		int count=0;
		for(int i=2;i<n;i++) {
		if(n%i==1) {
		count++;
		
		}
		break;}
		if(count==1) {
			System.out.println("given no is prime");
		}
		else {
			System.out.println("given no is not  prime");
		}
		}
		
	
	public static void main(String[] args) {
		prime(19);
	}
}
