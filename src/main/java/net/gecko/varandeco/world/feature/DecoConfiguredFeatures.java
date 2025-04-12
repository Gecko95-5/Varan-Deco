package net.gecko.varandeco.world.feature;

import com.google.common.collect.ImmutableList;
import net.gecko.varandeco.VaranDeco;
import net.gecko.varandeco.block.DecoBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.util.dynamic.Range;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.math.noise.DoublePerlinNoiseSampler;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.foliage.MegaPineFoliagePlacer;
import net.minecraft.world.gen.foliage.SpruceFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.stateprovider.DualNoiseBlockStateProvider;
import net.minecraft.world.gen.stateprovider.NoiseBlockStateProvider;
import net.minecraft.world.gen.treedecorator.AlterGroundTreeDecorator;
import net.minecraft.world.gen.trunk.DarkOakTrunkPlacer;
import net.minecraft.world.gen.trunk.ForkingTrunkPlacer;
import net.minecraft.world.gen.trunk.LargeOakTrunkPlacer;

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
                                            DecoBlocks.GERBERA_DAISY.getDefaultState(),DecoBlocks.WHITE_ORCHID.getDefaultState(),
                                            DecoBlocks.PINK_ORCHID.getDefaultState(),DecoBlocks.YELLOW_ORCHID.getDefaultState(),
                                            Blocks.BLUE_ORCHID.getDefaultState(),DecoBlocks.SALMON_POPPY.getDefaultState(),
                                            DecoBlocks.ROSE.getDefaultState(),DecoBlocks.PAEONIA.getDefaultState(),
                                            DecoBlocks.LAVENDER.getDefaultState()))))));

    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> DECO_MEADOW =
            ConfiguredFeatures.register("deco_meadow_flowers", Feature.FLOWER,
                    ConfiguredFeatures.createRandomPatchFeatureConfig(96, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                            new SimpleBlockFeatureConfig(new DualNoiseBlockStateProvider(new Range<>(1, 3),
                                    new DoublePerlinNoiseSampler.NoiseParameters(-10, 1.0),
                                    1.0F, 2345L, new DoublePerlinNoiseSampler.NoiseParameters(-3, 1.0),
                                    1.0F, List.of(DecoBlocks.BLACK_TULIP.getDefaultState(),
                                            DecoBlocks.GREEN_TULIP.getDefaultState(), DecoBlocks.CYAN_TULIP.getDefaultState(),
                                            DecoBlocks.BARBERTON_DAISY.getDefaultState(), DecoBlocks.GERBERA_DAISY.getDefaultState(),
                                            DecoBlocks.ROSE.getDefaultState()))))));

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
                                    DecoBlocks.BLUE_EYED_DAISY.getDefaultState(), DecoBlocks.MICHAELMAS_DAISY.getDefaultState(),
                                    DecoBlocks.CALIFORNIA_POPPY.getDefaultState()))))));

    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> DECO_SWAMP = ConfiguredFeatures.register(
            "deco_swamp_flower", Feature.FLOWER, new RandomPatchFeatureConfig(64, 6, 2,
                    PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(DecoBlocks.YELLOW_ORCHID)))));

    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> DECO_RIVER =
            ConfiguredFeatures.register("deco_river", Feature.FLOWER,
                    ConfiguredFeatures.createRandomPatchFeatureConfig(32, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                            new SimpleBlockFeatureConfig(new DualNoiseBlockStateProvider(new Range<>(1, 3),
                                    new DoublePerlinNoiseSampler.NoiseParameters(-20, 2.0),
                                    0.5F, 2345L, new DoublePerlinNoiseSampler.NoiseParameters(-3, 1.0),
                                    0.005F, List.of(DecoBlocks.PINK_ORCHID.getDefaultState(), DecoBlocks.WHITE_ORCHID.getDefaultState(),
                                    DecoBlocks.SALMON_POPPY.getDefaultState(),DecoBlocks.LAVENDER.getDefaultState()))))));

    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> DECO_ROSE = ConfiguredFeatures.register(
            "deco_rose", Feature.FLOWER, new RandomPatchFeatureConfig(64, 6, 2,
                    PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(DecoBlocks.ROSE)))));

    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> DECO_ENDER = ConfiguredFeatures.register(
            "deco_ender_flowers", Feature.FLOWER, new RandomPatchFeatureConfig(64, 6, 2,
                    PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(DecoBlocks.ENDER_ROSE)))));

    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> DECO_WITHER = ConfiguredFeatures.register(
            "deco_wither_flowers", Feature.RANDOM_PATCH, new RandomPatchFeatureConfig(64, 6, 2,
                    PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(Blocks.WITHER_ROSE)))));

    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> DECO_SOULSAND = ConfiguredFeatures.register(
            "deco_soulsand_flowers", Feature.RANDOM_PATCH, ConfiguredFeatures.createRandomPatchFeatureConfig(32,
                    PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                    new SimpleBlockFeatureConfig(new DualNoiseBlockStateProvider(new Range<>(1, 3),
                            new DoublePerlinNoiseSampler.NoiseParameters(-20, 2.0),
                            0.5F, 2345L, new DoublePerlinNoiseSampler.NoiseParameters(-3, 1.0),
                            0.005F, List.of(Blocks.NETHER_WART.getDefaultState(), DecoBlocks.WARPED_WART_PLANT.getDefaultState()))))));

    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> DECO_RED_SUNFLOWER = ConfiguredFeatures.register(
            "deco_red_sunflower", Feature.RANDOM_PATCH, ConfiguredFeatures.createRandomPatchFeatureConfig(Feature.SIMPLE_BLOCK,
                    new SimpleBlockFeatureConfig(BlockStateProvider.of(DecoBlocks.RED_SUNFLOWER))));
    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> DECO_NOVA_STARFLOWER = ConfiguredFeatures.register(
            "deco_nova_starflower", Feature.RANDOM_PATCH, ConfiguredFeatures.createRandomPatchFeatureConfig(Feature.SIMPLE_BLOCK,
                    new SimpleBlockFeatureConfig(BlockStateProvider.of(DecoBlocks.NOVA_STARFLOWER))));

    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> DECO_PAEONIA = ConfiguredFeatures.register(
            "deco_paeonia", Feature.FLOWER, new RandomPatchFeatureConfig(64, 6, 2,
                    PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(DecoBlocks.PAEONIA)))));

    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> DECO_WOODEN_TREE =
            ConfiguredFeatures.register("deco_wooden_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(DecoBlocks.WOODEN_LOG), new ForkingTrunkPlacer(5, 2, 2),
                    BlockStateProvider.of(DecoBlocks.WOODEN_LEAVES),
                    new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                    new TwoLayersFeatureSize(1, 0, 1)).build());

    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> DECO_FANCY_WOODEN_TREE =
            ConfiguredFeatures.register("deco_fancy_wooden_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(DecoBlocks.WOODEN_LOG), new LargeOakTrunkPlacer(3, 11, 0),
                    BlockStateProvider.of(DecoBlocks.WOODEN_LEAVES),
                    new SpruceFoliagePlacer(UniformIntProvider.create(2, 3), UniformIntProvider.create(0, 2),
                            UniformIntProvider.create(1, 2)), new TwoLayersFeatureSize(2, 0, 2)).build());

    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> DECO_MEGA_WOODEN_TREE =
            ConfiguredFeatures.register("deco_mega_wooden_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(DecoBlocks.WOODEN_LOG), new DarkOakTrunkPlacer(6, 2, 1),
                    BlockStateProvider.of(DecoBlocks.WOODEN_LEAVES),
                    new MegaPineFoliagePlacer(ConstantIntProvider.create(0), ConstantIntProvider.create(0),
                            UniformIntProvider.create(3, 7)), new TwoLayersFeatureSize(1, 1, 2))
                    .decorators(ImmutableList.of(new AlterGroundTreeDecorator(BlockStateProvider.of(Blocks.PODZOL))))
                    .build());

    public static void registerConfiguredFeatures() {
        VaranDeco.LOGGER.debug("Registering the ModConfiguredFeatures for " + VaranDeco.MOD_ID);
    }
}
