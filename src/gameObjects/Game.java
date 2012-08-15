package gameObjects;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

import dungeons.*;
import gameObjects.*;
import gameObjects.Abilities.*;
import gameObjects.Class.*;
import gameObjects.Race.playable.*;
import gui.GameBeginState;
import gui.IState;

/**
 * This is just a wrapper class for holding the current
 * party and the dungeon for now. This game object is meant to be implement
 * currently with the console based java
 * 
 * @author Michael Williams
 */
public class Game
{
	protected Party party;
	
	protected IDungeon dungeon;

	protected Random rand = new Random();
	
	protected FightGenerator fightGenerator;
	
	/**
	 * Current state of the game
	 */
	private IState state;
	
	public Game() throws FileNotFoundException, Exception
	{
		this.fightGenerator = new FightGenerator();
		
		this.dungeon = new FileLoaderDungeon("Lamorte.map", this.fightGenerator);
	}
	
	public boolean moveNorth()
	{
		return dungeon.moveNorth(party);
	}

	public boolean moveEast()
	{
		return dungeon.moveEast(party);
	}
	
	public boolean moveSouth()
	{
		return dungeon.moveSouth(party);
	}
	
	public boolean moveWest()
	{
		return dungeon.moveWest(party);
	}
	
	public Party getCurrentBadGuys()
	{
		return this.dungeon.getCurrentRoom().getBadGuys();
	}
	
	public void setParty(Party party)
	{
		this.party = party;
	}
	
	public Party getParty()
	{
		return this.party;
	}
	
	public IState getState()
	{
		return state;
	}
	
	public void setState(IState state)
	{
		this.state = state;
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
		if (rand.nextInt(20) > 10) {
			return true;
		}
		
		return false;
	}
	
	public void attack()
	{
		IRoom room = this.dungeon.getCurrentRoom();
		
		Party badGuys = room.getBadGuys();
		
		party.attack(badGuys);
		badGuys.attack(party);
	}
}
