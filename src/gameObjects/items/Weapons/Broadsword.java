package gameObjects.items.Weapons;

import gameObjects.WeaponType;
import gameObjects.items.IWeapon;

public class Broadsword extends Weapon implements IWeapon
{

  public Broadsword()
  {
    this.baseEffect = 3;
    this.maxEffect = 12;
    this.name = "Broadsword";
    this.description = "A large sword with unpredictable effects";
  }
  @Override
  public WeaponType getWeaponType()
  {
    return WeaponType.HEAVY;
  }

}
