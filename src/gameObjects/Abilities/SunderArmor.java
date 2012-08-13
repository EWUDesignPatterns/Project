package gameObjects.Abilities;

import gameObjects.ICharacter;

public class SunderArmor extends AbstractAbility implements IAbility
{

  @Override
  public void use(ICharacter self, ICharacter other)
  {
    System.out.println(other.getName() + "'s "+ other.getArmor().getName() + " is broken");
    other.unEquip(other.getArmor());
  }

}
