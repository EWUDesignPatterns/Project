package gameObjects.Class;

import gameObjects.ArmorType;
import gameObjects.ICharacter;
import gameObjects.WeaponType;


public class Theif extends GameCharacterClass
{
  
  public Theif(ICharacter character)
  {
    this.character = character;

    this.className = "Theif";
    
    this.hp = getMaxHP();
    this.mp = getMaxMP();
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
