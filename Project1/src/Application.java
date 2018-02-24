
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1 = new Person("Adithi", 14);
		boolean canDrive = p1.canDrive();
		
		if (canDrive) {
			System.out.println(p1.name + " can drive");
		} else {
			System.out.println(p1.name + " can't drive");
		}

		Person p2 = new Person("Billy Bob Joe", 50);
		canDrive = p2.canDrive();
		
		if (canDrive) {
			System.out.println(p2.name + " can drive");
		} else {
			System.out.println(p2.name + " can't drive");
		}
	}

}
