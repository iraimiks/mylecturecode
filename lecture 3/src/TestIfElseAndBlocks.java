public class TestIfElseAndBlocks {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("*********");
		System.out.println("*********");

		boolean test = true;
		int result;

		if (test) {
			int number = 100;
			System.out.println("TRUE");
			System.out.println(number + number);
			result = number + number;

			System.out.println("Result value is " + result);

		} else {
			System.out.println("FALSE");
		}

		System.out.println("AFTER if else bloack");

		boolean test2 = true;

		if (test2) {

			System.out.println("TRUE");
			int number = 300;
			result = number + number;

			System.out.println("Result value is " + result);
		} else {
			System.out.println("FALSE");
		}

		System.out.println("AFTER if else bloack");

	}
}
