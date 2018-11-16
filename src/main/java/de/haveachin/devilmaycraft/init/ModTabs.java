package de.haveachin.devilmaycraft.init;

import de.haveachin.devilmaycraft.mod.BaseBlock;
import de.haveachin.devilmaycraft.mod.BaseTab;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ModTabs
{
	// All tabs go here
	public static final CreativeTabs DMCTab = new BaseTab("dmc_tab", new ItemStack(Item.getItemFromBlock(ModBlocks.TEST_BLOCK)));
}
