package gameObjects.StatusEffects;

import gameObjects.ICharacter;

public class DefenseBoosted implements IStatusEffect
{
  int baseDefense;
  
  public DefenseBoosted(ICharacter target, int effect)
  {
    this.baseDefense = target.getDefense();
    target.changeDefense(effect);
  }
  
  @Override
  public void applyAffect(ICharacter target)
  {
    if(target.getDefense() > baseDefense)
      target.changeDefense(-1);
  }

}
