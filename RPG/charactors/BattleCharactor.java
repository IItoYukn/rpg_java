package RPG.charactors;

public abstract class BattleCharactor extends Charactor {
	private int speed;//早さ
	private boolean avoidance;//回避できたか
	private int damage;//攻撃力
	private int attackNumber;//行動順番
	protected boolean dead;//死んでいるか
	public BattleCharactor(){
		this.dead=false;
	}
	public int getAttackNumber(){
		return attackNumber;
	}
	public void setAttackNumber(int num){
		this.attackNumber=num;
		}
	public void dead() {
		setDead(true);
		System.out.println(this.name+"は死んでしまった");
	}
	public void avoidanceOutput(){
		System.out.println(this.name+"は回避した");
	}
	public int getDamage(){
		return this.damage;
	}
	public  int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void setDead(boolean dead){
		this.dead=dead;

	}
	public boolean isDead(){
		return this.dead;
	}
	public void setAvoidance(boolean avoidance){
		this.avoidance =avoidance;
	}
	public boolean isAvoidance(){
		return this.avoidance;
	}
	public abstract void attack(BattleCharactor charactor) ;
	public abstract void Behavior();

}
