package gui;

public class ExitGameState implements IState
{
	/**
	 * This method gets called and returns true but nothing is displayed
	 * on the screen... Will need to need to think about how to handle printing
	 * a goodbye message or something possibly
	 */
	@Override
	public boolean gameOver() {
		return true;
	}

	/**
	 * Never gets called
	 */
	@Override
	public IState execute() {
		return null;
	}
}
