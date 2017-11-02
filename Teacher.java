
public class Teacher {

	String name;
	int age;
	int grade;
	String school;
	
	Teacher(String name, int age, int grade, String school){
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.school = school;
	}
	
	void finishLesson(String topic){
		teachLesson(topic);
		giveTest(topic);
	}
	
	private void teachLesson(String topic){
		System.out.println("Teacher is teaching students about: " + topic);
	}
	
	private void giveTest(String topic){
		System.out.println("Teacher is giving a test to students on: " + topic);
	}
	
}
