package gameObjects.Class;

import gameObjects.Character;
import gameObjects.ICharacter;



public abstract class GameCharacterClass extends Character
{
	ICharacter character;	
	
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
}
