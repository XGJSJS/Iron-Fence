
package net.mcreator.ironfence.block;

import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;

import net.minecraft.core.BlockPos;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundEvent;
import net.mcreator.ironfence.init.IronFenceModBlocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

import java.util.List;
import java.util.Collections;

public class IronFenceGateBlock extends FenceGateBlock {
	public static BlockBehaviour.Properties PROPERTIES = FabricBlockSettings.of(Material.METAL).sound(SoundType.METAL).strength(1f, 10f).noOcclusion()
			.isRedstoneConductor((bs, br, bp) -> false).requiresCorrectToolForDrops();
	private static SoundEvent soundEvent = SoundEvents.FENCE_GATE_CLOSE;
	private static SoundEvent soundEvent2 = SoundEvents.FENCE_GATE_OPEN;

	public IronFenceGateBlock() {
		super(PROPERTIES, soundEvent, soundEvent2);
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}

	@Environment(EnvType.CLIENT)
	public static void clientInit() {
		BlockRenderLayerMap.INSTANCE.putBlock(IronFenceModBlocks.IRON_FENCE_GATE, RenderType.solid());
	}
}
