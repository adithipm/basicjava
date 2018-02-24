package basicJava;

public class PlayableManager {

	static Playable getPlayer(int option) {
		Playable player = null;
		switch (option) {
		case 1:
			player = new Person();
			break;
		case 2:
			player = new Dog();
			break;
		}
		return player;
	}

}
