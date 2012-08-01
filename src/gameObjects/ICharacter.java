package gameObjects;



public interface ICharacter
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
