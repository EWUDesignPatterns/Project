package gameObjects;

import gameObjects.items.*;
import gameObjects.*;

public interface IRoom {  
  
  public IItem[] getItems();
  
  //we can decide if it's a weapon or armor when the character tries to equip it
  //public abstract Weapon[] getWeapons();
  //public abstract Armor[] getArmor();
  
  public void enter(ICharacter player);
  
  public void exit(ICharacter player); 
}