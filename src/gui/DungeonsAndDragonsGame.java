package gui;

import java.io.FileNotFoundException;

public class DungeonsAndDragonsGame 
{
	public static void main(String[] args)
	{
		System.out.println("Welcome to Dungeons and Dragons 21st Century Command Line Style");

		Game game = null;
		try {
			game = new Game();
		} catch (FileNotFoundException e) {
			System.err.println("Unable to load map file");
		} catch (Exception e) {
			System.err.println("Error reading map file: "+e.getMessage());
		}
		
		IState state = game.getState();
		
		do {
		
			state = state.execute();
		
		} while (!state.gameOver());
		
		System.exit(0);
	}
}
