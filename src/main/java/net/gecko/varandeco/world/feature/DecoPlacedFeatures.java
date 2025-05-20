package net.gecko.varandeco.world.feature;

import net.gecko.varandeco.VaranDeco;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;

public class DecoPlacedFeatures {

    public static final RegistryKey<PlacedFeature> DECO_FLOWER_FOREST_PLACED = registerKey("deco_flower_forest_flowers_placed");
    public static final RegistryKey<PlacedFeature> DECO_MEADOW_PLACED = registerKey("deco_meadow_flowers_placed");
    public static final RegistryKey<PlacedFeature> DECO_PLAINS_PLACED = registerKey("deco_plains_flowers_placed");
    public static final RegistryKey<PlacedFeature> DECO_SAVANNA_PLACED = registerKey("deco_savanna_flowers_placed");
    public static final RegistryKey<PlacedFeature> DECO_SWAMP_PLACED = registerKey("deco_swamp_flowers_placed");
    public static final RegistryKey<PlacedFeature> DECO_RIVER_PLACED = registerKey("deco_river_flowers_placed");
    public static final RegistryKey<PlacedFeature> DECO_ROSE_PLACED = registerKey("deco_rose_placed");
    public static final RegistryKey<PlacedFeature> DECO_ENDER_PLACED = registerKey("deco_ender_placed");
    public static final RegistryKey<PlacedFeature> DECO_WITHER_PLACED = registerKey("deco_wither_placed");
    public static final RegistryKey<PlacedFeature> DECO_SOULSAND_PLACED = registerKey("deco_soulsand_placed");
    public static final RegistryKey<PlacedFeature> DECO_RED_SUNFLOWER_PLACED = registerKey("deco_red_sunflower_placed");
    public static final RegistryKey<PlacedFeature> DECO_NOVA_STARFLOWER_PLACED = registerKey("deco_nova_starflower_placed");
    public static final RegistryKey<PlacedFeature> DECO_PAEONIA_PLACED = registerKey("deco_paeonia_placed");

    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

register(context,DECO_FLOWER_FOREST_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(DecoConfiguredFeatures.DECO_FLOWER_FOREST_KEY),
        CountPlacementModifier.of(3), RarityFilterPlacementModifier.of(2), SquarePlacementModifier.of(),
        PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

register(context,DECO_MEADOW_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(DecoConfiguredFeatures.DECO_MEADOW_KEY),
        SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

register(context,DECO_PLAINS_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(
                DecoConfiguredFeatures.DECO_PLAINS_KEY), NoiseThresholdCountPlacementModifier.of(-0.8, 15, 4),
                RarityFilterPlacementModifier.of(32), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP,
                BiomePlacementModifier.of());

register(context,DECO_SAVANNA_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(
                DecoConfiguredFeatures.DECO_SAVANNA_KEY), NoiseThresholdCountPlacementModifier.of(-0.8, 15, 4),
                RarityFilterPlacementModifier.of(32), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP,
                BiomePlacementModifier.of());

register(context,DECO_SWAMP_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(
                DecoConfiguredFeatures.DECO_SWAMP_KEY), RarityFilterPlacementModifier.of(32), SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

register(context,DECO_RIVER_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(
                DecoConfiguredFeatures.DECO_RIVER_KEY), NoiseThresholdCountPlacementModifier.of(-0.8, 15, 4),
                RarityFilterPlacementModifier.of(32), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP,
                BiomePlacementModifier.of());

register(context,DECO_ROSE_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(
                DecoConfiguredFeatures.DECO_ROSE_KEY), RarityFilterPlacementModifier.of(32), SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

register(context,DECO_ENDER_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(
                DecoConfiguredFeatures.DECO_ENDER_KEY), RarityFilterPlacementModifier.of(64), SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

register(context,DECO_WITHER_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(
                DecoConfiguredFeatures.DECO_WITHER_KEY), RarityFilterPlacementModifier.of(32), BiomePlacementModifier.of());

register(context,DECO_SOULSAND_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(
                DecoConfiguredFeatures.DECO_SOULSAND_KEY), RarityFilterPlacementModifier.of(32), BiomePlacementModifier.of());

register(context,DECO_RED_SUNFLOWER_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(
                DecoConfiguredFeatures.DECO_RED_SUNFLOWER_KEY), RarityFilterPlacementModifier.of(1), SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

register(context,DECO_NOVA_STARFLOWER_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(
                DecoConfiguredFeatures.DECO_NOVA_STARFLOWER_KEY), RarityFilterPlacementModifier.of(32), SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

register(context,DECO_PAEONIA_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(
                DecoConfiguredFeatures.DECO_PAEONIA_KEY), RarityFilterPlacementModifier.of(32), SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(VaranDeco.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                                                                   RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                                                                   PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
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
