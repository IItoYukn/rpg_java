package RPG.System;

import java.util.ArrayList;

import RPG.charactors.Charactor;
import RPG.charactors.Hero;

 public  class BattleSystem {
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
//list版
	public static ArrayList<Charactor> b_sort_List(ArrayList<Charactor> chs) {
		ArrayList<Charactor> charactors = chs;
		//setAtackNumber(hero);


		for (int i = 0; i < charactors.size() - 1; i++) {
			for (int j =charactors.size() - 1; i < j; j--) {
				if(charactors.get(i).getSpeed()<charactors.get(j).getSpeed()){
				java.util.Collections.swap(charactors, i, j);
				}
			}
		}
		return charactors;
	}
	public static void setAtackNumuber(ArrayList<Charactor> charctors,Charactor cha ){




	}
	public void classOutput(ArrayList<Charactor> charactors){
		for(int i =0;i<charactors.size();i++){
			System.out.println(charactors.get(i).getSpeed());

		}

	}

	public static void battle(){


	}

}
