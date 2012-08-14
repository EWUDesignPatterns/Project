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
	public boolean moveNorth(Party party);

	/**
	 * 
	 * @return True on successful move, false on failure
	 */
	public boolean moveSouth(Party party);

	/**
	 * 
	 * @return True on successful move, false on failure
	 */
	public boolean moveEast(Party party);

	/**
	 * 
	 * @return True on successful move, false on failure
	 */
	public boolean moveWest(Party party);

	public String toString();
}
