package gameObjects.Class;

import gameObjects.ArmorType;
import gameObjects.ICharacter;
import gameObjects.WeaponType;
import gameObjects.Race.playable.IPlayableCharacter;
import gameObjects.items.Armors.PlateArmor;
import gameObjects.items.Weapons.BastardSword;

public class Berserker extends GameCharacterClass implements IPlayableCharacter
{
	
	public Berserker(ICharacter character)
	{	
		super(character);
		
		//assign name
		this.className = "Berserker";
		
		
		//testing only
		this.equip(new BastardSword());
		this.equip(new PlateArmor());
		
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
		return ArmorType.HEAVY;
	}
	
	public WeaponType getWeaponType()
	{
		return WeaponType.HEAVY;
	}
	
  
}
