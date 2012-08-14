package gameObjects;

interface IParty extends Iterable<ICharacter>
{
	public ICharacter[] getPlayers();
	
	public void add(ICharacter character);
	
	public void remove(ICharacter character);
	
	public String toString();
}
