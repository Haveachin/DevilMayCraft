package de.haveachin.devilmaycraft.init;

import de.haveachin.devilmaycraft.mod.ModBlock;
import de.haveachin.devilmaycraft.mod.ModTab;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Tabs
{
	// All tabs go here
	public static final CreativeTabs DMCTab = new ModTab("dmc_tab", new ItemStack(Item.getItemFromBlock(Blocks.TEST_BLOCK)));
}
