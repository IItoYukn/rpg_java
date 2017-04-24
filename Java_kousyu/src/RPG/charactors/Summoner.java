package RPG.charactors;

public class Summoner {
	private String name;
	private int hp;
	private int mp;
	public  void atack(Matango mat){
		mat.setHp(mat.getHp() - 10);

	}
	public  Hero invocation(){
		Hero hero;
		Sword sword= new Sword();
		hero = new Hero("");

		return hero;
	}

}
