package gameObjects;

public interface iItem 
{
	
	/**
	 * 
	 * @return string
	 */
	public String getDesc();
	
	/**
	 * Gets the value of the item if you were to sell
	 * this item to the shop
	 * 
	 * @return int
	 */
	public int value();
}
