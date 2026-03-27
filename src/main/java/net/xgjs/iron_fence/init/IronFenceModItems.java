package net.xgjs.iron_fence.init;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class IronFenceModItems {
	public static final Item IRON_FENCE;
	public static final Item IRON_FENCE_GATE;
	public static final Item NETHERITE_FENCE;
	public static final Item NETHERITE_FENCE_GATE;
	public static final Item DIAMOND_FENCE;
	public static final Item DIAMOND_FENCE_GATE;
	public static final Item GOLD_FENCE;
	public static final Item GOLD_FENCE_GATE;
	public static final Item EMERALD_FENCE;
	public static final Item EMERALD_FENCE_GATE;
	public static final Item COPPER_FENCE;
	public static final Item COPPER_FENCE_GATE;

	public static void load() {}

	private static Item register(Block block) {
		Identifier id = BuiltInRegistries.BLOCK.getKey(block);
		final Item item = Registry.register(BuiltInRegistries.ITEM, id, new BlockItem(block, new Item.Properties().setId(ResourceKey.create(Registries.ITEM, id)).useBlockDescriptionPrefix()));
		CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> content.accept(item));
		return item;
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