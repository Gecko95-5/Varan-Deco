package net.gecko.varandeco.world.feature.tree;

import net.gecko.varandeco.world.feature.DecoConfiguredFeatures;
import net.minecraft.block.sapling.LargeTreeSaplingGenerator;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

public class WoodenSaplingGenerator extends LargeTreeSaplingGenerator {
    @Override
    protected RegistryEntry<? extends ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {
        if (random.nextInt(10) == 0) {
            return DecoConfiguredFeatures.DECO_FANCY_WOODEN_TREE;
        } else {
            return DecoConfiguredFeatures.DECO_WOODEN_TREE;
        }
    }

    @Override
    protected @Nullable RegistryEntry<? extends ConfiguredFeature<?, ?>> getLargeTreeFeature(Random random) {
        return DecoConfiguredFeatures.DECO_MEGA_WOODEN_TREE;
    }
}
