package gameObjects.StatusEffects;

import gameObjects.ICharacter;

public class AccuracyBoosted extends PositiveStatusEffect implements
    IStatusEffect
{

  int baseAccuracy;
  
  public AccuracyBoosted(ICharacter target, int effect)
  {
    this.baseAccuracy = target.getAccuracy();
    target.increaseAccuracy(effect);
  }
  
  @Override
  public void applyAffect(ICharacter target)
  {
    if(target.getAccuracy() > baseAccuracy)
      target.decreaseAccuracy(1);
    else
      target.removeStatusEffect(this);
  }

}
