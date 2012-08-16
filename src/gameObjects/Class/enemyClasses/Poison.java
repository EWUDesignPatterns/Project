package gameObjects.Class.enemyClasses;

import java.util.Random;

import gameObjects.ICharacter;
import gameObjects.Class.GameCharacterClass;
import gameObjects.StatusEffects.DamageOverTime;

public class Poison extends GameCharacterClass implements ICharacter
{
  public Poison(ICharacter character)
  {
	  super(character);
    
	  //assign name
	  this.className = "(Poison)";

    
  }
  
  @Override
  protected void characterDidHit(ICharacter opponent)
  {
	  super.characterDidHit(opponent);
	  
	  opponent.addStatusEffect(new DamageOverTime(2));
  }
}
