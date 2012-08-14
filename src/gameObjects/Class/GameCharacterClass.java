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

	public GameCharacterClass(ICharacter character)
	{
		this.character = character;
		character.heal(getMaxHP() - getHP());
		character.decreaseMP(getMaxMP() - getMP());
	}
	
	
	public String toString()
	{
		String temp = "-----------------\n";
		temp += "| " + character.getName();
		if(temp.length()-18 < 10)
			temp += "\t";
		temp += "\t|\n";
		temp += "| " + character.getRace()+ " " + this.className + "\t|\n";
		temp += "| " + "HP: "+ this.getHP() + "/" + this.getMaxHP() + "\t|\n";
		temp += "| " + "MP: "+ this.getMP() + "/" + this.getMaxMP() + "\t|\n";
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
		return this.className;
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
		return 0;
	}

	@Override
	public int getMP() 
	{
		return character.getMP();
	}

	@Override
	public int getMaxMP() 
	{
		return 0;
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
		return null;
	}

	@Override
	public Armor getArmor() 
	{
		return character.getArmor();
	}

	@Override
	public WeaponType getWeaponType() 
	{
		return null;
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
	public void doDamage(int damageToDeal) 
	{
		character.doDamage(damageToDeal);
	}

	@Override
	public void heal(int damageToHeal)
	{
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
