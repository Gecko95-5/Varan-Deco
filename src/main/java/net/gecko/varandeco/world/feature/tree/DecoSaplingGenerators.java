package net.gecko.varandeco.world.feature.tree;

import net.gecko.varandeco.world.feature.DecoConfiguredFeatures;
import net.minecraft.block.SaplingGenerator;

import java.util.Optional;

public class DecoSaplingGenerators {

    public static final SaplingGenerator WOODEN =
            new SaplingGenerator("wooden", 0f, Optional.of(DecoConfiguredFeatures.DECO_MEGA_WOODEN_TREE_KEY),
                    Optional.empty(),
                    Optional.of(DecoConfiguredFeatures.DECO_WOODEN_TREE_KEY),
                    Optional.of(DecoConfiguredFeatures.DECO_FANCY_WOODEN_TREE_KEY),
                    Optional.empty(),
                    Optional.empty());
}
