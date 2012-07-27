abstract class iRoom {
  String description;
  Weapon[] weapons;
  Armor[] armor;
  Item[] items;
  
  public abstract boolean fight();
  public abstract Item[] getItems();
  public abstract Weapon[] getWeapons();
  public abstract Armor[] getArmor();
  
  public abstract void enter();
  public abstract void exit(); 
}