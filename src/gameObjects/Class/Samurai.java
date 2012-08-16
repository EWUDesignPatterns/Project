package gameObjects.Class;

import gameObjects.ArmorType;
import gameObjects.ICharacter;
import gameObjects.WeaponType;
import gameObjects.Abilities.RapidAttack;
import gameObjects.Abilities.SunderArmor;
import gameObjects.Abilities.SunderWeapon;
import gameObjects.Race.playable.IPlayableCharacter;
import gameObjects.items.Armors.GlassArmor;
import gameObjects.items.Weapons.Katana;

public class Samurai extends GameCharacterClass implements IPlayableCharacter
{
	public Samurai(ICharacter character)
	{
		super(character);
		//assign name
		this.className = "Samurai";

		this.equip(new Katana());
		this.equip(new GlassArmor());
		
		this.addAbility(new SunderArmor(), 0);
		this.addAbility(new SunderWeapon(), 1);
		
	}
	
	
	public int getMaxHP()
	{
		return character.getMaxHP() + 2;
	}
	
	public int getMaxMP()
	{
		return character.getMaxMP();
	}
	
	public ArmorType getArmorType()
	{
		return ArmorType.HEAVY;
	}
	
	public WeaponType getWeaponType()
	{
		return WeaponType.LIGHT;
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


