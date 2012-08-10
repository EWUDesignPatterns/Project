package gameObjects.items.Potions;

import java.util.Random;

import gameObjects.PlayerCharacter;
import gameObjects.items.Item;
import gameObjects.items.IItem;
import gameObjects.items.IPotion;

public class MinorHealthPotion extends Item implements IItem, IPotion
{

	public MinorHealthPotion()
	{
		this.baseEffect = 1;
		this.maxEffect = 5;
		this.name = "Minor Health Potion";
	}
	
	
	@Override
	public void use(PlayerCharacter target)
	{
		target.heal(this.getEffect());
	}




}
