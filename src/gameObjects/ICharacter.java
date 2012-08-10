package gameObjects;

import gameObjects.StatusEffects.IStatusEffect;



public interface ICharacter
{

	public int getHP();
	
	public int getMaxHP();
	
	public int getMaxMP();
	
	public int getDefense();
	
	public void changeDefense(int change);
	
	public ArmorType getArmorType();
	
	public WeaponType getWeaponType();
	
	public String toString();
	

	public void attack(PlayerCharacter opponent);
	
	public void doDamage(int damageToDeal);
	
	public void heal(int damageToHeal);
	
	public void addStatusEffect(IStatusEffect effect);
	
	public void removeStatusEffect(IStatusEffect effect);
	
}
