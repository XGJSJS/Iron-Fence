package net.xgjs.iron_fence;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class IronFenceModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(IronFenceMod.MOD_ID);
	public static final DeferredItem<BlockItem> IRON_FENCE = block(IronFenceModBlocks.IRON_FENCE);
	public static final DeferredItem<BlockItem> IRON_FENCE_GATE = block(IronFenceModBlocks.IRON_FENCE_GATE);
	public static final DeferredItem<BlockItem> NETHERITE_FENCE = block(IronFenceModBlocks.NETHERITE_FENCE);
	public static final DeferredItem<BlockItem> NETHERITE_FENCE_GATE = block(IronFenceModBlocks.NETHERITE_FENCE_GATE);

	private static DeferredItem<BlockItem> block(DeferredBlock<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
