
public class POwerOfGivenNo {
public static void main(String[] args) {
	
	
	// 3 ^4 =81
	int base=3;
	int exponent=4;
	int result=1;
	while(exponent>0) {
		result=result*base;
		exponent--;
	}
	System.out.println(result);

System.out.println(Math.pow(2,5));
}
}
