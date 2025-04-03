class AgeViolateException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String msg;

	public AgeViolateException(String msg) {
		
		this.msg = msg;
	}

}

public class ThrowException {

	 private static void validate(int age) {
		if (age > 18) {
			System.out.println("you are eligible for vote");
		} else {
			throw new AgeViolateException("not eligible");
		}
	}
	public static void main(String[] args) {
		ThrowException.validate(20);
		validate(10);
	}
}
