package net.xgjs.iron_fence.init;

import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;
import net.minecraft.references.BlockItemId;
import net.minecraft.resources.Identifier;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.xgjs.iron_fence.IronFenceMod;
import net.xgjs.iron_fence.block.WeatheringCopperFenceBlock;
import net.xgjs.iron_fence.block.WeatheringCopperFenceGateBlock;

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
	public static final WeatheringCopperCollection<Block> COPPER_FENCES;
	public static final WeatheringCopperCollection<Block> COPPER_FENCE_GATES;

	public static void load() {}

	private static Identifier create(String baseName) {
		return Identifier.fromNamespaceAndPath(IronFenceMod.MOD_ID, baseName);
	}

	public static Block register(String name, Function<BlockBehaviour.Properties, Block> factory, BlockBehaviour.Properties settings) {
		final Identifier id = create(name);
        return register(BlockItemId.create(id, id), factory, settings);
	}

	public static Block register(BlockItemId id, Function<BlockBehaviour.Properties, Block> factory, BlockBehaviour.Properties settings) {
		return Blocks.register(id.block(), factory, settings);
	}

	public static Block registerFence(String id, Block copy) {
		return register(id + "_fence", FenceBlock::new, BlockBehaviour.Properties.ofFullCopy(copy));
	}

	public static Block registerFenceGate(String id, Block copy) {
		return register(id + "_fence_gate", settings -> new FenceGateBlock(METAL, settings), BlockBehaviour.Properties.ofFullCopy(copy));
	}

	public static WeatheringCopperCollection<BlockItemId> createSimpleCopper(final String baseName) {
		return WeatheringCopperCollection.prefixWithState(WeatheringCopperCollection.create(baseName)).map(id -> BlockItemId.create(create(id), create(id)));
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
		COPPER_FENCES = WeatheringCopperCollection.registerBlocks(createSimpleCopper("copper_fence"),
				IronFenceModBlocks::register, (state, p) -> new FenceBlock(p), WeatheringCopperFenceBlock::new,
				state -> BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_BLOCK.weathering().pick(state)));
		COPPER_FENCE_GATES = WeatheringCopperCollection.registerBlocks(createSimpleCopper("copper_fence_gate"),
				IronFenceModBlocks::register, (state, p) -> new FenceGateBlock(METAL, p), WeatheringCopperFenceGateBlock::new,
				state -> BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_BLOCK.weathering().pick(state)));

		OxidizableBlocksRegistry.registerWeatheringCopperBlocks(COPPER_FENCES);
		OxidizableBlocksRegistry.registerWeatheringCopperBlocks(COPPER_FENCE_GATES);
	}
}