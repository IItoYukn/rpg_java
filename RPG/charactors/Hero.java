package RPG.charactors;

import RPG.item.Sword;

public class Hero extends Player {


	private Sword sword;


	public Hero(String str){


		this.setName(str);

		this.hp=100;
		setSword(new Sword());


		this.setSpeed(new java.util.Random().nextInt(100));
		System.out.println("勇者"+this.name+"が誕生した");

	}
	Hero(){
		this("ダミー");


	}


	public void run() {
		System.out.println(this.name+"は、撤退した");
	};


	void sit(int sec) {
		this.hp+=sec;
		System.out.println(this.name+"は"+sec+"秒座った");
		System.out.println("HPが"+sec+"ポイント回復した");

	};

	void slip() {
		this.hp-=5;
		System.out.println(this.name+"は、転んだ");
		System.out.println("5のダメージ");
	};

	void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は,眠って回復した!");
	}
	void bye(){
		System.out.println("勇者は別れを告げた");

	}

	private void die(){

		super.dead();
		System.out.println("Game Overです。");

	}



	public Sword getSword() {
		return sword;
	}
	public void setSword(Sword sword) {
		this.sword = sword;
	}
	@Override
	public void attack(BattleCharactor charactor) {
		// TODO 自動生成されたメソッド・スタブ
		attack((Enemy)charactor);

	}
	public void attack(Enemy enemy){
		System.out.println(this.name + "の攻撃！");
	    enemy.setHp(enemy.getHp()-sword.getDamage());
	    System.out.print(enemy.getName()+"に");
	    System.out.println("5ポイントのダメージを与えた！");
	}
	@Override
	public void Behavior() {
		// TODO 自動生成されたメソッド・スタブ

		//回避できなかったらアタック

		//回避できたら



	}



}
