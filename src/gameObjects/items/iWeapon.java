package gameObjects.items;

import gameObjects.WeaponType;

public interface iWeapon
{
	
	int getDurability();//or something unique to weapons here
	WeaponType getWeaponType();
}
