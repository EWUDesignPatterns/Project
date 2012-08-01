package gameObjects;

import gameObjects.items.IItem;

interface iRoom {  
  
  public abstract IItem[] getItems();
  
  //we can decide if it's a weapon or armor when the character tries to equip it
  //public abstract Weapon[] getWeapons();
  //public abstract Armor[] getArmor();
  
  public abstract void enter();
  public abstract void exit(); 
}