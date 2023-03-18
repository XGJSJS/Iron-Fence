
package net.xgjs.ironfence.init;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.xgjs.ironfence.IronFenceMod;

import net.xgjs.ironfence.block.*;

public class IronFenceModBlocks {
	public static final WoodType IRON = new WoodType("iron", BlockSetType.IRON, BlockSoundGroup.METAL, BlockSoundGroup.METAL, SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
	public static final WoodType NETHERITE = new WoodType("netherite", BlockSetType.IRON, BlockSoundGroup.METAL, BlockSoundGroup.METAL, SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
	public static final Block IRON_FENCE = new IronFence(blockis(Blocks.IRON_BLOCK));
	public static final Block IRON_FENCE_GATE = new IronFenceGate(blockis(Blocks.IRON_BLOCK), IRON);
	public static final Block NETHERITE_FENCE = new NetheriteFence(blockis(Blocks.NETHERITE_BLOCK));
	public static final Block NETHERITE_FENCE_GATE = new NetheriteFenceGate(blockis(Blocks.NETHERITE_BLOCK), NETHERITE);

	public static void load() {
		Registry.register(Registries.BLOCK, id("iron_fence"), IRON_FENCE);
		Registry.register(Registries.BLOCK, id("iron_fence_gate"), IRON_FENCE_GATE);
		Registry.register(Registries.BLOCK, id("netherite_fence"), NETHERITE_FENCE);
		Registry.register(Registries.BLOCK, id("netherite_fence_gate"), NETHERITE_FENCE_GATE);
	}

	public static AbstractBlock.Settings blockis(Block block) {
		return FabricBlockSettings.copy(block);
	}

	public static Identifier id(String id) {
		return new Identifier(IronFenceMod.MOD_ID, id);
	}
}
