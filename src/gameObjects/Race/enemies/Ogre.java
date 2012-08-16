package gameObjects.Race.enemies;

import gameObjects.ICharacter;
import gameObjects.Abilities.Charge;

public class Ogre extends NonPlayerCharacter implements ICharacter
{

  public Ogre()
  {
    super();
    this.race = "Ogre";
    this.hp = 12;
    this.maxHp = 12;
    this.mp = 0;
    this.maxMp = 0;
    this.defense = 4;
    this.accuracy = 3;
    this.baseDamage = 10;
    this.armorType = armorType.HEAVY;
    this.weaponType = weaponType.HEAVY;
    this.abilities[0] = new Charge();
  }
  
}
