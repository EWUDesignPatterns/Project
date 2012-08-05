package gameObjects;

import java.util.Random;

import gameObjects.items.IItem;;

public class Room implements IRoom 
{
	IItem[] items;

	ICharacter[] badGuys;
	
	static Random rand = new Random();
	  
	public Room()
	{
		this.items = new IItem[5];
	}
	
	@Override
	public IItem[] getItems() 
	{
		return this.items;
	}

	@Override
	public void enter(ICharacter player) 
	{
		this.generateBadGuys();
		
		// @todo Change probability of there being bad guys
		if (this.badGuys.length > 0 && rand.nextInt(20) > 15) {
			this.triggerEncounter();
		}
	}

	@Override
	public void exit(ICharacter player)
	{
		// @todo
	}
	
	private void generateBadGuys()
	{
		// @todo Determine randomly if bad guys should be
		// generated
		this.badGuys = new ICharacter[5];
	}
	
	private void triggerEncounter()
	{
		// @todo
		System.out.println("You got in a battle but this is not implemented yet");
	}
}