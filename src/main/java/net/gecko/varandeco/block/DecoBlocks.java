package net.gecko.varandeco.block;

import com.terraformersmc.terraform.sign.api.block.TerraformHangingSignBlock;
import com.terraformersmc.terraform.sign.api.block.TerraformSignBlock;
import com.terraformersmc.terraform.sign.api.block.TerraformWallHangingSignBlock;
import com.terraformersmc.terraform.sign.api.block.TerraformWallSignBlock;
import net.gecko.varandeco.VaranDeco;
import net.gecko.varandeco.block.cartographytables.*;
import net.gecko.varandeco.block.craftingtables.*;
import net.gecko.varandeco.block.custom.*;
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
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;

import java.util.function.Function;


public class DecoBlocks {
    public static final Block CACTUS_PLANKS = registerBlock("cactus_planks",
            AbstractBlock.Settings.create().strength(2.0f,3.0f)
                    .sounds(BlockSoundGroup.WOOD).mapColor(MapColor.PALE_GREEN), Block::new);
    public static final Block WOODEN_PLANKS = registerBlock("wooden_planks",
            AbstractBlock.Settings.create().mapColor(MapColor.BROWN).strength(2.0f,3.0f)
                    .sounds(BlockSoundGroup.WOOD), Block::new);
    public static final Block CHARCOAL_BLOCK = registerBlock("charcoal_block",
            AbstractBlock.Settings.create().requiresTool()
                    .strength(5.0F, 6.0F).sounds(BlockSoundGroup.WOOD).mapColor(MapColor.SPRUCE_BROWN), Block::new);
    public static final Block FLINT_BLOCK = registerBlock("flint_block",
            AbstractBlock.Settings.create().requiresTool().strength(5.0F, 6.0F)
                    .sounds(BlockSoundGroup.DEEPSLATE_BRICKS), Block::new);
    public static final Block ECHO_BLOCK = registerBlock("echo_block",
            AbstractBlock.Settings.create().requiresTool().strength(2.0F, 3.0F)
                    .sounds(BlockSoundGroup.SCULK_CATALYST).luminance(state -> 7).mapColor(MapColor.BLACK), Block::new);
    public static final Block CUT_IRON = registerBlock("cut_iron",
            AbstractBlock.Settings.copy(Blocks.IRON_BLOCK), Block::new);
    public static final Block CUT_IRON_STAIRS = registerStairs("cut_iron_stairs",
            DecoBlocks.CUT_IRON,DecoBlocks.CUT_IRON);
    public static final Block CUT_IRON_SLAB = registerBlock("cut_iron_slab",
            AbstractBlock.Settings.copy(DecoBlocks.CUT_IRON), SlabBlock::new);
    public static final Block CHISELED_IRON = registerBlock("chiseled_iron",
            AbstractBlock.Settings.copy(Blocks.IRON_BLOCK), Block::new);
    public static final Block IRON_GRATE = registerBlock("iron_grate",
            AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.CHAIN)
                    .mapColor(MapColor.DARK_AQUA).nonOpaque(), GrateBlock::new);
    public static final Block WOODEN_LOG = registerBlock("wooden_log",
            AbstractBlock.Settings.create().mapColor(MapColor.TERRACOTTA_BROWN).strength(2.0f,2.0f)
                    .sounds(BlockSoundGroup.WOOD),PillarBlock::new);
    public static final Block STRIPPED_WOODEN_LOG = registerBlock("stripped_wooden_log",
            AbstractBlock.Settings.create().mapColor(MapColor.BROWN).strength(2.0f,2.0f)
                    .sounds(BlockSoundGroup.WOOD),PillarBlock::new);
    public static final Block STRIPPED_WOODEN_WOOD = registerBlock("stripped_wooden_wood",
            AbstractBlock.Settings.create().mapColor(MapColor.TERRACOTTA_BROWN).strength(2.0f,2.0f)
                    .sounds(BlockSoundGroup.WOOD),PillarBlock::new);
    public static final Block WOODEN_WOOD = registerBlock("wooden_wood",
            AbstractBlock.Settings.create().mapColor(MapColor.BROWN).strength(2.0f,2.0f)
                    .sounds(BlockSoundGroup.WOOD),PillarBlock::new);
    public static final Block HARDENED_GLASS = registerBlock("hardened_glass",
            AbstractBlock.Settings.copy(Blocks.GLASS).strength(25.0f,100.0f)
                    .nonOpaque().requiresTool(),TransparentBlock::new);
    public static final Block HARDENED_TINTED_GLASS = registerBlock("hardened_tinted_glass",
            AbstractBlock.Settings.copy(Blocks.TINTED_GLASS).strength(25.0f,100.0f)
                    .nonOpaque().requiresTool(),TintedGlassBlock::new);
    public static final Block CUT_SANDSTONE_BRICKS = registerBlock("cut_sandstone_bricks",
            AbstractBlock.Settings.create().strength(1.6f).requiresTool(), Block::new);
    public static final Block SMOOTH_PURPUR = registerBlock("smooth_purpur",
            AbstractBlock.Settings.copy(Blocks.PURPUR_BLOCK), Block::new);
    public static final Block SMOOTH_DEEPSLATE = registerBlock("smooth_deepslate",
            AbstractBlock.Settings.copy(Blocks.DEEPSLATE).strength(3.5f,6.0f)
                    .mapColor(MapColor.IRON_GRAY), Block::new);
    public static final Block SMOOTH_BLACKSTONE = registerBlock("smooth_blackstone",
            AbstractBlock.Settings.copy(Blocks.BLACKSTONE).strength(2.0f,6.0f)
                    .mapColor(MapColor.DARK_AQUA), Block::new);
    public static final Block SMOOTH_TUFF = registerBlock("smooth_tuff",
            AbstractBlock.Settings.copy(Blocks.TUFF).strength(2.0f,6.0f)
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY), Block::new);
    public static final Block CHISELED_BRICKS = registerBlock("chiseled_bricks",
            AbstractBlock.Settings.copy(Blocks.BRICKS), Block::new);
    public static final Block CHISELED_OBSIDIAN = registerBlock("chiseled_obsidian",
            AbstractBlock.Settings.copy(Blocks.OBSIDIAN).mapColor(MapColor.PURPLE), Block::new);
    public static final Block OBSIDIAN_BRICKS = registerBlock("obsidian_bricks",
            AbstractBlock.Settings.copy(Blocks.OBSIDIAN).mapColor(MapColor.PURPLE), Block::new);
    public static final Block OBSIDIAN_PILLAR = registerBlock("obsidian_pillar",
            AbstractBlock.Settings.copy(Blocks.OBSIDIAN).mapColor(MapColor.PURPLE),PillarBlock::new);
    public static final Block CHISELED_PURPUR = registerBlock("chiseled_purpur",
            AbstractBlock.Settings.copy(Blocks.PURPUR_BLOCK), Block::new);
    public static final Block PURPUR_BRICKS = registerBlock("purpur_bricks",
            AbstractBlock.Settings.copy(Blocks.PURPUR_BLOCK), Block::new);
    public static final Block SNOW_BRICKS = registerBlock("snow_bricks",
            AbstractBlock.Settings.create().slipperiness(0.89F)
                    .strength(1.0f).resistance(0.7f).requiresTool().sounds(BlockSoundGroup.SNOW), Block::new);
    public static final Block POLISHED_STONE = registerBlock("polished_stone",
            AbstractBlock.Settings.create().strength(2.5f).resistance(6.0f).requiresTool(), Block::new);
    public static final Block STONE_TILES = registerBlock("stone_tiles",
            AbstractBlock.Settings.create().strength(1.5f).resistance(6.0f).requiresTool(), Block::new);
    public static final Block CHISELED_SNOW_BRICKS = registerBlock("chiseled_snow_bricks",
            AbstractBlock.Settings.copy(DecoBlocks.SNOW_BRICKS), Block::new);
    public static final Block CHISELED_END_STONE = registerBlock("chiseled_end_stone",
            AbstractBlock.Settings.copy(Blocks.END_STONE), Block::new);
    public static final Block VOID_STONE = registerBlock("void_stone",
            AbstractBlock.Settings.copy(Blocks.END_STONE).sounds(BlockSoundGroup.DEEPSLATE)
                    .mapColor(MapColor.TERRACOTTA_BLUE).strength(5.0F, 12.0F), Block::new);
    public static final Block VOID_STONE_BRICKS = registerBlock("void_stone_bricks",
            AbstractBlock.Settings.copy(DecoBlocks.VOID_STONE), Block::new);
    public static final Block CHISELED_VOID_STONE = registerBlock("chiseled_void_stone",
            AbstractBlock.Settings.copy(DecoBlocks.VOID_STONE).luminance(state -> 1), Block::new);
    public static final Block CUT_QUARTZ = registerBlock("cut_quartz",
            AbstractBlock.Settings.copy(Blocks.QUARTZ_BLOCK), Block::new);
    public static final Block WHITE_TERRACOTTA_BRICKS = registerBlock("white_terracotta_bricks",
            AbstractBlock.Settings.copy(Blocks.WHITE_TERRACOTTA), Block::new);
    public static final Block ORANGE_TERRACOTTA_BRICKS = registerBlock("orange_terracotta_bricks",
            AbstractBlock.Settings.copy(Blocks.ORANGE_TERRACOTTA), Block::new);
    public static final Block MAGENTA_TERRACOTTA_BRICKS = registerBlock("magenta_terracotta_bricks",
            AbstractBlock.Settings.copy(Blocks.MAGENTA_TERRACOTTA), Block::new);
    public static final Block LIGHT_BLUE_TERRACOTTA_BRICKS = registerBlock("light_blue_terracotta_bricks",
            AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_TERRACOTTA), Block::new);
    public static final Block YELLOW_TERRACOTTA_BRICKS = registerBlock("yellow_terracotta_bricks",
            AbstractBlock.Settings.copy(Blocks.YELLOW_TERRACOTTA), Block::new);
    public static final Block LIME_TERRACOTTA_BRICKS = registerBlock("lime_terracotta_bricks",
            AbstractBlock.Settings.copy(Blocks.LIME_TERRACOTTA), Block::new);
    public static final Block PINK_TERRACOTTA_BRICKS = registerBlock("pink_terracotta_bricks",
            AbstractBlock.Settings.copy(Blocks.PINK_TERRACOTTA), Block::new);
    public static final Block GRAY_TERRACOTTA_BRICKS = registerBlock("gray_terracotta_bricks",
            AbstractBlock.Settings.copy(Blocks.GRAY_TERRACOTTA), Block::new);
    public static final Block LIGHT_GRAY_TERRACOTTA_BRICKS = registerBlock("light_gray_terracotta_bricks",
            AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_TERRACOTTA), Block::new);
    public static final Block CYAN_TERRACOTTA_BRICKS = registerBlock("cyan_terracotta_bricks",
            AbstractBlock.Settings.copy(Blocks.CYAN_TERRACOTTA), Block::new);
    public static final Block PURPLE_TERRACOTTA_BRICKS = registerBlock("purple_terracotta_bricks",
            AbstractBlock.Settings.copy(Blocks.PURPLE_TERRACOTTA), Block::new);
    public static final Block BLUE_TERRACOTTA_BRICKS = registerBlock("blue_terracotta_bricks",
            AbstractBlock.Settings.copy(Blocks.BLUE_TERRACOTTA), Block::new);
    public static final Block BROWN_TERRACOTTA_BRICKS = registerBlock("brown_terracotta_bricks",
            AbstractBlock.Settings.copy(Blocks.BROWN_TERRACOTTA), Block::new);
    public static final Block GREEN_TERRACOTTA_BRICKS = registerBlock("green_terracotta_bricks",
            AbstractBlock.Settings.copy(Blocks.GREEN_TERRACOTTA), Block::new);
    public static final Block RED_TERRACOTTA_BRICKS = registerBlock("red_terracotta_bricks",
            AbstractBlock.Settings.copy(Blocks.RED_TERRACOTTA), Block::new);
    public static final Block BLACK_TERRACOTTA_BRICKS = registerBlock("black_terracotta_bricks",
            AbstractBlock.Settings.copy(Blocks.BLACK_TERRACOTTA), Block::new);
    public static final Block TERRACOTTA_BRICKS = registerBlock("terracotta_bricks",
            AbstractBlock.Settings.copy(Blocks.TERRACOTTA), Block::new);
    public static final Block HARDENED_WHITE_STAINED_GLASS = registerStainedGlass("hardened_white_stained_glass",
            DyeColor.WHITE, DecoBlocks.HARDENED_GLASS,25,100);
    public static final Block HARDENED_ORANGE_STAINED_GLASS = registerStainedGlass("hardened_orange_stained_glass",
            DyeColor.ORANGE, DecoBlocks.HARDENED_GLASS,25,100);
    public static final Block HARDENED_MAGENTA_STAINED_GLASS = registerStainedGlass("hardened_magenta_stained_glass",
            DyeColor.MAGENTA, DecoBlocks.HARDENED_GLASS,25,100);
    public static final Block HARDENED_LIGHT_BLUE_STAINED_GLASS = registerStainedGlass("hardened_light_blue_stained_glass",
            DyeColor.LIGHT_BLUE, DecoBlocks.HARDENED_GLASS,25,100);
    public static final Block HARDENED_YELLOW_STAINED_GLASS = registerStainedGlass("hardened_yellow_stained_glass",
            DyeColor.YELLOW, DecoBlocks.HARDENED_GLASS,25,100);
    public static final Block HARDENED_LIME_STAINED_GLASS = registerStainedGlass("hardened_lime_stained_glass",
            DyeColor.LIME, DecoBlocks.HARDENED_GLASS,25,100);
    public static final Block HARDENED_PINK_STAINED_GLASS = registerStainedGlass("hardened_pink_stained_glass",
            DyeColor.PINK, DecoBlocks.HARDENED_GLASS,25,100);
    public static final Block HARDENED_GRAY_STAINED_GLASS = registerStainedGlass("hardened_gray_stained_glass",
            DyeColor.GRAY, DecoBlocks.HARDENED_GLASS,25,100);
    public static final Block HARDENED_LIGHT_GRAY_STAINED_GLASS = registerStainedGlass("hardened_light_gray_stained_glass",
            DyeColor.LIGHT_GRAY, DecoBlocks.HARDENED_GLASS,25,100);
    public static final Block HARDENED_CYAN_STAINED_GLASS = registerStainedGlass("hardened_cyan_stained_glass",
            DyeColor.CYAN, DecoBlocks.HARDENED_GLASS,25,100);
    public static final Block HARDENED_PURPLE_STAINED_GLASS = registerStainedGlass("hardened_purple_stained_glass",
            DyeColor.PURPLE, DecoBlocks.HARDENED_GLASS,25,100);
    public static final Block HARDENED_BLUE_STAINED_GLASS = registerStainedGlass("hardened_blue_stained_glass",
            DyeColor.BLUE, DecoBlocks.HARDENED_GLASS,25,100);
    public static final Block HARDENED_BROWN_STAINED_GLASS = registerStainedGlass("hardened_brown_stained_glass",
            DyeColor.BROWN, DecoBlocks.HARDENED_GLASS,25,100);
    public static final Block HARDENED_GREEN_STAINED_GLASS = registerStainedGlass("hardened_green_stained_glass",
            DyeColor.GREEN, DecoBlocks.HARDENED_GLASS,25,100);
    public static final Block HARDENED_RED_STAINED_GLASS = registerStainedGlass("hardened_red_stained_glass",
            DyeColor.RED, DecoBlocks.HARDENED_GLASS,25,100);
    public static final Block HARDENED_BLACK_STAINED_GLASS = registerStainedGlass("hardened_black_stained_glass",
            DyeColor.BLACK, DecoBlocks.HARDENED_GLASS,25,100);

    public static final Block MOSAIC_WHITE_STAINED_GLASS = registerStainedGlass("mosaic_white_stained_glass",
            DyeColor.WHITE, Blocks.WHITE_STAINED_GLASS,0.6f,0.3f);
    public static final Block MOSAIC_ORANGE_STAINED_GLASS = registerStainedGlass("mosaic_orange_stained_glass",
            DyeColor.ORANGE, Blocks.ORANGE_STAINED_GLASS,0.6f,0.3f);
    public static final Block MOSAIC_MAGENTA_STAINED_GLASS = registerStainedGlass("mosaic_magenta_stained_glass",
            DyeColor.MAGENTA, Blocks.MAGENTA_STAINED_GLASS,0.6f,0.3f);
    public static final Block MOSAIC_LIGHT_BLUE_STAINED_GLASS = registerStainedGlass("mosaic_light_blue_stained_glass",
            DyeColor.LIGHT_BLUE, Blocks.LIGHT_BLUE_STAINED_GLASS,0.6f,0.3f);
    public static final Block MOSAIC_YELLOW_STAINED_GLASS = registerStainedGlass("mosaic_yellow_stained_glass",
            DyeColor.YELLOW, Blocks.YELLOW_STAINED_GLASS,0.6f,0.3f);
    public static final Block MOSAIC_LIME_STAINED_GLASS = registerStainedGlass("mosaic_lime_stained_glass",
            DyeColor.LIME, Blocks.LIME_STAINED_GLASS,0.6f,0.3f);
    public static final Block MOSAIC_PINK_STAINED_GLASS = registerStainedGlass("mosaic_pink_stained_glass",
            DyeColor.PINK, Blocks.PINK_STAINED_GLASS,0.6f,0.3f);
    public static final Block MOSAIC_GRAY_STAINED_GLASS = registerStainedGlass("mosaic_gray_stained_glass",
            DyeColor.GRAY, Blocks.GRAY_STAINED_GLASS,0.6f,0.3f);
    public static final Block MOSAIC_LIGHT_GRAY_STAINED_GLASS = registerStainedGlass("mosaic_light_gray_stained_glass",
            DyeColor.LIGHT_GRAY, Blocks.LIGHT_GRAY_STAINED_GLASS,0.6f,0.3f);
    public static final Block MOSAIC_CYAN_STAINED_GLASS = registerStainedGlass("mosaic_cyan_stained_glass",
            DyeColor.CYAN, Blocks.CYAN_STAINED_GLASS,0.6f,0.3f);
    public static final Block MOSAIC_PURPLE_STAINED_GLASS = registerStainedGlass("mosaic_purple_stained_glass",
            DyeColor.PURPLE, Blocks.PURPLE_STAINED_GLASS,0.6f,0.3f);
    public static final Block MOSAIC_BLUE_STAINED_GLASS = registerStainedGlass("mosaic_blue_stained_glass",
            DyeColor.BLUE, Blocks.BLUE_STAINED_GLASS,0.6f,0.3f);
    public static final Block MOSAIC_BROWN_STAINED_GLASS = registerStainedGlass("mosaic_brown_stained_glass",
            DyeColor.BROWN, Blocks.BROWN_STAINED_GLASS,0.6f,0.3f);
    public static final Block MOSAIC_GREEN_STAINED_GLASS = registerStainedGlass("mosaic_green_stained_glass",
            DyeColor.GREEN, Blocks.GREEN_STAINED_GLASS,0.6f,0.3f);
    public static final Block MOSAIC_RED_STAINED_GLASS = registerStainedGlass("mosaic_red_stained_glass",
            DyeColor.RED, Blocks.RED_STAINED_GLASS,0.6f,0.3f);
    public static final Block MOSAIC_BLACK_STAINED_GLASS = registerStainedGlass("mosaic_black_stained_glass",
            DyeColor.BLACK, Blocks.BLACK_STAINED_GLASS,0.6f,0.3f);

    public static final Block CUT_RED_SANDSTONE_BRICKS = registerBlock("cut_red_sandstone_bricks",
            AbstractBlock.Settings.create().strength(1.6f).requiresTool(), Block::new);
    public static final Block CHISELED_PRISMARINE_BRICKS = registerBlock("chiseled_prismarine_bricks",
            AbstractBlock.Settings.copy(Blocks.PRISMARINE).mapColor(MapColor.DIAMOND_BLUE), Block::new);
    public static final Block CRYSTALLIZED_PRISMARINE = registerBlock("crystallized_prismarine",
            AbstractBlock.Settings.copy(Blocks.PRISMARINE).mapColor(MapColor.BRIGHT_TEAL)
                    .luminance(state -> 3).sounds(BlockSoundGroup.GLASS), Block::new);
    public static final Block CRYSTALLIZED_PRISMARINE_BRICKS = registerBlock("crystallized_prismarine_bricks",
            AbstractBlock.Settings.copy(Blocks.PRISMARINE).mapColor(MapColor.BRIGHT_TEAL)
                    .luminance(state -> 3).sounds(BlockSoundGroup.GLASS), Block::new);
    public static final Block CHISELED_CRYSTALLIZED_PRISMARINE_BRICKS = registerBlock("chiseled_crystallized_prismarine_bricks",
            AbstractBlock.Settings.copy(Blocks.PRISMARINE).mapColor(MapColor.BRIGHT_TEAL)
                    .luminance(state -> 3).sounds(BlockSoundGroup.GLASS), Block::new);
    public static final Block LIGHT_PRISMARINE = registerBlock("light_prismarine",
            AbstractBlock.Settings.copy(Blocks.PRISMARINE).mapColor(MapColor.OFF_WHITE)
                    .luminance(state -> 5).sounds(BlockSoundGroup.GLASS), Block::new);
    public static final Block ICE_BRICKS = registerBlock("ice_bricks",
            AbstractBlock.Settings.copy(Blocks.PACKED_ICE).strength(1.4f), Block::new);
    public static final Block SOUL_SOILSTONE = registerBlock("soul_soilstone",
            AbstractBlock.Settings.create().strength(0.8f).requiresTool().mapColor(MapColor.BROWN), Block::new);
    public static final Block CHISELED_SOUL_SOILSTONE = registerBlock("chiseled_soul_soilstone",
            AbstractBlock.Settings.copy(DecoBlocks.SOUL_SOILSTONE), Block::new);
    public static final Block CUT_SOUL_SOILSTONE = registerBlock("cut_soul_soilstone",
            AbstractBlock.Settings.copy(DecoBlocks.SOUL_SOILSTONE), Block::new);
    public static final Block SMOOTH_SOUL_SOILSTONE = registerBlock("smooth_soul_soilstone",
            AbstractBlock.Settings.copy(DecoBlocks.SOUL_SOILSTONE), Block::new);
    public static final Block CUT_SOUL_SOILSTONE_BRICKS = registerBlock("cut_soul_soilstone_bricks",
            AbstractBlock.Settings.copy(DecoBlocks.CUT_SOUL_SOILSTONE), Block::new);
    public static final Block MAGMA_BRICKS = registerBlock("magma_bricks",
            AbstractBlock.Settings.copy(Blocks.MAGMA_BLOCK).luminance(state -> 1)
                    .strength(1.5F).sounds(BlockSoundGroup.NETHER_BRICKS), MagmaBrickBlock::new);
    public static final Block CHISELED_MAGMA_BRICKS = registerBlock("chiseled_magma_bricks",
            AbstractBlock.Settings.copy(DecoBlocks.MAGMA_BRICKS), MagmaBrickBlock::new);
    public static final Block BUBBLE_BLOCK = registerBlock("bubble_block",
            AbstractBlock.Settings.copy(Blocks.COBBLESTONE).strength(0.5F,25.0f)
                    .mapColor(MapColor.BLUE), BubbleBlock::new);
    public static final Block BUBBLE_BRICKS = registerBlock("bubble_bricks",
            AbstractBlock.Settings.copy(DecoBlocks.BUBBLE_BLOCK).strength(1.5F)
                    .mapColor(MapColor.STONE_GRAY), BubbleBlock::new);
    public static final Block CHISELED_BUBBLE_BRICKS = registerBlock("chiseled_bubble_bricks",
            AbstractBlock.Settings.copy(DecoBlocks.BUBBLE_BRICKS), BubbleBlock::new);
    public static final Block CHISELED_RED_NETHER_BRICKS = registerBlock("chiseled_red_nether_bricks",
            AbstractBlock.Settings.copy(Blocks.RED_NETHER_BRICKS), Block::new);
    public static final Block CRACKED_RED_NETHER_BRICKS = registerBlock("cracked_red_nether_bricks",
            AbstractBlock.Settings.copy(Blocks.RED_NETHER_BRICKS), Block::new);
    public static final Block BLUE_NETHER_BRICKS = registerBlock("blue_nether_bricks",
            AbstractBlock.Settings.copy(Blocks.NETHER_BRICKS).mapColor(MapColor.TEAL), Block::new);
    public static final Block CHISELED_BLUE_NETHER_BRICKS = registerBlock("chiseled_blue_nether_bricks",
            AbstractBlock.Settings.copy(DecoBlocks.BLUE_NETHER_BRICKS), Block::new);
    public static final Block CRACKED_BLUE_NETHER_BRICKS = registerBlock("cracked_blue_nether_bricks",
            AbstractBlock.Settings.copy(DecoBlocks.BLUE_NETHER_BRICKS), Block::new);
    public static final Block CUT_WHITE_CONCRETE = registerBlock("cut_white_concrete",
            AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE), Block::new);
    public static final Block CUT_ORANGE_CONCRETE = registerBlock("cut_orange_concrete",
            AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE), Block::new);
    public static final Block CUT_MAGENTA_CONCRETE = registerBlock("cut_magenta_concrete",
            AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE), Block::new);
    public static final Block CUT_LIGHT_BLUE_CONCRETE = registerBlock("cut_light_blue_concrete",
            AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE), Block::new);
    public static final Block CUT_YELLOW_CONCRETE = registerBlock("cut_yellow_concrete",
            AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE), Block::new);
    public static final Block CUT_LIME_CONCRETE = registerBlock("cut_lime_concrete",
            AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE), Block::new);
    public static final Block CUT_PINK_CONCRETE = registerBlock("cut_pink_concrete",
            AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE), Block::new);
    public static final Block CUT_GRAY_CONCRETE = registerBlock("cut_gray_concrete",
            AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE), Block::new);
    public static final Block CUT_LIGHT_GRAY_CONCRETE = registerBlock("cut_light_gray_concrete",
            AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE), Block::new);
    public static final Block CUT_CYAN_CONCRETE = registerBlock("cut_cyan_concrete",
            AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE), Block::new);
    public static final Block CUT_PURPLE_CONCRETE = registerBlock("cut_purple_concrete",
            AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE), Block::new);
    public static final Block CUT_BLUE_CONCRETE = registerBlock("cut_blue_concrete",
            AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE), Block::new);
    public static final Block CUT_BROWN_CONCRETE = registerBlock("cut_brown_concrete",
            AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE), Block::new);
    public static final Block CUT_GREEN_CONCRETE = registerBlock("cut_green_concrete",
            AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE), Block::new);
    public static final Block CUT_RED_CONCRETE = registerBlock("cut_red_concrete",
            AbstractBlock.Settings.copy(Blocks.RED_CONCRETE), Block::new);
    public static final Block CUT_BLACK_CONCRETE = registerBlock("cut_black_concrete",
            AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE), Block::new);
    public static final Block WHITE_CONCRETE_PILLAR = registerBlock("white_concrete_pillar",
            AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE),PillarBlock::new);
    public static final Block ORANGE_CONCRETE_PILLAR = registerBlock("orange_concrete_pillar",
            AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE),PillarBlock::new);
    public static final Block MAGENTA_CONCRETE_PILLAR = registerBlock("magenta_concrete_pillar",
            AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE),PillarBlock::new);
    public static final Block LIGHT_BLUE_CONCRETE_PILLAR = registerBlock("light_blue_concrete_pillar",
            AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE),PillarBlock::new);
    public static final Block YELLOW_CONCRETE_PILLAR = registerBlock("yellow_concrete_pillar",
            AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE),PillarBlock::new);
    public static final Block LIME_CONCRETE_PILLAR = registerBlock("lime_concrete_pillar",
            AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE),PillarBlock::new);
    public static final Block PINK_CONCRETE_PILLAR = registerBlock("pink_concrete_pillar",
            AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE),PillarBlock::new);
    public static final Block GRAY_CONCRETE_PILLAR = registerBlock("gray_concrete_pillar",
            AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE),PillarBlock::new);
    public static final Block LIGHT_GRAY_CONCRETE_PILLAR = registerBlock("light_gray_concrete_pillar",
            AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE),PillarBlock::new);
    public static final Block CYAN_CONCRETE_PILLAR = registerBlock("cyan_concrete_pillar",
            AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE),PillarBlock::new);
    public static final Block PURPLE_CONCRETE_PILLAR = registerBlock("purple_concrete_pillar",
            AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE),PillarBlock::new);
    public static final Block BLUE_CONCRETE_PILLAR = registerBlock("blue_concrete_pillar",
            AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE),PillarBlock::new);
    public static final Block BROWN_CONCRETE_PILLAR = registerBlock("brown_concrete_pillar",
            AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE),PillarBlock::new);
    public static final Block GREEN_CONCRETE_PILLAR = registerBlock("green_concrete_pillar",
            AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE),PillarBlock::new);
    public static final Block RED_CONCRETE_PILLAR = registerBlock("red_concrete_pillar",
            AbstractBlock.Settings.copy(Blocks.RED_CONCRETE),PillarBlock::new);
    public static final Block BLACK_CONCRETE_PILLAR = registerBlock("black_concrete_pillar",
            AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE),PillarBlock::new);
    public static final Block POLISHED_GLIDED_BLACKSTONE = registerBlock("polished_gilded_blackstone",
            AbstractBlock.Settings.copy(Blocks.GILDED_BLACKSTONE).strength(2.5f),Block::new);
    public static final Block CHISELED_GLIDED_BLACKSTONE = registerBlock("chiseled_gilded_blackstone",
            AbstractBlock.Settings.copy(DecoBlocks.POLISHED_GLIDED_BLACKSTONE),Block::new);
    public static final Block POLISHED_BLACKSTONE_TILES = registerBlock("polished_blackstone_tiles",
            AbstractBlock.Settings.create().strength(1.5f).resistance(6.0f).requiresTool().mapColor(MapColor.BLACK),Block::new);
    public static final Block BLACK_ICE = registerBlock("black_ice",
            AbstractBlock.Settings.create().slipperiness(1.18F)
                    .strength(5.6f).requiresTool().sounds(BlockSoundGroup.STONE).velocityMultiplier(0.9F)
                    .mapColor(MapColor.BLACK).pistonBehavior(PistonBehavior.BLOCK), BlackIceBlock::new);
    public static final Block WHITE_BLOCK = registerBlock("white_block",
            AbstractBlock.Settings.create().resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE).mapColor(DyeColor.WHITE), Block::new);
    public static final Block ORANGE_BLOCK = registerBlock("orange_block",
            AbstractBlock.Settings.create().resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE).mapColor(DyeColor.ORANGE), Block::new);
    public static final Block MAGENTA_BLOCK = registerBlock("magenta_block",
            AbstractBlock.Settings.create().resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE).mapColor(DyeColor.MAGENTA), Block::new);
    public static final Block LIGHT_BLUE_BLOCK = registerBlock("light_blue_block",
            AbstractBlock.Settings.create().resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE).mapColor(DyeColor.LIGHT_BLUE), Block::new);
    public static final Block YELLOW_BLOCK = registerBlock("yellow_block",
            AbstractBlock.Settings.create().resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE).mapColor(DyeColor.YELLOW), Block::new);
    public static final Block LIME_BLOCK = registerBlock("lime_block",
            AbstractBlock.Settings.create().resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE).mapColor(DyeColor.LIME), Block::new);
    public static final Block PINK_BLOCK = registerBlock("pink_block",
            AbstractBlock.Settings.create().resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE).mapColor(DyeColor.PINK), Block::new);
    public static final Block GRAY_BLOCK = registerBlock("gray_block",
            AbstractBlock.Settings.create().resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE).mapColor(DyeColor.GRAY), Block::new);
    public static final Block LIGHT_GRAY_BLOCK = registerBlock("light_gray_block",
            AbstractBlock.Settings.create().resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE).mapColor(DyeColor.LIGHT_GRAY), Block::new);
    public static final Block CYAN_BLOCK = registerBlock("cyan_block",
            AbstractBlock.Settings.create().resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE).mapColor(DyeColor.CYAN), Block::new);
    public static final Block PURPLE_BLOCK = registerBlock("purple_block",
            AbstractBlock.Settings.create().resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE).mapColor(DyeColor.PURPLE), Block::new);
    public static final Block BLUE_BLOCK = registerBlock("blue_block",
            AbstractBlock.Settings.create().resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE).mapColor(DyeColor.BLUE), Block::new);
    public static final Block BROWN_BLOCK = registerBlock("brown_block",
            AbstractBlock.Settings.create().resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE).mapColor(DyeColor.BROWN), Block::new);
    public static final Block GREEN_BLOCK = registerBlock("green_block",
            AbstractBlock.Settings.create().resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE).mapColor(DyeColor.GREEN), Block::new);
    public static final Block RED_BLOCK = registerBlock("red_block",
            AbstractBlock.Settings.create().resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE).mapColor(DyeColor.RED), Block::new);
    public static final Block BLACK_BLOCK = registerBlock("black_block",
            AbstractBlock.Settings.create().resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE).mapColor(DyeColor.BLACK), Block::new);
    public static final Block TUFF_TILES = registerBlock("tuff_tiles",
            AbstractBlock.Settings.create().strength(1.5f).resistance(6.0f).requiresTool()
                    .mapColor(MapColor.TERRACOTTA_GRAY).sounds(BlockSoundGroup.TUFF_BRICKS), Block::new);
    public static final Block CHISELED_STONE = registerBlock("chiseled_stone",
            AbstractBlock.Settings.copy(DecoBlocks.POLISHED_STONE), Block::new);
    public static final Block CHISELED_POLISHED_BLACKSTONE_BRICKS = registerBlock("chiseled_polished_blackstone_bricks",
            AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE_BRICKS), Block::new);
    public static final Block CHISELED_DEEPSLATE_BRICKS = registerBlock("chiseled_deepslate_bricks",
            AbstractBlock.Settings.copy(Blocks.DEEPSLATE_BRICKS), Block::new);

    public static final Block OAK_MOSAIC = registerBlock("oak_mosaic",
            AbstractBlock.Settings.copy(Blocks.OAK_PLANKS), Block::new);
    public static final Block SPRUCE_MOSAIC = registerBlock("spruce_mosaic",
            AbstractBlock.Settings.copy(Blocks.SPRUCE_PLANKS), PillarBlock::new);
    public static final Block BIRCH_MOSAIC = registerBlock("birch_mosaic",
            AbstractBlock.Settings.copy(Blocks.BIRCH_PLANKS), Block::new);
    public static final Block JUNGLE_MOSAIC = registerBlock("jungle_mosaic",
            AbstractBlock.Settings.copy(Blocks.JUNGLE_PLANKS), PillarBlock::new);
    public static final Block ACACIA_MOSAIC = registerBlock("acacia_mosaic",
            AbstractBlock.Settings.copy(Blocks.ACACIA_PLANKS), Block::new);
    public static final Block DARK_OAK_MOSAIC = registerBlock("dark_oak_mosaic",
            AbstractBlock.Settings.copy(Blocks.DARK_OAK_PLANKS), PillarBlock::new);
    public static final Block MANGROVE_MOSAIC = registerBlock("mangrove_mosaic",
            AbstractBlock.Settings.copy(Blocks.MANGROVE_PLANKS), Block::new);
    public static final Block CHERRY_MOSAIC = registerBlock("cherry_mosaic",
            AbstractBlock.Settings.copy(Blocks.CHERRY_PLANKS), Block::new);
    public static final Block CRIMSON_MOSAIC = registerBlock("crimson_mosaic",
            AbstractBlock.Settings.copy(Blocks.CRIMSON_PLANKS), PillarBlock::new);
    public static final Block WARPED_MOSAIC = registerBlock("warped_mosaic",
            AbstractBlock.Settings.copy(Blocks.WARPED_PLANKS), Block::new);
    public static final Block CACTUS_MOSAIC = registerBlock("cactus_mosaic",
            AbstractBlock.Settings.copy(DecoBlocks.CACTUS_PLANKS), PillarBlock::new);
    public static final Block WOODEN_MOSAIC = registerBlock("wooden_mosaic",
            AbstractBlock.Settings.copy(DecoBlocks.WOODEN_PLANKS), Block::new);

    public static final Block OAK_MOSAIC_STAIRS = registerStairs("oak_mosaic_stairs",
            DecoBlocks.OAK_MOSAIC,DecoBlocks.OAK_MOSAIC);
    public static final Block SPRUCE_MOSAIC_STAIRS = registerStairs("spruce_mosaic_stairs",
            DecoBlocks.SPRUCE_MOSAIC,DecoBlocks.SPRUCE_MOSAIC);
    public static final Block BIRCH_MOSAIC_STAIRS = registerStairs("birch_mosaic_stairs",
            DecoBlocks.BIRCH_MOSAIC,DecoBlocks.BIRCH_MOSAIC);
    public static final Block JUNGLE_MOSAIC_STAIRS = registerStairs("jungle_mosaic_stairs",
            DecoBlocks.JUNGLE_MOSAIC,DecoBlocks.JUNGLE_MOSAIC);
    public static final Block ACACIA_MOSAIC_STAIRS = registerStairs("acacia_mosaic_stairs",
            DecoBlocks.ACACIA_MOSAIC,DecoBlocks.ACACIA_MOSAIC);
    public static final Block DARK_OAK_MOSAIC_STAIRS = registerStairs("dark_oak_mosaic_stairs",
            DecoBlocks.DARK_OAK_MOSAIC,DecoBlocks.DARK_OAK_MOSAIC);
    public static final Block MANGROVE_MOSAIC_STAIRS = registerStairs("mangrove_mosaic_stairs",
            DecoBlocks.MANGROVE_MOSAIC,DecoBlocks.MANGROVE_MOSAIC);
    public static final Block CHERRY_MOSAIC_STAIRS = registerStairs("cherry_mosaic_stairs",
            DecoBlocks.CHERRY_MOSAIC,DecoBlocks.CHERRY_MOSAIC);
    public static final Block CRIMSON_MOSAIC_STAIRS = registerStairs("crimson_mosaic_stairs",
            DecoBlocks.CRIMSON_MOSAIC,DecoBlocks.CRIMSON_MOSAIC);
    public static final Block WARPED_MOSAIC_STAIRS = registerStairs("warped_mosaic_stairs",
            DecoBlocks.WARPED_MOSAIC,DecoBlocks.WARPED_MOSAIC);
    public static final Block CACTUS_MOSAIC_STAIRS = registerStairs("cactus_mosaic_stairs",
            DecoBlocks.CACTUS_MOSAIC,DecoBlocks.CACTUS_MOSAIC);
    public static final Block WOODEN_MOSAIC_STAIRS = registerStairs("wooden_mosaic_stairs",
            DecoBlocks.WOODEN_MOSAIC,DecoBlocks.WOODEN_MOSAIC);

    public static final Block OAK_MOSAIC_SLAB = registerBlock("oak_mosaic_slab",
            AbstractBlock.Settings.copy(DecoBlocks.OAK_MOSAIC),SlabBlock::new);
    public static final Block SPRUCE_MOSAIC_SLAB = registerBlock("spruce_mosaic_slab",
            AbstractBlock.Settings.copy(DecoBlocks.SPRUCE_MOSAIC),SlabBlock::new);
    public static final Block BIRCH_MOSAIC_SLAB = registerBlock("birch_mosaic_slab",
            AbstractBlock.Settings.copy(DecoBlocks.BIRCH_MOSAIC),SlabBlock::new);
    public static final Block JUNGLE_MOSAIC_SLAB = registerBlock("jungle_mosaic_slab",
            AbstractBlock.Settings.copy(DecoBlocks.JUNGLE_MOSAIC),SlabBlock::new);
    public static final Block ACACIA_MOSAIC_SLAB = registerBlock("acacia_mosaic_slab",
            AbstractBlock.Settings.copy(DecoBlocks.ACACIA_MOSAIC),SlabBlock::new);
    public static final Block DARK_OAK_MOSAIC_SLAB = registerBlock("dark_oak_mosaic_slab",
            AbstractBlock.Settings.copy(DecoBlocks.DARK_OAK_MOSAIC),SlabBlock::new);
    public static final Block MANGROVE_MOSAIC_SLAB = registerBlock("mangrove_mosaic_slab",
            AbstractBlock.Settings.copy(DecoBlocks.MANGROVE_MOSAIC),SlabBlock::new);
    public static final Block CHERRY_MOSAIC_SLAB = registerBlock("cherry_mosaic_slab",
            AbstractBlock.Settings.copy(DecoBlocks.CHERRY_MOSAIC),SlabBlock::new);
    public static final Block CRIMSON_MOSAIC_SLAB = registerBlock("crimson_mosaic_slab",
            AbstractBlock.Settings.copy(DecoBlocks.CRIMSON_MOSAIC),SlabBlock::new);
    public static final Block WARPED_MOSAIC_SLAB = registerBlock("warped_mosaic_slab",
            AbstractBlock.Settings.copy(DecoBlocks.WARPED_MOSAIC),SlabBlock::new);
    public static final Block CACTUS_MOSAIC_SLAB = registerBlock("cactus_mosaic_slab",
            AbstractBlock.Settings.copy(DecoBlocks.CACTUS_MOSAIC),SlabBlock::new);
    public static final Block WOODEN_MOSAIC_SLAB = registerBlock("wooden_mosaic_slab",
            AbstractBlock.Settings.copy(DecoBlocks.WOODEN_MOSAIC),SlabBlock::new);

    public static final Block WARPED_WART_PLANT = registerBlockWithoutItem("warped_wart_plant",
            AbstractBlock.Settings.copy(Blocks.NETHER_WART).mapColor(MapColor.BRIGHT_TEAL).nonOpaque(),
                    WarpedWartBlock::new);

    public static final Block DEEPSLATE_STAIRS = registerStairs("deepslate_stairs",
            Blocks.DEEPSLATE,Blocks.DEEPSLATE);
    public static final Block CALCITE_STAIRS = registerStairs("calcite_stairs",
            Blocks.CALCITE,Blocks.CALCITE);
    public static final Block DRIPSTONE_STAIRS = registerStairs("dripstone_stairs",
            Blocks.DRIPSTONE_BLOCK,Blocks.DRIPSTONE_BLOCK);
    public static final Block CUT_SANDSTONE_STAIRS = registerStairs("cut_sandstone_stairs",
            Blocks.CUT_SANDSTONE,Blocks.CUT_SANDSTONE);
    public static final Block SMOOTH_STONE_STAIRS = registerStairs("smooth_stone_stairs",
            Blocks.SMOOTH_STONE,Blocks.SMOOTH_STONE);
    public static final Block OBSIDIAN_STAIRS = registerStairs("obsidian_stairs",
            Blocks.OBSIDIAN,Blocks.OBSIDIAN);
    public static final Block SNOW_STAIRS = registerStairs("snow_stairs",
            Blocks.SNOW_BLOCK,Blocks.SNOW_BLOCK);
    public static final Block NETHERRACK_STAIRS = registerStairs("netherrack_stairs",
            Blocks.NETHERRACK,Blocks.NETHERRACK);
    public static final Block PACKED_MUD_STAIRS = registerStairs("packed_mud_stairs",
            Blocks.PACKED_MUD,Blocks.PACKED_MUD);
    public static final Block QUARTZ_BRICK_STAIRS = registerStairs("quartz_brick_stairs",
            Blocks.QUARTZ_BRICKS,Blocks.QUARTZ_BRICKS);
    public static final Block END_STONE_STAIRS = registerStairs("end_stone_stairs",
            Blocks.END_STONE,Blocks.END_STONE);
    public static final Block WHITE_TERRACOTTA_STAIRS = registerStairs("white_terracotta_stairs",
            Blocks.WHITE_TERRACOTTA,Blocks.WHITE_TERRACOTTA);
    public static final Block ORANGE_TERRACOTTA_STAIRS = registerStairs("orange_terracotta_stairs",
            Blocks.ORANGE_TERRACOTTA,Blocks.ORANGE_TERRACOTTA);
    public static final Block MAGENTA_TERRACOTTA_STAIRS = registerStairs("magenta_terracotta_stairs",
            Blocks.MAGENTA_TERRACOTTA,Blocks.MAGENTA_TERRACOTTA);
    public static final Block LIGHT_BLUE_TERRACOTTA_STAIRS = registerStairs("light_blue_terracotta_stairs",
            Blocks.LIGHT_BLUE_TERRACOTTA,Blocks.LIGHT_BLUE_TERRACOTTA);
    public static final Block YELLOW_TERRACOTTA_STAIRS = registerStairs("yellow_terracotta_stairs",
            Blocks.YELLOW_TERRACOTTA,Blocks.YELLOW_TERRACOTTA);
    public static final Block LIME_TERRACOTTA_STAIRS = registerStairs("lime_terracotta_stairs",
            Blocks.LIME_TERRACOTTA,Blocks.LIME_TERRACOTTA);
    public static final Block PINK_TERRACOTTA_STAIRS = registerStairs("pink_terracotta_stairs",
            Blocks.PINK_TERRACOTTA,Blocks.PINK_TERRACOTTA);
    public static final Block GRAY_TERRACOTTA_STAIRS = registerStairs("gray_terracotta_stairs",
            Blocks.GRAY_TERRACOTTA,Blocks.GRAY_TERRACOTTA);
    public static final Block LIGHT_GRAY_TERRACOTTA_STAIRS = registerStairs("light_gray_terracotta_stairs",
            Blocks.LIGHT_GRAY_TERRACOTTA,Blocks.LIGHT_GRAY_TERRACOTTA);
    public static final Block CYAN_TERRACOTTA_STAIRS = registerStairs("cyan_terracotta_stairs",
            Blocks.CYAN_TERRACOTTA,Blocks.CYAN_TERRACOTTA);
    public static final Block PURPLE_TERRACOTTA_STAIRS = registerStairs("purple_terracotta_stairs",
            Blocks.PURPLE_TERRACOTTA,Blocks.PURPLE_TERRACOTTA);
    public static final Block BLUE_TERRACOTTA_STAIRS = registerStairs("blue_terracotta_stairs",
            Blocks.BLUE_TERRACOTTA,Blocks.BLUE_TERRACOTTA);
    public static final Block BROWN_TERRACOTTA_STAIRS = registerStairs("brown_terracotta_stairs",
            Blocks.BROWN_TERRACOTTA,Blocks.BROWN_TERRACOTTA);
    public static final Block GREEN_TERRACOTTA_STAIRS = registerStairs("green_terracotta_stairs",
            Blocks.GREEN_TERRACOTTA,Blocks.GREEN_TERRACOTTA);
    public static final Block RED_TERRACOTTA_STAIRS = registerStairs("red_terracotta_stairs",
            Blocks.RED_TERRACOTTA,Blocks.RED_TERRACOTTA);
    public static final Block BLACK_TERRACOTTA_STAIRS = registerStairs("black_terracotta_stairs",
            Blocks.BLACK_TERRACOTTA,Blocks.BLACK_TERRACOTTA);
    public static final Block TERRACOTTA_STAIRS = registerStairs("terracotta_stairs",
            Blocks.TERRACOTTA,Blocks.TERRACOTTA);
    public static final Block PACKED_ICE_STAIRS = registerStairs("packed_ice_stairs",
            Blocks.PACKED_ICE,Blocks.PACKED_ICE);
    public static final Block CUT_RED_SANDSTONE_STAIRS = registerStairs("cut_red_sandstone_stairs",
            Blocks.CUT_RED_SANDSTONE,Blocks.CUT_RED_SANDSTONE);
    public static final Block MAGMA_STAIRS = registerMagmaStairs("magma_stairs",
            Blocks.MAGMA_BLOCK, Blocks.MAGMA_BLOCK);
    public static final Block WHITE_CONCRETE_STAIRS = registerStairs("white_concrete_stairs",
            Blocks.WHITE_CONCRETE,Blocks.WHITE_CONCRETE);
    public static final Block ORANGE_CONCRETE_STAIRS = registerStairs("orange_concrete_stairs",
            Blocks.ORANGE_CONCRETE,Blocks.ORANGE_CONCRETE);
    public static final Block MAGENTA_CONCRETE_STAIRS = registerStairs("magenta_concrete_stairs",
            Blocks.MAGENTA_CONCRETE,Blocks.MAGENTA_CONCRETE);
    public static final Block LIGHT_BLUE_CONCRETE_STAIRS = registerStairs("light_blue_concrete_stairs",
            Blocks.LIGHT_BLUE_CONCRETE,Blocks.LIGHT_BLUE_CONCRETE);
    public static final Block YELLOW_CONCRETE_STAIRS = registerStairs("yellow_concrete_stairs",
            Blocks.YELLOW_CONCRETE,Blocks.YELLOW_CONCRETE);
    public static final Block LIME_CONCRETE_STAIRS = registerStairs("lime_concrete_stairs",
            Blocks.LIME_CONCRETE,Blocks.LIME_CONCRETE);
    public static final Block PINK_CONCRETE_STAIRS = registerStairs("pink_concrete_stairs",
            Blocks.PINK_CONCRETE,Blocks.PINK_CONCRETE);
    public static final Block GRAY_CONCRETE_STAIRS = registerStairs("gray_concrete_stairs",
            Blocks.GRAY_CONCRETE,Blocks.GRAY_CONCRETE);
    public static final Block LIGHT_GRAY_CONCRETE_STAIRS = registerStairs("light_gray_concrete_stairs",
            Blocks.LIGHT_GRAY_CONCRETE,Blocks.LIGHT_GRAY_CONCRETE);
    public static final Block CYAN_CONCRETE_STAIRS = registerStairs("cyan_concrete_stairs",
            Blocks.CYAN_CONCRETE,Blocks.CYAN_CONCRETE);
    public static final Block PURPLE_CONCRETE_STAIRS = registerStairs("purple_concrete_stairs",
            Blocks.PURPLE_CONCRETE,Blocks.PURPLE_CONCRETE);
    public static final Block BLUE_CONCRETE_STAIRS = registerStairs("blue_concrete_stairs",
            Blocks.BLUE_CONCRETE,Blocks.BLUE_CONCRETE);
    public static final Block BROWN_CONCRETE_STAIRS = registerStairs("brown_concrete_stairs",
            Blocks.BROWN_CONCRETE,Blocks.BROWN_CONCRETE);
    public static final Block GREEN_CONCRETE_STAIRS = registerStairs("green_concrete_stairs",
            Blocks.GREEN_CONCRETE,Blocks.GREEN_CONCRETE);
    public static final Block RED_CONCRETE_STAIRS = registerStairs("red_concrete_stairs",
            Blocks.RED_CONCRETE,Blocks.RED_CONCRETE);
    public static final Block BLACK_CONCRETE_STAIRS = registerStairs("black_concrete_stairs",
            Blocks.BLACK_CONCRETE,Blocks.BLACK_CONCRETE);
    public static final Block BLUE_ICE_STAIRS = registerStairs("blue_ice_stairs",
            Blocks.BLUE_ICE,Blocks.BLUE_ICE);

    public static final Block POLISHED_STONE_STAIRS = registerStairs("polished_stone_stairs",
            DecoBlocks.POLISHED_STONE,DecoBlocks.POLISHED_STONE);
    public static final Block STONE_TILE_STAIRS = registerStairs("stone_tile_stairs",
            DecoBlocks.STONE_TILES,DecoBlocks.STONE_TILES);
    public static final Block CACTUS_PLANK_STAIRS = registerStairs("cactus_plank_stairs",
            DecoBlocks.CACTUS_PLANKS,DecoBlocks.CACTUS_PLANKS);
    public static final Block WOODEN_STAIRS = registerStairs("wooden_stairs",
            DecoBlocks.WOODEN_PLANKS,DecoBlocks.WOODEN_PLANKS);
    public static final Block CUT_SANDSTONE_BRICK_STAIRS = registerStairs("cut_sandstone_brick_stairs",
            DecoBlocks.CUT_SANDSTONE_BRICKS,DecoBlocks.CUT_SANDSTONE_BRICKS);
    public static final Block SMOOTH_PURPUR_STAIRS = registerStairs("smooth_purpur_stairs",
            DecoBlocks.SMOOTH_PURPUR,DecoBlocks.SMOOTH_PURPUR);
    public static final Block SMOOTH_DEEPSLATE_STAIRS = registerStairs("smooth_deepslate_stairs",
            DecoBlocks.SMOOTH_DEEPSLATE,DecoBlocks.SMOOTH_DEEPSLATE);
    public static final Block SMOOTH_BLACKSTONE_STAIRS = registerStairs("smooth_blackstone_stairs",
            DecoBlocks.SMOOTH_BLACKSTONE,DecoBlocks.SMOOTH_BLACKSTONE);
    public static final Block SMOOTH_TUFF_STAIRS = registerStairs("smooth_tuff_stairs",
            DecoBlocks.SMOOTH_TUFF,DecoBlocks.SMOOTH_TUFF);
    public static final Block OBSIDIAN_BRICK_STAIRS = registerStairs("obsidian_brick_stairs",
            DecoBlocks.OBSIDIAN_BRICKS,DecoBlocks.OBSIDIAN_BRICKS);
    public static final Block PURPUR_BRICK_STAIRS = registerStairs("purpur_brick_stairs",
            DecoBlocks.PURPUR_BRICKS,DecoBlocks.PURPUR_BRICKS);
    public static final Block SNOW_BRICK_STAIRS = registerStairs("snow_brick_stairs",
            DecoBlocks.SNOW_BRICKS,DecoBlocks.SNOW_BRICKS);
    public static final Block VOID_STONE_STAIRS = registerStairs("void_stone_stairs",
            DecoBlocks.VOID_STONE,DecoBlocks.VOID_STONE);
    public static final Block VOID_STONE_BRICK_STAIRS = registerStairs("void_stone_brick_stairs",
            DecoBlocks.VOID_STONE_BRICKS,DecoBlocks.VOID_STONE_BRICKS);
    public static final Block WHITE_TERRACOTTA_BRICK_STAIRS = registerStairs("white_terracotta_brick_stairs",
            DecoBlocks.WHITE_TERRACOTTA_BRICKS,DecoBlocks.WHITE_TERRACOTTA_BRICKS);
    public static final Block ORANGE_TERRACOTTA_BRICK_STAIRS = registerStairs("orange_terracotta_brick_stairs",
            DecoBlocks.ORANGE_TERRACOTTA_BRICKS,DecoBlocks.ORANGE_TERRACOTTA_BRICKS);
    public static final Block MAGENTA_TERRACOTTA_BRICK_STAIRS = registerStairs("magenta_terracotta_brick_stairs",
            DecoBlocks.MAGENTA_TERRACOTTA_BRICKS,DecoBlocks.MAGENTA_TERRACOTTA_BRICKS);
    public static final Block LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS = registerStairs("light_blue_terracotta_brick_stairs",
            DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS,DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS);
    public static final Block YELLOW_TERRACOTTA_BRICK_STAIRS = registerStairs("yellow_terracotta_brick_stairs",
            DecoBlocks.YELLOW_TERRACOTTA_BRICKS,DecoBlocks.YELLOW_TERRACOTTA_BRICKS);
    public static final Block LIME_TERRACOTTA_BRICK_STAIRS = registerStairs("lime_terracotta_brick_stairs",
            DecoBlocks.LIME_TERRACOTTA_BRICKS,DecoBlocks.LIME_TERRACOTTA_BRICKS);
    public static final Block PINK_TERRACOTTA_BRICK_STAIRS = registerStairs("pink_terracotta_brick_stairs",
            DecoBlocks.PINK_TERRACOTTA_BRICKS,DecoBlocks.PINK_TERRACOTTA_BRICKS);
    public static final Block GRAY_TERRACOTTA_BRICK_STAIRS = registerStairs("gray_terracotta_brick_stairs",
            DecoBlocks.GRAY_TERRACOTTA_BRICKS,DecoBlocks.GRAY_TERRACOTTA_BRICKS);
    public static final Block LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS = registerStairs("light_gray_terracotta_brick_stairs",
            DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS,DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS);
    public static final Block CYAN_TERRACOTTA_BRICK_STAIRS = registerStairs("cyan_terracotta_brick_stairs",
            DecoBlocks.CYAN_TERRACOTTA_BRICKS,DecoBlocks.CYAN_TERRACOTTA_BRICKS);
    public static final Block PURPLE_TERRACOTTA_BRICK_STAIRS = registerStairs("purple_terracotta_brick_stairs",
            DecoBlocks.PURPLE_TERRACOTTA_BRICKS,DecoBlocks.PURPLE_TERRACOTTA_BRICKS);
    public static final Block BLUE_TERRACOTTA_BRICK_STAIRS = registerStairs("blue_terracotta_brick_stairs",
            DecoBlocks.BLUE_TERRACOTTA_BRICKS,DecoBlocks.BLUE_TERRACOTTA_BRICKS);
    public static final Block BROWN_TERRACOTTA_BRICK_STAIRS = registerStairs("brown_terracotta_brick_stairs",
            DecoBlocks.BROWN_TERRACOTTA_BRICKS,DecoBlocks.BROWN_TERRACOTTA_BRICKS);
    public static final Block GREEN_TERRACOTTA_BRICK_STAIRS = registerStairs("green_terracotta_brick_stairs",
            DecoBlocks.GREEN_TERRACOTTA_BRICKS,DecoBlocks.GREEN_TERRACOTTA_BRICKS);
    public static final Block RED_TERRACOTTA_BRICK_STAIRS = registerStairs("red_terracotta_brick_stairs",
            DecoBlocks.RED_TERRACOTTA_BRICKS,DecoBlocks.RED_TERRACOTTA_BRICKS);
    public static final Block BLACK_TERRACOTTA_BRICK_STAIRS = registerStairs("black_terracotta_brick_stairs",
            DecoBlocks.BLACK_TERRACOTTA_BRICKS,DecoBlocks.BLACK_TERRACOTTA_BRICKS);
    public static final Block TERRACOTTA_BRICK_STAIRS = registerStairs("terracotta_brick_stairs",
            DecoBlocks.TERRACOTTA_BRICKS,DecoBlocks.TERRACOTTA_BRICKS);
    public static final Block SOUL_SOILSTONE_STAIRS = registerStairs("soul_soilstone_stairs",
            DecoBlocks.SOUL_SOILSTONE,DecoBlocks.SOUL_SOILSTONE);
    public static final Block CUT_SOUL_SOILSTONE_STAIRS = registerStairs("cut_soul_soilstone_stairs",
            DecoBlocks.CUT_SOUL_SOILSTONE,DecoBlocks.CUT_SOUL_SOILSTONE);
    public static final Block SMOOTH_SOUL_SOILSTONE_STAIRS = registerStairs("smooth_soul_soilstone_stairs",
            DecoBlocks.SMOOTH_SOUL_SOILSTONE,DecoBlocks.SMOOTH_SOUL_SOILSTONE);
    public static final Block CUT_SOUL_SOILSTONE_BRICK_STAIRS = registerStairs("cut_soul_soilstone_brick_stairs",
            DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS,DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS);
    public static final Block CUT_QUARTZ_STAIRS = registerStairs("cut_quartz_stairs",
            DecoBlocks.CUT_QUARTZ,DecoBlocks.CUT_QUARTZ);
    public static final Block ICE_BRICK_STAIRS = registerStairs("ice_brick_stairs",
            DecoBlocks.ICE_BRICKS,DecoBlocks.ICE_BRICKS);
    public static final Block CUT_WHITE_CONCRETE_STAIRS = registerStairs("cut_white_concrete_stairs",
            DecoBlocks.CUT_WHITE_CONCRETE,DecoBlocks.CUT_WHITE_CONCRETE);
    public static final Block CUT_ORANGE_CONCRETE_STAIRS = registerStairs("cut_orange_concrete_stairs",
            DecoBlocks.CUT_ORANGE_CONCRETE,DecoBlocks.CUT_ORANGE_CONCRETE);
    public static final Block CUT_MAGENTA_CONCRETE_STAIRS = registerStairs("cut_magenta_concrete_stairs",
            DecoBlocks.CUT_MAGENTA_CONCRETE,DecoBlocks.CUT_MAGENTA_CONCRETE);
    public static final Block CUT_LIGHT_BLUE_CONCRETE_STAIRS = registerStairs("cut_light_blue_concrete_stairs",
            DecoBlocks.CUT_LIGHT_BLUE_CONCRETE,DecoBlocks.CUT_LIGHT_BLUE_CONCRETE);
    public static final Block CUT_YELLOW_CONCRETE_STAIRS = registerStairs("cut_yellow_concrete_stairs",
            DecoBlocks.CUT_YELLOW_CONCRETE,DecoBlocks.CUT_YELLOW_CONCRETE);
    public static final Block CUT_LIME_CONCRETE_STAIRS = registerStairs("cut_lime_concrete_stairs",
            DecoBlocks.CUT_LIME_CONCRETE,DecoBlocks.CUT_LIME_CONCRETE);
    public static final Block CUT_PINK_CONCRETE_STAIRS = registerStairs("cut_pink_concrete_stairs",
            DecoBlocks.CUT_PINK_CONCRETE,DecoBlocks.CUT_PINK_CONCRETE);
    public static final Block CUT_GRAY_CONCRETE_STAIRS = registerStairs("cut_gray_concrete_stairs",
            DecoBlocks.CUT_GRAY_CONCRETE,DecoBlocks.CUT_GRAY_CONCRETE);
    public static final Block CUT_LIGHT_GRAY_CONCRETE_STAIRS = registerStairs("cut_light_gray_concrete_stairs",
            DecoBlocks.CUT_LIGHT_GRAY_CONCRETE,DecoBlocks.CUT_LIGHT_GRAY_CONCRETE);
    public static final Block CUT_CYAN_CONCRETE_STAIRS = registerStairs("cut_cyan_concrete_stairs",
            DecoBlocks.CUT_CYAN_CONCRETE,DecoBlocks.CUT_CYAN_CONCRETE);
    public static final Block CUT_PURPLE_CONCRETE_STAIRS = registerStairs("cut_purple_concrete_stairs",
            DecoBlocks.CUT_PURPLE_CONCRETE,DecoBlocks.CUT_PURPLE_CONCRETE);
    public static final Block CUT_BLUE_CONCRETE_STAIRS = registerStairs("cut_blue_concrete_stairs",
            DecoBlocks.CUT_BLUE_CONCRETE,DecoBlocks.CUT_BLUE_CONCRETE);
    public static final Block CUT_BROWN_CONCRETE_STAIRS = registerStairs("cut_brown_concrete_stairs",
            DecoBlocks.CUT_BROWN_CONCRETE,DecoBlocks.CUT_BROWN_CONCRETE);
    public static final Block CUT_GREEN_CONCRETE_STAIRS = registerStairs("cut_green_concrete_stairs",
            DecoBlocks.CUT_GREEN_CONCRETE,DecoBlocks.CUT_GREEN_CONCRETE);
    public static final Block CUT_RED_CONCRETE_STAIRS = registerStairs("cut_red_concrete_stairs",
            DecoBlocks.CUT_RED_CONCRETE,DecoBlocks.CUT_RED_CONCRETE);
    public static final Block CUT_BLACK_CONCRETE_STAIRS = registerStairs("cut_black_concrete_stairs",
            DecoBlocks.CUT_BLACK_CONCRETE,DecoBlocks.CUT_BLACK_CONCRETE);
    public static final Block CRYSTALLIZED_PRISMARINE_STAIRS = registerStairs("crystallized_prismarine_stairs",
            DecoBlocks.CRYSTALLIZED_PRISMARINE,DecoBlocks.CRYSTALLIZED_PRISMARINE);
    public static final Block CRYSTALLIZED_PRISMARINE_BRICK_STAIRS = registerStairs("crystallized_prismarine_brick_stairs",
            DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS,DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS);
    public static final Block LIGHT_PRISMARINE_STAIRS = registerStairs("light_prismarine_stairs",
            DecoBlocks.LIGHT_PRISMARINE,DecoBlocks.LIGHT_PRISMARINE);
    public static final Block CUT_RED_SANDSTONE_BRICK_STAIRS = registerStairs("cut_red_sandstone_brick_stairs",
            DecoBlocks.CUT_RED_SANDSTONE_BRICKS,DecoBlocks.CUT_RED_SANDSTONE_BRICKS);
    public static final Block MAGMA_BRICK_STAIRS = registerMagmaBrickStairs("magma_brick_stairs",
            DecoBlocks.MAGMA_BRICKS,DecoBlocks.MAGMA_BRICKS);
    public static final Block BUBBLE_STAIRS = registerBubbleStairs("bubble_stairs",
            DecoBlocks.BUBBLE_BLOCK,DecoBlocks.BUBBLE_BLOCK);
    public static final Block BUBBLE_BRICK_STAIRS = registerBubbleStairs("bubble_brick_stairs",
            DecoBlocks.BUBBLE_BRICKS,DecoBlocks.BUBBLE_BRICKS);
    public static final Block BLUE_NETHER_BRICK_STAIRS = registerStairs("blue_nether_brick_stairs",
            DecoBlocks.BLUE_NETHER_BRICKS,DecoBlocks.BLUE_NETHER_BRICKS);
    public static final Block POLISHED_BLACKSTONE_TILE_STAIRS = registerStairs("polished_blackstone_tile_stairs",
            DecoBlocks.POLISHED_BLACKSTONE_TILES,DecoBlocks.POLISHED_BLACKSTONE_TILES);
    public static final Block TUFF_TILE_STAIRS = registerStairs("tuff_tile_stairs",
            DecoBlocks.TUFF_TILES, DecoBlocks.TUFF_TILES);

    public static final Block DEEPSLATE_SLAB = registerBlock("deepslate_slab",
            AbstractBlock.Settings.copy(Blocks.DEEPSLATE),SlabBlock::new);
    public static final Block CALCITE_SLAB = registerBlock("calcite_slab",
            AbstractBlock.Settings.copy(Blocks.CALCITE),SlabBlock::new);
    public static final Block DRIPSTONE_SLAB = registerBlock("dripstone_slab",
            AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK),SlabBlock::new);
    public static final Block OBSIDIAN_SLAB = registerBlock("obsidian_slab",
            AbstractBlock.Settings.copy(Blocks.OBSIDIAN),SlabBlock::new);
    public static final Block SNOW_SLAB = registerBlock("snow_slab",
            AbstractBlock.Settings.copy(Blocks.SNOW_BLOCK),SlabBlock::new);
    public static final Block NETHERRACK_SLAB = registerBlock("netherrack_slab",
            AbstractBlock.Settings.copy(Blocks.NETHERRACK),SlabBlock::new);
    public static final Block PACKED_MUD_SLAB = registerBlock("packed_mud_slab",
            AbstractBlock.Settings.copy(Blocks.PACKED_MUD),SlabBlock::new);
    public static final Block END_STONE_SLAB = registerBlock("end_stone_slab",
            AbstractBlock.Settings.copy(Blocks.END_STONE),SlabBlock::new);
    public static final Block QUARTZ_BRICK_SLAB = registerBlock("quartz_brick_slab",
            AbstractBlock.Settings.copy(Blocks.QUARTZ_BRICKS),SlabBlock::new);
    public static final Block WHITE_TERRACOTTA_SLAB = registerBlock("white_terracotta_slab",
            AbstractBlock.Settings.copy(Blocks.WHITE_TERRACOTTA),SlabBlock::new);
    public static final Block ORANGE_TERRACOTTA_SLAB = registerBlock("orange_terracotta_slab",
            AbstractBlock.Settings.copy(Blocks.ORANGE_TERRACOTTA),SlabBlock::new);
    public static final Block MAGENTA_TERRACOTTA_SLAB = registerBlock("magenta_terracotta_slab",
            AbstractBlock.Settings.copy(Blocks.MAGENTA_TERRACOTTA),SlabBlock::new);
    public static final Block LIGHT_BLUE_TERRACOTTA_SLAB = registerBlock("light_blue_terracotta_slab",
            AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_TERRACOTTA),SlabBlock::new);
    public static final Block YELLOW_TERRACOTTA_SLAB = registerBlock("yellow_terracotta_slab",
            AbstractBlock.Settings.copy(Blocks.YELLOW_TERRACOTTA),SlabBlock::new);
    public static final Block LIME_TERRACOTTA_SLAB = registerBlock("lime_terracotta_slab",
            AbstractBlock.Settings.copy(Blocks.LIME_TERRACOTTA),SlabBlock::new);
    public static final Block PINK_TERRACOTTA_SLAB = registerBlock("pink_terracotta_slab",
            AbstractBlock.Settings.copy(Blocks.PINK_TERRACOTTA),SlabBlock::new);
    public static final Block GRAY_TERRACOTTA_SLAB = registerBlock("gray_terracotta_slab",
            AbstractBlock.Settings.copy(Blocks.GRAY_TERRACOTTA),SlabBlock::new);
    public static final Block LIGHT_GRAY_TERRACOTTA_SLAB = registerBlock("light_gray_terracotta_slab",
            AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_TERRACOTTA),SlabBlock::new);
    public static final Block CYAN_TERRACOTTA_SLAB = registerBlock("cyan_terracotta_slab",
            AbstractBlock.Settings.copy(Blocks.CYAN_TERRACOTTA),SlabBlock::new);
    public static final Block PURPLE_TERRACOTTA_SLAB = registerBlock("purple_terracotta_slab",
            AbstractBlock.Settings.copy(Blocks.PURPLE_TERRACOTTA),SlabBlock::new);
    public static final Block BLUE_TERRACOTTA_SLAB = registerBlock("blue_terracotta_slab",
            AbstractBlock.Settings.copy(Blocks.BLUE_TERRACOTTA),SlabBlock::new);
    public static final Block BROWN_TERRACOTTA_SLAB = registerBlock("brown_terracotta_slab",
            AbstractBlock.Settings.copy(Blocks.BROWN_TERRACOTTA),SlabBlock::new);
    public static final Block GREEN_TERRACOTTA_SLAB = registerBlock("green_terracotta_slab",
            AbstractBlock.Settings.copy(Blocks.GREEN_TERRACOTTA),SlabBlock::new);
    public static final Block RED_TERRACOTTA_SLAB = registerBlock("red_terracotta_slab",
            AbstractBlock.Settings.copy(Blocks.RED_TERRACOTTA),SlabBlock::new);
    public static final Block BLACK_TERRACOTTA_SLAB = registerBlock("black_terracotta_slab",
            AbstractBlock.Settings.copy(Blocks.BLACK_TERRACOTTA),SlabBlock::new);
    public static final Block TERRACOTTA_SLAB = registerBlock("terracotta_slab",
            AbstractBlock.Settings.copy(Blocks.TERRACOTTA),SlabBlock::new);
    public static final Block PACKED_ICE_SLAB = registerBlock("packed_ice_slab",
            AbstractBlock.Settings.copy(Blocks.PACKED_ICE),SlabBlock::new);
    public static final Block MAGMA_SLAB = registerBlock("magma_slab",
            AbstractBlock.Settings.copy(Blocks.MAGMA_BLOCK),MagmaSlabBlock::new);
    public static final Block WHITE_CONCRETE_SLAB = registerBlock("white_concrete_slab",
            AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE),SlabBlock::new);
    public static final Block ORANGE_CONCRETE_SLAB = registerBlock("orange_concrete_slab",
            AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE),SlabBlock::new);
    public static final Block MAGENTA_CONCRETE_SLAB = registerBlock("magenta_concrete_slab",
            AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE),SlabBlock::new);
    public static final Block LIGHT_BLUE_CONCRETE_SLAB = registerBlock("light_blue_concrete_slab",
            AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE),SlabBlock::new);
    public static final Block YELLOW_CONCRETE_SLAB = registerBlock("yellow_concrete_slab",
            AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE),SlabBlock::new);
    public static final Block LIME_CONCRETE_SLAB = registerBlock("lime_concrete_slab",
            AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE),SlabBlock::new);
    public static final Block PINK_CONCRETE_SLAB = registerBlock("pink_concrete_slab",
            AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE),SlabBlock::new);
    public static final Block GRAY_CONCRETE_SLAB = registerBlock("gray_concrete_slab",
            AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE),SlabBlock::new);
    public static final Block LIGHT_GRAY_CONCRETE_SLAB = registerBlock("light_gray_concrete_slab",
            AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE),SlabBlock::new);
    public static final Block CYAN_CONCRETE_SLAB = registerBlock("cyan_concrete_slab",
            AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE),SlabBlock::new);
    public static final Block PURPLE_CONCRETE_SLAB = registerBlock("purple_concrete_slab",
            AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE),SlabBlock::new);
    public static final Block BLUE_CONCRETE_SLAB = registerBlock("blue_concrete_slab",
            AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE),SlabBlock::new);
    public static final Block BROWN_CONCRETE_SLAB = registerBlock("brown_concrete_slab",
            AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE),SlabBlock::new);
    public static final Block GREEN_CONCRETE_SLAB = registerBlock("green_concrete_slab",
            AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE),SlabBlock::new);
    public static final Block RED_CONCRETE_SLAB = registerBlock("red_concrete_slab",
            AbstractBlock.Settings.copy(Blocks.RED_CONCRETE),SlabBlock::new);
    public static final Block BLACK_CONCRETE_SLAB = registerBlock("black_concrete_slab",
            AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE),SlabBlock::new);
    public static final Block BLUE_ICE_SLAB = registerBlock("blue_ice_slab",
            AbstractBlock.Settings.copy(Blocks.BLUE_ICE),SlabBlock::new);

    public static final Block POLISHED_STONE_SLAB = registerBlock("polished_stone_slab",
            AbstractBlock.Settings.copy(DecoBlocks.POLISHED_STONE),SlabBlock::new);
    public static final Block STONE_TILE_SLAB = registerBlock("stone_tile_slab",
            AbstractBlock.Settings.copy(DecoBlocks.STONE_TILES),SlabBlock::new);
    public static final Block CACTUS_PLANK_SLAB = registerBlock("cactus_plank_slab",
            AbstractBlock.Settings.copy(DecoBlocks.CACTUS_PLANKS),SlabBlock::new);
    public static final Block WOODEN_SLAB = registerBlock("wooden_slab",
            AbstractBlock.Settings.copy(DecoBlocks.WOODEN_PLANKS),SlabBlock::new);
    public static final Block CUT_SANDSTONE_BRICK_SLAB = registerBlock("cut_sandstone_brick_slab",
            AbstractBlock.Settings.copy(DecoBlocks.CUT_SANDSTONE_BRICKS),SlabBlock::new);
    public static final Block SMOOTH_PURPUR_SLAB = registerBlock("smooth_purpur_slab",
            AbstractBlock.Settings.copy(DecoBlocks.SMOOTH_PURPUR),SlabBlock::new);
    public static final Block SMOOTH_DEEPSLATE_SLAB = registerBlock("smooth_deepslate_slab",
            AbstractBlock.Settings.copy(DecoBlocks.SMOOTH_DEEPSLATE),SlabBlock::new);
    public static final Block SMOOTH_BLACKSTONE_SLAB = registerBlock("smooth_blackstone_slab",
            AbstractBlock.Settings.copy(DecoBlocks.SMOOTH_BLACKSTONE),SlabBlock::new);
    public static final Block SMOOTH_TUFF_SLAB = registerBlock("smooth_tuff_slab",
            AbstractBlock.Settings.copy(DecoBlocks.SMOOTH_TUFF),SlabBlock::new);
    public static final Block OBSIDIAN_BRICK_SLAB = registerBlock("obsidian_brick_slab",
            AbstractBlock.Settings.copy(DecoBlocks.OBSIDIAN_BRICKS),SlabBlock::new);
    public static final Block PURPUR_BRICK_SLAB = registerBlock("purpur_brick_slab",
            AbstractBlock.Settings.copy(DecoBlocks.PURPUR_BRICKS),SlabBlock::new);
    public static final Block SNOW_BRICK_SLAB = registerBlock("snow_brick_slab",
            AbstractBlock.Settings.copy(DecoBlocks.SNOW_BRICKS),SlabBlock::new);
    public static final Block VOID_STONE_SLAB = registerBlock("void_stone_slab",
            AbstractBlock.Settings.copy(DecoBlocks.VOID_STONE),SlabBlock::new);
    public static final Block VOID_STONE_BRICK_SLAB = registerBlock("void_stone_brick_slab",
            AbstractBlock.Settings.copy(DecoBlocks.VOID_STONE_BRICKS),SlabBlock::new);
    public static final Block WHITE_TERRACOTTA_BRICK_SLAB = registerBlock("white_terracotta_brick_slab",
            AbstractBlock.Settings.copy(DecoBlocks.WHITE_TERRACOTTA_BRICKS),SlabBlock::new);
    public static final Block ORANGE_TERRACOTTA_BRICK_SLAB = registerBlock("orange_terracotta_brick_slab",
            AbstractBlock.Settings.copy(DecoBlocks.ORANGE_TERRACOTTA_BRICKS),SlabBlock::new);
    public static final Block MAGENTA_TERRACOTTA_BRICK_SLAB = registerBlock("magenta_terracotta_brick_slab",
            AbstractBlock.Settings.copy(DecoBlocks.MAGENTA_TERRACOTTA_BRICKS),SlabBlock::new);
    public static final Block LIGHT_BLUE_TERRACOTTA_BRICK_SLAB = registerBlock("light_blue_terracotta_brick_slab",
            AbstractBlock.Settings.copy(DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS),SlabBlock::new);
    public static final Block YELLOW_TERRACOTTA_BRICK_SLAB = registerBlock("yellow_terracotta_brick_slab",
            AbstractBlock.Settings.copy(DecoBlocks.YELLOW_TERRACOTTA_BRICKS),SlabBlock::new);
    public static final Block LIME_TERRACOTTA_BRICK_SLAB = registerBlock("lime_terracotta_brick_slab",
            AbstractBlock.Settings.copy(DecoBlocks.LIME_TERRACOTTA_BRICKS),SlabBlock::new);
    public static final Block PINK_TERRACOTTA_BRICK_SLAB = registerBlock("pink_terracotta_brick_slab",
            AbstractBlock.Settings.copy(DecoBlocks.PINK_TERRACOTTA_BRICKS),SlabBlock::new);
    public static final Block GRAY_TERRACOTTA_BRICK_SLAB = registerBlock("gray_terracotta_brick_slab",
            AbstractBlock.Settings.copy(DecoBlocks.GRAY_TERRACOTTA_BRICKS),SlabBlock::new);
    public static final Block LIGHT_GRAY_TERRACOTTA_BRICK_SLAB = registerBlock("light_gray_terracotta_brick_slab",
            AbstractBlock.Settings.copy(DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS),SlabBlock::new);
    public static final Block CYAN_TERRACOTTA_BRICK_SLAB = registerBlock("cyan_terracotta_brick_slab",
            AbstractBlock.Settings.copy(DecoBlocks.CYAN_TERRACOTTA_BRICKS),SlabBlock::new);
    public static final Block PURPLE_TERRACOTTA_BRICK_SLAB = registerBlock("purple_terracotta_brick_slab",
            AbstractBlock.Settings.copy(DecoBlocks.PURPLE_TERRACOTTA_BRICKS),SlabBlock::new);
    public static final Block BLUE_TERRACOTTA_BRICK_SLAB = registerBlock("blue_terracotta_brick_slab",
            AbstractBlock.Settings.copy(DecoBlocks.BLUE_TERRACOTTA_BRICKS),SlabBlock::new);
    public static final Block BROWN_TERRACOTTA_BRICK_SLAB = registerBlock("brown_terracotta_brick_slab",
            AbstractBlock.Settings.copy(DecoBlocks.BROWN_TERRACOTTA_BRICKS),SlabBlock::new);
    public static final Block GREEN_TERRACOTTA_BRICK_SLAB = registerBlock("green_terracotta_brick_slab",
            AbstractBlock.Settings.copy(DecoBlocks.GREEN_TERRACOTTA_BRICKS),SlabBlock::new);
    public static final Block RED_TERRACOTTA_BRICK_SLAB = registerBlock("red_terracotta_brick_slab",
            AbstractBlock.Settings.copy(DecoBlocks.RED_TERRACOTTA_BRICKS),SlabBlock::new);
    public static final Block BLACK_TERRACOTTA_BRICK_SLAB = registerBlock("black_terracotta_brick_slab",
            AbstractBlock.Settings.copy(DecoBlocks.BLACK_TERRACOTTA_BRICKS),SlabBlock::new);
    public static final Block TERRACOTTA_BRICK_SLAB = registerBlock("terracotta_brick_slab",
            AbstractBlock.Settings.copy(DecoBlocks.TERRACOTTA_BRICKS),SlabBlock::new);
    public static final Block SOUL_SOILSTONE_SLAB = registerBlock("soul_soilstone_slab",
            AbstractBlock.Settings.copy(DecoBlocks.SOUL_SOILSTONE),SlabBlock::new);
    public static final Block CUT_SOUL_SOILSTONE_SLAB = registerBlock("cut_soul_soilstone_slab",
            AbstractBlock.Settings.copy(DecoBlocks.CUT_SOUL_SOILSTONE),SlabBlock::new);
    public static final Block SMOOTH_SOUL_SOILSTONE_SLAB = registerBlock("smooth_soul_soilstone_slab",
            AbstractBlock.Settings.copy(DecoBlocks.SMOOTH_SOUL_SOILSTONE),SlabBlock::new);
    public static final Block CUT_SOUL_SOILSTONE_BRICK_SLAB = registerBlock("cut_soul_soilstone_brick_slab",
            AbstractBlock.Settings.copy(DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS),SlabBlock::new);
    public static final Block CUT_QUARTZ_SLAB = registerBlock("cut_quartz_slab",
            AbstractBlock.Settings.copy(DecoBlocks.CUT_QUARTZ),SlabBlock::new);
    public static final Block ICE_BRICK_SLAB = registerBlock("ice_brick_slab",
            AbstractBlock.Settings.copy(DecoBlocks.ICE_BRICKS),SlabBlock::new);
    public static final Block CUT_WHITE_CONCRETE_SLAB = registerBlock("cut_white_concrete_slab",
            AbstractBlock.Settings.copy(DecoBlocks.CUT_WHITE_CONCRETE),SlabBlock::new);
    public static final Block CUT_ORANGE_CONCRETE_SLAB = registerBlock("cut_orange_concrete_slab",
            AbstractBlock.Settings.copy(DecoBlocks.CUT_ORANGE_CONCRETE),SlabBlock::new);
    public static final Block CUT_MAGENTA_CONCRETE_SLAB = registerBlock("cut_magenta_concrete_slab",
            AbstractBlock.Settings.copy(DecoBlocks.CUT_MAGENTA_CONCRETE),SlabBlock::new);
    public static final Block CUT_LIGHT_BLUE_CONCRETE_SLAB = registerBlock("cut_light_blue_concrete_slab",
            AbstractBlock.Settings.copy(DecoBlocks.CUT_LIGHT_BLUE_CONCRETE),SlabBlock::new);
    public static final Block CUT_YELLOW_CONCRETE_SLAB = registerBlock("cut_yellow_concrete_slab",
            AbstractBlock.Settings.copy(DecoBlocks.CUT_YELLOW_CONCRETE),SlabBlock::new);
    public static final Block CUT_LIME_CONCRETE_SLAB = registerBlock("cut_lime_concrete_slab",
            AbstractBlock.Settings.copy(DecoBlocks.CUT_LIME_CONCRETE),SlabBlock::new);
    public static final Block CUT_PINK_CONCRETE_SLAB = registerBlock("cut_pink_concrete_slab",
            AbstractBlock.Settings.copy(DecoBlocks.CUT_PINK_CONCRETE),SlabBlock::new);
    public static final Block CUT_GRAY_CONCRETE_SLAB = registerBlock("cut_gray_concrete_slab",
            AbstractBlock.Settings.copy(DecoBlocks.CUT_GRAY_CONCRETE),SlabBlock::new);
    public static final Block CUT_LIGHT_GRAY_CONCRETE_SLAB = registerBlock("cut_light_gray_concrete_slab",
            AbstractBlock.Settings.copy(DecoBlocks.CUT_LIGHT_GRAY_CONCRETE),SlabBlock::new);
    public static final Block CUT_CYAN_CONCRETE_SLAB = registerBlock("cut_cyan_concrete_slab",
            AbstractBlock.Settings.copy(DecoBlocks.CUT_CYAN_CONCRETE),SlabBlock::new);
    public static final Block CUT_PURPLE_CONCRETE_SLAB = registerBlock("cut_purple_concrete_slab",
            AbstractBlock.Settings.copy(DecoBlocks.CUT_PURPLE_CONCRETE),SlabBlock::new);
    public static final Block CUT_BLUE_CONCRETE_SLAB = registerBlock("cut_blue_concrete_slab",
            AbstractBlock.Settings.copy(DecoBlocks.CUT_BLUE_CONCRETE),SlabBlock::new);
    public static final Block CUT_BROWN_CONCRETE_SLAB = registerBlock("cut_brown_concrete_slab",
            AbstractBlock.Settings.copy(DecoBlocks.CUT_BROWN_CONCRETE),SlabBlock::new);
    public static final Block CUT_GREEN_CONCRETE_SLAB = registerBlock("cut_green_concrete_slab",
            AbstractBlock.Settings.copy(DecoBlocks.CUT_GREEN_CONCRETE),SlabBlock::new);
    public static final Block CUT_RED_CONCRETE_SLAB = registerBlock("cut_red_concrete_slab",
            AbstractBlock.Settings.copy(DecoBlocks.CUT_RED_CONCRETE),SlabBlock::new);
    public static final Block CUT_BLACK_CONCRETE_SLAB = registerBlock("cut_black_concrete_slab",
            AbstractBlock.Settings.copy(DecoBlocks.CUT_BLACK_CONCRETE),SlabBlock::new);
    public static final Block CRYSTALLIZED_PRISMARINE_SLAB = registerBlock("crystallized_prismarine_slab",
            AbstractBlock.Settings.copy(DecoBlocks.CRYSTALLIZED_PRISMARINE),SlabBlock::new);
    public static final Block CRYSTALLIZED_PRISMARINE_BRICK_SLAB = registerBlock("crystallized_prismarine_brick_slab",
            AbstractBlock.Settings.copy(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS),SlabBlock::new);
    public static final Block LIGHT_PRISMARINE_SLAB = registerBlock("light_prismarine_slab",
            AbstractBlock.Settings.copy(DecoBlocks.LIGHT_PRISMARINE),SlabBlock::new);
    public static final Block CUT_RED_SANDSTONE_BRICK_SLAB = registerBlock("cut_red_sandstone_brick_slab",
            AbstractBlock.Settings.copy(DecoBlocks.CUT_RED_SANDSTONE_BRICKS),SlabBlock::new);
    public static final Block MAGMA_BRICK_SLAB = registerBlock("magma_brick_slab",
            AbstractBlock.Settings.copy(DecoBlocks.MAGMA_BRICKS),MagmaBrickSlabBlock::new);
    public static final Block BUBBLE_SLAB = registerBlock("bubble_slab",
            AbstractBlock.Settings.copy(DecoBlocks.BUBBLE_BLOCK),BubbleSlabBlock::new);
    public static final Block BUBBLE_BRICK_SLAB = registerBlock("bubble_brick_slab",
            AbstractBlock.Settings.copy(DecoBlocks.BUBBLE_BRICKS),BubbleSlabBlock::new);
    public static final Block BLUE_NETHER_BRICK_SLAB = registerBlock("blue_nether_brick_slab",
            AbstractBlock.Settings.copy(DecoBlocks.BLUE_NETHER_BRICKS),SlabBlock::new);
    public static final Block POLISHED_BLACKSTONE_TILE_SLAB = registerBlock("polished_blackstone_tile_slab",
            AbstractBlock.Settings.copy(DecoBlocks.POLISHED_BLACKSTONE_TILES),SlabBlock::new);
    public static final Block TUFF_TILE_SLAB = registerBlock("tuff_tile_slab",
            AbstractBlock.Settings.copy(DecoBlocks.TUFF_TILES),SlabBlock::new);

    public static final Block WOODEN_SAPLING = registerBlock("wooden_sapling",
            new SaplingBlock(DecoSaplingGenerators.WOODEN ,AbstractBlock.Settings.copy(Blocks.OAK_SAPLING)));
    public static final Block POTTED_WOODEN_SAPLING = registerBlockWithoutItem("potted_wooden_sapling",
            WOODEN_SAPLING,Blocks.POTTED_OAK_SAPLING)));

    public static final Block WOODEN_LEAVES = registerBlock("wooden_leaves",
            AbstractBlock.Settings.copy(Blocks.DARK_OAK_LEAVES), LeavesBlock::new);

    public static final Block PUFFY_DANDELION = registerBlock("puffy_dandelion",
            new PuffyDandelionBlock(StatusEffects.SATURATION, 3,AbstractBlock.Settings.copy(Blocks.DANDELION)));
    public static final Block POTTED_PUFFY_DANDELION = registerFlowerPot("potted_puffy_dandelion",
            PUFFY_DANDELION,Blocks.POTTED_DANDELION);

    public static final Block CALIFORNIA_POPPY = registerBlock("california_poppy",
            new FlowerBlock(StatusEffects.NIGHT_VISION, 7,AbstractBlock.Settings.copy(Blocks.POPPY)));
    public static final Block POTTED_CALIFORNIA_POPPY = registerFlowerPot("potted_california_poppy",
            CALIFORNIA_POPPY,Blocks.POTTED_POPPY);
    public static final Block SALMON_POPPY = registerBlock("salmon_poppy",
            new FlowerBlock(StatusEffects.BLINDNESS, 5,AbstractBlock.Settings.copy(Blocks.POPPY)));
    public static final Block POTTED_SALMON_POPPY = registerFlowerPot("potted_salmon_poppy",
            SALMON_POPPY,Blocks.POTTED_POPPY);

    public static final Block YELLOW_ORCHID = registerBlock("yellow_orchid",
            new FlowerBlock(StatusEffects.SATURATION, 5,AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_YELLOW_ORCHID = registerFlowerPot("potted_yellow_orchid",
            YELLOW_ORCHID,Blocks.POTTED_BLUE_ORCHID);
    public static final Block WHITE_ORCHID = registerBlock("white_orchid",
            new FlowerBlock(StatusEffects.GLOWING, 5,AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_WHITE_ORCHID = registerFlowerPot("potted_white_orchid",
            WHITE_ORCHID,Blocks.POTTED_BLUE_ORCHID);
    public static final Block PINK_ORCHID = registerBlock("pink_orchid",
            new FlowerBlock(StatusEffects.SLOW_FALLING, 7,AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_PINK_ORCHID = registerFlowerPot("potted_pink_orchid",
            PINK_ORCHID,Blocks.POTTED_BLUE_ORCHID);

    public static final Block YELLOW_TULIP = registerBlock("yellow_tulip",
            new FlowerBlock(StatusEffects.WEAKNESS, 9,AbstractBlock.Settings.copy(Blocks.RED_TULIP)));
    public static final Block POTTED_YELLOW_TULIP = registerFlowerPot("potted_yellow_tulip",
            YELLOW_TULIP,Blocks.POTTED_RED_TULIP);
    public static final Block PURPLE_TULIP = registerBlock("purple_tulip",
            new FlowerBlock(StatusEffects.WEAKNESS, 9,AbstractBlock.Settings.copy(Blocks.RED_TULIP)));
    public static final Block POTTED_PURPLE_TULIP = registerFlowerPot("potted_purple_tulip",
            PURPLE_TULIP,Blocks.POTTED_RED_TULIP);
    public static final Block MAGENTA_TULIP = registerBlock("magenta_tulip",
            new FlowerBlock(StatusEffects.WEAKNESS, 9,AbstractBlock.Settings.copy(Blocks.RED_TULIP)));
    public static final Block POTTED_MAGENTA_TULIP = registerFlowerPot("potted_magenta_tulip",
            MAGENTA_TULIP,Blocks.POTTED_RED_TULIP);
    public static final Block BLUE_TULIP = registerBlock("blue_tulip",
            new FlowerBlock(StatusEffects.WEAKNESS, 9,AbstractBlock.Settings.copy(Blocks.RED_TULIP)));
    public static final Block POTTED_BLUE_TULIP = registerFlowerPot("potted_blue_tulip",
            BLUE_TULIP,Blocks.POTTED_RED_TULIP);

    public static final Block BLACK_TULIP = registerBlock("black_tulip",
            new FlowerBlock(StatusEffects.WEAKNESS, 18,AbstractBlock.Settings.copy(Blocks.RED_TULIP)));
    public static final Block POTTED_BLACK_TULIP = registerFlowerPot("potted_black_tulip",
            BLACK_TULIP,Blocks.POTTED_RED_TULIP);
    public static final Block GREEN_TULIP = registerBlock("green_tulip",
            new FlowerBlock(StatusEffects.WEAKNESS, 18,AbstractBlock.Settings.copy(Blocks.RED_TULIP)));
    public static final Block POTTED_GREEN_TULIP = registerFlowerPot("potted_green_tulip",
            GREEN_TULIP,Blocks.POTTED_RED_TULIP);
    public static final Block CYAN_TULIP = registerBlock("cyan_tulip",
            new FlowerBlock(StatusEffects.WEAKNESS, 18,AbstractBlock.Settings.copy(Blocks.RED_TULIP)));
    public static final Block POTTED_CYAN_TULIP = registerFlowerPot("potted_cyan_tulip",
            CYAN_TULIP,Blocks.POTTED_RED_TULIP);

    public static final Block BARBERTON_DAISY = registerBlock("barberton_daisy",
            new FlowerBlock(StatusEffects.INSTANT_HEALTH, 1,AbstractBlock.Settings.copy(Blocks.OXEYE_DAISY)));
    public static final Block POTTED_BARBERTON_DAISY = registerFlowerPot("potted_barberton_daisy",
            BARBERTON_DAISY,Blocks.POTTED_OXEYE_DAISY);
    public static final Block BLUE_EYED_DAISY = registerBlock("blue_eyed_daisy",
            new FlowerBlock(StatusEffects.NIGHT_VISION, 7,AbstractBlock.Settings.copy(Blocks.OXEYE_DAISY)));
    public static final Block POTTED_BLUE_EYED_DAISY = registerFlowerPot("potted_blue_eyed_daisy",
            BLUE_EYED_DAISY,Blocks.POTTED_OXEYE_DAISY);
    public static final Block GERBERA_DAISY = registerBlock("gerbera_daisy",
            new FlowerBlock(StatusEffects.REGENERATION, 5,AbstractBlock.Settings.copy(Blocks.OXEYE_DAISY)));
    public static final Block POTTED_GERBERA_DAISY = registerFlowerPot("potted_gerbera_daisy",
            GERBERA_DAISY,Blocks.POTTED_OXEYE_DAISY);
    public static final Block MICHAELMAS_DAISY = registerBlock("michaelmas_daisy",
            new FlowerBlock(StatusEffects.RESISTANCE, 7,AbstractBlock.Settings.copy(Blocks.OXEYE_DAISY)));
    public static final Block POTTED_MICHAELMAS_DAISY = registerFlowerPot("potted_michaelmas_daisy",
            MICHAELMAS_DAISY,Blocks.POTTED_OXEYE_DAISY);

    public static final Block PAEONIA = registerBlock("paeonia",
            new FlowerBlock(StatusEffects.SLOWNESS,7,AbstractBlock.Settings.copy(Blocks.POPPY)));
    public static final Block POTTED_PAEONIA = registerFlowerPot("potted_paeonia",
            PAEONIA,Blocks.POTTED_POPPY);

    public static final Block LAVENDER = registerBlock("lavender",
            new FlowerBlock(StatusEffects.HASTE,5,AbstractBlock.Settings.copy(Blocks.POPPY)));
    public static final Block POTTED_LAVENDER = registerFlowerPot("potted_lavender",
            LAVENDER,Blocks.POTTED_POPPY);

    public static final Block ROSE = registerBlock("rose",
            new FlowerBlock(StatusEffects.POISON, 4,AbstractBlock.Settings.copy(Blocks.POPPY)));
    public static final Block POTTED_ROSE = registerFlowerPot("potted_rose",
            ROSE,Blocks.POTTED_POPPY);
    public static final Block ENDER_ROSE = registerBlock("ender_rose",
            new EnderRoseBlock(StatusEffects.LEVITATION, 8.0F, AbstractBlock.Settings.copy(Blocks.POPPY)));
    public static final Block POTTED_ENDER_ROSE = registerFlowerPot("potted_ender_rose",
            ENDER_ROSE,Blocks.POTTED_POPPY);

    public static final Block ANCIENT_ROSE_CROP = registerBlockWithoutItem("ancient_rose_crop",
            AbstractBlock.Settings.copy(Blocks.TORCHFLOWER_CROP).nonOpaque(), AncientRoseBlock::new);

    public static final Block MIGHTY_LAVENDER_CROP = registerBlockWithoutItem("mighty_lavender_crop",
                    AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly()
                            .sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY), Block::new);

    public static final Block ANCIENT_ROSE = registerBlock("ancient_rose",
            new FlowerBlock(StatusEffects.POISON, 4,AbstractBlock.Settings.copy(Blocks.POPPY)));
    public static final Block POTTED_ANCIENT_ROSE = registerFlowerPot("potted_ancient_rose",
            ANCIENT_ROSE,Blocks.POTTED_POPPY);

    public static final Block MIGHTY_LAVENDER = registerBlock("mighty_lavender",
            AbstractBlock.Settings.copy(Blocks.PEONY), MightyLavenderBlock::new);

    public static final Block SPRUCE_CRAFTING_TABLE = registerBlock("spruce_crafting_table",
            AbstractBlock.Settings.copy(Blocks.CRAFTING_TABLE).mapColor(MapColor.SPRUCE_BROWN), SpruceCraftingTableBlock::new);
    public static final Block BIRCH_CRAFTING_TABLE = registerBlock("birch_crafting_table",
            AbstractBlock.Settings.copy(Blocks.CRAFTING_TABLE).mapColor(MapColor.PALE_YELLOW), BirchCraftingTableBlock::new);
    public static final Block JUNGLE_CRAFTING_TABLE = registerBlock("jungle_crafting_table",
            AbstractBlock.Settings.copy(Blocks.CRAFTING_TABLE).mapColor(MapColor.DIRT_BROWN), JungleCraftingTableBlock::new);
    public static final Block ACACIA_CRAFTING_TABLE = registerBlock("acacia_crafting_table",
            AbstractBlock.Settings.copy(Blocks.CRAFTING_TABLE).mapColor(MapColor.GRAY), AcaciaCraftingTableBlock::new);
    public static final Block DARK_OAK_CRAFTING_TABLE = registerBlock("dark_oak_crafting_table",
            AbstractBlock.Settings.copy(Blocks.CRAFTING_TABLE).mapColor(MapColor.BROWN), DarkOakCraftingTableBlock::new);
    public static final Block MANGROVE_CRAFTING_TABLE = registerBlock("mangrove_crafting_table",
            AbstractBlock.Settings.copy(Blocks.CRAFTING_TABLE).mapColor(MapColor.RED), MangroveCraftingTableBlock::new);
    public static final Block BAMBOO_CRAFTING_TABLE = registerBlock("bamboo_crafting_table",
            AbstractBlock.Settings.copy(Blocks.CRAFTING_TABLE).mapColor(MapColor.GREEN).sounds(BlockSoundGroup.BAMBOO_WOOD),
                BambooCraftingTableBlock::new);
    public static final Block CHERRY_CRAFTING_TABLE = registerBlock("cherry_crafting_table",
            AbstractBlock.Settings.copy(Blocks.CRAFTING_TABLE).mapColor(MapColor.TERRACOTTA_GRAY).sounds(BlockSoundGroup.CHERRY_WOOD),
                CherryCraftingTableBlock::new);
    public static final Block CRIMSON_CRAFTING_TABLE = registerBlock("crimson_crafting_table",
            AbstractBlock.Settings.copy(Blocks.CRAFTING_TABLE).mapColor(MapColor.DULL_PINK).sounds(BlockSoundGroup.NETHER_WOOD),
                CrimsonCraftingTableBlock::new);
    public static final Block WARPED_CRAFTING_TABLE = registerBlock("warped_crafting_table",
            AbstractBlock.Settings.copy(Blocks.CRAFTING_TABLE).mapColor(MapColor.TEAL).sounds(BlockSoundGroup.NETHER_WOOD),
                WarpedCraftingTableBlock::new);
    public static final Block CACTUS_CRAFTING_TABLE = registerBlock("cactus_crafting_table",
            AbstractBlock.Settings.copy(Blocks.CRAFTING_TABLE).mapColor(MapColor.DARK_GREEN), CactusCraftingTableBlock::new);
    public static final Block WOODEN_CRAFTING_TABLE = registerBlock("wooden_crafting_table",
            AbstractBlock.Settings.copy(Blocks.CRAFTING_TABLE).mapColor(MapColor.TERRACOTTA_BROWN), WoodenCraftingTableBlock::new);

    public static final Block DEEPSLATE_FURNACE = registerBlock("deepslate_furnace",
            AbstractBlock.Settings.copy(Blocks.FURNACE).mapColor(MapColor.DEEPSLATE_GRAY)
                    .strength(4.5f).sounds(BlockSoundGroup.DEEPSLATE), DeepslateFurnaceBlock::new);
    public static final Block BLACKSTONE_FURNACE = registerBlock("blackstone_furnace",
            AbstractBlock.Settings.copy(Blocks.FURNACE).mapColor(MapColor.BLACK)
                    .strength(3.0f), BlackstoneFurnaceBlock::new);
    public static final Block TUFF_FURNACE = registerBlock("tuff_furnace",
            AbstractBlock.Settings.copy(Blocks.FURNACE).mapColor(MapColor.TERRACOTTA_GRAY)
                    .strength(3.0f).sounds(BlockSoundGroup.TUFF),TuffFurnaceBlock::new);

    public static final Block SPRUCE_LADDER = registerBlock("spruce_ladder",
            AbstractBlock.Settings.copy(Blocks.LADDER),LadderBlock::new);
    public static final Block BIRCH_LADDER = registerBlock("birch_ladder",
            AbstractBlock.Settings.copy(Blocks.LADDER),LadderBlock::new);
    public static final Block JUNGLE_LADDER = registerBlock("jungle_ladder",
            AbstractBlock.Settings.copy(Blocks.LADDER),LadderBlock::new);
    public static final Block ACACIA_LADDER = registerBlock("acacia_ladder",
            AbstractBlock.Settings.copy(Blocks.LADDER),LadderBlock::new);
    public static final Block DARK_OAK_LADDER = registerBlock("dark_oak_ladder",
            AbstractBlock.Settings.copy(Blocks.LADDER),LadderBlock::new);
    public static final Block MANGROVE_LADDER = registerBlock("mangrove_ladder",
            AbstractBlock.Settings.copy(Blocks.LADDER),LadderBlock::new);
    public static final Block CRIMSON_LADDER = registerBlock("crimson_ladder",
            AbstractBlock.Settings.copy(Blocks.LADDER)
                    .sounds(BlockSoundGroup.NETHER_WOOD),LadderBlock::new);
    public static final Block WARPED_LADDER = registerBlock("warped_ladder",
            AbstractBlock.Settings.copy(Blocks.LADDER)
                    .sounds(BlockSoundGroup.NETHER_WOOD),LadderBlock::new);
    public static final Block BAMBOO_LADDER = registerBlock("bamboo_ladder",
            AbstractBlock.Settings.copy(Blocks.LADDER)
                    .sounds(BlockSoundGroup.BAMBOO_WOOD),LadderBlock::new);
    public static final Block CHERRY_LADDER = registerBlock("cherry_ladder",
            AbstractBlock.Settings.copy(Blocks.LADDER)
                    .sounds(BlockSoundGroup.CHERRY_WOOD),LadderBlock::new);
    public static final Block CACTUS_LADDER = registerBlock("cactus_ladder",
            AbstractBlock.Settings.copy(Blocks.LADDER),LadderBlock::new);
    public static final Block WOODEN_LADDER = registerBlock("wooden_ladder",
            AbstractBlock.Settings.copy(Blocks.LADDER),LadderBlock::new);

    public static final Block CACTUS_PLANK_FENCE = registerBlock("cactus_plank_fence",
            AbstractBlock.Settings.copy(DecoBlocks.CACTUS_PLANKS),FenceBlock::new);
    public static final Block WOODEN_FENCE = registerBlock("wooden_fence",
            AbstractBlock.Settings.copy(DecoBlocks.WOODEN_PLANKS),FenceBlock::new);
    public static final Block RED_NETHER_BRICK_FENCE = registerBlock("red_nether_brick_fence",
            AbstractBlock.Settings.copy(Blocks.RED_NETHER_BRICKS),FenceBlock::new);
    public static final Block BLUE_NETHER_BRICK_FENCE = registerBlock("blue_nether_brick_fence",
            AbstractBlock.Settings.copy(DecoBlocks.BLUE_NETHER_BRICKS),FenceBlock::new);

    public static final Block LIGHT_IRON_BARS = registerBlock("light_iron_bars",
            AbstractBlock.Settings.copy(Blocks.IRON_BARS).strength(2.5f,6.0f),PaneBlock::new);

    public static final Block LIGHT_COPPER_BARS = registerBlock("light_copper_bars",
            new OxidizablePaneBlock(Oxidizable.OxidationLevel.UNAFFECTED,AbstractBlock.Settings.copy(DecoBlocks.LIGHT_IRON_BARS)
                    .sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_LIGHT_COPPER_BARS = registerBlock("waxed_light_copper_bars",
            AbstractBlock.Settings.copy(DecoBlocks.LIGHT_COPPER_BARS),PaneBlock::new);
    public static final Block EXPOSED_LIGHT_COPPER_BARS = registerBlock("exposed_light_copper_bars",
            new OxidizablePaneBlock(Oxidizable.OxidationLevel.EXPOSED,AbstractBlock.Settings.copy(DecoBlocks.LIGHT_IRON_BARS)
                    .sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_EXPOSED_LIGHT_COPPER_BARS = registerBlock("waxed_exposed_light_copper_bars",
            AbstractBlock.Settings.copy(DecoBlocks.EXPOSED_LIGHT_COPPER_BARS),PaneBlock::new);
    public static final Block WEATHERED_LIGHT_COPPER_BARS = registerBlock("weathered_light_copper_bars",
            new OxidizablePaneBlock(Oxidizable.OxidationLevel.WEATHERED,AbstractBlock.Settings.copy(DecoBlocks.LIGHT_IRON_BARS)
                    .sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_WEATHERED_LIGHT_COPPER_BARS = registerBlock("waxed_weathered_light_copper_bars",
            AbstractBlock.Settings.copy(DecoBlocks.WEATHERED_LIGHT_COPPER_BARS),PaneBlock::new);
    public static final Block OXIDIZED_LIGHT_COPPER_BARS = registerBlock("oxidized_light_copper_bars",
            new OxidizablePaneBlock(Oxidizable.OxidationLevel.OXIDIZED,AbstractBlock.Settings.copy(DecoBlocks.LIGHT_IRON_BARS)
                    .sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_OXIDIZED_LIGHT_COPPER_BARS = registerBlock("waxed_oxidized_light_copper_bars",
            AbstractBlock.Settings.copy(DecoBlocks.OXIDIZED_LIGHT_COPPER_BARS),PaneBlock::new);

    public static final Block COPPER_BARS = registerBlock("copper_bars",
            new OxidizablePaneBlock(Oxidizable.OxidationLevel.UNAFFECTED,AbstractBlock.Settings.copy(Blocks.IRON_BARS)
                    .sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_COPPER_BARS = registerBlock("waxed_copper_bars",
            AbstractBlock.Settings.copy(DecoBlocks.COPPER_BARS),PaneBlock::new);
    public static final Block EXPOSED_COPPER_BARS = registerBlock("exposed_copper_bars",
            new OxidizablePaneBlock(Oxidizable.OxidationLevel.EXPOSED,AbstractBlock.Settings.copy(Blocks.IRON_BARS)
                    .sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_EXPOSED_COPPER_BARS = registerBlock("waxed_exposed_copper_bars",
            AbstractBlock.Settings.copy(DecoBlocks.EXPOSED_COPPER_BARS),PaneBlock::new);
    public static final Block WEATHERED_COPPER_BARS = registerBlock("weathered_copper_bars",
            new OxidizablePaneBlock(Oxidizable.OxidationLevel.WEATHERED,AbstractBlock.Settings.copy(Blocks.IRON_BARS)
                    .sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_WEATHERED_COPPER_BARS = registerBlock("waxed_weathered_copper_bars",
            AbstractBlock.Settings.copy(DecoBlocks.WEATHERED_COPPER_BARS),PaneBlock::new);
    public static final Block OXIDIZED_COPPER_BARS = registerBlock("oxidized_copper_bars",
            new OxidizablePaneBlock(Oxidizable.OxidationLevel.OXIDIZED,AbstractBlock.Settings.copy(Blocks.IRON_BARS)
                    .sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_OXIDIZED_COPPER_BARS = registerBlock("waxed_oxidized_copper_bars",
            AbstractBlock.Settings.copy(DecoBlocks.OXIDIZED_COPPER_BARS),PaneBlock::new);

    public static final Block HEAVY_IRON_BARS = registerBlock("heavy_iron_bars",
            AbstractBlock.Settings.copy(Blocks.IRON_BARS).strength(10.0f,12.0f)
                    .mapColor(MapColor.IRON_GRAY),PaneBlock::new);

    public static final Block HEAVY_COPPER_BARS = registerBlock("heavy_copper_bars",
            new OxidizablePaneBlock(Oxidizable.OxidationLevel.UNAFFECTED,AbstractBlock.Settings.copy(DecoBlocks.HEAVY_IRON_BARS)
                    .mapColor(MapColor.ORANGE).sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_HEAVY_COPPER_BARS = registerBlock("waxed_heavy_copper_bars",
            AbstractBlock.Settings.copy(DecoBlocks.HEAVY_COPPER_BARS),PaneBlock::new);
    public static final Block EXPOSED_HEAVY_COPPER_BARS = registerBlock("exposed_heavy_copper_bars",
            new OxidizablePaneBlock(Oxidizable.OxidationLevel.EXPOSED,AbstractBlock.Settings.copy(DecoBlocks.HEAVY_IRON_BARS)
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_EXPOSED_HEAVY_COPPER_BARS = registerBlock("waxed_exposed_heavy_copper_bars",
            AbstractBlock.Settings.copy(DecoBlocks.EXPOSED_HEAVY_COPPER_BARS),PaneBlock::new);
    public static final Block WEATHERED_HEAVY_COPPER_BARS = registerBlock("weathered_heavy_copper_bars",
            new OxidizablePaneBlock(Oxidizable.OxidationLevel.WEATHERED,AbstractBlock.Settings.copy(DecoBlocks.HEAVY_IRON_BARS)
                    .mapColor(MapColor.DARK_AQUA).sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_WEATHERED_HEAVY_COPPER_BARS = registerBlock("waxed_weathered_heavy_copper_bars",
            AbstractBlock.Settings.copy(DecoBlocks.WEATHERED_HEAVY_COPPER_BARS),PaneBlock::new);
    public static final Block OXIDIZED_HEAVY_COPPER_BARS = registerBlock("oxidized_heavy_copper_bars",
            new OxidizablePaneBlock(Oxidizable.OxidationLevel.OXIDIZED,AbstractBlock.Settings.copy(DecoBlocks.HEAVY_IRON_BARS)
                    .mapColor(MapColor.DARK_AQUA).sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_OXIDIZED_HEAVY_COPPER_BARS = registerBlock("waxed_oxidized_heavy_copper_bars",
            AbstractBlock.Settings.copy(DecoBlocks.OXIDIZED_HEAVY_COPPER_BARS),PaneBlock::new);

    public static final Block COPPER_CHAIN = registerBlock("copper_chain",
            new OxidizableChainBlock(Oxidizable.OxidationLevel.UNAFFECTED,AbstractBlock.Settings.copy(Blocks.CHAIN)
                    .sounds(BlockSoundGroup.COPPER_GRATE)));
    public static final Block WAXED_COPPER_CHAIN = registerBlock("waxed_copper_chain",
            AbstractBlock.Settings.copy(DecoBlocks.COPPER_CHAIN),ChainBlock::new);
    public static final Block EXPOSED_COPPER_CHAIN = registerBlock("exposed_copper_chain",
            new OxidizableChainBlock(Oxidizable.OxidationLevel.EXPOSED,AbstractBlock.Settings.copy(Blocks.CHAIN)
                    .sounds(BlockSoundGroup.COPPER_GRATE)));
    public static final Block WAXED_EXPOSED_COPPER_CHAIN = registerBlock("waxed_exposed_copper_chain",
            AbstractBlock.Settings.copy(DecoBlocks.EXPOSED_COPPER_CHAIN),ChainBlock::new);
    public static final Block WEATHERED_COPPER_CHAIN = registerBlock("weathered_copper_chain",
            new OxidizableChainBlock(Oxidizable.OxidationLevel.WEATHERED,AbstractBlock.Settings.copy(Blocks.CHAIN)
                    .sounds(BlockSoundGroup.COPPER_GRATE)));
    public static final Block WAXED_WEATHERED_COPPER_CHAIN = registerBlock("waxed_weathered_copper_chain",
            AbstractBlock.Settings.copy(DecoBlocks.WEATHERED_COPPER_CHAIN),ChainBlock::new);
    public static final Block OXIDIZED_COPPER_CHAIN = registerBlock("oxidized_copper_chain",
            new OxidizableChainBlock(Oxidizable.OxidationLevel.OXIDIZED,AbstractBlock.Settings.copy(Blocks.CHAIN)
                    .sounds(BlockSoundGroup.COPPER_GRATE)));
    public static final Block WAXED_OXIDIZED_COPPER_CHAIN = registerBlock("waxed_oxidized_copper_chain",
            AbstractBlock.Settings.copy(DecoBlocks.OXIDIZED_COPPER_CHAIN),ChainBlock::new);

    public static final Block STONE_WALL = registerBlock("stone_wall",
            AbstractBlock.Settings.copy(Blocks.STONE),WallBlock::new);
    public static final Block POLISHED_ANDESITE_WALL = registerBlock("polished_andesite_wall",
            AbstractBlock.Settings.copy(Blocks.POLISHED_ANDESITE),WallBlock::new);
    public static final Block POLISHED_DIORITE_WALL = registerBlock("polished_diorite_wall",
            AbstractBlock.Settings.copy(Blocks.POLISHED_DIORITE),WallBlock::new);
    public static final Block POLISHED_GRANITE_WALL = registerBlock("polished_granite_wall",
            AbstractBlock.Settings.copy(Blocks.POLISHED_GRANITE),WallBlock::new);
    public static final Block DEEPSLATE_WALL = registerBlock("deepslate_wall",
            AbstractBlock.Settings.copy(Blocks.DEEPSLATE),WallBlock::new);
    public static final Block CALCITE_WALL = registerBlock("calcite_wall",
            AbstractBlock.Settings.copy(Blocks.CALCITE),WallBlock::new);
    public static final Block DRIPSTONE_WALL = registerBlock("dripstone_wall",
            AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK),WallBlock::new);
    public static final Block CUT_SANDSTONE_WALL = registerBlock("cut_sandstone_wall",
            AbstractBlock.Settings.copy(Blocks.CUT_SANDSTONE),WallBlock::new);
    public static final Block SMOOTH_QUARTZ_WALL = registerBlock("smooth_quartz_wall",
            AbstractBlock.Settings.copy(Blocks.SMOOTH_QUARTZ),WallBlock::new);
    public static final Block SMOOTH_SANDSTONE_WALL = registerBlock("smooth_sandstone_wall",
            AbstractBlock.Settings.copy(Blocks.SMOOTH_SANDSTONE),WallBlock::new);
    public static final Block SMOOTH_RED_SANDSTONE_WALL = registerBlock("smooth_red_sandstone_wall",
            AbstractBlock.Settings.copy(Blocks.SMOOTH_RED_SANDSTONE),WallBlock::new);
    public static final Block SMOOTH_STONE_WALL = registerBlock("smooth_stone_wall",
            AbstractBlock.Settings.copy(Blocks.SMOOTH_STONE),WallBlock::new);
    public static final Block OBSIDIAN_WALL = registerBlock("obsidian_wall",
            AbstractBlock.Settings.copy(Blocks.OBSIDIAN),WallBlock::new);
    public static final Block SNOW_WALL = registerBlock("snow_wall",
            AbstractBlock.Settings.copy(Blocks.SNOW_BLOCK),WallBlock::new);
    public static final Block NETHERRACK_WALL = registerBlock("netherrack_wall",
            AbstractBlock.Settings.copy(Blocks.NETHERRACK),WallBlock::new);
    public static final Block PRISMARINE_BRICK_WALL = registerBlock("prismarine_brick_wall",
            new MagmaWallBlock(AbstractBlock.Settings.copy(Blocks.CUT_RED_SANDSTONE)));
    public static final Block DARK_PRISMARINE_WALL = registerBlock("dark_prismarine_wall",
            new MagmaWallBlock(AbstractBlock.Settings.copy(Blocks.CUT_RED_SANDSTONE)));
    public static final Block CUT_RED_SANDSTONE_WALL = registerBlock("cut_red_sandstone_wall",
            new MagmaWallBlock(AbstractBlock.Settings.copy(Blocks.CUT_RED_SANDSTONE)));
    public static final Block PACKED_MUD_WALL = registerBlock("packed_mud_wall",
            AbstractBlock.Settings.copy(Blocks.PACKED_MUD),WallBlock::new);
    public static final Block END_STONE_WALL = registerBlock("end_stone_wall",
            AbstractBlock.Settings.copy(Blocks.END_STONE),WallBlock::new);
    public static final Block QUARTZ_WALL = registerBlock("quartz_wall",
            AbstractBlock.Settings.copy(Blocks.QUARTZ_BLOCK),WallBlock::new);
    public static final Block QUARTZ_BRICK_WALL = registerBlock("quartz_brick_wall",
            AbstractBlock.Settings.copy(Blocks.QUARTZ_BRICKS),WallBlock::new);
    public static final Block WHITE_TERRACOTTA_WALL = registerBlock("white_terracotta_wall",
            AbstractBlock.Settings.copy(Blocks.WHITE_TERRACOTTA),WallBlock::new);
    public static final Block ORANGE_TERRACOTTA_WALL = registerBlock("orange_terracotta_wall",
            AbstractBlock.Settings.copy(Blocks.ORANGE_TERRACOTTA),WallBlock::new);
    public static final Block MAGENTA_TERRACOTTA_WALL = registerBlock("magenta_terracotta_wall",
            AbstractBlock.Settings.copy(Blocks.MAGENTA_TERRACOTTA),WallBlock::new);
    public static final Block LIGHT_BLUE_TERRACOTTA_WALL = registerBlock("light_blue_terracotta_wall",
            AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_TERRACOTTA),WallBlock::new);
    public static final Block YELLOW_TERRACOTTA_WALL = registerBlock("yellow_terracotta_wall",
            AbstractBlock.Settings.copy(Blocks.YELLOW_TERRACOTTA),WallBlock::new);
    public static final Block LIME_TERRACOTTA_WALL = registerBlock("lime_terracotta_wall",
            AbstractBlock.Settings.copy(Blocks.LIME_TERRACOTTA),WallBlock::new);
    public static final Block PINK_TERRACOTTA_WALL = registerBlock("pink_terracotta_wall",
            AbstractBlock.Settings.copy(Blocks.PINK_TERRACOTTA),WallBlock::new);
    public static final Block GRAY_TERRACOTTA_WALL = registerBlock("gray_terracotta_wall",
            AbstractBlock.Settings.copy(Blocks.GRAY_TERRACOTTA),WallBlock::new);
    public static final Block LIGHT_GRAY_TERRACOTTA_WALL = registerBlock("light_gray_terracotta_wall",
            AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_TERRACOTTA),WallBlock::new);
    public static final Block CYAN_TERRACOTTA_WALL = registerBlock("cyan_terracotta_wall",
            AbstractBlock.Settings.copy(Blocks.CYAN_TERRACOTTA),WallBlock::new);
    public static final Block PURPLE_TERRACOTTA_WALL = registerBlock("purple_terracotta_wall",
            AbstractBlock.Settings.copy(Blocks.PURPLE_TERRACOTTA),WallBlock::new);
    public static final Block BLUE_TERRACOTTA_WALL = registerBlock("blue_terracotta_wall",
            AbstractBlock.Settings.copy(Blocks.BLUE_TERRACOTTA),WallBlock::new);
    public static final Block BROWN_TERRACOTTA_WALL = registerBlock("brown_terracotta_wall",
            AbstractBlock.Settings.copy(Blocks.BROWN_TERRACOTTA),WallBlock::new);
    public static final Block GREEN_TERRACOTTA_WALL = registerBlock("green_terracotta_wall",
            AbstractBlock.Settings.copy(Blocks.GREEN_TERRACOTTA),WallBlock::new);
    public static final Block RED_TERRACOTTA_WALL = registerBlock("red_terracotta_wall",
            AbstractBlock.Settings.copy(Blocks.RED_TERRACOTTA),WallBlock::new);
    public static final Block BLACK_TERRACOTTA_WALL = registerBlock("black_terracotta_wall",
            AbstractBlock.Settings.copy(Blocks.BLACK_TERRACOTTA),WallBlock::new);
    public static final Block TERRACOTTA_WALL = registerBlock("terracotta_wall",
            AbstractBlock.Settings.copy(Blocks.TERRACOTTA),WallBlock::new);
    public static final Block PACKED_ICE_WALL = registerBlock("packed_ice_wall",
            AbstractBlock.Settings.copy(Blocks.PACKED_ICE),WallBlock::new);
    public static final Block MAGMA_WALL = registerBlock("magma_wall",
            new MagmaWallBlock(AbstractBlock.Settings.copy(Blocks.MAGMA_BLOCK)));
    public static final Block WHITE_CONCRETE_WALL = registerBlock("white_concrete_wall",
            AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE),WallBlock::new);
    public static final Block ORANGE_CONCRETE_WALL = registerBlock("orange_concrete_wall",
            AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE),WallBlock::new);
    public static final Block MAGENTA_CONCRETE_WALL = registerBlock("magenta_concrete_wall",
            AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE),WallBlock::new);
    public static final Block LIGHT_BLUE_CONCRETE_WALL = registerBlock("light_blue_concrete_wall",
            AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE),WallBlock::new);
    public static final Block YELLOW_CONCRETE_WALL = registerBlock("yellow_concrete_wall",
            AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE),WallBlock::new);
    public static final Block LIME_CONCRETE_WALL = registerBlock("lime_concrete_wall",
            AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE),WallBlock::new);
    public static final Block PINK_CONCRETE_WALL = registerBlock("pink_concrete_wall",
            AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE),WallBlock::new);
    public static final Block GRAY_CONCRETE_WALL = registerBlock("gray_concrete_wall",
            AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE),WallBlock::new);
    public static final Block LIGHT_GRAY_CONCRETE_WALL = registerBlock("light_gray_concrete_wall",
            AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE),WallBlock::new);
    public static final Block CYAN_CONCRETE_WALL = registerBlock("cyan_concrete_wall",
            AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE),WallBlock::new);
    public static final Block PURPLE_CONCRETE_WALL = registerBlock("purple_concrete_wall",
            AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE),WallBlock::new);
    public static final Block BLUE_CONCRETE_WALL = registerBlock("blue_concrete_wall",
            AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE),WallBlock::new);
    public static final Block BROWN_CONCRETE_WALL = registerBlock("brown_concrete_wall",
            AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE),WallBlock::new);
    public static final Block GREEN_CONCRETE_WALL = registerBlock("green_concrete_wall",
            AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE),WallBlock::new);
    public static final Block RED_CONCRETE_WALL = registerBlock("red_concrete_wall",
            AbstractBlock.Settings.copy(Blocks.RED_CONCRETE),WallBlock::new);
    public static final Block BLACK_CONCRETE_WALL = registerBlock("black_concrete_wall",
            AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE),WallBlock::new);
    public static final Block BLUE_ICE_WALL = registerBlock("blue_ice_wall",
            AbstractBlock.Settings.copy(Blocks.BLUE_ICE),WallBlock::new);

    public static final Block POLISHED_STONE_WALL = registerBlock("polished_stone_wall",
            AbstractBlock.Settings.copy(DecoBlocks.POLISHED_STONE),WallBlock::new);
    public static final Block STONE_TILE_WALL = registerBlock("stone_tile_wall",
            AbstractBlock.Settings.copy(DecoBlocks.STONE_TILES),WallBlock::new);
    public static final Block CUT_SANDSTONE_BRICK_WALL = registerBlock("cut_sandstone_brick_wall",
            AbstractBlock.Settings.copy(DecoBlocks.CUT_SANDSTONE_BRICKS),WallBlock::new);
    public static final Block SMOOTH_PURPUR_WALL = registerBlock("smooth_purpur_wall",
            AbstractBlock.Settings.copy(DecoBlocks.SMOOTH_PURPUR),WallBlock::new);
    public static final Block SMOOTH_DEEPSLATE_WALL = registerBlock("smooth_deepslate_wall",
            AbstractBlock.Settings.copy(DecoBlocks.SMOOTH_DEEPSLATE),WallBlock::new);
    public static final Block SMOOTH_BLACKSTONE_WALL = registerBlock("smooth_blackstone_wall",
            AbstractBlock.Settings.copy(DecoBlocks.SMOOTH_BLACKSTONE),WallBlock::new);
    public static final Block SMOOTH_TUFF_WALL = registerBlock("smooth_tuff_wall",
            AbstractBlock.Settings.copy(DecoBlocks.SMOOTH_TUFF),WallBlock::new);
    public static final Block OBSIDIAN_BRICK_WALL = registerBlock("obsidian_brick_wall",
            AbstractBlock.Settings.copy(DecoBlocks.OBSIDIAN_BRICKS),WallBlock::new);
    public static final Block PURPUR_BRICK_WALL = registerBlock("purpur_brick_wall",
            AbstractBlock.Settings.copy(DecoBlocks.PURPUR_BRICKS),WallBlock::new);
    public static final Block SNOW_BRICK_WALL = registerBlock("snow_brick_wall",
            AbstractBlock.Settings.copy(DecoBlocks.SNOW_BRICKS),WallBlock::new);
    public static final Block VOID_STONE_WALL = registerBlock("void_stone_wall",
            AbstractBlock.Settings.copy(DecoBlocks.VOID_STONE),WallBlock::new);
    public static final Block VOID_STONE_BRICK_WALL = registerBlock("void_stone_brick_wall",
            AbstractBlock.Settings.copy(DecoBlocks.VOID_STONE_BRICKS),WallBlock::new);
    public static final Block WHITE_TERRACOTTA_BRICK_WALL = registerBlock("white_terracotta_brick_wall",
            AbstractBlock.Settings.copy(DecoBlocks.WHITE_TERRACOTTA_BRICKS),WallBlock::new);
    public static final Block ORANGE_TERRACOTTA_BRICK_WALL = registerBlock("orange_terracotta_brick_wall",
            AbstractBlock.Settings.copy(DecoBlocks.ORANGE_TERRACOTTA_BRICKS),WallBlock::new);
    public static final Block MAGENTA_TERRACOTTA_BRICK_WALL = registerBlock("magenta_terracotta_brick_wall",
            AbstractBlock.Settings.copy(DecoBlocks.MAGENTA_TERRACOTTA_BRICKS),WallBlock::new);
    public static final Block LIGHT_BLUE_TERRACOTTA_BRICK_WALL = registerBlock("light_blue_terracotta_brick_wall",
            AbstractBlock.Settings.copy(DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS),WallBlock::new);
    public static final Block YELLOW_TERRACOTTA_BRICK_WALL = registerBlock("yellow_terracotta_brick_wall",
            AbstractBlock.Settings.copy(DecoBlocks.YELLOW_TERRACOTTA_BRICKS),WallBlock::new);
    public static final Block LIME_TERRACOTTA_BRICK_WALL = registerBlock("lime_terracotta_brick_wall",
            AbstractBlock.Settings.copy(DecoBlocks.LIME_TERRACOTTA_BRICKS),WallBlock::new);
    public static final Block PINK_TERRACOTTA_BRICK_WALL = registerBlock("pink_terracotta_brick_wall",
            AbstractBlock.Settings.copy(DecoBlocks.PINK_TERRACOTTA_BRICKS),WallBlock::new);
    public static final Block GRAY_TERRACOTTA_BRICK_WALL = registerBlock("gray_terracotta_brick_wall",
            AbstractBlock.Settings.copy(DecoBlocks.GRAY_TERRACOTTA_BRICKS),WallBlock::new);
    public static final Block LIGHT_GRAY_TERRACOTTA_BRICK_WALL = registerBlock("light_gray_terracotta_brick_wall",
            AbstractBlock.Settings.copy(DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS),WallBlock::new);
    public static final Block CYAN_TERRACOTTA_BRICK_WALL = registerBlock("cyan_terracotta_brick_wall",
            AbstractBlock.Settings.copy(DecoBlocks.CYAN_TERRACOTTA_BRICKS),WallBlock::new);
    public static final Block PURPLE_TERRACOTTA_BRICK_WALL = registerBlock("purple_terracotta_brick_wall",
            AbstractBlock.Settings.copy(DecoBlocks.PURPLE_TERRACOTTA_BRICKS),WallBlock::new);
    public static final Block BLUE_TERRACOTTA_BRICK_WALL = registerBlock("blue_terracotta_brick_wall",
            AbstractBlock.Settings.copy(DecoBlocks.BLUE_TERRACOTTA_BRICKS),WallBlock::new);
    public static final Block BROWN_TERRACOTTA_BRICK_WALL = registerBlock("brown_terracotta_brick_wall",
            AbstractBlock.Settings.copy(DecoBlocks.BROWN_TERRACOTTA_BRICKS),WallBlock::new);
    public static final Block GREEN_TERRACOTTA_BRICK_WALL = registerBlock("green_terracotta_brick_wall",
            AbstractBlock.Settings.copy(DecoBlocks.GREEN_TERRACOTTA_BRICKS),WallBlock::new);
    public static final Block RED_TERRACOTTA_BRICK_WALL = registerBlock("red_terracotta_brick_wall",
            AbstractBlock.Settings.copy(DecoBlocks.RED_TERRACOTTA_BRICKS),WallBlock::new);
    public static final Block BLACK_TERRACOTTA_BRICK_WALL = registerBlock("black_terracotta_brick_wall",
            AbstractBlock.Settings.copy(DecoBlocks.BLACK_TERRACOTTA_BRICKS),WallBlock::new);
    public static final Block TERRACOTTA_BRICK_WALL = registerBlock("terracotta_brick_wall",
            AbstractBlock.Settings.copy(DecoBlocks.TERRACOTTA_BRICKS),WallBlock::new);
    public static final Block SOUL_SOILSTONE_WALL = registerBlock("soul_soilstone_wall",
            AbstractBlock.Settings.copy(DecoBlocks.SOUL_SOILSTONE),WallBlock::new);
    public static final Block CUT_SOUL_SOILSTONE_WALL = registerBlock("cut_soul_soilstone_wall",
            AbstractBlock.Settings.copy(DecoBlocks.CUT_SOUL_SOILSTONE),WallBlock::new);
    public static final Block SMOOTH_SOUL_SOILSTONE_WALL = registerBlock("smooth_soul_soilstone_wall",
            AbstractBlock.Settings.copy(DecoBlocks.SMOOTH_SOUL_SOILSTONE),WallBlock::new);
    public static final Block CUT_SOUL_SOILSTONE_BRICK_WALL = registerBlock("cut_soul_soilstone_brick_wall",
            AbstractBlock.Settings.copy(DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS),WallBlock::new);
    public static final Block CUT_QUARTZ_WALL = registerBlock("cut_quartz_wall",
            AbstractBlock.Settings.copy(DecoBlocks.CUT_QUARTZ),WallBlock::new);
    public static final Block ICE_BRICK_WALL = registerBlock("ice_brick_wall",
            AbstractBlock.Settings.copy(DecoBlocks.ICE_BRICKS),WallBlock::new);
    public static final Block CUT_WHITE_CONCRETE_WALL = registerBlock("cut_white_concrete_wall",
            AbstractBlock.Settings.copy(DecoBlocks.CUT_WHITE_CONCRETE),WallBlock::new);
    public static final Block CUT_ORANGE_CONCRETE_WALL = registerBlock("cut_orange_concrete_wall",
            AbstractBlock.Settings.copy(DecoBlocks.CUT_ORANGE_CONCRETE),WallBlock::new);
    public static final Block CUT_MAGENTA_CONCRETE_WALL = registerBlock("cut_magenta_concrete_wall",
            AbstractBlock.Settings.copy(DecoBlocks.CUT_MAGENTA_CONCRETE),WallBlock::new);
    public static final Block CUT_LIGHT_BLUE_CONCRETE_WALL = registerBlock("cut_light_blue_concrete_wall",
            AbstractBlock.Settings.copy(DecoBlocks.CUT_LIGHT_BLUE_CONCRETE),WallBlock::new);
    public static final Block CUT_YELLOW_CONCRETE_WALL = registerBlock("cut_yellow_concrete_wall",
            AbstractBlock.Settings.copy(DecoBlocks.CUT_YELLOW_CONCRETE),WallBlock::new);
    public static final Block CUT_LIME_CONCRETE_WALL = registerBlock("cut_lime_concrete_wall",
            AbstractBlock.Settings.copy(DecoBlocks.CUT_LIME_CONCRETE),WallBlock::new);
    public static final Block CUT_PINK_CONCRETE_WALL = registerBlock("cut_pink_concrete_wall",
            AbstractBlock.Settings.copy(DecoBlocks.CUT_PINK_CONCRETE),WallBlock::new);
    public static final Block CUT_GRAY_CONCRETE_WALL = registerBlock("cut_gray_concrete_wall",
            AbstractBlock.Settings.copy(DecoBlocks.CUT_GRAY_CONCRETE),WallBlock::new);
    public static final Block CUT_LIGHT_GRAY_CONCRETE_WALL = registerBlock("cut_light_gray_concrete_wall",
            AbstractBlock.Settings.copy(DecoBlocks.CUT_LIGHT_GRAY_CONCRETE),WallBlock::new);
    public static final Block CUT_CYAN_CONCRETE_WALL = registerBlock("cut_cyan_concrete_wall",
            AbstractBlock.Settings.copy(DecoBlocks.CUT_CYAN_CONCRETE),WallBlock::new);
    public static final Block CUT_PURPLE_CONCRETE_WALL = registerBlock("cut_purple_concrete_wall",
            AbstractBlock.Settings.copy(DecoBlocks.CUT_PURPLE_CONCRETE),WallBlock::new);
    public static final Block CUT_BLUE_CONCRETE_WALL = registerBlock("cut_blue_concrete_wall",
            AbstractBlock.Settings.copy(DecoBlocks.CUT_BLUE_CONCRETE),WallBlock::new);
    public static final Block CUT_BROWN_CONCRETE_WALL = registerBlock("cut_brown_concrete_wall",
            AbstractBlock.Settings.copy(DecoBlocks.CUT_BROWN_CONCRETE),WallBlock::new);
    public static final Block CUT_GREEN_CONCRETE_WALL = registerBlock("cut_green_concrete_wall",
            AbstractBlock.Settings.copy(DecoBlocks.CUT_GREEN_CONCRETE),WallBlock::new);
    public static final Block CUT_RED_CONCRETE_WALL = registerBlock("cut_red_concrete_wall",
            AbstractBlock.Settings.copy(DecoBlocks.CUT_RED_CONCRETE),WallBlock::new);
    public static final Block CUT_BLACK_CONCRETE_WALL = registerBlock("cut_black_concrete_wall",
            AbstractBlock.Settings.copy(DecoBlocks.CUT_BLACK_CONCRETE),WallBlock::new);
    public static final Block CRYSTALLIZED_PRISMARINE_WALL = registerBlock("crystallized_prismarine_wall",
            AbstractBlock.Settings.copy(DecoBlocks.CRYSTALLIZED_PRISMARINE),WallBlock::new);
    public static final Block CRYSTALLIZED_PRISMARINE_BRICK_WALL = registerBlock("crystallized_prismarine_brick_wall",
            AbstractBlock.Settings.copy(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS),WallBlock::new);
    public static final Block LIGHT_PRISMARINE_WALL = registerBlock("light_prismarine_wall",
            AbstractBlock.Settings.copy(DecoBlocks.LIGHT_PRISMARINE),WallBlock::new);
    public static final Block CUT_RED_SANDSTONE_BRICK_WALL = registerBlock("cut_red_sandstone_brick_wall",
            AbstractBlock.Settings.copy(DecoBlocks.CUT_RED_SANDSTONE_BRICKS),WallBlock::new);
    public static final Block MAGMA_BRICK_WALL = registerBlock("magma_brick_wall",
            new MagmaBrickWallBlock(AbstractBlock.Settings.copy(DecoBlocks.MAGMA_BRICKS)));
    public static final Block BUBBLE_WALL = registerBlock("bubble_wall",
            new BubbleWallBlock(AbstractBlock.Settings.copy(DecoBlocks.BUBBLE_BLOCK)));
    public static final Block BUBBLE_BRICK_WALL = registerBlock("bubble_brick_wall",
            new BubbleWallBlock(AbstractBlock.Settings.copy(DecoBlocks.BUBBLE_BRICKS)));
    public static final Block BLUE_NETHER_BRICK_WALL = registerBlock("blue_nether_brick_wall",
            AbstractBlock.Settings.copy(DecoBlocks.BLUE_NETHER_BRICKS),WallBlock::new);
    public static final Block POLISHED_BLACKSTONE_TILE_WALL = registerBlock("polished_blackstone_tile_wall",
            AbstractBlock.Settings.copy(DecoBlocks.POLISHED_BLACKSTONE_TILES),WallBlock::new);
    public static final Block TUFF_TILE_WALL = registerBlock("tuff_tile_wall",
            AbstractBlock.Settings.copy(DecoBlocks.TUFF_TILES),WallBlock::new);

    public static final Block RED_SUNFLOWER = registerBlock("red_sunflower",
            AbstractBlock.Settings.copy(Blocks.SUNFLOWER),TallFlowerBlock::new);
    public static final Block NOVA_STARFLOWER = registerBlock("nova_starflower",
            AbstractBlock.Settings.copy(Blocks.SUNFLOWER),NovaStarflowerBlock::new);

    public static final Block WITHER_ROSE_BUSH = registerBlock("wither_rose_bush",
            AbstractBlock.Settings.copy(Blocks.ROSE_BUSH),WitherRoseBushBlock::new);
    public static final Block ENDER_ROSE_BUSH = registerBlock("ender_rose_bush",
            AbstractBlock.Settings.copy(Blocks.ROSE_BUSH),EnderRoseBushBlock::new);

    public static final Block TINTED_GLASS_PANE = registerBlock("tinted_glass_pane",
            AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS_PANE).nonOpaque(),TintedGlassPaneBlock::new);
    public static final Block HARDENED_GLASS_PANE = registerBlock("hardened_glass_pane",
            AbstractBlock.Settings.copy(Blocks.GLASS_PANE).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool(),PaneBlock::new);
    public static final Block HARDENED_TINTED_GLASS_PANE = registerBlock("hardened_tinted_glass_pane",
            AbstractBlock.Settings.copy(DecoBlocks.TINTED_GLASS_PANE).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool(),TintedGlassPaneBlock::new);
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
                    .nonOpaque().requiresTool()));
    public static final Block MOSAIC_ORANGE_STAINED_GLASS_PANE = registerBlock("mosaic_orange_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.ORANGE,AbstractBlock.Settings.copy(Blocks.ORANGE_STAINED_GLASS_PANE).strength(0.6F,0.3f)
                    .nonOpaque().requiresTool()));
    public static final Block MOSAIC_MAGENTA_STAINED_GLASS_PANE = registerBlock("mosaic_magenta_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.MAGENTA,AbstractBlock.Settings.copy(Blocks.MAGENTA_STAINED_GLASS_PANE).strength(0.6F,0.3f)
                    .nonOpaque().requiresTool()));
    public static final Block MOSAIC_LIGHT_BLUE_STAINED_GLASS_PANE = registerBlock("mosaic_light_blue_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.LIGHT_BLUE, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_STAINED_GLASS_PANE).strength(0.6F,0.3f)
                    .nonOpaque().requiresTool()));
    public static final Block MOSAIC_YELLOW_STAINED_GLASS_PANE = registerBlock("mosaic_yellow_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.YELLOW, AbstractBlock.Settings.copy(Blocks.YELLOW_STAINED_GLASS_PANE).strength(0.6F,0.3f)
                    .nonOpaque().requiresTool()));
    public static final Block MOSAIC_LIME_STAINED_GLASS_PANE = registerBlock("mosaic_lime_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.LIME, AbstractBlock.Settings.copy(Blocks.LIME_STAINED_GLASS_PANE).strength(0.6F,0.3f)
                    .nonOpaque().requiresTool()));
    public static final Block MOSAIC_PINK_STAINED_GLASS_PANE = registerBlock("mosaic_pink_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.PINK, AbstractBlock.Settings.copy(Blocks.PINK_STAINED_GLASS_PANE).strength(0.6F,0.3f)
                    .nonOpaque().requiresTool()));
    public static final Block MOSAIC_GRAY_STAINED_GLASS_PANE = registerBlock("mosaic_gray_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.GRAY, AbstractBlock.Settings.copy(Blocks.GRAY_STAINED_GLASS_PANE).strength(0.6F,0.3f)
                    .nonOpaque().requiresTool()));
    public static final Block MOSAIC_LIGHT_GRAY_STAINED_GLASS_PANE = registerBlock("mosaic_light_gray_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.LIGHT_GRAY, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_STAINED_GLASS_PANE).strength(0.6F,0.3f)
                    .nonOpaque().requiresTool()));
    public static final Block MOSAIC_CYAN_STAINED_GLASS_PANE = registerBlock("mosaic_cyan_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.CYAN, AbstractBlock.Settings.copy(Blocks.CYAN_STAINED_GLASS_PANE).strength(0.6F,0.3f)
                    .nonOpaque().requiresTool()));
    public static final Block MOSAIC_PURPLE_STAINED_GLASS_PANE = registerBlock("mosaic_purple_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.PURPLE, AbstractBlock.Settings.copy(Blocks.PURPLE_STAINED_GLASS_PANE).strength(0.6F,0.3f)
                    .nonOpaque().requiresTool()));
    public static final Block MOSAIC_BLUE_STAINED_GLASS_PANE = registerBlock("mosaic_blue_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.BLUE, AbstractBlock.Settings.copy(Blocks.BLUE_STAINED_GLASS_PANE).strength(0.6F,0.3f)
                    .nonOpaque().requiresTool()));
    public static final Block MOSAIC_BROWN_STAINED_GLASS_PANE = registerBlock("mosaic_brown_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.BROWN, AbstractBlock.Settings.copy(Blocks.BROWN_STAINED_GLASS_PANE).strength(0.6F,0.3f)
                    .nonOpaque().requiresTool()));
    public static final Block MOSAIC_GREEN_STAINED_GLASS_PANE = registerBlock("mosaic_green_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.GREEN, AbstractBlock.Settings.copy(Blocks.GREEN_STAINED_GLASS_PANE).strength(0.6F,0.3f)
                    .nonOpaque().requiresTool()));
    public static final Block MOSAIC_RED_STAINED_GLASS_PANE = registerBlock("mosaic_red_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.RED, AbstractBlock.Settings.copy(Blocks.RED_STAINED_GLASS_PANE).strength(0.6F,0.3f)
                    .nonOpaque().requiresTool()));
    public static final Block MOSAIC_BLACK_STAINED_GLASS_PANE = registerBlock("mosaic_black_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.BLACK, AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS_PANE).strength(0.6F,0.3f)
                    .nonOpaque().requiresTool()));

    public static final Block OAK_BARREL = registerBlock("oak_barrel",
            AbstractBlock.Settings.copy(Blocks.BARREL).mapColor(MapColor.OAK_TAN),BarrelBlock::new);
    public static final Block SPRUCE_BARREL = registerBlock("spruce_barrel",
            AbstractBlock.Settings.copy(Blocks.BARREL),BarrelBlock::new);
    public static final Block BIRCH_BARREL = registerBlock("birch_barrel",
            AbstractBlock.Settings.copy(Blocks.BARREL).mapColor(MapColor.PALE_YELLOW),BarrelBlock::new);
    public static final Block JUNGLE_BARREL = registerBlock("jungle_barrel",
            AbstractBlock.Settings.copy(Blocks.BARREL).mapColor(MapColor.DIRT_BROWN),BarrelBlock::new);
    public static final Block ACACIA_BARREL = registerBlock("acacia_barrel",
            AbstractBlock.Settings.copy(Blocks.BARREL).mapColor(MapColor.ORANGE),BarrelBlock::new);
    public static final Block DARK_OAK_BARREL = registerBlock("dark_oak_barrel",
            AbstractBlock.Settings.copy(Blocks.BARREL).mapColor(MapColor.BROWN),BarrelBlock::new);
    public static final Block MANGROVE_BARREL = registerBlock("mangrove_barrel",
            AbstractBlock.Settings.copy(Blocks.BARREL).mapColor(MapColor.RED),BarrelBlock::new);
    public static final Block BAMBOO_BARREL = registerBlock("bamboo_barrel",
            AbstractBlock.Settings.copy(Blocks.BARREL).mapColor(MapColor.YELLOW)
                    .sounds(BlockSoundGroup.BAMBOO_WOOD),BarrelBlock::new);
    public static final Block CHERRY_BARREL = registerBlock("cherry_barrel",
            AbstractBlock.Settings.copy(Blocks.BARREL).mapColor(MapColor.TERRACOTTA_WHITE)
                    .sounds(BlockSoundGroup.CHERRY_WOOD),BarrelBlock::new);
    public static final Block CRIMSON_BARREL = registerBlock("crimson_barrel",
            AbstractBlock.Settings.copy(Blocks.BARREL).mapColor(MapColor.DULL_PINK)
                    .sounds(BlockSoundGroup.NETHER_WOOD),BarrelBlock::new);
    public static final Block WARPED_BARREL = registerBlock("warped_barrel",
            AbstractBlock.Settings.copy(Blocks.BARREL).mapColor(MapColor.DARK_AQUA)
                    .sounds(BlockSoundGroup.NETHER_WOOD),BarrelBlock::new);
    public static final Block CACTUS_BARREL = registerBlock("cactus_barrel",
            AbstractBlock.Settings.copy(Blocks.BARREL).mapColor(MapColor.PALE_GREEN),BarrelBlock::new);

    public static final Block SPRUCE_BOOKSHELF = registerBlock("spruce_bookshelf",
            AbstractBlock.Settings.copy(Blocks.BOOKSHELF).mapColor(MapColor.BROWN),Block::new);
    public static final Block BIRCH_BOOKSHELF = registerBlock("birch_bookshelf",
            AbstractBlock.Settings.copy(Blocks.BOOKSHELF).mapColor(MapColor.PALE_YELLOW),Block::new);
    public static final Block JUNGLE_BOOKSHELF = registerBlock("jungle_bookshelf",
            AbstractBlock.Settings.copy(Blocks.BOOKSHELF).mapColor(MapColor.DIRT_BROWN),Block::new);
    public static final Block ACACIA_BOOKSHELF = registerBlock("acacia_bookshelf",
            AbstractBlock.Settings.copy(Blocks.BOOKSHELF).mapColor(MapColor.ORANGE),Block::new);
    public static final Block DARK_OAK_BOOKSHELF = registerBlock("dark_oak_bookshelf",
            AbstractBlock.Settings.copy(Blocks.BOOKSHELF).mapColor(MapColor.BROWN),Block::new);
    public static final Block MANGROVE_BOOKSHELF = registerBlock("mangrove_bookshelf",
            AbstractBlock.Settings.copy(Blocks.BOOKSHELF).mapColor(MapColor.RED),Block::new);
    public static final Block BAMBOO_BOOKSHELF = registerBlock("bamboo_bookshelf",
            AbstractBlock.Settings.copy(Blocks.BOOKSHELF).mapColor(MapColor.YELLOW)
                    .sounds(BlockSoundGroup.BAMBOO_WOOD),Block::new);
    public static final Block CHERRY_BOOKSHELF = registerBlock("cherry_bookshelf",
            AbstractBlock.Settings.copy(Blocks.BOOKSHELF).mapColor(MapColor.TERRACOTTA_WHITE)
                    .sounds(BlockSoundGroup.CHERRY_WOOD),Block::new);
    public static final Block CRIMSON_BOOKSHELF = registerBlock("crimson_bookshelf",
            AbstractBlock.Settings.copy(Blocks.BOOKSHELF).mapColor(MapColor.DULL_PINK)
                    .sounds(BlockSoundGroup.NETHER_WOOD),Block::new);
    public static final Block WARPED_BOOKSHELF = registerBlock("warped_bookshelf",
            AbstractBlock.Settings.copy(Blocks.BOOKSHELF).mapColor(MapColor.DARK_AQUA)
                    .sounds(BlockSoundGroup.NETHER_WOOD),Block::new);
    public static final Block CACTUS_BOOKSHELF = registerBlock("cactus_bookshelf",
            AbstractBlock.Settings.copy(Blocks.BOOKSHELF).mapColor(MapColor.PALE_GREEN),Block::new);
    public static final Block WOODEN_BOOKSHELF = registerBlock("wooden_bookshelf",
            AbstractBlock.Settings.copy(Blocks.BOOKSHELF).mapColor(MapColor.BROWN),Block::new);

    public static final Block DEEPSLATE_SMOKER = registerBlock("deepslate_smoker",
            AbstractBlock.Settings.copy(Blocks.SMOKER).mapColor(MapColor.DEEPSLATE_GRAY)
                    .strength(4.5f).sounds(BlockSoundGroup.DEEPSLATE),DeepslateSmokerBlock::new);
    public static final Block BLACKSTONE_SMOKER = registerBlock("blackstone_smoker",
            AbstractBlock.Settings.copy(Blocks.SMOKER).mapColor(MapColor.BLACK)
                    .strength(3.0f),BlackstoneSmokerBlock::new);
    public static final Block TUFF_SMOKER = registerBlock("tuff_smoker",
            AbstractBlock.Settings.copy(Blocks.SMOKER).mapColor(MapColor.TERRACOTTA_GRAY)
                    .strength(3.0f).sounds(BlockSoundGroup.TUFF),TuffSmokerBlock::new);

    public static final Block DEEPSLATE_BLAST_FURNACE = registerBlock("deepslate_blast_furnace",
            AbstractBlock.Settings.copy(Blocks.BLAST_FURNACE).mapColor(MapColor.DEEPSLATE_GRAY)
                    .strength(4.5f).sounds(BlockSoundGroup.DEEPSLATE_BRICKS),DeepslateBlastFurnaceBlock::new);
    public static final Block BLACKSTONE_BLAST_FURNACE = registerBlock("blackstone_blast_furnace",
            AbstractBlock.Settings.copy(Blocks.BLAST_FURNACE).mapColor(MapColor.BLACK)
                    .strength(3.0f),BlackstoneBlastFurnaceBlock::new);
    public static final Block TUFF_BLAST_FURNACE = registerBlock("tuff_blast_furnace",
            AbstractBlock.Settings.copy(Blocks.BLAST_FURNACE).mapColor(MapColor.TERRACOTTA_GRAY)
                    .strength(3.0f).sounds(BlockSoundGroup.TUFF_BRICKS),TuffBlastFurnaceBlock::new);

    public static final Block OAK_CARTOGRAPHY_TABLE = registerBlock("oak_cartography_table",
            AbstractBlock.Settings.copy(Blocks.CARTOGRAPHY_TABLE),OakCartographyTableBlock::new);
    public static final Block BIRCH_CARTOGRAPHY_TABLE = registerBlock("birch_cartography_table",
            AbstractBlock.Settings.copy(Blocks.CARTOGRAPHY_TABLE),BirchCartographyTableBlock::new);
    public static final Block SPRUCE_CARTOGRAPHY_TABLE = registerBlock("spruce_cartography_table",
            AbstractBlock.Settings.copy(Blocks.CARTOGRAPHY_TABLE),SpruceCartographyTableBlock::new);
    public static final Block JUNGLE_CARTOGRAPHY_TABLE = registerBlock("jungle_cartography_table",
            AbstractBlock.Settings.copy(Blocks.CARTOGRAPHY_TABLE),JungleCartographyTableBlock::new);
    public static final Block ACACIA_CARTOGRAPHY_TABLE = registerBlock("acacia_cartography_table",
            AbstractBlock.Settings.copy(Blocks.CARTOGRAPHY_TABLE),AcaciaCartographyTableBlock::new);
    public static final Block DARK_OAK_CARTOGRAPHY_TABLE = registerBlock("dark_oak_cartography_table",
            AbstractBlock.Settings.copy(Blocks.CARTOGRAPHY_TABLE),DarkOakCartographyTableBlock::new);
    public static final Block MANGROVE_CARTOGRAPHY_TABLE = registerBlock("mangrove_cartography_table",
            AbstractBlock.Settings.copy(Blocks.CARTOGRAPHY_TABLE),MangroveCartographyTableBlock::new);
    public static final Block CHERRY_CARTOGRAPHY_TABLE = registerBlock("cherry_cartography_table",
            AbstractBlock.Settings.copy(Blocks.CARTOGRAPHY_TABLE)
                    .sounds(BlockSoundGroup.CHERRY_WOOD),CherryCartographyTableBlock::new);
    public static final Block BAMBOO_CARTOGRAPHY_TABLE = registerBlock("bamboo_cartography_table",
            AbstractBlock.Settings.copy(Blocks.CARTOGRAPHY_TABLE)
                    .sounds(BlockSoundGroup.BAMBOO_WOOD),BambooCartographyTableBlock::new);
    public static final Block CRIMSON_CARTOGRAPHY_TABLE = registerBlock("crimson_cartography_table",
            AbstractBlock.Settings.copy(Blocks.CARTOGRAPHY_TABLE)
                    .sounds(BlockSoundGroup.NETHER_WOOD),CrimsonCartographyTableBlock::new);
    public static final Block WARPED_CARTOGRAPHY_TABLE = registerBlock("warped_cartography_table",
            AbstractBlock.Settings.copy(Blocks.CARTOGRAPHY_TABLE)
                    .sounds(BlockSoundGroup.NETHER_WOOD),WarpedCartographyTableBlock::new);
    public static final Block CACTUS_CARTOGRAPHY_TABLE = registerBlock("cactus_cartography_table",
            AbstractBlock.Settings.copy(Blocks.CARTOGRAPHY_TABLE),CactusCartographyTableBlock::new);

    public static final Block OAK_SMITHING_TABLE = registerBlock("oak_smithing_table",
            AbstractBlock.Settings.copy(Blocks.SMITHING_TABLE),OakSmithingTableBlock::new);
    public static final Block SPRUCE_SMITHING_TABLE = registerBlock("spruce_smithing_table",
            AbstractBlock.Settings.copy(Blocks.SMITHING_TABLE),SpruceSmithingTableBlock::new);
    public static final Block BIRCH_SMITHING_TABLE = registerBlock("birch_smithing_table",
            AbstractBlock.Settings.copy(Blocks.SMITHING_TABLE),BirchSmithingTableBlock::new);
    public static final Block JUNGLE_SMITHING_TABLE = registerBlock("jungle_smithing_table",
            AbstractBlock.Settings.copy(Blocks.SMITHING_TABLE),JungleSmithingTableBlock::new);
    public static final Block ACACIA_SMITHING_TABLE = registerBlock("acacia_smithing_table",
            AbstractBlock.Settings.copy(Blocks.SMITHING_TABLE),AcaciaSmithingTableBlock::new);
    public static final Block DARK_OAK_SMITHING_TABLE = registerBlock("dark_oak_smithing_table",
            AbstractBlock.Settings.copy(Blocks.SMITHING_TABLE),DarkOakSmithingTableBlock::new);
    public static final Block MANGROVE_SMITHING_TABLE = registerBlock("mangrove_smithing_table",
            AbstractBlock.Settings.copy(Blocks.SMITHING_TABLE),MangroveSmithingTableBlock::new);
    public static final Block CRIMSON_SMITHING_TABLE = registerBlock("crimson_smithing_table",
            AbstractBlock.Settings.copy(Blocks.SMITHING_TABLE)
                    .sounds(BlockSoundGroup.NETHER_WOOD),CrimsonSmithingTableBlock::new);
    public static final Block WARPED_SMITHING_TABLE = registerBlock("warped_smithing_table",
            AbstractBlock.Settings.copy(Blocks.SMITHING_TABLE)
                    .sounds(BlockSoundGroup.NETHER_WOOD),WarpedSmithingTableBlock::new);
    public static final Block BAMBOO_SMITHING_TABLE = registerBlock("bamboo_smithing_table",
            AbstractBlock.Settings.copy(Blocks.SMITHING_TABLE)
                    .sounds(BlockSoundGroup.BAMBOO_WOOD),BambooSmithingTableBlock::new);
    public static final Block CHERRY_SMITHING_TABLE = registerBlock("cherry_smithing_table",
            AbstractBlock.Settings.copy(Blocks.SMITHING_TABLE)
                    .sounds(BlockSoundGroup.CHERRY_WOOD),CherrySmithingTableBlock::new);
    public static final Block CACTUS_SMITHING_TABLE = registerBlock("cactus_smithing_table",
            AbstractBlock.Settings.copy(Blocks.SMITHING_TABLE),CactusSmithingTableBlock::new);

    public static final Block DEEPSLATE_STONECUTTER = registerBlock("deepslate_stonecutter",
            AbstractBlock.Settings.copy(Blocks.STONECUTTER).mapColor(MapColor.DEEPSLATE_GRAY)
                    .strength(4.5f).sounds(BlockSoundGroup.DEEPSLATE),DeepslateStonecutterBlock::new);
    public static final Block BLACKSTONE_STONECUTTER = registerBlock("blackstone_stonecutter",
            AbstractBlock.Settings.copy(Blocks.STONECUTTER).mapColor(MapColor.BLACK)
                    .strength(3.0f),BlackstoneStonecutterBlock::new);
    public static final Block TUFF_STONECUTTER = registerBlock("tuff_stonecutter",
            AbstractBlock.Settings.copy(Blocks.STONECUTTER).mapColor(MapColor.BLACK)
                    .strength(3.0f).sounds(BlockSoundGroup.TUFF),TuffStonecutterBlock::new);

    public static final Block COPPER_LANTERN = registerBlock("copper_lantern",
            new OxidizableLanternBlock(Oxidizable.OxidationLevel.UNAFFECTED,AbstractBlock.Settings.copy(Blocks.LANTERN)
                    .sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_COPPER_LANTERN = registerBlock("waxed_copper_lantern",
            AbstractBlock.Settings.copy(DecoBlocks.COPPER_LANTERN),LanternBlock::new);
    public static final Block EXPOSED_COPPER_LANTERN = registerBlock("exposed_copper_lantern",
            new OxidizableLanternBlock(Oxidizable.OxidationLevel.EXPOSED,AbstractBlock.Settings.copy(Blocks.LANTERN)
                    .sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_EXPOSED_COPPER_LANTERN = registerBlock("waxed_exposed_copper_lantern",
            AbstractBlock.Settings.copy(DecoBlocks.EXPOSED_COPPER_LANTERN),LanternBlock::new);
    public static final Block WEATHERED_COPPER_LANTERN = registerBlock("weathered_copper_lantern",
            new OxidizableLanternBlock(Oxidizable.OxidationLevel.WEATHERED,AbstractBlock.Settings.copy(Blocks.LANTERN)
                    .sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_WEATHERED_COPPER_LANTERN = registerBlock("waxed_weathered_copper_lantern",
            AbstractBlock.Settings.copy(DecoBlocks.WEATHERED_COPPER_LANTERN),LanternBlock::new);
    public static final Block OXIDIZED_COPPER_LANTERN = registerBlock("oxidized_copper_lantern",
            new OxidizableLanternBlock(Oxidizable.OxidationLevel.OXIDIZED,AbstractBlock.Settings.copy(Blocks.LANTERN)
                    .sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_OXIDIZED_COPPER_LANTERN = registerBlock("waxed_oxidized_copper_lantern",
            AbstractBlock.Settings.copy(DecoBlocks.OXIDIZED_COPPER_LANTERN),LanternBlock::new);

    public static final Block COPPER_SOUL_LANTERN = registerBlock("copper_soul_lantern",
            new OxidizableLanternBlock(Oxidizable.OxidationLevel.UNAFFECTED,AbstractBlock.Settings.copy(Blocks.SOUL_LANTERN)
                    .sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_COPPER_SOUL_LANTERN = registerBlock("waxed_copper_soul_lantern",
            AbstractBlock.Settings.copy(DecoBlocks.COPPER_SOUL_LANTERN),LanternBlock::new);
    public static final Block EXPOSED_COPPER_SOUL_LANTERN = registerBlock("exposed_copper_soul_lantern",
            new OxidizableLanternBlock(Oxidizable.OxidationLevel.EXPOSED,AbstractBlock.Settings.copy(Blocks.SOUL_LANTERN)
                    .sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_EXPOSED_COPPER_SOUL_LANTERN = registerBlock("waxed_exposed_copper_soul_lantern",
            AbstractBlock.Settings.copy(DecoBlocks.EXPOSED_COPPER_SOUL_LANTERN),LanternBlock::new);
    public static final Block WEATHERED_COPPER_SOUL_LANTERN = registerBlock("weathered_copper_soul_lantern",
            new OxidizableLanternBlock(Oxidizable.OxidationLevel.WEATHERED,AbstractBlock.Settings.copy(Blocks.SOUL_LANTERN)
                    .sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_WEATHERED_COPPER_SOUL_LANTERN = registerBlock("waxed_weathered_copper_soul_lantern",
            AbstractBlock.Settings.copy(DecoBlocks.WEATHERED_COPPER_SOUL_LANTERN),LanternBlock::new);
    public static final Block OXIDIZED_COPPER_SOUL_LANTERN = registerBlock("oxidized_copper_soul_lantern",
            new OxidizableLanternBlock(Oxidizable.OxidationLevel.OXIDIZED,AbstractBlock.Settings.copy(Blocks.SOUL_LANTERN)
                    .sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_OXIDIZED_COPPER_SOUL_LANTERN = registerBlock("waxed_oxidized_copper_soul_lantern",
            AbstractBlock.Settings.copy(DecoBlocks.OXIDIZED_COPPER_SOUL_LANTERN),LanternBlock::new);

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

    public static final Block STONE_TEMP = registerBlockTemp("stone_temp", Block::new);
    public static final Block SMOOTH_STONE_TEMP = registerBlockTemp("smooth_stone_temp", Block::new);
    public static final Block POLISHED_ANDESITE_TEMP = registerBlockTemp("polished_andesite_temp", Block::new);
    public static final Block POLISHED_DIORITE_TEMP = registerBlockTemp("polished_diorite_temp", Block::new);
    public static final Block POLISHED_GRANITE_TEMP = registerBlockTemp("polished_granite_temp", Block::new);
    public static final Block DRIPSTONE_TEMP = registerBlockTemp("dripstone_temp",Block::new);
    public static final Block CALCITE_TEMP = registerBlockTemp("calcite_temp",Block::new);
    public static final Block TUFF_TEMP = registerBlockTemp("tuff_temp",Block::new);
    public static final Block PACKED_MUD_TEMP = registerBlockTemp("packed_mud_temp",Block::new);
    public static final Block NETHER_BRICKS_TEMP = registerBlockTemp("nether_bricks_temp",Block::new);
    public static final Block RED_NETHER_BRICKS_TEMP = registerBlockTemp("red_nether_bricks_temp",Block::new);
    public static final Block NETHERRACK_TEMP = registerBlockTemp("netherrack_temp",Block::new);
    public static final Block MAGMA_TEMP = registerBlockTemp("magma_temp",Block::new);
    public static final Block SNOW_TEMP = registerBlockTemp("snow_temp",Block::new);
    public static final Block PACKED_ICE_TEMP = registerBlockTemp("packed_ice_temp",Block::new);
    public static final Block BLUE_ICE_TEMP = registerBlockTemp("blue_ice_temp",Block::new);
    public static final Block SANDSTONE_TOP_TEMP = registerBlockTemp("sandstone_top_temp",Block::new);
    public static final Block RED_SANDSTONE_TOP_TEMP = registerBlockTemp("red_sandstone_top_temp",Block::new);
    public static final Block DARK_PRISMARINE_TEMP = registerBlockTemp("dark_prismarine_temp",Block::new);
    public static final Block PRISMARINE_BRICKS_TEMP = registerBlockTemp("prismarine_bricks_temp",Block::new);
    public static final Block QUARTZ_TEMP = registerBlockTemp("quartz_temp",Block::new);
    public static final Block SMOOTH_QUARTZ_TEMP = registerBlockTemp("smooth_quartz_temp",Block::new);
    public static final Block QUARTZ_BRICKS_TEMP = registerBlockTemp("quartz_bricks_temp",Block::new);
    public static final Block TERRACOTTA_TEMP = registerBlockTemp("terracotta_temp",Block::new);
    public static final Block WHITE_TERRACOTTA_TEMP = registerBlockTemp("white_terracotta_temp",Block::new);
    public static final Block LIGHT_GRAY_TERRACOTTA_TEMP = registerBlockTemp("light_gray_terracotta_temp",Block::new);
    public static final Block GRAY_TERRACOTTA_TEMP = registerBlockTemp("gray_terracotta_temp",Block::new);
    public static final Block BLACK_TERRACOTTA_TEMP = registerBlockTemp("black_terracotta_temp",Block::new);
    public static final Block BROWN_TERRACOTTA_TEMP = registerBlockTemp("brown_terracotta_temp",Block::new);
    public static final Block RED_TERRACOTTA_TEMP = registerBlockTemp("red_terracotta_temp",Block::new);
    public static final Block ORANGE_TERRACOTTA_TEMP = registerBlockTemp("orange_terracotta_temp",Block::new);
    public static final Block YELLOW_TERRACOTTA_TEMP = registerBlockTemp("yellow_terracotta_temp",Block::new);
    public static final Block LIME_TERRACOTTA_TEMP = registerBlockTemp("lime_terracotta_temp",Block::new);
    public static final Block GREEN_TERRACOTTA_TEMP = registerBlockTemp("green_terracotta_temp",Block::new);
    public static final Block CYAN_TERRACOTTA_TEMP = registerBlockTemp("cyan_terracotta_temp",Block::new);
    public static final Block LIGHT_BLUE_TERRACOTTA_TEMP = registerBlockTemp("light_blue_terracotta_temp",Block::new);
    public static final Block BLUE_TERRACOTTA_TEMP = registerBlockTemp("blue_terracotta_temp",Block::new);
    public static final Block PURPLE_TERRACOTTA_TEMP = registerBlockTemp("purple_terracotta_temp",Block::new);
    public static final Block MAGENTA_TERRACOTTA_TEMP = registerBlockTemp("magenta_terracotta_temp",Block::new);
    public static final Block PINK_TERRACOTTA_TEMP = registerBlockTemp("pink_terracotta_temp",Block::new);
    public static final Block WHITE_CONCRETE_TEMP = registerBlockTemp("white_concrete_temp",Block::new);
    public static final Block LIGHT_GRAY_CONCRETE_TEMP = registerBlockTemp("light_gray_concrete_temp",Block::new);
    public static final Block GRAY_CONCRETE_TEMP = registerBlockTemp("gray_concrete_temp",Block::new);
    public static final Block BLACK_CONCRETE_TEMP = registerBlockTemp("black_concrete_temp",Block::new);
    public static final Block BROWN_CONCRETE_TEMP = registerBlockTemp("brown_concrete_temp",Block::new);
    public static final Block RED_CONCRETE_TEMP = registerBlockTemp("red_concrete_temp",Block::new);
    public static final Block ORANGE_CONCRETE_TEMP = registerBlockTemp("orange_concrete_temp",Block::new);
    public static final Block YELLOW_CONCRETE_TEMP = registerBlockTemp("yellow_concrete_temp",Block::new);
    public static final Block LIME_CONCRETE_TEMP = registerBlockTemp("lime_concrete_temp",Block::new);
    public static final Block GREEN_CONCRETE_TEMP = registerBlockTemp("green_concrete_temp",Block::new);
    public static final Block CYAN_CONCRETE_TEMP = registerBlockTemp("cyan_concrete_temp",Block::new);
    public static final Block LIGHT_BLUE_CONCRETE_TEMP = registerBlockTemp("light_blue_concrete_temp",Block::new);
    public static final Block BLUE_CONCRETE_TEMP = registerBlockTemp("blue_concrete_temp",Block::new);
    public static final Block PURPLE_CONCRETE_TEMP = registerBlockTemp("purple_concrete_temp",Block::new);
    public static final Block MAGENTA_CONCRETE_TEMP = registerBlockTemp("magenta_concrete_temp",Block::new);
    public static final Block PINK_CONCRETE_TEMP = registerBlockTemp("pink_concrete_temp",Block::new);
    public static final Block END_STONE_TEMP = registerBlockTemp("end_stone_temp",Block::new);
    public static final Block OBSIDIAN_TEMP = registerBlockTemp("obsidian_temp",Block::new);
    public static final Block POLISHED_DEEPSLATE_TEMP = registerBlockTemp("polished_deepslate_temp",Block::new);
    public static final Block DEEPSLATE_TEMP = registerBlockTemp("deepslate_temp",Block::new);
    public static final Block BLACKSTONE_TEMP = registerBlockTemp("blackstone_temp",Block::new);
    public static final Block COBBLESTONE_TEMP = registerBlockTemp("cobblestone_temp",Block::new);
    public static final Block COBBLED_DEEPSLATE_TEMP = registerBlockTemp("cobbled_deepslate_temp",Block::new);
    public static final Block STRIPPED_OAK_TEMP = registerBlockTemp("stripped_oak_temp",Block::new);
    public static final Block STRIPPED_SPRUCE_TEMP = registerBlockTemp("stripped_spruce_temp",Block::new);
    public static final Block STRIPPED_BIRCH_TEMP = registerBlockTemp("stripped_birch_temp",Block::new);
    public static final Block STRIPPED_JUNGLE_TEMP = registerBlockTemp("stripped_jungle_temp",Block::new);
    public static final Block STRIPPED_ACACIA_TEMP = registerBlockTemp("stripped_acacia_temp",Block::new);
    public static final Block STRIPPED_DARK_OAK_TEMP = registerBlockTemp("stripped_dark_oak_temp",Block::new);
    public static final Block STRIPPED_MANGROVE_TEMP = registerBlockTemp("stripped_mangrove_temp",Block::new);
    public static final Block STRIPPED_CHERRY_TEMP = registerBlockTemp("stripped_cherry_temp",Block::new);
    public static final Block STRIPPED_CRIMSON_TEMP = registerBlockTemp("stripped_crimson_temp",Block::new);
    public static final Block STRIPPED_WARPED_TEMP = registerBlockTemp("stripped_warped_temp",Block::new);
    public static final Block STRIPPED_WOODEN_TEMP = registerBlockTemp("stripped_wooden_temp",Block::new);
    public static final Block BAMBOO_MOSAIC_TEMP = registerBlockTemp("bamboo_mosaic_temp",Block::new);
    public static final Block SPRUCE_MOSAIC_TEMP = registerBlockTemp("spruce_mosaic_temp",Block::new);
    public static final Block JUNGLE_MOSAIC_TEMP = registerBlockTemp("jungle_mosaic_temp",Block::new);
    public static final Block DARK_OAK_MOSAIC_TEMP = registerBlockTemp("dark_oak_mosaic_temp",Block::new);
    public static final Block CRIMSON_MOSAIC_TEMP = registerBlockTemp("crimson_mosaic_temp",Block::new);
    public static final Block CACTUS_MOSAIC_TEMP = registerBlockTemp("cactus_mosaic_temp",Block::new);
    public static final Block POLISHED_TUFF_TEMP = registerBlockTemp("polished_tuff_temp",Block::new);

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

    public static <T extends Block> T registerBlockWithoutItem(String name,AbstractBlock.Settings settings, Function<AbstractBlock.Settings, T> factory){
        T block = factory.apply(settings.registryKey(getBlockKey(name)));
        return Registry.register(Registries.BLOCK, getBlockKey(name), block);
    }
    public static <T extends Block> T registerBlockTemp(String name, Function<AbstractBlock.Settings, T> factory){
        T block = factory.apply(AbstractBlock.Settings.create().dropsNothing().registryKey(getBlockKey(name)));
        registerBlockItem(block);
        return Registry.register(Registries.BLOCK, getBlockKey(name), block);
    }
    public static BlockItem registerBlockItem(Block block){
        String name = Registries.BLOCK.getId(block).getPath();
        return Registry.register(Registries.ITEM, getItemKey(name),
                new BlockItem(block, new Item.Settings().useBlockPrefixedTranslationKey().registryKey(getItemKey(name))));
    }
    public static <T extends Block> T registerBlock(String name,AbstractBlock.Settings settings, Function<AbstractBlock.Settings, T> factory){
        T block = factory.apply(settings.registryKey(getBlockKey(name)));
        registerBlockItem(block);
        return Registry.register(Registries.BLOCK, getBlockKey(name), block);
    }
    public static Block registerBlockNamed(String name, AbstractBlock.Settings settings){
        return registerBlock(name, settings, Block::new);
    }
    public static <T extends Block> T registerSimpleWithoutItem(String name, T block){
        RegistryKey<Block> key = getBlockKey(name);
        return Registry.register(Registries.BLOCK, getBlockKey(name), block);
    }
    public static <T extends Block> T registerSimple(String name, T block){
        RegistryKey<Block> key = getBlockKey(name);
        registerBlockItem(block);
        return Registry.register(Registries.BLOCK, getBlockKey(name), block);
    }
    public static StairsBlock registerStairs(String name, Block block, Block copyBlock){
        return registerSimple(name, new StairsBlock(block.getDefaultState(),
                AbstractBlock.Settings.copy(copyBlock).registryKey(DecoBlocks.getBlockKey(name))));
    }
    public static MagmaStairBlock registerMagmaStairs(String name, Block block, Block copyBlock){
        return registerSimple(name, new MagmaStairBlock(block.getDefaultState(),
                AbstractBlock.Settings.copy(copyBlock).registryKey(DecoBlocks.getBlockKey(name))));
    }
    public static MagmaBrickStairBlock registerMagmaBrickStairs(String name, Block block, Block copyBlock){
        return registerSimple(name, new MagmaBrickStairBlock(block.getDefaultState(),
                AbstractBlock.Settings.copy(copyBlock).registryKey(DecoBlocks.getBlockKey(name))));
    }
    public static BubbleStairBlock registerBubbleStairs(String name, Block block, Block copyBlock){
        return registerSimple(name, new BubbleStairBlock(block.getDefaultState(),
                AbstractBlock.Settings.copy(copyBlock).registryKey(DecoBlocks.getBlockKey(name))));
    }
    public static StainedGlassBlock registerStainedGlass(String name, DyeColor color, Block copyBlock, float strength, float blastRes){
        return registerSimple(name, new StainedGlassBlock(color,
                AbstractBlock.Settings.copy(copyBlock).strength(strength).resistance(blastRes)
                        .registryKey(DecoBlocks.getBlockKey(name))));
    }
    public static FlowerPotBlock registerFlowerPot(String name, Block content, Block copyBlock){
        return registerSimpleWithoutItem(name, new FlowerPotBlock(content,
                AbstractBlock.Settings.copy(copyBlock).registryKey(DecoBlocks.getBlockKey(name))));
    }

    public static RegistryKey<Block> getBlockKey(String name){
        return RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(name));
    }

    public static RegistryKey<Item> getItemKey(String name){
        return RegistryKey.of(RegistryKeys.ITEM, Identifier.of(name));
    }
    
    public static void registerDecoBlocks(){
        VaranDeco.LOGGER.debug("Registering Blocks for " + VaranDeco.MOD_ID);
    }
}