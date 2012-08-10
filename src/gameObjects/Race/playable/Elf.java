package gameObjects.Race.playable;

import gameObjects.Character;




public class Elf extends Character
{
  
	public Elf(String name) {
		this.name = name;
		this.hp = 6;
		this.maxHp = 6;
		this.mp = 12;
		this.maxMp = 12;
		this.defense = 1;
		this.baseDamage = 4;
	}


}
