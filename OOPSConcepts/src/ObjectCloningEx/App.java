package ObjectCloningEx;

public class App {
	
	public static void main(String[] args) {
		
		
		Address d=new Address("nrt", "12345");  
		ObjectCloningEx clon=new ObjectCloningEx(1,d);
		System.out.println(clon);
		Address af=clon.getAddress();
		af.setCity("blr");
		af.setPincode("34567");
		// clon2=new ObjectCloningEx(2,d);
		System.out.println(clon);
	}

}
