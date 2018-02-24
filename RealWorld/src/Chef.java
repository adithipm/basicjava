
public class Chef {

	String name;
	String restaraunt;
	
	Chef (String name, String restaraunt){
		this.name = name;
		this.restaraunt = restaraunt;
	}
	
	void cookMeal(String recipe){
		readRecipe(recipe);
		followInstructions(recipe);
	}
	
	private void readRecipe(String recipe){
		System.out.println("Chef is reading recipe for: " + recipe);
	}
	
	private void followInstructions(String recipe){
		System.out.println("Chef is following intsructions to make: " + recipe);
	}
	
}
