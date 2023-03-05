
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ironfence.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.ironfence.IronFenceMod;

public class IronFenceModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, IronFenceMod.MODID);
	public static final RegistryObject<Item> IRON_FENCE = block(IronFenceModBlocks.IRON_FENCE);
	//public static final RegistryObject<Item> IRON_FENCE = new BlockItem(IronFenceModBlocks.IRON_FENCE.get(), new Item.Properties());
	public static final RegistryObject<Item> IRON_FENCE_GATE = block(IronFenceModBlocks.IRON_FENCE_GATE);
	public static final RegistryObject<Item> NETHERITE_FENCE = block(IronFenceModBlocks.NETHERITE_FENCE);
	public static final RegistryObject<Item> NETHERITE_FENCE_GATE = block(IronFenceModBlocks.NETHERITE_FENCE_GATE);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
