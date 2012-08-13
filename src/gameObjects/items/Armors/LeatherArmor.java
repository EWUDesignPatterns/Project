package gameObjects.items.Armors;

import gameObjects.ArmorType;
import gameObjects.items.IArmor;

public class LeatherArmor extends Armor implements IArmor
{

  public LeatherArmor()
  {
    this.baseEffect = 1;
    this.maxEffect = 7;
    this.name = "Leather Armor";
    this.description = "For those who wish to play in the rain";
    this.type = ArmorType.MEDIUM;
  }
}
