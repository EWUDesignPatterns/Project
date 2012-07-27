package gameObjects;

public interface IItem {
	
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
