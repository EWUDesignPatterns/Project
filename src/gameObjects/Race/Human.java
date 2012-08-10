package gameObjects.Race;

import gameObjects.PlayerCharacter;


public class Human extends PlayerCharacter
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
	
	@Override
	public void attack(PlayerCharacter foe)
	{
		foe.doDamage(this.baseDamage);

	}
}
