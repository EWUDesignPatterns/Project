package gameObjects;

interface IRoom {  
  
  public abstract Item[] getItems();
  public abstract Weapon[] getWeapons();
  public abstract Armor[] getArmor();
  
  public abstract void enter();
  public abstract void exit(); 
}