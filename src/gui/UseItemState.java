package gui;

import gameObjects.Game;

public class UseItemState implements IState {

	private DungeonsAndDragonsGame game;
	
	public UseItemState(DungeonsAndDragonsGame game)
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
