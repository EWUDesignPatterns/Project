package gameObjects.Class;

import gameObjects.ArmorType;
import gameObjects.ICharacter;
import gameObjects.WeaponType;
import gameObjects.Race.playable.IPlayableCharacter;


public class Theif extends GameCharacterClass implements IPlayableCharacter
{
  
  public Theif(ICharacter character)
  {
	super(character);

    this.className = "Theif";
	this.weaponType = getWeaponType();
	this.armorType = getArmorType();
  }
  
  public int getMaxHP()
  {
    return character.getMaxHP()-3;
  }
  
  public int getMaxMP()
  {
    return character.getMaxMP()-5;
  }
  
  public ArmorType getArmorType()
  {
    return ArmorType.LIGHT;
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
