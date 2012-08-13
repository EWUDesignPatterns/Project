package gameObjects.items.Armors;

import gameObjects.ArmorType;
import gameObjects.items.IItem;

public class PlateArmor extends Armor implements IItem
{

  public PlateArmor()
  {
    this.baseEffect = 5;
    this.maxEffect = 20;
    this.name = "Plate Armor";
    this.description = "For when chainmail just won't suffice";
    this.type = ArmorType.HEAVY;
  }
}
