package gameObjects.Class.enemyClasses;

import java.util.Random;

import gameObjects.ICharacter;
import gameObjects.Class.GameCharacterClass;
import gameObjects.StatusEffects.DamageOverTime;

public class Poison extends GameCharacterClass implements ICharacter
{
  public Poison(ICharacter character)
  {
	  super(character);
    
    //assign name
    this.className = "(Poison)";

    
  }
  
  @Override
  public void attack(ICharacter opponent)
  { 
      Random rand = new Random();
      if (rand.nextInt(20) + 1 < this.accuracy) //higher accuracy is better
      {
        //don't need to know about damage unless we hit
        int damage = this.baseDamage;
        damage += weapon.getEffect();
        opponent.doDamage(damage);
        opponent.addStatusEffect(new DamageOverTime(2));
        System.out.println(this.name + " hits with " + weapon.toString() + " for " + damage + " damage!" );
        System.out.println(opponent.getName() + "is Poisoned");
      } 
      else 
      {
        System.out.println(this.name + " misses!");
      }
  }
 

}
