package gameObjects.items.Armors;

import gameObjects.ArmorType;
import gameObjects.items.IArmor;

public class LoinCloth extends Armor implements IArmor
{
  public LoinCloth()
  {
    this.baseEffect = 0;
    this.maxEffect = 1;
    this.name = "Loincloth";
    this.description = "ummm, what?";
    this.type = ArmorType.LIGHT;
  }

}