package gui;

public class GameWonState implements IState
{
	@Override
	public boolean gameOver() {
		return false;
	}

	@Override
	public IState execute() {
		System.out.println("You have won the game and got out of the dungeon!");
		
		return new ExitGameState();
	}
}
