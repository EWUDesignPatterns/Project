package gameObjects.Class;

import gameObjects.ArmorType;
import gameObjects.ICharacter;
import gameObjects.WeaponType;

public class Berserker extends GameCharacterClass 
{
	
	public Berserker(ICharacter character)
	{	
		super(character);
		
		//assign name
		this.className = "Berserker";
		
	}
	
	
	public int getMaxHP()
	{
		return character.getMaxHP() + 5;
	}
	
	public int getHP()
	{
		return character.getHP();
	}
	
	public int getMaxMP()
	{
		return 0;
	}
	
	public int getMP()
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
