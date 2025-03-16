package net.gecko.varandeco.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.gecko.varandeco.block.DecoBlocks;
import net.gecko.varandeco.block.custom.WarpedWartBlock;
import net.gecko.varandeco.item.DecoItems;
import net.minecraft.block.NetherWartBlock;
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
        BlockStateModelGenerator.BlockTexturePool cactusplankpool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CACTUS_PLANKS);
        BlockStateModelGenerator.BlockTexturePool prismarinebrickpool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.PRISMARINE_BRICKS_TEMP);
        BlockStateModelGenerator.BlockTexturePool darkprismarinepool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.DARK_PRISMARINE_TEMP);
        BlockStateModelGenerator.BlockTexturePool cryprismarinepool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CRYSTALLIZED_PRISMARINE);
        BlockStateModelGenerator.BlockTexturePool cryprismarinebrickpool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool lightprismarinepool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.LIGHT_PRISMARINE);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.CHISELED_PRISMARINE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.CHISELED_CRYSTALLIZED_PRISMARINE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool bubblepool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.BUBBLE_BLOCK);
        BlockStateModelGenerator.BlockTexturePool bubblebrickpool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.BUBBLE_BRICKS);
        blockStateModelGenerator.registerSingleton(DecoBlocks.CHISELED_BUBBLE_BRICKS, TexturedModel.CUBE_BOTTOM_TOP);
        BlockStateModelGenerator.BlockTexturePool smoothsoulsoilpool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.SMOOTH_SOUL_SOILSTONE);
        BlockStateModelGenerator.BlockTexturePool quartzpool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.QUARTZ_TEMP);
        BlockStateModelGenerator.BlockTexturePool smoothquartzpool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.SMOOTH_QUARTZ_TEMP);
        BlockStateModelGenerator.BlockTexturePool quartzbrickpool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.QUARTZ_BRICKS_TEMP);
        BlockStateModelGenerator.BlockTexturePool cutquartzpool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CUT_QUARTZ);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.CRACKED_RED_NETHER_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.CHISELED_RED_NETHER_BRICKS);
        BlockStateModelGenerator.BlockTexturePool bluenetherpool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.BLUE_NETHER_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.CRACKED_BLUE_NETHER_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.CHISELED_BLUE_NETHER_BRICKS);

        blockStateModelGenerator.registerDoor(DecoBlocks.CACTUS_DOOR);
        blockStateModelGenerator.registerTrapdoor(DecoBlocks.CACTUS_TRAPDOOR);

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

       darkprismarinepool.wall(DecoBlocks.DARK_PRISMARINE_WALL);
       prismarinebrickpool.wall(DecoBlocks.PRISMARINE_BRICK_WALL);

       cryprismarinepool.stairs(DecoBlocks.CRYSTALLIZED_PRISMARINE_STAIRS);
       cryprismarinepool.slab(DecoBlocks.CRYSTALLIZED_PRISMARINE_SLAB);
       cryprismarinepool.wall(DecoBlocks.CRYSTALLIZED_PRISMARINE_WALL);

       cryprismarinebrickpool.stairs(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICK_STAIRS);
       cryprismarinebrickpool.slab(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICK_SLAB);
       cryprismarinebrickpool.wall(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICK_WALL);

       lightprismarinepool.stairs(DecoBlocks.LIGHT_PRISMARINE_STAIRS);
       lightprismarinepool.slab(DecoBlocks.LIGHT_PRISMARINE_SLAB);
       lightprismarinepool.wall(DecoBlocks.LIGHT_PRISMARINE_WALL);

       bubblepool.stairs(DecoBlocks.BUBBLE_STAIRS);
       bubblepool.slab(DecoBlocks.BUBBLE_SLAB);
       bubblepool.wall(DecoBlocks.BUBBLE_WALL);

       bubblebrickpool.stairs(DecoBlocks.BUBBLE_BRICK_STAIRS);
       bubblebrickpool.slab(DecoBlocks.BUBBLE_BRICK_SLAB);
       bubblebrickpool.wall(DecoBlocks.BUBBLE_BRICK_WALL);

       smoothsoulsoilpool.stairs(DecoBlocks.SMOOTH_SOUL_SOILSTONE_STAIRS);
       smoothsoulsoilpool.slab(DecoBlocks.SMOOTH_SOUL_SOILSTONE_SLAB);
       smoothsoulsoilpool.wall(DecoBlocks.SMOOTH_SOUL_SOILSTONE_WALL);

       quartzbrickpool.stairs(DecoBlocks.QUARTZ_BRICK_STAIRS);
       quartzbrickpool.slab(DecoBlocks.QUARTZ_BRICK_SLAB);
       quartzbrickpool.wall(DecoBlocks.QUARTZ_BRICK_WALL);

       cutquartzpool.stairs(DecoBlocks.CUT_QUARTZ_STAIRS);
       cutquartzpool.slab(DecoBlocks.CUT_QUARTZ_SLAB);
       cutquartzpool.wall(DecoBlocks.CUT_QUARTZ_WALL);

       quartzpool.wall(DecoBlocks.QUARTZ_WALL);
       smoothquartzpool.wall(DecoBlocks.SMOOTH_QUARTZ_WALL);

       cactusplankpool.stairs(DecoBlocks.CACTUS_PLANK_STAIRS);
       cactusplankpool.slab(DecoBlocks.CACTUS_PLANK_SLAB);
       cactusplankpool.fence(DecoBlocks.CACTUS_PLANK_FENCE);
       cactusplankpool.button(DecoBlocks.CACTUS_PLANK_BUTTON);
       cactusplankpool.pressurePlate(DecoBlocks.CACTUS_PLANK_PRESSURE_PLATE);
       cactusplankpool.fenceGate(DecoBlocks.CACTUS_PLANK_FENCE_GATE);

       bluenetherpool.stairs(DecoBlocks.BLUE_NETHER_BRICK_STAIRS);
       bluenetherpool.slab(DecoBlocks.BLUE_NETHER_BRICK_SLAB);
       bluenetherpool.fence(DecoBlocks.BLUE_NETHER_BRICK_FENCE);
       bluenetherpool.wall(DecoBlocks.BLUE_NETHER_BRICK_WALL);
       bluenetherpool.fenceGate(DecoBlocks.BLUE_NETHER_BRICK_FENCE_GATE);

       cactusplankpool.family(DecoBlocks.CACTUS_FAMILY);

       blockStateModelGenerator.registerCrop(DecoBlocks.WARPED_WART_PLANT, WarpedWartBlock.AGE,0,1,2,3);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(DecoItems.SNOW_BRICK, Models.GENERATED);
        itemModelGenerator.register(DecoItems.BUBBLE_ORB, Models.GENERATED);
    }
}
