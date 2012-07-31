package gameObjects.items.Weapons;

import gameObjects.WeaponType;
import gameObjects.items.Item;
import gameObjects.items.iItem;
import gameObjects.items.iWeapon;

public abstract class Weapon extends Item implements iWeapon, iItem
{
	protected WeaponType type;
}
