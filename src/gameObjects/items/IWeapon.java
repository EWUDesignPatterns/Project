package gameObjects.items;

import gameObjects.WeaponType;

public interface IWeapon
{
	
	int getDurability();//or something unique to weapons here
	WeaponType getWeaponType();
}
