import java.util.*;

class Weapon extends Item {
  int min;
  int max;

  Random rand = new Random();
  
  public Weapon(String name, int min, int max, int value) {
    super(name, value);
    this.min = min;
    this.max = max;
  }
  
  public int use() {
    int damage = rand.nextInt(max-min) + min;
    return damage;
  }
  
}