public class PracticeProblem {

	public static void main(String args[]) {
	}
	
	public static int sum(int num, int num1) {
		int result = num + num1;
		return result;
	}

	public static int difference(int num, int num1) {
		int result = num - num1;
		return result;
	}

	public static double product(double number, double number1) {
		double result = number * number1;
		return result;
	}

	public static String removeFirst(String word) {
		String result = word.substring(1);
		return result;
	}

	public static int combinedLength(String word, String word1) {
		int result = word.length() + word1.length();
		return result;
	}

	public static boolean isEven(int num) {
		boolean result = (num%2 == 0);
		return result;
	}

	public static boolean isOdd(int num) {
		boolean result = (num%2 != 0);
		return result;
	}

	public static boolean isPositive(int num) {
		boolean result = (num > 0);
		return result;
	}
	public static boolean isNegative(int num) {
		boolean result = (num < 0);
		return result;
	}
}

