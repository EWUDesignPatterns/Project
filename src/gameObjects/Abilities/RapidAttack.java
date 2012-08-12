package gameObjects.Abilities;

import gameObjects.ICharacter;
import gameObjects.StatusEffects.DefenseReduced;

public class RapidAttack extends AbstractAbility implements IAbility
{

  public RapidAttack()
  {
    this.name = "Rapid Attack";
    this.description = "Attacks twice in rapid succession, reducing current defense for 1 turn.";
  }
  @Override
  public void use(ICharacter self, ICharacter other)
  {
    self.attack(other);
    self.attack(other);
    self.addStatusEffect(new DefenseReduced(self, 1));

  }

}
