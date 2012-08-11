package gameObjects.StatusEffects;

import java.util.Random;

import gameObjects.ICharacter;

public class HealOverTime implements IStatusEffect
{
  int duration;
  int damage;
  
  public HealOverTime(int dmg)
  {
    Random rand = new Random();
    this.duration = rand.nextInt() % 20;
    this.damage = dmg;
  }
  @Override
  public void applyAffect(ICharacter target) //does 1 damage per turn
  {
    System.out.println(target + " heals " + damage + "Damage");
    if(--duration > 0)
      target.heal(damage);  
    else
      target.removeStatusEffect(this);
  }

}
