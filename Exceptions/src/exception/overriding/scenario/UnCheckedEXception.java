package exception.overriding.scenario;


class Path{
	void add() throws ArithmeticException{
		System.out.println("ArithmeticException is child exception for Unchecked Exception ");
	}
}
public class UnCheckedEXception  extends Path{
	void add() throws  RuntimeException{
		System.out.println("RuntimeException is parent exception for Unchecked Exception ");
	}
	public static void main(String[] args) {
		UnCheckedEXception un =new UnCheckedEXception();
		un.add();
	}

}
