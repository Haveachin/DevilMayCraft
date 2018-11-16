package de.haveachin.devilmaycraft.init;

import java.util.ArrayList;
import java.util.List;

import de.haveachin.devilmaycraft.mod.BaseItem;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ModItems
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	// All items go here
	public static final Item TEST_ITEM = new BaseItem("test_item", CreativeTabs.MISC);
}
