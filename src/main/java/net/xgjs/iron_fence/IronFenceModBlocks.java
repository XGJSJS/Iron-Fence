package net.xgjs.iron_fence;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Function;

public class IronFenceModBlocks {
	public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(IronFenceMod.MOD_ID);
	public static final WoodType METAL;
	public static final DeferredBlock<Block> IRON_FENCE;
	public static final DeferredBlock<Block> IRON_FENCE_GATE;
	public static final DeferredBlock<Block> NETHERITE_FENCE;
	public static final DeferredBlock<Block> NETHERITE_FENCE_GATE;
	public static final DeferredBlock<Block> DIAMOND_FENCE;
	public static final DeferredBlock<Block> DIAMOND_FENCE_GATE;
	public static final DeferredBlock<Block> GOLD_FENCE;
	public static final DeferredBlock<Block> GOLD_FENCE_GATE;
	public static final DeferredBlock<Block> EMERALD_FENCE;
	public static final DeferredBlock<Block> EMERALD_FENCE_GATE;
	public static final WeatheringDeferredCopperBlocks COPPER_FENCES;
	public static final WeatheringDeferredCopperBlocks COPPER_FENCE_GATES;

	public static DeferredBlock<Block> register(String id, Function<BlockBehaviour.Properties, Block> factory, BlockBehaviour.Properties settings) {
        return BLOCKS.registerBlock(id, factory, () -> settings);
	}

	public static DeferredBlock<Block> registerFence(String id, Block copy) {
		return register(id + "_fence", FenceBlock::new, BlockBehaviour.Properties.ofFullCopy(copy));
	}

	public static DeferredBlock<Block> registerFenceGate(String id, Block copy) {
		return register(id + "_fence_gate", settings -> new FenceGateBlock(METAL, settings), BlockBehaviour.Properties.ofFullCopy(copy));
	}

	static {
		METAL = WoodType.register(new WoodType("metal", BlockSetType.IRON, SoundType.METAL, SoundType.METAL, SoundEvents.FENCE_GATE_CLOSE, SoundEvents.FENCE_GATE_OPEN));

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
		COPPER_FENCES = WeatheringDeferredCopperBlocks.create("copper_fence",
				BLOCKS, FenceBlock::new, WeatheringCopperFenceBlock::new,
                state -> BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_BLOCK.weathering().pick(state)));
		COPPER_FENCE_GATES = WeatheringDeferredCopperBlocks.create("copper_fence_gate",
				BLOCKS, settings -> new FenceGateBlock(METAL, settings), WeatheringCopperFenceGateBlock::new,
				state -> BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_BLOCK.weathering().pick(state)));
	}
}