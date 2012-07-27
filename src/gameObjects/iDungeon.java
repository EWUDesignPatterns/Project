abstract class iDungeon {
  
  iRoom[][] rooms;
  int x;
  int y;
  
  public abstract Boolean north();
  public abstract Boolean south();
  public abstract Boolean east();
  public abstract Boolean west();
  
  public abstract String      getDescription();
  public abstract Monsters[]  getMonsters();
  public abstract Weapons[]   getWeapons();
  public abstract Armor[]     getArmor();
  public abstract Items[]     getItems();
  
}