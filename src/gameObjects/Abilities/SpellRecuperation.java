package gameObjects.Abilities;

import gameObjects.ICharacter;
import gameObjects.StatusEffects.HealOverTime;

import java.util.Random;

public class SpellRecuperation extends Spell implements IAbility
{
  public SpellRecuperation(int cost, int damage)
  {
    this.MPCost = cost;
    this.damage = damage;
  }
  @Override
  public void use(ICharacter self, ICharacter other)
  {
    if(self.getMP() >= this.MPCost)//have the mana to cast
    {
      self.reduceMP(this.MPCost);//pay the mana
      Random rand = new Random();
      if(rand.nextInt() % 20 < 12)
      {
        System.out.println("Hit");
        other.addStatusEffect(new HealOverTime(damage));//between 1 and 4 dmg per turn
      }
    }
  }
}
