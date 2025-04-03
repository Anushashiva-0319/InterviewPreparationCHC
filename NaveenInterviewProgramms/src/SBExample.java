
// string class override the object class equals()  so it comapare the content using equals() method

// StringBuilder and StringBuffer does not overriden the   object class equals () it compare the references 

public class SBExample {

	public SBExample(String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		
		String s1=new String("hi");
		String s2=new String("hi");
		System.out.println("it check the content means object value " +  " "  + s1.equals(s2));
		
		SBExample sb1=new SBExample("Anusha");
		SBExample sb2=new SBExample("Anusha");
		System.out.println( " it check the References  value "  + "  " +sb1.equals(sb2));
		
		StringBuffer sf1=new StringBuffer("Anusha");
		StringBuffer sf2=new StringBuffer("Anusha");
		System.out.println( " it check the References  value "  + "  " +sf1.equals(sf2));
		}

	public SBExample reverse() {
		// TODO Auto-generated method stub
		return null;
	}
}