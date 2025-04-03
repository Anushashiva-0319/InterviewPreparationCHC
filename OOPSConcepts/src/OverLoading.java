
public class OverLoading {

	 private int i;
	 
	 static int add(int x) {
		
		System.out.println(x);
		return x;
		 
	 }
	 static int add(int x, int y) {
		 System.out.println(x+y);
		 return (x+y);
	 }
	public OverLoading(){
		System.out.println("constructor overLoading");
	}
	 public OverLoading(int i) {
		 this.i=i;
		 System.out.println(i);
	 }
	 
	 public static void main(String[] args) {
		OverLoading ov=new OverLoading(2);
		OverLoading ov1=new OverLoading();
		OverLoading.add(5);
		OverLoading.add(5, 5);
		int a[]= {1,2,3,4,5};
		main(a);
		
	}
	 public static void main(int[] args) {
		 System.out.println(new int[4]);
		
	}
	
}
