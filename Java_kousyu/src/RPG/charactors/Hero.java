package RPG.charactors;

public class Hero extends Player {
	private String name;
	private int hp;

	private int atackNumber;
	private Sword sword;


	public Hero(String str){


		this.setName(str);

		this.hp=100;
		setSword(new Sword());


		this.setSpeed(new java.util.Random().nextInt(100));
		System.out.println("勇者"+this.getName()+"が誕生した");

	}
	Hero(){
		this("ダミー");


	}

	public void atack(Enemy enemy) {
		enemy.setHp(enemy.getHp() - 10);
		System.out.println(this.getName()+"は、攻撃した");
	}

	void run() {
		System.out.println(this.getName()+"は、逃げ出した");
		System.out.println("GAMEOVER");
		System.out.println("最終HPは"+this.hp+"でした");
	};

	void sit(int sec) {
		this.hp+=sec;
		System.out.println(this.getName()+"は"+sec+"秒座った");
		System.out.println("HPが"+sec+"ポイント回復した");

	};

	void slip() {
		this.hp-=5;
		System.out.println(this.getName()+"は、転んだ");
		System.out.println("5のダメージ");
	};

	void sleep() {
		this.hp = 100;
		System.out.println(this.getName() + "は,眠って回復した!");
	}
	void bye(){
		System.out.println("勇者は別れを告げた");

	}

	private void die(){

		System.out.println(this.name+"は死んでしまった");
		System.out.println("Game Overです。");

	}


	public Sword getSword() {
		return sword;
	}
	public void setSword(Sword sword) {
		this.sword = sword;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	};

}
