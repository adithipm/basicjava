
public class Application3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Player P1 = new Player();
		P1.play();
		int score = P1.getScore();
		System.out.println("Your score is: " + score);
		P1.getScore(10);
	}

}
