package de.haveachin.devilmaycraft.mod;

import de.haveachin.devilmaycraft.Main;
import de.haveachin.devilmaycraft.init.Blocks;
import de.haveachin.devilmaycraft.init.Items;
import de.haveachin.devilmaycraft.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public abstract class ModBlock extends Block implements IHasModel
{
	public ModBlock(String name, Material material, CreativeTabs creativeTab)
	{
		super(material);
		
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setCreativeTab(creativeTab);
		
		Blocks.BLOCKS.add(this);
		Items.ITEMS.add(new ItemBlock(this).setRegistryName(name));
	}
	
	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}
