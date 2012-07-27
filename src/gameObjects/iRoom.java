interface iRoom {
  String description;
  Weapon[] weapons;
  Armor[] armor;
  Item[] items;
  
  public abstract Item[] getItems() {
    return items;  
  }
  
  public abstract Weapon[] getWeapons() {
    return weapons;
  }
  
  public abstract Armor[] getArmor() {
    return armor;
  }
  
  public abstract void enter();
  public abstract void exit(); 
}