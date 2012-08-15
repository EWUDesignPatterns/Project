package gui;

import gameObjects.Game;
import gameObjects.PlayerFactory;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DungeonsAndDragonsGame extends Game
{	
	protected Scanner input = new Scanner(System.in);
	
	public DungeonsAndDragonsGame() throws FileNotFoundException, Exception 
	{
		super();

		this.fightGenerator.addObserver(new FightState(this));
		
		this.setState(new GameBeginState(this));
	}

	public Scanner getInput()
	{
		return input;
	}
	
	public String nextString(String[] choices)
	{
		System.out.print("[");
		for (int i = 0; i < choices.length - 1; i++) {
	        System.out.print(choices[i] + ", ");
		}
		System.out.print(choices[choices.length - 1] + "]");
		System.out.print(" : ");
		
		String input = this.input.next();
		
		if (Arrays.asList(choices).contains(input)) {
			return input;
		}
		
		System.out.println("Please enter a valid choice");
		
		return nextString(choices);		
	}
	
	/**
	 * Gets the next integer value from the input, this should
	 * be in a sub class of game that is ConsoleGame since
	 * this relates to only a console based game. This method
	 * will catch InputMismatchException and prompt for input again
	 * 
	 * @return int
	 */
	public int nextInt()
	{
		int val;
		while (true) {
			try {
				val = this.input.nextInt();
				
				break;
			} catch (InputMismatchException e) {
				System.out.println("Invalid integer");
				
				// Clear input
				this.input.next();
				
				System.out.print("Enter a number: ");
			}
		}
		
		return val;
	}
	
	public static void main(String[] args) throws Exception
	{
		System.out.println("Welcome to Dungeons and Dragons 21st Century Command Line Style");

		DungeonsAndDragonsGame game = null;
		try {
			game = new DungeonsAndDragonsGame();
		} catch (FileNotFoundException e) {
			System.err.println("Unable to load map file");
		}
		
		IState state = game.getState();
		
		do {
		
			state = state.execute();
			game.setState(state);
			
		} while (!state.gameOver());
		
		System.exit(0);
	}
}
