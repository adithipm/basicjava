
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Math m1 = new Math();
		int result = m1.add(50, 62);
		System.out.println(result);

		result = m1.addspecial(2);
		System.out.println(result);

		result = m1.addspecial(3);
		System.out.println(result);

		result = m1.addspecial(4);
		System.out.println(result);

		Math m2 = new Math();
		result = m2.addspecial(2);
		System.out.println(result);

		result = m2.addspecial(4);
		System.out.println(result);

		result = m1.addspecial(3);
		System.out.println(result);

		result = Math.add(45, 61);
		System.out.println(result);
		
		Dog d1 = new Dog();
		d1.feed();
		

	}

}
