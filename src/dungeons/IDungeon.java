package dungeons;

import gameObjects.*;

public interface IDungeon
{
	/**
	 * 
	 * @return
	 */
	public boolean isComplete();

	/**
	 * 
	 * @return
	 */
	public boolean isActive();

	/**
	 * 
	 * @return
	 */
	public IRoom getCurrentRoom();
	
	/**
	 * 
	 * @return True on successful move, false on failure
	 */
	public boolean moveNorth();

	/**
	 * 
	 * @return True on successful move, false on failure
	 */
	public boolean moveSouth();

	/**
	 * 
	 * @return True on successful move, false on failure
	 */
	public boolean moveEast();

	/**
	 * 
	 * @return True on successful move, false on failure
	 */
	public boolean moveWest();

	public String toString();
}
