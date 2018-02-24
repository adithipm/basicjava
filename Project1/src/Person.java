
public class Person {
	//variables
	int age;
	String name;
	
	//constructor: method which has the same name as the class	
	Person (String name, int age){
		this.name = name;
		this.age = age;
	}
	
	//method
	boolean canDrive(){
		if (age >= 16){
			return true;
		}else{
			return false;
		}
	}

}