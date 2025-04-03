interface Addition {

	public static final int x = 20;

	abstract void add(int x, int y);

	default int addition(int a, int b) {
		System.out.println("default method with addition class" + (a + b));
		return a + b;
	}

	static String name(String name) {
		System.out.println("this is my name:" + name);
		return name;
	}

}

interface Subtraction {

	abstract void sub();

	default int addition(int a, int b) {
		System.out.println("default method with Subtraction class" + (a + b));
		return a + b;
	}

}

public class InterfaceDemo implements Addition, Subtraction {

	@Override
	public void add(int x, int y) {
		System.out.println(x - y);

	}

	@Override
	public void sub() {
		System.out.println("this is subtraction");

	}

	
	void move() {
		System.out.println("did is move method");
	}
	@Override
	public int addition(int a, int b) { // TODO Auto-generated methodstub for default method
		Addition.super.addition(a, b);
		return Subtraction.super.addition(a, b);
	}

	public static void main(String[] args) {
		Addition id = new InterfaceDemo();
		 //Subtraction id = new InterfaceDemo();
		// sub.sub();

		//id.add(10, 5);
		id.addition(10, 10);
		/*
		 * id.sub(); id.move();
		 */
		Addition.name("anusha");
		System.out.println(Addition.x);
	}
}
