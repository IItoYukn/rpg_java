package RPG.system;

import java.util.ArrayList;

import RPG.charactors.BattleCharactor;
import RPG.charactors.DeathBat;
import RPG.charactors.Enemy;
import RPG.charactors.Goblin;
import RPG.charactors.Hero;
import RPG.charactors.Matango;
import RPG.charactors.Monster;
import RPG.charactors.Player;
import RPG.charactors.Slime;
import RPG.charactors.StrongHero;
import RPG.charactors.Wizard;
import RPG.item.Sword;

public class Main {

	public static void main(String[] args) {
		Monster m1=new Monster();
		m1.run();

	//	wiz.heal();

		Slime s = new Slime();
		DeathBat d = new DeathBat();
		Goblin g = new Goblin();
		Monster[] mons = new Monster[3];
		mons[0] = s;
		mons[1] = d;
		mons[2] = g;



		for (Monster mon : mons) {
			mon.run();

		}
		Sword sword = new Sword();
		// Charactor charactor= new Hero("",100,sword);

		// 以下
		System.out.print("stronghero");
		StrongHero shero = new StrongHero();

		Hero hero = new Hero("ミナト");// 勇者のインスタンス化
		System.out.println(hero);

		// 勇者をキャラクタにカテゴライズ
		Player player = hero;
		ArrayList<BattleCharactor> charasList = new ArrayList<BattleCharactor>();
		ArrayList<Player> playersList = new ArrayList<Player>();
		ArrayList<Enemy> enemysList = new ArrayList<Enemy>();

		// heroとmatangoの生成・リストに追加
		for (int i = 0; i < 3; i++) {
			Player h = new Hero("ミナト" + i);
			;
			playersList.add(h);
		}
		for (int i = 0; i < 8; i++) {
			Matango m = new Matango();
			m.setName("マタンゴ" + i);
			enemysList.add(m);
		}

		// charactorlistに追加
		for (int i = 0; i < playersList.size(); i++) {
			BattleCharactor c = null;
			c = playersList.get(i);
			//System.out.println(c);
			charasList.add(c);
		}
		for (int i = 0; i < enemysList.size(); i++) {
			BattleCharactor c = null;
			c = enemysList.get(i);
		//	System.out.println(c);
			charasList.add(c);
		}

		//
		new BattleSystem().fight(charasList);
		// fight(charasList);
		//

		System.out.println("");
		// new BattleSystem().classOutput(charasList);

		Matango mat1 = new Matango();// きのこのインスタンス化
		// きのこ1を敵にカテゴライズ
		Enemy enemy = mat1;
		Wizard wiz = new Wizard();
		wiz.heal(hero);
		// 多態性

		wiz.setName("");
		wiz.setHp(50);

		//
		sword.setName("木の枝");
		sword.setDamage(2);

		System.out.println("現在の武器は" + hero.getSword().getName() + "です");
		//
		mat1.setHp(50);
		mat1.setSuffix('A');
		//
		Matango mat2 = new Matango();
		mat2.setHp(48);
		mat2.setSuffix('B');

	}

}
