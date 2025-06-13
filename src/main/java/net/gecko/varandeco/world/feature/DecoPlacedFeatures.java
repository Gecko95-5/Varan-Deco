package net.gecko.varandeco.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;

public class DecoPlacedFeatures {

    public static final RegistryEntry<PlacedFeature> DECO_FLOWER_FOREST_PLACED = PlacedFeatures.register("deco_flower_forest_flowers_placed",
            DecoConfiguredFeatures.DECO_FLOWER_FOREST, CountPlacementModifier.of(3), RarityFilterPlacementModifier.of(2),
            SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

    public static final RegistryEntry<PlacedFeature> DECO_MEADOW_PLACED = PlacedFeatures.register("deco_meadow_flowers_placed",
            DecoConfiguredFeatures.DECO_MEADOW, SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP,
            BiomePlacementModifier.of());

    public static final RegistryEntry<PlacedFeature> DECO_PLAINS_PLACED = PlacedFeatures.register("deco_plains_flowers_placed",
            DecoConfiguredFeatures.DECO_PLAINS, NoiseThresholdCountPlacementModifier.of(-0.8, 15, 4),
            RarityFilterPlacementModifier.of(32), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP,
            BiomePlacementModifier.of());

    public static final RegistryEntry<PlacedFeature> DECO_SAVANNA_PLACED = PlacedFeatures.register("deco_savanna_flowers_placed",
            DecoConfiguredFeatures.DECO_SAVANNA,NoiseThresholdCountPlacementModifier.of(-0.8, 15, 4),
            RarityFilterPlacementModifier.of(32), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP,
            BiomePlacementModifier.of());

    public static final RegistryEntry<PlacedFeature> DECO_SWAMP_PLACED = PlacedFeatures.register("deco_swamp_flowers_placed",
            DecoConfiguredFeatures.DECO_SWAMP, RarityFilterPlacementModifier.of(32), SquarePlacementModifier.of(),
            PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

    public static final RegistryEntry<PlacedFeature> DECO_RIVER_PLACED = PlacedFeatures.register("deco_river_flowers_placed",
            DecoConfiguredFeatures.DECO_RIVER,NoiseThresholdCountPlacementModifier.of(-0.8, 15, 4),
            RarityFilterPlacementModifier.of(32), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP,
            BiomePlacementModifier.of());

    public static final RegistryEntry<PlacedFeature> DECO_ROSE_PLACED = PlacedFeatures.register("deco_rose_placed",
            DecoConfiguredFeatures.DECO_ROSE, RarityFilterPlacementModifier.of(32), SquarePlacementModifier.of(),
            PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

    public static final RegistryEntry<PlacedFeature> DECO_ENDER_PLACED = PlacedFeatures.register("deco_ender_placed",
            DecoConfiguredFeatures.DECO_ENDER, RarityFilterPlacementModifier.of(64), SquarePlacementModifier.of(),
            PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

    public static final RegistryEntry<PlacedFeature> DECO_WITHER_PLACED = PlacedFeatures.register("deco_wither_placed",
            DecoConfiguredFeatures.DECO_WITHER, RarityFilterPlacementModifier.of(32), BiomePlacementModifier.of());

    public static final RegistryEntry<PlacedFeature> DECO_SOULSAND_PLACED = PlacedFeatures.register("deco_soulsand_placed",
            DecoConfiguredFeatures.DECO_SOULSAND, RarityFilterPlacementModifier.of(32), BiomePlacementModifier.of());

    public static final RegistryEntry<PlacedFeature> DECO_RED_SUNFLOWER_PLACED = PlacedFeatures.register("deco_red_sunflower_placed",
            DecoConfiguredFeatures.DECO_RED_SUNFLOWER, RarityFilterPlacementModifier.of(32), SquarePlacementModifier.of(),
            PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

    public static final RegistryEntry<PlacedFeature> DECO_NOVA_STARFLOWER_PLACED = PlacedFeatures.register("deco_nova_starflower_placed",
            DecoConfiguredFeatures.DECO_NOVA_STARFLOWER, RarityFilterPlacementModifier.of(32), SquarePlacementModifier.of(),
            PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

    public static final RegistryEntry<PlacedFeature> DECO_PAEONIA_PLACED = PlacedFeatures.register("deco_paeonia_placed",
            DecoConfiguredFeatures.DECO_PAEONIA, RarityFilterPlacementModifier.of(32), SquarePlacementModifier.of(),
            PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

    public static final RegistryEntry<PlacedFeature> DECO_BUBBLE_ORE_PLACED = PlacedFeatures.register("deco_bubble_ore_placed",
            DecoConfiguredFeatures.DECO_BUBBLE_ORE, modifiersWithCount(1,
                    HeightRangePlacementModifier.uniform(YOffset.fixed(27), YOffset.fixed(47))));

    private static List<PlacementModifier> modifiers(PlacementModifier countModifier, PlacementModifier heightModifier) {
        return List.of(countModifier, SquarePlacementModifier.of(), heightModifier, BiomePlacementModifier.of());
    }
    private static List<PlacementModifier> modifiersWithCount(int count, PlacementModifier heightModifier) {
        return modifiers(CountPlacementModifier.of(count), heightModifier);
    }
    private static List<PlacementModifier> modifiersWithRarity(int chance, PlacementModifier heightModifier) {
        return modifiers(RarityFilterPlacementModifier.of(chance), heightModifier);
    }
}
