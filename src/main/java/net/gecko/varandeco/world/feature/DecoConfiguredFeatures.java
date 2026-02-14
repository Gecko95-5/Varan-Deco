package net.gecko.varandeco.world.feature;

import com.google.common.collect.ImmutableList;
import net.gecko.varandeco.VaranDeco;
import net.gecko.varandeco.block.DecoBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.DataPool;
import net.minecraft.util.dynamic.Range;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.math.noise.DoublePerlinNoiseSampler;
import net.minecraft.world.gen.blockpredicate.BlockPredicate;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.AcaciaFoliagePlacer;
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

    public static final RegistryKey<ConfiguredFeature<?,?>> DECO_FLOWER_FOREST_KEY = registerKey("deco_flower_forest");

    public static final RegistryKey<ConfiguredFeature<?,?>> DECO_TULIPS_FOREST_KEY = registerKey("deco_tulips_forest");

    public static final RegistryKey<ConfiguredFeature<?,?>> DECO_MEADOW_KEY = registerKey("deco_meadow");

    public static final RegistryKey<ConfiguredFeature<?,?>> DECO_TULIPS_MEADOW_KEY = registerKey("deco_tulips_meadow");

    public static final RegistryKey<ConfiguredFeature<?,?>> DECO_PLAINS_KEY = registerKey("deco_plains_flowers");

    public static final RegistryKey<ConfiguredFeature<?,?>> DECO_SAVANNA_KEY = registerKey("deco_savanna_flowers");

    public static final RegistryKey<ConfiguredFeature<?,?>> DECO_SWAMP_KEY = registerKey("deco_swamp_flower");

    public static final RegistryKey<ConfiguredFeature<?,?>> DECO_RIVER_KEY = registerKey("deco_river_flowers");

    public static final RegistryKey<ConfiguredFeature<?,?>> DECO_ROSE_KEY = registerKey("deco_rose_flower");

    public static final RegistryKey<ConfiguredFeature<?,?>> DECO_ENDER_KEY = registerKey("deco_ender_flowers");

    public static final RegistryKey<ConfiguredFeature<?,?>> DECO_RED_SUNFLOWER_KEY = registerKey("deco_red_sunflower");

    public static final RegistryKey<ConfiguredFeature<?,?>> DECO_NOVA_STARFLOWER_KEY = registerKey("deco_nova_starflower");

    public static final RegistryKey<ConfiguredFeature<?,?>> DECO_BIRCH_KEY = registerKey("deco_birch");

    public static final RegistryKey<ConfiguredFeature<?,?>> DECO_JUNGLE_KEY = registerKey("deco_jungle");

    public static final RegistryKey<ConfiguredFeature<?,?>> DECO_MESA_KEY = registerKey("deco_mesa");

    public static final RegistryKey<ConfiguredFeature<?,?>> DECO_WOODEN_TREE_KEY = registerKey("deco_wooden_tree");

    public static final RegistryKey<ConfiguredFeature<?,?>> DECO_FANCY_WOODEN_TREE_KEY = registerKey("deco_fancy_wooden_tree");

    public static final RegistryKey<ConfiguredFeature<?,?>> DECO_MEGA_WOODEN_TREE_KEY = registerKey("deco_mega_wooden_tree");

    public static final RegistryKey<ConfiguredFeature<?,?>> DECO_BUBBLE_ORE = registerKey("deco_bubble_ore");

    public static final RegistryKey<ConfiguredFeature<?,?>> DECO_VOID_PATCH = registerKey("deco_void_patch");

    public static final RegistryKey<ConfiguredFeature<?,?>> DECO_IRON_CAP_MUSHROOM = registerKey("deco_iron_cap_mushroom");

    public static final RegistryKey<ConfiguredFeature<?,?>> DECO_DESERT = registerKey("deco_desert");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplacebles = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        var placedFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.PLACED_FEATURE);
        BlockPredicate blockPredicate = BlockPredicate.matchingBlocks(
                Blocks.OAK_SAPLING,
                Blocks.SPRUCE_SAPLING,
                Blocks.BIRCH_SAPLING,
                Blocks.JUNGLE_SAPLING,
                Blocks.ACACIA_SAPLING,
                Blocks.CHERRY_SAPLING,
                Blocks.DARK_OAK_SAPLING,
                Blocks.MANGROVE_PROPAGULE,
                Blocks.DANDELION,
                Blocks.TORCHFLOWER,
                Blocks.POPPY,
                Blocks.BLUE_ORCHID,
                Blocks.ALLIUM,
                Blocks.AZURE_BLUET,
                Blocks.RED_TULIP,
                Blocks.ORANGE_TULIP,
                Blocks.WHITE_TULIP,
                Blocks.PINK_TULIP,
                Blocks.OXEYE_DAISY,
                Blocks.CORNFLOWER,
                Blocks.WITHER_ROSE,
                Blocks.LILY_OF_THE_VALLEY,
                Blocks.BROWN_MUSHROOM,
                Blocks.RED_MUSHROOM,
                Blocks.WHEAT,
                Blocks.SUGAR_CANE,
                Blocks.ATTACHED_PUMPKIN_STEM,
                Blocks.ATTACHED_MELON_STEM,
                Blocks.PUMPKIN_STEM,
                Blocks.MELON_STEM,
                Blocks.LILY_PAD,
                Blocks.NETHER_WART,
                Blocks.COCOA,
                Blocks.CARROTS,
                Blocks.POTATOES,
                Blocks.CHORUS_PLANT,
                Blocks.CHORUS_FLOWER,
                Blocks.TORCHFLOWER_CROP,
                Blocks.PITCHER_CROP,
                Blocks.BEETROOTS,
                Blocks.SWEET_BERRY_BUSH,
                Blocks.WARPED_FUNGUS,
                Blocks.CRIMSON_FUNGUS,
                Blocks.WEEPING_VINES,
                Blocks.WEEPING_VINES_PLANT,
                Blocks.TWISTING_VINES,
                Blocks.TWISTING_VINES_PLANT,
                Blocks.CAVE_VINES,
                Blocks.CAVE_VINES_PLANT,
                Blocks.SPORE_BLOSSOM,
                Blocks.AZALEA,
                Blocks.FLOWERING_AZALEA,
                Blocks.MOSS_CARPET,
                Blocks.PINK_PETALS,
                Blocks.BIG_DRIPLEAF,
                Blocks.BIG_DRIPLEAF_STEM,
                Blocks.SMALL_DRIPLEAF
        );

        List<OreFeatureConfig.Target> overworldBubbleOre =
                List.of(OreFeatureConfig.createTarget(stoneReplacebles, DecoBlocks.BUBBLE_BLOCK.getDefaultState()));

        register(context, DECO_FLOWER_FOREST_KEY, Feature.FLOWER,
                ConfiguredFeatures.createRandomPatchFeatureConfig(64, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(new NoiseBlockStateProvider(2345L,
                                new DoublePerlinNoiseSampler.NoiseParameters(0, 1.0),
                                0.020833334F, List.of(DecoBlocks.BARBERTON_DAISY.getDefaultState(),
                                DecoBlocks.GERBERA_DAISY.getDefaultState(), DecoBlocks.WHITE_ORCHID.getDefaultState(),
                                DecoBlocks.PINK_ORCHID.getDefaultState(), DecoBlocks.YELLOW_ORCHID.getDefaultState(),
                                Blocks.BLUE_ORCHID.getDefaultState(), DecoBlocks.SALMON_POPPY.getDefaultState(),
                                DecoBlocks.ROSE.getDefaultState(), DecoBlocks.PAEONIA.getDefaultState(),
                                DecoBlocks.LAVENDER.getDefaultState()))))));

        ConfiguredFeatures.register(context, DECO_TULIPS_FOREST_KEY,
                Feature.FLOWER, DecoConfiguredFeatures.createRandomPatchFeatureConfig(new WeightedBlockStateProvider
                        (DataPool.<BlockState>builder().add(DecoBlocks.YELLOW_TULIP.getDefaultState(),1)
                                .add(DecoBlocks.PURPLE_TULIP.getDefaultState(),2)
                                .add(DecoBlocks.BLUE_TULIP.getDefaultState(),2)
                                .add(DecoBlocks.MAGENTA_TULIP.getDefaultState(),1).build()),32));

        register(context, DECO_MEADOW_KEY, Feature.FLOWER,
                        ConfiguredFeatures.createRandomPatchFeatureConfig(96, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                                new SimpleBlockFeatureConfig(new DualNoiseBlockStateProvider(new Range<>(1, 3),
                                        new DoublePerlinNoiseSampler.NoiseParameters(-10, 1.0),
                                        1.0F, 2345L, new DoublePerlinNoiseSampler.NoiseParameters(-3, 1.0),
                                        1.0F, List.of(DecoBlocks.BARBERTON_DAISY.getDefaultState(),
                                        DecoBlocks.ALPINE_POPPY.getDefaultState(), DecoBlocks.ROSE.getDefaultState()))))));
                                        ConfiguredFeatures.register(context, DECO_TULIPS_MEADOW_KEY,
                Feature.FLOWER, DecoConfiguredFeatures.createRandomPatchFeatureConfig(new WeightedBlockStateProvider
                        (DataPool.<BlockState>builder().add(DecoBlocks.BLACK_TULIP.getDefaultState(),1)
                                .add(DecoBlocks.GREEN_TULIP.getDefaultState(),5)
                                        .add(DecoBlocks.CYAN_TULIP.getDefaultState(),5).build()),48));

        register(context, DECO_PLAINS_KEY, Feature.FLOWER,
                ConfiguredFeatures.createRandomPatchFeatureConfig(32, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(new DualNoiseBlockStateProvider(new Range<>(1, 3),
                                new DoublePerlinNoiseSampler.NoiseParameters(-20, 2.0),
                                0.5F, 2345L, new DoublePerlinNoiseSampler.NoiseParameters(-3, 1.0),
                                0.005F, List.of(DecoBlocks.BARBERTON_DAISY.getDefaultState(), DecoBlocks.GERBERA_DAISY.getDefaultState()))))));


        ConfiguredFeatures.register(context, DECO_SAVANNA_KEY,
                Feature.FLOWER, DecoConfiguredFeatures.createRandomPatchFeatureConfig(new WeightedBlockStateProvider
                        (DataPool.<BlockState>builder().add(DecoBlocks.GERBERA_DAISY.getDefaultState(),2)
                                .add(DecoBlocks.MICHAELMAS_DAISY.getDefaultState(),2)
                                .add(DecoBlocks.BLUE_EYED_DAISY.getDefaultState(),1)
                                .add(DecoBlocks.CALIFORNIA_POPPY.getDefaultState(),1).build()),24));

        ConfiguredFeatures.register(context, DECO_JUNGLE_KEY,
                Feature.FLOWER, DecoConfiguredFeatures.createRandomPatchFeatureConfig(new WeightedBlockStateProvider
                        (DataPool.<BlockState>builder().add(DecoBlocks.BLUE_HIBISCUS.getDefaultState(),2)
                                .add(DecoBlocks.BROMELIAD.getDefaultState(),2)
                                .add(DecoBlocks.SALMON_POPPY.getDefaultState(),1)
                                .add(DecoBlocks.MICHAELMAS_DAISY.getDefaultState(),1).build()),96));

        ConfiguredFeatures.register(context, DECO_MESA_KEY,
                Feature.FLOWER, DecoConfiguredFeatures.createRandomPatchFeatureConfig(new WeightedBlockStateProvider
                        (DataPool.<BlockState>builder().add(DecoBlocks.ROSE.getDefaultState(),5)
                                .add(DecoBlocks.BARBERTON_DAISY.getDefaultState(),3)
                                .add(DecoBlocks.CALIFORNIA_POPPY.getDefaultState(),1).build()),16));

        register(context, DECO_SWAMP_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(64, 6, 2,
                        PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(DecoBlocks.YELLOW_ORCHID)))));

        register(context, DECO_DESERT, Feature.FLOWER,
                    DecoConfiguredFeatures.createRandomPatchFeatureConfig(new WeightedBlockStateProvider
                            (DataPool.<BlockState>builder().add(DecoBlocks.POPPED_BLUET.getDefaultState(),1)
                                    .add(DecoBlocks.DEAD_EYE_DAISY.getDefaultState(),1).build()),16));

        ConfiguredFeatures.register(context, DECO_RIVER_KEY, Feature.FLOWER,
                        DecoConfiguredFeatures.createRandomPatchFeatureConfig(new WeightedBlockStateProvider
                                        (DataPool.<BlockState>builder().add(DecoBlocks.PINK_ORCHID.getDefaultState(),3)
                                        .add(DecoBlocks.SALMON_POPPY.getDefaultState(),2)
                                .add(DecoBlocks.LAVENDER.getDefaultState(),1)
                                .add(DecoBlocks.WHITE_ORCHID.getDefaultState(),3).build()),32));

        register(context, DECO_ROSE_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(64, 6, 2,
                        PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(DecoBlocks.ROSE)))));

        register(context, DECO_ENDER_KEY, Feature.FLOWER,
                ConfiguredFeatures.createRandomPatchFeatureConfig(64,
                        PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(new DualNoiseBlockStateProvider(new Range<>(1, 3),
                                    new DoublePerlinNoiseSampler.NoiseParameters(-10, 1.0),
                                    1.0F, 2345L, new DoublePerlinNoiseSampler.NoiseParameters(-3, 1.0),
                                    1.0F, List.of(DecoBlocks.ENDER_ROSE.getDefaultState(), DecoBlocks.ENDERSHADE.getDefaultState()))))));

        register(context, DECO_RED_SUNFLOWER_KEY, Feature.RANDOM_PATCH, ConfiguredFeatures.createRandomPatchFeatureConfig(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(DecoBlocks.RED_SUNFLOWER))));
        register(context, DECO_NOVA_STARFLOWER_KEY, Feature.RANDOM_PATCH, ConfiguredFeatures.createRandomPatchFeatureConfig(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(DecoBlocks.NOVA_STARFLOWER))));

        ConfiguredFeatures.register(context, DECO_BIRCH_KEY,
                Feature.FLOWER, DecoConfiguredFeatures.createRandomPatchFeatureConfig(new WeightedBlockStateProvider
                        (DataPool.<BlockState>builder().add(DecoBlocks.PAEONIA.getDefaultState(),3)
                                .add(DecoBlocks.BUTTERCUP.getDefaultState(),3)
                                .add(DecoBlocks.NIGHTSHADE.getDefaultState(),1)
                                .add(DecoBlocks.WHITE_ORCHID.getDefaultState(),2).build()),48));

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

        register(context, DECO_BUBBLE_ORE, Feature.ORE, new OreFeatureConfig(overworldBubbleOre, 5));

        ConfiguredFeatures.register(context, DECO_VOID_PATCH, Feature.DISK,
                new DiskFeatureConfig(PredicatedStateProvider.of(DecoBlocks.VOID_STONE),
                        BlockPredicate.matchingBlocks(List.of(Blocks.END_STONE)), UniformIntProvider.create(2, 3), 1));

        register(context, DECO_IRON_CAP_MUSHROOM, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(DecoBlocks.IRON_CAP_STEM), new StraightTrunkPlacer(2, 4, 0),
                BlockStateProvider.of(DecoBlocks.IRON_CAP_MUSHROOM_BLOCK),
                new AcaciaFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0)),
                new TwoLayersFeatureSize(1, 0, 2)).decorators
                        (ImmutableList.of(new AlterGroundTreeDecorator(BlockStateProvider.of(DecoBlocks.SPORE_IRON_ORE))))
                .build());

    }
    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(VaranDeco.MOD_ID, name));
    }

    private static RandomPatchFeatureConfig createRandomPatchFeatureConfig(BlockStateProvider block, int tries) {
        return ConfiguredFeatures.createRandomPatchFeatureConfig(tries, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(block)));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
