package dungeons;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import gameObjects.*;

/**
 * FileLoaderDungeon is a default implementation of the IDungeon
 * interface that reads a from a file
 * @author Mike
 *
 */
public class FileLoaderDungeon implements IDungeon {

	/**
	 * Current pointers for where we are in the dungeon
	 */
	private int row;
	private int col;

	/**
	 * Markers for where the dungeon is completed at
	 */
	private int winRow;
	private int winCol;

	/**
	 * Array of 0 or 1 values, 1 marking a wall, 0 marking a open room
	 */
	private IRoom map[][];

	private IFightGenerator fightGenerator;
	
	final private int MAP_CREATE_ROOM 	= 0;
	
	final private int MAP_WALL 	  		= 1;
	
	public FileLoaderDungeon(String filename, IFightGenerator fightGenerator) throws FileNotFoundException, Exception {

		this.fightGenerator = fightGenerator;
		
		this.loadMap(filename);
	}

	@Override
	public IRoom getCurrentRoom() {
		throw null;
	}
	
	@Override
	public boolean isComplete() {
		return !this.isActive();
	}

	@Override
	public boolean isActive() {
		if (this.row == this.winRow && this.col == this.winCol)
			return false;
		return true;
	}

	@Override
	public boolean moveNorth(Party party) {
		if (this.row > 0 && this.map[this.row - 1][this.col] != null) {
			
			this.exitCurrentRoom(party);
			this.changeRoom(-1, 0);
			this.enterCurrentRoom(party);

			return true;
		}

		return false;
	}

	@Override
	public boolean moveSouth(Party party) {
		if (this.row < 4 && this.map[this.row + 1][this.col] != null) {
			
			this.exitCurrentRoom(party);
			this.changeRoom(1, 0);
			this.enterCurrentRoom(party);
			
			return true;
		}

		return false;
	}

	@Override
	public boolean moveEast(Party party) {
		if (this.col < 4 && this.map[this.row][this.col + 1] != null) {

			this.exitCurrentRoom(party);
			this.changeRoom(0, 1);
			this.enterCurrentRoom(party);

			return true;
		}

		return false;
	}

	@Override
	public boolean moveWest(Party party) {
		if (this.col > 0 && this.map[this.row][this.col - 1] != null) {
			
			this.exitCurrentRoom(party);
			this.changeRoom(0, -1);
			this.enterCurrentRoom(party);

			return true;
		}

		return false;
	}

	private void changeRoom(int rowModifer, int colModifer)
	{
		this.col = this.col + colModifer;
		this.row = this.row + rowModifer;
	}
	
	private void exitCurrentRoom(Party party)
	{
		this.map[this.row][this.col].exit(party);
	}
	
	private void enterCurrentRoom(Party party)
	{
		this.map[this.row][this.col].enter(party);
	}
	
	private void loadMap(String fileName) throws FileNotFoundException, Exception {
		Scanner input = new Scanner(new File(fileName));
		int rows = input.nextInt();
		int cols = input.nextInt();

		this.map = new IRoom[rows][cols];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				int inputInt = input.nextInt();
				if (inputInt == MAP_WALL) {
					this.map[i][j] = null; // This is a wall
				} else if (inputInt == MAP_CREATE_ROOM) {
					this.map[i][j] = new Room(this.fightGenerator);
				} else {
					// @todo Create custom exception for this			
					throw new Exception("Unexpected value of "+inputInt);
				}
			}
		}
	}
}
