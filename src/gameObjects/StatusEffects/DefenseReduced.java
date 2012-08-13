package gameObjects.StatusEffects;

import java.util.Random;

import gameObjects.ICharacter;

public class DefenseReduced extends NegativeStatusEffect implements IStatusEffect
{

  int change;
  int duration;
  
  public DefenseReduced(ICharacter target, int affect)
  {
    Random rand = new Random();
    this.duration = (rand.nextInt() % 4) + 1;
    System.out.println("Targets defense reduced by "+change + "for "+ this.duration +" turns");
    target.decreaseDefense(change);
  }
  
  @Override
  public void applyAffect(ICharacter target)
  {
    if(duration-- <= 0)
      target.removeStatusEffect(this);
  }
  
  public void restore(ICharacter target)
  {
    target.increaseDefense(change);//reset the defense 
  }
}
