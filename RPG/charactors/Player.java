package RPG.charactors;

public abstract class Player extends BattleCharactor {
	protected int money;

	public abstract void attack(Enemy enemy);

	public void run() {
		System.out.println(this.name + "は、逃げ出した");
		System.out.println("GAMEOVER");
		System.out.println("最終HPは" + this.hp + "でした");
	};

	public void dead() {
		super.dead();
	}
}