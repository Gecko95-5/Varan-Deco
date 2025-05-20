package net.gecko.varandeco.block;

import com.terraformersmc.terraform.sign.api.block.TerraformHangingSignBlock;
import com.terraformersmc.terraform.sign.api.block.TerraformSignBlock;
import com.terraformersmc.terraform.sign.api.block.TerraformWallHangingSignBlock;
import com.terraformersmc.terraform.sign.api.block.TerraformWallSignBlock;
import net.gecko.varandeco.VaranDeco;
import net.gecko.varandeco.block.barrel.*;
import net.gecko.varandeco.block.cartographytables.*;
import net.gecko.varandeco.block.craftingtables.*;
import net.gecko.varandeco.block.custom.BlackIceBlock;
import net.gecko.varandeco.block.custom.TintedGlassPaneBlock;
import net.gecko.varandeco.block.custom.WarpedWartBlock;
import net.gecko.varandeco.block.flowers.*;
import net.gecko.varandeco.block.magmabubbleblocks.*;
import net.gecko.varandeco.block.oxidizable.*;
import net.gecko.varandeco.block.smithingtables.*;
import net.gecko.varandeco.block.stonemadeblocks.*;
import net.gecko.varandeco.world.feature.tree.DecoSaplingGenerators;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.data.family.BlockFamilies;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;

