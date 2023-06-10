
package net.xgjs.iron_fence.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.TieredItem;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

public class NetheriteFenceBlock extends FenceBlock {
	public NetheriteFenceBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(50f, 1200f).requiresCorrectToolForDrops()
				.forceSolidOn().ignitedByLava());
	}

	@Override
	public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
		if (player.getInventory().getSelected().getItem() instanceof TieredItem tieredItem)
			return tieredItem.getTier().getLevel() >= 4;
		return false;
	}
}
