
public class Math {

	int previousNumber;

	static int add(int x, int y) {
		int z = x + y;
		return z;
	}

	int addspecial(int x) {
		int answer;
		answer = previousNumber + x;
		previousNumber = answer;
		return answer;
	}

}
