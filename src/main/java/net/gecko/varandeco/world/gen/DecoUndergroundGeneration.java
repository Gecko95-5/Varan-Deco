package net.gecko.varandeco.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.gecko.varandeco.world.feature.DecoPlacedFeatures;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;

public class DecoUndergroundGeneration {
    public static void generateUnderground(){
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SOUL_SAND_VALLEY),
                GenerationStep.Feature.UNDERGROUND_DECORATION, DecoPlacedFeatures.DECO_WITHER_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SOUL_SAND_VALLEY),
                GenerationStep.Feature.UNDERGROUND_DECORATION, DecoPlacedFeatures.DECO_SOULSAND_PLACED);

    }
}
