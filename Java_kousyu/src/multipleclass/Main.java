package multipleclass;

import java.io.FileWriter;
import java.io.IOException;

import RPG.charactors.Matango;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	Character[] c=new Character[4];
	c[0] = new Wizard("メッシ");
	c[1] = new Wizard("ロナウド");
	c[2] = new Hero("久保");
	c[3] = new Hero("大迫");

	try {
		FileWriter fw = new FileWriter("");
	} catch (IOException e) {
		// TODO 自動生成された catch ブロック
		e.printStackTrace();

	}



	Matango mat = new Matango();

	for(Character cc : c){
			cc.attack(mat);
	}
	}
}
