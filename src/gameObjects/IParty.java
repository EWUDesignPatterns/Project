package gameObjects;

import java.util.ArrayList;

interface IParty extends Iterable<ICharacter>
{
	public ArrayList<ICharacter> getCharacters();
	
	public void add(ICharacter character);
	
	public void remove(ICharacter character);
	
	public String toString();
	
	public void attack(Party badguys);
	
	public void doAttack(int index, ICharacter attacker);
}
