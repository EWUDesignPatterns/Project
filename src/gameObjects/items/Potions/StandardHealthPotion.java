package gameObjects.items.Potions;

import gameObjects.ICharacter;
import gameObjects.items.IItem;
import gameObjects.items.IPotion;
import gameObjects.items.Item;

public class StandardHealthPotion extends Item implements IItem, IPotion
{

  public StandardHealthPotion()
  {
    this.baseEffect = 5;
    this.maxEffect = 15;
    this.name = "Standard Health Potion";
  }
  @Override
  public void use(ICharacter target)
  {
    target.heal(this.getEffect());
  }

}
