package net.gecko.varandeco.block;

import com.terraformersmc.terraform.sign.block.TerraformSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformWallSignBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.gecko.varandeco.VaranDeco;
import net.gecko.varandeco.block.custom.BlackIceBlock;
import net.gecko.varandeco.block.magmablocks.*;
import net.gecko.varandeco.item.DecoItemGroup;
import net.minecraft.block.*;
import net.minecraft.data.family.BlockFamilies;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
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
    public static final Block CUT_SANDSTONE_BRICKS = registerBlock("cut_sandstone_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(1.6f).requiresTool()),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block SNOW_BRICKS = registerBlock("snow_bricks",
            new Block(FabricBlockSettings.of(Material.SNOW_BLOCK).slipperiness(0.89F)
                    .strength(1.0f).resistance(0.7f).requiresTool().sounds(BlockSoundGroup.SNOW)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CHISELED_SNOW_BRICKS = registerBlock("chiseled_snow_bricks",
            new MagmaBrickBlock(FabricBlockSettings.copyOf(DecoBlocks.SNOW_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CRYSTALLIZED_PRISMARINE = registerBlock("crystallized_prismarine",
            new Block(FabricBlockSettings.copyOf(Blocks.PRISMARINE).mapColor(MapColor.BRIGHT_TEAL)
                    .luminance(state -> 3)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CRYSTALLIZED_PRISMARINE_BRICKS = registerBlock("crystallized_prismarine_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.PRISMARINE).mapColor(MapColor.BRIGHT_TEAL)
                    .luminance(state -> 3)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block LIGHT_PRISMARINE = registerBlock("light_prismarine",
            new Block(FabricBlockSettings.copyOf(Blocks.PRISMARINE).mapColor(MapColor.OFF_WHITE)
                    .luminance(state -> 5)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block MAGMA_BRICKS = registerBlock("magma_bricks",
            new MagmaBrickBlock(FabricBlockSettings.copyOf(Blocks.MAGMA_BLOCK).luminance(state -> 1)
                    .strength(1.5F).sounds(BlockSoundGroup.NETHER_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CHISELED_MAGMA_BRICKS = registerBlock("chiseled_magma_bricks",
            new MagmaBrickBlock(FabricBlockSettings.copyOf(DecoBlocks.MAGMA_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_RED_SANDSTONE_BRICKS = registerBlock("cut_red_sandstone_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(1.6f).requiresTool()),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block ICE_BRICKS = registerBlock("ice_bricks",
            new MagmaBrickBlock(FabricBlockSettings.copyOf(Blocks.PACKED_ICE).strength(1.4f)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block BLACK_ICE = registerBlock("black_ice",
            new BlackIceBlock(FabricBlockSettings.of(Material.DENSE_ICE, MapColor.BLACK).slipperiness(1.18F)
                    .strength(5.6f).requiresTool().sounds(BlockSoundGroup.STONE).velocityMultiplier(0.9F)),
                    DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block POLISHED_GLIDED_BLACKSTONE = registerBlock("polished_gilded_blackstone",
            new Block(FabricBlockSettings.copyOf(Blocks.GILDED_BLACKSTONE).strength(2.5f)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CHISELED_GLIDED_BLACKSTONE = registerBlock("chiseled_gilded_blackstone",
            new Block(FabricBlockSettings.copyOf(DecoBlocks.POLISHED_GLIDED_BLACKSTONE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block POLISHED_BLACKSTONE_TILES = registerBlock("polished_blackstone_tiles",
            new Block(FabricBlockSettings.of(Material.STONE, MapColor.BLACK).strength(1.5f).resistance(6.0f).requiresTool()),
            DecoItemGroup.VARAN_DECO_BLOCKS);

    public static final Block CALCITE_STAIRS = registerBlock("calcite_stairs",
            new StairsBlock(Blocks.CALCITE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.CALCITE)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block TUFF_STAIRS = registerBlock("tuff_stairs",
            new StairsBlock(Blocks.TUFF.getDefaultState(),FabricBlockSettings.copyOf(Blocks.TUFF)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block DRIPSTONE_STAIRS = registerBlock("dripstone_stairs",
            new StairsBlock(Blocks.DRIPSTONE_BLOCK.getDefaultState(),FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block SMOOTH_STONE_STAIRS = registerBlock("smooth_stone_stairs",
            new StairsBlock(Blocks.SMOOTH_STONE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_SANDSTONE_STAIRS = registerBlock("cut_sandstone_stairs",
            new StairsBlock(Blocks.CUT_SANDSTONE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.CUT_SANDSTONE)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block SNOW_STAIRS = registerBlock("snow_stairs",
            new StairsBlock(Blocks.SNOW_BLOCK.getDefaultState(),FabricBlockSettings.copyOf(Blocks.SNOW_BLOCK)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block NETHERRACK_STAIRS = registerBlock("netherrack_stairs",
            new StairsBlock(Blocks.NETHERRACK.getDefaultState(),FabricBlockSettings.copyOf(Blocks.NETHERRACK)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block MAGMA_STAIRS = registerBlock("magma_stairs",
            new MagmaStairBlock(Blocks.MAGMA_BLOCK.getDefaultState(),FabricBlockSettings.copyOf(Blocks.MAGMA_BLOCK)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_RED_SANDSTONE_STAIRS = registerBlock("cut_red_sandstone_stairs",
            new StairsBlock(Blocks.CUT_RED_SANDSTONE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.CUT_RED_SANDSTONE)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block PACKED_MUD_STAIRS = registerBlock("packed_mud_stairs",
            new StairsBlock(Blocks.PACKED_MUD.getDefaultState(),FabricBlockSettings.copyOf(Blocks.PACKED_MUD)),
            DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block PACKED_ICE_STAIRS = registerBlock("packed_ice_stairs",
            new StairsBlock(Blocks.PACKED_ICE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.PACKED_ICE)),
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
    public static final Block CRYSTALLIZED_PRISMARINE_STAIRS = registerBlock("crystallized_prismarine_stairs",
            new StairsBlock(DecoBlocks.CRYSTALLIZED_PRISMARINE.getDefaultState(),
                    FabricBlockSettings.copyOf(DecoBlocks.CRYSTALLIZED_PRISMARINE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CRYSTALLIZED_PRISMARINE_BRICK_STAIRS = registerBlock("crystallized_prismarine_brick_stairs",
            new StairsBlock(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block LIGHT_PRISMARINE_STAIRS = registerBlock("light_prismarine_stairs",
            new StairsBlock(DecoBlocks.LIGHT_PRISMARINE.getDefaultState(),
                    FabricBlockSettings.copyOf(DecoBlocks.LIGHT_PRISMARINE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block MAGMA_BRICK_STAIRS = registerBlock("magma_brick_stairs",
            new MagmaBrickStairBlock(DecoBlocks.MAGMA_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(DecoBlocks.MAGMA_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_RED_SANDSTONE_BRICK_STAIRS = registerBlock("cut_red_sandstone_brick_stairs",
            new StairsBlock(DecoBlocks.CUT_RED_SANDSTONE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(DecoBlocks.CUT_RED_SANDSTONE_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block ICE_BRICK_STAIRS = registerBlock("ice_brick_stairs",
            new MagmaBrickStairBlock(DecoBlocks.ICE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(DecoBlocks.ICE_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
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
    public static final Block MAGMA_SLAB = registerBlock("magma_slab",
            new MagmaSlabBlock(FabricBlockSettings.copyOf(Blocks.MAGMA_BLOCK)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block PACKED_MUD_SLAB = registerBlock("packed_mud_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.PACKED_MUD)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block PACKED_ICE_SLAB = registerBlock("packed_ice_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.PACKED_ICE)), DecoItemGroup.VARAN_DECO_BLOCKS);
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
    public static final Block CRYSTALLIZED_PRISMARINE_SLAB = registerBlock("crystallized_prismarine_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CRYSTALLIZED_PRISMARINE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CRYSTALLIZED_PRISMARINE_BRICK_SLAB = registerBlock("crystallized_prismarine_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block LIGHT_PRISMARINE_SLAB = registerBlock("light_prismarine_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.LIGHT_PRISMARINE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block MAGMA_BRICK_SLAB = registerBlock("magma_brick_slab",
            new MagmaBrickSlabBlock(FabricBlockSettings.copyOf(DecoBlocks.MAGMA_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_RED_SANDSTONE_BRICK_SLAB = registerBlock("cut_red_sandstone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_RED_SANDSTONE_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block ICE_BRICK_SLAB = registerBlock("ice_brick_slab",
            new MagmaBrickSlabBlock(FabricBlockSettings.copyOf(DecoBlocks.ICE_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block POLISHED_BLACKSTONE_TILE_SLAB = registerBlock("polished_blackstone_tile_slab",
            new MagmaBrickSlabBlock(FabricBlockSettings.copyOf(DecoBlocks.POLISHED_BLACKSTONE_TILES)), DecoItemGroup.VARAN_DECO_BLOCKS);

    public static final Block RED_NETHER_BRICK_FENCE = registerBlock("red_nether_brick_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.RED_NETHER_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CACTUS_PLANK_FENCE = registerBlock("cactus_plank_fence",
            new FenceBlock(FabricBlockSettings.copyOf(DecoBlocks.CACTUS_PLANKS)), DecoItemGroup.VARAN_DECO_BLOCKS);

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
    public static final Block MAGMA_WALL = registerBlock("magma_wall",
            new MagmaWallBlock(FabricBlockSettings.copyOf(Blocks.MAGMA_BLOCK)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block PACKED_MUD_WALL = registerBlock("packed_mud_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.PACKED_MUD)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block PACKED_ICE_WALL = registerBlock("packed_ice_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.PACKED_ICE)), DecoItemGroup.VARAN_DECO_BLOCKS);
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
    public static final Block CRYSTALLIZED_PRISMARINE_WALL = registerBlock("crystallized_prismarine_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.CRYSTALLIZED_PRISMARINE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CRYSTALLIZED_PRISMARINE_BRICK_WALL = registerBlock("crystallized_prismarine_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block LIGHT_PRISMARINE_WALL = registerBlock("light_prismarine_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.LIGHT_PRISMARINE)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block MAGMA_BRICK_WALL = registerBlock("magma_brick_wall",
            new MagmaWallBlock(FabricBlockSettings.copyOf(DecoBlocks.MAGMA_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CUT_RED_SANDSTONE_BRICK_WALL = registerBlock("cut_red_sandstone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_RED_SANDSTONE_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block ICE_BRICK_WALL = registerBlock("ice_brick_wall",
            new MagmaWallBlock(FabricBlockSettings.copyOf(DecoBlocks.ICE_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block POLISHED_BLACKSTONE_TILE_WALL = registerBlock("polished_blackstone_tile_wall",
            new MagmaWallBlock(FabricBlockSettings.copyOf(DecoBlocks.POLISHED_BLACKSTONE_TILES)), DecoItemGroup.VARAN_DECO_BLOCKS);

    public static final Block CACTUS_DOOR = registerBlock("cactus_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR).mapColor(MapColor.PALE_GREEN)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CACTUS_TRAPDOOR = registerBlock("cactus_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR).mapColor(MapColor.PALE_GREEN)), DecoItemGroup.VARAN_DECO_BLOCKS);

    public static final Block NETHER_BRICK_FENCE_GATE = registerBlock("nether_brick_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.NETHER_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block RED_NETHER_BRICK_FENCE_GATE = registerBlock("red_nether_brick_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.RED_NETHER_BRICKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CACTUS_PLANK_FENCE_GATE = registerBlock("cactus_plank_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(DecoBlocks.CACTUS_PLANKS)), DecoItemGroup.VARAN_DECO_BLOCKS);

    public static final Block CACTUS_PLANK_PRESSURE_PLATE = registerBlock("cactus_plank_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(DecoBlocks.CACTUS_PLANKS)), DecoItemGroup.VARAN_DECO_BLOCKS);
    public static final Block CACTUS_PLANK_BUTTON = registerBlock("cactus_plank_button",
            new WoodenButtonBlock(FabricBlockSettings.copyOf(DecoBlocks.CACTUS_PLANKS)), DecoItemGroup.VARAN_DECO_BLOCKS);

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
