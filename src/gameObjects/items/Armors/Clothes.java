package gameObjects.items.Armors;

import gameObjects.ArmorType;
import gameObjects.items.IArmor;

public class Clothes extends Armor implements IArmor
{
  public Clothes()
  {
    this.baseEffect = 2;
    this.maxEffect = 8;
    this.name = "Clothes";
    this.description = "Armor? What armor?";
    this.type = ArmorType.LIGHT;
  }

}
