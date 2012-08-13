package gameObjects.Abilities;

import java.util.Random;

import gameObjects.ICharacter;
import gameObjects.StatusEffects.DamageOverTime;

public class SpellFireBall extends Spell implements IAbility
{
  
  
  public SpellFireBall(int cost, int damage)
  {
    this.MPCost = cost;
    this.damage = damage;
    this.name = "Fire Ball";
    this.description = "A Giant Ball of Fire with a chance to set enemies afire";

  }
  
  @Override
  public void use(ICharacter self, ICharacter other)
  {
    if(self.getMP() >= MPCost)//we can cast
    {
      self.decreaseMP(MPCost);
      Random rand = new Random();
      if((rand.nextInt() % 20)+1 < self.getAccuracy())
      {
        System.out.println("Hit!");
        other.doDamage(damage);
        if(rand.nextInt() % 3 < 2)
        {
          other.addStatusEffect(new DamageOverTime((rand.nextInt() % 3)+1));//does between 1 and 3 damage per turn
          System.out.println("Target is on fire!");
        }
        
      }
      else
      {
        System.out.println("Miss!");
      }
    }

  }

}
