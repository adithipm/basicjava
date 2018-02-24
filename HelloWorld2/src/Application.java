
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student S1 = new Student("Billy Bob Joe", 14);
		S1.doHomework();
		int minutes = S1.readBook("Harry Potter", 30);
		
		System.out.println("minutes read: " + minutes);
		
	}

}