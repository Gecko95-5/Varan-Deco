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

        blockStateModelGenerator.registerSimpleState(DecoBlocks.BIRCH_CRAFTING_TABLE);
        blockStateModelGenerator.registerSimpleState(DecoBlocks.SPRUCE_CRAFTING_TABLE);
        blockStateModelGenerator.registerSimpleState(DecoBlocks.ACACIA_CRAFTING_TABLE);
        blockStateModelGenerator.registerSimpleState(DecoBlocks.DARK_OAK_CRAFTING_TABLE);
        blockStateModelGenerator.registerSimpleState(DecoBlocks.JUNGLE_CRAFTING_TABLE);
        blockStateModelGenerator.registerSimpleState(DecoBlocks.MANGROVE_CRAFTING_TABLE);
        blockStateModelGenerator.registerSimpleState(DecoBlocks.CRIMSON_CRAFTING_TABLE);
        blockStateModelGenerator.registerSimpleState(DecoBlocks.WARPED_CRAFTING_TABLE);
        blockStateModelGenerator.registerSimpleState(DecoBlocks.CACTUS_CRAFTING_TABLE);

        blockStateModelGenerator.registerSimpleState(DecoBlocks.OAK_SMITHING_TABLE);
        blockStateModelGenerator.registerSimpleState(DecoBlocks.SPRUCE_SMITHING_TABLE);
        blockStateModelGenerator.registerSimpleState(DecoBlocks.BIRCH_SMITHING_TABLE);
        blockStateModelGenerator.registerSimpleState(DecoBlocks.JUNGLE_SMITHING_TABLE);
        blockStateModelGenerator.registerSimpleState(DecoBlocks.DARK_OAK_SMITHING_TABLE);
        blockStateModelGenerator.registerSimpleState(DecoBlocks.ACACIA_SMITHING_TABLE);
        blockStateModelGenerator.registerSimpleState(DecoBlocks.MANGROVE_SMITHING_TABLE);
        blockStateModelGenerator.registerSimpleState(DecoBlocks.CRIMSON_SMITHING_TABLE);
        blockStateModelGenerator.registerSimpleState(DecoBlocks.WARPED_SMITHING_TABLE);
        blockStateModelGenerator.registerSimpleState(DecoBlocks.CACTUS_SMITHING_TABLE);

        blockStateModelGenerator.registerSimpleState(DecoBlocks.OAK_CARTOGRAPHY_TABLE);
        blockStateModelGenerator.registerSimpleState(DecoBlocks.BIRCH_CARTOGRAPHY_TABLE);
        blockStateModelGenerator.registerSimpleState(DecoBlocks.SPRUCE_CARTOGRAPHY_TABLE);
        blockStateModelGenerator.registerSimpleState(DecoBlocks.JUNGLE_CARTOGRAPHY_TABLE);
        blockStateModelGenerator.registerSimpleState(DecoBlocks.ACACIA_CARTOGRAPHY_TABLE);
        blockStateModelGenerator.registerSimpleState(DecoBlocks.DARK_OAK_CARTOGRAPHY_TABLE);
        blockStateModelGenerator.registerSimpleState(DecoBlocks.MANGROVE_CARTOGRAPHY_TABLE);
        blockStateModelGenerator.registerSimpleState(DecoBlocks.CRIMSON_CARTOGRAPHY_TABLE);
        blockStateModelGenerator.registerSimpleState(DecoBlocks.WARPED_CARTOGRAPHY_TABLE);
        blockStateModelGenerator.registerSimpleState(DecoBlocks.CACTUS_CARTOGRAPHY_TABLE);

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

        BlockStateModelGenerator.BlockTexturePool terracottapool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.TERRACOTTA_TEMP);
        BlockStateModelGenerator.BlockTexturePool whiteterracottapool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.WHITE_TERRACOTTA_TEMP);
        BlockStateModelGenerator.BlockTexturePool lightgrayterracottapool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.LIGHT_GRAY_TERRACOTTA_TEMP);
        BlockStateModelGenerator.BlockTexturePool grayterracottapool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.GRAY_TERRACOTTA_TEMP);
        BlockStateModelGenerator.BlockTexturePool blackterracottapool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.BLACK_TERRACOTTA_TEMP);
        BlockStateModelGenerator.BlockTexturePool brownterracottapool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.BROWN_TERRACOTTA_TEMP);
        BlockStateModelGenerator.BlockTexturePool redterracottapool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.RED_TERRACOTTA_TEMP);
        BlockStateModelGenerator.BlockTexturePool orangeterracottapool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.ORANGE_TERRACOTTA_TEMP);
        BlockStateModelGenerator.BlockTexturePool yellowterracottapool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.YELLOW_TERRACOTTA_TEMP);
        BlockStateModelGenerator.BlockTexturePool limeterracottapool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.LIME_TERRACOTTA_TEMP);
        BlockStateModelGenerator.BlockTexturePool greenterracottapool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.GREEN_TERRACOTTA_TEMP);
        BlockStateModelGenerator.BlockTexturePool cyanterracottapool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CYAN_TERRACOTTA_TEMP);
        BlockStateModelGenerator.BlockTexturePool lightblueterracottapool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.LIGHT_BLUE_TERRACOTTA_TEMP);
        BlockStateModelGenerator.BlockTexturePool blueterracottapool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.BLUE_TERRACOTTA_TEMP);
        BlockStateModelGenerator.BlockTexturePool purpleterracottapool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.PURPLE_TERRACOTTA_TEMP);
        BlockStateModelGenerator.BlockTexturePool magnetaterracottapool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.MAGENTA_TERRACOTTA_TEMP);
        BlockStateModelGenerator.BlockTexturePool pinkterracottapool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.PINK_TERRACOTTA_TEMP);

        terracottapool.stairs(DecoBlocks.TERRACOTTA_STAIRS);
        terracottapool.slab(DecoBlocks.TERRACOTTA_SLAB);
        terracottapool.wall(DecoBlocks.TERRACOTTA_WALL);
        whiteterracottapool.stairs(DecoBlocks.WHITE_TERRACOTTA_STAIRS);
        whiteterracottapool.slab(DecoBlocks.WHITE_TERRACOTTA_SLAB);
        whiteterracottapool.wall(DecoBlocks.WHITE_TERRACOTTA_WALL);
        lightgrayterracottapool.stairs(DecoBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS);
        lightgrayterracottapool.slab(DecoBlocks.LIGHT_GRAY_TERRACOTTA_SLAB);
        lightgrayterracottapool.wall(DecoBlocks.LIGHT_GRAY_TERRACOTTA_WALL);
        grayterracottapool.stairs(DecoBlocks.GRAY_TERRACOTTA_STAIRS);
        grayterracottapool.slab(DecoBlocks.GRAY_TERRACOTTA_SLAB);
        grayterracottapool.wall(DecoBlocks.GRAY_TERRACOTTA_WALL);
        blackterracottapool.stairs(DecoBlocks.BLACK_TERRACOTTA_STAIRS);
        blackterracottapool.slab(DecoBlocks.BLACK_TERRACOTTA_SLAB);
        blackterracottapool.wall(DecoBlocks.BLACK_TERRACOTTA_WALL);
        brownterracottapool.stairs(DecoBlocks.BROWN_TERRACOTTA_STAIRS);
        brownterracottapool.slab(DecoBlocks.BROWN_TERRACOTTA_SLAB);
        brownterracottapool.wall(DecoBlocks.BROWN_TERRACOTTA_WALL);
        redterracottapool.stairs(DecoBlocks.RED_TERRACOTTA_STAIRS);
        redterracottapool.slab(DecoBlocks.RED_TERRACOTTA_SLAB);
        redterracottapool.wall(DecoBlocks.RED_TERRACOTTA_WALL);
        orangeterracottapool.stairs(DecoBlocks.ORANGE_TERRACOTTA_STAIRS);
        orangeterracottapool.slab(DecoBlocks.ORANGE_TERRACOTTA_SLAB);
        orangeterracottapool.wall(DecoBlocks.ORANGE_TERRACOTTA_WALL);
        yellowterracottapool.stairs(DecoBlocks.YELLOW_TERRACOTTA_STAIRS);
        yellowterracottapool.slab(DecoBlocks.YELLOW_TERRACOTTA_SLAB);
        yellowterracottapool.wall(DecoBlocks.YELLOW_TERRACOTTA_WALL);
        limeterracottapool.stairs(DecoBlocks.LIME_TERRACOTTA_STAIRS);
        limeterracottapool.slab(DecoBlocks.LIME_TERRACOTTA_SLAB);
        limeterracottapool.wall(DecoBlocks.LIME_TERRACOTTA_WALL);
        greenterracottapool.stairs(DecoBlocks.GREEN_TERRACOTTA_STAIRS);
        greenterracottapool.slab(DecoBlocks.GREEN_TERRACOTTA_SLAB);
        greenterracottapool.wall(DecoBlocks.GREEN_TERRACOTTA_WALL);
        cyanterracottapool.stairs(DecoBlocks.CYAN_TERRACOTTA_STAIRS);
        cyanterracottapool.slab(DecoBlocks.CYAN_TERRACOTTA_SLAB);
        cyanterracottapool.wall(DecoBlocks.CYAN_TERRACOTTA_WALL);
        lightblueterracottapool.stairs(DecoBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS);
        lightblueterracottapool.slab(DecoBlocks.LIGHT_BLUE_TERRACOTTA_SLAB);
        lightblueterracottapool.wall(DecoBlocks.LIGHT_BLUE_TERRACOTTA_WALL);
        blueterracottapool.stairs(DecoBlocks.BLUE_TERRACOTTA_STAIRS);
        blueterracottapool.slab(DecoBlocks.BLUE_TERRACOTTA_SLAB);
        blueterracottapool.wall(DecoBlocks.BLUE_TERRACOTTA_WALL);
        purpleterracottapool.stairs(DecoBlocks.PURPLE_TERRACOTTA_STAIRS);
        purpleterracottapool.slab(DecoBlocks.PURPLE_TERRACOTTA_SLAB);
        purpleterracottapool.wall(DecoBlocks.PURPLE_TERRACOTTA_WALL);
        magnetaterracottapool.stairs(DecoBlocks.MAGENTA_TERRACOTTA_STAIRS);
        magnetaterracottapool.slab(DecoBlocks.MAGENTA_TERRACOTTA_SLAB);
        magnetaterracottapool.wall(DecoBlocks.MAGENTA_TERRACOTTA_WALL);
        pinkterracottapool.stairs(DecoBlocks.PINK_TERRACOTTA_STAIRS);
        pinkterracottapool.slab(DecoBlocks.PINK_TERRACOTTA_SLAB);
        pinkterracottapool.wall(DecoBlocks.PINK_TERRACOTTA_WALL);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(DecoItems.SNOW_BRICK, Models.GENERATED);
        itemModelGenerator.register(DecoItems.BUBBLE_ORB, Models.GENERATED);
    }
}
