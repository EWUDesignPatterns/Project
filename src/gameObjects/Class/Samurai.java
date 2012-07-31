package gameObjects.Class;

import gameObjects.ArmorType;
import gameObjects.GameCharacter;
import gameObjects.WeaponType;

public class Samurai extends GameCharacterClass
{
	public Samurai(GameCharacter character)
	{
		//assign character
		this.character = character;
		
		//update the characters hp and mp
		this.hp = getMaxHP();
		this.mp = getMaxMP();
		
	}
	
	
	public int getMaxHP()
	{
		return character.getMaxHP() + 2;
	}
	
	public int getMaxMP()
	{
		return character.getMaxMP();
	}
	
	public ArmorType getArmorType()
	{
		return ArmorType.HEAVY;
	}
	
	public WeaponType getWeaponType()
	{
		return WeaponType.LIGHT;
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


