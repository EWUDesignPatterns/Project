package gameObjects.Abilities;

import gameObjects.ICharacter;

public class SunderWeapon extends AbstractAbility implements IAbility
{

  @Override
  public void use(ICharacter self, ICharacter other)
  {
    System.out.println(other.getName() + "'s "+ other.getWeapon().getName() + " is broken");
    other.unEquip(other.getWeapon());
  }

}
