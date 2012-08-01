package gameObjects.items.Armors;

import gameObjects.ArmorType;
import gameObjects.items.IArmor;
import gameObjects.items.IItem;

public abstract class Armor implements IArmor, IItem
{
	protected ArmorType type;
}