public class DecoBlocks {
    public static final Block CACTUS_PLANKS = registerBlock("cactus_planks",
            new Block(AbstractBlock.Settings.create().strength(2.0f,3.0f)
                    .sounds(BlockSoundGroup.WOOD).mapColor(MapColor.PALE_GREEN)));
    public static final Block WOODEN_PLANKS = registerBlock("wooden_planks",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.BROWN).strength(2.0f,3.0f)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block CHARCOAL_BLOCK = registerBlock("charcoal_block",
            new Block(AbstractBlock.Settings.create().requiresTool()
                    .strength(5.0F, 6.0F).sounds(BlockSoundGroup.WOOD).mapColor(MapColor.SPRUCE_BROWN)));
    public static final Block FLINT_BLOCK = registerBlock("flint_block",
            new Block(AbstractBlock.Settings.create().requiresTool().strength(5.0F, 6.0F)
                    .sounds(BlockSoundGroup.DEEPSLATE_BRICKS)));
    public static final Block ECHO_BLOCK = registerBlock("echo_block",
            new Block(AbstractBlock.Settings.create().requiresTool().strength(2.0F, 3.0F)
                    .sounds(BlockSoundGroup.SCULK_CATALYST).luminance(state -> 7).mapColor(MapColor.BLACK)));
    public static final Block CUT_IRON = registerBlock("cut_iron",
            new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));
    public static final Block CUT_IRON_STAIRS = registerBlock("cut_iron_stairs",
            new StairsBlock(DecoBlocks.CUT_IRON.getDefaultState(),AbstractBlock.Settings.copy(DecoBlocks.CUT_IRON)));
    public static final Block CUT_IRON_SLAB = registerBlock("cut_iron_slab",
            new SlabBlock(AbstractBlock.Settings.copy(DecoBlocks.CUT_IRON)));
    public static final Block CHISELED_IRON = registerBlock("chiseled_iron",
            new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));
    public static final Block IRON_GRATE = registerBlock("iron_grate",
            new GrateBlock(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.CHAIN)
                    .mapColor(MapColor.DARK_AQUA).nonOpaque()));
    public static final Block WOODEN_LOG = registerBlock("wooden_log",
            createLogBlock(MapColor.BROWN, MapColor.TERRACOTTA_BROWN));
    public static final Block STRIPPED_WOODEN_LOG = registerBlock("stripped_wooden_log",
            createLogBlock(MapColor.BROWN, MapColor.BROWN));
    public static final Block STRIPPED_WOODEN_WOOD = registerBlock("stripped_wooden_wood",
            new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.TERRACOTTA_BROWN).strength(2.0f,2.0f)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block WOODEN_WOOD = registerBlock("wooden_wood",
            new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.BROWN).strength(2.0f,2.0f)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block HARDENED_GLASS = registerBlock("hardened_glass",
            new TransparentBlock(AbstractBlock.Settings.copy(Blocks.GLASS).strength(25.0f,100.0f)
                    .nonOpaque().requiresTool()));
    public static final Block HARDENED_TINTED_GLASS = registerBlock("hardened_tinted_glass",
            new TintedGlassBlock(AbstractBlock.Settings.copy(Blocks.TINTED_GLASS).strength(25.0f,100.0f)
                    .nonOpaque().requiresTool()));
    public static final Block CUT_SANDSTONE_BRICKS = registerBlock("cut_sandstone_bricks",
            new Block(AbstractBlock.Settings.create().strength(1.6f).requiresTool()));
    public static final Block SMOOTH_PURPUR = registerBlock("smooth_purpur",
            new Block(AbstractBlock.Settings.copy(Blocks.PURPUR_BLOCK)));
    public static final Block SMOOTH_DEEPSLATE = registerBlock("smooth_deepslate",
            new Block(AbstractBlock.Settings.copy(Blocks.DEEPSLATE).strength(3.5f,6.0f)
                    .mapColor(MapColor.IRON_GRAY)));
    public static final Block SMOOTH_BLACKSTONE = registerBlock("smooth_blackstone",
            new Block(AbstractBlock.Settings.copy(Blocks.BLACKSTONE).strength(2.0f,6.0f)
                    .mapColor(MapColor.DARK_AQUA)));
    public static final Block SMOOTH_TUFF = registerBlock("smooth_tuff",
            new Block(AbstractBlock.Settings.copy(Blocks.TUFF).strength(2.0f,6.0f)
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)));
    public static final Block CHISELED_BRICKS = registerBlock("chiseled_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.BRICKS)));
    public static final Block CHISELED_OBSIDIAN = registerBlock("chiseled_obsidian",
            new Block(AbstractBlock.Settings.copy(Blocks.OBSIDIAN).mapColor(MapColor.PURPLE)));
    public static final Block OBSIDIAN_BRICKS = registerBlock("obsidian_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.OBSIDIAN).mapColor(MapColor.PURPLE)));
    public static final Block OBSIDIAN_PILLAR = registerBlock("obsidian_pillar",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OBSIDIAN).mapColor(MapColor.PURPLE)));
    public static final Block CHISELED_PURPUR = registerBlock("chiseled_purpur",
            new Block(AbstractBlock.Settings.copy(Blocks.PURPUR_BLOCK)));
    public static final Block PURPUR_BRICKS = registerBlock("purpur_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.PURPUR_BLOCK)));
    public static final Block SNOW_BRICKS = registerBlock("snow_bricks",
            new Block(AbstractBlock.Settings.create().slipperiness(0.89F)
                    .strength(1.0f).resistance(0.7f).requiresTool().sounds(BlockSoundGroup.SNOW)));
    public static final Block POLISHED_STONE = registerBlock("polished_stone",
            new Block(AbstractBlock.Settings.create().strength(2.5f).resistance(6.0f).requiresTool()));
    public static final Block STONE_TILES = registerBlock("stone_tiles",
            new Block(AbstractBlock.Settings.create().strength(1.5f).resistance(6.0f).requiresTool()));
    public static final Block CHISELED_SNOW_BRICKS = registerBlock("chiseled_snow_bricks",
            new Block(AbstractBlock.Settings.copy(DecoBlocks.SNOW_BRICKS)));
    public static final Block CHISELED_END_STONE = registerBlock("chiseled_end_stone",
            new Block(AbstractBlock.Settings.copy(Blocks.END_STONE)));
    public static final Block VOID_STONE = registerBlock("void_stone",
            new Block(AbstractBlock.Settings.copy(Blocks.END_STONE).sounds(BlockSoundGroup.DEEPSLATE)
                    .mapColor(MapColor.TERRACOTTA_BLUE).strength(5.0F, 12.0F)));
    public static final Block VOID_STONE_BRICKS = registerBlock("void_stone_bricks",
            new Block(AbstractBlock.Settings.copy(DecoBlocks.VOID_STONE)));
    public static final Block CHISELED_VOID_STONE = registerBlock("chiseled_void_stone",
            new Block(AbstractBlock.Settings.copy(DecoBlocks.VOID_STONE).luminance(state -> 1)));
    public static final Block CUT_QUARTZ = registerBlock("cut_quartz",
            new Block(AbstractBlock.Settings.copy(Blocks.QUARTZ_BLOCK)));
    public static final Block WHITE_TERRACOTTA_BRICKS = registerBlock("white_terracotta_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.WHITE_TERRACOTTA)));
    public static final Block ORANGE_TERRACOTTA_BRICKS = registerBlock("orange_terracotta_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.ORANGE_TERRACOTTA)));
    public static final Block MAGENTA_TERRACOTTA_BRICKS = registerBlock("magenta_terracotta_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.MAGENTA_TERRACOTTA)));
    public static final Block LIGHT_BLUE_TERRACOTTA_BRICKS = registerBlock("light_blue_terracotta_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_TERRACOTTA)));
    public static final Block YELLOW_TERRACOTTA_BRICKS = registerBlock("yellow_terracotta_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.YELLOW_TERRACOTTA)));
    public static final Block LIME_TERRACOTTA_BRICKS = registerBlock("lime_terracotta_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.LIME_TERRACOTTA)));
    public static final Block PINK_TERRACOTTA_BRICKS = registerBlock("pink_terracotta_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.PINK_TERRACOTTA)));
    public static final Block GRAY_TERRACOTTA_BRICKS = registerBlock("gray_terracotta_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.GRAY_TERRACOTTA)));
    public static final Block LIGHT_GRAY_TERRACOTTA_BRICKS = registerBlock("light_gray_terracotta_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_TERRACOTTA)));
    public static final Block CYAN_TERRACOTTA_BRICKS = registerBlock("cyan_terracotta_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.CYAN_TERRACOTTA)));
    public static final Block PURPLE_TERRACOTTA_BRICKS = registerBlock("purple_terracotta_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.PURPLE_TERRACOTTA)));
    public static final Block BLUE_TERRACOTTA_BRICKS = registerBlock("blue_terracotta_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.BLUE_TERRACOTTA)));
    public static final Block BROWN_TERRACOTTA_BRICKS = registerBlock("brown_terracotta_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.BROWN_TERRACOTTA)));
    public static final Block GREEN_TERRACOTTA_BRICKS = registerBlock("green_terracotta_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.GREEN_TERRACOTTA)));
    public static final Block RED_TERRACOTTA_BRICKS = registerBlock("red_terracotta_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.RED_TERRACOTTA)));
    public static final Block BLACK_TERRACOTTA_BRICKS = registerBlock("black_terracotta_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.BLACK_TERRACOTTA)));
    public static final Block TERRACOTTA_BRICKS = registerBlock("terracotta_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.TERRACOTTA)));
    public static final Block HARDENED_WHITE_STAINED_GLASS = registerBlock("hardened_white_stained_glass",
            new StainedGlassBlock(DyeColor.WHITE, AbstractBlock.Settings.copy(Blocks.WHITE_STAINED_GLASS).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()));
    public static final Block HARDENED_ORANGE_STAINED_GLASS = registerBlock("hardened_orange_stained_glass",
            new StainedGlassBlock(DyeColor.ORANGE, AbstractBlock.Settings.copy(Blocks.ORANGE_STAINED_GLASS).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()));
    public static final Block HARDENED_MAGENTA_STAINED_GLASS = registerBlock("hardened_magenta_stained_glass",
            new StainedGlassBlock(DyeColor.MAGENTA, AbstractBlock.Settings.copy(Blocks.MAGENTA_STAINED_GLASS).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()));
    public static final Block HARDENED_LIGHT_BLUE_STAINED_GLASS = registerBlock("hardened_light_blue_stained_glass",
            new StainedGlassBlock(DyeColor.LIGHT_BLUE, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_STAINED_GLASS).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()));
    public static final Block HARDENED_YELLOW_STAINED_GLASS = registerBlock("hardened_yellow_stained_glass",
            new StainedGlassBlock(DyeColor.YELLOW, AbstractBlock.Settings.copy(Blocks.YELLOW_STAINED_GLASS).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()));
    public static final Block HARDENED_LIME_STAINED_GLASS = registerBlock("hardened_lime_stained_glass",
            new StainedGlassBlock(DyeColor.LIME, AbstractBlock.Settings.copy(Blocks.LIME_STAINED_GLASS).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()));
    public static final Block HARDENED_PINK_STAINED_GLASS = registerBlock("hardened_pink_stained_glass",
            new StainedGlassBlock(DyeColor.PINK, AbstractBlock.Settings.copy(Blocks.PINK_STAINED_GLASS).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()));
    public static final Block HARDENED_GRAY_STAINED_GLASS = registerBlock("hardened_gray_stained_glass",
            new StainedGlassBlock(DyeColor.GRAY, AbstractBlock.Settings.copy(Blocks.GRAY_STAINED_GLASS).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()));
    public static final Block HARDENED_LIGHT_GRAY_STAINED_GLASS = registerBlock("hardened_light_gray_stained_glass",
            new StainedGlassBlock(DyeColor.LIGHT_GRAY, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_STAINED_GLASS).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()));
    public static final Block HARDENED_CYAN_STAINED_GLASS = registerBlock("hardened_cyan_stained_glass",
            new StainedGlassBlock(DyeColor.CYAN, AbstractBlock.Settings.copy(Blocks.CYAN_STAINED_GLASS).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()));
    public static final Block HARDENED_PURPLE_STAINED_GLASS = registerBlock("hardened_purple_stained_glass",
            new StainedGlassBlock(DyeColor.PURPLE, AbstractBlock.Settings.copy(Blocks.PURPLE_STAINED_GLASS).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()));
    public static final Block HARDENED_BLUE_STAINED_GLASS = registerBlock("hardened_blue_stained_glass",
            new StainedGlassBlock(DyeColor.BLUE, AbstractBlock.Settings.copy(Blocks.BLUE_STAINED_GLASS).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()));
    public static final Block HARDENED_BROWN_STAINED_GLASS = registerBlock("hardened_brown_stained_glass",
            new StainedGlassBlock(DyeColor.BROWN, AbstractBlock.Settings.copy(Blocks.BROWN_STAINED_GLASS).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()));
    public static final Block HARDENED_GREEN_STAINED_GLASS = registerBlock("hardened_green_stained_glass",
            new StainedGlassBlock(DyeColor.GREEN, AbstractBlock.Settings.copy(Blocks.GREEN_STAINED_GLASS).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()));
    public static final Block HARDENED_RED_STAINED_GLASS = registerBlock("hardened_red_stained_glass",
            new StainedGlassBlock(DyeColor.RED, AbstractBlock.Settings.copy(Blocks.RED_STAINED_GLASS).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()));
    public static final Block HARDENED_BLACK_STAINED_GLASS = registerBlock("hardened_black_stained_glass",
            new StainedGlassBlock(DyeColor.BLACK, AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()));

    public static final Block MOSAIC_WHITE_STAINED_GLASS = registerBlock("mosaic_white_stained_glass",
            new StainedGlassBlock(DyeColor.WHITE, AbstractBlock.Settings.copy(Blocks.WHITE_STAINED_GLASS).strength(0.6F,0.3f)
                    .nonOpaque()));
    public static final Block MOSAIC_ORANGE_STAINED_GLASS = registerBlock("mosaic_orange_stained_glass",
            new StainedGlassBlock(DyeColor.ORANGE, AbstractBlock.Settings.copy(Blocks.ORANGE_STAINED_GLASS).strength(0.6F,0.3f)
                    .nonOpaque()));
    public static final Block MOSAIC_MAGENTA_STAINED_GLASS = registerBlock("mosaic_magenta_stained_glass",
            new StainedGlassBlock(DyeColor.MAGENTA, AbstractBlock.Settings.copy(Blocks.MAGENTA_STAINED_GLASS).strength(0.6F,0.3f)
                    .nonOpaque()));
    public static final Block MOSAIC_LIGHT_BLUE_STAINED_GLASS = registerBlock("mosaic_light_blue_stained_glass",
            new StainedGlassBlock(DyeColor.LIGHT_BLUE, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_STAINED_GLASS).strength(0.6F,0.3f)
                    .nonOpaque()));
    public static final Block MOSAIC_YELLOW_STAINED_GLASS = registerBlock("mosaic_yellow_stained_glass",
            new StainedGlassBlock(DyeColor.YELLOW, AbstractBlock.Settings.copy(Blocks.YELLOW_STAINED_GLASS).strength(0.6F,0.3f)
                    .nonOpaque()));
    public static final Block MOSAIC_LIME_STAINED_GLASS = registerBlock("mosaic_lime_stained_glass",
            new StainedGlassBlock(DyeColor.LIME, AbstractBlock.Settings.copy(Blocks.LIME_STAINED_GLASS).strength(0.6F,0.3f)
                    .nonOpaque()));
    public static final Block MOSAIC_PINK_STAINED_GLASS = registerBlock("mosaic_pink_stained_glass",
            new StainedGlassBlock(DyeColor.PINK, AbstractBlock.Settings.copy(Blocks.PINK_STAINED_GLASS).strength(0.6F,0.3f)
                    .nonOpaque()));
    public static final Block MOSAIC_GRAY_STAINED_GLASS = registerBlock("mosaic_gray_stained_glass",
            new StainedGlassBlock(DyeColor.GRAY, AbstractBlock.Settings.copy(Blocks.GRAY_STAINED_GLASS).strength(0.6F,0.3f)
                    .nonOpaque()));
    public static final Block MOSAIC_LIGHT_GRAY_STAINED_GLASS = registerBlock("mosaic_light_gray_stained_glass",
            new StainedGlassBlock(DyeColor.LIGHT_GRAY, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_STAINED_GLASS).strength(0.6F,0.3f)
                    .nonOpaque()));
    public static final Block MOSAIC_CYAN_STAINED_GLASS = registerBlock("mosaic_cyan_stained_glass",
            new StainedGlassBlock(DyeColor.CYAN, AbstractBlock.Settings.copy(Blocks.CYAN_STAINED_GLASS).strength(0.6F,0.3f)
                    .nonOpaque()));
    public static final Block MOSAIC_PURPLE_STAINED_GLASS = registerBlock("mosaic_purple_stained_glass",
            new StainedGlassBlock(DyeColor.PURPLE, AbstractBlock.Settings.copy(Blocks.PURPLE_STAINED_GLASS).strength(0.6F,0.3f)
                    .nonOpaque()));
    public static final Block MOSAIC_BLUE_STAINED_GLASS = registerBlock("mosaic_blue_stained_glass",
            new StainedGlassBlock(DyeColor.BLUE, AbstractBlock.Settings.copy(Blocks.BLUE_STAINED_GLASS).strength(0.6F,0.3f)
                    .nonOpaque()));
    public static final Block MOSAIC_BROWN_STAINED_GLASS = registerBlock("mosaic_brown_stained_glass",
            new StainedGlassBlock(DyeColor.BROWN, AbstractBlock.Settings.copy(Blocks.BROWN_STAINED_GLASS).strength(0.6F,0.3f)
                    .nonOpaque()));
    public static final Block MOSAIC_GREEN_STAINED_GLASS = registerBlock("mosaic_green_stained_glass",
            new StainedGlassBlock(DyeColor.GREEN, AbstractBlock.Settings.copy(Blocks.GREEN_STAINED_GLASS).strength(0.6F,0.3f)
                    .nonOpaque()));
    public static final Block MOSAIC_RED_STAINED_GLASS = registerBlock("mosaic_red_stained_glass",
            new StainedGlassBlock(DyeColor.RED, AbstractBlock.Settings.copy(Blocks.RED_STAINED_GLASS).strength(0.6F,0.3f)
                    .nonOpaque()));
    public static final Block MOSAIC_BLACK_STAINED_GLASS = registerBlock("mosaic_black_stained_glass",
            new StainedGlassBlock(DyeColor.BLACK, AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS).strength(0.6F,0.3f)
                    .nonOpaque()));

    public static final Block CUT_RED_SANDSTONE_BRICKS = registerBlock("cut_red_sandstone_bricks",
            new Block(AbstractBlock.Settings.create().strength(1.6f).requiresTool()));
    public static final Block CHISELED_PRISMARINE_BRICKS = registerBlock("chiseled_prismarine_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.PRISMARINE).mapColor(MapColor.DIAMOND_BLUE)));
    public static final Block CRYSTALLIZED_PRISMARINE = registerBlock("crystallized_prismarine",
            new Block(AbstractBlock.Settings.copy(Blocks.PRISMARINE).mapColor(MapColor.BRIGHT_TEAL)
                    .luminance(state -> 3).sounds(BlockSoundGroup.GLASS)));
    public static final Block CRYSTALLIZED_PRISMARINE_BRICKS = registerBlock("crystallized_prismarine_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.PRISMARINE).mapColor(MapColor.BRIGHT_TEAL)
                    .luminance(state -> 3).sounds(BlockSoundGroup.GLASS)));
    public static final Block CHISELED_CRYSTALLIZED_PRISMARINE_BRICKS = registerBlock("chiseled_crystallized_prismarine_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.PRISMARINE).mapColor(MapColor.BRIGHT_TEAL)
                    .luminance(state -> 3).sounds(BlockSoundGroup.GLASS)));
    public static final Block LIGHT_PRISMARINE = registerBlock("light_prismarine",
            new Block(AbstractBlock.Settings.copy(Blocks.PRISMARINE).mapColor(MapColor.OFF_WHITE)
                    .luminance(state -> 5).sounds(BlockSoundGroup.GLASS)));
    public static final Block ICE_BRICKS = registerBlock("ice_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.PACKED_ICE).strength(1.4f)));
    public static final Block SOUL_SOILSTONE = registerBlock("soul_soilstone",
            new Block(AbstractBlock.Settings.create().strength(0.8f).requiresTool().mapColor(MapColor.BROWN)));
    public static final Block CHISELED_SOUL_SOILSTONE = registerBlock("chiseled_soul_soilstone",
            new Block(AbstractBlock.Settings.copy(DecoBlocks.SOUL_SOILSTONE)));
    public static final Block CUT_SOUL_SOILSTONE = registerBlock("cut_soul_soilstone",
            new Block(AbstractBlock.Settings.copy(DecoBlocks.SOUL_SOILSTONE)));
    public static final Block SMOOTH_SOUL_SOILSTONE = registerBlock("smooth_soul_soilstone",
            new Block(AbstractBlock.Settings.copy(DecoBlocks.SOUL_SOILSTONE)));
    public static final Block CUT_SOUL_SOILSTONE_BRICKS = registerBlock("cut_soul_soilstone_bricks",
            new Block(AbstractBlock.Settings.copy(DecoBlocks.CUT_SOUL_SOILSTONE)));
    public static final Block MAGMA_BRICKS = registerBlock("magma_bricks",
            new MagmaBrickBlock(AbstractBlock.Settings.copy(Blocks.MAGMA_BLOCK).luminance(state -> 1)
                    .strength(1.5F).sounds(BlockSoundGroup.NETHER_BRICKS)));
    public static final Block CHISELED_MAGMA_BRICKS = registerBlock("chiseled_magma_bricks",
            new MagmaBrickBlock(AbstractBlock.Settings.copy(DecoBlocks.MAGMA_BRICKS)));
    public static final Block BUBBLE_BLOCK = registerBlock("bubble_block",
            new BubbleBlock(AbstractBlock.Settings.copy(Blocks.COBBLESTONE).strength(0.5F,25.0f)
                    .mapColor(MapColor.BLUE)));
    public static final Block BUBBLE_BRICKS = registerBlock("bubble_bricks",
            new BubbleBlock(AbstractBlock.Settings.copy(DecoBlocks.BUBBLE_BLOCK).strength(1.5F)
                    .mapColor(MapColor.STONE_GRAY)));
    public static final Block CHISELED_BUBBLE_BRICKS = registerBlock("chiseled_bubble_bricks",
            new BubbleBlock(AbstractBlock.Settings.copy(DecoBlocks.BUBBLE_BRICKS)));
    public static final Block CHISELED_RED_NETHER_BRICKS = registerBlock("chiseled_red_nether_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.RED_NETHER_BRICKS)));
    public static final Block CRACKED_RED_NETHER_BRICKS = registerBlock("cracked_red_nether_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.RED_NETHER_BRICKS)));
    public static final Block BLUE_NETHER_BRICKS = registerBlock("blue_nether_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.NETHER_BRICKS).mapColor(MapColor.TEAL)));
    public static final Block CHISELED_BLUE_NETHER_BRICKS = registerBlock("chiseled_blue_nether_bricks",
            new Block(AbstractBlock.Settings.copy(DecoBlocks.BLUE_NETHER_BRICKS)));
    public static final Block CRACKED_BLUE_NETHER_BRICKS = registerBlock("cracked_blue_nether_bricks",
            new Block(AbstractBlock.Settings.copy(DecoBlocks.BLUE_NETHER_BRICKS)));
    public static final Block CUT_WHITE_CONCRETE = registerBlock("cut_white_concrete",
            new Block(AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE)));
    public static final Block CUT_ORANGE_CONCRETE = registerBlock("cut_orange_concrete",
            new Block(AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE)));
    public static final Block CUT_MAGENTA_CONCRETE = registerBlock("cut_magenta_concrete",
            new Block(AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE)));
    public static final Block CUT_LIGHT_BLUE_CONCRETE = registerBlock("cut_light_blue_concrete",
            new Block(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE)));
    public static final Block CUT_YELLOW_CONCRETE = registerBlock("cut_yellow_concrete",
            new Block(AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE)));
    public static final Block CUT_LIME_CONCRETE = registerBlock("cut_lime_concrete",
            new Block(AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE)));
    public static final Block CUT_PINK_CONCRETE = registerBlock("cut_pink_concrete",
            new Block(AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE)));
    public static final Block CUT_GRAY_CONCRETE = registerBlock("cut_gray_concrete",
            new Block(AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE)));
    public static final Block CUT_LIGHT_GRAY_CONCRETE = registerBlock("cut_light_gray_concrete",
            new Block(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE)));
    public static final Block CUT_CYAN_CONCRETE = registerBlock("cut_cyan_concrete",
            new Block(AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE)));
    public static final Block CUT_PURPLE_CONCRETE = registerBlock("cut_purple_concrete",
            new Block(AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE)));
    public static final Block CUT_BLUE_CONCRETE = registerBlock("cut_blue_concrete",
            new Block(AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE)));
    public static final Block CUT_BROWN_CONCRETE = registerBlock("cut_brown_concrete",
            new Block(AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE)));
    public static final Block CUT_GREEN_CONCRETE = registerBlock("cut_green_concrete",
            new Block(AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE)));
    public static final Block CUT_RED_CONCRETE = registerBlock("cut_red_concrete",
            new Block(AbstractBlock.Settings.copy(Blocks.RED_CONCRETE)));
    public static final Block CUT_BLACK_CONCRETE = registerBlock("cut_black_concrete",
            new Block(AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE)));
    public static final Block WHITE_CONCRETE_PILLAR = registerBlock("white_concrete_pillar",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE)));
    public static final Block ORANGE_CONCRETE_PILLAR = registerBlock("orange_concrete_pillar",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE)));
    public static final Block MAGENTA_CONCRETE_PILLAR = registerBlock("magenta_concrete_pillar",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE)));
    public static final Block LIGHT_BLUE_CONCRETE_PILLAR = registerBlock("light_blue_concrete_pillar",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE)));
    public static final Block YELLOW_CONCRETE_PILLAR = registerBlock("yellow_concrete_pillar",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE)));
    public static final Block LIME_CONCRETE_PILLAR = registerBlock("lime_concrete_pillar",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE)));
    public static final Block PINK_CONCRETE_PILLAR = registerBlock("pink_concrete_pillar",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE)));
    public static final Block GRAY_CONCRETE_PILLAR = registerBlock("gray_concrete_pillar",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE)));
    public static final Block LIGHT_GRAY_CONCRETE_PILLAR = registerBlock("light_gray_concrete_pillar",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE)));
    public static final Block CYAN_CONCRETE_PILLAR = registerBlock("cyan_concrete_pillar",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE)));
    public static final Block PURPLE_CONCRETE_PILLAR = registerBlock("purple_concrete_pillar",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE)));
    public static final Block BLUE_CONCRETE_PILLAR = registerBlock("blue_concrete_pillar",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE)));
    public static final Block BROWN_CONCRETE_PILLAR = registerBlock("brown_concrete_pillar",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE)));
    public static final Block GREEN_CONCRETE_PILLAR = registerBlock("green_concrete_pillar",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE)));
    public static final Block RED_CONCRETE_PILLAR = registerBlock("red_concrete_pillar",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.RED_CONCRETE)));
    public static final Block BLACK_CONCRETE_PILLAR = registerBlock("black_concrete_pillar",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE)));
    public static final Block POLISHED_GLIDED_BLACKSTONE = registerBlock("polished_gilded_blackstone",
            new Block(AbstractBlock.Settings.copy(Blocks.GILDED_BLACKSTONE).strength(2.5f)));
    public static final Block CHISELED_GLIDED_BLACKSTONE = registerBlock("chiseled_gilded_blackstone",
            new Block(AbstractBlock.Settings.copy(DecoBlocks.POLISHED_GLIDED_BLACKSTONE)));
    public static final Block POLISHED_BLACKSTONE_TILES = registerBlock("polished_blackstone_tiles",
            new Block(AbstractBlock.Settings.create().strength(1.5f).resistance(6.0f).requiresTool().mapColor(MapColor.BLACK)));
    public static final Block BLACK_ICE = registerBlock("black_ice",
            new BlackIceBlock(AbstractBlock.Settings.create().slipperiness(1.18F)
                    .strength(5.6f).requiresTool().sounds(BlockSoundGroup.STONE).velocityMultiplier(0.9F)
                    .mapColor(MapColor.BLACK).pistonBehavior(PistonBehavior.BLOCK)));
    public static final Block WHITE_BLOCK = registerBlock("white_block",
            new Block(AbstractBlock.Settings.create().resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE).mapColor(DyeColor.WHITE)));
    public static final Block ORANGE_BLOCK = registerBlock("orange_block",
            new Block(AbstractBlock.Settings.create().resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE).mapColor(DyeColor.ORANGE)));
    public static final Block MAGENTA_BLOCK = registerBlock("magenta_block",
            new Block(AbstractBlock.Settings.create().resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE).mapColor(DyeColor.MAGENTA)));
    public static final Block LIGHT_BLUE_BLOCK = registerBlock("light_blue_block",
            new Block(AbstractBlock.Settings.create().resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE).mapColor(DyeColor.LIGHT_BLUE)));
    public static final Block YELLOW_BLOCK = registerBlock("yellow_block",
            new Block(AbstractBlock.Settings.create().resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE).mapColor(DyeColor.YELLOW)));
    public static final Block LIME_BLOCK = registerBlock("lime_block",
            new Block(AbstractBlock.Settings.create().resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE).mapColor(DyeColor.LIME)));
    public static final Block PINK_BLOCK = registerBlock("pink_block",
            new Block(AbstractBlock.Settings.create().resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE).mapColor(DyeColor.PINK)));
    public static final Block GRAY_BLOCK = registerBlock("gray_block",
            new Block(AbstractBlock.Settings.create().resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE).mapColor(DyeColor.GRAY)));
    public static final Block LIGHT_GRAY_BLOCK = registerBlock("light_gray_block",
            new Block(AbstractBlock.Settings.create().resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE).mapColor(DyeColor.LIGHT_GRAY)));
    public static final Block CYAN_BLOCK = registerBlock("cyan_block",
            new Block(AbstractBlock.Settings.create().resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE).mapColor(DyeColor.CYAN)));
    public static final Block PURPLE_BLOCK = registerBlock("purple_block",
            new Block(AbstractBlock.Settings.create().resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE).mapColor(DyeColor.PURPLE)));
    public static final Block BLUE_BLOCK = registerBlock("blue_block",
            new Block(AbstractBlock.Settings.create().resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE).mapColor(DyeColor.BLUE)));
    public static final Block BROWN_BLOCK = registerBlock("brown_block",
            new Block(AbstractBlock.Settings.create().resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE).mapColor(DyeColor.BROWN)));
    public static final Block GREEN_BLOCK = registerBlock("green_block",
            new Block(AbstractBlock.Settings.create().resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE).mapColor(DyeColor.GREEN)));
    public static final Block RED_BLOCK = registerBlock("red_block",
            new Block(AbstractBlock.Settings.create().resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE).mapColor(DyeColor.RED)));
    public static final Block BLACK_BLOCK = registerBlock("black_block",
            new Block(AbstractBlock.Settings.create().resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE).mapColor(DyeColor.BLACK)));
    public static final Block TUFF_TILES = registerBlock("tuff_tiles",
            new Block(AbstractBlock.Settings.create().strength(1.5f).resistance(6.0f).requiresTool()
                    .mapColor(MapColor.TERRACOTTA_GRAY).sounds(BlockSoundGroup.TUFF_BRICKS)));
    public static final Block CHISELED_STONE = registerBlock("chiseled_stone",
            new Block(AbstractBlock.Settings.copy(DecoBlocks.POLISHED_STONE)));
    public static final Block CHISELED_POLISHED_BLACKSTONE_BRICKS = registerBlock("chiseled_polished_blackstone_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final Block CHISELED_DEEPSLATE_BRICKS = registerBlock("chiseled_deepslate_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_BRICKS)));

    public static final Block OAK_MOSAIC = registerBlock("oak_mosaic",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));
    public static final Block SPRUCE_MOSAIC = registerBlock("spruce_mosaic",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.SPRUCE_PLANKS)));
    public static final Block BIRCH_MOSAIC = registerBlock("birch_mosaic",
            new Block(AbstractBlock.Settings.copy(Blocks.BIRCH_PLANKS)));
    public static final Block JUNGLE_MOSAIC = registerBlock("jungle_mosaic",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.JUNGLE_PLANKS)));
    public static final Block ACACIA_MOSAIC = registerBlock("acacia_mosaic",
            new Block(AbstractBlock.Settings.copy(Blocks.ACACIA_PLANKS)));
    public static final Block DARK_OAK_MOSAIC = registerBlock("dark_oak_mosaic",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.DARK_OAK_PLANKS)));
    public static final Block MANGROVE_MOSAIC = registerBlock("mangrove_mosaic",
            new Block(AbstractBlock.Settings.copy(Blocks.MANGROVE_PLANKS)));
    public static final Block CHERRY_MOSAIC = registerBlock("cherry_mosaic",
            new Block(AbstractBlock.Settings.copy(Blocks.CHERRY_PLANKS)));
    public static final Block CRIMSON_MOSAIC = registerBlock("crimson_mosaic",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.CRIMSON_PLANKS)));
    public static final Block WARPED_MOSAIC = registerBlock("warped_mosaic",
            new Block(AbstractBlock.Settings.copy(Blocks.WARPED_PLANKS)));
    public static final Block CACTUS_MOSAIC = registerBlock("cactus_mosaic",
            new PillarBlock(AbstractBlock.Settings.copy(DecoBlocks.CACTUS_PLANKS)));
    public static final Block WOODEN_MOSAIC = registerBlock("wooden_mosaic",
            new Block(AbstractBlock.Settings.copy(DecoBlocks.WOODEN_PLANKS)));

    public static final Block OAK_MOSAIC_STAIRS = registerBlock("oak_mosaic_stairs",
            new StairsBlock(DecoBlocks.OAK_MOSAIC.getDefaultState(),AbstractBlock.Settings.copy(DecoBlocks.OAK_MOSAIC)));
    public static final Block SPRUCE_MOSAIC_STAIRS = registerBlock("spruce_mosaic_stairs",
            new StairsBlock(DecoBlocks.SPRUCE_MOSAIC.getDefaultState(),AbstractBlock.Settings.copy(DecoBlocks.SPRUCE_MOSAIC)));
    public static final Block BIRCH_MOSAIC_STAIRS = registerBlock("birch_mosaic_stairs",
            new StairsBlock(DecoBlocks.BIRCH_MOSAIC.getDefaultState(),AbstractBlock.Settings.copy(DecoBlocks.BIRCH_MOSAIC)));
    public static final Block JUNGLE_MOSAIC_STAIRS = registerBlock("jungle_mosaic_stairs",
            new StairsBlock(DecoBlocks.JUNGLE_MOSAIC.getDefaultState(),AbstractBlock.Settings.copy(DecoBlocks.JUNGLE_MOSAIC)));
    public static final Block ACACIA_MOSAIC_STAIRS = registerBlock("acacia_mosaic_stairs",
            new StairsBlock(DecoBlocks.ACACIA_MOSAIC.getDefaultState(),AbstractBlock.Settings.copy(DecoBlocks.ACACIA_MOSAIC)));
    public static final Block DARK_OAK_MOSAIC_STAIRS = registerBlock("dark_oak_mosaic_stairs",
            new StairsBlock(DecoBlocks.DARK_OAK_MOSAIC.getDefaultState(),AbstractBlock.Settings.copy(DecoBlocks.DARK_OAK_MOSAIC)));
    public static final Block MANGROVE_MOSAIC_STAIRS = registerBlock("mangrove_mosaic_stairs",
            new StairsBlock(DecoBlocks.MANGROVE_MOSAIC.getDefaultState(),AbstractBlock.Settings.copy(DecoBlocks.MANGROVE_MOSAIC)));
    public static final Block CHERRY_MOSAIC_STAIRS = registerBlock("cherry_mosaic_stairs",
            new StairsBlock(DecoBlocks.CHERRY_MOSAIC.getDefaultState(),AbstractBlock.Settings.copy(DecoBlocks.CHERRY_MOSAIC)));
    public static final Block CRIMSON_MOSAIC_STAIRS = registerBlock("crimson_mosaic_stairs",
            new StairsBlock(DecoBlocks.CRIMSON_MOSAIC.getDefaultState(),AbstractBlock.Settings.copy(DecoBlocks.CRIMSON_MOSAIC)));
    public static final Block WARPED_MOSAIC_STAIRS = registerBlock("warped_mosaic_stairs",
            new StairsBlock(DecoBlocks.WARPED_MOSAIC.getDefaultState(),AbstractBlock.Settings.copy(DecoBlocks.WARPED_MOSAIC)));
    public static final Block CACTUS_MOSAIC_STAIRS = registerBlock("cactus_mosaic_stairs",
            new StairsBlock(DecoBlocks.CACTUS_MOSAIC.getDefaultState(),AbstractBlock.Settings.copy(DecoBlocks.CACTUS_MOSAIC)));
    public static final Block WOODEN_MOSAIC_STAIRS = registerBlock("wooden_mosaic_stairs",
            new StairsBlock(DecoBlocks.WOODEN_MOSAIC.getDefaultState(),AbstractBlock.Settings.copy(DecoBlocks.WOODEN_MOSAIC)));

    public static final Block OAK_MOSAIC_SLAB = registerBlock("oak_mosaic_slab",
            new SlabBlock(AbstractBlock.Settings.copy(DecoBlocks.OAK_MOSAIC)));
    public static final Block SPRUCE_MOSAIC_SLAB = registerBlock("spruce_mosaic_slab",
            new SlabBlock(AbstractBlock.Settings.copy(DecoBlocks.SPRUCE_MOSAIC)));
    public static final Block BIRCH_MOSAIC_SLAB = registerBlock("birch_mosaic_slab",
            new SlabBlock(AbstractBlock.Settings.copy(DecoBlocks.BIRCH_MOSAIC)));
    public static final Block JUNGLE_MOSAIC_SLAB = registerBlock("jungle_mosaic_slab",
            new SlabBlock(AbstractBlock.Settings.copy(DecoBlocks.JUNGLE_MOSAIC)));
    public static final Block ACACIA_MOSAIC_SLAB = registerBlock("acacia_mosaic_slab",
            new SlabBlock(AbstractBlock.Settings.copy(DecoBlocks.ACACIA_MOSAIC)));
    public static final Block DARK_OAK_MOSAIC_SLAB = registerBlock("dark_oak_mosaic_slab",
            new SlabBlock(AbstractBlock.Settings.copy(DecoBlocks.DARK_OAK_MOSAIC)));
    public static final Block MANGROVE_MOSAIC_SLAB = registerBlock("mangrove_mosaic_slab",
            new SlabBlock(AbstractBlock.Settings.copy(DecoBlocks.MANGROVE_MOSAIC)));
    public static final Block CHERRY_MOSAIC_SLAB = registerBlock("cherry_mosaic_slab",
            new SlabBlock(AbstractBlock.Settings.copy(DecoBlocks.CHERRY_MOSAIC)));
    public static final Block CRIMSON_MOSAIC_SLAB = registerBlock("crimson_mosaic_slab",
            new SlabBlock(AbstractBlock.Settings.copy(DecoBlocks.CRIMSON_MOSAIC)));
    public static final Block WARPED_MOSAIC_SLAB = registerBlock("warped_mosaic_slab",
            new SlabBlock(AbstractBlock.Settings.copy(DecoBlocks.WARPED_MOSAIC)));
    public static final Block CACTUS_MOSAIC_SLAB = registerBlock("cactus_mosaic_slab",
            new SlabBlock(AbstractBlock.Settings.copy(DecoBlocks.CACTUS_MOSAIC)));
    public static final Block WOODEN_MOSAIC_SLAB = registerBlock("wooden_mosaic_slab",
            new SlabBlock(AbstractBlock.Settings.copy(DecoBlocks.WOODEN_MOSAIC)));

    public static final Block WARPED_WART_PLANT = registerBlockWithoutItem("warped_wart_plant",
            new WarpedWartBlock(AbstractBlock.Settings.copy(Blocks.NETHER_WART).mapColor(MapColor.BRIGHT_TEAL).nonOpaque()));

    public static final Block DEEPSLATE_STAIRS = registerBlock("deepslate_stairs",
            new StairsBlock(Blocks.DEEPSLATE.getDefaultState(),AbstractBlock.Settings.copy(Blocks.DEEPSLATE)));
    public static final Block CALCITE_STAIRS = registerBlock("calcite_stairs",
            new StairsBlock(Blocks.CALCITE.getDefaultState(),AbstractBlock.Settings.copy(Blocks.CALCITE)));
    public static final Block DRIPSTONE_STAIRS = registerBlock("dripstone_stairs",
            new StairsBlock(Blocks.DRIPSTONE_BLOCK.getDefaultState(),AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK)));
    public static final Block CUT_SANDSTONE_STAIRS = registerBlock("cut_sandstone_stairs",
            new StairsBlock(Blocks.CUT_SANDSTONE.getDefaultState(),AbstractBlock.Settings.copy(Blocks.CUT_SANDSTONE)));
    public static final Block SMOOTH_STONE_STAIRS = registerBlock("smooth_stone_stairs",
            new StairsBlock(Blocks.SMOOTH_STONE.getDefaultState(),AbstractBlock.Settings.copy(Blocks.SMOOTH_STONE)));
    public static final Block OBSIDIAN_STAIRS = registerBlock("obsidian_stairs",
            new StairsBlock(Blocks.OBSIDIAN.getDefaultState(),AbstractBlock.Settings.copy(Blocks.OBSIDIAN)));
    public static final Block SNOW_STAIRS = registerBlock("snow_stairs",
            new StairsBlock(Blocks.SNOW_BLOCK.getDefaultState(),AbstractBlock.Settings.copy(Blocks.SNOW_BLOCK)));
    public static final Block NETHERRACK_STAIRS = registerBlock("netherrack_stairs",
            new StairsBlock(Blocks.NETHERRACK.getDefaultState(),AbstractBlock.Settings.copy(Blocks.NETHERRACK)));
    public static final Block PACKED_MUD_STAIRS = registerBlock("packed_mud_stairs",
            new StairsBlock(Blocks.PACKED_MUD.getDefaultState(),AbstractBlock.Settings.copy(Blocks.PACKED_MUD)));
    public static final Block QUARTZ_BRICK_STAIRS = registerBlock("quartz_brick_stairs",
            new StairsBlock(Blocks.QUARTZ_BRICKS.getDefaultState(),AbstractBlock.Settings.copy(Blocks.QUARTZ_BRICKS)));
    public static final Block END_STONE_STAIRS = registerBlock("end_stone_stairs",
            new StairsBlock(Blocks.END_STONE.getDefaultState(),AbstractBlock.Settings.copy(Blocks.END_STONE)));
    public static final Block WHITE_TERRACOTTA_STAIRS = registerBlock("white_terracotta_stairs",
            new StairsBlock(Blocks.WHITE_TERRACOTTA.getDefaultState(),AbstractBlock.Settings.copy(Blocks.WHITE_TERRACOTTA)));
    public static final Block ORANGE_TERRACOTTA_STAIRS = registerBlock("orange_terracotta_stairs",
            new StairsBlock(Blocks.ORANGE_TERRACOTTA.getDefaultState(),AbstractBlock.Settings.copy(Blocks.ORANGE_TERRACOTTA)));
    public static final Block MAGENTA_TERRACOTTA_STAIRS = registerBlock("magenta_terracotta_stairs",
            new StairsBlock(Blocks.MAGENTA_TERRACOTTA.getDefaultState(),AbstractBlock.Settings.copy(Blocks.MAGENTA_TERRACOTTA)));
    public static final Block LIGHT_BLUE_TERRACOTTA_STAIRS = registerBlock("light_blue_terracotta_stairs",
            new StairsBlock(Blocks.LIGHT_BLUE_TERRACOTTA.getDefaultState(),AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_TERRACOTTA)));
    public static final Block YELLOW_TERRACOTTA_STAIRS = registerBlock("yellow_terracotta_stairs",
            new StairsBlock(Blocks.YELLOW_TERRACOTTA.getDefaultState(),AbstractBlock.Settings.copy(Blocks.YELLOW_TERRACOTTA)));
    public static final Block LIME_TERRACOTTA_STAIRS = registerBlock("lime_terracotta_stairs",
            new StairsBlock(Blocks.LIME_TERRACOTTA.getDefaultState(),AbstractBlock.Settings.copy(Blocks.LIME_TERRACOTTA)));
    public static final Block PINK_TERRACOTTA_STAIRS = registerBlock("pink_terracotta_stairs",
            new StairsBlock(Blocks.PINK_TERRACOTTA.getDefaultState(),AbstractBlock.Settings.copy(Blocks.PINK_TERRACOTTA)));
    public static final Block GRAY_TERRACOTTA_STAIRS = registerBlock("gray_terracotta_stairs",
            new StairsBlock(Blocks.GRAY_TERRACOTTA.getDefaultState(),AbstractBlock.Settings.copy(Blocks.GRAY_TERRACOTTA)));
    public static final Block LIGHT_GRAY_TERRACOTTA_STAIRS = registerBlock("light_gray_terracotta_stairs",
            new StairsBlock(Blocks.LIGHT_GRAY_TERRACOTTA.getDefaultState(),AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_TERRACOTTA)));
    public static final Block CYAN_TERRACOTTA_STAIRS = registerBlock("cyan_terracotta_stairs",
            new StairsBlock(Blocks.CYAN_TERRACOTTA.getDefaultState(),AbstractBlock.Settings.copy(Blocks.CYAN_TERRACOTTA)));
    public static final Block PURPLE_TERRACOTTA_STAIRS = registerBlock("purple_terracotta_stairs",
            new StairsBlock(Blocks.PURPLE_TERRACOTTA.getDefaultState(),AbstractBlock.Settings.copy(Blocks.PURPLE_TERRACOTTA)));
    public static final Block BLUE_TERRACOTTA_STAIRS = registerBlock("blue_terracotta_stairs",
            new StairsBlock(Blocks.BLUE_TERRACOTTA.getDefaultState(),AbstractBlock.Settings.copy(Blocks.BLUE_TERRACOTTA)));
    public static final Block BROWN_TERRACOTTA_STAIRS = registerBlock("brown_terracotta_stairs",
            new StairsBlock(Blocks.BROWN_TERRACOTTA.getDefaultState(),AbstractBlock.Settings.copy(Blocks.BROWN_TERRACOTTA)));
    public static final Block GREEN_TERRACOTTA_STAIRS = registerBlock("green_terracotta_stairs",
            new StairsBlock(Blocks.GREEN_TERRACOTTA.getDefaultState(),AbstractBlock.Settings.copy(Blocks.GREEN_TERRACOTTA)));
    public static final Block RED_TERRACOTTA_STAIRS = registerBlock("red_terracotta_stairs",
            new StairsBlock(Blocks.RED_TERRACOTTA.getDefaultState(),AbstractBlock.Settings.copy(Blocks.RED_TERRACOTTA)));
    public static final Block BLACK_TERRACOTTA_STAIRS = registerBlock("black_terracotta_stairs",
            new StairsBlock(Blocks.BLACK_TERRACOTTA.getDefaultState(),AbstractBlock.Settings.copy(Blocks.BLACK_TERRACOTTA)));
    public static final Block TERRACOTTA_STAIRS = registerBlock("terracotta_stairs",
            new StairsBlock(Blocks.TERRACOTTA.getDefaultState(),AbstractBlock.Settings.copy(Blocks.TERRACOTTA)));
    public static final Block PACKED_ICE_STAIRS = registerBlock("packed_ice_stairs",
            new StairsBlock(Blocks.PACKED_ICE.getDefaultState(),AbstractBlock.Settings.copy(Blocks.PACKED_ICE)));
    public static final Block CUT_RED_SANDSTONE_STAIRS = registerBlock("cut_red_sandstone_stairs",
            new StairsBlock(Blocks.CUT_RED_SANDSTONE.getDefaultState(),AbstractBlock.Settings.copy(Blocks.CUT_RED_SANDSTONE)));
    public static final Block MAGMA_STAIRS = registerBlock("magma_stairs",
            new MagmaStairBlock(Blocks.MAGMA_BLOCK.getDefaultState(),AbstractBlock.Settings.copy(Blocks.MAGMA_BLOCK)));
    public static final Block WHITE_CONCRETE_STAIRS = registerBlock("white_concrete_stairs",
            new StairsBlock(Blocks.WHITE_CONCRETE.getDefaultState(),AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE)));
    public static final Block ORANGE_CONCRETE_STAIRS = registerBlock("orange_concrete_stairs",
            new StairsBlock(Blocks.ORANGE_CONCRETE.getDefaultState(),AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE)));
    public static final Block MAGENTA_CONCRETE_STAIRS = registerBlock("magenta_concrete_stairs",
            new StairsBlock(Blocks.MAGENTA_CONCRETE.getDefaultState(),AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE)));
    public static final Block LIGHT_BLUE_CONCRETE_STAIRS = registerBlock("light_blue_concrete_stairs",
            new StairsBlock(Blocks.LIGHT_BLUE_CONCRETE.getDefaultState(),AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE)));
    public static final Block YELLOW_CONCRETE_STAIRS = registerBlock("yellow_concrete_stairs",
            new StairsBlock(Blocks.YELLOW_CONCRETE.getDefaultState(),AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE)));
    public static final Block LIME_CONCRETE_STAIRS = registerBlock("lime_concrete_stairs",
            new StairsBlock(Blocks.LIME_CONCRETE.getDefaultState(),AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE)));
    public static final Block PINK_CONCRETE_STAIRS = registerBlock("pink_concrete_stairs",
            new StairsBlock(Blocks.PINK_CONCRETE.getDefaultState(),AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE)));
    public static final Block GRAY_CONCRETE_STAIRS = registerBlock("gray_concrete_stairs",
            new StairsBlock(Blocks.GRAY_CONCRETE.getDefaultState(),AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE)));
    public static final Block LIGHT_GRAY_CONCRETE_STAIRS = registerBlock("light_gray_concrete_stairs",
            new StairsBlock(Blocks.LIGHT_GRAY_CONCRETE.getDefaultState(),AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE)));
    public static final Block CYAN_CONCRETE_STAIRS = registerBlock("cyan_concrete_stairs",
            new StairsBlock(Blocks.CYAN_CONCRETE.getDefaultState(),AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE)));
    public static final Block PURPLE_CONCRETE_STAIRS = registerBlock("purple_concrete_stairs",
            new StairsBlock(Blocks.PURPLE_CONCRETE.getDefaultState(),AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE)));
    public static final Block BLUE_CONCRETE_STAIRS = registerBlock("blue_concrete_stairs",
            new StairsBlock(Blocks.BLUE_CONCRETE.getDefaultState(),AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE)));
    public static final Block BROWN_CONCRETE_STAIRS = registerBlock("brown_concrete_stairs",
            new StairsBlock(Blocks.BROWN_CONCRETE.getDefaultState(),AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE)));
    public static final Block GREEN_CONCRETE_STAIRS = registerBlock("green_concrete_stairs",
            new StairsBlock(Blocks.GREEN_CONCRETE.getDefaultState(),AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE)));
    public static final Block RED_CONCRETE_STAIRS = registerBlock("red_concrete_stairs",
            new StairsBlock(Blocks.RED_CONCRETE.getDefaultState(),AbstractBlock.Settings.copy(Blocks.RED_CONCRETE)));
    public static final Block BLACK_CONCRETE_STAIRS = registerBlock("black_concrete_stairs",
            new StairsBlock(Blocks.BLACK_CONCRETE.getDefaultState(),AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE)));
    public static final Block BLUE_ICE_STAIRS = registerBlock("blue_ice_stairs",
            new StairsBlock(Blocks.BLUE_ICE.getDefaultState(),AbstractBlock.Settings.copy(Blocks.BLUE_ICE)));

    public static final Block POLISHED_STONE_STAIRS = registerBlock("polished_stone_stairs",
            new StairsBlock(DecoBlocks.POLISHED_STONE.getDefaultState(),AbstractBlock.Settings.copy(DecoBlocks.POLISHED_STONE)));
    public static final Block STONE_TILE_STAIRS = registerBlock("stone_tile_stairs",
            new StairsBlock(DecoBlocks.STONE_TILES.getDefaultState(),AbstractBlock.Settings.copy(DecoBlocks.STONE_TILES)));
    public static final Block CACTUS_PLANK_STAIRS = registerBlock("cactus_plank_stairs",
            new StairsBlock(DecoBlocks.CACTUS_PLANKS.getDefaultState(),AbstractBlock.Settings.copy(DecoBlocks.CACTUS_PLANKS)));
    public static final Block WOODEN_STAIRS = registerBlock("wooden_stairs",
            new StairsBlock(DecoBlocks.WOODEN_PLANKS.getDefaultState(),AbstractBlock.Settings.copy(DecoBlocks.WOODEN_PLANKS)));
    public static final Block CUT_SANDSTONE_BRICK_STAIRS = registerBlock("cut_sandstone_brick_stairs",
            new StairsBlock(DecoBlocks.CUT_SANDSTONE_BRICKS.getDefaultState(),AbstractBlock.Settings.copy(DecoBlocks.CUT_SANDSTONE_BRICKS)));
    public static final Block SMOOTH_PURPUR_STAIRS = registerBlock("smooth_purpur_stairs",
            new StairsBlock(DecoBlocks.SMOOTH_PURPUR.getDefaultState(),AbstractBlock.Settings.copy(DecoBlocks.SMOOTH_PURPUR)));
    public static final Block SMOOTH_DEEPSLATE_STAIRS = registerBlock("smooth_deepslate_stairs",
            new StairsBlock(DecoBlocks.SMOOTH_DEEPSLATE.getDefaultState(),AbstractBlock.Settings.copy(DecoBlocks.SMOOTH_DEEPSLATE)));
    public static final Block SMOOTH_BLACKSTONE_STAIRS = registerBlock("smooth_blackstone_stairs",
            new StairsBlock(DecoBlocks.SMOOTH_BLACKSTONE.getDefaultState(),AbstractBlock.Settings.copy(DecoBlocks.SMOOTH_BLACKSTONE)));
    public static final Block SMOOTH_TUFF_STAIRS = registerBlock("smooth_tuff_stairs",
            new StairsBlock(DecoBlocks.SMOOTH_TUFF.getDefaultState(),AbstractBlock.Settings.copy(DecoBlocks.SMOOTH_TUFF)));
    public static final Block OBSIDIAN_BRICK_STAIRS = registerBlock("obsidian_brick_stairs",
            new StairsBlock(DecoBlocks.OBSIDIAN_BRICKS.getDefaultState(),AbstractBlock.Settings.copy(DecoBlocks.OBSIDIAN_BRICKS)));
    public static final Block PURPUR_BRICK_STAIRS = registerBlock("purpur_brick_stairs",
            new StairsBlock(DecoBlocks.PURPUR_BRICKS.getDefaultState(),AbstractBlock.Settings.copy(DecoBlocks.PURPUR_BRICKS)));
    public static final Block SNOW_BRICK_STAIRS = registerBlock("snow_brick_stairs",
            new StairsBlock(DecoBlocks.SNOW_BRICKS.getDefaultState(),AbstractBlock.Settings.copy(DecoBlocks.SNOW_BRICKS)));
    public static final Block VOID_STONE_STAIRS = registerBlock("void_stone_stairs",
            new StairsBlock(DecoBlocks.VOID_STONE.getDefaultState(),AbstractBlock.Settings.copy(DecoBlocks.VOID_STONE)));
    public static final Block VOID_STONE_BRICK_STAIRS = registerBlock("void_stone_brick_stairs",
            new StairsBlock(DecoBlocks.VOID_STONE_BRICKS.getDefaultState(),AbstractBlock.Settings.copy(DecoBlocks.VOID_STONE_BRICKS)));
    public static final Block WHITE_TERRACOTTA_BRICK_STAIRS = registerBlock("white_terracotta_brick_stairs",
            new StairsBlock(DecoBlocks.WHITE_TERRACOTTA_BRICKS.getDefaultState(),AbstractBlock.Settings.copy(DecoBlocks.WHITE_TERRACOTTA_BRICKS)));
    public static final Block ORANGE_TERRACOTTA_BRICK_STAIRS = registerBlock("orange_terracotta_brick_stairs",
            new StairsBlock(DecoBlocks.ORANGE_TERRACOTTA_BRICKS.getDefaultState(),AbstractBlock.Settings.copy(DecoBlocks.ORANGE_TERRACOTTA_BRICKS)));
    public static final Block MAGENTA_TERRACOTTA_BRICK_STAIRS = registerBlock("magenta_terracotta_brick_stairs",
            new StairsBlock(DecoBlocks.MAGENTA_TERRACOTTA_BRICKS.getDefaultState(),AbstractBlock.Settings.copy(DecoBlocks.MAGENTA_TERRACOTTA_BRICKS)));
    public static final Block LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS = registerBlock("light_blue_terracotta_brick_stairs",
            new StairsBlock(DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS.getDefaultState(),AbstractBlock.Settings.copy(DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS)));
    public static final Block YELLOW_TERRACOTTA_BRICK_STAIRS = registerBlock("yellow_terracotta_brick_stairs",
            new StairsBlock(DecoBlocks.YELLOW_TERRACOTTA_BRICKS.getDefaultState(),AbstractBlock.Settings.copy(DecoBlocks.YELLOW_TERRACOTTA_BRICKS)));
    public static final Block LIME_TERRACOTTA_BRICK_STAIRS = registerBlock("lime_terracotta_brick_stairs",
            new StairsBlock(DecoBlocks.LIME_TERRACOTTA_BRICKS.getDefaultState(),AbstractBlock.Settings.copy(DecoBlocks.LIME_TERRACOTTA_BRICKS)));
    public static final Block PINK_TERRACOTTA_BRICK_STAIRS = registerBlock("pink_terracotta_brick_stairs",
            new StairsBlock(DecoBlocks.PINK_TERRACOTTA_BRICKS.getDefaultState(),AbstractBlock.Settings.copy(DecoBlocks.PINK_TERRACOTTA_BRICKS)));
    public static final Block GRAY_TERRACOTTA_BRICK_STAIRS = registerBlock("gray_terracotta_brick_stairs",
            new StairsBlock(DecoBlocks.GRAY_TERRACOTTA_BRICKS.getDefaultState(),AbstractBlock.Settings.copy(DecoBlocks.GRAY_TERRACOTTA_BRICKS)));
    public static final Block LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS = registerBlock("light_gray_terracotta_brick_stairs",
            new StairsBlock(DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS.getDefaultState(),AbstractBlock.Settings.copy(DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS)));
    public static final Block CYAN_TERRACOTTA_BRICK_STAIRS = registerBlock("cyan_terracotta_brick_stairs",
            new StairsBlock(DecoBlocks.CYAN_TERRACOTTA_BRICKS.getDefaultState(),AbstractBlock.Settings.copy(DecoBlocks.CYAN_TERRACOTTA_BRICKS)));
    public static final Block PURPLE_TERRACOTTA_BRICK_STAIRS = registerBlock("purple_terracotta_brick_stairs",
            new StairsBlock(DecoBlocks.PURPLE_TERRACOTTA_BRICKS.getDefaultState(),AbstractBlock.Settings.copy(DecoBlocks.PURPLE_TERRACOTTA_BRICKS)));
    public static final Block BLUE_TERRACOTTA_BRICK_STAIRS = registerBlock("blue_terracotta_brick_stairs",
            new StairsBlock(DecoBlocks.BLUE_TERRACOTTA_BRICKS.getDefaultState(),AbstractBlock.Settings.copy(DecoBlocks.BLUE_TERRACOTTA_BRICKS)));
    public static final Block BROWN_TERRACOTTA_BRICK_STAIRS = registerBlock("brown_terracotta_brick_stairs",
            new StairsBlock(DecoBlocks.BROWN_TERRACOTTA_BRICKS.getDefaultState(),AbstractBlock.Settings.copy(DecoBlocks.BROWN_TERRACOTTA_BRICKS)));
    public static final Block GREEN_TERRACOTTA_BRICK_STAIRS = registerBlock("green_terracotta_brick_stairs",
            new StairsBlock(DecoBlocks.GREEN_TERRACOTTA_BRICKS.getDefaultState(),AbstractBlock.Settings.copy(DecoBlocks.GREEN_TERRACOTTA_BRICKS)));
    public static final Block RED_TERRACOTTA_BRICK_STAIRS = registerBlock("red_terracotta_brick_stairs",
            new StairsBlock(DecoBlocks.RED_TERRACOTTA_BRICKS.getDefaultState(),AbstractBlock.Settings.copy(DecoBlocks.RED_TERRACOTTA_BRICKS)));
    public static final Block BLACK_TERRACOTTA_BRICK_STAIRS = registerBlock("black_terracotta_brick_stairs",
            new StairsBlock(DecoBlocks.BLACK_TERRACOTTA_BRICKS.getDefaultState(),AbstractBlock.Settings.copy(DecoBlocks.BLACK_TERRACOTTA_BRICKS)));
    public static final Block TERRACOTTA_BRICK_STAIRS = registerBlock("terracotta_brick_stairs",
            new StairsBlock(DecoBlocks.TERRACOTTA_BRICKS.getDefaultState(),AbstractBlock.Settings.copy(DecoBlocks.TERRACOTTA_BRICKS)));
    public static final Block SOUL_SOILSTONE_STAIRS = registerBlock("soul_soilstone_stairs",
            new StairsBlock(DecoBlocks.SOUL_SOILSTONE.getDefaultState(),
                    AbstractBlock.Settings.copy(DecoBlocks.SOUL_SOILSTONE)));
    public static final Block CUT_SOUL_SOILSTONE_STAIRS = registerBlock("cut_soul_soilstone_stairs",
            new StairsBlock(DecoBlocks.CUT_SOUL_SOILSTONE.getDefaultState(),
                    AbstractBlock.Settings.copy(DecoBlocks.CUT_SOUL_SOILSTONE)));
    public static final Block SMOOTH_SOUL_SOILSTONE_STAIRS = registerBlock("smooth_soul_soilstone_stairs",
            new StairsBlock(DecoBlocks.SMOOTH_SOUL_SOILSTONE.getDefaultState(),
                    AbstractBlock.Settings.copy(DecoBlocks.SMOOTH_SOUL_SOILSTONE)));
    public static final Block CUT_SOUL_SOILSTONE_BRICK_STAIRS = registerBlock("cut_soul_soilstone_brick_stairs",
            new StairsBlock(DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.copy(DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS)));
    public static final Block CUT_QUARTZ_STAIRS = registerBlock("cut_quartz_stairs",
            new StairsBlock(DecoBlocks.CUT_QUARTZ.getDefaultState(),
                    AbstractBlock.Settings.copy(DecoBlocks.CUT_QUARTZ)));
    public static final Block ICE_BRICK_STAIRS = registerBlock("ice_brick_stairs",
            new StairsBlock(DecoBlocks.ICE_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.copy(DecoBlocks.ICE_BRICKS)));
    public static final Block CUT_WHITE_CONCRETE_STAIRS = registerBlock("cut_white_concrete_stairs",
            new StairsBlock(DecoBlocks.CUT_WHITE_CONCRETE.getDefaultState(),AbstractBlock.Settings.copy(DecoBlocks.CUT_WHITE_CONCRETE)));
    public static final Block CUT_ORANGE_CONCRETE_STAIRS = registerBlock("cut_orange_concrete_stairs",
            new StairsBlock(DecoBlocks.CUT_ORANGE_CONCRETE.getDefaultState(),AbstractBlock.Settings.copy(DecoBlocks.CUT_ORANGE_CONCRETE)));
    public static final Block CUT_MAGENTA_CONCRETE_STAIRS = registerBlock("cut_magenta_concrete_stairs",
            new StairsBlock(DecoBlocks.CUT_MAGENTA_CONCRETE.getDefaultState(),AbstractBlock.Settings.copy(DecoBlocks.CUT_MAGENTA_CONCRETE)));
    public static final Block CUT_LIGHT_BLUE_CONCRETE_STAIRS = registerBlock("cut_light_blue_concrete_stairs",
            new StairsBlock(DecoBlocks.CUT_LIGHT_BLUE_CONCRETE.getDefaultState(),AbstractBlock.Settings.copy(DecoBlocks.CUT_LIGHT_BLUE_CONCRETE)));
    public static final Block CUT_YELLOW_CONCRETE_STAIRS = registerBlock("cut_yellow_concrete_stairs",
            new StairsBlock(DecoBlocks.CUT_YELLOW_CONCRETE.getDefaultState(),AbstractBlock.Settings.copy(DecoBlocks.CUT_YELLOW_CONCRETE)));
    public static final Block CUT_LIME_CONCRETE_STAIRS = registerBlock("cut_lime_concrete_stairs",
            new StairsBlock(DecoBlocks.CUT_LIME_CONCRETE.getDefaultState(),AbstractBlock.Settings.copy(DecoBlocks.CUT_LIME_CONCRETE)));
    public static final Block CUT_PINK_CONCRETE_STAIRS = registerBlock("cut_pink_concrete_stairs",
            new StairsBlock(DecoBlocks.CUT_PINK_CONCRETE.getDefaultState(),AbstractBlock.Settings.copy(DecoBlocks.CUT_PINK_CONCRETE)));
    public static final Block CUT_GRAY_CONCRETE_STAIRS = registerBlock("cut_gray_concrete_stairs",
            new StairsBlock(DecoBlocks.CUT_GRAY_CONCRETE.getDefaultState(),AbstractBlock.Settings.copy(DecoBlocks.CUT_GRAY_CONCRETE)));
    public static final Block CUT_LIGHT_GRAY_CONCRETE_STAIRS = registerBlock("cut_light_gray_concrete_stairs",
            new StairsBlock(DecoBlocks.CUT_LIGHT_GRAY_CONCRETE.getDefaultState(),AbstractBlock.Settings.copy(DecoBlocks.CUT_LIGHT_GRAY_CONCRETE)));
    public static final Block CUT_CYAN_CONCRETE_STAIRS = registerBlock("cut_cyan_concrete_stairs",
            new StairsBlock(DecoBlocks.CUT_CYAN_CONCRETE.getDefaultState(),AbstractBlock.Settings.copy(DecoBlocks.CUT_CYAN_CONCRETE)));
    public static final Block CUT_PURPLE_CONCRETE_STAIRS = registerBlock("cut_purple_concrete_stairs",
            new StairsBlock(DecoBlocks.CUT_PURPLE_CONCRETE.getDefaultState(),AbstractBlock.Settings.copy(DecoBlocks.CUT_PURPLE_CONCRETE)));
    public static final Block CUT_BLUE_CONCRETE_STAIRS = registerBlock("cut_blue_concrete_stairs",
            new StairsBlock(DecoBlocks.CUT_BLUE_CONCRETE.getDefaultState(),AbstractBlock.Settings.copy(DecoBlocks.CUT_BLUE_CONCRETE)));
    public static final Block CUT_BROWN_CONCRETE_STAIRS = registerBlock("cut_brown_concrete_stairs",
            new StairsBlock(DecoBlocks.CUT_BROWN_CONCRETE.getDefaultState(),AbstractBlock.Settings.copy(DecoBlocks.CUT_BROWN_CONCRETE)));
    public static final Block CUT_GREEN_CONCRETE_STAIRS = registerBlock("cut_green_concrete_stairs",
            new StairsBlock(DecoBlocks.CUT_GREEN_CONCRETE.getDefaultState(),AbstractBlock.Settings.copy(DecoBlocks.CUT_GREEN_CONCRETE)));
    public static final Block CUT_RED_CONCRETE_STAIRS = registerBlock("cut_red_concrete_stairs",
            new StairsBlock(DecoBlocks.CUT_RED_CONCRETE.getDefaultState(),AbstractBlock.Settings.copy(DecoBlocks.CUT_RED_CONCRETE)));
    public static final Block CUT_BLACK_CONCRETE_STAIRS = registerBlock("cut_black_concrete_stairs",
            new StairsBlock(DecoBlocks.CUT_BLACK_CONCRETE.getDefaultState(),AbstractBlock.Settings.copy(DecoBlocks.CUT_BLACK_CONCRETE)));
    public static final Block CRYSTALLIZED_PRISMARINE_STAIRS = registerBlock("crystallized_prismarine_stairs",
            new StairsBlock(DecoBlocks.CRYSTALLIZED_PRISMARINE.getDefaultState(),
                    AbstractBlock.Settings.copy(DecoBlocks.CRYSTALLIZED_PRISMARINE)));
    public static final Block CRYSTALLIZED_PRISMARINE_BRICK_STAIRS = registerBlock("crystallized_prismarine_brick_stairs",
            new StairsBlock(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.copy(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS)));
    public static final Block LIGHT_PRISMARINE_STAIRS = registerBlock("light_prismarine_stairs",
            new StairsBlock(DecoBlocks.LIGHT_PRISMARINE.getDefaultState(),
                    AbstractBlock.Settings.copy(DecoBlocks.LIGHT_PRISMARINE)));
    public static final Block CUT_RED_SANDSTONE_BRICK_STAIRS = registerBlock("cut_red_sandstone_brick_stairs",
            new StairsBlock(DecoBlocks.CUT_RED_SANDSTONE_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.copy(DecoBlocks.CUT_RED_SANDSTONE_BRICKS)));
    public static final Block MAGMA_BRICK_STAIRS = registerBlock("magma_brick_stairs",
            new MagmaBrickStairBlock(DecoBlocks.MAGMA_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.copy(DecoBlocks.MAGMA_BRICKS)));
    public static final Block BUBBLE_STAIRS = registerBlock("bubble_stairs",
            new BubbleStairBlock(DecoBlocks.BUBBLE_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.copy(DecoBlocks.BUBBLE_BLOCK)));
    public static final Block BUBBLE_BRICK_STAIRS = registerBlock("bubble_brick_stairs",
            new BubbleStairBlock(DecoBlocks.BUBBLE_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.copy(DecoBlocks.BUBBLE_BRICKS)));
    public static final Block BLUE_NETHER_BRICK_STAIRS = registerBlock("blue_nether_brick_stairs",
            new StairsBlock(DecoBlocks.BLUE_NETHER_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.copy(DecoBlocks.BLUE_NETHER_BRICKS)));
    public static final Block POLISHED_BLACKSTONE_TILE_STAIRS = registerBlock("polished_blackstone_tile_stairs",
            new StairsBlock(DecoBlocks.POLISHED_BLACKSTONE_TILES.getDefaultState(),
                    AbstractBlock.Settings.copy(DecoBlocks.POLISHED_BLACKSTONE_TILES)));
    public static final Block TUFF_TILE_STAIRS = registerBlock("tuff_tile_stairs",
            new MagmaBrickStairBlock(DecoBlocks.TUFF_TILES.getDefaultState(),
                    AbstractBlock.Settings.copy(DecoBlocks.TUFF_TILES)));

    public static final Block DEEPSLATE_SLAB = registerBlock("deepslate_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE)));
    public static final Block CALCITE_SLAB = registerBlock("calcite_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.CALCITE)));
    public static final Block DRIPSTONE_SLAB = registerBlock("dripstone_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK)));
    public static final Block OBSIDIAN_SLAB = registerBlock("obsidian_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.OBSIDIAN)));
    public static final Block SNOW_SLAB = registerBlock("snow_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.SNOW_BLOCK)));
    public static final Block NETHERRACK_SLAB = registerBlock("netherrack_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.NETHERRACK)));
    public static final Block PACKED_MUD_SLAB = registerBlock("packed_mud_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.PACKED_MUD)));
    public static final Block END_STONE_SLAB = registerBlock("end_stone_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.END_STONE)));
    public static final Block QUARTZ_BRICK_SLAB = registerBlock("quartz_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.QUARTZ_BRICKS)));
    public static final Block WHITE_TERRACOTTA_SLAB = registerBlock("white_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.WHITE_TERRACOTTA)));
    public static final Block ORANGE_TERRACOTTA_SLAB = registerBlock("orange_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.ORANGE_TERRACOTTA)));
    public static final Block MAGENTA_TERRACOTTA_SLAB = registerBlock("magenta_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.MAGENTA_TERRACOTTA)));
    public static final Block LIGHT_BLUE_TERRACOTTA_SLAB = registerBlock("light_blue_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_TERRACOTTA)));
    public static final Block YELLOW_TERRACOTTA_SLAB = registerBlock("yellow_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.YELLOW_TERRACOTTA)));
    public static final Block LIME_TERRACOTTA_SLAB = registerBlock("lime_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.LIME_TERRACOTTA)));
    public static final Block PINK_TERRACOTTA_SLAB = registerBlock("pink_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.PINK_TERRACOTTA)));
    public static final Block GRAY_TERRACOTTA_SLAB = registerBlock("gray_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.GRAY_TERRACOTTA)));
    public static final Block LIGHT_GRAY_TERRACOTTA_SLAB = registerBlock("light_gray_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_TERRACOTTA)));
    public static final Block CYAN_TERRACOTTA_SLAB = registerBlock("cyan_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.CYAN_TERRACOTTA)));
    public static final Block PURPLE_TERRACOTTA_SLAB = registerBlock("purple_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.PURPLE_TERRACOTTA)));
    public static final Block BLUE_TERRACOTTA_SLAB = registerBlock("blue_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.BLUE_TERRACOTTA)));
    public static final Block BROWN_TERRACOTTA_SLAB = registerBlock("brown_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.BROWN_TERRACOTTA)));
    public static final Block GREEN_TERRACOTTA_SLAB = registerBlock("green_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.GREEN_TERRACOTTA)));
    public static final Block RED_TERRACOTTA_SLAB = registerBlock("red_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.RED_TERRACOTTA)));
    public static final Block BLACK_TERRACOTTA_SLAB = registerBlock("black_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.BLACK_TERRACOTTA)));
    public static final Block TERRACOTTA_SLAB = registerBlock("terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.TERRACOTTA)));
    public static final Block PACKED_ICE_SLAB = registerBlock("packed_ice_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.PACKED_ICE)));
    public static final Block MAGMA_SLAB = registerBlock("magma_slab",
            new MagmaSlabBlock(AbstractBlock.Settings.copy(Blocks.MAGMA_BLOCK)));
    public static final Block WHITE_CONCRETE_SLAB = registerBlock("white_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE)));
    public static final Block ORANGE_CONCRETE_SLAB = registerBlock("orange_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE)));
    public static final Block MAGENTA_CONCRETE_SLAB = registerBlock("magenta_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE)));
    public static final Block LIGHT_BLUE_CONCRETE_SLAB = registerBlock("light_blue_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE)));
    public static final Block YELLOW_CONCRETE_SLAB = registerBlock("yellow_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE)));
    public static final Block LIME_CONCRETE_SLAB = registerBlock("lime_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE)));
    public static final Block PINK_CONCRETE_SLAB = registerBlock("pink_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE)));
    public static final Block GRAY_CONCRETE_SLAB = registerBlock("gray_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE)));
    public static final Block LIGHT_GRAY_CONCRETE_SLAB = registerBlock("light_gray_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE)));
    public static final Block CYAN_CONCRETE_SLAB = registerBlock("cyan_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE)));
    public static final Block PURPLE_CONCRETE_SLAB = registerBlock("purple_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE)));
    public static final Block BLUE_CONCRETE_SLAB = registerBlock("blue_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE)));
    public static final Block BROWN_CONCRETE_SLAB = registerBlock("brown_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE)));
    public static final Block GREEN_CONCRETE_SLAB = registerBlock("green_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE)));
    public static final Block RED_CONCRETE_SLAB = registerBlock("red_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.RED_CONCRETE)));
    public static final Block BLACK_CONCRETE_SLAB = registerBlock("black_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE)));
    public static final Block BLUE_ICE_SLAB = registerBlock("blue_ice_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.BLUE_ICE)));

    public static final Block POLISHED_STONE_SLAB = registerBlock("polished_stone_slab",
            new SlabBlock(AbstractBlock.Settings.copy(DecoBlocks.POLISHED_STONE)));
    public static final Block STONE_TILE_SLAB = registerBlock("stone_tile_slab",
            new SlabBlock(AbstractBlock.Settings.copy(DecoBlocks.STONE_TILES)));
    public static final Block CACTUS_PLANK_SLAB = registerBlock("cactus_plank_slab",
            new SlabBlock(AbstractBlock.Settings.copy(DecoBlocks.CACTUS_PLANKS)));
    public static final Block WOODEN_SLAB = registerBlock("wooden_slab",
            new SlabBlock(AbstractBlock.Settings.copy(DecoBlocks.WOODEN_PLANKS)));
    public static final Block CUT_SANDSTONE_BRICK_SLAB = registerBlock("cut_sandstone_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(DecoBlocks.CUT_SANDSTONE_BRICKS)));
    public static final Block SMOOTH_PURPUR_SLAB = registerBlock("smooth_purpur_slab",
            new SlabBlock(AbstractBlock.Settings.copy(DecoBlocks.SMOOTH_PURPUR)));
    public static final Block SMOOTH_DEEPSLATE_SLAB = registerBlock("smooth_deepslate_slab",
            new SlabBlock(AbstractBlock.Settings.copy(DecoBlocks.SMOOTH_DEEPSLATE)));
    public static final Block SMOOTH_BLACKSTONE_SLAB = registerBlock("smooth_blackstone_slab",
            new SlabBlock(AbstractBlock.Settings.copy(DecoBlocks.SMOOTH_BLACKSTONE)));
    public static final Block SMOOTH_TUFF_SLAB = registerBlock("smooth_tuff_slab",
            new SlabBlock(AbstractBlock.Settings.copy(DecoBlocks.SMOOTH_TUFF)));
    public static final Block OBSIDIAN_BRICK_SLAB = registerBlock("obsidian_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(DecoBlocks.OBSIDIAN_BRICKS)));
    public static final Block PURPUR_BRICK_SLAB = registerBlock("purpur_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(DecoBlocks.PURPUR_BRICKS)));
    public static final Block SNOW_BRICK_SLAB = registerBlock("snow_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(DecoBlocks.SNOW_BRICKS)));
    public static final Block VOID_STONE_SLAB = registerBlock("void_stone_slab",
            new SlabBlock(AbstractBlock.Settings.copy(DecoBlocks.VOID_STONE)));
    public static final Block VOID_STONE_BRICK_SLAB = registerBlock("void_stone_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(DecoBlocks.VOID_STONE_BRICKS)));
    public static final Block WHITE_TERRACOTTA_BRICK_SLAB = registerBlock("white_terracotta_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(DecoBlocks.WHITE_TERRACOTTA_BRICKS)));
    public static final Block ORANGE_TERRACOTTA_BRICK_SLAB = registerBlock("orange_terracotta_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(DecoBlocks.ORANGE_TERRACOTTA_BRICKS)));
    public static final Block MAGENTA_TERRACOTTA_BRICK_SLAB = registerBlock("magenta_terracotta_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(DecoBlocks.MAGENTA_TERRACOTTA_BRICKS)));
    public static final Block LIGHT_BLUE_TERRACOTTA_BRICK_SLAB = registerBlock("light_blue_terracotta_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS)));
    public static final Block YELLOW_TERRACOTTA_BRICK_SLAB = registerBlock("yellow_terracotta_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(DecoBlocks.YELLOW_TERRACOTTA_BRICKS)));
    public static final Block LIME_TERRACOTTA_BRICK_SLAB = registerBlock("lime_terracotta_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(DecoBlocks.LIME_TERRACOTTA_BRICKS)));
    public static final Block PINK_TERRACOTTA_BRICK_SLAB = registerBlock("pink_terracotta_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(DecoBlocks.PINK_TERRACOTTA_BRICKS)));
    public static final Block GRAY_TERRACOTTA_BRICK_SLAB = registerBlock("gray_terracotta_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(DecoBlocks.GRAY_TERRACOTTA_BRICKS)));
    public static final Block LIGHT_GRAY_TERRACOTTA_BRICK_SLAB = registerBlock("light_gray_terracotta_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS)));
    public static final Block CYAN_TERRACOTTA_BRICK_SLAB = registerBlock("cyan_terracotta_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(DecoBlocks.CYAN_TERRACOTTA_BRICKS)));
    public static final Block PURPLE_TERRACOTTA_BRICK_SLAB = registerBlock("purple_terracotta_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(DecoBlocks.PURPLE_TERRACOTTA_BRICKS)));
    public static final Block BLUE_TERRACOTTA_BRICK_SLAB = registerBlock("blue_terracotta_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(DecoBlocks.BLUE_TERRACOTTA_BRICKS)));
    public static final Block BROWN_TERRACOTTA_BRICK_SLAB = registerBlock("brown_terracotta_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(DecoBlocks.BROWN_TERRACOTTA_BRICKS)));
    public static final Block GREEN_TERRACOTTA_BRICK_SLAB = registerBlock("green_terracotta_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(DecoBlocks.GREEN_TERRACOTTA_BRICKS)));
    public static final Block RED_TERRACOTTA_BRICK_SLAB = registerBlock("red_terracotta_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(DecoBlocks.RED_TERRACOTTA_BRICKS)));
    public static final Block BLACK_TERRACOTTA_BRICK_SLAB = registerBlock("black_terracotta_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(DecoBlocks.BLACK_TERRACOTTA_BRICKS)));
    public static final Block TERRACOTTA_BRICK_SLAB = registerBlock("terracotta_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(DecoBlocks.TERRACOTTA_BRICKS)));
    public static final Block SOUL_SOILSTONE_SLAB = registerBlock("soul_soilstone_slab",
            new SlabBlock(AbstractBlock.Settings.copy(DecoBlocks.SOUL_SOILSTONE)));
    public static final Block CUT_SOUL_SOILSTONE_SLAB = registerBlock("cut_soul_soilstone_slab",
            new SlabBlock(AbstractBlock.Settings.copy(DecoBlocks.CUT_SOUL_SOILSTONE)));
    public static final Block SMOOTH_SOUL_SOILSTONE_SLAB = registerBlock("smooth_soul_soilstone_slab",
            new SlabBlock(AbstractBlock.Settings.copy(DecoBlocks.SMOOTH_SOUL_SOILSTONE)));
    public static final Block CUT_SOUL_SOILSTONE_BRICK_SLAB = registerBlock("cut_soul_soilstone_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS)));
    public static final Block CUT_QUARTZ_SLAB = registerBlock("cut_quartz_slab",
            new SlabBlock(AbstractBlock.Settings.copy(DecoBlocks.CUT_QUARTZ)));
    public static final Block ICE_BRICK_SLAB = registerBlock("ice_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(DecoBlocks.ICE_BRICKS)));
    public static final Block CUT_WHITE_CONCRETE_SLAB = registerBlock("cut_white_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(DecoBlocks.CUT_WHITE_CONCRETE)));
    public static final Block CUT_ORANGE_CONCRETE_SLAB = registerBlock("cut_orange_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(DecoBlocks.CUT_ORANGE_CONCRETE)));
    public static final Block CUT_MAGENTA_CONCRETE_SLAB = registerBlock("cut_magenta_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(DecoBlocks.CUT_MAGENTA_CONCRETE)));
    public static final Block CUT_LIGHT_BLUE_CONCRETE_SLAB = registerBlock("cut_light_blue_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(DecoBlocks.CUT_LIGHT_BLUE_CONCRETE)));
    public static final Block CUT_YELLOW_CONCRETE_SLAB = registerBlock("cut_yellow_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(DecoBlocks.CUT_YELLOW_CONCRETE)));
    public static final Block CUT_LIME_CONCRETE_SLAB = registerBlock("cut_lime_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(DecoBlocks.CUT_LIME_CONCRETE)));
    public static final Block CUT_PINK_CONCRETE_SLAB = registerBlock("cut_pink_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(DecoBlocks.CUT_PINK_CONCRETE)));
    public static final Block CUT_GRAY_CONCRETE_SLAB = registerBlock("cut_gray_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(DecoBlocks.CUT_GRAY_CONCRETE)));
    public static final Block CUT_LIGHT_GRAY_CONCRETE_SLAB = registerBlock("cut_light_gray_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(DecoBlocks.CUT_LIGHT_GRAY_CONCRETE)));
    public static final Block CUT_CYAN_CONCRETE_SLAB = registerBlock("cut_cyan_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(DecoBlocks.CUT_CYAN_CONCRETE)));
    public static final Block CUT_PURPLE_CONCRETE_SLAB = registerBlock("cut_purple_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(DecoBlocks.CUT_PURPLE_CONCRETE)));
    public static final Block CUT_BLUE_CONCRETE_SLAB = registerBlock("cut_blue_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(DecoBlocks.CUT_BLUE_CONCRETE)));
    public static final Block CUT_BROWN_CONCRETE_SLAB = registerBlock("cut_brown_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(DecoBlocks.CUT_BROWN_CONCRETE)));
    public static final Block CUT_GREEN_CONCRETE_SLAB = registerBlock("cut_green_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(DecoBlocks.CUT_GREEN_CONCRETE)));
    public static final Block CUT_RED_CONCRETE_SLAB = registerBlock("cut_red_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(DecoBlocks.CUT_RED_CONCRETE)));
    public static final Block CUT_BLACK_CONCRETE_SLAB = registerBlock("cut_black_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(DecoBlocks.CUT_BLACK_CONCRETE)));
    public static final Block CRYSTALLIZED_PRISMARINE_SLAB = registerBlock("crystallized_prismarine_slab",
            new SlabBlock(AbstractBlock.Settings.copy(DecoBlocks.CRYSTALLIZED_PRISMARINE)));
    public static final Block CRYSTALLIZED_PRISMARINE_BRICK_SLAB = registerBlock("crystallized_prismarine_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS)));
    public static final Block LIGHT_PRISMARINE_SLAB = registerBlock("light_prismarine_slab",
            new SlabBlock(AbstractBlock.Settings.copy(DecoBlocks.LIGHT_PRISMARINE)));
    public static final Block CUT_RED_SANDSTONE_BRICK_SLAB = registerBlock("cut_red_sandstone_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(DecoBlocks.CUT_RED_SANDSTONE_BRICKS)));
    public static final Block MAGMA_BRICK_SLAB = registerBlock("magma_brick_slab",
            new MagmaBrickSlabBlock(AbstractBlock.Settings.copy(DecoBlocks.MAGMA_BRICKS)));
    public static final Block BUBBLE_SLAB = registerBlock("bubble_slab",
            new BubbleSlabBlock(AbstractBlock.Settings.copy(DecoBlocks.BUBBLE_BLOCK)));
    public static final Block BUBBLE_BRICK_SLAB = registerBlock("bubble_brick_slab",
            new BubbleSlabBlock(AbstractBlock.Settings.copy(DecoBlocks.BUBBLE_BRICKS)));
    public static final Block BLUE_NETHER_BRICK_SLAB = registerBlock("blue_nether_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(DecoBlocks.BLUE_NETHER_BRICKS)));
    public static final Block POLISHED_BLACKSTONE_TILE_SLAB = registerBlock("polished_blackstone_tile_slab",
            new SlabBlock(AbstractBlock.Settings.copy(DecoBlocks.POLISHED_BLACKSTONE_TILES)));
    public static final Block TUFF_TILE_SLAB = registerBlock("tuff_tile_slab",
            new MagmaBrickSlabBlock(AbstractBlock.Settings.copy(DecoBlocks.TUFF_TILES)));

    public static final Block WOODEN_SAPLING = registerBlock("wooden_sapling",
            new SaplingBlock(DecoSaplingGenerators.WOODEN ,AbstractBlock.Settings.copy(Blocks.OAK_SAPLING)));
    public static final Block POTTED_WOODEN_SAPLING = registerBlockWithoutItem("potted_wooden_sapling",
            new FlowerPotBlock(WOODEN_SAPLING,AbstractBlock.Settings.copy(Blocks.POTTED_OAK_SAPLING)));

    public static final Block WOODEN_LEAVES = registerBlock("wooden_leaves",
            new LeavesBlock(AbstractBlock.Settings.copy(Blocks.DARK_OAK_LEAVES)));

    public static final Block PUFFY_DANDELION = registerBlock("puffy_dandelion",
            new PuffyDandelionBlock(StatusEffects.SATURATION, 3,AbstractBlock.Settings.copy(Blocks.DANDELION)));
    public static final Block POTTED_PUFFY_DANDELION = registerBlockWithoutItem("potted_puffy_dandelion",
            new FlowerPotBlock(PUFFY_DANDELION,AbstractBlock.Settings.copy(Blocks.POTTED_DANDELION)));

    public static final Block CALIFORNIA_POPPY = registerBlock("california_poppy",
            new FlowerBlock(StatusEffects.NIGHT_VISION, 7,AbstractBlock.Settings.copy(Blocks.POPPY)));
    public static final Block POTTED_CALIFORNIA_POPPY = registerBlockWithoutItem("potted_california_poppy",
            new FlowerPotBlock(CALIFORNIA_POPPY,AbstractBlock.Settings.copy(Blocks.POTTED_POPPY)));
    public static final Block SALMON_POPPY = registerBlock("salmon_poppy",
            new FlowerBlock(StatusEffects.BLINDNESS, 5,AbstractBlock.Settings.copy(Blocks.POPPY)));
    public static final Block POTTED_SALMON_POPPY = registerBlockWithoutItem("potted_salmon_poppy",
            new FlowerPotBlock(SALMON_POPPY,AbstractBlock.Settings.copy(Blocks.POTTED_POPPY)));

    public static final Block YELLOW_ORCHID = registerBlock("yellow_orchid",
            new FlowerBlock(StatusEffects.SATURATION, 5,AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_YELLOW_ORCHID = registerBlockWithoutItem("potted_yellow_orchid",
            new FlowerPotBlock(YELLOW_ORCHID,AbstractBlock.Settings.copy(Blocks.POTTED_BLUE_ORCHID)));
    public static final Block WHITE_ORCHID = registerBlock("white_orchid",
            new FlowerBlock(StatusEffects.GLOWING, 5,AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_WHITE_ORCHID = registerBlockWithoutItem("potted_white_orchid",
            new FlowerPotBlock(WHITE_ORCHID,AbstractBlock.Settings.copy(Blocks.POTTED_BLUE_ORCHID)));
    public static final Block PINK_ORCHID = registerBlock("pink_orchid",
            new FlowerBlock(StatusEffects.SLOW_FALLING, 7,AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_PINK_ORCHID = registerBlockWithoutItem("potted_pink_orchid",
            new FlowerPotBlock(PINK_ORCHID,AbstractBlock.Settings.copy(Blocks.POTTED_BLUE_ORCHID)));

    public static final Block YELLOW_TULIP = registerBlock("yellow_tulip",
            new FlowerBlock(StatusEffects.WEAKNESS, 9,AbstractBlock.Settings.copy(Blocks.RED_TULIP)));
    public static final Block POTTED_YELLOW_TULIP = registerBlockWithoutItem("potted_yellow_tulip",
            new FlowerPotBlock(YELLOW_TULIP,AbstractBlock.Settings.copy(Blocks.POTTED_RED_TULIP)));
    public static final Block PURPLE_TULIP = registerBlock("purple_tulip",
            new FlowerBlock(StatusEffects.WEAKNESS, 9,AbstractBlock.Settings.copy(Blocks.RED_TULIP)));
    public static final Block POTTED_PURPLE_TULIP = registerBlockWithoutItem("potted_purple_tulip",
            new FlowerPotBlock(PURPLE_TULIP,AbstractBlock.Settings.copy(Blocks.POTTED_RED_TULIP)));
    public static final Block MAGENTA_TULIP = registerBlock("magenta_tulip",
            new FlowerBlock(StatusEffects.WEAKNESS, 9,AbstractBlock.Settings.copy(Blocks.RED_TULIP)));
    public static final Block POTTED_MAGENTA_TULIP = registerBlockWithoutItem("potted_magenta_tulip",
            new FlowerPotBlock(MAGENTA_TULIP,AbstractBlock.Settings.copy(Blocks.POTTED_RED_TULIP)));
    public static final Block BLUE_TULIP = registerBlock("blue_tulip",
            new FlowerBlock(StatusEffects.WEAKNESS, 9,AbstractBlock.Settings.copy(Blocks.RED_TULIP)));
    public static final Block POTTED_BLUE_TULIP = registerBlockWithoutItem("potted_blue_tulip",
            new FlowerPotBlock(BLUE_TULIP,AbstractBlock.Settings.copy(Blocks.POTTED_RED_TULIP)));

    public static final Block BLACK_TULIP = registerBlock("black_tulip",
            new FlowerBlock(StatusEffects.WEAKNESS, 18,AbstractBlock.Settings.copy(Blocks.RED_TULIP)));
    public static final Block POTTED_BLACK_TULIP = registerBlockWithoutItem("potted_black_tulip",
            new FlowerPotBlock(BLACK_TULIP,AbstractBlock.Settings.copy(Blocks.POTTED_RED_TULIP)));
    public static final Block GREEN_TULIP = registerBlock("green_tulip",
            new FlowerBlock(StatusEffects.WEAKNESS, 18,AbstractBlock.Settings.copy(Blocks.RED_TULIP)));
    public static final Block POTTED_GREEN_TULIP = registerBlockWithoutItem("potted_green_tulip",
            new FlowerPotBlock(GREEN_TULIP,AbstractBlock.Settings.copy(Blocks.POTTED_RED_TULIP)));
    public static final Block CYAN_TULIP = registerBlock("cyan_tulip",
            new FlowerBlock(StatusEffects.WEAKNESS, 18,AbstractBlock.Settings.copy(Blocks.RED_TULIP)));
    public static final Block POTTED_CYAN_TULIP = registerBlockWithoutItem("potted_cyan_tulip",
            new FlowerPotBlock(CYAN_TULIP,AbstractBlock.Settings.copy(Blocks.POTTED_RED_TULIP)));

    public static final Block BARBERTON_DAISY = registerBlock("barberton_daisy",
            new FlowerBlock(StatusEffects.INSTANT_HEALTH, 1,AbstractBlock.Settings.copy(Blocks.OXEYE_DAISY)));
    public static final Block POTTED_BARBERTON_DAISY = registerBlockWithoutItem("potted_barberton_daisy",
            new FlowerPotBlock(BARBERTON_DAISY,AbstractBlock.Settings.copy(Blocks.POTTED_OXEYE_DAISY)));
    public static final Block BLUE_EYED_DAISY = registerBlock("blue_eyed_daisy",
            new FlowerBlock(StatusEffects.NIGHT_VISION, 7,AbstractBlock.Settings.copy(Blocks.OXEYE_DAISY)));
    public static final Block POTTED_BLUE_EYED_DAISY = registerBlockWithoutItem("potted_blue_eyed_daisy",
            new FlowerPotBlock(BLUE_EYED_DAISY,AbstractBlock.Settings.copy(Blocks.POTTED_OXEYE_DAISY)));
    public static final Block GERBERA_DAISY = registerBlock("gerbera_daisy",
            new FlowerBlock(StatusEffects.REGENERATION, 5,AbstractBlock.Settings.copy(Blocks.OXEYE_DAISY)));
    public static final Block POTTED_GERBERA_DAISY = registerBlockWithoutItem("potted_gerbera_daisy",
            new FlowerPotBlock(GERBERA_DAISY,AbstractBlock.Settings.copy(Blocks.POTTED_OXEYE_DAISY)));
    public static final Block MICHAELMAS_DAISY = registerBlock("michaelmas_daisy",
            new FlowerBlock(StatusEffects.RESISTANCE, 7,AbstractBlock.Settings.copy(Blocks.OXEYE_DAISY)));
    public static final Block POTTED_MICHAELMAS_DAISY = registerBlockWithoutItem("potted_michaelmas_daisy",
            new FlowerPotBlock(MICHAELMAS_DAISY,AbstractBlock.Settings.copy(Blocks.POTTED_OXEYE_DAISY)));

    public static final Block PAEONIA = registerBlock("paeonia",
            new FlowerBlock(StatusEffects.SLOWNESS,7,AbstractBlock.Settings.copy(Blocks.POPPY)));
    public static final Block POTTED_PAEONIA = registerBlockWithoutItem("potted_paeonia",
            new FlowerPotBlock(PAEONIA,AbstractBlock.Settings.copy(Blocks.POTTED_POPPY)));

    public static final Block LAVENDER = registerBlock("lavender",
            new FlowerBlock(StatusEffects.HASTE,5,AbstractBlock.Settings.copy(Blocks.POPPY)));
    public static final Block POTTED_LAVENDER = registerBlockWithoutItem("potted_lavender",
            new FlowerPotBlock(LAVENDER,AbstractBlock.Settings.copy(Blocks.POTTED_POPPY)));

    public static final Block ROSE = registerBlock("rose",
            new FlowerBlock(StatusEffects.POISON, 4,AbstractBlock.Settings.copy(Blocks.POPPY)));
    public static final Block POTTED_ROSE = registerBlockWithoutItem("potted_rose",
            new FlowerPotBlock(ROSE,AbstractBlock.Settings.copy(Blocks.POTTED_POPPY)));
    public static final Block ENDER_ROSE = registerBlock("ender_rose",
            new EnderRoseBlock(StatusEffects.LEVITATION, 8.0F, AbstractBlock.Settings.copy(Blocks.POPPY)));
    public static final Block POTTED_ENDER_ROSE = registerBlockWithoutItem("potted_ender_rose",
            new FlowerPotBlock(ENDER_ROSE,AbstractBlock.Settings.copy(Blocks.POTTED_POPPY)));

    public static final Block ANCIENT_ROSE_CROP = registerBlockWithoutItem("ancient_rose_crop",
            new AncientRoseBlock(AbstractBlock.Settings.copy(Blocks.TORCHFLOWER_CROP).nonOpaque()));

    public static final Block MIGHTY_LAVENDER_CROP = registerBlockWithoutItem("mighty_lavender_crop",
            new MightyLavenderCropBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .noCollision()
                            .ticksRandomly()
                            .breakInstantly()
                            .sounds(BlockSoundGroup.CROP)
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );

    public static final Block ANCIENT_ROSE = registerBlock("ancient_rose",
            new FlowerBlock(StatusEffects.POISON, 4,AbstractBlock.Settings.copy(Blocks.POPPY)));
    public static final Block POTTED_ANCIENT_ROSE = registerBlockWithoutItem("potted_ancient_rose",
            new FlowerPotBlock(ANCIENT_ROSE,AbstractBlock.Settings.copy(Blocks.POTTED_POPPY)));

    public static final Block MIGHTY_LAVENDER = registerBlock("mighty_lavender",
            new MightyLavenderBlock(AbstractBlock.Settings.copy(Blocks.PEONY)));

    public static final Block SPRUCE_CRAFTING_TABLE = registerBlock("spruce_crafting_table",
            new SpruceCraftingTableBlock(AbstractBlock.Settings.copy(Blocks.CRAFTING_TABLE).mapColor(MapColor.SPRUCE_BROWN)));
    public static final Block BIRCH_CRAFTING_TABLE = registerBlock("birch_crafting_table",
            new BirchCraftingTableBlock(AbstractBlock.Settings.copy(Blocks.CRAFTING_TABLE).mapColor(MapColor.PALE_YELLOW)));
    public static final Block JUNGLE_CRAFTING_TABLE = registerBlock("jungle_crafting_table",
            new JungleCraftingTableBlock(AbstractBlock.Settings.copy(Blocks.CRAFTING_TABLE).mapColor(MapColor.DIRT_BROWN)));
    public static final Block ACACIA_CRAFTING_TABLE = registerBlock("acacia_crafting_table",
            new AcaciaCraftingTableBlock(AbstractBlock.Settings.copy(Blocks.CRAFTING_TABLE).mapColor(MapColor.GRAY)));
    public static final Block DARK_OAK_CRAFTING_TABLE = registerBlock("dark_oak_crafting_table",
            new DarkOakCraftingTableBlock(AbstractBlock.Settings.copy(Blocks.CRAFTING_TABLE).mapColor(MapColor.BROWN)));
    public static final Block MANGROVE_CRAFTING_TABLE = registerBlock("mangrove_crafting_table",
            new MangroveCraftingTableBlock(AbstractBlock.Settings.copy(Blocks.CRAFTING_TABLE).mapColor(MapColor.RED)));
    public static final Block BAMBOO_CRAFTING_TABLE = registerBlock("bamboo_crafting_table",
            new BambooCraftingTableBlock(AbstractBlock.Settings.copy(Blocks.CRAFTING_TABLE).mapColor(MapColor.GREEN)
                    .sounds(BlockSoundGroup.BAMBOO_WOOD)));
    public static final Block CHERRY_CRAFTING_TABLE = registerBlock("cherry_crafting_table",
            new CherryCraftingTableBlock(AbstractBlock.Settings.copy(Blocks.CRAFTING_TABLE).mapColor(MapColor.TERRACOTTA_GRAY)
                    .sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block CRIMSON_CRAFTING_TABLE = registerBlock("crimson_crafting_table",
            new CrimsonCraftingTableBlock(AbstractBlock.Settings.copy(Blocks.CRAFTING_TABLE).mapColor(MapColor.DULL_PINK)
                    .sounds(BlockSoundGroup.NETHER_WOOD)));
    public static final Block WARPED_CRAFTING_TABLE = registerBlock("warped_crafting_table",
            new WarpedCraftingTableBlock(AbstractBlock.Settings.copy(Blocks.CRAFTING_TABLE).mapColor(MapColor.TEAL)
                    .sounds(BlockSoundGroup.NETHER_WOOD)));
    public static final Block CACTUS_CRAFTING_TABLE = registerBlock("cactus_crafting_table",
            new CactusCraftingTableBlock(AbstractBlock.Settings.copy(Blocks.CRAFTING_TABLE).mapColor(MapColor.DARK_GREEN)));
    public static final Block WOODEN_CRAFTING_TABLE = registerBlock("wooden_crafting_table",
            new WoodenCraftingTableBlock(AbstractBlock.Settings.copy(Blocks.CRAFTING_TABLE).mapColor(MapColor.TERRACOTTA_BROWN)));

    public static final Block DEEPSLATE_FURNACE = registerBlock("deepslate_furnace",
            new DeepslateFurnaceBlock(AbstractBlock.Settings.copy(Blocks.FURNACE).mapColor(MapColor.DEEPSLATE_GRAY)
                    .strength(4.5f).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block BLACKSTONE_FURNACE = registerBlock("blackstone_furnace",
            new BlackstoneFurnaceBlock(AbstractBlock.Settings.copy(Blocks.FURNACE).mapColor(MapColor.BLACK)
                    .strength(3.0f)));
    public static final Block TUFF_FURNACE = registerBlock("tuff_furnace",
            new TuffFurnaceBlock(AbstractBlock.Settings.copy(Blocks.FURNACE).mapColor(MapColor.TERRACOTTA_GRAY)
                    .strength(3.0f).sounds(BlockSoundGroup.TUFF)));

    public static final Block SPRUCE_LADDER = registerBlock("spruce_ladder",
            new LadderBlock(AbstractBlock.Settings.copy(Blocks.LADDER)));
    public static final Block BIRCH_LADDER = registerBlock("birch_ladder",
            new LadderBlock(AbstractBlock.Settings.copy(Blocks.LADDER)));
    public static final Block JUNGLE_LADDER = registerBlock("jungle_ladder",
            new LadderBlock(AbstractBlock.Settings.copy(Blocks.LADDER)));
    public static final Block ACACIA_LADDER = registerBlock("acacia_ladder",
            new LadderBlock(AbstractBlock.Settings.copy(Blocks.LADDER)));
    public static final Block DARK_OAK_LADDER = registerBlock("dark_oak_ladder",
            new LadderBlock(AbstractBlock.Settings.copy(Blocks.LADDER)));
    public static final Block MANGROVE_LADDER = registerBlock("mangrove_ladder",
            new LadderBlock(AbstractBlock.Settings.copy(Blocks.LADDER)));
    public static final Block CRIMSON_LADDER = registerBlock("crimson_ladder",
            new LadderBlock(AbstractBlock.Settings.copy(Blocks.LADDER)
                    .sounds(BlockSoundGroup.NETHER_WOOD)));
    public static final Block WARPED_LADDER = registerBlock("warped_ladder",
            new LadderBlock(AbstractBlock.Settings.copy(Blocks.LADDER)
                    .sounds(BlockSoundGroup.NETHER_WOOD)));
    public static final Block BAMBOO_LADDER = registerBlock("bamboo_ladder",
            new LadderBlock(AbstractBlock.Settings.copy(Blocks.LADDER)
                    .sounds(BlockSoundGroup.BAMBOO_WOOD)));
    public static final Block CHERRY_LADDER = registerBlock("cherry_ladder",
            new LadderBlock(AbstractBlock.Settings.copy(Blocks.LADDER)
                    .sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block CACTUS_LADDER = registerBlock("cactus_ladder",
            new LadderBlock(AbstractBlock.Settings.copy(Blocks.LADDER)));
    public static final Block WOODEN_LADDER = registerBlock("wooden_ladder",
            new LadderBlock(AbstractBlock.Settings.copy(Blocks.LADDER)));

    public static final Block CACTUS_PLANK_FENCE = registerBlock("cactus_plank_fence",
            new FenceBlock(AbstractBlock.Settings.copy(DecoBlocks.CACTUS_PLANKS)));
    public static final Block WOODEN_FENCE = registerBlock("wooden_fence",
            new FenceBlock(AbstractBlock.Settings.copy(DecoBlocks.WOODEN_PLANKS)));
    public static final Block RED_NETHER_BRICK_FENCE = registerBlock("red_nether_brick_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.RED_NETHER_BRICKS)));
    public static final Block BLUE_NETHER_BRICK_FENCE = registerBlock("blue_nether_brick_fence",
            new FenceBlock(AbstractBlock.Settings.copy(DecoBlocks.BLUE_NETHER_BRICKS)));

    public static final Block LIGHT_IRON_BARS = registerBlock("light_iron_bars",
            new PaneBlock(AbstractBlock.Settings.copy(Blocks.IRON_BARS).strength(2.5f,6.0f))
            );

    public static final Block LIGHT_COPPER_BARS = registerBlock("light_copper_bars",
            new OxidizablePaneBlock(Oxidizable.OxidationLevel.UNAFFECTED,AbstractBlock.Settings.copy(DecoBlocks.LIGHT_IRON_BARS)
                    .sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_LIGHT_COPPER_BARS = registerBlock("waxed_light_copper_bars",
            new PaneBlock(AbstractBlock.Settings.copy(DecoBlocks.LIGHT_COPPER_BARS)));
    public static final Block EXPOSED_LIGHT_COPPER_BARS = registerBlock("exposed_light_copper_bars",
            new OxidizablePaneBlock(Oxidizable.OxidationLevel.EXPOSED,AbstractBlock.Settings.copy(DecoBlocks.LIGHT_IRON_BARS)
                    .sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_EXPOSED_LIGHT_COPPER_BARS = registerBlock("waxed_exposed_light_copper_bars",
            new PaneBlock(AbstractBlock.Settings.copy(DecoBlocks.EXPOSED_LIGHT_COPPER_BARS)));
    public static final Block WEATHERED_LIGHT_COPPER_BARS = registerBlock("weathered_light_copper_bars",
            new OxidizablePaneBlock(Oxidizable.OxidationLevel.WEATHERED,AbstractBlock.Settings.copy(DecoBlocks.LIGHT_IRON_BARS)
                    .sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_WEATHERED_LIGHT_COPPER_BARS = registerBlock("waxed_weathered_light_copper_bars",
            new PaneBlock(AbstractBlock.Settings.copy(DecoBlocks.WEATHERED_LIGHT_COPPER_BARS)));
    public static final Block OXIDIZED_LIGHT_COPPER_BARS = registerBlock("oxidized_light_copper_bars",
            new OxidizablePaneBlock(Oxidizable.OxidationLevel.OXIDIZED,AbstractBlock.Settings.copy(DecoBlocks.LIGHT_IRON_BARS)
                    .sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_OXIDIZED_LIGHT_COPPER_BARS = registerBlock("waxed_oxidized_light_copper_bars",
            new PaneBlock(AbstractBlock.Settings.copy(DecoBlocks.OXIDIZED_LIGHT_COPPER_BARS)));

    public static final Block COPPER_BARS = registerBlock("copper_bars",
            new OxidizablePaneBlock(Oxidizable.OxidationLevel.UNAFFECTED,AbstractBlock.Settings.copy(Blocks.IRON_BARS)
                    .sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_COPPER_BARS = registerBlock("waxed_copper_bars",
            new PaneBlock(AbstractBlock.Settings.copy(DecoBlocks.COPPER_BARS)));
    public static final Block EXPOSED_COPPER_BARS = registerBlock("exposed_copper_bars",
            new OxidizablePaneBlock(Oxidizable.OxidationLevel.EXPOSED,AbstractBlock.Settings.copy(Blocks.IRON_BARS)
                    .sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_EXPOSED_COPPER_BARS = registerBlock("waxed_exposed_copper_bars",
            new PaneBlock(AbstractBlock.Settings.copy(DecoBlocks.EXPOSED_COPPER_BARS)));
    public static final Block WEATHERED_COPPER_BARS = registerBlock("weathered_copper_bars",
            new OxidizablePaneBlock(Oxidizable.OxidationLevel.WEATHERED,AbstractBlock.Settings.copy(Blocks.IRON_BARS)
                    .sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_WEATHERED_COPPER_BARS = registerBlock("waxed_weathered_copper_bars",
            new PaneBlock(AbstractBlock.Settings.copy(DecoBlocks.WEATHERED_COPPER_BARS)));
    public static final Block OXIDIZED_COPPER_BARS = registerBlock("oxidized_copper_bars",
            new OxidizablePaneBlock(Oxidizable.OxidationLevel.OXIDIZED,AbstractBlock.Settings.copy(Blocks.IRON_BARS)
                    .sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_OXIDIZED_COPPER_BARS = registerBlock("waxed_oxidized_copper_bars",
            new PaneBlock(AbstractBlock.Settings.copy(DecoBlocks.OXIDIZED_COPPER_BARS)));

    public static final Block HEAVY_IRON_BARS = registerBlock("heavy_iron_bars",
            new PaneBlock(AbstractBlock.Settings.copy(Blocks.IRON_BARS).strength(10.0f,12.0f)
                    .mapColor(MapColor.IRON_GRAY)));

    public static final Block HEAVY_COPPER_BARS = registerBlock("heavy_copper_bars",
            new OxidizablePaneBlock(Oxidizable.OxidationLevel.UNAFFECTED,AbstractBlock.Settings.copy(DecoBlocks.HEAVY_IRON_BARS)
                    .mapColor(MapColor.ORANGE).sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_HEAVY_COPPER_BARS = registerBlock("waxed_heavy_copper_bars",
            new PaneBlock(AbstractBlock.Settings.copy(DecoBlocks.HEAVY_COPPER_BARS)));
    public static final Block EXPOSED_HEAVY_COPPER_BARS = registerBlock("exposed_heavy_copper_bars",
            new OxidizablePaneBlock(Oxidizable.OxidationLevel.EXPOSED,AbstractBlock.Settings.copy(DecoBlocks.HEAVY_IRON_BARS)
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_EXPOSED_HEAVY_COPPER_BARS = registerBlock("waxed_exposed_heavy_copper_bars",
            new PaneBlock(AbstractBlock.Settings.copy(DecoBlocks.EXPOSED_HEAVY_COPPER_BARS)));
    public static final Block WEATHERED_HEAVY_COPPER_BARS = registerBlock("weathered_heavy_copper_bars",
            new OxidizablePaneBlock(Oxidizable.OxidationLevel.WEATHERED,AbstractBlock.Settings.copy(DecoBlocks.HEAVY_IRON_BARS)
                    .mapColor(MapColor.DARK_AQUA).sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_WEATHERED_HEAVY_COPPER_BARS = registerBlock("waxed_weathered_heavy_copper_bars",
            new PaneBlock(AbstractBlock.Settings.copy(DecoBlocks.WEATHERED_HEAVY_COPPER_BARS)));
    public static final Block OXIDIZED_HEAVY_COPPER_BARS = registerBlock("oxidized_heavy_copper_bars",
            new OxidizablePaneBlock(Oxidizable.OxidationLevel.OXIDIZED,AbstractBlock.Settings.copy(DecoBlocks.HEAVY_IRON_BARS)
                    .mapColor(MapColor.DARK_AQUA).sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_OXIDIZED_HEAVY_COPPER_BARS = registerBlock("waxed_oxidized_heavy_copper_bars",
            new PaneBlock(AbstractBlock.Settings.copy(DecoBlocks.OXIDIZED_HEAVY_COPPER_BARS)));

    public static final Block COPPER_CHAIN = registerBlock("copper_chain",
            new OxidizableChainBlock(Oxidizable.OxidationLevel.UNAFFECTED,AbstractBlock.Settings.copy(Blocks.CHAIN)
                    .sounds(BlockSoundGroup.COPPER_GRATE)));
    public static final Block WAXED_COPPER_CHAIN = registerBlock("waxed_copper_chain",
            new ChainBlock(AbstractBlock.Settings.copy(DecoBlocks.COPPER_CHAIN)));
    public static final Block EXPOSED_COPPER_CHAIN = registerBlock("exposed_copper_chain",
            new OxidizableChainBlock(Oxidizable.OxidationLevel.EXPOSED,AbstractBlock.Settings.copy(Blocks.CHAIN)
                    .sounds(BlockSoundGroup.COPPER_GRATE)));
    public static final Block WAXED_EXPOSED_COPPER_CHAIN = registerBlock("waxed_exposed_copper_chain",
            new ChainBlock(AbstractBlock.Settings.copy(DecoBlocks.EXPOSED_COPPER_CHAIN)));
    public static final Block WEATHERED_COPPER_CHAIN = registerBlock("weathered_copper_chain",
            new OxidizableChainBlock(Oxidizable.OxidationLevel.WEATHERED,AbstractBlock.Settings.copy(Blocks.CHAIN)
                    .sounds(BlockSoundGroup.COPPER_GRATE)));
    public static final Block WAXED_WEATHERED_COPPER_CHAIN = registerBlock("waxed_weathered_copper_chain",
            new ChainBlock(AbstractBlock.Settings.copy(DecoBlocks.WEATHERED_COPPER_CHAIN)));
    public static final Block OXIDIZED_COPPER_CHAIN = registerBlock("oxidized_copper_chain",
            new OxidizableChainBlock(Oxidizable.OxidationLevel.OXIDIZED,AbstractBlock.Settings.copy(Blocks.CHAIN)
                    .sounds(BlockSoundGroup.COPPER_GRATE)));
    public static final Block WAXED_OXIDIZED_COPPER_CHAIN = registerBlock("waxed_oxidized_copper_chain",
            new ChainBlock(AbstractBlock.Settings.copy(DecoBlocks.OXIDIZED_COPPER_CHAIN)));

    public static final Block STONE_WALL = registerBlock("stone_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.STONE)));
    public static final Block POLISHED_ANDESITE_WALL = registerBlock("polished_andesite_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_ANDESITE)));
    public static final Block POLISHED_DIORITE_WALL = registerBlock("polished_diorite_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_DIORITE)));
    public static final Block POLISHED_GRANITE_WALL = registerBlock("polished_granite_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_GRANITE)));
    public static final Block DEEPSLATE_WALL = registerBlock("deepslate_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE)));
    public static final Block CALCITE_WALL = registerBlock("calcite_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.CALCITE)));
    public static final Block DRIPSTONE_WALL = registerBlock("dripstone_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK)));
    public static final Block CUT_SANDSTONE_WALL = registerBlock("cut_sandstone_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.CUT_SANDSTONE)));
    public static final Block SMOOTH_QUARTZ_WALL = registerBlock("smooth_quartz_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_QUARTZ)));
    public static final Block SMOOTH_SANDSTONE_WALL = registerBlock("smooth_sandstone_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_SANDSTONE)));
    public static final Block SMOOTH_RED_SANDSTONE_WALL = registerBlock("smooth_red_sandstone_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_RED_SANDSTONE)));
    public static final Block SMOOTH_STONE_WALL = registerBlock("smooth_stone_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_STONE)));
    public static final Block OBSIDIAN_WALL = registerBlock("obsidian_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.OBSIDIAN)));
    public static final Block SNOW_WALL = registerBlock("snow_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.SNOW_BLOCK)));
    public static final Block NETHERRACK_WALL = registerBlock("netherrack_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.NETHERRACK)));
    public static final Block PRISMARINE_BRICK_WALL = registerBlock("prismarine_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.CUT_RED_SANDSTONE)));
    public static final Block DARK_PRISMARINE_WALL = registerBlock("dark_prismarine_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.CUT_RED_SANDSTONE)));
    public static final Block CUT_RED_SANDSTONE_WALL = registerBlock("cut_red_sandstone_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.CUT_RED_SANDSTONE)));
    public static final Block PACKED_MUD_WALL = registerBlock("packed_mud_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.PACKED_MUD)));
    public static final Block END_STONE_WALL = registerBlock("end_stone_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.END_STONE)));
    public static final Block QUARTZ_WALL = registerBlock("quartz_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.QUARTZ_BLOCK)));
    public static final Block QUARTZ_BRICK_WALL = registerBlock("quartz_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.QUARTZ_BRICKS)));
    public static final Block WHITE_TERRACOTTA_WALL = registerBlock("white_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.WHITE_TERRACOTTA)));
    public static final Block ORANGE_TERRACOTTA_WALL = registerBlock("orange_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.ORANGE_TERRACOTTA)));
    public static final Block MAGENTA_TERRACOTTA_WALL = registerBlock("magenta_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.MAGENTA_TERRACOTTA)));
    public static final Block LIGHT_BLUE_TERRACOTTA_WALL = registerBlock("light_blue_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_TERRACOTTA)));
    public static final Block YELLOW_TERRACOTTA_WALL = registerBlock("yellow_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.YELLOW_TERRACOTTA)));
    public static final Block LIME_TERRACOTTA_WALL = registerBlock("lime_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.LIME_TERRACOTTA)));
    public static final Block PINK_TERRACOTTA_WALL = registerBlock("pink_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.PINK_TERRACOTTA)));
    public static final Block GRAY_TERRACOTTA_WALL = registerBlock("gray_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.GRAY_TERRACOTTA)));
    public static final Block LIGHT_GRAY_TERRACOTTA_WALL = registerBlock("light_gray_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_TERRACOTTA)));
    public static final Block CYAN_TERRACOTTA_WALL = registerBlock("cyan_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.CYAN_TERRACOTTA)));
    public static final Block PURPLE_TERRACOTTA_WALL = registerBlock("purple_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.PURPLE_TERRACOTTA)));
    public static final Block BLUE_TERRACOTTA_WALL = registerBlock("blue_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.BLUE_TERRACOTTA)));
    public static final Block BROWN_TERRACOTTA_WALL = registerBlock("brown_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.BROWN_TERRACOTTA)));
    public static final Block GREEN_TERRACOTTA_WALL = registerBlock("green_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.GREEN_TERRACOTTA)));
    public static final Block RED_TERRACOTTA_WALL = registerBlock("red_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.RED_TERRACOTTA)));
    public static final Block BLACK_TERRACOTTA_WALL = registerBlock("black_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.BLACK_TERRACOTTA)));
    public static final Block TERRACOTTA_WALL = registerBlock("terracotta_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.TERRACOTTA)));
    public static final Block PACKED_ICE_WALL = registerBlock("packed_ice_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.PACKED_ICE)));
    public static final Block MAGMA_WALL = registerBlock("magma_wall",
            new MagmaWallBlock(AbstractBlock.Settings.copy(Blocks.MAGMA_BLOCK)));
    public static final Block WHITE_CONCRETE_WALL = registerBlock("white_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE)));
    public static final Block ORANGE_CONCRETE_WALL = registerBlock("orange_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE)));
    public static final Block MAGENTA_CONCRETE_WALL = registerBlock("magenta_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE)));
    public static final Block LIGHT_BLUE_CONCRETE_WALL = registerBlock("light_blue_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE)));
    public static final Block YELLOW_CONCRETE_WALL = registerBlock("yellow_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE)));
    public static final Block LIME_CONCRETE_WALL = registerBlock("lime_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE)));
    public static final Block PINK_CONCRETE_WALL = registerBlock("pink_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE)));
    public static final Block GRAY_CONCRETE_WALL = registerBlock("gray_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE)));
    public static final Block LIGHT_GRAY_CONCRETE_WALL = registerBlock("light_gray_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE)));
    public static final Block CYAN_CONCRETE_WALL = registerBlock("cyan_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE)));
    public static final Block PURPLE_CONCRETE_WALL = registerBlock("purple_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE)));
    public static final Block BLUE_CONCRETE_WALL = registerBlock("blue_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE)));
    public static final Block BROWN_CONCRETE_WALL = registerBlock("brown_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE)));
    public static final Block GREEN_CONCRETE_WALL = registerBlock("green_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE)));
    public static final Block RED_CONCRETE_WALL = registerBlock("red_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.RED_CONCRETE)));
    public static final Block BLACK_CONCRETE_WALL = registerBlock("black_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE)));
    public static final Block BLUE_ICE_WALL = registerBlock("blue_ice_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.BLUE_ICE)));

    public static final Block POLISHED_STONE_WALL = registerBlock("polished_stone_wall",
            new WallBlock(AbstractBlock.Settings.copy(DecoBlocks.POLISHED_STONE)));
    public static final Block STONE_TILE_WALL = registerBlock("stone_tile_wall",
            new WallBlock(AbstractBlock.Settings.copy(DecoBlocks.STONE_TILES)));
    public static final Block CUT_SANDSTONE_BRICK_WALL = registerBlock("cut_sandstone_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(DecoBlocks.CUT_SANDSTONE_BRICKS)));
    public static final Block SMOOTH_PURPUR_WALL = registerBlock("smooth_purpur_wall",
            new WallBlock(AbstractBlock.Settings.copy(DecoBlocks.SMOOTH_PURPUR)));
    public static final Block SMOOTH_DEEPSLATE_WALL = registerBlock("smooth_deepslate_wall",
            new WallBlock(AbstractBlock.Settings.copy(DecoBlocks.SMOOTH_DEEPSLATE)));
    public static final Block SMOOTH_BLACKSTONE_WALL = registerBlock("smooth_blackstone_wall",
            new WallBlock(AbstractBlock.Settings.copy(DecoBlocks.SMOOTH_BLACKSTONE)));
    public static final Block SMOOTH_TUFF_WALL = registerBlock("smooth_tuff_wall",
            new WallBlock(AbstractBlock.Settings.copy(DecoBlocks.SMOOTH_TUFF)));
    public static final Block OBSIDIAN_BRICK_WALL = registerBlock("obsidian_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(DecoBlocks.OBSIDIAN_BRICKS)));
    public static final Block PURPUR_BRICK_WALL = registerBlock("purpur_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(DecoBlocks.PURPUR_BRICKS)));
    public static final Block SNOW_BRICK_WALL = registerBlock("snow_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(DecoBlocks.SNOW_BRICKS)));
    public static final Block VOID_STONE_WALL = registerBlock("void_stone_wall",
            new WallBlock(AbstractBlock.Settings.copy(DecoBlocks.VOID_STONE)));
    public static final Block VOID_STONE_BRICK_WALL = registerBlock("void_stone_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(DecoBlocks.VOID_STONE_BRICKS)));
    public static final Block WHITE_TERRACOTTA_BRICK_WALL = registerBlock("white_terracotta_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(DecoBlocks.WHITE_TERRACOTTA_BRICKS)));
    public static final Block ORANGE_TERRACOTTA_BRICK_WALL = registerBlock("orange_terracotta_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(DecoBlocks.ORANGE_TERRACOTTA_BRICKS)));
    public static final Block MAGENTA_TERRACOTTA_BRICK_WALL = registerBlock("magenta_terracotta_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(DecoBlocks.MAGENTA_TERRACOTTA_BRICKS)));
    public static final Block LIGHT_BLUE_TERRACOTTA_BRICK_WALL = registerBlock("light_blue_terracotta_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS)));
    public static final Block YELLOW_TERRACOTTA_BRICK_WALL = registerBlock("yellow_terracotta_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(DecoBlocks.YELLOW_TERRACOTTA_BRICKS)));
    public static final Block LIME_TERRACOTTA_BRICK_WALL = registerBlock("lime_terracotta_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(DecoBlocks.LIME_TERRACOTTA_BRICKS)));
    public static final Block PINK_TERRACOTTA_BRICK_WALL = registerBlock("pink_terracotta_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(DecoBlocks.PINK_TERRACOTTA_BRICKS)));
    public static final Block GRAY_TERRACOTTA_BRICK_WALL = registerBlock("gray_terracotta_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(DecoBlocks.GRAY_TERRACOTTA_BRICKS)));
    public static final Block LIGHT_GRAY_TERRACOTTA_BRICK_WALL = registerBlock("light_gray_terracotta_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS)));
    public static final Block CYAN_TERRACOTTA_BRICK_WALL = registerBlock("cyan_terracotta_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(DecoBlocks.CYAN_TERRACOTTA_BRICKS)));
    public static final Block PURPLE_TERRACOTTA_BRICK_WALL = registerBlock("purple_terracotta_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(DecoBlocks.PURPLE_TERRACOTTA_BRICKS)));
    public static final Block BLUE_TERRACOTTA_BRICK_WALL = registerBlock("blue_terracotta_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(DecoBlocks.BLUE_TERRACOTTA_BRICKS)));
    public static final Block BROWN_TERRACOTTA_BRICK_WALL = registerBlock("brown_terracotta_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(DecoBlocks.BROWN_TERRACOTTA_BRICKS)));
    public static final Block GREEN_TERRACOTTA_BRICK_WALL = registerBlock("green_terracotta_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(DecoBlocks.GREEN_TERRACOTTA_BRICKS)));
    public static final Block RED_TERRACOTTA_BRICK_WALL = registerBlock("red_terracotta_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(DecoBlocks.RED_TERRACOTTA_BRICKS)));
    public static final Block BLACK_TERRACOTTA_BRICK_WALL = registerBlock("black_terracotta_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(DecoBlocks.BLACK_TERRACOTTA_BRICKS)));
    public static final Block TERRACOTTA_BRICK_WALL = registerBlock("terracotta_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(DecoBlocks.TERRACOTTA_BRICKS)));
    public static final Block SOUL_SOILSTONE_WALL = registerBlock("soul_soilstone_wall",
            new WallBlock(AbstractBlock.Settings.copy(DecoBlocks.SOUL_SOILSTONE)));
    public static final Block CUT_SOUL_SOILSTONE_WALL = registerBlock("cut_soul_soilstone_wall",
            new WallBlock(AbstractBlock.Settings.copy(DecoBlocks.CUT_SOUL_SOILSTONE)));
    public static final Block SMOOTH_SOUL_SOILSTONE_WALL = registerBlock("smooth_soul_soilstone_wall",
            new WallBlock(AbstractBlock.Settings.copy(DecoBlocks.SMOOTH_SOUL_SOILSTONE)));
    public static final Block CUT_SOUL_SOILSTONE_BRICK_WALL = registerBlock("cut_soul_soilstone_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS)));
    public static final Block CUT_QUARTZ_WALL = registerBlock("cut_quartz_wall",
            new WallBlock(AbstractBlock.Settings.copy(DecoBlocks.CUT_QUARTZ)));
    public static final Block ICE_BRICK_WALL = registerBlock("ice_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(DecoBlocks.ICE_BRICKS)));
    public static final Block CUT_WHITE_CONCRETE_WALL = registerBlock("cut_white_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(DecoBlocks.CUT_WHITE_CONCRETE)));
    public static final Block CUT_ORANGE_CONCRETE_WALL = registerBlock("cut_orange_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(DecoBlocks.CUT_ORANGE_CONCRETE)));
    public static final Block CUT_MAGENTA_CONCRETE_WALL = registerBlock("cut_magenta_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(DecoBlocks.CUT_MAGENTA_CONCRETE)));
    public static final Block CUT_LIGHT_BLUE_CONCRETE_WALL = registerBlock("cut_light_blue_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(DecoBlocks.CUT_LIGHT_BLUE_CONCRETE)));
    public static final Block CUT_YELLOW_CONCRETE_WALL = registerBlock("cut_yellow_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(DecoBlocks.CUT_YELLOW_CONCRETE)));
    public static final Block CUT_LIME_CONCRETE_WALL = registerBlock("cut_lime_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(DecoBlocks.CUT_LIME_CONCRETE)));
    public static final Block CUT_PINK_CONCRETE_WALL = registerBlock("cut_pink_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(DecoBlocks.CUT_PINK_CONCRETE)));
    public static final Block CUT_GRAY_CONCRETE_WALL = registerBlock("cut_gray_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(DecoBlocks.CUT_GRAY_CONCRETE)));
    public static final Block CUT_LIGHT_GRAY_CONCRETE_WALL = registerBlock("cut_light_gray_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(DecoBlocks.CUT_LIGHT_GRAY_CONCRETE)));
    public static final Block CUT_CYAN_CONCRETE_WALL = registerBlock("cut_cyan_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(DecoBlocks.CUT_CYAN_CONCRETE)));
    public static final Block CUT_PURPLE_CONCRETE_WALL = registerBlock("cut_purple_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(DecoBlocks.CUT_PURPLE_CONCRETE)));
    public static final Block CUT_BLUE_CONCRETE_WALL = registerBlock("cut_blue_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(DecoBlocks.CUT_BLUE_CONCRETE)));
    public static final Block CUT_BROWN_CONCRETE_WALL = registerBlock("cut_brown_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(DecoBlocks.CUT_BROWN_CONCRETE)));
    public static final Block CUT_GREEN_CONCRETE_WALL = registerBlock("cut_green_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(DecoBlocks.CUT_GREEN_CONCRETE)));
    public static final Block CUT_RED_CONCRETE_WALL = registerBlock("cut_red_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(DecoBlocks.CUT_RED_CONCRETE)));
    public static final Block CUT_BLACK_CONCRETE_WALL = registerBlock("cut_black_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(DecoBlocks.CUT_BLACK_CONCRETE)));
    public static final Block CRYSTALLIZED_PRISMARINE_WALL = registerBlock("crystallized_prismarine_wall",
            new WallBlock(AbstractBlock.Settings.copy(DecoBlocks.CRYSTALLIZED_PRISMARINE)));
    public static final Block CRYSTALLIZED_PRISMARINE_BRICK_WALL = registerBlock("crystallized_prismarine_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS)));
    public static final Block LIGHT_PRISMARINE_WALL = registerBlock("light_prismarine_wall",
            new WallBlock(AbstractBlock.Settings.copy(DecoBlocks.LIGHT_PRISMARINE)));
    public static final Block CUT_RED_SANDSTONE_BRICK_WALL = registerBlock("cut_red_sandstone_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(DecoBlocks.CUT_RED_SANDSTONE_BRICKS)));
    public static final Block MAGMA_BRICK_WALL = registerBlock("magma_brick_wall",
            new MagmaBrickWallBlock(AbstractBlock.Settings.copy(DecoBlocks.MAGMA_BRICKS)));
    public static final Block BUBBLE_WALL = registerBlock("bubble_wall",
            new BubbleWallBlock(AbstractBlock.Settings.copy(DecoBlocks.BUBBLE_BLOCK)));
    public static final Block BUBBLE_BRICK_WALL = registerBlock("bubble_brick_wall",
            new BubbleWallBlock(AbstractBlock.Settings.copy(DecoBlocks.BUBBLE_BRICKS)));
    public static final Block BLUE_NETHER_BRICK_WALL = registerBlock("blue_nether_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(DecoBlocks.BLUE_NETHER_BRICKS)));
    public static final Block POLISHED_BLACKSTONE_TILE_WALL = registerBlock("polished_blackstone_tile_wall",
            new WallBlock(AbstractBlock.Settings.copy(DecoBlocks.POLISHED_BLACKSTONE_TILES)));
    public static final Block TUFF_TILE_WALL = registerBlock("tuff_tile_wall",
            new WallBlock(AbstractBlock.Settings.copy(DecoBlocks.TUFF_TILES)));

    public static final Block RED_SUNFLOWER = registerBlock("red_sunflower",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.SUNFLOWER)));
    public static final Block NOVA_STARFLOWER = registerBlock("nova_starflower",
            new NovaStarflowerBlock(AbstractBlock.Settings.copy(Blocks.SUNFLOWER)));

    public static final Block WITHER_ROSE_BUSH = registerBlock("wither_rose_bush",
            new WitherRoseBushBlock(AbstractBlock.Settings.copy(Blocks.ROSE_BUSH)));
    public static final Block ENDER_ROSE_BUSH = registerBlock("ender_rose_bush",
            new EnderRoseBushBlock(AbstractBlock.Settings.copy(Blocks.ROSE_BUSH)));

    public static final Block TINTED_GLASS_PANE = registerBlock("tinted_glass_pane",
            new TintedGlassPaneBlock(AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS_PANE).nonOpaque()));
    public static final Block HARDENED_GLASS_PANE = registerBlock("hardened_glass_pane",
            new PaneBlock(AbstractBlock.Settings.copy(Blocks.GLASS_PANE).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()));
    public static final Block HARDENED_TINTED_GLASS_PANE = registerBlock("hardened_tinted_glass_pane",
            new PaneBlock(AbstractBlock.Settings.copy(DecoBlocks.TINTED_GLASS_PANE).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()));
    public static final Block HARDENED_WHITE_STAINED_GLASS_PANE = registerBlock("hardened_white_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.WHITE,AbstractBlock.Settings.copy(Blocks.WHITE_STAINED_GLASS_PANE).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()));
    public static final Block HARDENED_ORANGE_STAINED_GLASS_PANE = registerBlock("hardened_orange_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.ORANGE,AbstractBlock.Settings.copy(Blocks.ORANGE_STAINED_GLASS_PANE).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()));
    public static final Block HARDENED_MAGENTA_STAINED_GLASS_PANE = registerBlock("hardened_magenta_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.MAGENTA,AbstractBlock.Settings.copy(Blocks.MAGENTA_STAINED_GLASS_PANE).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()));
    public static final Block HARDENED_LIGHT_BLUE_STAINED_GLASS_PANE = registerBlock("hardened_light_blue_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.LIGHT_BLUE, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_STAINED_GLASS_PANE).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()));
    public static final Block HARDENED_YELLOW_STAINED_GLASS_PANE = registerBlock("hardened_yellow_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.YELLOW, AbstractBlock.Settings.copy(Blocks.YELLOW_STAINED_GLASS_PANE).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()));
    public static final Block HARDENED_LIME_STAINED_GLASS_PANE = registerBlock("hardened_lime_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.LIME, AbstractBlock.Settings.copy(Blocks.LIME_STAINED_GLASS_PANE).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()));
    public static final Block HARDENED_PINK_STAINED_GLASS_PANE = registerBlock("hardened_pink_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.PINK, AbstractBlock.Settings.copy(Blocks.PINK_STAINED_GLASS_PANE).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()));
    public static final Block HARDENED_GRAY_STAINED_GLASS_PANE = registerBlock("hardened_gray_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.GRAY, AbstractBlock.Settings.copy(Blocks.GRAY_STAINED_GLASS_PANE).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()));
    public static final Block HARDENED_LIGHT_GRAY_STAINED_GLASS_PANE = registerBlock("hardened_light_gray_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.LIGHT_GRAY, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_STAINED_GLASS_PANE).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()));
    public static final Block HARDENED_CYAN_STAINED_GLASS_PANE = registerBlock("hardened_cyan_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.CYAN, AbstractBlock.Settings.copy(Blocks.CYAN_STAINED_GLASS_PANE).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()));
    public static final Block HARDENED_PURPLE_STAINED_GLASS_PANE = registerBlock("hardened_purple_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.PURPLE, AbstractBlock.Settings.copy(Blocks.PURPLE_STAINED_GLASS_PANE).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()));
    public static final Block HARDENED_BLUE_STAINED_GLASS_PANE = registerBlock("hardened_blue_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.BLUE, AbstractBlock.Settings.copy(Blocks.BLUE_STAINED_GLASS_PANE).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()));
    public static final Block HARDENED_BROWN_STAINED_GLASS_PANE = registerBlock("hardened_brown_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.BROWN, AbstractBlock.Settings.copy(Blocks.BROWN_STAINED_GLASS_PANE).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()));
    public static final Block HARDENED_GREEN_STAINED_GLASS_PANE = registerBlock("hardened_green_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.GREEN, AbstractBlock.Settings.copy(Blocks.GREEN_STAINED_GLASS_PANE).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()));
    public static final Block HARDENED_RED_STAINED_GLASS_PANE = registerBlock("hardened_red_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.RED, AbstractBlock.Settings.copy(Blocks.RED_STAINED_GLASS_PANE).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()));
    public static final Block HARDENED_BLACK_STAINED_GLASS_PANE = registerBlock("hardened_black_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.BLACK, AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS_PANE).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()));

    public static final Block MOSAIC_WHITE_STAINED_GLASS_PANE = registerBlock("mosaic_white_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.WHITE,AbstractBlock.Settings.copy(Blocks.WHITE_STAINED_GLASS_PANE).strength(0.6F,0.3f)
                    .nonOpaque()));
    public static final Block MOSAIC_ORANGE_STAINED_GLASS_PANE = registerBlock("mosaic_orange_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.ORANGE,AbstractBlock.Settings.copy(Blocks.ORANGE_STAINED_GLASS_PANE).strength(0.6F,0.3f)
                    .nonOpaque()));
    public static final Block MOSAIC_MAGENTA_STAINED_GLASS_PANE = registerBlock("mosaic_magenta_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.MAGENTA,AbstractBlock.Settings.copy(Blocks.MAGENTA_STAINED_GLASS_PANE).strength(0.6F,0.3f)
                    .nonOpaque()));
    public static final Block MOSAIC_LIGHT_BLUE_STAINED_GLASS_PANE = registerBlock("mosaic_light_blue_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.LIGHT_BLUE, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_STAINED_GLASS_PANE).strength(0.6F,0.3f)
                    .nonOpaque()));
    public static final Block MOSAIC_YELLOW_STAINED_GLASS_PANE = registerBlock("mosaic_yellow_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.YELLOW, AbstractBlock.Settings.copy(Blocks.YELLOW_STAINED_GLASS_PANE).strength(0.6F,0.3f)
                    .nonOpaque()));
    public static final Block MOSAIC_LIME_STAINED_GLASS_PANE = registerBlock("mosaic_lime_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.LIME, AbstractBlock.Settings.copy(Blocks.LIME_STAINED_GLASS_PANE).strength(0.6F,0.3f)
                    .nonOpaque()));
    public static final Block MOSAIC_PINK_STAINED_GLASS_PANE = registerBlock("mosaic_pink_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.PINK, AbstractBlock.Settings.copy(Blocks.PINK_STAINED_GLASS_PANE).strength(0.6F,0.3f)
                    .nonOpaque()));
    public static final Block MOSAIC_GRAY_STAINED_GLASS_PANE = registerBlock("mosaic_gray_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.GRAY, AbstractBlock.Settings.copy(Blocks.GRAY_STAINED_GLASS_PANE).strength(0.6F,0.3f)
                    .nonOpaque()));
    public static final Block MOSAIC_LIGHT_GRAY_STAINED_GLASS_PANE = registerBlock("mosaic_light_gray_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.LIGHT_GRAY, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_STAINED_GLASS_PANE).strength(0.6F,0.3f)
                    .nonOpaque()));
    public static final Block MOSAIC_CYAN_STAINED_GLASS_PANE = registerBlock("mosaic_cyan_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.CYAN, AbstractBlock.Settings.copy(Blocks.CYAN_STAINED_GLASS_PANE).strength(0.6F,0.3f)
                    .nonOpaque()));
    public static final Block MOSAIC_PURPLE_STAINED_GLASS_PANE = registerBlock("mosaic_purple_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.PURPLE, AbstractBlock.Settings.copy(Blocks.PURPLE_STAINED_GLASS_PANE).strength(0.6F,0.3f)
                    .nonOpaque()));
    public static final Block MOSAIC_BLUE_STAINED_GLASS_PANE = registerBlock("mosaic_blue_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.BLUE, AbstractBlock.Settings.copy(Blocks.BLUE_STAINED_GLASS_PANE).strength(0.6F,0.3f)
                    .nonOpaque()));
    public static final Block MOSAIC_BROWN_STAINED_GLASS_PANE = registerBlock("mosaic_brown_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.BROWN, AbstractBlock.Settings.copy(Blocks.BROWN_STAINED_GLASS_PANE).strength(0.6F,0.3f)
                    .nonOpaque()));
    public static final Block MOSAIC_GREEN_STAINED_GLASS_PANE = registerBlock("mosaic_green_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.GREEN, AbstractBlock.Settings.copy(Blocks.GREEN_STAINED_GLASS_PANE).strength(0.6F,0.3f)
                    .nonOpaque()));
    public static final Block MOSAIC_RED_STAINED_GLASS_PANE = registerBlock("mosaic_red_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.RED, AbstractBlock.Settings.copy(Blocks.RED_STAINED_GLASS_PANE).strength(0.6F,0.3f)
                    .nonOpaque()));
    public static final Block MOSAIC_BLACK_STAINED_GLASS_PANE = registerBlock("mosaic_black_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.BLACK, AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS_PANE).strength(0.6F,0.3f)
                    .nonOpaque()));

    public static final Block OAK_BARREL = registerBlock("oak_barrel",
            new OakBarrelBlock(AbstractBlock.Settings.copy(Blocks.BARREL).mapColor(MapColor.OAK_TAN)));
    public static final Block SPRUCE_BARREL = registerBlock("spruce_barrel",
            new SpruceBarrelBlock(AbstractBlock.Settings.copy(Blocks.BARREL)));
    public static final Block BIRCH_BARREL = registerBlock("birch_barrel",
            new BirchBarrelBlock(AbstractBlock.Settings.copy(Blocks.BARREL).mapColor(MapColor.PALE_YELLOW)));
    public static final Block JUNGLE_BARREL = registerBlock("jungle_barrel",
            new JungleBarrelBlock(AbstractBlock.Settings.copy(Blocks.BARREL).mapColor(MapColor.DIRT_BROWN)));
    public static final Block ACACIA_BARREL = registerBlock("acacia_barrel",
            new AcaciaBarrelBlock(AbstractBlock.Settings.copy(Blocks.BARREL).mapColor(MapColor.ORANGE)));
    public static final Block DARK_OAK_BARREL = registerBlock("dark_oak_barrel",
            new DarkOakBarrelBlock(AbstractBlock.Settings.copy(Blocks.BARREL).mapColor(MapColor.BROWN)));
    public static final Block MANGROVE_BARREL = registerBlock("mangrove_barrel",
            new MangroveBarrelBlock(AbstractBlock.Settings.copy(Blocks.BARREL).mapColor(MapColor.RED)));
    public static final Block BAMBOO_BARREL = registerBlock("bamboo_barrel",
            new BambooBarrelBlock(AbstractBlock.Settings.copy(Blocks.BARREL).mapColor(MapColor.YELLOW)
                    .sounds(BlockSoundGroup.BAMBOO_WOOD)));
    public static final Block CHERRY_BARREL = registerBlock("cherry_barrel",
            new CherryBarrelBlock(AbstractBlock.Settings.copy(Blocks.BARREL).mapColor(MapColor.TERRACOTTA_WHITE)
                    .sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block CRIMSON_BARREL = registerBlock("crimson_barrel",
            new CrimsonBarrelBlock(AbstractBlock.Settings.copy(Blocks.BARREL).mapColor(MapColor.DULL_PINK)
                    .sounds(BlockSoundGroup.NETHER_WOOD)));
    public static final Block WARPED_BARREL = registerBlock("warped_barrel",
            new WarpedBarrelBlock(AbstractBlock.Settings.copy(Blocks.BARREL).mapColor(MapColor.DARK_AQUA)
                    .sounds(BlockSoundGroup.NETHER_WOOD)));
    public static final Block CACTUS_BARREL = registerBlock("cactus_barrel",
            new CactusBarrelBlock(AbstractBlock.Settings.copy(Blocks.BARREL).mapColor(MapColor.PALE_GREEN)));

    public static final Block SPRUCE_BOOKSHELF = registerBlock("spruce_bookshelf",
            new Block(AbstractBlock.Settings.copy(Blocks.BOOKSHELF).mapColor(MapColor.BROWN)));
    public static final Block BIRCH_BOOKSHELF = registerBlock("birch_bookshelf",
            new Block(AbstractBlock.Settings.copy(Blocks.BOOKSHELF).mapColor(MapColor.PALE_YELLOW)));
    public static final Block JUNGLE_BOOKSHELF = registerBlock("jungle_bookshelf",
            new Block(AbstractBlock.Settings.copy(Blocks.BOOKSHELF).mapColor(MapColor.DIRT_BROWN)));
    public static final Block ACACIA_BOOKSHELF = registerBlock("acacia_bookshelf",
            new Block(AbstractBlock.Settings.copy(Blocks.BOOKSHELF).mapColor(MapColor.ORANGE)));
    public static final Block DARK_OAK_BOOKSHELF = registerBlock("dark_oak_bookshelf",
            new Block(AbstractBlock.Settings.copy(Blocks.BOOKSHELF).mapColor(MapColor.BROWN)));
    public static final Block MANGROVE_BOOKSHELF = registerBlock("mangrove_bookshelf",
            new Block(AbstractBlock.Settings.copy(Blocks.BOOKSHELF).mapColor(MapColor.RED)));
    public static final Block BAMBOO_BOOKSHELF = registerBlock("bamboo_bookshelf",
            new Block(AbstractBlock.Settings.copy(Blocks.BOOKSHELF).mapColor(MapColor.YELLOW)
                    .sounds(BlockSoundGroup.BAMBOO_WOOD)));
    public static final Block CHERRY_BOOKSHELF = registerBlock("cherry_bookshelf",
            new Block(AbstractBlock.Settings.copy(Blocks.BOOKSHELF).mapColor(MapColor.TERRACOTTA_WHITE)
                    .sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block CRIMSON_BOOKSHELF = registerBlock("crimson_bookshelf",
            new Block(AbstractBlock.Settings.copy(Blocks.BOOKSHELF).mapColor(MapColor.DULL_PINK)
                    .sounds(BlockSoundGroup.NETHER_WOOD)));
    public static final Block WARPED_BOOKSHELF = registerBlock("warped_bookshelf",
            new Block(AbstractBlock.Settings.copy(Blocks.BOOKSHELF).mapColor(MapColor.DARK_AQUA)
                    .sounds(BlockSoundGroup.NETHER_WOOD)));
    public static final Block CACTUS_BOOKSHELF = registerBlock("cactus_bookshelf",
            new Block(AbstractBlock.Settings.copy(Blocks.BOOKSHELF).mapColor(MapColor.PALE_GREEN)));
    public static final Block WOODEN_BOOKSHELF = registerBlock("wooden_bookshelf",
            new Block(AbstractBlock.Settings.copy(Blocks.BOOKSHELF).mapColor(MapColor.BROWN)));

    public static final Block DEEPSLATE_SMOKER = registerBlock("deepslate_smoker",
            new DeepslateSmokerBlock(AbstractBlock.Settings.copy(Blocks.SMOKER).mapColor(MapColor.DEEPSLATE_GRAY)
                    .strength(4.5f).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block BLACKSTONE_SMOKER = registerBlock("blackstone_smoker",
            new BlackstoneSmokerBlock(AbstractBlock.Settings.copy(Blocks.SMOKER).mapColor(MapColor.BLACK)
                    .strength(3.0f)));
    public static final Block TUFF_SMOKER = registerBlock("tuff_smoker",
            new TuffSmokerBlock(AbstractBlock.Settings.copy(Blocks.SMOKER).mapColor(MapColor.TERRACOTTA_GRAY)
                    .strength(3.0f).sounds(BlockSoundGroup.TUFF)));

    public static final Block DEEPSLATE_BLAST_FURNACE = registerBlock("deepslate_blast_furnace",
            new DeepslateBlastFurnaceBlock(AbstractBlock.Settings.copy(Blocks.BLAST_FURNACE).mapColor(MapColor.DEEPSLATE_GRAY)
                    .strength(4.5f).sounds(BlockSoundGroup.DEEPSLATE_BRICKS)));
    public static final Block BLACKSTONE_BLAST_FURNACE = registerBlock("blackstone_blast_furnace",
            new BlackstoneBlastFurnaceBlock(AbstractBlock.Settings.copy(Blocks.BLAST_FURNACE).mapColor(MapColor.BLACK)
                    .strength(3.0f)));
    public static final Block TUFF_BLAST_FURNACE = registerBlock("tuff_blast_furnace",
            new TuffBlastFurnaceBlock(AbstractBlock.Settings.copy(Blocks.BLAST_FURNACE).mapColor(MapColor.TERRACOTTA_GRAY)
                    .strength(3.0f).sounds(BlockSoundGroup.TUFF_BRICKS)));

    public static final Block OAK_CARTOGRAPHY_TABLE = registerBlock("oak_cartography_table",
            new OakCartographyTableBlock(AbstractBlock.Settings.copy(Blocks.CARTOGRAPHY_TABLE)));
    public static final Block BIRCH_CARTOGRAPHY_TABLE = registerBlock("birch_cartography_table",
            new BirchCartographyTableBlock(AbstractBlock.Settings.copy(Blocks.CARTOGRAPHY_TABLE)));
    public static final Block SPRUCE_CARTOGRAPHY_TABLE = registerBlock("spruce_cartography_table",
            new SpruceCartographyTableBlock(AbstractBlock.Settings.copy(Blocks.CARTOGRAPHY_TABLE)));
    public static final Block JUNGLE_CARTOGRAPHY_TABLE = registerBlock("jungle_cartography_table",
            new JungleCartographyTableBlock(AbstractBlock.Settings.copy(Blocks.CARTOGRAPHY_TABLE)));
    public static final Block ACACIA_CARTOGRAPHY_TABLE = registerBlock("acacia_cartography_table",
            new AcaciaCartographyTableBlock(AbstractBlock.Settings.copy(Blocks.CARTOGRAPHY_TABLE)));
    public static final Block DARK_OAK_CARTOGRAPHY_TABLE = registerBlock("dark_oak_cartography_table",
            new DarkOakCartographyTableBlock(AbstractBlock.Settings.copy(Blocks.CARTOGRAPHY_TABLE)));
    public static final Block MANGROVE_CARTOGRAPHY_TABLE = registerBlock("mangrove_cartography_table",
            new MangroveCartographyTableBlock(AbstractBlock.Settings.copy(Blocks.CARTOGRAPHY_TABLE)));
    public static final Block CHERRY_CARTOGRAPHY_TABLE = registerBlock("cherry_cartography_table",
            new CherryCartographyTableBlock(AbstractBlock.Settings.copy(Blocks.CARTOGRAPHY_TABLE)
                    .sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block BAMBOO_CARTOGRAPHY_TABLE = registerBlock("bamboo_cartography_table",
            new BambooCartographyTableBlock(AbstractBlock.Settings.copy(Blocks.CARTOGRAPHY_TABLE)
                    .sounds(BlockSoundGroup.BAMBOO_WOOD)));
    public static final Block CRIMSON_CARTOGRAPHY_TABLE = registerBlock("crimson_cartography_table",
            new CrimsonCartographyTableBlock(AbstractBlock.Settings.copy(Blocks.CARTOGRAPHY_TABLE)
                    .sounds(BlockSoundGroup.NETHER_WOOD)));
    public static final Block WARPED_CARTOGRAPHY_TABLE = registerBlock("warped_cartography_table",
            new WarpedCartographyTableBlock(AbstractBlock.Settings.copy(Blocks.CARTOGRAPHY_TABLE)
                    .sounds(BlockSoundGroup.NETHER_WOOD)));
    public static final Block CACTUS_CARTOGRAPHY_TABLE = registerBlock("cactus_cartography_table",
            new CactusCartographyTableBlock(AbstractBlock.Settings.copy(Blocks.CARTOGRAPHY_TABLE)));

    public static final Block OAK_SMITHING_TABLE = registerBlock("oak_smithing_table",
            new OakSmithingTableBlock(AbstractBlock.Settings.copy(Blocks.SMITHING_TABLE)));
    public static final Block SPRUCE_SMITHING_TABLE = registerBlock("spruce_smithing_table",
            new SpruceSmithingTableBlock(AbstractBlock.Settings.copy(Blocks.SMITHING_TABLE)));
    public static final Block BIRCH_SMITHING_TABLE = registerBlock("birch_smithing_table",
            new BirchSmithingTableBlock(AbstractBlock.Settings.copy(Blocks.SMITHING_TABLE)));
    public static final Block JUNGLE_SMITHING_TABLE = registerBlock("jungle_smithing_table",
            new JungleSmithingTableBlock(AbstractBlock.Settings.copy(Blocks.SMITHING_TABLE)));
    public static final Block ACACIA_SMITHING_TABLE = registerBlock("acacia_smithing_table",
            new AcaciaSmithingTableBlock(AbstractBlock.Settings.copy(Blocks.SMITHING_TABLE)));
    public static final Block DARK_OAK_SMITHING_TABLE = registerBlock("dark_oak_smithing_table",
            new DarkOakSmithingTableBlock(AbstractBlock.Settings.copy(Blocks.SMITHING_TABLE)));
    public static final Block MANGROVE_SMITHING_TABLE = registerBlock("mangrove_smithing_table",
            new MangroveSmithingTableBlock(AbstractBlock.Settings.copy(Blocks.SMITHING_TABLE)));
    public static final Block CRIMSON_SMITHING_TABLE = registerBlock("crimson_smithing_table",
            new CrimsonSmithingTableBlock(AbstractBlock.Settings.copy(Blocks.SMITHING_TABLE)
                    .sounds(BlockSoundGroup.NETHER_WOOD)));
    public static final Block WARPED_SMITHING_TABLE = registerBlock("warped_smithing_table",
            new WarpedSmithingTableBlock(AbstractBlock.Settings.copy(Blocks.SMITHING_TABLE)
                    .sounds(BlockSoundGroup.NETHER_WOOD)));
    public static final Block BAMBOO_SMITHING_TABLE = registerBlock("bamboo_smithing_table",
            new BambooSmithingTableBlock(AbstractBlock.Settings.copy(Blocks.SMITHING_TABLE)
                    .sounds(BlockSoundGroup.BAMBOO_WOOD)));
    public static final Block CHERRY_SMITHING_TABLE = registerBlock("cherry_smithing_table",
            new CherrySmithingTableBlock(AbstractBlock.Settings.copy(Blocks.SMITHING_TABLE)
                    .sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block CACTUS_SMITHING_TABLE = registerBlock("cactus_smithing_table",
            new CactusSmithingTableBlock(AbstractBlock.Settings.copy(Blocks.SMITHING_TABLE)));

    public static final Block DEEPSLATE_STONECUTTER = registerBlock("deepslate_stonecutter",
            new DeepslateStonecutterBlock(AbstractBlock.Settings.copy(Blocks.STONECUTTER).mapColor(MapColor.DEEPSLATE_GRAY)
                    .strength(4.5f).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block BLACKSTONE_STONECUTTER = registerBlock("blackstone_stonecutter",
            new BlackstoneStonecutterBlock(AbstractBlock.Settings.copy(Blocks.STONECUTTER).mapColor(MapColor.BLACK)
                    .strength(3.0f)));
    public static final Block TUFF_STONECUTTER = registerBlock("tuff_stonecutter",
            new TuffStonecutterBlock(AbstractBlock.Settings.copy(Blocks.STONECUTTER).mapColor(MapColor.BLACK)
                    .strength(3.0f).sounds(BlockSoundGroup.TUFF)));

    public static final Block COPPER_LANTERN = registerBlock("copper_lantern",
            new OxidizableLanternBlock(Oxidizable.OxidationLevel.UNAFFECTED,AbstractBlock.Settings.copy(Blocks.LANTERN)
                    .sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_COPPER_LANTERN = registerBlock("waxed_copper_lantern",
            new LanternBlock(AbstractBlock.Settings.copy(DecoBlocks.COPPER_LANTERN)));
    public static final Block EXPOSED_COPPER_LANTERN = registerBlock("exposed_copper_lantern",
            new OxidizableLanternBlock(Oxidizable.OxidationLevel.EXPOSED,AbstractBlock.Settings.copy(Blocks.LANTERN)
                    .sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_EXPOSED_COPPER_LANTERN = registerBlock("waxed_exposed_copper_lantern",
            new LanternBlock(AbstractBlock.Settings.copy(DecoBlocks.EXPOSED_COPPER_LANTERN)));
    public static final Block WEATHERED_COPPER_LANTERN = registerBlock("weathered_copper_lantern",
            new OxidizableLanternBlock(Oxidizable.OxidationLevel.WEATHERED,AbstractBlock.Settings.copy(Blocks.LANTERN)
                    .sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_WEATHERED_COPPER_LANTERN = registerBlock("waxed_weathered_copper_lantern",
            new LanternBlock(AbstractBlock.Settings.copy(DecoBlocks.WEATHERED_COPPER_LANTERN)));
    public static final Block OXIDIZED_COPPER_LANTERN = registerBlock("oxidized_copper_lantern",
            new OxidizableLanternBlock(Oxidizable.OxidationLevel.OXIDIZED,AbstractBlock.Settings.copy(Blocks.LANTERN)
                    .sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_OXIDIZED_COPPER_LANTERN = registerBlock("waxed_oxidized_copper_lantern",
            new LanternBlock(AbstractBlock.Settings.copy(DecoBlocks.OXIDIZED_COPPER_LANTERN)));

    public static final Block COPPER_SOUL_LANTERN = registerBlock("copper_soul_lantern",
            new OxidizableLanternBlock(Oxidizable.OxidationLevel.UNAFFECTED,AbstractBlock.Settings.copy(Blocks.SOUL_LANTERN)
                    .sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_COPPER_SOUL_LANTERN = registerBlock("waxed_copper_soul_lantern",
            new LanternBlock(AbstractBlock.Settings.copy(DecoBlocks.COPPER_SOUL_LANTERN)));
    public static final Block EXPOSED_COPPER_SOUL_LANTERN = registerBlock("exposed_copper_soul_lantern",
            new OxidizableLanternBlock(Oxidizable.OxidationLevel.EXPOSED,AbstractBlock.Settings.copy(Blocks.SOUL_LANTERN)
                    .sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_EXPOSED_COPPER_SOUL_LANTERN = registerBlock("waxed_exposed_copper_soul_lantern",
            new LanternBlock(AbstractBlock.Settings.copy(DecoBlocks.EXPOSED_COPPER_SOUL_LANTERN)));
    public static final Block WEATHERED_COPPER_SOUL_LANTERN = registerBlock("weathered_copper_soul_lantern",
            new OxidizableLanternBlock(Oxidizable.OxidationLevel.WEATHERED,AbstractBlock.Settings.copy(Blocks.SOUL_LANTERN)
                    .sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_WEATHERED_COPPER_SOUL_LANTERN = registerBlock("waxed_weathered_copper_soul_lantern",
            new LanternBlock(AbstractBlock.Settings.copy(DecoBlocks.WEATHERED_COPPER_SOUL_LANTERN)));
    public static final Block OXIDIZED_COPPER_SOUL_LANTERN = registerBlock("oxidized_copper_soul_lantern",
            new OxidizableLanternBlock(Oxidizable.OxidationLevel.OXIDIZED,AbstractBlock.Settings.copy(Blocks.SOUL_LANTERN)
                    .sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_OXIDIZED_COPPER_SOUL_LANTERN = registerBlock("waxed_oxidized_copper_soul_lantern",
            new LanternBlock(AbstractBlock.Settings.copy(DecoBlocks.OXIDIZED_COPPER_SOUL_LANTERN)));

    public static final Block DEEPSLATE_BUTTON = registerBlock("deepslate_button",
            new ButtonBlock(DecoBlockSets.DEEPSLATE, 20, AbstractBlock.Settings.copy(Blocks.STONE_BUTTON)));
    public static final Block COBBLED_DEEPSLATE_BUTTON = registerBlock("cobbled_deepslate_button",
            new ButtonBlock(DecoBlockSets.DEEPSLATE, 20,AbstractBlock.Settings.copy(Blocks.STONE_BUTTON)));
    public static final Block POLISHED_DEEPSLATE_BUTTON = registerBlock("polished_deepslate_button",
            new ButtonBlock(DecoBlockSets.POLISHED_DEEPSLATE, 20, AbstractBlock.Settings.copy(Blocks.STONE_BUTTON)));
    public static final Block COBBLESTONE_BUTTON = registerBlock("cobblestone_button",
            new ButtonBlock(BlockSetType.STONE, 20,AbstractBlock.Settings.copy(Blocks.STONE_BUTTON)));
    public static final Block BLACKSTONE_BUTTON = registerBlock("blackstone_button",
            new ButtonBlock(DecoBlockSets.BLACKSTONE, 20, AbstractBlock.Settings.copy(Blocks.STONE_BUTTON)));
    public static final Block POLISHED_STONE_BUTTON = registerBlock("polished_stone_button",
            new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.copy(Blocks.STONE_BUTTON)));
    public static final Block TUFF_BUTTON = registerBlock("tuff_button",
            new ButtonBlock(DecoBlockSets.TUFF, 20, AbstractBlock.Settings.copy(Blocks.STONE_BUTTON)));
    public static final Block POLISHED_TUFF_BUTTON = registerBlock("polished_tuff_button",
            new ButtonBlock(DecoBlockSets.POLISHED_TUFF, 20, AbstractBlock.Settings.copy(Blocks.STONE_BUTTON)));
    public static final Block CACTUS_PLANK_BUTTON = registerBlock("cactus_plank_button",
            new ButtonBlock(DecoBlockSets.CACUTS, 30, AbstractBlock.Settings.copy(Blocks.OAK_BUTTON)));
    public static final Block WOODEN_BUTTON = registerBlock("wooden_button",
            new ButtonBlock(DecoBlockSets.WOODEN, 30, AbstractBlock.Settings.copy(Blocks.OAK_BUTTON)));

    public static final Block IRON_BUTTON = registerBlock("iron_button",
            new ButtonBlock(BlockSetType.IRON, 50, AbstractBlock.Settings.copy(Blocks.STONE_BUTTON)));
    public static final Block GOLD_BUTTON = registerBlock("gold_button",
            new ButtonBlock(BlockSetType.GOLD, 1, AbstractBlock.Settings.copy(Blocks.STONE_BUTTON)));

    public static final Block COPPER_BUTTON = registerBlock("copper_button",
            new OxidizableButtonBlock(Oxidizable.OxidationLevel.UNAFFECTED,AbstractBlock.Settings.copy(Blocks.STONE_BUTTON)
                    .sounds(BlockSoundGroup.COPPER), BlockSetType.COPPER, 10));
    public static final Block WAXED_COPPER_BUTTON = registerBlock("waxed_copper_button",
            new ButtonBlock(BlockSetType.COPPER, 10, AbstractBlock.Settings.copy(DecoBlocks.COPPER_BUTTON)));
    public static final Block EXPOSED_COPPER_BUTTON = registerBlock("exposed_copper_button",
            new OxidizableButtonBlock(Oxidizable.OxidationLevel.EXPOSED,AbstractBlock.Settings.copy(Blocks.STONE_BUTTON)
                    .sounds(BlockSoundGroup.COPPER), BlockSetType.COPPER, 20));
    public static final Block WAXED_EXPOSED_COPPER_BUTTON = registerBlock("waxed_exposed_copper_button",
            new ButtonBlock(BlockSetType.COPPER, 20, AbstractBlock.Settings.copy(DecoBlocks.EXPOSED_COPPER_BUTTON)));
    public static final Block WEATHERED_COPPER_BUTTON = registerBlock("weathered_copper_button",
            new OxidizableButtonBlock(Oxidizable.OxidationLevel.WEATHERED,AbstractBlock.Settings.copy(Blocks.STONE_BUTTON)
                    .sounds(BlockSoundGroup.COPPER), BlockSetType.COPPER, 30));
    public static final Block WAXED_WEATHERED_COPPER_BUTTON = registerBlock("waxed_weathered_copper_button",
            new ButtonBlock(BlockSetType.COPPER, 30, AbstractBlock.Settings.copy(DecoBlocks.WEATHERED_COPPER_BUTTON)));
    public static final Block OXIDIZED_COPPER_BUTTON = registerBlock("oxidized_copper_button",
            new OxidizableButtonBlock(Oxidizable.OxidationLevel.OXIDIZED,AbstractBlock.Settings.copy(Blocks.STONE_BUTTON)
                    .sounds(BlockSoundGroup.COPPER), BlockSetType.COPPER, 40));
    public static final Block WAXED_OXIDIZED_COPPER_BUTTON = registerBlock("waxed_oxidized_copper_button",
            new ButtonBlock(BlockSetType.COPPER, 40, AbstractBlock.Settings.copy(DecoBlocks.OXIDIZED_COPPER_BUTTON)));

    public static final Block DEEPSLATE_PRESSURE_PLATE = registerBlock("deepslate_pressure_plate",
            new PressurePlateBlock(DecoBlockSets.DEEPSLATE, AbstractBlock.Settings.copy(Blocks.STONE_PRESSURE_PLATE)
                    .mapColor(MapColor.DEEPSLATE_GRAY)));
    public static final Block COBBLED_DEEPSLATE_PRESSURE_PLATE = registerBlock("cobbled_deepslate_pressure_plate",
            new PressurePlateBlock(DecoBlockSets.DEEPSLATE, AbstractBlock.Settings.copy(Blocks.STONE_PRESSURE_PLATE)
                    .mapColor(MapColor.DEEPSLATE_GRAY).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block POLISHED_DEEPSLATE_PRESSURE_PLATE = registerBlock("polished_deepslate_pressure_plate",
            new PressurePlateBlock(DecoBlockSets.POLISHED_DEEPSLATE, AbstractBlock.Settings.copy(Blocks.STONE_PRESSURE_PLATE)
                    .mapColor(MapColor.DEEPSLATE_GRAY).sounds(BlockSoundGroup.POLISHED_DEEPSLATE)));
    public static final Block COBBLESTONE_PRESSURE_PLATE = registerBlock("cobblestone_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.STONE_PRESSURE_PLATE)));
    public static final Block BLACKSTONE_PRESSURE_PLATE = registerBlock("blackstone_pressure_plate",
            new PressurePlateBlock(DecoBlockSets.BLACKSTONE, AbstractBlock.Settings.copy(Blocks.STONE_PRESSURE_PLATE)
                    .mapColor(MapColor.BLACK)));
    public static final Block POLISHED_STONE_PRESSURE_PLATE = registerBlock("polished_stone_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.STONE_PRESSURE_PLATE)
                    .mapColor(MapColor.STONE_GRAY)));
    public static final Block TUFF_PRESSURE_PLATE = registerBlock("tuff_pressure_plate",
            new PressurePlateBlock(DecoBlockSets.TUFF, AbstractBlock.Settings.copy(Blocks.STONE_PRESSURE_PLATE)
                    .mapColor(MapColor.TERRACOTTA_GRAY)));
    public static final Block POLISHED_TUFF_PRESSURE_PLATE = registerBlock("polished_tuff_pressure_plate",
            new PressurePlateBlock(DecoBlockSets.POLISHED_TUFF, AbstractBlock.Settings.copy(Blocks.STONE_PRESSURE_PLATE)
                    .mapColor(MapColor.TERRACOTTA_GRAY)));

    public static final Block COPPER_WEIGHT_PRESSURE_PLATE = registerBlock("copper_weight_pressure_plate",
            new OxidizablePressurePlateBlock(20, Oxidizable.OxidationLevel.UNAFFECTED,AbstractBlock.Settings.copy(Blocks.LIGHT_WEIGHTED_PRESSURE_PLATE)
                    .sounds(BlockSoundGroup.COPPER),BlockSetType.COPPER));
    public static final Block WAXED_COPPER_WEIGHT_PRESSURE_PLATE = registerBlock("waxed_copper_weight_pressure_plate",
            new WeightedPressurePlateBlock(20,BlockSetType.COPPER,AbstractBlock.Settings.copy(DecoBlocks.COPPER_WEIGHT_PRESSURE_PLATE)));
    public static final Block EXPOSED_COPPER_WEIGHT_PRESSURE_PLATE = registerBlock("exposed_copper_weight_pressure_plate",
            new OxidizablePressurePlateBlock(50, Oxidizable.OxidationLevel.EXPOSED,AbstractBlock.Settings.copy(Blocks.LIGHT_WEIGHTED_PRESSURE_PLATE)
                    .sounds(BlockSoundGroup.COPPER),BlockSetType.COPPER));
    public static final Block WAXED_EXPOSED_COPPER_WEIGHT_PRESSURE_PLATE = registerBlock("waxed_exposed_copper_weight_pressure_plate",
            new WeightedPressurePlateBlock(50,BlockSetType.COPPER,AbstractBlock.Settings.copy(DecoBlocks.EXPOSED_COPPER_WEIGHT_PRESSURE_PLATE)));
    public static final Block WEATHERED_COPPER_WEIGHT_PRESSURE_PLATE = registerBlock("weathered_copper_weight_pressure_plate",
            new OxidizablePressurePlateBlock(70,Oxidizable.OxidationLevel.WEATHERED,AbstractBlock.Settings.copy(Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE)
                    .sounds(BlockSoundGroup.COPPER),BlockSetType.COPPER));
    public static final Block WAXED_WEATHERED_COPPER_WEIGHT_PRESSURE_PLATE = registerBlock("waxed_weathered_copper_weight_pressure_plate",
            new WeightedPressurePlateBlock(70,BlockSetType.COPPER,AbstractBlock.Settings.copy(DecoBlocks.WEATHERED_COPPER_WEIGHT_PRESSURE_PLATE)));
    public static final Block OXIDIZED_COPPER_WEIGHT_PRESSURE_PLATE = registerBlock("oxidized_copper_weight_pressure_plate",
            new OxidizablePressurePlateBlock(100, Oxidizable.OxidationLevel.OXIDIZED,AbstractBlock.Settings.copy(Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE)
                    .sounds(BlockSoundGroup.COPPER),BlockSetType.COPPER));
    public static final Block WAXED_OXIDIZED_COPPER_WEIGHT_PRESSURE_PLATE = registerBlock("waxed_oxidized_copper_weight_pressure_plate",
            new WeightedPressurePlateBlock(100, BlockSetType.COPPER, AbstractBlock.Settings.copy(DecoBlocks.OXIDIZED_COPPER_WEIGHT_PRESSURE_PLATE)));

    public static final Block CACTUS_PLANK_PRESSURE_PLATE = registerBlock("cactus_plank_pressure_plate",
            new PressurePlateBlock(DecoBlockSets.CACUTS,
                    AbstractBlock.Settings.copy(Blocks.OAK_PRESSURE_PLATE).mapColor(MapColor.PALE_GREEN)));
    public static final Block WOODEN_PRESSURE_PLATE = registerBlock("wooden_pressure_plate",
            new PressurePlateBlock(DecoBlockSets.WOODEN, AbstractBlock.Settings.copy(Blocks.SPRUCE_PRESSURE_PLATE)));

    public static final Block GOLD_DOOR = registerBlock("gold_door",
            new DoorBlock(BlockSetType.GOLD, AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block CACTUS_DOOR = registerBlock("cactus_door",
            new DoorBlock(BlockSetType.BIRCH, AbstractBlock.Settings.copy(Blocks.OAK_DOOR).mapColor(MapColor.PALE_GREEN).nonOpaque()));
    public static final Block WOODEN_DOOR = registerBlock("wooden_door",
            new DoorBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_DOOR).mapColor(MapColor.BROWN).nonOpaque()));
    public static final Block GOLD_TRAPDOOR = registerBlock("gold_trapdoor",
            new TrapdoorBlock(BlockSetType.GOLD, AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block CACTUS_TRAPDOOR = registerBlock("cactus_trapdoor",
            new TrapdoorBlock(BlockSetType.BIRCH, AbstractBlock.Settings.copy(Blocks.OAK_TRAPDOOR).mapColor(MapColor.PALE_GREEN).nonOpaque()));
    public static final Block WOODEN_TRAPDOOR = registerBlock("wooden_trapdoor",
            new TrapdoorBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_TRAPDOOR).mapColor(MapColor.BROWN).nonOpaque()));

    public static final Block CACTUS_PLANK_FENCE_GATE = registerBlock("cactus_plank_fence_gate",
            new FenceGateBlock(WoodType.BIRCH, AbstractBlock.Settings.copy(DecoBlocks.CACTUS_PLANKS)));
    public static final Block WOODEN_FENCE_GATE = registerBlock("wooden_fence_gate",
            new FenceGateBlock(WoodType.OAK, AbstractBlock.Settings.copy(DecoBlocks.WOODEN_PLANKS)));
    public static final Block NETHER_BRICK_FENCE_GATE = registerBlock("nether_brick_fence_gate",
            new FenceGateBlock(WoodType.SPRUCE, AbstractBlock.Settings.copy(Blocks.NETHER_BRICKS)));
    public static final Block RED_NETHER_BRICK_FENCE_GATE = registerBlock("red_nether_brick_fence_gate",
            new FenceGateBlock(WoodType.MANGROVE, AbstractBlock.Settings.copy(Blocks.RED_NETHER_BRICKS)));
    public static final Block BLUE_NETHER_BRICK_FENCE_GATE = registerBlock("blue_nether_brick_fence_gate",
            new FenceGateBlock(WoodType.SPRUCE, AbstractBlock.Settings.copy(DecoBlocks.BLUE_NETHER_BRICKS)));

    public static final Identifier CACTUS_SIGN_TEXTURE = Identifier.of(VaranDeco.MOD_ID,"entity/signs/cactus");
    public static final Identifier WOODEN_SIGN_TEXTURE = Identifier.of(VaranDeco.MOD_ID,"entity/signs/wooden");

    public static final Identifier WOODEN_HANGING_SIGN_TEXTURE = Identifier.of(VaranDeco.MOD_ID,"entity/signs/hanging/wooden");
    public static final Identifier WOODEN_HANGING_SIGN_GUI = Identifier.of(VaranDeco.MOD_ID,"textures/gui/hanging_signs/wooden");

    public static final Identifier STRIPPED_OAK_SIGN_TEXTURE = Identifier.of(VaranDeco.MOD_ID,"entity/signs/stripped_oak");
    public static final Identifier STRIPPED_SPRUCE_SIGN_TEXTURE = Identifier.of(VaranDeco.MOD_ID,"entity/signs/stripped_spruce");
    public static final Identifier STRIPPED_BIRCH_SIGN_TEXTURE = Identifier.of(VaranDeco.MOD_ID,"entity/signs/stripped_birch");
    public static final Identifier STRIPPED_JUNGLE_SIGN_TEXTURE = Identifier.of(VaranDeco.MOD_ID,"entity/signs/stripped_jungle");
    public static final Identifier STRIPPED_ACACIA_SIGN_TEXTURE = Identifier.of(VaranDeco.MOD_ID,"entity/signs/stripped_acacia");
    public static final Identifier STRIPPED_DARK_OAK_SIGN_TEXTURE = Identifier.of(VaranDeco.MOD_ID,"entity/signs/stripped_dark_oak");
    public static final Identifier STRIPPED_MANGROVE_SIGN_TEXTURE = Identifier.of(VaranDeco.MOD_ID,"entity/signs/stripped_mangrove");
    public static final Identifier STRIPPED_CHERRY_SIGN_TEXTURE = Identifier.of(VaranDeco.MOD_ID,"entity/signs/stripped_cherry");
    public static final Identifier STRIPPED_CRIMSON_SIGN_TEXTURE = Identifier.of(VaranDeco.MOD_ID,"entity/signs/stripped_crimson");
    public static final Identifier STRIPPED_WARPED_SIGN_TEXTURE = Identifier.of(VaranDeco.MOD_ID,"entity/signs/stripped_warped");
    public static final Identifier STRIPPED_WOODEN_SIGN_TEXTURE = Identifier.of(VaranDeco.MOD_ID,"entity/signs/stripped_wooden");

    public static final Identifier OAK_MOSAIC_SIGN_TEXTURE = Identifier.of(VaranDeco.MOD_ID,"entity/signs/oak_mosaic");
    public static final Identifier SPRUCE_MOSAIC_SIGN_TEXTURE = Identifier.of(VaranDeco.MOD_ID,"entity/signs/spruce_mosaic");
    public static final Identifier BIRCH_MOSAIC_SIGN_TEXTURE = Identifier.of(VaranDeco.MOD_ID,"entity/signs/birch_mosaic");
    public static final Identifier JUNGLE_MOSAIC_SIGN_TEXTURE = Identifier.of(VaranDeco.MOD_ID,"entity/signs/jungle_mosaic");
    public static final Identifier ACACIA_MOSAIC_SIGN_TEXTURE = Identifier.of(VaranDeco.MOD_ID,"entity/signs/acacia_mosaic");
    public static final Identifier DARK_OAK_MOSAIC_SIGN_TEXTURE = Identifier.of(VaranDeco.MOD_ID,"entity/signs/dark_oak_mosaic");
    public static final Identifier MANGROVE_MOSAIC_SIGN_TEXTURE = Identifier.of(VaranDeco.MOD_ID,"entity/signs/mangrove_mosaic");
    public static final Identifier CHERRY_MOSAIC_SIGN_TEXTURE = Identifier.of(VaranDeco.MOD_ID,"entity/signs/cherry_mosaic");
    public static final Identifier BAMBOO_MOSAIC_SIGN_TEXTURE = Identifier.of(VaranDeco.MOD_ID,"entity/signs/bamboo_mosaic");
    public static final Identifier CRIMSON_MOSAIC_SIGN_TEXTURE = Identifier.of(VaranDeco.MOD_ID,"entity/signs/crimson_mosaic");
    public static final Identifier WARPED_MOSAIC_SIGN_TEXTURE = Identifier.of(VaranDeco.MOD_ID,"entity/signs/warped_mosaic");
    public static final Identifier CACTUS_MOSAIC_SIGN_TEXTURE = Identifier.of(VaranDeco.MOD_ID,"entity/signs/cactus_mosaic");
    public static final Identifier WOODEN_MOSAIC_SIGN_TEXTURE = Identifier.of(VaranDeco.MOD_ID,"entity/signs/wooden_mosaic");

    public static final Identifier OAK_MOSAIC_HANGING_SIGN_TEXTURE = Identifier.of(VaranDeco.MOD_ID,"entity/signs/hanging/oak_mosaic");
    public static final Identifier SPRUCE_MOSAIC_HANGING_SIGN_TEXTURE = Identifier.of(VaranDeco.MOD_ID,"entity/signs/hanging/spruce_mosaic");
    public static final Identifier BIRCH_MOSAIC_HANGING_SIGN_TEXTURE = Identifier.of(VaranDeco.MOD_ID,"entity/signs/hanging/birch_mosaic");
    public static final Identifier JUNGLE_MOSAIC_HANGING_SIGN_TEXTURE = Identifier.of(VaranDeco.MOD_ID,"entity/signs/hanging/jungle_mosaic");
    public static final Identifier ACACIA_MOSAIC_HANGING_SIGN_TEXTURE = Identifier.of(VaranDeco.MOD_ID,"entity/signs/hanging/acacia_mosaic");
    public static final Identifier DARK_OAK_MOSAIC_HANGING_SIGN_TEXTURE = Identifier.of(VaranDeco.MOD_ID,"entity/signs/hanging/dark_oak_mosaic");
    public static final Identifier MANGROVE_MOSAIC_HANGING_SIGN_TEXTURE = Identifier.of(VaranDeco.MOD_ID,"entity/signs/hanging/mangrove_mosaic");
    public static final Identifier CHERRY_MOSAIC_HANGING_SIGN_TEXTURE = Identifier.of(VaranDeco.MOD_ID,"entity/signs/hanging/cherry_mosaic");
    public static final Identifier BAMBOO_MOSAIC_HANGING_SIGN_TEXTURE = Identifier.of(VaranDeco.MOD_ID,"entity/signs/hanging/bamboo_mosaic");
    public static final Identifier CRIMSON_MOSAIC_HANGING_SIGN_TEXTURE = Identifier.of(VaranDeco.MOD_ID,"entity/signs/hanging/crimson_mosaic");
    public static final Identifier WARPED_MOSAIC_HANGING_SIGN_TEXTURE = Identifier.of(VaranDeco.MOD_ID,"entity/signs/hanging/warped_mosaic");
    public static final Identifier CACTUS_MOSAIC_HANGING_SIGN_TEXTURE = Identifier.of(VaranDeco.MOD_ID,"entity/signs/hanging/cactus_mosaic");
    public static final Identifier WOODEN_MOSAIC_HANGING_SIGN_TEXTURE = Identifier.of(VaranDeco.MOD_ID,"entity/signs/hanging/wooden_mosaic");

    public static final Identifier OAK_MOSAIC_HANGING_SIGN_GUI = Identifier.of(VaranDeco.MOD_ID,"textures/gui/hanging_signs/oak_mosaic");
    public static final Identifier SPRUCE_MOSAIC_HANGING_SIGN_GUI = Identifier.of(VaranDeco.MOD_ID,"textures/gui/hanging_signs/spruce_mosaic");
    public static final Identifier BIRCH_MOSAIC_HANGING_SIGN_GUI = Identifier.of(VaranDeco.MOD_ID,"textures/gui/hanging_signs/birch_mosaic");
    public static final Identifier JUNGLE_MOSAIC_HANGING_SIGN_GUI = Identifier.of(VaranDeco.MOD_ID,"textures/gui/hanging_signs/jungle_mosaic");
    public static final Identifier ACACIA_MOSAIC_HANGING_SIGN_GUI = Identifier.of(VaranDeco.MOD_ID,"textures/gui/hanging_signs/acacia_mosaic");
    public static final Identifier DARK_OAK_MOSAIC_HANGING_SIGN_GUI = Identifier.of(VaranDeco.MOD_ID,"textures/gui/hanging_signs/dark_oak_mosaic");
    public static final Identifier MANGROVE_MOSAIC_HANGING_SIGN_GUI = Identifier.of(VaranDeco.MOD_ID,"textures/gui/hanging_signs/mangrove_mosaic");
    public static final Identifier CHERRY_MOSAIC_HANGING_SIGN_GUI = Identifier.of(VaranDeco.MOD_ID,"textures/gui/hanging_signs/cherry_mosaic");
    public static final Identifier BAMBOO_MOSAIC_HANGING_SIGN_GUI = Identifier.of(VaranDeco.MOD_ID,"textures/gui/hanging_signs/bamboo_mosaic");
    public static final Identifier CRIMSON_MOSAIC_HANGING_SIGN_GUI = Identifier.of(VaranDeco.MOD_ID,"textures/gui/hanging_signs/crimson_mosaic");
    public static final Identifier WARPED_MOSAIC_HANGING_SIGN_GUI = Identifier.of(VaranDeco.MOD_ID,"textures/gui/hanging_signs/warped_mosaic");
    public static final Identifier CACTUS_MOSAIC_HANGING_SIGN_GUI = Identifier.of(VaranDeco.MOD_ID,"textures/gui/hanging_signs/cactus_mosaic");
    public static final Identifier WOODEN_MOSAIC_HANGING_SIGN_GUI = Identifier.of(VaranDeco.MOD_ID,"textures/gui/hanging_signs/wooden_mosaic");

    public static final Identifier OAK_PLANKS_HANGING_SIGN_TEXTURE = Identifier.of(VaranDeco.MOD_ID,"entity/signs/hanging/oak_planks");
    public static final Identifier SPRUCE_PLANKS_HANGING_SIGN_TEXTURE = Identifier.of(VaranDeco.MOD_ID,"entity/signs/hanging/spruce_planks");
    public static final Identifier BIRCH_PLANKS_HANGING_SIGN_TEXTURE = Identifier.of(VaranDeco.MOD_ID,"entity/signs/hanging/birch_planks");
    public static final Identifier JUNGLE_PLANKS_HANGING_SIGN_TEXTURE = Identifier.of(VaranDeco.MOD_ID,"entity/signs/hanging/jungle_planks");
    public static final Identifier ACACIA_PLANKS_HANGING_SIGN_TEXTURE = Identifier.of(VaranDeco.MOD_ID,"entity/signs/hanging/acacia_planks");
    public static final Identifier DARK_OAK_PLANKS_HANGING_SIGN_TEXTURE = Identifier.of(VaranDeco.MOD_ID,"entity/signs/hanging/dark_oak_planks");
    public static final Identifier MANGROVE_PLANKS_HANGING_SIGN_TEXTURE = Identifier.of(VaranDeco.MOD_ID,"entity/signs/hanging/mangrove_planks");
    public static final Identifier CHERRY_PLANKS_HANGING_SIGN_TEXTURE = Identifier.of(VaranDeco.MOD_ID,"entity/signs/hanging/cherry_planks");
    public static final Identifier CRIMSON_PLANKS_HANGING_SIGN_TEXTURE = Identifier.of(VaranDeco.MOD_ID,"entity/signs/hanging/crimson_planks");
    public static final Identifier WARPED_PLANKS_HANGING_SIGN_TEXTURE = Identifier.of(VaranDeco.MOD_ID,"entity/signs/hanging/warped_planks");
    public static final Identifier CACTUS_PLANKS_HANGING_SIGN_TEXTURE = Identifier.of(VaranDeco.MOD_ID,"entity/signs/hanging/cactus_planks");
    public static final Identifier WOODEN_PLANKS_HANGING_SIGN_TEXTURE = Identifier.of(VaranDeco.MOD_ID,"entity/signs/hanging/wooden_planks");

    public static final Identifier OAK_PLANKS_HANGING_SIGN_GUI = Identifier.of(VaranDeco.MOD_ID,"textures/gui/hanging_signs/oak_planks");
    public static final Identifier SPRUCE_PLANKS_HANGING_SIGN_GUI = Identifier.of(VaranDeco.MOD_ID,"textures/gui/hanging_signs/spruce_planks");
    public static final Identifier BIRCH_PLANKS_HANGING_SIGN_GUI = Identifier.of(VaranDeco.MOD_ID,"textures/gui/hanging_signs/birch_planks");
    public static final Identifier JUNGLE_PLANKS_HANGING_SIGN_GUI = Identifier.of(VaranDeco.MOD_ID,"textures/gui/hanging_signs/jungle_planks");
    public static final Identifier ACACIA_PLANKS_HANGING_SIGN_GUI = Identifier.of(VaranDeco.MOD_ID,"textures/gui/hanging_signs/acacia_planks");
    public static final Identifier DARK_OAK_PLANKS_HANGING_SIGN_GUI = Identifier.of(VaranDeco.MOD_ID,"textures/gui/hanging_signs/dark_oak_planks");
    public static final Identifier MANGROVE_PLANKS_HANGING_SIGN_GUI = Identifier.of(VaranDeco.MOD_ID,"textures/gui/hanging_signs/mangrove_planks");
    public static final Identifier CHERRY_PLANKS_HANGING_SIGN_GUI = Identifier.of(VaranDeco.MOD_ID,"textures/gui/hanging_signs/cherry_planks");
    public static final Identifier CRIMSON_PLANKS_HANGING_SIGN_GUI = Identifier.of(VaranDeco.MOD_ID,"textures/gui/hanging_signs/crimson_planks");
    public static final Identifier WARPED_PLANKS_HANGING_SIGN_GUI = Identifier.of(VaranDeco.MOD_ID,"textures/gui/hanging_signs/warped_planks");
    public static final Identifier CACTUS_PLANKS_HANGING_SIGN_GUI = Identifier.of(VaranDeco.MOD_ID,"textures/gui/hanging_signs/cactus_planks");
    public static final Identifier WOODEN_PLANKS_HANGING_SIGN_GUI = Identifier.of(VaranDeco.MOD_ID,"textures/gui/hanging_signs/wooden_planks");

    public static final Block STANDING_CACTUS_SIGN = registerBlockWithoutItem("standing_cactus_sign",
            new TerraformSignBlock(CACTUS_SIGN_TEXTURE, AbstractBlock.Settings.copy(Blocks.OAK_SIGN)));
    public static final Block WALL_CACTUS_SIGN = registerBlockWithoutItem("wall_cactus_sign",
            new TerraformWallSignBlock(CACTUS_SIGN_TEXTURE, AbstractBlock.Settings.copy(Blocks.OAK_WALL_SIGN)));

    public static final Block STANDING_WOODEN_SIGN = registerBlockWithoutItem("standing_wooden_sign",
            new TerraformSignBlock(WOODEN_SIGN_TEXTURE, AbstractBlock.Settings.copy(Blocks.OAK_SIGN)));
    public static final Block WALL_WOODEN_SIGN = registerBlockWithoutItem("wall_wooden_sign",
            new TerraformWallSignBlock(WOODEN_SIGN_TEXTURE, AbstractBlock.Settings.copy(Blocks.OAK_WALL_SIGN)));

    public static final Block HANGING_WOODEN_SIGN = registerBlockWithoutItem("hanging_wooden_sign",
            new TerraformHangingSignBlock(WOODEN_HANGING_SIGN_TEXTURE, WOODEN_HANGING_SIGN_GUI, AbstractBlock.Settings.copy(Blocks.OAK_HANGING_SIGN)));
    public static final Block WALL_HANGING_WOODEN_SIGN = registerBlockWithoutItem("wall_hanging_wooden_sign",
            new TerraformWallHangingSignBlock(WOODEN_HANGING_SIGN_TEXTURE, WOODEN_HANGING_SIGN_GUI, AbstractBlock.Settings.copy(Blocks.OAK_WALL_HANGING_SIGN)));

    public static final Block STANDING_STRIPPED_OAK_SIGN = registerBlockWithoutItem("standing_stripped_oak_sign",
            new TerraformSignBlock(STRIPPED_OAK_SIGN_TEXTURE, AbstractBlock.Settings.copy(Blocks.OAK_SIGN)));
    public static final Block WALL_STRIPPED_OAK_SIGN = registerBlockWithoutItem("wall_stripped_oak_sign",
            new TerraformWallSignBlock(STRIPPED_OAK_SIGN_TEXTURE, AbstractBlock.Settings.copy(Blocks.OAK_WALL_SIGN)));
    public static final Block STANDING_STRIPPED_SPRUCE_SIGN = registerBlockWithoutItem("standing_stripped_spruce_sign",
            new TerraformSignBlock(STRIPPED_SPRUCE_SIGN_TEXTURE, AbstractBlock.Settings.copy(Blocks.SPRUCE_SIGN)));
    public static final Block WALL_STRIPPED_SPRUCE_SIGN = registerBlockWithoutItem("wall_stripped_spruce_sign",
            new TerraformWallSignBlock(STRIPPED_SPRUCE_SIGN_TEXTURE, AbstractBlock.Settings.copy(Blocks.SPRUCE_WALL_SIGN)));
    public static final Block STANDING_STRIPPED_BIRCH_SIGN = registerBlockWithoutItem("standing_stripped_birch_sign",
            new TerraformSignBlock(STRIPPED_BIRCH_SIGN_TEXTURE, AbstractBlock.Settings.copy(Blocks.BIRCH_SIGN)));
    public static final Block WALL_STRIPPED_BIRCH_SIGN = registerBlockWithoutItem("wall_stripped_birch_sign",
            new TerraformWallSignBlock(STRIPPED_BIRCH_SIGN_TEXTURE, AbstractBlock.Settings.copy(Blocks.BIRCH_WALL_SIGN)));
    public static final Block STANDING_STRIPPED_JUNGLE_SIGN = registerBlockWithoutItem("standing_stripped_jungle_sign",
            new TerraformSignBlock(STRIPPED_JUNGLE_SIGN_TEXTURE, AbstractBlock.Settings.copy(Blocks.JUNGLE_SIGN)));
    public static final Block WALL_STRIPPED_JUNGLE_SIGN = registerBlockWithoutItem("wall_stripped_jungle_sign",
            new TerraformWallSignBlock(STRIPPED_JUNGLE_SIGN_TEXTURE, AbstractBlock.Settings.copy(Blocks.JUNGLE_WALL_SIGN)));
    public static final Block STANDING_STRIPPED_ACACIA_SIGN = registerBlockWithoutItem("standing_stripped_acacia_sign",
            new TerraformSignBlock(STRIPPED_ACACIA_SIGN_TEXTURE, AbstractBlock.Settings.copy(Blocks.ACACIA_SIGN)));
    public static final Block WALL_STRIPPED_ACACIA_SIGN = registerBlockWithoutItem("wall_stripped_acacia_sign",
            new TerraformWallSignBlock(STRIPPED_ACACIA_SIGN_TEXTURE, AbstractBlock.Settings.copy(Blocks.ACACIA_WALL_SIGN)));
    public static final Block STANDING_STRIPPED_DARK_OAK_SIGN = registerBlockWithoutItem("standing_stripped_dark_oak_sign",
            new TerraformSignBlock(STRIPPED_DARK_OAK_SIGN_TEXTURE, AbstractBlock.Settings.copy(Blocks.DARK_OAK_SIGN)));
    public static final Block WALL_STRIPPED_DARK_OAK_SIGN = registerBlockWithoutItem("wall_stripped_dark_oak_sign",
            new TerraformWallSignBlock(STRIPPED_DARK_OAK_SIGN_TEXTURE, AbstractBlock.Settings.copy(Blocks.DARK_OAK_WALL_SIGN)));
    public static final Block STANDING_STRIPPED_MANGROVE_SIGN = registerBlockWithoutItem("standing_stripped_mangrove_sign",
            new TerraformSignBlock(STRIPPED_MANGROVE_SIGN_TEXTURE, AbstractBlock.Settings.copy(Blocks.MANGROVE_SIGN)));
    public static final Block WALL_STRIPPED_MANGROVE_SIGN = registerBlockWithoutItem("wall_stripped_mangrove_sign",
            new TerraformWallSignBlock(STRIPPED_MANGROVE_SIGN_TEXTURE, AbstractBlock.Settings.copy(Blocks.MANGROVE_WALL_SIGN)));
    public static final Block STANDING_STRIPPED_CHERRY_SIGN = registerBlockWithoutItem("standing_stripped_cherry_sign",
            new TerraformSignBlock(STRIPPED_CHERRY_SIGN_TEXTURE, AbstractBlock.Settings.copy(Blocks.CHERRY_SIGN)));
    public static final Block WALL_STRIPPED_CHERRY_SIGN = registerBlockWithoutItem("wall_stripped_cherry_sign",
            new TerraformWallSignBlock(STRIPPED_CHERRY_SIGN_TEXTURE, AbstractBlock.Settings.copy(Blocks.CHERRY_WALL_SIGN)));
    public static final Block STANDING_STRIPPED_CRIMSON_SIGN = registerBlockWithoutItem("standing_stripped_crimson_sign",
            new TerraformSignBlock(STRIPPED_CRIMSON_SIGN_TEXTURE, AbstractBlock.Settings.copy(Blocks.CRIMSON_SIGN)));
    public static final Block WALL_STRIPPED_CRIMSON_SIGN = registerBlockWithoutItem("wall_stripped_crimson_sign",
            new TerraformWallSignBlock(STRIPPED_CRIMSON_SIGN_TEXTURE, AbstractBlock.Settings.copy(Blocks.CRIMSON_WALL_SIGN)));
    public static final Block STANDING_STRIPPED_WARPED_SIGN = registerBlockWithoutItem("standing_stripped_warped_sign",
            new TerraformSignBlock(STRIPPED_WARPED_SIGN_TEXTURE, AbstractBlock.Settings.copy(Blocks.WARPED_SIGN)));
    public static final Block WALL_STRIPPED_WARPED_SIGN = registerBlockWithoutItem("wall_stripped_warped_sign",
            new TerraformWallSignBlock(STRIPPED_WARPED_SIGN_TEXTURE, AbstractBlock.Settings.copy(Blocks.WARPED_WALL_SIGN)));
    public static final Block STANDING_STRIPPED_WOODEN_SIGN = registerBlockWithoutItem("standing_stripped_wooden_sign",
            new TerraformSignBlock(STRIPPED_WOODEN_SIGN_TEXTURE, AbstractBlock.Settings.copy(Blocks.OAK_SIGN)));
    public static final Block WALL_STRIPPED_WOODEN_SIGN = registerBlockWithoutItem("wall_stripped_wooden_sign",
            new TerraformWallSignBlock(STRIPPED_WOODEN_SIGN_TEXTURE, AbstractBlock.Settings.copy(Blocks.OAK_WALL_SIGN)));

    public static final Block STANDING_OAK_MOSAIC_SIGN = registerBlockWithoutItem("standing_oak_mosaic_sign",
            new TerraformSignBlock(OAK_MOSAIC_SIGN_TEXTURE, AbstractBlock.Settings.copy(Blocks.OAK_SIGN)));
    public static final Block WALL_OAK_MOSAIC_SIGN = registerBlockWithoutItem("wall_oak_mosaic_sign",
            new TerraformWallSignBlock(OAK_MOSAIC_SIGN_TEXTURE, AbstractBlock.Settings.copy(Blocks.OAK_WALL_SIGN)));
    public static final Block STANDING_SPRUCE_MOSAIC_SIGN = registerBlockWithoutItem("standing_spruce_mosaic_sign",
            new TerraformSignBlock(SPRUCE_MOSAIC_SIGN_TEXTURE, AbstractBlock.Settings.copy(Blocks.SPRUCE_SIGN)));
    public static final Block WALL_SPRUCE_MOSAIC_SIGN = registerBlockWithoutItem("wall_spruce_mosaic_sign",
            new TerraformWallSignBlock(SPRUCE_MOSAIC_SIGN_TEXTURE, AbstractBlock.Settings.copy(Blocks.SPRUCE_WALL_SIGN)));
    public static final Block STANDING_BIRCH_MOSAIC_SIGN = registerBlockWithoutItem("standing_birch_mosaic_sign",
            new TerraformSignBlock(BIRCH_MOSAIC_SIGN_TEXTURE, AbstractBlock.Settings.copy(Blocks.BIRCH_SIGN)));
    public static final Block WALL_BIRCH_MOSAIC_SIGN = registerBlockWithoutItem("wall_birch_mosaic_sign",
            new TerraformWallSignBlock(BIRCH_MOSAIC_SIGN_TEXTURE, AbstractBlock.Settings.copy(Blocks.BIRCH_WALL_SIGN)));
    public static final Block STANDING_JUNGLE_MOSAIC_SIGN = registerBlockWithoutItem("standing_jungle_mosaic_sign",
            new TerraformSignBlock(JUNGLE_MOSAIC_SIGN_TEXTURE, AbstractBlock.Settings.copy(Blocks.JUNGLE_SIGN)));
    public static final Block WALL_JUNGLE_MOSAIC_SIGN = registerBlockWithoutItem("wall_jungle_mosaic_sign",
            new TerraformWallSignBlock(JUNGLE_MOSAIC_SIGN_TEXTURE, AbstractBlock.Settings.copy(Blocks.JUNGLE_WALL_SIGN)));
    public static final Block STANDING_ACACIA_MOSAIC_SIGN = registerBlockWithoutItem("standing_acacia_mosaic_sign",
            new TerraformSignBlock(ACACIA_MOSAIC_SIGN_TEXTURE, AbstractBlock.Settings.copy(Blocks.ACACIA_SIGN)));
    public static final Block WALL_ACACIA_MOSAIC_SIGN = registerBlockWithoutItem("wall_acacia_mosaic_sign",
            new TerraformWallSignBlock(ACACIA_MOSAIC_SIGN_TEXTURE, AbstractBlock.Settings.copy(Blocks.ACACIA_WALL_SIGN)));
    public static final Block STANDING_DARK_OAK_MOSAIC_SIGN = registerBlockWithoutItem("standing_dark_oak_mosaic_sign",
            new TerraformSignBlock(DARK_OAK_MOSAIC_SIGN_TEXTURE, AbstractBlock.Settings.copy(Blocks.DARK_OAK_SIGN)));
    public static final Block WALL_DARK_OAK_MOSAIC_SIGN = registerBlockWithoutItem("wall_dark_oak_mosaic_sign",
            new TerraformWallSignBlock(DARK_OAK_MOSAIC_SIGN_TEXTURE, AbstractBlock.Settings.copy(Blocks.DARK_OAK_WALL_SIGN)));
    public static final Block STANDING_MANGROVE_MOSAIC_SIGN = registerBlockWithoutItem("standing_mangrove_mosaic_sign",
            new TerraformSignBlock(MANGROVE_MOSAIC_SIGN_TEXTURE, AbstractBlock.Settings.copy(Blocks.MANGROVE_SIGN)));
    public static final Block WALL_MANGROVE_MOSAIC_SIGN = registerBlockWithoutItem("wall_mangrove_mosaic_sign",
            new TerraformWallSignBlock(MANGROVE_MOSAIC_SIGN_TEXTURE, AbstractBlock.Settings.copy(Blocks.MANGROVE_WALL_SIGN)));
    public static final Block STANDING_CHERRY_MOSAIC_SIGN = registerBlockWithoutItem("standing_cherry_mosaic_sign",
            new TerraformSignBlock(CHERRY_MOSAIC_SIGN_TEXTURE, AbstractBlock.Settings.copy(Blocks.CHERRY_SIGN)));
    public static final Block WALL_CHERRY_MOSAIC_SIGN = registerBlockWithoutItem("wall_cherry_mosaic_sign",
            new TerraformWallSignBlock(CHERRY_MOSAIC_SIGN_TEXTURE, AbstractBlock.Settings.copy(Blocks.CHERRY_WALL_SIGN)));
    public static final Block STANDING_BAMBOO_MOSAIC_SIGN = registerBlockWithoutItem("standing_bamboo_mosaic_sign",
            new TerraformSignBlock(BAMBOO_MOSAIC_SIGN_TEXTURE, AbstractBlock.Settings.copy(Blocks.BAMBOO_SIGN)));
    public static final Block WALL_BAMBOO_MOSAIC_SIGN = registerBlockWithoutItem("wall_bamboo_mosaic_sign",
            new TerraformWallSignBlock(BAMBOO_MOSAIC_SIGN_TEXTURE, AbstractBlock.Settings.copy(Blocks.BAMBOO_WALL_SIGN)));
    public static final Block STANDING_CRIMSON_MOSAIC_SIGN = registerBlockWithoutItem("standing_crimson_mosaic_sign",
            new TerraformSignBlock(CRIMSON_MOSAIC_SIGN_TEXTURE, AbstractBlock.Settings.copy(Blocks.CRIMSON_SIGN)));
    public static final Block WALL_CRIMSON_MOSAIC_SIGN = registerBlockWithoutItem("wall_crimson_mosaic_sign",
            new TerraformWallSignBlock(CRIMSON_MOSAIC_SIGN_TEXTURE, AbstractBlock.Settings.copy(Blocks.CRIMSON_WALL_SIGN)));
    public static final Block STANDING_WARPED_MOSAIC_SIGN = registerBlockWithoutItem("standing_warped_mosaic_sign",
            new TerraformSignBlock(WARPED_MOSAIC_SIGN_TEXTURE, AbstractBlock.Settings.copy(Blocks.WARPED_SIGN)));
    public static final Block WALL_WARPED_MOSAIC_SIGN = registerBlockWithoutItem("wall_warped_mosaic_sign",
            new TerraformWallSignBlock(WARPED_MOSAIC_SIGN_TEXTURE, AbstractBlock.Settings.copy(Blocks.WARPED_WALL_SIGN)));
    public static final Block STANDING_CACTUS_MOSAIC_SIGN = registerBlockWithoutItem("standing_cactus_mosaic_sign",
            new TerraformSignBlock(CACTUS_MOSAIC_SIGN_TEXTURE, AbstractBlock.Settings.copy(Blocks.OAK_SIGN)));
    public static final Block WALL_CACTUS_MOSAIC_SIGN = registerBlockWithoutItem("wall_cactus_mosaic_sign",
            new TerraformWallSignBlock(CACTUS_MOSAIC_SIGN_TEXTURE, AbstractBlock.Settings.copy(Blocks.OAK_WALL_SIGN)));
    public static final Block STANDING_WOODEN_MOSAIC_SIGN = registerBlockWithoutItem("standing_wooden_mosaic_sign",
            new TerraformSignBlock(WOODEN_MOSAIC_SIGN_TEXTURE, AbstractBlock.Settings.copy(Blocks.OAK_SIGN)));
    public static final Block WALL_WOODEN_MOSAIC_SIGN = registerBlockWithoutItem("wall_wooden_mosaic_sign",
            new TerraformWallSignBlock(WOODEN_MOSAIC_SIGN_TEXTURE, AbstractBlock.Settings.copy(Blocks.OAK_WALL_SIGN)));

    public static final Block HANGING_OAK_MOSAIC_SIGN = registerBlockWithoutItem("hanging_oak_mosaic_sign",
            new TerraformHangingSignBlock(OAK_MOSAIC_HANGING_SIGN_TEXTURE, OAK_MOSAIC_HANGING_SIGN_GUI, AbstractBlock.Settings.copy(Blocks.OAK_HANGING_SIGN)));
    public static final Block WALL_HANGING_OAK_MOSAIC_SIGN = registerBlockWithoutItem("wall_hanging_oak_mosaic_sign",
            new TerraformWallHangingSignBlock(OAK_MOSAIC_HANGING_SIGN_TEXTURE, OAK_MOSAIC_HANGING_SIGN_GUI, AbstractBlock.Settings.copy(Blocks.OAK_WALL_HANGING_SIGN)));
    public static final Block HANGING_SPRUCE_MOSAIC_SIGN = registerBlockWithoutItem("hanging_spruce_mosaic_sign",
            new TerraformHangingSignBlock(SPRUCE_MOSAIC_HANGING_SIGN_TEXTURE, SPRUCE_MOSAIC_HANGING_SIGN_GUI, AbstractBlock.Settings.copy(Blocks.SPRUCE_HANGING_SIGN)));
    public static final Block WALL_HANGING_SPRUCE_MOSAIC_SIGN = registerBlockWithoutItem("wall_hanging_spruce_mosaic_sign",
            new TerraformWallHangingSignBlock(SPRUCE_MOSAIC_HANGING_SIGN_TEXTURE, SPRUCE_MOSAIC_HANGING_SIGN_GUI, AbstractBlock.Settings.copy(Blocks.SPRUCE_WALL_HANGING_SIGN)));
    public static final Block HANGING_BIRCH_MOSAIC_SIGN = registerBlockWithoutItem("hanging_birch_mosaic_sign",
            new TerraformHangingSignBlock(BIRCH_MOSAIC_HANGING_SIGN_TEXTURE, BIRCH_MOSAIC_HANGING_SIGN_GUI, AbstractBlock.Settings.copy(Blocks.BIRCH_HANGING_SIGN)));
    public static final Block WALL_HANGING_BIRCH_MOSAIC_SIGN = registerBlockWithoutItem("wall_hanging_birch_mosaic_sign",
            new TerraformWallHangingSignBlock(BIRCH_MOSAIC_HANGING_SIGN_TEXTURE, BIRCH_MOSAIC_HANGING_SIGN_GUI, AbstractBlock.Settings.copy(Blocks.BIRCH_WALL_HANGING_SIGN)));
    public static final Block HANGING_JUNGLE_MOSAIC_SIGN = registerBlockWithoutItem("hanging_jungle_mosaic_sign",
            new TerraformHangingSignBlock(JUNGLE_MOSAIC_HANGING_SIGN_TEXTURE, JUNGLE_MOSAIC_HANGING_SIGN_GUI, AbstractBlock.Settings.copy(Blocks.JUNGLE_HANGING_SIGN)));
    public static final Block WALL_HANGING_JUNGLE_MOSAIC_SIGN = registerBlockWithoutItem("wall_hanging_jungle_mosaic_sign",
            new TerraformWallHangingSignBlock(JUNGLE_MOSAIC_HANGING_SIGN_TEXTURE, JUNGLE_MOSAIC_HANGING_SIGN_GUI, AbstractBlock.Settings.copy(Blocks.JUNGLE_WALL_HANGING_SIGN)));
    public static final Block HANGING_ACACIA_MOSAIC_SIGN = registerBlockWithoutItem("hanging_acacia_mosaic_sign",
            new TerraformHangingSignBlock(ACACIA_MOSAIC_HANGING_SIGN_TEXTURE, ACACIA_MOSAIC_HANGING_SIGN_GUI, AbstractBlock.Settings.copy(Blocks.ACACIA_HANGING_SIGN)));
    public static final Block WALL_HANGING_ACACIA_MOSAIC_SIGN = registerBlockWithoutItem("wall_hanging_acacia_mosaic_sign",
            new TerraformWallHangingSignBlock(ACACIA_MOSAIC_HANGING_SIGN_TEXTURE, ACACIA_MOSAIC_HANGING_SIGN_GUI, AbstractBlock.Settings.copy(Blocks.ACACIA_WALL_HANGING_SIGN)));
    public static final Block HANGING_DARK_OAK_MOSAIC_SIGN = registerBlockWithoutItem("hanging_dark_oak_mosaic_sign",
            new TerraformHangingSignBlock(DARK_OAK_MOSAIC_HANGING_SIGN_TEXTURE, DARK_OAK_MOSAIC_HANGING_SIGN_GUI, AbstractBlock.Settings.copy(Blocks.DARK_OAK_HANGING_SIGN)));
    public static final Block WALL_HANGING_DARK_OAK_MOSAIC_SIGN = registerBlockWithoutItem("wall_hanging_dark_oak_mosaic_sign",
            new TerraformWallHangingSignBlock(DARK_OAK_MOSAIC_HANGING_SIGN_TEXTURE, DARK_OAK_MOSAIC_HANGING_SIGN_GUI, AbstractBlock.Settings.copy(Blocks.DARK_OAK_WALL_HANGING_SIGN)));
    public static final Block HANGING_MANGROVE_MOSAIC_SIGN = registerBlockWithoutItem("hanging_mangrove_mosaic_sign",
            new TerraformHangingSignBlock(MANGROVE_MOSAIC_HANGING_SIGN_TEXTURE, MANGROVE_MOSAIC_HANGING_SIGN_GUI, AbstractBlock.Settings.copy(Blocks.MANGROVE_HANGING_SIGN)));
    public static final Block WALL_HANGING_MANGROVE_MOSAIC_SIGN = registerBlockWithoutItem("wall_hanging_mangrove_mosaic_sign",
            new TerraformWallHangingSignBlock(MANGROVE_MOSAIC_HANGING_SIGN_TEXTURE, MANGROVE_MOSAIC_HANGING_SIGN_GUI, AbstractBlock.Settings.copy(Blocks.MANGROVE_WALL_HANGING_SIGN)));
    public static final Block HANGING_CHERRY_MOSAIC_SIGN = registerBlockWithoutItem("hanging_cherry_mosaic_sign",
            new TerraformHangingSignBlock(CHERRY_MOSAIC_HANGING_SIGN_TEXTURE, CHERRY_MOSAIC_HANGING_SIGN_GUI, AbstractBlock.Settings.copy(Blocks.CHERRY_HANGING_SIGN)));
    public static final Block WALL_HANGING_CHERRY_MOSAIC_SIGN = registerBlockWithoutItem("wall_hanging_cherry_mosaic_sign",
            new TerraformWallHangingSignBlock(CHERRY_MOSAIC_HANGING_SIGN_TEXTURE, CHERRY_MOSAIC_HANGING_SIGN_GUI, AbstractBlock.Settings.copy(Blocks.CHERRY_WALL_HANGING_SIGN)));
    public static final Block HANGING_BAMBOO_MOSAIC_SIGN = registerBlockWithoutItem("hanging_bamboo_mosaic_sign",
            new TerraformHangingSignBlock(BAMBOO_MOSAIC_HANGING_SIGN_TEXTURE, BAMBOO_MOSAIC_HANGING_SIGN_GUI, AbstractBlock.Settings.copy(Blocks.BAMBOO_HANGING_SIGN)));
    public static final Block WALL_HANGING_BAMBOO_MOSAIC_SIGN = registerBlockWithoutItem("wall_hanging_bamboo_mosaic_sign",
            new TerraformWallHangingSignBlock(BAMBOO_MOSAIC_HANGING_SIGN_TEXTURE, BAMBOO_MOSAIC_HANGING_SIGN_GUI, AbstractBlock.Settings.copy(Blocks.BAMBOO_WALL_HANGING_SIGN)));
    public static final Block HANGING_CRIMSON_MOSAIC_SIGN = registerBlockWithoutItem("hanging_crimson_mosaic_sign",
            new TerraformHangingSignBlock(CRIMSON_MOSAIC_HANGING_SIGN_TEXTURE, CRIMSON_MOSAIC_HANGING_SIGN_GUI, AbstractBlock.Settings.copy(Blocks.CRIMSON_HANGING_SIGN)));
    public static final Block WALL_HANGING_CRIMSON_MOSAIC_SIGN = registerBlockWithoutItem("wall_hanging_crimson_mosaic_sign",
            new TerraformWallHangingSignBlock(CRIMSON_MOSAIC_HANGING_SIGN_TEXTURE, CRIMSON_MOSAIC_HANGING_SIGN_GUI, AbstractBlock.Settings.copy(Blocks.CRIMSON_WALL_HANGING_SIGN)));
    public static final Block HANGING_WARPED_MOSAIC_SIGN = registerBlockWithoutItem("hanging_warped_mosaic_sign",
            new TerraformHangingSignBlock(WARPED_MOSAIC_HANGING_SIGN_TEXTURE, WARPED_MOSAIC_HANGING_SIGN_GUI, AbstractBlock.Settings.copy(Blocks.WARPED_HANGING_SIGN)));
    public static final Block WALL_HANGING_WARPED_MOSAIC_SIGN = registerBlockWithoutItem("wall_hanging_warped_mosaic_sign",
            new TerraformWallHangingSignBlock(WARPED_MOSAIC_HANGING_SIGN_TEXTURE, WARPED_MOSAIC_HANGING_SIGN_GUI, AbstractBlock.Settings.copy(Blocks.WARPED_WALL_HANGING_SIGN)));
    public static final Block HANGING_CACTUS_MOSAIC_SIGN = registerBlockWithoutItem("hanging_cactus_mosaic_sign",
            new TerraformHangingSignBlock(CACTUS_MOSAIC_HANGING_SIGN_TEXTURE, CACTUS_MOSAIC_HANGING_SIGN_GUI, AbstractBlock.Settings.copy(Blocks.OAK_HANGING_SIGN)));
    public static final Block WALL_HANGING_CACTUS_MOSAIC_SIGN = registerBlockWithoutItem("wall_hanging_cactus_mosaic_sign",
            new TerraformWallHangingSignBlock(CACTUS_MOSAIC_HANGING_SIGN_TEXTURE, CACTUS_MOSAIC_HANGING_SIGN_GUI, AbstractBlock.Settings.copy(Blocks.OAK_WALL_HANGING_SIGN)));
    public static final Block HANGING_WOODEN_MOSAIC_SIGN = registerBlockWithoutItem("hanging_wooden_mosaic_sign",
            new TerraformHangingSignBlock(WOODEN_MOSAIC_HANGING_SIGN_TEXTURE, WOODEN_MOSAIC_HANGING_SIGN_GUI, AbstractBlock.Settings.copy(Blocks.OAK_HANGING_SIGN)));
    public static final Block WALL_HANGING_WOODEN_MOSAIC_SIGN = registerBlockWithoutItem("wall_hanging_wooden_mosaic_sign",
            new TerraformWallHangingSignBlock(WOODEN_MOSAIC_HANGING_SIGN_TEXTURE, WOODEN_MOSAIC_HANGING_SIGN_GUI, AbstractBlock.Settings.copy(Blocks.OAK_WALL_HANGING_SIGN)));

    public static final Block HANGING_OAK_PLANKS_SIGN = registerBlockWithoutItem("hanging_oak_planks_sign",
            new TerraformHangingSignBlock(OAK_PLANKS_HANGING_SIGN_TEXTURE, OAK_PLANKS_HANGING_SIGN_GUI, AbstractBlock.Settings.copy(Blocks.OAK_HANGING_SIGN)));
    public static final Block WALL_HANGING_OAK_PLANKS_SIGN = registerBlockWithoutItem("wall_hanging_oak_planks_sign",
            new TerraformWallHangingSignBlock(OAK_PLANKS_HANGING_SIGN_TEXTURE, OAK_PLANKS_HANGING_SIGN_GUI, AbstractBlock.Settings.copy(Blocks.OAK_WALL_HANGING_SIGN)));
    public static final Block HANGING_SPRUCE_PLANKS_SIGN = registerBlockWithoutItem("hanging_spruce_planks_sign",
            new TerraformHangingSignBlock(SPRUCE_PLANKS_HANGING_SIGN_TEXTURE, SPRUCE_PLANKS_HANGING_SIGN_GUI, AbstractBlock.Settings.copy(Blocks.SPRUCE_HANGING_SIGN)));
    public static final Block WALL_HANGING_SPRUCE_PLANKS_SIGN = registerBlockWithoutItem("wall_hanging_spruce_planks_sign",
            new TerraformWallHangingSignBlock(SPRUCE_PLANKS_HANGING_SIGN_TEXTURE, SPRUCE_PLANKS_HANGING_SIGN_GUI, AbstractBlock.Settings.copy(Blocks.SPRUCE_WALL_HANGING_SIGN)));
    public static final Block HANGING_BIRCH_PLANKS_SIGN = registerBlockWithoutItem("hanging_birch_planks_sign",
            new TerraformHangingSignBlock(BIRCH_PLANKS_HANGING_SIGN_TEXTURE, BIRCH_PLANKS_HANGING_SIGN_GUI, AbstractBlock.Settings.copy(Blocks.BIRCH_HANGING_SIGN)));
    public static final Block WALL_HANGING_BIRCH_PLANKS_SIGN = registerBlockWithoutItem("wall_hanging_birch_planks_sign",
            new TerraformWallHangingSignBlock(BIRCH_PLANKS_HANGING_SIGN_TEXTURE, BIRCH_PLANKS_HANGING_SIGN_GUI, AbstractBlock.Settings.copy(Blocks.BIRCH_WALL_HANGING_SIGN)));
    public static final Block HANGING_JUNGLE_PLANKS_SIGN = registerBlockWithoutItem("hanging_jungle_planks_sign",
            new TerraformHangingSignBlock(JUNGLE_PLANKS_HANGING_SIGN_TEXTURE, JUNGLE_PLANKS_HANGING_SIGN_GUI, AbstractBlock.Settings.copy(Blocks.JUNGLE_HANGING_SIGN)));
    public static final Block WALL_HANGING_JUNGLE_PLANKS_SIGN = registerBlockWithoutItem("wall_hanging_jungle_planks_sign",
            new TerraformWallHangingSignBlock(JUNGLE_PLANKS_HANGING_SIGN_TEXTURE, JUNGLE_PLANKS_HANGING_SIGN_GUI, AbstractBlock.Settings.copy(Blocks.JUNGLE_WALL_HANGING_SIGN)));
    public static final Block HANGING_ACACIA_PLANKS_SIGN = registerBlockWithoutItem("hanging_acacia_planks_sign",
            new TerraformHangingSignBlock(ACACIA_PLANKS_HANGING_SIGN_TEXTURE, ACACIA_PLANKS_HANGING_SIGN_GUI, AbstractBlock.Settings.copy(Blocks.ACACIA_HANGING_SIGN)));
    public static final Block WALL_HANGING_ACACIA_PLANKS_SIGN = registerBlockWithoutItem("wall_hanging_acacia_planks_sign",
            new TerraformWallHangingSignBlock(ACACIA_PLANKS_HANGING_SIGN_TEXTURE, ACACIA_PLANKS_HANGING_SIGN_GUI, AbstractBlock.Settings.copy(Blocks.ACACIA_WALL_HANGING_SIGN)));
    public static final Block HANGING_DARK_OAK_PLANKS_SIGN = registerBlockWithoutItem("hanging_dark_oak_planks_sign",
            new TerraformHangingSignBlock(DARK_OAK_PLANKS_HANGING_SIGN_TEXTURE, DARK_OAK_PLANKS_HANGING_SIGN_GUI, AbstractBlock.Settings.copy(Blocks.DARK_OAK_HANGING_SIGN)));
    public static final Block WALL_HANGING_DARK_OAK_PLANKS_SIGN = registerBlockWithoutItem("wall_hanging_dark_oak_planks_sign",
            new TerraformWallHangingSignBlock(DARK_OAK_PLANKS_HANGING_SIGN_TEXTURE, DARK_OAK_PLANKS_HANGING_SIGN_GUI, AbstractBlock.Settings.copy(Blocks.DARK_OAK_WALL_HANGING_SIGN)));
    public static final Block HANGING_MANGROVE_PLANKS_SIGN = registerBlockWithoutItem("hanging_mangrove_planks_sign",
            new TerraformHangingSignBlock(MANGROVE_PLANKS_HANGING_SIGN_TEXTURE, MANGROVE_PLANKS_HANGING_SIGN_GUI, AbstractBlock.Settings.copy(Blocks.MANGROVE_HANGING_SIGN)));
    public static final Block WALL_HANGING_MANGROVE_PLANKS_SIGN = registerBlockWithoutItem("wall_hanging_mangrove_planks_sign",
            new TerraformWallHangingSignBlock(MANGROVE_PLANKS_HANGING_SIGN_TEXTURE, MANGROVE_PLANKS_HANGING_SIGN_GUI, AbstractBlock.Settings.copy(Blocks.MANGROVE_WALL_HANGING_SIGN)));
    public static final Block HANGING_CHERRY_PLANKS_SIGN = registerBlockWithoutItem("hanging_cherry_planks_sign",
            new TerraformHangingSignBlock(CHERRY_PLANKS_HANGING_SIGN_TEXTURE, CHERRY_PLANKS_HANGING_SIGN_GUI, AbstractBlock.Settings.copy(Blocks.CHERRY_HANGING_SIGN)));
    public static final Block WALL_HANGING_CHERRY_PLANKS_SIGN = registerBlockWithoutItem("wall_hanging_cherry_planks_sign",
            new TerraformWallHangingSignBlock(CHERRY_PLANKS_HANGING_SIGN_TEXTURE, CHERRY_PLANKS_HANGING_SIGN_GUI, AbstractBlock.Settings.copy(Blocks.CHERRY_WALL_HANGING_SIGN)));
    public static final Block HANGING_CRIMSON_PLANKS_SIGN = registerBlockWithoutItem("hanging_crimson_planks_sign",
            new TerraformHangingSignBlock(CRIMSON_PLANKS_HANGING_SIGN_TEXTURE, CRIMSON_PLANKS_HANGING_SIGN_GUI, AbstractBlock.Settings.copy(Blocks.CRIMSON_HANGING_SIGN)));
    public static final Block WALL_HANGING_CRIMSON_PLANKS_SIGN = registerBlockWithoutItem("wall_hanging_crimson_planks_sign",
            new TerraformWallHangingSignBlock(CRIMSON_PLANKS_HANGING_SIGN_TEXTURE, CRIMSON_PLANKS_HANGING_SIGN_GUI, AbstractBlock.Settings.copy(Blocks.CRIMSON_WALL_HANGING_SIGN)));
    public static final Block HANGING_WARPED_PLANKS_SIGN = registerBlockWithoutItem("hanging_warped_planks_sign",
            new TerraformHangingSignBlock(WARPED_PLANKS_HANGING_SIGN_TEXTURE, WARPED_PLANKS_HANGING_SIGN_GUI, AbstractBlock.Settings.copy(Blocks.WARPED_HANGING_SIGN)));
    public static final Block WALL_HANGING_WARPED_PLANKS_SIGN = registerBlockWithoutItem("wall_hanging_warped_planks_sign",
            new TerraformWallHangingSignBlock(WARPED_PLANKS_HANGING_SIGN_TEXTURE, WARPED_PLANKS_HANGING_SIGN_GUI, AbstractBlock.Settings.copy(Blocks.WARPED_WALL_HANGING_SIGN)));
    public static final Block HANGING_CACTUS_PLANKS_SIGN = registerBlockWithoutItem("hanging_cactus_planks_sign",
            new TerraformHangingSignBlock(CACTUS_PLANKS_HANGING_SIGN_TEXTURE, CACTUS_PLANKS_HANGING_SIGN_GUI, AbstractBlock.Settings.copy(Blocks.OAK_HANGING_SIGN)));
    public static final Block WALL_HANGING_CACTUS_PLANKS_SIGN = registerBlockWithoutItem("wall_hanging_cactus_planks_sign",
            new TerraformWallHangingSignBlock(CACTUS_PLANKS_HANGING_SIGN_TEXTURE, CACTUS_PLANKS_HANGING_SIGN_GUI, AbstractBlock.Settings.copy(Blocks.OAK_WALL_HANGING_SIGN)));
    public static final Block HANGING_WOODEN_PLANKS_SIGN = registerBlockWithoutItem("hanging_wooden_planks_sign",
            new TerraformHangingSignBlock(WOODEN_PLANKS_HANGING_SIGN_TEXTURE, WOODEN_PLANKS_HANGING_SIGN_GUI, AbstractBlock.Settings.copy(Blocks.OAK_HANGING_SIGN)));
    public static final Block WALL_HANGING_WOODEN_PLANKS_SIGN = registerBlockWithoutItem("wall_hanging_wooden_planks_sign",
            new TerraformWallHangingSignBlock(WOODEN_PLANKS_HANGING_SIGN_TEXTURE, WOODEN_PLANKS_HANGING_SIGN_GUI, AbstractBlock.Settings.copy(Blocks.OAK_WALL_HANGING_SIGN)));

    public static final Block STONE_TEMP = registerBlock("stone_temp",
            new Block(AbstractBlock.Settings.create().strength(0f)));
    public static final Block SMOOTH_STONE_TEMP = registerBlock("smooth_stone_temp",
            new Block(AbstractBlock.Settings.create().strength(0f)));
    public static final Block POLISHED_ANDESITE_TEMP = registerBlock("polished_andesite_temp",
            new Block(AbstractBlock.Settings.create().strength(0f)));
    public static final Block POLISHED_DIORITE_TEMP = registerBlock("polished_diorite_temp",
            new Block(AbstractBlock.Settings.create().strength(0f)));
    public static final Block POLISHED_GRANITE_TEMP = registerBlock("polished_granite_temp",
            new Block(AbstractBlock.Settings.create().strength(0f)));
    public static final Block DRIPSTONE_TEMP = registerBlock("dripstone_temp",
            new Block(AbstractBlock.Settings.create().strength(0f)));
    public static final Block CALCITE_TEMP = registerBlock("calcite_temp",
            new Block(AbstractBlock.Settings.create().strength(0f)));
    public static final Block TUFF_TEMP = registerBlock("tuff_temp",
            new Block(AbstractBlock.Settings.create().strength(0f)));
    public static final Block PACKED_MUD_TEMP = registerBlock("packed_mud_temp",
            new Block(AbstractBlock.Settings.create().strength(0f)));
    public static final Block NETHER_BRICKS_TEMP = registerBlock("nether_bricks_temp",
            new Block(AbstractBlock.Settings.create().strength(0f)));
    public static final Block RED_NETHER_BRICKS_TEMP = registerBlock("red_nether_bricks_temp",
            new Block(AbstractBlock.Settings.create().strength(0f)));
    public static final Block NETHERRACK_TEMP = registerBlock("netherrack_temp",
            new Block(AbstractBlock.Settings.create().strength(0f)));
    public static final Block MAGMA_TEMP = registerBlock("magma_temp",
            new Block(AbstractBlock.Settings.create().strength(0f)));
    public static final Block SNOW_TEMP = registerBlock("snow_temp",
            new Block(AbstractBlock.Settings.create().strength(0f)));
    public static final Block PACKED_ICE_TEMP = registerBlock("packed_ice_temp",
            new Block(AbstractBlock.Settings.create().strength(0f)));
    public static final Block BLUE_ICE_TEMP = registerBlock("blue_ice_temp",
            new Block(AbstractBlock.Settings.create().strength(0f)));
    public static final Block SANDSTONE_TOP_TEMP = registerBlock("sandstone_top_temp",
            new Block(AbstractBlock.Settings.create().strength(0f)));
    public static final Block RED_SANDSTONE_TOP_TEMP = registerBlock("red_sandstone_top_temp",
            new Block(AbstractBlock.Settings.create().strength(0f)));
    public static final Block DARK_PRISMARINE_TEMP = registerBlock("dark_prismarine_temp",
            new Block(AbstractBlock.Settings.create().strength(0f)));
    public static final Block PRISMARINE_BRICKS_TEMP = registerBlock("prismarine_bricks_temp",
            new Block(AbstractBlock.Settings.create().strength(0f)));
    public static final Block QUARTZ_TEMP = registerBlock("quartz_temp",
            new Block(AbstractBlock.Settings.create().strength(0f)));
    public static final Block SMOOTH_QUARTZ_TEMP = registerBlock("smooth_quartz_temp",
            new Block(AbstractBlock.Settings.create().strength(0f)));
    public static final Block QUARTZ_BRICKS_TEMP = registerBlock("quartz_bricks_temp",
            new Block(AbstractBlock.Settings.create().strength(0f)));
    public static final Block TERRACOTTA_TEMP = registerBlock("terracotta_temp",
            new Block(AbstractBlock.Settings.create().strength(0f)));
    public static final Block WHITE_TERRACOTTA_TEMP = registerBlock("white_terracotta_temp",
            new Block(AbstractBlock.Settings.create().strength(0f)));
    public static final Block LIGHT_GRAY_TERRACOTTA_TEMP = registerBlock("light_gray_terracotta_temp",
            new Block(AbstractBlock.Settings.create().strength(0f)));
    public static final Block GRAY_TERRACOTTA_TEMP = registerBlock("gray_terracotta_temp",
            new Block(AbstractBlock.Settings.create().strength(0f)));
    public static final Block BLACK_TERRACOTTA_TEMP = registerBlock("black_terracotta_temp",
            new Block(AbstractBlock.Settings.create().strength(0f)));
    public static final Block BROWN_TERRACOTTA_TEMP = registerBlock("brown_terracotta_temp",
            new Block(AbstractBlock.Settings.create().strength(0f)));
    public static final Block RED_TERRACOTTA_TEMP = registerBlock("red_terracotta_temp",
            new Block(AbstractBlock.Settings.create().strength(0f)));
    public static final Block ORANGE_TERRACOTTA_TEMP = registerBlock("orange_terracotta_temp",
            new Block(AbstractBlock.Settings.create().strength(0f)));
    public static final Block YELLOW_TERRACOTTA_TEMP = registerBlock("yellow_terracotta_temp",
            new Block(AbstractBlock.Settings.create().strength(0f)));
    public static final Block LIME_TERRACOTTA_TEMP = registerBlock("lime_terracotta_temp",
            new Block(AbstractBlock.Settings.create().strength(0f)));
    public static final Block GREEN_TERRACOTTA_TEMP = registerBlock("green_terracotta_temp",
            new Block(AbstractBlock.Settings.create().strength(0f)));
    public static final Block CYAN_TERRACOTTA_TEMP = registerBlock("cyan_terracotta_temp",
            new Block(AbstractBlock.Settings.create().strength(0f)));
    public static final Block LIGHT_BLUE_TERRACOTTA_TEMP = registerBlock("light_blue_terracotta_temp",
            new Block(AbstractBlock.Settings.create().strength(0f)));
    public static final Block BLUE_TERRACOTTA_TEMP = registerBlock("blue_terracotta_temp",
            new Block(AbstractBlock.Settings.create().strength(0f)));
    public static final Block PURPLE_TERRACOTTA_TEMP = registerBlock("purple_terracotta_temp",
            new Block(AbstractBlock.Settings.create().strength(0f)));
    public static final Block MAGENTA_TERRACOTTA_TEMP = registerBlock("magenta_terracotta_temp",
            new Block(AbstractBlock.Settings.create().strength(0f)));
    public static final Block PINK_TERRACOTTA_TEMP = registerBlock("pink_terracotta_temp",
            new Block(AbstractBlock.Settings.create().strength(0f)));
    public static final Block WHITE_CONCRETE_TEMP = registerBlock("white_concrete_temp",
            new Block(AbstractBlock.Settings.create().strength(0f)));
    public static final Block LIGHT_GRAY_CONCRETE_TEMP = registerBlock("light_gray_concrete_temp",
            new Block(AbstractBlock.Settings.create().strength(0f)));
    public static final Block GRAY_CONCRETE_TEMP = registerBlock("gray_concrete_temp",
            new Block(AbstractBlock.Settings.create().strength(0f)));
    public static final Block BLACK_CONCRETE_TEMP = registerBlock("black_concrete_temp",
            new Block(AbstractBlock.Settings.create().strength(0f)));
    public static final Block BROWN_CONCRETE_TEMP = registerBlock("brown_concrete_temp",
            new Block(AbstractBlock.Settings.create().strength(0f)));
    public static final Block RED_CONCRETE_TEMP = registerBlock("red_concrete_temp",
            new Block(AbstractBlock.Settings.create().strength(0f)));
    public static final Block ORANGE_CONCRETE_TEMP = registerBlock("orange_concrete_temp",
            new Block(AbstractBlock.Settings.create().strength(0f)));
    public static final Block YELLOW_CONCRETE_TEMP = registerBlock("yellow_concrete_temp",
            new Block(AbstractBlock.Settings.create().strength(0f)));
    public static final Block LIME_CONCRETE_TEMP = registerBlock("lime_concrete_temp",
            new Block(AbstractBlock.Settings.create().strength(0f)));
    public static final Block GREEN_CONCRETE_TEMP = registerBlock("green_concrete_temp",
            new Block(AbstractBlock.Settings.create().strength(0f)));
    public static final Block CYAN_CONCRETE_TEMP = registerBlock("cyan_concrete_temp",
            new Block(AbstractBlock.Settings.create().strength(0f)));
    public static final Block LIGHT_BLUE_CONCRETE_TEMP = registerBlock("light_blue_concrete_temp",
            new Block(AbstractBlock.Settings.create().strength(0f)));
    public static final Block BLUE_CONCRETE_TEMP = registerBlock("blue_concrete_temp",
            new Block(AbstractBlock.Settings.create().strength(0f)));
    public static final Block PURPLE_CONCRETE_TEMP = registerBlock("purple_concrete_temp",
            new Block(AbstractBlock.Settings.create().strength(0f)));
    public static final Block MAGENTA_CONCRETE_TEMP = registerBlock("magenta_concrete_temp",
            new Block(AbstractBlock.Settings.create().strength(0f)));
    public static final Block PINK_CONCRETE_TEMP = registerBlock("pink_concrete_temp",
            new Block(AbstractBlock.Settings.create().strength(0f)));
    public static final Block END_STONE_TEMP = registerBlock("end_stone_temp",
            new Block(AbstractBlock.Settings.create().strength(0f)));
    public static final Block OBSIDIAN_TEMP = registerBlock("obsidian_temp",
            new Block(AbstractBlock.Settings.create().strength(0f)));
    public static final Block POLISHED_DEEPSLATE_TEMP = registerBlock("polished_deepslate_temp",
            new Block(AbstractBlock.Settings.create().strength(0f)));
    public static final Block DEEPSLATE_TEMP = registerBlock("deepslate_temp",
            new Block(AbstractBlock.Settings.create().strength(0f)));
    public static final Block BLACKSTONE_TEMP = registerBlock("blackstone_temp",
            new Block(AbstractBlock.Settings.create().strength(0f)));
    public static final Block COBBLESTONE_TEMP = registerBlock("cobblestone_temp",
            new Block(AbstractBlock.Settings.create().strength(0f)));
    public static final Block COBBLED_DEEPSLATE_TEMP = registerBlock("cobbled_deepslate_temp",
            new Block(AbstractBlock.Settings.create().strength(0f)));
    public static final Block STRIPPED_OAK_TEMP = registerBlock("stripped_oak_temp",
            new Block(AbstractBlock.Settings.create().strength(0f)));
    public static final Block STRIPPED_SPRUCE_TEMP = registerBlock("stripped_spruce_temp",
            new Block(AbstractBlock.Settings.create().strength(0f)));
    public static final Block STRIPPED_BIRCH_TEMP = registerBlock("stripped_birch_temp",
            new Block(AbstractBlock.Settings.create().strength(0f)));
    public static final Block STRIPPED_JUNGLE_TEMP = registerBlock("stripped_jungle_temp",
            new Block(AbstractBlock.Settings.create().strength(0f)));
    public static final Block STRIPPED_ACACIA_TEMP = registerBlock("stripped_acacia_temp",
            new Block(AbstractBlock.Settings.create().strength(0f)));
    public static final Block STRIPPED_DARK_OAK_TEMP = registerBlock("stripped_dark_oak_temp",
            new Block(AbstractBlock.Settings.create().strength(0f)));
    public static final Block STRIPPED_MANGROVE_TEMP = registerBlock("stripped_mangrove_temp",
            new Block(AbstractBlock.Settings.create().strength(0f)));
    public static final Block STRIPPED_CHERRY_TEMP = registerBlock("stripped_cherry_temp",
            new Block(AbstractBlock.Settings.create().strength(0f)));
    public static final Block STRIPPED_CRIMSON_TEMP = registerBlock("stripped_crimson_temp",
            new Block(AbstractBlock.Settings.create().strength(0f)));
    public static final Block STRIPPED_WARPED_TEMP = registerBlock("stripped_warped_temp",
            new Block(AbstractBlock.Settings.create().strength(0f)));
    public static final Block STRIPPED_WOODEN_TEMP = registerBlock("stripped_wooden_temp",
            new Block(AbstractBlock.Settings.create().strength(0f)));
    public static final Block BAMBOO_MOSAIC_TEMP = registerBlock("bamboo_mosaic_temp",
            new Block(AbstractBlock.Settings.create().strength(0f)));
    public static final Block SPRUCE_MOSAIC_TEMP = registerBlock("spruce_mosaic_temp",
            new Block(AbstractBlock.Settings.create().strength(0f)));
    public static final Block JUNGLE_MOSAIC_TEMP = registerBlock("jungle_mosaic_temp",
            new Block(AbstractBlock.Settings.create().strength(0f)));
    public static final Block DARK_OAK_MOSAIC_TEMP = registerBlock("dark_oak_mosaic_temp",
            new Block(AbstractBlock.Settings.create().strength(0f)));
    public static final Block CRIMSON_MOSAIC_TEMP = registerBlock("crimson_mosaic_temp",
            new Block(AbstractBlock.Settings.create().strength(0f)));
    public static final Block CACTUS_MOSAIC_TEMP = registerBlock("cactus_mosaic_temp",
            new Block(AbstractBlock.Settings.create().strength(0f)));
    public static final Block POLISHED_TUFF_TEMP = registerBlock("polished_tuff_temp",
            new Block(AbstractBlock.Settings.create().strength(0f)));

    public static final BlockFamily CACTUS_FAMILY = BlockFamilies.register(DecoBlocks.CACTUS_PLANKS)
            .sign(DecoBlocks.STANDING_CACTUS_SIGN,DecoBlocks.WALL_CACTUS_SIGN)
            .group("wooden").unlockCriterionName("has_planks").build();
    public static final BlockFamily WOODEN_FAMILY = BlockFamilies.register(DecoBlocks.WOODEN_PLANKS)
            .sign(DecoBlocks.STANDING_WOODEN_SIGN,DecoBlocks.WALL_WOODEN_SIGN)
            .group("wooden").unlockCriterionName("has_planks").build();

    public static final BlockFamily STRIPPED_OAK_FAMILY = BlockFamilies.register(Blocks.STRIPPED_OAK_WOOD)
            .sign(DecoBlocks.STANDING_STRIPPED_OAK_SIGN,DecoBlocks.WALL_STRIPPED_OAK_SIGN)
            .group("stripped_oak").build();
    public static final BlockFamily STRIPPED_SPRUCE_FAMILY = BlockFamilies.register(Blocks.STRIPPED_SPRUCE_WOOD)
            .sign(DecoBlocks.STANDING_STRIPPED_SPRUCE_SIGN,DecoBlocks.WALL_STRIPPED_SPRUCE_SIGN)
            .group("stripped_spruce").build();
    public static final BlockFamily STRIPPED_BIRCH_FAMILY = BlockFamilies.register(Blocks.STRIPPED_BIRCH_WOOD)
            .sign(DecoBlocks.STANDING_STRIPPED_BIRCH_SIGN,DecoBlocks.WALL_STRIPPED_BIRCH_SIGN)
            .group("stripped_birch").build();
    public static final BlockFamily STRIPPED_JUNGLE_FAMILY = BlockFamilies.register(Blocks.STRIPPED_JUNGLE_WOOD)
            .sign(DecoBlocks.STANDING_STRIPPED_JUNGLE_SIGN,DecoBlocks.WALL_STRIPPED_JUNGLE_SIGN)
            .group("stripped_jungle").build();
    public static final BlockFamily STRIPPED_DARK_OAK_FAMILY = BlockFamilies.register(Blocks.STRIPPED_DARK_OAK_WOOD)
            .sign(DecoBlocks.STANDING_STRIPPED_DARK_OAK_SIGN,DecoBlocks.WALL_STRIPPED_DARK_OAK_SIGN)
            .group("stripped_dark_oak").build();
    public static final BlockFamily STRIPPED_ACACIA_FAMILY = BlockFamilies.register(Blocks.STRIPPED_ACACIA_WOOD)
            .sign(DecoBlocks.STANDING_STRIPPED_ACACIA_SIGN,DecoBlocks.WALL_STRIPPED_ACACIA_SIGN)
            .group("stripped_acacia").build();
    public static final BlockFamily STRIPPED_CHERRY_FAMILY = BlockFamilies.register(Blocks.STRIPPED_CHERRY_WOOD)
            .sign(DecoBlocks.STANDING_STRIPPED_CHERRY_SIGN,DecoBlocks.WALL_STRIPPED_CHERRY_SIGN)
            .group("stripped_cherry").build();
    public static final BlockFamily STRIPPED_MANGROVE_FAMILY = BlockFamilies.register(Blocks.STRIPPED_MANGROVE_WOOD)
            .sign(DecoBlocks.STANDING_STRIPPED_MANGROVE_SIGN,DecoBlocks.WALL_STRIPPED_MANGROVE_SIGN)
            .group("stripped_mangrove").build();
    public static final BlockFamily STRIPPED_CRIMSON_FAMILY = BlockFamilies.register(Blocks.STRIPPED_CRIMSON_HYPHAE)
            .sign(DecoBlocks.STANDING_STRIPPED_CRIMSON_SIGN,DecoBlocks.WALL_STRIPPED_CRIMSON_SIGN)
            .group("stripped_crimson").build();
    public static final BlockFamily STRIPPED_WARPED_FAMILY = BlockFamilies.register(Blocks.STRIPPED_WARPED_HYPHAE)
            .sign(DecoBlocks.STANDING_STRIPPED_WARPED_SIGN,DecoBlocks.WALL_STRIPPED_WARPED_SIGN)
            .group("stripped_warped").build();
    public static final BlockFamily STRIPPED_WOODEN_FAMILY = BlockFamilies.register(DecoBlocks.STRIPPED_WOODEN_WOOD)
            .sign(DecoBlocks.STANDING_STRIPPED_WOODEN_SIGN,DecoBlocks.WALL_STRIPPED_WOODEN_SIGN)
            .group("stripped_wooden").build();

    public static final BlockFamily OAK_MOSAIC_FAMILY = BlockFamilies.register(DecoBlocks.OAK_MOSAIC)
            .sign(DecoBlocks.STANDING_OAK_MOSAIC_SIGN,DecoBlocks.WALL_OAK_MOSAIC_SIGN)
            .group("oak_mosaic").build();
    public static final BlockFamily SPRUCE_MOSAIC_FAMILY = BlockFamilies.register(DecoBlocks.SPRUCE_MOSAIC)
            .sign(DecoBlocks.STANDING_SPRUCE_MOSAIC_SIGN,DecoBlocks.WALL_SPRUCE_MOSAIC_SIGN)
            .group("spruce_mosaic").build();
    public static final BlockFamily BIRCH_MOSAIC_FAMILY = BlockFamilies.register(DecoBlocks.BIRCH_MOSAIC)
            .sign(DecoBlocks.STANDING_BIRCH_MOSAIC_SIGN,DecoBlocks.WALL_BIRCH_MOSAIC_SIGN)
            .group("birch_mosaic").build();
    public static final BlockFamily JUNGLE_MOSAIC_FAMILY = BlockFamilies.register(DecoBlocks.JUNGLE_MOSAIC)
            .sign(DecoBlocks.STANDING_JUNGLE_MOSAIC_SIGN,DecoBlocks.WALL_JUNGLE_MOSAIC_SIGN)
            .group("jungle_mosaic").build();
    public static final BlockFamily DARK_OAK_MOSAIC_FAMILY = BlockFamilies.register(DecoBlocks.DARK_OAK_MOSAIC)
            .sign(DecoBlocks.STANDING_DARK_OAK_MOSAIC_SIGN,DecoBlocks.WALL_DARK_OAK_MOSAIC_SIGN)
            .group("dark_oak_mosaic").build();
    public static final BlockFamily ACACIA_MOSAIC_FAMILY = BlockFamilies.register(DecoBlocks.ACACIA_MOSAIC)
            .sign(DecoBlocks.STANDING_ACACIA_MOSAIC_SIGN,DecoBlocks.WALL_ACACIA_MOSAIC_SIGN)
            .group("acacia_mosaic").build();
    public static final BlockFamily CHERRY_MOSAIC_FAMILY = BlockFamilies.register(DecoBlocks.CHERRY_MOSAIC)
            .sign(DecoBlocks.STANDING_CHERRY_MOSAIC_SIGN,DecoBlocks.WALL_CHERRY_MOSAIC_SIGN)
            .group("cherry_mosaic").build();
    public static final BlockFamily MANGROVE_MOSAIC_FAMILY = BlockFamilies.register(DecoBlocks.MANGROVE_MOSAIC)
            .sign(DecoBlocks.STANDING_MANGROVE_MOSAIC_SIGN,DecoBlocks.WALL_MANGROVE_MOSAIC_SIGN)
            .group("mangrove_mosaic").build();
    public static final BlockFamily BAMBOO_MOSAIC_FAMILY = BlockFamilies.register(DecoBlocks.BAMBOO_MOSAIC_TEMP)
            .sign(DecoBlocks.STANDING_BAMBOO_MOSAIC_SIGN,DecoBlocks.WALL_BAMBOO_MOSAIC_SIGN)
            .group("bamboo_mosaic").build();
    public static final BlockFamily CRIMSON_MOSAIC_FAMILY = BlockFamilies.register(DecoBlocks.CRIMSON_MOSAIC)
            .sign(DecoBlocks.STANDING_CRIMSON_MOSAIC_SIGN,DecoBlocks.WALL_CRIMSON_MOSAIC_SIGN)
            .group("crimson_mosaic").build();
    public static final BlockFamily WARPED_MOSAIC_FAMILY = BlockFamilies.register(DecoBlocks.WARPED_MOSAIC)
            .sign(DecoBlocks.STANDING_WARPED_MOSAIC_SIGN,DecoBlocks.WALL_WARPED_MOSAIC_SIGN)
            .group("warped_mosaic").build();
    public static final BlockFamily CACTUS_MOSAIC_FAMILY = BlockFamilies.register(DecoBlocks.CACTUS_MOSAIC)
            .sign(DecoBlocks.STANDING_CACTUS_MOSAIC_SIGN,DecoBlocks.WALL_CACTUS_MOSAIC_SIGN)
            .group("cactus_mosaic").build();
    public static final BlockFamily WOODEN_MOSAIC_FAMILY = BlockFamilies.register(DecoBlocks.WOODEN_MOSAIC)
            .sign(DecoBlocks.STANDING_WOODEN_MOSAIC_SIGN,DecoBlocks.WALL_WOODEN_MOSAIC_SIGN)
            .group("wooden_mosaic").build();

    public static PillarBlock createLogBlock(MapColor topMapColor, MapColor sideMapColor) {
        return new PillarBlock(
                AbstractBlock.Settings.create()
                        .mapColor(state -> state.get(PillarBlock.AXIS) == Direction.Axis.Y ? topMapColor : sideMapColor)
                        .instrument(NoteBlockInstrument.BASS)
                        .strength(2.0F)
                        .sounds(BlockSoundGroup.WOOD)
                        .burnable()
        );
    }

    private static Block registerBlockWithoutItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, Identifier.of(VaranDeco.MOD_ID, name), block);
    }
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(VaranDeco.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, Identifier.of(VaranDeco.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }
    
    public static void registerDecoBlocks(){
        VaranDeco.LOGGER.debug("Registering Blocks for " + VaranDeco.MOD_ID);
    }
}