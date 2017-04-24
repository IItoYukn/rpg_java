package RPG.charactors;

public abstract class Charactor {
	protected int hp;
	String name;
	protected int speed;//
	protected int avoidance;// 回避
	protected int damage;
	private int atackNumber;

	public int getAtackNumber(){
		return atackNumber;
	}
	public void setAtackNumber(int num){
		this.atackNumber=num;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public  int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	};

}
