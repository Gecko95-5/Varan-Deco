package net.gecko.varandeco.world.feature;

import com.google.common.collect.ImmutableList;
import net.gecko.varandeco.VaranDeco;
import net.gecko.varandeco.block.DecoBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.collection.DataPool;
import net.minecraft.util.dynamic.Range;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.math.noise.DoublePerlinNoiseSampler;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.blockpredicate.BlockPredicate;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.JungleFoliagePlacer;
import net.minecraft.world.gen.foliage.LargeOakFoliagePlacer;
import net.minecraft.world.gen.foliage.SpruceFoliagePlacer;
import net.minecraft.world.gen.stateprovider.*;
import net.minecraft.world.gen.treedecorator.AlterGroundTreeDecorator;
import net.minecraft.world.gen.trunk.DarkOakTrunkPlacer;
import net.minecraft.world.gen.trunk.ForkingTrunkPlacer;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.List;
import java.util.OptionalInt;

public class DecoConfiguredFeatures {
    public static final RuleTest SKY = new BlockMatchRuleTest(Blocks.AIR);

    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> DECO_FLOWER_FOREST =
            ConfiguredFeatures.register("deco_flower_forest_flowers", Feature.FLOWER,
                    ConfiguredFeatures.createRandomPatchFeatureConfig(64, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                                    new SimpleBlockFeatureConfig(new NoiseBlockStateProvider(2345L,
                                            new DoublePerlinNoiseSampler.NoiseParameters(0, 1.0),
                                            0.020833334F, List.of(DecoBlocks.BARBERTON_DAISY.getDefaultState(),
                                            DecoBlocks.GERBERA_DAISY.getDefaultState(),DecoBlocks.WHITE_ORCHID.getDefaultState(),
                                            DecoBlocks.PINK_ORCHID.getDefaultState(),DecoBlocks.YELLOW_ORCHID.getDefaultState(),
                                            Blocks.BLUE_ORCHID.getDefaultState(),DecoBlocks.SALMON_POPPY.getDefaultState(),
                                            DecoBlocks.ROSE.getDefaultState(),DecoBlocks.PAEONIA.getDefaultState(),
                                            DecoBlocks.LAVENDER.getDefaultState()))))));

    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> DECO_TULIPS_FOREST =
            ConfiguredFeatures.register("deco_tulips_forest", Feature.FLOWER,
                    DecoConfiguredFeatures.createRandomPatchFeatureConfig(new WeightedBlockStateProvider
            (DataPool.<BlockState>builder().add(DecoBlocks.YELLOW_TULIP.getDefaultState(),1)
            .add(DecoBlocks.PURPLE_TULIP.getDefaultState(),2)
            .add(DecoBlocks.BLUE_TULIP.getDefaultState(),2)
            .add(DecoBlocks.MAGENTA_TULIP.getDefaultState(),1).build()),32));

    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> DECO_MEADOW =
            ConfiguredFeatures.register("deco_meadow_flowers", Feature.FLOWER,
                    ConfiguredFeatures.createRandomPatchFeatureConfig(96, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                            new SimpleBlockFeatureConfig(new DualNoiseBlockStateProvider(new Range<>(1, 3),
                                    new DoublePerlinNoiseSampler.NoiseParameters(-10, 1.0),
                                    1.0F, 2345L, new DoublePerlinNoiseSampler.NoiseParameters(-3, 1.0),
                                    1.0F, List.of(DecoBlocks.BARBERTON_DAISY.getDefaultState(), DecoBlocks.ALPINE_POPPY.getDefaultState(),
                                            DecoBlocks.ROSE.getDefaultState()))))));

    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> DECO_TULIPS_MEADOW =
            ConfiguredFeatures.register("deco_tulips_meadow", Feature.FLOWER,
                    DecoConfiguredFeatures.createRandomPatchFeatureConfig(new WeightedBlockStateProvider
            (DataPool.<BlockState>builder().add(DecoBlocks.BLACK_TULIP.getDefaultState(),1)
            .add(DecoBlocks.GREEN_TULIP.getDefaultState(),5)
            .add(DecoBlocks.CYAN_TULIP.getDefaultState(),5).build()),48));

    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> DECO_BIRCH =
            ConfiguredFeatures.register("deco_birch_flowers", Feature.FLOWER,
                    ConfiguredFeatures.createRandomPatchFeatureConfig(32, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                            new SimpleBlockFeatureConfig(new DualNoiseBlockStateProvider(new Range<>(1, 3),
                                    new DoublePerlinNoiseSampler.NoiseParameters(-10, 1.0),
                                    1.0F, 2345L, new DoublePerlinNoiseSampler.NoiseParameters(-3, 1.0),
                                    1.0F, List.of(DecoBlocks.LAVENDER.getDefaultState(),
                                            DecoBlocks.PAEONIA.getDefaultState(), DecoBlocks.NIGHTSHADE.getDefaultState(),
                                                DecoBlocks.BUTTERCUP.getDefaultState()))))));

    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> DECO_JUNGLE =
            ConfiguredFeatures.register("deco_jungle_flowers", Feature.FLOWER,
                    DecoConfiguredFeatures.createRandomPatchFeatureConfig(new WeightedBlockStateProvider
                            (DataPool.<BlockState>builder().add(DecoBlocks.BLUE_HIBISCUS.getDefaultState(),2)
                                    .add(DecoBlocks.BROMELIAD.getDefaultState(),2)
                                    .add(DecoBlocks.SALMON_POPPY.getDefaultState(),1)
                                    .add(DecoBlocks.MICHAELMAS_DAISY.getDefaultState(),1).build()),96));

    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> DECO_PLAINS =
            ConfiguredFeatures.register("deco_plains_flowers", Feature.FLOWER,
                    ConfiguredFeatures.createRandomPatchFeatureConfig(32, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                            new SimpleBlockFeatureConfig(new DualNoiseBlockStateProvider(new Range<>(1, 3),
                                    new DoublePerlinNoiseSampler.NoiseParameters(-20, 2.0),
                                    0.5F, 2345L, new DoublePerlinNoiseSampler.NoiseParameters(-3, 1.0),
                                    0.005F, List.of(DecoBlocks.BARBERTON_DAISY.getDefaultState(), DecoBlocks.GERBERA_DAISY.getDefaultState()))))));

    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> DECO_SAVANNA =
            ConfiguredFeatures.register("deco_savanna_flowers", Feature.FLOWER,
                    DecoConfiguredFeatures.createRandomPatchFeatureConfig(new WeightedBlockStateProvider
                            (DataPool.<BlockState>builder().add(DecoBlocks.GERBERA_DAISY.getDefaultState(),2)
                                    .add(DecoBlocks.MICHAELMAS_DAISY.getDefaultState(),2)
                                    .add(DecoBlocks.BLUE_EYED_DAISY.getDefaultState(),1)
                                    .add(DecoBlocks.CALIFORNIA_POPPY.getDefaultState(),1).build()),24));

    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> DECO_MESA =
            ConfiguredFeatures.register("deco_mesa_flowers", Feature.FLOWER,
                    DecoConfiguredFeatures.createRandomPatchFeatureConfig(new WeightedBlockStateProvider
                            (DataPool.<BlockState>builder().add(DecoBlocks.ROSE.getDefaultState(),5)
                                    .add(DecoBlocks.BARBERTON_DAISY.getDefaultState(),3)
                                    .add(DecoBlocks.CALIFORNIA_POPPY.getDefaultState(),1).build()),16));

    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> DECO_DESERT =
            ConfiguredFeatures.register("deco_desert_flowers", Feature.FLOWER,
                    DecoConfiguredFeatures.createRandomPatchFeatureConfig(new WeightedBlockStateProvider
                            (DataPool.<BlockState>builder().add(DecoBlocks.POPPED_BLUET.getDefaultState(),1)
                                    .add(DecoBlocks.DEAD_EYE_DAISY.getDefaultState(),1).build()),16));

    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> DECO_SWAMP = ConfiguredFeatures.register(
            "deco_swamp_flower", Feature.FLOWER, new RandomPatchFeatureConfig(64, 6, 2,
                    PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(DecoBlocks.YELLOW_ORCHID)))));

    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> DECO_RIVER =
            ConfiguredFeatures.register("deco_river", Feature.FLOWER,
                    DecoConfiguredFeatures.createRandomPatchFeatureConfig(new WeightedBlockStateProvider
                            (DataPool.<BlockState>builder().add(DecoBlocks.PINK_ORCHID.getDefaultState(),3)
                                    .add(DecoBlocks.SALMON_POPPY.getDefaultState(),2)
                                    .add(DecoBlocks.LAVENDER.getDefaultState(),1)
                                    .add(DecoBlocks.WHITE_ORCHID.getDefaultState(),3).build()),32));

    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> DECO_ROSE = ConfiguredFeatures.register(
            "deco_rose", Feature.FLOWER, new RandomPatchFeatureConfig(64, 6, 2,
                    PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(DecoBlocks.ROSE)))));

    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> DECO_ENDER =
            ConfiguredFeatures.register("deco_ender_flowers", Feature.FLOWER,
                    ConfiguredFeatures.createRandomPatchFeatureConfig(64, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                            new SimpleBlockFeatureConfig(new DualNoiseBlockStateProvider(new Range<>(1, 3),
                                    new DoublePerlinNoiseSampler.NoiseParameters(-10, 1.0),
                                    1.0F, 2345L, new DoublePerlinNoiseSampler.NoiseParameters(-3, 1.0),
                                    1.0F, List.of(DecoBlocks.ENDER_ROSE.getDefaultState(), DecoBlocks.ENDERSHADE.getDefaultState()))))));

    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> DECO_RED_SUNFLOWER = ConfiguredFeatures.register(
            "deco_red_sunflower", Feature.RANDOM_PATCH, ConfiguredFeatures.createRandomPatchFeatureConfig(Feature.SIMPLE_BLOCK,
                    new SimpleBlockFeatureConfig(BlockStateProvider.of(DecoBlocks.RED_SUNFLOWER))));
    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> DECO_NOVA_STARFLOWER = ConfiguredFeatures.register(
            "deco_nova_starflower", Feature.RANDOM_PATCH, ConfiguredFeatures.createRandomPatchFeatureConfig(Feature.SIMPLE_BLOCK,
                    new SimpleBlockFeatureConfig(BlockStateProvider.of(DecoBlocks.NOVA_STARFLOWER))));

    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> DECO_WOODEN_TREE =
            ConfiguredFeatures.register("deco_wooden_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(DecoBlocks.WOODEN_LOG), new ForkingTrunkPlacer(5, 2, 2),
                    BlockStateProvider.of(DecoBlocks.WOODEN_LEAVES),
                    new LargeOakFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(2), 4),
                    new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4))).build());

    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> DECO_FANCY_WOODEN_TREE =
            ConfiguredFeatures.register("deco_fancy_wooden_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(DecoBlocks.WOODEN_LOG), new StraightTrunkPlacer(6, 4, 0),
                    BlockStateProvider.of(DecoBlocks.WOODEN_LEAVES),
                    new SpruceFoliagePlacer(UniformIntProvider.create(2, 3), UniformIntProvider.create(0, 2),
                            UniformIntProvider.create(1, 2)), new TwoLayersFeatureSize(2, 0, 2)).build());

    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> DECO_MEGA_WOODEN_TREE =
            ConfiguredFeatures.register("deco_mega_wooden_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(DecoBlocks.WOODEN_LOG), new DarkOakTrunkPlacer(13, 2, 14),
                    BlockStateProvider.of(DecoBlocks.WOODEN_LEAVES),
                    new JungleFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
                    new TwoLayersFeatureSize(1, 1, 2)).decorators
                            (ImmutableList.of(new AlterGroundTreeDecorator(BlockStateProvider.of(Blocks.PODZOL))))
                    .build());

    public static final List<OreFeatureConfig.Target> DECO_BUBBLE_ORES = List.of(
            OreFeatureConfig.createTarget(new TagMatchRuleTest(BlockTags.BASE_STONE_OVERWORLD), DecoBlocks.BUBBLE_BLOCK.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> DECO_BUBBLE_ORE =
            ConfiguredFeatures.register("bubble_ore", Feature.ORE, new OreFeatureConfig(DECO_BUBBLE_ORES, 15));

    public static final RegistryEntry<ConfiguredFeature<DiskFeatureConfig, ?>> DECO_VOID_PATCH =
            ConfiguredFeatures.register("deco_void_patch", Feature.DISK,
                    new DiskFeatureConfig(PredicatedStateProvider.of(DecoBlocks.VOID_STONE),
                            BlockPredicate.matchingBlocks(List.of(Blocks.END_STONE)), UniformIntProvider.create(2, 3), 1));

    private static RandomPatchFeatureConfig createRandomPatchFeatureConfig(BlockStateProvider block, int tries) {
        return ConfiguredFeatures.createRandomPatchFeatureConfig(tries, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(block)));
    }
    public static void registerConfiguredFeatures() {
        VaranDeco.LOGGER.debug("Registering the ModConfiguredFeatures for " + VaranDeco.MOD_ID);
    }
}
