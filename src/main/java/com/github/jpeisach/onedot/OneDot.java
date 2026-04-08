package com.github.jpeisach.onedot;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(OneDot.MODID)
public class OneDot {

    // Define mod id in a common place for everything to reference
    public static final String MODID = "onedot";

    public OneDot(IEventBus modEventBus, ModContainer modContainer) {
        // Not needed
    }
}
