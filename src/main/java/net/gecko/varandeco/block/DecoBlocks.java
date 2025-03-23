package net.gecko.varandeco.block;

import com.terraformersmc.terraform.sign.block.TerraformSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformWallSignBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.gecko.varandeco.VaranDeco;
import net.gecko.varandeco.block.cartographytables.*;
import net.gecko.varandeco.block.craftingtables.*;
import net.gecko.varandeco.block.custom.BlackIceBlock;
import net.gecko.varandeco.block.custom.TintedGlassPaneBlock;
import net.gecko.varandeco.block.custom.WarpedWartBlock;
import net.gecko.varandeco.block.magmabubbleblocks.*;
import net.gecko.varandeco.block.smithingtables.*;
import net.gecko.varandeco.item.DecoItemGroup;
import net.minecraft.block.*;
import net.minecraft.data.family.BlockFamilies;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class DecoBlocks {

    public static final Block POLISHED_STONE = registerBlock("polished_stone",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2.5f).resistance(6.0f).requiresTool()),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block STONE_TILES = registerBlock("stone_tiles",
            new Block(FabricBlockSettings.of(Material.STONE).strength(1.5f).resistance(6.0f).requiresTool()),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CACTUS_PLANKS = registerBlock("cactus_planks",
            new Block(FabricBlockSettings.of(Material.WOOD, MapColor.PALE_GREEN).strength(2.0f).resistance(3.0f)
                    .sounds(BlockSoundGroup.WOOD)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block HARDENED_GLASS = registerBlock("hardened_glass",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block HARDENED_TINTED_GLASS = registerBlock("hardened_tinted_glass",
            new TintedGlassBlock(FabricBlockSettings.copyOf(Blocks.TINTED_GLASS).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block HARDENED_WHITE_STAINED_GLASS = registerBlock("hardened_white_stained_glass",
            new StainedGlassBlock(DyeColor.WHITE, FabricBlockSettings.copyOf(Blocks.WHITE_STAINED_GLASS).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block HARDENED_ORANGE_STAINED_GLASS = registerBlock("hardened_orange_stained_glass",
            new StainedGlassBlock(DyeColor.ORANGE, FabricBlockSettings.copyOf(Blocks.ORANGE_STAINED_GLASS).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block HARDENED_MAGENTA_STAINED_GLASS = registerBlock("hardened_magenta_stained_glass",
            new StainedGlassBlock(DyeColor.MAGENTA, FabricBlockSettings.copyOf(Blocks.MAGENTA_STAINED_GLASS).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_SANDSTONE_BRICKS = registerBlock("cut_sandstone_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(1.6f).requiresTool()),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block SNOW_BRICKS = registerBlock("snow_bricks",
            new Block(FabricBlockSettings.of(Material.SNOW_BLOCK).slipperiness(0.89F)
                    .strength(1.0f).resistance(0.7f).requiresTool().sounds(BlockSoundGroup.SNOW)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CHISELED_SNOW_BRICKS = registerBlock("chiseled_snow_bricks",
            new MagmaBrickBlock(FabricBlockSettings.copyOf(DecoBlocks.SNOW_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block SOUL_SOILSTONE = registerBlock("soul_soilstone",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0.8f).requiresTool().mapColor(MapColor.BROWN)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CHISELED_SOUL_SOILSTONE = registerBlock("chiseled_soul_soilstone",
            new Block(FabricBlockSettings.copyOf(DecoBlocks.SOUL_SOILSTONE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_SOUL_SOILSTONE = registerBlock("cut_soul_soilstone",
            new Block(FabricBlockSettings.copyOf(DecoBlocks.SOUL_SOILSTONE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block SMOOTH_SOUL_SOILSTONE = registerBlock("smooth_soul_soilstone",
            new Block(FabricBlockSettings.copyOf(DecoBlocks.SOUL_SOILSTONE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_SOUL_SOILSTONE_BRICKS = registerBlock("cut_soul_soilstone_bricks",
            new Block(FabricBlockSettings.copyOf(DecoBlocks.CUT_SOUL_SOILSTONE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_QUARTZ = registerBlock("cut_quartz",
            new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block WHITE_TERRACOTTA_BRICKS = registerBlock("white_terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.WHITE_TERRACOTTA)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block ORANGE_TERRACOTTA_BRICKS = registerBlock("orange_terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.ORANGE_TERRACOTTA)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block MAGENTA_TERRACOTTA_BRICKS = registerBlock("magenta_terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.MAGENTA_TERRACOTTA)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block LIGHT_BLUE_TERRACOTTA_BRICKS = registerBlock("light_blue_terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_TERRACOTTA)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block YELLOW_TERRACOTTA_BRICKS = registerBlock("yellow_terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.YELLOW_TERRACOTTA)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block LIME_TERRACOTTA_BRICKS = registerBlock("lime_terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.LIME_TERRACOTTA)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block PINK_TERRACOTTA_BRICKS = registerBlock("pink_terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.PINK_TERRACOTTA)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block GRAY_TERRACOTTA_BRICKS = registerBlock("gray_terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.GRAY_TERRACOTTA)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block LIGHT_GRAY_TERRACOTTA_BRICKS = registerBlock("light_gray_terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_TERRACOTTA)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CYAN_TERRACOTTA_BRICKS = registerBlock("cyan_terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.CYAN_TERRACOTTA)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block PURPLE_TERRACOTTA_BRICKS = registerBlock("purple_terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.PURPLE_TERRACOTTA)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block BLUE_TERRACOTTA_BRICKS = registerBlock("blue_terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.BLUE_TERRACOTTA)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block BROWN_TERRACOTTA_BRICKS = registerBlock("brown_terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.BROWN_TERRACOTTA)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block GREEN_TERRACOTTA_BRICKS = registerBlock("green_terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.GREEN_TERRACOTTA)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block RED_TERRACOTTA_BRICKS = registerBlock("red_terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.RED_TERRACOTTA)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block BLACK_TERRACOTTA_BRICKS = registerBlock("black_terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.BLACK_TERRACOTTA)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block TERRACOTTA_BRICKS = registerBlock("terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.TERRACOTTA)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_RED_SANDSTONE_BRICKS = registerBlock("cut_red_sandstone_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(1.6f).requiresTool()),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CHISELED_PRISMARINE_BRICKS = registerBlock("chiseled_prismarine_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.PRISMARINE).mapColor(MapColor.DIAMOND_BLUE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CRYSTALLIZED_PRISMARINE = registerBlock("crystallized_prismarine",
            new Block(FabricBlockSettings.copyOf(Blocks.PRISMARINE).mapColor(MapColor.BRIGHT_TEAL)
                    .luminance(state -> 3).sounds(BlockSoundGroup.GLASS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CRYSTALLIZED_PRISMARINE_BRICKS = registerBlock("crystallized_prismarine_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.PRISMARINE).mapColor(MapColor.BRIGHT_TEAL)
                    .luminance(state -> 3).sounds(BlockSoundGroup.GLASS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CHISELED_CRYSTALLIZED_PRISMARINE_BRICKS = registerBlock("chiseled_crystallized_prismarine_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.PRISMARINE).mapColor(MapColor.BRIGHT_TEAL)
                    .luminance(state -> 3).sounds(BlockSoundGroup.GLASS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block LIGHT_PRISMARINE = registerBlock("light_prismarine",
            new Block(FabricBlockSettings.copyOf(Blocks.PRISMARINE).mapColor(MapColor.OFF_WHITE)
                    .luminance(state -> 5).sounds(BlockSoundGroup.GLASS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block ICE_BRICKS = registerBlock("ice_bricks",
            new MagmaBrickBlock(FabricBlockSettings.copyOf(Blocks.PACKED_ICE).strength(1.4f)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block MAGMA_BRICKS = registerBlock("magma_bricks",
            new MagmaBrickBlock(FabricBlockSettings.copyOf(Blocks.MAGMA_BLOCK).luminance(state -> 1)
                    .strength(1.5F).sounds(BlockSoundGroup.NETHER_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CHISELED_MAGMA_BRICKS = registerBlock("chiseled_magma_bricks",
            new MagmaBrickBlock(FabricBlockSettings.copyOf(DecoBlocks.MAGMA_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block BUBBLE_BLOCK = registerBlock("bubble_block",
            new BubbleBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).strength(0.5F,25.0f)
                    .mapColor(MapColor.BLUE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block BUBBLE_BRICKS = registerBlock("bubble_bricks",
            new BubbleBlock(FabricBlockSettings.copyOf(DecoBlocks.BUBBLE_BLOCK).strength(1.5F)
                    .mapColor(MapColor.STONE_GRAY)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CHISELED_BUBBLE_BRICKS = registerBlock("chiseled_bubble_bricks",
            new BubbleBlock(FabricBlockSettings.copyOf(DecoBlocks.BUBBLE_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CHISELED_RED_NETHER_BRICKS = registerBlock("chiseled_red_nether_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.RED_NETHER_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CRACKED_RED_NETHER_BRICKS = registerBlock("cracked_red_nether_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.RED_NETHER_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block BLUE_NETHER_BRICKS = registerBlock("blue_nether_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHER_BRICKS).mapColor(MapColor.TEAL)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CHISELED_BLUE_NETHER_BRICKS = registerBlock("chiseled_blue_nether_bricks",
            new Block(FabricBlockSettings.copyOf(DecoBlocks.BLUE_NETHER_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CRACKED_BLUE_NETHER_BRICKS = registerBlock("cracked_blue_nether_bricks",
            new Block(FabricBlockSettings.copyOf(DecoBlocks.BLUE_NETHER_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_WHITE_CONCRETE = registerBlock("cut_white_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.WHITE_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_ORANGE_CONCRETE = registerBlock("cut_orange_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.ORANGE_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_MAGENTA_CONCRETE = registerBlock("cut_magenta_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.MAGENTA_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_LIGHT_BLUE_CONCRETE = registerBlock("cut_light_blue_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_YELLOW_CONCRETE = registerBlock("cut_yellow_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.YELLOW_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_LIME_CONCRETE = registerBlock("cut_lime_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.LIME_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_PINK_CONCRETE = registerBlock("cut_pink_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.PINK_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_GRAY_CONCRETE = registerBlock("cut_gray_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.GRAY_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_LIGHT_GRAY_CONCRETE = registerBlock("cut_light_gray_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_CYAN_CONCRETE = registerBlock("cut_cyan_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.CYAN_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_PURPLE_CONCRETE = registerBlock("cut_purple_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.PURPLE_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_BLUE_CONCRETE = registerBlock("cut_blue_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.BLUE_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_BROWN_CONCRETE = registerBlock("cut_brown_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.BROWN_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_GREEN_CONCRETE = registerBlock("cut_green_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.GREEN_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_RED_CONCRETE = registerBlock("cut_red_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.RED_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_BLACK_CONCRETE = registerBlock("cut_black_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.BLACK_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block WHITE_CONCRETE_PILLAR = registerBlock("white_concrete_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.WHITE_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block ORANGE_CONCRETE_PILLAR = registerBlock("orange_concrete_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.ORANGE_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block MAGENTA_CONCRETE_PILLAR = registerBlock("magenta_concrete_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.MAGENTA_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block LIGHT_BLUE_CONCRETE_PILLAR = registerBlock("light_blue_concrete_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block YELLOW_CONCRETE_PILLAR = registerBlock("yellow_concrete_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.YELLOW_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block LIME_CONCRETE_PILLAR = registerBlock("lime_concrete_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.LIME_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block PINK_CONCRETE_PILLAR = registerBlock("pink_concrete_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.PINK_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block GRAY_CONCRETE_PILLAR = registerBlock("gray_concrete_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.GRAY_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block LIGHT_GRAY_CONCRETE_PILLAR = registerBlock("light_gray_concrete_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CYAN_CONCRETE_PILLAR = registerBlock("cyan_concrete_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.CYAN_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block PURPLE_CONCRETE_PILLAR = registerBlock("purple_concrete_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.PURPLE_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block BLUE_CONCRETE_PILLAR = registerBlock("blue_concrete_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.BLUE_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block BROWN_CONCRETE_PILLAR = registerBlock("brown_concrete_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.BROWN_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block GREEN_CONCRETE_PILLAR = registerBlock("green_concrete_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.GREEN_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block RED_CONCRETE_PILLAR = registerBlock("red_concrete_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.RED_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block BLACK_CONCRETE_PILLAR = registerBlock("black_concrete_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.BLACK_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block POLISHED_GLIDED_BLACKSTONE = registerBlock("polished_gilded_blackstone",
            new Block(FabricBlockSettings.copyOf(Blocks.GILDED_BLACKSTONE).strength(2.5f)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CHISELED_GLIDED_BLACKSTONE = registerBlock("chiseled_gilded_blackstone",
            new Block(FabricBlockSettings.copyOf(DecoBlocks.POLISHED_GLIDED_BLACKSTONE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block POLISHED_BLACKSTONE_TILES = registerBlock("polished_blackstone_tiles",
            new Block(FabricBlockSettings.of(Material.STONE, MapColor.BLACK).strength(1.5f).resistance(6.0f).requiresTool()),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block BLACK_ICE = registerBlock("black_ice",
            new BlackIceBlock(FabricBlockSettings.of(Material.DENSE_ICE, MapColor.BLACK).slipperiness(1.18F)
                    .strength(5.6f).requiresTool().sounds(BlockSoundGroup.STONE).velocityMultiplier(0.9F)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block WARPED_WART_PLANT = registerBlockWithoutItem("warped_wart_plant",
            new WarpedWartBlock(FabricBlockSettings.copyOf(Blocks.NETHER_WART).mapColor(MapColor.BRIGHT_TEAL).nonOpaque()));

    public static final Block CALCITE_STAIRS = registerBlock("calcite_stairs",
            new StairsBlock(Blocks.CALCITE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.CALCITE)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block TUFF_STAIRS = registerBlock("tuff_stairs",
            new StairsBlock(Blocks.TUFF.getDefaultState(),FabricBlockSettings.copyOf(Blocks.TUFF)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block DRIPSTONE_STAIRS = registerBlock("dripstone_stairs",
            new StairsBlock(Blocks.DRIPSTONE_BLOCK.getDefaultState(),FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_SANDSTONE_STAIRS = registerBlock("cut_sandstone_stairs",
            new StairsBlock(Blocks.CUT_SANDSTONE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.CUT_SANDSTONE)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block SMOOTH_STONE_STAIRS = registerBlock("smooth_stone_stairs",
            new StairsBlock(Blocks.SMOOTH_STONE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block SNOW_STAIRS = registerBlock("snow_stairs",
            new StairsBlock(Blocks.SNOW_BLOCK.getDefaultState(),FabricBlockSettings.copyOf(Blocks.SNOW_BLOCK)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block NETHERRACK_STAIRS = registerBlock("netherrack_stairs",
            new StairsBlock(Blocks.NETHERRACK.getDefaultState(),FabricBlockSettings.copyOf(Blocks.NETHERRACK)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block PACKED_MUD_STAIRS = registerBlock("packed_mud_stairs",
            new StairsBlock(Blocks.PACKED_MUD.getDefaultState(),FabricBlockSettings.copyOf(Blocks.PACKED_MUD)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block QUARTZ_BRICK_STAIRS = registerBlock("quartz_brick_stairs",
            new StairsBlock(Blocks.QUARTZ_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(Blocks.QUARTZ_BRICKS)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block WHITE_TERRACOTTA_STAIRS = registerBlock("white_terracotta_stairs",
            new StairsBlock(Blocks.WHITE_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(Blocks.WHITE_TERRACOTTA)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block ORANGE_TERRACOTTA_STAIRS = registerBlock("orange_terracotta_stairs",
            new StairsBlock(Blocks.ORANGE_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(Blocks.ORANGE_TERRACOTTA)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block MAGENTA_TERRACOTTA_STAIRS = registerBlock("magenta_terracotta_stairs",
            new StairsBlock(Blocks.MAGENTA_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(Blocks.MAGENTA_TERRACOTTA)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block LIGHT_BLUE_TERRACOTTA_STAIRS = registerBlock("light_blue_terracotta_stairs",
            new StairsBlock(Blocks.LIGHT_BLUE_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_TERRACOTTA)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block YELLOW_TERRACOTTA_STAIRS = registerBlock("yellow_terracotta_stairs",
            new StairsBlock(Blocks.YELLOW_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(Blocks.YELLOW_TERRACOTTA)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block LIME_TERRACOTTA_STAIRS = registerBlock("lime_terracotta_stairs",
            new StairsBlock(Blocks.LIME_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(Blocks.LIME_TERRACOTTA)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block PINK_TERRACOTTA_STAIRS = registerBlock("pink_terracotta_stairs",
            new StairsBlock(Blocks.PINK_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(Blocks.PINK_TERRACOTTA)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block GRAY_TERRACOTTA_STAIRS = registerBlock("gray_terracotta_stairs",
            new StairsBlock(Blocks.GRAY_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(Blocks.GRAY_TERRACOTTA)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block LIGHT_GRAY_TERRACOTTA_STAIRS = registerBlock("light_gray_terracotta_stairs",
            new StairsBlock(Blocks.LIGHT_GRAY_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_TERRACOTTA)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CYAN_TERRACOTTA_STAIRS = registerBlock("cyan_terracotta_stairs",
            new StairsBlock(Blocks.CYAN_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(Blocks.CYAN_TERRACOTTA)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block PURPLE_TERRACOTTA_STAIRS = registerBlock("purple_terracotta_stairs",
            new StairsBlock(Blocks.PURPLE_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(Blocks.PURPLE_TERRACOTTA)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block BLUE_TERRACOTTA_STAIRS = registerBlock("blue_terracotta_stairs",
            new StairsBlock(Blocks.BLUE_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(Blocks.BLUE_TERRACOTTA)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block BROWN_TERRACOTTA_STAIRS = registerBlock("brown_terracotta_stairs",
            new StairsBlock(Blocks.BROWN_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(Blocks.BROWN_TERRACOTTA)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block GREEN_TERRACOTTA_STAIRS = registerBlock("green_terracotta_stairs",
            new StairsBlock(Blocks.GREEN_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(Blocks.GREEN_TERRACOTTA)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block RED_TERRACOTTA_STAIRS = registerBlock("red_terracotta_stairs",
            new StairsBlock(Blocks.RED_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(Blocks.RED_TERRACOTTA)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block BLACK_TERRACOTTA_STAIRS = registerBlock("black_terracotta_stairs",
            new StairsBlock(Blocks.BLACK_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(Blocks.BLACK_TERRACOTTA)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block TERRACOTTA_STAIRS = registerBlock("terracotta_stairs",
            new StairsBlock(Blocks.TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(Blocks.TERRACOTTA)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block PACKED_ICE_STAIRS = registerBlock("packed_ice_stairs",
            new StairsBlock(Blocks.PACKED_ICE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.PACKED_ICE)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_RED_SANDSTONE_STAIRS = registerBlock("cut_red_sandstone_stairs",
            new StairsBlock(Blocks.CUT_RED_SANDSTONE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.CUT_RED_SANDSTONE)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block MAGMA_STAIRS = registerBlock("magma_stairs",
            new MagmaStairBlock(Blocks.MAGMA_BLOCK.getDefaultState(),FabricBlockSettings.copyOf(Blocks.MAGMA_BLOCK)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block WHITE_CONCRETE_STAIRS = registerBlock("white_concrete_stairs",
            new StairsBlock(Blocks.WHITE_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.WHITE_CONCRETE)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block ORANGE_CONCRETE_STAIRS = registerBlock("orange_concrete_stairs",
            new StairsBlock(Blocks.ORANGE_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.ORANGE_CONCRETE)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block MAGENTA_CONCRETE_STAIRS = registerBlock("magenta_concrete_stairs",
            new StairsBlock(Blocks.MAGENTA_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.MAGENTA_CONCRETE)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block LIGHT_BLUE_CONCRETE_STAIRS = registerBlock("light_blue_concrete_stairs",
            new StairsBlock(Blocks.LIGHT_BLUE_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_CONCRETE)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block YELLOW_CONCRETE_STAIRS = registerBlock("yellow_concrete_stairs",
            new StairsBlock(Blocks.YELLOW_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.YELLOW_CONCRETE)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block LIME_CONCRETE_STAIRS = registerBlock("lime_concrete_stairs",
            new StairsBlock(Blocks.LIME_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.LIME_CONCRETE)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block PINK_CONCRETE_STAIRS = registerBlock("pink_concrete_stairs",
            new StairsBlock(Blocks.PINK_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.PINK_CONCRETE)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block GRAY_CONCRETE_STAIRS = registerBlock("gray_concrete_stairs",
            new StairsBlock(Blocks.GRAY_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.GRAY_CONCRETE)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block LIGHT_GRAY_CONCRETE_STAIRS = registerBlock("light_gray_concrete_stairs",
            new StairsBlock(Blocks.LIGHT_GRAY_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_CONCRETE)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CYAN_CONCRETE_STAIRS = registerBlock("cyan_concrete_stairs",
            new StairsBlock(Blocks.CYAN_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.CYAN_CONCRETE)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block PURPLE_CONCRETE_STAIRS = registerBlock("purple_concrete_stairs",
            new StairsBlock(Blocks.PURPLE_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.PURPLE_CONCRETE)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block BLUE_CONCRETE_STAIRS = registerBlock("blue_concrete_stairs",
            new StairsBlock(Blocks.BLUE_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.BLUE_CONCRETE)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block BROWN_CONCRETE_STAIRS = registerBlock("brown_concrete_stairs",
            new StairsBlock(Blocks.BROWN_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.BROWN_CONCRETE)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block GREEN_CONCRETE_STAIRS = registerBlock("green_concrete_stairs",
            new StairsBlock(Blocks.GREEN_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.GREEN_CONCRETE)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block RED_CONCRETE_STAIRS = registerBlock("red_concrete_stairs",
            new StairsBlock(Blocks.RED_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.RED_CONCRETE)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block BLACK_CONCRETE_STAIRS = registerBlock("black_concrete_stairs",
            new StairsBlock(Blocks.BLACK_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.BLACK_CONCRETE)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block BLUE_ICE_STAIRS = registerBlock("blue_ice_stairs",
            new StairsBlock(Blocks.BLUE_ICE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.BLUE_ICE)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block POLISHED_STONE_STAIRS = registerBlock("polished_stone_stairs",
            new StairsBlock(DecoBlocks.POLISHED_STONE.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.POLISHED_STONE)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block STONE_TILE_STAIRS = registerBlock("stone_tile_stairs",
            new StairsBlock(DecoBlocks.STONE_TILES.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.STONE_TILES)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CACTUS_PLANK_STAIRS = registerBlock("cactus_plank_stairs",
            new StairsBlock(DecoBlocks.CACTUS_PLANKS.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.CACTUS_PLANKS)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_SANDSTONE_BRICK_STAIRS = registerBlock("cut_sandstone_brick_stairs",
            new StairsBlock(DecoBlocks.CUT_SANDSTONE_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.CUT_SANDSTONE_BRICKS)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block SNOW_BRICK_STAIRS = registerBlock("snow_brick_stairs",
            new StairsBlock(DecoBlocks.SNOW_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.SNOW_BRICKS)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block WHITE_TERRACOTTA_BRICK_STAIRS = registerBlock("white_terracotta_brick_stairs",
            new StairsBlock(DecoBlocks.WHITE_TERRACOTTA_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.WHITE_TERRACOTTA_BRICKS)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block ORANGE_TERRACOTTA_BRICK_STAIRS = registerBlock("orange_terracotta_brick_stairs",
            new StairsBlock(DecoBlocks.ORANGE_TERRACOTTA_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.ORANGE_TERRACOTTA_BRICKS)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block MAGENTA_TERRACOTTA_BRICK_STAIRS = registerBlock("magenta_terracotta_brick_stairs",
            new StairsBlock(DecoBlocks.MAGENTA_TERRACOTTA_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.MAGENTA_TERRACOTTA_BRICKS)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS = registerBlock("light_blue_terracotta_brick_stairs",
            new StairsBlock(DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block YELLOW_TERRACOTTA_BRICK_STAIRS = registerBlock("yellow_terracotta_brick_stairs",
            new StairsBlock(DecoBlocks.YELLOW_TERRACOTTA_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.YELLOW_TERRACOTTA_BRICKS)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block LIME_TERRACOTTA_BRICK_STAIRS = registerBlock("lime_terracotta_brick_stairs",
            new StairsBlock(DecoBlocks.LIME_TERRACOTTA_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.LIME_TERRACOTTA_BRICKS)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block PINK_TERRACOTTA_BRICK_STAIRS = registerBlock("pink_terracotta_brick_stairs",
            new StairsBlock(DecoBlocks.PINK_TERRACOTTA_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.PINK_TERRACOTTA_BRICKS)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block GRAY_TERRACOTTA_BRICK_STAIRS = registerBlock("gray_terracotta_brick_stairs",
            new StairsBlock(DecoBlocks.GRAY_TERRACOTTA_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.GRAY_TERRACOTTA_BRICKS)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS = registerBlock("light_gray_terracotta_brick_stairs",
            new StairsBlock(DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CYAN_TERRACOTTA_BRICK_STAIRS = registerBlock("cyan_terracotta_brick_stairs",
            new StairsBlock(DecoBlocks.CYAN_TERRACOTTA_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.CYAN_TERRACOTTA_BRICKS)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block PURPLE_TERRACOTTA_BRICK_STAIRS = registerBlock("purple_terracotta_brick_stairs",
            new StairsBlock(DecoBlocks.PURPLE_TERRACOTTA_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.PURPLE_TERRACOTTA_BRICKS)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block BLUE_TERRACOTTA_BRICK_STAIRS = registerBlock("blue_terracotta_brick_stairs",
            new StairsBlock(DecoBlocks.BLUE_TERRACOTTA_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.BLUE_TERRACOTTA_BRICKS)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block BROWN_TERRACOTTA_BRICK_STAIRS = registerBlock("brown_terracotta_brick_stairs",
            new StairsBlock(DecoBlocks.BROWN_TERRACOTTA_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.BROWN_TERRACOTTA_BRICKS)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block GREEN_TERRACOTTA_BRICK_STAIRS = registerBlock("green_terracotta_brick_stairs",
            new StairsBlock(DecoBlocks.GREEN_TERRACOTTA_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.GREEN_TERRACOTTA_BRICKS)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block RED_TERRACOTTA_BRICK_STAIRS = registerBlock("red_terracotta_brick_stairs",
            new StairsBlock(DecoBlocks.RED_TERRACOTTA_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.RED_TERRACOTTA_BRICKS)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block BLACK_TERRACOTTA_BRICK_STAIRS = registerBlock("black_terracotta_brick_stairs",
            new StairsBlock(DecoBlocks.BLACK_TERRACOTTA_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.BLACK_TERRACOTTA_BRICKS)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block TERRACOTTA_BRICK_STAIRS = registerBlock("terracotta_brick_stairs",
            new StairsBlock(DecoBlocks.TERRACOTTA_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.TERRACOTTA_BRICKS)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block SOUL_SOILSTONE_STAIRS = registerBlock("soul_soilstone_stairs",
            new StairsBlock(DecoBlocks.SOUL_SOILSTONE.getDefaultState(),
                    FabricBlockSettings.copyOf(DecoBlocks.SOUL_SOILSTONE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_SOUL_SOILSTONE_STAIRS = registerBlock("cut_soul_soilstone_stairs",
            new StairsBlock(DecoBlocks.CUT_SOUL_SOILSTONE.getDefaultState(),
                    FabricBlockSettings.copyOf(DecoBlocks.CUT_SOUL_SOILSTONE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block SMOOTH_SOUL_SOILSTONE_STAIRS = registerBlock("smooth_soul_soilstone_stairs",
            new StairsBlock(DecoBlocks.SMOOTH_SOUL_SOILSTONE.getDefaultState(),
                    FabricBlockSettings.copyOf(DecoBlocks.SMOOTH_SOUL_SOILSTONE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_SOUL_SOILSTONE_BRICK_STAIRS = registerBlock("cut_soul_soilstone_brick_stairs",
            new StairsBlock(DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_QUARTZ_STAIRS = registerBlock("cut_quartz_stairs",
            new StairsBlock(DecoBlocks.CUT_QUARTZ.getDefaultState(),
                    FabricBlockSettings.copyOf(DecoBlocks.CUT_QUARTZ)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block ICE_BRICK_STAIRS = registerBlock("ice_brick_stairs",
            new MagmaBrickStairBlock(DecoBlocks.ICE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(DecoBlocks.ICE_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_WHITE_CONCRETE_STAIRS = registerBlock("cut_white_concrete_stairs",
            new StairsBlock(DecoBlocks.CUT_WHITE_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.CUT_WHITE_CONCRETE)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_ORANGE_CONCRETE_STAIRS = registerBlock("cut_orange_concrete_stairs",
            new StairsBlock(DecoBlocks.CUT_ORANGE_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.CUT_ORANGE_CONCRETE)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_MAGENTA_CONCRETE_STAIRS = registerBlock("cut_magenta_concrete_stairs",
            new StairsBlock(DecoBlocks.CUT_MAGENTA_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.CUT_MAGENTA_CONCRETE)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_LIGHT_BLUE_CONCRETE_STAIRS = registerBlock("cut_light_blue_concrete_stairs",
            new StairsBlock(DecoBlocks.CUT_LIGHT_BLUE_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.CUT_LIGHT_BLUE_CONCRETE)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_YELLOW_CONCRETE_STAIRS = registerBlock("cut_yellow_concrete_stairs",
            new StairsBlock(DecoBlocks.CUT_YELLOW_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.CUT_YELLOW_CONCRETE)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_LIME_CONCRETE_STAIRS = registerBlock("cut_lime_concrete_stairs",
            new StairsBlock(DecoBlocks.CUT_LIME_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.CUT_LIME_CONCRETE)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_PINK_CONCRETE_STAIRS = registerBlock("cut_pink_concrete_stairs",
            new StairsBlock(DecoBlocks.CUT_PINK_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.CUT_PINK_CONCRETE)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_GRAY_CONCRETE_STAIRS = registerBlock("cut_gray_concrete_stairs",
            new StairsBlock(DecoBlocks.CUT_GRAY_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.CUT_GRAY_CONCRETE)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_LIGHT_GRAY_CONCRETE_STAIRS = registerBlock("cut_light_gray_concrete_stairs",
            new StairsBlock(DecoBlocks.CUT_LIGHT_GRAY_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.CUT_LIGHT_GRAY_CONCRETE)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_CYAN_CONCRETE_STAIRS = registerBlock("cut_cyan_concrete_stairs",
            new StairsBlock(DecoBlocks.CUT_CYAN_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.CUT_CYAN_CONCRETE)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_PURPLE_CONCRETE_STAIRS = registerBlock("cut_purple_concrete_stairs",
            new StairsBlock(DecoBlocks.CUT_PURPLE_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.CUT_PURPLE_CONCRETE)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_BLUE_CONCRETE_STAIRS = registerBlock("cut_blue_concrete_stairs",
            new StairsBlock(DecoBlocks.CUT_BLUE_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.CUT_BLUE_CONCRETE)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_BROWN_CONCRETE_STAIRS = registerBlock("cut_brown_concrete_stairs",
            new StairsBlock(DecoBlocks.CUT_BROWN_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.CUT_BROWN_CONCRETE)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_GREEN_CONCRETE_STAIRS = registerBlock("cut_green_concrete_stairs",
            new StairsBlock(DecoBlocks.CUT_GREEN_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.CUT_GREEN_CONCRETE)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_RED_CONCRETE_STAIRS = registerBlock("cut_red_concrete_stairs",
            new StairsBlock(DecoBlocks.CUT_RED_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.CUT_RED_CONCRETE)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_BLACK_CONCRETE_STAIRS = registerBlock("cut_black_concrete_stairs",
            new StairsBlock(DecoBlocks.CUT_BLACK_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.CUT_BLACK_CONCRETE)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CRYSTALLIZED_PRISMARINE_STAIRS = registerBlock("crystallized_prismarine_stairs",
            new StairsBlock(DecoBlocks.CRYSTALLIZED_PRISMARINE.getDefaultState(),
                    FabricBlockSettings.copyOf(DecoBlocks.CRYSTALLIZED_PRISMARINE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CRYSTALLIZED_PRISMARINE_BRICK_STAIRS = registerBlock("crystallized_prismarine_brick_stairs",
            new StairsBlock(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block LIGHT_PRISMARINE_STAIRS = registerBlock("light_prismarine_stairs",
            new StairsBlock(DecoBlocks.LIGHT_PRISMARINE.getDefaultState(),
                    FabricBlockSettings.copyOf(DecoBlocks.LIGHT_PRISMARINE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_RED_SANDSTONE_BRICK_STAIRS = registerBlock("cut_red_sandstone_brick_stairs",
            new StairsBlock(DecoBlocks.CUT_RED_SANDSTONE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(DecoBlocks.CUT_RED_SANDSTONE_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block MAGMA_BRICK_STAIRS = registerBlock("magma_brick_stairs",
            new MagmaBrickStairBlock(DecoBlocks.MAGMA_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(DecoBlocks.MAGMA_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block BUBBLE_STAIRS = registerBlock("bubble_stairs",
            new BubbleStairBlock(DecoBlocks.BUBBLE_BLOCK.getDefaultState(),
                    FabricBlockSettings.copyOf(DecoBlocks.BUBBLE_BLOCK)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block BUBBLE_BRICK_STAIRS = registerBlock("bubble_brick_stairs",
            new BubbleStairBlock(DecoBlocks.BUBBLE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(DecoBlocks.BUBBLE_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block BLUE_NETHER_BRICK_STAIRS = registerBlock("blue_nether_brick_stairs",
            new StairsBlock(DecoBlocks.BLUE_NETHER_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(DecoBlocks.BLUE_NETHER_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block POLISHED_BLACKSTONE_TILE_STAIRS = registerBlock("polished_blackstone_tile_stairs",
            new MagmaBrickStairBlock(DecoBlocks.POLISHED_BLACKSTONE_TILES.getDefaultState(),
                    FabricBlockSettings.copyOf(DecoBlocks.POLISHED_BLACKSTONE_TILES)), DecoItemGroup.VARAN_DECO_BLOCKS);

    public static final Block CALCITE_SLAB = registerBlock("calcite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.CALCITE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block TUFF_SLAB = registerBlock("tuff_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TUFF)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block DRIPSTONE_SLAB = registerBlock("dripstone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block SNOW_SLAB = registerBlock("snow_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.SNOW_BLOCK)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block NETHERRACK_SLAB = registerBlock("netherrack_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.NETHERRACK)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block PACKED_MUD_SLAB = registerBlock("packed_mud_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.PACKED_MUD)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block QUARTZ_BRICK_SLAB = registerBlock("quartz_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block WHITE_TERRACOTTA_SLAB = registerBlock("white_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.WHITE_TERRACOTTA)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block ORANGE_TERRACOTTA_SLAB = registerBlock("orange_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.ORANGE_TERRACOTTA)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block MAGENTA_TERRACOTTA_SLAB = registerBlock("magenta_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.MAGENTA_TERRACOTTA)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block LIGHT_BLUE_TERRACOTTA_SLAB = registerBlock("light_blue_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_TERRACOTTA)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block YELLOW_TERRACOTTA_SLAB = registerBlock("yellow_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.YELLOW_TERRACOTTA)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block LIME_TERRACOTTA_SLAB = registerBlock("lime_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.LIME_TERRACOTTA)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block PINK_TERRACOTTA_SLAB = registerBlock("pink_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.PINK_TERRACOTTA)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block GRAY_TERRACOTTA_SLAB = registerBlock("gray_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.GRAY_TERRACOTTA)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block LIGHT_GRAY_TERRACOTTA_SLAB = registerBlock("light_gray_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_TERRACOTTA)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CYAN_TERRACOTTA_SLAB = registerBlock("cyan_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.CYAN_TERRACOTTA)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block PURPLE_TERRACOTTA_SLAB = registerBlock("purple_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.PURPLE_TERRACOTTA)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block BLUE_TERRACOTTA_SLAB = registerBlock("blue_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.BLUE_TERRACOTTA)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block BROWN_TERRACOTTA_SLAB = registerBlock("brown_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.BROWN_TERRACOTTA)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block GREEN_TERRACOTTA_SLAB = registerBlock("green_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.GREEN_TERRACOTTA)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block RED_TERRACOTTA_SLAB = registerBlock("red_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.RED_TERRACOTTA)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block BLACK_TERRACOTTA_SLAB = registerBlock("black_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.BLACK_TERRACOTTA)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block TERRACOTTA_SLAB = registerBlock("terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block PACKED_ICE_SLAB = registerBlock("packed_ice_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.PACKED_ICE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block MAGMA_SLAB = registerBlock("magma_slab",
            new MagmaSlabBlock(FabricBlockSettings.copyOf(Blocks.MAGMA_BLOCK)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block WHITE_CONCRETE_SLAB = registerBlock("white_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.WHITE_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block ORANGE_CONCRETE_SLAB = registerBlock("orange_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.ORANGE_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block MAGENTA_CONCRETE_SLAB = registerBlock("magenta_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.MAGENTA_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block LIGHT_BLUE_CONCRETE_SLAB = registerBlock("light_blue_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block YELLOW_CONCRETE_SLAB = registerBlock("yellow_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.YELLOW_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block LIME_CONCRETE_SLAB = registerBlock("lime_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.LIME_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block PINK_CONCRETE_SLAB = registerBlock("pink_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.PINK_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block GRAY_CONCRETE_SLAB = registerBlock("gray_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.GRAY_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block LIGHT_GRAY_CONCRETE_SLAB = registerBlock("light_gray_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CYAN_CONCRETE_SLAB = registerBlock("cyan_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.CYAN_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block PURPLE_CONCRETE_SLAB = registerBlock("purple_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.PURPLE_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block BLUE_CONCRETE_SLAB = registerBlock("blue_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.BLUE_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block BROWN_CONCRETE_SLAB = registerBlock("brown_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.BROWN_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block GREEN_CONCRETE_SLAB = registerBlock("green_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.GREEN_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block RED_CONCRETE_SLAB = registerBlock("red_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.RED_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block BLACK_CONCRETE_SLAB = registerBlock("black_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.BLACK_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block BLUE_ICE_SLAB = registerBlock("blue_ice_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.BLUE_ICE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block POLISHED_STONE_SLAB = registerBlock("polished_stone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.POLISHED_STONE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block STONE_TILE_SLAB = registerBlock("stone_tile_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.STONE_TILES)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CACTUS_PLANK_SLAB = registerBlock("cactus_plank_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CACTUS_PLANKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_SANDSTONE_BRICK_SLAB = registerBlock("cut_sandstone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_SANDSTONE_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block SNOW_BRICK_SLAB = registerBlock("snow_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.SNOW_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block WHITE_TERRACOTTA_BRICK_SLAB = registerBlock("white_terracotta_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.WHITE_TERRACOTTA_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block ORANGE_TERRACOTTA_BRICK_SLAB = registerBlock("orange_terracotta_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.ORANGE_TERRACOTTA_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block MAGENTA_TERRACOTTA_BRICK_SLAB = registerBlock("magenta_terracotta_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.MAGENTA_TERRACOTTA_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block LIGHT_BLUE_TERRACOTTA_BRICK_SLAB = registerBlock("light_blue_terracotta_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block YELLOW_TERRACOTTA_BRICK_SLAB = registerBlock("yellow_terracotta_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.YELLOW_TERRACOTTA_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block LIME_TERRACOTTA_BRICK_SLAB = registerBlock("lime_terracotta_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.LIME_TERRACOTTA_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block PINK_TERRACOTTA_BRICK_SLAB = registerBlock("pink_terracotta_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.PINK_TERRACOTTA_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block GRAY_TERRACOTTA_BRICK_SLAB = registerBlock("gray_terracotta_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.GRAY_TERRACOTTA_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block LIGHT_GRAY_TERRACOTTA_BRICK_SLAB = registerBlock("light_gray_terracotta_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CYAN_TERRACOTTA_BRICK_SLAB = registerBlock("cyan_terracotta_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CYAN_TERRACOTTA_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block PURPLE_TERRACOTTA_BRICK_SLAB = registerBlock("purple_terracotta_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.PURPLE_TERRACOTTA_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block BLUE_TERRACOTTA_BRICK_SLAB = registerBlock("blue_terracotta_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.BLUE_TERRACOTTA_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block BROWN_TERRACOTTA_BRICK_SLAB = registerBlock("brown_terracotta_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.BROWN_TERRACOTTA_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block GREEN_TERRACOTTA_BRICK_SLAB = registerBlock("green_terracotta_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.GREEN_TERRACOTTA_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block RED_TERRACOTTA_BRICK_SLAB = registerBlock("red_terracotta_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.RED_TERRACOTTA_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block BLACK_TERRACOTTA_BRICK_SLAB = registerBlock("black_terracotta_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.BLACK_TERRACOTTA_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block TERRACOTTA_BRICK_SLAB = registerBlock("terracotta_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.TERRACOTTA_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block SOUL_SOILSTONE_SLAB = registerBlock("soul_soilstone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.SOUL_SOILSTONE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_SOUL_SOILSTONE_SLAB = registerBlock("cut_soul_soilstone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_SOUL_SOILSTONE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block SMOOTH_SOUL_SOILSTONE_SLAB = registerBlock("smooth_soul_soilstone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.SMOOTH_SOUL_SOILSTONE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_SOUL_SOILSTONE_BRICK_SLAB = registerBlock("cut_soul_soilstone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_QUARTZ_SLAB = registerBlock("cut_quartz_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_QUARTZ)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block ICE_BRICK_SLAB = registerBlock("ice_brick_slab",
            new MagmaBrickSlabBlock(FabricBlockSettings.copyOf(DecoBlocks.ICE_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_WHITE_CONCRETE_SLAB = registerBlock("cut_white_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_WHITE_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_ORANGE_CONCRETE_SLAB = registerBlock("cut_orange_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_ORANGE_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_MAGENTA_CONCRETE_SLAB = registerBlock("cut_magenta_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_MAGENTA_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_LIGHT_BLUE_CONCRETE_SLAB = registerBlock("cut_light_blue_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_LIGHT_BLUE_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_YELLOW_CONCRETE_SLAB = registerBlock("cut_yellow_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_YELLOW_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_LIME_CONCRETE_SLAB = registerBlock("cut_lime_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_LIME_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_PINK_CONCRETE_SLAB = registerBlock("cut_pink_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_PINK_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_GRAY_CONCRETE_SLAB = registerBlock("cut_gray_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_GRAY_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_LIGHT_GRAY_CONCRETE_SLAB = registerBlock("cut_light_gray_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_LIGHT_GRAY_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_CYAN_CONCRETE_SLAB = registerBlock("cut_cyan_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_CYAN_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_PURPLE_CONCRETE_SLAB = registerBlock("cut_purple_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_PURPLE_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_BLUE_CONCRETE_SLAB = registerBlock("cut_blue_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_BLUE_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_BROWN_CONCRETE_SLAB = registerBlock("cut_brown_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_BROWN_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_GREEN_CONCRETE_SLAB = registerBlock("cut_green_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_GREEN_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_RED_CONCRETE_SLAB = registerBlock("cut_red_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_RED_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_BLACK_CONCRETE_SLAB = registerBlock("cut_black_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_BLACK_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CRYSTALLIZED_PRISMARINE_SLAB = registerBlock("crystallized_prismarine_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CRYSTALLIZED_PRISMARINE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CRYSTALLIZED_PRISMARINE_BRICK_SLAB = registerBlock("crystallized_prismarine_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block LIGHT_PRISMARINE_SLAB = registerBlock("light_prismarine_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.LIGHT_PRISMARINE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_RED_SANDSTONE_BRICK_SLAB = registerBlock("cut_red_sandstone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_RED_SANDSTONE_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block MAGMA_BRICK_SLAB = registerBlock("magma_brick_slab",
            new MagmaBrickSlabBlock(FabricBlockSettings.copyOf(DecoBlocks.MAGMA_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block BUBBLE_SLAB = registerBlock("bubble_slab",
            new BubbleSlabBlock(FabricBlockSettings.copyOf(DecoBlocks.BUBBLE_BLOCK)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block BUBBLE_BRICK_SLAB = registerBlock("bubble_brick_slab",
            new BubbleSlabBlock(FabricBlockSettings.copyOf(DecoBlocks.BUBBLE_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block BLUE_NETHER_BRICK_SLAB = registerBlock("blue_nether_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.BLUE_NETHER_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block POLISHED_BLACKSTONE_TILE_SLAB = registerBlock("polished_blackstone_tile_slab",
            new MagmaBrickSlabBlock(FabricBlockSettings.copyOf(DecoBlocks.POLISHED_BLACKSTONE_TILES)), DecoItemGroup.VARAN_DECO_BLOCKS);

    public static final Block SPRUCE_CRAFTING_TABLE = registerBlock("spruce_crafting_table",
            new SpruceCraftingTableBlock(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE).mapColor(MapColor.SPRUCE_BROWN)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block BIRCH_CRAFTING_TABLE = registerBlock("birch_crafting_table",
            new BirchCraftingTableBlock(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE).mapColor(MapColor.PALE_YELLOW)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block JUNGLE_CRAFTING_TABLE = registerBlock("jungle_crafting_table",
            new JungleCraftingTableBlock(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE).mapColor(MapColor.DIRT_BROWN)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block ACACIA_CRAFTING_TABLE = registerBlock("acacia_crafting_table",
            new AcaciaCraftingTableBlock(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE).mapColor(MapColor.GRAY)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block DARK_OAK_CRAFTING_TABLE = registerBlock("dark_oak_crafting_table",
            new DarkOakCraftingTableBlock(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE).mapColor(MapColor.BROWN)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block MANGROVE_CRAFTING_TABLE = registerBlock("mangrove_crafting_table",
            new MangroveCraftingTableBlock(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE).mapColor(MapColor.RED)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CRIMSON_CRAFTING_TABLE = registerBlock("crimson_crafting_table",
            new CrimsonCraftingTableBlock(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE).mapColor(MapColor.DULL_PINK)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block WARPED_CRAFTING_TABLE = registerBlock("warped_crafting_table",
            new WarpedCraftingTableBlock(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE).mapColor(MapColor.TEAL)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CACTUS_CRAFTING_TABLE = registerBlock("cactus_crafting_table",
            new CactusCraftingTableBlock(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE).mapColor(MapColor.DARK_GREEN)), DecoItemGroup.VARAN_DECO_BLOCKS);

    public static final Block SPRUCE_LADDER = registerBlock("spruce_ladder",
            new LadderBlock(FabricBlockSettings.copyOf(Blocks.LADDER)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block BIRCH_LADDER = registerBlock("birch_ladder",
            new LadderBlock(FabricBlockSettings.copyOf(Blocks.LADDER)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block JUNGLE_LADDER = registerBlock("jungle_ladder",
            new LadderBlock(FabricBlockSettings.copyOf(Blocks.LADDER)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block ACACIA_LADDER = registerBlock("acacia_ladder",
            new LadderBlock(FabricBlockSettings.copyOf(Blocks.LADDER)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block DARK_OAK_LADDER = registerBlock("dark_oak_ladder",
            new LadderBlock(FabricBlockSettings.copyOf(Blocks.LADDER)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block MANGROVE_LADDER = registerBlock("mangrove_ladder",
            new LadderBlock(FabricBlockSettings.copyOf(Blocks.LADDER)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CRIMSON_LADDER = registerBlock("crimson_ladder",
            new LadderBlock(FabricBlockSettings.copyOf(Blocks.LADDER)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block WARPED_LADDER = registerBlock("warped_ladder",
            new LadderBlock(FabricBlockSettings.copyOf(Blocks.LADDER)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CACTUS_LADDER = registerBlock("cactus_ladder",
            new LadderBlock(FabricBlockSettings.copyOf(Blocks.LADDER)), DecoItemGroup.VARAN_DECO_BLOCKS);

    public static final Block CACTUS_PLANK_FENCE = registerBlock("cactus_plank_fence",
            new FenceBlock(FabricBlockSettings.copyOf(DecoBlocks.CACTUS_PLANKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block RED_NETHER_BRICK_FENCE = registerBlock("red_nether_brick_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.RED_NETHER_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block BLUE_NETHER_BRICK_FENCE = registerBlock("blue_nether_brick_fence",
            new FenceBlock(FabricBlockSettings.copyOf(DecoBlocks.BLUE_NETHER_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);

    public static final Block STONE_WALL = registerBlock("stone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block POLISHED_ANDESITE_WALL = registerBlock("polished_andesite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_ANDESITE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block POLISHED_DIORITE_WALL = registerBlock("polished_diorite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_DIORITE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block POLISHED_GRANITE_WALL = registerBlock("polished_granite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_GRANITE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CALCITE_WALL = registerBlock("calcite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.CALCITE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block TUFF_WALL = registerBlock("tuff_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TUFF)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block DRIPSTONE_WALL = registerBlock("dripstone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_SANDSTONE_WALL = registerBlock("cut_sandstone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.CUT_SANDSTONE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block SMOOTH_QUARTZ_WALL = registerBlock("smooth_quartz_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_QUARTZ)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block SMOOTH_SANDSTONE_WALL = registerBlock("smooth_sandstone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_SANDSTONE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block SMOOTH_RED_SANDSTONE_WALL = registerBlock("smooth_red_sandstone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_RED_SANDSTONE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block SMOOTH_STONE_WALL = registerBlock("smooth_stone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block SNOW_WALL = registerBlock("snow_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.SNOW_BLOCK)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block NETHERRACK_WALL = registerBlock("netherrack_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.NETHERRACK)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block PRISMARINE_BRICK_WALL = registerBlock("prismarine_brick_wall",
            new MagmaWallBlock(FabricBlockSettings.copyOf(Blocks.CUT_RED_SANDSTONE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block DARK_PRISMARINE_WALL = registerBlock("dark_prismarine_wall",
            new MagmaWallBlock(FabricBlockSettings.copyOf(Blocks.CUT_RED_SANDSTONE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_RED_SANDSTONE_WALL = registerBlock("cut_red_sandstone_wall",
            new MagmaWallBlock(FabricBlockSettings.copyOf(Blocks.CUT_RED_SANDSTONE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block PACKED_MUD_WALL = registerBlock("packed_mud_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.PACKED_MUD)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block QUARTZ_WALL = registerBlock("quartz_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block QUARTZ_BRICK_WALL = registerBlock("quartz_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block WHITE_TERRACOTTA_WALL = registerBlock("white_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.WHITE_TERRACOTTA)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block ORANGE_TERRACOTTA_WALL = registerBlock("orange_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.ORANGE_TERRACOTTA)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block MAGENTA_TERRACOTTA_WALL = registerBlock("magenta_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.MAGENTA_TERRACOTTA)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block LIGHT_BLUE_TERRACOTTA_WALL = registerBlock("light_blue_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_TERRACOTTA)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block YELLOW_TERRACOTTA_WALL = registerBlock("yellow_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.YELLOW_TERRACOTTA)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block LIME_TERRACOTTA_WALL = registerBlock("lime_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.LIME_TERRACOTTA)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block PINK_TERRACOTTA_WALL = registerBlock("pink_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.PINK_TERRACOTTA)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block GRAY_TERRACOTTA_WALL = registerBlock("gray_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.GRAY_TERRACOTTA)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block LIGHT_GRAY_TERRACOTTA_WALL = registerBlock("light_gray_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_TERRACOTTA)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CYAN_TERRACOTTA_WALL = registerBlock("cyan_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.CYAN_TERRACOTTA)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block PURPLE_TERRACOTTA_WALL = registerBlock("purple_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.PURPLE_TERRACOTTA)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block BLUE_TERRACOTTA_WALL = registerBlock("blue_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.BLUE_TERRACOTTA)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block BROWN_TERRACOTTA_WALL = registerBlock("brown_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.BROWN_TERRACOTTA)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block GREEN_TERRACOTTA_WALL = registerBlock("green_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.GREEN_TERRACOTTA)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block RED_TERRACOTTA_WALL = registerBlock("red_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.RED_TERRACOTTA)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block BLACK_TERRACOTTA_WALL = registerBlock("black_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.BLACK_TERRACOTTA)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block TERRACOTTA_WALL = registerBlock("terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block PACKED_ICE_WALL = registerBlock("packed_ice_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.PACKED_ICE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block MAGMA_WALL = registerBlock("magma_wall",
            new MagmaWallBlock(FabricBlockSettings.copyOf(Blocks.MAGMA_BLOCK)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block WHITE_CONCRETE_WALL = registerBlock("white_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.WHITE_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block ORANGE_CONCRETE_WALL = registerBlock("orange_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.ORANGE_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block MAGENTA_CONCRETE_WALL = registerBlock("magenta_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.MAGENTA_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block LIGHT_BLUE_CONCRETE_WALL = registerBlock("light_blue_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block YELLOW_CONCRETE_WALL = registerBlock("yellow_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.YELLOW_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block LIME_CONCRETE_WALL = registerBlock("lime_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.LIME_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block PINK_CONCRETE_WALL = registerBlock("pink_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.PINK_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block GRAY_CONCRETE_WALL = registerBlock("gray_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.GRAY_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block LIGHT_GRAY_CONCRETE_WALL = registerBlock("light_gray_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CYAN_CONCRETE_WALL = registerBlock("cyan_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.CYAN_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block PURPLE_CONCRETE_WALL = registerBlock("purple_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.PURPLE_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block BLUE_CONCRETE_WALL = registerBlock("blue_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.BLUE_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block BROWN_CONCRETE_WALL = registerBlock("brown_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.BROWN_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block GREEN_CONCRETE_WALL = registerBlock("green_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.GREEN_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block RED_CONCRETE_WALL = registerBlock("red_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.RED_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block BLACK_CONCRETE_WALL = registerBlock("black_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.BLACK_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block BLUE_ICE_WALL = registerBlock("blue_ice_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.BLUE_ICE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block POLISHED_STONE_WALL = registerBlock("polished_stone_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.POLISHED_STONE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block STONE_TILE_WALL = registerBlock("stone_tile_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.STONE_TILES)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_SANDSTONE_BRICK_WALL = registerBlock("cut_sandstone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_SANDSTONE_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block SNOW_BRICK_WALL = registerBlock("snow_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.SNOW_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block WHITE_TERRACOTTA_BRICK_WALL = registerBlock("white_terracotta_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.WHITE_TERRACOTTA_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block ORANGE_TERRACOTTA_BRICK_WALL = registerBlock("orange_terracotta_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.ORANGE_TERRACOTTA_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block MAGENTA_TERRACOTTA_BRICK_WALL = registerBlock("magenta_terracotta_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.MAGENTA_TERRACOTTA_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block LIGHT_BLUE_TERRACOTTA_BRICK_WALL = registerBlock("light_blue_terracotta_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block YELLOW_TERRACOTTA_BRICK_WALL = registerBlock("yellow_terracotta_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.YELLOW_TERRACOTTA_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block LIME_TERRACOTTA_BRICK_WALL = registerBlock("lime_terracotta_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.LIME_TERRACOTTA_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block PINK_TERRACOTTA_BRICK_WALL = registerBlock("pink_terracotta_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.PINK_TERRACOTTA_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block GRAY_TERRACOTTA_BRICK_WALL = registerBlock("gray_terracotta_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.GRAY_TERRACOTTA_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block LIGHT_GRAY_TERRACOTTA_BRICK_WALL = registerBlock("light_gray_terracotta_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CYAN_TERRACOTTA_BRICK_WALL = registerBlock("cyan_terracotta_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.CYAN_TERRACOTTA_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block PURPLE_TERRACOTTA_BRICK_WALL = registerBlock("purple_terracotta_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.PURPLE_TERRACOTTA_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block BLUE_TERRACOTTA_BRICK_WALL = registerBlock("blue_terracotta_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.BLUE_TERRACOTTA_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block BROWN_TERRACOTTA_BRICK_WALL = registerBlock("brown_terracotta_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.BROWN_TERRACOTTA_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block GREEN_TERRACOTTA_BRICK_WALL = registerBlock("green_terracotta_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.GREEN_TERRACOTTA_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block RED_TERRACOTTA_BRICK_WALL = registerBlock("red_terracotta_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.RED_TERRACOTTA_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block BLACK_TERRACOTTA_BRICK_WALL = registerBlock("black_terracotta_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.BLACK_TERRACOTTA_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block TERRACOTTA_BRICK_WALL = registerBlock("terracotta_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.TERRACOTTA_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block SOUL_SOILSTONE_WALL = registerBlock("soul_soilstone_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.SOUL_SOILSTONE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_SOUL_SOILSTONE_WALL = registerBlock("cut_soul_soilstone_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_SOUL_SOILSTONE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block SMOOTH_SOUL_SOILSTONE_WALL = registerBlock("smooth_soul_soilstone_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.SMOOTH_SOUL_SOILSTONE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_SOUL_SOILSTONE_BRICK_WALL = registerBlock("cut_soul_soilstone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_QUARTZ_WALL = registerBlock("cut_quartz_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_QUARTZ)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block ICE_BRICK_WALL = registerBlock("ice_brick_wall",
            new MagmaWallBlock(FabricBlockSettings.copyOf(DecoBlocks.ICE_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_WHITE_CONCRETE_WALL = registerBlock("cut_white_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_WHITE_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_ORANGE_CONCRETE_WALL = registerBlock("cut_orange_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_ORANGE_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_MAGENTA_CONCRETE_WALL = registerBlock("cut_magenta_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_MAGENTA_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_LIGHT_BLUE_CONCRETE_WALL = registerBlock("cut_light_blue_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_LIGHT_BLUE_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_YELLOW_CONCRETE_WALL = registerBlock("cut_yellow_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_YELLOW_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_LIME_CONCRETE_WALL = registerBlock("cut_lime_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_LIME_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_PINK_CONCRETE_WALL = registerBlock("cut_pink_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_PINK_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_GRAY_CONCRETE_WALL = registerBlock("cut_gray_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_GRAY_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_LIGHT_GRAY_CONCRETE_WALL = registerBlock("cut_light_gray_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_LIGHT_GRAY_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_CYAN_CONCRETE_WALL = registerBlock("cut_cyan_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_CYAN_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_PURPLE_CONCRETE_WALL = registerBlock("cut_purple_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_PURPLE_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_BLUE_CONCRETE_WALL = registerBlock("cut_blue_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_BLUE_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_BROWN_CONCRETE_WALL = registerBlock("cut_brown_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_BROWN_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_GREEN_CONCRETE_WALL = registerBlock("cut_green_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_GREEN_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_RED_CONCRETE_WALL = registerBlock("cut_red_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_RED_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_BLACK_CONCRETE_WALL = registerBlock("cut_black_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_BLACK_CONCRETE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CRYSTALLIZED_PRISMARINE_WALL = registerBlock("crystallized_prismarine_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.CRYSTALLIZED_PRISMARINE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CRYSTALLIZED_PRISMARINE_BRICK_WALL = registerBlock("crystallized_prismarine_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block LIGHT_PRISMARINE_WALL = registerBlock("light_prismarine_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.LIGHT_PRISMARINE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_RED_SANDSTONE_BRICK_WALL = registerBlock("cut_red_sandstone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_RED_SANDSTONE_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block MAGMA_BRICK_WALL = registerBlock("magma_brick_wall",
            new MagmaBrickWallBlock(FabricBlockSettings.copyOf(DecoBlocks.MAGMA_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block BUBBLE_WALL = registerBlock("bubble_wall",
            new BubbleWallBlock(FabricBlockSettings.copyOf(DecoBlocks.BUBBLE_BLOCK)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block BUBBLE_BRICK_WALL = registerBlock("bubble_brick_wall",
            new BubbleWallBlock(FabricBlockSettings.copyOf(DecoBlocks.BUBBLE_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block BLUE_NETHER_BRICK_WALL = registerBlock("blue_nether_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.BLUE_NETHER_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block POLISHED_BLACKSTONE_TILE_WALL = registerBlock("polished_blackstone_tile_wall",
            new MagmaWallBlock(FabricBlockSettings.copyOf(DecoBlocks.POLISHED_BLACKSTONE_TILES)), DecoItemGroup.VARAN_DECO_BLOCKS);

    public static final Block TINTED_GLASS_PANE = registerBlock("tinted_glass_pane",
            new TintedGlassPaneBlock(FabricBlockSettings.copyOf(Blocks.BLACK_STAINED_GLASS_PANE).nonOpaque()), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block HARDENED_GLASS_PANE = registerBlock("hardened_glass_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.GLASS_PANE).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block HARDENED_TINTED_GLASS_PANE = registerBlock("hardened_tinted_glass_pane",
            new PaneBlock(FabricBlockSettings.copyOf(DecoBlocks.TINTED_GLASS_PANE).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block HARDENED_WHITE_STAINED_GLASS_PANE = registerBlock("hardened_white_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.WHITE,FabricBlockSettings.copyOf(Blocks.WHITE_STAINED_GLASS_PANE).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block HARDENED_ORANGE_STAINED_GLASS_PANE = registerBlock("hardened_orange_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.ORANGE,FabricBlockSettings.copyOf(Blocks.ORANGE_STAINED_GLASS_PANE).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block HARDENED_MAGENTA_STAINED_GLASS_PANE = registerBlock("hardened_magenta_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.MAGENTA,FabricBlockSettings.copyOf(Blocks.MAGENTA_STAINED_GLASS_PANE).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()), DecoItemGroup.VARAN_DECO_BLOCKS);

    public static final Block OAK_BARREL = registerBlock("oak_barrel",
            new BarrelBlock(FabricBlockSettings.copyOf(Blocks.BARREL).mapColor(MapColor.OAK_TAN)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block SPRUCE_BARREL = registerBlock("spruce_barrel",
            new BarrelBlock(FabricBlockSettings.copyOf(Blocks.BARREL)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block BIRCH_BARREL = registerBlock("birch_barrel",
            new BarrelBlock(FabricBlockSettings.copyOf(Blocks.BARREL).mapColor(MapColor.PALE_YELLOW)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block JUNGLE_BARREL = registerBlock("jungle_barrel",
            new BarrelBlock(FabricBlockSettings.copyOf(Blocks.BARREL).mapColor(MapColor.DIRT_BROWN)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block ACACIA_BARREL = registerBlock("acacia_barrel",
            new BarrelBlock(FabricBlockSettings.copyOf(Blocks.BARREL).mapColor(MapColor.ORANGE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block DARK_OAK_BARREL = registerBlock("dark_oak_barrel",
            new BarrelBlock(FabricBlockSettings.copyOf(Blocks.BARREL).mapColor(MapColor.BROWN)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block MANGROVE_BARREL = registerBlock("mangrove_barrel",
            new BarrelBlock(FabricBlockSettings.copyOf(Blocks.BARREL).mapColor(MapColor.RED)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CRIMSON_BARREL = registerBlock("crimson_barrel",
            new BarrelBlock(FabricBlockSettings.copyOf(Blocks.BARREL).mapColor(MapColor.DULL_PINK)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block WARPED_BARREL = registerBlock("warped_barrel",
            new BarrelBlock(FabricBlockSettings.copyOf(Blocks.BARREL).mapColor(MapColor.DARK_AQUA)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CACTUS_BARREL = registerBlock("cactus_barrel",
            new BarrelBlock(FabricBlockSettings.copyOf(Blocks.BARREL).mapColor(MapColor.PALE_GREEN)), DecoItemGroup.VARAN_DECO_BLOCKS);

    public static final Block OAK_CARTOGRAPHY_TABLE = registerBlock("oak_cartography_table",
            new OakCartographyTableBlock(FabricBlockSettings.copyOf(Blocks.CARTOGRAPHY_TABLE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block BIRCH_CARTOGRAPHY_TABLE = registerBlock("birch_cartography_table",
            new BirchCartographyTableBlock(FabricBlockSettings.copyOf(Blocks.CARTOGRAPHY_TABLE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block SPRUCE_CARTOGRAPHY_TABLE = registerBlock("spruce_cartography_table",
            new SpruceCartographyTableBlock(FabricBlockSettings.copyOf(Blocks.CARTOGRAPHY_TABLE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block JUNGLE_CARTOGRAPHY_TABLE = registerBlock("jungle_cartography_table",
            new JungleCartographyTableBlock(FabricBlockSettings.copyOf(Blocks.CARTOGRAPHY_TABLE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block ACACIA_CARTOGRAPHY_TABLE = registerBlock("acacia_cartography_table",
            new AcaciaCartographyTableBlock(FabricBlockSettings.copyOf(Blocks.CARTOGRAPHY_TABLE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block DARK_OAK_CARTOGRAPHY_TABLE = registerBlock("dark_oak_cartography_table",
            new DarkOakCartographyTableBlock(FabricBlockSettings.copyOf(Blocks.CARTOGRAPHY_TABLE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block MANGROVE_CARTOGRAPHY_TABLE = registerBlock("mangrove_cartography_table",
            new MangroveCartographyTableBlock(FabricBlockSettings.copyOf(Blocks.CARTOGRAPHY_TABLE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CRIMSON_CARTOGRAPHY_TABLE = registerBlock("crimson_cartography_table",
            new CrimsonCartographyTableBlock(FabricBlockSettings.copyOf(Blocks.CARTOGRAPHY_TABLE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block WARPED_CARTOGRAPHY_TABLE = registerBlock("warped_cartography_table",
            new WarpedCartographyTableBlock(FabricBlockSettings.copyOf(Blocks.CARTOGRAPHY_TABLE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CACTUS_CARTOGRAPHY_TABLE = registerBlock("cactus_cartography_table",
            new CactusCartographyTableBlock(FabricBlockSettings.copyOf(Blocks.CARTOGRAPHY_TABLE)), DecoItemGroup.VARAN_DECO_BLOCKS);

    public static final Block OAK_SMITHING_TABLE = registerBlock("oak_smithing_table",
            new OakSmithingTableBlock(FabricBlockSettings.copyOf(Blocks.SMITHING_TABLE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block SPRUCE_SMITHING_TABLE = registerBlock("spruce_smithing_table",
            new SpruceSmithingTableBlock(FabricBlockSettings.copyOf(Blocks.SMITHING_TABLE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block BIRCH_SMITHING_TABLE = registerBlock("birch_smithing_table",
            new BirchSmithingTableBlock(FabricBlockSettings.copyOf(Blocks.SMITHING_TABLE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block JUNGLE_SMITHING_TABLE = registerBlock("jungle_smithing_table",
            new JungleSmithingTableBlock(FabricBlockSettings.copyOf(Blocks.SMITHING_TABLE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block ACACIA_SMITHING_TABLE = registerBlock("acacia_smithing_table",
            new AcaciaSmithingTableBlock(FabricBlockSettings.copyOf(Blocks.SMITHING_TABLE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block DARK_OAK_SMITHING_TABLE = registerBlock("dark_oak_smithing_table",
            new DarkOakSmithingTableBlock(FabricBlockSettings.copyOf(Blocks.SMITHING_TABLE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block MANGROVE_SMITHING_TABLE = registerBlock("mangrove_smithing_table",
            new MangroveSmithingTableBlock(FabricBlockSettings.copyOf(Blocks.SMITHING_TABLE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CRIMSON_SMITHING_TABLE = registerBlock("crimson_smithing_table",
            new CrimsonSmithingTableBlock(FabricBlockSettings.copyOf(Blocks.SMITHING_TABLE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block WARPED_SMITHING_TABLE = registerBlock("warped_smithing_table",
            new WarpedSmithingTableBlock(FabricBlockSettings.copyOf(Blocks.SMITHING_TABLE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CACTUS_SMITHING_TABLE = registerBlock("cactus_smithing_table",
            new CactusSmithingTableBlock(FabricBlockSettings.copyOf(Blocks.SMITHING_TABLE)), DecoItemGroup.VARAN_DECO_BLOCKS);

    public static final Block CACTUS_PLANK_PRESSURE_PLATE = registerBlock("cactus_plank_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(DecoBlocks.CACTUS_PLANKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CACTUS_PLANK_BUTTON = registerBlock("cactus_plank_button",
            new WoodenButtonBlock(FabricBlockSettings.copyOf(DecoBlocks.CACTUS_PLANKS)), DecoItemGroup.VARAN_DECO_BLOCKS);

    public static final Block CACTUS_DOOR = registerBlock("cactus_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR).mapColor(MapColor.PALE_GREEN).nonOpaque()), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CACTUS_TRAPDOOR = registerBlock("cactus_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR).mapColor(MapColor.PALE_GREEN).nonOpaque()), DecoItemGroup.VARAN_DECO_BLOCKS);

    public static final Block CACTUS_PLANK_FENCE_GATE = registerBlock("cactus_plank_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(DecoBlocks.CACTUS_PLANKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block NETHER_BRICK_FENCE_GATE = registerBlock("nether_brick_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.NETHER_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block RED_NETHER_BRICK_FENCE_GATE = registerBlock("red_nether_brick_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.RED_NETHER_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block BLUE_NETHER_BRICK_FENCE_GATE = registerBlock("blue_nether_brick_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(DecoBlocks.BLUE_NETHER_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);

    public static final Identifier CACTUS_SIGN_TEXTURE = new Identifier(VaranDeco.MOD_ID,"entity/signs/cactus");

    public static final Block STANDING_CACTUS_SIGN = registerBlockWithoutItem("standing_cactus_sign",
            new TerraformSignBlock(CACTUS_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_SIGN)));
    public static final Block WALL_CACTUS_SIGN = registerBlockWithoutItem("wall_cactus_sign",
            new TerraformWallSignBlock(CACTUS_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_WALL_SIGN)));

    public static final Block STONE_TEMP = registerBlock("stone_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)), ItemGroup.SEARCH);
    public static final Block SMOOTH_STONE_TEMP = registerBlock("smooth_stone_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)), ItemGroup.SEARCH);
    public static final Block POLISHED_ANDESITE_TEMP = registerBlock("polished_andesite_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)), ItemGroup.SEARCH);
    public static final Block POLISHED_DIORITE_TEMP = registerBlock("polished_diorite_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)), ItemGroup.SEARCH);
    public static final Block POLISHED_GRANITE_TEMP = registerBlock("polished_granite_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)), ItemGroup.SEARCH);
    public static final Block DRIPSTONE_TEMP = registerBlock("dripstone_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)), ItemGroup.SEARCH);
    public static final Block CALCITE_TEMP = registerBlock("calcite_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)), ItemGroup.SEARCH);
    public static final Block TUFF_TEMP = registerBlock("tuff_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)), ItemGroup.SEARCH);
    public static final Block PACKED_MUD_TEMP = registerBlock("packed_mud_temp",
            new Block(FabricBlockSettings.of(Material.WOOD).strength(0f)), ItemGroup.SEARCH);
    public static final Block NETHER_BRICKS_TEMP = registerBlock("nether_bricks_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)), ItemGroup.SEARCH);
    public static final Block RED_NETHER_BRICKS_TEMP = registerBlock("red_nether_bricks_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)), ItemGroup.SEARCH);
    public static final Block NETHERRACK_TEMP = registerBlock("netherrack_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)), ItemGroup.SEARCH);
    public static final Block MAGMA_TEMP = registerBlock("magma_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)), ItemGroup.SEARCH);
    public static final Block SNOW_TEMP = registerBlock("snow_temp",
            new Block(FabricBlockSettings.of(Material.SNOW_BLOCK).strength(0f)), ItemGroup.SEARCH);
    public static final Block PACKED_ICE_TEMP = registerBlock("packed_ice_temp",
            new Block(FabricBlockSettings.of(Material.DENSE_ICE).strength(0f)), ItemGroup.SEARCH);
    public static final Block BLUE_ICE_TEMP = registerBlock("blue_ice_temp",
            new Block(FabricBlockSettings.of(Material.DENSE_ICE).strength(0f)), ItemGroup.SEARCH);
    public static final Block SANDSTONE_TOP_TEMP = registerBlock("sandstone_top_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)), ItemGroup.SEARCH);
    public static final Block RED_SANDSTONE_TOP_TEMP = registerBlock("red_sandstone_top_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)), ItemGroup.SEARCH);
    public static final Block DARK_PRISMARINE_TEMP = registerBlock("dark_prismarine_temp",
            new Block(FabricBlockSettings.of(Material.DENSE_ICE).strength(0f)), ItemGroup.SEARCH);
    public static final Block PRISMARINE_BRICKS_TEMP = registerBlock("prismarine_bricks_temp",
            new Block(FabricBlockSettings.of(Material.DENSE_ICE).strength(0f)), ItemGroup.SEARCH);
    public static final Block QUARTZ_TEMP = registerBlock("quartz_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)), ItemGroup.SEARCH);
    public static final Block SMOOTH_QUARTZ_TEMP = registerBlock("smooth_quartz_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)), ItemGroup.SEARCH);
    public static final Block QUARTZ_BRICKS_TEMP = registerBlock("quartz_bricks_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)), ItemGroup.SEARCH);
    public static final Block TERRACOTTA_TEMP = registerBlock("terracotta_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)), ItemGroup.SEARCH);
    public static final Block WHITE_TERRACOTTA_TEMP = registerBlock("white_terracotta_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)), ItemGroup.SEARCH);
    public static final Block LIGHT_GRAY_TERRACOTTA_TEMP = registerBlock("light_gray_terracotta_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)), ItemGroup.SEARCH);
    public static final Block GRAY_TERRACOTTA_TEMP = registerBlock("gray_terracotta_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)), ItemGroup.SEARCH);
    public static final Block BLACK_TERRACOTTA_TEMP = registerBlock("black_terracotta_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)), ItemGroup.SEARCH);
    public static final Block BROWN_TERRACOTTA_TEMP = registerBlock("brown_terracotta_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)), ItemGroup.SEARCH);
    public static final Block RED_TERRACOTTA_TEMP = registerBlock("red_terracotta_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)), ItemGroup.SEARCH);
    public static final Block ORANGE_TERRACOTTA_TEMP = registerBlock("orange_terracotta_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)), ItemGroup.SEARCH);
    public static final Block YELLOW_TERRACOTTA_TEMP = registerBlock("yellow_terracotta_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)), ItemGroup.SEARCH);
    public static final Block LIME_TERRACOTTA_TEMP = registerBlock("lime_terracotta_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)), ItemGroup.SEARCH);
    public static final Block GREEN_TERRACOTTA_TEMP = registerBlock("green_terracotta_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)), ItemGroup.SEARCH);
    public static final Block CYAN_TERRACOTTA_TEMP = registerBlock("cyan_terracotta_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)), ItemGroup.SEARCH);
    public static final Block LIGHT_BLUE_TERRACOTTA_TEMP = registerBlock("light_blue_terracotta_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)), ItemGroup.SEARCH);
    public static final Block BLUE_TERRACOTTA_TEMP = registerBlock("blue_terracotta_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)), ItemGroup.SEARCH);
    public static final Block PURPLE_TERRACOTTA_TEMP = registerBlock("purple_terracotta_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)), ItemGroup.SEARCH);
    public static final Block MAGENTA_TERRACOTTA_TEMP = registerBlock("magenta_terracotta_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)), ItemGroup.SEARCH);
    public static final Block PINK_TERRACOTTA_TEMP = registerBlock("pink_terracotta_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)), ItemGroup.SEARCH);
    public static final Block WHITE_CONCRETE_TEMP = registerBlock("white_concrete_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)), ItemGroup.SEARCH);
    public static final Block LIGHT_GRAY_CONCRETE_TEMP = registerBlock("light_gray_concrete_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)), ItemGroup.SEARCH);
    public static final Block GRAY_CONCRETE_TEMP = registerBlock("gray_concrete_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)), ItemGroup.SEARCH);
    public static final Block BLACK_CONCRETE_TEMP = registerBlock("black_concrete_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)), ItemGroup.SEARCH);
    public static final Block BROWN_CONCRETE_TEMP = registerBlock("brown_concrete_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)), ItemGroup.SEARCH);
    public static final Block RED_CONCRETE_TEMP = registerBlock("red_concrete_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)), ItemGroup.SEARCH);
    public static final Block ORANGE_CONCRETE_TEMP = registerBlock("orange_concrete_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)), ItemGroup.SEARCH);
    public static final Block YELLOW_CONCRETE_TEMP = registerBlock("yellow_concrete_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)), ItemGroup.SEARCH);
    public static final Block LIME_CONCRETE_TEMP = registerBlock("lime_concrete_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)), ItemGroup.SEARCH);
    public static final Block GREEN_CONCRETE_TEMP = registerBlock("green_concrete_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)), ItemGroup.SEARCH);
    public static final Block CYAN_CONCRETE_TEMP = registerBlock("cyan_concrete_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)), ItemGroup.SEARCH);
    public static final Block LIGHT_BLUE_CONCRETE_TEMP = registerBlock("light_blue_concrete_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)), ItemGroup.SEARCH);
    public static final Block BLUE_CONCRETE_TEMP = registerBlock("blue_concrete_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)), ItemGroup.SEARCH);
    public static final Block PURPLE_CONCRETE_TEMP = registerBlock("purple_concrete_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)), ItemGroup.SEARCH);
    public static final Block MAGENTA_CONCRETE_TEMP = registerBlock("magenta_concrete_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)), ItemGroup.SEARCH);
    public static final Block PINK_CONCRETE_TEMP = registerBlock("pink_concrete_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)), ItemGroup.SEARCH);
    public static final BlockFamily CACTUS_FAMILY = BlockFamilies.register(DecoBlocks.CACTUS_PLANKS)
            .sign(DecoBlocks.STANDING_CACTUS_SIGN,DecoBlocks.WALL_CACTUS_SIGN)
            .group("wooden").unlockCriterionName("has_planks").build();

    private static Block registerBlockWithoutItem(String name, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(VaranDeco.MOD_ID, name), block);
    }
    private static Block registerBlock(String name, Block block, ItemGroup tab){
        registerBlockItem(name,block,tab);
        return Registry.register(Registry.BLOCK,new Identifier(VaranDeco.MOD_ID,name),block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab){
        return Registry.register(Registry.ITEM,new Identifier(VaranDeco.MOD_ID, name),
                new BlockItem(block, new Item.Settings().group(tab)));
    }

    public static void registerDecoBlocks(){
        VaranDeco.LOGGER.debug("Registering Blocks for " + VaranDeco.MOD_ID);
    }
}
