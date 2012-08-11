package gameObjects.StatusEffects;

import java.util.Random;

import gameObjects.ICharacter;

public class DefenseReduced implements IStatusEffect
{

  int baseDefense;
  int duration;
  
  public DefenseReduced(ICharacter target, int duration)
  {
    this.baseDefense = target.getDefense();
    Random rand = new Random();
    int change = (rand.nextInt() % 4) + 1;
    System.out.println("Targets defense reduced by "+change);
    target.changeDefense(-change);
    this.duration = duration;
  }
  
  @Override
  public void applyAffect(ICharacter target)
  {
    if(--duration <= 0)
      target.removeStatusEffect(this);
  }
}
