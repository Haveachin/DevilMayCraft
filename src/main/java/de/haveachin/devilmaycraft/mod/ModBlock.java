package de.haveachin.devilmaycraft.mod;

import de.haveachin.devilmaycraft.Main;
import de.haveachin.devilmaycraft.init.Blocks;
import de.haveachin.devilmaycraft.init.Items;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class ModBlock extends Block
{
	public ModBlock(String name, Material material, CreativeTabs creativeTab)
	{
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setCreativeTab(creativeTab);
		
		Blocks.BLOCKS.add(this);
	}
	
	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
