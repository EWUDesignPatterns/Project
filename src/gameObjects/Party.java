package gameObjects;

import gameObjects.Race.enemies.NonPlayerCharacter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

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
		{
			//badGuys.doAttack(0, c);
			
			//REMOVE THIS LATER
			
			if(!(c instanceof NonPlayerCharacter))
			{		
				System.out.println(c.getName() + "'s Turn");
				System.out.println("Who should "+ c.getName() + " Attack?");
				for(int i = 0; i < badGuys.getCharacters().size(); i++)
				{
					System.out.println((i+1) + ": " + badGuys.getCharacters().get(i));
				}
				Scanner keyboard = new Scanner(System.in);
				int input = keyboard.nextInt();
				input --; //decrement to be in the range of the array
				badGuys.doAttack(input, c);
			}
			else
				badGuys.doAttack(0, c);
		}
	}
	
	public void doAttack(int index, ICharacter attacker)
	{
			attacker.attack(players.get(index));
			//if(players.get(index).getHP() <= 0)
			//	players.remove(index);
	}

	

}
