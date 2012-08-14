package gameObjects.Class;

import gameObjects.ArmorType;
import gameObjects.ICharacter;
import gameObjects.WeaponType;



public class Mage extends GameCharacterClass
{
	
	
	public Mage(ICharacter character)
	{
		super(character);
		
		//assign name
		this.className = "Mage";
		this.weaponType = getWeaponType();
		this.armorType = getArmorType();

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
