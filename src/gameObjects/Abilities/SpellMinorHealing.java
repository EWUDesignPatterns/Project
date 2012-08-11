package gameObjects.Abilities;

import gameObjects.ICharacter;
import gameObjects.StatusEffects.DamageOverTime;

import java.util.Random;

public class SpellMinorHealing extends Spell implements IAbility
{

  public SpellMinorHealing(int cost, int damage)
  {
    this.MPCost = cost;
    this.damage = damage;
  }

  @Override
  public void use(ICharacter self, ICharacter other)
  {
    if(self.getMP() >= MPCost)//we can cast
    {
      self.reduceMP(MPCost);
      Random rand = new Random();
      if((rand.nextInt() % 20) < 15)
      {
        System.out.println("Hit!");
        other.heal(damage);

      }
      else
      {
        System.out.println("Miss!");
      }
    }

  }
}
