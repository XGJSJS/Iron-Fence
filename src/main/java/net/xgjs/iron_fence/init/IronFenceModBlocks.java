package net.xgjs.iron_fence.init;

import net.minecraft.block.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.xgjs.iron_fence.IronFenceMod;

public class IronFenceModBlocks {
	public static final WoodType METAL = new WoodType("metal", BlockSetType.IRON, BlockSoundGroup.METAL, BlockSoundGroup.METAL, SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
	public static final Block IRON_FENCE;
	public static final Block IRON_FENCE_GATE;
	public static final Block NETHERITE_FENCE;
	public static final Block NETHERITE_FENCE_GATE;
	public static final Block DIAMOND_FENCE;
	public static final Block DIAMOND_FENCE_GATE;
	public static final Block GOLD_FENCE;
	public static final Block GOLD_FENCE_GATE;
	public static final Block EMERALD_FENCE;
	public static final Block EMERALD_FENCE_GATE;

	public static void load() {}

	public static Block register(String id, Block block) {
		return Registry.register(Registries.BLOCK, Identifier.of(IronFenceMod.MOD_ID, id), block);
	}

	public static Block registerFence(String id, Block copy) {
		return register(id + "_fence", new FenceBlock(AbstractBlock.Settings.copy(copy)));
	}

	public static Block registerFenceGate(String id, Block copy) {
		return register(id + "_fence_gate", new FenceGateBlock(METAL, AbstractBlock.Settings.copy(copy)));
	}

	static {
		IRON_FENCE = registerFence("iron", Blocks.IRON_BLOCK);
		IRON_FENCE_GATE = registerFenceGate("iron", Blocks.IRON_BLOCK);
		NETHERITE_FENCE = registerFence("netherite", Blocks.NETHERITE_BLOCK);
		NETHERITE_FENCE_GATE = registerFenceGate("netherite", Blocks.NETHERITE_BLOCK);
		DIAMOND_FENCE = registerFence("diamond", Blocks.DIAMOND_BLOCK);
		DIAMOND_FENCE_GATE = registerFenceGate("diamond", Blocks.DIAMOND_BLOCK);
		GOLD_FENCE = registerFence("gold", Blocks.GOLD_BLOCK);
		GOLD_FENCE_GATE = registerFenceGate("gold", Blocks.GOLD_BLOCK);
		EMERALD_FENCE = registerFence("emerald", Blocks.EMERALD_BLOCK);
		EMERALD_FENCE_GATE = registerFenceGate("emerald", Blocks.EMERALD_BLOCK);
	}
}