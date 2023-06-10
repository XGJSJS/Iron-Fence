package net.xgjs.iron_fence;

import com.mojang.logging.LogUtils;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.xgjs.iron_fence.init.IronFenceModBlocks;
import net.xgjs.iron_fence.init.IronFenceModItems;
import org.slf4j.Logger;

@Mod(IronFenceMod.MOD_ID)
public class IronFenceMod {
	public static final String MOD_ID = "iron_fence";
	public static final Logger LOGGER = LogUtils.getLogger();

	public static final WoodType IRON = new WoodType("iron", BlockSetType.IRON, SoundType.METAL, SoundType.METAL, SoundEvents.FENCE_GATE_CLOSE, SoundEvents.FENCE_GATE_OPEN);
	public static final WoodType NETHERITE = new WoodType("netherite", BlockSetType.IRON, SoundType.METAL, SoundType.METAL, SoundEvents.FENCE_GATE_CLOSE, SoundEvents.FENCE_GATE_OPEN);

	public IronFenceMod() {
		IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		MinecraftForge.EVENT_BUS.register(this);

		IronFenceModBlocks.REGISTRY.register(modEventBus);
		IronFenceModItems.REGISTRY.register(modEventBus);

		modEventBus.addListener(this::addCreativeContents);
	}

	private void addCreativeContents(BuildCreativeModeTabContentsEvent event) {
		if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			event.accept(IronFenceModItems.IRON_FENCE);
			event.accept(IronFenceModItems.IRON_FENCE_GATE);
			event.accept(IronFenceModItems.NETHERITE_FENCE);
			event.accept(IronFenceModItems.NETHERITE_FENCE_GATE);
		}
	}
}
