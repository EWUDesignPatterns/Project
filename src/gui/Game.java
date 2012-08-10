package gui;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

import dungeons.*;
import gameObjects.*;
import gameObjects.Abilities.*;
import gameObjects.Class.*;
import gameObjects.Race.*;

/**
 * This is just a wrapper class for holding the current
 * party and the dungeon for now
 * 
 * @author Michael Williams
 */
public class Game
{
	private ICharacter player;
	
	private IDungeon dungeon;

	private Random rand = new Random();
	
	private Scanner input = new Scanner(System.in);
	
	/**
	 * Current state of the game
	 */
	private IState state;
	
	public Game() throws FileNotFoundException, Exception
	{
		this.state = new GameBeginState(this);
		this.dungeon = new FileLoaderDungeon("Lamorte.map");
	}
	
	public boolean moveNorth()
	{
		return dungeon.moveNorth(player);
	}

	public boolean moveEast()
	{
		return dungeon.moveEast(player);
	}
	
	public boolean moveSouth()
	{
		return dungeon.moveSouth(player);
	}
	
	public boolean moveWest()
	{
		return dungeon.moveWest(player);
	}
	
	public IRoom getCurrentRoom()
	{
		return dungeon.getCurrentRoom();
	}
	
	public void setPlayer(ICharacter player)
	{
		this.player = player;
	}
	
	public IState getState()
	{
		return state;
	}
	
	public void setState(IState state)
	{
		this.state = state;
	}
	
	public Scanner getInput()
	{
		return input; 
	}
	
	public Random getRandom()
	{
		return rand;
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
}
