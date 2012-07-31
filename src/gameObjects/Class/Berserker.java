package gameObjects.Class;

import gameObjects.ArmorType;
import gameObjects.PlayerCharacter;
import gameObjects.WeaponType;

public class Berserker extends GameCharacterClass 
{
	
	public Berserker(PlayerCharacter character)
	{
		//assign character
		this.character = character;
		
		//update the characters hp and mp
		this.hp = getMaxHP();
		this.mp = getMaxMP();
		
	}
	
	
	public int getMaxHP()
	{
		return character.getMaxHP() + 5;
	}
	
	public int getMaxMP()
	{
		return 0;
	}
	
	public ArmorType getArmorType()
	{
		return ArmorType.LIGHT;
	}
	
	public WeaponType getWeaponType()
	{
		return WeaponType.HEAVY;
	}
}
