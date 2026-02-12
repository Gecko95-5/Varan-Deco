package net.gecko.varandeco.block;

import com.terraformersmc.terraform.sign.block.TerraformSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformWallSignBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.gecko.varandeco.VaranDeco;
import net.gecko.varandeco.block.bubblelevatorblocks.*;
import net.gecko.varandeco.block.cartographytables.*;
import net.gecko.varandeco.block.craftingtables.*;
import net.gecko.varandeco.block.custom.*;
import net.gecko.varandeco.block.nature.*;
import net.gecko.varandeco.block.nature.flower.*;
import net.gecko.varandeco.block.nature.ice.BlackIceBlock;
import net.gecko.varandeco.block.nature.ice.FragileIceBlock;
import net.gecko.varandeco.block.oxidizable.*;
import net.gecko.varandeco.block.smithingtables.*;
import net.gecko.varandeco.block.stonemadeblocks.*;
import net.gecko.varandeco.item.DecoItemGroup;
import net.gecko.varandeco.world.feature.tree.WoodenSaplingGenerator;
import net.minecraft.block.*;
import net.minecraft.data.family.BlockFamilies;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.BlockView;

public class DecoBlocks {
    public static final Block CUT_GRANITE = registerBlock("cut_granite",
            new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_GRANITE)),
                DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block GRANITE_BRICKS = registerBlock("granite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_GRANITE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CUT_DIORITE = registerBlock("cut_diorite",
            new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_DIORITE)),
                DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block DIORITE_BRICKS = registerBlock("diorite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_DIORITE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CUT_ANDESITE = registerBlock("cut_andesite",
            new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_ANDESITE)),
                DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block ANDESITE_BRICKS = registerBlock("andesite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_ANDESITE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block POLISHED_CALCITE = registerBlock("polished_calcite",
            new Block(FabricBlockSettings.copyOf(Blocks.CALCITE).strength(1.0F)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CUT_CALCITE = registerBlock("cut_calcite",
            new Block(FabricBlockSettings.copyOf(DecoBlocks.POLISHED_CALCITE)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CALCITE_BRICKS = registerBlock("calcite_bricks",
            new Block(FabricBlockSettings.copyOf(DecoBlocks.POLISHED_CALCITE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block PACKED_GRASS = registerBlock("packed_grass",
            new PackedGrassBlock(FabricBlockSettings.copyOf(Blocks.GRASS_BLOCK)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block PACKED_PODZOL = registerBlock("packed_podzol",
            new Block(FabricBlockSettings.copyOf(Blocks.PODZOL)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block PACKED_CRIMSON_NYLIUM = registerBlock("packed_crimson_nylium",
            new PackedCrimsonNyliumBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_NYLIUM)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block PACKED_WARPED_NYLIUM = registerBlock("packed_warped_nylium",
            new PackedWarpedNyliumBlock(FabricBlockSettings.copyOf(Blocks.WARPED_NYLIUM)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CACTUS_PLANKS = registerBlock("cactus_planks",
            new Block(FabricBlockSettings.of(Material.WOOD, MapColor.PALE_GREEN).strength(1.0f,1.5f)
                    .sounds(BlockSoundGroup.WOOD)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block MUSHROOM_PLANKS = registerBlock("mushroom_planks",
            new Block(FabricBlockSettings.of(Material.WOOD, MapColor.RAW_IRON_PINK).strength(1.0f,1.5f)
                    .sounds(BlockSoundGroup.WOOD)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block WOODEN_PLANKS = registerBlock("wooden_planks",
            new Block(FabricBlockSettings.of(Material.WOOD).mapColor(MapColor.BROWN).strength(2.0f,3.0f)
                    .sounds(BlockSoundGroup.WOOD)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CHARCOAL_BLOCK = registerBlock("charcoal_block",
            new Block(FabricBlockSettings.of(Material.STONE, MapColor.SPRUCE_BROWN).requiresTool()
                    .strength(5.0F, 6.0F).sounds(BlockSoundGroup.WOOD)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block FLINT_BLOCK = registerBlock("flint_block",
            new Block(FabricBlockSettings.of(Material.STONE, MapColor.BLACK).requiresTool().strength(5.0F, 6.0F)
                    .sounds(BlockSoundGroup.DEEPSLATE_BRICKS)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block ECHO_BLOCK = registerBlock("echo_block",
            new Block(FabricBlockSettings.of(Material.METAL, MapColor.BLACK).requiresTool().strength(2.0F, 3.0F)
                    .sounds(BlockSoundGroup.SCULK_CATALYST).luminance(state -> 7)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CUT_IRON = registerBlock("cut_iron",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CUT_IRON_STAIRS = registerBlock("cut_iron_stairs",
            new StairsBlock(DecoBlocks.CUT_IRON.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.CUT_IRON)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CUT_IRON_SLAB = registerBlock("cut_iron_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_IRON)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CUT_GOLD = registerBlock("cut_gold",
            new Block(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CUT_GOLD_STAIRS = registerBlock("cut_gold_stairs",
            new StairsBlock(DecoBlocks.CUT_GOLD.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.CUT_GOLD)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CUT_GOLD_SLAB = registerBlock("cut_gold_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_GOLD)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block WOODEN_LOG = registerBlock("wooden_log",
            createLogBlock(MapColor.BROWN, MapColor.TERRACOTTA_BROWN),DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block STRIPPED_WOODEN_LOG = registerBlock("stripped_wooden_log",
            createLogBlock(MapColor.BROWN, MapColor.BROWN),DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block STRIPPED_WOODEN_WOOD = registerBlock("stripped_wooden_wood",
            new PillarBlock(FabricBlockSettings.of(Material.WOOD).mapColor(MapColor.BROWN).strength(2.0f,2.0f)
                    .sounds(BlockSoundGroup.WOOD)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block WOODEN_WOOD = registerBlock("wooden_wood",
            new PillarBlock(FabricBlockSettings.of(Material.WOOD).mapColor(MapColor.TERRACOTTA_BROWN).strength(2.0f,2.0f)
                    .sounds(BlockSoundGroup.WOOD)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block HARDENED_GLASS = registerBlock("hardened_glass",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS).strength(25.0f,100.0f)
                    .nonOpaque().requiresTool()), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block HARDENED_TINTED_GLASS = registerBlock("hardened_tinted_glass",
            new TintedGlassBlock(FabricBlockSettings.copyOf(Blocks.TINTED_GLASS).strength(25.0f,100.0f)
                    .nonOpaque().requiresTool()), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CUT_SANDSTONE_BRICKS = registerBlock("cut_sandstone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.CUT_SANDSTONE).strength(1.6f)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block COBBLED_SANDSTONE = registerBlock("cobbled_sandstone",
            new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CHISELED_POLISHED_SANDSTONE = registerBlock("chiseled_polished_sandstone",
            new Block(FabricBlockSettings.copyOf(Blocks.CHISELED_SANDSTONE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block POLISHED_SANDSTONE = registerBlock("polished_sandstone",
            new Block(FabricBlockSettings.copyOf(Blocks.CUT_SANDSTONE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block SANDSTONE_BRICKS = registerBlock("sandstone_bricks",
            new Block(FabricBlockSettings.copyOf(DecoBlocks.CUT_SANDSTONE_BRICKS)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block SMOOTH_OBSIDIAN = registerBlock("smooth_obsidian",
            new Block(FabricBlockSettings.copyOf(Blocks.OBSIDIAN).strength(60.0F, 1200.0F)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block SMOOTH_PURPUR = registerBlock("smooth_purpur",
            new Block(FabricBlockSettings.copyOf(Blocks.PURPUR_BLOCK)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block SMOOTH_DEEPSLATE = registerBlock("smooth_deepslate",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(3.5f,6.0f)
                    .mapColor(MapColor.IRON_GRAY)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block SMOOTH_BLACKSTONE = registerBlock("smooth_blackstone",
            new Block(FabricBlockSettings.copyOf(Blocks.BLACKSTONE).strength(2.0f,6.0f)
                    .mapColor(MapColor.DARK_AQUA)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block SMOOTH_END_STONE = registerBlock("smooth_end_stone",
            new Block(FabricBlockSettings.copyOf(Blocks.END_STONE).strength(3.5F, 9.0F)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CHISELED_BRICKS = registerBlock("chiseled_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CHISELED_OBSIDIAN = registerBlock("chiseled_obsidian",
            new Block(FabricBlockSettings.copyOf(Blocks.OBSIDIAN).mapColor(MapColor.PURPLE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block SANDED_OBSIDIAN = registerBlock("sanded_obsidian",
            new Block(FabricBlockSettings.copyOf(Blocks.OBSIDIAN).mapColor(MapColor.PURPLE).strength(25.0F, 1200.0F)),
                DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block OBSIDIAN_BRICKS = registerBlock("obsidian_bricks",
            new Block(FabricBlockSettings.copyOf(DecoBlocks.SANDED_OBSIDIAN)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CUT_OBSIDIAN = registerBlock("cut_obsidian",
            new Block(FabricBlockSettings.copyOf(DecoBlocks.SANDED_OBSIDIAN)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block OBSIDIAN_PILLAR = registerBlock("obsidian_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OBSIDIAN).mapColor(MapColor.PURPLE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CHISELED_PURPUR = registerBlock("chiseled_purpur",
            new Block(FabricBlockSettings.copyOf(Blocks.PURPUR_BLOCK)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block PURPUR_BRICKS = registerBlock("purpur_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.PURPUR_BLOCK)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CUT_PURPUR = registerBlock("cut_purpur",
            new Block(FabricBlockSettings.copyOf(Blocks.PURPUR_BLOCK)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block SNOW_BRICKS = registerBlock("snow_bricks",
            new Block(FabricBlockSettings.of(Material.SNOW_BLOCK).slipperiness(0.89F)
                    .strength(1.0f).resistance(0.7f).requiresTool().sounds(BlockSoundGroup.SNOW)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CHISELED_SNOW_BRICKS = registerBlock("chiseled_snow_bricks",
            new Block(FabricBlockSettings.copyOf(DecoBlocks.SNOW_BRICKS)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block PACKED_NETHERRACK = registerBlock("packed_netherrack",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHERRACK).strength(3.2F,1.0f)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block NETHERRACK_BRICKS = registerBlock("netherrack_bricks",
            new Block(FabricBlockSettings.copyOf(DecoBlocks.PACKED_NETHERRACK)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CHISELED_NETHERRACK_BRICKS = registerBlock("chiseled_netherrack_bricks",
            new Block(FabricBlockSettings.copyOf(DecoBlocks.NETHERRACK_BRICKS)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block BASALT_BRICKS = registerBlock("basalt_bricks",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_BASALT)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block SMOOTH_GLOWSTONE = registerBlock("smooth_glowstone",
            new Block(FabricBlockSettings.copyOf(Blocks.GLOWSTONE).strength(0.6f)), DecoItemGroup.VARAN_DECO_BUILDING);

    public static final Block WHITE_LAMP = registerBlock("white_lamp",
            new Block(FabricBlockSettings.copyOf(DecoBlocks.SMOOTH_GLOWSTONE).mapColor(DyeColor. WHITE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block ORANGE_LAMP = registerBlock("orange_lamp",
            new Block(FabricBlockSettings.copyOf(DecoBlocks.SMOOTH_GLOWSTONE).mapColor(DyeColor.ORANGE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block MAGENTA_LAMP = registerBlock("magenta_lamp",
            new Block(FabricBlockSettings.copyOf(DecoBlocks.SMOOTH_GLOWSTONE).mapColor(DyeColor.MAGENTA)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block LIGHT_BLUE_LAMP = registerBlock("light_blue_lamp",
            new Block(FabricBlockSettings.copyOf(DecoBlocks.SMOOTH_GLOWSTONE).mapColor(DyeColor.LIGHT_BLUE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block YELLOW_LAMP = registerBlock("yellow_lamp",
            new Block(FabricBlockSettings.copyOf(DecoBlocks.SMOOTH_GLOWSTONE).mapColor(DyeColor.YELLOW)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block LIME_LAMP = registerBlock("lime_lamp",
            new Block(FabricBlockSettings.copyOf(DecoBlocks.SMOOTH_GLOWSTONE).mapColor(DyeColor.LIME)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block PINK_LAMP = registerBlock("pink_lamp",
            new Block(FabricBlockSettings.copyOf(DecoBlocks.SMOOTH_GLOWSTONE).mapColor(DyeColor.PINK)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block GRAY_LAMP = registerBlock("gray_lamp",
            new Block(FabricBlockSettings.copyOf(DecoBlocks.SMOOTH_GLOWSTONE).mapColor(DyeColor.GRAY)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block LIGHT_GRAY_LAMP = registerBlock("light_gray_lamp",
            new Block(FabricBlockSettings.copyOf(DecoBlocks.SMOOTH_GLOWSTONE).mapColor(DyeColor.LIGHT_GRAY)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CYAN_LAMP = registerBlock("cyan_lamp",
            new Block(FabricBlockSettings.copyOf(DecoBlocks.SMOOTH_GLOWSTONE).mapColor(DyeColor.CYAN)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block PURPLE_LAMP = registerBlock("purple_lamp",
            new Block(FabricBlockSettings.copyOf(DecoBlocks.SMOOTH_GLOWSTONE).mapColor(DyeColor.PURPLE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block BLUE_LAMP = registerBlock("blue_lamp",
            new Block(FabricBlockSettings.copyOf(DecoBlocks.SMOOTH_GLOWSTONE).mapColor(DyeColor.BLUE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block BROWN_LAMP = registerBlock("brown_lamp",
            new Block(FabricBlockSettings.copyOf(DecoBlocks.SMOOTH_GLOWSTONE).mapColor(DyeColor.BROWN)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block GREEN_LAMP = registerBlock("green_lamp",
            new Block(FabricBlockSettings.copyOf(DecoBlocks.SMOOTH_GLOWSTONE).mapColor(DyeColor.GREEN)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block RED_LAMP = registerBlock("red_lamp",
            new Block(FabricBlockSettings.copyOf(DecoBlocks.SMOOTH_GLOWSTONE).mapColor(DyeColor.RED)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block BLACK_LAMP = registerBlock("black_lamp",
            new Block(FabricBlockSettings.copyOf(DecoBlocks.SMOOTH_GLOWSTONE).mapColor(DyeColor.BLACK)), DecoItemGroup.VARAN_DECO_BUILDING);

    public static final Block POLISHED_STONE = registerBlock("polished_stone",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2.5f).resistance(6.0f).requiresTool()),
            DecoItemGroup.VARAN_DECO_BUILDING);
    //This Block 's textures reference is made by this company https://3rdstreetinn.com/collections/interlocking-slate-tiles
    public static final Block STONE_TILES = registerBlock("stone_tiles",
            new Block(FabricBlockSettings.of(Material.STONE).strength(1.5f).resistance(6.0f).requiresTool()),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CRACKED_STONE_TILES = registerBlock("cracked_stone_tiles",
            new Block(FabricBlockSettings.copyOf(DecoBlocks.STONE_TILES)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CHISELED_MUD_BRICKS = registerBlock("chiseled_mud_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.MUD_BRICKS)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block PACKED_MYCELIUM = registerBlock("packed_mycelium",
            new PackedMyceliumBlock(FabricBlockSettings.copyOf(Blocks.MYCELIUM)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CHISELED_END_STONE = registerBlock("chiseled_end_stone",
            new Block(FabricBlockSettings.copyOf(Blocks.END_STONE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block POLISHED_END_STONE = registerBlock("polished_end_stone",
            new Block(FabricBlockSettings.copyOf(Blocks.END_STONE).strength(4.0F, 9.0F)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CRACKED_END_STONE_BRICKS = registerBlock("cracked_end_stone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.END_STONE_BRICKS)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block END_STONE_TILES = registerBlock("end_stone_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.END_STONE_BRICKS)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CRACKED_END_STONE_TILES = registerBlock("cracked_end_stone_tiles",
            new Block(FabricBlockSettings.copyOf(DecoBlocks.END_STONE_TILES)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block VOID_STONE = registerBlock("void_stone",
            new Block(FabricBlockSettings.copyOf(Blocks.END_STONE).sounds(BlockSoundGroup.DEEPSLATE)
                    .mapColor(MapColor.TERRACOTTA_BLUE).strength(5.0F, 12.0F)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block VOID_STONE_BRICKS = registerBlock("void_stone_bricks",
            new Block(FabricBlockSettings.copyOf(DecoBlocks.VOID_STONE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CHISELED_VOID_STONE = registerBlock("chiseled_void_stone",
            new Block(FabricBlockSettings.copyOf(DecoBlocks.VOID_STONE).luminance(state -> 1)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CUT_QUARTZ = registerBlock("cut_quartz",
            new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block WHITE_TERRACOTTA_BRICKS = registerBlock("white_terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.WHITE_TERRACOTTA)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block ORANGE_TERRACOTTA_BRICKS = registerBlock("orange_terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.ORANGE_TERRACOTTA)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block MAGENTA_TERRACOTTA_BRICKS = registerBlock("magenta_terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.MAGENTA_TERRACOTTA)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block LIGHT_BLUE_TERRACOTTA_BRICKS = registerBlock("light_blue_terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_TERRACOTTA)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block YELLOW_TERRACOTTA_BRICKS = registerBlock("yellow_terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.YELLOW_TERRACOTTA)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block LIME_TERRACOTTA_BRICKS = registerBlock("lime_terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.LIME_TERRACOTTA)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block PINK_TERRACOTTA_BRICKS = registerBlock("pink_terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.PINK_TERRACOTTA)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block GRAY_TERRACOTTA_BRICKS = registerBlock("gray_terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.GRAY_TERRACOTTA)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block LIGHT_GRAY_TERRACOTTA_BRICKS = registerBlock("light_gray_terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_TERRACOTTA)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CYAN_TERRACOTTA_BRICKS = registerBlock("cyan_terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.CYAN_TERRACOTTA)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block PURPLE_TERRACOTTA_BRICKS = registerBlock("purple_terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.PURPLE_TERRACOTTA)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block BLUE_TERRACOTTA_BRICKS = registerBlock("blue_terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.BLUE_TERRACOTTA)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block BROWN_TERRACOTTA_BRICKS = registerBlock("brown_terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.BROWN_TERRACOTTA)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block GREEN_TERRACOTTA_BRICKS = registerBlock("green_terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.GREEN_TERRACOTTA)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block RED_TERRACOTTA_BRICKS = registerBlock("red_terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.RED_TERRACOTTA)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block BLACK_TERRACOTTA_BRICKS = registerBlock("black_terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.BLACK_TERRACOTTA)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block TERRACOTTA_BRICKS = registerBlock("terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.TERRACOTTA)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block HARDENED_WHITE_STAINED_GLASS = registerBlock("hardened_white_stained_glass",
            new StainedGlassBlock(DyeColor.WHITE, FabricBlockSettings.copyOf(Blocks.WHITE_STAINED_GLASS).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block HARDENED_ORANGE_STAINED_GLASS = registerBlock("hardened_orange_stained_glass",
            new StainedGlassBlock(DyeColor.ORANGE, FabricBlockSettings.copyOf(Blocks.ORANGE_STAINED_GLASS).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block HARDENED_MAGENTA_STAINED_GLASS = registerBlock("hardened_magenta_stained_glass",
            new StainedGlassBlock(DyeColor.MAGENTA, FabricBlockSettings.copyOf(Blocks.MAGENTA_STAINED_GLASS).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block HARDENED_LIGHT_BLUE_STAINED_GLASS = registerBlock("hardened_light_blue_stained_glass",
            new StainedGlassBlock(DyeColor.LIGHT_BLUE, FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_STAINED_GLASS).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block HARDENED_YELLOW_STAINED_GLASS = registerBlock("hardened_yellow_stained_glass",
            new StainedGlassBlock(DyeColor.YELLOW, FabricBlockSettings.copyOf(Blocks.YELLOW_STAINED_GLASS).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block HARDENED_LIME_STAINED_GLASS = registerBlock("hardened_lime_stained_glass",
            new StainedGlassBlock(DyeColor.LIME, FabricBlockSettings.copyOf(Blocks.LIME_STAINED_GLASS).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block HARDENED_PINK_STAINED_GLASS = registerBlock("hardened_pink_stained_glass",
            new StainedGlassBlock(DyeColor.PINK, FabricBlockSettings.copyOf(Blocks.PINK_STAINED_GLASS).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block HARDENED_GRAY_STAINED_GLASS = registerBlock("hardened_gray_stained_glass",
            new StainedGlassBlock(DyeColor.GRAY, FabricBlockSettings.copyOf(Blocks.GRAY_STAINED_GLASS).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block HARDENED_LIGHT_GRAY_STAINED_GLASS = registerBlock("hardened_light_gray_stained_glass",
            new StainedGlassBlock(DyeColor.LIGHT_GRAY, FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_STAINED_GLASS).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block HARDENED_CYAN_STAINED_GLASS = registerBlock("hardened_cyan_stained_glass",
            new StainedGlassBlock(DyeColor.CYAN, FabricBlockSettings.copyOf(Blocks.CYAN_STAINED_GLASS).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block HARDENED_PURPLE_STAINED_GLASS = registerBlock("hardened_purple_stained_glass",
            new StainedGlassBlock(DyeColor.PURPLE, FabricBlockSettings.copyOf(Blocks.PURPLE_STAINED_GLASS).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block HARDENED_BLUE_STAINED_GLASS = registerBlock("hardened_blue_stained_glass",
            new StainedGlassBlock(DyeColor.BLUE, FabricBlockSettings.copyOf(Blocks.BLUE_STAINED_GLASS).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block HARDENED_BROWN_STAINED_GLASS = registerBlock("hardened_brown_stained_glass",
            new StainedGlassBlock(DyeColor.BROWN, FabricBlockSettings.copyOf(Blocks.BROWN_STAINED_GLASS).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block HARDENED_GREEN_STAINED_GLASS = registerBlock("hardened_green_stained_glass",
            new StainedGlassBlock(DyeColor.GREEN, FabricBlockSettings.copyOf(Blocks.GREEN_STAINED_GLASS).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block HARDENED_RED_STAINED_GLASS = registerBlock("hardened_red_stained_glass",
            new StainedGlassBlock(DyeColor.RED, FabricBlockSettings.copyOf(Blocks.RED_STAINED_GLASS).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block HARDENED_BLACK_STAINED_GLASS = registerBlock("hardened_black_stained_glass",
            new StainedGlassBlock(DyeColor.BLACK, FabricBlockSettings.copyOf(Blocks.BLACK_STAINED_GLASS).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CUT_RED_SANDSTONE_BRICKS = registerBlock("cut_red_sandstone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.CUT_RED_SANDSTONE).strength(1.6f)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block COBBLED_RED_SANDSTONE = registerBlock("cobbled_red_sandstone",
            new Block(FabricBlockSettings.copyOf(Blocks.RED_SANDSTONE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CHISELED_POLISHED_RED_SANDSTONE = registerBlock("chiseled_polished_red_sandstone",
            new Block(FabricBlockSettings.copyOf(Blocks.CHISELED_RED_SANDSTONE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block POLISHED_RED_SANDSTONE = registerBlock("polished_red_sandstone",
            new Block(FabricBlockSettings.copyOf(Blocks.CUT_RED_SANDSTONE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block RED_SANDSTONE_BRICKS = registerBlock("red_sandstone_bricks",
            new Block(FabricBlockSettings.copyOf(DecoBlocks.CUT_RED_SANDSTONE_BRICKS)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CHISELED_PRISMARINE_BRICKS = registerBlock("chiseled_prismarine_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.PRISMARINE).mapColor(MapColor.DIAMOND_BLUE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CRYSTALLIZED_PRISMARINE = registerBlock("crystallized_prismarine",
            new Block(FabricBlockSettings.copyOf(Blocks.PRISMARINE).mapColor(MapColor.BRIGHT_TEAL)
                    .luminance(state -> 5).sounds(BlockSoundGroup.GLASS)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CRYSTALLIZED_PRISMARINE_BRICKS = registerBlock("crystallized_prismarine_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.PRISMARINE).mapColor(MapColor.BRIGHT_TEAL)
                    .luminance(state -> 5).sounds(BlockSoundGroup.GLASS)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CHISELED_CRYSTALLIZED_PRISMARINE_BRICKS = registerBlock("chiseled_crystallized_prismarine_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.PRISMARINE).mapColor(MapColor.BRIGHT_TEAL)
                    .luminance(state -> 5).sounds(BlockSoundGroup.GLASS)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block LIGHT_PRISMARINE = registerBlock("light_prismarine",
            new Block(FabricBlockSettings.copyOf(Blocks.PRISMARINE).mapColor(MapColor.OFF_WHITE)
                    .luminance(state -> 10).sounds(BlockSoundGroup.GLASS)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block ICE_BRICKS = registerBlock("ice_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.PACKED_ICE).strength(1.4f)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CHISELED_ICE_BRICKS = registerBlock("chiseled_ice_bricks",
            new Block(FabricBlockSettings.copyOf(DecoBlocks.ICE_BRICKS)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block SOUL_SOILSTONE = registerBlock("soul_soilstone",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0.8f).requiresTool().mapColor(MapColor.BROWN)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CHISELED_SOUL_SOILSTONE = registerBlock("chiseled_soul_soilstone",
            new Block(FabricBlockSettings.copyOf(DecoBlocks.SOUL_SOILSTONE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CUT_SOUL_SOILSTONE = registerBlock("cut_soul_soilstone",
            new Block(FabricBlockSettings.copyOf(DecoBlocks.SOUL_SOILSTONE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block SMOOTH_SOUL_SOILSTONE = registerBlock("smooth_soul_soilstone",
            new Block(FabricBlockSettings.copyOf(DecoBlocks.SOUL_SOILSTONE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CUT_SOUL_SOILSTONE_BRICKS = registerBlock("cut_soul_soilstone_bricks",
            new Block(FabricBlockSettings.copyOf(DecoBlocks.CUT_SOUL_SOILSTONE).strength(1.6f)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block COBBLED_SOUL_SOILSTONE = registerBlock("cobbled_soul_soilstone",
            new Block(FabricBlockSettings.copyOf(DecoBlocks.SOUL_SOILSTONE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CHISELED_POLISHED_SOUL_SOILSTONE = registerBlock("chiseled_polished_soul_soilstone",
            new Block(FabricBlockSettings.copyOf(DecoBlocks.CHISELED_SOUL_SOILSTONE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block POLISHED_SOUL_SOILSTONE = registerBlock("polished_soul_soilstone",
            new Block(FabricBlockSettings.copyOf(DecoBlocks.CUT_SOUL_SOILSTONE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block SOUL_SOILSTONE_BRICKS = registerBlock("soul_soilstone_bricks",
            new Block(FabricBlockSettings.copyOf(DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CHISELED_MAGMA_BLOCK = registerBlock("chiseled_magma_block",
            new MagmaBlock(FabricBlockSettings.copyOf(Blocks.MAGMA_BLOCK)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block MAGMA_BRICKS = registerBlock("magma_bricks",
            new MagmaBrickBlock(FabricBlockSettings.copyOf(Blocks.MAGMA_BLOCK).luminance(state -> 1)
                    .strength(1.5F).sounds(BlockSoundGroup.NETHER_BRICKS)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CHISELED_MAGMA_BRICKS = registerBlock("chiseled_magma_bricks",
            new MagmaBrickBlock(FabricBlockSettings.copyOf(DecoBlocks.MAGMA_BRICKS)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block BUBBLE_BLOCK = registerBlock("bubble_block",
            new BubbleBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).strength(0.5F,25.0f)
                    .mapColor(MapColor.BLUE).postProcess(DecoBlocks::always).ticksRandomly()
                    .emissiveLighting(DecoBlocks::always).luminance(state -> 1)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CHISELED_BUBBLE_BLOCK = registerBlock("chiseled_bubble_block",
            new BubbleBlock(FabricBlockSettings.copyOf(DecoBlocks.BUBBLE_BLOCK)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block BUBBLE_BRICKS = registerBlock("bubble_bricks",
            new BubbleBlock(FabricBlockSettings.copyOf(DecoBlocks.BUBBLE_BLOCK).strength(1.5F)
                    .mapColor(MapColor.STONE_GRAY)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CHISELED_BUBBLE_BRICKS = registerBlock("chiseled_bubble_bricks",
            new BubbleBlock(FabricBlockSettings.copyOf(DecoBlocks.BUBBLE_BRICKS)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CHISELED_RED_NETHER_BRICKS = registerBlock("chiseled_red_nether_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.RED_NETHER_BRICKS)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CRACKED_RED_NETHER_BRICKS = registerBlock("cracked_red_nether_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.RED_NETHER_BRICKS)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block BLUE_NETHER_BRICKS = registerBlock("blue_nether_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHER_BRICKS).mapColor(MapColor.TEAL)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CHISELED_BLUE_NETHER_BRICKS = registerBlock("chiseled_blue_nether_bricks",
            new Block(FabricBlockSettings.copyOf(DecoBlocks.BLUE_NETHER_BRICKS)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CRACKED_BLUE_NETHER_BRICKS = registerBlock("cracked_blue_nether_bricks",
            new Block(FabricBlockSettings.copyOf(DecoBlocks.BLUE_NETHER_BRICKS)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CUT_WHITE_CONCRETE = registerBlock("cut_white_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.WHITE_CONCRETE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CUT_ORANGE_CONCRETE = registerBlock("cut_orange_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.ORANGE_CONCRETE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CUT_MAGENTA_CONCRETE = registerBlock("cut_magenta_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.MAGENTA_CONCRETE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CUT_LIGHT_BLUE_CONCRETE = registerBlock("cut_light_blue_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_CONCRETE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CUT_YELLOW_CONCRETE = registerBlock("cut_yellow_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.YELLOW_CONCRETE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CUT_LIME_CONCRETE = registerBlock("cut_lime_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.LIME_CONCRETE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CUT_PINK_CONCRETE = registerBlock("cut_pink_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.PINK_CONCRETE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CUT_GRAY_CONCRETE = registerBlock("cut_gray_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.GRAY_CONCRETE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CUT_LIGHT_GRAY_CONCRETE = registerBlock("cut_light_gray_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_CONCRETE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CUT_CYAN_CONCRETE = registerBlock("cut_cyan_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.CYAN_CONCRETE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CUT_PURPLE_CONCRETE = registerBlock("cut_purple_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.PURPLE_CONCRETE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CUT_BLUE_CONCRETE = registerBlock("cut_blue_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.BLUE_CONCRETE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CUT_BROWN_CONCRETE = registerBlock("cut_brown_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.BROWN_CONCRETE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CUT_GREEN_CONCRETE = registerBlock("cut_green_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.GREEN_CONCRETE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CUT_RED_CONCRETE = registerBlock("cut_red_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.RED_CONCRETE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CUT_BLACK_CONCRETE = registerBlock("cut_black_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.BLACK_CONCRETE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block WHITE_CONCRETE_PILLAR = registerBlock("white_concrete_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.WHITE_CONCRETE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block ORANGE_CONCRETE_PILLAR = registerBlock("orange_concrete_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.ORANGE_CONCRETE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block MAGENTA_CONCRETE_PILLAR = registerBlock("magenta_concrete_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.MAGENTA_CONCRETE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block LIGHT_BLUE_CONCRETE_PILLAR = registerBlock("light_blue_concrete_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_CONCRETE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block YELLOW_CONCRETE_PILLAR = registerBlock("yellow_concrete_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.YELLOW_CONCRETE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block LIME_CONCRETE_PILLAR = registerBlock("lime_concrete_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.LIME_CONCRETE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block PINK_CONCRETE_PILLAR = registerBlock("pink_concrete_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.PINK_CONCRETE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block GRAY_CONCRETE_PILLAR = registerBlock("gray_concrete_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.GRAY_CONCRETE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block LIGHT_GRAY_CONCRETE_PILLAR = registerBlock("light_gray_concrete_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_CONCRETE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CYAN_CONCRETE_PILLAR = registerBlock("cyan_concrete_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.CYAN_CONCRETE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block PURPLE_CONCRETE_PILLAR = registerBlock("purple_concrete_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.PURPLE_CONCRETE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block BLUE_CONCRETE_PILLAR = registerBlock("blue_concrete_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.BLUE_CONCRETE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block BROWN_CONCRETE_PILLAR = registerBlock("brown_concrete_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.BROWN_CONCRETE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block GREEN_CONCRETE_PILLAR = registerBlock("green_concrete_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.GREEN_CONCRETE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block RED_CONCRETE_PILLAR = registerBlock("red_concrete_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.RED_CONCRETE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block BLACK_CONCRETE_PILLAR = registerBlock("black_concrete_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.BLACK_CONCRETE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block POLISHED_GLIDED_BLACKSTONE = registerBlock("polished_gilded_blackstone",
            new Block(FabricBlockSettings.copyOf(Blocks.GILDED_BLACKSTONE).strength(2.5f)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CHISELED_GLIDED_BLACKSTONE = registerBlock("chiseled_gilded_blackstone",
            new Block(FabricBlockSettings.copyOf(DecoBlocks.POLISHED_GLIDED_BLACKSTONE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block POLISHED_BLACKSTONE_TILES = registerBlock("polished_blackstone_tiles",
            new Block(FabricBlockSettings.of(Material.STONE, MapColor.BLACK).strength(1.5f).resistance(6.0f).requiresTool()),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CRACKED_POLISHED_BLACKSTONE_TILES = registerBlock("cracked_polished_blackstone_tiles",
            new Block(FabricBlockSettings.copyOf(DecoBlocks.POLISHED_BLACKSTONE_TILES)), DecoItemGroup.VARAN_DECO_BUILDING);

    public static final Block CLOUD_BLOCK = registerBlock("cloud_block",
            new CloudBlock(FabricBlockSettings.of(Material.GLASS).strength(0.4f,0.2f).sounds(BlockSoundGroup.WOOL)
                    .nonOpaque().allowsSpawning(DecoBlocks::never).noCollision()), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block SOLID_CLOUD = registerBlock("solid_cloud",
            new TransparentBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL).strength(0.8f,0.4f)
                    .allowsSpawning(DecoBlocks::never).nonOpaque()), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CLOUD_BRICKS = registerBlock("cloud_bricks",
            new TransparentBlock(FabricBlockSettings.copyOf(DecoBlocks.SOLID_CLOUD).strength(1.2f,0.6f)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CHISELED_CLOUD_BRICKS = registerBlock("chiseled_cloud_bricks",
            new TransparentBlock(FabricBlockSettings.copyOf(DecoBlocks.SOLID_CLOUD).strength(1.2f,0.6f)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block FRAGILE_ICE = registerBlock("fragile_ice",
            new FragileIceBlock(FabricBlockSettings.of(Material.ICE).slipperiness(0.98F)
                    .breakInstantly().sounds(BlockSoundGroup.GLASS).nonOpaque()
                    .allowsSpawning(DecoBlocks::never).resistance(0.1f)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block BLACK_ICE = registerBlock("black_ice",
            new BlackIceBlock(FabricBlockSettings.of(Material.DENSE_ICE, MapColor.BLACK).slipperiness(1.18F)
                    .strength(5.6f).sounds(BlockSoundGroup.STONE).velocityMultiplier(0.9F)),
            DecoItemGroup.VARAN_DECO_BUILDING);

    public static final Block WHITE_BLOCK = registerBlock("white_block",
            new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT, DyeColor.WHITE).resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block ORANGE_BLOCK = registerBlock("orange_block",
            new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT, DyeColor.ORANGE).resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block MAGENTA_BLOCK = registerBlock("magenta_block",
            new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT, DyeColor.MAGENTA).resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block LIGHT_BLUE_BLOCK = registerBlock("light_blue_block",
            new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT, DyeColor.LIGHT_BLUE).resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block YELLOW_BLOCK = registerBlock("yellow_block",
            new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT, DyeColor.YELLOW).resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block LIME_BLOCK = registerBlock("lime_block",
            new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT, DyeColor.LIME).resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block PINK_BLOCK = registerBlock("pink_block",
            new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT, DyeColor.PINK).resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block GRAY_BLOCK = registerBlock("gray_block",
            new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT, DyeColor.GRAY).resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block LIGHT_GRAY_BLOCK = registerBlock("light_gray_block",
            new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT, DyeColor.LIGHT_GRAY).resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CYAN_BLOCK = registerBlock("cyan_block",
            new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT, DyeColor.CYAN).resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block PURPLE_BLOCK = registerBlock("purple_block",
            new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT, DyeColor.PURPLE).resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block BLUE_BLOCK = registerBlock("blue_block",
            new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT, DyeColor.BLUE).resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block BROWN_BLOCK = registerBlock("brown_block",
            new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT, DyeColor.BROWN).resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block GREEN_BLOCK = registerBlock("green_block",
            new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT, DyeColor.GREEN).resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block RED_BLOCK = registerBlock("red_block",
            new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT, DyeColor.RED).resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block BLACK_BLOCK = registerBlock("black_block",
            new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT, DyeColor.BLACK).resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE)), DecoItemGroup.VARAN_DECO_BUILDING);

    public static final Block PASTEL_ORANGE_BLOCK = registerBlock("pastel_orange_block",
            new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT, DyeColor.ORANGE).resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block PASTEL_MAGENTA_BLOCK = registerBlock("pastel_magenta_block",
            new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT, DyeColor.MAGENTA).resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block PASTEL_LIGHT_BLUE_BLOCK = registerBlock("pastel_light_blue_block",
            new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT, DyeColor.LIGHT_BLUE).resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block PASTEL_YELLOW_BLOCK = registerBlock("pastel_yellow_block",
            new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT, DyeColor.YELLOW).resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block PASTEL_LIME_BLOCK = registerBlock("pastel_lime_block",
            new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT, DyeColor.LIME).resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block PASTEL_PINK_BLOCK = registerBlock("pastel_pink_block",
            new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT, DyeColor.PINK).resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block PASTEL_GRAY_BLOCK = registerBlock("pastel_gray_block",
            new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT, DyeColor.GRAY).resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block PASTEL_LIGHT_GRAY_BLOCK = registerBlock("pastel_light_gray_block",
            new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT, DyeColor.LIGHT_GRAY).resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block PASTEL_CYAN_BLOCK = registerBlock("pastel_cyan_block",
            new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT, DyeColor.CYAN).resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block PASTEL_PURPLE_BLOCK = registerBlock("pastel_purple_block",
            new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT, DyeColor.PURPLE).resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block PASTEL_BLUE_BLOCK = registerBlock("pastel_blue_block",
            new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT, DyeColor.BLUE).resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block PASTEL_BROWN_BLOCK = registerBlock("pastel_brown_block",
            new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT, DyeColor.BROWN).resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block PASTEL_GREEN_BLOCK = registerBlock("pastel_green_block",
            new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT, DyeColor.GREEN).resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block PASTEL_RED_BLOCK = registerBlock("pastel_red_block",
            new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT, DyeColor.RED).resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE)), DecoItemGroup.VARAN_DECO_BUILDING);

    public static final Block SHADED_ORANGE_BLOCK = registerBlock("shaded_orange_block",
            new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT, DyeColor.ORANGE).resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block SHADED_MAGENTA_BLOCK = registerBlock("shaded_magenta_block",
            new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT, DyeColor.MAGENTA).resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block SHADED_LIGHT_BLUE_BLOCK = registerBlock("shaded_light_blue_block",
            new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT, DyeColor.LIGHT_BLUE).resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block SHADED_YELLOW_BLOCK = registerBlock("shaded_yellow_block",
            new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT, DyeColor.YELLOW).resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block SHADED_LIME_BLOCK = registerBlock("shaded_lime_block",
            new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT, DyeColor.LIME).resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block SHADED_PINK_BLOCK = registerBlock("shaded_pink_block",
            new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT, DyeColor.PINK).resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block SHADED_GRAY_BLOCK = registerBlock("shaded_gray_block",
            new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT, DyeColor.GRAY).resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block SHADED_LIGHT_GRAY_BLOCK = registerBlock("shaded_light_gray_block",
            new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT, DyeColor.LIGHT_GRAY).resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block SHADED_CYAN_BLOCK = registerBlock("shaded_cyan_block",
            new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT, DyeColor.CYAN).resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block SHADED_PURPLE_BLOCK = registerBlock("shaded_purple_block",
            new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT, DyeColor.PURPLE).resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block SHADED_BLUE_BLOCK = registerBlock("shaded_blue_block",
            new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT, DyeColor.BLUE).resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block SHADED_BROWN_BLOCK = registerBlock("shaded_brown_block",
            new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT, DyeColor.BROWN).resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block SHADED_GREEN_BLOCK = registerBlock("shaded_green_block",
            new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT, DyeColor.GREEN).resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block SHADED_RED_BLOCK = registerBlock("shaded_red_block",
            new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT, DyeColor.RED).resistance(0.5f)
                    .breakInstantly().sounds(BlockSoundGroup.CANDLE)), DecoItemGroup.VARAN_DECO_BUILDING);

    public static final Block WARPED_WART_PLANT = registerBlockWithoutItem("warped_wart_plant",
            new WarpedWartBlock(FabricBlockSettings.copyOf(Blocks.NETHER_WART).mapColor(MapColor.BRIGHT_TEAL).nonOpaque()));

    public static final Block DEEPSLATE_SLAB = registerBlock("deepslate_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CALCITE_SLAB = registerBlock("calcite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.CALCITE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block TUFF_SLAB = registerBlock("tuff_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TUFF)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block DRIPSTONE_SLAB = registerBlock("dripstone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)), DecoItemGroup.VARAN_DECO_BUILDING);

    public static final Block GRASS_SLAB = registerBlock("grass_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.PACKED_GRASS)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block DIRT_SLAB = registerBlock("dirt_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.DIRT)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block COARSE_DIRT_SLAB = registerBlock("coarse_dirt_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.COARSE_DIRT)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block PODZOL_SLAB = registerBlock("podzol_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.PACKED_PODZOL)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block ROOTED_DIRT_SLAB = registerBlock("rooted_dirt_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.ROOTED_DIRT)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block MUD_SLAB = registerBlock("mud_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.MUD)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CRIMSON_NYLIUM_SLAB = registerBlock("crimson_nylium_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.PACKED_CRIMSON_NYLIUM)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block WARPED_NYLIUM_SLAB = registerBlock("warped_nylium_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.PACKED_WARPED_NYLIUM)), DecoItemGroup.VARAN_DECO_BUILDING);

    public static final Block BEDROCK_SLAB = registerBlock("bedrock_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.BEDROCK)), DecoItemGroup.VARAN_DECO_BUILDING);

    public static final Block RAW_IRON_SLAB = registerBlock("raw_iron_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block RAW_COPPER_SLAB = registerBlock("raw_copper_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.RAW_COPPER_BLOCK)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block RAW_GOLD_SLAB = registerBlock("raw_gold_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.RAW_GOLD_BLOCK)), DecoItemGroup.VARAN_DECO_BUILDING);

    public static final Block IRON_SLAB = registerBlock("iron_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block COPPER_SLAB = registerBlock("copper_slab",
            new OxidizableSlabBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block EXPOSED_COPPER_SLAB = registerBlock("exposed_copper_slab",
            new OxidizableSlabBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copyOf(Blocks.EXPOSED_COPPER)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block WEATHERED_COPPER_SLAB = registerBlock("weathered_copper_slab",
            new OxidizableSlabBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copyOf(Blocks.WEATHERED_COPPER)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block OXIDIZED_COPPER_SLAB = registerBlock("oxidized_copper_slab",
            new OxidizableSlabBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copyOf(Blocks.OXIDIZED_COPPER)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block WAXED_COPPER_SLAB = registerBlock("waxed_copper_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.WAXED_COPPER_BLOCK)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block WAXED_EXPOSED_COPPER_SLAB = registerBlock("waxed_exposed_copper_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.WAXED_EXPOSED_COPPER)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block WAXED_WEATHERED_COPPER_SLAB = registerBlock("waxed_weathered_copper_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.WAXED_WEATHERED_COPPER)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block WAXED_OXIDIZED_COPPER_SLAB = registerBlock("waxed_oxidized_copper_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.WAXED_OXIDIZED_COPPER)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block GOLD_SLAB = registerBlock("gold_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)), DecoItemGroup.VARAN_DECO_BUILDING);

    public static final Block OAK_WOOD_SLAB = registerBlock("oak_wood_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).mapColor(MapColor.DIRT_BROWN)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block SPRUCE_WOOD_SLAB = registerBlock("spruce_wood_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_PLANKS).mapColor(MapColor.BROWN)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block BIRCH_WOOD_SLAB = registerBlock("birch_wood_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.BIRCH_PLANKS).mapColor(MapColor.OFF_WHITE)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block JUNGLE_WOOD_SLAB = registerBlock("jungle_wood_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_PLANKS).mapColor(MapColor.DIRT_BROWN)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block ACACIA_WOOD_SLAB = registerBlock("acacia_wood_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_PLANKS).mapColor(MapColor.STONE_GRAY)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block DARK_OAK_WOOD_SLAB = registerBlock("dark_oak_wood_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.DARK_OAK_PLANKS)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block MANGROVE_WOOD_SLAB = registerBlock("mangrove_wood_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.MANGROVE_PLANKS).mapColor(MapColor.DIRT_BROWN)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CRIMSON_HYPHAE_SLAB = registerBlock("crimson_hyphae_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_PLANKS).sounds(BlockSoundGroup.NETHER_STEM)
                    .mapColor(MapColor.DARK_CRIMSON)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block WARPED_HYPHAE_SLAB = registerBlock("warped_hyphae_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS).sounds(BlockSoundGroup.NETHER_STEM)
                    .mapColor(MapColor.DARK_DULL_PINK)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block WOODEN_WOOD_SLAB = registerBlock("wooden_wood_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.WOODEN_PLANKS).mapColor(MapColor.TERRACOTTA_BROWN)),
            DecoItemGroup.VARAN_DECO_BUILDING);

    public static final Block STRIPPED_OAK_WOOD_SLAB = registerBlock("stripped_oak_wood_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block STRIPPED_SPRUCE_WOOD_SLAB = registerBlock("stripped_spruce_wood_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_PLANKS)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block STRIPPED_BIRCH_WOOD_SLAB = registerBlock("stripped_birch_wood_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.BIRCH_PLANKS)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block STRIPPED_JUNGLE_WOOD_SLAB = registerBlock("stripped_jungle_wood_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_PLANKS)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block STRIPPED_ACACIA_WOOD_SLAB = registerBlock("stripped_acacia_wood_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_PLANKS)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block STRIPPED_DARK_OAK_WOOD_SLAB = registerBlock("stripped_dark_oak_wood_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.DARK_OAK_PLANKS)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block STRIPPED_MANGROVE_WOOD_SLAB = registerBlock("stripped_mangrove_wood_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.MANGROVE_PLANKS)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block STRIPPED_CRIMSON_HYPHAE_SLAB = registerBlock("stripped_crimson_hyphae_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_PLANKS).sounds(BlockSoundGroup.NETHER_STEM)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block STRIPPED_WARPED_HYPHAE_SLAB = registerBlock("stripped_warped_hyphae_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS).sounds(BlockSoundGroup.NETHER_STEM)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block STRIPPED_WOODEN_WOOD_SLAB = registerBlock("stripped_wooden_wood_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.WOODEN_PLANKS)),
            DecoItemGroup.VARAN_DECO_BUILDING);

    public static final Block WHITE_WOOL_SLAB = registerBlock("white_wool_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block ORANGE_WOOL_SLAB = registerBlock("orange_wool_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.ORANGE_WOOL)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block MAGENTA_WOOL_SLAB = registerBlock("magenta_wool_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.MAGENTA_WOOL)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block LIGHT_BLUE_WOOL_SLAB = registerBlock("light_blue_wool_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_WOOL)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block YELLOW_WOOL_SLAB = registerBlock("yellow_wool_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.YELLOW_WOOL)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block LIME_WOOL_SLAB = registerBlock("lime_wool_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.LIME_WOOL)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block PINK_WOOL_SLAB = registerBlock("pink_wool_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.PINK_WOOL)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block GRAY_WOOL_SLAB = registerBlock("gray_wool_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.GRAY_WOOL)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block LIGHT_GRAY_WOOL_SLAB = registerBlock("light_gray_wool_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_WOOL)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CYAN_WOOL_SLAB = registerBlock("cyan_wool_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.CYAN_WOOL)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block PURPLE_WOOL_SLAB = registerBlock("purple_wool_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.PURPLE_WOOL)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block BLUE_WOOL_SLAB = registerBlock("blue_wool_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.BLUE_WOOL)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block BROWN_WOOL_SLAB = registerBlock("brown_wool_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.BROWN_WOOL)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block GREEN_WOOL_SLAB = registerBlock("green_wool_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.GREEN_WOOL)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block RED_WOOL_SLAB = registerBlock("red_wool_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.RED_WOOL)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block BLACK_WOOL_SLAB  = registerBlock("black_wool_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.BLACK_WOOL)), DecoItemGroup.VARAN_DECO_BUILDING);

    public static final Block OBSIDIAN_SLAB = registerBlock("obsidian_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OBSIDIAN)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block SNOW_SLAB = registerBlock("snow_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.SNOW_BLOCK)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CLAY_SLAB = registerBlock("clay_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.CLAY)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block NETHERRACK_SLAB = registerBlock("netherrack_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.NETHERRACK)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block SMOOTH_BASALT_SLAB = registerBlock("smooth_basalt_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_BASALT)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block PACKED_MUD_SLAB = registerBlock("packed_mud_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.PACKED_MUD)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block MYCELIUM_SLAB = registerBlock("packed_mycelium_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.PACKED_MYCELIUM)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block END_STONE_SLAB = registerBlock("end_stone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.END_STONE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block QUARTZ_BRICK_SLAB = registerBlock("quartz_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BRICKS)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block WHITE_TERRACOTTA_SLAB = registerBlock("white_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.WHITE_TERRACOTTA)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block ORANGE_TERRACOTTA_SLAB = registerBlock("orange_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.ORANGE_TERRACOTTA)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block MAGENTA_TERRACOTTA_SLAB = registerBlock("magenta_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.MAGENTA_TERRACOTTA)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block LIGHT_BLUE_TERRACOTTA_SLAB = registerBlock("light_blue_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_TERRACOTTA)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block YELLOW_TERRACOTTA_SLAB = registerBlock("yellow_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.YELLOW_TERRACOTTA)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block LIME_TERRACOTTA_SLAB = registerBlock("lime_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.LIME_TERRACOTTA)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block PINK_TERRACOTTA_SLAB = registerBlock("pink_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.PINK_TERRACOTTA)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block GRAY_TERRACOTTA_SLAB = registerBlock("gray_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.GRAY_TERRACOTTA)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block LIGHT_GRAY_TERRACOTTA_SLAB = registerBlock("light_gray_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_TERRACOTTA)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CYAN_TERRACOTTA_SLAB = registerBlock("cyan_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.CYAN_TERRACOTTA)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block PURPLE_TERRACOTTA_SLAB = registerBlock("purple_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.PURPLE_TERRACOTTA)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block BLUE_TERRACOTTA_SLAB = registerBlock("blue_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.BLUE_TERRACOTTA)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block BROWN_TERRACOTTA_SLAB = registerBlock("brown_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.BROWN_TERRACOTTA)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block GREEN_TERRACOTTA_SLAB = registerBlock("green_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.GREEN_TERRACOTTA)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block RED_TERRACOTTA_SLAB = registerBlock("red_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.RED_TERRACOTTA)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block BLACK_TERRACOTTA_SLAB = registerBlock("black_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.BLACK_TERRACOTTA)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block TERRACOTTA_SLAB = registerBlock("terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block PACKED_ICE_SLAB = registerBlock("packed_ice_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.PACKED_ICE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block MAGMA_SLAB = registerBlock("magma_slab",
            new MagmaSlabBlock(FabricBlockSettings.copyOf(Blocks.MAGMA_BLOCK)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block BONE_SLAB = registerBlock("bone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.BONE_BLOCK)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block WHITE_CONCRETE_SLAB = registerBlock("white_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.WHITE_CONCRETE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block ORANGE_CONCRETE_SLAB = registerBlock("orange_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.ORANGE_CONCRETE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block MAGENTA_CONCRETE_SLAB = registerBlock("magenta_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.MAGENTA_CONCRETE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block LIGHT_BLUE_CONCRETE_SLAB = registerBlock("light_blue_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_CONCRETE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block YELLOW_CONCRETE_SLAB = registerBlock("yellow_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.YELLOW_CONCRETE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block LIME_CONCRETE_SLAB = registerBlock("lime_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.LIME_CONCRETE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block PINK_CONCRETE_SLAB = registerBlock("pink_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.PINK_CONCRETE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block GRAY_CONCRETE_SLAB = registerBlock("gray_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.GRAY_CONCRETE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block LIGHT_GRAY_CONCRETE_SLAB = registerBlock("light_gray_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_CONCRETE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CYAN_CONCRETE_SLAB = registerBlock("cyan_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.CYAN_CONCRETE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block PURPLE_CONCRETE_SLAB = registerBlock("purple_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.PURPLE_CONCRETE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block BLUE_CONCRETE_SLAB = registerBlock("blue_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.BLUE_CONCRETE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block BROWN_CONCRETE_SLAB = registerBlock("brown_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.BROWN_CONCRETE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block GREEN_CONCRETE_SLAB = registerBlock("green_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.GREEN_CONCRETE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block RED_CONCRETE_SLAB = registerBlock("red_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.RED_CONCRETE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block BLACK_CONCRETE_SLAB = registerBlock("black_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.BLACK_CONCRETE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block BLUE_ICE_SLAB = registerBlock("blue_ice_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.BLUE_ICE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block MOSS_SLAB = registerBlock("moss_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.MOSS_BLOCK)), DecoItemGroup.VARAN_DECO_BUILDING);

    public static final Block CUT_GRANITE_SLAB = registerBlock("cut_granite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_GRANITE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block GRANITE_BRICK_SLAB = registerBlock("granite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.GRANITE_BRICKS)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CUT_DIORITE_SLAB = registerBlock("cut_diorite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_DIORITE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block DIORITE_BRICK_SLAB = registerBlock("diorite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.DIORITE_BRICKS)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CUT_ANDESITE_SLAB = registerBlock("cut_andesite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_ANDESITE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block ANDESITE_BRICK_SLAB = registerBlock("andesite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.ANDESITE_BRICKS)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block POLISHED_CALCITE_SLAB = registerBlock("polished_calcite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.POLISHED_CALCITE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CUT_CALCITE_SLAB = registerBlock("cut_calcite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_CALCITE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CALCITE_BRICK_SLAB = registerBlock("calcite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CALCITE_BRICKS)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block POLISHED_STONE_SLAB = registerBlock("polished_stone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.POLISHED_STONE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block STONE_TILE_SLAB = registerBlock("stone_tile_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.STONE_TILES)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CACTUS_PLANK_SLAB = registerBlock("cactus_plank_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CACTUS_PLANKS)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block MUSHROOM_SLAB = registerBlock("mushroom_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.MUSHROOM_PLANKS)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block WOODEN_SLAB = registerBlock("wooden_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.WOODEN_PLANKS)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CUT_SANDSTONE_BRICK_SLAB = registerBlock("cut_sandstone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_SANDSTONE_BRICKS)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block COBBLED_SANDSTONE_SLAB = registerBlock("cobbled_sandstone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.COBBLED_SANDSTONE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block POLISHED_SANDSTONE_SLAB = registerBlock("polished_sandstone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.POLISHED_SANDSTONE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block SANDSTONE_BRICK_SLAB = registerBlock("sandstone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.SANDSTONE_BRICKS)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block SMOOTH_OBSIDIAN_SLAB = registerBlock("smooth_obsidian_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.SMOOTH_OBSIDIAN)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block SMOOTH_PURPUR_SLAB = registerBlock("smooth_purpur_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.SMOOTH_PURPUR)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block SMOOTH_DEEPSLATE_SLAB = registerBlock("smooth_deepslate_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.SMOOTH_DEEPSLATE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block SMOOTH_BLACKSTONE_SLAB = registerBlock("smooth_blackstone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.SMOOTH_BLACKSTONE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block SMOOTH_END_STONE_SLAB = registerBlock("smooth_end_stone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.SMOOTH_END_STONE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block SANDED_OBSIDIAN_SLAB = registerBlock("sanded_obsidian_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.SANDED_OBSIDIAN)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block OBSIDIAN_BRICK_SLAB = registerBlock("obsidian_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.OBSIDIAN_BRICKS)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CUT_OBSIDIAN_SLAB = registerBlock("cut_obsidian_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_OBSIDIAN)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block PURPUR_BRICK_SLAB = registerBlock("purpur_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.PURPUR_BRICKS)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CUT_PURPUR_SLAB = registerBlock("cut_purpur_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_PURPUR)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block SNOW_BRICK_SLAB = registerBlock("snow_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.SNOW_BRICKS)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block PACKED_NETHERRACK_SLAB = registerBlock("packed_netherrack_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.PACKED_NETHERRACK)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block NETHERRACK_BRICK_SLAB = registerBlock("netherrack_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.NETHERRACK_BRICKS)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block POLISHED_END_STONE_SLAB = registerBlock("polished_end_stone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.POLISHED_END_STONE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block END_STONE_TILE_SLAB = registerBlock("end_stone_tile_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.END_STONE_TILES)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block VOID_STONE_SLAB = registerBlock("void_stone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.VOID_STONE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block VOID_STONE_BRICK_SLAB = registerBlock("void_stone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.VOID_STONE_BRICKS)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block WHITE_TERRACOTTA_BRICK_SLAB = registerBlock("white_terracotta_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.WHITE_TERRACOTTA_BRICKS)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block ORANGE_TERRACOTTA_BRICK_SLAB = registerBlock("orange_terracotta_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.ORANGE_TERRACOTTA_BRICKS)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block MAGENTA_TERRACOTTA_BRICK_SLAB = registerBlock("magenta_terracotta_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.MAGENTA_TERRACOTTA_BRICKS)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block LIGHT_BLUE_TERRACOTTA_BRICK_SLAB = registerBlock("light_blue_terracotta_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block YELLOW_TERRACOTTA_BRICK_SLAB = registerBlock("yellow_terracotta_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.YELLOW_TERRACOTTA_BRICKS)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block LIME_TERRACOTTA_BRICK_SLAB = registerBlock("lime_terracotta_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.LIME_TERRACOTTA_BRICKS)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block PINK_TERRACOTTA_BRICK_SLAB = registerBlock("pink_terracotta_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.PINK_TERRACOTTA_BRICKS)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block GRAY_TERRACOTTA_BRICK_SLAB = registerBlock("gray_terracotta_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.GRAY_TERRACOTTA_BRICKS)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block LIGHT_GRAY_TERRACOTTA_BRICK_SLAB = registerBlock("light_gray_terracotta_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CYAN_TERRACOTTA_BRICK_SLAB = registerBlock("cyan_terracotta_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CYAN_TERRACOTTA_BRICKS)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block PURPLE_TERRACOTTA_BRICK_SLAB = registerBlock("purple_terracotta_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.PURPLE_TERRACOTTA_BRICKS)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block BLUE_TERRACOTTA_BRICK_SLAB = registerBlock("blue_terracotta_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.BLUE_TERRACOTTA_BRICKS)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block BROWN_TERRACOTTA_BRICK_SLAB = registerBlock("brown_terracotta_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.BROWN_TERRACOTTA_BRICKS)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block GREEN_TERRACOTTA_BRICK_SLAB = registerBlock("green_terracotta_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.GREEN_TERRACOTTA_BRICKS)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block RED_TERRACOTTA_BRICK_SLAB = registerBlock("red_terracotta_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.RED_TERRACOTTA_BRICKS)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block BLACK_TERRACOTTA_BRICK_SLAB = registerBlock("black_terracotta_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.BLACK_TERRACOTTA_BRICKS)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block TERRACOTTA_BRICK_SLAB = registerBlock("terracotta_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.TERRACOTTA_BRICKS)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block SOUL_SOILSTONE_SLAB = registerBlock("soul_soilstone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.SOUL_SOILSTONE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CUT_SOUL_SOILSTONE_SLAB = registerBlock("cut_soul_soilstone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_SOUL_SOILSTONE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block SMOOTH_SOUL_SOILSTONE_SLAB = registerBlock("smooth_soul_soilstone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.SMOOTH_SOUL_SOILSTONE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CUT_SOUL_SOILSTONE_BRICK_SLAB = registerBlock("cut_soul_soilstone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block COBBLED_SOUL_SOILSTONE_SLAB = registerBlock("cobbled_soul_soilstone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.COBBLED_SOUL_SOILSTONE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block POLISHED_SOUL_SOILSTONE_SLAB = registerBlock("polished_soul_soilstone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.POLISHED_SOUL_SOILSTONE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block SOUL_SOILSTONE_BRICK_SLAB = registerBlock("soul_soilstone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.SOUL_SOILSTONE_BRICKS)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CUT_QUARTZ_SLAB = registerBlock("cut_quartz_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_QUARTZ)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block ICE_BRICK_SLAB = registerBlock("ice_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.ICE_BRICKS)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CUT_WHITE_CONCRETE_SLAB = registerBlock("cut_white_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_WHITE_CONCRETE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CUT_ORANGE_CONCRETE_SLAB = registerBlock("cut_orange_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_ORANGE_CONCRETE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CUT_MAGENTA_CONCRETE_SLAB = registerBlock("cut_magenta_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_MAGENTA_CONCRETE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CUT_LIGHT_BLUE_CONCRETE_SLAB = registerBlock("cut_light_blue_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_LIGHT_BLUE_CONCRETE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CUT_YELLOW_CONCRETE_SLAB = registerBlock("cut_yellow_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_YELLOW_CONCRETE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CUT_LIME_CONCRETE_SLAB = registerBlock("cut_lime_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_LIME_CONCRETE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CUT_PINK_CONCRETE_SLAB = registerBlock("cut_pink_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_PINK_CONCRETE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CUT_GRAY_CONCRETE_SLAB = registerBlock("cut_gray_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_GRAY_CONCRETE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CUT_LIGHT_GRAY_CONCRETE_SLAB = registerBlock("cut_light_gray_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_LIGHT_GRAY_CONCRETE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CUT_CYAN_CONCRETE_SLAB = registerBlock("cut_cyan_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_CYAN_CONCRETE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CUT_PURPLE_CONCRETE_SLAB = registerBlock("cut_purple_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_PURPLE_CONCRETE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CUT_BLUE_CONCRETE_SLAB = registerBlock("cut_blue_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_BLUE_CONCRETE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CUT_BROWN_CONCRETE_SLAB = registerBlock("cut_brown_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_BROWN_CONCRETE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CUT_GREEN_CONCRETE_SLAB = registerBlock("cut_green_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_GREEN_CONCRETE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CUT_RED_CONCRETE_SLAB = registerBlock("cut_red_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_RED_CONCRETE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CUT_BLACK_CONCRETE_SLAB = registerBlock("cut_black_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_BLACK_CONCRETE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CRYSTALLIZED_PRISMARINE_SLAB = registerBlock("crystallized_prismarine_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CRYSTALLIZED_PRISMARINE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CRYSTALLIZED_PRISMARINE_BRICK_SLAB = registerBlock("crystallized_prismarine_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block LIGHT_PRISMARINE_SLAB = registerBlock("light_prismarine_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.LIGHT_PRISMARINE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CUT_RED_SANDSTONE_BRICK_SLAB = registerBlock("cut_red_sandstone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_RED_SANDSTONE_BRICKS)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block COBBLED_RED_SANDSTONE_SLAB = registerBlock("cobbled_red_sandstone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.COBBLED_RED_SANDSTONE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block POLISHED_RED_SANDSTONE_SLAB = registerBlock("polished_red_sandstone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.POLISHED_RED_SANDSTONE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block RED_SANDSTONE_BRICK_SLAB = registerBlock("red_sandstone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.RED_SANDSTONE_BRICKS)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block MAGMA_BRICK_SLAB = registerBlock("magma_brick_slab",
            new MagmaBrickSlabBlock(FabricBlockSettings.copyOf(DecoBlocks.MAGMA_BRICKS)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block BUBBLE_SLAB = registerBlock("bubble_slab",
            new BubbleSlabBlock(FabricBlockSettings.copyOf(DecoBlocks.BUBBLE_BLOCK)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block BUBBLE_BRICK_SLAB = registerBlock("bubble_brick_slab",
            new BubbleSlabBlock(FabricBlockSettings.copyOf(DecoBlocks.BUBBLE_BRICKS)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block BLUE_NETHER_BRICK_SLAB = registerBlock("blue_nether_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.BLUE_NETHER_BRICKS)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block POLISHED_BLACKSTONE_TILE_SLAB = registerBlock("polished_blackstone_tile_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.POLISHED_BLACKSTONE_TILES)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CLOUD_SLAB = registerBlock("cloud_slab",
            new TransparentSlabBlock(FabricBlockSettings.copyOf(DecoBlocks.SOLID_CLOUD)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CLOUD_BRICK_SLAB = registerBlock("cloud_brick_slab",
            new TransparentSlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CLOUD_BRICKS)), DecoItemGroup.VARAN_DECO_BUILDING);

    public static final Block DEEPSLATE_STAIRS = registerBlock("deepslate_stairs",
            new StairsBlock(Blocks.DEEPSLATE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.DEEPSLATE)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CALCITE_STAIRS = registerBlock("calcite_stairs",
            new StairsBlock(Blocks.CALCITE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.CALCITE)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block TUFF_STAIRS = registerBlock("tuff_stairs",
            new StairsBlock(Blocks.TUFF.getDefaultState(),FabricBlockSettings.copyOf(Blocks.TUFF)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block DRIPSTONE_STAIRS = registerBlock("dripstone_stairs",
            new StairsBlock(Blocks.DRIPSTONE_BLOCK.getDefaultState(),FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)),
            DecoItemGroup.VARAN_DECO_BUILDING);

    public static final Block GRASS_STAIRS = registerBlock("grass_stairs",
            new StairsBlock(DecoBlocks.PACKED_GRASS.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.PACKED_GRASS)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block DIRT_STAIRS = registerBlock("dirt_stairs",
            new StairsBlock(Blocks.DIRT.getDefaultState(),FabricBlockSettings.copyOf(Blocks.DIRT)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block COARSE_DIRT_STAIRS = registerBlock("coarse_dirt_stairs",
            new StairsBlock(Blocks.COARSE_DIRT.getDefaultState(),FabricBlockSettings.copyOf(Blocks.COARSE_DIRT)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block PODZOL_STAIRS = registerBlock("podzol_stairs",
            new StairsBlock(DecoBlocks.PACKED_PODZOL.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.PACKED_PODZOL)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block ROOTED_DIRT_STAIRS = registerBlock("rooted_dirt_stairs",
            new StairsBlock(Blocks.ROOTED_DIRT.getDefaultState(),FabricBlockSettings.copyOf(Blocks.ROOTED_DIRT)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block MUD_STAIRS = registerBlock("mud_stairs",
            new StairsBlock(Blocks.MUD.getDefaultState(),FabricBlockSettings.copyOf(Blocks.MUD)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CRIMSON_NYLIUM_STAIRS = registerBlock("crimson_nylium_stairs",
            new StairsBlock(DecoBlocks.PACKED_CRIMSON_NYLIUM.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.PACKED_CRIMSON_NYLIUM)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block WARPED_NYLIUM_STAIRS = registerBlock("warped_nylium_stairs",
            new StairsBlock(DecoBlocks.PACKED_WARPED_NYLIUM.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.PACKED_WARPED_NYLIUM)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block BEDROCK_STAIRS = registerBlock("bedrock_stairs",
            new StairsBlock(Blocks.BEDROCK.getDefaultState(),FabricBlockSettings.copyOf(Blocks.BEDROCK)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block RAW_IRON_STAIRS = registerBlock("raw_iron_stairs",
            new StairsBlock(Blocks.RAW_IRON_BLOCK.getDefaultState(),FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block RAW_COPPER_STAIRS = registerBlock("raw_copper_stairs",
            new StairsBlock(Blocks.RAW_COPPER_BLOCK.getDefaultState(),FabricBlockSettings.copyOf(Blocks.RAW_COPPER_BLOCK)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block RAW_GOLD_STAIRS = registerBlock("raw_gold_stairs",
            new StairsBlock(Blocks.RAW_GOLD_BLOCK.getDefaultState(),FabricBlockSettings.copyOf(Blocks.RAW_GOLD_BLOCK)),
            DecoItemGroup.VARAN_DECO_BUILDING);

    public static final Block IRON_STAIRS = registerBlock("iron_stairs",
            new StairsBlock(Blocks.IRON_BLOCK.getDefaultState(),FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block COPPER_STAIRS = registerBlock("copper_stairs",
            new OxidizableStairsBlock(Oxidizable.OxidationLevel.UNAFFECTED,Blocks.COPPER_BLOCK.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block EXPOSED_COPPER_STAIRS = registerBlock("exposed_copper_stairs",
            new OxidizableStairsBlock(Oxidizable.OxidationLevel.EXPOSED,Blocks.EXPOSED_COPPER.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.EXPOSED_COPPER)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block WEATHERED_COPPER_STAIRS = registerBlock("weathered_copper_stairs",
            new OxidizableStairsBlock(Oxidizable.OxidationLevel.WEATHERED,Blocks.WEATHERED_COPPER.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.WEATHERED_COPPER)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block OXIDIZED_COPPER_STAIRS = registerBlock("oxidized_copper_stairs",
            new OxidizableStairsBlock(Oxidizable.OxidationLevel.OXIDIZED,Blocks.OXIDIZED_COPPER.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.OXIDIZED_COPPER)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block WAXED_COPPER_STAIRS = registerBlock("waxed_copper_stairs",
            new StairsBlock(Blocks.WAXED_COPPER_BLOCK.getDefaultState(),FabricBlockSettings.copyOf(Blocks.WAXED_COPPER_BLOCK)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block WAXED_EXPOSED_COPPER_STAIRS = registerBlock("waxed_exposed_copper_stairs",
            new StairsBlock(Blocks.WAXED_EXPOSED_COPPER.getDefaultState(),FabricBlockSettings.copyOf(Blocks.WAXED_EXPOSED_COPPER)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block WAXED_WEATHERED_COPPER_STAIRS = registerBlock("waxed_weathered_copper_stairs",
            new StairsBlock(Blocks.WAXED_WEATHERED_COPPER.getDefaultState(),FabricBlockSettings.copyOf(Blocks.WAXED_WEATHERED_COPPER)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block WAXED_OXIDIZED_COPPER_STAIRS = registerBlock("waxed_oxidized_copper_stairs",
            new StairsBlock(Blocks.WAXED_OXIDIZED_COPPER.getDefaultState(),FabricBlockSettings.copyOf(Blocks.WAXED_OXIDIZED_COPPER)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block GOLD_STAIRS = registerBlock("gold_stairs",
            new StairsBlock(Blocks.GOLD_BLOCK.getDefaultState(),FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)),
            DecoItemGroup.VARAN_DECO_BUILDING);

    public static final Block OAK_WOOD_STAIRS = registerBlock("oak_wood_stairs",
            new StairsBlock(Blocks.OAK_PLANKS.getDefaultState(),FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)
                    .mapColor(MapColor.DIRT_BROWN)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block SPRUCE_WOOD_STAIRS = registerBlock("spruce_wood_stairs",
            new StairsBlock(Blocks.SPRUCE_PLANKS.getDefaultState(),FabricBlockSettings.copyOf(Blocks.SPRUCE_PLANKS)
                    .mapColor(MapColor.BROWN)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block BIRCH_WOOD_STAIRS = registerBlock("birch_wood_stairs",
            new StairsBlock(Blocks.BIRCH_PLANKS.getDefaultState(),FabricBlockSettings.copyOf(Blocks.BIRCH_PLANKS)
                    .mapColor(MapColor.OFF_WHITE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block JUNGLE_WOOD_STAIRS = registerBlock("jungle_wood_stairs",
            new StairsBlock(Blocks.JUNGLE_PLANKS.getDefaultState(),FabricBlockSettings.copyOf(Blocks.JUNGLE_PLANKS)
                    .mapColor(MapColor.DIRT_BROWN)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block ACACIA_WOOD_STAIRS = registerBlock("acacia_wood_stairs",
            new StairsBlock(Blocks.ACACIA_PLANKS.getDefaultState(),FabricBlockSettings.copyOf(Blocks.ACACIA_PLANKS)
                    .mapColor(MapColor.STONE_GRAY)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block DARK_OAK_WOOD_STAIRS = registerBlock("dark_oak_wood_stairs",
            new StairsBlock(Blocks.DARK_OAK_PLANKS.getDefaultState(),FabricBlockSettings.copyOf(Blocks.DARK_OAK_PLANKS)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block MANGROVE_WOOD_STAIRS = registerBlock("mangrove_wood_stairs",
            new StairsBlock(Blocks.MANGROVE_PLANKS.getDefaultState(),FabricBlockSettings.copyOf(Blocks.MANGROVE_PLANKS)
                    .mapColor(MapColor.DIRT_BROWN)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CRIMSON_HYPHAE_STAIRS = registerBlock("crimson_hyphae_stairs",
            new StairsBlock(Blocks.CRIMSON_PLANKS.getDefaultState(),FabricBlockSettings.copyOf(Blocks.CRIMSON_PLANKS)
                    .mapColor(MapColor.DARK_CRIMSON).sounds(BlockSoundGroup.NETHER_STEM)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block WARPED_HYPHAE_STAIRS = registerBlock("warped_hyphae_stairs",
            new StairsBlock(Blocks.WARPED_PLANKS.getDefaultState(),FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS)
                    .mapColor(MapColor.DARK_DULL_PINK).sounds(BlockSoundGroup.NETHER_STEM)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block WOODEN_WOOD_STAIRS = registerBlock("wooden_wood_stairs",
            new StairsBlock(DecoBlocks.WOODEN_PLANKS.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.WOODEN_PLANKS)
                    .mapColor(MapColor.TERRACOTTA_BROWN)), DecoItemGroup.VARAN_DECO_BUILDING);

    public static final Block STRIPPED_OAK_WOOD_STAIRS = registerBlock("stripped_oak_wood_stairs",
            new StairsBlock(Blocks.OAK_PLANKS.getDefaultState(),FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block STRIPPED_SPRUCE_WOOD_STAIRS = registerBlock("stripped_spruce_wood_stairs",
            new StairsBlock(Blocks.SPRUCE_PLANKS.getDefaultState(),FabricBlockSettings.copyOf(Blocks.SPRUCE_PLANKS)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block STRIPPED_BIRCH_WOOD_STAIRS = registerBlock("stripped_birch_wood_stairs",
            new StairsBlock(Blocks.BIRCH_PLANKS.getDefaultState(),FabricBlockSettings.copyOf(Blocks.BIRCH_PLANKS)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block STRIPPED_JUNGLE_WOOD_STAIRS = registerBlock("stripped_jungle_wood_stairs",
            new StairsBlock(Blocks.JUNGLE_PLANKS.getDefaultState(),FabricBlockSettings.copyOf(Blocks.JUNGLE_PLANKS)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block STRIPPED_ACACIA_WOOD_STAIRS = registerBlock("stripped_acacia_wood_stairs",
            new StairsBlock(Blocks.ACACIA_PLANKS.getDefaultState(),FabricBlockSettings.copyOf(Blocks.ACACIA_PLANKS)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block STRIPPED_DARK_OAK_WOOD_STAIRS = registerBlock("stripped_dark_oak_wood_stairs",
            new StairsBlock(Blocks.DARK_OAK_PLANKS.getDefaultState(),FabricBlockSettings.copyOf(Blocks.DARK_OAK_PLANKS)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block STRIPPED_MANGROVE_WOOD_STAIRS = registerBlock("stripped_mangrove_wood_stairs",
            new StairsBlock(Blocks.MANGROVE_PLANKS.getDefaultState(),FabricBlockSettings.copyOf(Blocks.MANGROVE_PLANKS)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block STRIPPED_CRIMSON_HYPHAE_STAIRS = registerBlock("stripped_crimson_hyphae_stairs",
            new StairsBlock(Blocks.CRIMSON_PLANKS.getDefaultState(),FabricBlockSettings.copyOf(Blocks.CRIMSON_PLANKS)
                    .sounds(BlockSoundGroup.NETHER_STEM)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block STRIPPED_WARPED_HYPHAE_STAIRS = registerBlock("stripped_warped_hyphae_stairs",
            new StairsBlock(Blocks.WARPED_PLANKS.getDefaultState(),FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS)
                    .sounds(BlockSoundGroup.NETHER_STEM)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block STRIPPED_WOODEN_WOOD_STAIRS = registerBlock("stripped_wooden_wood_stairs",
            new StairsBlock(DecoBlocks.WOODEN_PLANKS.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.WOODEN_PLANKS)),
            DecoItemGroup.VARAN_DECO_BUILDING);

    public static final Block CUT_SANDSTONE_STAIRS = registerBlock("cut_sandstone_stairs",
            new StairsBlock(Blocks.CUT_SANDSTONE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.CUT_SANDSTONE)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block WHITE_WOOL_STAIRS = registerBlock("white_wool_stairs",
            new StairsBlock(Blocks.WHITE_WOOL.getDefaultState(),FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block ORANGE_WOOL_STAIRS = registerBlock("orange_wool_stairs",
            new StairsBlock(Blocks.ORANGE_WOOL.getDefaultState(),FabricBlockSettings.copyOf(Blocks.ORANGE_WOOL)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block MAGENTA_WOOL_STAIRS = registerBlock("magenta_wool_stairs",
            new StairsBlock(Blocks.MAGENTA_WOOL.getDefaultState(),FabricBlockSettings.copyOf(Blocks.MAGENTA_WOOL)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block LIGHT_BLUE_WOOL_STAIRS = registerBlock("light_blue_wool_stairs",
            new StairsBlock(Blocks.LIGHT_BLUE_WOOL.getDefaultState(),FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_WOOL)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block YELLOW_WOOL_STAIRS = registerBlock("yellow_wool_stairs",
            new StairsBlock(Blocks.YELLOW_WOOL.getDefaultState(),FabricBlockSettings.copyOf(Blocks.YELLOW_WOOL)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block LIME_WOOL_STAIRS = registerBlock("lime_wool_stairs",
            new StairsBlock(Blocks.LIME_WOOL.getDefaultState(),FabricBlockSettings.copyOf(Blocks.LIME_WOOL)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block PINK_WOOL_STAIRS = registerBlock("pink_wool_stairs",
            new StairsBlock(Blocks.PINK_WOOL.getDefaultState(),FabricBlockSettings.copyOf(Blocks.PINK_WOOL)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block GRAY_WOOL_STAIRS = registerBlock("gray_wool_stairs",
            new StairsBlock(Blocks.GRAY_WOOL.getDefaultState(),FabricBlockSettings.copyOf(Blocks.GRAY_WOOL)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block LIGHT_GRAY_WOOL_STAIRS = registerBlock("light_gray_wool_stairs",
            new StairsBlock(Blocks.LIGHT_GRAY_WOOL.getDefaultState(),FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_WOOL)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CYAN_WOOL_STAIRS = registerBlock("cyan_wool_stairs",
            new StairsBlock(Blocks.CYAN_WOOL.getDefaultState(),FabricBlockSettings.copyOf(Blocks.CYAN_WOOL)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block PURPLE_WOOL_STAIRS = registerBlock("purple_wool_stairs",
            new StairsBlock(Blocks.PURPLE_WOOL.getDefaultState(),FabricBlockSettings.copyOf(Blocks.PURPLE_WOOL)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block BLUE_WOOL_STAIRS = registerBlock("blue_wool_stairs",
            new StairsBlock(Blocks.BLUE_WOOL.getDefaultState(),FabricBlockSettings.copyOf(Blocks.BLUE_WOOL)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block BROWN_WOOL_STAIRS = registerBlock("brown_wool_stairs",
            new StairsBlock(Blocks.BROWN_WOOL.getDefaultState(),FabricBlockSettings.copyOf(Blocks.BROWN_WOOL)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block GREEN_WOOL_STAIRS = registerBlock("green_wool_stairs",
            new StairsBlock(Blocks.GREEN_WOOL.getDefaultState(),FabricBlockSettings.copyOf(Blocks.GREEN_WOOL)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block RED_WOOL_STAIRS = registerBlock("red_wool_stairs",
            new StairsBlock(Blocks.RED_WOOL.getDefaultState(),FabricBlockSettings.copyOf(Blocks.RED_WOOL)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block BLACK_WOOL_STAIRS = registerBlock("black_wool_stairs",
            new StairsBlock(Blocks.BLACK_WOOL.getDefaultState(),FabricBlockSettings.copyOf(Blocks.BLACK_WOOL)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block SMOOTH_STONE_STAIRS = registerBlock("smooth_stone_stairs",
            new StairsBlock(Blocks.SMOOTH_STONE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block OBSIDIAN_STAIRS = registerBlock("obsidian_stairs",
            new StairsBlock(Blocks.OBSIDIAN.getDefaultState(),FabricBlockSettings.copyOf(Blocks.OBSIDIAN)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block SNOW_STAIRS = registerBlock("snow_stairs",
            new StairsBlock(Blocks.SNOW_BLOCK.getDefaultState(),FabricBlockSettings.copyOf(Blocks.SNOW_BLOCK)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CLAY_STAIRS = registerBlock("clay_stairs",
            new StairsBlock(Blocks.CLAY.getDefaultState(),FabricBlockSettings.copyOf(Blocks.CLAY)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block NETHERRACK_STAIRS = registerBlock("netherrack_stairs",
            new StairsBlock(Blocks.NETHERRACK.getDefaultState(),FabricBlockSettings.copyOf(Blocks.NETHERRACK)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block SMOOTH_BASALT_STAIRS = registerBlock("smooth_basalt_stairs",
            new StairsBlock(Blocks.SMOOTH_BASALT.getDefaultState(),FabricBlockSettings.copyOf(Blocks.SMOOTH_BASALT)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block PACKED_MUD_STAIRS = registerBlock("packed_mud_stairs",
            new StairsBlock(Blocks.PACKED_MUD.getDefaultState(),FabricBlockSettings.copyOf(Blocks.PACKED_MUD)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block MYCELIUM_STAIRS = registerBlock("mycelium_stairs",
            new StairsBlock(DecoBlocks.PACKED_MYCELIUM.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.PACKED_MYCELIUM)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block QUARTZ_BRICK_STAIRS = registerBlock("quartz_brick_stairs",
            new StairsBlock(Blocks.QUARTZ_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(Blocks.QUARTZ_BRICKS)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block END_STONE_STAIRS = registerBlock("end_stone_stairs",
            new StairsBlock(Blocks.END_STONE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.END_STONE)),
            DecoItemGroup.VARAN_DECO_BUILDING);

    public static final Block WHITE_TERRACOTTA_STAIRS = registerBlock("white_terracotta_stairs",
            new StairsBlock(Blocks.WHITE_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(Blocks.WHITE_TERRACOTTA)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block ORANGE_TERRACOTTA_STAIRS = registerBlock("orange_terracotta_stairs",
            new StairsBlock(Blocks.ORANGE_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(Blocks.ORANGE_TERRACOTTA)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block MAGENTA_TERRACOTTA_STAIRS = registerBlock("magenta_terracotta_stairs",
            new StairsBlock(Blocks.MAGENTA_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(Blocks.MAGENTA_TERRACOTTA)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block LIGHT_BLUE_TERRACOTTA_STAIRS = registerBlock("light_blue_terracotta_stairs",
            new StairsBlock(Blocks.LIGHT_BLUE_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_TERRACOTTA)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block YELLOW_TERRACOTTA_STAIRS = registerBlock("yellow_terracotta_stairs",
            new StairsBlock(Blocks.YELLOW_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(Blocks.YELLOW_TERRACOTTA)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block LIME_TERRACOTTA_STAIRS = registerBlock("lime_terracotta_stairs",
            new StairsBlock(Blocks.LIME_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(Blocks.LIME_TERRACOTTA)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block PINK_TERRACOTTA_STAIRS = registerBlock("pink_terracotta_stairs",
            new StairsBlock(Blocks.PINK_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(Blocks.PINK_TERRACOTTA)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block GRAY_TERRACOTTA_STAIRS = registerBlock("gray_terracotta_stairs",
            new StairsBlock(Blocks.GRAY_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(Blocks.GRAY_TERRACOTTA)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block LIGHT_GRAY_TERRACOTTA_STAIRS = registerBlock("light_gray_terracotta_stairs",
            new StairsBlock(Blocks.LIGHT_GRAY_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_TERRACOTTA)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CYAN_TERRACOTTA_STAIRS = registerBlock("cyan_terracotta_stairs",
            new StairsBlock(Blocks.CYAN_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(Blocks.CYAN_TERRACOTTA)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block PURPLE_TERRACOTTA_STAIRS = registerBlock("purple_terracotta_stairs",
            new StairsBlock(Blocks.PURPLE_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(Blocks.PURPLE_TERRACOTTA)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block BLUE_TERRACOTTA_STAIRS = registerBlock("blue_terracotta_stairs",
            new StairsBlock(Blocks.BLUE_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(Blocks.BLUE_TERRACOTTA)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block BROWN_TERRACOTTA_STAIRS = registerBlock("brown_terracotta_stairs",
            new StairsBlock(Blocks.BROWN_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(Blocks.BROWN_TERRACOTTA)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block GREEN_TERRACOTTA_STAIRS = registerBlock("green_terracotta_stairs",
            new StairsBlock(Blocks.GREEN_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(Blocks.GREEN_TERRACOTTA)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block RED_TERRACOTTA_STAIRS = registerBlock("red_terracotta_stairs",
            new StairsBlock(Blocks.RED_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(Blocks.RED_TERRACOTTA)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block BLACK_TERRACOTTA_STAIRS = registerBlock("black_terracotta_stairs",
            new StairsBlock(Blocks.BLACK_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(Blocks.BLACK_TERRACOTTA)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block TERRACOTTA_STAIRS = registerBlock("terracotta_stairs",
            new StairsBlock(Blocks.TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(Blocks.TERRACOTTA)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block PACKED_ICE_STAIRS = registerBlock("packed_ice_stairs",
            new StairsBlock(Blocks.PACKED_ICE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.PACKED_ICE)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CUT_RED_SANDSTONE_STAIRS = registerBlock("cut_red_sandstone_stairs",
            new StairsBlock(Blocks.CUT_RED_SANDSTONE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.CUT_RED_SANDSTONE)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block MAGMA_STAIRS = registerBlock("magma_stairs",
            new MagmaStairBlock(Blocks.MAGMA_BLOCK.getDefaultState(),FabricBlockSettings.copyOf(Blocks.MAGMA_BLOCK)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block BONE_STAIRS = registerBlock("bone_stairs",
            new StairsBlock(Blocks.BONE_BLOCK.getDefaultState(),FabricBlockSettings.copyOf(Blocks.BONE_BLOCK)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block WHITE_CONCRETE_STAIRS = registerBlock("white_concrete_stairs",
            new StairsBlock(Blocks.WHITE_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.WHITE_CONCRETE)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block ORANGE_CONCRETE_STAIRS = registerBlock("orange_concrete_stairs",
            new StairsBlock(Blocks.ORANGE_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.ORANGE_CONCRETE)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block MAGENTA_CONCRETE_STAIRS = registerBlock("magenta_concrete_stairs",
            new StairsBlock(Blocks.MAGENTA_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.MAGENTA_CONCRETE)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block LIGHT_BLUE_CONCRETE_STAIRS = registerBlock("light_blue_concrete_stairs",
            new StairsBlock(Blocks.LIGHT_BLUE_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_CONCRETE)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block YELLOW_CONCRETE_STAIRS = registerBlock("yellow_concrete_stairs",
            new StairsBlock(Blocks.YELLOW_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.YELLOW_CONCRETE)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block LIME_CONCRETE_STAIRS = registerBlock("lime_concrete_stairs",
            new StairsBlock(Blocks.LIME_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.LIME_CONCRETE)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block PINK_CONCRETE_STAIRS = registerBlock("pink_concrete_stairs",
            new StairsBlock(Blocks.PINK_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.PINK_CONCRETE)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block GRAY_CONCRETE_STAIRS = registerBlock("gray_concrete_stairs",
            new StairsBlock(Blocks.GRAY_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.GRAY_CONCRETE)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block LIGHT_GRAY_CONCRETE_STAIRS = registerBlock("light_gray_concrete_stairs",
            new StairsBlock(Blocks.LIGHT_GRAY_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_CONCRETE)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CYAN_CONCRETE_STAIRS = registerBlock("cyan_concrete_stairs",
            new StairsBlock(Blocks.CYAN_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.CYAN_CONCRETE)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block PURPLE_CONCRETE_STAIRS = registerBlock("purple_concrete_stairs",
            new StairsBlock(Blocks.PURPLE_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.PURPLE_CONCRETE)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block BLUE_CONCRETE_STAIRS = registerBlock("blue_concrete_stairs",
            new StairsBlock(Blocks.BLUE_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.BLUE_CONCRETE)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block BROWN_CONCRETE_STAIRS = registerBlock("brown_concrete_stairs",
            new StairsBlock(Blocks.BROWN_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.BROWN_CONCRETE)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block GREEN_CONCRETE_STAIRS = registerBlock("green_concrete_stairs",
            new StairsBlock(Blocks.GREEN_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.GREEN_CONCRETE)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block RED_CONCRETE_STAIRS = registerBlock("red_concrete_stairs",
            new StairsBlock(Blocks.RED_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.RED_CONCRETE)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block BLACK_CONCRETE_STAIRS = registerBlock("black_concrete_stairs",
            new StairsBlock(Blocks.BLACK_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.BLACK_CONCRETE)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block BLUE_ICE_STAIRS = registerBlock("blue_ice_stairs",
            new StairsBlock(Blocks.BLUE_ICE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.BLUE_ICE)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block MOSS_STAIRS = registerBlock("moss_stairs",
            new StairsBlock(Blocks.MOSS_BLOCK.getDefaultState(),FabricBlockSettings.copyOf(Blocks.MOSS_BLOCK)),
            DecoItemGroup.VARAN_DECO_BUILDING);

    public static final Block CUT_GRANITE_STAIRS = registerBlock("cut_granite_stairs",
            new StairsBlock(DecoBlocks.CUT_GRANITE.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.CUT_GRANITE)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block GRANITE_BRICK_STAIRS = registerBlock("granite_brick_stairs",
            new StairsBlock(DecoBlocks.GRANITE_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.GRANITE_BRICKS)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CUT_DIORITE_STAIRS = registerBlock("cut_diorite_stairs",
            new StairsBlock(DecoBlocks.CUT_DIORITE.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.CUT_DIORITE)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block DIORITE_BRICK_STAIRS = registerBlock("diorite_brick_stairs",
            new StairsBlock(DecoBlocks.DIORITE_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.DIORITE_BRICKS)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CUT_ANDESITE_STAIRS = registerBlock("cut_andesite_stairs",
            new StairsBlock(DecoBlocks.CUT_ANDESITE.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.CUT_ANDESITE)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block ANDESITE_BRICK_STAIRS = registerBlock("andesite_brick_stairs",
            new StairsBlock(DecoBlocks.ANDESITE_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.ANDESITE_BRICKS)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block POLISHED_CALCITE_STAIRS = registerBlock("polished_calcite_stairs",
            new StairsBlock(DecoBlocks.POLISHED_CALCITE.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.POLISHED_CALCITE)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CUT_CALCITE_STAIRS = registerBlock("cut_calcite_stairs",
            new StairsBlock(DecoBlocks.CUT_CALCITE.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.CUT_CALCITE)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CALCITE_BRICK_STAIRS = registerBlock("calcite_brick_stairs",
            new StairsBlock(DecoBlocks.CALCITE_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.CALCITE_BRICKS)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block POLISHED_STONE_STAIRS = registerBlock("polished_stone_stairs",
            new StairsBlock(DecoBlocks.POLISHED_STONE.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.POLISHED_STONE)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block STONE_TILE_STAIRS = registerBlock("stone_tile_stairs",
            new StairsBlock(DecoBlocks.STONE_TILES.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.STONE_TILES)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CACTUS_PLANK_STAIRS = registerBlock("cactus_plank_stairs",
            new StairsBlock(DecoBlocks.CACTUS_PLANKS.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.CACTUS_PLANKS)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block MUSHROOM_STAIRS = registerBlock("mushroom_stairs",
            new StairsBlock(DecoBlocks.MUSHROOM_PLANKS.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.MUSHROOM_PLANKS)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block WOODEN_STAIRS = registerBlock("wooden_stairs",
            new StairsBlock(DecoBlocks.WOODEN_PLANKS.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.WOODEN_PLANKS)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CUT_SANDSTONE_BRICK_STAIRS = registerBlock("cut_sandstone_brick_stairs",
            new StairsBlock(DecoBlocks.CUT_SANDSTONE_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.CUT_SANDSTONE_BRICKS)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block COBBLED_SANDSTONE_STAIRS = registerBlock("cobbled_sandstone_stairs",
            new StairsBlock(DecoBlocks.COBBLED_SANDSTONE.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.COBBLED_SANDSTONE)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block POLISHED_SANDSTONE_STAIRS = registerBlock("polished_sandstone_stairs",
            new StairsBlock(DecoBlocks.POLISHED_SANDSTONE.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.POLISHED_SANDSTONE)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block SANDSTONE_BRICK_STAIRS = registerBlock("sandstone_brick_stairs",
            new StairsBlock(DecoBlocks.SANDSTONE_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.SANDSTONE_BRICKS)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block SMOOTH_OBSIDIAN_STAIRS = registerBlock("smooth_obsidian_stairs",
            new StairsBlock(DecoBlocks.SMOOTH_OBSIDIAN.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.SMOOTH_OBSIDIAN)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block SMOOTH_PURPUR_STAIRS = registerBlock("smooth_purpur_stairs",
            new StairsBlock(DecoBlocks.SMOOTH_PURPUR.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.SMOOTH_PURPUR)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block SMOOTH_DEEPSLATE_STAIRS = registerBlock("smooth_deepslate_stairs",
            new StairsBlock(DecoBlocks.SMOOTH_DEEPSLATE.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.SMOOTH_DEEPSLATE)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block SMOOTH_BLACKSTONE_STAIRS = registerBlock("smooth_blackstone_stairs",
            new StairsBlock(DecoBlocks.SMOOTH_BLACKSTONE.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.SMOOTH_BLACKSTONE)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block SMOOTH_END_STONE_STAIRS = registerBlock("smooth_end_stone_stairs",
            new StairsBlock(DecoBlocks.SMOOTH_END_STONE.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.SMOOTH_END_STONE)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block SANDED_OBSIDIAN_STAIRS = registerBlock("sanded_obsidian_stairs",
            new StairsBlock(DecoBlocks.SANDED_OBSIDIAN.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.SANDED_OBSIDIAN)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block OBSIDIAN_BRICK_STAIRS = registerBlock("obsidian_brick_stairs",
            new StairsBlock(DecoBlocks.OBSIDIAN_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.OBSIDIAN_BRICKS)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CUT_OBSIDIAN_STAIRS = registerBlock("cut_obsidian_stairs",
            new StairsBlock(DecoBlocks.CUT_OBSIDIAN.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.CUT_OBSIDIAN)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block PURPUR_BRICK_STAIRS = registerBlock("purpur_brick_stairs",
            new StairsBlock(DecoBlocks.PURPUR_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.PURPUR_BRICKS)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CUT_PURPUR_STAIRS = registerBlock("cut_purpur_stairs",
            new StairsBlock(DecoBlocks.CUT_PURPUR.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.CUT_PURPUR)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block SNOW_BRICK_STAIRS = registerBlock("snow_brick_stairs",
            new StairsBlock(DecoBlocks.SNOW_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.SNOW_BRICKS)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block PACKED_NETHERRACK_STAIRS = registerBlock("packed_netherrack_stairs",
            new StairsBlock(DecoBlocks.PACKED_NETHERRACK.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.PACKED_NETHERRACK)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block NETHERRACK_BRICK_STAIRS = registerBlock("netherrack_brick_stairs",
            new StairsBlock(DecoBlocks.NETHERRACK_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.NETHERRACK_BRICKS)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block POLISHED_END_STONE_STAIRS = registerBlock("polished_end_stone_stairs",
            new StairsBlock(DecoBlocks.POLISHED_END_STONE.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.POLISHED_END_STONE)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block END_STONE_TILE_STAIRS = registerBlock("end_stone_tile_stairs",
            new StairsBlock(DecoBlocks.END_STONE_TILES.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.END_STONE_TILES)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block VOID_STONE_STAIRS = registerBlock("void_stone_stairs",
            new StairsBlock(DecoBlocks.VOID_STONE.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.VOID_STONE)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block VOID_STONE_BRICK_STAIRS = registerBlock("void_stone_brick_stairs",
            new StairsBlock(DecoBlocks.VOID_STONE_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.VOID_STONE_BRICKS)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block WHITE_TERRACOTTA_BRICK_STAIRS = registerBlock("white_terracotta_brick_stairs",
            new StairsBlock(DecoBlocks.WHITE_TERRACOTTA_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.WHITE_TERRACOTTA_BRICKS)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block ORANGE_TERRACOTTA_BRICK_STAIRS = registerBlock("orange_terracotta_brick_stairs",
            new StairsBlock(DecoBlocks.ORANGE_TERRACOTTA_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.ORANGE_TERRACOTTA_BRICKS)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block MAGENTA_TERRACOTTA_BRICK_STAIRS = registerBlock("magenta_terracotta_brick_stairs",
            new StairsBlock(DecoBlocks.MAGENTA_TERRACOTTA_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.MAGENTA_TERRACOTTA_BRICKS)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS = registerBlock("light_blue_terracotta_brick_stairs",
            new StairsBlock(DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block YELLOW_TERRACOTTA_BRICK_STAIRS = registerBlock("yellow_terracotta_brick_stairs",
            new StairsBlock(DecoBlocks.YELLOW_TERRACOTTA_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.YELLOW_TERRACOTTA_BRICKS)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block LIME_TERRACOTTA_BRICK_STAIRS = registerBlock("lime_terracotta_brick_stairs",
            new StairsBlock(DecoBlocks.LIME_TERRACOTTA_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.LIME_TERRACOTTA_BRICKS)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block PINK_TERRACOTTA_BRICK_STAIRS = registerBlock("pink_terracotta_brick_stairs",
            new StairsBlock(DecoBlocks.PINK_TERRACOTTA_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.PINK_TERRACOTTA_BRICKS)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block GRAY_TERRACOTTA_BRICK_STAIRS = registerBlock("gray_terracotta_brick_stairs",
            new StairsBlock(DecoBlocks.GRAY_TERRACOTTA_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.GRAY_TERRACOTTA_BRICKS)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS = registerBlock("light_gray_terracotta_brick_stairs",
            new StairsBlock(DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CYAN_TERRACOTTA_BRICK_STAIRS = registerBlock("cyan_terracotta_brick_stairs",
            new StairsBlock(DecoBlocks.CYAN_TERRACOTTA_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.CYAN_TERRACOTTA_BRICKS)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block PURPLE_TERRACOTTA_BRICK_STAIRS = registerBlock("purple_terracotta_brick_stairs",
            new StairsBlock(DecoBlocks.PURPLE_TERRACOTTA_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.PURPLE_TERRACOTTA_BRICKS)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block BLUE_TERRACOTTA_BRICK_STAIRS = registerBlock("blue_terracotta_brick_stairs",
            new StairsBlock(DecoBlocks.BLUE_TERRACOTTA_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.BLUE_TERRACOTTA_BRICKS)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block BROWN_TERRACOTTA_BRICK_STAIRS = registerBlock("brown_terracotta_brick_stairs",
            new StairsBlock(DecoBlocks.BROWN_TERRACOTTA_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.BROWN_TERRACOTTA_BRICKS)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block GREEN_TERRACOTTA_BRICK_STAIRS = registerBlock("green_terracotta_brick_stairs",
            new StairsBlock(DecoBlocks.GREEN_TERRACOTTA_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.GREEN_TERRACOTTA_BRICKS)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block RED_TERRACOTTA_BRICK_STAIRS = registerBlock("red_terracotta_brick_stairs",
            new StairsBlock(DecoBlocks.RED_TERRACOTTA_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.RED_TERRACOTTA_BRICKS)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block BLACK_TERRACOTTA_BRICK_STAIRS = registerBlock("black_terracotta_brick_stairs",
            new StairsBlock(DecoBlocks.BLACK_TERRACOTTA_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.BLACK_TERRACOTTA_BRICKS)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block TERRACOTTA_BRICK_STAIRS = registerBlock("terracotta_brick_stairs",
            new StairsBlock(DecoBlocks.TERRACOTTA_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.TERRACOTTA_BRICKS)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block SOUL_SOILSTONE_STAIRS = registerBlock("soul_soilstone_stairs",
            new StairsBlock(DecoBlocks.SOUL_SOILSTONE.getDefaultState(),
                    FabricBlockSettings.copyOf(DecoBlocks.SOUL_SOILSTONE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CUT_SOUL_SOILSTONE_STAIRS = registerBlock("cut_soul_soilstone_stairs",
            new StairsBlock(DecoBlocks.CUT_SOUL_SOILSTONE.getDefaultState(),
                    FabricBlockSettings.copyOf(DecoBlocks.CUT_SOUL_SOILSTONE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block SMOOTH_SOUL_SOILSTONE_STAIRS = registerBlock("smooth_soul_soilstone_stairs",
            new StairsBlock(DecoBlocks.SMOOTH_SOUL_SOILSTONE.getDefaultState(),
                    FabricBlockSettings.copyOf(DecoBlocks.SMOOTH_SOUL_SOILSTONE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CUT_SOUL_SOILSTONE_BRICK_STAIRS = registerBlock("cut_soul_soilstone_brick_stairs",
            new StairsBlock(DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block COBBLED_SOUL_SOILSTONE_STAIRS = registerBlock("cobbled_soul_soilstone_stairs",
            new StairsBlock(DecoBlocks.COBBLED_SANDSTONE.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.COBBLED_SANDSTONE)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block POLISHED_SOUL_SOILSTONE_STAIRS = registerBlock("polished_soul_soilstone_stairs",
            new StairsBlock(DecoBlocks.POLISHED_SANDSTONE.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.POLISHED_SANDSTONE)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block SOUL_SOILSTONE_BRICK_STAIRS = registerBlock("soul_soilstone_brick_stairs",
            new StairsBlock(DecoBlocks.SANDSTONE_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.SANDSTONE_BRICKS)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CUT_QUARTZ_STAIRS = registerBlock("cut_quartz_stairs",
            new StairsBlock(DecoBlocks.CUT_QUARTZ.getDefaultState(),
                    FabricBlockSettings.copyOf(DecoBlocks.CUT_QUARTZ)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block ICE_BRICK_STAIRS = registerBlock("ice_brick_stairs",
            new StairsBlock(DecoBlocks.ICE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(DecoBlocks.ICE_BRICKS)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CUT_WHITE_CONCRETE_STAIRS = registerBlock("cut_white_concrete_stairs",
            new StairsBlock(DecoBlocks.CUT_WHITE_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.CUT_WHITE_CONCRETE)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CUT_ORANGE_CONCRETE_STAIRS = registerBlock("cut_orange_concrete_stairs",
            new StairsBlock(DecoBlocks.CUT_ORANGE_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.CUT_ORANGE_CONCRETE)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CUT_MAGENTA_CONCRETE_STAIRS = registerBlock("cut_magenta_concrete_stairs",
            new StairsBlock(DecoBlocks.CUT_MAGENTA_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.CUT_MAGENTA_CONCRETE)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CUT_LIGHT_BLUE_CONCRETE_STAIRS = registerBlock("cut_light_blue_concrete_stairs",
            new StairsBlock(DecoBlocks.CUT_LIGHT_BLUE_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.CUT_LIGHT_BLUE_CONCRETE)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CUT_YELLOW_CONCRETE_STAIRS = registerBlock("cut_yellow_concrete_stairs",
            new StairsBlock(DecoBlocks.CUT_YELLOW_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.CUT_YELLOW_CONCRETE)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CUT_LIME_CONCRETE_STAIRS = registerBlock("cut_lime_concrete_stairs",
            new StairsBlock(DecoBlocks.CUT_LIME_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.CUT_LIME_CONCRETE)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CUT_PINK_CONCRETE_STAIRS = registerBlock("cut_pink_concrete_stairs",
            new StairsBlock(DecoBlocks.CUT_PINK_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.CUT_PINK_CONCRETE)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CUT_GRAY_CONCRETE_STAIRS = registerBlock("cut_gray_concrete_stairs",
            new StairsBlock(DecoBlocks.CUT_GRAY_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.CUT_GRAY_CONCRETE)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CUT_LIGHT_GRAY_CONCRETE_STAIRS = registerBlock("cut_light_gray_concrete_stairs",
            new StairsBlock(DecoBlocks.CUT_LIGHT_GRAY_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.CUT_LIGHT_GRAY_CONCRETE)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CUT_CYAN_CONCRETE_STAIRS = registerBlock("cut_cyan_concrete_stairs",
            new StairsBlock(DecoBlocks.CUT_CYAN_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.CUT_CYAN_CONCRETE)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CUT_PURPLE_CONCRETE_STAIRS = registerBlock("cut_purple_concrete_stairs",
            new StairsBlock(DecoBlocks.CUT_PURPLE_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.CUT_PURPLE_CONCRETE)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CUT_BLUE_CONCRETE_STAIRS = registerBlock("cut_blue_concrete_stairs",
            new StairsBlock(DecoBlocks.CUT_BLUE_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.CUT_BLUE_CONCRETE)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CUT_BROWN_CONCRETE_STAIRS = registerBlock("cut_brown_concrete_stairs",
            new StairsBlock(DecoBlocks.CUT_BROWN_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.CUT_BROWN_CONCRETE)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CUT_GREEN_CONCRETE_STAIRS = registerBlock("cut_green_concrete_stairs",
            new StairsBlock(DecoBlocks.CUT_GREEN_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.CUT_GREEN_CONCRETE)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CUT_RED_CONCRETE_STAIRS = registerBlock("cut_red_concrete_stairs",
            new StairsBlock(DecoBlocks.CUT_RED_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.CUT_RED_CONCRETE)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CUT_BLACK_CONCRETE_STAIRS = registerBlock("cut_black_concrete_stairs",
            new StairsBlock(DecoBlocks.CUT_BLACK_CONCRETE.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.CUT_BLACK_CONCRETE)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CRYSTALLIZED_PRISMARINE_STAIRS = registerBlock("crystallized_prismarine_stairs",
            new StairsBlock(DecoBlocks.CRYSTALLIZED_PRISMARINE.getDefaultState(),
                    FabricBlockSettings.copyOf(DecoBlocks.CRYSTALLIZED_PRISMARINE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CRYSTALLIZED_PRISMARINE_BRICK_STAIRS = registerBlock("crystallized_prismarine_brick_stairs",
            new StairsBlock(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block LIGHT_PRISMARINE_STAIRS = registerBlock("light_prismarine_stairs",
            new StairsBlock(DecoBlocks.LIGHT_PRISMARINE.getDefaultState(),
                    FabricBlockSettings.copyOf(DecoBlocks.LIGHT_PRISMARINE)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CUT_RED_SANDSTONE_BRICK_STAIRS = registerBlock("cut_red_sandstone_brick_stairs",
            new StairsBlock(DecoBlocks.CUT_RED_SANDSTONE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(DecoBlocks.CUT_RED_SANDSTONE_BRICKS)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block COBBLED_RED_SANDSTONE_STAIRS = registerBlock("cobbled_red_sandstone_stairs",
            new StairsBlock(DecoBlocks.COBBLED_RED_SANDSTONE.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.COBBLED_RED_SANDSTONE)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block POLISHED_RED_SANDSTONE_STAIRS = registerBlock("polished_red_sandstone_stairs",
            new StairsBlock(DecoBlocks.POLISHED_RED_SANDSTONE.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.POLISHED_RED_SANDSTONE)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block RED_SANDSTONE_BRICK_STAIRS = registerBlock("red_sandstone_brick_stairs",
            new StairsBlock(DecoBlocks.RED_SANDSTONE_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.RED_SANDSTONE_BRICKS)),
            DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block MAGMA_BRICK_STAIRS = registerBlock("magma_brick_stairs",
            new MagmaBrickStairBlock(DecoBlocks.MAGMA_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(DecoBlocks.MAGMA_BRICKS)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block BUBBLE_STAIRS = registerBlock("bubble_stairs",
            new BubbleStairBlock(DecoBlocks.BUBBLE_BLOCK.getDefaultState(),
                    FabricBlockSettings.copyOf(DecoBlocks.BUBBLE_BLOCK)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block BUBBLE_BRICK_STAIRS = registerBlock("bubble_brick_stairs",
            new BubbleStairBlock(DecoBlocks.BUBBLE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(DecoBlocks.BUBBLE_BRICKS)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block BLUE_NETHER_BRICK_STAIRS = registerBlock("blue_nether_brick_stairs",
            new StairsBlock(DecoBlocks.BLUE_NETHER_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(DecoBlocks.BLUE_NETHER_BRICKS)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block POLISHED_BLACKSTONE_TILE_STAIRS = registerBlock("polished_blackstone_tile_stairs",
            new StairsBlock(DecoBlocks.POLISHED_BLACKSTONE_TILES.getDefaultState(),
                    FabricBlockSettings.copyOf(DecoBlocks.POLISHED_BLACKSTONE_TILES)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CLOUD_STAIRS = registerBlock("cloud_stairs",
            new TransparentStairsBlock(DecoBlocks.SOLID_CLOUD.getDefaultState(),
                    FabricBlockSettings.copyOf(DecoBlocks.SOLID_CLOUD)), DecoItemGroup.VARAN_DECO_BUILDING);
    public static final Block CLOUD_BRICK_STAIRS = registerBlock("cloud_brick_stairs",
            new TransparentStairsBlock(DecoBlocks.CLOUD_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(DecoBlocks.CLOUD_BRICKS)), DecoItemGroup.VARAN_DECO_BUILDING);

    public static final Block WOODEN_SAPLING = registerBlock("wooden_sapling",
            new SaplingBlock(new WoodenSaplingGenerator(),FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block POTTED_WOODEN_SAPLING = registerBlockWithoutItem("potted_wooden_sapling",
            new FlowerPotBlock(WOODEN_SAPLING,FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING)));

    public static final Block WOODEN_LEAVES = registerBlock("wooden_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.DARK_OAK_LEAVES)), DecoItemGroup.VARAN_DECO_DECORATION);

    public static final Block PUFFY_DANDELION = registerBlock("puffy_dandelion",
            new PuffyDandelionBlock(StatusEffects.SATURATION, 3,FabricBlockSettings.copyOf(Blocks.DANDELION)),
            DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block POTTED_PUFFY_DANDELION = registerBlockWithoutItem("potted_puffy_dandelion",
            new FlowerPotBlock(PUFFY_DANDELION,FabricBlockSettings.copyOf(Blocks.POTTED_DANDELION)));

    public static final Block CALIFORNIA_POPPY = registerBlock("california_poppy",
            new FlowerBlock(StatusEffects.FIRE_RESISTANCE, 5,FabricBlockSettings.copyOf(Blocks.POPPY)),
            DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block POTTED_CALIFORNIA_POPPY = registerBlockWithoutItem("potted_california_poppy",
            new FlowerPotBlock(CALIFORNIA_POPPY,FabricBlockSettings.copyOf(Blocks.POTTED_POPPY)));
    public static final Block SALMON_POPPY = registerBlock("salmon_poppy",
            new FlowerBlock(StatusEffects.WATER_BREATHING, 7,FabricBlockSettings.copyOf(Blocks.POPPY)),
            DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block POTTED_SALMON_POPPY = registerBlockWithoutItem("potted_salmon_poppy",
            new FlowerPotBlock(SALMON_POPPY,FabricBlockSettings.copyOf(Blocks.POTTED_POPPY)));
    public static final Block ALPINE_POPPY = registerBlock("alpine_poppy",
            new FlowerBlock(StatusEffects.JUMP_BOOST, 5,FabricBlockSettings.copyOf(Blocks.POPPY)),
            DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block POTTED_ALPINE_POPPY = registerBlockWithoutItem("potted_alpine_poppy",
            new FlowerPotBlock(ALPINE_POPPY,FabricBlockSettings.copyOf(Blocks.POTTED_POPPY)));

    public static final Block YELLOW_ORCHID = registerBlock("yellow_orchid",
            new FlowerBlock(StatusEffects.INVISIBILITY, 7,FabricBlockSettings.copyOf(Blocks.BLUE_ORCHID)),
            DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block POTTED_YELLOW_ORCHID = registerBlockWithoutItem("potted_yellow_orchid",
            new FlowerPotBlock(YELLOW_ORCHID,FabricBlockSettings.copyOf(Blocks.POTTED_BLUE_ORCHID)));
    public static final Block WHITE_ORCHID = registerBlock("white_orchid",
            new FlowerBlock(StatusEffects.GLOWING, 5,FabricBlockSettings.copyOf(Blocks.BLUE_ORCHID)),
            DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block POTTED_WHITE_ORCHID = registerBlockWithoutItem("potted_white_orchid",
            new FlowerPotBlock(WHITE_ORCHID,FabricBlockSettings.copyOf(Blocks.POTTED_BLUE_ORCHID)));
    public static final Block PINK_ORCHID = registerBlock("pink_orchid",
            new FlowerBlock(StatusEffects.SLOW_FALLING, 7,FabricBlockSettings.copyOf(Blocks.BLUE_ORCHID)),
            DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block POTTED_PINK_ORCHID = registerBlockWithoutItem("potted_pink_orchid",
            new FlowerPotBlock(PINK_ORCHID,FabricBlockSettings.copyOf(Blocks.POTTED_BLUE_ORCHID)));

    public static final Block POPPED_BLUET = registerBlock("popped_bluet",
            new DesertFlowerBlock(StatusEffects.SPEED, 5,FabricBlockSettings.copyOf(Blocks.BLUE_ORCHID)),
            DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block POTTED_POPPED_BLUET = registerBlockWithoutItem("potted_popped_bluet",
            new FlowerPotBlock(POPPED_BLUET,FabricBlockSettings.copyOf(Blocks.POTTED_BLUE_ORCHID)));

    public static final Block YELLOW_TULIP = registerBlock("yellow_tulip",
            new FlowerBlock(StatusEffects.WEAKNESS, 7,FabricBlockSettings.copyOf(Blocks.RED_TULIP)),
            DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block POTTED_YELLOW_TULIP = registerBlockWithoutItem("potted_yellow_tulip",
            new FlowerPotBlock(YELLOW_TULIP,FabricBlockSettings.copyOf(Blocks.POTTED_RED_TULIP)));
    public static final Block PURPLE_TULIP = registerBlock("purple_tulip",
            new FlowerBlock(StatusEffects.WEAKNESS, 7,FabricBlockSettings.copyOf(Blocks.RED_TULIP)),
            DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block POTTED_PURPLE_TULIP = registerBlockWithoutItem("potted_purple_tulip",
            new FlowerPotBlock(PURPLE_TULIP,FabricBlockSettings.copyOf(Blocks.POTTED_RED_TULIP)));
    public static final Block MAGENTA_TULIP = registerBlock("magenta_tulip",
            new FlowerBlock(StatusEffects.WEAKNESS, 7,FabricBlockSettings.copyOf(Blocks.RED_TULIP)),
            DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block POTTED_MAGENTA_TULIP = registerBlockWithoutItem("potted_magenta_tulip",
            new FlowerPotBlock(MAGENTA_TULIP,FabricBlockSettings.copyOf(Blocks.POTTED_RED_TULIP)));
    public static final Block BLUE_TULIP = registerBlock("blue_tulip",
            new FlowerBlock(StatusEffects.WEAKNESS, 7,FabricBlockSettings.copyOf(Blocks.RED_TULIP)),
            DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block POTTED_BLUE_TULIP = registerBlockWithoutItem("potted_blue_tulip",
            new FlowerPotBlock(BLUE_TULIP,FabricBlockSettings.copyOf(Blocks.POTTED_RED_TULIP)));

    public static final Block BLACK_TULIP = registerBlock("black_tulip",
            new FlowerBlock(StatusEffects.WEAKNESS, 15,FabricBlockSettings.copyOf(Blocks.RED_TULIP)),
            DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block POTTED_BLACK_TULIP = registerBlockWithoutItem("potted_black_tulip",
            new FlowerPotBlock(BLACK_TULIP,FabricBlockSettings.copyOf(Blocks.POTTED_RED_TULIP)));
    public static final Block GREEN_TULIP = registerBlock("green_tulip",
            new FlowerBlock(StatusEffects.WEAKNESS, 15,FabricBlockSettings.copyOf(Blocks.RED_TULIP)),
            DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block POTTED_GREEN_TULIP = registerBlockWithoutItem("potted_green_tulip",
            new FlowerPotBlock(GREEN_TULIP,FabricBlockSettings.copyOf(Blocks.POTTED_RED_TULIP)));
    public static final Block CYAN_TULIP = registerBlock("cyan_tulip",
            new FlowerBlock(StatusEffects.WEAKNESS, 15,FabricBlockSettings.copyOf(Blocks.RED_TULIP)),
            DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block POTTED_CYAN_TULIP = registerBlockWithoutItem("potted_cyan_tulip",
            new FlowerPotBlock(CYAN_TULIP,FabricBlockSettings.copyOf(Blocks.POTTED_RED_TULIP)));

    public static final Block BARBERTON_DAISY = registerBlock("barberton_daisy",
            new FlowerBlock(StatusEffects.INSTANT_HEALTH, 1,FabricBlockSettings.copyOf(Blocks.OXEYE_DAISY)),
            DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block POTTED_BARBERTON_DAISY = registerBlockWithoutItem("potted_barberton_daisy",
            new FlowerPotBlock(BARBERTON_DAISY,FabricBlockSettings.copyOf(Blocks.POTTED_OXEYE_DAISY)));
    public static final Block BLUE_EYED_DAISY = registerBlock("blue_eyed_daisy",
            new FlowerBlock(StatusEffects.NIGHT_VISION, 11,FabricBlockSettings.copyOf(Blocks.OXEYE_DAISY)),
            DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block POTTED_BLUE_EYED_DAISY = registerBlockWithoutItem("potted_blue_eyed_daisy",
            new FlowerPotBlock(BLUE_EYED_DAISY,FabricBlockSettings.copyOf(Blocks.POTTED_OXEYE_DAISY)));
    public static final Block GERBERA_DAISY = registerBlock("gerbera_daisy",
            new FlowerBlock(StatusEffects.REGENERATION, 5,FabricBlockSettings.copyOf(Blocks.OXEYE_DAISY)),
            DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block POTTED_GERBERA_DAISY = registerBlockWithoutItem("potted_gerbera_daisy",
            new FlowerPotBlock(GERBERA_DAISY,FabricBlockSettings.copyOf(Blocks.POTTED_OXEYE_DAISY)));
    public static final Block MICHAELMAS_DAISY = registerBlock("michaelmas_daisy",
            new FlowerBlock(StatusEffects.RESISTANCE, 7,FabricBlockSettings.copyOf(Blocks.OXEYE_DAISY)),
            DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block POTTED_MICHAELMAS_DAISY = registerBlockWithoutItem("potted_michaelmas_daisy",
            new FlowerPotBlock(MICHAELMAS_DAISY,FabricBlockSettings.copyOf(Blocks.POTTED_OXEYE_DAISY)));
    public static final Block DEAD_EYE_DAISY = registerBlock("dead_eye_daisy",
            new DesertFlowerBlock(StatusEffects.STRENGTH, 5,FabricBlockSettings.copyOf(Blocks.OXEYE_DAISY)),
            DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block POTTED_DEAD_EYE_DAISY = registerBlockWithoutItem("potted_dead_eye_daisy",
            new FlowerPotBlock(DEAD_EYE_DAISY,FabricBlockSettings.copyOf(Blocks.POTTED_OXEYE_DAISY)));

    public static final Block PAEONIA = registerBlock("paeonia",
            new FlowerBlock(StatusEffects.SLOWNESS,7,FabricBlockSettings.copyOf(Blocks.POPPY)),
            DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block POTTED_PAEONIA = registerBlockWithoutItem("potted_paeonia",
            new FlowerPotBlock(PAEONIA,FabricBlockSettings.copyOf(Blocks.POTTED_POPPY)));

    public static final Block LAVENDER = registerBlock("lavender",
            new FlowerBlock(StatusEffects.HASTE,5,FabricBlockSettings.copyOf(Blocks.POPPY)),
            DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block POTTED_LAVENDER = registerBlockWithoutItem("potted_lavender",
            new FlowerPotBlock(LAVENDER,FabricBlockSettings.copyOf(Blocks.POTTED_POPPY)));

    public static final Block BLUE_HIBISCUS = registerBlock("blue_hibiscus",
            new FlowerBlock(StatusEffects.ABSORPTION,7,FabricBlockSettings.copyOf(Blocks.POPPY)),
            DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block POTTED_BLUE_HIBISCUS = registerBlockWithoutItem("potted_blue_hibiscus",
            new FlowerPotBlock(BLUE_HIBISCUS,FabricBlockSettings.copyOf(Blocks.POTTED_POPPY)));

    public static final Block BROMELIAD = registerBlock("bromeliad",
            new FlowerBlock(StatusEffects.HUNGER,5,FabricBlockSettings.copyOf(Blocks.POPPY)),
            DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block POTTED_BROMELIAD = registerBlockWithoutItem("potted_bromeliad",
            new FlowerPotBlock(BROMELIAD,FabricBlockSettings.copyOf(Blocks.POTTED_POPPY)));

    public static final Block BUTTERCUP = registerBlock("buttercup",
            new FlowerBlock(StatusEffects.ABSORPTION,7,FabricBlockSettings.copyOf(Blocks.POPPY)),
            DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block POTTED_BUTTERCUP = registerBlockWithoutItem("potted_buttercup",
            new FlowerPotBlock(BUTTERCUP,FabricBlockSettings.copyOf(Blocks.POTTED_POPPY)));

    public static final Block NIGHTSHADE = registerBlock("nightshade",
            new FlowerBlock(StatusEffects.INSTANT_DAMAGE,1,FabricBlockSettings.copyOf(Blocks.POPPY)),
            DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block POTTED_NIGHTSHADE = registerBlockWithoutItem("potted_nightshade",
            new FlowerPotBlock(NIGHTSHADE,FabricBlockSettings.copyOf(Blocks.POTTED_POPPY)));
    public static final Block ENDERSHADE = registerBlock("endershade",
            new EnderFlowerBlock(StatusEffects.MINING_FATIGUE,9,FabricBlockSettings.copyOf(Blocks.POPPY)),
            DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block POTTED_ENDERSHADE = registerBlockWithoutItem("potted_endershade",
            new FlowerPotBlock(ENDERSHADE,FabricBlockSettings.copyOf(Blocks.POTTED_POPPY)));

    public static final Block ROSE = registerBlock("rose",
            new FlowerBlock(StatusEffects.POISON, 5,FabricBlockSettings.copyOf(Blocks.POPPY)),
            DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block POTTED_ROSE = registerBlockWithoutItem("potted_rose",
            new FlowerPotBlock(ROSE,FabricBlockSettings.copyOf(Blocks.POTTED_POPPY)));
    public static final Block ENDER_ROSE = registerBlock("ender_rose",
            new EnderRoseBlock(StatusEffects.LEVITATION,FabricBlockSettings.copyOf(Blocks.POPPY)),
            DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block POTTED_ENDER_ROSE = registerBlockWithoutItem("potted_ender_rose",
            new FlowerPotBlock(ENDER_ROSE,FabricBlockSettings.copyOf(Blocks.POTTED_POPPY)));

    public static final Block OAK_CRAFTING_TABLE = registerBlock("oak_crafting_table",
            new OakCraftingTableBlock(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE).mapColor(MapColor.OAK_TAN)),
                DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block SPRUCE_CRAFTING_TABLE = registerBlock("spruce_crafting_table",
            new SpruceCraftingTableBlock(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE).mapColor(MapColor.SPRUCE_BROWN)),
                DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block BIRCH_CRAFTING_TABLE = registerBlock("birch_crafting_table",
            new BirchCraftingTableBlock(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE).mapColor(MapColor.PALE_YELLOW)),
                DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block JUNGLE_CRAFTING_TABLE = registerBlock("jungle_crafting_table",
            new JungleCraftingTableBlock(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE).mapColor(MapColor.DIRT_BROWN)),
                DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block ACACIA_CRAFTING_TABLE = registerBlock("acacia_crafting_table",
            new AcaciaCraftingTableBlock(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE).mapColor(MapColor.GRAY)),
                DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block DARK_OAK_CRAFTING_TABLE = registerBlock("dark_oak_crafting_table",
            new DarkOakCraftingTableBlock(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE).mapColor(MapColor.BROWN)),
                DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block MANGROVE_CRAFTING_TABLE = registerBlock("mangrove_crafting_table",
            new MangroveCraftingTableBlock(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE).mapColor(MapColor.RED)),
                DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block CRIMSON_CRAFTING_TABLE = registerBlock("crimson_crafting_table",
            new CrimsonCraftingTableBlock(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE).mapColor(MapColor.DULL_PINK)
                    .sounds(BlockSoundGroup.NETHER_STEM)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block WARPED_CRAFTING_TABLE = registerBlock("warped_crafting_table",
            new WarpedCraftingTableBlock(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE).mapColor(MapColor.TEAL)
                    .sounds(BlockSoundGroup.NETHER_STEM)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block CACTUS_CRAFTING_TABLE = registerBlock("cactus_crafting_table",
            new CactusCraftingTableBlock(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE).mapColor(MapColor.DARK_GREEN)),
                DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block MUSHROOM_CRAFTING_TABLE = registerBlock("mushroom_crafting_table",
            new MushroomCraftingTableBlock(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE).mapColor(MapColor.OFF_WHITE)),
                DecoItemGroup.VARAN_DECO_DECORATION);

    public static final Block DEEPSLATE_FURNACE = registerBlock("deepslate_furnace",
            new DeepslateFurnaceBlock(FabricBlockSettings.copyOf(Blocks.FURNACE).mapColor(MapColor.DEEPSLATE_GRAY)
                    .strength(4.5f).sounds(BlockSoundGroup.DEEPSLATE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block BLACKSTONE_FURNACE = registerBlock("blackstone_furnace",
            new BlackstoneFurnaceBlock(FabricBlockSettings.copyOf(Blocks.FURNACE).mapColor(MapColor.BLACK)
                    .strength(3.0f)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block END_STONE_FURNACE = registerBlock("end_stone_furnace",
            new EndstoneFurnaceBlock(FabricBlockSettings.copyOf(Blocks.FURNACE).mapColor(MapColor.PALE_YELLOW)
                    .strength(4.5f)), DecoItemGroup.VARAN_DECO_DECORATION);

    public static final Block SPRUCE_LADDER = registerBlock("spruce_ladder",
            new LadderBlock(FabricBlockSettings.copyOf(Blocks.LADDER)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block BIRCH_LADDER = registerBlock("birch_ladder",
            new LadderBlock(FabricBlockSettings.copyOf(Blocks.LADDER)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block JUNGLE_LADDER = registerBlock("jungle_ladder",
            new LadderBlock(FabricBlockSettings.copyOf(Blocks.LADDER)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block ACACIA_LADDER = registerBlock("acacia_ladder",
            new LadderBlock(FabricBlockSettings.copyOf(Blocks.LADDER)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block DARK_OAK_LADDER = registerBlock("dark_oak_ladder",
            new LadderBlock(FabricBlockSettings.copyOf(Blocks.LADDER)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block MANGROVE_LADDER = registerBlock("mangrove_ladder",
            new LadderBlock(FabricBlockSettings.copyOf(Blocks.LADDER)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block CRIMSON_LADDER = registerBlock("crimson_ladder",
            new LadderBlock(FabricBlockSettings.copyOf(Blocks.LADDER)
                    .sounds(BlockSoundGroup.NETHER_STEM)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block WARPED_LADDER = registerBlock("warped_ladder",
            new LadderBlock(FabricBlockSettings.copyOf(Blocks.LADDER)
                    .sounds(BlockSoundGroup.NETHER_STEM)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block CACTUS_LADDER = registerBlock("cactus_ladder",
            new LadderBlock(FabricBlockSettings.copyOf(Blocks.LADDER)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block MUSHROOM_LADDER = registerBlock("mushroom_ladder",
            new LadderBlock(FabricBlockSettings.copyOf(Blocks.LADDER)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block WOODEN_LADDER = registerBlock("wooden_ladder",
            new LadderBlock(FabricBlockSettings.copyOf(Blocks.LADDER)), DecoItemGroup.VARAN_DECO_DECORATION);

    public static final Block IRON_LADDER = registerBlock("iron_ladder",
            new LadderBlock(FabricBlockSettings.copyOf(Blocks.LADDER).sounds(BlockSoundGroup.METAL)
                    .strength(5.0F, 6.0F).requiresTool()), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block GOLDEN_LADDER = registerBlock("golden_ladder",
            new LadderBlock(FabricBlockSettings.copyOf(Blocks.LADDER).sounds(BlockSoundGroup.METAL)
                    .strength(5.0F, 6.0F).requiresTool()), DecoItemGroup.VARAN_DECO_DECORATION);

    public static final Block COPPER_LADDER = registerBlock("copper_ladder",
            new OxidizableLadderBlock(Oxidizable.OxidationLevel.UNAFFECTED,FabricBlockSettings.copyOf(Blocks.LADDER)
                    .sounds(BlockSoundGroup.COPPER).strength(5.0F, 6.0F).requiresTool()), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block EXPOSED_COPPER_LADDER = registerBlock("exposed_copper_ladder",
            new OxidizableLadderBlock(Oxidizable.OxidationLevel.EXPOSED,FabricBlockSettings.copyOf(Blocks.LADDER)
                    .sounds(BlockSoundGroup.COPPER).strength(5.0F, 6.0F).requiresTool()), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block WEATHERED_COPPER_LADDER = registerBlock("weathered_copper_ladder",
            new OxidizableLadderBlock(Oxidizable.OxidationLevel.WEATHERED,FabricBlockSettings.copyOf(Blocks.LADDER)
                    .sounds(BlockSoundGroup.COPPER).strength(5.0F, 6.0F).requiresTool()), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block OXIDIZED_COPPER_LADDER = registerBlock("oxidized_copper_ladder",
            new OxidizableLadderBlock(Oxidizable.OxidationLevel.OXIDIZED,FabricBlockSettings.copyOf(Blocks.LADDER)
                    .sounds(BlockSoundGroup.COPPER).strength(5.0F, 6.0F).requiresTool()), DecoItemGroup.VARAN_DECO_DECORATION);

    public static final Block WAXED_COPPER_LADDER = registerBlock("waxed_copper_ladder",
            new LadderBlock(FabricBlockSettings.copyOf(DecoBlocks.COPPER_LADDER)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block WAXED_EXPOSED_COPPER_LADDER = registerBlock("waxed_exposed_copper_ladder",
            new LadderBlock(FabricBlockSettings.copyOf(DecoBlocks.EXPOSED_COPPER_LADDER)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block WAXED_WEATHERED_COPPER_LADDER = registerBlock("waxed_weathered_copper_ladder",
            new LadderBlock(FabricBlockSettings.copyOf(DecoBlocks.WEATHERED_COPPER_LADDER)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block WAXED_OXIDIZED_COPPER_LADDER = registerBlock("waxed_oxidized_copper_ladder",
            new LadderBlock(FabricBlockSettings.copyOf(DecoBlocks.OXIDIZED_COPPER_LADDER)), DecoItemGroup.VARAN_DECO_DECORATION);

    public static final Block GRASS_CARPET = registerBlock("grass_carpet",
            new CarpetBlock(FabricBlockSettings.copyOf(Blocks.MOSS_CARPET).sounds(BlockSoundGroup.GRASS)),
            DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block PODZOL_CARPET = registerBlock("podzol_carpet",
            new CarpetBlock(FabricBlockSettings.copyOf(Blocks.MOSS_CARPET).mapColor(MapColor.SPRUCE_BROWN)
                    .sounds(BlockSoundGroup.GRAVEL)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block CRIMSON_NYLIUM_CARPET = registerBlock("crimson_nylium_carpet",
            new CarpetBlock(FabricBlockSettings.copyOf(Blocks.MOSS_CARPET).mapColor(MapColor.DULL_RED)
                    .sounds(BlockSoundGroup.NYLIUM)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block WARPED_NYLIUM_CARPET = registerBlock("warped_nylium_carpet",
            new CarpetBlock(FabricBlockSettings.copyOf(Blocks.MOSS_CARPET).mapColor(MapColor.TEAL)
                    .sounds(BlockSoundGroup.NYLIUM)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block MYCELIUM_CARPET = registerBlock("mycelium_carpet",
            new CarpetBlock(FabricBlockSettings.copyOf(Blocks.MOSS_CARPET).mapColor(MapColor.PURPLE)
                    .sounds(BlockSoundGroup.GRASS)), DecoItemGroup.VARAN_DECO_DECORATION);

    public static final Block PACKED_CACTUS = registerBlock("packed_cactus",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.DARK_OAK_WOOD).strength(0.4F).sounds(BlockSoundGroup.WOOL)
                    .mapColor(MapColor.GREEN)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block STRIPPED_CACTUS = registerBlock("stripped_cactus",
            new PillarBlock(FabricBlockSettings.copyOf(DecoBlocks.PACKED_CACTUS).mapColor(MapColor.PALE_GREEN)),
            DecoItemGroup.VARAN_DECO_DECORATION);

    public static final Block CACTUS_PLANK_FENCE = registerBlock("cactus_plank_fence",
            new FenceBlock(FabricBlockSettings.copyOf(DecoBlocks.CACTUS_PLANKS)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block MUSHROOM_FENCE = registerBlock("mushroom_fence",
            new FenceBlock(FabricBlockSettings.copyOf(DecoBlocks.MUSHROOM_PLANKS)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block WOODEN_FENCE = registerBlock("wooden_fence",
            new FenceBlock(FabricBlockSettings.copyOf(DecoBlocks.WOODEN_PLANKS)), DecoItemGroup.VARAN_DECO_DECORATION);

    public static final Block INFESTED_GRANITE = registerBlock("infested_granite",
            new InfestedBlock(Blocks.GRANITE, AbstractBlock.Settings.of(Material.ORGANIC_PRODUCT)),
            DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block INFESTED_POLISHED_GRANITE = registerBlock("infested_polished_granite",
            new InfestedBlock(Blocks.POLISHED_GRANITE, AbstractBlock.Settings.of(Material.ORGANIC_PRODUCT)),
            DecoItemGroup.VARAN_DECO_DECORATION);

    public static final Block INFESTED_DIORITE = registerBlock("infested_diorite",
            new InfestedBlock(Blocks.DIORITE, AbstractBlock.Settings.of(Material.ORGANIC_PRODUCT)),
            DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block INFESTED_POLISHED_DIORITE = registerBlock("infested_polished_diorite",
            new InfestedBlock(Blocks.POLISHED_DIORITE, AbstractBlock.Settings.of(Material.ORGANIC_PRODUCT)),
            DecoItemGroup.VARAN_DECO_DECORATION);

    public static final Block INFESTED_ANDESITE = registerBlock("infested_andesite",
            new InfestedBlock(Blocks.ANDESITE, AbstractBlock.Settings.of(Material.ORGANIC_PRODUCT)),
            DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block INFESTED_POLISHED_ANDESITE = registerBlock("infested_polished_andesite",
            new InfestedBlock(Blocks.POLISHED_ANDESITE, AbstractBlock.Settings.of(Material.ORGANIC_PRODUCT)),
            DecoItemGroup.VARAN_DECO_DECORATION);

    public static final Block INFESTED_COBBLED_DEEPSLATE = registerBlock("infested_cobbled_deepslate",
            new InfestedBlock(Blocks.COBBLED_DEEPSLATE, AbstractBlock.Settings.of(Material.ORGANIC_PRODUCT)),
            DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block INFESTED_POLISHED_DEEPSLATE = registerBlock("infested_polished_deepslate",
            new InfestedBlock(Blocks.POLISHED_DEEPSLATE, AbstractBlock.Settings.of(Material.ORGANIC_PRODUCT)),
            DecoItemGroup.VARAN_DECO_DECORATION);

    public static final Block INFESTED_CALCITE = registerBlock("infested_calcite",
            new InfestedBlock(Blocks.CALCITE, AbstractBlock.Settings.of(Material.ORGANIC_PRODUCT)),
            DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block INFESTED_TUFF = registerBlock("infested_tuff",
            new InfestedBlock(Blocks.TUFF, AbstractBlock.Settings.of(Material.ORGANIC_PRODUCT)),
            DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block INFESTED_DRIPSTONE_BLOCK = registerBlock("infested_dripstone_block",
            new InfestedBlock(Blocks.DRIPSTONE_BLOCK, AbstractBlock.Settings.of(Material.ORGANIC_PRODUCT)),
            DecoItemGroup.VARAN_DECO_DECORATION);

    public static final Block INFESTED_POLISHED_STONE = registerBlock("infested_polished_stone",
            new InfestedBlock(DecoBlocks.POLISHED_STONE, AbstractBlock.Settings.of(Material.ORGANIC_PRODUCT)),
            DecoItemGroup.VARAN_DECO_DECORATION);

    public static final Block INFESTED_MOSSY_COBBLESTONE = registerBlock("infested_mossy_cobblestone",
            new InfestedBlock(Blocks.MOSSY_COBBLESTONE, AbstractBlock.Settings.of(Material.ORGANIC_PRODUCT)),
            DecoItemGroup.VARAN_DECO_DECORATION);

    public static final Block INFESTED_STONE_TILES = registerBlock("infested_stone_tiles",
            new InfestedBlock(DecoBlocks.STONE_TILES, AbstractBlock.Settings.of(Material.ORGANIC_PRODUCT)),
            DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block INFESTED_CRACKED_STONE_TILES = registerBlock("infested_cracked_stone_tiles",
            new InfestedBlock(DecoBlocks.CRACKED_STONE_TILES, AbstractBlock.Settings.of(Material.ORGANIC_PRODUCT)),
            DecoItemGroup.VARAN_DECO_DECORATION);

    public static final Block INFESTED_DEEPSLATE_BRICKS = registerBlock("infested_deepslate_bricks",
            new InfestedBlock(Blocks.DEEPSLATE_BRICKS, AbstractBlock.Settings.of(Material.ORGANIC_PRODUCT)),
            DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block INFESTED_CRACKED_DEEPSLATE_BRICKS = registerBlock("infested_cracked_deepslate_bricks",
            new InfestedBlock(Blocks.CRACKED_DEEPSLATE_BRICKS, AbstractBlock.Settings.of(Material.ORGANIC_PRODUCT)),
            DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block INFESTED_DEEPSLATE_TILES = registerBlock("infested_deepslate_tiles",
            new InfestedBlock(Blocks.DEEPSLATE_TILES, AbstractBlock.Settings.of(Material.ORGANIC_PRODUCT)),
            DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block INFESTED_CRACKED_DEEPSLATE_TILES = registerBlock("infested_cracked_deepslate_tiles",
            new InfestedBlock(Blocks.CRACKED_DEEPSLATE_TILES, AbstractBlock.Settings.of(Material.ORGANIC_PRODUCT)),
            DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block INFESTED_CHISELED_DEEPSLATE = registerBlock("infested_chiseled_deepslate",
            new InfestedBlock(Blocks.CHISELED_DEEPSLATE, AbstractBlock.Settings.of(Material.ORGANIC_PRODUCT)),
            DecoItemGroup.VARAN_DECO_DECORATION);

    public static final Block INFESTED_BLACKSTONE = registerBlock("infested_blackstone",
            new InfestedBlock(Blocks.BLACKSTONE, AbstractBlock.Settings.of(Material.ORGANIC_PRODUCT)),
            DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block INFESTED_POLISHED_BLACKSTONE = registerBlock("infested_polished_blackstone",
            new InfestedBlock(Blocks.POLISHED_BLACKSTONE, AbstractBlock.Settings.of(Material.ORGANIC_PRODUCT)),
            DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block INFESTED_CHISELED_POLISHED_BLACKSTONE = registerBlock("infested_chiseled_polished_blackstone",
            new InfestedBlock(Blocks.CHISELED_POLISHED_BLACKSTONE, AbstractBlock.Settings.of(Material.ORGANIC_PRODUCT)),
            DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block INFESTED_POLISHED_BLACKSTONE_BRICKS = registerBlock("infested_polished_blackstone_bricks",
            new InfestedBlock(Blocks.POLISHED_BLACKSTONE_BRICKS, AbstractBlock.Settings.of(Material.ORGANIC_PRODUCT)),
            DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block INFESTED_CRACKED_POLISHED_BLACKSTONE_BRICKS = registerBlock("infested_cracked_polished_blackstone_bricks",
            new InfestedBlock(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS, AbstractBlock.Settings.of(Material.ORGANIC_PRODUCT)),
            DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block INFESTED_POLISHED_BLACKSTONE_TILES = registerBlock("infested_polished_blackstone_tiles",
            new InfestedBlock(DecoBlocks.POLISHED_BLACKSTONE_TILES, AbstractBlock.Settings.of(Material.ORGANIC_PRODUCT)),
            DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block INFESTED_CRACKED_POLISHED_BLACKSTONE_TILES = registerBlock("infested_cracked_polished_blackstone_tiles",
            new InfestedBlock(DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILES, AbstractBlock.Settings.of(Material.ORGANIC_PRODUCT)),
            DecoItemGroup.VARAN_DECO_DECORATION);

    public static final Block LIGHT_IRON_BARS = registerBlock("light_iron_bars",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.IRON_BARS).strength(2.5f,6.0f)),
            DecoItemGroup.VARAN_DECO_DECORATION);

    public static final Block LIGHT_COPPER_BARS = registerBlock("light_copper_bars",
            new OxidizablePaneBlock(Oxidizable.OxidationLevel.UNAFFECTED,FabricBlockSettings.copyOf(DecoBlocks.LIGHT_IRON_BARS)
                    .sounds(BlockSoundGroup.COPPER)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block EXPOSED_LIGHT_COPPER_BARS = registerBlock("exposed_light_copper_bars",
            new OxidizablePaneBlock(Oxidizable.OxidationLevel.EXPOSED,FabricBlockSettings.copyOf(DecoBlocks.LIGHT_IRON_BARS)
                    .sounds(BlockSoundGroup.COPPER)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block WEATHERED_LIGHT_COPPER_BARS = registerBlock("weathered_light_copper_bars",
            new OxidizablePaneBlock(Oxidizable.OxidationLevel.WEATHERED,FabricBlockSettings.copyOf(DecoBlocks.LIGHT_IRON_BARS)
                    .sounds(BlockSoundGroup.COPPER)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block OXIDIZED_LIGHT_COPPER_BARS = registerBlock("oxidized_light_copper_bars",
            new OxidizablePaneBlock(Oxidizable.OxidationLevel.OXIDIZED,FabricBlockSettings.copyOf(DecoBlocks.LIGHT_IRON_BARS)
                    .sounds(BlockSoundGroup.COPPER)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block WAXED_LIGHT_COPPER_BARS = registerBlock("waxed_light_copper_bars",
            new PaneBlock(FabricBlockSettings.copyOf(DecoBlocks.LIGHT_COPPER_BARS)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block WAXED_WEATHERED_LIGHT_COPPER_BARS = registerBlock("waxed_weathered_light_copper_bars",
            new PaneBlock(FabricBlockSettings.copyOf(DecoBlocks.WEATHERED_LIGHT_COPPER_BARS)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block WAXED_EXPOSED_LIGHT_COPPER_BARS = registerBlock("waxed_exposed_light_copper_bars",
            new PaneBlock(FabricBlockSettings.copyOf(DecoBlocks.EXPOSED_LIGHT_COPPER_BARS)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block WAXED_OXIDIZED_LIGHT_COPPER_BARS = registerBlock("waxed_oxidized_light_copper_bars",
            new PaneBlock(FabricBlockSettings.copyOf(DecoBlocks.OXIDIZED_LIGHT_COPPER_BARS)), DecoItemGroup.VARAN_DECO_DECORATION);

    public static final Block LIGHT_GOLD_BARS = registerBlock("light_gold_bars",
            new PaneBlock(FabricBlockSettings.copyOf(DecoBlocks.LIGHT_IRON_BARS).sounds(BlockSoundGroup.METAL)),
                DecoItemGroup.VARAN_DECO_DECORATION);

    public static final Block COPPER_BARS = registerBlock("copper_bars",
            new OxidizablePaneBlock(Oxidizable.OxidationLevel.UNAFFECTED,FabricBlockSettings.copyOf(Blocks.IRON_BARS)
                    .sounds(BlockSoundGroup.COPPER)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block EXPOSED_COPPER_BARS = registerBlock("exposed_copper_bars",
            new OxidizablePaneBlock(Oxidizable.OxidationLevel.EXPOSED,FabricBlockSettings.copyOf(Blocks.IRON_BARS)
                    .sounds(BlockSoundGroup.COPPER)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block WEATHERED_COPPER_BARS = registerBlock("weathered_copper_bars",
            new OxidizablePaneBlock(Oxidizable.OxidationLevel.WEATHERED,FabricBlockSettings.copyOf(Blocks.IRON_BARS)
                    .sounds(BlockSoundGroup.COPPER)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block OXIDIZED_COPPER_BARS = registerBlock("oxidized_copper_bars",
            new OxidizablePaneBlock(Oxidizable.OxidationLevel.OXIDIZED,FabricBlockSettings.copyOf(Blocks.IRON_BARS)
                    .sounds(BlockSoundGroup.COPPER)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block WAXED_COPPER_BARS = registerBlock("waxed_copper_bars",
            new PaneBlock(FabricBlockSettings.copyOf(DecoBlocks.COPPER_BARS)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block WAXED_EXPOSED_COPPER_BARS = registerBlock("waxed_exposed_copper_bars",
            new PaneBlock(FabricBlockSettings.copyOf(DecoBlocks.EXPOSED_COPPER_BARS)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block WAXED_WEATHERED_COPPER_BARS = registerBlock("waxed_weathered_copper_bars",
            new PaneBlock(FabricBlockSettings.copyOf(DecoBlocks.WEATHERED_COPPER_BARS)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block WAXED_OXIDIZED_COPPER_BARS = registerBlock("waxed_oxidized_copper_bars",
            new PaneBlock(FabricBlockSettings.copyOf(DecoBlocks.OXIDIZED_COPPER_BARS)), DecoItemGroup.VARAN_DECO_DECORATION);

    public static final Block GOLD_BARS = registerBlock("gold_bars",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.IRON_BARS).sounds(BlockSoundGroup.METAL)),
                DecoItemGroup.VARAN_DECO_DECORATION);

    public static final Block HEAVY_IRON_BARS = registerBlock("heavy_iron_bars",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.IRON_BARS).strength(10.0f,12.0f)
                    .mapColor(MapColor.IRON_GRAY)), DecoItemGroup.VARAN_DECO_DECORATION);

    public static final Block HEAVY_COPPER_BARS = registerBlock("heavy_copper_bars",
            new OxidizablePaneBlock(Oxidizable.OxidationLevel.UNAFFECTED,FabricBlockSettings.copyOf(DecoBlocks.HEAVY_IRON_BARS)
                    .mapColor(MapColor.ORANGE).sounds(BlockSoundGroup.COPPER)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block EXPOSED_HEAVY_COPPER_BARS = registerBlock("exposed_heavy_copper_bars",
            new OxidizablePaneBlock(Oxidizable.OxidationLevel.EXPOSED,FabricBlockSettings.copyOf(DecoBlocks.HEAVY_IRON_BARS)
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).sounds(BlockSoundGroup.COPPER)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block WEATHERED_HEAVY_COPPER_BARS = registerBlock("weathered_heavy_copper_bars",
            new OxidizablePaneBlock(Oxidizable.OxidationLevel.WEATHERED,FabricBlockSettings.copyOf(DecoBlocks.HEAVY_IRON_BARS)
                    .mapColor(MapColor.DARK_AQUA).sounds(BlockSoundGroup.COPPER)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block OXIDIZED_HEAVY_COPPER_BARS = registerBlock("oxidized_heavy_copper_bars",
            new OxidizablePaneBlock(Oxidizable.OxidationLevel.OXIDIZED,FabricBlockSettings.copyOf(DecoBlocks.HEAVY_IRON_BARS)
                    .mapColor(MapColor.DARK_AQUA).sounds(BlockSoundGroup.COPPER)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block WAXED_HEAVY_COPPER_BARS = registerBlock("waxed_heavy_copper_bars",
            new PaneBlock(FabricBlockSettings.copyOf(DecoBlocks.HEAVY_COPPER_BARS)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block WAXED_EXPOSED_HEAVY_COPPER_BARS = registerBlock("waxed_exposed_heavy_copper_bars",
            new PaneBlock(FabricBlockSettings.copyOf(DecoBlocks.EXPOSED_HEAVY_COPPER_BARS)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block WAXED_WEATHERED_HEAVY_COPPER_BARS = registerBlock("waxed_weathered_heavy_copper_bars",
            new PaneBlock(FabricBlockSettings.copyOf(DecoBlocks.WEATHERED_HEAVY_COPPER_BARS)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block WAXED_OXIDIZED_HEAVY_COPPER_BARS = registerBlock("waxed_oxidized_heavy_copper_bars",
            new PaneBlock(FabricBlockSettings.copyOf(DecoBlocks.OXIDIZED_HEAVY_COPPER_BARS)), DecoItemGroup.VARAN_DECO_DECORATION);

    public static final Block HEAVY_GOLD_BARS = registerBlock("heavy_gold_bars",
            new PaneBlock(FabricBlockSettings.copyOf(DecoBlocks.HEAVY_IRON_BARS).sounds(BlockSoundGroup.METAL)
                    .mapColor(MapColor.GOLD)), DecoItemGroup.VARAN_DECO_DECORATION);

    public static final Block COPPER_CHAIN = registerBlock("copper_chain",
            new OxidizableChainBlock(Oxidizable.OxidationLevel.UNAFFECTED,FabricBlockSettings.copyOf(Blocks.CHAIN)
                    .sounds(BlockSoundGroup.COPPER)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block EXPOSED_COPPER_CHAIN = registerBlock("exposed_copper_chain",
            new OxidizableChainBlock(Oxidizable.OxidationLevel.EXPOSED,FabricBlockSettings.copyOf(Blocks.CHAIN)
                    .sounds(BlockSoundGroup.COPPER)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block WEATHERED_COPPER_CHAIN = registerBlock("weathered_copper_chain",
            new OxidizableChainBlock(Oxidizable.OxidationLevel.WEATHERED,FabricBlockSettings.copyOf(Blocks.CHAIN)
                    .sounds(BlockSoundGroup.COPPER)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block OXIDIZED_COPPER_CHAIN = registerBlock("oxidized_copper_chain",
            new OxidizableChainBlock(Oxidizable.OxidationLevel.OXIDIZED,FabricBlockSettings.copyOf(Blocks.CHAIN)
                    .sounds(BlockSoundGroup.COPPER)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block WAXED_COPPER_CHAIN = registerBlock("waxed_copper_chain",
            new ChainBlock(FabricBlockSettings.copyOf(DecoBlocks.COPPER_CHAIN)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block WAXED_EXPOSED_COPPER_CHAIN = registerBlock("waxed_exposed_copper_chain",
            new ChainBlock(FabricBlockSettings.copyOf(DecoBlocks.EXPOSED_COPPER_CHAIN)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block WAXED_WEATHERED_COPPER_CHAIN = registerBlock("waxed_weathered_copper_chain",
            new ChainBlock(FabricBlockSettings.copyOf(DecoBlocks.WEATHERED_COPPER_CHAIN)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block WAXED_OXIDIZED_COPPER_CHAIN = registerBlock("waxed_oxidized_copper_chain",
            new ChainBlock(FabricBlockSettings.copyOf(DecoBlocks.OXIDIZED_COPPER_CHAIN)), DecoItemGroup.VARAN_DECO_DECORATION);

    public static final Block RED_NETHER_BRICK_FENCE = registerBlock("red_nether_brick_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.RED_NETHER_BRICKS)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block BLUE_NETHER_BRICK_FENCE = registerBlock("blue_nether_brick_fence",
            new FenceBlock(FabricBlockSettings.copyOf(DecoBlocks.BLUE_NETHER_BRICKS)), DecoItemGroup.VARAN_DECO_DECORATION);

    public static final Block STONE_WALL = registerBlock("stone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block POLISHED_ANDESITE_WALL = registerBlock("polished_andesite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_ANDESITE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block POLISHED_DIORITE_WALL = registerBlock("polished_diorite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_DIORITE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block POLISHED_GRANITE_WALL = registerBlock("polished_granite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_GRANITE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block DEEPSLATE_WALL = registerBlock("deepslate_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block CALCITE_WALL = registerBlock("calcite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.CALCITE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block TUFF_WALL = registerBlock("tuff_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TUFF)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block DRIPSTONE_WALL = registerBlock("dripstone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)), DecoItemGroup.VARAN_DECO_DECORATION);

    public static final Block DIRT_WALL = registerBlock("dirt_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.DIRT)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block COARSE_DIRT_WALL = registerBlock("coarse_dirt_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COARSE_DIRT)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block ROOTED_DIRT_WALL = registerBlock("rooted_dirt_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.ROOTED_DIRT)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block MUD_WALL = registerBlock("mud_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.MUD)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block BEDROCK_WALL = registerBlock("bedrock_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.BEDROCK)), DecoItemGroup.VARAN_DECO_DECORATION);

    public static final Block OAK_WOOD_WALL = registerBlock("oak_wood_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).mapColor(MapColor.DIRT_BROWN)),
            DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block SPRUCE_WOOD_WALL = registerBlock("spruce_wood_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_PLANKS).mapColor(MapColor.BROWN)),
            DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block BIRCH_WOOD_WALL = registerBlock("birch_wood_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.BIRCH_PLANKS).mapColor(MapColor.OFF_WHITE)),
            DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block JUNGLE_WOOD_WALL = registerBlock("jungle_wood_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_PLANKS).mapColor(MapColor.DIRT_BROWN)),
            DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block ACACIA_WOOD_WALL = registerBlock("acacia_wood_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_PLANKS).mapColor(MapColor.STONE_GRAY)),
            DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block DARK_OAK_WOOD_WALL = registerBlock("dark_oak_wood_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.DARK_OAK_PLANKS)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block MANGROVE_WOOD_WALL = registerBlock("mangrove_wood_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.MANGROVE_PLANKS).mapColor(MapColor.DIRT_BROWN)),
            DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block CRIMSON_HYPHAE_WALL = registerBlock("crimson_hyphae_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_PLANKS).sounds(BlockSoundGroup.NETHER_STEM)
                    .mapColor(MapColor.DARK_CRIMSON)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block WARPED_HYPHAE_WALL = registerBlock("warped_hyphae_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS).sounds(BlockSoundGroup.NETHER_STEM)
                    .mapColor(MapColor.DARK_DULL_PINK)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block WOODEN_WOOD_WALL = registerBlock("wooden_wood_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.WOODEN_PLANKS).mapColor(MapColor.TERRACOTTA_BROWN)),
            DecoItemGroup.VARAN_DECO_DECORATION);

    public static final Block STRIPPED_OAK_WOOD_WALL = registerBlock("stripped_oak_wood_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)),
            DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block STRIPPED_SPRUCE_WOOD_WALL = registerBlock("stripped_spruce_wood_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_PLANKS)),
            DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block STRIPPED_BIRCH_WOOD_WALL = registerBlock("stripped_birch_wood_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.BIRCH_PLANKS)),
            DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block STRIPPED_JUNGLE_WOOD_WALL = registerBlock("stripped_jungle_wood_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_PLANKS)),
            DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block STRIPPED_ACACIA_WOOD_WALL = registerBlock("stripped_acacia_wood_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_PLANKS)),
            DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block STRIPPED_DARK_OAK_WOOD_WALL = registerBlock("stripped_dark_oak_wood_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.DARK_OAK_PLANKS)),
            DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block STRIPPED_MANGROVE_WOOD_WALL = registerBlock("stripped_mangrove_wood_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.MANGROVE_PLANKS)),
            DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block STRIPPED_CRIMSON_HYPHAE_WALL = registerBlock("stripped_crimson_hyphae_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_PLANKS).sounds(BlockSoundGroup.NETHER_STEM)),
            DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block STRIPPED_WARPED_HYPHAE_WALL = registerBlock("stripped_warped_hyphae_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS).sounds(BlockSoundGroup.NETHER_STEM)),
            DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block STRIPPED_WOODEN_WOOD_WALL = registerBlock("stripped_wooden_wood_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.WOODEN_PLANKS)),
            DecoItemGroup.VARAN_DECO_DECORATION);

    public static final Block CUT_SANDSTONE_WALL = registerBlock("cut_sandstone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.CUT_SANDSTONE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block SMOOTH_QUARTZ_WALL = registerBlock("smooth_quartz_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_QUARTZ)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block SMOOTH_SANDSTONE_WALL = registerBlock("smooth_sandstone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_SANDSTONE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block SMOOTH_RED_SANDSTONE_WALL = registerBlock("smooth_red_sandstone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_RED_SANDSTONE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block SMOOTH_STONE_WALL = registerBlock("smooth_stone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block OBSIDIAN_WALL = registerBlock("obsidian_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.OBSIDIAN)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block PURPUR_WALL = registerBlock("purpur_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.PURPUR_BLOCK)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block SNOW_WALL = registerBlock("snow_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.SNOW_BLOCK)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block CLAY_WALL = registerBlock("clay_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.CLAY)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block NETHERRACK_WALL = registerBlock("netherrack_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.NETHERRACK)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block SMOOTH_BASALT_WALL = registerBlock("smooth_basalt_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_BASALT)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block PACKED_MUD_WALL = registerBlock("packed_mud_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.PACKED_MUD)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block END_STONE_WALL = registerBlock("end_stone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.END_STONE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block QUARTZ_WALL = registerBlock("quartz_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block QUARTZ_BRICK_WALL = registerBlock("quartz_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BRICKS)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block WHITE_TERRACOTTA_WALL = registerBlock("white_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.WHITE_TERRACOTTA)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block ORANGE_TERRACOTTA_WALL = registerBlock("orange_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.ORANGE_TERRACOTTA)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block MAGENTA_TERRACOTTA_WALL = registerBlock("magenta_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.MAGENTA_TERRACOTTA)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block LIGHT_BLUE_TERRACOTTA_WALL = registerBlock("light_blue_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_TERRACOTTA)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block YELLOW_TERRACOTTA_WALL = registerBlock("yellow_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.YELLOW_TERRACOTTA)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block LIME_TERRACOTTA_WALL = registerBlock("lime_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.LIME_TERRACOTTA)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block PINK_TERRACOTTA_WALL = registerBlock("pink_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.PINK_TERRACOTTA)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block GRAY_TERRACOTTA_WALL = registerBlock("gray_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.GRAY_TERRACOTTA)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block LIGHT_GRAY_TERRACOTTA_WALL = registerBlock("light_gray_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_TERRACOTTA)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block CYAN_TERRACOTTA_WALL = registerBlock("cyan_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.CYAN_TERRACOTTA)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block PURPLE_TERRACOTTA_WALL = registerBlock("purple_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.PURPLE_TERRACOTTA)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block BLUE_TERRACOTTA_WALL = registerBlock("blue_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.BLUE_TERRACOTTA)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block BROWN_TERRACOTTA_WALL = registerBlock("brown_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.BROWN_TERRACOTTA)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block GREEN_TERRACOTTA_WALL = registerBlock("green_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.GREEN_TERRACOTTA)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block RED_TERRACOTTA_WALL = registerBlock("red_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.RED_TERRACOTTA)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block BLACK_TERRACOTTA_WALL = registerBlock("black_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.BLACK_TERRACOTTA)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block TERRACOTTA_WALL = registerBlock("terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block PACKED_ICE_WALL = registerBlock("packed_ice_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.PACKED_ICE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block PRISMARINE_BRICK_WALL = registerBlock("prismarine_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.CUT_RED_SANDSTONE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block DARK_PRISMARINE_WALL = registerBlock("dark_prismarine_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.CUT_RED_SANDSTONE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block CUT_RED_SANDSTONE_WALL = registerBlock("cut_red_sandstone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.CUT_RED_SANDSTONE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block MAGMA_WALL = registerBlock("magma_wall",
            new MagmaWallBlock(FabricBlockSettings.copyOf(Blocks.MAGMA_BLOCK)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block BONE_WALL = registerBlock("bone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.BONE_BLOCK)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block WHITE_CONCRETE_WALL = registerBlock("white_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.WHITE_CONCRETE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block ORANGE_CONCRETE_WALL = registerBlock("orange_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.ORANGE_CONCRETE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block MAGENTA_CONCRETE_WALL = registerBlock("magenta_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.MAGENTA_CONCRETE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block LIGHT_BLUE_CONCRETE_WALL = registerBlock("light_blue_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_CONCRETE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block YELLOW_CONCRETE_WALL = registerBlock("yellow_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.YELLOW_CONCRETE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block LIME_CONCRETE_WALL = registerBlock("lime_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.LIME_CONCRETE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block PINK_CONCRETE_WALL = registerBlock("pink_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.PINK_CONCRETE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block GRAY_CONCRETE_WALL = registerBlock("gray_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.GRAY_CONCRETE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block LIGHT_GRAY_CONCRETE_WALL = registerBlock("light_gray_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_CONCRETE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block CYAN_CONCRETE_WALL = registerBlock("cyan_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.CYAN_CONCRETE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block PURPLE_CONCRETE_WALL = registerBlock("purple_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.PURPLE_CONCRETE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block BLUE_CONCRETE_WALL = registerBlock("blue_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.BLUE_CONCRETE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block BROWN_CONCRETE_WALL = registerBlock("brown_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.BROWN_CONCRETE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block GREEN_CONCRETE_WALL = registerBlock("green_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.GREEN_CONCRETE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block RED_CONCRETE_WALL = registerBlock("red_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.RED_CONCRETE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block BLACK_CONCRETE_WALL = registerBlock("black_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.BLACK_CONCRETE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block BLUE_ICE_WALL = registerBlock("blue_ice_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.BLUE_ICE)), DecoItemGroup.VARAN_DECO_DECORATION);

    public static final Block CUT_GRANITE_WALL = registerBlock("cut_granite_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_GRANITE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block GRANITE_BRICK_WALL = registerBlock("granite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.GRANITE_BRICKS)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block CUT_DIORITE_WALL = registerBlock("cut_diorite_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_DIORITE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block DIORITE_BRICK_WALL = registerBlock("diorite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.DIORITE_BRICKS)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block CUT_ANDESITE_WALL = registerBlock("cut_andesite_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_ANDESITE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block ANDESITE_BRICK_WALL = registerBlock("andesite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.ANDESITE_BRICKS)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block POLISHED_CALCITE_WALL = registerBlock("polished_calcite_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.POLISHED_CALCITE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block CUT_CALCITE_WALL = registerBlock("cut_calcite_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_CALCITE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block CALCITE_BRICK_WALL = registerBlock("calcite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.CALCITE_BRICKS)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block POLISHED_STONE_WALL = registerBlock("polished_stone_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.POLISHED_STONE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block STONE_TILE_WALL = registerBlock("stone_tile_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.STONE_TILES)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block CUT_SANDSTONE_BRICK_WALL = registerBlock("cut_sandstone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_SANDSTONE_BRICKS)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block COBBLED_SANDSTONE_WALL = registerBlock("cobbled_sandstone_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.COBBLED_SANDSTONE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block POLISHED_SANDSTONE_WALL = registerBlock("polished_sandstone_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.POLISHED_SANDSTONE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block SANDSTONE_BRICK_WALL = registerBlock("sandstone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.SANDSTONE_BRICKS)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block SMOOTH_OBSIDIAN_WALL = registerBlock("smooth_obsidian_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.SMOOTH_OBSIDIAN)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block SMOOTH_PURPUR_WALL = registerBlock("smooth_purpur_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.SMOOTH_PURPUR)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block SMOOTH_DEEPSLATE_WALL = registerBlock("smooth_deepslate_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.SMOOTH_DEEPSLATE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block SMOOTH_BLACKSTONE_WALL = registerBlock("smooth_blackstone_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.SMOOTH_BLACKSTONE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block SMOOTH_END_STONE_WALL = registerBlock("smooth_end_stone_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.SMOOTH_END_STONE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block SANDED_OBSIDIAN_WALL = registerBlock("sanded_obsidian_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.SANDED_OBSIDIAN)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block OBSIDIAN_BRICK_WALL = registerBlock("obsidian_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.OBSIDIAN_BRICKS)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block CUT_OBSIDIAN_WALL = registerBlock("cut_obsidian_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_OBSIDIAN)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block CUT_PURPUR_WALL = registerBlock("cut_purpur_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_PURPUR)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block PURPUR_BRICK_WALL = registerBlock("purpur_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.PURPUR_BRICKS)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block SNOW_BRICK_WALL = registerBlock("snow_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.SNOW_BRICKS)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block PACKED_NETHERRACK_WALL = registerBlock("packed_netherrack_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.PACKED_NETHERRACK)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block NETHERRACK_BRICK_WALL = registerBlock("netherrack_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.NETHERRACK_BRICKS)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block POLISHED_END_STONE_WALL = registerBlock("polished_end_stone_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.POLISHED_END_STONE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block END_STONE_TILE_WALL = registerBlock("end_stone_tile_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.END_STONE_TILES)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block VOID_STONE_WALL = registerBlock("void_stone_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.VOID_STONE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block VOID_STONE_BRICK_WALL = registerBlock("void_stone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.VOID_STONE_BRICKS)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block WHITE_TERRACOTTA_BRICK_WALL = registerBlock("white_terracotta_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.WHITE_TERRACOTTA_BRICKS)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block ORANGE_TERRACOTTA_BRICK_WALL = registerBlock("orange_terracotta_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.ORANGE_TERRACOTTA_BRICKS)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block MAGENTA_TERRACOTTA_BRICK_WALL = registerBlock("magenta_terracotta_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.MAGENTA_TERRACOTTA_BRICKS)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block LIGHT_BLUE_TERRACOTTA_BRICK_WALL = registerBlock("light_blue_terracotta_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block YELLOW_TERRACOTTA_BRICK_WALL = registerBlock("yellow_terracotta_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.YELLOW_TERRACOTTA_BRICKS)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block LIME_TERRACOTTA_BRICK_WALL = registerBlock("lime_terracotta_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.LIME_TERRACOTTA_BRICKS)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block PINK_TERRACOTTA_BRICK_WALL = registerBlock("pink_terracotta_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.PINK_TERRACOTTA_BRICKS)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block GRAY_TERRACOTTA_BRICK_WALL = registerBlock("gray_terracotta_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.GRAY_TERRACOTTA_BRICKS)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block LIGHT_GRAY_TERRACOTTA_BRICK_WALL = registerBlock("light_gray_terracotta_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block CYAN_TERRACOTTA_BRICK_WALL = registerBlock("cyan_terracotta_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.CYAN_TERRACOTTA_BRICKS)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block PURPLE_TERRACOTTA_BRICK_WALL = registerBlock("purple_terracotta_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.PURPLE_TERRACOTTA_BRICKS)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block BLUE_TERRACOTTA_BRICK_WALL = registerBlock("blue_terracotta_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.BLUE_TERRACOTTA_BRICKS)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block BROWN_TERRACOTTA_BRICK_WALL = registerBlock("brown_terracotta_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.BROWN_TERRACOTTA_BRICKS)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block GREEN_TERRACOTTA_BRICK_WALL = registerBlock("green_terracotta_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.GREEN_TERRACOTTA_BRICKS)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block RED_TERRACOTTA_BRICK_WALL = registerBlock("red_terracotta_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.RED_TERRACOTTA_BRICKS)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block BLACK_TERRACOTTA_BRICK_WALL = registerBlock("black_terracotta_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.BLACK_TERRACOTTA_BRICKS)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block TERRACOTTA_BRICK_WALL = registerBlock("terracotta_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.TERRACOTTA_BRICKS)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block SOUL_SOILSTONE_WALL = registerBlock("soul_soilstone_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.SOUL_SOILSTONE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block CUT_SOUL_SOILSTONE_WALL = registerBlock("cut_soul_soilstone_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_SOUL_SOILSTONE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block SMOOTH_SOUL_SOILSTONE_WALL = registerBlock("smooth_soul_soilstone_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.SMOOTH_SOUL_SOILSTONE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block CUT_SOUL_SOILSTONE_BRICK_WALL = registerBlock("cut_soul_soilstone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block COBBLED_SOUL_SOILSTONE_WALL = registerBlock("cobbled_soul_soilstone_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.COBBLED_SOUL_SOILSTONE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block POLISHED_SOUL_SOILSTONE_WALL = registerBlock("polished_soul_soilstone_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.POLISHED_SOUL_SOILSTONE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block SOUL_SOILSTONE_BRICK_WALL = registerBlock("soul_soilstone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.SOUL_SOILSTONE_BRICKS)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block CUT_QUARTZ_WALL = registerBlock("cut_quartz_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_QUARTZ)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block ICE_BRICK_WALL = registerBlock("ice_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.ICE_BRICKS)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block CUT_WHITE_CONCRETE_WALL = registerBlock("cut_white_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_WHITE_CONCRETE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block CUT_ORANGE_CONCRETE_WALL = registerBlock("cut_orange_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_ORANGE_CONCRETE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block CUT_MAGENTA_CONCRETE_WALL = registerBlock("cut_magenta_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_MAGENTA_CONCRETE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block CUT_LIGHT_BLUE_CONCRETE_WALL = registerBlock("cut_light_blue_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_LIGHT_BLUE_CONCRETE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block CUT_YELLOW_CONCRETE_WALL = registerBlock("cut_yellow_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_YELLOW_CONCRETE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block CUT_LIME_CONCRETE_WALL = registerBlock("cut_lime_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_LIME_CONCRETE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block CUT_PINK_CONCRETE_WALL = registerBlock("cut_pink_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_PINK_CONCRETE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block CUT_GRAY_CONCRETE_WALL = registerBlock("cut_gray_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_GRAY_CONCRETE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block CUT_LIGHT_GRAY_CONCRETE_WALL = registerBlock("cut_light_gray_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_LIGHT_GRAY_CONCRETE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block CUT_CYAN_CONCRETE_WALL = registerBlock("cut_cyan_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_CYAN_CONCRETE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block CUT_PURPLE_CONCRETE_WALL = registerBlock("cut_purple_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_PURPLE_CONCRETE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block CUT_BLUE_CONCRETE_WALL = registerBlock("cut_blue_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_BLUE_CONCRETE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block CUT_BROWN_CONCRETE_WALL = registerBlock("cut_brown_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_BROWN_CONCRETE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block CUT_GREEN_CONCRETE_WALL = registerBlock("cut_green_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_GREEN_CONCRETE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block CUT_RED_CONCRETE_WALL = registerBlock("cut_red_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_RED_CONCRETE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block CUT_BLACK_CONCRETE_WALL = registerBlock("cut_black_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_BLACK_CONCRETE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block CRYSTALLIZED_PRISMARINE_WALL = registerBlock("crystallized_prismarine_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.CRYSTALLIZED_PRISMARINE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block CRYSTALLIZED_PRISMARINE_BRICK_WALL = registerBlock("crystallized_prismarine_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block LIGHT_PRISMARINE_WALL = registerBlock("light_prismarine_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.LIGHT_PRISMARINE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block CUT_RED_SANDSTONE_BRICK_WALL = registerBlock("cut_red_sandstone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_RED_SANDSTONE_BRICKS)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block COBBLED_RED_SANDSTONE_WALL = registerBlock("cobbled_red_sandstone_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.COBBLED_RED_SANDSTONE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block POLISHED_RED_SANDSTONE_WALL = registerBlock("polished_red_sandstone_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.POLISHED_RED_SANDSTONE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block RED_SANDSTONE_BRICK_WALL = registerBlock("red_sandstone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.RED_SANDSTONE_BRICKS)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block MAGMA_BRICK_WALL = registerBlock("magma_brick_wall",
            new MagmaBrickWallBlock(FabricBlockSettings.copyOf(DecoBlocks.MAGMA_BRICKS)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block BUBBLE_WALL = registerBlock("bubble_wall",
            new BubbleWallBlock(FabricBlockSettings.copyOf(DecoBlocks.BUBBLE_BLOCK)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block BUBBLE_BRICK_WALL = registerBlock("bubble_brick_wall",
            new BubbleWallBlock(FabricBlockSettings.copyOf(DecoBlocks.BUBBLE_BRICKS)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block BLUE_NETHER_BRICK_WALL = registerBlock("blue_nether_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.BLUE_NETHER_BRICKS)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block POLISHED_BLACKSTONE_TILE_WALL = registerBlock("polished_blackstone_tile_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.POLISHED_BLACKSTONE_TILES)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block CLOUD_WALL = registerBlock("cloud_wall",
            new TransparentWallBlock(FabricBlockSettings.copyOf(DecoBlocks.SOLID_CLOUD)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block CLOUD_BRICK_WALL = registerBlock("cloud_brick_wall",
            new TransparentWallBlock(FabricBlockSettings.copyOf(DecoBlocks.CLOUD_BRICKS)), DecoItemGroup.VARAN_DECO_DECORATION);

    public static final Block RED_SUNFLOWER = registerBlock("red_sunflower",
            new TallFlowerBlock(FabricBlockSettings.copyOf(Blocks.SUNFLOWER)),
            DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block NOVA_STARFLOWER = registerBlock("nova_starflower",
            new NovaStarflowerBlock(FabricBlockSettings.copyOf(Blocks.SUNFLOWER)),
            DecoItemGroup.VARAN_DECO_DECORATION);

    public static final Block WITHER_ROSE_BUSH = registerBlock("wither_rose_bush",
            new WitherRoseBushBlock(FabricBlockSettings.copyOf(Blocks.ROSE_BUSH)),
            DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block ENDER_ROSE_BUSH = registerBlock("ender_rose_bush",
            new EnderRoseBushBlock(FabricBlockSettings.copyOf(Blocks.ROSE_BUSH)),
            DecoItemGroup.VARAN_DECO_DECORATION);

    public static final Block TINTED_GLASS_PANE = registerBlock("tinted_glass_pane",
            new TintedGlassPaneBlock(FabricBlockSettings.copyOf(Blocks.BLACK_STAINED_GLASS_PANE).nonOpaque()), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block HARDENED_GLASS_PANE = registerBlock("hardened_glass_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.GLASS_PANE).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block HARDENED_TINTED_GLASS_PANE = registerBlock("hardened_tinted_glass_pane",
            new PaneBlock(FabricBlockSettings.copyOf(DecoBlocks.TINTED_GLASS_PANE).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block HARDENED_WHITE_STAINED_GLASS_PANE = registerBlock("hardened_white_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.WHITE,FabricBlockSettings.copyOf(Blocks.WHITE_STAINED_GLASS_PANE).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block HARDENED_ORANGE_STAINED_GLASS_PANE = registerBlock("hardened_orange_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.ORANGE,FabricBlockSettings.copyOf(Blocks.ORANGE_STAINED_GLASS_PANE).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block HARDENED_MAGENTA_STAINED_GLASS_PANE = registerBlock("hardened_magenta_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.MAGENTA,FabricBlockSettings.copyOf(Blocks.MAGENTA_STAINED_GLASS_PANE).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block HARDENED_LIGHT_BLUE_STAINED_GLASS_PANE = registerBlock("hardened_light_blue_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.LIGHT_BLUE, FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_STAINED_GLASS_PANE).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block HARDENED_YELLOW_STAINED_GLASS_PANE = registerBlock("hardened_yellow_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.YELLOW, FabricBlockSettings.copyOf(Blocks.YELLOW_STAINED_GLASS_PANE).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block HARDENED_LIME_STAINED_GLASS_PANE = registerBlock("hardened_lime_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.LIME, FabricBlockSettings.copyOf(Blocks.LIME_STAINED_GLASS_PANE).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block HARDENED_PINK_STAINED_GLASS_PANE = registerBlock("hardened_pink_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.PINK, FabricBlockSettings.copyOf(Blocks.PINK_STAINED_GLASS_PANE).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block HARDENED_GRAY_STAINED_GLASS_PANE = registerBlock("hardened_gray_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.GRAY, FabricBlockSettings.copyOf(Blocks.GRAY_STAINED_GLASS_PANE).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block HARDENED_LIGHT_GRAY_STAINED_GLASS_PANE = registerBlock("hardened_light_gray_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.LIGHT_GRAY, FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_STAINED_GLASS_PANE).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block HARDENED_CYAN_STAINED_GLASS_PANE = registerBlock("hardened_cyan_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.CYAN, FabricBlockSettings.copyOf(Blocks.CYAN_STAINED_GLASS_PANE).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block HARDENED_PURPLE_STAINED_GLASS_PANE = registerBlock("hardened_purple_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.PURPLE, FabricBlockSettings.copyOf(Blocks.PURPLE_STAINED_GLASS_PANE).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block HARDENED_BLUE_STAINED_GLASS_PANE = registerBlock("hardened_blue_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.BLUE, FabricBlockSettings.copyOf(Blocks.BLUE_STAINED_GLASS_PANE).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block HARDENED_BROWN_STAINED_GLASS_PANE = registerBlock("hardened_brown_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.BROWN, FabricBlockSettings.copyOf(Blocks.BROWN_STAINED_GLASS_PANE).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block HARDENED_GREEN_STAINED_GLASS_PANE = registerBlock("hardened_green_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.GREEN, FabricBlockSettings.copyOf(Blocks.GREEN_STAINED_GLASS_PANE).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block HARDENED_RED_STAINED_GLASS_PANE = registerBlock("hardened_red_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.RED, FabricBlockSettings.copyOf(Blocks.RED_STAINED_GLASS_PANE).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block HARDENED_BLACK_STAINED_GLASS_PANE = registerBlock("hardened_black_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.BLACK, FabricBlockSettings.copyOf(Blocks.BLACK_STAINED_GLASS_PANE).strength(25.0F,100.0f)
                    .nonOpaque().requiresTool()), DecoItemGroup.VARAN_DECO_DECORATION);

    public static final Block OAK_BARREL = registerBlock("oak_barrel",
            new NonStationBarrelBlock(FabricBlockSettings.copyOf(Blocks.BARREL).mapColor(MapColor.OAK_TAN)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block SPRUCE_BARREL = registerBlock("spruce_barrel",
            new NonStationBarrelBlock(FabricBlockSettings.copyOf(Blocks.BARREL)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block BIRCH_BARREL = registerBlock("birch_barrel",
            new NonStationBarrelBlock(FabricBlockSettings.copyOf(Blocks.BARREL).mapColor(MapColor.PALE_YELLOW)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block JUNGLE_BARREL = registerBlock("jungle_barrel",
            new NonStationBarrelBlock(FabricBlockSettings.copyOf(Blocks.BARREL).mapColor(MapColor.DIRT_BROWN)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block ACACIA_BARREL = registerBlock("acacia_barrel",
            new NonStationBarrelBlock(FabricBlockSettings.copyOf(Blocks.BARREL).mapColor(MapColor.ORANGE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block DARK_OAK_BARREL = registerBlock("dark_oak_barrel",
            new NonStationBarrelBlock(FabricBlockSettings.copyOf(Blocks.BARREL).mapColor(MapColor.BROWN)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block MANGROVE_BARREL = registerBlock("mangrove_barrel",
            new NonStationBarrelBlock(FabricBlockSettings.copyOf(Blocks.BARREL).mapColor(MapColor.RED)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block CRIMSON_BARREL = registerBlock("crimson_barrel",
            new NonStationBarrelBlock(FabricBlockSettings.copyOf(Blocks.BARREL).mapColor(MapColor.DULL_PINK)
                    .sounds(BlockSoundGroup.NETHER_STEM)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block WARPED_BARREL = registerBlock("warped_barrel",
            new NonStationBarrelBlock(FabricBlockSettings.copyOf(Blocks.BARREL).mapColor(MapColor.DARK_AQUA)
                    .sounds(BlockSoundGroup.NETHER_STEM)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block CACTUS_BARREL = registerBlock("cactus_barrel",
            new NonStationBarrelBlock(FabricBlockSettings.copyOf(Blocks.BARREL).mapColor(MapColor.PALE_GREEN)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block MUSHROOM_BARREL = registerBlock("mushroom_barrel",
            new NonStationBarrelBlock(FabricBlockSettings.copyOf(Blocks.BARREL).mapColor(MapColor.RAW_IRON_PINK)), DecoItemGroup.VARAN_DECO_DECORATION);

    public static final Block DEEPSLATE_SMOKER = registerBlock("deepslate_smoker",
            new DeepslateSmokerBlock(FabricBlockSettings.copyOf(Blocks.SMOKER).mapColor(MapColor.DEEPSLATE_GRAY)
                    .strength(4.5f).sounds(BlockSoundGroup.DEEPSLATE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block BLACKSTONE_SMOKER = registerBlock("blackstone_smoker",
            new BlackstoneSmokerBlock(FabricBlockSettings.copyOf(Blocks.SMOKER).mapColor(MapColor.BLACK)
                    .strength(3.0f)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block END_STONE_SMOKER = registerBlock("end_stone_smoker",
            new EndstoneSmokerBlock(FabricBlockSettings.copyOf(Blocks.SMOKER).mapColor(MapColor.PALE_YELLOW)
                    .strength(4.5f)), DecoItemGroup.VARAN_DECO_DECORATION);

    public static final Block DEEPSLATE_BLAST_FURNACE = registerBlock("deepslate_blast_furnace",
            new DeepslateBlastFurnaceBlock(FabricBlockSettings.copyOf(Blocks.BLAST_FURNACE).mapColor(MapColor.DEEPSLATE_GRAY)
                    .strength(4.5f).sounds(BlockSoundGroup.DEEPSLATE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block BLACKSTONE_BLAST_FURNACE = registerBlock("blackstone_blast_furnace",
            new BlackstoneBlastFurnaceBlock(FabricBlockSettings.copyOf(Blocks.BLAST_FURNACE).mapColor(MapColor.BLACK)
                    .strength(3.0f)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block END_STONE_BLAST_FURNACE = registerBlock("end_stone_blast_furnace",
            new EndstoneBlastFurnaceBlock(FabricBlockSettings.copyOf(Blocks.BLAST_FURNACE).mapColor(MapColor.PALE_YELLOW)
                    .strength(4.5f)), DecoItemGroup.VARAN_DECO_DECORATION);

    public static final Block OAK_CARTOGRAPHY_TABLE = registerBlock("oak_cartography_table",
            new OakCartographyTableBlock(FabricBlockSettings.copyOf(Blocks.CARTOGRAPHY_TABLE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block BIRCH_CARTOGRAPHY_TABLE = registerBlock("birch_cartography_table",
            new BirchCartographyTableBlock(FabricBlockSettings.copyOf(Blocks.CARTOGRAPHY_TABLE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block SPRUCE_CARTOGRAPHY_TABLE = registerBlock("spruce_cartography_table",
            new SpruceCartographyTableBlock(FabricBlockSettings.copyOf(Blocks.CARTOGRAPHY_TABLE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block JUNGLE_CARTOGRAPHY_TABLE = registerBlock("jungle_cartography_table",
            new JungleCartographyTableBlock(FabricBlockSettings.copyOf(Blocks.CARTOGRAPHY_TABLE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block ACACIA_CARTOGRAPHY_TABLE = registerBlock("acacia_cartography_table",
            new AcaciaCartographyTableBlock(FabricBlockSettings.copyOf(Blocks.CARTOGRAPHY_TABLE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block DARK_OAK_CARTOGRAPHY_TABLE = registerBlock("dark_oak_cartography_table",
            new DarkOakCartographyTableBlock(FabricBlockSettings.copyOf(Blocks.CARTOGRAPHY_TABLE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block MANGROVE_CARTOGRAPHY_TABLE = registerBlock("mangrove_cartography_table",
            new MangroveCartographyTableBlock(FabricBlockSettings.copyOf(Blocks.CARTOGRAPHY_TABLE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block CRIMSON_CARTOGRAPHY_TABLE = registerBlock("crimson_cartography_table",
            new CrimsonCartographyTableBlock(FabricBlockSettings.copyOf(Blocks.CARTOGRAPHY_TABLE)
                    .sounds(BlockSoundGroup.NETHER_STEM)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block WARPED_CARTOGRAPHY_TABLE = registerBlock("warped_cartography_table",
            new WarpedCartographyTableBlock(FabricBlockSettings.copyOf(Blocks.CARTOGRAPHY_TABLE)
                    .sounds(BlockSoundGroup.NETHER_STEM)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block CACTUS_CARTOGRAPHY_TABLE = registerBlock("cactus_cartography_table",
            new CactusCartographyTableBlock(FabricBlockSettings.copyOf(Blocks.CARTOGRAPHY_TABLE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block MUSHROOM_CARTOGRAPHY_TABLE = registerBlock("mushroom_cartography_table",
            new MushroomCartographyTableBlock(FabricBlockSettings.copyOf(Blocks.CARTOGRAPHY_TABLE)), DecoItemGroup.VARAN_DECO_DECORATION);

    public static final Block DEEPSLATE_GRINDSTONE = registerBlock("deepslate_grindstone",
            new DeepslateGrindstoneBlock(FabricBlockSettings.copyOf(Blocks.GRINDSTONE).sounds(BlockSoundGroup.DEEPSLATE)
                    .mapColor(MapColor.DEEPSLATE_GRAY)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block BLACKSTONE_GRINDSTONE = registerBlock("blackstone_grindstone",
            new BlackstoneGrindstoneBlock(FabricBlockSettings.copyOf(Blocks.GRINDSTONE).mapColor(MapColor.BLACK)),
                DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block END_STONE_GRINDSTONE = registerBlock("end_stone_grindstone",
            new EndstoneGrindstoneBlock(FabricBlockSettings.copyOf(Blocks.GRINDSTONE).mapColor(MapColor.PALE_YELLOW)),
                DecoItemGroup.VARAN_DECO_DECORATION);

    public static final Block OAK_SMITHING_TABLE = registerBlock("oak_smithing_table",
            new OakSmithingTableBlock(FabricBlockSettings.copyOf(Blocks.SMITHING_TABLE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block SPRUCE_SMITHING_TABLE = registerBlock("spruce_smithing_table",
            new SpruceSmithingTableBlock(FabricBlockSettings.copyOf(Blocks.SMITHING_TABLE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block BIRCH_SMITHING_TABLE = registerBlock("birch_smithing_table",
            new BirchSmithingTableBlock(FabricBlockSettings.copyOf(Blocks.SMITHING_TABLE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block JUNGLE_SMITHING_TABLE = registerBlock("jungle_smithing_table",
            new JungleSmithingTableBlock(FabricBlockSettings.copyOf(Blocks.SMITHING_TABLE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block ACACIA_SMITHING_TABLE = registerBlock("acacia_smithing_table",
            new AcaciaSmithingTableBlock(FabricBlockSettings.copyOf(Blocks.SMITHING_TABLE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block DARK_OAK_SMITHING_TABLE = registerBlock("dark_oak_smithing_table",
            new DarkOakSmithingTableBlock(FabricBlockSettings.copyOf(Blocks.SMITHING_TABLE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block MANGROVE_SMITHING_TABLE = registerBlock("mangrove_smithing_table",
            new MangroveSmithingTableBlock(FabricBlockSettings.copyOf(Blocks.SMITHING_TABLE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block CRIMSON_SMITHING_TABLE = registerBlock("crimson_smithing_table",
            new CrimsonSmithingTableBlock(FabricBlockSettings.copyOf(Blocks.SMITHING_TABLE)
                    .sounds(BlockSoundGroup.NETHER_STEM)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block WARPED_SMITHING_TABLE = registerBlock("warped_smithing_table",
            new WarpedSmithingTableBlock(FabricBlockSettings.copyOf(Blocks.SMITHING_TABLE)
                    .sounds(BlockSoundGroup.NETHER_STEM)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block CACTUS_SMITHING_TABLE = registerBlock("cactus_smithing_table",
            new CactusSmithingTableBlock(FabricBlockSettings.copyOf(Blocks.SMITHING_TABLE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block MUSHROOM_SMITHING_TABLE = registerBlock("mushroom_smithing_table",
            new MushroomSmithingTableBlock(FabricBlockSettings.copyOf(Blocks.SMITHING_TABLE)), DecoItemGroup.VARAN_DECO_DECORATION);

    public static final Block DEEPSLATE_STONECUTTER = registerBlock("deepslate_stonecutter",
            new DeepslateStonecutterBlock(FabricBlockSettings.copyOf(Blocks.STONECUTTER).mapColor(MapColor.DEEPSLATE_GRAY)
                    .strength(4.5f).sounds(BlockSoundGroup.DEEPSLATE)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block BLACKSTONE_STONECUTTER = registerBlock("blackstone_stonecutter",
            new BlackstoneStonecutterBlock(FabricBlockSettings.copyOf(Blocks.STONECUTTER).mapColor(MapColor.BLACK)
                    .strength(3.0f)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block END_STONE_STONECUTTER = registerBlock("end_stone_stonecutter",
            new EndstoneStonecutterBlock(FabricBlockSettings.copyOf(Blocks.STONECUTTER).mapColor(MapColor.PALE_YELLOW)
                    .strength(4.5f)), DecoItemGroup.VARAN_DECO_DECORATION);

    public static final Block COPPER_LANTERN = registerBlock("copper_lantern",
            new OxidizableLanternBlock(Oxidizable.OxidationLevel.UNAFFECTED,FabricBlockSettings.copyOf(Blocks.LANTERN)
                    .sounds(BlockSoundGroup.COPPER)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block EXPOSED_COPPER_LANTERN = registerBlock("exposed_copper_lantern",
            new OxidizableLanternBlock(Oxidizable.OxidationLevel.EXPOSED,FabricBlockSettings.copyOf(Blocks.LANTERN)
                    .sounds(BlockSoundGroup.COPPER)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block WEATHERED_COPPER_LANTERN = registerBlock("weathered_copper_lantern",
            new OxidizableLanternBlock(Oxidizable.OxidationLevel.WEATHERED,FabricBlockSettings.copyOf(Blocks.LANTERN)
                    .sounds(BlockSoundGroup.COPPER)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block OXIDIZED_COPPER_LANTERN = registerBlock("oxidized_copper_lantern",
            new OxidizableLanternBlock(Oxidizable.OxidationLevel.OXIDIZED,FabricBlockSettings.copyOf(Blocks.LANTERN)
                    .sounds(BlockSoundGroup.COPPER)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block WAXED_COPPER_LANTERN = registerBlock("waxed_copper_lantern",
            new LanternBlock(FabricBlockSettings.copyOf(DecoBlocks.COPPER_LANTERN)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block WAXED_EXPOSED_COPPER_LANTERN = registerBlock("waxed_exposed_copper_lantern",
            new LanternBlock(FabricBlockSettings.copyOf(DecoBlocks.EXPOSED_COPPER_LANTERN)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block WAXED_WEATHERED_COPPER_LANTERN = registerBlock("waxed_weathered_copper_lantern",
            new LanternBlock(FabricBlockSettings.copyOf(DecoBlocks.WEATHERED_COPPER_LANTERN)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block WAXED_OXIDIZED_COPPER_LANTERN = registerBlock("waxed_oxidized_copper_lantern",
            new LanternBlock(FabricBlockSettings.copyOf(DecoBlocks.OXIDIZED_COPPER_LANTERN)), DecoItemGroup.VARAN_DECO_DECORATION);

    public static final Block COPPER_SOUL_LANTERN = registerBlock("copper_soul_lantern",
            new OxidizableLanternBlock(Oxidizable.OxidationLevel.UNAFFECTED,FabricBlockSettings.copyOf(Blocks.SOUL_LANTERN)
                    .sounds(BlockSoundGroup.COPPER)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block EXPOSED_COPPER_SOUL_LANTERN = registerBlock("exposed_copper_soul_lantern",
            new OxidizableLanternBlock(Oxidizable.OxidationLevel.EXPOSED,FabricBlockSettings.copyOf(Blocks.SOUL_LANTERN)
                    .sounds(BlockSoundGroup.COPPER)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block WEATHERED_COPPER_SOUL_LANTERN = registerBlock("weathered_copper_soul_lantern",
            new OxidizableLanternBlock(Oxidizable.OxidationLevel.WEATHERED,FabricBlockSettings.copyOf(Blocks.SOUL_LANTERN)
                    .sounds(BlockSoundGroup.COPPER)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block OXIDIZED_COPPER_SOUL_LANTERN = registerBlock("oxidized_copper_soul_lantern",
            new OxidizableLanternBlock(Oxidizable.OxidationLevel.OXIDIZED,FabricBlockSettings.copyOf(Blocks.SOUL_LANTERN)
                    .sounds(BlockSoundGroup.COPPER)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block WAXED_COPPER_SOUL_LANTERN = registerBlock("waxed_copper_soul_lantern",
            new LanternBlock(FabricBlockSettings.copyOf(DecoBlocks.COPPER_SOUL_LANTERN)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block WAXED_EXPOSED_COPPER_SOUL_LANTERN = registerBlock("waxed_exposed_copper_soul_lantern",
            new LanternBlock(FabricBlockSettings.copyOf(DecoBlocks.EXPOSED_COPPER_SOUL_LANTERN)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block WAXED_WEATHERED_COPPER_SOUL_LANTERN = registerBlock("waxed_weathered_copper_soul_lantern",
            new LanternBlock(FabricBlockSettings.copyOf(DecoBlocks.WEATHERED_COPPER_SOUL_LANTERN)), DecoItemGroup.VARAN_DECO_DECORATION);
    public static final Block WAXED_OXIDIZED_COPPER_SOUL_LANTERN = registerBlock("waxed_oxidized_copper_soul_lantern",
            new LanternBlock(FabricBlockSettings.copyOf(DecoBlocks.OXIDIZED_COPPER_SOUL_LANTERN)), DecoItemGroup.VARAN_DECO_DECORATION);

    public static final Block BUBBLE_ELEVATOR_BLOCK_BUBBLE = registerBlock("bubble_elevator_block_bubble",
            new BubbleElevatorBubbleBlock(FabricBlockSettings.copyOf(Blocks.WAXED_COPPER_BLOCK).resistance(25.0f)
                    .mapColor(MapColor.BLUE).postProcess(DecoBlocks::always).ticksRandomly()
                    .emissiveLighting(DecoBlocks::always).luminance(state -> 3)), DecoItemGroup.VARAN_DECO_REDSTONE);

    public static final Block BUBBLE_ELEVATOR_BLOCK_MAGMA = registerBlockWithoutItem("bubble_elevator_block_magma",
            new BubbleElevatorMagmaBlock(FabricBlockSettings.copyOf(Blocks.WAXED_COPPER_BLOCK).resistance(25.0f)
                    .mapColor(MapColor.DARK_RED).postProcess(DecoBlocks::always).ticksRandomly()
                    .emissiveLighting(DecoBlocks::always).luminance(state -> 3)));

    public static final Block STONE_LEVER = registerBlock("stone_lever",
            new LeverBlock(FabricBlockSettings.copyOf(Blocks.LEVER)), DecoItemGroup.VARAN_DECO_REDSTONE);
    public static final Block DEEPSLATE_LEVER = registerBlock("deepslate_lever",
            new LeverBlock(FabricBlockSettings.copyOf(Blocks.LEVER).sounds(BlockSoundGroup.DEEPSLATE)),
            DecoItemGroup.VARAN_DECO_REDSTONE);
    public static final Block COBBLED_DEEPSLATE_LEVER = registerBlock("cobbled_deepslate_lever",
            new LeverBlock(FabricBlockSettings.copyOf(Blocks.LEVER).sounds(BlockSoundGroup.DEEPSLATE)),
            DecoItemGroup.VARAN_DECO_REDSTONE);
    public static final Block POLISHED_DEEPSLATE_LEVER = registerBlock("polished_deepslate_lever",
            new LeverBlock(FabricBlockSettings.copyOf(Blocks.LEVER).sounds(BlockSoundGroup.POLISHED_DEEPSLATE)),
            DecoItemGroup.VARAN_DECO_REDSTONE);
    public static final Block END_STONE_LEVER = registerBlock("end_stone_lever",
            new LeverBlock(FabricBlockSettings.copyOf(Blocks.LEVER)), DecoItemGroup.VARAN_DECO_REDSTONE);
    public static final Block BLACKSTONE_LEVER = registerBlock("blackstone_lever",
            new LeverBlock(FabricBlockSettings.copyOf(Blocks.LEVER)), DecoItemGroup.VARAN_DECO_REDSTONE);
    public static final Block POLISHED_BLACKSTONE_LEVER = registerBlock("polished_blackstone_lever",
            new LeverBlock(FabricBlockSettings.copyOf(Blocks.LEVER)), DecoItemGroup.VARAN_DECO_REDSTONE);
    public static final Block POLISHED_STONE_LEVER = registerBlock("polished_stone_lever",
            new LeverBlock(FabricBlockSettings.copyOf(Blocks.LEVER)), DecoItemGroup.VARAN_DECO_REDSTONE);
    public static final Block POLISHED_END_STONE_LEVER = registerBlock("polished_end_stone_lever",
            new LeverBlock(FabricBlockSettings.copyOf(Blocks.LEVER)), DecoItemGroup.VARAN_DECO_REDSTONE);

    public static final Block OAK_NOTE_BLOCK = registerBlock("oak_note_block",
            new NoteBlock(FabricBlockSettings.copyOf(Blocks.NOTE_BLOCK).mapColor(MapColor.OAK_TAN)), DecoItemGroup.VARAN_DECO_REDSTONE);
    public static final Block SPRUCE_NOTE_BLOCK = registerBlock("spruce_note_block",
            new NoteBlock(FabricBlockSettings.copyOf(Blocks.NOTE_BLOCK).mapColor(MapColor.SPRUCE_BROWN)), DecoItemGroup.VARAN_DECO_REDSTONE);
    public static final Block BIRCH_NOTE_BLOCK = registerBlock("birch_note_block",
            new NoteBlock(FabricBlockSettings.copyOf(Blocks.NOTE_BLOCK).mapColor(MapColor.PALE_YELLOW)), DecoItemGroup.VARAN_DECO_REDSTONE);
    public static final Block JUNGLE_NOTE_BLOCK = registerBlock("jungle_note_block",
            new NoteBlock(FabricBlockSettings.copyOf(Blocks.NOTE_BLOCK).mapColor(MapColor.DIRT_BROWN)), DecoItemGroup.VARAN_DECO_REDSTONE);
    public static final Block ACACIA_NOTE_BLOCK = registerBlock("acacia_note_block",
            new NoteBlock(FabricBlockSettings.copyOf(Blocks.NOTE_BLOCK).mapColor(MapColor.ORANGE)), DecoItemGroup.VARAN_DECO_REDSTONE);
    public static final Block DARK_OAK_NOTE_BLOCK = registerBlock("dark_oak_note_block",
            new NoteBlock(FabricBlockSettings.copyOf(Blocks.NOTE_BLOCK).mapColor(MapColor.BROWN)), DecoItemGroup.VARAN_DECO_REDSTONE);
    public static final Block MANGROVE_NOTE_BLOCK = registerBlock("mangrove_note_block",
            new NoteBlock(FabricBlockSettings.copyOf(Blocks.NOTE_BLOCK).mapColor(MapColor.RED)), DecoItemGroup.VARAN_DECO_REDSTONE);
    public static final Block CRIMSON_NOTE_BLOCK = registerBlock("crimson_note_block",
            new NoteBlock(FabricBlockSettings.copyOf(Blocks.NOTE_BLOCK).mapColor(MapColor.DULL_PINK).sounds(BlockSoundGroup.NETHER_STEM)),
            DecoItemGroup.VARAN_DECO_REDSTONE);
    public static final Block WARPED_NOTE_BLOCK = registerBlock("warped_note_block",
            new NoteBlock(FabricBlockSettings.copyOf(Blocks.NOTE_BLOCK).mapColor(MapColor.DARK_AQUA).sounds(BlockSoundGroup.NETHER_STEM)),
            DecoItemGroup.VARAN_DECO_REDSTONE);
    public static final Block CACTUS_NOTE_BLOCK = registerBlock("cactus_note_block",
            new NoteBlock(FabricBlockSettings.copyOf(Blocks.NOTE_BLOCK).mapColor(MapColor.PALE_GREEN)), DecoItemGroup.VARAN_DECO_REDSTONE);
    public static final Block MUSHROOM_NOTE_BLOCK = registerBlock("mushroom_note_block",
            new NoteBlock(FabricBlockSettings.copyOf(Blocks.NOTE_BLOCK).mapColor(MapColor.RAW_IRON_PINK)), DecoItemGroup.VARAN_DECO_REDSTONE);

    public static final Block DEEPSLATE_BUTTON = registerBlock("deepslate_button",
            new StoneButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON).sounds(BlockSoundGroup.DEEPSLATE)),
            DecoItemGroup.VARAN_DECO_REDSTONE);
    public static final Block COBBLED_DEEPSLATE_BUTTON = registerBlock("cobbled_deepslate_button",
            new StoneButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON).sounds(BlockSoundGroup.DEEPSLATE)),
            DecoItemGroup.VARAN_DECO_REDSTONE);
    public static final Block POLISHED_DEEPSLATE_BUTTON = registerBlock("polished_deepslate_button",
            new StoneButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON).sounds(BlockSoundGroup.POLISHED_DEEPSLATE)),
            DecoItemGroup.VARAN_DECO_REDSTONE);
    public static final Block COBBLESTONE_BUTTON = registerBlock("cobblestone_button",
            new StoneButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON)), DecoItemGroup.VARAN_DECO_REDSTONE);
    public static final Block END_STONE_BUTTON = registerBlock("end_stone_button",
            new StoneButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON)), DecoItemGroup.VARAN_DECO_REDSTONE);
    public static final Block BLACKSTONE_BUTTON = registerBlock("blackstone_button",
            new StoneButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON)), DecoItemGroup.VARAN_DECO_REDSTONE);
    public static final Block POLISHED_STONE_BUTTON = registerBlock("polished_stone_button",
            new StoneButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON)), DecoItemGroup.VARAN_DECO_REDSTONE);
    public static final Block POLISHED_END_STONE_BUTTON = registerBlock("polished_end_stone_button",
            new StoneButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON)), DecoItemGroup.VARAN_DECO_REDSTONE);
    public static final Block CACTUS_PLANK_BUTTON = registerBlock("cactus_plank_button",
            new WoodenButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON)), DecoItemGroup.VARAN_DECO_REDSTONE);
    public static final Block MUSHROOM_BUTTON = registerBlock("mushroom_button",
            new WoodenButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON)), DecoItemGroup.VARAN_DECO_REDSTONE);
    public static final Block WOODEN_BUTTON = registerBlock("wooden_button",
            new WoodenButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON)), DecoItemGroup.VARAN_DECO_REDSTONE);

    public static final Block DEEPSLATE_PRESSURE_PLATE = registerBlock("deepslate_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.MOBS, FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE)
                    .mapColor(MapColor.DEEPSLATE_GRAY).sounds(BlockSoundGroup.DEEPSLATE)), DecoItemGroup.VARAN_DECO_REDSTONE);
    public static final Block COBBLED_DEEPSLATE_PRESSURE_PLATE = registerBlock("cobbled_deepslate_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.MOBS, FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE)
                    .mapColor(MapColor.DEEPSLATE_GRAY).sounds(BlockSoundGroup.DEEPSLATE)), DecoItemGroup.VARAN_DECO_REDSTONE);
    public static final Block POLISHED_DEEPSLATE_PRESSURE_PLATE = registerBlock("polished_deepslate_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.MOBS, FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE)
                    .mapColor(MapColor.DEEPSLATE_GRAY).sounds(BlockSoundGroup.POLISHED_DEEPSLATE)), DecoItemGroup.VARAN_DECO_REDSTONE);
    public static final Block COBBLESTONE_PRESSURE_PLATE = registerBlock("cobblestone_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.MOBS, FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE)),
            DecoItemGroup.VARAN_DECO_REDSTONE);
    public static final Block BLACKSTONE_PRESSURE_PLATE = registerBlock("blackstone_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.MOBS, FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE)
                    .mapColor(MapColor.BLACK)), DecoItemGroup.VARAN_DECO_REDSTONE);
    public static final Block END_STONE_PRESSURE_PLATE = registerBlock("end_stone_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.MOBS, FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE)
                    .mapColor(MapColor.PALE_YELLOW)), DecoItemGroup.VARAN_DECO_REDSTONE);
    public static final Block POLISHED_STONE_PRESSURE_PLATE = registerBlock("polished_stone_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.MOBS, FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE)
                    .mapColor(MapColor.BLACK)), DecoItemGroup.VARAN_DECO_REDSTONE);
    public static final Block POLISHED_END_STONE_PRESSURE_PLATE = registerBlock("polished_end_stone_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.MOBS, FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE)
                    .mapColor(MapColor.PALE_YELLOW)), DecoItemGroup.VARAN_DECO_REDSTONE);

    public static final Block COPPER_WEIGHT_PRESSURE_PLATE = registerBlock("copper_weight_pressure_plate",
            new OxidizablePressurePlateBlock(Oxidizable.OxidationLevel.UNAFFECTED,20,FabricBlockSettings.copyOf(Blocks.LIGHT_WEIGHTED_PRESSURE_PLATE)
                    .sounds(BlockSoundGroup.COPPER)), DecoItemGroup.VARAN_DECO_REDSTONE);
    public static final Block EXPOSED_COPPER_WEIGHT_PRESSURE_PLATE = registerBlock("exposed_copper_weight_pressure_plate",
            new OxidizablePressurePlateBlock(Oxidizable.OxidationLevel.EXPOSED,50,FabricBlockSettings.copyOf(Blocks.LIGHT_WEIGHTED_PRESSURE_PLATE)
                    .sounds(BlockSoundGroup.COPPER)), DecoItemGroup.VARAN_DECO_REDSTONE);
    public static final Block WEATHERED_COPPER_WEIGHT_PRESSURE_PLATE = registerBlock("weathered_copper_weight_pressure_plate",
            new OxidizablePressurePlateBlock(Oxidizable.OxidationLevel.WEATHERED,70,FabricBlockSettings.copyOf(Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE)
                    .sounds(BlockSoundGroup.COPPER)), DecoItemGroup.VARAN_DECO_REDSTONE);
    public static final Block OXIDIZED_COPPER_WEIGHT_PRESSURE_PLATE = registerBlock("oxidized_copper_weight_pressure_plate",
            new OxidizablePressurePlateBlock(Oxidizable.OxidationLevel.OXIDIZED,100,FabricBlockSettings.copyOf(Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE)
                    .sounds(BlockSoundGroup.COPPER)), DecoItemGroup.VARAN_DECO_REDSTONE);
    public static final Block WAXED_COPPER_WEIGHT_PRESSURE_PLATE = registerBlock("waxed_copper_weight_pressure_plate",
            new WeightedPressurePlateBlock(20,FabricBlockSettings.copyOf(DecoBlocks.COPPER_WEIGHT_PRESSURE_PLATE)), DecoItemGroup.VARAN_DECO_REDSTONE);
    public static final Block WAXED_EXPOSED_COPPER_WEIGHT_PRESSURE_PLATE = registerBlock("waxed_exposed_copper_weight_pressure_plate",
            new WeightedPressurePlateBlock(50,FabricBlockSettings.copyOf(DecoBlocks.EXPOSED_COPPER_WEIGHT_PRESSURE_PLATE)), DecoItemGroup.VARAN_DECO_REDSTONE);
    public static final Block WAXED_WEATHERED_COPPER_WEIGHT_PRESSURE_PLATE = registerBlock("waxed_weathered_copper_weight_pressure_plate",
            new WeightedPressurePlateBlock(70,FabricBlockSettings.copyOf(DecoBlocks.WEATHERED_COPPER_WEIGHT_PRESSURE_PLATE)), DecoItemGroup.VARAN_DECO_REDSTONE);
    public static final Block WAXED_OXIDIZED_COPPER_WEIGHT_PRESSURE_PLATE = registerBlock("waxed_oxidized_copper_weight_pressure_plate",
            new WeightedPressurePlateBlock(100,FabricBlockSettings.copyOf(DecoBlocks.OXIDIZED_COPPER_WEIGHT_PRESSURE_PLATE)), DecoItemGroup.VARAN_DECO_REDSTONE);

    public static final Block CACTUS_PLANK_PRESSURE_PLATE = registerBlock("cactus_plank_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE).mapColor(MapColor.PALE_GREEN)), DecoItemGroup.VARAN_DECO_REDSTONE);
    public static final Block MUSHROOM_PRESSURE_PLATE = registerBlock("mushroom_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE).mapColor(MapColor.PALE_YELLOW)), DecoItemGroup.VARAN_DECO_REDSTONE);
    public static final Block WOODEN_PRESSURE_PLATE = registerBlock("wooden_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE)), DecoItemGroup.VARAN_DECO_REDSTONE);

    public static final Block GOLD_DOOR = registerBlock("gold_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()), DecoItemGroup.VARAN_DECO_REDSTONE);
    public static final Block CACTUS_DOOR = registerBlock("cactus_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR).mapColor(MapColor.PALE_GREEN).nonOpaque()), DecoItemGroup.VARAN_DECO_REDSTONE);
    public static final Block MUSHROOM_DOOR = registerBlock("mushroom_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR).mapColor(MapColor.PALE_YELLOW).nonOpaque()), DecoItemGroup.VARAN_DECO_REDSTONE);
    public static final Block WOODEN_DOOR = registerBlock("wooden_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR).mapColor(MapColor.BROWN).nonOpaque()), DecoItemGroup.VARAN_DECO_REDSTONE);

    public static final Block OAK_PALLET_DOOR = registerBlock("oak_pallet_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR).nonOpaque()), DecoItemGroup.VARAN_DECO_REDSTONE);
    public static final Block SPRUCE_PALLET_DOOR = registerBlock("spruce_pallet_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_DOOR).nonOpaque()), DecoItemGroup.VARAN_DECO_REDSTONE);
    public static final Block BIRCH_PALLET_DOOR = registerBlock("birch_pallet_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.BIRCH_DOOR).nonOpaque()), DecoItemGroup.VARAN_DECO_REDSTONE);
    public static final Block JUNGLE_PALLET_DOOR = registerBlock("jungle_pallet_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_DOOR).nonOpaque()), DecoItemGroup.VARAN_DECO_REDSTONE);
    public static final Block ACACIA_PALLET_DOOR = registerBlock("acacia_pallet_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_DOOR).nonOpaque()), DecoItemGroup.VARAN_DECO_REDSTONE);
    public static final Block DARK_OAK_PALLET_DOOR = registerBlock("dark_oak_pallet_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.DARK_OAK_DOOR).nonOpaque()), DecoItemGroup.VARAN_DECO_REDSTONE);
    public static final Block MANGROVE_PALLET_DOOR = registerBlock("mangrove_pallet_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.MANGROVE_DOOR).nonOpaque()), DecoItemGroup.VARAN_DECO_REDSTONE);
    public static final Block CRIMSON_PALLET_DOOR = registerBlock("crimson_pallet_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_DOOR).nonOpaque()), DecoItemGroup.VARAN_DECO_REDSTONE);
    public static final Block WARPED_PALLET_DOOR = registerBlock("warped_pallet_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.MANGROVE_DOOR).nonOpaque()), DecoItemGroup.VARAN_DECO_REDSTONE);

    public static final Block CACTUS_PALLET_DOOR = registerBlock("cactus_pallet_door",
            new DoorBlock(FabricBlockSettings.copyOf(DecoBlocks.CACTUS_DOOR).nonOpaque()), DecoItemGroup.VARAN_DECO_REDSTONE);
    public static final Block MUSHROOM_PALLET_DOOR = registerBlock("mushroom_pallet_door",
            new DoorBlock(FabricBlockSettings.copyOf(DecoBlocks.MUSHROOM_DOOR).nonOpaque()), DecoItemGroup.VARAN_DECO_REDSTONE);
    public static final Block WOODEN_PALLET_DOOR = registerBlock("wooden_pallet_door",
            new DoorBlock(FabricBlockSettings.copyOf(DecoBlocks.WOODEN_DOOR).nonOpaque()), DecoItemGroup.VARAN_DECO_REDSTONE);

    public static final Block GOLD_TRAPDOOR = registerBlock("gold_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()), DecoItemGroup.VARAN_DECO_REDSTONE);
    public static final Block CACTUS_TRAPDOOR = registerBlock("cactus_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR).mapColor(MapColor.PALE_GREEN).nonOpaque()), DecoItemGroup.VARAN_DECO_REDSTONE);
    public static final Block MUSHROOM_TRAPDOOR = registerBlock("mushroom_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR).mapColor(MapColor.PALE_YELLOW).nonOpaque()), DecoItemGroup.VARAN_DECO_REDSTONE);
    public static final Block WOODEN_TRAPDOOR = registerBlock("wooden_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR).mapColor(MapColor.BROWN).nonOpaque()), DecoItemGroup.VARAN_DECO_REDSTONE);

    public static final Block OAK_PALLET_TRAPDOOR = registerBlock("oak_pallet_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR).nonOpaque()), DecoItemGroup.VARAN_DECO_REDSTONE);
    public static final Block SPRUCE_PALLET_TRAPDOOR = registerBlock("spruce_pallet_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_TRAPDOOR).nonOpaque()), DecoItemGroup.VARAN_DECO_REDSTONE);
    public static final Block BIRCH_PALLET_TRAPDOOR = registerBlock("birch_pallet_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.BIRCH_TRAPDOOR).nonOpaque()), DecoItemGroup.VARAN_DECO_REDSTONE);
    public static final Block JUNGLE_PALLET_TRAPDOOR = registerBlock("jungle_pallet_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_TRAPDOOR).nonOpaque()), DecoItemGroup.VARAN_DECO_REDSTONE);
    public static final Block ACACIA_PALLET_TRAPDOOR = registerBlock("acacia_pallet_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_TRAPDOOR).nonOpaque()), DecoItemGroup.VARAN_DECO_REDSTONE);
    public static final Block DARK_OAK_PALLET_TRAPDOOR = registerBlock("dark_oak_pallet_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.DARK_OAK_TRAPDOOR).nonOpaque()), DecoItemGroup.VARAN_DECO_REDSTONE);
    public static final Block MANGROVE_PALLET_TRAPDOOR = registerBlock("mangrove_pallet_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.MANGROVE_TRAPDOOR).nonOpaque()), DecoItemGroup.VARAN_DECO_REDSTONE);
    public static final Block CRIMSON_PALLET_TRAPDOOR = registerBlock("crimson_pallet_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_TRAPDOOR).nonOpaque()), DecoItemGroup.VARAN_DECO_REDSTONE);
    public static final Block WARPED_PALLET_TRAPDOOR = registerBlock("warped_pallet_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.MANGROVE_TRAPDOOR).nonOpaque()), DecoItemGroup.VARAN_DECO_REDSTONE);

    public static final Block CACTUS_PALLET_TRAPDOOR = registerBlock("cactus_pallet_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(DecoBlocks.CACTUS_TRAPDOOR).nonOpaque()), DecoItemGroup.VARAN_DECO_REDSTONE);
    public static final Block MUSHROOM_PALLET_TRAPDOOR = registerBlock("mushroom_pallet_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(DecoBlocks.MUSHROOM_TRAPDOOR).nonOpaque()), DecoItemGroup.VARAN_DECO_REDSTONE);
    public static final Block WOODEN_PALLET_TRAPDOOR = registerBlock("wooden_pallet_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(DecoBlocks.WOODEN_TRAPDOOR).nonOpaque()), DecoItemGroup.VARAN_DECO_REDSTONE);

    public static final Block CACTUS_PLANK_FENCE_GATE = registerBlock("cactus_plank_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(DecoBlocks.CACTUS_PLANKS)), DecoItemGroup.VARAN_DECO_REDSTONE);
    public static final Block MUSHROOM_FENCE_GATE = registerBlock("mushroom_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(DecoBlocks.MUSHROOM_PLANKS)), DecoItemGroup.VARAN_DECO_REDSTONE);
    public static final Block WOODEN_FENCE_GATE = registerBlock("wooden_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(DecoBlocks.WOODEN_PLANKS)), DecoItemGroup.VARAN_DECO_REDSTONE);
    public static final Block NETHER_BRICK_FENCE_GATE = registerBlock("nether_brick_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.NETHER_BRICKS)), DecoItemGroup.VARAN_DECO_REDSTONE);
    public static final Block RED_NETHER_BRICK_FENCE_GATE = registerBlock("red_nether_brick_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.RED_NETHER_BRICKS)), DecoItemGroup.VARAN_DECO_REDSTONE);
    public static final Block BLUE_NETHER_BRICK_FENCE_GATE = registerBlock("blue_nether_brick_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(DecoBlocks.BLUE_NETHER_BRICKS)), DecoItemGroup.VARAN_DECO_REDSTONE);

    public static final Identifier CACTUS_SIGN_TEXTURE = new Identifier(VaranDeco.MOD_ID,"entity/signs/cactus");
    public static final Identifier MUSHROOM_SIGN_TEXTURE = new Identifier(VaranDeco.MOD_ID,"entity/signs/mushroom");
    public static final Identifier WOODEN_SIGN_TEXTURE = new Identifier(VaranDeco.MOD_ID,"entity/signs/wooden");

    public static final Block STANDING_CACTUS_SIGN = registerBlockWithoutItem("standing_cactus_sign",
            new TerraformSignBlock(CACTUS_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_SIGN)));
    public static final Block WALL_CACTUS_SIGN = registerBlockWithoutItem("wall_cactus_sign",
            new TerraformWallSignBlock(CACTUS_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_WALL_SIGN)));

    public static final Block STANDING_MUSHROOM_SIGN = registerBlockWithoutItem("standing_mushroom_sign",
            new TerraformSignBlock(MUSHROOM_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_SIGN)));
    public static final Block WALL_MUSHROOM_SIGN = registerBlockWithoutItem("wall_mushroom_sign",
            new TerraformWallSignBlock(MUSHROOM_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_WALL_SIGN)));

    public static final Block STANDING_WOODEN_SIGN = registerBlockWithoutItem("standing_wooden_sign",
            new TerraformSignBlock(WOODEN_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_SIGN)));
    public static final Block WALL_WOODEN_SIGN = registerBlockWithoutItem("wall_wooden_sign",
            new TerraformWallSignBlock(WOODEN_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_WALL_SIGN)));

    public static final Block STONE_TEMP = registerBlockWithoutItem("stone_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block SMOOTH_STONE_TEMP = registerBlockWithoutItem("smooth_stone_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block POLISHED_ANDESITE_TEMP = registerBlockWithoutItem("polished_andesite_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block POLISHED_DIORITE_TEMP = registerBlockWithoutItem("polished_diorite_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block POLISHED_GRANITE_TEMP = registerBlockWithoutItem("polished_granite_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block DRIPSTONE_TEMP = registerBlockWithoutItem("dripstone_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block CALCITE_TEMP = registerBlockWithoutItem("calcite_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block TUFF_TEMP = registerBlockWithoutItem("tuff_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block PACKED_MUD_TEMP = registerBlockWithoutItem("packed_mud_temp",
            new Block(FabricBlockSettings.of(Material.WOOD).strength(0f)));
    public static final Block NETHER_BRICKS_TEMP = registerBlockWithoutItem("nether_bricks_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block RED_NETHER_BRICKS_TEMP = registerBlockWithoutItem("red_nether_bricks_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block NETHERRACK_TEMP = registerBlockWithoutItem("netherrack_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block MAGMA_TEMP = registerBlockWithoutItem("magma_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block SNOW_TEMP = registerBlockWithoutItem("snow_temp",
            new Block(FabricBlockSettings.of(Material.SNOW_BLOCK).strength(0f)));
    public static final Block PACKED_ICE_TEMP = registerBlockWithoutItem("packed_ice_temp",
            new Block(FabricBlockSettings.of(Material.DENSE_ICE).strength(0f)));
    public static final Block BLUE_ICE_TEMP = registerBlockWithoutItem("blue_ice_temp",
            new Block(FabricBlockSettings.of(Material.DENSE_ICE).strength(0f)));
    public static final Block SANDSTONE_TOP_TEMP = registerBlockWithoutItem("sandstone_top_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block RED_SANDSTONE_TOP_TEMP = registerBlockWithoutItem("red_sandstone_top_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block DARK_PRISMARINE_TEMP = registerBlockWithoutItem("dark_prismarine_temp",
            new Block(FabricBlockSettings.of(Material.DENSE_ICE).strength(0f)));
    public static final Block PRISMARINE_BRICKS_TEMP = registerBlockWithoutItem("prismarine_bricks_temp",
            new Block(FabricBlockSettings.of(Material.DENSE_ICE).strength(0f)));
    public static final Block QUARTZ_TEMP = registerBlockWithoutItem("quartz_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block SMOOTH_QUARTZ_TEMP = registerBlockWithoutItem("smooth_quartz_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block QUARTZ_BRICKS_TEMP = registerBlockWithoutItem("quartz_bricks_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block TERRACOTTA_TEMP = registerBlockWithoutItem("terracotta_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block WHITE_TERRACOTTA_TEMP = registerBlockWithoutItem("white_terracotta_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block LIGHT_GRAY_TERRACOTTA_TEMP = registerBlockWithoutItem("light_gray_terracotta_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block GRAY_TERRACOTTA_TEMP = registerBlockWithoutItem("gray_terracotta_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block BLACK_TERRACOTTA_TEMP = registerBlockWithoutItem("black_terracotta_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block BROWN_TERRACOTTA_TEMP = registerBlockWithoutItem("brown_terracotta_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block RED_TERRACOTTA_TEMP = registerBlockWithoutItem("red_terracotta_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block ORANGE_TERRACOTTA_TEMP = registerBlockWithoutItem("orange_terracotta_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block YELLOW_TERRACOTTA_TEMP = registerBlockWithoutItem("yellow_terracotta_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block LIME_TERRACOTTA_TEMP = registerBlockWithoutItem("lime_terracotta_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block GREEN_TERRACOTTA_TEMP = registerBlockWithoutItem("green_terracotta_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block CYAN_TERRACOTTA_TEMP = registerBlockWithoutItem("cyan_terracotta_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block LIGHT_BLUE_TERRACOTTA_TEMP = registerBlockWithoutItem("light_blue_terracotta_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block BLUE_TERRACOTTA_TEMP = registerBlockWithoutItem("blue_terracotta_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block PURPLE_TERRACOTTA_TEMP = registerBlockWithoutItem("purple_terracotta_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block MAGENTA_TERRACOTTA_TEMP = registerBlockWithoutItem("magenta_terracotta_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block PINK_TERRACOTTA_TEMP = registerBlockWithoutItem("pink_terracotta_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block WHITE_CONCRETE_TEMP = registerBlockWithoutItem("white_concrete_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block LIGHT_GRAY_CONCRETE_TEMP = registerBlockWithoutItem("light_gray_concrete_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block GRAY_CONCRETE_TEMP = registerBlockWithoutItem("gray_concrete_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block BLACK_CONCRETE_TEMP = registerBlockWithoutItem("black_concrete_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block BROWN_CONCRETE_TEMP = registerBlockWithoutItem("brown_concrete_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block RED_CONCRETE_TEMP = registerBlockWithoutItem("red_concrete_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block ORANGE_CONCRETE_TEMP = registerBlockWithoutItem("orange_concrete_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block YELLOW_CONCRETE_TEMP = registerBlockWithoutItem("yellow_concrete_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block LIME_CONCRETE_TEMP = registerBlockWithoutItem("lime_concrete_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block GREEN_CONCRETE_TEMP = registerBlockWithoutItem("green_concrete_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block CYAN_CONCRETE_TEMP = registerBlockWithoutItem("cyan_concrete_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block LIGHT_BLUE_CONCRETE_TEMP = registerBlockWithoutItem("light_blue_concrete_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block BLUE_CONCRETE_TEMP = registerBlockWithoutItem("blue_concrete_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block PURPLE_CONCRETE_TEMP = registerBlockWithoutItem("purple_concrete_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block MAGENTA_CONCRETE_TEMP = registerBlockWithoutItem("magenta_concrete_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block PINK_CONCRETE_TEMP = registerBlockWithoutItem("pink_concrete_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block END_STONE_TEMP = registerBlockWithoutItem("end_stone_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block OBSIDIAN_TEMP = registerBlockWithoutItem("obsidian_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block POLISHED_DEEPSLATE_TEMP = registerBlockWithoutItem("polished_deepslate_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block DEEPSLATE_TEMP = registerBlockWithoutItem("deepslate_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block BLACKSTONE_TEMP = registerBlockWithoutItem("blackstone_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block COBBLESTONE_TEMP = registerBlockWithoutItem("cobblestone_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block COBBLED_DEEPSLATE_TEMP = registerBlockWithoutItem("cobbled_deepslate_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block PURPUR_TEMP = registerBlockWithoutItem("purpur_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block SMOOTH_BASALT_TEMP = registerBlockWithoutItem("smooth_basalt_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block ACACIA_WOOD_TEMP = registerBlockWithoutItem("acacia_wood_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block BIRCH_WOOD_TEMP = registerBlockWithoutItem("birch_wood_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block CRIMSON_WOOD_TEMP = registerBlockWithoutItem("crimson_wood_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block DARK_OAK_WOOD_TEMP = registerBlockWithoutItem("dark_oak_wood_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block JUNGLE_WOOD_TEMP = registerBlockWithoutItem("jungle_wood_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block MANGROVE_WOOD_TEMP = registerBlockWithoutItem("mangrove_wood_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block OAK_WOOD_TEMP = registerBlockWithoutItem("oak_wood_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block SPRUCE_WOOD_TEMP = registerBlockWithoutItem("spruce_wood_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block WARPED_WOOD_TEMP = registerBlockWithoutItem("warped_wood_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block WOODEN_WOOD_TEMP = registerBlockWithoutItem("wooden_wood_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block STRIPPED_ACACIA_TEMP = registerBlockWithoutItem("stripped_acacia_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block STRIPPED_BIRCH_TEMP = registerBlockWithoutItem("stripped_birch_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block STRIPPED_CRIMSON_TEMP = registerBlockWithoutItem("stripped_crimson_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block STRIPPED_DARK_OAK_TEMP = registerBlockWithoutItem("stripped_dark_oak_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block STRIPPED_JUNGLE_TEMP = registerBlockWithoutItem("stripped_jungle_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block STRIPPED_MANGROVE_TEMP = registerBlockWithoutItem("stripped_mangrove_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block STRIPPED_OAK_TEMP = registerBlockWithoutItem("stripped_oak_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block STRIPPED_SPRUCE_TEMP = registerBlockWithoutItem("stripped_spruce_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block STRIPPED_WARPED_TEMP = registerBlockWithoutItem("stripped_warped_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block STRIPPED_WOODEN_TEMP = registerBlockWithoutItem("stripped_wooden_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block IRON_TEMP = registerBlockWithoutItem("iron_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block GOLD_TEMP = registerBlockWithoutItem("gold_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block COPPER_TEMP = registerBlockWithoutItem("copper_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block EXPOSED_COPPER_TEMP = registerBlockWithoutItem("exposed_copper_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block WEATHERED_COPPER_TEMP = registerBlockWithoutItem("weathered_copper_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block OXIDIZED_COPPER_TEMP = registerBlockWithoutItem("oxidized_copper_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block RAW_IRON_TEMP = registerBlockWithoutItem("raw_iron_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block RAW_GOLD_TEMP = registerBlockWithoutItem("raw_gold_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block RAW_COPPER_TEMP = registerBlockWithoutItem("raw_copper_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block GRASS_TEMP = registerBlockWithoutItem("grass_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block PODZOL_TEMP = registerBlockWithoutItem("podzol_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block MYCELIUM_TEMP = registerBlockWithoutItem("mycelium_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block CRIMSON_NYLIUM_TEMP = registerBlockWithoutItem("crimson_nylium_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block WARPED_NYLIUM_TEMP = registerBlockWithoutItem("warped_nylium_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block DIRT_TEMP = registerBlockWithoutItem("dirt_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block COARSE_DIRT_TEMP = registerBlockWithoutItem("coarse_dirt_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block ROOTED_DIRT_TEMP = registerBlockWithoutItem("rooted_dirt_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block MUD_TEMP = registerBlockWithoutItem("mud_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block CLAY_TEMP = registerBlockWithoutItem("clay_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block MOSS_TEMP = registerBlockWithoutItem("moss_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block BONE_TEMP = registerBlockWithoutItem("bone_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block BEDROCK_TEMP = registerBlockWithoutItem("bedrock_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block WHITE_WOOL_TEMP = registerBlockWithoutItem("white_wool_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block LIGHT_GRAY_WOOL_TEMP = registerBlockWithoutItem("light_gray_wool_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block GRAY_WOOL_TEMP = registerBlockWithoutItem("gray_wool_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block BLACK_WOOL_TEMP = registerBlockWithoutItem("black_wool_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block BROWN_WOOL_TEMP = registerBlockWithoutItem("brown_wool_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block RED_WOOL_TEMP = registerBlockWithoutItem("red_wool_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block ORANGE_WOOL_TEMP = registerBlockWithoutItem("orange_wool_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block YELLOW_WOOL_TEMP = registerBlockWithoutItem("yellow_wool_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block LIME_WOOL_TEMP = registerBlockWithoutItem("lime_wool_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block GREEN_WOOL_TEMP = registerBlockWithoutItem("green_wool_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block CYAN_WOOL_TEMP = registerBlockWithoutItem("cyan_wool_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block LIGHT_BLUE_WOOL_TEMP = registerBlockWithoutItem("light_blue_wool_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block BLUE_WOOL_TEMP = registerBlockWithoutItem("blue_wool_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block PURPLE_WOOL_TEMP = registerBlockWithoutItem("purple_wool_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block MAGENTA_WOOL_TEMP = registerBlockWithoutItem("magenta_wool_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));
    public static final Block PINK_WOOL_TEMP = registerBlockWithoutItem("pink_wool_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)));

    public static final BlockFamily CACTUS_FAMILY = BlockFamilies.register(DecoBlocks.CACTUS_PLANKS)
            .sign(DecoBlocks.STANDING_CACTUS_SIGN,DecoBlocks.WALL_CACTUS_SIGN)
            .group("wooden").unlockCriterionName("has_planks").build();
    public static final BlockFamily MUSHROOM_FAMILY = BlockFamilies.register(DecoBlocks.MUSHROOM_PLANKS)
            .sign(DecoBlocks.STANDING_MUSHROOM_SIGN,DecoBlocks.WALL_MUSHROOM_SIGN)
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
    }	private static Boolean never(BlockState state, BlockView world, BlockPos pos, EntityType<?> type) {
        return false;
    }
    private static boolean always(BlockState state, BlockView world, BlockPos pos) {
        return true;
    }

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