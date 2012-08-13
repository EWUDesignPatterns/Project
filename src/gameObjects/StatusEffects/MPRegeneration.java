package gameObjects.StatusEffects;



import gameObjects.ICharacter;

public class MPRegeneration extends PositiveStatusEffect implements IStatusEffect
{

  int duration;
  int amount;
  
  public MPRegeneration(int amount, int duration)
  {
    this.duration = duration;
    this.amount = amount;
  }
  
  
  @Override
  public void applyAffect(ICharacter target) //does 1 damage per turn
  {
    
    if(duration-- > 0)
    {
      if(target.getMP() + amount > target.getMaxMP())
        amount = target.getMaxMP() - target.getMP();
      if(amount > 0)
      {
        target.increaseMP(amount);
        System.out.println(target.getName() + " recovers " + amount + " MP");
      }
    }
    else
      target.removeStatusEffect(this);
  }

}
