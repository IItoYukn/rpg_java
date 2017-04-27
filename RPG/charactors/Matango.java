package RPG.charactors;


public class Matango extends Enemy {
	final int LEVEL=10;
	private char suffix;
	public Matango(){
		this.setHp(30);
		this.setSpeed(new java.util.Random().nextInt(100));
		this.setHp(100);
		this.setName("マタンゴ");
	}
	public void run(){
		System.out.println("おばけキノコ"+getSuffix()+"は逃げ出した");


	}

	public char getSuffix() {
		return suffix;
	}
	public void setSuffix(char suffix) {
		this.suffix = suffix;
	}
	@Override
	public void attack(BattleCharactor charactor) {
		// TODO 自動生成されたメソッド・スタブ
		attack((Player)charactor);
	}
	@Override
	public void Behavior() {
		// TODO 自動生成されたメソッド・スタブ

	}


}
