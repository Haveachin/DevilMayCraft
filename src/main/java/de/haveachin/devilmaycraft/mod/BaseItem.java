package de.haveachin.devilmaycraft.mod;

import de.haveachin.devilmaycraft.Main;
import de.haveachin.devilmaycraft.init.ModItems;
import de.haveachin.devilmaycraft.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BaseItem extends Item implements IHasModel
{
	public BaseItem(String name, CreativeTabs creativeTab)
	{
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setCreativeTab(creativeTab);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
