package gameObjects;



public interface iCharacter
{

	public int getHP();
	
	public int getMaxHP();
	
	public int getMaxMP();
	
	public ArmorType getArmorType();
	
	public WeaponType getWeaponType();
	
	public String toString();
	

	public void attack(PlayerCharacter opponent);
	
	public void doDamage(int DamageToDeal);
	
}
