package net.gecko.varandeco.util;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.gecko.varandeco.block.DecoBlocks;
import net.minecraft.block.Blocks;

public class DecoFlammableBlocks {
    public static void registerFlammableBlocks(){
        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();

        registry.add(DecoBlocks.CACTUS_PLANKS,5,20);
        registry.add(Blocks.CACTUS,5,5);

        registry.add(DecoBlocks.CACTUS_PLANK_STAIRS,5,20);
        registry.add(DecoBlocks.CACTUS_PLANK_SLAB,5,20);
        registry.add(DecoBlocks.CACTUS_PLANK_FENCE,5,20);
        registry.add(DecoBlocks.CACTUS_PLANK_FENCE_GATE,5,20);

        registry.add(DecoBlocks.WOODEN_PLANKS,5,20);
        registry.add(DecoBlocks.WOODEN_LOG,5,5);
        registry.add(DecoBlocks.STRIPPED_WOODEN_LOG,5,5);
        registry.add(DecoBlocks.WOODEN_WOOD,5,5);
        registry.add(DecoBlocks.STRIPPED_WOODEN_WOOD,5,5);

        registry.add(DecoBlocks.WOODEN_STAIRS,5,20);
        registry.add(DecoBlocks.WOODEN_SLAB,5,20);
        registry.add(DecoBlocks.WOODEN_FENCE,5,20);
        registry.add(DecoBlocks.WOODEN_FENCE_GATE,5,20);
        registry.add(DecoBlocks.WOODEN_LEAVES,30, 60);

        registry.add(DecoBlocks.YELLOW_TULIP,60, 100);
        registry.add(DecoBlocks.PURPLE_TULIP,60, 100);
        registry.add(DecoBlocks.MAGENTA_TULIP,60, 100);
        registry.add(DecoBlocks.BLACK_TULIP,60, 100);
        registry.add(DecoBlocks.GREEN_TULIP,60, 100);
        registry.add(DecoBlocks.BLUE_TULIP,60, 100);
        registry.add(DecoBlocks.CYAN_TULIP,60, 100);

        registry.add(DecoBlocks.BARBERTON_DAISY,60, 100);
        registry.add(DecoBlocks.BLUE_EYED_DAISY,60, 100);
        registry.add(DecoBlocks.GERBERA_DAISY,60, 100);
        registry.add(DecoBlocks.MICHAELMAS_DAISY,60, 100);

        registry.add(DecoBlocks.PUFFY_DANDELION,60, 100);

        registry.add(DecoBlocks.CALIFORNIA_POPPY,60, 100);
        registry.add(DecoBlocks.SALMON_POPPY,60, 100);

        registry.add(DecoBlocks.YELLOW_ORCHID,60, 100);
        registry.add(DecoBlocks.WHITE_ORCHID,60, 100);
        registry.add(DecoBlocks.PINK_ORCHID,60, 100);

        registry.add(DecoBlocks.ROSE,60, 100);
        registry.add(DecoBlocks.ENDER_ROSE,60, 100);
        registry.add(DecoBlocks.WITHER_ROSE_BUSH,60, 100);
        registry.add(DecoBlocks.ENDER_ROSE_BUSH,60, 100);

        registry.add(DecoBlocks.RED_SUNFLOWER,60, 100);
        registry.add(DecoBlocks.NOVA_STARFLOWER,60, 100);

        registry.add(DecoBlocks.PAEONIA,60, 100);
        registry.add(DecoBlocks.LAVENDER,60, 100);
        
        registry.add(DecoTags.Blocks.DECO_BOOKSHELVES,30,20);

        registry.add(DecoBlocks.ANCIENT_ROSE,60, 100);
        registry.add(DecoBlocks.MIGHTY_LAVENDER,60, 100);

        registry.add(DecoTags.Blocks.MOSAIC_WOOD,5,20);
        registry.add(DecoTags.Blocks.MOSAIC_SLABS,5,20);
        registry.add(DecoTags.Blocks.MOSAIC_STAIRS,5,20);

    }
}
