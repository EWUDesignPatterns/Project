package gameObjects.items.Armors;


import gameObjects.ArmorType;
import gameObjects.items.IItem;

public class WizardRobe extends Armor implements IItem
{

  public WizardRobe()
  {
    this.baseEffect = 0;
    this.maxEffect = 1;
    this.name = "Wizarding Robes";
    this.description = "I wear a robe now. Robes are cool";
    this.type = ArmorType.LIGHT;
  }
}
