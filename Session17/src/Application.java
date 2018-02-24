
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Math M1 = new Math();
		int result = M1.findAbsoluteValue(-10);
		int answer = M1.getMaximum(6, 9);
		
		System.out.println(result);
		System.out.println(answer);
		
		Math M2 = new Math();
		result = M2.findAbsoluteValue(100);
		answer = M2.getMaximum(-2,-7);
		
		System.out.println(result);
		System.out.println(answer);
		
	}

}
