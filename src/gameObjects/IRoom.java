package gameObjects;

import java.util.Observer;

import gameObjects.items.*;
import gameObjects.*;


public interface IRoom
{  
	public IItem[] getItems();
  
	public ICharacter[] getBadGuys();
	
	public void enter(Party party);
  
	public void exit(Party party); 
}