package gui;

import java.util.Observable;
import java.util.Observer;

public class FightObserver implements Observer
{
	private Game game;
	
	public FightObserver(Game game) 
	{
		this.game = game;
	}
	
	public void update(Observable o, Object args)
	{
		game.setState(new RestState(this.game));
	}
}
