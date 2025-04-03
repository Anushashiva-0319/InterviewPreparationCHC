
class Add{
	int a=10,b=12;
	void add() {
		System.out.println(a+b);
	}
}

class Sub extends Add{
	void sub() {
		System.out.println(a-b);
	}
	
	
}

class Mul extends Sub{
	
	void mul() {
		System.out.println(a*b);
	}
} 



public class Anusha  {
	public static void main(String[] args) {
		Mul d=new Mul();
		d.add();
		d.sub();
		d.mul();
		
		
	}

}
