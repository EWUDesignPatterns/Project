package gameObjects.Class;

import gameObjects.ArmorType;
import gameObjects.GameCharacter;
import gameObjects.WeaponType;



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
	
	public ArmorType getArmorType()
	{
		return ArmorType.LIGHT;
	}
	
	public WeaponType getWeaponType()
	{
		return WeaponType.MAGIC;
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
