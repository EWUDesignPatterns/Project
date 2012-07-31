package gameObjects;

import java.util.Random;

import gameObjects.Abilities.iAbility;
import gameObjects.items.Armors.Armor;
import gameObjects.items.Weapons.Weapon;



public abstract class GameCharacter implements iPlayerCharacter
{

	//Maximum/current hp/mp
	protected int maxHp, hp;
	protected int maxMp, mp;
	
	//what stuff the character can equip
	protected ArmorType armorType;
	protected WeaponType weaponType;
	
	//accuracy
	protected int toHit;
	
	//base damage
	protected int baseDamage;
	
	//character name
	protected String name;
	
	protected Weapon weapon;
	protected Armor armor;
	
	protected iAbility[] abilities;
	
	
	
	//Getters
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
	
	public String toString()
	{
		return "" + this.getClass() + "\n"+
				this.hp + "\n"+
				this.mp + "\n";
	}
	
	//Attack/Defend logic here
	public void attack(GameCharacter opponent)
	{ 
	    Random rand = new Random();
	    if (rand.nextInt(20) + 1 > this.toHit) 
	    {
	    	//don't need to know about damage unless we hit
	    	int damage = 0;
	    	damage += weapon.getEffect();
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
		DamageToDeal -= armor.getEffect(); //just a straight subtraction for now, can change later
		if(this.hp > DamageToDeal)
			this.hp -= DamageToDeal;
		else //kill the character, unsure of how we want to do this
			this.hp = 0;
	}
	
	//Ability Logic Here
	public void addAbility(int index, iAbility ability)
	{
		this.abilities[index] = ability;
	}


}