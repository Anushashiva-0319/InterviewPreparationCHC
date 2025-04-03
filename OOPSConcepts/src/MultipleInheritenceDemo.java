
interface A {
	void add(int x, int y);
	default void sub(int x,int y) {
		System.out.println((x-y) + " " + "dis is sub method calling via A class");
	}
}

interface B {
	void add(int x, int y);
	
	default void sub(int x,int y) {
		
		System.out.println((x-y)+ " " + "dis is sub method calling via B class");
	}
}

public class MultipleInheritenceDemo implements A ,B  {

	
	@Override
	public void add(int x, int y) {
		System.out.println("this is addition method" +(x+y));
		
	}
	static void show() {
		System.out.println("did is static method");
	}

	@Override
	public void sub(int x, int y) {
		A.super.sub(x, y);
		B.super.sub(x, y);
	}

	/*
	 * @Override public void sub(int x, int y) { A.super.sub(x, y); B.super.sub(x,
	 * y); }
	 */
	public static void main(String[] args) {
		A mul =new MultipleInheritenceDemo();
		mul.add(10, 30);
		mul.sub(10, 5);
	show();
	}

	
}
