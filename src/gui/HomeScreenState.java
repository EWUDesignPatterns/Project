package gui;

import java.util.Scanner;

public class HomeScreenState implements IState
{
	private Game game;
	
	public HomeScreenState(Game game)
	{
		this.game = game;
	}
	
	@Override
	public boolean gameOver()
	{
		return false;
	}

	@Override
	public IState execute()
	{
		do {
			System.out.println("Please choose from the options below\n");
			
			System.out.println("1. Move Character");
			System.out.println("2. Use Item/Equip Item");
			System.out.println("3. Rest");
			System.out.println("4. Exit Game");
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("Choice -->");
			
			int choice = scanner.nextInt();
			
			System.out.println("You choose " + choice);
			
			switch (choice)
			{
				case 1: 
					return new MoveCharacterState(game);
				
				case 2:
					return new UseItemState(game);
					
				case 3:
					return new RestState(game);
				
				case 4:
					return new ExitGameState();
			}
			
		} while (true);
	}
}
