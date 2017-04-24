package division1_3;

public class Couses0414 {
	public static void main(String[] args) {
		displayAttribute1("身長", 175);// 1_1
		displayAttribute2("体重", 70);// 1_2

		displayAttribute1("身長",175,"cm");
		displayAttribute1("体重",70,"kg");


		String[] str = new String[] { "身長", "体重" };
		int[] fig = new int[] { 175, 70 };
		int[] figs = new int[] { 10, 10, 10, 10, 10 };
		System.out.println(multiply(3, 8));// 2
		System.out.println(multiplyFree(figs));// 2
		displayAttribute(str, fig);

		add(fig);
		for (int i = 0; i < fig.length; i++) {
			System.out.println(fig[i]);
		}
		add(fig[0]);
		add(fig[1]);
		for (int i = 0; i < fig.length; i++) {
			System.out.println(fig[i]);
		}
	}

	public static void displayAttribute1(String attribute, int value) {

		System.out.println("私の" + attribute + "は" + value + "です");
	}
	//
	public static void displayAttribute1(String attribute, int value,String unit) {

		System.out.println("私の" + attribute + "は" + value +unit+ "です");
	}

	public static void displayAttribute2(String attribute, int value) {
		System.out.println("私の" + attribute + "は" + value + "です");

	}

	public static void displayAttribute(String[] attributes, int[] values) {
		if (attributes != null && values != null) {
			for (int i = 0; i < attributes.length; i++) {
				System.out.println("私の" + attributes[i] + "は" + values[i] + "です");

			}
		}
		return;

	}

	public static int multiply(int number1, int number2) {

		int ans = number1 * number2;
		return ans;
	}

	public static int multiplyFree(int[] number) {
		int ans = number[0];
		for (int i = 1; i < number.length; i++) {
			ans *= number[i];
		}

		return ans;
	}

	public static void add(int[] figs) {
		for (int i = 0; i < figs.length; i++) {
			figs[i]++;
		}

	}
	public static void add(int fig) {

		fig++;

	}

}
