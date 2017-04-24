package division1_3;

public class MultipleCondition {

	public static void main(String[] args) {
		// 1
		int transportTo = new java.util.Random().nextInt(4);
		transportTo++;
		// 2
		String transportToName = transStr(transportTo);
		int transportFrom = new java.util.Random().nextInt(4);
		transportFrom++;
		String transportFromName = transStrSwitch(transportFrom);
		System.out.println("今年の正月は" + transportToName + "で帰省し、" + transportFromName + "で戻ります");
		print5roop();
		makeArray();
	}

	public static String transStr(int fig) {
		String transportToName = null;
		if (fig == 1) {
			transportToName = "飛行機";
		} else if (fig == 2) {
			transportToName = "新幹線";

		} else {
			transportToName = "高速バス";
		}
		return transportToName;
	}

	public static String transStrSwitch(int fig) {
		String transportToName = null;
		switch (fig) {
		case 1:
			transportToName = "飛行機";
			break;
		case 2:
			transportToName = "新幹線";
			break;
		default:
			transportToName = "高速バス";
		}
		return transportToName;
	}

	public static void print5roop() {

		for (int i = 0; i < 5; i++) {
			int fig = i;
			fig++;
			System.out.println(fig + "回繰り返します");
			// System.out.println("5回繰り返します");
		}
	}

	public static void makeArray() {
		int[] figs =new int[] { 10, 20, 30, 40, 50 };
		for (int i = 0; i < figs.length; i++) {
			System.out.println(figs[i]);
		}
		System.out.println("");
		for (int fig : figs) {
			System.out.println(fig);
		}
		figs=null;
	}

}
