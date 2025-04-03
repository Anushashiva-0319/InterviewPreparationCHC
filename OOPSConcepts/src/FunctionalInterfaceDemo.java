import java.util.function.Function;

 class Fuct  implements Function<Integer, Integer>{

	@Override
	public Integer apply(Integer t) {
		return t;
	}

	
	
	
}

class FunctionalInterfaceDemo{
	public static void main(String[] args) {
		
		Function<Integer, Integer>  fuc= (t)->{
			System.out.println(t);
			return t;
		};
		fuc.apply(12);
		
	}
}
