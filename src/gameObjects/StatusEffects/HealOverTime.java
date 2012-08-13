package gameObjects.StatusEffects;



import gameObjects.ICharacter;

public class HealOverTime extends PositiveStatusEffect implements IStatusEffect
{
  int duration;
  int amount;
  
  public HealOverTime(int dmg, int duration)
  {
    this.duration = duration;
    this.amount = dmg;
  }
  @Override
  public void applyAffect(ICharacter target) //does 1 damage per turn
  {
    if(duration-- > 0)
    {
      if(target.getHP() + amount > target.getMaxHP())
        amount = target.getMaxHP() - target.getHP();
      if(amount > 0)
      {
        target.heal(amount);
        System.out.println(target.getName() + " heals " + amount + " HP");
      }
    }
    else
      target.removeStatusEffect(this);
  }

}
