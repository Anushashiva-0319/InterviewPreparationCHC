
public class ReverseOfNo {

	public static void main(String[] args) {
		int ans =0;
		int num =123456;
		while(num>0) {
			 int rem= num%10;
			 num=num/10;
			 ans=ans*10+rem;
		}
		
		System.out.println(ans);
	}
}
