package gameObjects;

import java.util.Observer;

import gameObjects.Class.*;
import gameObjects.Race.playable.*;

public class PlayerFactory {
  
	public static ICharacter generate(String name, String className, String race, Observer o) {
	  ICharacter player;
	  
	  if (race.equals("elf")) 
		player = new Elf(name);
	  else if (race.equals("human"))
	    player = new Human(name);
	  else if (race.equals("orc"))
		player = new Orc(name);
	  else
		player = null;
	  
	  if (className.equals("berserker"))
		player = new Berserker(player);
	  else if (className.equals("cleric"))
		player = new Cleric(player);
	  else if (className.equals("mage"))
		player = new Mage(player);
	  else if (className.equals("samurai"))
		player = new Samurai(player);
	  else if (className.equals("thief"))
		player = new Thief(player);
	  else
		player = null;
	  
//	  player.addObserver(o);
	  
	  return player;
	}
	
	public static String[] getRaces()
	{
		return new String[] {"elf", "human", "orc"};
	}
	
	public static String[] getClasses()
	{
		return new String[] {"berserker", "cleric", "mage", "samurai", "thief"};
	}
}
