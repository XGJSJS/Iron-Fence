
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ironfence.init;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.ironfence.IronFenceMod;

public class IronFenceModItems {
	public static Item IRON_FENCE;
	public static Item IRON_FENCE_GATE;

	public static void load() {
		IRON_FENCE = Registry.register(Registry.ITEM, new ResourceLocation(IronFenceMod.MODID, "iron_fence"),
				new BlockItem(IronFenceModBlocks.IRON_FENCE, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
		IRON_FENCE_GATE = Registry.register(Registry.ITEM, new ResourceLocation(IronFenceMod.MODID, "iron_fence_gate"),
				new BlockItem(IronFenceModBlocks.IRON_FENCE_GATE, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
	}
}
