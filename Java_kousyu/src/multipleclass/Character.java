package multipleclass;

import RPG.charactors.Matango;

public abstract class Character {
	String name;
	int hp;
	public abstract void attack(Matango matango);
	public void run() {
	    System.out.println("登場人物は逃げ出した！");
	}
}
