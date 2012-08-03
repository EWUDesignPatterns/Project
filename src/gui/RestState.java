package gui;

public class RestState implements IState {

	private Game game;
	
	public RestState(Game game)
	{
		this.game = game;
	}
	
	@Override
	public boolean gameOver() {
		return false;
	}

	@Override
	public IState execute() {
		System.out.println("You are resting for 5 seconds...");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// Thread had a problem, guess we wont be sleeping for too long
		}
		
		System.out.println("You are awake!");
		
		return new HomeScreenState(game);
	}
	
}
