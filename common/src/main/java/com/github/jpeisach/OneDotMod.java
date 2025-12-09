package com.github.jpeisach;

import net.minecraft.SharedConstants;
import net.minecraft.WorldVersion;

public final class OneDotMod {
    public static final String MOD_ID = "onedot";

    public static void replaceVersion() {
        WorldVersion worldVersion = SharedConstants.getCurrentVersion();

        // Trigger our version replacement
        SharedConstants.setVersion(worldVersion);
    }
}
