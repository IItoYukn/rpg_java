package RPG.charactors;

public abstract class Charactor {
	protected int hp;
	String name;

	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	};

}
