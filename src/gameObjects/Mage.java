package gameObjects;


public class Mage extends GameCharacterClass
{
	
	
	public Mage(GameCharacter character)
	{
		//assign character
		this.character = character;
		
		//update the characters hp and mp
		this.hp = getMaxHP();
		this.mp = getMaxMP();
		
	}
	
	
	@Override
	int getMaxHP()
	{
		return character.maxHp - 5;
	}
	
	int getMaxMP()
	{
		return character.maxMp + 8;
	}
	
	int getArmorType()
	{
		return 0;
	}
	
	int getWeaponType()
	{
		return 1;
	}
}
