import java.util.*;

class Game {

  static Random rand = new Random();
  static Scanner input = new Scanner(System.in);

  static Character player;
  static Dungeon dungeon;

  public static void main(String[] args) {
    String commands[] = {"north", "south", "east", "west", "heal", "help", "quit"};
    String command;
    
    
    // Character creation
    System.out.print("Adventurer, what is your name? ");
    command = input.next();
    player = new Character(command, 5);
    
    
    // Initialize dungeon
    dungeon = new Dungeon("Lamorte");
    
    System.out.println("Welcome to " + dungeon.toString() + "!");
    System.out.println("Can you find your way out?");
    
    // Dungeon exploration loop
    while (player.isAlive() && dungeon.isActive()) {
      player.status();
      dungeon.status();
      
      command = getCommand(commands);
      
      
      // Utility Commands
      if (command.compareTo("quit") == 0) 
        break;
      
      // Action Commands
      if (command.compareTo("heal") == 0) 
        player.castHeal(player);

      
      
      // Move commands
      if (command.compareTo("north") == 0) 
        dungeon.moveNorth();
            
      if (command.compareTo("south") == 0) 
        dungeon.moveSouth();
    
      if (command.compareTo("east") == 0) 
        dungeon.moveEast();
          
      if (command.compareTo("west") == 0) 
        dungeon.moveWest();

          
      // Check for encounter    
      if (rand.nextInt(20) > 10) 
        actionEncounter();

    } 
    
    String result; 
    
    if (player.isAlive() && dungeon.isComplete())
      result = "Win!";
    else
      result = "Lose!";
    
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
  

  public static void actionEncounter() {
    String commands[] = {"attack", "flee"};
    String command;

    int level = rand.nextInt(3) + 1;
    Character opponent = new Character("Monster", level);

    // Combat loop
    while (player.isAlive()) {
      player.status();
      opponent.status();
      
      command = getCommand(commands);
      System.out.println();

      if (player.isAlive()) {
        if (command.compareTo("attack") == 0)
          player.attack(opponent);
          
        if (command.compareTo("flee") == 0 && player.flee()) 
          return;
      } 
        
      if (opponent.isAlive()) {
        opponent.attack(player);
      } else {
        System.out.println("You have defeated your opponent!");
        player.addExp(opponent.getExp());
        return;
      }

    } // end while
    
    System.out.println("You were killed!");
  
  } // end actionEncounter
  
}