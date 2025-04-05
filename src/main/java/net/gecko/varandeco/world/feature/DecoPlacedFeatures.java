package net.gecko.varandeco.world.feature;

import net.minecraft.util.registry.RegistryEntry;
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
