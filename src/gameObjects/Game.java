package gameObjects;

import java.io.FileNotFoundException;
import java.util.Random;

import dungeons.*;
import gameObjects.*;
import gameObjects.Abilities.*;
import gameObjects.Class.*;
import gameObjects.Race.playable.*;
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
	
	public boolean mapOver()
	{
		return this.dungeon.isComplete();
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
	
	/**
	 * Attacking logic/behavior for when the player playing
	 * the game wants to perform an attack, this method should
	 * delegate work to an attack engine that uses a console attack
	 * engine to delegate attacking logic to user
	 * 
	 * @todo
	 */
	public final void attack()
	{
		Party badGuys = this.getCurrentBadGuys();
		
		// Loop through good guys
		for (ICharacter c : party.getCharacters()) 
		{
			// @todo This is prone to runtime errors since we are casting to
			// something that may not be allowed. We should have a good guy paty implementation
			// of IParty
			if(c.getHP() > 0) //only allow attack if player is "Alive"
				this.playersAttackTurn((IPlayableCharacter) c, badGuys);
		}
		
		
		
		//loop through bad guys and remove dead players
		for (int i = 0; i < badGuys.getCharacters().size(); i ++) 
		{
			if(badGuys.getCharacters().get(i).getHP() <=0)
				badGuys.remove(badGuys.getCharacters().get(i));
		}
		
		// Loop through bad guys and attack good guys
		for (ICharacter c : badGuys.getCharacters()) 
		{
			this.nonPlayableCharacterAttack(c, party);
		}
	}
	
	/**
	 * Hook method for when a playable character needs to perform
	 * an attack on a given party of bad guys
	 * 
	 * Should be part of attack engine 
	 * 
	 * @param player
	 * @param partyToAttack
	 */
	protected void playersAttackTurn(IPlayableCharacter player, IParty partyToAttack)
	{
		// by default attack the first player in the party
		partyToAttack.doAttack(0, player);
	}
	
	protected void nonPlayableCharacterAttack(ICharacter player, IParty partyToAttack)
	{
		partyToAttack.doAttack(0, player);
	}
}
