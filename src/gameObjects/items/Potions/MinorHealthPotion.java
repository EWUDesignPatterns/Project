package gameObjects.items.Potions;



import gameObjects.ICharacter;
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
	public void use(ICharacter target)
	{
		target.heal(this.getEffect());
	}




}
