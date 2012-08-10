package gameObjects.items.Potions;

import gameObjects.PlayerCharacter;
import gameObjects.items.IItem;
import gameObjects.items.IPotion;
import gameObjects.items.Item;

public class UltraHealthPotion extends Item implements IItem, IPotion
{

  public UltraHealthPotion()
  {
    this.baseEffect = 30;
    this.maxEffect = 100;
    this.name = "Ultra Health Potion";
  }
  
  
  @Override
  public void use(PlayerCharacter target)
  {
    target.heal(this.getEffect());
  }

}
