
public class Math {

	int findAbsoluteValue(int number) {

		int absoluteValue;

		if (number < 0) {
			absoluteValue = number * -1;
		} else {
			absoluteValue = number;
		}

		return absoluteValue;

	}

	int getMaximum(int number1, int number2) {

		int maximum;

		if (number1 > number2) {
			maximum = number1;
		} else {
			maximum = number2;
		}

		return maximum;

	}

}
