package RPG.charactors;


public class Wizard {
	private String name;
	private int hp;
	void heal(Hero hero){

		hero.setHp(hero.getHp()+10);
		System.out.println(hero.getName()+"のHPを10回復した");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}

}
