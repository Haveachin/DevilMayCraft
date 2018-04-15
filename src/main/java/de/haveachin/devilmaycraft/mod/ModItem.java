package de.haveachin.devilmaycraft.mod;

import de.haveachin.devilmaycraft.Main;
import de.haveachin.devilmaycraft.init.Items;
import de.haveachin.devilmaycraft.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ModItem extends Item implements IHasModel
{
	public ModItem(String name, CreativeTabs creativeTab)
	{
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setCreativeTab(creativeTab);
		
		Items.ITEMS.add(this);
	}
	
	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
