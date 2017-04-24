
package division1_3;

import java.util.ArrayList;

public class ArrayTest {
	public static void main(String[] args) {
		int[] fig;
		fig = new int[10];
		setRandom(fig);
		//arrayOutPut(fig);
		//BSort(fig);
		//arrayOutPut(fig);

		 ArrayList<Integer> points = new ArrayList<Integer>();

		 for(int i=10;0<i;i-- ){
		 setRandom(points);
		 }
		 DebugOutput.arrayIntOutput(points);
		 selection_sort_List(points,10);
		 DebugOutput.arrayIntOutput(points);

		// TenkiYohou.main(args);
	}

	// 参照渡し...参照元が変化
	//上昇ソート
	public static void BSort(int[] num) {
		for (int i = 0; i < num.length-1; i++) {
			for (int j = num.length - 1; i < j; j--) {

				if (num[i] < num[j]) {
					int a = num[j];
					System.out.println(num[i] + " " + a + "->" + a + " " + num[i]);
					num[j] = num[i];
					num[i] = a;
				}
			}
		}
		System.out.println("");
	}

	// 値渡し...参照元は変化しない
	// コピーを作ってからソート
	public static int[] BSort_value(int[] num) {

		int[] nums = num.clone();// 値渡し

		for (int i = 0; i < nums.length-1; i++) {
			for (int j = nums.length - 1; i < j; j--) {

				if (nums[i] < nums[j]) {
					int a = nums[j];
					System.out.println(nums[i] + " " + a + "->" + a + " " + nums[i]);
					nums[j] = nums[i];
					nums[i] = a;
				}
			}
		}

		// System.out.println("");
		return nums;
	}

	public static void arrayOutPut(int[] num) {
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		System.out.println("");
	}

	public static void setRandom(int[] fig) {

		for (int i = 0; i < fig.length; i++) {
			fig[i] = new java.util.Random().nextInt(100);
		}

	}
	public static void setRandom(ArrayList<Integer> points) {
			 points.add( new java.util.Random().nextInt(100));

	}
//int list配列の上昇バブルソート
	public static void b_sort_List(ArrayList<Integer> points){
		for(int i=0;i<points.size()-1;i++){
			for(int j = points.size()-1;i<j;j--){
				 java.util.Collections.swap(points, i, j);
			}
		}

	}
	// int型listの選択ソート
	public static void selection_sort_List(ArrayList<Integer> points, int n) {
		int i, j;// カウンタ
		int min;// 最小値のインデックス
		for (i = 0; i < n; i++) {
			min = i;
			for (j = i + 1; j < n; j++) {

				if (points.get(j) < points.get(min)) {
					min = j;
				}
				 java.util.Collections.swap(points, min, i);

			}

		}


	}
	// int型listの挿入ソート
	public static void insert_sort_List(ArrayList<Integer> points, int n) {
		int i,j;
		for(i=1;i<n;i++){
			j=i;
			while((j>0)&&(points.get(j)<points.get(j-1))){
				java.util.Collections.swap(points, j, j-1);
				j=j-1;
			}
		}
	}




}
