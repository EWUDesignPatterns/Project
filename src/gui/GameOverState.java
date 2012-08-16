package gui;

public class GameOverState implements IState
{
	@Override
	public boolean gameOver() {
		return true;
	}

	@Override
	public IState execute() {
		System.out.println("You died");
		
		return null;
	}
	
}
