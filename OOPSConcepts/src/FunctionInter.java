@FunctionalInterface
interface AnuShiva{
	
	int operation (int x, int y);
}

/*
 * class Arthematic implements AnuShiva{
 * 
 * @Override public int operation(int x, int y) {
 * 
 * return x+y; }
 * 
 * }
 */
 class FunctionInter{
	 
	 public static void main(String[] args) {
	
		 AnuShiva arthematic=(int x, int y)->{
			 
			 int c= x+y;
			 System.out.println(c);
			 return  c;
		 };
		 arthematic.operation(10, 120);
			/*
			 * Arthematic mac=new Arthematic(); mac.operation(12, 10);
			 */
	}
	
}