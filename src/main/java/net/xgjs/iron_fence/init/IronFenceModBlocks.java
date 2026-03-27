package net.xgjs.iron_fence.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.xgjs.iron_fence.IronFenceMod;

import java.util.function.Function;

public class IronFenceModBlocks {
	public static final WoodType METAL = new WoodType("metal", BlockSetType.IRON, SoundType.METAL, SoundType.METAL, SoundEvents.FENCE_GATE_CLOSE, SoundEvents.FENCE_GATE_OPEN);
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
	public static final Block COPPER_FENCE;
	public static final Block COPPER_FENCE_GATE;

	public static void load() {}

	public static Block register(String id, Function<BlockBehaviour.Properties, Block> factory, BlockBehaviour.Properties settings) {
		final ResourceKey<Block> key = ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(IronFenceMod.MOD_ID, id));
        return Blocks.register(key, factory, settings);
	}

	public static Block registerFence(String id, Block copy) {
		return register(id + "_fence", FenceBlock::new, BlockBehaviour.Properties.ofFullCopy(copy));
	}

	public static Block registerFenceGate(String id, Block copy) {
		return register(id + "_fence_gate", settings -> new FenceGateBlock(METAL, settings), BlockBehaviour.Properties.ofFullCopy(copy));
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
		COPPER_FENCE = registerFence("copper", Blocks.COPPER_BLOCK);
		COPPER_FENCE_GATE = registerFenceGate("copper", Blocks.COPPER_BLOCK);
	}
}