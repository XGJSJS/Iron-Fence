
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ironfence.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.ironfence.block.IronFenceGateBlock;
import net.mcreator.ironfence.block.IronFenceBlock;
import net.mcreator.ironfence.IronFenceMod;

public class IronFenceModBlocks {
	public static Block IRON_FENCE;
	public static Block IRON_FENCE_GATE;

	public static void load() {
		IRON_FENCE = Registry.register(Registry.BLOCK, new ResourceLocation(IronFenceMod.MODID, "iron_fence"), new IronFenceBlock());
		IRON_FENCE_GATE = Registry.register(Registry.BLOCK, new ResourceLocation(IronFenceMod.MODID, "iron_fence_gate"), new IronFenceGateBlock());
	}

	public static void clientLoad() {
		IronFenceBlock.clientInit();
		IronFenceGateBlock.clientInit();
	}
}
