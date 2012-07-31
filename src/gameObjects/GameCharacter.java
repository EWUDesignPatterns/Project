package gameObjects;

import java.util.Random;

import gameObjects.items.Weapon;


public abstract class GameCharacter 
{

	//Maximum HP/MP
	protected int maxHp;
	protected int maxMp;
	
	//current hp/mp
	protected int hp;
	protected int mp;
	
	//what stuff the character can equip
	protected ArmorType armorType;
	protected WeaponType weaponType;
	
	//accuracy
	protected int toHit;
	
	//base damage
	protected int baseDamage;
	
	protected String name;
	
	protected Weapon weapon;
	//protected Armor armor;
	
	
	
	
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
	
	public ArmorType getArmorType()
	{
		return this.armorType;
	}
	
	public WeaponType getWeaponType()
	{
		return this.weaponType;
	}
	
	public void attack(GameCharacter opponent)
	{ 
	    Random rand = new Random();
	    if (rand.nextInt(20) + 1 > this.toHit) 
	    {
	    	//don't need to know about damage unless we hit
	    	int damage = 0;
	    	damage += weapon.getDamage();
	    	opponent.doDamage(damage);
	    	System.out.println(this.name + " hits with " + weapon.toString() + " for " + damage + " damage!" );
	    } 
	    else 
	    {
	      System.out.println(this.name + " misses!");
	    }
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