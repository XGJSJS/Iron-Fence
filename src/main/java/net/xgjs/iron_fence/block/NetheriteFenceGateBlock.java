
package net.xgjs.iron_fence.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.TieredItem;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.xgjs.iron_fence.IronFenceMod;

public class NetheriteFenceGateBlock extends FenceGateBlock {
	public NetheriteFenceGateBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(50f, 1200f).requiresCorrectToolForDrops().noOcclusion()
				.mapColor(Blocks.NETHERITE_BLOCK.defaultMapColor()).forceSolidOn().ignitedByLava(), IronFenceMod.NETHERITE);
	}

	@Override
	public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
		if (player.getInventory().getSelected().getItem() instanceof TieredItem tieredItem)
			return tieredItem.getTier().getLevel() >= 4;
		return false;
	}
}
