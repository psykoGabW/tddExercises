package co.simplon.gwi.tdd.fizzbuzz;

public class FizzBuzz {

	public static String processInteger(int number) {
		if (number % 15 == 0) {
			return "FizzBuzz";
		}
		if (number % 3 == 0) {
			return "Fizz";
		}
		if (number % 5 == 0) {
			return "Buzz";
		}
		return Integer.toString(number);
	}

	public static String fizzBuzz(int min, int max) throws IllegalArgumentException {
		if (min > max) {
			throw new IllegalArgumentException("max should be superior at min");
		} else {
			String result = "";
			for (int i = min; i <= max; i++) {
				result += processInteger(i);
			}
			return result;
		}
	}
}
