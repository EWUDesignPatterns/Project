package gameObjects;

import java.util.Observable;
import java.util.Random;

import gameObjects.items.IItem;
import gameObjects.IFightGenerator;
import gameObjects.Race.enemies.*;

public class Room implements IRoom
{
	IItem[] items;

	Party badGuys;
	
	static Random rand = new Random();
	
	private IFightGenerator fightGenerator;
	
	public Room(IFightGenerator fightGenerator)
	{
		// @todo initialize items
		this.items = new IItem[5];
		this.fightGenerator = fightGenerator;
		
		this.generateBadGuys();
	}
	
	@Override
	public IItem[] getItems() 
	{
		return this.items;
	}

	@Override
	public void enter(Party party) 
	{
		//this.generateBadGuys();
		
		this.fightGenerator.roomEntered(this);
	}

	@Override
	public void exit(Party party)
	{
		
	}
	
	private void generateBadGuys()
	{
		// @todo Determine randomly if bad guys should be
		// generated
		this.badGuys = new Party();

	}


  public Party getBadGuys()
  {
    return badGuys;
  }

}
