
package net.xgjs.iron_fence.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.xgjs.iron_fence.block.*;
import net.xgjs.iron_fence.IronFenceMod;

public class IronFenceModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, IronFenceMod.MOD_ID);
	public static final RegistryObject<Block> IRON_FENCE = REGISTRY.register("iron_fence", IronFenceBlock::new);
	public static final RegistryObject<Block> IRON_FENCE_GATE = REGISTRY.register("iron_fence_gate", IronFenceGateBlock::new);
	public static final RegistryObject<Block> NETHERITE_FENCE = REGISTRY.register("netherite_fence", NetheriteFenceBlock::new);
	public static final RegistryObject<Block> NETHERITE_FENCE_GATE = REGISTRY.register("netherite_fence_gate", NetheriteFenceGateBlock::new);
}
