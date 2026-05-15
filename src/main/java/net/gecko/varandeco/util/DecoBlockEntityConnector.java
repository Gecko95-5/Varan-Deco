package net.gecko.varandeco.util;

import net.gecko.varandeco.block.DecoBlocks;
import net.minecraft.block.entity.BlockEntityType;

public class DecoBlockEntityConnector {
    public static void registerConnectedBlockEntities(){
        BlockEntityType.BARREL.addSupportedBlock(DecoBlocks.OAK_BARREL);
        BlockEntityType.BARREL.addSupportedBlock(DecoBlocks.BIRCH_BARREL);
        BlockEntityType.BARREL.addSupportedBlock(DecoBlocks.SPRUCE_BARREL);
        BlockEntityType.BARREL.addSupportedBlock(DecoBlocks.JUNGLE_BARREL);
        BlockEntityType.BARREL.addSupportedBlock(DecoBlocks.ACACIA_BARREL);
        BlockEntityType.BARREL.addSupportedBlock(DecoBlocks.DARK_OAK_BARREL);
        BlockEntityType.BARREL.addSupportedBlock(DecoBlocks.CHERRY_BARREL);
        BlockEntityType.BARREL.addSupportedBlock(DecoBlocks.MANGROVE_BARREL);
        BlockEntityType.BARREL.addSupportedBlock(DecoBlocks.PALE_OAK_BARREL);
        BlockEntityType.BARREL.addSupportedBlock(DecoBlocks.BAMBOO_BARREL);
        BlockEntityType.BARREL.addSupportedBlock(DecoBlocks.CRIMSON_BARREL);
        BlockEntityType.BARREL.addSupportedBlock(DecoBlocks.WARPED_BARREL);
        BlockEntityType.BARREL.addSupportedBlock(DecoBlocks.CACTUS_BARREL);
        BlockEntityType.BARREL.addSupportedBlock(DecoBlocks.DRIFTWOOD_BARREL);
        BlockEntityType.BARREL.addSupportedBlock(DecoBlocks.MUSHROOM_BARREL);
        BlockEntityType.BARREL.addSupportedBlock(DecoBlocks.IRON_CAP_BARREL);

        BlockEntityType.FURNACE.addSupportedBlock(DecoBlocks.DEEPSLATE_FURNACE);
        BlockEntityType.BLAST_FURNACE.addSupportedBlock(DecoBlocks.DEEPSLATE_BLAST_FURNACE);
        BlockEntityType.SMOKER.addSupportedBlock(DecoBlocks.DEEPSLATE_SMOKER);

        BlockEntityType.FURNACE.addSupportedBlock(DecoBlocks.BLACKSTONE_FURNACE);
        BlockEntityType.BLAST_FURNACE.addSupportedBlock(DecoBlocks.BLACKSTONE_BLAST_FURNACE);
        BlockEntityType.SMOKER.addSupportedBlock(DecoBlocks.BLACKSTONE_SMOKER);

        BlockEntityType.FURNACE.addSupportedBlock(DecoBlocks.TUFF_FURNACE);
        BlockEntityType.BLAST_FURNACE.addSupportedBlock(DecoBlocks.TUFF_BLAST_FURNACE);
        BlockEntityType.SMOKER.addSupportedBlock(DecoBlocks.TUFF_SMOKER);

        BlockEntityType.FURNACE.addSupportedBlock(DecoBlocks.END_STONE_FURNACE);
        BlockEntityType.BLAST_FURNACE.addSupportedBlock(DecoBlocks.END_STONE_BLAST_FURNACE);
        BlockEntityType.SMOKER.addSupportedBlock(DecoBlocks.END_STONE_SMOKER);

        BlockEntityType.SHELF.addSupportedBlock(DecoBlocks.CACTUS_SHELF);
        BlockEntityType.SHELF.addSupportedBlock(DecoBlocks.MUSHROOM_SHELF);
        BlockEntityType.SHELF.addSupportedBlock(DecoBlocks.IRON_CAP_SHELF);
        BlockEntityType.SHELF.addSupportedBlock(DecoBlocks.DRIFTWOOD_SHELF);
        BlockEntityType.SHELF.addSupportedBlock(DecoBlocks.WOODEN_SHELF);
    }
}
