package division1_3;

public class ArrayReturn {
	public static void main(String[] args) {
		int array[] = createSquare(3);
		array = createSquare_(3);
		for (int i = 0; i < array.length; i++) {
			if (i == array.length - 1) {
				System.out.println(array[i]);
			} else {
				System.out.print(array[i] + " , ");
			}
		}

	}

	public static int[] createSquare(int fig) {
		int[] array = null;
		array = new int[fig];
		for (int i = 1; i <= array.length; i++) {
			array[i - 1] = i * i;
		}

		return array;
	}

	public static int[] createSquare_(int fig) {
		int[] array = null;
		array = new int[fig];
		for (int i = 1; i <= array.length; i++) {
			array[i - 1] = (int) Math.pow(i, 2);
		}


		return array;
	}

}
