package gameObjects.Class;

import gameObjects.Character; // For some reason this has to be imported expclity
import gameObjects.*;



public abstract class GameCharacterClass extends Character
{
	protected ICharacter character;	
	
	public String toString()
	{
	  String temp = "-----------------\n";
    temp += "| " + character.getName();
    if(temp.length()-18 < 10)
      temp += "\t";
    temp += "\t|\n";
    temp += "| " + character.getRace()+ " " + this.className + "\t|\n";
    temp += "| " + "HP: "+ this.getHP() + "/" + this.getMaxHP() + "\t|\n";
    temp += "| " + "MP: "+ this.getMP() + "/" + this.getMaxMP() + "\t|\n";
    temp += "-----------------\n";
    return temp;
	}
	
  @Override
  public String getName()
  {
    return character.getName();
  }


  @Override
  public String getRace()
  {
    return character.getRace();
  }


  @Override
  public String getClassName()
  {
    return this.className;
  }
}
