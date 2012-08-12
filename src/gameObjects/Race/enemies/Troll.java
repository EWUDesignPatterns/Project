package gameObjects.Race.enemies;

import gameObjects.ICharacter;
import gameObjects.Abilities.Charge;

public class Troll extends NonPlayerCharacter implements ICharacter
{

  public Troll()
  {
    super();
    this.race = "Troll";
    this.hp = 8;
    this.maxHp = 8;
    this.mp = 0;
    this.maxMp = 0;
    this.defense = 3;
    this.accuracy = 10;
    this.baseDamage = 5;
    this.armorType = armorType.MEDIUM;
    this.weaponType = weaponType.MEDIUM;
  }

}
