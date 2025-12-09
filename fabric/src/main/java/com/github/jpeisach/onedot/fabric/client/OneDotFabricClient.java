package com.github.jpeisach.onedot.fabric.client;

import com.github.jpeisach.OneDotMod;
import net.fabricmc.api.ClientModInitializer;

public final class OneDotFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // Basically, on our client side, replace version
        OneDotMod.replaceVersion();
    }
}
