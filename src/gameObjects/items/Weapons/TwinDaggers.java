package gameObjects.items.Weapons;

import gameObjects.WeaponType;
import gameObjects.items.IWeapon;

public class TwinDaggers extends Weapon implements IWeapon
{
  public TwinDaggers()
  {
    this.baseEffect = 2;
    this.maxEffect = 5;
    this.name = "Twin Daggers";
    this.description = "Two small daggers";
  }
  @Override
  public WeaponType getWeaponType()
  {
    return WeaponType.LIGHT;
  }

}
