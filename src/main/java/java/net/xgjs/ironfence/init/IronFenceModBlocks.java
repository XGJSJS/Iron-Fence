
package net.xgjs.ironfence.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.xgjs.ironfence.block.NetheriteFenceGateBlock;
import net.xgjs.ironfence.block.NetheriteFenceBlock;
import net.xgjs.ironfence.block.IronFenceGateBlock;
import net.xgjs.ironfence.block.IronFenceBlock;
import net.xgjs.ironfence.IronFenceMod;

public class IronFenceModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, IronFenceMod.MOD_ID);
	public static final RegistryObject<Block> IRON_FENCE = REGISTRY.register("iron_fence", () -> new IronFenceBlock());
	public static final RegistryObject<Block> IRON_FENCE_GATE = REGISTRY.register("iron_fence_gate", () -> new IronFenceGateBlock());
	public static final RegistryObject<Block> NETHERITE_FENCE = REGISTRY.register("netherite_fence", () -> new NetheriteFenceBlock());
	public static final RegistryObject<Block> NETHERITE_FENCE_GATE = REGISTRY.register("netherite_fence_gate", () -> new NetheriteFenceGateBlock());
}
