package gameObjects;

import java.util.Hashtable;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.Random;

public class FightGenerator extends Observable implements IFightGenerator
{
	private static Random rand = new Random();
	
	private IRoom room;
	
	@Override
	public void roomEntered(IRoom room) {
		if (room.getBadGuys() != null && (rand.nextInt(20) > 10)) {
			this.setChanged();			
			this.room = room; // Store room for the observers to pull
			this.notifyObservers("fight_in_room");
			this.room = null; // Not thread safe as it expects this will happen and notify all observers before returning
		}
	}
	
	public IRoom room()
	{
		return room;
	}
}
