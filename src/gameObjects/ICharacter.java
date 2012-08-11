package gameObjects;

import gameObjects.StatusEffects.IStatusEffect;



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
	
	public ArmorType getArmorType();
	
	public WeaponType getWeaponType();
	
	public String toString();
	

	public void attack(ICharacter opponent);
	
	public void doDamage(int damageToDeal);
	
	public void heal(int damageToHeal);
	
	public void addStatusEffect(IStatusEffect effect);
	
	public void removeStatusEffect(IStatusEffect effect);
	
}
