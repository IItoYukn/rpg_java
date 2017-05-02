package multipleclass;

import RPG.charactors.Matango;

public class Wizard extends Character{
	int mp;

	public Wizard(String name){
		this.name=name;
	}
	public Wizard(){
		this("ダミー");
	}
	public void attack(Matango matango) {
	    System.out.println(this.name + "はMatangoに3ポイントのダメージを与えた！");
}
	public void fireball(Matango matango) {
	    System.out.println(this.name + "はMatangoに20ポイントのダメージを与えた！");
}
	public void run() {
	    System.out.println(this.name + "は逃げ出した！");
}

}
