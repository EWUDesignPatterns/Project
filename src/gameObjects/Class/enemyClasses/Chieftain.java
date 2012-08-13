package gameObjects.Class.enemyClasses;


import gameObjects.ArmorType;
import gameObjects.ICharacter;
import gameObjects.WeaponType;
import gameObjects.Class.GameCharacterClass;

public class Chieftain extends GameCharacterClass
{
  
  public Chieftain(ICharacter character)
  {
    //assign character
    this.character = character;
    
    //assign name
    this.className = "Chieftain";
    
    //update the characters hp and mp
    this.hp = getMaxHP();
    this.mp = getMaxMP();
    
  }
  
  
  public int getMaxHP()
  {
    return character.getMaxHP() + 10;
  }
  
  public int getMaxMP()
  {
    return character.getMaxMP() + 2;
  }
  
  public int getAccuracy()
  {
    if(character.getAccuracy() - 2 <=0)
      return 1;
    return character.getAccuracy() - 2;
  }
  
  public int getDefense()
  {
    if(character.getDefense() - 5 < 0)
      return 0;
    return character.getDefense() - 5;
  }
  
  public ArmorType getArmorType()
  {
    return ArmorType.HEAVY;
  }
  
  public WeaponType getWeaponType()
  {
    return WeaponType.HEAVY;
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
