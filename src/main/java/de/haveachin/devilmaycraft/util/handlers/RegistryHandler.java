package de.haveachin.devilmaycraft.util.handlers;

import java.util.List;

import de.haveachin.devilmaycraft.init.Blocks;
import de.haveachin.devilmaycraft.init.Items;
import de.haveachin.devilmaycraft.mod.ModBlock;
import de.haveachin.devilmaycraft.mod.ModItem;
import de.haveachin.devilmaycraft.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegistryHandler
{
	@SubscribeEvent
	public static void onItemRegistry(RegistryEvent.Register<Item> e)
	{
		e.getRegistry().registerAll(Items.ITEMS.toArray(new Item[0]));
	}
	
	@SubscribeEvent
	public static void onBlockRegistry(RegistryEvent.Register<Block> e)
	{
		e.getRegistry().registerAll(Blocks.BLOCKS.toArray(new Block[0]));
	}
	
	@SubscribeEvent
	public static void onModelRegistry(ModelRegistryEvent e)
	{
		registerModel(Items.ITEMS);
		registerModel(Blocks.BLOCKS);
	}
	
	private static <T> void registerModel(List<T> entities)
	{
		for (T entity : entities)
		{
			if (entity instanceof IHasModel)
			{
				((IHasModel) entity).registerModels();
			}
		}
	}
}
