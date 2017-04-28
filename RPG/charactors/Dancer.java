package RPG.charactors;

public class Dancer extends Player{

	@Override
	public void attack(Enemy enemy) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(this.name+"は踊っている");
		//critical
		System.out.println(this.name+"は激しく踊った");

	}

	@Override
	public void attack(BattleCharactor charactor) {
		// TODO 自動生成されたメソッド・スタブ
		attack((Enemy)charactor);

	}

	@Override
	public void Behavior() {
		// TODO 自動生成されたメソッド・スタブ

	}

}
