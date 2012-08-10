package gameObjects;

import java.util.Observer;

import gameObjects.items.*;
import gameObjects.*;


public interface IRoom
{  
	public IItem[] getItems();
  
	public ICharacter[] getBadGuys();
	
	public void enter(ICharacter player);
  
	public void exit(ICharacter player); 
}