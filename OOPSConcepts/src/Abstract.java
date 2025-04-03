
abstract class Sana {

	int x;
	
	public abstract int add(int x, int y);
	
	
	
	/*
	 * public int addition(int a,int b) { System.out.println(a+b); return a+b; }
	 */

	

	static void print() {
		System.out.println("this is my name");
	}

	Sana(int x, int y) {
		System.out.println(x / y);
	}

}

public class    Abstract extends Sana {

	
	Abstract(int x, int y) {
		super(x, y);
		System.out.println("this method  is calliing using  constructor "  +(x*y));
	}

	@Override
	public int add(int x, int y) {

		return (x + y);
	}

	public static void main(String[] args) {

		Sana cs = new Abstract(10, 5);

		System.out.println(cs.x);
		System.out.println(cs.add(10, 100));
		cs.print();

	}
}
