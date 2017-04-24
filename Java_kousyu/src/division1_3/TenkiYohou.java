package division1_3;

public class TenkiYohou {
	public static void main(String[] args) {
		System.out.println("天気予報処理を開始します");
		System.out.println("今日の天気を入力してください。1：晴れ 2：曇り 3：雨");
		String currentTenkiName = null;
		int intTenki = 1;
		intTenki = inputTenki();
		// メソッドを追加した場合の天気情報の取得
		currentTenkiName = getTenki(intTenki);
		int future = new java.util.Random().nextInt(3);
		future++;
		if (future == intTenki) {
			System.out.println("今日は一日" + currentTenkiName + "でしょう");
		} else {
			String futureTenkiName = null;
			// メソッドを追加した場合の天気情報の取得
			futureTenkiName = getTenki(future);
			System.out.println("今日は" + currentTenkiName + "から" + futureTenkiName + "になるでしょう");
			System.out.println("天気予報処理を終了します");
		}

	}

	// 正しい数値が入力されるまでやり直し
	public static int inputTenki() {
		int tenki = 0;
		boolean finishFlag = false;
		String tenkiStr = null;
		while (!finishFlag) {
			tenkiStr = new java.util.Scanner(System.in).nextLine();
			// string->int 入力された文字を数値に変換
			tenki = Integer.parseInt(tenkiStr);
			if (1 <= Integer.parseInt(tenkiStr) && Integer.parseInt(tenkiStr) <= 3) {
				finishFlag = true;
			} else {//
				System.out.println("1から3以外の数値が入力されました\nもう一度入力してください");
			}
		}
		return tenki;
	}

	// 引数の数値によって天気の種類の文字列を返す
	// 例:1なら晴れ
	public static String getTenki(int fig) {
		if (fig == 1) {
			return "晴れ";
		} else if (fig == 2) {
			return "曇り";
		} else if (fig == 3) {
			return "雨";
		} else {// 1から3以外はnull
			return "例外です";
		}
	}

}
