package gameObjects.Race;

import gameObjects.GameCharacter;
import gameObjects.iPlayerCharacter;

public class Ork extends GameCharacter implements iPlayerCharacter
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
	public void attack(GameCharacter foe) 
	{
		foe.doDamage(this.baseDamage);
		
	}

	@Override
	public void equip() 
	{
		// TODO Auto-generated method stub

	}
	
	@Override
	public void use() 
	{
		// TODO Auto-generated method stub

	}
	
	@Override
	public void defend() 
	{
		// TODO Auto-generated method stub

	}
}
