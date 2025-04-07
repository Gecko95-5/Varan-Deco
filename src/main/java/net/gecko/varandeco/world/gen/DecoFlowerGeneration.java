package net.gecko.varandeco.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.gecko.varandeco.world.feature.DecoPlacedFeatures;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;

public class DecoFlowerGeneration {
    public static void generateFlowers(){
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FLOWER_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_FLOWER_FOREST_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.MEADOW),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_MEADOW_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_PLAINS_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SUNFLOWER_PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_PLAINS_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SAVANNA),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_SAVANNA_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SAVANNA_PLATEAU),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_SAVANNA_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.WINDSWEPT_SAVANNA),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_SAVANNA_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.STONY_PEAKS),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_SAVANNA_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SWAMP),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_SWAMP_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.RIVER),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_RIVER_PLACED.getKey().get());

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_ROSE_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SUNFLOWER_PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_ROSE_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SAVANNA),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_ROSE_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SAVANNA_PLATEAU),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_ROSE_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.WINDSWEPT_SAVANNA),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_ROSE_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SNOWY_PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_ROSE_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_ROSE_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.BIRCH_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_ROSE_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.OLD_GROWTH_BIRCH_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_ROSE_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.TAIGA),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_ROSE_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.OLD_GROWTH_PINE_TAIGA),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_ROSE_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.OLD_GROWTH_SPRUCE_TAIGA),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_ROSE_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.JUNGLE),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_ROSE_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.BAMBOO_JUNGLE),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_ROSE_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SPARSE_JUNGLE),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_ROSE_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DARK_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_ROSE_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.WINDSWEPT_HILLS),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_ROSE_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.WINDSWEPT_GRAVELLY_HILLS),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_ROSE_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.WINDSWEPT_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_ROSE_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.RIVER),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_ROSE_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FROZEN_RIVER),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_ROSE_PLACED.getKey().get());

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.END_MIDLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_ENDER_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.END_HIGHLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_ENDER_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.END_BARRENS),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_ENDER_PLACED.getKey().get());

    }
}
