package gameObjects.Class;

import gameObjects.ArmorType;
import gameObjects.ICharacter;
import gameObjects.WeaponType;

public class Cleric extends GameCharacterClass 
{
	public Cleric(ICharacter character)
	{
		super(character);
		
		//assign name
		this.className = "Cleric";
	}
	
	
	public int getMaxHP()
	{
		return character.getMaxHP() - 3;
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


  @Override
  public String getName()
  {
    return character.getName();
  }


  @Override
  public String getRace()
  {
    return character.getRace();
  }


  @Override
  public String getClassName()
  {
    return this.className;
  }
}
