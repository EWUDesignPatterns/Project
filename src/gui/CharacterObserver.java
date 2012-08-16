package gui;

import java.util.Observable;
import java.util.Observer;
import gameObjects.Character;

public class CharacterObserver implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		
		if (!(o instanceof Character)) {
			return;
		}
		
		Character c = (Character) o;
		
		if (arg == "hit") {
			System.out.println(c.getName() + " has been hit");
		} else if (arg == "die") {
			System.out.println(c.getName() + " has died");
		}
	}
	
}
