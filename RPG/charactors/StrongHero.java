package RPG.charactors;

public class StrongHero extends Hero {

	public StrongHero(){

		super("ダミーじゃないよ");

	}

	public void attack(Enemy enemy){
		super.attack(enemy);
		super.attack(enemy);
	}

}
