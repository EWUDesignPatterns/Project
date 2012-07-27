package gameObjects;


public abstract class GameCharacter 
{

	//Maximum HP/MP
	protected int maxHp;
	protected int maxMp;
	
	//current hp/mp
	protected int hp;
	protected int mp;
	
	
	
	//what stuff the character can equip
	protected int armorType;
	protected int weaponSize;
	
	
	
	
	public int getHP()
	{
		return this.hp;
	}
	
	public int getMaxHP()
	{
		return this.maxHp;
	}
	
	
	public int getMaxMP()
	{
		return this.maxMp;
	}
	
	public int getArmorType()
	{
		return this.armorType;
	}
	
	public int getWeaponSize()
	{
		return this.weaponSize;
	}
	
	public void attack(GameCharacter foe)
	{
		
	}
	
	public void doDamage(int DamageToDeal)
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