package gui;

import java.io.FileNotFoundException;

public class DungeonsAndDragonsGame 
{
	public static void main(String[] args) throws Exception
	{
		System.out.println("Welcome to Dungeons and Dragons 21st Century Command Line Style");

		Game game = null;
		try {
			game = new Game();
		} catch (FileNotFoundException e) {
			System.err.println("Unable to load map file");
		}
		
		IState state = game.getState();
		
		do {
		
			state = state.execute();
		
		} while (!state.gameOver());
		
		System.exit(0);
	}
}
