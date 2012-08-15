package gameObjects;

import java.util.Observable;
import java.util.Random;

import gameObjects.items.IItem;
import gameObjects.IFightGenerator;
import gameObjects.Race.enemies.*;
import java.util.*;

public class Room implements IRoom
{
	ArrayList <IItem>items = new ArrayList<IItem>();
	

	Party badGuys;
	
	static Random rand = new Random();
	
	private IFightGenerator fightGenerator;
	
	public Room(IFightGenerator fightGenerator)
	{
		int itemCount = rand.nextInt(5) + 1;
		this.badGuys = null;
		
		for (int i = 0; i < itemCount; i++) {
		  items.add(ItemFactory.generate());
		}
				
		this.fightGenerator = fightGenerator;
	}
	
	@Override
	public IItem[] getItems() 
	{
		return (IItem[]) items.toArray(new IItem[items.size()]);
	}
	
	public void addItem(IItem item) {
		items.add(item);
	}

	@Override
	public void enter(Party party) 
	{
		this.generateBadGuys();
		
		this.fightGenerator.roomEntered(this);
	}

	@Override
	public void exit(Party party)
	{
		
	}
	
	private void generateBadGuys()
	{
				
		if (this.badGuys == null && rand.nextInt(4) == 1) {
		  //System.out.println("Ding");
		
		  this.badGuys = new Party();
		
		  for (int i = 0; i < rand.nextInt(3) + 1; i++)
		    badGuys.add(MonsterFactory.generate());
		}
	}


  public Party getBadGuys()
  {
    return badGuys;
  }

}
