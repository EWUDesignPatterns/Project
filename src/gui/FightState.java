package gui;

public class FightState implements IState 
{
	Game game;
	
	public FightState(Game game)
	{
		this.game = game;
	}
	
	@Override
	public boolean gameOver()
	{
		return false;
	}

	@Override
	public IState execute()
	{
		while (true) {
			System.out.println("Bad guys encountered!");
			
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
					
					// @todo This is not correct logic I don't think 
					// we should move this out to to have an event 
					// for player dying
					if (game.getPlayer().getHP() >= 0) {
						return this;
					} else {
						return new ExitGameState();
					}
			}
		}
	}
	
}
