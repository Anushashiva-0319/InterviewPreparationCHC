
/*class GeeksForGeeks{
	
}*/
public class ClassNOtFOundExceptionEx {

	// it is checked exception it happens class is not available in classpath for Compile Time
	
	
	public static void main(String args[])
    {
 
        // Try block to check for exceptions
        try {
 
            Class.forName("GeeksForGeeks");
            System.out.println("working");
        }
 
        // Catch block to handle exceptions
        catch (ClassNotFoundException ex) {
 
            // Displaying exceptions on console along with
            // line number using printStackTrace() method
            ex.printStackTrace();
        }
    }
}
