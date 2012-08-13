package gameObjects.items.Weapons;

import gameObjects.WeaponType;
import gameObjects.StatusEffects.IStatusEffect;
import gameObjects.items.IWeapon;

public abstract class MagicWeapon extends Weapon implements IWeapon
{

  public IStatusEffect status;
  
  @Override
  public WeaponType getWeaponType()
  {
    // TODO Auto-generated method stub
    return WeaponType.MAGIC;
  }

}
