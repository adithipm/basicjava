
public class Car {

	String name;
	int power;
	boolean IsStarted;

	void start() {
		System.out.println("starting: " + name + " which has: " + power + " power");

		if (IsStarted) {

			System.out.println("Sorry you need to stop car before starting again");

		} else {

			System.out.println("Start");
			IsStarted = true;

		}

		pumpGas();
		igniteGasChamber();

	}

	void stop() {
		System.out.println("stopping: " + name);

		if (IsStarted) {

			System.out.println("Stopping");
			IsStarted = false;

		} else {

			System.out.println("Sorry, please start the car before stopping");

		}

	}

	private void pumpGas() {
		System.out.println("Pumping the gas");

	}

	private void igniteGasChamber() {
		System.out.println("Igniting the chamber");

	}

}
