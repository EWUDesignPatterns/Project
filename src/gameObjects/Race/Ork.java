package gameObjects.Race;

import gameObjects.PlayerCharacter;

public class Ork extends PlayerCharacter
{

	public Ork(String name)
	{
	  this.name = name;
		this.hp = 10;
		this.maxHp = 10;
		this.mp = 3;
		this.maxMp = 3;
		this.baseDamage = 8;

	}
	
	@Override
	public void attack(PlayerCharacter foe) 
	{
		foe.doDamage(this.baseDamage);
		
	}

}
