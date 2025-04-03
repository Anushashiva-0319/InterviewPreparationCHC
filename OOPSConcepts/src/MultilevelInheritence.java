class Add {
	int add(int x, int y) {
		System.out.println(x + y);
		return x + y;
	}
}

class Sub extends Add {
	int add(int x, int y) {
		System.out.println(x + y + "calling using sub class mathod");
		return x + y;
	}
}

class Div extends Sub {
	void div(int x, int y) {
		System.out.println(x / y);
	}
}

public class MultilevelInheritence {

	public static void main(String[] args) {

		Div s = new Div();
		Add a = new Add();

		Sub n = new Div();
		a.add(10, 20);

		a.add(11, 11);
		s.div(10, 5);

	}
}
