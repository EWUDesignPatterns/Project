package gameObjects.Class;

import gameObjects.ArmorType;
import gameObjects.PlayerCharacter;
import gameObjects.WeaponType;



public class Mage extends GameCharacterClass
{
	
	
	public Mage(PlayerCharacter character)
	{
		//assign character
		this.character = character;
		
	 //assign name
    this.className = "Mage";
		
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
	
	public String ToString()
  {
    return this.className + character.toString();
  }
}
