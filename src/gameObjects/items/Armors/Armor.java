package gameObjects.items.Armors;

import gameObjects.ArmorType;
import gameObjects.items.iArmor;
import gameObjects.items.iItem;

public abstract class Armor implements iArmor, iItem
{
	protected ArmorType type;
}
