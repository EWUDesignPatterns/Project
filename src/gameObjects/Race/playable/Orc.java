package gameObjects.Race.playable;

import gameObjects.Character;

public class Orc extends Character implements IPlayableCharacter
{

	public Orc(String name)
	{
	  super();
	  this.name = name;
	  this.race = "Orc";
		this.hp = 10;
		this.maxHp = 10;
		this.mp = 3;
		this.maxMp = 3;
		this.defense = 5;
		this.accuracy = 8;
		this.baseDamage = 8;

	}
	

	
}
