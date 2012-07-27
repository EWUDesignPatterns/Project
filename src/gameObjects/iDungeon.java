interface iDungeon {
  
  iRoom[][] rooms;
  int x = 0;
  int y = 0;
  
  public abstract Boolean north();
  public abstract Boolean south();
  public abstract Boolean east();
  public abstract Boolean west();
  
  public abstract String getDescription();
  
  public String getRoomDescription() {
    return rooms[x][y].getDescription();
  }
  
  public iMonster[] getMonsters(){
    return rooms[x][y].getMonsters();
  }
  
  public iItem[] getItems() {
    return rooms[x][y].getItems();
  }
  
}