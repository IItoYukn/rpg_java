package RPG.charactors;


public abstract class Player extends Charactor  {
	protected int money;
	public void atack(Enemy enemy){
		enemy.setHp(enemy.getHp() - 10);
		System.out.println(this.getName()+"は、攻撃した");
	}
	public void run() {
		System.out.println(this.name+"は、逃げ出した");
		System.out.println("GAMEOVER");
		System.out.println("最終HPは"+this.hp+"でした");
	};
}
