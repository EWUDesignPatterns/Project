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
	
	private Hashtable<String, List<Observer>> observers;
	
	public FightGenerator()
	{
		this.observers = new Hashtable<String, List<Observer>>();
	}
	
	@Override
	public void roomEntered(IRoom room) {
		if (room.getBadGuys().length > 0 && (rand.nextInt(20) > 10)) {
			this.notifyObservers("fight", room);
		}
	}

	@Override
	public void roomExited(IRoom room) {
		// TODO Auto-generated method stub
	}
	
	// @todo May be able to make this a little simplier
	public void addObserver(String action, Observer observer)
	{
		if (this.observers.containsKey(action)) {
			this.observers.get(action).add(observer);
		} else {
			List<Observer> list = new ArrayList<Observer>();
			list.add(observer);
			
			this.observers.put(action, list);
		}
	}
	
	public void notifyObservers(String action, Object arg)
	{
		if (this.observers.containsKey(action)) {
			for (Observer o : this.observers.get(action)) {
				o.update(this, arg);
			}
		}
	}
}
