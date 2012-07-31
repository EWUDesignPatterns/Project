package gameObjects.Race;

import gameObjects.PlayerCharacter;


public class Human extends PlayerCharacter
{

	public Human(String name)
	{
	  this.name = name;
		this.hp = 8;
		this.mp = 8;
		this.baseDamage = 5;

	}
	
	@Override
	public void attack(PlayerCharacter foe)
	{
		foe.doDamage(this.baseDamage);

	}
}
