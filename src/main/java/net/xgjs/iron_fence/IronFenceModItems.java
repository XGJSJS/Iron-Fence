package net.xgjs.iron_fence;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class IronFenceModItems {
	public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(IronFenceMod.MOD_ID);
	public static final DeferredItem<BlockItem> IRON_FENCE;
	public static final DeferredItem<BlockItem> IRON_FENCE_GATE;
	public static final DeferredItem<BlockItem> NETHERITE_FENCE;
	public static final DeferredItem<BlockItem> NETHERITE_FENCE_GATE;
	public static final DeferredItem<BlockItem> DIAMOND_FENCE;
	public static final DeferredItem<BlockItem> DIAMOND_FENCE_GATE;
	public static final DeferredItem<BlockItem> GOLD_FENCE;
	public static final DeferredItem<BlockItem> GOLD_FENCE_GATE;
	public static final DeferredItem<BlockItem> EMERALD_FENCE;
	public static final DeferredItem<BlockItem> EMERALD_FENCE_GATE;
	public static final DeferredItem<BlockItem> COPPER_FENCE;
	public static final DeferredItem<BlockItem> COPPER_FENCE_GATE;

	private static DeferredItem<BlockItem> register(DeferredBlock<Block> block) {
		return ITEMS.registerSimpleBlockItem(block);
	}

	static {
		IRON_FENCE = register(IronFenceModBlocks.IRON_FENCE);
		IRON_FENCE_GATE = register(IronFenceModBlocks.IRON_FENCE_GATE);
		NETHERITE_FENCE = register(IronFenceModBlocks.NETHERITE_FENCE);
		NETHERITE_FENCE_GATE = register(IronFenceModBlocks.NETHERITE_FENCE_GATE);
		DIAMOND_FENCE = register(IronFenceModBlocks.DIAMOND_FENCE);
		DIAMOND_FENCE_GATE = register(IronFenceModBlocks.DIAMOND_FENCE_GATE);
		GOLD_FENCE = register(IronFenceModBlocks.GOLD_FENCE);
		GOLD_FENCE_GATE = register(IronFenceModBlocks.GOLD_FENCE_GATE);
		EMERALD_FENCE = register(IronFenceModBlocks.EMERALD_FENCE);
		EMERALD_FENCE_GATE = register(IronFenceModBlocks.EMERALD_FENCE_GATE);
		COPPER_FENCE = register(IronFenceModBlocks.COPPER_FENCE);
		COPPER_FENCE_GATE = register(IronFenceModBlocks.COPPER_FENCE_GATE);
	}
}