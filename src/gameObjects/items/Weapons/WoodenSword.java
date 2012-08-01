package gameObjects.items.Weapons;

import gameObjects.WeaponType;
import gameObjects.items.IItem;
import gameObjects.items.IWeapon;

public class WoodenSword extends Weapon implements IWeapon, IItem 
{
	@Override
	public int getBaseEffect() 
	{
		return 1;
	}

	@Override
	public int getMaxEffect() 
	{
		return 1;
	}

	@Override
	public String getName() 
	{
		return "Wooden Sword";
	}

	@Override
	public int getEffect() 
	{
		return 1;
	}

	@Override
	public int getDurability()
	{
		
		return 2;
	}

	@Override
	public WeaponType getWeaponType()
	{
		return WeaponType.BASIC;
	}
}
