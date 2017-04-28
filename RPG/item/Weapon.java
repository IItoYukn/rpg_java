package RPG.item;

public abstract class Weapon extends Item{
	protected int damage;

	public Weapon(){
		super("");
	}


	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
}
