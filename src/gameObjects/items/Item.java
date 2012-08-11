package gameObjects.items;

import java.util.Random;

public abstract class Item implements IItem
{
	protected String name;
	
	protected String description;
	
	protected int baseEffect;
	
	protected int maxEffect;
	
	
  public int getBaseEffect()
  {
    return this.baseEffect;
  }

  public int getMaxEffect()
  {
    return this.maxEffect;
  }


  public int getEffect()
  {
    Random rand = new Random();
    return this.baseEffect + (rand.nextInt() % (this.maxEffect - this.baseEffect));
  }


  public String getName()
  {
    // TODO Auto-generated method stub
    return this.name;
  }
  
  public String getDescription()
  {
    return this.description;
  }
}
