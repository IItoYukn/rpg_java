package RPG.system;

import java.util.ArrayList;

import RPG.charactors.BattleCharactor;
import RPG.charactors.Hero;

public class BattleSystem {
	// 勇者のintステータス上昇ソート 仮にspeed
	Hero[] sortHero(Hero[] heros) {
		Hero[] hero = heros.clone();
		for (int i = 0; i < hero.length - 1; i++) {
			for (int j = hero.length - 1; i < j; j--) {
				if (hero[i].getSpeed() < hero[j].getSpeed()) {
					Hero h;
					h = hero[j];
					hero[j] = hero[i];
					hero[i] = h;
				}

			}
		}

		return hero;
	}

	//
	public static int setRandom(int max) {

		return new java.util.Random().nextInt(max);
	}

	public static void fight(ArrayList<BattleCharactor> chs) {
		//System.out.println("debug");
	//	System.out.println(chs.get(0).getClass());
		//System.out.println("debug");
		// 早さを乱数で行動順を更新
		setAttackNumuber( chs);
		System.out.println("行動順表示");
		classOutput(chs);



		// 早い順から行動
		for (int i = 0; i < chs.size(); i++) {
			//if (chs.get(i).getClass() != chs.get(getRandomWithoutSelf(i,chs.size())).getClass()) {
			//攻撃対象をランダムに選ぶ
			BattleCharactor bc=null;
			bc = chs.get(getRandomWithoutSelf(i,chs.size()));
			while (chs.get(i).getClass() == bc.getClass()){
				bc = chs.get(getRandomWithoutSelf(i,chs.size()));
			}
			//攻撃
			//
			System.out.println("");
			System.out.println(chs.get(i).getName()+"--->"+bc.getName());
			System.out.println("");
			chs.get(i).attack(bc);
			// 回避できたか
			int random = setRandom(100);
			resultAvoidance(chs.get(i),bc,random);

			//回避できていたらダメージなし
			//出来なかったらダメージ

		}



		// attack

	}
	public static void resultAvoidance(BattleCharactor c1,BattleCharactor c2,int random){

	}

	public static int getRandomWithoutSelf(int self, int max) {
		int ans = self;
		// 自分と違う数値になるまで繰り返し
		while (ans == self) {
			ans = setRandom(max);
		}
		return ans;
	}

	public void attack() {

	}

	// list版
	public static ArrayList<BattleCharactor> b_sort_List(ArrayList<BattleCharactor> chs) {
		ArrayList<BattleCharactor> charactors = chs;
		// setattackNumber(hero);

		for (int i = 0; i < charactors.size() - 1; i++) {
			for (int j = charactors.size() - 1; i < j; j--) {
				if (charactors.get(i).getSpeed() < charactors.get(j).getSpeed()) {
					java.util.Collections.swap(charactors, i, j);
				}
			}
		}
		return charactors;
	}

	public static void setAttackNumuber(ArrayList<BattleCharactor> chs) {
		for (BattleCharactor c : chs) {
			c.setSpeed(setRandom(100));
		}
		chs = b_sort_List(chs);
	}

	public static void classOutput(ArrayList<BattleCharactor> charactors) {
		for (int i = 0; i < charactors.size(); i++) {
			System.out.print((i+1)+"番  ");
			System.out.println(charactors.get(i).getName());

		}

	}

	public static void battle() {

	}

}
