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
                .add(DecoBlocks.CHISELED_GLIDED_BLACKSTONE)
                .add(DecoBlocks.BLUE_ICE_STAIRS)
                .add(DecoBlocks.BLUE_ICE_SLAB)
                .add(DecoBlocks.BLUE_ICE_WALL)
                .add(DecoBlocks.PACKED_ICE_STAIRS)
                .add(DecoBlocks.PACKED_ICE_SLAB)
                .add(DecoBlocks.PACKED_ICE_WALL)
                .add(DecoBlocks.ICE_BRICKS)
                .add(DecoBlocks.ICE_BRICK_STAIRS)
                .add(DecoBlocks.ICE_BRICK_SLAB)
                .add(DecoBlocks.ICE_BRICK_WALL)
                .add(DecoBlocks.BLACK_ICE)
                .add(DecoBlocks.CUT_SANDSTONE_STAIRS)
                .add(DecoBlocks.CUT_SANDSTONE_WALL)
                .add(DecoBlocks.CUT_RED_SANDSTONE_STAIRS)
                .add(DecoBlocks.CUT_RED_SANDSTONE_WALL)
                .add(DecoBlocks.SMOOTH_SANDSTONE_WALL)
                .add(DecoBlocks.SMOOTH_RED_SANDSTONE_WALL)
                .add(DecoBlocks.CUT_SANDSTONE_BRICKS)
                .add(DecoBlocks.CUT_SANDSTONE_BRICK_STAIRS)
                .add(DecoBlocks.CUT_SANDSTONE_BRICK_SLAB)
                .add(DecoBlocks.CUT_SANDSTONE_BRICK_WALL)
                .add(DecoBlocks.CUT_RED_SANDSTONE_BRICKS)
                .add(DecoBlocks.CUT_RED_SANDSTONE_BRICK_STAIRS)
                .add(DecoBlocks.CUT_RED_SANDSTONE_BRICK_SLAB)
                .add(DecoBlocks.CUT_RED_SANDSTONE_BRICK_WALL)
                .add(DecoBlocks.DARK_PRISMARINE_WALL)
                .add(DecoBlocks.PRISMARINE_BRICK_WALL)
                .add(DecoBlocks.CRYSTALLIZED_PRISMARINE)
                .add(DecoBlocks.CRYSTALLIZED_PRISMARINE_STAIRS)
                .add(DecoBlocks.CRYSTALLIZED_PRISMARINE_SLAB)
                .add(DecoBlocks.CRYSTALLIZED_PRISMARINE_WALL)
                .add(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS)
                .add(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICK_STAIRS)
                .add(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICK_SLAB)
                .add(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICK_WALL)
                .add(DecoBlocks.LIGHT_PRISMARINE)
                .add(DecoBlocks.LIGHT_PRISMARINE_STAIRS)
                .add(DecoBlocks.LIGHT_PRISMARINE_SLAB)
                .add(DecoBlocks.LIGHT_PRISMARINE_WALL)
                .add(DecoBlocks.CHISELED_PRISMARINE_BRICKS)
                .add(DecoBlocks.CHISELED_CRYSTALLIZED_PRISMARINE_BRICKS)
                .add(DecoBlocks.BUBBLE_BLOCK)
                .add(DecoBlocks.BUBBLE_STAIRS)
                .add(DecoBlocks.BUBBLE_SLAB)
                .add(DecoBlocks.BUBBLE_WALL)
                .add(DecoBlocks.BUBBLE_BRICKS)
                .add(DecoBlocks.BUBBLE_BRICK_STAIRS)
                .add(DecoBlocks.BUBBLE_BRICK_SLAB)
                .add(DecoBlocks.BUBBLE_BRICK_WALL)
                .add(DecoBlocks.CHISELED_BUBBLE_BRICKS)
                .add(DecoBlocks.SOUL_SOILSTONE)
                .add(DecoBlocks.SOUL_SOILSTONE_STAIRS)
                .add(DecoBlocks.SOUL_SOILSTONE_SLAB)
                .add(DecoBlocks.SOUL_SOILSTONE_WALL)
                .add(DecoBlocks.CUT_SOUL_SOILSTONE)
                .add(DecoBlocks.CUT_SOUL_SOILSTONE_STAIRS)
                .add(DecoBlocks.CUT_SOUL_SOILSTONE_SLAB)
                .add(DecoBlocks.CUT_SOUL_SOILSTONE_WALL)
                .add(DecoBlocks.CHISELED_SOUL_SOILSTONE);

        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE)
                .add(DecoBlocks.SNOW_STAIRS)
                .add(DecoBlocks.SNOW_SLAB)
                .add(DecoBlocks.SNOW_WALL)
                .add(DecoBlocks.SNOW_BRICKS)
                .add(DecoBlocks.CHISELED_SNOW_BRICKS)
                .add(DecoBlocks.SNOW_BRICK_STAIRS)
                .add(DecoBlocks.SNOW_BRICK_SLAB)
                .add(DecoBlocks.SNOW_BRICK_WALL);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(DecoBlocks.BLACK_ICE);

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
                .add(DecoBlocks.SNOW_WALL)
                .add(DecoBlocks.PACKED_ICE_WALL)
                .add(DecoBlocks.BLUE_ICE_WALL)
                .add(DecoBlocks.SNOW_BRICK_WALL)
                .add(DecoBlocks.ICE_BRICK_WALL)
                .add(DecoBlocks.CUT_SANDSTONE_WALL)
                .add(DecoBlocks.CUT_RED_SANDSTONE_WALL)
                .add(DecoBlocks.SMOOTH_SANDSTONE_WALL)
                .add(DecoBlocks.SMOOTH_RED_SANDSTONE_WALL)
                .add(DecoBlocks.CUT_SANDSTONE_BRICK_WALL)
                .add(DecoBlocks.CUT_RED_SANDSTONE_BRICK_WALL)
                .add(DecoBlocks.DARK_PRISMARINE_WALL)
                .add(DecoBlocks.PRISMARINE_BRICK_WALL)
                .add(DecoBlocks.CRYSTALLIZED_PRISMARINE_WALL)
                .add(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICK_WALL)
                .add(DecoBlocks.LIGHT_PRISMARINE_WALL)
                .add(DecoBlocks.BUBBLE_WALL)
                .add(DecoBlocks.BUBBLE_BRICK_WALL)
                .add(DecoBlocks.SOUL_SOILSTONE_WALL)
                .add(DecoBlocks.CUT_SOUL_SOILSTONE_WALL);

        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(DecoBlocks.RED_NETHER_BRICK_FENCE)
                .add(DecoBlocks.CACTUS_PLANK_FENCE);

        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(DecoBlocks.NETHER_BRICK_FENCE_GATE)
                .add(DecoBlocks.RED_NETHER_BRICK_FENCE_GATE)
                .add(DecoBlocks.CACTUS_PLANK_FENCE_GATE);

        getOrCreateTagBuilder(BlockTags.PLANKS)
                .add(DecoBlocks.CACTUS_PLANKS);

        getOrCreateTagBuilder(BlockTags.STAIRS)
                .add(DecoBlocks.POLISHED_STONE_STAIRS)
                .add(DecoBlocks.SMOOTH_STONE_STAIRS)
                .add(DecoBlocks.DRIPSTONE_STAIRS)
                .add(DecoBlocks.CALCITE_STAIRS)
                .add(DecoBlocks.TUFF_STAIRS)
                .add(DecoBlocks.STONE_TILE_STAIRS)
                .add(DecoBlocks.PACKED_MUD_STAIRS)
                .add(DecoBlocks.NETHERRACK_STAIRS)
                .add(DecoBlocks.MAGMA_STAIRS)
                .add(DecoBlocks.MAGMA_BRICK_STAIRS)
                .add(DecoBlocks.POLISHED_BLACKSTONE_TILE_STAIRS)
                .add(DecoBlocks.SNOW_STAIRS)
                .add(DecoBlocks.PACKED_ICE_STAIRS)
                .add(DecoBlocks.BLUE_ICE_STAIRS)
                .add(DecoBlocks.SNOW_BRICK_STAIRS)
                .add(DecoBlocks.ICE_BRICK_STAIRS)
                .add(DecoBlocks.CUT_SANDSTONE_STAIRS)
                .add(DecoBlocks.CUT_RED_SANDSTONE_STAIRS)
                .add(DecoBlocks.CUT_SANDSTONE_BRICK_STAIRS)
                .add(DecoBlocks.CUT_RED_SANDSTONE_BRICK_STAIRS);

        getOrCreateTagBuilder(BlockTags.SLABS)
                .add(DecoBlocks.POLISHED_STONE_SLAB)
                .add(DecoBlocks.DRIPSTONE_SLAB)
                .add(DecoBlocks.CALCITE_SLAB)
                .add(DecoBlocks.TUFF_SLAB)
                .add(DecoBlocks.STONE_TILE_SLAB)
                .add(DecoBlocks.PACKED_MUD_SLAB)
                .add(DecoBlocks.NETHERRACK_SLAB)
                .add(DecoBlocks.MAGMA_SLAB)
                .add(DecoBlocks.MAGMA_BRICK_SLAB)
                .add(DecoBlocks.POLISHED_BLACKSTONE_TILE_SLAB)
                .add(DecoBlocks.SNOW_SLAB)
                .add(DecoBlocks.PACKED_ICE_SLAB)
                .add(DecoBlocks.BLUE_ICE_SLAB)
                .add(DecoBlocks.SNOW_BRICK_SLAB)
                .add(DecoBlocks.ICE_BRICK_SLAB)
                .add(DecoBlocks.CUT_SANDSTONE_BRICK_SLAB)
                .add(DecoBlocks.CUT_RED_SANDSTONE_BRICK_SLAB);

        getOrCreateTagBuilder(BlockTags.WOODEN_STAIRS)
                .add(DecoBlocks.CACTUS_PLANK_STAIRS);

        getOrCreateTagBuilder(BlockTags.WOODEN_SLABS)
                .add(DecoBlocks.CACTUS_PLANK_SLAB);

        getOrCreateTagBuilder(BlockTags.WOODEN_FENCES)
                .add(DecoBlocks.CACTUS_PLANK_FENCE);

        getOrCreateTagBuilder(BlockTags.WOODEN_BUTTONS)
                .add(DecoBlocks.CACTUS_PLANK_BUTTON);

        getOrCreateTagBuilder(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(DecoBlocks.CACTUS_PLANK_PRESSURE_PLATE);

        getOrCreateTagBuilder(BlockTags.WOODEN_DOORS)
                .add(DecoBlocks.CACTUS_DOOR);

        getOrCreateTagBuilder(BlockTags.WOODEN_TRAPDOORS)
                .add(DecoBlocks.CACTUS_TRAPDOOR);

        getOrCreateTagBuilder(BlockTags.STANDING_SIGNS)
                .add(DecoBlocks.STANDING_CACTUS_SIGN);

        getOrCreateTagBuilder(BlockTags.WALL_SIGNS)
                .add(DecoBlocks.WALL_CACTUS_SIGN);

        getOrCreateTagBuilder(BlockTags.SOUL_FIRE_BASE_BLOCKS)
                .add(DecoBlocks.SOUL_SOILSTONE)
                .add(DecoBlocks.CUT_SOUL_SOILSTONE)
                .add(DecoBlocks.CHISELED_SOUL_SOILSTONE);

        getOrCreateTagBuilder(BlockTags.SOUL_SPEED_BLOCKS)
                .add(DecoBlocks.SOUL_SOILSTONE)
                .add(DecoBlocks.SOUL_SOILSTONE_STAIRS)
                .add(DecoBlocks.SOUL_SOILSTONE_SLAB)
                .add(DecoBlocks.SOUL_SOILSTONE_WALL)
                .add(DecoBlocks.CUT_SOUL_SOILSTONE)
                .add(DecoBlocks.CUT_SOUL_SOILSTONE_STAIRS)
                .add(DecoBlocks.CUT_SOUL_SOILSTONE_SLAB)
                .add(DecoBlocks.CUT_SOUL_SOILSTONE_WALL)
                .add(DecoBlocks.CHISELED_SOUL_SOILSTONE);
    }
}
