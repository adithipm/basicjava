
public class Student {

	int age;
	String name;
	
	
	Student (int age, String name){
		this.age = age;
		this.name = name;
	}
	
	
	void readBook (String bookName){
		System.out.println("Reading: " + bookName);
	}
	
	void readBook (String bookName, int minutesToRead){
		System.out.println("Reading: " + bookName + " for: " + minutesToRead + " minutes");
	}
	
	void readBook (int minutesToRead){
		System.out.println("Reading my own book for: " + minutesToRead);
	}
	
	void readBook(){
		System.out.println("Reading");
	}
	
	void readBook(String bookName, int minutesToRead, int pagesToRead){
		System.out.println("Reading: " + bookName + " for: " + minutesToRead + " minutes and " + pagesToRead + " pages");
	}
	
}
