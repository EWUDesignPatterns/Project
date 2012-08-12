package gameObjects.Race.enemies;

import gameObjects.Character;
import gameObjects.ICharacter;

public abstract class NonPlayerCharacter extends Character implements ICharacter
{
  public String toString()
  {
    String temp = "________________\n";
    temp += "| " + this.getClassName() + " "+ this.getRace() + "|\t";
    temp += "-----------------\n";
    return temp;
  }
}
