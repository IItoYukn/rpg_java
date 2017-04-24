package division1_3;

public class ColleageCourses {
	public static void main(String[] args) {
		String[][] courses = { { "政治", "法律", "哲学", "憲法", "現代社会" }, { "英語", "ドイツ語", "科学技術", "情報理論", "知的財産" },
				{ "線形代数", "統計学", "人工知能", "オペレーションシステム", "ソフトウェア工学" },
				{ "電子回路", "デジタル信号処理", "電磁気化学", "素粒子物理学", "量子力学" } };
		coursesOutput(courses);
	}

	public static void coursesOutput(String[][] matrix) {
		int count = 1;// 学年
		if (matrix != null) {
			for (int i = 0; i < matrix.length; i++) {
				System.out.print(count + "年" + " ");
				for (int j = 0; j < matrix[i].length; j++) {
					System.out.print(matrix[i][j]);
					if (j != matrix[i].length - 1) {
						System.out.print("、");
					}
				}
				count++;
				System.out.print("\n");
			}
			matrix = null;
		}
	}

}
