package gameObjects.Class;

import gameObjects.ArmorType;
import gameObjects.ICharacter;
import gameObjects.WeaponType;
import gameObjects.Abilities.SpellAcidRain;
import gameObjects.Abilities.SpellFireBall;
import gameObjects.Race.playable.IPlayableCharacter;
import gameObjects.items.Armors.WizardRobe;
import gameObjects.items.Weapons.StaffOfMana;



public class Mage extends GameCharacterClass implements IPlayableCharacter
{
	
	
	public Mage(ICharacter character)
	{
		super(character);
		
		//assign name
		this.className = "Mage";
		
		this.equip(new WizardRobe());
		this.equip(new StaffOfMana());
		
		this.addAbility(new SpellFireBall(5, 10), 0);
		this.addAbility(new SpellAcidRain(3), 1);

	}
	
	
	public int getMaxHP()
	{
		return character.getMaxHP() - 5;
	}
	
	public int getMaxMP()
	{
		return character.getMaxMP() + 8;
	}
	
	public ArmorType getArmorType()
	{
		return ArmorType.LIGHT;
	}
	
	public WeaponType getWeaponType()
	{
		return WeaponType.MAGIC;
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
