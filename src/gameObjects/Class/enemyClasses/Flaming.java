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
  
  
  protected void characterDidHit(ICharacter opponent)
  {
	  super.characterDidHit(opponent);
	  
	  Random rand = new Random();
      if(rand.nextInt() % 10 < 3)
      {
        opponent.addStatusEffect(new DamageOverTime(2));
        System.out.println(opponent.getName() + " is On Fire");
      }
  }
}
