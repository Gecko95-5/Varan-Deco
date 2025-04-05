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
    }
}
