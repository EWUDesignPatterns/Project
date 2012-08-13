package gameObjects.StatusEffects;

import java.util.Random;

import gameObjects.ICharacter;

public class AccuracyReduced extends NegativeStatusEffect implements IStatusEffect
{

  int change;
  int duration;
  
  public AccuracyReduced(ICharacter target, int affect)
  {
    Random rand = new Random();
    this.duration = (rand.nextInt() % 4) + 1;
    System.out.println("Targets Accuracy reduced by "+change + "for "+ this.duration +" turns");
    target.decreaseAccuracy(change);
  }
  
  @Override
  public void applyAffect(ICharacter target)
  {
    if(duration-- <= 0)
      target.removeStatusEffect(this);
  }
  
  public void restore(ICharacter target)
  {
    target.increaseAccuracy(change);//reset the Accuracy 
  }
}