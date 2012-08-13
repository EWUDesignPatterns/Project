package gameObjects.items.Weapons;

import gameObjects.WeaponType;
import gameObjects.items.IWeapon;

public class BastardSword extends Weapon implements IWeapon
{

  public BastardSword()
  {
    this.baseEffect = 6;
    this.maxEffect = 12;
    this.name = "Bastard Sword";
    this.description = "A Massive Weapon usable only by the strongest of Warriors";
  }
  @Override
  public WeaponType getWeaponType()
  {
    return WeaponType.HEAVY;
  }
}
