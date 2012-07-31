package gameObjects.Race;

import gameObjects.GameCharacter;




public class Ork extends GameCharacter
{

	public Ork()
	{
		this.hp = 10;
		this.maxHp = 10;
		this.mp = 3;
		this.maxMp = 3;
		this.baseDamage = 8;

	}
	
	@Override
	public void attack(GameCharacter foe) 
	{
		foe.doDamage(this.baseDamage);
		
	}


}
