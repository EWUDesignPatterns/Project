package gameObjects;

import java.util.Observable;
import java.util.Random;

import gameObjects.items.IItem;
import gameObjects.IFightGenerator;
import gameObjects.Race.enemies.*;

public class Room implements IRoom
{
	IItem[] items;

	ICharacter[] badGuys;
	
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
	public void enter(ICharacter player) 
	{
		//this.generateBadGuys();
		
		this.fightGenerator.roomEntered(this);
	}

	@Override
	public void exit(ICharacter player)
	{
		
	}
	
	private void generateBadGuys()
	{
		this.badGuys = new ICharacter[5];

		for (int i = 0; i < rand.nextInt(); i++) {
			//this.badGuys[i] = new Ogre();
		}
	}

	@Override
	public ICharacter getBadGuy()
	{
		// TODO Auto-generated method stub
		return new Ogre();
	}
}