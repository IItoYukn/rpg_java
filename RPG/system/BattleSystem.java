package RPG.system;

import java.util.ArrayList;
import java.util.Date;

import RPG.charactors.BattleCharactor;
import RPG.charactors.Hero;

public class BattleSystem {
	private boolean finish = false;

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

	public void fight(ArrayList<BattleCharactor> chs) {

		while (!this.finish) {
			// 早さを乱数で行動順を更新
			setAttackNumuber(chs);
			System.out.println("行動順表示");
			classOutput(chs);

			// 早い順から行動
			for (int i = 0; i < chs.size(); i++) {
				// 攻撃対象をランダムに選ぶ
				BattleCharactor bc = null;
				bc = chs.get(getRandomWithoutSelf(i, chs.size()));
				while (chs.get(i).getClass() == bc.getClass() && 0 < bc.getHp()) {
					// 対象を選ぶ
					bc = chs.get(getRandomWithoutSelf(i, chs.size()));
				}
				System.out.println("");
				System.out.println(chs.get(i).getName() + "は" + bc.getName() + "に狙いを定めた");
				System.out.println("");
				// 回避できたか
				int random = setRandom(30);

				resultAvoidance(chs.get(i), bc, random);
			}
			//
			removeArrayCharactor(chs);
			fightFinish(chs);
			setFinish(true);

		}
		battleFinish();

		// attack

	}

	// bc 攻撃相手
	public static void resultAvoidance(BattleCharactor c1, BattleCharactor c2, int random) {
		if (random < 10) {
			c1.setAvoidance(true);

		} else {
			c1.setAvoidance(false);
		}
		// 回避成功
		if (c1.isAvoidance()) {
			// 攻撃失敗処理
			System.out.println(c2.getName() + "は回避した");

		} else {// 失敗で攻撃
			c1.attack(c2);
		}

	}

	public int getRandomWithoutSelf(int self, int max) {
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
			System.out.print((i + 1) + "番  ");
			// waitTime(300);
			System.out.println(charactors.get(i).getName());

		}

	}

	public void battleFinish() {
		System.out.println("戦闘終了");

	}

	public static void waitTime(int time) {
		Date now = new Date();

		System.out.println(now);
		int counter = 0;
		while (counter < time) {
			counter++;
		}
	}
	public void removeArrayCharactor(ArrayList<BattleCharactor> charactors) {
		for(int i = 0; i<charactors.size();i++){
			if(charactors.get(i).getHp()<0){
				charactors.remove(i);
			}
		}
		//charactors.remove(3);
		System.out.println("残り"+charactors.size());

	}

	public void fightFinish(ArrayList<BattleCharactor> charactors) {
		// キャラクタが一人になるまでループ]
		if(charactors.size()==1){
			setFinish(true);
		}

	}

	public void setFinish(boolean finish) {
		this.finish = finish;
	}

	// 成功判定
	public static boolean calcCrear(int num, int border) {
		if (num < border) {
			return true;
		} else {
			return false;
		}
	}

	// 処理時間計算メソッド
	public static void calcTime() {
		long start = System.currentTimeMillis();
		//

		//
		long end = System.currentTimeMillis();
		System.out.println("処理にかかった時間は" + (end - start) + "ミリ秒でした");

	}

}
