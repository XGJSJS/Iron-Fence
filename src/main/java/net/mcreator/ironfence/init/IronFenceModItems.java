
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ironfence.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.ironfence.IronFenceMod;

public class IronFenceModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, IronFenceMod.MODID);
	public static final RegistryObject<Item> IRON_FENCE = block(IronFenceModBlocks.IRON_FENCE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> IRON_FENCE_GATE = block(IronFenceModBlocks.IRON_FENCE_GATE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> NETHERITE_FENCE = block(IronFenceModBlocks.NETHERITE_FENCE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> NETHERITE_FENCE_GATE = block(IronFenceModBlocks.NETHERITE_FENCE_GATE,
			CreativeModeTab.TAB_BUILDING_BLOCKS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
