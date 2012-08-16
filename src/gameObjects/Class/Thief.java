package gameObjects.Class;

import gameObjects.ArmorType;
import gameObjects.ICharacter;
import gameObjects.WeaponType;
import gameObjects.Abilities.RapidAttack;
import gameObjects.Abilities.SmokeBomb;
import gameObjects.Race.playable.IPlayableCharacter;
import gameObjects.items.Armors.LeatherArmor;
import gameObjects.items.Weapons.TwinDaggers;


public class Thief extends GameCharacterClass implements IPlayableCharacter
{
  
  public Thief(ICharacter character)
  {
	super(character);

    this.className = "Thief";
	
    this.equip(new TwinDaggers());
    this.equip(new LeatherArmor());
    
    this.addAbility(new RapidAttack(), 0);
    this.addAbility(new SmokeBomb(), 1);
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
