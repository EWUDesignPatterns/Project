package gameObjects.Race;

import gameObjects.GameCharacter;
import gameObjects.iPlayerCharacter;


public class Human extends GameCharacter implements iPlayerCharacter 
{

	public Human(String name)
	{
	  this.name = name;
		this.hp = 8;
		this.mp = 8;
		this.baseDamage = 5;

	}
	
	@Override
	public void attack(GameCharacter foe)
	{
		foe.doDamage(this.baseDamage);

	}

	@Override
	public void defend() {
		// TODO Auto-generated method stub

	}

	@Override
	public void use() {
		// TODO Auto-generated method stub

	}

	@Override
	public void equip() {
		// TODO Auto-generated method stub

	}

}
