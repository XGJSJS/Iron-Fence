
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ironfence.init;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.ironfence.IronFenceMod;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public class IronFenceModItems {
	public static Item IRON_FENCE;
	public static Item IRON_FENCE_GATE;

	public static void load() {
		IRON_FENCE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(IronFenceMod.MODID, "iron_fence"), new BlockItem(IronFenceModBlocks.IRON_FENCE, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(entries -> entries.accept(IRON_FENCE));
		IRON_FENCE_GATE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(IronFenceMod.MODID, "iron_fence_gate"), new BlockItem(IronFenceModBlocks.IRON_FENCE_GATE, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(entries -> entries.accept(IRON_FENCE_GATE));
	}
}
