package net.gecko.varandeco.util;

import com.mojang.datafixers.util.Pair;
import net.fabricmc.fabric.api.registry.FlattenableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.fabricmc.fabric.api.registry.TillableBlockRegistry;
import net.gecko.varandeco.block.DecoBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Items;

public class DecoTooledBlocks {
    public static void registerStrippables(){
        StrippableBlockRegistry.register(DecoBlocks.WOODEN_LOG, DecoBlocks.STRIPPED_WOODEN_LOG);
        StrippableBlockRegistry.register(DecoBlocks.WOODEN_WOOD, DecoBlocks.STRIPPED_WOODEN_WOOD);

        StrippableBlockRegistry.register(DecoBlocks.DRIFTWOOD_LOG, DecoBlocks.STRIPPED_DRIFTWOOD_LOG);
        StrippableBlockRegistry.register(DecoBlocks.DRIFTWOOD, DecoBlocks.STRIPPED_DRIFTWOOD);
        StrippableBlockRegistry.register(DecoBlocks.DRIED_DRIFTWOOD_LOG, DecoBlocks.STRIPPED_DRIFTWOOD_LOG);
        StrippableBlockRegistry.register(DecoBlocks.DRIED_DRIFTWOOD, DecoBlocks.STRIPPED_DRIFTWOOD);

        StrippableBlockRegistry.register(DecoBlocks.IRON_CAP_STEM, DecoBlocks.STRIPPED_IRON_CAP_STEM);
        StrippableBlockRegistry.register(DecoBlocks.IRON_CAP_HYPHAE, DecoBlocks.STRIPPED_IRON_CAP_HYPHAE);

        StrippableBlockRegistry.register(DecoBlocks.PACKED_CACTUS, DecoBlocks.STRIPPED_CACTUS);
    }
    public static void registerTilling(){
        TillableBlockRegistry.register(DecoBlocks.DRY_GRASS_BLOCK,itemUsageContext -> true,
                Blocks.DIRT.getDefaultState(), Items.SHORT_DRY_GRASS);
    }
    public static void registerFlatting(){
        FlattenableBlockRegistry.register(DecoBlocks.DRY_GRASS_BLOCK, Blocks.DIRT_PATH.getDefaultState());
    }

}
