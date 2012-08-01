package gameObjects.items;

public interface IItem 
{
	public abstract int getBaseEffect();
	
	public abstract int getMaxEffect();
	
	public abstract int getEffect();
	
	public String getName();

}
