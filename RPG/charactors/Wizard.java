package RPG.charactors;


public class Wizard {
	private String name;
	Hero[] heros;
	private int hp;

	public Wizard(){
		heros = new Hero[9];

		heros[0]=new Hero();


	}
	public void heal(Hero hero){


		hero.setHp(hero.getHp()+10);
		System.out.println(heros[0].getName()+"のHPを10回復した"+heros[0].getHp());
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
