package gameObjects.Race.playable;

import gameObjects.Character;



public class Human extends Character
{

	public Human(String name)
	{
	  this.name = name;
		this.hp = 8;
		this.maxHp = 8;
		this.mp = 8;
		this.maxMp = 8;
		this.defense = 3;
		this.baseDamage = 5;

	}
	
	
}
