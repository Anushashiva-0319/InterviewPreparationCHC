public class Typecasting {

	
	
	public static void main(String[] args) {
		int num=2;
		 int z =100;
		 long l =z;
		 System.out.println("Convert smaller data type into larger datatype called widening cast or implicit cast  :"+l);
		
		
		int in=110;
		char ch =(char) in;
		System.out.println("explicit casting or narrowing casting " + ch);
		System.out.println("_____________________________________________________________");
		
		
		//To solve the problem where an input integer (like 1 or 28) is converted into its corresponding Excel column 
		//label (like "A" for 1 or "AB" for 28), you can write a Java method to perform this conversion.
		
		StringBuilder sb =new StringBuilder();
		
		while(num>0) {
			num--;
			sb.insert(0, (char) ('A'+ (num%26)));
		
			num=num/26;
			
		}
		System.out.println(sb.toString());
	}
}
