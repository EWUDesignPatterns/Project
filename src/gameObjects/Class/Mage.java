package gameObjects.Class;

import gameObjects.GameCharacter;



public class Mage extends GameCharacterClass
{
	
	
	public Mage(GameCharacter character)
	{
		//assign character
		this.character = character;
		
		//update the characters hp and mp
		this.hp = getMaxHP();
		this.mp = getMaxMP();
		
	}
	
	
	public int getMaxHP()
	{
		return character.getMaxHP() - 5;
	}
	
	public int getMaxMP()
	{
		return character.getMaxMP() + 8;
	}
	
	public int getArmorType()
	{
		return 0;
	}
	
	public int getWeaponType()
	{
		return 1;
	}
}
