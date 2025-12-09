package com.github.jpeisach.onedot.mixin;

import net.minecraft.SharedConstants;
import net.minecraft.WorldVersion;
import net.minecraft.server.packs.PackType;
import net.minecraft.server.packs.metadata.pack.PackFormat;
import net.minecraft.world.level.storage.DataVersion;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

import java.util.Date;

@Mixin(SharedConstants.class)
public class SharedConstantsMixin {
    @Shadow @Nullable private static WorldVersion CURRENT_VERSION;

    @ModifyVariable(method = "setVersion", at = @At("HEAD"))
    private static WorldVersion restoreWorldVersion(WorldVersion version) {
        CURRENT_VERSION = new WorldVersion() {
            @Override
            public DataVersion dataVersion() {
                return version.dataVersion();
            }

            @Override
            public String id() {
                return version.id();
            }

            // This is literally all the mod does basically.
            @Override
            public String name() {
                return "1." + version.name();
            }

            @Override
            public int protocolVersion() {
                return version.protocolVersion();
            }

            @Override
            public PackFormat packVersion(PackType packType) {
                return version.packVersion(packType);
            }

            @Override
            public Date buildTime() {
                return version.buildTime();
            }

            @Override
            public boolean stable() {
                return version.stable();
            }
        };
        return CURRENT_VERSION;
    }
}
