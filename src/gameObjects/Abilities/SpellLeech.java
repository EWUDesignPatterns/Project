package gameObjects.Abilities;

import java.util.Random;
import gameObjects.ICharacter;

public class SpellLeech extends Spell implements IAbility
{

  public SpellLeech(int cost, int damage)
  {
    this.MPCost = cost;
    this.damage = damage;
    this.name = "Leach";
    this.description = "Steals enemies life and add's it to self";
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
        self.heal(damage);
      }
      else
      {
        System.out.println("Miss!");
      }
    }

  }

}
