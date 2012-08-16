package gameObjects.Race.playable;

import gameObjects.Character;

public class Human extends Character implements IPlayableCharacter
{

	public Human(String name)
	{
	  super();
	  this.name = name;
	  this.race = "Human";
		this.hp = 8;
		this.maxHp = 8;
		this.mp = 8;
		this.maxMp = 8;
		this.defense = 3;
		this.accuracy = 13;
		this.baseDamage = 5;

	}
	

	
}
