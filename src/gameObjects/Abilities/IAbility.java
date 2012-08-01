package gameObjects.Abilities;

import gameObjects.PlayerCharacter;

public interface IAbility 
{
	public void use(PlayerCharacter self, PlayerCharacter other);

}
