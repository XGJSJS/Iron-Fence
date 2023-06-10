
package net.xgjs.iron_fence.init;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.xgjs.iron_fence.IronFenceMod;

public class IronFenceModItems {
	public static final Item IRON_FENCE = blockItemi(IronFenceModBlocks.IRON_FENCE);
	public static final Item IRON_FENCE_GATE = blockItemi(IronFenceModBlocks.IRON_FENCE_GATE);
	public static final Item NETHERITE_FENCE = blockItemi(IronFenceModBlocks.NETHERITE_FENCE);
	public static final Item NETHERITE_FENCE_GATE = blockItemi(IronFenceModBlocks.NETHERITE_FENCE_GATE);
	public static void load() {
		register("iron_fence", IRON_FENCE);
		register("iron_fence_gate", IRON_FENCE_GATE);
		register("netherite_fence", NETHERITE_FENCE);
		register("netherite_fence_gate", NETHERITE_FENCE_GATE);
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {
			content.add(itemi(IRON_FENCE));
			content.add(itemi(IRON_FENCE_GATE));
			content.add(itemi(NETHERITE_FENCE));
			content.add(itemi(NETHERITE_FENCE_GATE));
		});
	}

	public static Item blockItemi(Block block) {
		return new BlockItem(block, new FabricItemSettings());
	}

	public static ItemStack itemi(Item item) {
		return new ItemStack(item);
	}

	private static void register(String id, Item item) {
		Registry.register(Registries.ITEM, new Identifier(IronFenceMod.MOD_ID, id), item);
	}
}
