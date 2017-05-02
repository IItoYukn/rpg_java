package multipleclass;

import RPG.charactors.Matango;

public class Hero extends Character{
	public Hero(String name){
		this.name=name;

	}
	public Hero(){
		this("ダミー");
	}

	public void attack(Matango matango) {
	    System.out.println(this.name + "はMatangoに10ポイントのダメージを与えた！");
}
	public void run() {
	    System.out.println(this.name + "は逃げ出した！");
}

}
