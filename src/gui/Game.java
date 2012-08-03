package gui;

import java.io.FileNotFoundException;
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
	private PlayerCharacter player;
	
	private IDungeon dungeon;

	private Random rand = new Random();
	
	private Scanner input = new Scanner(System.in);
	
	/**
	 * Current state of the game
	 */
	private IState state;
	
	public Game() throws FileNotFoundException
	{
		this.state = new GameBeginState(this);
		this.dungeon = new FileLoaderDungeon("Lamorte.map");
	}
	
	public boolean moveNorth()
	{
		return dungeon.moveNorth();
	}

	public boolean moveEast()
	{
		return dungeon.moveEast();
	}
	
	public boolean moveSouth()
	{
		return dungeon.moveSouth();
	}
	
	public boolean moveWest()
	{
		return dungeon.moveWest();
	}
	
	public IRoom getCurrentRoom()
	{
		return dungeon.getCurrentRoom();
	}
	
	public void setPlayer(PlayerCharacter player)
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
}
