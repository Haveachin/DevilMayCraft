package de.haveachin.devilmaycraft.util.handlers;

import java.util.List;

import de.haveachin.devilmaycraft.init.ModBlocks;
import de.haveachin.devilmaycraft.init.ModItems;
import de.haveachin.devilmaycraft.mod.BaseBlock;
import de.haveachin.devilmaycraft.mod.BaseItem;
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
		e.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
	}
	
	@SubscribeEvent
	public static void onBlockRegistry(RegistryEvent.Register<Block> e)
	{
		e.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));
	}
	
	@SubscribeEvent
	public static void onBlockRedfgistry()
	{
		e.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));
	}
	
	@SubscribeEvent
	public static void onModelRegistry(ModelRegistryEvent e)
	{
		registerModel(ModItems.ITEMS);
		registerModel(ModBlocks.BLOCKS);
	}
	
	private static <T> void registerModel(List<T> objects)
	{
		for (T object : objects)
		{
			if (object instanceof IHasModel)
			{
				((IHasModel) object).registerModels();
			}
		}
	}
}
