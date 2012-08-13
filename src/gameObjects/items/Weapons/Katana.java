package gameObjects.items.Weapons;

import gameObjects.WeaponType;
import gameObjects.items.IWeapon;

public class Katana extends Weapon implements IWeapon
{

  public Katana()
  {
    this.baseEffect = 5;
    this.maxEffect = 8;
    this.name = "Katana";
    this.description = "A strange weapon from the far east";
  }
  @Override
  public WeaponType getWeaponType()
  {
    return WeaponType.LIGHT;
  }

}
