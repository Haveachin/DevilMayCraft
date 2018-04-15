package de.haveachin.devilmaycraft.init;

import java.util.ArrayList;
import java.util.List;

import de.haveachin.devilmaycraft.mod.ModItem;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Items extends Objects<Items>
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	// All items go here
	public static final Item SOUL_DAGGER = new ModItem("soul_dagger", CreativeTabs.COMBAT);
}
