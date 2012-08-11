package gameObjects;

import java.util.LinkedList;

import gameObjects.StatusEffects.IStatusEffect;
import gameObjects.items.Armors.Armor;
import gameObjects.items.Weapons.Weapon;



public interface ICharacter
{

  //get/set/alter
	public int getHP();
	
	public int getMaxHP();
	
	public int getMP();
	
	public int getMaxMP();
	
	public int getDefense();
	
	public void changeDefense(int change);
	
	public void reduceMP(int amt);
	
	public void increaseMP(int amt);
	
	public LinkedList<IStatusEffect> getStatusEffects();
	
	public ArmorType getArmorType();
	
	public Armor getArmor();
	
	public WeaponType getWeaponType();
	
	public Weapon getWeapon();
	
	public String toString();
	

	public void attack(ICharacter opponent);
	
	public void doDamage(int damageToDeal);
	
	public void heal(int damageToHeal);
	
	public void addStatusEffect(IStatusEffect effect);
	
	public void removeStatusEffect(IStatusEffect effect);
	
}
