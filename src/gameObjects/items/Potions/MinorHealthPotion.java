package gameObjects.items.Potions;

import java.util.Random;

import gameObjects.GameCharacter;
import gameObjects.items.Item;
import gameObjects.items.iItem;
import gameObjects.items.iPotion;

public class MinorHealthPotion extends Item implements iItem, iPotion
{

	public MinorHealthPotion()
	{
		this.baseEffect = 1;
		this.effectMultiplier = .1f;
		this.name = "Minor Health Potion";
	}
	@Override
	public void use(GameCharacter target)
	{
		target.doDamage(-this.getEffect());
	}

	@Override
	public int getBaseEffect() 
	{
		
		return this.baseEffect;
	}

	@Override
	public int getMaxEffect() 
	{
		//Kinda made this up.... will need to work out math later
		return this.baseEffect + (int)(this.effectMultiplier * 20);
	}

	@Override
	public int getEffect() 
	{
		Random rand = new Random();
		return this.baseEffect + (int)(this.effectMultiplier * (rand.nextInt() % 20));
	}

	@Override
	public String getName() 
	{
		return this.name;
	}

}
