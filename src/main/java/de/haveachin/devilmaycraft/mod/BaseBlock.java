package de.haveachin.devilmaycraft.mod;

import de.haveachin.devilmaycraft.Main;
import de.haveachin.devilmaycraft.init.ModBlocks;
import de.haveachin.devilmaycraft.init.ModItems;
import de.haveachin.devilmaycraft.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public abstract class BaseBlock extends Block implements IHasModel
{
	public BaseBlock(String name, Material material, CreativeTabs creativeTab)
	{
		super(material);
		
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setCreativeTab(creativeTab);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(name));
	}
	
	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}
