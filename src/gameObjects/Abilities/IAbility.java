package gameObjects.Abilities;

import gameObjects.ICharacter;

public interface IAbility 
{
	public void use(ICharacter self, ICharacter other);

}
