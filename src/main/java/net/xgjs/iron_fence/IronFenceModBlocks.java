package net.xgjs.iron_fence;

import net.minecraft.world.level.block.*;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class IronFenceModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(IronFenceMod.MOD_ID);
	public static final DeferredBlock<Block> IRON_FENCE = REGISTRY.register("iron_fence", () -> new FenceBlock(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(5f, 6f).requiresCorrectToolForDrops().forceSolidOn().ignitedByLava()));
	public static final DeferredBlock<Block> IRON_FENCE_GATE = REGISTRY.register("iron_fence_gate", () -> new FenceGateBlock(IronFenceMod.IRON, BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(5f, 6f).requiresCorrectToolForDrops().mapColor(Blocks.IRON_BLOCK.defaultMapColor()).forceSolidOn().ignitedByLava()));
	public static final DeferredBlock<Block> NETHERITE_FENCE = REGISTRY.register("netherite_fence", () -> new FenceBlock(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(50f, 1200f).requiresCorrectToolForDrops().forceSolidOn().ignitedByLava()));
	public static final DeferredBlock<Block> NETHERITE_FENCE_GATE = REGISTRY.register("netherite_fence_gate", () -> new FenceGateBlock(IronFenceMod.NETHERITE, BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(50f, 1200f).requiresCorrectToolForDrops().noOcclusion().mapColor(Blocks.NETHERITE_BLOCK.defaultMapColor()).forceSolidOn().ignitedByLava()));
}
