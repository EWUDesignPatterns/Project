package gameObjects;


public abstract class GameCharacter 
{

	int maxHp;
	int maxMp;
	
	int armorType;
	int weaponSize;
	
	int hp;
	int mp;
	
	
	public int getHP()
	{
		return this.hp;
	}
	
	int getMaxHP()
	{
		return this.maxHp;
	}
	
	
	int getMaxMP()
	{
		return this.maxMp;
	}
	
	int getArmorType()
	{
		return this.armorType;
	}
	
	int getWeaponSize()
	{
		return this.weaponSize;
	}
	
	public void attack(GameCharacter foe)
	{
		
	}
	
	void doDamage(int DamageToDeal)
	{
		if(this.hp > DamageToDeal)
			this.hp -= DamageToDeal;
		else //kill the character, unsure of how we want to do this
			this.hp = 0;
	}
	
	public String toString()
	{
		return "" + this.getClass() + "\n"+
				this.hp + "\n"+
				this.mp + "\n";
	}
}