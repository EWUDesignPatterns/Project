package gui;

import java.util.Scanner;

public class DungeonsAndDragonsGame {
	public static void main(String[] args)
	{
		System.out.println("Welcome to Dungeons and Dragons 21st Century Command Line Style");
		
		System.out.println("Pick Character: ");
		
		System.out.println("Your Character is: Test character");
		System.out.println("You are entering the XXXX dungeon");
		
		do {
			
			System.out.println("Please choose from the options below\n");
			
			System.out.println("1. Move Character");
			System.out.println("2. Use Item/Equip Item");
			System.out.println("3. Move");
			System.out.println("4. Rest");
			System.out.println("5. Get");
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("Choice -->");
			
			int choice = scanner.nextInt();
			
			switch (choice)
			{
				case 1: 
					System.out.println("Move character");
				break;
			}
			
		} while (true);
	}
}
