package gameObjects.Race.playable;

import gameObjects.Character;

public class Elf extends Character implements IPlayableCharacter
{
  
	public Elf(String name) 
	{
	  super();
		this.name = name;
		this.race = "Elf";
		this.hp = 6;
		this.maxHp = 6;
		this.mp = 12;
		this.maxMp = 12;
		this.accuracy = 15;
		this.defense = 1;
		this.baseDamage = 4;
	}


}
