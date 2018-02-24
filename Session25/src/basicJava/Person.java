package basicJava;

public class Person {

	int age;
	String name;
	char gender;

	Person(int age, String name, char gender) {
		this.age = age;
		this.name = name;
		this.gender = gender;
	}

	void eatFruit(int fruitType) {
		if (fruitType == 1) {
			System.out.println("He is eating an apple");
		} else if (fruitType == 2) {
			System.out.println("He is eating an banana");
		} else {
			System.out.println("He isn't eating a fruit");
		}
	}

	void eatFruit(enumtest.Fruit fruitType) {
		System.out.println("He is eating a " + fruitType);
	}
}
