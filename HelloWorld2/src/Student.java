
public class Student {

	int age;
	String name;

	Student(String inputname, int inputage) {

		name = inputname;
		age = inputage;

	}

	int readBook(String bookName, int minutesToRead) {

		System.out.println("Reading Book: " + bookName + " Minutes to read: " + minutesToRead);

		int actualMinutesRead = 25;
		return actualMinutesRead;

	}

	void doHomework() {

		System.out.println("Doing Homework");

	}

}
