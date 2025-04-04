package net.gecko.varandeco.world.feature;

import net.gecko.varandeco.VaranDeco;
import net.gecko.varandeco.block.DecoBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.util.dynamic.Range;
import net.minecraft.util.math.noise.DoublePerlinNoiseSampler;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.stateprovider.DualNoiseBlockStateProvider;
import net.minecraft.world.gen.stateprovider.NoiseBlockStateProvider;
import net.minecraft.world.gen.stateprovider.NoiseThresholdBlockStateProvider;

import java.util.List;

public class DecoConfiguredFeatures {

    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> FOREST_TULIPS =
            ConfiguredFeatures.register("forest_tulips", Feature.FLOWER,
                    ConfiguredFeatures.createRandomPatchFeatureConfig(64, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                            new SimpleBlockFeatureConfig(new NoiseBlockStateProvider(2345L,
                                    new DoublePerlinNoiseSampler.NoiseParameters(0, 1.0),
                                    0.005F, List.of(DecoBlocks.YELLOW_TULIP.getDefaultState(),
                                            DecoBlocks.PURPLE_TULIP.getDefaultState(),
                                            DecoBlocks.MAGENTA_TULIP.getDefaultState(),
                                            DecoBlocks.BLUE_TULIP.getDefaultState()))))));

    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> MEADOW_TULIPS =
            ConfiguredFeatures.register("meadow_tulips", Feature.FLOWER,
                    ConfiguredFeatures.createRandomPatchFeatureConfig(96, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                            new SimpleBlockFeatureConfig(new DualNoiseBlockStateProvider(new Range<>(1, 3),
                                    new DoublePerlinNoiseSampler.NoiseParameters(-10, 1.0),
                                    1.0F, 2345L, new DoublePerlinNoiseSampler.NoiseParameters(-3, 1.0),
                                    1.0F, List.of(DecoBlocks.BLACK_TULIP.getDefaultState(),
                                            DecoBlocks.GREEN_TULIP.getDefaultState(),
                                            DecoBlocks.CYAN_TULIP.getDefaultState()))))));

    public static void registerConfiguredFeatures() {
        VaranDeco.LOGGER.debug("Registering the ModConfiguredFeatures for " + VaranDeco.MOD_ID);
    }
}
