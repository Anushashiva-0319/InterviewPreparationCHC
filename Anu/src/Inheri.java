
class Anu {
	private float salary = 50000;

	public float getSalary() {
		return salary;
	}
}

class Inheri extends Anu {
	int bonus = 20000;

	public static void main(String[] args) {

		Inheri in = new Inheri();
		System.out.println("totalsalary of employee" + (in.bonus + in.getSalary()));

	}
}
