package gameObjects;

import gameObjects.Class.*;
import gameObjects.Race.playable.*;

public class PlayerFactory {
  
	public PlayerFactory() {
		
	}
	
	public ICharacter generate(String name, String className, String race) {
	  ICharacter player;
	  
	  if (race.equals("Elf")) 
		player = new Elf(name);
	  else if (race.equals("Human"))
	    player = new Human(name);
	  else if (race.equals("Orc"))
		player = new Orc(name);
	  else
		player = null;
	  
	  if (className.equals("Berserker"))
		player = new Berserker(player);
	  else if (className.equals("Cleric"))
		player = new Cleric(player);
	  else if (className.equals("Mage"))
		player = new Mage(player);
	  else if (className.equals("Samurai"))
		player = new Samurai(player);
	  else if (className.equals("Theif"))
		player = new Theif(player);
	  else
		player = null;
	  
	  return player;
	}
}
