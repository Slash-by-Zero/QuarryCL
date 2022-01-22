package com.sbz.quarrycl;

import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = QuarryCL.MODID, name = QuarryCL.NAME, version = QuarryCL.VERSION)
public class QuarryCL
{
    public static final String MODID = "quarry";
    public static final String NAME = "QuarryCL";
    public static final String VERSION = "0.0";

    private static Logger logger;


    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event){
        ClientRegistry.registerKeyBinding(new XRay());
    }
}
