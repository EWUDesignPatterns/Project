package gui;

import gameObjects.Race.Elf;
import gameObjects.Race.Human;
import gameObjects.Race.Orc;

public class MoveCharacterState implements IState
{
	private Game game;
	
	public MoveCharacterState(Game game)
	{
		this.game = game;
	}
	
	@Override
	public boolean gameOver() {
		return false;
	}

	@Override
	public IState execute() {
		
		String name = game.getInput().next();

		while (true) {
			System.out.println("Please select a direction: ");
			System.out.println("1. North");
			System.out.println("2. East");
			System.out.println("3. South");
			System.out.println("3. West");
			System.out.println("4. Back to main menu");
			System.out.print(": ");
			int choice = game.getInput().nextInt();

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
		}
		
	}

}
