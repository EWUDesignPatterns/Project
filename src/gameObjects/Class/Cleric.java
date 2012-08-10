package gameObjects.Class;

import gameObjects.ArmorType;
import gameObjects.ICharacter;
import gameObjects.WeaponType;

public class Cleric extends GameCharacterClass 
{
	public Cleric(ICharacter character)
	{
		//assign character
		this.character = character;
		
		//assign name
    this.className = "Cleric";
		
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
		return character.getMaxMP() + 10;
	}
	
	public ArmorType getArmorType()
	{
		return armorType.LIGHT;
	}
	
	public WeaponType getWeaponType()
	{
		return weaponType.MAGIC;
	}
	

	public String ToString()
  {
    return this.className + character.toString();
  }
}
