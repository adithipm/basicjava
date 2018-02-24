package basicJava;

public class Student {

	void doHomework() {
		System.out.println("Student is doing homework");
	}

	void readBook(String bookName) {
		System.out.println("Student is reading " + bookName);
	}

	void readBook(String bookName, int numberOfMinutes) {
		System.out.println("Student is reading " + bookName + " for " + numberOfMinutes + " minutes");
	}

	int getNumberOfHoursPlayed() {
		int numberOfHoursPlayed = 2;
		return numberOfHoursPlayed;
	}

	boolean play(String gameName, int numberOfMinutesPlayed) {
		if (numberOfMinutesPlayed >= 90) {
			return true;
		} else {
			return false;
		}
	}

}
