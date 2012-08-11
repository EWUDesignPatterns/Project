package gameObjects.StatusEffects;

import java.util.Random;

import gameObjects.ICharacter;

public class DamageOverTime implements IStatusEffect
{
  int duration;
  int damage;
  
  public DamageOverTime(int dmg)
  {
    Random rand = new Random();
    this.duration = rand.nextInt() % 20;
    this.damage = dmg;
  }
  @Override
  public void applyAffect(ICharacter target) //does 1 damage per turn
  {
    System.out.println(target + " takes " + damage + "Damage");
    if(--duration > 0)
      target.doDamage(damage);  
    else
      target.removeStatusEffect(this);
  }

}
