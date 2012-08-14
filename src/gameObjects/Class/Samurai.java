package gameObjects.Class;

import gameObjects.ArmorType;
import gameObjects.ICharacter;
import gameObjects.WeaponType;

public class Samurai extends GameCharacterClass
{
	public Samurai(ICharacter character)
	{
		super(character);
		//assign name
		this.className = "Samurai";
		
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


