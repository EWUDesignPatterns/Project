package gameObjects.Race.enemies;

import gameObjects.ICharacter;
import gameObjects.Abilities.RapidAttack;

public class Kobold extends NonPlayerCharacter implements ICharacter
{
  public Kobold()
  {
    super();
    this.race = "Kobold";
    this.hp = 2;
    this.mp = 0;
    this.defense = 2;
    this.accuracy = 20;
    this.baseDamage = 5;
    this.armorType = armorType.NONE;
    this.weaponType = weaponType.BASIC;
    this.abilities[0] = new RapidAttack();
  }

  @Override
  public String getName()
  {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String getRace()
  {
    // TODO Auto-generated method stub
    return this.race;
  }

  @Override
  public String getClassName()
  {
    // TODO Auto-generated method stub
    return null;
  }

}
