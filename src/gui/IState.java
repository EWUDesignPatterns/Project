package gui;

public interface IState 
{
	public boolean gameOver();

	public IState execute();
}
