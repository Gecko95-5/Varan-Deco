package net.gecko.varandeco.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.gecko.varandeco.block.DecoBlocks;
import net.minecraft.tag.BlockTags;

public class DecoBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public DecoBlockTagProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected void generateTags() {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(DecoBlocks.POLISHED_STONE)
                .add(DecoBlocks.POLISHED_STONE_STAIRS)
                .add(DecoBlocks.POLISHED_STONE_SLAB)
                .add(DecoBlocks.POLISHED_STONE_WALL)
                .add(DecoBlocks.POLISHED_ANDESITE_WALL)
                .add(DecoBlocks.POLISHED_DIORITE_WALL)
                .add(DecoBlocks.POLISHED_GRANITE_WALL)
                .add(DecoBlocks.STONE_WALL)
                .add(DecoBlocks.SMOOTH_STONE_STAIRS)
                .add(DecoBlocks.SMOOTH_STONE_WALL)
                .add(DecoBlocks.DRIPSTONE_STAIRS)
                .add(DecoBlocks.DRIPSTONE_SLAB)
                .add(DecoBlocks.DRIPSTONE_WALL)
                .add(DecoBlocks.CALCITE_STAIRS)
                .add(DecoBlocks.CALCITE_SLAB)
                .add(DecoBlocks.CALCITE_WALL)
                .add(DecoBlocks.TUFF_STAIRS)
                .add(DecoBlocks.TUFF_SLAB)
                .add(DecoBlocks.TUFF_WALL)
                .add(DecoBlocks.STONE_TILES);


        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(DecoBlocks.POLISHED_STONE_WALL)
                .add(DecoBlocks.POLISHED_ANDESITE_WALL)
                .add(DecoBlocks.POLISHED_DIORITE_WALL)
                .add(DecoBlocks.POLISHED_GRANITE_WALL)
                .add(DecoBlocks.STONE_WALL)
                .add(DecoBlocks.SMOOTH_STONE_WALL)
                .add(DecoBlocks.DRIPSTONE_WALL)
                .add(DecoBlocks.CALCITE_WALL)
                .add(DecoBlocks.TUFF_WALL);
    }
}
