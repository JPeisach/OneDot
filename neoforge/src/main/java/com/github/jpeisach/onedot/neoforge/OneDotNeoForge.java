package com.github.jpeisach.onedot.neoforge;

import com.github.jpeisach.OneDotMod;
import net.neoforged.fml.common.Mod;

@Mod(OneDotMod.MOD_ID)
public final class OneDotNeoForge {
    public OneDotNeoForge() {
        // Do our thang
        OneDotMod.replaceVersion();
    }
}
