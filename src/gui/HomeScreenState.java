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
			System.out.println("3. Move");
			System.out.println("4. Rest");
			System.out.println("5. Get");
			System.out.println("6. Exit Game");
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("Choice -->");
			
			int choice = scanner.nextInt();
			
			System.out.println("You choose " + choice);
			
			switch (choice)
			{
				case 1: 
					
				break;
				
				case 6:
					return new ExitGameState();
			}
			
		} while (true);
	}
}
