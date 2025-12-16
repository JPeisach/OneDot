package com.github.jpeisach.onedot;

import net.fabricmc.api.ClientModInitializer;

import net.minecraft.SharedConstants;
import net.minecraft.WorldVersion;

public class OneDotClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// This is the entire mod.

		WorldVersion worldVersion = SharedConstants.getCurrentVersion();

		// Trigger our version replacement
		SharedConstants.setVersion(worldVersion);
	}
}