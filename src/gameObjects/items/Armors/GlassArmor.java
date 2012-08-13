package gameObjects.items.Armors;

import gameObjects.ArmorType;
import gameObjects.items.IArmor;

public class GlassArmor extends Armor implements IArmor
{
  public GlassArmor()
  {
    this.baseEffect = 8;
    this.maxEffect = 10;
    this.name = "Glass Armor";
    this.description = "Yeah, that'll work";
    this.type = ArmorType.HEAVY;
  }

}