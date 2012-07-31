package gameObjects.Race;

import gameObjects.GameCharacter;
import gameObjects.iPlayerCharacter;


public class Elf extends GameCharacter implements iPlayerCharacter
{
  
  public Elf(String name) {
    this.name = name;
    this.hp = 6;
		this.mp = 12;
		this.baseDamage = 4;
  }

	@Override
	public void attack(GameCharacter foe) 
	{
		foe.doDamage(this.baseDamage);

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
