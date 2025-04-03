interface AB {
	void anji(float x, float y);

	default void aj(int x, int y) {
		System.out.println(x * y);
	}
}

interface CD extends AB {
	void anji(float x, float y);

	default void aj(int x, int y) {
		System.out.println(x - y);
	}
}

public class Gna implements AB, CD {

	@Override
	public void anji(float x, float y) {
		System.out.println();

	}
	public  void aj(int x, int y) {
		CD.super.aj(x, y);
		
	}

	public static void main(String[] args) {
		Gna a = new Gna();
		a.anji(12, 10);
		System.out.println(a);
		a.aj(10, 2);
		// a.anji(12,13);

	}

	
}
