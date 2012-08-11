package gameObjects.items.Potions;

import gameObjects.ICharacter;
import gameObjects.StatusEffects.IStatusEffect;
import gameObjects.StatusEffects.NegativeStatusEffect;
import gameObjects.items.IPotion;
import gameObjects.items.Item;

public class CureAllPotion extends Item implements IPotion 
{

  public CureAllPotion()
  {
    this.name = "Cure All Potion";
    this.description = "Removes all negative status effects";
  }
  @Override
  public void use(ICharacter target)
  {
    for(IStatusEffect e:target.getStatusEffects())
    {
      if(e instanceof NegativeStatusEffect)
      {
        ((NegativeStatusEffect) e).restore();
        target.removeStatusEffect(e);
      }
    }

  }

}
