package gameObjects.Abilities;

import gameObjects.ICharacter;
import gameObjects.StatusEffects.AccuracyReduced;

public class SmokeBomb extends AbstractAbility implements IAbility
{

  @Override
  public void use(ICharacter self, ICharacter other)
  {
    other.addStatusEffect(new AccuracyReduced(other, 2));
    self.addStatusEffect(new AccuracyReduced(self, 1));

  }

}
