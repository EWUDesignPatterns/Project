package gui;

import gameObjects.*;
import gameObjects.Class.Berserker;
import gameObjects.Class.Cleric;
import gameObjects.Class.Mage;
import gameObjects.Class.Samurai;
import gameObjects.Race.*;
import gameObjects.Race.playable.Elf;
import gameObjects.Race.playable.Human;
import gameObjects.Race.playable.Orc;

public class GameBeginState implements IState {
	private DungeonsAndDragonsGame game;

	public GameBeginState(DungeonsAndDragonsGame game) {
		this.game = game;
	}

	public boolean gameOver() {
		return false;
	}

	public IState execute() {
		
		Party party = new Party();
		
		//TEMP loop for size of party
		//for(int i = 0; i < 3; i ++)
		//{
			ICharacter player = PlayerFactory.generate(this.getPlayerName(), this.getPlayerClass(), this.getPlayerRace(), null);
			party.add(player);
		//}

		game.setParty(party);
	
		return new HomeScreenState(game);
	}

	private String getPlayerName()
	{
		System.out.print("Adventurer, what is your name?");

		return game.getInput().next();
	}
	
	private String getPlayerRace() {

		System.out.println("Please select a race: ");
		
		return game.nextString(PlayerFactory.getRaces());
	}

	private String getPlayerClass() {

		System.out.println("Please select a class: ");
		
		return game.nextString(PlayerFactory.getClasses());
	}
}
