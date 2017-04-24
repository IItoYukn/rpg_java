package RPG.System;

import java.util.ArrayList;

import RPG.charactors.Charactor;
import RPG.charactors.Enemy;
import RPG.charactors.Hero;
import RPG.charactors.Matango;
import RPG.charactors.Player;
import RPG.charactors.Sword;
import RPG.charactors.Wizard;

public class Main {

	public static void main(String[] args) {
		//




		Sword sword=new Sword();
	//	Charactor charactor= new Hero("",100,sword);





		Hero hero = new Hero("ミナト") ;//勇者のインスタンス化
		//勇者をキャラクタにカテゴライズ
		Player player= hero;
		ArrayList<Charactor> charasList = new ArrayList<Charactor>();
		ArrayList<Hero> herosList = new ArrayList<Hero>();
		ArrayList<Enemy> enemysList=new ArrayList<Enemy>();



//heroとmatangoの生成・リストに追加
		for(int i = 0; i<3;i++){
			Hero h=new Hero("");
			herosList.add(h);
		}
		for(int i = 0; i<8;i++){
			Matango m=new Matango();
			enemysList.add(m);
		}



//charactorlistに追加
		for(int i =0;i<herosList.size();i++){
			Charactor c = null;
			c= herosList.get(i);
			charasList.add(c);
		}
		for(int i =0;i<enemysList.size();i++){
			Charactor c = null;
			c= enemysList.get(i);
			charasList.add(c);
		}
		System.out.println(charasList.size());
		//new BattleSystem().classOutput(charasList);
		charasList=new BattleSystem().b_sort_List(charasList);
		System.out.println("");
	//	new BattleSystem().classOutput(charasList);




		Matango mat1 = new Matango();//きのこのインスタンス化
//きのこ1を敵にカテゴライズ
		Enemy enemy=mat1;
		Wizard wiz=new Wizard();


//多態性
		hero.atack(enemy);



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
