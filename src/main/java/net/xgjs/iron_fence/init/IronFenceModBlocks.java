package net.xgjs.iron_fence.init;

import net.minecraft.block.*;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.xgjs.iron_fence.IronFenceMod;

public class IronFenceModBlocks {
	public static final WoodType IRON = new WoodType("iron", BlockSetType.IRON, BlockSoundGroup.METAL, BlockSoundGroup.METAL, SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
	public static final WoodType NETHERITE = new WoodType("netherite", BlockSetType.IRON, BlockSoundGroup.METAL, BlockSoundGroup.METAL, SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
	public static final Block IRON_FENCE = new FenceBlock(blockSetting(Blocks.IRON_BLOCK));
	public static final Block IRON_FENCE_GATE = new FenceGateBlock(IRON, blockSetting(Blocks.IRON_BLOCK));
	public static final Block NETHERITE_FENCE = new FenceBlock(blockSetting(Blocks.NETHERITE_BLOCK));
	public static final Block NETHERITE_FENCE_GATE = new FenceGateBlock(NETHERITE, blockSetting(Blocks.NETHERITE_BLOCK));

	public static void load() {
		Registry.register(Registries.BLOCK, id("iron_fence"), IRON_FENCE);
		Registry.register(Registries.BLOCK, id("iron_fence_gate"), IRON_FENCE_GATE);
		Registry.register(Registries.BLOCK, id("netherite_fence"), NETHERITE_FENCE);
		Registry.register(Registries.BLOCK, id("netherite_fence_gate"), NETHERITE_FENCE_GATE);
	}

	public static AbstractBlock.Settings blockSetting(Block block) {
		return AbstractBlock.Settings.copy(block);
	}

	public static Identifier id(String id) {
		return Identifier.of(IronFenceMod.MOD_ID, id);
	}
}