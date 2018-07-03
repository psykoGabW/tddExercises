package co.simplon.gwi.tdd.fizzbuzz;

public class FizzBuzz {
	public static String fizzBuzz(int min, int max) throws IllegalArgumentException {

		if (min > max) {
			throw new IllegalArgumentException("max should be superior at min");
		} else if (min == max) {
			String result = "";
			if (min % 15 == 0) {
				result += "FizzBuzz";
			} else if (min % 3 == 0) {
				result += "Fizz";
			} else if (min % 5 == 0) {
				result += "Buzz";
			} else {
				result += Integer.toString(min);
			}

			return result;
		}

		return null;
	}
}
