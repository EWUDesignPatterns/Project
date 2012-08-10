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
	private Game game;

	public GameBeginState(Game game) {
		this.game = game;
	}

	public boolean gameOver() {
		return false;
	}

	public IState execute() {

		ICharacter player = this.selectCharacter();
		player = this.selectClass(player);

		game.setPlayer(player);
		
		return new HomeScreenState(game);
	}

	private ICharacter selectCharacter() {
		System.out.print("Adventurer, what is your name?");

		String name = game.getInput().next();

		while (true) {
			System.out.println("Please select a race: ");
			System.out.println("1. Elf");
			System.out.println("2. Human");
			System.out.println("3. Orc");
			System.out.print(": ");
			int choice = game.nextInt();

			switch (choice) {
				case 1:
					return new Elf(name);
				case 2:
					return new Human(name);
				case 3:
					return new Orc(name);
			}
		}
	}

	private ICharacter selectClass(ICharacter character) {
		
		while (true) {
			System.out.println("Please select a class: ");
			System.out.println("1. Berserker");
			System.out.println("2. Cleric");
			System.out.println("3. Mage");
			System.out.println("4. Samurai");
			System.out.print(": ");
			int choice = game.nextInt();

			switch (choice) {
				case 1:
					return new Berserker(character);
				case 2:
					return new Cleric(character);
				case 3:
					return new Mage(character);
				case 4:
					return new Samurai(character);
			}
		}
	}
}
