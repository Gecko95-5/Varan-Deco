package net.gecko.varandeco.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.gecko.varandeco.block.DecoBlocks;
import net.gecko.varandeco.item.DecoItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.data.client.TexturedModel;

public class DecoModelProvider extends FabricModelProvider {
    public DecoModelProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
       BlockStateModelGenerator.BlockTexturePool andesitepool =
               blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.POLISHED_ANDESITE_TEMP);
        BlockStateModelGenerator.BlockTexturePool dioritepool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.POLISHED_DIORITE_TEMP);
        BlockStateModelGenerator.BlockTexturePool granitepool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.POLISHED_GRANITE_TEMP);
        BlockStateModelGenerator.BlockTexturePool stonepool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.STONE_TEMP);
        BlockStateModelGenerator.BlockTexturePool smstonepool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.SMOOTH_STONE_TEMP);
        BlockStateModelGenerator.BlockTexturePool calcitepool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CALCITE_TEMP);
        BlockStateModelGenerator.BlockTexturePool tuffpool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.TUFF_TEMP);
        BlockStateModelGenerator.BlockTexturePool dripstonepool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.DRIPSTONE_TEMP);
        BlockStateModelGenerator.BlockTexturePool packmudpool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.PACKED_MUD_TEMP);
        BlockStateModelGenerator.BlockTexturePool polistonepool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.POLISHED_STONE);
        BlockStateModelGenerator.BlockTexturePool stonetilepool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.STONE_TILES);
        BlockStateModelGenerator.BlockTexturePool netherbrickpool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.NETHER_BRICKS_TEMP);
        BlockStateModelGenerator.BlockTexturePool rednetherbrickpool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.RED_NETHER_BRICKS_TEMP);
        BlockStateModelGenerator.BlockTexturePool netherrackpool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.NETHERRACK_TEMP);
        BlockStateModelGenerator.BlockTexturePool magmapool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.MAGMA_TEMP);
        BlockStateModelGenerator.BlockTexturePool magmabrickpool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.MAGMA_BRICKS);
        blockStateModelGenerator.registerSingleton(DecoBlocks.CHISELED_MAGMA_BRICKS, TexturedModel.CUBE_BOTTOM_TOP);
        BlockStateModelGenerator.BlockTexturePool blackstonetilepool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.POLISHED_BLACKSTONE_TILES);
        BlockStateModelGenerator.BlockTexturePool snowpool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.SNOW_TEMP);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.POLISHED_GLIDED_BLACKSTONE);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.CHISELED_GLIDED_BLACKSTONE);
        BlockStateModelGenerator.BlockTexturePool packicepool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.PACKED_ICE_TEMP);
        BlockStateModelGenerator.BlockTexturePool blueicepool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.BLUE_ICE_TEMP);
        BlockStateModelGenerator.BlockTexturePool snowbrickpool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.SNOW_BRICKS);
        blockStateModelGenerator.registerSingleton(DecoBlocks.CHISELED_SNOW_BRICKS, TexturedModel.CUBE_COLUMN);
        BlockStateModelGenerator.BlockTexturePool icebrickpool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.ICE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.BLACK_ICE);
        BlockStateModelGenerator.BlockTexturePool smoothsandstonepool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.SANDSTONE_TOP_TEMP);
        BlockStateModelGenerator.BlockTexturePool smoothredsandstonepool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.RED_SANDSTONE_TOP_TEMP);

       andesitepool.wall(DecoBlocks.POLISHED_ANDESITE_WALL);
       dioritepool.wall(DecoBlocks.POLISHED_DIORITE_WALL);
       granitepool.wall(DecoBlocks.POLISHED_GRANITE_WALL);
       stonepool.wall(DecoBlocks.STONE_WALL);

       smstonepool.stairs(DecoBlocks.SMOOTH_STONE_STAIRS);
       smstonepool.wall(DecoBlocks.SMOOTH_STONE_WALL);

       calcitepool.stairs(DecoBlocks.CALCITE_STAIRS);
       calcitepool.slab(DecoBlocks.CALCITE_SLAB);
       calcitepool.wall(DecoBlocks.CALCITE_WALL);
       tuffpool.stairs(DecoBlocks.TUFF_STAIRS);
       tuffpool.slab(DecoBlocks.TUFF_SLAB);
       tuffpool.wall(DecoBlocks.TUFF_WALL);
       dripstonepool.stairs(DecoBlocks.DRIPSTONE_STAIRS);
       dripstonepool.slab(DecoBlocks.DRIPSTONE_SLAB);
       dripstonepool.wall(DecoBlocks.DRIPSTONE_WALL);

       polistonepool.stairs(DecoBlocks.POLISHED_STONE_STAIRS);
       polistonepool.slab(DecoBlocks.POLISHED_STONE_SLAB);
       polistonepool.wall(DecoBlocks.POLISHED_STONE_WALL);

       stonetilepool.stairs(DecoBlocks.STONE_TILE_STAIRS);
       stonetilepool.slab(DecoBlocks.STONE_TILE_SLAB);
       stonetilepool.wall(DecoBlocks.STONE_TILE_WALL);

       packmudpool.stairs(DecoBlocks.PACKED_MUD_STAIRS);
       packmudpool.slab(DecoBlocks.PACKED_MUD_SLAB);
       packmudpool.wall(DecoBlocks.PACKED_MUD_WALL);

       netherbrickpool.fenceGate(DecoBlocks.NETHER_BRICK_FENCE_GATE);
       rednetherbrickpool.fence(DecoBlocks.RED_NETHER_BRICK_FENCE);
       rednetherbrickpool.fenceGate(DecoBlocks.RED_NETHER_BRICK_FENCE_GATE);

       netherrackpool.stairs(DecoBlocks.NETHERRACK_STAIRS);
       netherrackpool.slab(DecoBlocks.NETHERRACK_SLAB);
       netherrackpool.wall(DecoBlocks.NETHERRACK_WALL);

       magmapool.stairs(DecoBlocks.MAGMA_STAIRS);
       magmapool.slab(DecoBlocks.MAGMA_SLAB);
       magmapool.wall(DecoBlocks.MAGMA_WALL);

       magmabrickpool.stairs(DecoBlocks.MAGMA_BRICK_STAIRS);
       magmabrickpool.slab(DecoBlocks.MAGMA_BRICK_SLAB);
       magmabrickpool.wall(DecoBlocks.MAGMA_BRICK_WALL);

       blackstonetilepool.stairs(DecoBlocks.POLISHED_BLACKSTONE_TILE_STAIRS);
       blackstonetilepool.slab(DecoBlocks.POLISHED_BLACKSTONE_TILE_SLAB);
       blackstonetilepool.wall(DecoBlocks.POLISHED_BLACKSTONE_TILE_WALL);

       snowpool.stairs(DecoBlocks.SNOW_STAIRS);
       snowpool.slab(DecoBlocks.SNOW_SLAB);
       snowpool.wall(DecoBlocks.SNOW_WALL);

       packicepool.stairs(DecoBlocks.PACKED_ICE_STAIRS);
       packicepool.slab(DecoBlocks.PACKED_ICE_SLAB);
       packicepool.wall(DecoBlocks.PACKED_ICE_WALL);

       blueicepool.stairs(DecoBlocks.BLUE_ICE_STAIRS);
       blueicepool.slab(DecoBlocks.BLUE_ICE_SLAB);
       blueicepool.wall(DecoBlocks.BLUE_ICE_WALL);

       snowbrickpool.stairs(DecoBlocks.SNOW_BRICK_STAIRS);
       snowbrickpool.slab(DecoBlocks.SNOW_BRICK_SLAB);
       snowbrickpool.wall(DecoBlocks.SNOW_BRICK_WALL);

       icebrickpool.stairs(DecoBlocks.ICE_BRICK_STAIRS);
       icebrickpool.slab(DecoBlocks.ICE_BRICK_SLAB);
       icebrickpool.wall(DecoBlocks.ICE_BRICK_WALL);

       smoothsandstonepool.wall(DecoBlocks.SMOOTH_SANDSTONE_WALL);
       smoothredsandstonepool.wall(DecoBlocks.SMOOTH_RED_SANDSTONE_WALL);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(DecoItems.SNOW_BRICK, Models.GENERATED);
    }
}
