package gameObjects;

import java.util.LinkedList;
import java.util.Random;

import gameObjects.Abilities.IAbility;
import gameObjects.StatusEffects.IStatusEffect;
import gameObjects.items.Item;
import gameObjects.items.Armors.Armor;
import gameObjects.items.Weapons.Weapon;

public class Character implements ICharacter
{

  //Stats
  protected int maxHp, hp;
  protected int maxMp, mp;
  protected int defense;
  protected int accuracy;
  protected int baseDamage;
  protected String name;
  
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
  
  public int getDefense()
  {
    return this.defense;
  }
  
  public void changeDefense(int change)
  {
    this.defense += change;
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
    return "" + this.hp + "\n"+ this.mp + "\n";
  }
  
  //Attack/Defend logic here
  public void attack(ICharacter opponent)
  { 
      Random rand = new Random();
      if (rand.nextInt(20) + 1 > this.accuracy) 
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
    DamageToDeal -= this.getDefense();
    if(this.hp > DamageToDeal)
      this.hp -= DamageToDeal;
    else //kill the character, unsure of how we want to do this
      this.hp = 0;
  }
  
  public void heal(int damageToHeal)
  {
    if(this.hp + damageToHeal > this.maxHp)
      this.hp = this.maxHp;
    else
      this.hp += damageToHeal;
  }
  
  //Ability Logic Here
  public void addAbility(int index, IAbility ability)
  {
    this.abilities[index] = ability;
  }
  

  
  void equip(Item toEquip) //equip a weapon or an armor
  {
    
    if(toEquip instanceof Weapon)//if it is a weapon
    {
      if(((Weapon)toEquip).getWeaponType() == this.weaponType)//if it is equippable
      {
        if(this.weapon == null)//if we don't have a weapon already
        {
          this.weapon = (Weapon)toEquip; //equip it
        }else{
          System.out.println("Are you sure? no? too bad."); //we already have a weapon, do we want to replace it?
          this.weapon = (Weapon)toEquip;  //too bad, we're doing it anyways
        }
      }
    }
    
    else if(toEquip instanceof Armor)//if it is an armor
    {
      if(((Armor)toEquip).getArmorType() == this.armorType)//if it is equippable
      {
        if(this.armor == null)//if we don't have an Armor already
        {
          this.armor = (Armor)toEquip; //equip it
        }else{
          System.out.println("Are you sure? no? too bad."); //we already have an Armor, do we want to replace it?
          this.armor = (Armor)toEquip;  //too bad, we're doing it anyways
        }
      }   
    } 
  }//end equip
  
  public void addStatusEffect(IStatusEffect effect)
  {
    this.statusEffects.add(effect);
  }
  
  public void removeStatusEffect(IStatusEffect effect)
  {
    this.statusEffects.remove(effect);
  }


}

