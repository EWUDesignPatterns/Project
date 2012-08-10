import java.util.*;

class Game {

  static Random rand = new Random();
  static Scanner input = new Scanner(System.in);

  static String name;
  static int hp;
  static int maxHp;
  static int exp;
  static int level;
  static int heals;

  static int row;
  static int col;
  static int winRow;
  static int winCol;

  
  public static void main(String[] args) {
    String commands[] = {"north", "south", "east", "west", "heal", "help", "quit"};
    String command;
    String result;
    boolean running;
    // int dungeon[][];

    
    // Character creation
    System.out.print("Adventurer, what is your name? ");
    name = input.next();
    hp = maxHp = 20;
    exp = 0;
    level = 1;
    heals = 2;
    
    
    // Initialize dungeon
    int dungeon[][] = {             // 0: empty room
      {0, 0, 1, 0, 0},              // 1: wall
      {1, 0, 1, 0, 0},
      {0, 0, 1, 0, 0},
      {0, 0, 0, 0, 0},
      {0, 0, 0, 0, 0}
    };
    row = 0;
    col = 0;
    winRow = 4;
    winCol = 4;
    running = true;
    result = "";
    
    System.out.println("Welcome to the dungeon!");
    System.out.println("Can you find your way out?");
    
    // Dungeon exploration loop
    do {
      displayStatus();
      command = getCommand(commands);
      
      
      // Utility Commands
      if (command.compareTo("help") == 0)
        commandHelp();
        
      if (command.compareTo("quit") == 0) {
        running = false;
        result = "Quit!";
        continue;
      }
      
      // Action Commands
      if (command.compareTo("heal") == 0 && heals > 0) {
        hp = maxHp;
        heals--;
      }
      
      
      // Move commands
      if (command.compareTo("north") == 0) 
        if (row > 0 && dungeon[row-1][col] != 1)
          row--;
        else
          System.out.println("That way is blocked");
      
      if (command.compareTo("south") == 0) 
        if (row < 4 && dungeon[row+1][col] != 1)
          row++;
        else
          System.out.println("That way is blocked");
    
      if (command.compareTo("east") == 0) 
        if (col < 4 && dungeon[row][col+1] != 1)
          col++;
        else
          System.out.println("That way is blocked");
          
      if (command.compareTo("west") == 0) 
        if (col > 0 && dungeon[row][col-1] != 1)
          col--;    
        else
          System.out.println("That way is blocked");

          
      // Check for encounter    
      if (rand.nextInt(20) > 10) {
        System.out.println("Encounter!");

        // Check if character was killed
        if ( actionEncounter() == false ) {
          running = false;
          result = "Lose!";
        }
      }
      
    
      // Check for exit
      if (row == winRow && col == winCol) {
        running = false;
        result = "Win!";
      } 

        
      
    } while (running);
    
    System.out.println("\n");
    System.out.println("======================");
    System.out.println("You " + result);
    System.out.println("Thank you for playing.");
    System.out.println("======================");
    System.out.println("\n\n");
  }
  
  
  public static String getCommand(String commands[]) {
    String command;
    boolean valid = false;
    
    do {
      // Display available commands
      System.out.print("[");
      for (int i = 0; i < commands.length - 1; i++)
        System.out.print(commands[i] + ", ");
      System.out.println(commands[commands.length - 1] + "]");
      
      System.out.print("Command: ");
      command = input.next();
      
      for (int i = 0; i < commands.length; i++) 
        if (commands[i].compareToIgnoreCase(command) == 0)
          valid = true;

    } while (!valid);

    return command.toLowerCase();
    
  }
  
  public static void commandHelp() {
    System.out.println("*** Help ***");
    System.out.println("Commands: ");
    System.out.println("  north");
    System.out.println("  south");
    System.out.println("  east");
    System.out.println("  west");
    System.out.println("  quit");
  }
  
  public static boolean actionEncounter() {
    String commands[] = {"attack", "run"};
    String command;
    int monsterHp = rand.nextInt(10);
    int damage;
    boolean running = true;
    boolean result = true;
    
    while (running) {
      displayStatus();
      command = getCommand(commands);

      System.out.println();
      
      // Check if player is alive
      if (hp > 0) {

        // Check for escape attempt
        if (command.compareTo("run") == 0)
          if (rand.nextInt(20) > 10) {
            running = false;
            result = true;
            System.out.println("** You have ran away!");
          } else {
            System.out.println("** You cannot get away!");
          }

        // Player attack action (includes level modifier)
        if (command.compareTo("attack") == 0) 
          if (rand.nextInt(20) > (15 - (level * 2))) {
            damage = rand.nextInt(6) + (level *2);
            monsterHp -= damage;
            System.out.println("** You hit the monster for " + damage + " damage!");
          } else {
            System.out.println("** You missed!");
          }

      } else {
        System.out.println("** You have been killed!");
        running = false;
        result = false;
      }

        
      // Check if monster is alive
      if (monsterHp > 0) {
        // Monster attack action
        if (rand.nextInt(20) > 15) {
          damage = rand.nextInt(6) + (level *2);
          hp -= damage;
          System.out.println("** You were hit for " + damage + " damage!");
        } else {
          System.out.println("** The monster misses!");
        }
      } else {
        System.out.println("** You have defeated your opponent!");
        exp += 100;
        level = (exp / 1000);
        running = false;
        result = true;
      }
    } // end while
    
    return result;
  }
  
  public static void displayStatus() {
    System.out.println("\n");
    System.out.println("================");
    System.out.println(name);
    System.out.println("Hp:  " + hp + " / " + maxHp);
    System.out.println("Lvl: " + level); 
    System.out.println("Exp: " + exp + " / " + (1000 * level)); 
    System.out.println("Pos: [" + row + ", " + col + "]");
    System.out.println("================");
  }
}