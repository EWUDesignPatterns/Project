package gameObjects.Abilities;

import gameObjects.ICharacter;
import gameObjects.StatusEffects.AccuracyReduced;
import gameObjects.StatusEffects.DefenseBoosted;

public class Berserk extends AbstractAbility implements IAbility
{

  @Override
  public void use(ICharacter self, ICharacter other)
  {
    if(self.getHP() < self.getMaxHP()/2)
    {  
      System.out.println("WAAAARGGHRGARBRGLE");
      self.doDamage(self.getHP()-1); //spend most of your hp
      self.addStatusEffect(new DefenseBoosted(self, 10));
      self.addStatusEffect(new AccuracyReduced(self, 5));
    }
    else
      System.out.println("Alas, your wits are still about you");
  }

}
