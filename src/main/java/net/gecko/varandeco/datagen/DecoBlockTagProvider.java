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
                .add(DecoBlocks.STONE_TILES)
                .add(DecoBlocks.STONE_TILE_STAIRS)
                .add(DecoBlocks.STONE_TILE_SLAB)
                .add(DecoBlocks.STONE_TILE_WALL)
                .add(DecoBlocks.PACKED_MUD_STAIRS)
                .add(DecoBlocks.PACKED_MUD_SLAB)
                .add(DecoBlocks.PACKED_MUD_WALL)
                .add(DecoBlocks.RED_NETHER_BRICK_FENCE)
                .add(DecoBlocks.NETHER_BRICK_FENCE_GATE)
                .add(DecoBlocks.RED_NETHER_BRICK_FENCE_GATE)
                .add(DecoBlocks.NETHERRACK_STAIRS)
                .add(DecoBlocks.NETHERRACK_SLAB)
                .add(DecoBlocks.NETHERRACK_WALL)
                .add(DecoBlocks.MAGMA_STAIRS)
                .add(DecoBlocks.MAGMA_SLAB)
                .add(DecoBlocks.MAGMA_WALL)
                .add(DecoBlocks.MAGMA_BRICKS)
                .add(DecoBlocks.MAGMA_BRICK_STAIRS)
                .add(DecoBlocks.MAGMA_BRICK_SLAB)
                .add(DecoBlocks.MAGMA_BRICK_WALL)
                .add(DecoBlocks.CHISELED_MAGMA_BRICKS)
                .add(DecoBlocks.POLISHED_BLACKSTONE_TILES)
                .add(DecoBlocks.POLISHED_BLACKSTONE_TILE_STAIRS)
                .add(DecoBlocks.POLISHED_BLACKSTONE_TILE_SLAB)
                .add(DecoBlocks.POLISHED_BLACKSTONE_TILE_WALL)
                .add(DecoBlocks.POLISHED_GLIDED_BLACKSTONE)
                .add(DecoBlocks.CHISELED_GLIDED_BLACKSTONE);

        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE)
                .add(DecoBlocks.SNOW_STAIRS)
                .add(DecoBlocks.SNOW_SLAB)
                .add(DecoBlocks.SNOW_WALL);


        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(DecoBlocks.POLISHED_STONE_WALL)
                .add(DecoBlocks.POLISHED_ANDESITE_WALL)
                .add(DecoBlocks.POLISHED_DIORITE_WALL)
                .add(DecoBlocks.POLISHED_GRANITE_WALL)
                .add(DecoBlocks.STONE_WALL)
                .add(DecoBlocks.SMOOTH_STONE_WALL)
                .add(DecoBlocks.DRIPSTONE_WALL)
                .add(DecoBlocks.CALCITE_WALL)
                .add(DecoBlocks.TUFF_WALL)
                .add(DecoBlocks.STONE_TILE_WALL)
                .add(DecoBlocks.PACKED_MUD_WALL)
                .add(DecoBlocks.NETHERRACK_WALL)
                .add(DecoBlocks.MAGMA_WALL)
                .add(DecoBlocks.MAGMA_BRICK_WALL)
                .add(DecoBlocks.POLISHED_BLACKSTONE_TILE_WALL)
                .add(DecoBlocks.SNOW_WALL);

        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(DecoBlocks.RED_NETHER_BRICK_FENCE);

        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(DecoBlocks.NETHER_BRICK_FENCE_GATE)
                .add(DecoBlocks.RED_NETHER_BRICK_FENCE_GATE);
    }
}
