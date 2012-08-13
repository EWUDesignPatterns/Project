package gameObjects.StatusEffects;

import gameObjects.ICharacter;

public class DefenseBoosted extends PositiveStatusEffect implements IStatusEffect
{
  int baseDefense;
  
  public DefenseBoosted(ICharacter target, int effect)
  {
    this.baseDefense = target.getDefense();
    target.increaseDefense(effect);
  }
  
  @Override
  public void applyAffect(ICharacter target)
  {
    if(target.getDefense() > baseDefense)
      target.decreaseDefense(1);
    else
      target.removeStatusEffect(this);
  }

}
