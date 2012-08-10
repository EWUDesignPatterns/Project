package gameObjects.items.Armors;


import gameObjects.ArmorType;
import gameObjects.items.IArmor;
import gameObjects.items.IItem;
import gameObjects.items.Item;

public abstract class Armor extends Item implements IArmor, IItem
{
	protected ArmorType type;
	
  
  public ArmorType getArmorType()
  {
    return this.type;
  }
}
