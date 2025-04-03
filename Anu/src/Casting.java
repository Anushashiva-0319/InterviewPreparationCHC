
public class Casting {

	
	public static void main(String[] args) {
		
		
		//convert boolean value to String
		boolean f=false;
		String g=String.valueOf(f);
		System.out.println(g);
		int x=5;
		
		Integer in =Integer.valueOf(x);
		System.out.println(in);
		//Integer i =Integer.parseInt(x);
		
		// convert byte to integer 
		Byte b =2;
		int z=b;
		
		System.out.println(z);
		
		//convert char to int 
		char c='A';
		int s=c;
		System.out.println(s);
		
		//convert integer to char
		int inc =90;
		char ch =(char) inc;
		System.out.println(ch);
		
	}
}
