package gameObjects;


public class Ork extends GameCharacter
{

	public Ork()
	{
		this.hp = 10;
		this.maxHp = 10;
		this.mp = 3;
		this.maxMp = 3;
		this.weaponSize = 3;//large weapons
		this.armorType = 3; //heavy armor
	}
	
	@Override
	public void attack(GameCharacter foe) 
	{
		foe.doDamage(5);
		
	}


}
