package gameObjects;

import java.util.LinkedList;
import java.util.Observable;
import java.util.Random;

import gameObjects.Abilities.IAbility;
import gameObjects.StatusEffects.IStatusEffect;
import gameObjects.items.IItem;
import gameObjects.items.Item;
import gameObjects.items.Armors.Armor;
import gameObjects.items.Weapons.Weapon;
import gameObjects.items.Weapons.MagicWeapon;

public abstract class Character extends Observable implements ICharacter
{

  //Stats
  protected int maxHp, hp;
  protected int maxMp, mp;
  protected int defense;
  protected int accuracy;
  protected int baseDamage;
  protected String name;
  protected String race;
  
  //what stuff the character can equip
  protected ArmorType armorType;
  protected WeaponType weaponType;

  //Equipment
  protected Weapon weapon;
  protected Armor armor;
  protected Item[] inventory;
  
  //What abilities the character currently has (limited)
  protected IAbility[] abilities;
  
  //What status effects the character currently has applied
  protected LinkedList<IStatusEffect> statusEffects;
  
  //protected default constructor to init objects but prevent abstract class from being initialized
  protected Character()
  {
    this.name = "Unknown";
    this.abilities = new IAbility[4];
    this.statusEffects = new LinkedList<IStatusEffect>();
    this.inventory = new Item[10];
  }
  
 
  //Getters
  public int getHP()
  {
    return this.hp;
  }
  
  public int getMaxHP()
  {
    return this.maxHp;
  }
  
  public int getMP()
  {
    return this.mp;
  }
  
  public int getMaxMP()
  {
    return this.maxMp;
  }
  
  public int getDefense()
  {
    return this.defense;
  }
  
  public int getAccuracy()
  {
    return this.accuracy;
  }
  
  public void increaseDefense(int change)
  {
    this.defense += change;
  }
  
  public void decreaseDefense(int change)
  {
    if(change > this.defense)
      this.defense = 0;
    else
      this.defense -= change;
  }
  
  public void increaseAccuracy(int change)
  {
    this.accuracy += change;
  }
  
  public void decreaseAccuracy(int change)
  {
    if(this.accuracy < change)
      this.accuracy = 1;
    else
      this.accuracy -= change;
  }
  
  public void decreaseMP(int amt)
  {
    if(amt > this.mp)
      this.mp = 0;
    else
      this.mp -= amt;
  }
  
  public void increaseMP(int amt)
  {
      this.mp += amt;
  }
  
  public LinkedList<IStatusEffect> getStatusEffects()
  {
    return this.statusEffects;
  }
  
  public void applyStatusEffects()
  {
	  for(IStatusEffect i:statusEffects)
		  i.applyAffect(this);
  }
  
  public ArmorType getArmorType()
  {
    return this.armorType;
  }
  
  public Armor getArmor()
  {
    return this.armor;
  }
  
  public WeaponType getWeaponType()
  {
    return this.weaponType;
  }
  
  public Weapon getWeapon()
  {
    return this.weapon;
  }
  
  @Override
  public String getName()
  {
    return this.name;
  }

  @Override
  public String getRace()
  {
    return this.race;
  }

  @Override
  public String getClassName()
  {
    return "";
  }
  
  public String toString()
  {
    return "";
  }
  
  //Attack/Defend logic here
  public void attack(ICharacter opponent)
  {
      Random rand = new Random();
      if (rand.nextInt(20) + 1 < this.accuracy) //higher accuracy is better
      {
    	  this.characterDidHit(opponent);
    	  opponent.doDamage(this.getWeaponDamage());
      } 
      else 
      {
    	  this.characterDidMiss();
      }
  }
  
  private int getWeaponDamage()
  {
	  int damage = this.baseDamage;
      
      if (weapon != null) {
      	damage += weapon.getEffect();
      }
      
      return damage;       
  }
  
  public int doDamage(int DamageToDeal)
  {
	  if (getArmor() != null) 
	  {
		  DamageToDeal -= getArmor().getEffect(); //just a straight subtraction for now, can change later  
	  }
	  
	  DamageToDeal -= this.getDefense();
	 
	  
	  if(DamageToDeal < 0)
		  DamageToDeal = 0;
    
	  if(this.hp > DamageToDeal)
  		this.hp -= DamageToDeal;
	  else //kill the character, unsure of how we want to do this
		  this.hp = 0;
	  
	  return DamageToDeal;
  }
  
  public void doDamageWithoutDefenses(int DamageToDeal)
  {
	  if(this.hp > DamageToDeal)
	  		this.hp -= DamageToDeal;
		  else //kill the character, unsure of how we want to do this
			  this.hp = 0;
  }
  
  public void heal(int damageToHeal)
  {
      this.hp += damageToHeal;
  }
  
  //Ability Logic Here
  public void addAbility(int index, IAbility ability)
  {
    this.abilities[index] = ability;
  }
  

  
  public void equip(IItem toEquip) //equip a weapon or an armor
  {
	  if(toEquip instanceof Weapon)
	  {
		  if(toEquip instanceof MagicWeapon)
			  this.addStatusEffect(((MagicWeapon) toEquip).getStatus());
		  if(this.weapon == null)//if we don't have a weapon already
		  {
			  this.weapon = (Weapon)toEquip; //equip it
		  }else{
			  System.out.println("Are you sure? no? too bad."); //we already have a weapon, do we want to replace it?
			  this.unEquip(this.getWeapon());
			  this.weapon = (Weapon)toEquip;  //too bad, we're doing it anyways
		  }
	  }
	  else
	  {
		  if(this.armor == null)//if we don't have an Armor already
	      {
	        this.armor = (Armor)toEquip; //equip it
	      }else{
	        System.out.println("Are you sure? no? too bad."); //we already have an Armor, do we want to replace it?
	        this.armor = (Armor)toEquip;  //too bad, we're doing it anyways
	      }
	  }
		  
		  
  }//end equip
  
  public void unEquip(IItem toUnequip)
  {
    if(toUnequip instanceof Armor)
    {
      this.armor = null;
    }else if(toUnequip instanceof Weapon){
      if(toUnequip instanceof MagicWeapon)
        this.removeStatusEffect(((MagicWeapon)toUnequip).getStatus());
      this.weapon = null;
    }
  }
  
  public void addStatusEffect(IStatusEffect effect)
  {
    this.statusEffects.add(effect);
  }
  
  public void removeStatusEffect(IStatusEffect effect)
  {
    this.statusEffects.remove(effect);
  }
  
  public void addAbility(IAbility ability, int index)
  {
	  abilities[index] = ability;
  }
	
  public void removeAbility(IAbility ability, int index)
  {
	  abilities[index] = null;
  }

  protected void characterDidHit(ICharacter opponent)
  {
	  System.out.println(this.name + " hit " + opponent.getName() + "!");
  }
  
  protected void characterDidMiss()
  {
	  System.out.println(this.name + " misses!");
  }
}

