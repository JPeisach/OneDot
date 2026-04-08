package com.github.jpeisach.onedot;

import net.minecraft.SharedConstants;
import net.minecraft.WorldVersion;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

// This class will not load on dedicated servers. Accessing client side code from here is safe.
@Mod(value = OneDot.MODID, dist = Dist.CLIENT)
@EventBusSubscriber(modid = OneDot.MODID, value = Dist.CLIENT)
public class OneDotClient {

    public OneDotClient(ModContainer container) {}

    @SubscribeEvent
    static void onClientSetup(FMLClientSetupEvent event) {
        // This is the entire mod.
        WorldVersion worldVersion = SharedConstants.getCurrentVersion();

        // Trigger our version replacement
        SharedConstants.setVersion(worldVersion);
    }
}
