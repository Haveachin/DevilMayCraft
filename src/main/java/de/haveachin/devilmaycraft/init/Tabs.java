package de.haveachin.devilmaycraft.init;

import java.util.ArrayList;
import java.util.List;

import de.haveachin.devilmaycraft.mod.ModTab;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Tabs
{
	//public static final List<Item> TABS = new ArrayList<Item>();
	
	// All tabs go here
	public static final CreativeTabs DMCTab = new ModTab("dmc_tab", new ItemStack(Items.CARROT));
}
