package gui;

import gameObjects.Game;
import gameObjects.Race.playable.Elf;
import gameObjects.Race.playable.Human;
import gameObjects.Race.playable.Orc;

public class MoveCharacterState implements IState
{
	private DungeonsAndDragonsGame game;
	
	public MoveCharacterState(DungeonsAndDragonsGame game)
	{
		this.game = game;
	}
	
	@Override
	public boolean gameOver() {
		return false;
	}

	@Override
	public IState execute() {
		
		System.out.println("Please select a direction: ");
		System.out.println("1. North");
		System.out.println("2. East");
		System.out.println("3. South");
		System.out.println("4. West");
		System.out.println("5. Back to main menu");
		System.out.print(": ");
		int choice = game.nextInt();

		switch (choice) {
			case 1:
				if (!game.moveNorth()) {
					System.out.println("Unable to move North");
				}
			break;
				
			case 2:
				if (!game.moveEast()) {
					System.out.println("Unable to move East");
				}
			break;
			
			case 3:
				if (!game.moveSouth()) {
					System.out.println("Unable to move South");
				}
			break;
			
			case 4:
				if (!game.moveWest()) {
					System.out.println("Unable to move West");
				}
			break;
			
			case 5:
				return new HomeScreenState(game);
		}
		
		if (game.mapOver()) {
			return new GameWonState();
		}
		
		return game.getState();
	}
}
