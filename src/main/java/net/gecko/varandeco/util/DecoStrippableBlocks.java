package net.gecko.varandeco.util;

import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.gecko.varandeco.block.DecoBlocks;

public class DecoStrippableBlocks {
    public static void registerStrippables(){
        StrippableBlockRegistry.register(DecoBlocks.WOODEN_LOG, DecoBlocks.STRIPPED_WOODEN_LOG);
        StrippableBlockRegistry.register(DecoBlocks.WOODEN_WOOD, DecoBlocks.STRIPPED_WOODEN_WOOD);

        StrippableBlockRegistry.register(DecoBlocks.IRON_CAP_STEM, DecoBlocks.STRIPPED_IRON_CAP_STEM);
        StrippableBlockRegistry.register(DecoBlocks.IRON_CAP_HYPHAE, DecoBlocks.STRIPPED_IRON_CAP_HYPHAE);

        StrippableBlockRegistry.register(DecoBlocks.PACKED_CACTUS, DecoBlocks.STRIPPED_CACTUS);
    }
}
