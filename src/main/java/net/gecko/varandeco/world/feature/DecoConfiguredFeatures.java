package net.gecko.varandeco.world.feature;

import net.gecko.varandeco.VaranDeco;
import net.gecko.varandeco.block.DecoBlocks;
import net.minecraft.util.dynamic.Range;
import net.minecraft.util.math.noise.DoublePerlinNoiseSampler;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.stateprovider.DualNoiseBlockStateProvider;
import net.minecraft.world.gen.stateprovider.NoiseBlockStateProvider;

import java.util.List;

public class DecoConfiguredFeatures {

    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> DECO_FLOWER_FOREST =
            ConfiguredFeatures.register("deco_flower_forest_flowers", Feature.FLOWER,
                    ConfiguredFeatures.createRandomPatchFeatureConfig(64, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                                    new SimpleBlockFeatureConfig(new NoiseBlockStateProvider(2345L,
                                            new DoublePerlinNoiseSampler.NoiseParameters(0, 1.0),
                                            0.020833334F, List.of(DecoBlocks.YELLOW_TULIP.getDefaultState(),
                                            DecoBlocks.PURPLE_TULIP.getDefaultState(), DecoBlocks.MAGENTA_TULIP.getDefaultState(),
                                            DecoBlocks.BLUE_TULIP.getDefaultState(), DecoBlocks.BARBERTON_DAISY.getDefaultState(),
                                            DecoBlocks.GERBERA_DAISY.getDefaultState()))))));

    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> DECO_MEADOW =
            ConfiguredFeatures.register("deco_meadow_flowers", Feature.FLOWER,
                    ConfiguredFeatures.createRandomPatchFeatureConfig(96, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                            new SimpleBlockFeatureConfig(new DualNoiseBlockStateProvider(new Range<>(1, 3),
                                    new DoublePerlinNoiseSampler.NoiseParameters(-10, 1.0),
                                    1.0F, 2345L, new DoublePerlinNoiseSampler.NoiseParameters(-3, 1.0),
                                    1.0F, List.of(DecoBlocks.BLACK_TULIP.getDefaultState(),
                                            DecoBlocks.GREEN_TULIP.getDefaultState(), DecoBlocks.CYAN_TULIP.getDefaultState(),
                                            DecoBlocks.BARBERTON_DAISY.getDefaultState(), DecoBlocks.GERBERA_DAISY.getDefaultState()))))));

    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> DECO_PLAINS =
            ConfiguredFeatures.register("deco_plains_flowers", Feature.FLOWER,
                    ConfiguredFeatures.createRandomPatchFeatureConfig(32, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                            new SimpleBlockFeatureConfig(new DualNoiseBlockStateProvider(new Range<>(1, 3),
                                    new DoublePerlinNoiseSampler.NoiseParameters(-20, 2.0),
                                    0.5F, 2345L, new DoublePerlinNoiseSampler.NoiseParameters(-3, 1.0),
                                    0.005F, List.of(DecoBlocks.BARBERTON_DAISY.getDefaultState(), DecoBlocks.GERBERA_DAISY.getDefaultState()))))));

    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> DECO_SAVANNA =
            ConfiguredFeatures.register("deco_savanna_flowers", Feature.FLOWER,
                    ConfiguredFeatures.createRandomPatchFeatureConfig(16, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                            new SimpleBlockFeatureConfig(new DualNoiseBlockStateProvider(new Range<>(1, 3),
                                    new DoublePerlinNoiseSampler.NoiseParameters(-10, 1.0),
                                    0.5F, 2345L, new DoublePerlinNoiseSampler.NoiseParameters(-3, 1.0),
                                    0.005F, List.of(DecoBlocks.GERBERA_DAISY.getDefaultState(),
                                            DecoBlocks.BLUE_EYED_DAISY.getDefaultState(), DecoBlocks.MICHAELMAS_DAISY.getDefaultState()))))));

    public static void registerConfiguredFeatures() {
        VaranDeco.LOGGER.debug("Registering the ModConfiguredFeatures for " + VaranDeco.MOD_ID);
    }
}
