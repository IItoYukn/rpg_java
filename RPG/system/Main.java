package RPG.system;

import java.util.ArrayList;

import RPG.charactors.BattleCharactor;
import RPG.charactors.Enemy;
import RPG.charactors.Hero;
import RPG.charactors.Matango;
import RPG.charactors.Player;
import RPG.charactors.StrongHero;
import RPG.charactors.Wizard;
import RPG.item.Sword;

public class Main {

	public static void main(String[] args) {
		//




		Sword sword=new Sword();
	//	Charactor charactor= new Hero("",100,sword);

//以下
		System.out.print("stronghero");
		StrongHero shero=new StrongHero();







		Hero hero = new Hero("ミナト") ;//勇者のインスタンス化
		//勇者をキャラクタにカテゴライズ
		Player player= hero;
		ArrayList<BattleCharactor> charasList = new ArrayList<BattleCharactor>();
		ArrayList<Hero> herosList = new ArrayList<Hero>();
		ArrayList<Enemy> enemysList=new ArrayList<Enemy>();



//heroとmatangoの生成・リストに追加
		for(int i = 0; i<3;i++){
			Hero h=new Hero("ミナト"+i);
			herosList.add(h);
		}
		for(int i = 0; i<8;i++){
			Matango m=new Matango();
			m.setName("マタンゴ"+i);
			enemysList.add(m);
		}



//charactorlistに追加
		for(int i =0;i<herosList.size();i++){
			BattleCharactor c = null;
			c= herosList.get(i);
			charasList.add(c);
		}
		for(int i =0;i<enemysList.size();i++){
			BattleCharactor c = null;
			c= enemysList.get(i);
			charasList.add(c);
		}
		System.out.println(charasList.size());
		//new BattleSystem().classOutput(charasList);
		charasList=new BattleSystem().b_sort_List(charasList);
		BattleSystem.fight(charasList);
		System.out.println("");
	//	new BattleSystem().classOutput(charasList);




		Matango mat1 = new Matango();//きのこのインスタンス化
//きのこ1を敵にカテゴライズ
		Enemy enemy=mat1;
		Wizard wiz=new Wizard();


//多態性




		wiz.setName("");
		wiz.setHp(50);

		//
		sword.setName("木の枝");
		sword.setDamage(2);

		System.out.println("現在の武器は"+hero.getSword().getName()+"です");
		//
		mat1.setHp(50);
		mat1.setSuffix('A');
		//
		Matango mat2=new Matango();
		mat2.setHp(48);
		mat2.setSuffix('B');
		//
		/*
		hero.sit(5);
		hero.slip();
		hero.sit(25);
		wiz.heal(hero);

		hero.run();

		wiz.heal(hero);

		hero.run();

		//
		mat1.run();
		mat2.run();
*/











	}

}
