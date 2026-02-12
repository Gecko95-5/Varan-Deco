package net.gecko.varandeco.world.feature;

import net.minecraft.block.Blocks;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.blockpredicate.BlockPredicate;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;

public class DecoPlacedFeatures {

    public static final RegistryEntry<PlacedFeature> DECO_FLOWER_FOREST_PLACED = PlacedFeatures.register("deco_flower_forest_flowers_placed",
            DecoConfiguredFeatures.DECO_FLOWER_FOREST, CountPlacementModifier.of(3), RarityFilterPlacementModifier.of(2),
            SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

    public static final RegistryEntry<PlacedFeature> DECO_TULIPS_FOREST_PLACED  = PlacedFeatures.register("deco_flower_forest_tulips_placed",
            DecoConfiguredFeatures.DECO_TULIPS_FOREST, CountPlacementModifier.of(3), RarityFilterPlacementModifier.of(2),
            SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

    public static final RegistryEntry<PlacedFeature> DECO_MEADOW_PLACED = PlacedFeatures.register("deco_meadow_flowers_placed",
            DecoConfiguredFeatures.DECO_MEADOW, SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP,
            BiomePlacementModifier.of());

    public static final RegistryEntry<PlacedFeature> DECO_TULIPS_MEADOW_PLACED = PlacedFeatures.register("deco_meadow_tulips_placed",
            DecoConfiguredFeatures.DECO_TULIPS_MEADOW, SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP,
            BiomePlacementModifier.of());

    public static final RegistryEntry<PlacedFeature> DECO_PLAINS_PLACED = PlacedFeatures.register("deco_plains_flowers_placed",
            DecoConfiguredFeatures.DECO_PLAINS, NoiseThresholdCountPlacementModifier.of(-0.8, 15, 4),
            RarityFilterPlacementModifier.of(32), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP,
            BiomePlacementModifier.of());

    public static final RegistryEntry<PlacedFeature> DECO_SAVANNA_PLACED = PlacedFeatures.register("deco_savanna_flowers_placed",
            DecoConfiguredFeatures.DECO_SAVANNA,NoiseThresholdCountPlacementModifier.of(-0.8, 15, 4),
            RarityFilterPlacementModifier.of(16), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP,
            BiomePlacementModifier.of());

    public static final RegistryEntry<PlacedFeature> DECO_SWAMP_PLACED = PlacedFeatures.register("deco_swamp_flowers_placed",
            DecoConfiguredFeatures.DECO_SWAMP, RarityFilterPlacementModifier.of(32), SquarePlacementModifier.of(),
            PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

    public static final RegistryEntry<PlacedFeature> DECO_RIVER_PLACED = PlacedFeatures.register("deco_river_flowers_placed",
            DecoConfiguredFeatures.DECO_RIVER,NoiseThresholdCountPlacementModifier.of(-0.8, 15, 4),
            RarityFilterPlacementModifier.of(16), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP,
            BiomePlacementModifier.of());

    public static final RegistryEntry<PlacedFeature> DECO_ROSE_PLACED = PlacedFeatures.register("deco_rose_placed",
            DecoConfiguredFeatures.DECO_ROSE, RarityFilterPlacementModifier.of(32), SquarePlacementModifier.of(),
            PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

    public static final RegistryEntry<PlacedFeature> DECO_ENDER_PLACED = PlacedFeatures.register("deco_ender_placed",
            DecoConfiguredFeatures.DECO_ENDER, RarityFilterPlacementModifier.of(32), SquarePlacementModifier.of(),
            PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

    public static final RegistryEntry<PlacedFeature> DECO_RED_SUNFLOWER_PLACED = PlacedFeatures.register("deco_red_sunflower_placed",
            DecoConfiguredFeatures.DECO_RED_SUNFLOWER, RarityFilterPlacementModifier.of(128), SquarePlacementModifier.of(),
            PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

    public static final RegistryEntry<PlacedFeature> DECO_NOVA_STARFLOWER_PLACED = PlacedFeatures.register("deco_nova_starflower_placed",
            DecoConfiguredFeatures.DECO_NOVA_STARFLOWER, RarityFilterPlacementModifier.of(64), SquarePlacementModifier.of(),
            PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

    public static final RegistryEntry<PlacedFeature> DECO_BIRCH_PLACED = PlacedFeatures.register("deco_birch_placed",
            DecoConfiguredFeatures.DECO_BIRCH, RarityFilterPlacementModifier.of(32), SquarePlacementModifier.of(),
            PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

    public static final RegistryEntry<PlacedFeature> DECO_JUNGLE_PLACED = PlacedFeatures.register("deco_jungle_placed",
            DecoConfiguredFeatures.DECO_JUNGLE, RarityFilterPlacementModifier.of(16), SquarePlacementModifier.of(),
            PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

    public static final RegistryEntry<PlacedFeature> DECO_SPARSE_JUNGLE_PLACED = PlacedFeatures.register("deco_sparse_jungle_placed",
            DecoConfiguredFeatures.DECO_JUNGLE, RarityFilterPlacementModifier.of(8), SquarePlacementModifier.of(),
            PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

    public static final RegistryEntry<PlacedFeature> DECO_MESA_PLACED = PlacedFeatures.register("deco_mesa_placed",
            DecoConfiguredFeatures.DECO_MESA, RarityFilterPlacementModifier.of(64), SquarePlacementModifier.of(),
            PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

    public static final RegistryEntry<PlacedFeature> DECO_DESERT_PLACED = PlacedFeatures.register("deco_desert_placed",
            DecoConfiguredFeatures.DECO_DESERT, RarityFilterPlacementModifier.of(64), SquarePlacementModifier.of(),
            PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

    public static final RegistryEntry<PlacedFeature> DECO_BUBBLE_ORE_PLACED = PlacedFeatures.register("deco_bubble_ore_placed",
            DecoConfiguredFeatures.DECO_BUBBLE_ORE, modifiersWithCount(5,
                    HeightRangePlacementModifier.uniform(YOffset.fixed(8), YOffset.fixed(27))));

    public static final RegistryEntry<PlacedFeature> DECO_DEEP_BUBBLE_ORE_PLACED = PlacedFeatures.register("deco_deep_bubble_ore_placed",
            DecoConfiguredFeatures.DECO_BUBBLE_ORE, modifiersWithCount(5,
                    HeightRangePlacementModifier.uniform(YOffset.fixed(8), YOffset.fixed(45))));

    public static final RegistryEntry<PlacedFeature> DECO_VOID_PATCH_PLACED = PlacedFeatures.register("deco_void_patch_placed",
            DecoConfiguredFeatures.DECO_VOID_PATCH, RarityFilterPlacementModifier.of(8), SquarePlacementModifier.of(),
            PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, RandomOffsetPlacementModifier.vertically(ConstantIntProvider.create(-1)),
            BlockFilterPlacementModifier.of(BlockPredicate.matchingBlocks(Blocks.END_STONE)), BiomePlacementModifier.of());

    public static final RegistryEntry<PlacedFeature> DECO_VOID_BIG_PATCH_PLACED = PlacedFeatures.register("deco_void_big_patch_placed",
            DecoConfiguredFeatures.DECO_VOID_PATCH, CountPlacementModifier.of(2), SquarePlacementModifier.of(),
            PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, RandomOffsetPlacementModifier.vertically(ConstantIntProvider.create(-1)),
            BlockFilterPlacementModifier.of(BlockPredicate.matchingBlocks(Blocks.END_STONE)), BiomePlacementModifier.of());

    private static List<PlacementModifier> modifiers(PlacementModifier countModifier, PlacementModifier heightModifier) {
        return List.of(countModifier, SquarePlacementModifier.of(), heightModifier, BiomePlacementModifier.of());
    }
    private static List<PlacementModifier> modifiersWithCount(int count, PlacementModifier heightModifier) {
        return modifiers(CountPlacementModifier.of(count), heightModifier);
    }
}
