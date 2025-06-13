package net.gecko.varandeco.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.gecko.varandeco.world.feature.DecoPlacedFeatures;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;

public class DecoMiscGeneration {
    public static void generateMiscellaneous(){
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SOUL_SAND_VALLEY),
                GenerationStep.Feature.UNDERGROUND_DECORATION, DecoPlacedFeatures.DECO_WITHER_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SOUL_SAND_VALLEY),
                GenerationStep.Feature.UNDERGROUND_DECORATION, DecoPlacedFeatures.DECO_SOULSAND_PLACED.getKey().get());

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DEEP_OCEAN),
                GenerationStep.Feature.UNDERGROUND_ORES, DecoPlacedFeatures.DECO_BUBBLE_ORE_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DEEP_COLD_OCEAN),
                GenerationStep.Feature.UNDERGROUND_ORES, DecoPlacedFeatures.DECO_BUBBLE_ORE_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DEEP_FROZEN_OCEAN),
                GenerationStep.Feature.UNDERGROUND_ORES, DecoPlacedFeatures.DECO_BUBBLE_ORE_PLACED.getKey().get());
    }
}
