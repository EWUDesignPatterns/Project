package gameObjects;

import java.util.ArrayList;
import java.util.Iterator;

public class Party implements IParty 
{
	ArrayList<ICharacter> players;

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
	public ICharacter[] getPlayers()
	{
		return (ICharacter[])players.toArray();
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

	

}
