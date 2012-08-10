package gameObjects.StatusEffects;

import gameObjects.ICharacter;

public class onFire implements IStatusEffect
{

  @Override
  public void applyAffect(ICharacter target) //does 1 damage per turn
  {
    target.doDamage(1);  
  }

}
