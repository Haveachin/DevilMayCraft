package de.haveachin.devilmaycraft.util.handlers;

import de.haveachin.devilmaycraft.init.Items;
import de.haveachin.devilmaycraft.util.IHasModel;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class ItemRegistryHandler
{
	@SubscribeEvent
	public static void onItemRegistry(RegistryEvent.Register<Item> e)
	{
		e.getRegistry().registerAll(Items.ITEMS.toArray(new Item[0]));
	}
	
	@SubscribeEvent
	public static void onModelRegistry(ModelRegistryEvent e)
	{
		for (Item item : Items.ITEMS)
		{
			if (item instanceof IHasModel)
			{
				((IHasModel) item).registerModels();
			}
		}
	}
}
