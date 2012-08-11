package gameObjects.Abilities;

import java.util.Random;

import gameObjects.ICharacter;
import gameObjects.StatusEffects.DamageOverTime;
import gameObjects.StatusEffects.DefenseReduced;

public class SpellAcidRain extends Spell implements IAbility
{

  public SpellAcidRain(int cost)
  {
    this.MPCost = cost;
    this.damage = 0;
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
        other.addStatusEffect(new DamageOverTime((rand.nextInt() %4)+1));//between 1 and 4 dmg per turn
        other.addStatusEffect(new DefenseReduced(other, (rand.nextInt() % 10)+1));
      }
    }
  }

}
