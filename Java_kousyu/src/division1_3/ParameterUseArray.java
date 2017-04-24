package division1_3;

public class ParameterUseArray {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] numbersArray = new int[] { 10, 20, 30 };
		numbersArray = null;

		numbersArray = new int[args.length];
		for (int i = 0; i < numbersArray.length; i++) {
			numbersArray[i] = Integer.parseInt(args[i]);

		}
		for (int i = 0; i < numbersArray.length; i++) {
			if (i == numbersArray.length - 1) {
				System.out.println(numbersArray[i]);
			} else {
				System.out.print(numbersArray[i] + " , ");
			}
		}

		square(numbersArray);
		for (int i = 0; i < numbersArray.length; i++) {
			if (i == numbersArray.length - 1) {
				System.out.println(numbersArray[i]);
			} else {
				System.out.print(numbersArray[i] + " , ");
			}

		}
	}

	public static void square(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			// numbers[i] = numbers[i] * numbers[i];
			numbers[i] = (int) Math.pow(numbers[i], 2);
		}
		return;
	}

}
