package gameObjects.Abilities;

import gameObjects.ICharacter;

public abstract class Spell implements IAbility
{
  int MPCost;
  int damage;
  
  @Override
  public void use(ICharacter self, ICharacter other)
  {
  }

}
