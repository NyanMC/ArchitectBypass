package com.chromanyan.architectbypass;

import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(ArchitectBypass.MODID)
public class ArchitectBypass
{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "architectbypass";

    public ArchitectBypass()
    {
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }
}
