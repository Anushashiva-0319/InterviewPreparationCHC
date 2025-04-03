package ImmutableExample;

final public class Doubt {

	final public int id;

	final public String name;

	final private Course course;

	public Course getCourse() {
		return new Course(course);  //here we not directly calling the object we are creating new Object and passing the above reference
	}

	public Doubt(int id, String name,Course course) {

		this.id = id;
		this.name = name;
		this.course=course;
	}

	@Override
	public String toString() {
		return "Doubt [id=" + id + ", name=" + name + ", course=" + course + "]";
	}
	

	public static void main(String[] args) {
		Course course =new Course(12,"mCA");

		Doubt d = new Doubt(1, "anusha",course);

		System.out.println(d);
		
		Course cs= d.getCourse();
		cs.setCid(2);
		cs.setCName("javadeveloper");
		
		System.out.println(d);
	}

}
