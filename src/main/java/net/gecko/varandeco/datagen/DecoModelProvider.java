package net.gecko.varandeco.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.gecko.varandeco.block.DecoBlocks;
import net.gecko.varandeco.block.custom.WarpedWartBlock;
import net.gecko.varandeco.item.DecoItems;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.data.client.TexturedModel;

public class DecoModelProvider extends FabricModelProvider {
    public DecoModelProvider(FabricDataOutput output) {
        super(output);
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
        BlockStateModelGenerator.BlockTexturePool smoothdeepslatepool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.SMOOTH_DEEPSLATE);
        BlockStateModelGenerator.BlockTexturePool smoothblackstonepool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.SMOOTH_BLACKSTONE);
        blockStateModelGenerator.registerSingleton(DecoBlocks.CHISELED_BRICKS, TexturedModel.CUBE_COLUMN);
        BlockStateModelGenerator.BlockTexturePool endstonepool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.END_STONE_TEMP);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.CHISELED_END_STONE);
        BlockStateModelGenerator.BlockTexturePool smoothpurpurpool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.SMOOTH_PURPUR);
        BlockStateModelGenerator.BlockTexturePool purpurbrickpool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.PURPUR_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.CHISELED_PURPUR);
        BlockStateModelGenerator.BlockTexturePool voidstonepool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.VOID_STONE);
        BlockStateModelGenerator.BlockTexturePool voidstonebrickpool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.VOID_STONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.CHISELED_VOID_STONE);
        BlockStateModelGenerator.BlockTexturePool obsidianpool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.OBSIDIAN_TEMP);
        BlockStateModelGenerator.BlockTexturePool obsidianbrickpool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.OBSIDIAN_BRICKS);
        blockStateModelGenerator.registerSingleton(DecoBlocks.CHISELED_OBSIDIAN, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerAxisRotated(DecoBlocks.OBSIDIAN_PILLAR, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.CHARCOAL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.FLINT_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.ECHO_BLOCK);
        BlockStateModelGenerator.BlockTexturePool cutironpool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CUT_IRON);
        BlockStateModelGenerator.BlockTexturePool polishedeepslatepool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.POLISHED_DEEPSLATE_TEMP);
        BlockStateModelGenerator.BlockTexturePool deepslatepool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.DEEPSLATE_TEMP);
        BlockStateModelGenerator.BlockTexturePool cobbledeepslatepool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.COBBLED_DEEPSLATE_TEMP);
        BlockStateModelGenerator.BlockTexturePool cobblestonepool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.COBBLESTONE_TEMP);
        BlockStateModelGenerator.BlockTexturePool blackstonepool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.BLACKSTONE_TEMP);
        blockStateModelGenerator.registerFlowerPotPlant(DecoBlocks.YELLOW_TULIP, DecoBlocks.POTTED_YELLOW_TULIP,
                BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(DecoBlocks.PURPLE_TULIP, DecoBlocks.POTTED_PURPLE_TULIP,
                BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(DecoBlocks.MAGENTA_TULIP, DecoBlocks.POTTED_MAGENTA_TULIP,
                BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(DecoBlocks.BLACK_TULIP, DecoBlocks.POTTED_BLACK_TULIP,
                BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(DecoBlocks.GREEN_TULIP, DecoBlocks.POTTED_GREEN_TULIP,
                BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(DecoBlocks.BLUE_TULIP, DecoBlocks.POTTED_BLUE_TULIP,
                BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(DecoBlocks.CYAN_TULIP, DecoBlocks.POTTED_CYAN_TULIP,
                BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerFlowerPotPlant(DecoBlocks.BARBERTON_DAISY, DecoBlocks.POTTED_BARBERTON_DAISY,
                BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(DecoBlocks.BLUE_EYED_DAISY, DecoBlocks.POTTED_BLUE_EYED_DAISY,
                BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(DecoBlocks.GERBERA_DAISY, DecoBlocks.POTTED_GERBERA_DAISY,
                BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(DecoBlocks.MICHAELMAS_DAISY, DecoBlocks.POTTED_MICHAELMAS_DAISY,
                BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerFlowerPotPlant(DecoBlocks.PUFFY_DANDELION, DecoBlocks.POTTED_PUFFY_DANDELION,
                BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerFlowerPotPlant(DecoBlocks.CALIFORNIA_POPPY, DecoBlocks.POTTED_CALIFORNIA_POPPY,
                BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(DecoBlocks.SALMON_POPPY, DecoBlocks.POTTED_SALMON_POPPY,
                BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerFlowerPotPlant(DecoBlocks.YELLOW_ORCHID, DecoBlocks.POTTED_YELLOW_ORCHID,
                BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(DecoBlocks.WHITE_ORCHID, DecoBlocks.POTTED_WHITE_ORCHID,
                BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(DecoBlocks.PINK_ORCHID, DecoBlocks.POTTED_PINK_ORCHID,
                BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerFlowerPotPlant(DecoBlocks.ROSE, DecoBlocks.POTTED_ROSE,
                BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(DecoBlocks.ENDER_ROSE, DecoBlocks.POTTED_ENDER_ROSE,
                BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerDoubleBlock(DecoBlocks.WITHER_ROSE_BUSH,
                BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(DecoBlocks.ENDER_ROSE_BUSH,
                BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerFlowerPotPlant(DecoBlocks.PAEONIA, DecoBlocks.POTTED_PAEONIA,
                BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(DecoBlocks.LAVENDER, DecoBlocks.POTTED_LAVENDER,
                BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerFlowerPotPlant(DecoBlocks.WOODEN_SAPLING, DecoBlocks.POTTED_WOODEN_SAPLING,
                BlockStateModelGenerator.TintType.NOT_TINTED);

        BlockStateModelGenerator.BlockTexturePool woodenpool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.WOODEN_PLANKS);

        blockStateModelGenerator.registerLog(DecoBlocks.WOODEN_LOG).log(DecoBlocks.WOODEN_LOG).wood(DecoBlocks.WOODEN_WOOD);
        blockStateModelGenerator.registerLog(DecoBlocks.STRIPPED_WOODEN_LOG).log(DecoBlocks.STRIPPED_WOODEN_LOG).wood(DecoBlocks.STRIPPED_WOODEN_WOOD);

        blockStateModelGenerator.registerWeightedPressurePlate(DecoBlocks.COPPER_WEIGHT_PRESSURE_PLATE, Blocks.COPPER_BLOCK);
        blockStateModelGenerator.registerWeightedPressurePlate(DecoBlocks.WAXED_COPPER_WEIGHT_PRESSURE_PLATE, Blocks.COPPER_BLOCK);
        blockStateModelGenerator.registerWeightedPressurePlate(DecoBlocks.EXPOSED_COPPER_WEIGHT_PRESSURE_PLATE, Blocks.EXPOSED_COPPER);
        blockStateModelGenerator.registerWeightedPressurePlate(DecoBlocks.WAXED_EXPOSED_COPPER_WEIGHT_PRESSURE_PLATE, Blocks.EXPOSED_COPPER);
        blockStateModelGenerator.registerWeightedPressurePlate(DecoBlocks.WEATHERED_COPPER_WEIGHT_PRESSURE_PLATE, Blocks.WEATHERED_COPPER);
        blockStateModelGenerator.registerWeightedPressurePlate(DecoBlocks.WAXED_WEATHERED_COPPER_WEIGHT_PRESSURE_PLATE, Blocks.WEATHERED_COPPER);
        blockStateModelGenerator.registerWeightedPressurePlate(DecoBlocks.OXIDIZED_COPPER_WEIGHT_PRESSURE_PLATE, Blocks.OXIDIZED_COPPER);
        blockStateModelGenerator.registerWeightedPressurePlate(DecoBlocks.WAXED_OXIDIZED_COPPER_WEIGHT_PRESSURE_PLATE, Blocks.OXIDIZED_COPPER);

        BlockStateModelGenerator.BlockTexturePool oakmosaicpool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.OAK_MOSAIC);
        BlockStateModelGenerator.BlockTexturePool birchmosaicpool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.BIRCH_MOSAIC);
        BlockStateModelGenerator.BlockTexturePool sprucemosaicpool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.SPRUCE_MOSAIC);
        BlockStateModelGenerator.BlockTexturePool junglemosaicpool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.JUNGLE_MOSAIC);
        BlockStateModelGenerator.BlockTexturePool acaciamosaicpool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.ACACIA_MOSAIC);
        BlockStateModelGenerator.BlockTexturePool darkoakmosaicpool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.DARK_OAK_MOSAIC);
        BlockStateModelGenerator.BlockTexturePool mangrovemosaicpool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.MANGROVE_MOSAIC);
        BlockStateModelGenerator.BlockTexturePool cherrymosaicpool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CHERRY_MOSAIC);
        BlockStateModelGenerator.BlockTexturePool crimsonmosaicpool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CRIMSON_MOSAIC);
        BlockStateModelGenerator.BlockTexturePool warpedmosaicpool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.WARPED_MOSAIC);
        BlockStateModelGenerator.BlockTexturePool cactusmosaicpool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CACTUS_MOSAIC);
        BlockStateModelGenerator.BlockTexturePool woodenmosaicpool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.WOODEN_MOSAIC);

        BlockStateModelGenerator.BlockTexturePool oakstrippedpool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.STRIPPED_OAK_TEMP);
        BlockStateModelGenerator.BlockTexturePool birchstrippedpool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.STRIPPED_BIRCH_TEMP);
        BlockStateModelGenerator.BlockTexturePool sprucestrippedpool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.STRIPPED_SPRUCE_TEMP);
        BlockStateModelGenerator.BlockTexturePool junglestrippedpool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.STRIPPED_JUNGLE_TEMP);
        BlockStateModelGenerator.BlockTexturePool acaciastrippedpool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.STRIPPED_ACACIA_TEMP);
        BlockStateModelGenerator.BlockTexturePool darkoakstrippedpool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.STRIPPED_DARK_OAK_TEMP);
        BlockStateModelGenerator.BlockTexturePool mangrovestrippedpool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.STRIPPED_MANGROVE_TEMP);
        BlockStateModelGenerator.BlockTexturePool cherrystrippedpool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.STRIPPED_CHERRY_TEMP);
        BlockStateModelGenerator.BlockTexturePool crimsonstrippedpool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.STRIPPED_CRIMSON_TEMP);
        BlockStateModelGenerator.BlockTexturePool warpedstrippedpool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.STRIPPED_WARPED_TEMP);
        BlockStateModelGenerator.BlockTexturePool woodenstrippedpool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.STRIPPED_WOODEN_TEMP);
        BlockStateModelGenerator.BlockTexturePool bamboomosaicpool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.BAMBOO_MOSAIC_TEMP);

        blockStateModelGenerator.registerHangingSign(DecoBlocks.STRIPPED_WOODEN_LOG, DecoBlocks.HANGING_WOODEN_SIGN,
                DecoBlocks.WALL_HANGING_WOODEN_SIGN);

        oakstrippedpool.family(DecoBlocks.STRIPPED_OAK_FAMILY);
        sprucestrippedpool.family(DecoBlocks.STRIPPED_SPRUCE_FAMILY);
        birchstrippedpool.family(DecoBlocks.STRIPPED_BIRCH_FAMILY);
        junglestrippedpool.family(DecoBlocks.STRIPPED_JUNGLE_FAMILY);
        acaciastrippedpool.family(DecoBlocks.STRIPPED_ACACIA_FAMILY);
        darkoakstrippedpool.family(DecoBlocks.STRIPPED_DARK_OAK_FAMILY);
        mangrovestrippedpool.family(DecoBlocks.STRIPPED_MANGROVE_FAMILY);
        cherrystrippedpool.family(DecoBlocks.STRIPPED_CHERRY_FAMILY);
        crimsonstrippedpool.family(DecoBlocks.STRIPPED_CRIMSON_FAMILY);
        warpedstrippedpool.family(DecoBlocks.STRIPPED_WARPED_FAMILY);
        woodenstrippedpool.family(DecoBlocks.STRIPPED_WOODEN_FAMILY);

        oakmosaicpool.family(DecoBlocks.OAK_MOSAIC_FAMILY);
        sprucemosaicpool.family(DecoBlocks.SPRUCE_MOSAIC_FAMILY);
        birchmosaicpool.family(DecoBlocks.BIRCH_MOSAIC_FAMILY);
        junglemosaicpool.family(DecoBlocks.JUNGLE_MOSAIC_FAMILY);
        acaciamosaicpool.family(DecoBlocks.ACACIA_MOSAIC_FAMILY);
        darkoakmosaicpool.family(DecoBlocks.DARK_OAK_MOSAIC_FAMILY);
        mangrovemosaicpool.family(DecoBlocks.MANGROVE_MOSAIC_FAMILY);
        cherrymosaicpool.family(DecoBlocks.CHERRY_MOSAIC_FAMILY);
        cactusmosaicpool.family(DecoBlocks.CACTUS_MOSAIC_FAMILY);
        crimsonmosaicpool.family(DecoBlocks.CRIMSON_MOSAIC_FAMILY);
        warpedmosaicpool.family(DecoBlocks.WARPED_MOSAIC_FAMILY);
        woodenmosaicpool.family(DecoBlocks.WOODEN_MOSAIC_FAMILY);
        bamboomosaicpool.family(DecoBlocks.BAMBOO_MOSAIC_FAMILY);

        blockStateModelGenerator.registerLantern(DecoBlocks.COPPER_LANTERN);
        blockStateModelGenerator.registerLantern(DecoBlocks.EXPOSED_COPPER_LANTERN);
        blockStateModelGenerator.registerLantern(DecoBlocks.WEATHERED_COPPER_LANTERN);
        blockStateModelGenerator.registerLantern(DecoBlocks.OXIDIZED_COPPER_LANTERN);

        blockStateModelGenerator.registerLantern(DecoBlocks.COPPER_SOUL_LANTERN);
        blockStateModelGenerator.registerLantern(DecoBlocks.EXPOSED_COPPER_SOUL_LANTERN);
        blockStateModelGenerator.registerLantern(DecoBlocks.WEATHERED_COPPER_SOUL_LANTERN);
        blockStateModelGenerator.registerLantern(DecoBlocks.OXIDIZED_COPPER_SOUL_LANTERN);

        blockStateModelGenerator.registerLantern(DecoBlocks.WAXED_COPPER_LANTERN);
        blockStateModelGenerator.registerLantern(DecoBlocks.WAXED_EXPOSED_COPPER_LANTERN);
        blockStateModelGenerator.registerLantern(DecoBlocks.WAXED_WEATHERED_COPPER_LANTERN);
        blockStateModelGenerator.registerLantern(DecoBlocks.WAXED_OXIDIZED_COPPER_LANTERN);

        blockStateModelGenerator.registerLantern(DecoBlocks.WAXED_COPPER_SOUL_LANTERN);
        blockStateModelGenerator.registerLantern(DecoBlocks.WAXED_EXPOSED_COPPER_SOUL_LANTERN);
        blockStateModelGenerator.registerLantern(DecoBlocks.WAXED_WEATHERED_COPPER_SOUL_LANTERN);
        blockStateModelGenerator.registerLantern(DecoBlocks.WAXED_OXIDIZED_COPPER_SOUL_LANTERN);

        blockStateModelGenerator.registerSimpleState(DecoBlocks.BIRCH_CRAFTING_TABLE);
        blockStateModelGenerator.registerSimpleState(DecoBlocks.SPRUCE_CRAFTING_TABLE);
        blockStateModelGenerator.registerSimpleState(DecoBlocks.ACACIA_CRAFTING_TABLE);
        blockStateModelGenerator.registerSimpleState(DecoBlocks.DARK_OAK_CRAFTING_TABLE);
        blockStateModelGenerator.registerSimpleState(DecoBlocks.JUNGLE_CRAFTING_TABLE);
        blockStateModelGenerator.registerSimpleState(DecoBlocks.MANGROVE_CRAFTING_TABLE);
        blockStateModelGenerator.registerSimpleState(DecoBlocks.CRIMSON_CRAFTING_TABLE);
        blockStateModelGenerator.registerSimpleState(DecoBlocks.WARPED_CRAFTING_TABLE);
        blockStateModelGenerator.registerSimpleState(DecoBlocks.CACTUS_CRAFTING_TABLE);
        blockStateModelGenerator.registerSimpleState(DecoBlocks.WOODEN_CRAFTING_TABLE);
        blockStateModelGenerator.registerSimpleState(DecoBlocks.CHERRY_CRAFTING_TABLE);
        blockStateModelGenerator.registerSimpleState(DecoBlocks.BAMBOO_CRAFTING_TABLE);

        blockStateModelGenerator.registerSimpleState(DecoBlocks.BIRCH_BOOKSHELF);
        blockStateModelGenerator.registerSimpleState(DecoBlocks.SPRUCE_BOOKSHELF);
        blockStateModelGenerator.registerSimpleState(DecoBlocks.ACACIA_BOOKSHELF);
        blockStateModelGenerator.registerSimpleState(DecoBlocks.DARK_OAK_BOOKSHELF);
        blockStateModelGenerator.registerSimpleState(DecoBlocks.JUNGLE_BOOKSHELF);
        blockStateModelGenerator.registerSimpleState(DecoBlocks.MANGROVE_BOOKSHELF);
        blockStateModelGenerator.registerSimpleState(DecoBlocks.CRIMSON_BOOKSHELF);
        blockStateModelGenerator.registerSimpleState(DecoBlocks.WARPED_BOOKSHELF);
        blockStateModelGenerator.registerSimpleState(DecoBlocks.CACTUS_BOOKSHELF);
        blockStateModelGenerator.registerSimpleState(DecoBlocks.WOODEN_BOOKSHELF);
        blockStateModelGenerator.registerSimpleState(DecoBlocks.CHERRY_BOOKSHELF);
        blockStateModelGenerator.registerSimpleState(DecoBlocks.BAMBOO_BOOKSHELF);

        blockStateModelGenerator.registerSimpleState(DecoBlocks.WOODEN_LEAVES);

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
        blockStateModelGenerator.registerSimpleState(DecoBlocks.BAMBOO_SMITHING_TABLE);
        blockStateModelGenerator.registerSimpleState(DecoBlocks.CHERRY_SMITHING_TABLE);

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
        blockStateModelGenerator.registerSimpleState(DecoBlocks.BAMBOO_CARTOGRAPHY_TABLE);
        blockStateModelGenerator.registerSimpleState(DecoBlocks.CHERRY_CARTOGRAPHY_TABLE);

        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.WHITE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.LIGHT_GRAY_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.GRAY_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.BLACK_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.BROWN_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.RED_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.ORANGE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.YELLOW_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.LIME_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.GREEN_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.CYAN_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.LIGHT_BLUE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.BLUE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.PURPLE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.MAGENTA_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.PINK_BLOCK);

        blockStateModelGenerator.registerDoor(DecoBlocks.CACTUS_DOOR);
        blockStateModelGenerator.registerTrapdoor(DecoBlocks.CACTUS_TRAPDOOR);

        blockStateModelGenerator.registerDoor(DecoBlocks.WOODEN_DOOR);
        blockStateModelGenerator.registerTrapdoor(DecoBlocks.WOODEN_TRAPDOOR);

        blockStateModelGenerator.registerDoor(DecoBlocks.GOLD_DOOR);
        blockStateModelGenerator.registerTrapdoor(DecoBlocks.GOLD_TRAPDOOR);

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

        woodenpool.stairs(DecoBlocks.WOODEN_STAIRS);
        woodenpool.slab(DecoBlocks.WOODEN_SLAB);
        woodenpool.fence(DecoBlocks.WOODEN_FENCE);
        woodenpool.button(DecoBlocks.WOODEN_BUTTON);
        woodenpool.pressurePlate(DecoBlocks.WOODEN_PRESSURE_PLATE);
        woodenpool.fenceGate(DecoBlocks.WOODEN_FENCE_GATE);

       bluenetherpool.stairs(DecoBlocks.BLUE_NETHER_BRICK_STAIRS);
       bluenetherpool.slab(DecoBlocks.BLUE_NETHER_BRICK_SLAB);
       bluenetherpool.fence(DecoBlocks.BLUE_NETHER_BRICK_FENCE);
       bluenetherpool.wall(DecoBlocks.BLUE_NETHER_BRICK_WALL);
       bluenetherpool.fenceGate(DecoBlocks.BLUE_NETHER_BRICK_FENCE_GATE);

       smoothdeepslatepool.stairs(DecoBlocks.SMOOTH_DEEPSLATE_STAIRS);
       smoothdeepslatepool.wall(DecoBlocks.SMOOTH_DEEPSLATE_WALL);
       smoothblackstonepool.stairs(DecoBlocks.SMOOTH_BLACKSTONE_STAIRS);
       smoothblackstonepool.wall(DecoBlocks.SMOOTH_BLACKSTONE_WALL);

        endstonepool.stairs(DecoBlocks.END_STONE_STAIRS);
        endstonepool.slab(DecoBlocks.END_STONE_SLAB);
        endstonepool.wall(DecoBlocks.END_STONE_WALL);

        smoothpurpurpool.stairs(DecoBlocks.SMOOTH_PURPUR_STAIRS);
        smoothpurpurpool.slab(DecoBlocks.SMOOTH_PURPUR_SLAB);
        smoothpurpurpool.wall(DecoBlocks.SMOOTH_PURPUR_WALL);

        purpurbrickpool.stairs(DecoBlocks.PURPUR_BRICK_STAIRS);
        purpurbrickpool.slab(DecoBlocks.PURPUR_BRICK_SLAB);
        purpurbrickpool.wall(DecoBlocks.PURPUR_BRICK_WALL);

        voidstonepool.stairs(DecoBlocks.VOID_STONE_STAIRS);
        voidstonepool.slab(DecoBlocks.VOID_STONE_SLAB);
        voidstonepool.wall(DecoBlocks.VOID_STONE_WALL);

        voidstonebrickpool.stairs(DecoBlocks.VOID_STONE_BRICK_STAIRS);
        voidstonebrickpool.slab(DecoBlocks.VOID_STONE_BRICK_SLAB);
        voidstonebrickpool.wall(DecoBlocks.VOID_STONE_BRICK_WALL);

        obsidianpool.stairs(DecoBlocks.OBSIDIAN_STAIRS);
        obsidianpool.slab(DecoBlocks.OBSIDIAN_SLAB);
        obsidianpool.wall(DecoBlocks.OBSIDIAN_WALL);

        obsidianbrickpool.stairs(DecoBlocks.OBSIDIAN_BRICK_STAIRS);
        obsidianbrickpool.slab(DecoBlocks.OBSIDIAN_BRICK_SLAB);
        obsidianbrickpool.wall(DecoBlocks.OBSIDIAN_BRICK_WALL);

        cutironpool.stairs(DecoBlocks.CUT_IRON_STAIRS);
        cutironpool.slab(DecoBlocks.CUT_IRON_SLAB);

        oakmosaicpool.stairs(DecoBlocks.OAK_MOSAIC_STAIRS);
        oakmosaicpool.slab(DecoBlocks.OAK_MOSAIC_SLAB);

        birchmosaicpool.stairs(DecoBlocks.BIRCH_MOSAIC_STAIRS);
        birchmosaicpool.slab(DecoBlocks.BIRCH_MOSAIC_SLAB);

        sprucemosaicpool.stairs(DecoBlocks.SPRUCE_MOSAIC_STAIRS);
        sprucemosaicpool.slab(DecoBlocks.SPRUCE_MOSAIC_SLAB);

        junglemosaicpool.stairs(DecoBlocks.JUNGLE_MOSAIC_STAIRS);
        junglemosaicpool.slab(DecoBlocks.JUNGLE_MOSAIC_SLAB);

        acaciamosaicpool.stairs(DecoBlocks.ACACIA_MOSAIC_STAIRS);
        acaciamosaicpool.slab(DecoBlocks.ACACIA_MOSAIC_SLAB);

        darkoakmosaicpool.stairs(DecoBlocks.DARK_OAK_MOSAIC_STAIRS);
        darkoakmosaicpool.slab(DecoBlocks.DARK_OAK_MOSAIC_SLAB);

        mangrovemosaicpool.stairs(DecoBlocks.MANGROVE_MOSAIC_STAIRS);
        mangrovemosaicpool.slab(DecoBlocks.MANGROVE_MOSAIC_SLAB);

        cherrymosaicpool.stairs(DecoBlocks.CHERRY_MOSAIC_STAIRS);
        cherrymosaicpool.slab(DecoBlocks.CHERRY_MOSAIC_SLAB);

        crimsonmosaicpool.stairs(DecoBlocks.CRIMSON_MOSAIC_STAIRS);
        crimsonmosaicpool.slab(DecoBlocks.CRIMSON_MOSAIC_SLAB);

        warpedmosaicpool.stairs(DecoBlocks.WARPED_MOSAIC_STAIRS);
        warpedmosaicpool.slab(DecoBlocks.WARPED_MOSAIC_SLAB);

        cactusmosaicpool.stairs(DecoBlocks.CACTUS_MOSAIC_STAIRS);
        cactusmosaicpool.slab(DecoBlocks.CACTUS_MOSAIC_SLAB);

        woodenmosaicpool.stairs(DecoBlocks.WOODEN_MOSAIC_STAIRS);
        woodenmosaicpool.slab(DecoBlocks.WOODEN_MOSAIC_SLAB);

        polishedeepslatepool.button(DecoBlocks.POLISHED_DEEPSLATE_BUTTON);
        polishedeepslatepool.pressurePlate(DecoBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE);

        deepslatepool.button(DecoBlocks.DEEPSLATE_BUTTON);
        deepslatepool.pressurePlate(DecoBlocks.DEEPSLATE_PRESSURE_PLATE);

        cobbledeepslatepool.button(DecoBlocks.COBBLED_DEEPSLATE_BUTTON);
        cobbledeepslatepool.pressurePlate(DecoBlocks.COBBLED_DEEPSLATE_PRESSURE_PLATE);

        cobblestonepool.button(DecoBlocks.COBBLESTONE_BUTTON);
        cobblestonepool.pressurePlate(DecoBlocks.COBBLESTONE_PRESSURE_PLATE);

        blackstonepool.button(DecoBlocks.BLACKSTONE_BUTTON);
        blackstonepool.pressurePlate(DecoBlocks.BLACKSTONE_PRESSURE_PLATE);

        polistonepool.button(DecoBlocks.POLISHED_STONE_BUTTON);
        polistonepool.pressurePlate(DecoBlocks.POLISHED_STONE_PRESSURE_PLATE);

       cactusplankpool.family(DecoBlocks.CACTUS_FAMILY);
       woodenpool.family(DecoBlocks.WOODEN_FAMILY);


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

        BlockStateModelGenerator.BlockTexturePool whiteconcretepool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.WHITE_CONCRETE_TEMP);
        BlockStateModelGenerator.BlockTexturePool lightgrayconcretepool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.LIGHT_GRAY_CONCRETE_TEMP);
        BlockStateModelGenerator.BlockTexturePool grayconcretepool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.GRAY_CONCRETE_TEMP);
        BlockStateModelGenerator.BlockTexturePool blackconcretepool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.BLACK_CONCRETE_TEMP);
        BlockStateModelGenerator.BlockTexturePool brownconcretepool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.BROWN_CONCRETE_TEMP);
        BlockStateModelGenerator.BlockTexturePool redconcretepool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.RED_CONCRETE_TEMP);
        BlockStateModelGenerator.BlockTexturePool orangeconcretepool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.ORANGE_CONCRETE_TEMP);
        BlockStateModelGenerator.BlockTexturePool yellowconcretepool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.YELLOW_CONCRETE_TEMP);
        BlockStateModelGenerator.BlockTexturePool limeconcretepool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.LIME_CONCRETE_TEMP);
        BlockStateModelGenerator.BlockTexturePool greenconcretepool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.GREEN_CONCRETE_TEMP);
        BlockStateModelGenerator.BlockTexturePool cyanconcretepool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CYAN_CONCRETE_TEMP);
        BlockStateModelGenerator.BlockTexturePool lightblueconcretepool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.LIGHT_BLUE_CONCRETE_TEMP);
        BlockStateModelGenerator.BlockTexturePool blueconcretepool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.BLUE_CONCRETE_TEMP);
        BlockStateModelGenerator.BlockTexturePool purpleconcretepool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.PURPLE_CONCRETE_TEMP);
        BlockStateModelGenerator.BlockTexturePool magnetaconcretepool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.MAGENTA_CONCRETE_TEMP);
        BlockStateModelGenerator.BlockTexturePool pinkconcretepool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.PINK_CONCRETE_TEMP);

        BlockStateModelGenerator.BlockTexturePool terracottabrickpool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.TERRACOTTA_BRICKS);
        BlockStateModelGenerator.BlockTexturePool whiteterracottabrickpool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.WHITE_TERRACOTTA_BRICKS);
        BlockStateModelGenerator.BlockTexturePool lightgrayterracottabrickpool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS);
        BlockStateModelGenerator.BlockTexturePool grayterracottabrickpool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.GRAY_TERRACOTTA_BRICKS);
        BlockStateModelGenerator.BlockTexturePool blackterracottabrickpool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.BLACK_TERRACOTTA_BRICKS);
        BlockStateModelGenerator.BlockTexturePool brownterracottabrickpool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.BROWN_TERRACOTTA_BRICKS);
        BlockStateModelGenerator.BlockTexturePool redterracottabrickpool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.RED_TERRACOTTA_BRICKS);
        BlockStateModelGenerator.BlockTexturePool orangeterracottabrickpool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.ORANGE_TERRACOTTA_BRICKS);
        BlockStateModelGenerator.BlockTexturePool yellowterracottabrickpool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.YELLOW_TERRACOTTA_BRICKS);
        BlockStateModelGenerator.BlockTexturePool limeterracottabrickpool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.LIME_TERRACOTTA_BRICKS);
        BlockStateModelGenerator.BlockTexturePool greenterracottabrickpool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.GREEN_TERRACOTTA_BRICKS);
        BlockStateModelGenerator.BlockTexturePool cyanterracottabrickpool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CYAN_TERRACOTTA_BRICKS);
        BlockStateModelGenerator.BlockTexturePool lightblueterracottabrickpool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS);
        BlockStateModelGenerator.BlockTexturePool blueterracottabrickpool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.BLUE_TERRACOTTA_BRICKS);
        BlockStateModelGenerator.BlockTexturePool purpleterracottabrickpool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.PURPLE_TERRACOTTA_BRICKS);
        BlockStateModelGenerator.BlockTexturePool magnetaterracottabrickpool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.MAGENTA_TERRACOTTA_BRICKS);
        BlockStateModelGenerator.BlockTexturePool pinkterracottabrickpool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.PINK_TERRACOTTA_BRICKS);

        BlockStateModelGenerator.BlockTexturePool cutwhiteconcretepool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CUT_WHITE_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool cutlightgrayconcretepool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CUT_LIGHT_GRAY_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool cutgrayconcretepool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CUT_GRAY_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool cutblackconcretepool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CUT_BLACK_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool cutbrownconcretepool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CUT_BROWN_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool cutredconcretepool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CUT_RED_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool cutorangeconcretepool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CUT_ORANGE_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool cutyellowconcretepool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CUT_YELLOW_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool cutlimeconcretepool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CUT_LIME_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool cutgreenconcretepool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CUT_GREEN_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool cutcyanconcretepool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CUT_CYAN_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool cutlightblueconcretepool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CUT_LIGHT_BLUE_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool cutblueconcretepool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CUT_BLUE_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool cutpurpleconcretepool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CUT_PURPLE_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool cutmagnetaconcretepool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CUT_MAGENTA_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool cutpinkconcretepool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CUT_PINK_CONCRETE);

        blockStateModelGenerator.registerAxisRotated(DecoBlocks.WHITE_CONCRETE_PILLAR, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerAxisRotated(DecoBlocks.LIGHT_GRAY_CONCRETE_PILLAR, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerAxisRotated(DecoBlocks.GRAY_CONCRETE_PILLAR, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerAxisRotated(DecoBlocks.BLACK_CONCRETE_PILLAR, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerAxisRotated(DecoBlocks.BROWN_CONCRETE_PILLAR, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerAxisRotated(DecoBlocks.RED_CONCRETE_PILLAR, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerAxisRotated(DecoBlocks.ORANGE_CONCRETE_PILLAR, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerAxisRotated(DecoBlocks.YELLOW_CONCRETE_PILLAR, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerAxisRotated(DecoBlocks.LIME_CONCRETE_PILLAR, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerAxisRotated(DecoBlocks.GREEN_CONCRETE_PILLAR, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerAxisRotated(DecoBlocks.CYAN_CONCRETE_PILLAR, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerAxisRotated(DecoBlocks.LIGHT_BLUE_CONCRETE_PILLAR, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerAxisRotated(DecoBlocks.BLUE_CONCRETE_PILLAR, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerAxisRotated(DecoBlocks.PURPLE_CONCRETE_PILLAR, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerAxisRotated(DecoBlocks.MAGENTA_CONCRETE_PILLAR, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerAxisRotated(DecoBlocks.PINK_CONCRETE_PILLAR, TexturedModel.CUBE_COLUMN);

        blockStateModelGenerator.registerGlassPane(DecoBlocks.HARDENED_GLASS, DecoBlocks.HARDENED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(DecoBlocks.HARDENED_TINTED_GLASS, DecoBlocks.HARDENED_TINTED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(DecoBlocks.HARDENED_WHITE_STAINED_GLASS, DecoBlocks.HARDENED_WHITE_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(DecoBlocks.HARDENED_ORANGE_STAINED_GLASS, DecoBlocks.HARDENED_ORANGE_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(DecoBlocks.HARDENED_MAGENTA_STAINED_GLASS, DecoBlocks.HARDENED_MAGENTA_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(DecoBlocks.HARDENED_LIGHT_BLUE_STAINED_GLASS, DecoBlocks.HARDENED_LIGHT_BLUE_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(DecoBlocks.HARDENED_BLUE_STAINED_GLASS, DecoBlocks.HARDENED_BLUE_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(DecoBlocks.HARDENED_YELLOW_STAINED_GLASS, DecoBlocks.HARDENED_YELLOW_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(DecoBlocks.HARDENED_LIME_STAINED_GLASS, DecoBlocks.HARDENED_LIME_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(DecoBlocks.HARDENED_PINK_STAINED_GLASS, DecoBlocks.HARDENED_PINK_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(DecoBlocks.HARDENED_GRAY_STAINED_GLASS, DecoBlocks.HARDENED_GRAY_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(DecoBlocks.HARDENED_LIGHT_GRAY_STAINED_GLASS, DecoBlocks.HARDENED_LIGHT_GRAY_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(DecoBlocks.HARDENED_CYAN_STAINED_GLASS, DecoBlocks.HARDENED_CYAN_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(DecoBlocks.HARDENED_PURPLE_STAINED_GLASS, DecoBlocks.HARDENED_PURPLE_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(DecoBlocks.HARDENED_BROWN_STAINED_GLASS, DecoBlocks.HARDENED_BROWN_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(DecoBlocks.HARDENED_GREEN_STAINED_GLASS, DecoBlocks.HARDENED_GREEN_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(DecoBlocks.HARDENED_RED_STAINED_GLASS, DecoBlocks.HARDENED_RED_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(DecoBlocks.HARDENED_BLACK_STAINED_GLASS, DecoBlocks.HARDENED_BLACK_STAINED_GLASS_PANE);

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

        whiteconcretepool.stairs(DecoBlocks.WHITE_CONCRETE_STAIRS);
        whiteconcretepool.slab(DecoBlocks.WHITE_CONCRETE_SLAB);
        whiteconcretepool.wall(DecoBlocks.WHITE_CONCRETE_WALL);
        lightgrayconcretepool.stairs(DecoBlocks.LIGHT_GRAY_CONCRETE_STAIRS);
        lightgrayconcretepool.slab(DecoBlocks.LIGHT_GRAY_CONCRETE_SLAB);
        lightgrayconcretepool.wall(DecoBlocks.LIGHT_GRAY_CONCRETE_WALL);
        grayconcretepool.stairs(DecoBlocks.GRAY_CONCRETE_STAIRS);
        grayconcretepool.slab(DecoBlocks.GRAY_CONCRETE_SLAB);
        grayconcretepool.wall(DecoBlocks.GRAY_CONCRETE_WALL);
        blackconcretepool.stairs(DecoBlocks.BLACK_CONCRETE_STAIRS);
        blackconcretepool.slab(DecoBlocks.BLACK_CONCRETE_SLAB);
        blackconcretepool.wall(DecoBlocks.BLACK_CONCRETE_WALL);
        brownconcretepool.stairs(DecoBlocks.BROWN_CONCRETE_STAIRS);
        brownconcretepool.slab(DecoBlocks.BROWN_CONCRETE_SLAB);
        brownconcretepool.wall(DecoBlocks.BROWN_CONCRETE_WALL);
        redconcretepool.stairs(DecoBlocks.RED_CONCRETE_STAIRS);
        redconcretepool.slab(DecoBlocks.RED_CONCRETE_SLAB);
        redconcretepool.wall(DecoBlocks.RED_CONCRETE_WALL);
        orangeconcretepool.stairs(DecoBlocks.ORANGE_CONCRETE_STAIRS);
        orangeconcretepool.slab(DecoBlocks.ORANGE_CONCRETE_SLAB);
        orangeconcretepool.wall(DecoBlocks.ORANGE_CONCRETE_WALL);
        yellowconcretepool.stairs(DecoBlocks.YELLOW_CONCRETE_STAIRS);
        yellowconcretepool.slab(DecoBlocks.YELLOW_CONCRETE_SLAB);
        yellowconcretepool.wall(DecoBlocks.YELLOW_CONCRETE_WALL);
        limeconcretepool.stairs(DecoBlocks.LIME_CONCRETE_STAIRS);
        limeconcretepool.slab(DecoBlocks.LIME_CONCRETE_SLAB);
        limeconcretepool.wall(DecoBlocks.LIME_CONCRETE_WALL);
        greenconcretepool.stairs(DecoBlocks.GREEN_CONCRETE_STAIRS);
        greenconcretepool.slab(DecoBlocks.GREEN_CONCRETE_SLAB);
        greenconcretepool.wall(DecoBlocks.GREEN_CONCRETE_WALL);
        cyanconcretepool.stairs(DecoBlocks.CYAN_CONCRETE_STAIRS);
        cyanconcretepool.slab(DecoBlocks.CYAN_CONCRETE_SLAB);
        cyanconcretepool.wall(DecoBlocks.CYAN_CONCRETE_WALL);
        lightblueconcretepool.stairs(DecoBlocks.LIGHT_BLUE_CONCRETE_STAIRS);
        lightblueconcretepool.slab(DecoBlocks.LIGHT_BLUE_CONCRETE_SLAB);
        lightblueconcretepool.wall(DecoBlocks.LIGHT_BLUE_CONCRETE_WALL);
        blueconcretepool.stairs(DecoBlocks.BLUE_CONCRETE_STAIRS);
        blueconcretepool.slab(DecoBlocks.BLUE_CONCRETE_SLAB);
        blueconcretepool.wall(DecoBlocks.BLUE_CONCRETE_WALL);
        purpleconcretepool.stairs(DecoBlocks.PURPLE_CONCRETE_STAIRS);
        purpleconcretepool.slab(DecoBlocks.PURPLE_CONCRETE_SLAB);
        purpleconcretepool.wall(DecoBlocks.PURPLE_CONCRETE_WALL);
        magnetaconcretepool.stairs(DecoBlocks.MAGENTA_CONCRETE_STAIRS);
        magnetaconcretepool.slab(DecoBlocks.MAGENTA_CONCRETE_SLAB);
        magnetaconcretepool.wall(DecoBlocks.MAGENTA_CONCRETE_WALL);
        pinkconcretepool.stairs(DecoBlocks.PINK_CONCRETE_STAIRS);
        pinkconcretepool.slab(DecoBlocks.PINK_CONCRETE_SLAB);
        pinkconcretepool.wall(DecoBlocks.PINK_CONCRETE_WALL);

        terracottabrickpool.stairs(DecoBlocks.TERRACOTTA_BRICK_STAIRS);
        terracottabrickpool.slab(DecoBlocks.TERRACOTTA_BRICK_SLAB);
        terracottabrickpool.wall(DecoBlocks.TERRACOTTA_BRICK_WALL);
        whiteterracottabrickpool.stairs(DecoBlocks.WHITE_TERRACOTTA_BRICK_STAIRS);
        whiteterracottabrickpool.slab(DecoBlocks.WHITE_TERRACOTTA_BRICK_SLAB);
        whiteterracottabrickpool.wall(DecoBlocks.WHITE_TERRACOTTA_BRICK_WALL);
        lightgrayterracottabrickpool.stairs(DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS);
        lightgrayterracottabrickpool.slab(DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_SLAB);
        lightgrayterracottabrickpool.wall(DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_WALL);
        grayterracottabrickpool.stairs(DecoBlocks.GRAY_TERRACOTTA_BRICK_STAIRS);
        grayterracottabrickpool.slab(DecoBlocks.GRAY_TERRACOTTA_BRICK_SLAB);
        grayterracottabrickpool.wall(DecoBlocks.GRAY_TERRACOTTA_BRICK_WALL);
        blackterracottabrickpool.stairs(DecoBlocks.BLACK_TERRACOTTA_BRICK_STAIRS);
        blackterracottabrickpool.slab(DecoBlocks.BLACK_TERRACOTTA_BRICK_SLAB);
        blackterracottabrickpool.wall(DecoBlocks.BLACK_TERRACOTTA_BRICK_WALL);
        brownterracottabrickpool.stairs(DecoBlocks.BROWN_TERRACOTTA_BRICK_STAIRS);
        brownterracottabrickpool.slab(DecoBlocks.BROWN_TERRACOTTA_BRICK_SLAB);
        brownterracottabrickpool.wall(DecoBlocks.BROWN_TERRACOTTA_BRICK_WALL);
        redterracottabrickpool.stairs(DecoBlocks.RED_TERRACOTTA_BRICK_STAIRS);
        redterracottabrickpool.slab(DecoBlocks.RED_TERRACOTTA_BRICK_SLAB);
        redterracottabrickpool.wall(DecoBlocks.RED_TERRACOTTA_BRICK_WALL);
        orangeterracottabrickpool.stairs(DecoBlocks.ORANGE_TERRACOTTA_BRICK_STAIRS);
        orangeterracottabrickpool.slab(DecoBlocks.ORANGE_TERRACOTTA_BRICK_SLAB);
        orangeterracottabrickpool.wall(DecoBlocks.ORANGE_TERRACOTTA_BRICK_WALL);
        yellowterracottabrickpool.stairs(DecoBlocks.YELLOW_TERRACOTTA_BRICK_STAIRS);
        yellowterracottabrickpool.slab(DecoBlocks.YELLOW_TERRACOTTA_BRICK_SLAB);
        yellowterracottabrickpool.wall(DecoBlocks.YELLOW_TERRACOTTA_BRICK_WALL);
        limeterracottabrickpool.stairs(DecoBlocks.LIME_TERRACOTTA_BRICK_STAIRS);
        limeterracottabrickpool.slab(DecoBlocks.LIME_TERRACOTTA_BRICK_SLAB);
        limeterracottabrickpool.wall(DecoBlocks.LIME_TERRACOTTA_BRICK_WALL);
        greenterracottabrickpool.stairs(DecoBlocks.GREEN_TERRACOTTA_BRICK_STAIRS);
        greenterracottabrickpool.slab(DecoBlocks.GREEN_TERRACOTTA_BRICK_SLAB);
        greenterracottabrickpool.wall(DecoBlocks.GREEN_TERRACOTTA_BRICK_WALL);
        cyanterracottabrickpool.stairs(DecoBlocks.CYAN_TERRACOTTA_BRICK_STAIRS);
        cyanterracottabrickpool.slab(DecoBlocks.CYAN_TERRACOTTA_BRICK_SLAB);
        cyanterracottabrickpool.wall(DecoBlocks.CYAN_TERRACOTTA_BRICK_WALL);
        lightblueterracottabrickpool.stairs(DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS);
        lightblueterracottabrickpool.slab(DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_SLAB);
        lightblueterracottabrickpool.wall(DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_WALL);
        blueterracottabrickpool.stairs(DecoBlocks.BLUE_TERRACOTTA_BRICK_STAIRS);
        blueterracottabrickpool.slab(DecoBlocks.BLUE_TERRACOTTA_BRICK_SLAB);
        blueterracottabrickpool.wall(DecoBlocks.BLUE_TERRACOTTA_BRICK_WALL);
        purpleterracottabrickpool.stairs(DecoBlocks.PURPLE_TERRACOTTA_BRICK_STAIRS);
        purpleterracottabrickpool.slab(DecoBlocks.PURPLE_TERRACOTTA_BRICK_SLAB);
        purpleterracottabrickpool.wall(DecoBlocks.PURPLE_TERRACOTTA_BRICK_WALL);
        magnetaterracottabrickpool.stairs(DecoBlocks.MAGENTA_TERRACOTTA_BRICK_STAIRS);
        magnetaterracottabrickpool.slab(DecoBlocks.MAGENTA_TERRACOTTA_BRICK_SLAB);
        magnetaterracottabrickpool.wall(DecoBlocks.MAGENTA_TERRACOTTA_BRICK_WALL);
        pinkterracottabrickpool.stairs(DecoBlocks.PINK_TERRACOTTA_BRICK_STAIRS);
        pinkterracottabrickpool.slab(DecoBlocks.PINK_TERRACOTTA_BRICK_SLAB);
        pinkterracottabrickpool.wall(DecoBlocks.PINK_TERRACOTTA_BRICK_WALL);

        cutwhiteconcretepool.stairs(DecoBlocks.CUT_WHITE_CONCRETE_STAIRS);
        cutwhiteconcretepool.slab(DecoBlocks.CUT_WHITE_CONCRETE_SLAB);
        cutwhiteconcretepool.wall(DecoBlocks.CUT_WHITE_CONCRETE_WALL);
        cutlightgrayconcretepool.stairs(DecoBlocks.CUT_LIGHT_GRAY_CONCRETE_STAIRS);
        cutlightgrayconcretepool.slab(DecoBlocks.CUT_LIGHT_GRAY_CONCRETE_SLAB);
        cutlightgrayconcretepool.wall(DecoBlocks.CUT_LIGHT_GRAY_CONCRETE_WALL);
        cutgrayconcretepool.stairs(DecoBlocks.CUT_GRAY_CONCRETE_STAIRS);
        cutgrayconcretepool.slab(DecoBlocks.CUT_GRAY_CONCRETE_SLAB);
        cutgrayconcretepool.wall(DecoBlocks.CUT_GRAY_CONCRETE_WALL);
        cutblackconcretepool.stairs(DecoBlocks.CUT_BLACK_CONCRETE_STAIRS);
        cutblackconcretepool.slab(DecoBlocks.CUT_BLACK_CONCRETE_SLAB);
        cutblackconcretepool.wall(DecoBlocks.CUT_BLACK_CONCRETE_WALL);
        cutbrownconcretepool.stairs(DecoBlocks.CUT_BROWN_CONCRETE_STAIRS);
        cutbrownconcretepool.slab(DecoBlocks.CUT_BROWN_CONCRETE_SLAB);
        cutbrownconcretepool.wall(DecoBlocks.CUT_BROWN_CONCRETE_WALL);
        cutredconcretepool.stairs(DecoBlocks.CUT_RED_CONCRETE_STAIRS);
        cutredconcretepool.slab(DecoBlocks.CUT_RED_CONCRETE_SLAB);
        cutredconcretepool.wall(DecoBlocks.CUT_RED_CONCRETE_WALL);
        cutorangeconcretepool.stairs(DecoBlocks.CUT_ORANGE_CONCRETE_STAIRS);
        cutorangeconcretepool.slab(DecoBlocks.CUT_ORANGE_CONCRETE_SLAB);
        cutorangeconcretepool.wall(DecoBlocks.CUT_ORANGE_CONCRETE_WALL);
        cutyellowconcretepool.stairs(DecoBlocks.CUT_YELLOW_CONCRETE_STAIRS);
        cutyellowconcretepool.slab(DecoBlocks.CUT_YELLOW_CONCRETE_SLAB);
        cutyellowconcretepool.wall(DecoBlocks.CUT_YELLOW_CONCRETE_WALL);
        cutlimeconcretepool.stairs(DecoBlocks.CUT_LIME_CONCRETE_STAIRS);
        cutlimeconcretepool.slab(DecoBlocks.CUT_LIME_CONCRETE_SLAB);
        cutlimeconcretepool.wall(DecoBlocks.CUT_LIME_CONCRETE_WALL);
        cutgreenconcretepool.stairs(DecoBlocks.CUT_GREEN_CONCRETE_STAIRS);
        cutgreenconcretepool.slab(DecoBlocks.CUT_GREEN_CONCRETE_SLAB);
        cutgreenconcretepool.wall(DecoBlocks.CUT_GREEN_CONCRETE_WALL);
        cutcyanconcretepool.stairs(DecoBlocks.CUT_CYAN_CONCRETE_STAIRS);
        cutcyanconcretepool.slab(DecoBlocks.CUT_CYAN_CONCRETE_SLAB);
        cutcyanconcretepool.wall(DecoBlocks.CUT_CYAN_CONCRETE_WALL);
        cutlightblueconcretepool.stairs(DecoBlocks.CUT_LIGHT_BLUE_CONCRETE_STAIRS);
        cutlightblueconcretepool.slab(DecoBlocks.CUT_LIGHT_BLUE_CONCRETE_SLAB);
        cutlightblueconcretepool.wall(DecoBlocks.CUT_LIGHT_BLUE_CONCRETE_WALL);
        cutblueconcretepool.stairs(DecoBlocks.CUT_BLUE_CONCRETE_STAIRS);
        cutblueconcretepool.slab(DecoBlocks.CUT_BLUE_CONCRETE_SLAB);
        cutblueconcretepool.wall(DecoBlocks.CUT_BLUE_CONCRETE_WALL);
        cutpurpleconcretepool.stairs(DecoBlocks.CUT_PURPLE_CONCRETE_STAIRS);
        cutpurpleconcretepool.slab(DecoBlocks.CUT_PURPLE_CONCRETE_SLAB);
        cutpurpleconcretepool.wall(DecoBlocks.CUT_PURPLE_CONCRETE_WALL);
        cutmagnetaconcretepool.stairs(DecoBlocks.CUT_MAGENTA_CONCRETE_STAIRS);
        cutmagnetaconcretepool.slab(DecoBlocks.CUT_MAGENTA_CONCRETE_SLAB);
        cutmagnetaconcretepool.wall(DecoBlocks.CUT_MAGENTA_CONCRETE_WALL);
        cutpinkconcretepool.stairs(DecoBlocks.CUT_PINK_CONCRETE_STAIRS);
        cutpinkconcretepool.slab(DecoBlocks.CUT_PINK_CONCRETE_SLAB);
        cutpinkconcretepool.wall(DecoBlocks.CUT_PINK_CONCRETE_WALL);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(DecoItems.SNOW_BRICK, Models.GENERATED);
        itemModelGenerator.register(DecoItems.BUBBLE_ORB, Models.GENERATED);
        itemModelGenerator.register(DecoItems.COPPER_NUGGET, Models.GENERATED);

        itemModelGenerator.register(DecoItems.CACTUS_BOAT, Models.GENERATED);
        itemModelGenerator.register(DecoItems.CACTUS_CHEST_BOAT, Models.GENERATED);
        itemModelGenerator.register(DecoItems.WOODEN_BOAT, Models.GENERATED);
        itemModelGenerator.register(DecoItems.WOODEN_CHEST_BOAT, Models.GENERATED);
        itemModelGenerator.register(DecoItems.CRIMSON_BOAT, Models.GENERATED);
        itemModelGenerator.register(DecoItems.CRIMSON_CHEST_BOAT, Models.GENERATED);
        itemModelGenerator.register(DecoItems.WARPED_BOAT, Models.GENERATED);
        itemModelGenerator.register(DecoItems.WARPED_CHEST_BOAT, Models.GENERATED);
    }
}
