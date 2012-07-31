package gameObjects.items;

public class WoodenSword extends Weapon implements IWeapon {

	@Override
	public int getMinDamage() 
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getMaxDamage() 
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getName() {
		return "Wooden Sword";
	}

	@Override
	public int getDamage() 
	{
		return 1;
	}
}
