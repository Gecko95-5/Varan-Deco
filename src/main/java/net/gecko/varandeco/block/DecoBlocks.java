package net.gecko.varandeco.block;

import com.terraformersmc.terraform.sign.block.TerraformSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformWallSignBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.gecko.varandeco.VaranDeco;
import net.gecko.varandeco.block.cartographytables.*;
import net.gecko.varandeco.block.craftingtables.*;
import net.gecko.varandeco.block.custom.*;
import net.gecko.varandeco.block.flowers.*;
import net.gecko.varandeco.block.magmabubbleblocks.*;
import net.gecko.varandeco.block.oxidizable.OxidizableChainBlock;
import net.gecko.varandeco.block.oxidizable.OxidizableLanternBlock;
import net.gecko.varandeco.block.oxidizable.OxidizablePaneBlock;
import net.gecko.varandeco.block.oxidizable.OxidizablePressurePlateBlock;
import net.gecko.varandeco.block.smithingtables.*;
import net.gecko.varandeco.block.stonemadeblocks.*;
import net.gecko.varandeco.item.DecoItemGroup;
import net.gecko.varandeco.world.feature.tree.WoodenSaplingGenerator;
import net.minecraft.block.*;
import net.minecraft.data.family.BlockFamilies;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;

public class DecoBlocks {
    public static final Block CACTUS_PLANKS = registerBlock("cactus_planks",
            new Block(FabricBlockSettings.of(Material.WOOD, MapColor.PALE_GREEN).strength(2.0f,3.0f)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block WOODEN_PLANKS = registerBlock("wooden_planks",
            new Block(FabricBlockSettings.of(Material.WOOD).mapColor(MapColor.BROWN).strength(2.0f,3.0f)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block CHARCOAL_BLOCK = registerBlock("charcoal_block",
            new Block(FabricBlockSettings.of(Material.STONE, MapColor.SPRUCE_BROWN).requiresTool()
                    .strength(5.0F, 6.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block FLINT_BLOCK = registerBlock("flint_block",
            new Block(FabricBlockSettings.of(Material.STONE, MapColor.BLACK).requiresTool().strength(5.0F, 6.0F)
                    .sounds(BlockSoundGroup.DEEPSLATE_BRICKS)));
    public static final Block ECHO_BLOCK = registerBlock("echo_block",
            new Block(FabricBlockSettings.of(Material.METAL, MapColor.BLACK).requiresTool().strength(2.0F, 3.0F)
                    .sounds(BlockSoundGroup.SCULK_CATALYST).luminance(state -> 7)));
    public static final Block CUT_IRON = registerBlock("cut_iron",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block CUT_IRON_STAIRS = registerBlock("cut_iron_stairs",
            new StairsBlock(DecoBlocks.CUT_IRON.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.CUT_IRON)));
    public static final Block CUT_IRON_SLAB = registerBlock("cut_iron_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_IRON)));
    public static final Block WOODEN_LOG = registerBlock("wooden_log",
            createLogBlock(MapColor.BROWN, MapColor.TERRACOTTA_BROWN));
    public static final Block STRIPPED_WOODEN_LOG = registerBlock("stripped_wooden_log",
            createLogBlock(MapColor.BROWN, MapColor.BROWN));
    public static final Block STRIPPED_WOODEN_WOOD = registerBlock("stripped_wooden_wood",
            new PillarBlock(FabricBlockSettings.of(Material.WOOD).mapColor(MapColor.TERRACOTTA_BROWN).strength(2.0f,2.0f)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block WOODEN_WOOD = registerBlock("wooden_wood",
            new PillarBlock(FabricBlockSettings.of(Material.WOOD).mapColor(MapColor.BROWN).strength(2.0f,2.0f)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block HARDENED_GLASS = registerBlock("hardened_glass",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS).strength(25.0f,100.0f)
                    .nonOpaque().requiresTool()));
    public static final Block HARDENED_TINTED_GLASS = registerBlock("hardened_tinted_glass",
            new TintedGlassBlock(FabricBlockSettings.copyOf(Blocks.TINTED_GLASS).strength(25.0f,100.0f)
                    .nonOpaque().requiresTool()));
    public static final Block CUT_SANDSTONE_BRICKS = registerBlock("cut_sandstone_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(1.6f).requiresTool()));
    public static final Block SMOOTH_PURPUR = registerBlock("smooth_purpur",
            new Block(FabricBlockSettings.copyOf(Blocks.PURPUR_BLOCK)));
    public static final Block SMOOTH_DEEPSLATE = registerBlock("smooth_deepslate",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(3.5f,6.0f)
                    .mapColor(MapColor.IRON_GRAY)));
    public static final Block SMOOTH_BLACKSTONE = registerBlock("smooth_blackstone",
            new Block(FabricBlockSettings.copyOf(Blocks.BLACKSTONE).strength(2.0f,6.0f)
                    .mapColor(MapColor.DARK_AQUA)));
    public static final Block CHISELED_BRICKS = registerBlock("chiseled_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));
    public static final Block CHISELED_OBSIDIAN = registerBlock("chiseled_obsidian",
            new Block(FabricBlockSettings.copyOf(Blocks.OBSIDIAN).mapColor(MapColor.PURPLE)));
    public static final Block OBSIDIAN_BRICKS = registerBlock("obsidian_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.OBSIDIAN).mapColor(MapColor.PURPLE)));
    public static final Block OBSIDIAN_PILLAR = registerBlock("obsidian_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OBSIDIAN).mapColor(MapColor.PURPLE)));
    public static final Block CHISELED_PURPUR = registerBlock("chiseled_purpur",
            new Block(FabricBlockSettings.copyOf(Blocks.PURPUR_BLOCK)));
    public static final Block PURPUR_BRICKS = registerBlock("purpur_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.PURPUR_BLOCK)));
    public static final Block SNOW_BRICKS = registerBlock("snow_bricks",
            new Block(FabricBlockSettings.of(Material.SNOW_BLOCK).slipperiness(0.89F)
                    .strength(1.0f).resistance(0.7f).requiresTool().sounds(BlockSoundGroup.SNOW)));
    public static final Block POLISHED_STONE = registerBlock("polished_stone",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2.5f).resistance(6.0f).requiresTool()));
    public static final Block STONE_TILES = registerBlock("stone_tiles",
            new Block(FabricBlockSettings.of(Material.STONE).strength(1.5f).resistance(6.0f).requiresTool()));
    public static final Block CHISELED_SNOW_BRICKS = registerBlock("chiseled_snow_bricks",
            new Block(FabricBlockSettings.copyOf(DecoBlocks.SNOW_BRICKS)));
    public static final Block CHISELED_END_STONE = registerBlock("chiseled_end_stone",
            new Block(FabricBlockSettings.copyOf(Blocks.END_STONE)));
    public static final Block VOID_STONE = registerBlock("void_stone",
            new Block(FabricBlockSettings.copyOf(Blocks.END_STONE).sounds(BlockSoundGroup.DEEPSLATE)
                    .mapColor(MapColor.TERRACOTTA_BLUE).strength(5.0F, 12.0F)));
    public static final Block VOID_STONE_BRICKS = registerBlock("void_stone_bricks",
            new Block(FabricBlockSettings.copyOf(DecoBlocks.VOID_STONE)));
    public static final Block CHISELED_VOID_STONE = registerBlock("chiseled_void_stone",
            new Block(FabricBlockSettings.copyOf(DecoBlocks.VOID_STONE).luminance(state -> 1)));
    public static final Block CUT_QUARTZ = registerBlock("cut_quartz",
            new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK)));
    public static final Block WHITE_TERRACOTTA_BRICKS = registerBlock("white_terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.WHITE_TERRACOTTA)));
    public static final Block ORANGE_TERRACOTTA_BRICKS = registerBlock("orange_terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.ORANGE_TERRACOTTA)));
    public static final Block MAGENTA_TERRACOTTA_BRICKS = registerBlock("magenta_terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.MAGENTA_TERRACOTTA)));
    public static final Block LIGHT_BLUE_TERRACOTTA_BRICKS = registerBlock("light_blue_terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_TERRACOTTA)));
    public static final Block YELLOW_TERRACOTTA_BRICKS = registerBlock("yellow_terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.YELLOW_TERRACOTTA)));
    public static final Block LIME_TERRACOTTA_BRICKS = registerBlock("lime_terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.LIME_TERRACOTTA)));
    public static final Block PINK_TERRACOTTA_BRICKS = registerBlock("pink_terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.PINK_TERRACOTTA)));
    public static final Block GRAY_TERRACOTTA_BRICKS = registerBlock("gray_terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.GRAY_TERRACOTTA)));
    public static final Block LIGHT_GRAY_TERRACOTTA_BRICKS = registerBlock("light_gray_terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_TERRACOTTA)));
    public static final Block CYAN_TERRACOTTA_BRICKS = registerBlock("cyan_terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.CYAN_TERRACOTTA)));
    public static final Block PURPLE_TERRACOTTA_BRICKS = registerBlock("purple_terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.PURPLE_TERRACOTTA)));
    public static final Block BLUE_TERRACOTTA_BRICKS = registerBlock("blue_terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.BLUE_TERRACOTTA)));
    public static final Block BROWN_TERRACOTTA_BRICKS = registerBlock("brown_terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.BROWN_TERRACOTTA)));
    public static final Block GREEN_TERRACOTTA_BRICKS = registerBlock("green_terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.GREEN_TERRACOTTA)));
    public static final Block RED_TERRACOTTA_BRICKS = registerBlock("red_terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.RED_TERRACOTTA)));
    public static final Block BLACK_TERRACOTTA_BRICKS = registerBlock("black_terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.BLACK_TERRACOTTA)));
    public static final Block TERRACOTTA_BRICKS = registerBlock("terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));
    public static final Block HARDENED_WHITE_STAINED_GLASS = registerBlock("hardened_white_stained_glass",
            new StainedGlassBlock(DyeColor.WHITE, FabricBlockSettings.copyOf(Blocks.WHITE_STAINED_GLASS).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()));
    public static final Block HARDENED_ORANGE_STAINED_GLASS = registerBlock("hardened_orange_stained_glass",
            new StainedGlassBlock(DyeColor.ORANGE, FabricBlockSettings.copyOf(Blocks.ORANGE_STAINED_GLASS).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()));
    public static final Block HARDENED_MAGENTA_STAINED_GLASS = registerBlock("hardened_magenta_stained_glass",
            new StainedGlassBlock(DyeColor.MAGENTA, FabricBlockSettings.copyOf(Blocks.MAGENTA_STAINED_GLASS).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()));
    public static final Block HARDENED_LIGHT_BLUE_STAINED_GLASS = registerBlock("hardened_light_blue_stained_glass",
            new StainedGlassBlock(DyeColor.LIGHT_BLUE, FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_STAINED_GLASS).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()));
    public static final Block HARDENED_YELLOW_STAINED_GLASS = registerBlock("hardened_yellow_stained_glass",
            new StainedGlassBlock(DyeColor.YELLOW, FabricBlockSettings.copyOf(Blocks.YELLOW_STAINED_GLASS).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()));
    public static final Block HARDENED_LIME_STAINED_GLASS = registerBlock("hardened_lime_stained_glass",
            new StainedGlassBlock(DyeColor.LIME, FabricBlockSettings.copyOf(Blocks.LIME_STAINED_GLASS).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()));
    public static final Block HARDENED_PINK_STAINED_GLASS = registerBlock("hardened_pink_stained_glass",
            new StainedGlassBlock(DyeColor.PINK, FabricBlockSettings.copyOf(Blocks.PINK_STAINED_GLASS).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()));
    public static final Block HARDENED_GRAY_STAINED_GLASS = registerBlock("hardened_gray_stained_glass",
            new StainedGlassBlock(DyeColor.GRAY, FabricBlockSettings.copyOf(Blocks.GRAY_STAINED_GLASS).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()));
    public static final Block HARDENED_LIGHT_GRAY_STAINED_GLASS = registerBlock("hardened_light_gray_stained_glass",
            new StainedGlassBlock(DyeColor.LIGHT_GRAY, FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_STAINED_GLASS).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()));
    public static final Block HARDENED_CYAN_STAINED_GLASS = registerBlock("hardened_cyan_stained_glass",
            new StainedGlassBlock(DyeColor.CYAN, FabricBlockSettings.copyOf(Blocks.CYAN_STAINED_GLASS).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()));
    public static final Block HARDENED_PURPLE_STAINED_GLASS = registerBlock("hardened_purple_stained_glass",
            new StainedGlassBlock(DyeColor.PURPLE, FabricBlockSettings.copyOf(Blocks.PURPLE_STAINED_GLASS).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()));
    public static final Block HARDENED_BLUE_STAINED_GLASS = registerBlock("hardened_blue_stained_glass",
            new StainedGlassBlock(DyeColor.BLUE, FabricBlockSettings.copyOf(Blocks.BLUE_STAINED_GLASS).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()));
    public static final Block HARDENED_BROWN_STAINED_GLASS = registerBlock("hardened_brown_stained_glass",
            new StainedGlassBlock(DyeColor.BROWN, FabricBlockSettings.copyOf(Blocks.BROWN_STAINED_GLASS).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()));
    public static final Block HARDENED_GREEN_STAINED_GLASS = registerBlock("hardened_green_stained_glass",
            new StainedGlassBlock(DyeColor.GREEN, FabricBlockSettings.copyOf(Blocks.GREEN_STAINED_GLASS).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()));
    public static final Block HARDENED_RED_STAINED_GLASS = registerBlock("hardened_red_stained_glass",
            new StainedGlassBlock(DyeColor.RED, FabricBlockSettings.copyOf(Blocks.RED_STAINED_GLASS).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()));
    public static final Block HARDENED_BLACK_STAINED_GLASS = registerBlock("hardened_black_stained_glass",
            new StainedGlassBlock(DyeColor.BLACK, FabricBlockSettings.copyOf(Blocks.BLACK_STAINED_GLASS).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()));
    public static final Block CUT_RED_SANDSTONE_BRICKS = registerBlock("cut_red_sandstone_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(1.6f).requiresTool()));
    public static final Block CHISELED_PRISMARINE_BRICKS = registerBlock("chiseled_prismarine_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.PRISMARINE).mapColor(MapColor.DIAMOND_BLUE)));
    public static final Block CRYSTALLIZED_PRISMARINE = registerBlock("crystallized_prismarine",
            new Block(FabricBlockSettings.copyOf(Blocks.PRISMARINE).mapColor(MapColor.BRIGHT_TEAL)
                    .luminance(state -> 3).sounds(BlockSoundGroup.GLASS)));
    public static final Block CRYSTALLIZED_PRISMARINE_BRICKS = registerBlock("crystallized_prismarine_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.PRISMARINE).mapColor(MapColor.BRIGHT_TEAL)
                    .luminance(state -> 3).sounds(BlockSoundGroup.GLASS)));
    public static final Block CHISELED_CRYSTALLIZED_PRISMARINE_BRICKS = registerBlock("chiseled_crystallized_prismarine_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.PRISMARINE).mapColor(MapColor.BRIGHT_TEAL)
                    .luminance(state -> 3).sounds(BlockSoundGroup.GLASS)));
    public static final Block LIGHT_PRISMARINE = registerBlock("light_prismarine",
            new Block(FabricBlockSettings.copyOf(Blocks.PRISMARINE).mapColor(MapColor.OFF_WHITE)
                    .luminance(state -> 5).sounds(BlockSoundGroup.GLASS)));
    public static final Block ICE_BRICKS = registerBlock("ice_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.PACKED_ICE).strength(1.4f)));
    public static final Block SOUL_SOILSTONE = registerBlock("soul_soilstone",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0.8f).requiresTool().mapColor(MapColor.BROWN)));
    public static final Block CHISELED_SOUL_SOILSTONE = registerBlock("chiseled_soul_soilstone",
            new Block(FabricBlockSettings.copyOf(DecoBlocks.SOUL_SOILSTONE)));
    public static final Block CUT_SOUL_SOILSTONE = registerBlock("cut_soul_soilstone",
            new Block(FabricBlockSettings.copyOf(DecoBlocks.SOUL_SOILSTONE)));
    public static final Block SMOOTH_SOUL_SOILSTONE = registerBlock("smooth_soul_soilstone",
            new Block(FabricBlockSettings.copyOf(DecoBlocks.SOUL_SOILSTONE)));
    public static final Block CUT_SOUL_SOILSTONE_BRICKS = registerBlock("cut_soul_soilstone_bricks",
            new Block(FabricBlockSettings.copyOf(DecoBlocks.CUT_SOUL_SOILSTONE)));
    public static final Block MAGMA_BRICKS = registerBlock("magma_bricks",
            new MagmaBrickBlock(FabricBlockSettings.copyOf(Blocks.MAGMA_BLOCK).luminance(state -> 1)
                    .strength(1.5F).sounds(BlockSoundGroup.NETHER_BRICKS)));
    public static final Block CHISELED_MAGMA_BRICKS = registerBlock("chiseled_magma_bricks",
            new MagmaBrickBlock(FabricBlockSettings.copyOf(DecoBlocks.MAGMA_BRICKS)));
    public static final Block BUBBLE_BLOCK = registerBlock("bubble_block",
            new BubbleBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).strength(0.5F,25.0f)
                    .mapColor(MapColor.BLUE)));
    public static final Block BUBBLE_BRICKS = registerBlock("bubble_bricks",
            new BubbleBlock(FabricBlockSettings.copyOf(DecoBlocks.BUBBLE_BLOCK).strength(1.5F)
                    .mapColor(MapColor.STONE_GRAY)));
    public static final Block CHISELED_BUBBLE_BRICKS = registerBlock("chiseled_bubble_bricks",
            new BubbleBlock(FabricBlockSettings.copyOf(DecoBlocks.BUBBLE_BRICKS)));
    public static final Block CHISELED_RED_NETHER_BRICKS = registerBlock("chiseled_red_nether_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.RED_NETHER_BRICKS)));
    public static final Block CRACKED_RED_NETHER_BRICKS = registerBlock("cracked_red_nether_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.RED_NETHER_BRICKS)));
    public static final Block BLUE_NETHER_BRICKS = registerBlock("blue_nether_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHER_BRICKS).mapColor(MapColor.TEAL)));
    public static final Block CHISELED_BLUE_NETHER_BRICKS = registerBlock("chiseled_blue_nether_bricks",
            new Block(FabricBlockSettings.copyOf(DecoBlocks.BLUE_NETHER_BRICKS)));
    public static final Block CRACKED_BLUE_NETHER_BRICKS = registerBlock("cracked_blue_nether_bricks",
            new Block(FabricBlockSettings.copyOf(DecoBlocks.BLUE_NETHER_BRICKS)));
    public static final Block CUT_WHITE_CONCRETE = registerBlock("cut_white_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.WHITE_CONCRETE)));
    public static final Block CUT_ORANGE_CONCRETE = registerBlock("cut_orange_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.ORANGE_CONCRETE)));
    public static final Block CUT_MAGENTA_CONCRETE = registerBlock("cut_magenta_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.MAGENTA_CONCRETE)));
    public static final Block CUT_LIGHT_BLUE_CONCRETE = registerBlock("cut_light_blue_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_CONCRETE)));
    public static final Block CUT_YELLOW_CONCRETE = registerBlock("cut_yellow_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.YELLOW_CONCRETE)));
    public static final Block CUT_LIME_CONCRETE = registerBlock("cut_lime_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.LIME_CONCRETE)));
    public static final Block CUT_PINK_CONCRETE = registerBlock("cut_pink_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.PINK_CONCRETE)));
    public static final Block CUT_GRAY_CONCRETE = registerBlock("cut_gray_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.GRAY_CONCRETE)));
    public static final Block CUT_LIGHT_GRAY_CONCRETE = registerBlock("cut_light_gray_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_CONCRETE)));
    public static final Block CUT_CYAN_CONCRETE = registerBlock("cut_cyan_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.CYAN_CONCRETE)));
    public static final Block CUT_PURPLE_CONCRETE = registerBlock("cut_purple_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.PURPLE_CONCRETE)));
    public static final Block CUT_BLUE_CONCRETE = registerBlock("cut_blue_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.BLUE_CONCRETE)));
    public static final Block CUT_BROWN_CONCRETE = registerBlock("cut_brown_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.BROWN_CONCRETE)));
    public static final Block CUT_GREEN_CONCRETE = registerBlock("cut_green_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.GREEN_CONCRETE)));
    public static final Block CUT_RED_CONCRETE = registerBlock("cut_red_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.RED_CONCRETE)));
    public static final Block CUT_BLACK_CONCRETE = registerBlock("cut_black_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.BLACK_CONCRETE)));
    public static final Block WHITE_CONCRETE_PILLAR = registerBlock("white_concrete_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.WHITE_CONCRETE)));
    public static final Block ORANGE_CONCRETE_PILLAR = registerBlock("orange_concrete_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.ORANGE_CONCRETE)));
    public static final Block MAGENTA_CONCRETE_PILLAR = registerBlock("magenta_concrete_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.MAGENTA_CONCRETE)));
    public static final Block LIGHT_BLUE_CONCRETE_PILLAR = registerBlock("light_blue_concrete_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_CONCRETE)));
    public static final Block YELLOW_CONCRETE_PILLAR = registerBlock("yellow_concrete_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.YELLOW_CONCRETE)));
    public static final Block LIME_CONCRETE_PILLAR = registerBlock("lime_concrete_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.LIME_CONCRETE)));
    public static final Block PINK_CONCRETE_PILLAR = registerBlock("pink_concrete_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.PINK_CONCRETE)));
    public static final Block GRAY_CONCRETE_PILLAR = registerBlock("gray_concrete_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.GRAY_CONCRETE)));
    public static final Block LIGHT_GRAY_CONCRETE_PILLAR = registerBlock("light_gray_concrete_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_CONCRETE)));
    public static final Block CYAN_CONCRETE_PILLAR = registerBlock("cyan_concrete_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.CYAN_CONCRETE)));
    public static final Block PURPLE_CONCRETE_PILLAR = registerBlock("purple_concrete_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.PURPLE_CONCRETE)));
    public static final Block BLUE_CONCRETE_PILLAR = registerBlock("blue_concrete_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.BLUE_CONCRETE)));
    public static final Block BROWN_CONCRETE_PILLAR = registerBlock("brown_concrete_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.BROWN_CONCRETE)));
    public static final Block GREEN_CONCRETE_PILLAR = registerBlock("green_concrete_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.GREEN_CONCRETE)));
    public static final Block RED_CONCRETE_PILLAR = registerBlock("red_concrete_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.RED_CONCRETE)));
    public static final Block BLACK_CONCRETE_PILLAR = registerBlock("black_concrete_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.BLACK_CONCRETE)));
    public static final Block POLISHED_GLIDED_BLACKSTONE = registerBlock("polished_gilded_blackstone",
            new Block(FabricBlockSettings.copyOf(Blocks.GILDED_BLACKSTONE).strength(2.5f)));
    public static final Block CHISELED_GLIDED_BLACKSTONE = registerBlock("chiseled_gilded_blackstone",
            new Block(FabricBlockSettings.copyOf(DecoBlocks.POLISHED_GLIDED_BLACKSTONE)));
    public static final Block POLISHED_BLACKSTONE_TILES = registerBlock("polished_blackstone_tiles",
            new Block(FabricBlockSettings.of(Material.STONE, MapColor.BLACK).strength(1.5f).resistance(6.0f).requiresTool()));
    public static final Block BLACK_ICE = registerBlock("black_ice",
            new BlackIceBlock(FabricBlockSettings.of(Material.DENSE_ICE, MapColor.BLACK).slipperiness(1.18F)
                    .strength(5.6f).requiresTool().sounds(BlockSoundGroup.STONE).velocityMultiplier(0.9F)));
    public static final Block WHITE_BLOCK = registerBlock("white_block",
            new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT, DyeColor.WHITE).resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE)));
    public static final Block ORANGE_BLOCK = registerBlock("orange_block",
            new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT, DyeColor.ORANGE).resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE)));
    public static final Block MAGENTA_BLOCK = registerBlock("magenta_block",
            new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT, DyeColor.MAGENTA).resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE)));
    public static final Block LIGHT_BLUE_BLOCK = registerBlock("light_blue_block",
            new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT, DyeColor.LIGHT_BLUE).resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE)));
    public static final Block YELLOW_BLOCK = registerBlock("yellow_block",
            new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT, DyeColor.YELLOW).resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE)));
    public static final Block LIME_BLOCK = registerBlock("lime_block",
            new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT, DyeColor.LIME).resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE)));
    public static final Block PINK_BLOCK = registerBlock("pink_block",
            new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT, DyeColor.PINK).resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE)));
    public static final Block GRAY_BLOCK = registerBlock("gray_block",
            new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT, DyeColor.GRAY).resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE)));
    public static final Block LIGHT_GRAY_BLOCK = registerBlock("light_gray_block",
            new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT, DyeColor.LIGHT_GRAY).resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE)));
    public static final Block CYAN_BLOCK = registerBlock("cyan_block",
            new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT, DyeColor.CYAN).resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE)));
    public static final Block PURPLE_BLOCK = registerBlock("purple_block",
            new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT, DyeColor.PURPLE).resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE)));
    public static final Block BLUE_BLOCK = registerBlock("blue_block",
            new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT, DyeColor.BLUE).resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE)));
    public static final Block BROWN_BLOCK = registerBlock("brown_block",
            new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT, DyeColor.BROWN).resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE)));
    public static final Block GREEN_BLOCK = registerBlock("green_block",
            new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT, DyeColor.GREEN).resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE)));
    public static final Block RED_BLOCK = registerBlock("red_block",
            new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT, DyeColor.RED).resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE)));
    public static final Block BLACK_BLOCK = registerBlock("black_block",
            new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT, DyeColor.BLACK).resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE)));

    public static final Block WARPED_WART_PLANT = registerBlockWithoutItem("warped_wart_plant",
            new WarpedWartBlock(FabricBlockSettings.copyOf(Blocks.NETHER_WART).mapColor(MapColor.BRIGHT_TEAL).nonOpaque()));

    public static final Block DEEPSLATE_STAIRS = registerBlock("deepslate_stairs",
            new StairsBlock(Blocks.DEEPSLATE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.DEEPSLATE)));
    public static final Block CALCITE_STAIRS = registerBlock("calcite_stairs",
            new StairsBlock(Blocks.CALCITE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.CALCITE)));
    public static final Block TUFF_STAIRS = registerBlock("tuff_stairs",
            new StairsBlock(Blocks.TUFF.getDefaultState(),FabricBlockSettings.copyOf(Blocks.TUFF)));
    public static final Block DRIPSTONE_STAIRS = registerBlock("dripstone_stairs",
            new StairsBlock(Blocks.DRIPSTONE_BLOCK.getDefaultState(),FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)));
    public static final Block CUT_SANDSTONE_STAIRS = registerBlock("cut_sandstone_stairs",
            new StairsBlock(Blocks.CUT_SANDSTONE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.CUT_SANDSTONE)));
    public static final Block SMOOTH_STONE_STAIRS = registerBlock("smooth_stone_stairs",
            new StairsBlock(Blocks.SMOOTH_STONE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE)));
    public static final Block OBSIDIAN_STAIRS = registerBlock("obsidian_stairs",
            new StairsBlock(Blocks.OBSIDIAN.getDefaultState(),FabricBlockSettings.copyOf(Blocks.OBSIDIAN)));
    public static final Block SNOW_STAIRS = registerBlock("snow_stairs",
            new StairsBlock(Blocks.SNOW_BLOCK.getDefaultState(),FabricBlockSettings.copyOf(Blocks.SNOW_BLOCK)));
    public static final Block NETHERRACK_STAIRS = registerBlock("netherrack_stairs",
            new StairsBlock(Blocks.NETHERRACK.getDefaultState(),FabricBlockSettings.copyOf(Blocks.NETHERRACK)));
    public static final Block PACKED_MUD_STAIRS = registerBlock("packed_mud_stairs",
            new StairsBlock(Blocks.PACKED_MUD.getDefaultState(),FabricBlockSettings.copyOf(Blocks.PACKED_MUD)));
    public static final Block QUARTZ_BRICK_STAIRS = registerBlock("quartz_brick_stairs",
            new StairsBlock(Blocks.QUARTZ_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(Blocks.QUARTZ_BRICKS)));
    public static final Block END_STONE_STAIRS = registerBlock("end_stone_stairs",
            new StairsBlock(Blocks.END_STONE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.END_STONE)));
    public static final Block WHITE_TERRACOTTA_STAIRS = registerBlock("white_terracotta_stairs",
            new StairsBlock(Blocks.WHITE_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(Blocks.WHITE_TERRACOTTA)));
    public static final Block ORANGE_TERRACOTTA_STAIRS = registerBlock("orange_terracotta_stairs",
            new StairsBlock(Blocks.ORANGE_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(Blocks.ORANGE_TERRACOTTA)));
    public static final Block MAGENTA_TERRACOTTA_STAIRS = registerBlock("magenta_terracotta_stairs",
            new StairsBlock(Blocks.MAGENTA_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(Blocks.MAGENTA_TERRACOTTA)));
    public static final Block LIGHT_BLUE_TERRACOTTA_STAIRS = registerBlock("light_blue_terracotta_stairs",
            new StairsBlock(Blocks.LIGHT_BLUE_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_TERRACOTTA)));
    public static final Block YELLOW_TERRACOTTA_STAIRS = registerBlock("yellow_terracotta_stairs",
            new StairsBlock(Blocks.YELLOW_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(Blocks.YELLOW_TERRACOTTA)));
    public static final Block LIME_TERRACOTTA_STAIRS = registerBlock("lime_terracotta_stairs",
            new StairsBlock(Blocks.LIME_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(Blocks.LIME_TERRACOTTA)));
    public static final Block PINK_TERRACOTTA_STAIRS = registerBlock("pink_terracotta_stairs",
            new StairsBlock(Blocks.PINK_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(Blocks.PINK_TERRACOTTA)));
    public static final Block GRAY_TERRACOTTA_STAIRS = registerBlock("gray_terracotta_stairs",
            new StairsBlock(Blocks.GRAY_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(Blocks.GRAY_TERRACOTTA)));
    public static final Block LIGHT_GRAY_TERRACOTTA_STAIRS = registerBlock("light_gray_terracotta_stairs",
            new StairsBlock(Blocks.LIGHT_GRAY_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_TERRACOTTA)));
    public static final Block CYAN_TERRACOTTA_STAIRS = registerBlock("cyan_terracotta_stairs",
            new StairsBlock(Blocks.CYAN_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(Blocks.CYAN_TERRACOTTA)));
    public static final Block PURPLE_TERRACOTTA_STAIRS = registerBlock("purple_terracotta_stairs",
            new StairsBlock(Blocks.PURPLE_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(Blocks.PURPLE_TERRACOTTA)));
    public static final Block BLUE_TERRACOTTA_STAIRS = registerBlock("blue_terracotta_stairs",
            new StairsBlock(Blocks.BLUE_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(Blocks.BLUE_TERRACOTTA)));
    public static final Block BROWN_TERRACOTTA_STAIRS = registerBlock("brown_terracotta_stairs",
            new StairsBlock(Blocks.BROWN_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(Blocks.BROWN_TERRACOTTA)));
    public static final Block GREEN_TERRACOTTA_STAIRS = registerBlock("green_terracotta_stairs",
            new StairsBlock(Blocks.GREEN_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(Blocks.GREEN_TERRACOTTA)));
    public static final Block RED_TERRACOTTA_STAIRS = registerBlock("red_terracotta_stairs",
            new StairsBlock(Blocks.RED_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(Blocks.RED_TERRACOTTA)));
    public static final Block BLACK_TERRACOTTA_STAIRS = registerBlock("black_terracotta_stairs",
            new StairsBlock(Blocks.BLACK_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(Blocks.BLACK_TERRACOTTA)));
    public static final Block TERRACOTTA_STAIRS = registerBlock("terracotta_stairs",
            new StairsBlock(Blocks.TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));
    public static final Block PACKED_ICE_STAIRS = registerBlock("packed_ice_stairs",
            new StairsBlock(Blocks.PACKED_ICE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.PACKED_ICE)));
    public static final Block CUT_RED_SANDSTONE_STAIRS = registerBlock("cut_red_sandstone_stairs",
            new StairsBlock(Blocks.CUT_RED_SANDSTONE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.CUT_RED_SANDSTONE)));
    public static final Block MAGMA_STAIRS = registerBlock("magma_stairs",
            new MagmaStairBlock(Blocks.MAGMA_BLOCK.getDefaultState(),FabricBlockSettings.copyOf(Blocks.MAGMA_BLOCK)));
    public static final Block WHITE_CONCRETE_STAIRS = registerBlock("white_concrete_stairs",
            new StairsBlock(Blocks.WHITE_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.WHITE_CONCRETE)));
    public static final Block ORANGE_CONCRETE_STAIRS = registerBlock("orange_concrete_stairs",
            new StairsBlock(Blocks.ORANGE_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.ORANGE_CONCRETE)));
    public static final Block MAGENTA_CONCRETE_STAIRS = registerBlock("magenta_concrete_stairs",
            new StairsBlock(Blocks.MAGENTA_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.MAGENTA_CONCRETE)));
    public static final Block LIGHT_BLUE_CONCRETE_STAIRS = registerBlock("light_blue_concrete_stairs",
            new StairsBlock(Blocks.LIGHT_BLUE_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_CONCRETE)));
    public static final Block YELLOW_CONCRETE_STAIRS = registerBlock("yellow_concrete_stairs",
            new StairsBlock(Blocks.YELLOW_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.YELLOW_CONCRETE)));
    public static final Block LIME_CONCRETE_STAIRS = registerBlock("lime_concrete_stairs",
            new StairsBlock(Blocks.LIME_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.LIME_CONCRETE)));
    public static final Block PINK_CONCRETE_STAIRS = registerBlock("pink_concrete_stairs",
            new StairsBlock(Blocks.PINK_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.PINK_CONCRETE)));
    public static final Block GRAY_CONCRETE_STAIRS = registerBlock("gray_concrete_stairs",
            new StairsBlock(Blocks.GRAY_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.GRAY_CONCRETE)));
    public static final Block LIGHT_GRAY_CONCRETE_STAIRS = registerBlock("light_gray_concrete_stairs",
            new StairsBlock(Blocks.LIGHT_GRAY_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_CONCRETE)));
    public static final Block CYAN_CONCRETE_STAIRS = registerBlock("cyan_concrete_stairs",
            new StairsBlock(Blocks.CYAN_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.CYAN_CONCRETE)));
    public static final Block PURPLE_CONCRETE_STAIRS = registerBlock("purple_concrete_stairs",
            new StairsBlock(Blocks.PURPLE_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.PURPLE_CONCRETE)));
    public static final Block BLUE_CONCRETE_STAIRS = registerBlock("blue_concrete_stairs",
            new StairsBlock(Blocks.BLUE_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.BLUE_CONCRETE)));
    public static final Block BROWN_CONCRETE_STAIRS = registerBlock("brown_concrete_stairs",
            new StairsBlock(Blocks.BROWN_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.BROWN_CONCRETE)));
    public static final Block GREEN_CONCRETE_STAIRS = registerBlock("green_concrete_stairs",
            new StairsBlock(Blocks.GREEN_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.GREEN_CONCRETE)));
    public static final Block RED_CONCRETE_STAIRS = registerBlock("red_concrete_stairs",
            new StairsBlock(Blocks.RED_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.RED_CONCRETE)));
    public static final Block BLACK_CONCRETE_STAIRS = registerBlock("black_concrete_stairs",
            new StairsBlock(Blocks.BLACK_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.BLACK_CONCRETE)));
    public static final Block BLUE_ICE_STAIRS = registerBlock("blue_ice_stairs",
            new StairsBlock(Blocks.BLUE_ICE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.BLUE_ICE)));

    public static final Block POLISHED_STONE_STAIRS = registerBlock("polished_stone_stairs",
            new StairsBlock(DecoBlocks.POLISHED_STONE.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.POLISHED_STONE)));
    public static final Block STONE_TILE_STAIRS = registerBlock("stone_tile_stairs",
            new StairsBlock(DecoBlocks.STONE_TILES.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.STONE_TILES)));
    public static final Block CACTUS_PLANK_STAIRS = registerBlock("cactus_plank_stairs",
            new StairsBlock(DecoBlocks.CACTUS_PLANKS.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.CACTUS_PLANKS)));
    public static final Block WOODEN_STAIRS = registerBlock("wooden_stairs",
            new StairsBlock(DecoBlocks.WOODEN_PLANKS.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.WOODEN_PLANKS)));
    public static final Block CUT_SANDSTONE_BRICK_STAIRS = registerBlock("cut_sandstone_brick_stairs",
            new StairsBlock(DecoBlocks.CUT_SANDSTONE_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.CUT_SANDSTONE_BRICKS)));
    public static final Block SMOOTH_PURPUR_STAIRS = registerBlock("smooth_purpur_stairs",
            new StairsBlock(DecoBlocks.SMOOTH_PURPUR.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.SMOOTH_PURPUR)));
    public static final Block SMOOTH_DEEPSLATE_STAIRS = registerBlock("smooth_deepslate_stairs",
            new StairsBlock(DecoBlocks.SMOOTH_DEEPSLATE.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.SMOOTH_DEEPSLATE)));
    public static final Block SMOOTH_BLACKSTONE_STAIRS = registerBlock("smooth_blackstone_stairs",
            new StairsBlock(DecoBlocks.SMOOTH_BLACKSTONE.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.SMOOTH_BLACKSTONE)));
    public static final Block OBSIDIAN_BRICK_STAIRS = registerBlock("obsidian_brick_stairs",
            new StairsBlock(DecoBlocks.OBSIDIAN_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.OBSIDIAN_BRICKS)));
    public static final Block PURPUR_BRICK_STAIRS = registerBlock("purpur_brick_stairs",
            new StairsBlock(DecoBlocks.PURPUR_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.PURPUR_BRICKS)));
    public static final Block SNOW_BRICK_STAIRS = registerBlock("snow_brick_stairs",
            new StairsBlock(DecoBlocks.SNOW_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.SNOW_BRICKS)));
    public static final Block VOID_STONE_STAIRS = registerBlock("void_stone_stairs",
            new StairsBlock(DecoBlocks.VOID_STONE.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.VOID_STONE)));
    public static final Block VOID_STONE_BRICK_STAIRS = registerBlock("void_stone_brick_stairs",
            new StairsBlock(DecoBlocks.VOID_STONE_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.VOID_STONE_BRICKS)));
    public static final Block WHITE_TERRACOTTA_BRICK_STAIRS = registerBlock("white_terracotta_brick_stairs",
            new StairsBlock(DecoBlocks.WHITE_TERRACOTTA_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.WHITE_TERRACOTTA_BRICKS)));
    public static final Block ORANGE_TERRACOTTA_BRICK_STAIRS = registerBlock("orange_terracotta_brick_stairs",
            new StairsBlock(DecoBlocks.ORANGE_TERRACOTTA_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.ORANGE_TERRACOTTA_BRICKS)));
    public static final Block MAGENTA_TERRACOTTA_BRICK_STAIRS = registerBlock("magenta_terracotta_brick_stairs",
            new StairsBlock(DecoBlocks.MAGENTA_TERRACOTTA_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.MAGENTA_TERRACOTTA_BRICKS)));
    public static final Block LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS = registerBlock("light_blue_terracotta_brick_stairs",
            new StairsBlock(DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS)));
    public static final Block YELLOW_TERRACOTTA_BRICK_STAIRS = registerBlock("yellow_terracotta_brick_stairs",
            new StairsBlock(DecoBlocks.YELLOW_TERRACOTTA_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.YELLOW_TERRACOTTA_BRICKS)));
    public static final Block LIME_TERRACOTTA_BRICK_STAIRS = registerBlock("lime_terracotta_brick_stairs",
            new StairsBlock(DecoBlocks.LIME_TERRACOTTA_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.LIME_TERRACOTTA_BRICKS)));
    public static final Block PINK_TERRACOTTA_BRICK_STAIRS = registerBlock("pink_terracotta_brick_stairs",
            new StairsBlock(DecoBlocks.PINK_TERRACOTTA_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.PINK_TERRACOTTA_BRICKS)));
    public static final Block GRAY_TERRACOTTA_BRICK_STAIRS = registerBlock("gray_terracotta_brick_stairs",
            new StairsBlock(DecoBlocks.GRAY_TERRACOTTA_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.GRAY_TERRACOTTA_BRICKS)));
    public static final Block LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS = registerBlock("light_gray_terracotta_brick_stairs",
            new StairsBlock(DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS)));
    public static final Block CYAN_TERRACOTTA_BRICK_STAIRS = registerBlock("cyan_terracotta_brick_stairs",
            new StairsBlock(DecoBlocks.CYAN_TERRACOTTA_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.CYAN_TERRACOTTA_BRICKS)));
    public static final Block PURPLE_TERRACOTTA_BRICK_STAIRS = registerBlock("purple_terracotta_brick_stairs",
            new StairsBlock(DecoBlocks.PURPLE_TERRACOTTA_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.PURPLE_TERRACOTTA_BRICKS)));
    public static final Block BLUE_TERRACOTTA_BRICK_STAIRS = registerBlock("blue_terracotta_brick_stairs",
            new StairsBlock(DecoBlocks.BLUE_TERRACOTTA_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.BLUE_TERRACOTTA_BRICKS)));
    public static final Block BROWN_TERRACOTTA_BRICK_STAIRS = registerBlock("brown_terracotta_brick_stairs",
            new StairsBlock(DecoBlocks.BROWN_TERRACOTTA_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.BROWN_TERRACOTTA_BRICKS)));
    public static final Block GREEN_TERRACOTTA_BRICK_STAIRS = registerBlock("green_terracotta_brick_stairs",
            new StairsBlock(DecoBlocks.GREEN_TERRACOTTA_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.GREEN_TERRACOTTA_BRICKS)));
    public static final Block RED_TERRACOTTA_BRICK_STAIRS = registerBlock("red_terracotta_brick_stairs",
            new StairsBlock(DecoBlocks.RED_TERRACOTTA_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.RED_TERRACOTTA_BRICKS)));
    public static final Block BLACK_TERRACOTTA_BRICK_STAIRS = registerBlock("black_terracotta_brick_stairs",
            new StairsBlock(DecoBlocks.BLACK_TERRACOTTA_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.BLACK_TERRACOTTA_BRICKS)));
    public static final Block TERRACOTTA_BRICK_STAIRS = registerBlock("terracotta_brick_stairs",
            new StairsBlock(DecoBlocks.TERRACOTTA_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.TERRACOTTA_BRICKS)));
    public static final Block SOUL_SOILSTONE_STAIRS = registerBlock("soul_soilstone_stairs",
            new StairsBlock(DecoBlocks.SOUL_SOILSTONE.getDefaultState(),
                    FabricBlockSettings.copyOf(DecoBlocks.SOUL_SOILSTONE)));
    public static final Block CUT_SOUL_SOILSTONE_STAIRS = registerBlock("cut_soul_soilstone_stairs",
            new StairsBlock(DecoBlocks.CUT_SOUL_SOILSTONE.getDefaultState(),
                    FabricBlockSettings.copyOf(DecoBlocks.CUT_SOUL_SOILSTONE)));
    public static final Block SMOOTH_SOUL_SOILSTONE_STAIRS = registerBlock("smooth_soul_soilstone_stairs",
            new StairsBlock(DecoBlocks.SMOOTH_SOUL_SOILSTONE.getDefaultState(),
                    FabricBlockSettings.copyOf(DecoBlocks.SMOOTH_SOUL_SOILSTONE)));
    public static final Block CUT_SOUL_SOILSTONE_BRICK_STAIRS = registerBlock("cut_soul_soilstone_brick_stairs",
            new StairsBlock(DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS)));
    public static final Block CUT_QUARTZ_STAIRS = registerBlock("cut_quartz_stairs",
            new StairsBlock(DecoBlocks.CUT_QUARTZ.getDefaultState(),
                    FabricBlockSettings.copyOf(DecoBlocks.CUT_QUARTZ)));
    public static final Block ICE_BRICK_STAIRS = registerBlock("ice_brick_stairs",
            new StairsBlock(DecoBlocks.ICE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(DecoBlocks.ICE_BRICKS)));
    public static final Block CUT_WHITE_CONCRETE_STAIRS = registerBlock("cut_white_concrete_stairs",
            new StairsBlock(DecoBlocks.CUT_WHITE_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.CUT_WHITE_CONCRETE)));
    public static final Block CUT_ORANGE_CONCRETE_STAIRS = registerBlock("cut_orange_concrete_stairs",
            new StairsBlock(DecoBlocks.CUT_ORANGE_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.CUT_ORANGE_CONCRETE)));
    public static final Block CUT_MAGENTA_CONCRETE_STAIRS = registerBlock("cut_magenta_concrete_stairs",
            new StairsBlock(DecoBlocks.CUT_MAGENTA_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.CUT_MAGENTA_CONCRETE)));
    public static final Block CUT_LIGHT_BLUE_CONCRETE_STAIRS = registerBlock("cut_light_blue_concrete_stairs",
            new StairsBlock(DecoBlocks.CUT_LIGHT_BLUE_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.CUT_LIGHT_BLUE_CONCRETE)));
    public static final Block CUT_YELLOW_CONCRETE_STAIRS = registerBlock("cut_yellow_concrete_stairs",
            new StairsBlock(DecoBlocks.CUT_YELLOW_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.CUT_YELLOW_CONCRETE)));
    public static final Block CUT_LIME_CONCRETE_STAIRS = registerBlock("cut_lime_concrete_stairs",
            new StairsBlock(DecoBlocks.CUT_LIME_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.CUT_LIME_CONCRETE)));
    public static final Block CUT_PINK_CONCRETE_STAIRS = registerBlock("cut_pink_concrete_stairs",
            new StairsBlock(DecoBlocks.CUT_PINK_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.CUT_PINK_CONCRETE)));
    public static final Block CUT_GRAY_CONCRETE_STAIRS = registerBlock("cut_gray_concrete_stairs",
            new StairsBlock(DecoBlocks.CUT_GRAY_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.CUT_GRAY_CONCRETE)));
    public static final Block CUT_LIGHT_GRAY_CONCRETE_STAIRS = registerBlock("cut_light_gray_concrete_stairs",
            new StairsBlock(DecoBlocks.CUT_LIGHT_GRAY_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.CUT_LIGHT_GRAY_CONCRETE)));
    public static final Block CUT_CYAN_CONCRETE_STAIRS = registerBlock("cut_cyan_concrete_stairs",
            new StairsBlock(DecoBlocks.CUT_CYAN_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.CUT_CYAN_CONCRETE)));
    public static final Block CUT_PURPLE_CONCRETE_STAIRS = registerBlock("cut_purple_concrete_stairs",
            new StairsBlock(DecoBlocks.CUT_PURPLE_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.CUT_PURPLE_CONCRETE)));
    public static final Block CUT_BLUE_CONCRETE_STAIRS = registerBlock("cut_blue_concrete_stairs",
            new StairsBlock(DecoBlocks.CUT_BLUE_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.CUT_BLUE_CONCRETE)));
    public static final Block CUT_BROWN_CONCRETE_STAIRS = registerBlock("cut_brown_concrete_stairs",
            new StairsBlock(DecoBlocks.CUT_BROWN_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.CUT_BROWN_CONCRETE)));
    public static final Block CUT_GREEN_CONCRETE_STAIRS = registerBlock("cut_green_concrete_stairs",
            new StairsBlock(DecoBlocks.CUT_GREEN_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.CUT_GREEN_CONCRETE)));
    public static final Block CUT_RED_CONCRETE_STAIRS = registerBlock("cut_red_concrete_stairs",
            new StairsBlock(DecoBlocks.CUT_RED_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.CUT_RED_CONCRETE)));
    public static final Block CUT_BLACK_CONCRETE_STAIRS = registerBlock("cut_black_concrete_stairs",
            new StairsBlock(DecoBlocks.CUT_BLACK_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.CUT_BLACK_CONCRETE)));
    public static final Block CRYSTALLIZED_PRISMARINE_STAIRS = registerBlock("crystallized_prismarine_stairs",
            new StairsBlock(DecoBlocks.CRYSTALLIZED_PRISMARINE.getDefaultState(),
                    FabricBlockSettings.copyOf(DecoBlocks.CRYSTALLIZED_PRISMARINE)));
    public static final Block CRYSTALLIZED_PRISMARINE_BRICK_STAIRS = registerBlock("crystallized_prismarine_brick_stairs",
            new StairsBlock(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS)));
    public static final Block LIGHT_PRISMARINE_STAIRS = registerBlock("light_prismarine_stairs",
            new StairsBlock(DecoBlocks.LIGHT_PRISMARINE.getDefaultState(),
                    FabricBlockSettings.copyOf(DecoBlocks.LIGHT_PRISMARINE)));
    public static final Block CUT_RED_SANDSTONE_BRICK_STAIRS = registerBlock("cut_red_sandstone_brick_stairs",
            new StairsBlock(DecoBlocks.CUT_RED_SANDSTONE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(DecoBlocks.CUT_RED_SANDSTONE_BRICKS)));
    public static final Block MAGMA_BRICK_STAIRS = registerBlock("magma_brick_stairs",
            new MagmaBrickStairBlock(DecoBlocks.MAGMA_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(DecoBlocks.MAGMA_BRICKS)));
    public static final Block BUBBLE_STAIRS = registerBlock("bubble_stairs",
            new BubbleStairBlock(DecoBlocks.BUBBLE_BLOCK.getDefaultState(),
                    FabricBlockSettings.copyOf(DecoBlocks.BUBBLE_BLOCK)));
    public static final Block BUBBLE_BRICK_STAIRS = registerBlock("bubble_brick_stairs",
            new BubbleStairBlock(DecoBlocks.BUBBLE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(DecoBlocks.BUBBLE_BRICKS)));
    public static final Block BLUE_NETHER_BRICK_STAIRS = registerBlock("blue_nether_brick_stairs",
            new StairsBlock(DecoBlocks.BLUE_NETHER_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(DecoBlocks.BLUE_NETHER_BRICKS)));
    public static final Block POLISHED_BLACKSTONE_TILE_STAIRS = registerBlock("polished_blackstone_tile_stairs",
            new StairsBlock(DecoBlocks.POLISHED_BLACKSTONE_TILES.getDefaultState(),
                    FabricBlockSettings.copyOf(DecoBlocks.POLISHED_BLACKSTONE_TILES)));

    public static final Block DEEPSLATE_SLAB = registerBlock("deepslate_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE)));
    public static final Block CALCITE_SLAB = registerBlock("calcite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.CALCITE)));
    public static final Block TUFF_SLAB = registerBlock("tuff_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TUFF)));
    public static final Block DRIPSTONE_SLAB = registerBlock("dripstone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)));
    public static final Block OBSIDIAN_SLAB = registerBlock("obsidian_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OBSIDIAN)));
    public static final Block SNOW_SLAB = registerBlock("snow_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.SNOW_BLOCK)));
    public static final Block NETHERRACK_SLAB = registerBlock("netherrack_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.NETHERRACK)));
    public static final Block PACKED_MUD_SLAB = registerBlock("packed_mud_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.PACKED_MUD)));
    public static final Block END_STONE_SLAB = registerBlock("end_stone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.END_STONE)));
    public static final Block QUARTZ_BRICK_SLAB = registerBlock("quartz_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BRICKS)));
    public static final Block WHITE_TERRACOTTA_SLAB = registerBlock("white_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.WHITE_TERRACOTTA)));
    public static final Block ORANGE_TERRACOTTA_SLAB = registerBlock("orange_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.ORANGE_TERRACOTTA)));
    public static final Block MAGENTA_TERRACOTTA_SLAB = registerBlock("magenta_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.MAGENTA_TERRACOTTA)));
    public static final Block LIGHT_BLUE_TERRACOTTA_SLAB = registerBlock("light_blue_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_TERRACOTTA)));
    public static final Block YELLOW_TERRACOTTA_SLAB = registerBlock("yellow_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.YELLOW_TERRACOTTA)));
    public static final Block LIME_TERRACOTTA_SLAB = registerBlock("lime_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.LIME_TERRACOTTA)));
    public static final Block PINK_TERRACOTTA_SLAB = registerBlock("pink_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.PINK_TERRACOTTA)));
    public static final Block GRAY_TERRACOTTA_SLAB = registerBlock("gray_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.GRAY_TERRACOTTA)));
    public static final Block LIGHT_GRAY_TERRACOTTA_SLAB = registerBlock("light_gray_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_TERRACOTTA)));
    public static final Block CYAN_TERRACOTTA_SLAB = registerBlock("cyan_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.CYAN_TERRACOTTA)));
    public static final Block PURPLE_TERRACOTTA_SLAB = registerBlock("purple_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.PURPLE_TERRACOTTA)));
    public static final Block BLUE_TERRACOTTA_SLAB = registerBlock("blue_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.BLUE_TERRACOTTA)));
    public static final Block BROWN_TERRACOTTA_SLAB = registerBlock("brown_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.BROWN_TERRACOTTA)));
    public static final Block GREEN_TERRACOTTA_SLAB = registerBlock("green_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.GREEN_TERRACOTTA)));
    public static final Block RED_TERRACOTTA_SLAB = registerBlock("red_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.RED_TERRACOTTA)));
    public static final Block BLACK_TERRACOTTA_SLAB = registerBlock("black_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.BLACK_TERRACOTTA)));
    public static final Block TERRACOTTA_SLAB = registerBlock("terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));
    public static final Block PACKED_ICE_SLAB = registerBlock("packed_ice_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.PACKED_ICE)));
    public static final Block MAGMA_SLAB = registerBlock("magma_slab",
            new MagmaSlabBlock(FabricBlockSettings.copyOf(Blocks.MAGMA_BLOCK)));
    public static final Block WHITE_CONCRETE_SLAB = registerBlock("white_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.WHITE_CONCRETE)));
    public static final Block ORANGE_CONCRETE_SLAB = registerBlock("orange_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.ORANGE_CONCRETE)));
    public static final Block MAGENTA_CONCRETE_SLAB = registerBlock("magenta_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.MAGENTA_CONCRETE)));
    public static final Block LIGHT_BLUE_CONCRETE_SLAB = registerBlock("light_blue_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_CONCRETE)));
    public static final Block YELLOW_CONCRETE_SLAB = registerBlock("yellow_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.YELLOW_CONCRETE)));
    public static final Block LIME_CONCRETE_SLAB = registerBlock("lime_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.LIME_CONCRETE)));
    public static final Block PINK_CONCRETE_SLAB = registerBlock("pink_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.PINK_CONCRETE)));
    public static final Block GRAY_CONCRETE_SLAB = registerBlock("gray_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.GRAY_CONCRETE)));
    public static final Block LIGHT_GRAY_CONCRETE_SLAB = registerBlock("light_gray_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_CONCRETE)));
    public static final Block CYAN_CONCRETE_SLAB = registerBlock("cyan_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.CYAN_CONCRETE)));
    public static final Block PURPLE_CONCRETE_SLAB = registerBlock("purple_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.PURPLE_CONCRETE)));
    public static final Block BLUE_CONCRETE_SLAB = registerBlock("blue_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.BLUE_CONCRETE)));
    public static final Block BROWN_CONCRETE_SLAB = registerBlock("brown_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.BROWN_CONCRETE)));
    public static final Block GREEN_CONCRETE_SLAB = registerBlock("green_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.GREEN_CONCRETE)));
    public static final Block RED_CONCRETE_SLAB = registerBlock("red_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.RED_CONCRETE)));
    public static final Block BLACK_CONCRETE_SLAB = registerBlock("black_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.BLACK_CONCRETE)));
    public static final Block BLUE_ICE_SLAB = registerBlock("blue_ice_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.BLUE_ICE)));

    public static final Block POLISHED_STONE_SLAB = registerBlock("polished_stone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.POLISHED_STONE)));
    public static final Block STONE_TILE_SLAB = registerBlock("stone_tile_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.STONE_TILES)));
    public static final Block CACTUS_PLANK_SLAB = registerBlock("cactus_plank_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CACTUS_PLANKS)));
    public static final Block WOODEN_SLAB = registerBlock("wooden_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.WOODEN_PLANKS)));
    public static final Block CUT_SANDSTONE_BRICK_SLAB = registerBlock("cut_sandstone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_SANDSTONE_BRICKS)));
    public static final Block SMOOTH_PURPUR_SLAB = registerBlock("smooth_purpur_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.SMOOTH_PURPUR)));
    public static final Block SMOOTH_DEEPSLATE_SLAB = registerBlock("smooth_deepslate_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.SMOOTH_DEEPSLATE)));
    public static final Block SMOOTH_BLACKSTONE_SLAB = registerBlock("smooth_blackstone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.SMOOTH_BLACKSTONE)));
    public static final Block OBSIDIAN_BRICK_SLAB = registerBlock("obsidian_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.OBSIDIAN_BRICKS)));
    public static final Block PURPUR_BRICK_SLAB = registerBlock("purpur_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.PURPUR_BRICKS)));
    public static final Block SNOW_BRICK_SLAB = registerBlock("snow_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.SNOW_BRICKS)));
    public static final Block VOID_STONE_SLAB = registerBlock("void_stone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.VOID_STONE)));
    public static final Block VOID_STONE_BRICK_SLAB = registerBlock("void_stone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.VOID_STONE_BRICKS)));
    public static final Block WHITE_TERRACOTTA_BRICK_SLAB = registerBlock("white_terracotta_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.WHITE_TERRACOTTA_BRICKS)));
    public static final Block ORANGE_TERRACOTTA_BRICK_SLAB = registerBlock("orange_terracotta_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.ORANGE_TERRACOTTA_BRICKS)));
    public static final Block MAGENTA_TERRACOTTA_BRICK_SLAB = registerBlock("magenta_terracotta_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.MAGENTA_TERRACOTTA_BRICKS)));
    public static final Block LIGHT_BLUE_TERRACOTTA_BRICK_SLAB = registerBlock("light_blue_terracotta_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS)));
    public static final Block YELLOW_TERRACOTTA_BRICK_SLAB = registerBlock("yellow_terracotta_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.YELLOW_TERRACOTTA_BRICKS)));
    public static final Block LIME_TERRACOTTA_BRICK_SLAB = registerBlock("lime_terracotta_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.LIME_TERRACOTTA_BRICKS)));
    public static final Block PINK_TERRACOTTA_BRICK_SLAB = registerBlock("pink_terracotta_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.PINK_TERRACOTTA_BRICKS)));
    public static final Block GRAY_TERRACOTTA_BRICK_SLAB = registerBlock("gray_terracotta_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.GRAY_TERRACOTTA_BRICKS)));
    public static final Block LIGHT_GRAY_TERRACOTTA_BRICK_SLAB = registerBlock("light_gray_terracotta_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS)));
    public static final Block CYAN_TERRACOTTA_BRICK_SLAB = registerBlock("cyan_terracotta_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CYAN_TERRACOTTA_BRICKS)));
    public static final Block PURPLE_TERRACOTTA_BRICK_SLAB = registerBlock("purple_terracotta_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.PURPLE_TERRACOTTA_BRICKS)));
    public static final Block BLUE_TERRACOTTA_BRICK_SLAB = registerBlock("blue_terracotta_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.BLUE_TERRACOTTA_BRICKS)));
    public static final Block BROWN_TERRACOTTA_BRICK_SLAB = registerBlock("brown_terracotta_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.BROWN_TERRACOTTA_BRICKS)));
    public static final Block GREEN_TERRACOTTA_BRICK_SLAB = registerBlock("green_terracotta_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.GREEN_TERRACOTTA_BRICKS)));
    public static final Block RED_TERRACOTTA_BRICK_SLAB = registerBlock("red_terracotta_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.RED_TERRACOTTA_BRICKS)));
    public static final Block BLACK_TERRACOTTA_BRICK_SLAB = registerBlock("black_terracotta_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.BLACK_TERRACOTTA_BRICKS)));
    public static final Block TERRACOTTA_BRICK_SLAB = registerBlock("terracotta_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.TERRACOTTA_BRICKS)));
    public static final Block SOUL_SOILSTONE_SLAB = registerBlock("soul_soilstone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.SOUL_SOILSTONE)));
    public static final Block CUT_SOUL_SOILSTONE_SLAB = registerBlock("cut_soul_soilstone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_SOUL_SOILSTONE)));
    public static final Block SMOOTH_SOUL_SOILSTONE_SLAB = registerBlock("smooth_soul_soilstone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.SMOOTH_SOUL_SOILSTONE)));
    public static final Block CUT_SOUL_SOILSTONE_BRICK_SLAB = registerBlock("cut_soul_soilstone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS)));
    public static final Block CUT_QUARTZ_SLAB = registerBlock("cut_quartz_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_QUARTZ)));
    public static final Block ICE_BRICK_SLAB = registerBlock("ice_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.ICE_BRICKS)));
    public static final Block CUT_WHITE_CONCRETE_SLAB = registerBlock("cut_white_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_WHITE_CONCRETE)));
    public static final Block CUT_ORANGE_CONCRETE_SLAB = registerBlock("cut_orange_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_ORANGE_CONCRETE)));
    public static final Block CUT_MAGENTA_CONCRETE_SLAB = registerBlock("cut_magenta_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_MAGENTA_CONCRETE)));
    public static final Block CUT_LIGHT_BLUE_CONCRETE_SLAB = registerBlock("cut_light_blue_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_LIGHT_BLUE_CONCRETE)));
    public static final Block CUT_YELLOW_CONCRETE_SLAB = registerBlock("cut_yellow_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_YELLOW_CONCRETE)));
    public static final Block CUT_LIME_CONCRETE_SLAB = registerBlock("cut_lime_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_LIME_CONCRETE)));
    public static final Block CUT_PINK_CONCRETE_SLAB = registerBlock("cut_pink_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_PINK_CONCRETE)));
    public static final Block CUT_GRAY_CONCRETE_SLAB = registerBlock("cut_gray_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_GRAY_CONCRETE)));
    public static final Block CUT_LIGHT_GRAY_CONCRETE_SLAB = registerBlock("cut_light_gray_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_LIGHT_GRAY_CONCRETE)));
    public static final Block CUT_CYAN_CONCRETE_SLAB = registerBlock("cut_cyan_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_CYAN_CONCRETE)));
    public static final Block CUT_PURPLE_CONCRETE_SLAB = registerBlock("cut_purple_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_PURPLE_CONCRETE)));
    public static final Block CUT_BLUE_CONCRETE_SLAB = registerBlock("cut_blue_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_BLUE_CONCRETE)));
    public static final Block CUT_BROWN_CONCRETE_SLAB = registerBlock("cut_brown_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_BROWN_CONCRETE)));
    public static final Block CUT_GREEN_CONCRETE_SLAB = registerBlock("cut_green_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_GREEN_CONCRETE)));
    public static final Block CUT_RED_CONCRETE_SLAB = registerBlock("cut_red_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_RED_CONCRETE)));
    public static final Block CUT_BLACK_CONCRETE_SLAB = registerBlock("cut_black_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_BLACK_CONCRETE)));
    public static final Block CRYSTALLIZED_PRISMARINE_SLAB = registerBlock("crystallized_prismarine_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CRYSTALLIZED_PRISMARINE)));
    public static final Block CRYSTALLIZED_PRISMARINE_BRICK_SLAB = registerBlock("crystallized_prismarine_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS)));
    public static final Block LIGHT_PRISMARINE_SLAB = registerBlock("light_prismarine_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.LIGHT_PRISMARINE)));
    public static final Block CUT_RED_SANDSTONE_BRICK_SLAB = registerBlock("cut_red_sandstone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_RED_SANDSTONE_BRICKS)));
    public static final Block MAGMA_BRICK_SLAB = registerBlock("magma_brick_slab",
            new MagmaBrickSlabBlock(FabricBlockSettings.copyOf(DecoBlocks.MAGMA_BRICKS)));
    public static final Block BUBBLE_SLAB = registerBlock("bubble_slab",
            new BubbleSlabBlock(FabricBlockSettings.copyOf(DecoBlocks.BUBBLE_BLOCK)));
    public static final Block BUBBLE_BRICK_SLAB = registerBlock("bubble_brick_slab",
            new BubbleSlabBlock(FabricBlockSettings.copyOf(DecoBlocks.BUBBLE_BRICKS)));
    public static final Block BLUE_NETHER_BRICK_SLAB = registerBlock("blue_nether_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.BLUE_NETHER_BRICKS)));
    public static final Block POLISHED_BLACKSTONE_TILE_SLAB = registerBlock("polished_blackstone_tile_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.POLISHED_BLACKSTONE_TILES)));

    public static final Block WOODEN_SAPLING = registerBlock("wooden_sapling",
            new SaplingBlock(new WoodenSaplingGenerator(),FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block POTTED_WOODEN_SAPLING = registerBlockWithoutItem("potted_wooden_sapling",
            new FlowerPotBlock(WOODEN_SAPLING,FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING)));

    public static final Block WOODEN_LEAVES = registerBlock("wooden_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.DARK_OAK_LEAVES)));

    public static final Block PUFFY_DANDELION = registerBlock("puffy_dandelion",
            new PuffyDandelionBlock(StatusEffects.SATURATION, 3,FabricBlockSettings.copyOf(Blocks.DANDELION)));
    public static final Block POTTED_PUFFY_DANDELION = registerBlockWithoutItem("potted_puffy_dandelion",
            new FlowerPotBlock(PUFFY_DANDELION,FabricBlockSettings.copyOf(Blocks.POTTED_DANDELION)));

    public static final Block CALIFORNIA_POPPY = registerBlock("california_poppy",
            new FlowerBlock(StatusEffects.NIGHT_VISION, 7,FabricBlockSettings.copyOf(Blocks.POPPY)));
    public static final Block POTTED_CALIFORNIA_POPPY = registerBlockWithoutItem("potted_california_poppy",
            new FlowerPotBlock(CALIFORNIA_POPPY,FabricBlockSettings.copyOf(Blocks.POTTED_POPPY)));
    public static final Block SALMON_POPPY = registerBlock("salmon_poppy",
            new FlowerBlock(StatusEffects.BLINDNESS, 5,FabricBlockSettings.copyOf(Blocks.POPPY)));
    public static final Block POTTED_SALMON_POPPY = registerBlockWithoutItem("potted_salmon_poppy",
            new FlowerPotBlock(SALMON_POPPY,FabricBlockSettings.copyOf(Blocks.POTTED_POPPY)));

    public static final Block YELLOW_ORCHID = registerBlock("yellow_orchid",
            new FlowerBlock(StatusEffects.SATURATION, 5,FabricBlockSettings.copyOf(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_YELLOW_ORCHID = registerBlockWithoutItem("potted_yellow_orchid",
            new FlowerPotBlock(YELLOW_ORCHID,FabricBlockSettings.copyOf(Blocks.POTTED_BLUE_ORCHID)));
    public static final Block WHITE_ORCHID = registerBlock("white_orchid",
            new FlowerBlock(StatusEffects.GLOWING, 5,FabricBlockSettings.copyOf(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_WHITE_ORCHID = registerBlockWithoutItem("potted_white_orchid",
            new FlowerPotBlock(WHITE_ORCHID,FabricBlockSettings.copyOf(Blocks.POTTED_BLUE_ORCHID)));
    public static final Block PINK_ORCHID = registerBlock("pink_orchid",
            new FlowerBlock(StatusEffects.SLOW_FALLING, 7,FabricBlockSettings.copyOf(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_PINK_ORCHID = registerBlockWithoutItem("potted_pink_orchid",
            new FlowerPotBlock(PINK_ORCHID,FabricBlockSettings.copyOf(Blocks.POTTED_BLUE_ORCHID)));

    public static final Block YELLOW_TULIP = registerBlock("yellow_tulip",
            new FlowerBlock(StatusEffects.WEAKNESS, 9,FabricBlockSettings.copyOf(Blocks.RED_TULIP)));
    public static final Block POTTED_YELLOW_TULIP = registerBlockWithoutItem("potted_yellow_tulip",
            new FlowerPotBlock(YELLOW_TULIP,FabricBlockSettings.copyOf(Blocks.POTTED_RED_TULIP)));
    public static final Block PURPLE_TULIP = registerBlock("purple_tulip",
            new FlowerBlock(StatusEffects.WEAKNESS, 9,FabricBlockSettings.copyOf(Blocks.RED_TULIP)));
    public static final Block POTTED_PURPLE_TULIP = registerBlockWithoutItem("potted_purple_tulip",
            new FlowerPotBlock(PURPLE_TULIP,FabricBlockSettings.copyOf(Blocks.POTTED_RED_TULIP)));
    public static final Block MAGENTA_TULIP = registerBlock("magenta_tulip",
            new FlowerBlock(StatusEffects.WEAKNESS, 9,FabricBlockSettings.copyOf(Blocks.RED_TULIP)));
    public static final Block POTTED_MAGENTA_TULIP = registerBlockWithoutItem("potted_magenta_tulip",
            new FlowerPotBlock(MAGENTA_TULIP,FabricBlockSettings.copyOf(Blocks.POTTED_RED_TULIP)));
    public static final Block BLUE_TULIP = registerBlock("blue_tulip",
            new FlowerBlock(StatusEffects.WEAKNESS, 9,FabricBlockSettings.copyOf(Blocks.RED_TULIP)));
    public static final Block POTTED_BLUE_TULIP = registerBlockWithoutItem("potted_blue_tulip",
            new FlowerPotBlock(BLUE_TULIP,FabricBlockSettings.copyOf(Blocks.POTTED_RED_TULIP)));

    public static final Block BLACK_TULIP = registerBlock("black_tulip",
            new FlowerBlock(StatusEffects.WEAKNESS, 18,FabricBlockSettings.copyOf(Blocks.RED_TULIP)));
    public static final Block POTTED_BLACK_TULIP = registerBlockWithoutItem("potted_black_tulip",
            new FlowerPotBlock(BLACK_TULIP,FabricBlockSettings.copyOf(Blocks.POTTED_RED_TULIP)));
    public static final Block GREEN_TULIP = registerBlock("green_tulip",
            new FlowerBlock(StatusEffects.WEAKNESS, 18,FabricBlockSettings.copyOf(Blocks.RED_TULIP)));
    public static final Block POTTED_GREEN_TULIP = registerBlockWithoutItem("potted_green_tulip",
            new FlowerPotBlock(GREEN_TULIP,FabricBlockSettings.copyOf(Blocks.POTTED_RED_TULIP)));
    public static final Block CYAN_TULIP = registerBlock("cyan_tulip",
            new FlowerBlock(StatusEffects.WEAKNESS, 18,FabricBlockSettings.copyOf(Blocks.RED_TULIP)));
    public static final Block POTTED_CYAN_TULIP = registerBlockWithoutItem("potted_cyan_tulip",
            new FlowerPotBlock(CYAN_TULIP,FabricBlockSettings.copyOf(Blocks.POTTED_RED_TULIP)));

    public static final Block BARBERTON_DAISY = registerBlock("barberton_daisy",
            new FlowerBlock(StatusEffects.INSTANT_HEALTH, 1,FabricBlockSettings.copyOf(Blocks.OXEYE_DAISY)));
    public static final Block POTTED_BARBERTON_DAISY = registerBlockWithoutItem("potted_barberton_daisy",
            new FlowerPotBlock(BARBERTON_DAISY,FabricBlockSettings.copyOf(Blocks.POTTED_OXEYE_DAISY)));
    public static final Block BLUE_EYED_DAISY = registerBlock("blue_eyed_daisy",
            new FlowerBlock(StatusEffects.NIGHT_VISION, 7,FabricBlockSettings.copyOf(Blocks.OXEYE_DAISY)));
    public static final Block POTTED_BLUE_EYED_DAISY = registerBlockWithoutItem("potted_blue_eyed_daisy",
            new FlowerPotBlock(BLUE_EYED_DAISY,FabricBlockSettings.copyOf(Blocks.POTTED_OXEYE_DAISY)));
    public static final Block GERBERA_DAISY = registerBlock("gerbera_daisy",
            new FlowerBlock(StatusEffects.REGENERATION, 5,FabricBlockSettings.copyOf(Blocks.OXEYE_DAISY)));
    public static final Block POTTED_GERBERA_DAISY = registerBlockWithoutItem("potted_gerbera_daisy",
            new FlowerPotBlock(GERBERA_DAISY,FabricBlockSettings.copyOf(Blocks.POTTED_OXEYE_DAISY)));
    public static final Block MICHAELMAS_DAISY = registerBlock("michaelmas_daisy",
            new FlowerBlock(StatusEffects.RESISTANCE, 7,FabricBlockSettings.copyOf(Blocks.OXEYE_DAISY)));
    public static final Block POTTED_MICHAELMAS_DAISY = registerBlockWithoutItem("potted_michaelmas_daisy",
            new FlowerPotBlock(MICHAELMAS_DAISY,FabricBlockSettings.copyOf(Blocks.POTTED_OXEYE_DAISY)));

    public static final Block PAEONIA = registerBlock("paeonia",
            new FlowerBlock(StatusEffects.SLOWNESS,7,FabricBlockSettings.copyOf(Blocks.POPPY)));
    public static final Block POTTED_PAEONIA = registerBlockWithoutItem("potted_paeonia",
            new FlowerPotBlock(PAEONIA,FabricBlockSettings.copyOf(Blocks.POTTED_POPPY)));

    public static final Block LAVENDER = registerBlock("lavender",
            new FlowerBlock(StatusEffects.HASTE,5,FabricBlockSettings.copyOf(Blocks.POPPY)));
    public static final Block POTTED_LAVENDER = registerBlockWithoutItem("potted_lavender",
            new FlowerPotBlock(LAVENDER,FabricBlockSettings.copyOf(Blocks.POTTED_POPPY)));

    public static final Block ROSE = registerBlock("rose",
            new FlowerBlock(StatusEffects.POISON, 4,FabricBlockSettings.copyOf(Blocks.POPPY)));
    public static final Block POTTED_ROSE = registerBlockWithoutItem("potted_rose",
            new FlowerPotBlock(ROSE,FabricBlockSettings.copyOf(Blocks.POTTED_POPPY)));
    public static final Block ENDER_ROSE = registerBlock("ender_rose",
            new EnderRoseBlock(StatusEffects.LEVITATION,FabricBlockSettings.copyOf(Blocks.POPPY)));
    public static final Block POTTED_ENDER_ROSE = registerBlockWithoutItem("potted_ender_rose",
            new FlowerPotBlock(ENDER_ROSE,FabricBlockSettings.copyOf(Blocks.POTTED_POPPY)));

    public static final Block SPRUCE_CRAFTING_TABLE = registerBlock("spruce_crafting_table",
            new SpruceCraftingTableBlock(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE).mapColor(MapColor.SPRUCE_BROWN)));
    public static final Block BIRCH_CRAFTING_TABLE = registerBlock("birch_crafting_table",
            new BirchCraftingTableBlock(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE).mapColor(MapColor.PALE_YELLOW)));
    public static final Block JUNGLE_CRAFTING_TABLE = registerBlock("jungle_crafting_table",
            new JungleCraftingTableBlock(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE).mapColor(MapColor.DIRT_BROWN)));
    public static final Block ACACIA_CRAFTING_TABLE = registerBlock("acacia_crafting_table",
            new AcaciaCraftingTableBlock(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE).mapColor(MapColor.GRAY)));
    public static final Block DARK_OAK_CRAFTING_TABLE = registerBlock("dark_oak_crafting_table",
            new DarkOakCraftingTableBlock(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE).mapColor(MapColor.BROWN)));
    public static final Block MANGROVE_CRAFTING_TABLE = registerBlock("mangrove_crafting_table",
            new MangroveCraftingTableBlock(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE).mapColor(MapColor.RED)));
    public static final Block CRIMSON_CRAFTING_TABLE = registerBlock("crimson_crafting_table",
            new CrimsonCraftingTableBlock(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE).mapColor(MapColor.DULL_PINK)
                    .sounds(BlockSoundGroup.NETHER_STEM)));
    public static final Block WARPED_CRAFTING_TABLE = registerBlock("warped_crafting_table",
            new WarpedCraftingTableBlock(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE).mapColor(MapColor.TEAL)
                    .sounds(BlockSoundGroup.NETHER_STEM)));
    public static final Block CACTUS_CRAFTING_TABLE = registerBlock("cactus_crafting_table",
            new CactusCraftingTableBlock(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE).mapColor(MapColor.DARK_GREEN)));
    public static final Block WOODEN_CRAFTING_TABLE = registerBlock("wooden_crafting_table",
            new WoodenCraftingTableBlock(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE).mapColor(MapColor.TERRACOTTA_BROWN)));

    public static final Block DEEPSLATE_FURNACE = registerBlock("deepslate_furnace",
            new DeepslateFurnaceBlock(FabricBlockSettings.copyOf(Blocks.FURNACE).mapColor(MapColor.DEEPSLATE_GRAY)
                    .strength(4.5f).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block BLACKSTONE_FURNACE = registerBlock("blackstone_furnace",
            new BlackstoneFurnaceBlock(FabricBlockSettings.copyOf(Blocks.FURNACE).mapColor(MapColor.BLACK)
                    .strength(3.0f)));

    public static final Block SPRUCE_LADDER = registerBlock("spruce_ladder",
            new LadderBlock(FabricBlockSettings.copyOf(Blocks.LADDER)));
    public static final Block BIRCH_LADDER = registerBlock("birch_ladder",
            new LadderBlock(FabricBlockSettings.copyOf(Blocks.LADDER)));
    public static final Block JUNGLE_LADDER = registerBlock("jungle_ladder",
            new LadderBlock(FabricBlockSettings.copyOf(Blocks.LADDER)));
    public static final Block ACACIA_LADDER = registerBlock("acacia_ladder",
            new LadderBlock(FabricBlockSettings.copyOf(Blocks.LADDER)));
    public static final Block DARK_OAK_LADDER = registerBlock("dark_oak_ladder",
            new LadderBlock(FabricBlockSettings.copyOf(Blocks.LADDER)));
    public static final Block MANGROVE_LADDER = registerBlock("mangrove_ladder",
            new LadderBlock(FabricBlockSettings.copyOf(Blocks.LADDER)));
    public static final Block CRIMSON_LADDER = registerBlock("crimson_ladder",
            new LadderBlock(FabricBlockSettings.copyOf(Blocks.LADDER)
                    .sounds(BlockSoundGroup.NETHER_STEM)));
    public static final Block WARPED_LADDER = registerBlock("warped_ladder",
            new LadderBlock(FabricBlockSettings.copyOf(Blocks.LADDER)
                    .sounds(BlockSoundGroup.NETHER_STEM)));
    public static final Block CACTUS_LADDER = registerBlock("cactus_ladder",
            new LadderBlock(FabricBlockSettings.copyOf(Blocks.LADDER)));
    public static final Block WOODEN_LADDER = registerBlock("wooden_ladder",
            new LadderBlock(FabricBlockSettings.copyOf(Blocks.LADDER)));

    public static final Block CACTUS_PLANK_FENCE = registerBlock("cactus_plank_fence",
            new FenceBlock(FabricBlockSettings.copyOf(DecoBlocks.CACTUS_PLANKS)));
    public static final Block WOODEN_FENCE = registerBlock("wooden_fence",
            new FenceBlock(FabricBlockSettings.copyOf(DecoBlocks.WOODEN_PLANKS)));
    public static final Block RED_NETHER_BRICK_FENCE = registerBlock("red_nether_brick_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.RED_NETHER_BRICKS)));
    public static final Block BLUE_NETHER_BRICK_FENCE = registerBlock("blue_nether_brick_fence",
            new FenceBlock(FabricBlockSettings.copyOf(DecoBlocks.BLUE_NETHER_BRICKS)));

    public static final Block LIGHT_IRON_BARS = registerBlock("light_iron_bars",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.IRON_BARS).strength(2.5f,6.0f))
            );

    public static final Block LIGHT_COPPER_BARS = registerBlock("light_copper_bars",
            new OxidizablePaneBlock(Oxidizable.OxidationLevel.UNAFFECTED,FabricBlockSettings.copyOf(DecoBlocks.LIGHT_IRON_BARS)
                    .sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_LIGHT_COPPER_BARS = registerBlock("waxed_light_copper_bars",
            new PaneBlock(FabricBlockSettings.copyOf(DecoBlocks.LIGHT_COPPER_BARS)));
    public static final Block EXPOSED_LIGHT_COPPER_BARS = registerBlock("exposed_light_copper_bars",
            new OxidizablePaneBlock(Oxidizable.OxidationLevel.EXPOSED,FabricBlockSettings.copyOf(DecoBlocks.LIGHT_IRON_BARS)
                    .sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_EXPOSED_LIGHT_COPPER_BARS = registerBlock("waxed_exposed_light_copper_bars",
            new PaneBlock(FabricBlockSettings.copyOf(DecoBlocks.EXPOSED_LIGHT_COPPER_BARS)));
    public static final Block WEATHERED_LIGHT_COPPER_BARS = registerBlock("weathered_light_copper_bars",
            new OxidizablePaneBlock(Oxidizable.OxidationLevel.WEATHERED,FabricBlockSettings.copyOf(DecoBlocks.LIGHT_IRON_BARS)
                    .sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_WEATHERED_LIGHT_COPPER_BARS = registerBlock("waxed_weathered_light_copper_bars",
            new PaneBlock(FabricBlockSettings.copyOf(DecoBlocks.WEATHERED_LIGHT_COPPER_BARS)));
    public static final Block OXIDIZED_LIGHT_COPPER_BARS = registerBlock("oxidized_light_copper_bars",
            new OxidizablePaneBlock(Oxidizable.OxidationLevel.OXIDIZED,FabricBlockSettings.copyOf(DecoBlocks.LIGHT_IRON_BARS)
                    .sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_OXIDIZED_LIGHT_COPPER_BARS = registerBlock("waxed_oxidized_light_copper_bars",
            new PaneBlock(FabricBlockSettings.copyOf(DecoBlocks.OXIDIZED_LIGHT_COPPER_BARS)));

    public static final Block COPPER_BARS = registerBlock("copper_bars",
            new OxidizablePaneBlock(Oxidizable.OxidationLevel.UNAFFECTED,FabricBlockSettings.copyOf(Blocks.IRON_BARS)
                    .sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_COPPER_BARS = registerBlock("waxed_copper_bars",
            new PaneBlock(FabricBlockSettings.copyOf(DecoBlocks.COPPER_BARS)));
    public static final Block EXPOSED_COPPER_BARS = registerBlock("exposed_copper_bars",
            new OxidizablePaneBlock(Oxidizable.OxidationLevel.EXPOSED,FabricBlockSettings.copyOf(Blocks.IRON_BARS)
                    .sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_EXPOSED_COPPER_BARS = registerBlock("waxed_exposed_copper_bars",
            new PaneBlock(FabricBlockSettings.copyOf(DecoBlocks.EXPOSED_COPPER_BARS)));
    public static final Block WEATHERED_COPPER_BARS = registerBlock("weathered_copper_bars",
            new OxidizablePaneBlock(Oxidizable.OxidationLevel.WEATHERED,FabricBlockSettings.copyOf(Blocks.IRON_BARS)
                    .sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_WEATHERED_COPPER_BARS = registerBlock("waxed_weathered_copper_bars",
            new PaneBlock(FabricBlockSettings.copyOf(DecoBlocks.WEATHERED_COPPER_BARS)));
    public static final Block OXIDIZED_COPPER_BARS = registerBlock("oxidized_copper_bars",
            new OxidizablePaneBlock(Oxidizable.OxidationLevel.OXIDIZED,FabricBlockSettings.copyOf(Blocks.IRON_BARS)
                    .sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_OXIDIZED_COPPER_BARS = registerBlock("waxed_oxidized_copper_bars",
            new PaneBlock(FabricBlockSettings.copyOf(DecoBlocks.OXIDIZED_COPPER_BARS)));

    public static final Block HEAVY_IRON_BARS = registerBlock("heavy_iron_bars",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.IRON_BARS).strength(10.0f,12.0f)
                    .mapColor(MapColor.IRON_GRAY)));

    public static final Block HEAVY_COPPER_BARS = registerBlock("heavy_copper_bars",
            new OxidizablePaneBlock(Oxidizable.OxidationLevel.UNAFFECTED,FabricBlockSettings.copyOf(DecoBlocks.HEAVY_IRON_BARS)
                    .mapColor(MapColor.ORANGE).sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_HEAVY_COPPER_BARS = registerBlock("waxed_heavy_copper_bars",
            new PaneBlock(FabricBlockSettings.copyOf(DecoBlocks.HEAVY_COPPER_BARS)));
    public static final Block EXPOSED_HEAVY_COPPER_BARS = registerBlock("exposed_heavy_copper_bars",
            new OxidizablePaneBlock(Oxidizable.OxidationLevel.EXPOSED,FabricBlockSettings.copyOf(DecoBlocks.HEAVY_IRON_BARS)
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_EXPOSED_HEAVY_COPPER_BARS = registerBlock("waxed_exposed_heavy_copper_bars",
            new PaneBlock(FabricBlockSettings.copyOf(DecoBlocks.EXPOSED_HEAVY_COPPER_BARS)));
    public static final Block WEATHERED_HEAVY_COPPER_BARS = registerBlock("weathered_heavy_copper_bars",
            new OxidizablePaneBlock(Oxidizable.OxidationLevel.WEATHERED,FabricBlockSettings.copyOf(DecoBlocks.HEAVY_IRON_BARS)
                    .mapColor(MapColor.DARK_AQUA).sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_WEATHERED_HEAVY_COPPER_BARS = registerBlock("waxed_weathered_heavy_copper_bars",
            new PaneBlock(FabricBlockSettings.copyOf(DecoBlocks.WEATHERED_HEAVY_COPPER_BARS)));
    public static final Block OXIDIZED_HEAVY_COPPER_BARS = registerBlock("oxidized_heavy_copper_bars",
            new OxidizablePaneBlock(Oxidizable.OxidationLevel.OXIDIZED,FabricBlockSettings.copyOf(DecoBlocks.HEAVY_IRON_BARS)
                    .mapColor(MapColor.DARK_AQUA).sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_OXIDIZED_HEAVY_COPPER_BARS = registerBlock("waxed_oxidized_heavy_copper_bars",
            new PaneBlock(FabricBlockSettings.copyOf(DecoBlocks.OXIDIZED_HEAVY_COPPER_BARS)));

    public static final Block COPPER_CHAIN = registerBlock("copper_chain",
            new OxidizableChainBlock(Oxidizable.OxidationLevel.UNAFFECTED,FabricBlockSettings.copyOf(Blocks.CHAIN)
                    .sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_COPPER_CHAIN = registerBlock("waxed_copper_chain",
            new ChainBlock(FabricBlockSettings.copyOf(DecoBlocks.COPPER_CHAIN)));
    public static final Block EXPOSED_COPPER_CHAIN = registerBlock("exposed_copper_chain",
            new OxidizableChainBlock(Oxidizable.OxidationLevel.EXPOSED,FabricBlockSettings.copyOf(Blocks.CHAIN)
                    .sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_EXPOSED_COPPER_CHAIN = registerBlock("waxed_exposed_copper_chain",
            new ChainBlock(FabricBlockSettings.copyOf(DecoBlocks.EXPOSED_COPPER_CHAIN)));
    public static final Block WEATHERED_COPPER_CHAIN = registerBlock("weathered_copper_chain",
            new OxidizableChainBlock(Oxidizable.OxidationLevel.WEATHERED,FabricBlockSettings.copyOf(Blocks.CHAIN)
                    .sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_WEATHERED_COPPER_CHAIN = registerBlock("waxed_weathered_copper_chain",
            new ChainBlock(FabricBlockSettings.copyOf(DecoBlocks.WEATHERED_COPPER_CHAIN)));
    public static final Block OXIDIZED_COPPER_CHAIN = registerBlock("oxidized_copper_chain",
            new OxidizableChainBlock(Oxidizable.OxidationLevel.OXIDIZED,FabricBlockSettings.copyOf(Blocks.CHAIN)
                    .sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_OXIDIZED_COPPER_CHAIN = registerBlock("waxed_oxidized_copper_chain",
            new ChainBlock(FabricBlockSettings.copyOf(DecoBlocks.OXIDIZED_COPPER_CHAIN)));

    public static final Block STONE_WALL = registerBlock("stone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block POLISHED_ANDESITE_WALL = registerBlock("polished_andesite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_ANDESITE)));
    public static final Block POLISHED_DIORITE_WALL = registerBlock("polished_diorite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_DIORITE)));
    public static final Block POLISHED_GRANITE_WALL = registerBlock("polished_granite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_GRANITE)));
    public static final Block DEEPSLATE_WALL = registerBlock("deepslate_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE)));
    public static final Block CALCITE_WALL = registerBlock("calcite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.CALCITE)));
    public static final Block TUFF_WALL = registerBlock("tuff_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TUFF)));
    public static final Block DRIPSTONE_WALL = registerBlock("dripstone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)));
    public static final Block CUT_SANDSTONE_WALL = registerBlock("cut_sandstone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.CUT_SANDSTONE)));
    public static final Block SMOOTH_QUARTZ_WALL = registerBlock("smooth_quartz_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_QUARTZ)));
    public static final Block SMOOTH_SANDSTONE_WALL = registerBlock("smooth_sandstone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_SANDSTONE)));
    public static final Block SMOOTH_RED_SANDSTONE_WALL = registerBlock("smooth_red_sandstone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_RED_SANDSTONE)));
    public static final Block SMOOTH_STONE_WALL = registerBlock("smooth_stone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE)));
    public static final Block OBSIDIAN_WALL = registerBlock("obsidian_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.OBSIDIAN)));
    public static final Block SNOW_WALL = registerBlock("snow_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.SNOW_BLOCK)));
    public static final Block NETHERRACK_WALL = registerBlock("netherrack_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.NETHERRACK)));
    public static final Block PRISMARINE_BRICK_WALL = registerBlock("prismarine_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.CUT_RED_SANDSTONE)));
    public static final Block DARK_PRISMARINE_WALL = registerBlock("dark_prismarine_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.CUT_RED_SANDSTONE)));
    public static final Block CUT_RED_SANDSTONE_WALL = registerBlock("cut_red_sandstone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.CUT_RED_SANDSTONE)));
    public static final Block PACKED_MUD_WALL = registerBlock("packed_mud_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.PACKED_MUD)));
    public static final Block END_STONE_WALL = registerBlock("end_stone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.END_STONE)));
    public static final Block QUARTZ_WALL = registerBlock("quartz_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK)));
    public static final Block QUARTZ_BRICK_WALL = registerBlock("quartz_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BRICKS)));
    public static final Block WHITE_TERRACOTTA_WALL = registerBlock("white_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.WHITE_TERRACOTTA)));
    public static final Block ORANGE_TERRACOTTA_WALL = registerBlock("orange_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.ORANGE_TERRACOTTA)));
    public static final Block MAGENTA_TERRACOTTA_WALL = registerBlock("magenta_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.MAGENTA_TERRACOTTA)));
    public static final Block LIGHT_BLUE_TERRACOTTA_WALL = registerBlock("light_blue_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_TERRACOTTA)));
    public static final Block YELLOW_TERRACOTTA_WALL = registerBlock("yellow_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.YELLOW_TERRACOTTA)));
    public static final Block LIME_TERRACOTTA_WALL = registerBlock("lime_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.LIME_TERRACOTTA)));
    public static final Block PINK_TERRACOTTA_WALL = registerBlock("pink_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.PINK_TERRACOTTA)));
    public static final Block GRAY_TERRACOTTA_WALL = registerBlock("gray_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.GRAY_TERRACOTTA)));
    public static final Block LIGHT_GRAY_TERRACOTTA_WALL = registerBlock("light_gray_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_TERRACOTTA)));
    public static final Block CYAN_TERRACOTTA_WALL = registerBlock("cyan_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.CYAN_TERRACOTTA)));
    public static final Block PURPLE_TERRACOTTA_WALL = registerBlock("purple_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.PURPLE_TERRACOTTA)));
    public static final Block BLUE_TERRACOTTA_WALL = registerBlock("blue_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.BLUE_TERRACOTTA)));
    public static final Block BROWN_TERRACOTTA_WALL = registerBlock("brown_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.BROWN_TERRACOTTA)));
    public static final Block GREEN_TERRACOTTA_WALL = registerBlock("green_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.GREEN_TERRACOTTA)));
    public static final Block RED_TERRACOTTA_WALL = registerBlock("red_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.RED_TERRACOTTA)));
    public static final Block BLACK_TERRACOTTA_WALL = registerBlock("black_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.BLACK_TERRACOTTA)));
    public static final Block TERRACOTTA_WALL = registerBlock("terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));
    public static final Block PACKED_ICE_WALL = registerBlock("packed_ice_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.PACKED_ICE)));
    public static final Block MAGMA_WALL = registerBlock("magma_wall",
            new MagmaWallBlock(FabricBlockSettings.copyOf(Blocks.MAGMA_BLOCK)));
    public static final Block WHITE_CONCRETE_WALL = registerBlock("white_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.WHITE_CONCRETE)));
    public static final Block ORANGE_CONCRETE_WALL = registerBlock("orange_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.ORANGE_CONCRETE)));
    public static final Block MAGENTA_CONCRETE_WALL = registerBlock("magenta_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.MAGENTA_CONCRETE)));
    public static final Block LIGHT_BLUE_CONCRETE_WALL = registerBlock("light_blue_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_CONCRETE)));
    public static final Block YELLOW_CONCRETE_WALL = registerBlock("yellow_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.YELLOW_CONCRETE)));
    public static final Block LIME_CONCRETE_WALL = registerBlock("lime_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.LIME_CONCRETE)));
    public static final Block PINK_CONCRETE_WALL = registerBlock("pink_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.PINK_CONCRETE)));
    public static final Block GRAY_CONCRETE_WALL = registerBlock("gray_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.GRAY_CONCRETE)));
    public static final Block LIGHT_GRAY_CONCRETE_WALL = registerBlock("light_gray_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_CONCRETE)));
    public static final Block CYAN_CONCRETE_WALL = registerBlock("cyan_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.CYAN_CONCRETE)));
    public static final Block PURPLE_CONCRETE_WALL = registerBlock("purple_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.PURPLE_CONCRETE)));
    public static final Block BLUE_CONCRETE_WALL = registerBlock("blue_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.BLUE_CONCRETE)));
    public static final Block BROWN_CONCRETE_WALL = registerBlock("brown_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.BROWN_CONCRETE)));
    public static final Block GREEN_CONCRETE_WALL = registerBlock("green_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.GREEN_CONCRETE)));
    public static final Block RED_CONCRETE_WALL = registerBlock("red_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.RED_CONCRETE)));
    public static final Block BLACK_CONCRETE_WALL = registerBlock("black_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.BLACK_CONCRETE)));
    public static final Block BLUE_ICE_WALL = registerBlock("blue_ice_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.BLUE_ICE)));

    public static final Block POLISHED_STONE_WALL = registerBlock("polished_stone_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.POLISHED_STONE)));
    public static final Block STONE_TILE_WALL = registerBlock("stone_tile_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.STONE_TILES)));
    public static final Block CUT_SANDSTONE_BRICK_WALL = registerBlock("cut_sandstone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_SANDSTONE_BRICKS)));
    public static final Block SMOOTH_PURPUR_WALL = registerBlock("smooth_purpur_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.SMOOTH_PURPUR)));
    public static final Block SMOOTH_DEEPSLATE_WALL = registerBlock("smooth_deepslate_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.SMOOTH_DEEPSLATE)));
    public static final Block SMOOTH_BLACKSTONE_WALL = registerBlock("smooth_blackstone_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.SMOOTH_BLACKSTONE)));
    public static final Block OBSIDIAN_BRICK_WALL = registerBlock("obsidian_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.OBSIDIAN_BRICKS)));
    public static final Block PURPUR_BRICK_WALL = registerBlock("purpur_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.PURPUR_BRICKS)));
    public static final Block SNOW_BRICK_WALL = registerBlock("snow_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.SNOW_BRICKS)));
    public static final Block VOID_STONE_WALL = registerBlock("void_stone_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.VOID_STONE)));
    public static final Block VOID_STONE_BRICK_WALL = registerBlock("void_stone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.VOID_STONE_BRICKS)));
    public static final Block WHITE_TERRACOTTA_BRICK_WALL = registerBlock("white_terracotta_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.WHITE_TERRACOTTA_BRICKS)));
    public static final Block ORANGE_TERRACOTTA_BRICK_WALL = registerBlock("orange_terracotta_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.ORANGE_TERRACOTTA_BRICKS)));
    public static final Block MAGENTA_TERRACOTTA_BRICK_WALL = registerBlock("magenta_terracotta_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.MAGENTA_TERRACOTTA_BRICKS)));
    public static final Block LIGHT_BLUE_TERRACOTTA_BRICK_WALL = registerBlock("light_blue_terracotta_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS)));
    public static final Block YELLOW_TERRACOTTA_BRICK_WALL = registerBlock("yellow_terracotta_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.YELLOW_TERRACOTTA_BRICKS)));
    public static final Block LIME_TERRACOTTA_BRICK_WALL = registerBlock("lime_terracotta_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.LIME_TERRACOTTA_BRICKS)));
    public static final Block PINK_TERRACOTTA_BRICK_WALL = registerBlock("pink_terracotta_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.PINK_TERRACOTTA_BRICKS)));
    public static final Block GRAY_TERRACOTTA_BRICK_WALL = registerBlock("gray_terracotta_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.GRAY_TERRACOTTA_BRICKS)));
    public static final Block LIGHT_GRAY_TERRACOTTA_BRICK_WALL = registerBlock("light_gray_terracotta_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS)));
    public static final Block CYAN_TERRACOTTA_BRICK_WALL = registerBlock("cyan_terracotta_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.CYAN_TERRACOTTA_BRICKS)));
    public static final Block PURPLE_TERRACOTTA_BRICK_WALL = registerBlock("purple_terracotta_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.PURPLE_TERRACOTTA_BRICKS)));
    public static final Block BLUE_TERRACOTTA_BRICK_WALL = registerBlock("blue_terracotta_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.BLUE_TERRACOTTA_BRICKS)));
    public static final Block BROWN_TERRACOTTA_BRICK_WALL = registerBlock("brown_terracotta_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.BROWN_TERRACOTTA_BRICKS)));
    public static final Block GREEN_TERRACOTTA_BRICK_WALL = registerBlock("green_terracotta_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.GREEN_TERRACOTTA_BRICKS)));
    public static final Block RED_TERRACOTTA_BRICK_WALL = registerBlock("red_terracotta_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.RED_TERRACOTTA_BRICKS)));
    public static final Block BLACK_TERRACOTTA_BRICK_WALL = registerBlock("black_terracotta_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.BLACK_TERRACOTTA_BRICKS)));
    public static final Block TERRACOTTA_BRICK_WALL = registerBlock("terracotta_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.TERRACOTTA_BRICKS)));
    public static final Block SOUL_SOILSTONE_WALL = registerBlock("soul_soilstone_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.SOUL_SOILSTONE)));
    public static final Block CUT_SOUL_SOILSTONE_WALL = registerBlock("cut_soul_soilstone_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_SOUL_SOILSTONE)));
    public static final Block SMOOTH_SOUL_SOILSTONE_WALL = registerBlock("smooth_soul_soilstone_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.SMOOTH_SOUL_SOILSTONE)));
    public static final Block CUT_SOUL_SOILSTONE_BRICK_WALL = registerBlock("cut_soul_soilstone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS)));
    public static final Block CUT_QUARTZ_WALL = registerBlock("cut_quartz_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_QUARTZ)));
    public static final Block ICE_BRICK_WALL = registerBlock("ice_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.ICE_BRICKS)));
    public static final Block CUT_WHITE_CONCRETE_WALL = registerBlock("cut_white_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_WHITE_CONCRETE)));
    public static final Block CUT_ORANGE_CONCRETE_WALL = registerBlock("cut_orange_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_ORANGE_CONCRETE)));
    public static final Block CUT_MAGENTA_CONCRETE_WALL = registerBlock("cut_magenta_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_MAGENTA_CONCRETE)));
    public static final Block CUT_LIGHT_BLUE_CONCRETE_WALL = registerBlock("cut_light_blue_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_LIGHT_BLUE_CONCRETE)));
    public static final Block CUT_YELLOW_CONCRETE_WALL = registerBlock("cut_yellow_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_YELLOW_CONCRETE)));
    public static final Block CUT_LIME_CONCRETE_WALL = registerBlock("cut_lime_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_LIME_CONCRETE)));
    public static final Block CUT_PINK_CONCRETE_WALL = registerBlock("cut_pink_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_PINK_CONCRETE)));
    public static final Block CUT_GRAY_CONCRETE_WALL = registerBlock("cut_gray_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_GRAY_CONCRETE)));
    public static final Block CUT_LIGHT_GRAY_CONCRETE_WALL = registerBlock("cut_light_gray_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_LIGHT_GRAY_CONCRETE)));
    public static final Block CUT_CYAN_CONCRETE_WALL = registerBlock("cut_cyan_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_CYAN_CONCRETE)));
    public static final Block CUT_PURPLE_CONCRETE_WALL = registerBlock("cut_purple_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_PURPLE_CONCRETE)));
    public static final Block CUT_BLUE_CONCRETE_WALL = registerBlock("cut_blue_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_BLUE_CONCRETE)));
    public static final Block CUT_BROWN_CONCRETE_WALL = registerBlock("cut_brown_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_BROWN_CONCRETE)));
    public static final Block CUT_GREEN_CONCRETE_WALL = registerBlock("cut_green_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_GREEN_CONCRETE)));
    public static final Block CUT_RED_CONCRETE_WALL = registerBlock("cut_red_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_RED_CONCRETE)));
    public static final Block CUT_BLACK_CONCRETE_WALL = registerBlock("cut_black_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_BLACK_CONCRETE)));
    public static final Block CRYSTALLIZED_PRISMARINE_WALL = registerBlock("crystallized_prismarine_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.CRYSTALLIZED_PRISMARINE)));
    public static final Block CRYSTALLIZED_PRISMARINE_BRICK_WALL = registerBlock("crystallized_prismarine_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS)));
    public static final Block LIGHT_PRISMARINE_WALL = registerBlock("light_prismarine_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.LIGHT_PRISMARINE)));
    public static final Block CUT_RED_SANDSTONE_BRICK_WALL = registerBlock("cut_red_sandstone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_RED_SANDSTONE_BRICKS)));
    public static final Block MAGMA_BRICK_WALL = registerBlock("magma_brick_wall",
            new MagmaBrickWallBlock(FabricBlockSettings.copyOf(DecoBlocks.MAGMA_BRICKS)));
    public static final Block BUBBLE_WALL = registerBlock("bubble_wall",
            new BubbleWallBlock(FabricBlockSettings.copyOf(DecoBlocks.BUBBLE_BLOCK)));
    public static final Block BUBBLE_BRICK_WALL = registerBlock("bubble_brick_wall",
            new BubbleWallBlock(FabricBlockSettings.copyOf(DecoBlocks.BUBBLE_BRICKS)));
    public static final Block BLUE_NETHER_BRICK_WALL = registerBlock("blue_nether_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.BLUE_NETHER_BRICKS)));
    public static final Block POLISHED_BLACKSTONE_TILE_WALL = registerBlock("polished_blackstone_tile_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.POLISHED_BLACKSTONE_TILES)));

    public static final Block RED_SUNFLOWER = registerBlock("red_sunflower",
            new TallFlowerBlock(FabricBlockSettings.copyOf(Blocks.SUNFLOWER)));
    public static final Block NOVA_STARFLOWER = registerBlock("nova_starflower",
            new NovaStarflowerBlock(FabricBlockSettings.copyOf(Blocks.SUNFLOWER)));

    public static final Block WITHER_ROSE_BUSH = registerBlock("wither_rose_bush",
            new WitherRoseBushBlock(FabricBlockSettings.copyOf(Blocks.ROSE_BUSH)));
    public static final Block ENDER_ROSE_BUSH = registerBlock("ender_rose_bush",
            new EnderRoseBushBlock(FabricBlockSettings.copyOf(Blocks.ROSE_BUSH)));

    public static final Block TINTED_GLASS_PANE = registerBlock("tinted_glass_pane",
            new TintedGlassPaneBlock(FabricBlockSettings.copyOf(Blocks.BLACK_STAINED_GLASS_PANE).nonOpaque()));
    public static final Block HARDENED_GLASS_PANE = registerBlock("hardened_glass_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.GLASS_PANE).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()));
    public static final Block HARDENED_TINTED_GLASS_PANE = registerBlock("hardened_tinted_glass_pane",
            new PaneBlock(FabricBlockSettings.copyOf(DecoBlocks.TINTED_GLASS_PANE).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()));
    public static final Block HARDENED_WHITE_STAINED_GLASS_PANE = registerBlock("hardened_white_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.WHITE,FabricBlockSettings.copyOf(Blocks.WHITE_STAINED_GLASS_PANE).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()));
    public static final Block HARDENED_ORANGE_STAINED_GLASS_PANE = registerBlock("hardened_orange_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.ORANGE,FabricBlockSettings.copyOf(Blocks.ORANGE_STAINED_GLASS_PANE).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()));
    public static final Block HARDENED_MAGENTA_STAINED_GLASS_PANE = registerBlock("hardened_magenta_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.MAGENTA,FabricBlockSettings.copyOf(Blocks.MAGENTA_STAINED_GLASS_PANE).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()));
    public static final Block HARDENED_LIGHT_BLUE_STAINED_GLASS_PANE = registerBlock("hardened_light_blue_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.LIGHT_BLUE, FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_STAINED_GLASS_PANE).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()));
    public static final Block HARDENED_YELLOW_STAINED_GLASS_PANE = registerBlock("hardened_yellow_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.YELLOW, FabricBlockSettings.copyOf(Blocks.YELLOW_STAINED_GLASS_PANE).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()));
    public static final Block HARDENED_LIME_STAINED_GLASS_PANE = registerBlock("hardened_lime_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.LIME, FabricBlockSettings.copyOf(Blocks.LIME_STAINED_GLASS_PANE).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()));
    public static final Block HARDENED_PINK_STAINED_GLASS_PANE = registerBlock("hardened_pink_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.PINK, FabricBlockSettings.copyOf(Blocks.PINK_STAINED_GLASS_PANE).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()));
    public static final Block HARDENED_GRAY_STAINED_GLASS_PANE = registerBlock("hardened_gray_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.GRAY, FabricBlockSettings.copyOf(Blocks.GRAY_STAINED_GLASS_PANE).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()));
    public static final Block HARDENED_LIGHT_GRAY_STAINED_GLASS_PANE = registerBlock("hardened_light_gray_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.LIGHT_GRAY, FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_STAINED_GLASS_PANE).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()));
    public static final Block HARDENED_CYAN_STAINED_GLASS_PANE = registerBlock("hardened_cyan_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.CYAN, FabricBlockSettings.copyOf(Blocks.CYAN_STAINED_GLASS_PANE).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()));
    public static final Block HARDENED_PURPLE_STAINED_GLASS_PANE = registerBlock("hardened_purple_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.PURPLE, FabricBlockSettings.copyOf(Blocks.PURPLE_STAINED_GLASS_PANE).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()));
    public static final Block HARDENED_BLUE_STAINED_GLASS_PANE = registerBlock("hardened_blue_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.BLUE, FabricBlockSettings.copyOf(Blocks.BLUE_STAINED_GLASS_PANE).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()));
    public static final Block HARDENED_BROWN_STAINED_GLASS_PANE = registerBlock("hardened_brown_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.BROWN, FabricBlockSettings.copyOf(Blocks.BROWN_STAINED_GLASS_PANE).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()));
    public static final Block HARDENED_GREEN_STAINED_GLASS_PANE = registerBlock("hardened_green_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.GREEN, FabricBlockSettings.copyOf(Blocks.GREEN_STAINED_GLASS_PANE).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()));
    public static final Block HARDENED_RED_STAINED_GLASS_PANE = registerBlock("hardened_red_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.RED, FabricBlockSettings.copyOf(Blocks.RED_STAINED_GLASS_PANE).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()));
    public static final Block HARDENED_BLACK_STAINED_GLASS_PANE = registerBlock("hardened_black_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.BLACK, FabricBlockSettings.copyOf(Blocks.BLACK_STAINED_GLASS_PANE).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()));

    public static final Block OAK_BARREL = registerBlock("oak_barrel",
            new BarrelBlock(FabricBlockSettings.copyOf(Blocks.BARREL).mapColor(MapColor.OAK_TAN)));
    public static final Block SPRUCE_BARREL = registerBlock("spruce_barrel",
            new BarrelBlock(FabricBlockSettings.copyOf(Blocks.BARREL)));
    public static final Block BIRCH_BARREL = registerBlock("birch_barrel",
            new BarrelBlock(FabricBlockSettings.copyOf(Blocks.BARREL).mapColor(MapColor.PALE_YELLOW)));
    public static final Block JUNGLE_BARREL = registerBlock("jungle_barrel",
            new BarrelBlock(FabricBlockSettings.copyOf(Blocks.BARREL).mapColor(MapColor.DIRT_BROWN)));
    public static final Block ACACIA_BARREL = registerBlock("acacia_barrel",
            new BarrelBlock(FabricBlockSettings.copyOf(Blocks.BARREL).mapColor(MapColor.ORANGE)));
    public static final Block DARK_OAK_BARREL = registerBlock("dark_oak_barrel",
            new BarrelBlock(FabricBlockSettings.copyOf(Blocks.BARREL).mapColor(MapColor.BROWN)));
    public static final Block MANGROVE_BARREL = registerBlock("mangrove_barrel",
            new BarrelBlock(FabricBlockSettings.copyOf(Blocks.BARREL).mapColor(MapColor.RED)));
    public static final Block CRIMSON_BARREL = registerBlock("crimson_barrel",
            new BarrelBlock(FabricBlockSettings.copyOf(Blocks.BARREL).mapColor(MapColor.DULL_PINK)
                    .sounds(BlockSoundGroup.NETHER_STEM)));
    public static final Block WARPED_BARREL = registerBlock("warped_barrel",
            new BarrelBlock(FabricBlockSettings.copyOf(Blocks.BARREL).mapColor(MapColor.DARK_AQUA)
                    .sounds(BlockSoundGroup.NETHER_STEM)));
    public static final Block CACTUS_BARREL = registerBlock("cactus_barrel",
            new BarrelBlock(FabricBlockSettings.copyOf(Blocks.BARREL).mapColor(MapColor.PALE_GREEN)));

    public static final Block DEEPSLATE_SMOKER = registerBlock("deepslate_smoker",
            new DeepslateSmokerBlock(FabricBlockSettings.copyOf(Blocks.SMOKER).mapColor(MapColor.DEEPSLATE_GRAY)
                    .strength(4.5f).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block BLACKSTONE_SMOKER = registerBlock("blackstone_smoker",
            new BlackstoneSmokerBlock(FabricBlockSettings.copyOf(Blocks.SMOKER).mapColor(MapColor.BLACK)
                    .strength(3.0f)));

    public static final Block DEEPSLATE_BLAST_FURNACE = registerBlock("deepslate_blast_furnace",
            new DeepslateBlastFurnaceBlock(FabricBlockSettings.copyOf(Blocks.BLAST_FURNACE).mapColor(MapColor.DEEPSLATE_GRAY)
                    .strength(4.5f).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block BLACKSTONE_BLAST_FURNACE = registerBlock("blackstone_blast_furnace",
            new BlackstoneBlastFurnaceBlock(FabricBlockSettings.copyOf(Blocks.BLAST_FURNACE).mapColor(MapColor.BLACK)
                    .strength(3.0f)));

    public static final Block OAK_CARTOGRAPHY_TABLE = registerBlock("oak_cartography_table",
            new OakCartographyTableBlock(FabricBlockSettings.copyOf(Blocks.CARTOGRAPHY_TABLE)));
    public static final Block BIRCH_CARTOGRAPHY_TABLE = registerBlock("birch_cartography_table",
            new BirchCartographyTableBlock(FabricBlockSettings.copyOf(Blocks.CARTOGRAPHY_TABLE)));
    public static final Block SPRUCE_CARTOGRAPHY_TABLE = registerBlock("spruce_cartography_table",
            new SpruceCartographyTableBlock(FabricBlockSettings.copyOf(Blocks.CARTOGRAPHY_TABLE)));
    public static final Block JUNGLE_CARTOGRAPHY_TABLE = registerBlock("jungle_cartography_table",
            new JungleCartographyTableBlock(FabricBlockSettings.copyOf(Blocks.CARTOGRAPHY_TABLE)));
    public static final Block ACACIA_CARTOGRAPHY_TABLE = registerBlock("acacia_cartography_table",
            new AcaciaCartographyTableBlock(FabricBlockSettings.copyOf(Blocks.CARTOGRAPHY_TABLE)));
    public static final Block DARK_OAK_CARTOGRAPHY_TABLE = registerBlock("dark_oak_cartography_table",
            new DarkOakCartographyTableBlock(FabricBlockSettings.copyOf(Blocks.CARTOGRAPHY_TABLE)));
    public static final Block MANGROVE_CARTOGRAPHY_TABLE = registerBlock("mangrove_cartography_table",
            new MangroveCartographyTableBlock(FabricBlockSettings.copyOf(Blocks.CARTOGRAPHY_TABLE)));
    public static final Block CRIMSON_CARTOGRAPHY_TABLE = registerBlock("crimson_cartography_table",
            new CrimsonCartographyTableBlock(FabricBlockSettings.copyOf(Blocks.CARTOGRAPHY_TABLE)
                    .sounds(BlockSoundGroup.NETHER_STEM)));
    public static final Block WARPED_CARTOGRAPHY_TABLE = registerBlock("warped_cartography_table",
            new WarpedCartographyTableBlock(FabricBlockSettings.copyOf(Blocks.CARTOGRAPHY_TABLE)
                    .sounds(BlockSoundGroup.NETHER_STEM)));
    public static final Block CACTUS_CARTOGRAPHY_TABLE = registerBlock("cactus_cartography_table",
            new CactusCartographyTableBlock(FabricBlockSettings.copyOf(Blocks.CARTOGRAPHY_TABLE)));

    public static final Block OAK_SMITHING_TABLE = registerBlock("oak_smithing_table",
            new OakSmithingTableBlock(FabricBlockSettings.copyOf(Blocks.SMITHING_TABLE)));
    public static final Block SPRUCE_SMITHING_TABLE = registerBlock("spruce_smithing_table",
            new SpruceSmithingTableBlock(FabricBlockSettings.copyOf(Blocks.SMITHING_TABLE)));
    public static final Block BIRCH_SMITHING_TABLE = registerBlock("birch_smithing_table",
            new BirchSmithingTableBlock(FabricBlockSettings.copyOf(Blocks.SMITHING_TABLE)));
    public static final Block JUNGLE_SMITHING_TABLE = registerBlock("jungle_smithing_table",
            new JungleSmithingTableBlock(FabricBlockSettings.copyOf(Blocks.SMITHING_TABLE)));
    public static final Block ACACIA_SMITHING_TABLE = registerBlock("acacia_smithing_table",
            new AcaciaSmithingTableBlock(FabricBlockSettings.copyOf(Blocks.SMITHING_TABLE)));
    public static final Block DARK_OAK_SMITHING_TABLE = registerBlock("dark_oak_smithing_table",
            new DarkOakSmithingTableBlock(FabricBlockSettings.copyOf(Blocks.SMITHING_TABLE)));
    public static final Block MANGROVE_SMITHING_TABLE = registerBlock("mangrove_smithing_table",
            new MangroveSmithingTableBlock(FabricBlockSettings.copyOf(Blocks.SMITHING_TABLE)));
    public static final Block CRIMSON_SMITHING_TABLE = registerBlock("crimson_smithing_table",
            new CrimsonSmithingTableBlock(FabricBlockSettings.copyOf(Blocks.SMITHING_TABLE)
                    .sounds(BlockSoundGroup.NETHER_STEM)));
    public static final Block WARPED_SMITHING_TABLE = registerBlock("warped_smithing_table",
            new WarpedSmithingTableBlock(FabricBlockSettings.copyOf(Blocks.SMITHING_TABLE)
                    .sounds(BlockSoundGroup.NETHER_STEM)));
    public static final Block CACTUS_SMITHING_TABLE = registerBlock("cactus_smithing_table",
            new CactusSmithingTableBlock(FabricBlockSettings.copyOf(Blocks.SMITHING_TABLE)));

    public static final Block DEEPSLATE_STONECUTTER = registerBlock("deepslate_stonecutter",
            new DeepslateStonecutterBlock(FabricBlockSettings.copyOf(Blocks.STONECUTTER).mapColor(MapColor.DEEPSLATE_GRAY)
                    .strength(4.5f).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block BLACKSTONE_STONECUTTER = registerBlock("blackstone_stonecutter",
            new BlackstoneStonecutterBlock(FabricBlockSettings.copyOf(Blocks.STONECUTTER).mapColor(MapColor.BLACK)
                    .strength(3.0f)));

    public static final Block COPPER_LANTERN = registerBlock("copper_lantern",
            new OxidizableLanternBlock(Oxidizable.OxidationLevel.UNAFFECTED,FabricBlockSettings.copyOf(Blocks.LANTERN)
                    .sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_COPPER_LANTERN = registerBlock("waxed_copper_lantern",
            new LanternBlock(FabricBlockSettings.copyOf(DecoBlocks.COPPER_LANTERN)));
    public static final Block EXPOSED_COPPER_LANTERN = registerBlock("exposed_copper_lantern",
            new OxidizableLanternBlock(Oxidizable.OxidationLevel.EXPOSED,FabricBlockSettings.copyOf(Blocks.LANTERN)
                    .sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_EXPOSED_COPPER_LANTERN = registerBlock("waxed_exposed_copper_lantern",
            new LanternBlock(FabricBlockSettings.copyOf(DecoBlocks.EXPOSED_COPPER_LANTERN)));
    public static final Block WEATHERED_COPPER_LANTERN = registerBlock("weathered_copper_lantern",
            new OxidizableLanternBlock(Oxidizable.OxidationLevel.WEATHERED,FabricBlockSettings.copyOf(Blocks.LANTERN)
                    .sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_WEATHERED_COPPER_LANTERN = registerBlock("waxed_weathered_copper_lantern",
            new LanternBlock(FabricBlockSettings.copyOf(DecoBlocks.WEATHERED_COPPER_LANTERN)));
    public static final Block OXIDIZED_COPPER_LANTERN = registerBlock("oxidized_copper_lantern",
            new OxidizableLanternBlock(Oxidizable.OxidationLevel.OXIDIZED,FabricBlockSettings.copyOf(Blocks.LANTERN)
                    .sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_OXIDIZED_COPPER_LANTERN = registerBlock("waxed_oxidized_copper_lantern",
            new LanternBlock(FabricBlockSettings.copyOf(DecoBlocks.OXIDIZED_COPPER_LANTERN)));

    public static final Block COPPER_SOUL_LANTERN = registerBlock("copper_soul_lantern",
            new OxidizableLanternBlock(Oxidizable.OxidationLevel.UNAFFECTED,FabricBlockSettings.copyOf(Blocks.SOUL_LANTERN)
                    .sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_COPPER_SOUL_LANTERN = registerBlock("waxed_copper_soul_lantern",
            new LanternBlock(FabricBlockSettings.copyOf(DecoBlocks.COPPER_SOUL_LANTERN)));
    public static final Block EXPOSED_COPPER_SOUL_LANTERN = registerBlock("exposed_copper_soul_lantern",
            new OxidizableLanternBlock(Oxidizable.OxidationLevel.EXPOSED,FabricBlockSettings.copyOf(Blocks.SOUL_LANTERN)
                    .sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_EXPOSED_COPPER_SOUL_LANTERN = registerBlock("waxed_exposed_copper_soul_lantern",
            new LanternBlock(FabricBlockSettings.copyOf(DecoBlocks.EXPOSED_COPPER_SOUL_LANTERN)));
    public static final Block WEATHERED_COPPER_SOUL_LANTERN = registerBlock("weathered_copper_soul_lantern",
            new OxidizableLanternBlock(Oxidizable.OxidationLevel.WEATHERED,FabricBlockSettings.copyOf(Blocks.SOUL_LANTERN)
                    .sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_WEATHERED_COPPER_SOUL_LANTERN = registerBlock("waxed_weathered_copper_soul_lantern",
            new LanternBlock(FabricBlockSettings.copyOf(DecoBlocks.WEATHERED_COPPER_SOUL_LANTERN)));
    public static final Block OXIDIZED_COPPER_SOUL_LANTERN = registerBlock("oxidized_copper_soul_lantern",
            new OxidizableLanternBlock(Oxidizable.OxidationLevel.OXIDIZED,FabricBlockSettings.copyOf(Blocks.SOUL_LANTERN)
                    .sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_OXIDIZED_COPPER_SOUL_LANTERN = registerBlock("waxed_oxidized_copper_soul_lantern",
            new LanternBlock(FabricBlockSettings.copyOf(DecoBlocks.OXIDIZED_COPPER_SOUL_LANTERN)));

    public static final Block DEEPSLATE_BUTTON = registerBlock("deepslate_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON).sounds(BlockSoundGroup.DEEPSLATE),
                    DecoBlockSets.DEEPSLATE, 20, false));
    public static final Block COBBLED_DEEPSLATE_BUTTON = registerBlock("cobbled_deepslate_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON).sounds(BlockSoundGroup.DEEPSLATE),
                    DecoBlockSets.DEEPSLATE, 20, false));
    public static final Block POLISHED_DEEPSLATE_BUTTON = registerBlock("polished_deepslate_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON).sounds(BlockSoundGroup.POLISHED_DEEPSLATE),
                    DecoBlockSets.POLISHED_DEEPSLATE, 20, false));
    public static final Block COBBLESTONE_BUTTON = registerBlock("cobblestone_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON),
                    BlockSetType.STONE, 20, false));
    public static final Block BLACKSTONE_BUTTON = registerBlock("blackstone_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON),
                    DecoBlockSets.BLACKSTONE, 20, false));
    public static final Block POLISHED_STONE_BUTTON = registerBlock("polished_stone_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON),
                    BlockSetType.STONE, 20, false));
    public static final Block CACTUS_PLANK_BUTTON = registerBlock("cactus_plank_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON),
                    DecoBlockSets.CACUTS, 30, true));
    public static final Block WOODEN_BUTTON = registerBlock("wooden_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON),
                    DecoBlockSets.WOODEN, 30, true));

    public static final Block DEEPSLATE_PRESSURE_PLATE = registerBlock("deepslate_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.MOBS, FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE)
                    .mapColor(MapColor.DEEPSLATE_GRAY).sounds(BlockSoundGroup.DEEPSLATE),DecoBlockSets.DEEPSLATE));
    public static final Block COBBLED_DEEPSLATE_PRESSURE_PLATE = registerBlock("cobbled_deepslate_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.MOBS, FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE)
                    .mapColor(MapColor.DEEPSLATE_GRAY).sounds(BlockSoundGroup.DEEPSLATE),DecoBlockSets.DEEPSLATE));
    public static final Block POLISHED_DEEPSLATE_PRESSURE_PLATE = registerBlock("polished_deepslate_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.MOBS, FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE)
                    .mapColor(MapColor.DEEPSLATE_GRAY).sounds(BlockSoundGroup.POLISHED_DEEPSLATE),DecoBlockSets.POLISHED_DEEPSLATE));
    public static final Block COBBLESTONE_PRESSURE_PLATE = registerBlock("cobblestone_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.MOBS, FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE),BlockSetType.STONE));
    public static final Block BLACKSTONE_PRESSURE_PLATE = registerBlock("blackstone_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.MOBS, FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE)
                    .mapColor(MapColor.BLACK),DecoBlockSets.BLACKSTONE));
    public static final Block POLISHED_STONE_PRESSURE_PLATE = registerBlock("polished_stone_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.MOBS, FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE)
                    .mapColor(MapColor.STONE_GRAY),BlockSetType.STONE));

    public static final Block COPPER_WEIGHT_PRESSURE_PLATE = registerBlock("copper_weight_pressure_plate",
            new OxidizablePressurePlateBlock(20, Oxidizable.OxidationLevel.UNAFFECTED,FabricBlockSettings.copyOf(Blocks.LIGHT_WEIGHTED_PRESSURE_PLATE)
                    .sounds(BlockSoundGroup.COPPER),DecoBlockSets.COPPER));
    public static final Block WAXED_COPPER_WEIGHT_PRESSURE_PLATE = registerBlock("waxed_copper_weight_pressure_plate",
            new WeightedPressurePlateBlock(20,FabricBlockSettings.copyOf(DecoBlocks.COPPER_WEIGHT_PRESSURE_PLATE),DecoBlockSets.COPPER));
    public static final Block EXPOSED_COPPER_WEIGHT_PRESSURE_PLATE = registerBlock("exposed_copper_weight_pressure_plate",
            new OxidizablePressurePlateBlock(50, Oxidizable.OxidationLevel.EXPOSED,FabricBlockSettings.copyOf(Blocks.LIGHT_WEIGHTED_PRESSURE_PLATE)
                    .sounds(BlockSoundGroup.COPPER),DecoBlockSets.COPPER));
    public static final Block WAXED_EXPOSED_COPPER_WEIGHT_PRESSURE_PLATE = registerBlock("waxed_exposed_copper_weight_pressure_plate",
            new WeightedPressurePlateBlock(50,FabricBlockSettings.copyOf(DecoBlocks.EXPOSED_COPPER_WEIGHT_PRESSURE_PLATE),DecoBlockSets.COPPER));
    public static final Block WEATHERED_COPPER_WEIGHT_PRESSURE_PLATE = registerBlock("weathered_copper_weight_pressure_plate",
            new OxidizablePressurePlateBlock(70,Oxidizable.OxidationLevel.WEATHERED,FabricBlockSettings.copyOf(Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE)
                    .sounds(BlockSoundGroup.COPPER),DecoBlockSets.COPPER));
    public static final Block WAXED_WEATHERED_COPPER_WEIGHT_PRESSURE_PLATE = registerBlock("waxed_weathered_copper_weight_pressure_plate",
            new WeightedPressurePlateBlock(70,FabricBlockSettings.copyOf(DecoBlocks.WEATHERED_COPPER_WEIGHT_PRESSURE_PLATE),DecoBlockSets.COPPER));
    public static final Block OXIDIZED_COPPER_WEIGHT_PRESSURE_PLATE = registerBlock("oxidized_copper_weight_pressure_plate",
            new OxidizablePressurePlateBlock(100, Oxidizable.OxidationLevel.OXIDIZED,FabricBlockSettings.copyOf(Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE)
                    .sounds(BlockSoundGroup.COPPER),DecoBlockSets.COPPER));
    public static final Block WAXED_OXIDIZED_COPPER_WEIGHT_PRESSURE_PLATE = registerBlock("waxed_oxidized_copper_weight_pressure_plate",
            new WeightedPressurePlateBlock(100,FabricBlockSettings.copyOf(DecoBlocks.OXIDIZED_COPPER_WEIGHT_PRESSURE_PLATE),DecoBlockSets.COPPER));

    public static final Block CACTUS_PLANK_PRESSURE_PLATE = registerBlock("cactus_plank_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE).mapColor(MapColor.PALE_GREEN),DecoBlockSets.CACUTS));
    public static final Block WOODEN_PRESSURE_PLATE = registerBlock("wooden_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE),DecoBlockSets.WOODEN));

    public static final Block GOLD_DOOR = registerBlock("gold_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque(), BlockSetType.GOLD));
    public static final Block CACTUS_DOOR = registerBlock("cactus_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR).mapColor(MapColor.PALE_GREEN).nonOpaque(), DecoBlockSets.CACUTS));
    public static final Block WOODEN_DOOR = registerBlock("wooden_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR).mapColor(MapColor.BROWN).nonOpaque(),DecoBlockSets.WOODEN));
    public static final Block GOLD_TRAPDOOR = registerBlock("gold_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque(), BlockSetType.GOLD));
    public static final Block CACTUS_TRAPDOOR = registerBlock("cactus_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR).mapColor(MapColor.PALE_GREEN).nonOpaque(), DecoBlockSets.CACUTS));
    public static final Block WOODEN_TRAPDOOR = registerBlock("wooden_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR).mapColor(MapColor.BROWN).nonOpaque(),DecoBlockSets.WOODEN));

    public static final Block CACTUS_PLANK_FENCE_GATE = registerBlock("cactus_plank_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(DecoBlocks.CACTUS_PLANKS), WoodType.BIRCH));
    public static final Block WOODEN_FENCE_GATE = registerBlock("wooden_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(DecoBlocks.WOODEN_PLANKS), WoodType.OAK));
    public static final Block NETHER_BRICK_FENCE_GATE = registerBlock("nether_brick_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.NETHER_BRICKS), WoodType.SPRUCE));
    public static final Block RED_NETHER_BRICK_FENCE_GATE = registerBlock("red_nether_brick_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.RED_NETHER_BRICKS), WoodType.MANGROVE));
    public static final Block BLUE_NETHER_BRICK_FENCE_GATE = registerBlock("blue_nether_brick_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(DecoBlocks.BLUE_NETHER_BRICKS), WoodType.SPRUCE));

    public static final Identifier CACTUS_SIGN_TEXTURE = new Identifier(VaranDeco.MOD_ID,"entity/signs/cactus");
    public static final Identifier WOODEN_SIGN_TEXTURE = new Identifier(VaranDeco.MOD_ID,"entity/signs/wooden");

    public static final Block STANDING_CACTUS_SIGN = registerBlockWithoutItem("standing_cactus_sign",
            new TerraformSignBlock(CACTUS_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_SIGN)));
    public static final Block WALL_CACTUS_SIGN = registerBlockWithoutItem("wall_cactus_sign",
            new TerraformWallSignBlock(CACTUS_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_WALL_SIGN)));

    public static final Block STANDING_WOODEN_SIGN = registerBlockWithoutItem("standing_wooden_sign",
            new TerraformSignBlock(WOODEN_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_SIGN)));
    public static final Block WALL_WOODEN_SIGN = registerBlockWithoutItem("wall_wooden_sign",
            new TerraformWallSignBlock(WOODEN_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_WALL_SIGN)));

    public static final Block STONE_TEMP = registerBlock("stone_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block SMOOTH_STONE_TEMP = registerBlock("smooth_stone_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block POLISHED_ANDESITE_TEMP = registerBlock("polished_andesite_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block POLISHED_DIORITE_TEMP = registerBlock("polished_diorite_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block POLISHED_GRANITE_TEMP = registerBlock("polished_granite_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block DRIPSTONE_TEMP = registerBlock("dripstone_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block CALCITE_TEMP = registerBlock("calcite_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block TUFF_TEMP = registerBlock("tuff_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block PACKED_MUD_TEMP = registerBlock("packed_mud_temp",
            new Block(FabricBlockSettings.of(Material.WOOD).strength(0f)));
    public static final Block NETHER_BRICKS_TEMP = registerBlock("nether_bricks_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block RED_NETHER_BRICKS_TEMP = registerBlock("red_nether_bricks_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block NETHERRACK_TEMP = registerBlock("netherrack_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block MAGMA_TEMP = registerBlock("magma_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block SNOW_TEMP = registerBlock("snow_temp",
            new Block(FabricBlockSettings.of(Material.SNOW_BLOCK).strength(0f)));
    public static final Block PACKED_ICE_TEMP = registerBlock("packed_ice_temp",
            new Block(FabricBlockSettings.of(Material.DENSE_ICE).strength(0f)));
    public static final Block BLUE_ICE_TEMP = registerBlock("blue_ice_temp",
            new Block(FabricBlockSettings.of(Material.DENSE_ICE).strength(0f)));
    public static final Block SANDSTONE_TOP_TEMP = registerBlock("sandstone_top_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block RED_SANDSTONE_TOP_TEMP = registerBlock("red_sandstone_top_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block DARK_PRISMARINE_TEMP = registerBlock("dark_prismarine_temp",
            new Block(FabricBlockSettings.of(Material.DENSE_ICE).strength(0f)));
    public static final Block PRISMARINE_BRICKS_TEMP = registerBlock("prismarine_bricks_temp",
            new Block(FabricBlockSettings.of(Material.DENSE_ICE).strength(0f)));
    public static final Block QUARTZ_TEMP = registerBlock("quartz_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block SMOOTH_QUARTZ_TEMP = registerBlock("smooth_quartz_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block QUARTZ_BRICKS_TEMP = registerBlock("quartz_bricks_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block TERRACOTTA_TEMP = registerBlock("terracotta_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block WHITE_TERRACOTTA_TEMP = registerBlock("white_terracotta_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block LIGHT_GRAY_TERRACOTTA_TEMP = registerBlock("light_gray_terracotta_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block GRAY_TERRACOTTA_TEMP = registerBlock("gray_terracotta_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block BLACK_TERRACOTTA_TEMP = registerBlock("black_terracotta_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block BROWN_TERRACOTTA_TEMP = registerBlock("brown_terracotta_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block RED_TERRACOTTA_TEMP = registerBlock("red_terracotta_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block ORANGE_TERRACOTTA_TEMP = registerBlock("orange_terracotta_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block YELLOW_TERRACOTTA_TEMP = registerBlock("yellow_terracotta_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block LIME_TERRACOTTA_TEMP = registerBlock("lime_terracotta_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block GREEN_TERRACOTTA_TEMP = registerBlock("green_terracotta_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block CYAN_TERRACOTTA_TEMP = registerBlock("cyan_terracotta_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block LIGHT_BLUE_TERRACOTTA_TEMP = registerBlock("light_blue_terracotta_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block BLUE_TERRACOTTA_TEMP = registerBlock("blue_terracotta_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block PURPLE_TERRACOTTA_TEMP = registerBlock("purple_terracotta_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block MAGENTA_TERRACOTTA_TEMP = registerBlock("magenta_terracotta_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block PINK_TERRACOTTA_TEMP = registerBlock("pink_terracotta_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block WHITE_CONCRETE_TEMP = registerBlock("white_concrete_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block LIGHT_GRAY_CONCRETE_TEMP = registerBlock("light_gray_concrete_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block GRAY_CONCRETE_TEMP = registerBlock("gray_concrete_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block BLACK_CONCRETE_TEMP = registerBlock("black_concrete_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block BROWN_CONCRETE_TEMP = registerBlock("brown_concrete_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block RED_CONCRETE_TEMP = registerBlock("red_concrete_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block ORANGE_CONCRETE_TEMP = registerBlock("orange_concrete_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block YELLOW_CONCRETE_TEMP = registerBlock("yellow_concrete_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block LIME_CONCRETE_TEMP = registerBlock("lime_concrete_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block GREEN_CONCRETE_TEMP = registerBlock("green_concrete_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block CYAN_CONCRETE_TEMP = registerBlock("cyan_concrete_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block LIGHT_BLUE_CONCRETE_TEMP = registerBlock("light_blue_concrete_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block BLUE_CONCRETE_TEMP = registerBlock("blue_concrete_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block PURPLE_CONCRETE_TEMP = registerBlock("purple_concrete_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block MAGENTA_CONCRETE_TEMP = registerBlock("magenta_concrete_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block PINK_CONCRETE_TEMP = registerBlock("pink_concrete_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block END_STONE_TEMP = registerBlock("end_stone_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block OBSIDIAN_TEMP = registerBlock("obsidian_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block POLISHED_DEEPSLATE_TEMP = registerBlock("polished_deepslate_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block DEEPSLATE_TEMP = registerBlock("deepslate_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block BLACKSTONE_TEMP = registerBlock("blackstone_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block COBBLESTONE_TEMP = registerBlock("cobblestone_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block COBBLED_DEEPSLATE_TEMP = registerBlock("cobbled_deepslate_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));

    public static final BlockFamily CACTUS_FAMILY = BlockFamilies.register(DecoBlocks.CACTUS_PLANKS)
            .sign(DecoBlocks.STANDING_CACTUS_SIGN,DecoBlocks.WALL_CACTUS_SIGN)
            .group("wooden").unlockCriterionName("has_planks").build();
    public static final BlockFamily WOODEN_FAMILY = BlockFamilies.register(DecoBlocks.WOODEN_PLANKS)
            .sign(DecoBlocks.STANDING_WOODEN_SIGN,DecoBlocks.WALL_WOODEN_SIGN)
            .group("wooden").unlockCriterionName("has_planks").build();

    private static PillarBlock createLogBlock(MapColor topMapColor, MapColor sideMapColor) {
        return new PillarBlock(
                AbstractBlock.Settings.of(Material.WOOD, state -> state.get(PillarBlock.AXIS) == Direction.Axis.Y ? topMapColor : sideMapColor)
                        .strength(2.0F)
                        .sounds(BlockSoundGroup.WOOD)
        );
    }

    private static Block registerBlockWithoutItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(VaranDeco.MOD_ID, name), block);
    }
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(VaranDeco.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(VaranDeco.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
    public static void addBlocksToItemGroups() {
        addToItemGroup(DecoItemGroup.VARAN_DECO, CACTUS_PLANKS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CACTUS_PLANK_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CACTUS_PLANK_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CACTUS_PLANK_FENCE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CACTUS_PLANK_FENCE_GATE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CACTUS_DOOR.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CACTUS_TRAPDOOR.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CACTUS_PLANK_PRESSURE_PLATE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CACTUS_PLANK_BUTTON.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO, WOODEN_LOG.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO, STRIPPED_WOODEN_LOG.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO, WOODEN_WOOD.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO, STRIPPED_WOODEN_WOOD.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO, WOODEN_PLANKS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.WOODEN_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.WOODEN_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.WOODEN_FENCE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.WOODEN_FENCE_GATE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.WOODEN_DOOR.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.WOODEN_TRAPDOOR.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.WOODEN_PRESSURE_PLATE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.WOODEN_BUTTON.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.STONE_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.COBBLESTONE_PRESSURE_PLATE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.COBBLESTONE_BUTTON.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO, POLISHED_STONE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.POLISHED_STONE_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.POLISHED_STONE_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.POLISHED_STONE_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.POLISHED_STONE_BUTTON.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.POLISHED_STONE_PRESSURE_PLATE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.SMOOTH_STONE_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.SMOOTH_STONE_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO, STONE_TILES.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.STONE_TILE_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.STONE_TILE_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.STONE_TILE_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.POLISHED_GRANITE_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.POLISHED_DIORITE_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.POLISHED_ANDESITE_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.DEEPSLATE_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO, DecoBlocks.DEEPSLATE_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.DEEPSLATE_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.DEEPSLATE_BUTTON.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.DEEPSLATE_PRESSURE_PLATE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.COBBLED_DEEPSLATE_BUTTON.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.COBBLED_DEEPSLATE_PRESSURE_PLATE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.POLISHED_DEEPSLATE_BUTTON.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO, SMOOTH_DEEPSLATE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.SMOOTH_DEEPSLATE_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.SMOOTH_DEEPSLATE_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.SMOOTH_DEEPSLATE_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO, CHISELED_BRICKS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.PACKED_MUD_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.PACKED_MUD_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.PACKED_MUD_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.SMOOTH_SANDSTONE_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CUT_SANDSTONE_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CUT_SANDSTONE_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO, CUT_SANDSTONE_BRICKS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CUT_SANDSTONE_BRICK_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CUT_SANDSTONE_BRICK_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CUT_SANDSTONE_BRICK_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.SMOOTH_RED_SANDSTONE_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CUT_RED_SANDSTONE_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CUT_RED_SANDSTONE_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CUT_RED_SANDSTONE_BRICKS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CUT_RED_SANDSTONE_BRICK_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CUT_RED_SANDSTONE_BRICK_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CUT_RED_SANDSTONE_BRICK_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.DARK_PRISMARINE_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.PRISMARINE_BRICK_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CHISELED_PRISMARINE_BRICKS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CRYSTALLIZED_PRISMARINE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CRYSTALLIZED_PRISMARINE_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CRYSTALLIZED_PRISMARINE_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CRYSTALLIZED_PRISMARINE_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICK_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICK_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICK_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CHISELED_CRYSTALLIZED_PRISMARINE_BRICKS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.LIGHT_PRISMARINE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.LIGHT_PRISMARINE_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.LIGHT_PRISMARINE_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.LIGHT_PRISMARINE_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.NETHERRACK_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.NETHERRACK_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.NETHERRACK_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.NETHER_BRICK_FENCE_GATE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CRACKED_RED_NETHER_BRICKS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.RED_NETHER_BRICK_FENCE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.RED_NETHER_BRICK_FENCE_GATE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CHISELED_RED_NETHER_BRICKS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.BLUE_NETHER_BRICKS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CRACKED_BLUE_NETHER_BRICKS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.BLUE_NETHER_BRICK_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.BLUE_NETHER_BRICK_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.BLUE_NETHER_BRICK_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.BLUE_NETHER_BRICK_FENCE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.BLUE_NETHER_BRICK_FENCE_GATE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CHISELED_BLUE_NETHER_BRICKS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.BLACKSTONE_BUTTON.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.BLACKSTONE_PRESSURE_PLATE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.POLISHED_GLIDED_BLACKSTONE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CHISELED_GLIDED_BLACKSTONE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO, SMOOTH_BLACKSTONE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.SMOOTH_BLACKSTONE_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.SMOOTH_BLACKSTONE_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.SMOOTH_BLACKSTONE_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.POLISHED_BLACKSTONE_TILES.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.POLISHED_BLACKSTONE_TILE_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.POLISHED_BLACKSTONE_TILE_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.POLISHED_BLACKSTONE_TILE_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.END_STONE_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.END_STONE_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.END_STONE_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO, CHISELED_END_STONE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO, VOID_STONE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.VOID_STONE_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.VOID_STONE_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.VOID_STONE_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO, CHISELED_VOID_STONE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO, VOID_STONE_BRICKS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.VOID_STONE_BRICK_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.VOID_STONE_BRICK_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.VOID_STONE_BRICK_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO, CHISELED_PURPUR.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO, PURPUR_BRICKS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.PURPUR_BRICK_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.PURPUR_BRICK_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.PURPUR_BRICK_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO, SMOOTH_PURPUR.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.SMOOTH_PURPUR_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.SMOOTH_PURPUR_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.SMOOTH_PURPUR_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO, CHARCOAL_BLOCK.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO, FLINT_BLOCK.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO, CUT_IRON.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO, CUT_IRON_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO, CUT_IRON_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.LIGHT_IRON_BARS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.HEAVY_IRON_BARS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.GOLD_DOOR.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.GOLD_TRAPDOOR.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.QUARTZ_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.QUARTZ_BRICK_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.QUARTZ_BRICK_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.QUARTZ_BRICK_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.SMOOTH_QUARTZ_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO, CUT_QUARTZ.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CUT_QUARTZ_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CUT_QUARTZ_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CUT_QUARTZ_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO, ECHO_BLOCK.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.LIGHT_COPPER_BARS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.WAXED_LIGHT_COPPER_BARS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.EXPOSED_LIGHT_COPPER_BARS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.WAXED_EXPOSED_LIGHT_COPPER_BARS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.WEATHERED_LIGHT_COPPER_BARS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.WAXED_WEATHERED_LIGHT_COPPER_BARS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.OXIDIZED_LIGHT_COPPER_BARS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.WAXED_OXIDIZED_LIGHT_COPPER_BARS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.COPPER_BARS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.WAXED_COPPER_BARS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.EXPOSED_COPPER_BARS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.WAXED_EXPOSED_COPPER_BARS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.WEATHERED_COPPER_BARS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.WAXED_WEATHERED_COPPER_BARS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.OXIDIZED_COPPER_BARS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.WAXED_OXIDIZED_COPPER_BARS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.HEAVY_COPPER_BARS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.WAXED_HEAVY_COPPER_BARS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.EXPOSED_HEAVY_COPPER_BARS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.WAXED_EXPOSED_HEAVY_COPPER_BARS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.WEATHERED_HEAVY_COPPER_BARS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.WAXED_WEATHERED_HEAVY_COPPER_BARS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.OXIDIZED_HEAVY_COPPER_BARS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.WAXED_OXIDIZED_HEAVY_COPPER_BARS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.COPPER_CHAIN.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.WAXED_COPPER_CHAIN.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.EXPOSED_COPPER_CHAIN.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.WAXED_EXPOSED_COPPER_CHAIN.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.WEATHERED_COPPER_CHAIN.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.WAXED_WEATHERED_COPPER_CHAIN.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.OXIDIZED_COPPER_CHAIN.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.WAXED_OXIDIZED_COPPER_CHAIN.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.COPPER_WEIGHT_PRESSURE_PLATE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.WAXED_COPPER_WEIGHT_PRESSURE_PLATE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.EXPOSED_COPPER_WEIGHT_PRESSURE_PLATE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.WAXED_EXPOSED_COPPER_WEIGHT_PRESSURE_PLATE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.WEATHERED_COPPER_WEIGHT_PRESSURE_PLATE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.WAXED_WEATHERED_COPPER_WEIGHT_PRESSURE_PLATE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.OXIDIZED_COPPER_WEIGHT_PRESSURE_PLATE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.WAXED_OXIDIZED_COPPER_WEIGHT_PRESSURE_PLATE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.PACKED_ICE_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.PACKED_ICE_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.PACKED_ICE_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.BLUE_ICE_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.BLUE_ICE_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.BLUE_ICE_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.ICE_BRICKS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.ICE_BRICK_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.ICE_BRICK_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.ICE_BRICK_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.BLACK_ICE.asItem());;
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.SNOW_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.SNOW_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.SNOW_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO, SNOW_BRICKS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.SNOW_BRICK_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.SNOW_BRICK_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.SNOW_BRICK_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO, CHISELED_SNOW_BRICKS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CALCITE_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CALCITE_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CALCITE_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.TUFF_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.TUFF_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.TUFF_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.DRIPSTONE_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.DRIPSTONE_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.DRIPSTONE_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.BUBBLE_BLOCK.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.BUBBLE_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.BUBBLE_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.BUBBLE_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.BUBBLE_BRICKS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.BUBBLE_BRICK_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.BUBBLE_BRICK_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.BUBBLE_BRICK_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CHISELED_BUBBLE_BRICKS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.MAGMA_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.MAGMA_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.MAGMA_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.MAGMA_BRICKS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.MAGMA_BRICK_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.MAGMA_BRICK_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.MAGMA_BRICK_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CHISELED_MAGMA_BRICKS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.OBSIDIAN_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.OBSIDIAN_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.OBSIDIAN_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO, CHISELED_OBSIDIAN.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO, OBSIDIAN_BRICKS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.OBSIDIAN_BRICK_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.OBSIDIAN_BRICK_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.OBSIDIAN_BRICK_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO, OBSIDIAN_PILLAR.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.SOUL_SOILSTONE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.SOUL_SOILSTONE_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.SOUL_SOILSTONE_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.SOUL_SOILSTONE_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CHISELED_SOUL_SOILSTONE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.SMOOTH_SOUL_SOILSTONE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.SMOOTH_SOUL_SOILSTONE_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.SMOOTH_SOUL_SOILSTONE_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.SMOOTH_SOUL_SOILSTONE_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CUT_SOUL_SOILSTONE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CUT_SOUL_SOILSTONE_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CUT_SOUL_SOILSTONE_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CUT_SOUL_SOILSTONE_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CUT_SOUL_SOILSTONE_BRICK_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CUT_SOUL_SOILSTONE_BRICK_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CUT_SOUL_SOILSTONE_BRICK_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.TERRACOTTA_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.TERRACOTTA_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.TERRACOTTA_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.WHITE_TERRACOTTA_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.WHITE_TERRACOTTA_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.WHITE_TERRACOTTA_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.LIGHT_GRAY_TERRACOTTA_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.LIGHT_GRAY_TERRACOTTA_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.GRAY_TERRACOTTA_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.GRAY_TERRACOTTA_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.GRAY_TERRACOTTA_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.BLACK_TERRACOTTA_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.BLACK_TERRACOTTA_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.BLACK_TERRACOTTA_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.BROWN_TERRACOTTA_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.BROWN_TERRACOTTA_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.BROWN_TERRACOTTA_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.RED_TERRACOTTA_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.RED_TERRACOTTA_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.RED_TERRACOTTA_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.ORANGE_TERRACOTTA_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.ORANGE_TERRACOTTA_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.ORANGE_TERRACOTTA_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.YELLOW_TERRACOTTA_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.YELLOW_TERRACOTTA_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.YELLOW_TERRACOTTA_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.LIME_TERRACOTTA_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.LIME_TERRACOTTA_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.LIME_TERRACOTTA_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.GREEN_TERRACOTTA_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.GREEN_TERRACOTTA_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.GREEN_TERRACOTTA_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CYAN_TERRACOTTA_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CYAN_TERRACOTTA_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CYAN_TERRACOTTA_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.LIGHT_BLUE_TERRACOTTA_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.LIGHT_BLUE_TERRACOTTA_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.BLUE_TERRACOTTA_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.BLUE_TERRACOTTA_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.BLUE_TERRACOTTA_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.PURPLE_TERRACOTTA_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.PURPLE_TERRACOTTA_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.PURPLE_TERRACOTTA_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.MAGENTA_TERRACOTTA_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.MAGENTA_TERRACOTTA_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.MAGENTA_TERRACOTTA_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.PINK_TERRACOTTA_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.PINK_TERRACOTTA_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.PINK_TERRACOTTA_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,TERRACOTTA_BRICKS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.TERRACOTTA_BRICK_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.TERRACOTTA_BRICK_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.TERRACOTTA_BRICK_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,WHITE_TERRACOTTA_BRICKS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.WHITE_TERRACOTTA_BRICK_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.WHITE_TERRACOTTA_BRICK_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.WHITE_TERRACOTTA_BRICK_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,LIGHT_GRAY_TERRACOTTA_BRICKS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,GRAY_TERRACOTTA_BRICKS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.GRAY_TERRACOTTA_BRICK_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.GRAY_TERRACOTTA_BRICK_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.GRAY_TERRACOTTA_BRICK_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,BLACK_TERRACOTTA_BRICKS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.BLACK_TERRACOTTA_BRICK_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.BLACK_TERRACOTTA_BRICK_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.BLACK_TERRACOTTA_BRICK_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,BROWN_TERRACOTTA_BRICKS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.BROWN_TERRACOTTA_BRICK_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.BROWN_TERRACOTTA_BRICK_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.BROWN_TERRACOTTA_BRICK_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,RED_TERRACOTTA_BRICKS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.RED_TERRACOTTA_BRICK_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.RED_TERRACOTTA_BRICK_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.RED_TERRACOTTA_BRICK_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,ORANGE_TERRACOTTA_BRICKS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.ORANGE_TERRACOTTA_BRICK_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.ORANGE_TERRACOTTA_BRICK_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.ORANGE_TERRACOTTA_BRICK_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,YELLOW_TERRACOTTA_BRICKS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.YELLOW_TERRACOTTA_BRICK_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.YELLOW_TERRACOTTA_BRICK_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.YELLOW_TERRACOTTA_BRICK_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,LIME_TERRACOTTA_BRICKS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.LIME_TERRACOTTA_BRICK_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.LIME_TERRACOTTA_BRICK_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.LIME_TERRACOTTA_BRICK_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,GREEN_TERRACOTTA_BRICKS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.GREEN_TERRACOTTA_BRICK_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.GREEN_TERRACOTTA_BRICK_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.GREEN_TERRACOTTA_BRICK_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,CYAN_TERRACOTTA_BRICKS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CYAN_TERRACOTTA_BRICK_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CYAN_TERRACOTTA_BRICK_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CYAN_TERRACOTTA_BRICK_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,LIGHT_BLUE_TERRACOTTA_BRICKS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,BLUE_TERRACOTTA_BRICKS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.BLUE_TERRACOTTA_BRICK_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.BLUE_TERRACOTTA_BRICK_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.BLUE_TERRACOTTA_BRICK_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,PURPLE_TERRACOTTA_BRICKS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.PURPLE_TERRACOTTA_BRICK_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.PURPLE_TERRACOTTA_BRICK_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.PURPLE_TERRACOTTA_BRICK_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,MAGENTA_TERRACOTTA_BRICKS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.MAGENTA_TERRACOTTA_BRICK_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.MAGENTA_TERRACOTTA_BRICK_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.MAGENTA_TERRACOTTA_BRICK_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,PINK_TERRACOTTA_BRICKS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.PINK_TERRACOTTA_BRICK_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.PINK_TERRACOTTA_BRICK_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.PINK_TERRACOTTA_BRICK_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.WHITE_CONCRETE_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.WHITE_CONCRETE_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.WHITE_CONCRETE_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.LIGHT_GRAY_CONCRETE_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.LIGHT_GRAY_CONCRETE_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.LIGHT_GRAY_CONCRETE_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.GRAY_CONCRETE_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.GRAY_CONCRETE_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.GRAY_CONCRETE_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.BLACK_CONCRETE_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.BLACK_CONCRETE_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.BLACK_CONCRETE_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.BROWN_CONCRETE_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.BROWN_CONCRETE_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.BROWN_CONCRETE_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.RED_CONCRETE_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.RED_CONCRETE_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.RED_CONCRETE_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.ORANGE_CONCRETE_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.ORANGE_CONCRETE_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.ORANGE_CONCRETE_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.YELLOW_CONCRETE_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.YELLOW_CONCRETE_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.YELLOW_CONCRETE_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.LIME_CONCRETE_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.LIME_CONCRETE_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.LIME_CONCRETE_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.GREEN_CONCRETE_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.GREEN_CONCRETE_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.GREEN_CONCRETE_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CYAN_CONCRETE_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CYAN_CONCRETE_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CYAN_CONCRETE_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.LIGHT_BLUE_CONCRETE_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.LIGHT_BLUE_CONCRETE_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.LIGHT_BLUE_CONCRETE_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.BLUE_CONCRETE_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.BLUE_CONCRETE_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.BLUE_CONCRETE_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.PURPLE_CONCRETE_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.PURPLE_CONCRETE_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.PURPLE_CONCRETE_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.PINK_CONCRETE_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.PINK_CONCRETE_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.PINK_CONCRETE_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.MAGENTA_CONCRETE_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.MAGENTA_CONCRETE_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.MAGENTA_CONCRETE_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CUT_WHITE_CONCRETE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CUT_WHITE_CONCRETE_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CUT_WHITE_CONCRETE_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CUT_WHITE_CONCRETE_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CUT_LIGHT_GRAY_CONCRETE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CUT_LIGHT_GRAY_CONCRETE_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CUT_LIGHT_GRAY_CONCRETE_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CUT_LIGHT_GRAY_CONCRETE_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CUT_GRAY_CONCRETE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CUT_GRAY_CONCRETE_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CUT_GRAY_CONCRETE_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CUT_GRAY_CONCRETE_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CUT_BLACK_CONCRETE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CUT_BLACK_CONCRETE_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CUT_BLACK_CONCRETE_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CUT_BLACK_CONCRETE_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CUT_BROWN_CONCRETE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CUT_BROWN_CONCRETE_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CUT_BROWN_CONCRETE_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CUT_BROWN_CONCRETE_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CUT_RED_CONCRETE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CUT_RED_CONCRETE_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CUT_RED_CONCRETE_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CUT_RED_CONCRETE_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CUT_ORANGE_CONCRETE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CUT_ORANGE_CONCRETE_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CUT_ORANGE_CONCRETE_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CUT_ORANGE_CONCRETE_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CUT_YELLOW_CONCRETE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CUT_YELLOW_CONCRETE_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CUT_YELLOW_CONCRETE_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CUT_YELLOW_CONCRETE_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CUT_LIME_CONCRETE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CUT_LIME_CONCRETE_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CUT_LIME_CONCRETE_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CUT_LIME_CONCRETE_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CUT_GREEN_CONCRETE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CUT_GREEN_CONCRETE_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CUT_GREEN_CONCRETE_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CUT_GREEN_CONCRETE_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CUT_CYAN_CONCRETE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CUT_CYAN_CONCRETE_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CUT_CYAN_CONCRETE_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CUT_CYAN_CONCRETE_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CUT_LIGHT_BLUE_CONCRETE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CUT_LIGHT_BLUE_CONCRETE_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CUT_LIGHT_BLUE_CONCRETE_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CUT_LIGHT_BLUE_CONCRETE_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CUT_BLUE_CONCRETE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CUT_BLUE_CONCRETE_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CUT_BLUE_CONCRETE_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CUT_BLUE_CONCRETE_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CUT_PURPLE_CONCRETE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CUT_PURPLE_CONCRETE_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CUT_PURPLE_CONCRETE_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CUT_PURPLE_CONCRETE_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CUT_MAGENTA_CONCRETE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CUT_MAGENTA_CONCRETE_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CUT_MAGENTA_CONCRETE_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CUT_MAGENTA_CONCRETE_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CUT_PINK_CONCRETE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CUT_PINK_CONCRETE_STAIRS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CUT_PINK_CONCRETE_SLAB.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CUT_PINK_CONCRETE_WALL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.WHITE_CONCRETE_PILLAR.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.LIGHT_GRAY_CONCRETE_PILLAR.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.GRAY_CONCRETE_PILLAR.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.BLACK_CONCRETE_PILLAR.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.BROWN_CONCRETE_PILLAR.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.RED_CONCRETE_PILLAR.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.ORANGE_CONCRETE_PILLAR.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.YELLOW_CONCRETE_PILLAR.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.LIME_CONCRETE_PILLAR.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.GREEN_CONCRETE_PILLAR.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CYAN_CONCRETE_PILLAR.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.LIGHT_BLUE_CONCRETE_PILLAR.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.BLUE_CONCRETE_PILLAR.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.PURPLE_CONCRETE_PILLAR.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.MAGENTA_CONCRETE_PILLAR.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.PINK_CONCRETE_PILLAR.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO, HARDENED_GLASS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO, HARDENED_TINTED_GLASS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.HARDENED_WHITE_STAINED_GLASS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.HARDENED_LIGHT_GRAY_STAINED_GLASS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.HARDENED_GRAY_STAINED_GLASS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.HARDENED_BLACK_STAINED_GLASS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.HARDENED_BROWN_STAINED_GLASS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.HARDENED_RED_STAINED_GLASS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.HARDENED_ORANGE_STAINED_GLASS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.HARDENED_YELLOW_STAINED_GLASS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.HARDENED_LIME_STAINED_GLASS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.HARDENED_GREEN_STAINED_GLASS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.HARDENED_CYAN_STAINED_GLASS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.HARDENED_LIGHT_BLUE_STAINED_GLASS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.HARDENED_BLUE_STAINED_GLASS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.HARDENED_PURPLE_STAINED_GLASS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.HARDENED_MAGENTA_STAINED_GLASS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.HARDENED_PINK_STAINED_GLASS.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.TINTED_GLASS_PANE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.HARDENED_GLASS_PANE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.HARDENED_TINTED_GLASS_PANE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.HARDENED_WHITE_STAINED_GLASS_PANE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.HARDENED_LIGHT_GRAY_STAINED_GLASS_PANE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.HARDENED_GRAY_STAINED_GLASS_PANE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.HARDENED_BLACK_STAINED_GLASS_PANE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.HARDENED_BROWN_STAINED_GLASS_PANE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.HARDENED_RED_STAINED_GLASS_PANE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.HARDENED_ORANGE_STAINED_GLASS_PANE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.HARDENED_YELLOW_STAINED_GLASS_PANE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.HARDENED_LIME_STAINED_GLASS_PANE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.HARDENED_GREEN_STAINED_GLASS_PANE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.HARDENED_CYAN_STAINED_GLASS_PANE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.HARDENED_LIGHT_BLUE_STAINED_GLASS_PANE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.HARDENED_BLUE_STAINED_GLASS_PANE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.HARDENED_PURPLE_STAINED_GLASS_PANE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.HARDENED_MAGENTA_STAINED_GLASS_PANE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.HARDENED_PINK_STAINED_GLASS_PANE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.WHITE_BLOCK.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.LIGHT_GRAY_BLOCK.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.GRAY_BLOCK.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.BLACK_BLOCK.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.BROWN_BLOCK.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.RED_BLOCK.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.ORANGE_BLOCK.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.YELLOW_BLOCK.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.LIME_BLOCK.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.GREEN_BLOCK.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CYAN_BLOCK.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.LIGHT_BLUE_BLOCK.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.BLUE_BLOCK.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.PURPLE_BLOCK.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.MAGENTA_BLOCK.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.PINK_BLOCK.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.WOODEN_LEAVES.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.WOODEN_SAPLING.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.PUFFY_DANDELION.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CALIFORNIA_POPPY.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.SALMON_POPPY.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.YELLOW_ORCHID.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.WHITE_ORCHID.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.PINK_ORCHID.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.YELLOW_TULIP.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.PURPLE_TULIP.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.MAGENTA_TULIP.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.BLUE_TULIP.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.BLACK_TULIP.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.GREEN_TULIP.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CYAN_TULIP.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.BARBERTON_DAISY.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.BLUE_EYED_DAISY.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.GERBERA_DAISY.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.MICHAELMAS_DAISY.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.PAEONIA.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.LAVENDER.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.ROSE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.ENDER_ROSE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.RED_SUNFLOWER.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.NOVA_STARFLOWER.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.WITHER_ROSE_BUSH.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.ENDER_ROSE_BUSH.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.COPPER_LANTERN.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.WAXED_COPPER_LANTERN.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.EXPOSED_COPPER_LANTERN.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.WAXED_EXPOSED_COPPER_LANTERN.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.WEATHERED_COPPER_LANTERN.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.WAXED_WEATHERED_COPPER_LANTERN.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.OXIDIZED_COPPER_LANTERN.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.WAXED_OXIDIZED_COPPER_LANTERN.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.COPPER_SOUL_LANTERN.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.WAXED_COPPER_SOUL_LANTERN.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.EXPOSED_COPPER_SOUL_LANTERN.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.WAXED_EXPOSED_COPPER_SOUL_LANTERN.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.WEATHERED_COPPER_SOUL_LANTERN.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.WAXED_WEATHERED_COPPER_SOUL_LANTERN.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.OXIDIZED_COPPER_SOUL_LANTERN.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.WAXED_OXIDIZED_COPPER_SOUL_LANTERN.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.SPRUCE_CRAFTING_TABLE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.BIRCH_CRAFTING_TABLE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.JUNGLE_CRAFTING_TABLE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.ACACIA_CRAFTING_TABLE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.DARK_OAK_CRAFTING_TABLE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.MANGROVE_CRAFTING_TABLE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CRIMSON_CRAFTING_TABLE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.WARPED_CRAFTING_TABLE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CACTUS_CRAFTING_TABLE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.WOODEN_CRAFTING_TABLE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.DEEPSLATE_STONECUTTER.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.BLACKSTONE_STONECUTTER.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.OAK_CARTOGRAPHY_TABLE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.SPRUCE_CARTOGRAPHY_TABLE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.BIRCH_CARTOGRAPHY_TABLE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.JUNGLE_CARTOGRAPHY_TABLE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.ACACIA_CARTOGRAPHY_TABLE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.DARK_OAK_CARTOGRAPHY_TABLE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.MANGROVE_CARTOGRAPHY_TABLE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CRIMSON_CARTOGRAPHY_TABLE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.WARPED_CARTOGRAPHY_TABLE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CACTUS_CARTOGRAPHY_TABLE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.OAK_SMITHING_TABLE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.SPRUCE_SMITHING_TABLE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.BIRCH_SMITHING_TABLE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.JUNGLE_SMITHING_TABLE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.ACACIA_SMITHING_TABLE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.DARK_OAK_SMITHING_TABLE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.MANGROVE_SMITHING_TABLE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CRIMSON_SMITHING_TABLE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.WARPED_SMITHING_TABLE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CACTUS_SMITHING_TABLE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.DEEPSLATE_FURNACE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.BLACKSTONE_FURNACE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.DEEPSLATE_SMOKER.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.BLACKSTONE_SMOKER.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.DEEPSLATE_BLAST_FURNACE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.BLACKSTONE_BLAST_FURNACE.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.SPRUCE_LADDER.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.BIRCH_LADDER.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.JUNGLE_LADDER.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.ACACIA_LADDER.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.DARK_OAK_LADDER.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.MANGROVE_LADDER.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CRIMSON_LADDER.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.WARPED_LADDER.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CACTUS_LADDER.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.WOODEN_LADDER.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.OAK_BARREL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.SPRUCE_BARREL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.BIRCH_BARREL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.JUNGLE_BARREL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.ACACIA_BARREL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.DARK_OAK_BARREL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.MANGROVE_BARREL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CRIMSON_BARREL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.WARPED_BARREL.asItem());
        addToItemGroup(DecoItemGroup.VARAN_DECO,DecoBlocks.CACTUS_BARREL.asItem());
    }

    public static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }
    
    public static void registerDecoBlocks(){
        VaranDeco.LOGGER.debug("Registering Blocks for " + VaranDeco.MOD_ID);
        addBlocksToItemGroups();
    }
}