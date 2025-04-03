
public class Imp {
public static void main(String[] args) {
	
	String name="anusha";
	
	Imp.myName(name);
	System.out.println("outside static" +name);
}

 static void myName(String name) {
	name="anil"; 
	 System.out.println(name);
	
}
}
