package net.gecko.varandeco.world.feature;

import com.google.common.collect.ImmutableList;
import net.gecko.varandeco.VaranDeco;
import net.gecko.varandeco.block.DecoBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.dynamic.Range;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.math.noise.DoublePerlinNoiseSampler;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.JungleFoliagePlacer;
import net.minecraft.world.gen.foliage.LargeOakFoliagePlacer;
import net.minecraft.world.gen.foliage.SpruceFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.stateprovider.DualNoiseBlockStateProvider;
import net.minecraft.world.gen.stateprovider.NoiseBlockStateProvider;
import net.minecraft.world.gen.treedecorator.AlterGroundTreeDecorator;
import net.minecraft.world.gen.trunk.DarkOakTrunkPlacer;
import net.minecraft.world.gen.trunk.ForkingTrunkPlacer;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.List;
import java.util.OptionalInt;

public class DecoConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?,?>> DECO_FLOWER_FOREST_KEY = registerKey("deco_flower_forest");

    public static final RegistryKey<ConfiguredFeature<?,?>> DECO_MEADOW_KEY = registerKey("deco_meadow");

    public static final RegistryKey<ConfiguredFeature<?,?>> DECO_PLAINS_KEY = registerKey("deco_plains_flowers");

    public static final RegistryKey<ConfiguredFeature<?,?>> DECO_SAVANNA_KEY = registerKey("deco_savanna_flowers");

    public static final RegistryKey<ConfiguredFeature<?,?>> DECO_SWAMP_KEY = registerKey("deco_swamp_flower");

    public static final RegistryKey<ConfiguredFeature<?,?>> DECO_RIVER_KEY = registerKey("deco_river_flowers");

    public static final RegistryKey<ConfiguredFeature<?,?>> DECO_ROSE_KEY = registerKey("deco_rose_flower");

    public static final RegistryKey<ConfiguredFeature<?,?>> DECO_ENDER_KEY = registerKey("deco_ender_flowers");

    public static final RegistryKey<ConfiguredFeature<?,?>> DECO_WITHER_KEY = registerKey("deco_wither_flower");

    public static final RegistryKey<ConfiguredFeature<?,?>> DECO_SOULSAND_KEY = registerKey("deco_soulsand_flowers");

    public static final RegistryKey<ConfiguredFeature<?,?>> DECO_RED_SUNFLOWER_KEY = registerKey("deco_red_sunflower");

    public static final RegistryKey<ConfiguredFeature<?,?>> DECO_NOVA_STARFLOWER_KEY = registerKey("deco_nova_starflower");

    public static final RegistryKey<ConfiguredFeature<?,?>> DECO_PAEONIA_KEY = registerKey("deco_paeonia");

    public static final RegistryKey<ConfiguredFeature<?,?>> DECO_WOODEN_TREE_KEY = registerKey("deco_wooden_tree");

    public static final RegistryKey<ConfiguredFeature<?,?>> DECO_FANCY_WOODEN_TREE_KEY = registerKey("deco_fancy_wooden_tree");

    public static final RegistryKey<ConfiguredFeature<?,?>> DECO_MEGA_WOODEN_TREE_KEY = registerKey("deco_mega_wooden_tree");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        var placedFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.PLACED_FEATURE);

        register(context, DECO_FLOWER_FOREST_KEY, Feature.FLOWER,
                ConfiguredFeatures.createRandomPatchFeatureConfig(64, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(new NoiseBlockStateProvider(2345L,
                                new DoublePerlinNoiseSampler.NoiseParameters(0, 1.0),
                                0.020833334F, List.of(DecoBlocks.YELLOW_TULIP.getDefaultState(),
                                DecoBlocks.PURPLE_TULIP.getDefaultState(), DecoBlocks.MAGENTA_TULIP.getDefaultState(),
                                DecoBlocks.BLUE_TULIP.getDefaultState(), DecoBlocks.BARBERTON_DAISY.getDefaultState(),
                                DecoBlocks.GERBERA_DAISY.getDefaultState(), DecoBlocks.WHITE_ORCHID.getDefaultState(),
                                DecoBlocks.PINK_ORCHID.getDefaultState(), DecoBlocks.YELLOW_ORCHID.getDefaultState(),
                                Blocks.BLUE_ORCHID.getDefaultState(), DecoBlocks.SALMON_POPPY.getDefaultState(),
                                DecoBlocks.ROSE.getDefaultState(), DecoBlocks.PAEONIA.getDefaultState(),
                                DecoBlocks.LAVENDER.getDefaultState()))))));

        register(context, DECO_MEADOW_KEY, Feature.FLOWER,
                        ConfiguredFeatures.createRandomPatchFeatureConfig(96, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                                new SimpleBlockFeatureConfig(new DualNoiseBlockStateProvider(new Range<>(1, 3),
                                        new DoublePerlinNoiseSampler.NoiseParameters(-10, 1.0),
                                        1.0F, 2345L, new DoublePerlinNoiseSampler.NoiseParameters(-3, 1.0),
                                        1.0F, List.of(DecoBlocks.BLACK_TULIP.getDefaultState(),
                                        DecoBlocks.GREEN_TULIP.getDefaultState(), DecoBlocks.CYAN_TULIP.getDefaultState(),
                                        DecoBlocks.BARBERTON_DAISY.getDefaultState(), DecoBlocks.GERBERA_DAISY.getDefaultState(),
                                        DecoBlocks.ROSE.getDefaultState()))))));

        register(context, DECO_PLAINS_KEY, Feature.FLOWER,
                        ConfiguredFeatures.createRandomPatchFeatureConfig(32, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                                new SimpleBlockFeatureConfig(new DualNoiseBlockStateProvider(new Range<>(1, 3),
                                        new DoublePerlinNoiseSampler.NoiseParameters(-20, 2.0),
                                        0.5F, 2345L, new DoublePerlinNoiseSampler.NoiseParameters(-3, 1.0),
                                        0.005F, List.of(DecoBlocks.BARBERTON_DAISY.getDefaultState(), DecoBlocks.GERBERA_DAISY.getDefaultState()))))));

        register(context, DECO_SAVANNA_KEY, Feature.FLOWER,
                        ConfiguredFeatures.createRandomPatchFeatureConfig(16, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                                new SimpleBlockFeatureConfig(new DualNoiseBlockStateProvider(new Range<>(1, 3),
                                        new DoublePerlinNoiseSampler.NoiseParameters(-10, 1.0),
                                        0.5F, 2345L, new DoublePerlinNoiseSampler.NoiseParameters(-3, 1.0),
                                        0.005F, List.of(DecoBlocks.GERBERA_DAISY.getDefaultState(),
                                        DecoBlocks.BLUE_EYED_DAISY.getDefaultState(), DecoBlocks.MICHAELMAS_DAISY.getDefaultState(),
                                        DecoBlocks.CALIFORNIA_POPPY.getDefaultState()))))));

        register(context, DECO_SWAMP_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(64, 6, 2,
                        PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(DecoBlocks.YELLOW_ORCHID)))));

        register(context, DECO_RIVER_KEY, Feature.FLOWER,
                        ConfiguredFeatures.createRandomPatchFeatureConfig(32, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                                new SimpleBlockFeatureConfig(new DualNoiseBlockStateProvider(new Range<>(1, 3),
                                        new DoublePerlinNoiseSampler.NoiseParameters(-20, 2.0),
                                        0.5F, 2345L, new DoublePerlinNoiseSampler.NoiseParameters(-3, 1.0),
                                        0.005F, List.of(DecoBlocks.PINK_ORCHID.getDefaultState(), DecoBlocks.WHITE_ORCHID.getDefaultState(),
                                        DecoBlocks.SALMON_POPPY.getDefaultState(), DecoBlocks.LAVENDER.getDefaultState()))))));

        register(context, DECO_ROSE_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(64, 6, 2,
                        PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(DecoBlocks.ROSE)))));

        register(context, DECO_ENDER_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(64, 6, 2,
                        PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(DecoBlocks.ENDER_ROSE)))));

        register(context, DECO_WITHER_KEY, Feature.RANDOM_PATCH, new RandomPatchFeatureConfig(64, 6, 2,
                        PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(Blocks.WITHER_ROSE)))));

        register(context, DECO_SOULSAND_KEY, Feature.RANDOM_PATCH, ConfiguredFeatures.createRandomPatchFeatureConfig(32,
                        PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                                new SimpleBlockFeatureConfig(new DualNoiseBlockStateProvider(new Range<>(1, 3),
                                        new DoublePerlinNoiseSampler.NoiseParameters(-20, 2.0),
                                        0.5F, 2345L, new DoublePerlinNoiseSampler.NoiseParameters(-3, 1.0),
                                        0.005F, List.of(Blocks.NETHER_WART.getDefaultState(), DecoBlocks.WARPED_WART_PLANT.getDefaultState()))))));

        register(context, DECO_RED_SUNFLOWER_KEY, Feature.RANDOM_PATCH, ConfiguredFeatures.createRandomPatchFeatureConfig(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(DecoBlocks.RED_SUNFLOWER))));
        register(context, DECO_NOVA_STARFLOWER_KEY, Feature.RANDOM_PATCH, ConfiguredFeatures.createRandomPatchFeatureConfig(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(DecoBlocks.NOVA_STARFLOWER))));

        register(context, DECO_PAEONIA_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(64, 6, 2,
                        PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(DecoBlocks.PAEONIA)))));

        register(context, DECO_WOODEN_TREE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                        BlockStateProvider.of(DecoBlocks.WOODEN_LOG), new ForkingTrunkPlacer(5, 2, 2),
                        BlockStateProvider.of(DecoBlocks.WOODEN_LEAVES),
                        new LargeOakFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(4), 4),
                        new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4))).build());

        register(context, DECO_FANCY_WOODEN_TREE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                        BlockStateProvider.of(DecoBlocks.WOODEN_LOG), new StraightTrunkPlacer(6, 4, 0),
                        BlockStateProvider.of(DecoBlocks.WOODEN_LEAVES),
                        new SpruceFoliagePlacer(UniformIntProvider.create(2, 3), UniformIntProvider.create(0, 2),
                                UniformIntProvider.create(1, 2)), new TwoLayersFeatureSize(2, 0, 2)).build());

        register(context, DECO_MEGA_WOODEN_TREE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                        BlockStateProvider.of(DecoBlocks.WOODEN_LOG), new DarkOakTrunkPlacer(13, 2, 14),
                        BlockStateProvider.of(DecoBlocks.WOODEN_LEAVES),
                        new JungleFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
                        new TwoLayersFeatureSize(1, 1, 2)).decorators
                                (ImmutableList.of(new AlterGroundTreeDecorator(BlockStateProvider.of(Blocks.PODZOL))))
                        .build());
    }
    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(VaranDeco.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
