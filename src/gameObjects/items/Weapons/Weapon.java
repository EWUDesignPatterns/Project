package gameObjects.items.Weapons;

import gameObjects.WeaponType;
import gameObjects.items.Item;
import gameObjects.items.IItem;
import gameObjects.items.IWeapon;

public abstract class Weapon extends Item implements IWeapon, IItem
{
	protected WeaponType type;
}
