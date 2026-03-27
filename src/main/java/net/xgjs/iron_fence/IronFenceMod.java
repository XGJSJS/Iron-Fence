package net.xgjs.iron_fence;

import net.fabricmc.api.ModInitializer;

import net.xgjs.iron_fence.init.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IronFenceMod implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("iron_fence");
	public static final String MOD_ID = "iron_fence";

	@Override
	public void onInitialize() {
		LOGGER.info("Iron Fence load");
		LOGGER.info("[Iron Fence]This is an experimental version, please backup before use.");

		IronFenceModBlocks.load();
		IronFenceModItems.load();
	}
}