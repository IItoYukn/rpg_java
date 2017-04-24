package multipleclass.execute;

import multipleclass.logic.CalcLogic;

public class Executer {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int value1=100;
		int value2=20;
		//int ans=multipleclass.logic.CalcLogic.add(value1, value2);
		int ans = CalcLogic.add(value1, value2);
        System.out.print(ans);
	}

}
