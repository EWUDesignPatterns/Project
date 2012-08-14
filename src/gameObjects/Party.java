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
			temp += c.toString();
		return temp;
	}
	
	public void attack(Party badGuys)
	{
		for(ICharacter c:players)
			badGuys.doAttack(0, c);
	}
	
	public void doAttack(int index, ICharacter attacker)
	{
		attacker.attack(players.get(index));
		if(players.get(index).getHP() <= 0)
			players.remove(index);
	}

	

}
