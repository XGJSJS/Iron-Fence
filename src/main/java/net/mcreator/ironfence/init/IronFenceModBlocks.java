
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ironfence.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.ironfence.IronFenceMod;

import net.mcreator.ironfence.block.IronFenceBlock;
import net.mcreator.ironfence.block.IronFenceGateBlock;

public class IronFenceModBlocks {
	public static Block IRON_FENCE;
	public static Block IRON_FENCE_GATE;
	//public static final Block IRON_FENCE_GATE = BLOCKS.register("iron_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_FENCE_GATE).sound(SoundType.METAL).lightLevel(state -> 0), SoundEvents.FENCE_GATE_CLOSE, SoundEvents.FENCE_GATE_OPEN));

	public static void load() {
		IRON_FENCE = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(IronFenceMod.MODID, "iron_fence"), new IronFenceBlock());
		IRON_FENCE_GATE = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(IronFenceMod.MODID, "iron_fence_gate"), new IronFenceGateBlock());
	}

	public static void clientLoad() {
		IronFenceBlock.clientInit();
		IronFenceGateBlock.clientInit();
	}
}
