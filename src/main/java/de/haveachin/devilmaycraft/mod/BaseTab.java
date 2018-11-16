package de.haveachin.devilmaycraft.mod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class BaseTab extends CreativeTabs
{
	private ItemStack tabIconItem;
	
	public BaseTab(String name, ItemStack tabIconItem)
	{
		super(name);
		
		this.tabIconItem = tabIconItem;
	}
	
	public BaseTab(String name, ItemStack tabIconItem, String bgImage)
	{
		this(name, tabIconItem);
		
		if (bgImage != "")
			this.setBackgroundImageName(bgImage);
	}

	@Override
	public ItemStack getTabIconItem()
	{
		return tabIconItem;
	}
}
