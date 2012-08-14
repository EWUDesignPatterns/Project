package gameObjects;

import gameObjects.Race.enemies.*;
import gameObjects.Class.enemyClasses.*;
import java.util.*;

public class MonsterFactory {

  public static ICharacter generate() {
	 ICharacter monster = null;
	 Random rand = new Random();
	 int monster_race = rand.nextInt(4);
	 int monster_class = rand.nextInt(4);
	 
	 switch (monster_race) {
	 case 1:
		 monster = new Kobold();
		 break;
	 case 2:
		 monster = new Ogre();
		 break;
	 case 3:
		 monster = new Salamander();
		 break;
	 case 4:
		 monster = new Troll();
		 break;	 
	 }
	 
	 switch (monster_class) {
	 case 1: 
		 monster = new Chieftain(monster);
		 break;
	 case 2:
		 monster = new Flaming(monster);
		 break;
	 case 3:
		 monster = new Poison(monster);
		 break;
	 case 4:
		 monster = new WitchDoctor(monster);
		 break;
	 }
	 
	 return monster;
  }
  

}
