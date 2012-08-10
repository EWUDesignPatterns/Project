package gameObjects.items.Weapons;

import gameObjects.WeaponType;
import gameObjects.items.IItem;
import gameObjects.items.IWeapon;

public class WoodenSword extends Weapon implements IWeapon, IItem 
{

	@Override
	public WeaponType getWeaponType()
	{
		return WeaponType.BASIC;
	}
}
