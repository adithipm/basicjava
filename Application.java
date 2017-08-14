
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Creating my own data types");
		Person p1 = new Person();
		p1.age = 13;
		p1.name = "Adithi";
		p1.grade = 9;

		Person p2 = new Person();
		p2.age = 14;
		p2.name = "Bob";
		p2.grade = 10;

		System.out.println(p1.name);
		System.out.println(p2.name);
		System.out.println(p1.age);
		System.out.println(p2.age);
	}

}
