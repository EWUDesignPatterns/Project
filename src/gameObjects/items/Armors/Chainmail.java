package gameObjects.items.Armors;

import gameObjects.ArmorType;
import gameObjects.items.IArmor;

public class Chainmail extends Armor implements IArmor
{

   public Chainmail()
   {
     this.baseEffect = 3;
     this.maxEffect = 12;
     this.name = "Chainmail";
     this.description = "For when Plate Armor is just overkill";
     this.type = ArmorType.MEDIUM;
   }
}
