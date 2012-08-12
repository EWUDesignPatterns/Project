package gameObjects.Abilities;

import java.util.Random;

import gameObjects.ICharacter;
import gameObjects.StatusEffects.DefenseReduced;

public class Charge extends AbstractAbility implements IAbility
{

  @Override
  public void use(ICharacter self, ICharacter other)
  {   
    Random rand = new Random();
    
    self.attack(other);
      
      
    int bonusDamage = rand.nextInt() % 20;
    other.doDamage(bonusDamage);
    System.out.println("And "+ bonusDamage + " Bonus damage");
    
    if(rand.nextInt() % 10 > 3)
    {
      System.out.println("Enemy is knocked down");
      other.addStatusEffect(new DefenseReduced(other, 1));
    }
    
    self.addStatusEffect(new DefenseReduced(self, 1));
    

  }

}
