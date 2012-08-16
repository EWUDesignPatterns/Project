package gui;

import gameObjects.FightGenerator;
import gameObjects.Game;

import java.util.Observable;
import java.util.Observer;

public class FightState implements IState, Observer 
{
	DungeonsAndDragonsGame game;
	
	public FightState(DungeonsAndDragonsGame game)
	{
		this.game = game;
	}
	
	@Override
	public boolean gameOver()
	{
		return false;
	}

	/**
	 * Waits for a fight generator to pass in the fight in room message and then tells the game
	 * to use this instance of fight state as the current state/view to begin the fighting state
	 */
	public void update(Observable ob, Object obj) 
	{
		if ((ob instanceof FightGenerator)) {
			if (obj.equals("fight_in_room")) {
				game.setState(this);
			}
		}
	}

	@Override
	public IState execute()
	{
		while (true) {
			System.out.println("You have encountered :\n" + game.getCurrentBadGuys());
			
			System.out.println("1. Run");
			System.out.println("2. Attack");
			
			int choice = game.nextInt();
	
			switch (choice)
			{
				case 1:
					// @todo This is the principle of asking the game
					// for feedback but good for now until we think
					// about this some more
					if (game.run()) {
						System.out.println("You got away");
						
						return new MoveCharacterState(game);
					} else {
						System.out.println("Sorry, can't run away");
						
						return this;
					}
				
				case 2:
					game.attack();
					
					return this;
			}
		}
	}
	
}
