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
	public boolean moveNorth(ICharacter player);

	/**
	 * 
	 * @return True on successful move, false on failure
	 */
	public boolean moveSouth(ICharacter player);

	/**
	 * 
	 * @return True on successful move, false on failure
	 */
	public boolean moveEast(ICharacter player);

	/**
	 * 
	 * @return True on successful move, false on failure
	 */
	public boolean moveWest(ICharacter player);

	public String toString();
}
