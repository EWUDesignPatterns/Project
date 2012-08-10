package gameObjects.Race;

import gameObjects.PlayerCharacter;



public class Elf extends PlayerCharacter
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

	@Override
	public void attack(PlayerCharacter foe) 
	{
		foe.doDamage(this.baseDamage);
	}
}
