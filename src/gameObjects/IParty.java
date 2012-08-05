package gameObjects;

interface IParty extends Iterable<ICharacter>
{
	public ICharacter[] getPlayers();
}
