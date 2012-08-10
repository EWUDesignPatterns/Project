package gameObjects.items.Potions;

import gameObjects.PlayerCharacter;
import gameObjects.StatusEffects.DefenseBoosted;
import gameObjects.items.IItem;
import gameObjects.items.IPotion;
import gameObjects.items.Item;

public class MinorDefensePotion extends Item implements IItem, IPotion
{

  public MinorDefensePotion()
  {
    this.baseEffect = 0;
    this.maxEffect = 2;
    this.name = "Minor Defense Potion";
  }
  @Override
  public void use(PlayerCharacter target)
  {
    target.addStatusEffect(new DefenseBoosted(target, this.getEffect()));
  }

}
