package de.haveachin.devilmaycraft.init;

import java.util.ArrayList;
import java.util.List;

import de.haveachin.devilmaycraft.mod.blocks.TestBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class ModBlocks
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	// All blocks go here
	public static final Block TEST_BLOCK = new TestBlock("test_block", Material.ROCK, CreativeTabs.BUILDING_BLOCKS);
}
