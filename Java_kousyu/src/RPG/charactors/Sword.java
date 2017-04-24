package RPG.charactors;

public class Sword {
	private String name;
	private int damage;
	 public Sword(){
		this.setDamage(10);
		this.setName("木の枝");

	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
}
