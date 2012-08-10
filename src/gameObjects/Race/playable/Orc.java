package gameObjects.Race.playable;

import gameObjects.Character;


public class Orc extends Character
{

	public Orc(String name)
	{
	  this.name = name;
		this.hp = 10;
		this.maxHp = 10;
		this.mp = 3;
		this.maxMp = 3;
		this.defense = 5;
		this.baseDamage = 8;

	}
	
}
