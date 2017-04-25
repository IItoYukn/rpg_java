package RPG.charactors;

public abstract class Enemy extends BattleCharactor {

	public  void attack(Player player){
		player.setHp(player.getHp()-this.getDamage());
		System.out.print(player.getName()+"	に対して");
		System.out.println(this.name+"の攻撃");

	} ;
	public void dead(){
		super.dead();
	}



}
