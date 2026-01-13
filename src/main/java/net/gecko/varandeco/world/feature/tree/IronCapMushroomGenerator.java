package net.gecko.varandeco.world.feature.tree;

import net.gecko.varandeco.world.feature.DecoConfiguredFeatures;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

public class IronCapMushroomGenerator extends SaplingGenerator {
    @Override
    protected @Nullable RegistryKey<ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {
        return DecoConfiguredFeatures.DECO_IRON_CAP_MUSHROOM;
    }
}
