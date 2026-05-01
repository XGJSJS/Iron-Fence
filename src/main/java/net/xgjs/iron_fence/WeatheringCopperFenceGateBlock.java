package net.xgjs.iron_fence;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;
import org.jspecify.annotations.NonNull;

public class WeatheringCopperFenceGateBlock extends FenceGateBlock implements WeatheringCopper {
    private final WeatherState weatherState;

    public WeatheringCopperFenceGateBlock(WeatherState weatherState, WoodType type, Properties properties) {
        super(type, properties);
        this.weatherState = weatherState;
    }

    public WeatheringCopperFenceGateBlock(WeatherState weatherState, Properties properties) {
        this(weatherState, IronFenceModBlocks.METAL, properties);
    }

    @Override
    protected void randomTick(@NonNull BlockState state, @NonNull ServerLevel level, @NonNull BlockPos pos, @NonNull RandomSource random) {
        super.randomTick(state, level, pos, random);
        this.changeOverTime(state, level, pos, random);
    }

    @Override
    protected boolean isRandomlyTicking(@NonNull BlockState state) {
        return WeatheringCopper.getNext(state.getBlock()).isPresent();
    }

    @Override
    public WeatherState getAge() {
        return this.weatherState;
    }
}
