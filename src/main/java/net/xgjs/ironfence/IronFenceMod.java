package net.xgjs.ironfence;

import net.fabricmc.api.ModInitializer;

import net.xgjs.ironfence.init.IronFenceModBlocks;
import net.xgjs.ironfence.init.IronFenceModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IronFenceMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("iron_fence");
	public static final String MOD_ID = "iron_fence";

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Iron Fence load");
		LOGGER.info("[Iron Fence]This is an experimental version, please backup before use.");

		IronFenceModBlocks.load();
		IronFenceModItems.load();
	}
}