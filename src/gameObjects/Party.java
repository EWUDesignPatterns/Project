package gameObjects;


import java.util.ArrayList;
import java.util.Iterator;

public class Party implements IParty
{
	private ArrayList<ICharacter> players;

	public Party()
	{
		players = new ArrayList<ICharacter>();
	}
	
	@Override
	public Iterator<ICharacter> iterator() 
	{
		return players.iterator();
	}

	@Override
	public ArrayList<ICharacter> getCharacters()
	{
		return this.players;
	}
	
	public void add(ICharacter player)
	{
		players.add(player);
	}
	
	public void remove(ICharacter player)
	{
		players.remove(player);
	}
	
	public String toString()
	{
		String temp = "";
		for(ICharacter c:players)
		{
			temp += c.toString();
		}
		return temp;

	}
	
	public boolean isAlive()
	{

		return players.size() > 0;

	}
	
	public void doAttack(int index, ICharacter attacker)
	{
		attacker.attack(players.get(index));
	}
}
