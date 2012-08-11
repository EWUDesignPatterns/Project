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
 * party and the dungeon for now. This game object is meant to be implement
 * currently with the console based java
 * 
 * @author Michael Williams
 */
public class Game
{
	private ICharacter player;
	
	private IDungeon dungeon;

	private Random rand = new Random();
	
	private Scanner input = new Scanner(System.in);
	
	private FightGenerator fightGenerator;
	
	/**
	 * Current state of the game
	 */
	private IState state;
	
	public Game() throws FileNotFoundException, Exception
	{
		this.fightGenerator = new FightGenerator();
		this.fightGenerator.addObserver("fight", new FightObserver(this));
		
		this.state = new GameBeginState(this);
		this.dungeon = new FileLoaderDungeon("Lamorte.map", this.fightGenerator);
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
	
	public ICharacter getPlayer()
	{
		return this.player;
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
	
	public FightGenerator getFightGenerator()
	{
		return this.fightGenerator;
	}
	
	public boolean run()
	{
		// @todo Tell everything that needs to know about the
		// player running from the battle
		
		return true;
	}
	
	public void attack()
	{
		IRoom room = this.dungeon.getCurrentRoom();
		
		room.getBadGuys();
		
		//player.attack();
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
