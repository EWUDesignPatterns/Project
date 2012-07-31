abstract class Item {
  String name;
  int value;
  
  public Item(String name, int value) {
    this.name = name;
    this.value = value;
  }
  
  public String toString() {
    return this.name;
  }
    
  public abstract int use();
  
}