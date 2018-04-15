package de.haveachin.devilmaycraft.items;

import de.haveachin.devilmaycraft.Main;
import de.haveachin.devilmaycraft.init.ModItems;
import de.haveachin.devilmaycraft.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ModItem extends Item implements IHasModel
{
	public ModItem(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.COMBAT);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
