package gameObjects.Race;

import gameObjects.GameCharacter;
import gameObjects.iPlayerCharacter;


public class Elf extends GameCharacter implements iPlayerCharacter
{

	@Override
	public void attack(GameCharacter foe) 
	{
		foe.doDamage(2);

	}

	@Override
	public void defend() 
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void use() 
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void equip() 
	{
		// TODO Auto-generated method stub

	}

}
