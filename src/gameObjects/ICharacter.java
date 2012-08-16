package gameObjects;

import java.util.LinkedList;
import java.util.Observer;
import java.util.Observable;

import gameObjects.Abilities.IAbility;
import gameObjects.StatusEffects.IStatusEffect;
import gameObjects.items.IItem;
import gameObjects.items.Item;
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
	
	public int getAccuracy();
	
	public void increaseDefense(int change);
	
	public void decreaseDefense(int change);
	
	public void increaseAccuracy(int change);
	
	public void decreaseAccuracy(int change);
	
	public void decreaseMP(int amt);
	
	public void increaseMP(int amt);
	
	public LinkedList<IStatusEffect> getStatusEffects();
	
	public void applyStatusEffects();
	
	public ArmorType getArmorType();
	
	public Armor getArmor();
	
	public WeaponType getWeaponType();
	
	public Weapon getWeapon();
	
	public String toString();
	
	public String getName();
	
	public String getRace();
	
	public String getClassName();

	public void attack(ICharacter opponent);
	
	public int doDamage(int damageToDeal);
	
	public void heal(int damageToHeal);
	
	public void addStatusEffect(IStatusEffect effect);
	
	public void removeStatusEffect(IStatusEffect effect);
	
	void equip(IItem toEquip);

	public void addObserver(Observer o);
	
	void unEquip(IItem toRemove);
	
	void addAbility(IAbility ability, int index);
	
	void removeAbility(IAbility ability, int index);
}
