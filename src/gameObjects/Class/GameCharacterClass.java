package gameObjects.Class;

import java.util.LinkedList;

import gameObjects.Character; // For some reason this has to be imported expclity
import gameObjects.*;
import gameObjects.StatusEffects.IStatusEffect;
import gameObjects.items.IItem;
import gameObjects.items.Armors.Armor;
import gameObjects.items.Weapons.Weapon;



public abstract class GameCharacterClass extends Character implements ICharacter
{
	protected ICharacter character;	
	protected String className;
	public GameCharacterClass(ICharacter character)
	{
		this.character = character;
		this.heal(getMaxHP() - character.getHP());
		this.increaseMP(getMaxMP() - character.getMP());
	}
	
	
	public String toString()
	{
		String temp = "-----------------\n";
		temp += "| " + character.getName();
		if(temp.length()-18 < 10)
			temp += "\t";
		temp += "\t|\n";
		temp += "| " + character.getRace()+ " " + this.className + "\t|\n";
		temp += "| " + "HP: "+ getHP() + "/" + getMaxHP() + "\t|\n";
		temp += "| " + "MP: "+ getMP() + "/" + getMaxMP() + "\t|\n";
		temp += "-----------------\n";
		return temp;
	}

	@Override
	public String getName()
	{
		return character.getName();
	}


	@Override
	public String getRace()
	{
		return character.getRace();
	}


	@Override
	public String getClassName()
	{
		return character.getClassName();
	}

	public int getAccuracy()
	{
		return character.getAccuracy();
	}

	@Override
	public int getHP() 
	{
		return character.getHP();
	}

	@Override
	public int getMaxHP() 
	{
		return character.getMaxHP();
	}

	@Override
	public int getMP() 
	{
		return character.getMP();
	}

	@Override
	public int getMaxMP() 
	{
		return character.getMaxHP();
	}

	@Override
	public int getDefense() 
	{
		return character.getDefense();
	}

	@Override
	public void increaseDefense(int change)
	{
		character.increaseDefense(change);
	}

	@Override
	public void decreaseDefense(int change)
	{
		character.decreaseDefense(change);

	}

	@Override
	public void increaseAccuracy(int change) 
	{
		character.increaseAccuracy(change);

	}

	@Override
	public void decreaseAccuracy(int change) 
	{
		character.decreaseAccuracy(change);
	}

	@Override
	public void decreaseMP(int amt) 
	{
		character.decreaseMP(amt);

	}

	@Override
	public void increaseMP(int amt) 
	{
		if(getMP() + amt > getMaxMP())
		      character.increaseMP(getMaxMP() - getMP());
		    else
		      character.increaseMP(amt);
	}

	@Override
	public LinkedList<IStatusEffect> getStatusEffects() 
	{
		return character.getStatusEffects();
	}

	@Override
	public ArmorType getArmorType()
	{
		return character.getArmorType();
	}

	@Override
	public Armor getArmor() 
	{
		return character.getArmor();
	}

	@Override
	public WeaponType getWeaponType() 
	{
		return character.getWeaponType();
	}

	@Override
	public Weapon getWeapon() 
	{
		return character.getWeapon();
	}

	@Override
	public void attack(ICharacter opponent)
	{
		character.attack(opponent);
	}

	@Override
	public int doDamage(int damageToDeal) 
	{
		if (getArmor() != null) {
			  damageToDeal -= character.getArmor().getEffect(); //just a straight subtraction for now, can change later
			  System.out.println(getArmor().getEffect() + " Damage mitigated by Armor");
		}
		  
		  damageToDeal -= character.getDefense();
		  System.out.println(this.getDefense() + " Damage resisted by defense");
		  
		  if(damageToDeal < 0)
			  damageToDeal = 0;
	    
		  if(character.getHP() > damageToDeal)
	  		character.doDamage(damageToDeal);
		  else //kill the character, unsure of how we want to do this
			  character.doDamage(character.getHP());
		  return damageToDeal;
	}

	@Override
	public void heal(int damageToHeal)
	{
		if(getHP() + damageToHeal > getMaxHP())
		      character.heal(getMaxHP() - getHP());
		    else
		      character.heal(damageToHeal);

	}

	@Override
	public void addStatusEffect(IStatusEffect effect)
	{
		character.addStatusEffect(effect);

	}

	@Override
	public void removeStatusEffect(IStatusEffect effect) 
	{
		character.removeStatusEffect(effect);

	}

	@Override
	public void equip(IItem toEquip) 
	{
		character.equip(toEquip);

	}

	@Override
	public void unEquip(IItem toRemove) 
	{
		character.unEquip(toRemove);
	}
}
