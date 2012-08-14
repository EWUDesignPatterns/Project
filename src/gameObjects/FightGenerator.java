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
	
	@Override
	public void roomEntered(IRoom room) {
		//if (room.getBadGuy() != null && (rand.nextInt(20) > 10)) {
			this.setChanged();
			this.notifyObservers(room);
		//}
	}
}
