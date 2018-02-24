
public class Application1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("My own Data type");
		House h1 = new House();
		h1.rooms = 6;
		h1.bathrooms = 3;
		h1.floors = 3;
		h1.color = "brown";
		h1.where = "Portland";
		
		System.out.println(h1.rooms);
		System.out.println(h1.bathrooms);
		System.out.println(h1.floors);
		System.out.println(h1.color);
		System.out.println(h1.where);
	}

}
