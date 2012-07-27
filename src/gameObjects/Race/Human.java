package gameObjects.Race;

import gameObjects.GameCharacter;
import gameObjects.iPlayerCharacter;


public class Human extends GameCharacter implements iPlayerCharacter 
{

	public Human()
	{
		this.hp = 8;
		this.mp = 8;
		this.armorType = 2;
		this.weaponSize = 2;
	}
	
	@Override
	public void attack(GameCharacter foe)
	{
		foe.doDamage(4);

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
