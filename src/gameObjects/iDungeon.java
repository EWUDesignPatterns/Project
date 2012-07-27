package gameObjects;

interface iDungeon {
    
  public abstract Boolean north();
  public abstract Boolean south();
  public abstract Boolean east();
  public abstract Boolean west();
  
  public abstract String getDescription();
  
  public String getRoomDescription();  
  public IMonster[] getMonsters();
  public IItem[] getItems();
  
}