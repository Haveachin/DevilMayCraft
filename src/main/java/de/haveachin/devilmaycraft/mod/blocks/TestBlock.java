package de.haveachin.devilmaycraft.mod.blocks;

import de.haveachin.devilmaycraft.mod.BaseBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class TestBlock extends BaseBlock
{
	public TestBlock(String name, Material material, CreativeTabs creativeTab)
	{
		super(name, material, creativeTab);
		
		setSoundType(SoundType.GLASS);
		setHardness(1.0f);
		setResistance(15.0f);
		setHarvestLevel("pickaxe", 2);
		setLightLevel(1.0F);
		setLightOpacity(1);
		//setBlockUnbreakable();
	}
}
