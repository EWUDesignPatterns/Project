package gameObjects.Class.enemyClasses;

import java.util.Random;

import gameObjects.ICharacter;
import gameObjects.Class.GameCharacterClass;
import gameObjects.StatusEffects.DamageOverTime;

public class Flaming extends GameCharacterClass implements ICharacter
{
  public Flaming(ICharacter character)
  {
	  super(character); 
	  //assign name
	  this.className = "(Flaming)";
    
    
  }
  
  @Override
  public void attack(ICharacter opponent)
  { 
	  super.attack(opponent);
      Random rand = new Random();
      if(rand.nextInt() % 10 < 6)
      {
        opponent.addStatusEffect(new DamageOverTime(2));
        System.out.println(opponent.getName() + " is On Fire");
      }
      
  }
}
