
public class StarPatternRightSide {

	public static void main(String[] args) {
		
//	     *
//	    **
//	   ***
//	  **** i=r0w,j=col
//	 *****

	    int n=5;

			for(int i=1;i<=n;i++) {
				for ( int col=n-i; col>=0; col--)         
				{  
				//prints space between two stars      
				System.out.print(" ");   
				}  
				for(int k=1;k<=i;k++) {
					System.out.print("*");
				}
				System.out.println();
			}
		
		
	}
}
