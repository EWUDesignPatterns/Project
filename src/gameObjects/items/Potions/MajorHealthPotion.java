package gameObjects.items.Potions;

import gameObjects.PlayerCharacter;
import gameObjects.items.IItem;
import gameObjects.items.IPotion;
import gameObjects.items.Item;

public class MajorHealthPotion extends Item implements IItem, IPotion
{

  public MajorHealthPotion()
  {
    this.baseEffect = 15;
    this.maxEffect = 30;
    this.name = "Major Health Potion";
  }
  
  
  @Override
  public void use(PlayerCharacter target)
  {
    target.heal(this.getEffect());
  }

}
