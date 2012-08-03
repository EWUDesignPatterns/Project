package gui;

public class UseItemState implements IState {

	private Game game;
	
	public UseItemState(Game game)
	{
		this.game = game;
	}
	
	@Override
	public boolean gameOver() {
		return false;
	}

	@Override
	public IState execute() {
		System.out.println("Not implemented yet until we get room objects");
		
		return new HomeScreenState(game);
	}

}
