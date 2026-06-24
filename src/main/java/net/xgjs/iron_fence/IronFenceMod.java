package net.xgjs.iron_fence;

import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.xgjs.iron_fence.init.IronFenceModBlocks;
import net.xgjs.iron_fence.init.IronFenceModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(IronFenceMod.MOD_ID)
public class IronFenceMod {
	public static final String MOD_ID = "iron_fence";
	public static final String MOD_NAME = "Iron Fence";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_NAME);

	public IronFenceMod(IEventBus modEventBus) {
		IronFenceModBlocks.BLOCKS.register(modEventBus);
		IronFenceModItems.ITEMS.register(modEventBus);
		modEventBus.addListener(this::addCreativeTab);
	}

	private void addCreativeTab(BuildCreativeModeTabContentsEvent event) {
		if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			event.accept(IronFenceModBlocks.IRON_FENCE);
			event.accept(IronFenceModBlocks.IRON_FENCE_GATE);
			event.accept(IronFenceModBlocks.NETHERITE_FENCE);
			event.accept(IronFenceModBlocks.NETHERITE_FENCE_GATE);
			event.accept(IronFenceModBlocks.DIAMOND_FENCE);
			event.accept(IronFenceModBlocks.DIAMOND_FENCE_GATE);
			event.accept(IronFenceModBlocks.GOLD_FENCE);
			event.accept(IronFenceModBlocks.GOLD_FENCE_GATE);
			event.accept(IronFenceModBlocks.EMERALD_FENCE);
			event.accept(IronFenceModBlocks.EMERALD_FENCE_GATE);
			IronFenceModBlocks.COPPER_FENCES.forEach(event::accept);
			IronFenceModBlocks.COPPER_FENCE_GATES.forEach(event::accept);
		}
	}
}