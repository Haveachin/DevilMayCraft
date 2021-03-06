package de.haveachin.devilmaycraft;

import org.apache.logging.log4j.Logger;

import de.haveachin.devilmaycraft.proxy.CommonProxy;
import de.haveachin.devilmaycraft.util.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main
{
	@Mod.Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static Logger logger;
	
	@Mod.EventHandler
	public static void preInit(FMLPreInitializationEvent e)
	{
		logger = e.getModLog();
	}
	
	@Mod.EventHandler
	public static void init(FMLInitializationEvent e) { }
	
	@Mod.EventHandler
	public static void postInit(FMLPostInitializationEvent e) { }
}
