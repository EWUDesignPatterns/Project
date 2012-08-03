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
	private int map[][];

	public FileLoaderDungeon(String filename) throws FileNotFoundException {
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
	public boolean moveNorth() {
		if (this.row > 0 && this.map[this.row - 1][this.col] != 1) {
			this.row--;

			return true;
		}

		return false;
	}

	@Override
	public boolean moveSouth() {
		if (this.row < 4 && this.map[this.row + 1][this.col] != 1) {
			this.row++;

			return true;
		}

		return false;
	}

	@Override
	public boolean moveEast() {
		if (this.col < 4 && this.map[this.row][this.col + 1] != 1) {
			this.col++;

			return true;
		}

		return false;
	}

	@Override
	public boolean moveWest() {
		if (this.col > 0 && this.map[this.row][this.col - 1] != 1) {
			this.col--;

			return true;
		}

		return false;
	}

	private void loadMap(String fileName) throws FileNotFoundException {
		Scanner input = new Scanner(new File(fileName));
		int rows = input.nextInt();
		int cols = input.nextInt();

		this.map = new int[rows][cols];

		for (int i = 0; i < rows; i++)
			for (int j = 0; j < cols; j++)
				this.map[i][j] = input.nextInt();
	}
}
