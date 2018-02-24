
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Creating my own data types");
		Animal a1 = new Animal();
		a1.age = 3;
		a1.legs = 4;
		a1.color = "Black";
		a1.species = "Dog";

		Animal a2 = new Animal();
		a2.age = 5;
		a2.legs = 4;
		a2.color = "Brown";
		a2.species = "Cat";

		System.out.println(a1.age);
		System.out.println(a2.age);
		System.out.println(a1.color);
		System.out.println(a2.color);
	}

}
