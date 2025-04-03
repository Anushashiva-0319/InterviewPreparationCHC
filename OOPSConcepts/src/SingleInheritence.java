
class Bike {
	void move() {
		System.out.println("bike is riding");
	}
}

public class SingleInheritence extends Bike {

	void bike() {
		System.out.println("this is my  bike");
	}

	void move() {
		System.out.println("I am riding my dad bike");
	}

	public static void main(String[] args) {
		SingleInheritence si = new SingleInheritence();  //Bike b=new Bike();

		si.bike();
		si.move();
		

		// b.move();

	}

}
