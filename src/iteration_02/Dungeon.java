package iteration_02;

import java.io.*;
import java.util.*;

class Dungeon {
  String name;
  
  int row;
  int col;
  int winRow;
  int winCol;
  
  int map[][];
  
  public Dungeon(String name) {
    this.name = name;
    this.row = 0;
    this.col = 0;
    this.winRow = 4;
    this.winCol = 4;
    
    this.loadMap();
  }
  
  public void status() {
    System.out.println(this.name + ": [" + this.row + ", " + this.col + "] ");
  }
  

  public boolean isActive() {
    if (this.row == this.winRow && this.col == this.winCol)
      return false;
    return true;
  }
  
  
  public boolean isComplete() {
    return !this.isActive();
  }
  
  
  private void loadMap() {
    
    
    try {
      Scanner input = new Scanner(new File("Lamorte.map"));
      int rows = input.nextInt();
      int cols = input.nextInt();
      
      this.map = new int[rows][cols];
      
      for (int i = 0; i < rows; i++)
        for (int j = 0; j < cols; j++)
          this.map[i][j] = input.nextInt();
      
    } catch (FileNotFoundException e) {
      System.out.println("Unable to load map");
    }
  }
  
  public void moveNorth() {
    if (this.row > 0 && this.map[this.row - 1][this.col] != 1)
      this.row--;
    else
      System.out.println("That way is blocked");
    
  }
  
  public void moveSouth() {
    if (this.row < 4 && this.map[this.row + 1][this.col] != 1)
      this.row++;
    else
      System.out.println("That way is blocked");
  }
  
  public void moveEast() {
    if (this.col < 4 && this.map[this.row][this.col + 1] != 1)
      this.col++;
    else
      System.out.println("That way is blocked");
  }
  
  public void moveWest() {
    if (this.col > 0 && this.map[this.row][this.col - 1] != 1)
      this.col--;    
    else
      System.out.println("That way is blocked");
  }
  
  public String toString() {
    return this.name;
  }
  
  
}