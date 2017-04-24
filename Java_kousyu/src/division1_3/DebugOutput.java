package division1_3;

import java.time.Clock;
import java.util.ArrayList;

public class DebugOutput {
	// debug用クラス
	public static void main(String[] args) {

	}

	// int配列の表示
	public static void arrayIntOutput(int[] arrayInt) {
		if (arrayInt != null) {
			for (int i = 0; i < arrayInt.length; i++) {
				System.out.println(arrayInt[i]);
			}
		}
		System.out.println("");
	}
	// int配列の表示
		public static void arrayIntOutput(ArrayList<Integer> points) {
			if (points != null) {
				for(int element : points){
					System.out.print(element+",");
				}
			}
			System.out.println("");
		}

	// 文字列配列を表示
	public static void arrayStrOutput(String[] arrayStrs) {
		if (arrayStrs != null) {
			for (String arrayStr : arrayStrs) {
				System.out.println(arrayStr);
			}
		}
		System.out.println("");
	}

	// 行列の数値を表示
	public static void matrixIntOutput(int[][] matrix) {
		if (matrix != null) {
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[i].length; j++) {
					System.out.print(matrix[i][j]);
				}
				System.out.print("\n");
			}
		}
	}
//3次元配列
	public static void matrix3DIntOutput(int[][][] matrix) {
		if (matrix != null) {
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[i].length; j++) {
					for (int k = 0; k < matrix[i][j].length; k++) {
						System.out.print(matrix[i][j][k]);
					}
					System.out.print("\n");
				}
				System.out.print("\n");
			}
		}
	}
	//処理時間計測メソッド
	public static void timeCounterCalc(){
	Clock.system(null);

	}

}
