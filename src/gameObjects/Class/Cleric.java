package gameObjects.Class;

import gameObjects.ArmorType;
import gameObjects.ICharacter;
import gameObjects.WeaponType;
import gameObjects.Abilities.SpellLeech;
import gameObjects.Abilities.SpellMinorHealing;
import gameObjects.Abilities.SpellRecuperation;
import gameObjects.Race.playable.IPlayableCharacter;
import gameObjects.items.Armors.Clothes;
import gameObjects.items.Weapons.StaffOfMana;

public class Cleric extends GameCharacterClass implements IPlayableCharacter
{
	public Cleric(ICharacter character)
	{
		super(character);
		
		//assign name
		this.className = "Cleric";
		this.equip(new StaffOfMana());
		this.equip(new Clothes());
		
		this.addAbility(new SpellMinorHealing(2, 5), 0);
		this.addAbility(new SpellRecuperation(10, 20), 1);
		this.addAbility(new SpellLeech(5, 8), 2);
	}
	
	
	public int getMaxHP()
	{
		return character.getMaxHP() - 3;
	}
	
	public int getMaxMP()
	{
		return character.getMaxMP() + 10;
	}
	
	public ArmorType getArmorType()
	{
		return armorType.LIGHT;
	}
	
	public WeaponType getWeaponType()
	{
		return weaponType.MAGIC;
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
}
