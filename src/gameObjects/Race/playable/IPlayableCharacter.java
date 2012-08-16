package gameObjects.Race.playable;

import gameObjects.ICharacter;

/**
 * Interface defining a character that is playable,
 * this is used for any ICharacter classes that 
 * a user player should be allowed to use. It extends
 * ICharacter because then PlayableCharacter can be
 * passed to an object with a definition of methodA(ICharacter)
 * without the need of type-casting
 * 
 * @author Mike
 *
 */
public interface IPlayableCharacter extends ICharacter
{
	// No methods for right now
}
