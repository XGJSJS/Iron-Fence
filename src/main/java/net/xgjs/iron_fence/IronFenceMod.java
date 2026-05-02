package net.xgjs.iron_fence;

import net.fabricmc.api.ModInitializer;

import net.xgjs.iron_fence.init.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IronFenceMod implements ModInitializer {
	public static final String MOD_ID = "iron_fence";
	public static final String MOD_NAME = "Iron Fence";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_NAME);

	@Override
	public void onInitialize() {
		IronFenceModBlocks.load();
		IronFenceModItems.load();
	}
}