package gameObjects.Race.enemies;

import gameObjects.ICharacter;
import gameObjects.Abilities.SpellFireBall;

public class Salamander extends NonPlayerCharacter implements ICharacter
{

  public Salamander()
  {
    super();
    this.race = "Salamander";
    this.hp = 10;
    this.maxHp = 10;
    this.mp = 0;
    this.maxMp = 0;
    this.defense = 5;
    this.accuracy = 12;
    this.baseDamage = 0;
    this.armorType = armorType.NONE;
    this.weaponType = weaponType.BASIC;
    this.abilities[0] = new SpellFireBall(0, 3);//powerful free fireball
  }
  
}
