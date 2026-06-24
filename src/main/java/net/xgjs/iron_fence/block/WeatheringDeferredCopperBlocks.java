package net.xgjs.iron_fence.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public record WeatheringDeferredCopperBlocks(DeferredBlock<Block> unaffected, DeferredBlock<Block> exposed, DeferredBlock<Block> weathered, DeferredBlock<Block> oxidized, DeferredBlock<Block> waxed, DeferredBlock<Block> waxedExposed, DeferredBlock<Block> waxedWeathered, DeferredBlock<Block> waxedOxidized) {
    public static <WaxedBlock extends Block, WeatheringBlock extends Block & WeatheringCopper> WeatheringDeferredCopperBlocks create(String id, DeferredRegister.Blocks register, Function<BlockBehaviour.Properties, WaxedBlock> waxedBlockFactory, BiFunction<WeatheringCopper.WeatherState, BlockBehaviour.Properties, WeatheringBlock> weatheringFactory, Function<WeatheringCopper.WeatherState, BlockBehaviour.Properties> propertiesSupplier) {
        DeferredBlock<Block> unaffected = register.registerBlock(id, p -> weatheringFactory.apply(WeatheringCopper.WeatherState.UNAFFECTED, p), () -> propertiesSupplier.apply(WeatheringCopper.WeatherState.UNAFFECTED));
        DeferredBlock<Block> exposed = register.registerBlock("exposed_" + id, p -> weatheringFactory.apply(WeatheringCopper.WeatherState.EXPOSED, p), () -> propertiesSupplier.apply(WeatheringCopper.WeatherState.EXPOSED));
        DeferredBlock<Block> weathered = register.registerBlock("weathered_" + id, p -> weatheringFactory.apply(WeatheringCopper.WeatherState.WEATHERED, p), () -> propertiesSupplier.apply(WeatheringCopper.WeatherState.WEATHERED));
        DeferredBlock<Block> oxidized = register.registerBlock("oxidized_" + id, p -> weatheringFactory.apply(WeatheringCopper.WeatherState.OXIDIZED, p), () -> propertiesSupplier.apply(WeatheringCopper.WeatherState.OXIDIZED));
        DeferredBlock<Block> waxed = register.registerBlock("waxed_" + id, waxedBlockFactory, () -> propertiesSupplier.apply(WeatheringCopper.WeatherState.UNAFFECTED));
        DeferredBlock<Block> waxedExposed = register.registerBlock("waxed_exposed_" + id, waxedBlockFactory, () -> propertiesSupplier.apply(WeatheringCopper.WeatherState.EXPOSED));
        DeferredBlock<Block> waxedWeathered = register.registerBlock("waxed_weathered_" + id, waxedBlockFactory, () -> propertiesSupplier.apply(WeatheringCopper.WeatherState.WEATHERED));
        DeferredBlock<Block> waxedOxidized = register.registerBlock("waxed_oxidized_" + id, waxedBlockFactory, () -> propertiesSupplier.apply(WeatheringCopper.WeatherState.OXIDIZED));
        return new WeatheringDeferredCopperBlocks(unaffected, exposed, weathered, oxidized, waxed, waxedExposed, waxedWeathered, waxedOxidized);
    }

    public void forEach(Consumer<DeferredBlock<Block>> consumer) {
        consumer.accept(this.unaffected);
        consumer.accept(this.exposed);
        consumer.accept(this.weathered);
        consumer.accept(this.oxidized);
        consumer.accept(this.waxed);
        consumer.accept(this.waxedExposed);
        consumer.accept(this.waxedWeathered);
        consumer.accept(this.waxedOxidized);
    }
}
