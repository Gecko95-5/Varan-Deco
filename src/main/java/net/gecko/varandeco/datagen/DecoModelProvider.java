package net.gecko.varandeco.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.gecko.varandeco.VaranDeco;
import net.gecko.varandeco.block.DecoBlocks;
import net.gecko.varandeco.block.nature.WarpedWartBlock;
import net.gecko.varandeco.item.DecoItems;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.*;
import net.minecraft.util.Identifier;

import java.lang.reflect.Field;
import java.util.Optional;
import java.util.function.Consumer;

public class DecoModelProvider extends FabricModelProvider {
    // Thanks to PedalHat29861 Packed Grass is now has a Colour Base on the Biomes
    private static final Identifier GRASS_BASE_TEXTURE = new Identifier(VaranDeco.MOD_ID, "block/grass_block_base");
    private static final Model CUBE_ALL_TINTED = new Model(Optional.of(new Identifier(VaranDeco.MOD_ID, "block/cube_all_tinted")), Optional.empty(), TextureKey.ALL);
    private static final Model SLAB_TINTED = new Model(Optional.of(new Identifier(VaranDeco.MOD_ID, "block/slab_tinted")), Optional.empty(), TextureKey.BOTTOM, TextureKey.TOP, TextureKey.SIDE);
    private static final Model SLAB_TOP_TINTED = new Model(Optional.of(new Identifier(VaranDeco.MOD_ID, "block/slab_top_tinted")), Optional.empty(), TextureKey.BOTTOM, TextureKey.TOP, TextureKey.SIDE);
    private static final Model STAIRS_TINTED = new Model(Optional.of(new Identifier(VaranDeco.MOD_ID, "block/stairs_tinted")), Optional.empty(), TextureKey.BOTTOM, TextureKey.TOP, TextureKey.SIDE);
    private static final Model STAIRS_INNER_TINTED = new Model(Optional.of(new Identifier(VaranDeco.MOD_ID, "block/stairs_inner_tinted")), Optional.empty(), TextureKey.BOTTOM, TextureKey.TOP, TextureKey.SIDE);
    private static final Model STAIRS_OUTER_TINTED = new Model(Optional.of(new Identifier(VaranDeco.MOD_ID, "block/stairs_outer_tinted")), Optional.empty(), TextureKey.BOTTOM, TextureKey.TOP, TextureKey.SIDE);
    private static final Model CARPET_TINTED = new Model(Optional.of(new Identifier(VaranDeco.MOD_ID, "block/carpet_tinted")), Optional.empty(), TextureKey.WOOL);
    //
    public DecoModelProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
       BlockStateModelGenerator.BlockTexturePool andesitePool =
               blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.POLISHED_ANDESITE_TEMP);
        BlockStateModelGenerator.BlockTexturePool dioritePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.POLISHED_DIORITE_TEMP);
        BlockStateModelGenerator.BlockTexturePool granitePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.POLISHED_GRANITE_TEMP);
        BlockStateModelGenerator.BlockTexturePool stonePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.STONE_TEMP);
        BlockStateModelGenerator.BlockTexturePool smstonePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.SMOOTH_STONE_TEMP);
        BlockStateModelGenerator.BlockTexturePool calcitePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CALCITE_TEMP);
        BlockStateModelGenerator.BlockTexturePool tuffPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.TUFF_TEMP);
        BlockStateModelGenerator.BlockTexturePool dripstonePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.DRIPSTONE_TEMP);
        BlockStateModelGenerator.BlockTexturePool packmudPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.PACKED_MUD_TEMP);
        BlockStateModelGenerator.BlockTexturePool polistonePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.POLISHED_STONE);
        BlockStateModelGenerator.BlockTexturePool stonetilePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.STONE_TILES);
        BlockStateModelGenerator.BlockTexturePool netherbrickPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.NETHER_BRICKS_TEMP);
        BlockStateModelGenerator.BlockTexturePool rednetherbrickPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.RED_NETHER_BRICKS_TEMP);
        BlockStateModelGenerator.BlockTexturePool netherrackPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.NETHERRACK_TEMP);
        BlockStateModelGenerator.BlockTexturePool magmaPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.MAGMA_TEMP);
        BlockStateModelGenerator.BlockTexturePool magmabrickPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.MAGMA_BRICKS);
        blockStateModelGenerator.registerSingleton(DecoBlocks.CHISELED_MAGMA_BRICKS, TexturedModel.CUBE_BOTTOM_TOP);
        BlockStateModelGenerator.BlockTexturePool blackstonetilePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.POLISHED_BLACKSTONE_TILES);
        BlockStateModelGenerator.BlockTexturePool snowPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.SNOW_TEMP);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.POLISHED_GLIDED_BLACKSTONE);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.CHISELED_GLIDED_BLACKSTONE);
        BlockStateModelGenerator.BlockTexturePool packicePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.PACKED_ICE_TEMP);
        BlockStateModelGenerator.BlockTexturePool blueicePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.BLUE_ICE_TEMP);
        BlockStateModelGenerator.BlockTexturePool snowbrickPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.SNOW_BRICKS);
        blockStateModelGenerator.registerSingleton(DecoBlocks.CHISELED_SNOW_BRICKS, TexturedModel.CUBE_COLUMN);
        BlockStateModelGenerator.BlockTexturePool icebrickPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.ICE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.BLACK_ICE);
        BlockStateModelGenerator.BlockTexturePool smoothsandstonePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.SANDSTONE_TOP_TEMP);
        BlockStateModelGenerator.BlockTexturePool smoothredsandstonePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.RED_SANDSTONE_TOP_TEMP);
        BlockStateModelGenerator.BlockTexturePool cactusplankPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CACTUS_PLANKS);
        BlockStateModelGenerator.BlockTexturePool prismarinebrickPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.PRISMARINE_BRICKS_TEMP);
        BlockStateModelGenerator.BlockTexturePool darkprismarinePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.DARK_PRISMARINE_TEMP);
        BlockStateModelGenerator.BlockTexturePool cryprismarinePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CRYSTALLIZED_PRISMARINE);
        BlockStateModelGenerator.BlockTexturePool cryprismarinebrickPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool lightprismarinePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.LIGHT_PRISMARINE);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.CHISELED_PRISMARINE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.CHISELED_CRYSTALLIZED_PRISMARINE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool bubblePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.BUBBLE_BLOCK);
        BlockStateModelGenerator.BlockTexturePool bubblebrickPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.BUBBLE_BRICKS);
        blockStateModelGenerator.registerSingleton(DecoBlocks.CHISELED_BUBBLE_BRICKS, TexturedModel.CUBE_BOTTOM_TOP);
        BlockStateModelGenerator.BlockTexturePool smoothsoulsoilPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.SMOOTH_SOUL_SOILSTONE);
        BlockStateModelGenerator.BlockTexturePool quartzPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.QUARTZ_TEMP);
        BlockStateModelGenerator.BlockTexturePool smoothquartzPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.SMOOTH_QUARTZ_TEMP);
        BlockStateModelGenerator.BlockTexturePool quartzbrickPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.QUARTZ_BRICKS_TEMP);
        BlockStateModelGenerator.BlockTexturePool cutquartzPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CUT_QUARTZ);
        BlockStateModelGenerator.BlockTexturePool cracknetherPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CRACKED_NETHER_BRICKS_TEMP);
        BlockStateModelGenerator.BlockTexturePool crackrednetherPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CRACKED_RED_NETHER_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.CHISELED_RED_NETHER_BRICKS);
        BlockStateModelGenerator.BlockTexturePool bluenetherPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.BLUE_NETHER_BRICKS);
        BlockStateModelGenerator.BlockTexturePool crackbluenetherPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CRACKED_BLUE_NETHER_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.CHISELED_BLUE_NETHER_BRICKS);
        BlockStateModelGenerator.BlockTexturePool smoothdeepslatePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.SMOOTH_DEEPSLATE);
        BlockStateModelGenerator.BlockTexturePool smoothblackstonePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.SMOOTH_BLACKSTONE);
        blockStateModelGenerator.registerSingleton(DecoBlocks.CHISELED_BRICKS, TexturedModel.CUBE_COLUMN);
        BlockStateModelGenerator.BlockTexturePool endstonePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.END_STONE_TEMP);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.CHISELED_END_STONE);
        BlockStateModelGenerator.BlockTexturePool smoothpurpurPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.SMOOTH_PURPUR);
        BlockStateModelGenerator.BlockTexturePool purpurbrickPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.PURPUR_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.CHISELED_PURPUR);
        BlockStateModelGenerator.BlockTexturePool voidstonePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.VOID_STONE);
        BlockStateModelGenerator.BlockTexturePool voidstonebrickPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.VOID_STONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.CHISELED_VOID_STONE);
        BlockStateModelGenerator.BlockTexturePool obsidianPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.OBSIDIAN_TEMP);
        BlockStateModelGenerator.BlockTexturePool obsidianbrickPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.OBSIDIAN_BRICKS);
        blockStateModelGenerator.registerSingleton(DecoBlocks.CHISELED_OBSIDIAN, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerAxisRotated(DecoBlocks.OBSIDIAN_PILLAR, TexturedModel.CUBE_COLUMN);
        BlockStateModelGenerator.BlockTexturePool charcoalPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CHARCOAL_BLOCK);
        BlockStateModelGenerator.BlockTexturePool flintPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.FLINT_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.ECHO_BLOCK);
        BlockStateModelGenerator.BlockTexturePool crackstonebrickPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CRACKED_STONE_BRICKS_TEMP);
        BlockStateModelGenerator.BlockTexturePool crackstonetilePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CRACKED_STONE_TILES);
        BlockStateModelGenerator.BlockTexturePool crackblackstonebrickPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CRACKED_POLISHED_BLACKSTONE_BRICKS_TEMP);
        BlockStateModelGenerator.BlockTexturePool crackblackstonetilePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILES);
        BlockStateModelGenerator.BlockTexturePool crackdeepbrickPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CRACKED_DEEPSLATE_BRICKS_TEMP);
        BlockStateModelGenerator.BlockTexturePool crackdeeptilePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CRACKED_DEEPSLATE_TILES_TEMP);
        BlockStateModelGenerator.BlockTexturePool cutironPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CUT_IRON);
        BlockStateModelGenerator.BlockTexturePool polishedeepslatePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.POLISHED_DEEPSLATE_TEMP);
        BlockStateModelGenerator.BlockTexturePool deepslatePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.DEEPSLATE_TEMP);
        BlockStateModelGenerator.BlockTexturePool cobbledeepslatePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.COBBLED_DEEPSLATE_TEMP);
        BlockStateModelGenerator.BlockTexturePool cobblestonePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.COBBLESTONE_TEMP);
        BlockStateModelGenerator.BlockTexturePool blackstonePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.BLACKSTONE_TEMP);
        BlockStateModelGenerator.BlockTexturePool purpurPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.PURPUR_TEMP);
        BlockStateModelGenerator.BlockTexturePool smoothbasaltPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.SMOOTH_BASALT_TEMP);

        BlockStateModelGenerator.BlockTexturePool cobsandstonePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.COBBLED_SANDSTONE);
        BlockStateModelGenerator.BlockTexturePool cobredsandstonePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.COBBLED_RED_SANDSTONE);
        BlockStateModelGenerator.BlockTexturePool cobsoulsoilstonePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.COBBLED_SOUL_SOILSTONE);

        BlockStateModelGenerator.BlockTexturePool polisandstonePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.POLISHED_SANDSTONE);
        BlockStateModelGenerator.BlockTexturePool poliredsandstonePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.POLISHED_RED_SANDSTONE);
        BlockStateModelGenerator.BlockTexturePool polisoulsoilstonePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.POLISHED_SOUL_SOILSTONE);

        BlockStateModelGenerator.BlockTexturePool mossdeepPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.MOSSY_DEEPSLATE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool mossblackstonePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.MOSSY_POLISHED_BLACKSTONE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool mossendstonePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.MOSSY_END_STONE_BRICKS);

        BlockStateModelGenerator.BlockTexturePool sandstonebricksPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.SANDSTONE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool redsandstonebricksPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.RED_SANDSTONE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool soulsoilstonebricksPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.SOUL_SOILSTONE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool cutpurpurPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CUT_PURPUR);

        BlockStateModelGenerator.BlockTexturePool sandobsidianPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.SANDED_OBSIDIAN);
        BlockStateModelGenerator.BlockTexturePool smobsidianPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.SMOOTH_OBSIDIAN);
        BlockStateModelGenerator.BlockTexturePool cutobsidianPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CUT_OBSIDIAN);

        BlockStateModelGenerator.BlockTexturePool lapisPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.LAPIS_TEMP);
        BlockStateModelGenerator.BlockTexturePool lapisbrickPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.LAPIS_BRICKS);
        BlockStateModelGenerator.BlockTexturePool smlapisPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.SMOOTH_LAPIS);
        BlockStateModelGenerator.BlockTexturePool cutlapisPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CUT_LAPIS);

        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.CHISELED_LAPIS);
        blockStateModelGenerator.registerAxisRotated(DecoBlocks.LAPIS_PILLAR, TexturedModel.CUBE_COLUMN);

        blockStateModelGenerator.registerAxisRotated(DecoBlocks.NETHER_BRICK_PILLAR, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerAxisRotated(DecoBlocks.RED_NETHER_BRICK_PILLAR, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerAxisRotated(DecoBlocks.BLUE_NETHER_BRICK_PILLAR, TexturedModel.CUBE_COLUMN);

        blockStateModelGenerator.registerSimpleState(DecoBlocks.SANDSTONE_BRICKS);
        blockStateModelGenerator.registerSimpleState(DecoBlocks.RED_SANDSTONE_BRICKS);

        blockStateModelGenerator.registerSimpleState(DecoBlocks.SOUL_SOILSTONE);
        blockStateModelGenerator.registerSimpleState(DecoBlocks.CHISELED_SOUL_SOILSTONE);
        blockStateModelGenerator.registerSimpleState(DecoBlocks.CUT_SOUL_SOILSTONE);
        blockStateModelGenerator.registerSimpleState(DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS);

        BlockStateModelGenerator.BlockTexturePool castironPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CASTED_IRON);
        BlockStateModelGenerator.BlockTexturePool dripbrickPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.DRIPSTONE_BRICKS);

        BlockStateModelGenerator.BlockTexturePool dripbrickpillarPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.DRIPSTONE_BRICK_PILLAR_TEMP);
        BlockStateModelGenerator.BlockTexturePool voidstonebrickpillarPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.VOID_STONE_BRICK_PILLAR_TEMP);

        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.CHISELED_DRIPSTONE);

        blockStateModelGenerator.registerAxisRotated(DecoBlocks.DRIPSTONE_BRICK_PILLAR, TexturedModel.CUBE_ALL);
        blockStateModelGenerator.registerAxisRotated(DecoBlocks.VOID_STONE_BRICK_PILLAR, TexturedModel.CUBE_ALL);

        BlockStateModelGenerator.BlockTexturePool oakwoodPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.OAK_WOOD_TEMP);
        BlockStateModelGenerator.BlockTexturePool sprucewoodPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.SPRUCE_WOOD_TEMP);
        BlockStateModelGenerator.BlockTexturePool birchwoodPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.BIRCH_WOOD_TEMP);
        BlockStateModelGenerator.BlockTexturePool junglewoodPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.JUNGLE_WOOD_TEMP);
        BlockStateModelGenerator.BlockTexturePool acaciawoodPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.ACACIA_WOOD_TEMP);
        BlockStateModelGenerator.BlockTexturePool darkoakwoodPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.DARK_OAK_WOOD_TEMP);
        BlockStateModelGenerator.BlockTexturePool mangrovewoodPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.MANGROVE_WOOD_TEMP);
        BlockStateModelGenerator.BlockTexturePool crimsonhyphaePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CRIMSON_WOOD_TEMP);
        BlockStateModelGenerator.BlockTexturePool warpedhyphaePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.WARPED_WOOD_TEMP);

        BlockStateModelGenerator.BlockTexturePool strippedoakwoodPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.STRIPPED_OAK_TEMP);
        BlockStateModelGenerator.BlockTexturePool strippedsprucewoodPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.STRIPPED_SPRUCE_TEMP);
        BlockStateModelGenerator.BlockTexturePool strippedbirchwoodPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.STRIPPED_BIRCH_TEMP);
        BlockStateModelGenerator.BlockTexturePool strippedjunglewoodPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.STRIPPED_JUNGLE_TEMP);
        BlockStateModelGenerator.BlockTexturePool strippedacaciawoodPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.STRIPPED_ACACIA_TEMP);
        BlockStateModelGenerator.BlockTexturePool strippeddarkoakwoodPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.STRIPPED_DARK_OAK_TEMP);
        BlockStateModelGenerator.BlockTexturePool strippedmangrovewoodPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.STRIPPED_MANGROVE_TEMP);
        BlockStateModelGenerator.BlockTexturePool strippedcrimsonhyphaePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.STRIPPED_CRIMSON_TEMP);
        BlockStateModelGenerator.BlockTexturePool strippedwarpedhyphaePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.STRIPPED_WARPED_TEMP);

        BlockStateModelGenerator.BlockTexturePool woodenwoodPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.WOODEN_WOOD_TEMP);

        BlockStateModelGenerator.BlockTexturePool strippedwoodenwoodPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.STRIPPED_WOODEN_TEMP);

        BlockStateModelGenerator.BlockTexturePool packednetherrackPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.PACKED_NETHERRACK);
        BlockStateModelGenerator.BlockTexturePool netherrackbrickPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.NETHERRACK_BRICKS);

        BlockStateModelGenerator.BlockTexturePool podzolPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.PODZOL_TEMP);
        BlockStateModelGenerator.BlockTexturePool myceliumPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.MYCELIUM_TEMP);

        BlockStateModelGenerator.BlockTexturePool crimnylPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CRIMSON_NYLIUM_TEMP);
        BlockStateModelGenerator.BlockTexturePool warpnylPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.WARPED_NYLIUM_TEMP);

        BlockStateModelGenerator.BlockTexturePool dirtPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.DIRT_TEMP);
        BlockStateModelGenerator.BlockTexturePool coarsedirtPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.COARSE_DIRT_TEMP);
        BlockStateModelGenerator.BlockTexturePool rooteddirtPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.ROOTED_DIRT_TEMP);

        BlockStateModelGenerator.BlockTexturePool mudPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.MUD_TEMP);
        BlockStateModelGenerator.BlockTexturePool clayPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CLAY_TEMP);
        BlockStateModelGenerator.BlockTexturePool mossPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.MOSS_TEMP);

        BlockStateModelGenerator.BlockTexturePool bonePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.BONE_TEMP);
        BlockStateModelGenerator.BlockTexturePool bedrockPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.BEDROCK_TEMP);

        BlockStateModelGenerator.BlockTexturePool cloudPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.SOLID_CLOUD);
        BlockStateModelGenerator.BlockTexturePool cloudbrickPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CLOUD_BRICKS);

        BlockStateModelGenerator.BlockTexturePool tubecoralPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.TUBE_CORAL_TEMP);
        BlockStateModelGenerator.BlockTexturePool braincoralPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.BRAIN_CORAL_TEMP);
        BlockStateModelGenerator.BlockTexturePool bubblecoralPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.BUBBLE_CORAL_TEMP);
        BlockStateModelGenerator.BlockTexturePool firecoralPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.FIRE_CORAL_TEMP);
        BlockStateModelGenerator.BlockTexturePool horncoralPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.HORN_CORAL_TEMP);

        BlockStateModelGenerator.BlockTexturePool deadtubecoralPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.DEAD_TUBE_CORAL_TEMP);
        BlockStateModelGenerator.BlockTexturePool deadbraincoralPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.DEAD_BRAIN_CORAL_TEMP);
        BlockStateModelGenerator.BlockTexturePool deadbubblecoralPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.DEAD_BUBBLE_CORAL_TEMP);
        BlockStateModelGenerator.BlockTexturePool deadfirecoralPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.DEAD_FIRE_CORAL_TEMP);
        BlockStateModelGenerator.BlockTexturePool deadhorncoralPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.DEAD_HORN_CORAL_TEMP);

        BlockStateModelGenerator.BlockTexturePool coalPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.COAL_TEMP);
        BlockStateModelGenerator.BlockTexturePool coalbrickPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.COAL_BRICKS);

        blockStateModelGenerator.registerSingleton(DecoBlocks.CHISELED_COAL_BRICKS, TexturedModel.CUBE_COLUMN);

        blockStateModelGenerator.registerSingleton(DecoBlocks.CHISELED_ICE_BRICKS, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerSingleton(DecoBlocks.CHISELED_MUD_BRICKS, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerSingleton(DecoBlocks.CHISELED_NETHERRACK_BRICKS, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerSingleton(DecoBlocks.CHISELED_CLOUD_BRICKS, TexturedModel.CUBE_COLUMN);

        blockStateModelGenerator.registerAxisRotated(DecoBlocks.PACKED_CACTUS, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerAxisRotated(DecoBlocks.STRIPPED_CACTUS, TexturedModel.CUBE_COLUMN);

        blockStateModelGenerator.registerSimpleState(DecoBlocks.BUBBLE_ELEVATOR_BLOCK_MAGMA);
        blockStateModelGenerator.registerSimpleState(DecoBlocks.BUBBLE_ELEVATOR_BLOCK_BUBBLE);

        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.FRAGILE_ICE);

        blockStateModelGenerator.registerWoolAndCarpet(DecoBlocks.PACKED_PODZOL, DecoBlocks.PODZOL_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(DecoBlocks.PACKED_MYCELIUM, DecoBlocks.MYCELIUM_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(DecoBlocks.PACKED_CRIMSON_NYLIUM, DecoBlocks.CRIMSON_NYLIUM_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(DecoBlocks.PACKED_WARPED_NYLIUM, DecoBlocks.WARPED_NYLIUM_CARPET);

        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.CHISELED_POLISHED_SANDSTONE);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.CHISELED_POLISHED_RED_SANDSTONE);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.CHISELED_POLISHED_SOUL_SOILSTONE);
        
        blockStateModelGenerator.registerParented(DecoBlocks.POLISHED_STONE, DecoBlocks.INFESTED_POLISHED_STONE);
        blockStateModelGenerator.registerParented(DecoBlocks.STONE_TILES, DecoBlocks.INFESTED_STONE_TILES);
        blockStateModelGenerator.registerParented(Blocks.COBBLED_DEEPSLATE, DecoBlocks.INFESTED_COBBLED_DEEPSLATE);
        blockStateModelGenerator.registerParented(Blocks.POLISHED_DEEPSLATE, DecoBlocks.INFESTED_POLISHED_DEEPSLATE);
        blockStateModelGenerator.registerParented(Blocks.DEEPSLATE_BRICKS, DecoBlocks.INFESTED_DEEPSLATE_BRICKS);
        blockStateModelGenerator.registerParented(Blocks.DEEPSLATE_TILES, DecoBlocks.INFESTED_DEEPSLATE_TILES);
        blockStateModelGenerator.registerParented(Blocks.CRACKED_DEEPSLATE_BRICKS, DecoBlocks.INFESTED_CRACKED_DEEPSLATE_BRICKS);
        blockStateModelGenerator.registerParented(DecoBlocks.MOSSY_DEEPSLATE_BRICKS, DecoBlocks.INFESTED_MOSSY_DEEPSLATE_BRICKS);
        blockStateModelGenerator.registerParented(Blocks.CRACKED_DEEPSLATE_TILES, DecoBlocks.INFESTED_CRACKED_DEEPSLATE_TILES);
        blockStateModelGenerator.registerParented(Blocks.MOSSY_COBBLESTONE, DecoBlocks.INFESTED_MOSSY_COBBLESTONE);
        blockStateModelGenerator.registerParented(Blocks.CHISELED_DEEPSLATE, DecoBlocks.INFESTED_CHISELED_DEEPSLATE);
        blockStateModelGenerator.registerParented(Blocks.CALCITE, DecoBlocks.INFESTED_CALCITE);
        blockStateModelGenerator.registerParented(DecoBlocks.POLISHED_CALCITE, DecoBlocks.INFESTED_POLISHED_CALCITE);
        blockStateModelGenerator.registerParented(DecoBlocks.CUT_CALCITE, DecoBlocks.INFESTED_CUT_CALCITE);
        blockStateModelGenerator.registerParented(DecoBlocks.CALCITE_BRICKS, DecoBlocks.INFESTED_CALCITE_BRICKS);
        blockStateModelGenerator.registerParented(Blocks.DRIPSTONE_BLOCK, DecoBlocks.INFESTED_DRIPSTONE_BLOCK);
        blockStateModelGenerator.registerParented(Blocks.TUFF, DecoBlocks.INFESTED_TUFF);
        blockStateModelGenerator.registerParented(Blocks.GRANITE, DecoBlocks.INFESTED_GRANITE);
        blockStateModelGenerator.registerParented(Blocks.POLISHED_GRANITE, DecoBlocks.INFESTED_POLISHED_GRANITE);
        blockStateModelGenerator.registerParented(DecoBlocks.CUT_GRANITE, DecoBlocks.INFESTED_CUT_GRANITE);
        blockStateModelGenerator.registerParented(DecoBlocks.GRANITE_BRICKS, DecoBlocks.INFESTED_GRANITE_BRICKS);
        blockStateModelGenerator.registerParented(Blocks.DIORITE, DecoBlocks.INFESTED_DIORITE);
        blockStateModelGenerator.registerParented(Blocks.POLISHED_DIORITE, DecoBlocks.INFESTED_POLISHED_DIORITE);
        blockStateModelGenerator.registerParented(DecoBlocks.CUT_DIORITE, DecoBlocks.INFESTED_CUT_DIORITE);
        blockStateModelGenerator.registerParented(DecoBlocks.DIORITE_BRICKS, DecoBlocks.INFESTED_DIORITE_BRICKS);
        blockStateModelGenerator.registerParented(Blocks.ANDESITE, DecoBlocks.INFESTED_ANDESITE);
        blockStateModelGenerator.registerParented(Blocks.POLISHED_ANDESITE, DecoBlocks.INFESTED_POLISHED_ANDESITE);
        blockStateModelGenerator.registerParented(DecoBlocks.CUT_ANDESITE, DecoBlocks.INFESTED_CUT_ANDESITE);
        blockStateModelGenerator.registerParented(DecoBlocks.ANDESITE_BRICKS, DecoBlocks.INFESTED_ANDESITE_BRICKS);
        blockStateModelGenerator.registerParented(Blocks.BLACKSTONE, DecoBlocks.INFESTED_BLACKSTONE);
        blockStateModelGenerator.registerParented(Blocks.POLISHED_BLACKSTONE, DecoBlocks.INFESTED_POLISHED_BLACKSTONE);
        blockStateModelGenerator.registerParented(Blocks.POLISHED_BLACKSTONE_BRICKS, DecoBlocks.INFESTED_POLISHED_BLACKSTONE_BRICKS);
        blockStateModelGenerator.registerParented(DecoBlocks.POLISHED_BLACKSTONE_TILES, DecoBlocks.INFESTED_POLISHED_BLACKSTONE_TILES);
        blockStateModelGenerator.registerParented(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS, DecoBlocks.INFESTED_CRACKED_POLISHED_BLACKSTONE_BRICKS);
        blockStateModelGenerator.registerParented(DecoBlocks.MOSSY_POLISHED_BLACKSTONE_BRICKS, DecoBlocks.INFESTED_MOSSY_POLISHED_BLACKSTONE_BRICKS);
        blockStateModelGenerator.registerParented(Blocks.CHISELED_POLISHED_BLACKSTONE, DecoBlocks.INFESTED_CHISELED_POLISHED_BLACKSTONE);
        blockStateModelGenerator.registerParented(DecoBlocks.CRACKED_STONE_TILES, DecoBlocks.INFESTED_CRACKED_STONE_TILES);
        blockStateModelGenerator.registerParented(DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILES, DecoBlocks.INFESTED_CRACKED_POLISHED_BLACKSTONE_TILES);

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

        blockStateModelGenerator.registerFlowerPotPlant(DecoBlocks.BLUE_HIBISCUS, DecoBlocks.POTTED_BLUE_HIBISCUS,
                BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerFlowerPotPlant(DecoBlocks.BROMELIAD, DecoBlocks.POTTED_BROMELIAD,
                BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerFlowerPotPlant(DecoBlocks.WOODEN_SAPLING, DecoBlocks.POTTED_WOODEN_SAPLING,
                BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerFlowerPotPlant(DecoBlocks.BUTTERCUP, DecoBlocks.POTTED_BUTTERCUP,
                BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerFlowerPotPlant(DecoBlocks.NIGHTSHADE, DecoBlocks.POTTED_NIGHTSHADE,
                BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(DecoBlocks.ENDERSHADE, DecoBlocks.POTTED_ENDERSHADE,
                BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerFlowerPotPlant(DecoBlocks.DEAD_EYE_DAISY, DecoBlocks.POTTED_DEAD_EYE_DAISY,
                BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(DecoBlocks.ALPINE_POPPY, DecoBlocks.POTTED_ALPINE_POPPY,
                BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(DecoBlocks.POPPED_BLUET, DecoBlocks.POTTED_POPPED_BLUET,
                BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerFlowerPotPlant(DecoBlocks.IRIS, DecoBlocks.POTTED_IRIS,
                BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(DecoBlocks.BLUE_DELPHINIUM, DecoBlocks.POTTED_BLUE_DELPHINIUM,
                BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(DecoBlocks.CYAN_ORCHID, DecoBlocks.POTTED_CYAN_ORCHID,
                BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(DecoBlocks.FELICIA_DAISY, DecoBlocks.POTTED_FELICIA_DAISY,
                BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerFlowerPotPlant(DecoBlocks.TAIGA_DANDELION, DecoBlocks.POTTED_TAIGA_DANDELION,
                BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(DecoBlocks.FERN_LAVENDER, DecoBlocks.POTTED_FERN_LAVENDER,
                BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(DecoBlocks.CARAMEL_BUTTERCUP, DecoBlocks.POTTED_CARAMEL_BUTTERCUP,
                BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(DecoBlocks.SILVER_ROSE, DecoBlocks.POTTED_SILVER_ROSE,
                BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(DecoBlocks.ALPINE_SPEEDWELL, DecoBlocks.POTTED_ALPINE_SPEEDWELL,
                BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerDoubleBlock(DecoBlocks.MEGA_BROWN_TULIP,
                BlockStateModelGenerator.TintType.NOT_TINTED);

        BlockStateModelGenerator.BlockTexturePool woodenPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.WOODEN_PLANKS);

        BlockStateModelGenerator.BlockTexturePool mushroomPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.MUSHROOM_PLANKS);

        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.CHISELED_MAGMA_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.CHISELED_BUBBLE_BLOCK);

        blockStateModelGenerator.registerLog(DecoBlocks.WOODEN_LOG).log(DecoBlocks.WOODEN_LOG).wood(DecoBlocks.WOODEN_WOOD);
        blockStateModelGenerator.registerLog(DecoBlocks.STRIPPED_WOODEN_LOG).log(DecoBlocks.STRIPPED_WOODEN_LOG).wood(DecoBlocks.STRIPPED_WOODEN_WOOD);

        blockStateModelGenerator.registerPressurePlate(DecoBlocks.COPPER_WEIGHT_PRESSURE_PLATE, Blocks.COPPER_BLOCK);
        blockStateModelGenerator.registerPressurePlate(DecoBlocks.WAXED_COPPER_WEIGHT_PRESSURE_PLATE, Blocks.COPPER_BLOCK);
        blockStateModelGenerator.registerPressurePlate(DecoBlocks.EXPOSED_COPPER_WEIGHT_PRESSURE_PLATE, Blocks.EXPOSED_COPPER);
        blockStateModelGenerator.registerPressurePlate(DecoBlocks.WAXED_EXPOSED_COPPER_WEIGHT_PRESSURE_PLATE, Blocks.EXPOSED_COPPER);
        blockStateModelGenerator.registerPressurePlate(DecoBlocks.WEATHERED_COPPER_WEIGHT_PRESSURE_PLATE, Blocks.WEATHERED_COPPER);
        blockStateModelGenerator.registerPressurePlate(DecoBlocks.WAXED_WEATHERED_COPPER_WEIGHT_PRESSURE_PLATE, Blocks.WEATHERED_COPPER);
        blockStateModelGenerator.registerPressurePlate(DecoBlocks.OXIDIZED_COPPER_WEIGHT_PRESSURE_PLATE, Blocks.OXIDIZED_COPPER);
        blockStateModelGenerator.registerPressurePlate(DecoBlocks.WAXED_OXIDIZED_COPPER_WEIGHT_PRESSURE_PLATE, Blocks.OXIDIZED_COPPER);

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
        blockStateModelGenerator.registerSimpleState(DecoBlocks.OAK_CRAFTING_TABLE);
        blockStateModelGenerator.registerSimpleState(DecoBlocks.MUSHROOM_CRAFTING_TABLE);

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
        blockStateModelGenerator.registerSimpleState(DecoBlocks.MUSHROOM_SMITHING_TABLE);

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
        blockStateModelGenerator.registerSimpleState(DecoBlocks.MUSHROOM_CARTOGRAPHY_TABLE);

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

        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.PASTEL_LIGHT_GRAY_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.PASTEL_GRAY_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.PASTEL_BROWN_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.PASTEL_RED_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.PASTEL_ORANGE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.PASTEL_YELLOW_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.PASTEL_LIME_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.PASTEL_GREEN_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.PASTEL_CYAN_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.PASTEL_LIGHT_BLUE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.PASTEL_BLUE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.PASTEL_PURPLE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.PASTEL_MAGENTA_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.PASTEL_PINK_BLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.SHADED_LIGHT_GRAY_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.SHADED_GRAY_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.SHADED_BROWN_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.SHADED_RED_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.SHADED_ORANGE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.SHADED_YELLOW_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.SHADED_LIME_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.SHADED_GREEN_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.SHADED_CYAN_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.SHADED_LIGHT_BLUE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.SHADED_BLUE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.SHADED_PURPLE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.SHADED_MAGENTA_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.SHADED_PINK_BLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.SMOOTH_GLOWSTONE);

        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.WHITE_LAMP);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.LIGHT_GRAY_LAMP);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.GRAY_LAMP);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.BLACK_LAMP);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.BROWN_LAMP);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.RED_LAMP);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.ORANGE_LAMP);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.YELLOW_LAMP);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.LIME_LAMP);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.GREEN_LAMP);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.CYAN_LAMP);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.LIGHT_BLUE_LAMP);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.BLUE_LAMP);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.PURPLE_LAMP);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.MAGENTA_LAMP);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.PINK_LAMP);

        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.MUSHROOM_NOTE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.OAK_NOTE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.SPRUCE_NOTE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.BIRCH_NOTE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.JUNGLE_NOTE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.DARK_OAK_NOTE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.ACACIA_NOTE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.MANGROVE_NOTE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.CRIMSON_NOTE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.WARPED_NOTE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.CACTUS_NOTE_BLOCK);

        BlockStateModelGenerator.BlockTexturePool policalcPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.POLISHED_CALCITE);
        BlockStateModelGenerator.BlockTexturePool cutcalcPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CUT_CALCITE);
        BlockStateModelGenerator.BlockTexturePool calcbrickPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CALCITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool cutdiorPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CUT_DIORITE);
        BlockStateModelGenerator.BlockTexturePool diorbrickPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.DIORITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool cutgranPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CUT_GRANITE);
        BlockStateModelGenerator.BlockTexturePool granbrickPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.GRANITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool cutandesPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CUT_ANDESITE);
        BlockStateModelGenerator.BlockTexturePool andesbrickPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.ANDESITE_BRICKS);

        BlockStateModelGenerator.BlockTexturePool cutgoldPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CUT_GOLD);

        BlockStateModelGenerator.BlockTexturePool goldPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.GOLD_TEMP);
        BlockStateModelGenerator.BlockTexturePool rawgoldPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.RAW_GOLD_TEMP);
        BlockStateModelGenerator.BlockTexturePool ironPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.IRON_TEMP);
        BlockStateModelGenerator.BlockTexturePool rawironPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.RAW_IRON_TEMP);

        BlockStateModelGenerator.BlockTexturePool copperPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.COPPER_TEMP);
        BlockStateModelGenerator.BlockTexturePool rawcopperPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.RAW_COPPER_TEMP);
        BlockStateModelGenerator.BlockTexturePool expcopperPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.EXPOSED_COPPER_TEMP);
        BlockStateModelGenerator.BlockTexturePool weathcopperPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.WEATHERED_COPPER_TEMP);
        BlockStateModelGenerator.BlockTexturePool oxidcopperPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.OXIDIZED_COPPER_TEMP);

        BlockStateModelGenerator.BlockTexturePool poliendstonePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.POLISHED_END_STONE);
        BlockStateModelGenerator.BlockTexturePool smoothendstonePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.SMOOTH_END_STONE);
        BlockStateModelGenerator.BlockTexturePool endstonetilePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.END_STONE_TILES);

        BlockStateModelGenerator.BlockTexturePool crackendstonebrickPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CRACKED_END_STONE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool crackendstonetilePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CRACKED_END_STONE_TILES);

        BlockStateModelGenerator.BlockTexturePool hayPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.HAY_TEMP);

        blockStateModelGenerator.registerWoolAndCarpet(DecoBlocks.HAY_CARPET_TEMP, DecoBlocks.HAY_CARPET);

        BlockStateModelGenerator.BlockTexturePool nethwartPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.NETHER_WART_TEMP);
        BlockStateModelGenerator.BlockTexturePool warpwartPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.WARPED_WART_TEMP);

        BlockStateModelGenerator.BlockTexturePool sculkPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.SCULK_TEMP);

        blockStateModelGenerator.registerWoolAndCarpet(DecoBlocks.SCULK_CARPET_TEMP, DecoBlocks.SCULK_CARPET);

        BlockStateModelGenerator.BlockTexturePool sandPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.SAND_TEMP);
        BlockStateModelGenerator.BlockTexturePool redSandPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.RED_SAND_TEMP);
        BlockStateModelGenerator.BlockTexturePool gravelPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.GRAVEL_TEMP);

        blockStateModelGenerator.registerWoolAndCarpet(DecoBlocks.SAND_CARPET_TEMP, DecoBlocks.SAND_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(DecoBlocks.RED_SAND_CARPET_TEMP, DecoBlocks.RED_SAND_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(DecoBlocks.GRAVEL_CARPET_TEMP, DecoBlocks.GRAVEL_CARPET);

        BlockStateModelGenerator.BlockTexturePool honeyPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.HONEYCOMB_TEMP);

        blockStateModelGenerator.registerTintableCross(DecoBlocks.HYDRATED_TUBE_CORAL, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCross(DecoBlocks.HYDRATED_BRAIN_CORAL, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCross(DecoBlocks.HYDRATED_BUBBLE_CORAL, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCross(DecoBlocks.HYDRATED_HORN_CORAL, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCross(DecoBlocks.HYDRATED_FIRE_CORAL, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerCoralFan(DecoBlocks.HYDRATED_TUBE_CORAL_FAN, DecoBlocks.HYDRATED_TUBE_CORAL_WALL_FAN);
        blockStateModelGenerator.registerCoralFan(DecoBlocks.HYDRATED_BRAIN_CORAL_FAN, DecoBlocks.HYDRATED_BRAIN_CORAL_WALL_FAN);
        blockStateModelGenerator.registerCoralFan(DecoBlocks.HYDRATED_BUBBLE_CORAL_FAN, DecoBlocks.HYDRATED_BUBBLE_CORAL_WALL_FAN);
        blockStateModelGenerator.registerCoralFan(DecoBlocks.HYDRATED_FIRE_CORAL_FAN, DecoBlocks.HYDRATED_FIRE_CORAL_WALL_FAN);
        blockStateModelGenerator.registerCoralFan(DecoBlocks.HYDRATED_HORN_CORAL_FAN, DecoBlocks.HYDRATED_HORN_CORAL_WALL_FAN);

        blockStateModelGenerator.registerSimpleCubeAll(DecoBlocks.CLOUD_BLOCK);

        blockStateModelGenerator.registerAxisRotated(DecoBlocks.BASALT_BRICKS, TexturedModel.CUBE_COLUMN);

        blockStateModelGenerator.registerDoor(DecoBlocks.CACTUS_DOOR);
        blockStateModelGenerator.registerTrapdoor(DecoBlocks.CACTUS_TRAPDOOR);

        blockStateModelGenerator.registerDoor(DecoBlocks.MUSHROOM_DOOR);
        blockStateModelGenerator.registerTrapdoor(DecoBlocks.MUSHROOM_TRAPDOOR);

        blockStateModelGenerator.registerDoor(DecoBlocks.WOODEN_DOOR);
        blockStateModelGenerator.registerTrapdoor(DecoBlocks.WOODEN_TRAPDOOR);

        blockStateModelGenerator.registerDoor(DecoBlocks.GOLD_DOOR);
        blockStateModelGenerator.registerTrapdoor(DecoBlocks.GOLD_TRAPDOOR);

        blockStateModelGenerator.registerDoor(DecoBlocks.OAK_PALLET_DOOR);
        blockStateModelGenerator.registerDoor(DecoBlocks.SPRUCE_PALLET_DOOR);
        blockStateModelGenerator.registerDoor(DecoBlocks.BIRCH_PALLET_DOOR);
        blockStateModelGenerator.registerDoor(DecoBlocks.JUNGLE_PALLET_DOOR);
        blockStateModelGenerator.registerDoor(DecoBlocks.ACACIA_PALLET_DOOR);
        blockStateModelGenerator.registerDoor(DecoBlocks.DARK_OAK_PALLET_DOOR);
        blockStateModelGenerator.registerDoor(DecoBlocks.MANGROVE_PALLET_DOOR);
        blockStateModelGenerator.registerDoor(DecoBlocks.CRIMSON_PALLET_DOOR);
        blockStateModelGenerator.registerDoor(DecoBlocks.WARPED_PALLET_DOOR);
        blockStateModelGenerator.registerDoor(DecoBlocks.CACTUS_PALLET_DOOR);
        blockStateModelGenerator.registerDoor(DecoBlocks.MUSHROOM_PALLET_DOOR);
        blockStateModelGenerator.registerDoor(DecoBlocks.WOODEN_PALLET_DOOR);

        blockStateModelGenerator.registerTrapdoor(DecoBlocks.OAK_PALLET_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(DecoBlocks.SPRUCE_PALLET_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(DecoBlocks.BIRCH_PALLET_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(DecoBlocks.JUNGLE_PALLET_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(DecoBlocks.ACACIA_PALLET_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(DecoBlocks.DARK_OAK_PALLET_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(DecoBlocks.MANGROVE_PALLET_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(DecoBlocks.CRIMSON_PALLET_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(DecoBlocks.WARPED_PALLET_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(DecoBlocks.CACTUS_PALLET_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(DecoBlocks.MUSHROOM_PALLET_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(DecoBlocks.WOODEN_PALLET_TRAPDOOR);

       andesitePool.wall(DecoBlocks.POLISHED_ANDESITE_WALL);
       dioritePool.wall(DecoBlocks.POLISHED_DIORITE_WALL);
       granitePool.wall(DecoBlocks.POLISHED_GRANITE_WALL);
       stonePool.wall(DecoBlocks.STONE_WALL);

       smstonePool.stairs(DecoBlocks.SMOOTH_STONE_STAIRS);
       smstonePool.wall(DecoBlocks.SMOOTH_STONE_WALL);

       calcitePool.stairs(DecoBlocks.CALCITE_STAIRS);
       calcitePool.slab(DecoBlocks.CALCITE_SLAB);
       calcitePool.wall(DecoBlocks.CALCITE_WALL);
       tuffPool.stairs(DecoBlocks.TUFF_STAIRS);
       tuffPool.slab(DecoBlocks.TUFF_SLAB);
       tuffPool.wall(DecoBlocks.TUFF_WALL);
       dripstonePool.stairs(DecoBlocks.DRIPSTONE_STAIRS);
       dripstonePool.slab(DecoBlocks.DRIPSTONE_SLAB);
       dripstonePool.wall(DecoBlocks.DRIPSTONE_WALL);

       polistonePool.stairs(DecoBlocks.POLISHED_STONE_STAIRS);
       polistonePool.slab(DecoBlocks.POLISHED_STONE_SLAB);
       polistonePool.wall(DecoBlocks.POLISHED_STONE_WALL);

       stonetilePool.stairs(DecoBlocks.STONE_TILE_STAIRS);
       stonetilePool.slab(DecoBlocks.STONE_TILE_SLAB);
       stonetilePool.wall(DecoBlocks.STONE_TILE_WALL);

       packmudPool.stairs(DecoBlocks.PACKED_MUD_STAIRS);
       packmudPool.slab(DecoBlocks.PACKED_MUD_SLAB);
       packmudPool.wall(DecoBlocks.PACKED_MUD_WALL);

       netherbrickPool.fenceGate(DecoBlocks.NETHER_BRICK_FENCE_GATE);
       rednetherbrickPool.fence(DecoBlocks.RED_NETHER_BRICK_FENCE);
       rednetherbrickPool.fenceGate(DecoBlocks.RED_NETHER_BRICK_FENCE_GATE);

       netherrackPool.stairs(DecoBlocks.NETHERRACK_STAIRS);
       netherrackPool.slab(DecoBlocks.NETHERRACK_SLAB);
       netherrackPool.wall(DecoBlocks.NETHERRACK_WALL);

       magmaPool.stairs(DecoBlocks.MAGMA_STAIRS);
       magmaPool.slab(DecoBlocks.MAGMA_SLAB);
       magmaPool.wall(DecoBlocks.MAGMA_WALL);

       magmabrickPool.stairs(DecoBlocks.MAGMA_BRICK_STAIRS);
       magmabrickPool.slab(DecoBlocks.MAGMA_BRICK_SLAB);
       magmabrickPool.wall(DecoBlocks.MAGMA_BRICK_WALL);

       blackstonetilePool.stairs(DecoBlocks.POLISHED_BLACKSTONE_TILE_STAIRS);
       blackstonetilePool.slab(DecoBlocks.POLISHED_BLACKSTONE_TILE_SLAB);
       blackstonetilePool.wall(DecoBlocks.POLISHED_BLACKSTONE_TILE_WALL);

       snowPool.stairs(DecoBlocks.SNOW_STAIRS);
       snowPool.slab(DecoBlocks.SNOW_SLAB);
       snowPool.wall(DecoBlocks.SNOW_WALL);

       packicePool.stairs(DecoBlocks.PACKED_ICE_STAIRS);
       packicePool.slab(DecoBlocks.PACKED_ICE_SLAB);
       packicePool.wall(DecoBlocks.PACKED_ICE_WALL);

       blueicePool.stairs(DecoBlocks.BLUE_ICE_STAIRS);
       blueicePool.slab(DecoBlocks.BLUE_ICE_SLAB);
       blueicePool.wall(DecoBlocks.BLUE_ICE_WALL);

       snowbrickPool.stairs(DecoBlocks.SNOW_BRICK_STAIRS);
       snowbrickPool.slab(DecoBlocks.SNOW_BRICK_SLAB);
       snowbrickPool.wall(DecoBlocks.SNOW_BRICK_WALL);

       icebrickPool.stairs(DecoBlocks.ICE_BRICK_STAIRS);
       icebrickPool.slab(DecoBlocks.ICE_BRICK_SLAB);
       icebrickPool.wall(DecoBlocks.ICE_BRICK_WALL);

       smoothsandstonePool.wall(DecoBlocks.SMOOTH_SANDSTONE_WALL);
       smoothredsandstonePool.wall(DecoBlocks.SMOOTH_RED_SANDSTONE_WALL);

       darkprismarinePool.wall(DecoBlocks.DARK_PRISMARINE_WALL);
       prismarinebrickPool.wall(DecoBlocks.PRISMARINE_BRICK_WALL);

       cryprismarinePool.stairs(DecoBlocks.CRYSTALLIZED_PRISMARINE_STAIRS);
       cryprismarinePool.slab(DecoBlocks.CRYSTALLIZED_PRISMARINE_SLAB);
       cryprismarinePool.wall(DecoBlocks.CRYSTALLIZED_PRISMARINE_WALL);

       cryprismarinebrickPool.stairs(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICK_STAIRS);
       cryprismarinebrickPool.slab(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICK_SLAB);
       cryprismarinebrickPool.wall(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICK_WALL);

       lightprismarinePool.stairs(DecoBlocks.LIGHT_PRISMARINE_STAIRS);
       lightprismarinePool.slab(DecoBlocks.LIGHT_PRISMARINE_SLAB);
       lightprismarinePool.wall(DecoBlocks.LIGHT_PRISMARINE_WALL);

       bubblePool.stairs(DecoBlocks.BUBBLE_STAIRS);
       bubblePool.slab(DecoBlocks.BUBBLE_SLAB);
       bubblePool.wall(DecoBlocks.BUBBLE_WALL);

       bubblebrickPool.stairs(DecoBlocks.BUBBLE_BRICK_STAIRS);
       bubblebrickPool.slab(DecoBlocks.BUBBLE_BRICK_SLAB);
       bubblebrickPool.wall(DecoBlocks.BUBBLE_BRICK_WALL);

       smoothsoulsoilPool.stairs(DecoBlocks.SMOOTH_SOUL_SOILSTONE_STAIRS);
       smoothsoulsoilPool.slab(DecoBlocks.SMOOTH_SOUL_SOILSTONE_SLAB);
       smoothsoulsoilPool.wall(DecoBlocks.SMOOTH_SOUL_SOILSTONE_WALL);

       quartzbrickPool.stairs(DecoBlocks.QUARTZ_BRICK_STAIRS);
       quartzbrickPool.slab(DecoBlocks.QUARTZ_BRICK_SLAB);
       quartzbrickPool.wall(DecoBlocks.QUARTZ_BRICK_WALL);

       cutquartzPool.stairs(DecoBlocks.CUT_QUARTZ_STAIRS);
       cutquartzPool.slab(DecoBlocks.CUT_QUARTZ_SLAB);
       cutquartzPool.wall(DecoBlocks.CUT_QUARTZ_WALL);

       quartzPool.wall(DecoBlocks.QUARTZ_WALL);
       smoothquartzPool.wall(DecoBlocks.SMOOTH_QUARTZ_WALL);

       cactusplankPool.stairs(DecoBlocks.CACTUS_PLANK_STAIRS);
       cactusplankPool.slab(DecoBlocks.CACTUS_PLANK_SLAB);
       cactusplankPool.fence(DecoBlocks.CACTUS_PLANK_FENCE);
       cactusplankPool.button(DecoBlocks.CACTUS_PLANK_BUTTON);
       cactusplankPool.pressurePlate(DecoBlocks.CACTUS_PLANK_PRESSURE_PLATE);
       cactusplankPool.fenceGate(DecoBlocks.CACTUS_PLANK_FENCE_GATE);

        woodenPool.stairs(DecoBlocks.WOODEN_STAIRS);
        woodenPool.slab(DecoBlocks.WOODEN_SLAB);
        woodenPool.fence(DecoBlocks.WOODEN_FENCE);
        woodenPool.button(DecoBlocks.WOODEN_BUTTON);
        woodenPool.pressurePlate(DecoBlocks.WOODEN_PRESSURE_PLATE);
        woodenPool.fenceGate(DecoBlocks.WOODEN_FENCE_GATE);

        mushroomPool.stairs(DecoBlocks.MUSHROOM_STAIRS);
        mushroomPool.slab(DecoBlocks.MUSHROOM_SLAB);
        mushroomPool.fence(DecoBlocks.MUSHROOM_FENCE);
        mushroomPool.button(DecoBlocks.MUSHROOM_BUTTON);
        mushroomPool.pressurePlate(DecoBlocks.MUSHROOM_PRESSURE_PLATE);
        mushroomPool.fenceGate(DecoBlocks.MUSHROOM_FENCE_GATE);

       bluenetherPool.stairs(DecoBlocks.BLUE_NETHER_BRICK_STAIRS);
       bluenetherPool.slab(DecoBlocks.BLUE_NETHER_BRICK_SLAB);
       bluenetherPool.fence(DecoBlocks.BLUE_NETHER_BRICK_FENCE);
       bluenetherPool.wall(DecoBlocks.BLUE_NETHER_BRICK_WALL);
       bluenetherPool.fenceGate(DecoBlocks.BLUE_NETHER_BRICK_FENCE_GATE);

       smoothdeepslatePool.stairs(DecoBlocks.SMOOTH_DEEPSLATE_STAIRS);
       smoothdeepslatePool.wall(DecoBlocks.SMOOTH_DEEPSLATE_WALL);
       smoothblackstonePool.stairs(DecoBlocks.SMOOTH_BLACKSTONE_STAIRS);
       smoothblackstonePool.wall(DecoBlocks.SMOOTH_BLACKSTONE_WALL);

        endstonePool.stairs(DecoBlocks.END_STONE_STAIRS);
        endstonePool.slab(DecoBlocks.END_STONE_SLAB);
        endstonePool.wall(DecoBlocks.END_STONE_WALL);
        endstonePool.button(DecoBlocks.END_STONE_BUTTON);
        endstonePool.pressurePlate(DecoBlocks.END_STONE_PRESSURE_PLATE);

        smoothpurpurPool.stairs(DecoBlocks.SMOOTH_PURPUR_STAIRS);
        smoothpurpurPool.slab(DecoBlocks.SMOOTH_PURPUR_SLAB);
        smoothpurpurPool.wall(DecoBlocks.SMOOTH_PURPUR_WALL);

        purpurbrickPool.stairs(DecoBlocks.PURPUR_BRICK_STAIRS);
        purpurbrickPool.slab(DecoBlocks.PURPUR_BRICK_SLAB);
        purpurbrickPool.wall(DecoBlocks.PURPUR_BRICK_WALL);

        voidstonePool.stairs(DecoBlocks.VOID_STONE_STAIRS);
        voidstonePool.slab(DecoBlocks.VOID_STONE_SLAB);
        voidstonePool.wall(DecoBlocks.VOID_STONE_WALL);

        voidstonebrickPool.stairs(DecoBlocks.VOID_STONE_BRICK_STAIRS);
        voidstonebrickPool.slab(DecoBlocks.VOID_STONE_BRICK_SLAB);
        voidstonebrickPool.wall(DecoBlocks.VOID_STONE_BRICK_WALL);

        obsidianPool.stairs(DecoBlocks.OBSIDIAN_STAIRS);
        obsidianPool.slab(DecoBlocks.OBSIDIAN_SLAB);
        obsidianPool.wall(DecoBlocks.OBSIDIAN_WALL);

        obsidianbrickPool.stairs(DecoBlocks.OBSIDIAN_BRICK_STAIRS);
        obsidianbrickPool.slab(DecoBlocks.OBSIDIAN_BRICK_SLAB);
        obsidianbrickPool.wall(DecoBlocks.OBSIDIAN_BRICK_WALL);

        cutironPool.stairs(DecoBlocks.CUT_IRON_STAIRS);
        cutironPool.slab(DecoBlocks.CUT_IRON_SLAB);

        polishedeepslatePool.button(DecoBlocks.POLISHED_DEEPSLATE_BUTTON);
        polishedeepslatePool.pressurePlate(DecoBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE);

        deepslatePool.button(DecoBlocks.DEEPSLATE_BUTTON);
        deepslatePool.pressurePlate(DecoBlocks.DEEPSLATE_PRESSURE_PLATE);

        cobbledeepslatePool.button(DecoBlocks.COBBLED_DEEPSLATE_BUTTON);
        cobbledeepslatePool.pressurePlate(DecoBlocks.COBBLED_DEEPSLATE_PRESSURE_PLATE);

        cobblestonePool.button(DecoBlocks.COBBLESTONE_BUTTON);
        cobblestonePool.pressurePlate(DecoBlocks.COBBLESTONE_PRESSURE_PLATE);

        blackstonePool.button(DecoBlocks.BLACKSTONE_BUTTON);
        blackstonePool.pressurePlate(DecoBlocks.BLACKSTONE_PRESSURE_PLATE);

        polistonePool.button(DecoBlocks.POLISHED_STONE_BUTTON);
        polistonePool.pressurePlate(DecoBlocks.POLISHED_STONE_PRESSURE_PLATE);

        purpurPool.wall(DecoBlocks.PURPUR_WALL);

        smoothbasaltPool.stairs(DecoBlocks.SMOOTH_BASALT_STAIRS);
        smoothbasaltPool.slab(DecoBlocks.SMOOTH_BASALT_SLAB);
        smoothbasaltPool.wall(DecoBlocks.SMOOTH_BASALT_WALL);

        cobsandstonePool.stairs(DecoBlocks.COBBLED_SANDSTONE_STAIRS);
        cobsandstonePool.slab(DecoBlocks.COBBLED_SANDSTONE_SLAB);
        cobsandstonePool.wall(DecoBlocks.COBBLED_SANDSTONE_WALL);

        cobredsandstonePool.stairs(DecoBlocks.COBBLED_RED_SANDSTONE_STAIRS);
        cobredsandstonePool.slab(DecoBlocks.COBBLED_RED_SANDSTONE_SLAB);
        cobredsandstonePool.wall(DecoBlocks.COBBLED_RED_SANDSTONE_WALL);

        cobsoulsoilstonePool.stairs(DecoBlocks.COBBLED_SOUL_SOILSTONE_STAIRS);
        cobsoulsoilstonePool.slab(DecoBlocks.COBBLED_SOUL_SOILSTONE_SLAB);
        cobsoulsoilstonePool.wall(DecoBlocks.COBBLED_SOUL_SOILSTONE_WALL);

        polisandstonePool.stairs(DecoBlocks.POLISHED_SANDSTONE_STAIRS);
        polisandstonePool.slab(DecoBlocks.POLISHED_SANDSTONE_SLAB);
        polisandstonePool.wall(DecoBlocks.POLISHED_SANDSTONE_WALL);

        poliredsandstonePool.stairs(DecoBlocks.POLISHED_RED_SANDSTONE_STAIRS);
        poliredsandstonePool.slab(DecoBlocks.POLISHED_RED_SANDSTONE_SLAB);
        poliredsandstonePool.wall(DecoBlocks.POLISHED_RED_SANDSTONE_WALL);

        polisoulsoilstonePool.stairs(DecoBlocks.POLISHED_SOUL_SOILSTONE_STAIRS);
        polisoulsoilstonePool.slab(DecoBlocks.POLISHED_SOUL_SOILSTONE_SLAB);
        polisoulsoilstonePool.wall(DecoBlocks.POLISHED_SOUL_SOILSTONE_WALL);

        sandstonebricksPool.stairs(DecoBlocks.SANDSTONE_BRICK_STAIRS);
        sandstonebricksPool.slab(DecoBlocks.SANDSTONE_BRICK_SLAB);
        sandstonebricksPool.wall(DecoBlocks.SANDSTONE_BRICK_WALL);

        redsandstonebricksPool.stairs(DecoBlocks.RED_SANDSTONE_BRICK_STAIRS);
        redsandstonebricksPool.slab(DecoBlocks.RED_SANDSTONE_BRICK_SLAB);
        redsandstonebricksPool.wall(DecoBlocks.RED_SANDSTONE_BRICK_WALL);

        soulsoilstonebricksPool.stairs(DecoBlocks.SOUL_SOILSTONE_BRICK_STAIRS);
        soulsoilstonebricksPool.slab(DecoBlocks.SOUL_SOILSTONE_BRICK_SLAB);
        soulsoilstonebricksPool.wall(DecoBlocks.SOUL_SOILSTONE_BRICK_WALL);

        cutpurpurPool.stairs(DecoBlocks.CUT_PURPUR_STAIRS);
        cutpurpurPool.slab(DecoBlocks.CUT_PURPUR_SLAB);
        cutpurpurPool.wall(DecoBlocks.CUT_PURPUR_WALL);

        oakwoodPool.stairs(DecoBlocks.OAK_WOOD_STAIRS);
        oakwoodPool.slab(DecoBlocks.OAK_WOOD_SLAB);
        oakwoodPool.wall(DecoBlocks.OAK_WOOD_WALL);

        sprucewoodPool.stairs(DecoBlocks.SPRUCE_WOOD_STAIRS);
        sprucewoodPool.slab(DecoBlocks.SPRUCE_WOOD_SLAB);
        sprucewoodPool.wall(DecoBlocks.SPRUCE_WOOD_WALL);

        birchwoodPool.stairs(DecoBlocks.BIRCH_WOOD_STAIRS);
        birchwoodPool.slab(DecoBlocks.BIRCH_WOOD_SLAB);
        birchwoodPool.wall(DecoBlocks.BIRCH_WOOD_WALL);

        junglewoodPool.stairs(DecoBlocks.JUNGLE_WOOD_STAIRS);
        junglewoodPool.slab(DecoBlocks.JUNGLE_WOOD_SLAB);
        junglewoodPool.wall(DecoBlocks.JUNGLE_WOOD_WALL);

        acaciawoodPool.stairs(DecoBlocks.ACACIA_WOOD_STAIRS);
        acaciawoodPool.slab(DecoBlocks.ACACIA_WOOD_SLAB);
        acaciawoodPool.wall(DecoBlocks.ACACIA_WOOD_WALL);

        darkoakwoodPool.stairs(DecoBlocks.DARK_OAK_WOOD_STAIRS);
        darkoakwoodPool.slab(DecoBlocks.DARK_OAK_WOOD_SLAB);
        darkoakwoodPool.wall(DecoBlocks.DARK_OAK_WOOD_WALL);

        mangrovewoodPool.stairs(DecoBlocks.MANGROVE_WOOD_STAIRS);
        mangrovewoodPool.slab(DecoBlocks.MANGROVE_WOOD_SLAB);
        mangrovewoodPool.wall(DecoBlocks.MANGROVE_WOOD_WALL);

        crimsonhyphaePool.stairs(DecoBlocks.CRIMSON_HYPHAE_STAIRS);
        crimsonhyphaePool.slab(DecoBlocks.CRIMSON_HYPHAE_SLAB);
        crimsonhyphaePool.wall(DecoBlocks.CRIMSON_HYPHAE_WALL);

        warpedhyphaePool.stairs(DecoBlocks.WARPED_HYPHAE_STAIRS);
        warpedhyphaePool.slab(DecoBlocks.WARPED_HYPHAE_SLAB);
        warpedhyphaePool.wall(DecoBlocks.WARPED_HYPHAE_WALL);

        strippedoakwoodPool.stairs(DecoBlocks.STRIPPED_OAK_WOOD_STAIRS);
        strippedoakwoodPool.slab(DecoBlocks.STRIPPED_OAK_WOOD_SLAB);
        strippedoakwoodPool.wall(DecoBlocks.STRIPPED_OAK_WOOD_WALL);

        strippedsprucewoodPool.stairs(DecoBlocks.STRIPPED_SPRUCE_WOOD_STAIRS);
        strippedsprucewoodPool.slab(DecoBlocks.STRIPPED_SPRUCE_WOOD_SLAB);
        strippedsprucewoodPool.wall(DecoBlocks.STRIPPED_SPRUCE_WOOD_WALL);

        strippedbirchwoodPool.stairs(DecoBlocks.STRIPPED_BIRCH_WOOD_STAIRS);
        strippedbirchwoodPool.slab(DecoBlocks.STRIPPED_BIRCH_WOOD_SLAB);
        strippedbirchwoodPool.wall(DecoBlocks.STRIPPED_BIRCH_WOOD_WALL);

        strippedjunglewoodPool.stairs(DecoBlocks.STRIPPED_JUNGLE_WOOD_STAIRS);
        strippedjunglewoodPool.slab(DecoBlocks.STRIPPED_JUNGLE_WOOD_SLAB);
        strippedjunglewoodPool.wall(DecoBlocks.STRIPPED_JUNGLE_WOOD_WALL);

        strippedacaciawoodPool.stairs(DecoBlocks.STRIPPED_ACACIA_WOOD_STAIRS);
        strippedacaciawoodPool.slab(DecoBlocks.STRIPPED_ACACIA_WOOD_SLAB);
        strippedacaciawoodPool.wall(DecoBlocks.STRIPPED_ACACIA_WOOD_WALL);

        strippeddarkoakwoodPool.stairs(DecoBlocks.STRIPPED_DARK_OAK_WOOD_STAIRS);
        strippeddarkoakwoodPool.slab(DecoBlocks.STRIPPED_DARK_OAK_WOOD_SLAB);
        strippeddarkoakwoodPool.wall(DecoBlocks.STRIPPED_DARK_OAK_WOOD_WALL);

        strippedmangrovewoodPool.stairs(DecoBlocks.STRIPPED_MANGROVE_WOOD_STAIRS);
        strippedmangrovewoodPool.slab(DecoBlocks.STRIPPED_MANGROVE_WOOD_SLAB);
        strippedmangrovewoodPool.wall(DecoBlocks.STRIPPED_MANGROVE_WOOD_WALL);

        strippedcrimsonhyphaePool.stairs(DecoBlocks.STRIPPED_CRIMSON_HYPHAE_STAIRS);
        strippedcrimsonhyphaePool.slab(DecoBlocks.STRIPPED_CRIMSON_HYPHAE_SLAB);
        strippedcrimsonhyphaePool.wall(DecoBlocks.STRIPPED_CRIMSON_HYPHAE_WALL);

        strippedwarpedhyphaePool.stairs(DecoBlocks.STRIPPED_WARPED_HYPHAE_STAIRS);
        strippedwarpedhyphaePool.slab(DecoBlocks.STRIPPED_WARPED_HYPHAE_SLAB);
        strippedwarpedhyphaePool.wall(DecoBlocks.STRIPPED_WARPED_HYPHAE_WALL);

        woodenwoodPool.stairs(DecoBlocks.WOODEN_WOOD_STAIRS);
        woodenwoodPool.slab(DecoBlocks.WOODEN_WOOD_SLAB);
        woodenwoodPool.wall(DecoBlocks.WOODEN_WOOD_WALL);

        strippedwoodenwoodPool.stairs(DecoBlocks.STRIPPED_WOODEN_WOOD_STAIRS);
        strippedwoodenwoodPool.slab(DecoBlocks.STRIPPED_WOODEN_WOOD_SLAB);
        strippedwoodenwoodPool.wall(DecoBlocks.STRIPPED_WOODEN_WOOD_WALL);

        packednetherrackPool.stairs(DecoBlocks.PACKED_NETHERRACK_STAIRS);
        packednetherrackPool.slab(DecoBlocks.PACKED_NETHERRACK_SLAB);
        packednetherrackPool.wall(DecoBlocks.PACKED_NETHERRACK_WALL);

        netherrackbrickPool.stairs(DecoBlocks.NETHERRACK_BRICK_STAIRS);
        netherrackbrickPool.slab(DecoBlocks.NETHERRACK_BRICK_SLAB);
        netherrackbrickPool.wall(DecoBlocks.NETHERRACK_BRICK_WALL);

        policalcPool.stairs(DecoBlocks.POLISHED_CALCITE_STAIRS);
        policalcPool.slab(DecoBlocks.POLISHED_CALCITE_SLAB);
        policalcPool.wall(DecoBlocks.POLISHED_CALCITE_WALL);

        cutcalcPool.stairs(DecoBlocks.CUT_CALCITE_STAIRS);
        cutcalcPool.slab(DecoBlocks.CUT_CALCITE_SLAB);
        cutcalcPool.wall(DecoBlocks.CUT_CALCITE_WALL);

        calcbrickPool.stairs(DecoBlocks.CALCITE_BRICK_STAIRS);
        calcbrickPool.slab(DecoBlocks.CALCITE_BRICK_SLAB);
        calcbrickPool.wall(DecoBlocks.CALCITE_BRICK_WALL);

        cutandesPool.stairs(DecoBlocks.CUT_ANDESITE_STAIRS);
        cutandesPool.slab(DecoBlocks.CUT_ANDESITE_SLAB);
        cutandesPool.wall(DecoBlocks.CUT_ANDESITE_WALL);

        andesbrickPool.stairs(DecoBlocks.ANDESITE_BRICK_STAIRS);
        andesbrickPool.slab(DecoBlocks.ANDESITE_BRICK_SLAB);
        andesbrickPool.wall(DecoBlocks.ANDESITE_BRICK_WALL);

        cutdiorPool.stairs(DecoBlocks.CUT_DIORITE_STAIRS);
        cutdiorPool.slab(DecoBlocks.CUT_DIORITE_SLAB);
        cutdiorPool.wall(DecoBlocks.CUT_DIORITE_WALL);

        diorbrickPool.stairs(DecoBlocks.DIORITE_BRICK_STAIRS);
        diorbrickPool.slab(DecoBlocks.DIORITE_BRICK_SLAB);
        diorbrickPool.wall(DecoBlocks.DIORITE_BRICK_WALL);

        cutgranPool.stairs(DecoBlocks.CUT_GRANITE_STAIRS);
        cutgranPool.slab(DecoBlocks.CUT_GRANITE_SLAB);
        cutgranPool.wall(DecoBlocks.CUT_GRANITE_WALL);

        granbrickPool.stairs(DecoBlocks.GRANITE_BRICK_STAIRS);
        granbrickPool.slab(DecoBlocks.GRANITE_BRICK_SLAB);
        granbrickPool.wall(DecoBlocks.GRANITE_BRICK_WALL);

        cutgoldPool.stairs(DecoBlocks.CUT_GOLD_STAIRS);
        cutgoldPool.slab(DecoBlocks.CUT_GOLD_SLAB);

        ironPool.stairs(DecoBlocks.IRON_STAIRS);
        ironPool.slab(DecoBlocks.IRON_SLAB);
        rawironPool.stairs(DecoBlocks.RAW_IRON_STAIRS);
        rawironPool.slab(DecoBlocks.RAW_IRON_SLAB);

        goldPool.stairs(DecoBlocks.GOLD_STAIRS);
        goldPool.slab(DecoBlocks.GOLD_SLAB);
        rawgoldPool.stairs(DecoBlocks.RAW_GOLD_STAIRS);
        rawgoldPool.slab(DecoBlocks.RAW_GOLD_SLAB);

        copperPool.stairs(DecoBlocks.COPPER_STAIRS);
        copperPool.slab(DecoBlocks.COPPER_SLAB);
        rawcopperPool.stairs(DecoBlocks.RAW_COPPER_STAIRS);
        rawcopperPool.slab(DecoBlocks.RAW_COPPER_SLAB);
        copperPool.stairs(DecoBlocks.WAXED_COPPER_STAIRS);
        copperPool.slab(DecoBlocks.WAXED_COPPER_SLAB);

        expcopperPool.stairs(DecoBlocks.EXPOSED_COPPER_STAIRS);
        expcopperPool.slab(DecoBlocks.EXPOSED_COPPER_SLAB);
        expcopperPool.stairs(DecoBlocks.WAXED_EXPOSED_COPPER_STAIRS);
        expcopperPool.slab(DecoBlocks.WAXED_EXPOSED_COPPER_SLAB);

        weathcopperPool.stairs(DecoBlocks.WEATHERED_COPPER_STAIRS);
        weathcopperPool.slab(DecoBlocks.WEATHERED_COPPER_SLAB);
        weathcopperPool.stairs(DecoBlocks.WAXED_WEATHERED_COPPER_STAIRS);
        weathcopperPool.slab(DecoBlocks.WAXED_WEATHERED_COPPER_SLAB);

        oxidcopperPool.stairs(DecoBlocks.OXIDIZED_COPPER_STAIRS);
        oxidcopperPool.slab(DecoBlocks.OXIDIZED_COPPER_SLAB);
        oxidcopperPool.stairs(DecoBlocks.WAXED_OXIDIZED_COPPER_STAIRS);
        oxidcopperPool.slab(DecoBlocks.WAXED_OXIDIZED_COPPER_SLAB);

        sandobsidianPool.stairs(DecoBlocks.SANDED_OBSIDIAN_STAIRS);
        sandobsidianPool.slab(DecoBlocks.SANDED_OBSIDIAN_SLAB);
        sandobsidianPool.wall(DecoBlocks.SANDED_OBSIDIAN_WALL);

        smobsidianPool.stairs(DecoBlocks.SMOOTH_OBSIDIAN_STAIRS);
        smobsidianPool.slab(DecoBlocks.SMOOTH_OBSIDIAN_SLAB);
        smobsidianPool.wall(DecoBlocks.SMOOTH_OBSIDIAN_WALL);

        cutobsidianPool.stairs(DecoBlocks.CUT_OBSIDIAN_STAIRS);
        cutobsidianPool.slab(DecoBlocks.CUT_OBSIDIAN_SLAB);
        cutobsidianPool.wall(DecoBlocks.CUT_OBSIDIAN_WALL);

        poliendstonePool.stairs(DecoBlocks.POLISHED_END_STONE_STAIRS);
        poliendstonePool.slab(DecoBlocks.POLISHED_END_STONE_SLAB);
        poliendstonePool.wall(DecoBlocks.POLISHED_END_STONE_WALL);
        poliendstonePool.pressurePlate(DecoBlocks.POLISHED_END_STONE_PRESSURE_PLATE);
        poliendstonePool.button(DecoBlocks.POLISHED_END_STONE_BUTTON);

        smoothendstonePool.stairs(DecoBlocks.SMOOTH_END_STONE_STAIRS);
        smoothendstonePool.wall(DecoBlocks.SMOOTH_END_STONE_WALL);
        endstonetilePool.stairs(DecoBlocks.END_STONE_TILE_STAIRS);
        endstonetilePool.slab(DecoBlocks.END_STONE_TILE_SLAB);
        endstonetilePool.wall(DecoBlocks.END_STONE_TILE_WALL);

        podzolPool.stairs(DecoBlocks.PODZOL_STAIRS);
        podzolPool.slab(DecoBlocks.PODZOL_SLAB);

        myceliumPool.stairs(DecoBlocks.MYCELIUM_STAIRS);
        myceliumPool.slab(DecoBlocks.MYCELIUM_SLAB);

        crimnylPool.stairs(DecoBlocks.CRIMSON_NYLIUM_STAIRS);
        crimnylPool.slab(DecoBlocks.CRIMSON_NYLIUM_SLAB);

        warpnylPool.stairs(DecoBlocks.WARPED_NYLIUM_STAIRS);
        warpnylPool.slab(DecoBlocks.WARPED_NYLIUM_SLAB);

        mossPool.stairs(DecoBlocks.MOSS_STAIRS);
        mossPool.slab(DecoBlocks.MOSS_SLAB);

        dirtPool.stairs(DecoBlocks.DIRT_STAIRS);
        dirtPool.slab(DecoBlocks.DIRT_SLAB);
        dirtPool.wall(DecoBlocks.DIRT_WALL);

        coarsedirtPool.stairs(DecoBlocks.COARSE_DIRT_STAIRS);
        coarsedirtPool.slab(DecoBlocks.COARSE_DIRT_SLAB);
        coarsedirtPool.wall(DecoBlocks.COARSE_DIRT_WALL);

        rooteddirtPool.stairs(DecoBlocks.ROOTED_DIRT_STAIRS);
        rooteddirtPool.slab(DecoBlocks.ROOTED_DIRT_SLAB);
        rooteddirtPool.wall(DecoBlocks.ROOTED_DIRT_WALL);

        mudPool.stairs(DecoBlocks.MUD_STAIRS);
        mudPool.slab(DecoBlocks.MUD_SLAB);
        mudPool.wall(DecoBlocks.MUD_WALL);

        clayPool.stairs(DecoBlocks.CLAY_STAIRS);
        clayPool.slab(DecoBlocks.CLAY_SLAB);
        clayPool.wall(DecoBlocks.CLAY_WALL);

        bonePool.stairs(DecoBlocks.BONE_STAIRS);
        bonePool.slab(DecoBlocks.BONE_SLAB);
        bonePool.wall(DecoBlocks.BONE_WALL);

        bedrockPool.stairs(DecoBlocks.BEDROCK_STAIRS);
        bedrockPool.slab(DecoBlocks.BEDROCK_SLAB);
        bedrockPool.wall(DecoBlocks.BEDROCK_WALL);

        cloudPool.stairs(DecoBlocks.CLOUD_STAIRS);
        cloudPool.slab(DecoBlocks.CLOUD_SLAB);
        cloudPool.wall(DecoBlocks.CLOUD_WALL);

        cloudbrickPool.stairs(DecoBlocks.CLOUD_BRICK_STAIRS);
        cloudbrickPool.slab(DecoBlocks.CLOUD_BRICK_SLAB);
        cloudbrickPool.wall(DecoBlocks.CLOUD_BRICK_WALL);

        crackstonebrickPool.stairs(DecoBlocks.CRACKED_STONE_BRICK_STAIRS);
        crackstonebrickPool.slab(DecoBlocks.CRACKED_STONE_BRICK_SLAB);
        crackstonebrickPool.wall(DecoBlocks.CRACKED_STONE_BRICK_WALL);

        crackstonetilePool.stairs(DecoBlocks.CRACKED_STONE_TILE_STAIRS);
        crackstonetilePool.slab(DecoBlocks.CRACKED_STONE_TILE_SLAB);
        crackstonetilePool.wall(DecoBlocks.CRACKED_STONE_TILE_WALL);

        crackblackstonebrickPool.stairs(DecoBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS);
        crackblackstonebrickPool.slab(DecoBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB);
        crackblackstonebrickPool.wall(DecoBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL);

        crackblackstonetilePool.stairs(DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILE_STAIRS);
        crackblackstonetilePool.slab(DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILE_SLAB);
        crackblackstonetilePool.wall(DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILE_WALL);

        crackdeepbrickPool.stairs(DecoBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS);
        crackdeepbrickPool.slab(DecoBlocks.CRACKED_DEEPSLATE_BRICK_SLAB);
        crackdeepbrickPool.wall(DecoBlocks.CRACKED_DEEPSLATE_BRICK_WALL);

        crackdeeptilePool.stairs(DecoBlocks.CRACKED_DEEPSLATE_TILE_STAIRS);
        crackdeeptilePool.slab(DecoBlocks.CRACKED_DEEPSLATE_TILE_SLAB);
        crackdeeptilePool.wall(DecoBlocks.CRACKED_DEEPSLATE_TILE_WALL);

        crackendstonebrickPool.stairs(DecoBlocks.CRACKED_END_STONE_BRICK_STAIRS);
        crackendstonebrickPool.slab(DecoBlocks.CRACKED_END_STONE_BRICK_SLAB);
        crackendstonebrickPool.wall(DecoBlocks.CRACKED_END_STONE_BRICK_WALL);

        crackendstonetilePool.stairs(DecoBlocks.CRACKED_END_STONE_TILE_STAIRS);
        crackendstonetilePool.slab(DecoBlocks.CRACKED_END_STONE_TILE_SLAB);
        crackendstonetilePool.wall(DecoBlocks.CRACKED_END_STONE_TILE_WALL);

        cracknetherPool.stairs(DecoBlocks.CRACKED_NETHER_BRICK_STAIRS);
        cracknetherPool.slab(DecoBlocks.CRACKED_NETHER_BRICK_SLAB);
        cracknetherPool.wall(DecoBlocks.CRACKED_NETHER_BRICK_WALL);
        cracknetherPool.fence(DecoBlocks.CRACKED_NETHER_BRICK_FENCE);
        cracknetherPool.fenceGate(DecoBlocks.CRACKED_NETHER_BRICK_FENCE_GATE);

        crackrednetherPool.stairs(DecoBlocks.CRACKED_RED_NETHER_BRICK_STAIRS);
        crackrednetherPool.slab(DecoBlocks.CRACKED_RED_NETHER_BRICK_SLAB);
        crackrednetherPool.wall(DecoBlocks.CRACKED_RED_NETHER_BRICK_WALL);
        crackrednetherPool.fence(DecoBlocks.CRACKED_RED_NETHER_BRICK_FENCE);
        crackrednetherPool.fenceGate(DecoBlocks.CRACKED_RED_NETHER_BRICK_FENCE_GATE);

        crackbluenetherPool.stairs(DecoBlocks.CRACKED_BLUE_NETHER_BRICK_STAIRS);
        crackbluenetherPool.slab(DecoBlocks.CRACKED_BLUE_NETHER_BRICK_SLAB);
        crackbluenetherPool.wall(DecoBlocks.CRACKED_BLUE_NETHER_BRICK_WALL);
        crackbluenetherPool.fence(DecoBlocks.CRACKED_BLUE_NETHER_BRICK_FENCE);
        crackbluenetherPool.fenceGate(DecoBlocks.CRACKED_BLUE_NETHER_BRICK_FENCE_GATE);

        mossdeepPool.stairs(DecoBlocks.MOSSY_DEEPSLATE_BRICK_STAIRS);
        mossdeepPool.slab(DecoBlocks.MOSSY_DEEPSLATE_BRICK_SLAB);
        mossdeepPool.wall(DecoBlocks.MOSSY_DEEPSLATE_BRICK_WALL);

        mossblackstonePool.stairs(DecoBlocks.MOSSY_POLISHED_BLACKSTONE_BRICK_STAIRS);
        mossblackstonePool.slab(DecoBlocks.MOSSY_POLISHED_BLACKSTONE_BRICK_SLAB);
        mossblackstonePool.wall(DecoBlocks.MOSSY_POLISHED_BLACKSTONE_BRICK_WALL);

        mossendstonePool.stairs(DecoBlocks.MOSSY_END_STONE_BRICK_STAIRS);
        mossendstonePool.slab(DecoBlocks.MOSSY_END_STONE_BRICK_SLAB);
        mossendstonePool.wall(DecoBlocks.MOSSY_END_STONE_BRICK_WALL);

        lapisPool.stairs(DecoBlocks.LAPIS_STAIRS);
        lapisPool.slab(DecoBlocks.LAPIS_SLAB);
        lapisPool.wall(DecoBlocks.LAPIS_WALL);

        cutlapisPool.stairs(DecoBlocks.CUT_LAPIS_STAIRS);
        cutlapisPool.slab(DecoBlocks.CUT_LAPIS_SLAB);
        cutlapisPool.wall(DecoBlocks.CUT_LAPIS_WALL);

        smlapisPool.stairs(DecoBlocks.SMOOTH_LAPIS_STAIRS);
        smlapisPool.slab(DecoBlocks.SMOOTH_LAPIS_SLAB);
        smlapisPool.wall(DecoBlocks.SMOOTH_LAPIS_WALL);

        lapisbrickPool.stairs(DecoBlocks.LAPIS_BRICK_STAIRS);
        lapisbrickPool.slab(DecoBlocks.LAPIS_BRICK_SLAB);
        lapisbrickPool.wall(DecoBlocks.LAPIS_BRICK_WALL);

        castironPool.stairs(DecoBlocks.CASTED_IRON_STAIRS);
        castironPool.slab(DecoBlocks.CASTED_IRON_SLAB);

        dripbrickPool.stairs(DecoBlocks.DRIPSTONE_BRICK_STAIRS);
        dripbrickPool.slab(DecoBlocks.DRIPSTONE_BRICK_SLAB);
        dripbrickPool.wall(DecoBlocks.DRIPSTONE_BRICK_WALL);

        dripbrickpillarPool.stairs(DecoBlocks.DRIPSTONE_BRICK_PILLAR_STAIRS);
        dripbrickpillarPool.slab(DecoBlocks.DRIPSTONE_BRICK_PILLAR_SLAB);
        dripbrickpillarPool.wall(DecoBlocks.DRIPSTONE_BRICK_PILLAR_WALL);

        voidstonebrickpillarPool.stairs(DecoBlocks.VOID_STONE_BRICK_PILLAR_STAIRS);
        voidstonebrickpillarPool.slab(DecoBlocks.VOID_STONE_BRICK_PILLAR_SLAB);
        voidstonebrickpillarPool.wall(DecoBlocks.VOID_STONE_BRICK_PILLAR_WALL);

        tubecoralPool.stairs(DecoBlocks.TUBE_CORAL_STAIRS);
        tubecoralPool.slab(DecoBlocks.TUBE_CORAL_SLAB);
        tubecoralPool.wall(DecoBlocks.TUBE_CORAL_WALL);
        bubblecoralPool.stairs(DecoBlocks.BUBBLE_CORAL_STAIRS);
        bubblecoralPool.slab(DecoBlocks.BUBBLE_CORAL_SLAB);
        bubblecoralPool.wall(DecoBlocks.BUBBLE_CORAL_WALL);
        braincoralPool.stairs(DecoBlocks.BRAIN_CORAL_STAIRS);
        braincoralPool.slab(DecoBlocks.BRAIN_CORAL_SLAB);
        braincoralPool.wall(DecoBlocks.BRAIN_CORAL_WALL);
        firecoralPool.stairs(DecoBlocks.FIRE_CORAL_STAIRS);
        firecoralPool.slab(DecoBlocks.FIRE_CORAL_SLAB);
        firecoralPool.wall(DecoBlocks.FIRE_CORAL_WALL);
        horncoralPool.stairs(DecoBlocks.HORN_CORAL_STAIRS);
        horncoralPool.slab(DecoBlocks.HORN_CORAL_SLAB);
        horncoralPool.wall(DecoBlocks.HORN_CORAL_WALL);

        tubecoralPool.same(DecoBlocks.HYDRATED_TUBE_CORAL_BLOCK);
        bubblecoralPool.same(DecoBlocks.HYDRATED_BUBBLE_CORAL_BLOCK);
        braincoralPool.same(DecoBlocks.HYDRATED_BRAIN_CORAL_BLOCK);
        firecoralPool.same(DecoBlocks.HYDRATED_FIRE_CORAL_BLOCK);
        horncoralPool.same(DecoBlocks.HYDRATED_HORN_CORAL_BLOCK);

        tubecoralPool.stairs(DecoBlocks.HYDRATED_TUBE_CORAL_STAIRS);
        tubecoralPool.slab(DecoBlocks.HYDRATED_TUBE_CORAL_SLAB);
        tubecoralPool.wall(DecoBlocks.HYDRATED_TUBE_CORAL_WALL);
        bubblecoralPool.stairs(DecoBlocks.HYDRATED_BUBBLE_CORAL_STAIRS);
        bubblecoralPool.slab(DecoBlocks.HYDRATED_BUBBLE_CORAL_SLAB);
        bubblecoralPool.wall(DecoBlocks.HYDRATED_BUBBLE_CORAL_WALL);
        braincoralPool.stairs(DecoBlocks.HYDRATED_BRAIN_CORAL_STAIRS);
        braincoralPool.slab(DecoBlocks.HYDRATED_BRAIN_CORAL_SLAB);
        braincoralPool.wall(DecoBlocks.HYDRATED_BRAIN_CORAL_WALL);
        firecoralPool.stairs(DecoBlocks.HYDRATED_FIRE_CORAL_STAIRS);
        firecoralPool.slab(DecoBlocks.HYDRATED_FIRE_CORAL_SLAB);
        firecoralPool.wall(DecoBlocks.HYDRATED_FIRE_CORAL_WALL);
        horncoralPool.stairs(DecoBlocks.HYDRATED_HORN_CORAL_STAIRS);
        horncoralPool.slab(DecoBlocks.HYDRATED_HORN_CORAL_SLAB);
        horncoralPool.wall(DecoBlocks.HYDRATED_HORN_CORAL_WALL);

        deadtubecoralPool.stairs(DecoBlocks.DEAD_TUBE_CORAL_STAIRS);
        deadtubecoralPool.slab(DecoBlocks.DEAD_TUBE_CORAL_SLAB);
        deadtubecoralPool.wall(DecoBlocks.DEAD_TUBE_CORAL_WALL);
        deadbubblecoralPool.stairs(DecoBlocks.DEAD_BUBBLE_CORAL_STAIRS);
        deadbubblecoralPool.slab(DecoBlocks.DEAD_BUBBLE_CORAL_SLAB);
        deadbubblecoralPool.wall(DecoBlocks.DEAD_BUBBLE_CORAL_WALL);
        deadbraincoralPool.stairs(DecoBlocks.DEAD_BRAIN_CORAL_STAIRS);
        deadbraincoralPool.slab(DecoBlocks.DEAD_BRAIN_CORAL_SLAB);
        deadbraincoralPool.wall(DecoBlocks.DEAD_BRAIN_CORAL_WALL);
        deadfirecoralPool.stairs(DecoBlocks.DEAD_FIRE_CORAL_STAIRS);
        deadfirecoralPool.slab(DecoBlocks.DEAD_FIRE_CORAL_SLAB);
        deadfirecoralPool.wall(DecoBlocks.DEAD_FIRE_CORAL_WALL);
        deadhorncoralPool.stairs(DecoBlocks.DEAD_HORN_CORAL_STAIRS);
        deadhorncoralPool.slab(DecoBlocks.DEAD_HORN_CORAL_SLAB);
        deadhorncoralPool.wall(DecoBlocks.DEAD_HORN_CORAL_WALL);

        hayPool.stairs(DecoBlocks.HAY_STAIRS);
        hayPool.slab(DecoBlocks.HAY_SLAB);

        nethwartPool.stairs(DecoBlocks.NETHER_WART_STAIRS);
        nethwartPool.slab(DecoBlocks.NETHER_WART_SLAB);

        warpwartPool.stairs(DecoBlocks.WARPED_WART_STAIRS);
        warpwartPool.slab(DecoBlocks.WARPED_WART_SLAB);

        sculkPool.stairs(DecoBlocks.SCULK_STAIRS);
        sculkPool.slab(DecoBlocks.SCULK_SLAB);

        honeyPool.stairs(DecoBlocks.HONEYCOMB_STAIRS);
        honeyPool.slab(DecoBlocks.HONEYCOMB_SLAB);
        honeyPool.wall(DecoBlocks.HONEYCOMB_WALL);

        coalPool.stairs(DecoBlocks.COAL_STAIRS);
        coalPool.slab(DecoBlocks.COAL_SLAB);
        coalPool.wall(DecoBlocks.COAL_WALL);

        coalbrickPool.stairs(DecoBlocks.COAL_BRICK_STAIRS);
        coalbrickPool.slab(DecoBlocks.COAL_BRICK_SLAB);
        coalbrickPool.wall(DecoBlocks.COAL_BRICK_WALL);

        charcoalPool.stairs(DecoBlocks.CHARCOAL_STAIRS);
        charcoalPool.slab(DecoBlocks.CHARCOAL_SLAB);
        charcoalPool.wall(DecoBlocks.CHARCOAL_WALL);

        sandPool.stairs(DecoBlocks.SAND_STAIRS);
        sandPool.slab(DecoBlocks.SAND_SLAB);
        redSandPool.stairs(DecoBlocks.RED_SAND_STAIRS);
        redSandPool.slab(DecoBlocks.RED_SAND_SLAB);
        gravelPool.stairs(DecoBlocks.GRAVEL_STAIRS);
        gravelPool.slab(DecoBlocks.GRAVEL_SLAB);

        flintPool.stairs(DecoBlocks.FLINT_STAIRS);
        flintPool.slab(DecoBlocks.FLINT_SLAB);
        flintPool.wall(DecoBlocks.FLINT_WALL);

        cactusplankPool.family(DecoBlocks.CACTUS_FAMILY);
        woodenPool.family(DecoBlocks.WOODEN_FAMILY);
        mushroomPool.family(DecoBlocks.MUSHROOM_FAMILY);

       blockStateModelGenerator.registerCrop(DecoBlocks.WARPED_WART_PLANT, WarpedWartBlock.AGE,0,1,2,3);

        BlockStateModelGenerator.BlockTexturePool terracottaPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.TERRACOTTA_TEMP);
        BlockStateModelGenerator.BlockTexturePool whiteterracottaPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.WHITE_TERRACOTTA_TEMP);
        BlockStateModelGenerator.BlockTexturePool lightgrayterracottaPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.LIGHT_GRAY_TERRACOTTA_TEMP);
        BlockStateModelGenerator.BlockTexturePool grayterracottaPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.GRAY_TERRACOTTA_TEMP);
        BlockStateModelGenerator.BlockTexturePool blackterracottaPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.BLACK_TERRACOTTA_TEMP);
        BlockStateModelGenerator.BlockTexturePool brownterracottaPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.BROWN_TERRACOTTA_TEMP);
        BlockStateModelGenerator.BlockTexturePool redterracottaPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.RED_TERRACOTTA_TEMP);
        BlockStateModelGenerator.BlockTexturePool orangeterracottaPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.ORANGE_TERRACOTTA_TEMP);
        BlockStateModelGenerator.BlockTexturePool yellowterracottaPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.YELLOW_TERRACOTTA_TEMP);
        BlockStateModelGenerator.BlockTexturePool limeterracottaPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.LIME_TERRACOTTA_TEMP);
        BlockStateModelGenerator.BlockTexturePool greenterracottaPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.GREEN_TERRACOTTA_TEMP);
        BlockStateModelGenerator.BlockTexturePool cyanterracottaPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CYAN_TERRACOTTA_TEMP);
        BlockStateModelGenerator.BlockTexturePool lightblueterracottaPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.LIGHT_BLUE_TERRACOTTA_TEMP);
        BlockStateModelGenerator.BlockTexturePool blueterracottaPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.BLUE_TERRACOTTA_TEMP);
        BlockStateModelGenerator.BlockTexturePool purpleterracottaPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.PURPLE_TERRACOTTA_TEMP);
        BlockStateModelGenerator.BlockTexturePool magnetaterracottaPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.MAGENTA_TERRACOTTA_TEMP);
        BlockStateModelGenerator.BlockTexturePool pinkterracottaPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.PINK_TERRACOTTA_TEMP);

        BlockStateModelGenerator.BlockTexturePool whiteconcretePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.WHITE_CONCRETE_TEMP);
        BlockStateModelGenerator.BlockTexturePool lightgrayconcretePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.LIGHT_GRAY_CONCRETE_TEMP);
        BlockStateModelGenerator.BlockTexturePool grayconcretePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.GRAY_CONCRETE_TEMP);
        BlockStateModelGenerator.BlockTexturePool blackconcretePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.BLACK_CONCRETE_TEMP);
        BlockStateModelGenerator.BlockTexturePool brownconcretePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.BROWN_CONCRETE_TEMP);
        BlockStateModelGenerator.BlockTexturePool redconcretePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.RED_CONCRETE_TEMP);
        BlockStateModelGenerator.BlockTexturePool orangeconcretePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.ORANGE_CONCRETE_TEMP);
        BlockStateModelGenerator.BlockTexturePool yellowconcretePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.YELLOW_CONCRETE_TEMP);
        BlockStateModelGenerator.BlockTexturePool limeconcretePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.LIME_CONCRETE_TEMP);
        BlockStateModelGenerator.BlockTexturePool greenconcretePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.GREEN_CONCRETE_TEMP);
        BlockStateModelGenerator.BlockTexturePool cyanconcretePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CYAN_CONCRETE_TEMP);
        BlockStateModelGenerator.BlockTexturePool lightblueconcretePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.LIGHT_BLUE_CONCRETE_TEMP);
        BlockStateModelGenerator.BlockTexturePool blueconcretePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.BLUE_CONCRETE_TEMP);
        BlockStateModelGenerator.BlockTexturePool purpleconcretePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.PURPLE_CONCRETE_TEMP);
        BlockStateModelGenerator.BlockTexturePool magnetaconcretePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.MAGENTA_CONCRETE_TEMP);
        BlockStateModelGenerator.BlockTexturePool pinkconcretePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.PINK_CONCRETE_TEMP);

        BlockStateModelGenerator.BlockTexturePool whitewoolPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.WHITE_WOOL_TEMP);
        BlockStateModelGenerator.BlockTexturePool lightgraywoolPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.LIGHT_GRAY_WOOL_TEMP);
        BlockStateModelGenerator.BlockTexturePool graywoolPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.GRAY_WOOL_TEMP);
        BlockStateModelGenerator.BlockTexturePool blackwoolPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.BLACK_WOOL_TEMP);
        BlockStateModelGenerator.BlockTexturePool brownwoolPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.BROWN_WOOL_TEMP);
        BlockStateModelGenerator.BlockTexturePool redwoolPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.RED_WOOL_TEMP);
        BlockStateModelGenerator.BlockTexturePool orangewoolPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.ORANGE_WOOL_TEMP);
        BlockStateModelGenerator.BlockTexturePool yellowwoolPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.YELLOW_WOOL_TEMP);
        BlockStateModelGenerator.BlockTexturePool limewoolPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.LIME_WOOL_TEMP);
        BlockStateModelGenerator.BlockTexturePool greenwoolPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.GREEN_WOOL_TEMP);
        BlockStateModelGenerator.BlockTexturePool cyanwoolPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CYAN_WOOL_TEMP);
        BlockStateModelGenerator.BlockTexturePool lightbluewoolPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.LIGHT_BLUE_WOOL_TEMP);
        BlockStateModelGenerator.BlockTexturePool bluewoolPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.BLUE_WOOL_TEMP);
        BlockStateModelGenerator.BlockTexturePool purplewoolPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.PURPLE_WOOL_TEMP);
        BlockStateModelGenerator.BlockTexturePool magnetawoolPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.MAGENTA_WOOL_TEMP);
        BlockStateModelGenerator.BlockTexturePool pinkwoolPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.PINK_WOOL_TEMP);

        BlockStateModelGenerator.BlockTexturePool terracottabrickPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.TERRACOTTA_BRICKS);
        BlockStateModelGenerator.BlockTexturePool whiteterracottabrickPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.WHITE_TERRACOTTA_BRICKS);
        BlockStateModelGenerator.BlockTexturePool lightgrayterracottabrickPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS);
        BlockStateModelGenerator.BlockTexturePool grayterracottabrickPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.GRAY_TERRACOTTA_BRICKS);
        BlockStateModelGenerator.BlockTexturePool blackterracottabrickPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.BLACK_TERRACOTTA_BRICKS);
        BlockStateModelGenerator.BlockTexturePool brownterracottabrickPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.BROWN_TERRACOTTA_BRICKS);
        BlockStateModelGenerator.BlockTexturePool redterracottabrickPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.RED_TERRACOTTA_BRICKS);
        BlockStateModelGenerator.BlockTexturePool orangeterracottabrickPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.ORANGE_TERRACOTTA_BRICKS);
        BlockStateModelGenerator.BlockTexturePool yellowterracottabrickPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.YELLOW_TERRACOTTA_BRICKS);
        BlockStateModelGenerator.BlockTexturePool limeterracottabrickPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.LIME_TERRACOTTA_BRICKS);
        BlockStateModelGenerator.BlockTexturePool greenterracottabrickPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.GREEN_TERRACOTTA_BRICKS);
        BlockStateModelGenerator.BlockTexturePool cyanterracottabrickPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CYAN_TERRACOTTA_BRICKS);
        BlockStateModelGenerator.BlockTexturePool lightblueterracottabrickPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS);
        BlockStateModelGenerator.BlockTexturePool blueterracottabrickPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.BLUE_TERRACOTTA_BRICKS);
        BlockStateModelGenerator.BlockTexturePool purpleterracottabrickPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.PURPLE_TERRACOTTA_BRICKS);
        BlockStateModelGenerator.BlockTexturePool magnetaterracottabrickPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.MAGENTA_TERRACOTTA_BRICKS);
        BlockStateModelGenerator.BlockTexturePool pinkterracottabrickPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.PINK_TERRACOTTA_BRICKS);

        BlockStateModelGenerator.BlockTexturePool cutwhiteconcretePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CUT_WHITE_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool cutlightgrayconcretePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CUT_LIGHT_GRAY_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool cutgrayconcretePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CUT_GRAY_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool cutblackconcretePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CUT_BLACK_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool cutbrownconcretePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CUT_BROWN_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool cutredconcretePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CUT_RED_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool cutorangeconcretePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CUT_ORANGE_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool cutyellowconcretePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CUT_YELLOW_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool cutlimeconcretePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CUT_LIME_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool cutgreenconcretePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CUT_GREEN_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool cutcyanconcretePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CUT_CYAN_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool cutlightblueconcretePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CUT_LIGHT_BLUE_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool cutblueconcretePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CUT_BLUE_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool cutpurpleconcretePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CUT_PURPLE_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool cutmagnetaconcretePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CUT_MAGENTA_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool cutpinkconcretePool =
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

        BlockStateModelGenerator.BlockTexturePool ducutlightgrayconcretePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.DUEL_CUT_LIGHT_GRAY_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool ducutgrayconcretePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.DUEL_CUT_GRAY_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool ducutblackconcretePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.DUEL_CUT_BLACK_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool ducutbrownconcretePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.DUEL_CUT_BROWN_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool ducutredconcretePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.DUEL_CUT_RED_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool ducutorangeconcretePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.DUEL_CUT_ORANGE_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool ducutyellowconcretePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.DUEL_CUT_YELLOW_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool ducutlimeconcretePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.DUEL_CUT_LIME_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool ducutgreenconcretePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.DUEL_CUT_GREEN_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool ducutcyanconcretePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.DUEL_CUT_CYAN_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool ducutlightblueconcretePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.DUEL_CUT_LIGHT_BLUE_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool ducutblueconcretePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.DUEL_CUT_BLUE_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool ducutpurpleconcretePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.DUEL_CUT_PURPLE_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool ducutmagnetaconcretePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.DUEL_CUT_MAGENTA_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool ducutpinkconcretePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.DUEL_CUT_PINK_CONCRETE);

        BlockStateModelGenerator.BlockTexturePool checklightgrayconcretePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CHECKERED_LIGHT_GRAY_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool checkgrayconcretePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CHECKERED_GRAY_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool checkblackconcretePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CHECKERED_BLACK_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool checkbrownconcretePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CHECKERED_BROWN_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool checkredconcretePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CHECKERED_RED_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool checkorangeconcretePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CHECKERED_ORANGE_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool checkyellowconcretePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CHECKERED_YELLOW_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool checklimeconcretePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CHECKERED_LIME_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool checkgreenconcretePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CHECKERED_GREEN_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool checkcyanconcretePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CHECKERED_CYAN_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool checklightblueconcretePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CHECKERED_LIGHT_BLUE_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool checkblueconcretePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CHECKERED_BLUE_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool checkpurpleconcretePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CHECKERED_PURPLE_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool checkmagnetaconcretePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CHECKERED_MAGENTA_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool checkpinkconcretePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CHECKERED_PINK_CONCRETE);

        blockStateModelGenerator.registerGlassPane(DecoBlocks.GLOWING_GLASS, DecoBlocks.GLOWING_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(DecoBlocks.HARDENED_GLOWING_GLASS, DecoBlocks.HARDENED_GLOWING_GLASS_PANE);

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

        terracottaPool.stairs(DecoBlocks.TERRACOTTA_STAIRS);
        terracottaPool.slab(DecoBlocks.TERRACOTTA_SLAB);
        terracottaPool.wall(DecoBlocks.TERRACOTTA_WALL);
        whiteterracottaPool.stairs(DecoBlocks.WHITE_TERRACOTTA_STAIRS);
        whiteterracottaPool.slab(DecoBlocks.WHITE_TERRACOTTA_SLAB);
        whiteterracottaPool.wall(DecoBlocks.WHITE_TERRACOTTA_WALL);
        lightgrayterracottaPool.stairs(DecoBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS);
        lightgrayterracottaPool.slab(DecoBlocks.LIGHT_GRAY_TERRACOTTA_SLAB);
        lightgrayterracottaPool.wall(DecoBlocks.LIGHT_GRAY_TERRACOTTA_WALL);
        grayterracottaPool.stairs(DecoBlocks.GRAY_TERRACOTTA_STAIRS);
        grayterracottaPool.slab(DecoBlocks.GRAY_TERRACOTTA_SLAB);
        grayterracottaPool.wall(DecoBlocks.GRAY_TERRACOTTA_WALL);
        blackterracottaPool.stairs(DecoBlocks.BLACK_TERRACOTTA_STAIRS);
        blackterracottaPool.slab(DecoBlocks.BLACK_TERRACOTTA_SLAB);
        blackterracottaPool.wall(DecoBlocks.BLACK_TERRACOTTA_WALL);
        brownterracottaPool.stairs(DecoBlocks.BROWN_TERRACOTTA_STAIRS);
        brownterracottaPool.slab(DecoBlocks.BROWN_TERRACOTTA_SLAB);
        brownterracottaPool.wall(DecoBlocks.BROWN_TERRACOTTA_WALL);
        redterracottaPool.stairs(DecoBlocks.RED_TERRACOTTA_STAIRS);
        redterracottaPool.slab(DecoBlocks.RED_TERRACOTTA_SLAB);
        redterracottaPool.wall(DecoBlocks.RED_TERRACOTTA_WALL);
        orangeterracottaPool.stairs(DecoBlocks.ORANGE_TERRACOTTA_STAIRS);
        orangeterracottaPool.slab(DecoBlocks.ORANGE_TERRACOTTA_SLAB);
        orangeterracottaPool.wall(DecoBlocks.ORANGE_TERRACOTTA_WALL);
        yellowterracottaPool.stairs(DecoBlocks.YELLOW_TERRACOTTA_STAIRS);
        yellowterracottaPool.slab(DecoBlocks.YELLOW_TERRACOTTA_SLAB);
        yellowterracottaPool.wall(DecoBlocks.YELLOW_TERRACOTTA_WALL);
        limeterracottaPool.stairs(DecoBlocks.LIME_TERRACOTTA_STAIRS);
        limeterracottaPool.slab(DecoBlocks.LIME_TERRACOTTA_SLAB);
        limeterracottaPool.wall(DecoBlocks.LIME_TERRACOTTA_WALL);
        greenterracottaPool.stairs(DecoBlocks.GREEN_TERRACOTTA_STAIRS);
        greenterracottaPool.slab(DecoBlocks.GREEN_TERRACOTTA_SLAB);
        greenterracottaPool.wall(DecoBlocks.GREEN_TERRACOTTA_WALL);
        cyanterracottaPool.stairs(DecoBlocks.CYAN_TERRACOTTA_STAIRS);
        cyanterracottaPool.slab(DecoBlocks.CYAN_TERRACOTTA_SLAB);
        cyanterracottaPool.wall(DecoBlocks.CYAN_TERRACOTTA_WALL);
        lightblueterracottaPool.stairs(DecoBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS);
        lightblueterracottaPool.slab(DecoBlocks.LIGHT_BLUE_TERRACOTTA_SLAB);
        lightblueterracottaPool.wall(DecoBlocks.LIGHT_BLUE_TERRACOTTA_WALL);
        blueterracottaPool.stairs(DecoBlocks.BLUE_TERRACOTTA_STAIRS);
        blueterracottaPool.slab(DecoBlocks.BLUE_TERRACOTTA_SLAB);
        blueterracottaPool.wall(DecoBlocks.BLUE_TERRACOTTA_WALL);
        purpleterracottaPool.stairs(DecoBlocks.PURPLE_TERRACOTTA_STAIRS);
        purpleterracottaPool.slab(DecoBlocks.PURPLE_TERRACOTTA_SLAB);
        purpleterracottaPool.wall(DecoBlocks.PURPLE_TERRACOTTA_WALL);
        magnetaterracottaPool.stairs(DecoBlocks.MAGENTA_TERRACOTTA_STAIRS);
        magnetaterracottaPool.slab(DecoBlocks.MAGENTA_TERRACOTTA_SLAB);
        magnetaterracottaPool.wall(DecoBlocks.MAGENTA_TERRACOTTA_WALL);
        pinkterracottaPool.stairs(DecoBlocks.PINK_TERRACOTTA_STAIRS);
        pinkterracottaPool.slab(DecoBlocks.PINK_TERRACOTTA_SLAB);
        pinkterracottaPool.wall(DecoBlocks.PINK_TERRACOTTA_WALL);

        whiteconcretePool.stairs(DecoBlocks.WHITE_CONCRETE_STAIRS);
        whiteconcretePool.slab(DecoBlocks.WHITE_CONCRETE_SLAB);
        whiteconcretePool.wall(DecoBlocks.WHITE_CONCRETE_WALL);
        lightgrayconcretePool.stairs(DecoBlocks.LIGHT_GRAY_CONCRETE_STAIRS);
        lightgrayconcretePool.slab(DecoBlocks.LIGHT_GRAY_CONCRETE_SLAB);
        lightgrayconcretePool.wall(DecoBlocks.LIGHT_GRAY_CONCRETE_WALL);
        grayconcretePool.stairs(DecoBlocks.GRAY_CONCRETE_STAIRS);
        grayconcretePool.slab(DecoBlocks.GRAY_CONCRETE_SLAB);
        grayconcretePool.wall(DecoBlocks.GRAY_CONCRETE_WALL);
        blackconcretePool.stairs(DecoBlocks.BLACK_CONCRETE_STAIRS);
        blackconcretePool.slab(DecoBlocks.BLACK_CONCRETE_SLAB);
        blackconcretePool.wall(DecoBlocks.BLACK_CONCRETE_WALL);
        brownconcretePool.stairs(DecoBlocks.BROWN_CONCRETE_STAIRS);
        brownconcretePool.slab(DecoBlocks.BROWN_CONCRETE_SLAB);
        brownconcretePool.wall(DecoBlocks.BROWN_CONCRETE_WALL);
        redconcretePool.stairs(DecoBlocks.RED_CONCRETE_STAIRS);
        redconcretePool.slab(DecoBlocks.RED_CONCRETE_SLAB);
        redconcretePool.wall(DecoBlocks.RED_CONCRETE_WALL);
        orangeconcretePool.stairs(DecoBlocks.ORANGE_CONCRETE_STAIRS);
        orangeconcretePool.slab(DecoBlocks.ORANGE_CONCRETE_SLAB);
        orangeconcretePool.wall(DecoBlocks.ORANGE_CONCRETE_WALL);
        yellowconcretePool.stairs(DecoBlocks.YELLOW_CONCRETE_STAIRS);
        yellowconcretePool.slab(DecoBlocks.YELLOW_CONCRETE_SLAB);
        yellowconcretePool.wall(DecoBlocks.YELLOW_CONCRETE_WALL);
        limeconcretePool.stairs(DecoBlocks.LIME_CONCRETE_STAIRS);
        limeconcretePool.slab(DecoBlocks.LIME_CONCRETE_SLAB);
        limeconcretePool.wall(DecoBlocks.LIME_CONCRETE_WALL);
        greenconcretePool.stairs(DecoBlocks.GREEN_CONCRETE_STAIRS);
        greenconcretePool.slab(DecoBlocks.GREEN_CONCRETE_SLAB);
        greenconcretePool.wall(DecoBlocks.GREEN_CONCRETE_WALL);
        cyanconcretePool.stairs(DecoBlocks.CYAN_CONCRETE_STAIRS);
        cyanconcretePool.slab(DecoBlocks.CYAN_CONCRETE_SLAB);
        cyanconcretePool.wall(DecoBlocks.CYAN_CONCRETE_WALL);
        lightblueconcretePool.stairs(DecoBlocks.LIGHT_BLUE_CONCRETE_STAIRS);
        lightblueconcretePool.slab(DecoBlocks.LIGHT_BLUE_CONCRETE_SLAB);
        lightblueconcretePool.wall(DecoBlocks.LIGHT_BLUE_CONCRETE_WALL);
        blueconcretePool.stairs(DecoBlocks.BLUE_CONCRETE_STAIRS);
        blueconcretePool.slab(DecoBlocks.BLUE_CONCRETE_SLAB);
        blueconcretePool.wall(DecoBlocks.BLUE_CONCRETE_WALL);
        purpleconcretePool.stairs(DecoBlocks.PURPLE_CONCRETE_STAIRS);
        purpleconcretePool.slab(DecoBlocks.PURPLE_CONCRETE_SLAB);
        purpleconcretePool.wall(DecoBlocks.PURPLE_CONCRETE_WALL);
        magnetaconcretePool.stairs(DecoBlocks.MAGENTA_CONCRETE_STAIRS);
        magnetaconcretePool.slab(DecoBlocks.MAGENTA_CONCRETE_SLAB);
        magnetaconcretePool.wall(DecoBlocks.MAGENTA_CONCRETE_WALL);
        pinkconcretePool.stairs(DecoBlocks.PINK_CONCRETE_STAIRS);
        pinkconcretePool.slab(DecoBlocks.PINK_CONCRETE_SLAB);
        pinkconcretePool.wall(DecoBlocks.PINK_CONCRETE_WALL);

        whitewoolPool.stairs(DecoBlocks.WHITE_WOOL_STAIRS);
        whitewoolPool.slab(DecoBlocks.WHITE_WOOL_SLAB);
        lightgraywoolPool.stairs(DecoBlocks.LIGHT_GRAY_WOOL_STAIRS);
        lightgraywoolPool.slab(DecoBlocks.LIGHT_GRAY_WOOL_SLAB);
        graywoolPool.stairs(DecoBlocks.GRAY_WOOL_STAIRS);
        graywoolPool.slab(DecoBlocks.GRAY_WOOL_SLAB);
        blackwoolPool.stairs(DecoBlocks.BLACK_WOOL_STAIRS);
        blackwoolPool.slab(DecoBlocks.BLACK_WOOL_SLAB);
        brownwoolPool.stairs(DecoBlocks.BROWN_WOOL_STAIRS);
        brownwoolPool.slab(DecoBlocks.BROWN_WOOL_SLAB);
        redwoolPool.stairs(DecoBlocks.RED_WOOL_STAIRS);
        redwoolPool.slab(DecoBlocks.RED_WOOL_SLAB);
        orangewoolPool.stairs(DecoBlocks.ORANGE_WOOL_STAIRS);
        orangewoolPool.slab(DecoBlocks.ORANGE_WOOL_SLAB);
        yellowwoolPool.stairs(DecoBlocks.YELLOW_WOOL_STAIRS);
        yellowwoolPool.slab(DecoBlocks.YELLOW_WOOL_SLAB);
        limewoolPool.stairs(DecoBlocks.LIME_WOOL_STAIRS);
        limewoolPool.slab(DecoBlocks.LIME_WOOL_SLAB);
        greenwoolPool.stairs(DecoBlocks.GREEN_WOOL_STAIRS);
        greenwoolPool.slab(DecoBlocks.GREEN_WOOL_SLAB);
        cyanwoolPool.stairs(DecoBlocks.CYAN_WOOL_STAIRS);
        cyanwoolPool.slab(DecoBlocks.CYAN_WOOL_SLAB);
        lightbluewoolPool.stairs(DecoBlocks.LIGHT_BLUE_WOOL_STAIRS);
        lightbluewoolPool.slab(DecoBlocks.LIGHT_BLUE_WOOL_SLAB);
        bluewoolPool.stairs(DecoBlocks.BLUE_WOOL_STAIRS);
        bluewoolPool.slab(DecoBlocks.BLUE_WOOL_SLAB);
        purplewoolPool.stairs(DecoBlocks.PURPLE_WOOL_STAIRS);
        purplewoolPool.slab(DecoBlocks.PURPLE_WOOL_SLAB);
        magnetawoolPool.stairs(DecoBlocks.MAGENTA_WOOL_STAIRS);
        magnetawoolPool.slab(DecoBlocks.MAGENTA_WOOL_SLAB);
        pinkwoolPool.stairs(DecoBlocks.PINK_WOOL_STAIRS);
        pinkwoolPool.slab(DecoBlocks.PINK_WOOL_SLAB);

        terracottabrickPool.stairs(DecoBlocks.TERRACOTTA_BRICK_STAIRS);
        terracottabrickPool.slab(DecoBlocks.TERRACOTTA_BRICK_SLAB);
        terracottabrickPool.wall(DecoBlocks.TERRACOTTA_BRICK_WALL);
        whiteterracottabrickPool.stairs(DecoBlocks.WHITE_TERRACOTTA_BRICK_STAIRS);
        whiteterracottabrickPool.slab(DecoBlocks.WHITE_TERRACOTTA_BRICK_SLAB);
        whiteterracottabrickPool.wall(DecoBlocks.WHITE_TERRACOTTA_BRICK_WALL);
        lightgrayterracottabrickPool.stairs(DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS);
        lightgrayterracottabrickPool.slab(DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_SLAB);
        lightgrayterracottabrickPool.wall(DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_WALL);
        grayterracottabrickPool.stairs(DecoBlocks.GRAY_TERRACOTTA_BRICK_STAIRS);
        grayterracottabrickPool.slab(DecoBlocks.GRAY_TERRACOTTA_BRICK_SLAB);
        grayterracottabrickPool.wall(DecoBlocks.GRAY_TERRACOTTA_BRICK_WALL);
        blackterracottabrickPool.stairs(DecoBlocks.BLACK_TERRACOTTA_BRICK_STAIRS);
        blackterracottabrickPool.slab(DecoBlocks.BLACK_TERRACOTTA_BRICK_SLAB);
        blackterracottabrickPool.wall(DecoBlocks.BLACK_TERRACOTTA_BRICK_WALL);
        brownterracottabrickPool.stairs(DecoBlocks.BROWN_TERRACOTTA_BRICK_STAIRS);
        brownterracottabrickPool.slab(DecoBlocks.BROWN_TERRACOTTA_BRICK_SLAB);
        brownterracottabrickPool.wall(DecoBlocks.BROWN_TERRACOTTA_BRICK_WALL);
        redterracottabrickPool.stairs(DecoBlocks.RED_TERRACOTTA_BRICK_STAIRS);
        redterracottabrickPool.slab(DecoBlocks.RED_TERRACOTTA_BRICK_SLAB);
        redterracottabrickPool.wall(DecoBlocks.RED_TERRACOTTA_BRICK_WALL);
        orangeterracottabrickPool.stairs(DecoBlocks.ORANGE_TERRACOTTA_BRICK_STAIRS);
        orangeterracottabrickPool.slab(DecoBlocks.ORANGE_TERRACOTTA_BRICK_SLAB);
        orangeterracottabrickPool.wall(DecoBlocks.ORANGE_TERRACOTTA_BRICK_WALL);
        yellowterracottabrickPool.stairs(DecoBlocks.YELLOW_TERRACOTTA_BRICK_STAIRS);
        yellowterracottabrickPool.slab(DecoBlocks.YELLOW_TERRACOTTA_BRICK_SLAB);
        yellowterracottabrickPool.wall(DecoBlocks.YELLOW_TERRACOTTA_BRICK_WALL);
        limeterracottabrickPool.stairs(DecoBlocks.LIME_TERRACOTTA_BRICK_STAIRS);
        limeterracottabrickPool.slab(DecoBlocks.LIME_TERRACOTTA_BRICK_SLAB);
        limeterracottabrickPool.wall(DecoBlocks.LIME_TERRACOTTA_BRICK_WALL);
        greenterracottabrickPool.stairs(DecoBlocks.GREEN_TERRACOTTA_BRICK_STAIRS);
        greenterracottabrickPool.slab(DecoBlocks.GREEN_TERRACOTTA_BRICK_SLAB);
        greenterracottabrickPool.wall(DecoBlocks.GREEN_TERRACOTTA_BRICK_WALL);
        cyanterracottabrickPool.stairs(DecoBlocks.CYAN_TERRACOTTA_BRICK_STAIRS);
        cyanterracottabrickPool.slab(DecoBlocks.CYAN_TERRACOTTA_BRICK_SLAB);
        cyanterracottabrickPool.wall(DecoBlocks.CYAN_TERRACOTTA_BRICK_WALL);
        lightblueterracottabrickPool.stairs(DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS);
        lightblueterracottabrickPool.slab(DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_SLAB);
        lightblueterracottabrickPool.wall(DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_WALL);
        blueterracottabrickPool.stairs(DecoBlocks.BLUE_TERRACOTTA_BRICK_STAIRS);
        blueterracottabrickPool.slab(DecoBlocks.BLUE_TERRACOTTA_BRICK_SLAB);
        blueterracottabrickPool.wall(DecoBlocks.BLUE_TERRACOTTA_BRICK_WALL);
        purpleterracottabrickPool.stairs(DecoBlocks.PURPLE_TERRACOTTA_BRICK_STAIRS);
        purpleterracottabrickPool.slab(DecoBlocks.PURPLE_TERRACOTTA_BRICK_SLAB);
        purpleterracottabrickPool.wall(DecoBlocks.PURPLE_TERRACOTTA_BRICK_WALL);
        magnetaterracottabrickPool.stairs(DecoBlocks.MAGENTA_TERRACOTTA_BRICK_STAIRS);
        magnetaterracottabrickPool.slab(DecoBlocks.MAGENTA_TERRACOTTA_BRICK_SLAB);
        magnetaterracottabrickPool.wall(DecoBlocks.MAGENTA_TERRACOTTA_BRICK_WALL);
        pinkterracottabrickPool.stairs(DecoBlocks.PINK_TERRACOTTA_BRICK_STAIRS);
        pinkterracottabrickPool.slab(DecoBlocks.PINK_TERRACOTTA_BRICK_SLAB);
        pinkterracottabrickPool.wall(DecoBlocks.PINK_TERRACOTTA_BRICK_WALL);

        cutwhiteconcretePool.stairs(DecoBlocks.CUT_WHITE_CONCRETE_STAIRS);
        cutwhiteconcretePool.slab(DecoBlocks.CUT_WHITE_CONCRETE_SLAB);
        cutwhiteconcretePool.wall(DecoBlocks.CUT_WHITE_CONCRETE_WALL);
        cutlightgrayconcretePool.stairs(DecoBlocks.CUT_LIGHT_GRAY_CONCRETE_STAIRS);
        cutlightgrayconcretePool.slab(DecoBlocks.CUT_LIGHT_GRAY_CONCRETE_SLAB);
        cutlightgrayconcretePool.wall(DecoBlocks.CUT_LIGHT_GRAY_CONCRETE_WALL);
        cutgrayconcretePool.stairs(DecoBlocks.CUT_GRAY_CONCRETE_STAIRS);
        cutgrayconcretePool.slab(DecoBlocks.CUT_GRAY_CONCRETE_SLAB);
        cutgrayconcretePool.wall(DecoBlocks.CUT_GRAY_CONCRETE_WALL);
        cutblackconcretePool.stairs(DecoBlocks.CUT_BLACK_CONCRETE_STAIRS);
        cutblackconcretePool.slab(DecoBlocks.CUT_BLACK_CONCRETE_SLAB);
        cutblackconcretePool.wall(DecoBlocks.CUT_BLACK_CONCRETE_WALL);
        cutbrownconcretePool.stairs(DecoBlocks.CUT_BROWN_CONCRETE_STAIRS);
        cutbrownconcretePool.slab(DecoBlocks.CUT_BROWN_CONCRETE_SLAB);
        cutbrownconcretePool.wall(DecoBlocks.CUT_BROWN_CONCRETE_WALL);
        cutredconcretePool.stairs(DecoBlocks.CUT_RED_CONCRETE_STAIRS);
        cutredconcretePool.slab(DecoBlocks.CUT_RED_CONCRETE_SLAB);
        cutredconcretePool.wall(DecoBlocks.CUT_RED_CONCRETE_WALL);
        cutorangeconcretePool.stairs(DecoBlocks.CUT_ORANGE_CONCRETE_STAIRS);
        cutorangeconcretePool.slab(DecoBlocks.CUT_ORANGE_CONCRETE_SLAB);
        cutorangeconcretePool.wall(DecoBlocks.CUT_ORANGE_CONCRETE_WALL);
        cutyellowconcretePool.stairs(DecoBlocks.CUT_YELLOW_CONCRETE_STAIRS);
        cutyellowconcretePool.slab(DecoBlocks.CUT_YELLOW_CONCRETE_SLAB);
        cutyellowconcretePool.wall(DecoBlocks.CUT_YELLOW_CONCRETE_WALL);
        cutlimeconcretePool.stairs(DecoBlocks.CUT_LIME_CONCRETE_STAIRS);
        cutlimeconcretePool.slab(DecoBlocks.CUT_LIME_CONCRETE_SLAB);
        cutlimeconcretePool.wall(DecoBlocks.CUT_LIME_CONCRETE_WALL);
        cutgreenconcretePool.stairs(DecoBlocks.CUT_GREEN_CONCRETE_STAIRS);
        cutgreenconcretePool.slab(DecoBlocks.CUT_GREEN_CONCRETE_SLAB);
        cutgreenconcretePool.wall(DecoBlocks.CUT_GREEN_CONCRETE_WALL);
        cutcyanconcretePool.stairs(DecoBlocks.CUT_CYAN_CONCRETE_STAIRS);
        cutcyanconcretePool.slab(DecoBlocks.CUT_CYAN_CONCRETE_SLAB);
        cutcyanconcretePool.wall(DecoBlocks.CUT_CYAN_CONCRETE_WALL);
        cutlightblueconcretePool.stairs(DecoBlocks.CUT_LIGHT_BLUE_CONCRETE_STAIRS);
        cutlightblueconcretePool.slab(DecoBlocks.CUT_LIGHT_BLUE_CONCRETE_SLAB);
        cutlightblueconcretePool.wall(DecoBlocks.CUT_LIGHT_BLUE_CONCRETE_WALL);
        cutblueconcretePool.stairs(DecoBlocks.CUT_BLUE_CONCRETE_STAIRS);
        cutblueconcretePool.slab(DecoBlocks.CUT_BLUE_CONCRETE_SLAB);
        cutblueconcretePool.wall(DecoBlocks.CUT_BLUE_CONCRETE_WALL);
        cutpurpleconcretePool.stairs(DecoBlocks.CUT_PURPLE_CONCRETE_STAIRS);
        cutpurpleconcretePool.slab(DecoBlocks.CUT_PURPLE_CONCRETE_SLAB);
        cutpurpleconcretePool.wall(DecoBlocks.CUT_PURPLE_CONCRETE_WALL);
        cutmagnetaconcretePool.stairs(DecoBlocks.CUT_MAGENTA_CONCRETE_STAIRS);
        cutmagnetaconcretePool.slab(DecoBlocks.CUT_MAGENTA_CONCRETE_SLAB);
        cutmagnetaconcretePool.wall(DecoBlocks.CUT_MAGENTA_CONCRETE_WALL);
        cutpinkconcretePool.stairs(DecoBlocks.CUT_PINK_CONCRETE_STAIRS);
        cutpinkconcretePool.slab(DecoBlocks.CUT_PINK_CONCRETE_SLAB);
        cutpinkconcretePool.wall(DecoBlocks.CUT_PINK_CONCRETE_WALL);

        ducutlightgrayconcretePool.stairs(DecoBlocks.DUEL_CUT_LIGHT_GRAY_CONCRETE_STAIRS);
        ducutlightgrayconcretePool.slab(DecoBlocks.DUEL_CUT_LIGHT_GRAY_CONCRETE_SLAB);
        ducutlightgrayconcretePool.wall(DecoBlocks.DUEL_CUT_LIGHT_GRAY_CONCRETE_WALL);
        ducutgrayconcretePool.stairs(DecoBlocks.DUEL_CUT_GRAY_CONCRETE_STAIRS);
        ducutgrayconcretePool.slab(DecoBlocks.DUEL_CUT_GRAY_CONCRETE_SLAB);
        ducutgrayconcretePool.wall(DecoBlocks.DUEL_CUT_GRAY_CONCRETE_WALL);
        ducutblackconcretePool.stairs(DecoBlocks.DUEL_CUT_BLACK_CONCRETE_STAIRS);
        ducutblackconcretePool.slab(DecoBlocks.DUEL_CUT_BLACK_CONCRETE_SLAB);
        ducutblackconcretePool.wall(DecoBlocks.DUEL_CUT_BLACK_CONCRETE_WALL);
        ducutbrownconcretePool.stairs(DecoBlocks.DUEL_CUT_BROWN_CONCRETE_STAIRS);
        ducutbrownconcretePool.slab(DecoBlocks.DUEL_CUT_BROWN_CONCRETE_SLAB);
        ducutbrownconcretePool.wall(DecoBlocks.DUEL_CUT_BROWN_CONCRETE_WALL);
        ducutredconcretePool.stairs(DecoBlocks.DUEL_CUT_RED_CONCRETE_STAIRS);
        ducutredconcretePool.slab(DecoBlocks.DUEL_CUT_RED_CONCRETE_SLAB);
        ducutredconcretePool.wall(DecoBlocks.DUEL_CUT_RED_CONCRETE_WALL);
        ducutorangeconcretePool.stairs(DecoBlocks.DUEL_CUT_ORANGE_CONCRETE_STAIRS);
        ducutorangeconcretePool.slab(DecoBlocks.DUEL_CUT_ORANGE_CONCRETE_SLAB);
        ducutorangeconcretePool.wall(DecoBlocks.DUEL_CUT_ORANGE_CONCRETE_WALL);
        ducutyellowconcretePool.stairs(DecoBlocks.DUEL_CUT_YELLOW_CONCRETE_STAIRS);
        ducutyellowconcretePool.slab(DecoBlocks.DUEL_CUT_YELLOW_CONCRETE_SLAB);
        ducutyellowconcretePool.wall(DecoBlocks.DUEL_CUT_YELLOW_CONCRETE_WALL);
        ducutlimeconcretePool.stairs(DecoBlocks.DUEL_CUT_LIME_CONCRETE_STAIRS);
        ducutlimeconcretePool.slab(DecoBlocks.DUEL_CUT_LIME_CONCRETE_SLAB);
        ducutlimeconcretePool.wall(DecoBlocks.DUEL_CUT_LIME_CONCRETE_WALL);
        ducutgreenconcretePool.stairs(DecoBlocks.DUEL_CUT_GREEN_CONCRETE_STAIRS);
        ducutgreenconcretePool.slab(DecoBlocks.DUEL_CUT_GREEN_CONCRETE_SLAB);
        ducutgreenconcretePool.wall(DecoBlocks.DUEL_CUT_GREEN_CONCRETE_WALL);
        ducutcyanconcretePool.stairs(DecoBlocks.DUEL_CUT_CYAN_CONCRETE_STAIRS);
        ducutcyanconcretePool.slab(DecoBlocks.DUEL_CUT_CYAN_CONCRETE_SLAB);
        ducutcyanconcretePool.wall(DecoBlocks.DUEL_CUT_CYAN_CONCRETE_WALL);
        ducutlightblueconcretePool.stairs(DecoBlocks.DUEL_CUT_LIGHT_BLUE_CONCRETE_STAIRS);
        ducutlightblueconcretePool.slab(DecoBlocks.DUEL_CUT_LIGHT_BLUE_CONCRETE_SLAB);
        ducutlightblueconcretePool.wall(DecoBlocks.DUEL_CUT_LIGHT_BLUE_CONCRETE_WALL);
        ducutblueconcretePool.stairs(DecoBlocks.DUEL_CUT_BLUE_CONCRETE_STAIRS);
        ducutblueconcretePool.slab(DecoBlocks.DUEL_CUT_BLUE_CONCRETE_SLAB);
        ducutblueconcretePool.wall(DecoBlocks.DUEL_CUT_BLUE_CONCRETE_WALL);
        ducutpurpleconcretePool.stairs(DecoBlocks.DUEL_CUT_PURPLE_CONCRETE_STAIRS);
        ducutpurpleconcretePool.slab(DecoBlocks.DUEL_CUT_PURPLE_CONCRETE_SLAB);
        ducutpurpleconcretePool.wall(DecoBlocks.DUEL_CUT_PURPLE_CONCRETE_WALL);
        ducutmagnetaconcretePool.stairs(DecoBlocks.DUEL_CUT_MAGENTA_CONCRETE_STAIRS);
        ducutmagnetaconcretePool.slab(DecoBlocks.DUEL_CUT_MAGENTA_CONCRETE_SLAB);
        ducutmagnetaconcretePool.wall(DecoBlocks.DUEL_CUT_MAGENTA_CONCRETE_WALL);
        ducutpinkconcretePool.stairs(DecoBlocks.DUEL_CUT_PINK_CONCRETE_STAIRS);
        ducutpinkconcretePool.slab(DecoBlocks.DUEL_CUT_PINK_CONCRETE_SLAB);
        ducutpinkconcretePool.wall(DecoBlocks.DUEL_CUT_PINK_CONCRETE_WALL);

        checklightgrayconcretePool.stairs(DecoBlocks.CHECKERED_LIGHT_GRAY_CONCRETE_STAIRS);
        checklightgrayconcretePool.slab(DecoBlocks.CHECKERED_LIGHT_GRAY_CONCRETE_SLAB);
        checklightgrayconcretePool.wall(DecoBlocks.CHECKERED_LIGHT_GRAY_CONCRETE_WALL);
        checkgrayconcretePool.stairs(DecoBlocks.CHECKERED_GRAY_CONCRETE_STAIRS);
        checkgrayconcretePool.slab(DecoBlocks.CHECKERED_GRAY_CONCRETE_SLAB);
        checkgrayconcretePool.wall(DecoBlocks.CHECKERED_GRAY_CONCRETE_WALL);
        checkblackconcretePool.stairs(DecoBlocks.CHECKERED_BLACK_CONCRETE_STAIRS);
        checkblackconcretePool.slab(DecoBlocks.CHECKERED_BLACK_CONCRETE_SLAB);
        checkblackconcretePool.wall(DecoBlocks.CHECKERED_BLACK_CONCRETE_WALL);
        checkbrownconcretePool.stairs(DecoBlocks.CHECKERED_BROWN_CONCRETE_STAIRS);
        checkbrownconcretePool.slab(DecoBlocks.CHECKERED_BROWN_CONCRETE_SLAB);
        checkbrownconcretePool.wall(DecoBlocks.CHECKERED_BROWN_CONCRETE_WALL);
        checkredconcretePool.stairs(DecoBlocks.CHECKERED_RED_CONCRETE_STAIRS);
        checkredconcretePool.slab(DecoBlocks.CHECKERED_RED_CONCRETE_SLAB);
        checkredconcretePool.wall(DecoBlocks.CHECKERED_RED_CONCRETE_WALL);
        checkorangeconcretePool.stairs(DecoBlocks.CHECKERED_ORANGE_CONCRETE_STAIRS);
        checkorangeconcretePool.slab(DecoBlocks.CHECKERED_ORANGE_CONCRETE_SLAB);
        checkorangeconcretePool.wall(DecoBlocks.CHECKERED_ORANGE_CONCRETE_WALL);
        checkyellowconcretePool.stairs(DecoBlocks.CHECKERED_YELLOW_CONCRETE_STAIRS);
        checkyellowconcretePool.slab(DecoBlocks.CHECKERED_YELLOW_CONCRETE_SLAB);
        checkyellowconcretePool.wall(DecoBlocks.CHECKERED_YELLOW_CONCRETE_WALL);
        checklimeconcretePool.stairs(DecoBlocks.CHECKERED_LIME_CONCRETE_STAIRS);
        checklimeconcretePool.slab(DecoBlocks.CHECKERED_LIME_CONCRETE_SLAB);
        checklimeconcretePool.wall(DecoBlocks.CHECKERED_LIME_CONCRETE_WALL);
        checkgreenconcretePool.stairs(DecoBlocks.CHECKERED_GREEN_CONCRETE_STAIRS);
        checkgreenconcretePool.slab(DecoBlocks.CHECKERED_GREEN_CONCRETE_SLAB);
        checkgreenconcretePool.wall(DecoBlocks.CHECKERED_GREEN_CONCRETE_WALL);
        checkcyanconcretePool.stairs(DecoBlocks.CHECKERED_CYAN_CONCRETE_STAIRS);
        checkcyanconcretePool.slab(DecoBlocks.CHECKERED_CYAN_CONCRETE_SLAB);
        checkcyanconcretePool.wall(DecoBlocks.CHECKERED_CYAN_CONCRETE_WALL);
        checklightblueconcretePool.stairs(DecoBlocks.CHECKERED_LIGHT_BLUE_CONCRETE_STAIRS);
        checklightblueconcretePool.slab(DecoBlocks.CHECKERED_LIGHT_BLUE_CONCRETE_SLAB);
        checklightblueconcretePool.wall(DecoBlocks.CHECKERED_LIGHT_BLUE_CONCRETE_WALL);
        checkblueconcretePool.stairs(DecoBlocks.CHECKERED_BLUE_CONCRETE_STAIRS);
        checkblueconcretePool.slab(DecoBlocks.CHECKERED_BLUE_CONCRETE_SLAB);
        checkblueconcretePool.wall(DecoBlocks.CHECKERED_BLUE_CONCRETE_WALL);
        checkpurpleconcretePool.stairs(DecoBlocks.CHECKERED_PURPLE_CONCRETE_STAIRS);
        checkpurpleconcretePool.slab(DecoBlocks.CHECKERED_PURPLE_CONCRETE_SLAB);
        checkpurpleconcretePool.wall(DecoBlocks.CHECKERED_PURPLE_CONCRETE_WALL);
        checkmagnetaconcretePool.stairs(DecoBlocks.CHECKERED_MAGENTA_CONCRETE_STAIRS);
        checkmagnetaconcretePool.slab(DecoBlocks.CHECKERED_MAGENTA_CONCRETE_SLAB);
        checkmagnetaconcretePool.wall(DecoBlocks.CHECKERED_MAGENTA_CONCRETE_WALL);
        checkpinkconcretePool.stairs(DecoBlocks.CHECKERED_PINK_CONCRETE_STAIRS);
        checkpinkconcretePool.slab(DecoBlocks.CHECKERED_PINK_CONCRETE_SLAB);
        checkpinkconcretePool.wall(DecoBlocks.CHECKERED_PINK_CONCRETE_WALL);

        registerTintedGrassModels(blockStateModelGenerator);
    }

    private void registerTintedGrassModels(BlockStateModelGenerator blockStateModelGenerator) {
        Identifier packedGrassModelId = blockStateModelGenerator.createSubModel(DecoBlocks.PACKED_GRASS, "", CUBE_ALL_TINTED,
                block -> TextureMap.of(TextureKey.ALL, GRASS_BASE_TEXTURE));
        Identifier grassCarpetModelId = blockStateModelGenerator.createSubModel(DecoBlocks.GRASS_CARPET, "", CARPET_TINTED,
                block -> TextureMap.of(TextureKey.WOOL, GRASS_BASE_TEXTURE));
        Identifier grassSlabModelId = blockStateModelGenerator.createSubModel(DecoBlocks.GRASS_SLAB, "", SLAB_TINTED,
                block -> createGrassStairSlabTextureMap());
        Identifier grassSlabTopModelId = blockStateModelGenerator.createSubModel(DecoBlocks.GRASS_SLAB, "_top", SLAB_TOP_TINTED,
                block -> createGrassStairSlabTextureMap());
        Identifier grassStairsModelId = blockStateModelGenerator.createSubModel(DecoBlocks.GRASS_STAIRS, "", STAIRS_TINTED,
                block -> createGrassStairSlabTextureMap());
        Identifier grassStairsInnerModelId = blockStateModelGenerator.createSubModel(DecoBlocks.GRASS_STAIRS, "_inner", STAIRS_INNER_TINTED,
                block -> createGrassStairSlabTextureMap());
        Identifier grassStairsOuterModelId = blockStateModelGenerator.createSubModel(DecoBlocks.GRASS_STAIRS, "_outer", STAIRS_OUTER_TINTED,
                block -> createGrassStairSlabTextureMap());

        Consumer<Object> blockStateCollector = getBlockStateCollector(blockStateModelGenerator);
        blockStateCollector.accept(BlockStateModelGenerator.createSingletonBlockState(
                DecoBlocks.PACKED_GRASS, packedGrassModelId));
        blockStateCollector.accept(BlockStateModelGenerator.createSingletonBlockState(
                DecoBlocks.GRASS_CARPET, grassCarpetModelId));
        blockStateCollector.accept(BlockStateModelGenerator.createSlabBlockState(
                DecoBlocks.GRASS_SLAB, grassSlabModelId, grassSlabTopModelId, packedGrassModelId));
        blockStateCollector.accept(BlockStateModelGenerator.createStairsBlockState(
                DecoBlocks.GRASS_STAIRS, grassStairsInnerModelId, grassStairsModelId, grassStairsOuterModelId));
    }

    private static TextureMap createGrassStairSlabTextureMap() {
        return TextureMap.of(TextureKey.BOTTOM, GRASS_BASE_TEXTURE)
                .put(TextureKey.TOP, GRASS_BASE_TEXTURE)
                .put(TextureKey.SIDE, GRASS_BASE_TEXTURE);
    }

    @SuppressWarnings("unchecked")
    private static Consumer<Object> getBlockStateCollector(BlockStateModelGenerator blockStateModelGenerator) {
        try {
            Field field = BlockStateModelGenerator.class.getDeclaredField("blockStateCollector");
            field.setAccessible(true);
            return (Consumer<Object>) field.get(blockStateModelGenerator);
        } catch (ReflectiveOperationException exception) {
            throw new RuntimeException("Failed to access blockStateCollector from BlockStateModelGenerator", exception);
        }

    }
    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(DecoItems.SNOW_BRICK, Models.GENERATED);
        itemModelGenerator.register(DecoItems.BUBBLE_ORB, Models.GENERATED);
        itemModelGenerator.register(DecoItems.ICE_SHARD, Models.GENERATED);
        itemModelGenerator.register(DecoItems.COPPER_NUGGET, Models.GENERATED);
        itemModelGenerator.register(DecoItems.TALL_SEAGRASS, Models.GENERATED);

        itemModelGenerator.register(DecoItems.PASSTOL, Models.GENERATED);
        itemModelGenerator.register(DecoItems.SHADDOL, Models.GENERATED);

        itemModelGenerator.register(DecoItems.LILAC_FLOWER, Models.HANDHELD);

        itemModelGenerator.register(DecoBlocks.HANGING_LAMP.asItem(), Models.GENERATED);

        itemModelGenerator.register(DecoBlocks.HANGING_WHITE_LAMP.asItem(), Models.GENERATED);
        itemModelGenerator.register(DecoBlocks.HANGING_LIGHT_GRAY_LAMP.asItem(), Models.GENERATED);
        itemModelGenerator.register(DecoBlocks.HANGING_GRAY_LAMP.asItem(), Models.GENERATED);
        itemModelGenerator.register(DecoBlocks.HANGING_BLACK_LAMP.asItem(), Models.GENERATED);
        itemModelGenerator.register(DecoBlocks.HANGING_BROWN_LAMP.asItem(), Models.GENERATED);
        itemModelGenerator.register(DecoBlocks.HANGING_RED_LAMP.asItem(), Models.GENERATED);
        itemModelGenerator.register(DecoBlocks.HANGING_ORANGE_LAMP.asItem(), Models.GENERATED);
        itemModelGenerator.register(DecoBlocks.HANGING_YELLOW_LAMP.asItem(), Models.GENERATED);
        itemModelGenerator.register(DecoBlocks.HANGING_LIME_LAMP.asItem(), Models.GENERATED);
        itemModelGenerator.register(DecoBlocks.HANGING_GREEN_LAMP.asItem(), Models.GENERATED);
        itemModelGenerator.register(DecoBlocks.HANGING_CYAN_LAMP.asItem(), Models.GENERATED);
        itemModelGenerator.register(DecoBlocks.HANGING_LIGHT_BLUE_LAMP.asItem(), Models.GENERATED);
        itemModelGenerator.register(DecoBlocks.HANGING_BLUE_LAMP.asItem(), Models.GENERATED);
        itemModelGenerator.register(DecoBlocks.HANGING_PURPLE_LAMP.asItem(), Models.GENERATED);
        itemModelGenerator.register(DecoBlocks.HANGING_MAGENTA_LAMP.asItem(), Models.GENERATED);
        itemModelGenerator.register(DecoBlocks.HANGING_PINK_LAMP.asItem(), Models.GENERATED);
    }

}
