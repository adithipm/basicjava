
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Today's date is October 21, 2017");

		char x = 'A';
		System.out.println(x);
		
		int tableNumber = 5;

		for (int i = 1; i <= 10; i = i + 1) {

			int result = tableNumber * i;
			System.out.println(tableNumber + "*" + i + "=" + result);

		}
		
		Student S1 = new Student(14, "Adithi");
		S1.readBook("Catching Fire");
		S1.readBook("Catching Fire", 30);
		S1.readBook(15);
		S1.readBook();
		S1.readBook("Catching Fire", 50, 100);
		
	}

}
