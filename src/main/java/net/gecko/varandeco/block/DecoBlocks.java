package net.gecko.varandeco.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.gecko.varandeco.VaranDeco;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class DecoBlocks {

    public static final Block STONE_TEMP = registerBlock("stone_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)), ItemGroup.HOTBAR);
    public static final Block SMOOTH_STONE_TEMP = registerBlock("smooth_stone_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)), ItemGroup.HOTBAR);
    public static final Block POLISHED_ANDESITE_TEMP = registerBlock("polished_andesite_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)), ItemGroup.HOTBAR);
    public static final Block POLISHED_DIORITE_TEMP = registerBlock("polished_diorite_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)), ItemGroup.HOTBAR);
    public static final Block POLISHED_GRANITE_TEMP = registerBlock("polished_granite_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)), ItemGroup.HOTBAR);
    public static final Block DRIPSTONE_TEMP = registerBlock("dripstone_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)), ItemGroup.HOTBAR);
    public static final Block CALCITE_TEMP = registerBlock("calcite_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)), ItemGroup.HOTBAR);
    public static final Block TUFF_TEMP = registerBlock("tuff_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)), ItemGroup.HOTBAR);

    public static final Block POLISHED_STONE = registerBlock("polished_stone",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2.5f).resistance(6.0f).requiresTool())
            , ItemGroup.BUILDING_BLOCKS);

    public static final Block STONE_TILES = registerBlock("stone_tiles",
            new Block(FabricBlockSettings.of(Material.STONE).strength(1.5f).resistance(6.0f).requiresTool())
            , ItemGroup.BUILDING_BLOCKS);

    public static final Block CALCITE_STAIRS = registerBlock("calcite_stairs",
            new StairsBlock(Blocks.CALCITE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.CALCITE)
            ), ItemGroup.BUILDING_BLOCKS);
    public static final Block TUFF_STAIRS = registerBlock("tuff_stairs",
            new StairsBlock(Blocks.TUFF.getDefaultState(),FabricBlockSettings.copyOf(Blocks.TUFF)
            ), ItemGroup.BUILDING_BLOCKS);
    public static final Block DRIPSTONE_STAIRS = registerBlock("dripstone_stairs",
            new StairsBlock(Blocks.DRIPSTONE_BLOCK.getDefaultState(),FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)
            ), ItemGroup.BUILDING_BLOCKS);
    public static final Block SMOOTH_STONE_STAIRS = registerBlock("smooth_stone_stairs",
            new StairsBlock(Blocks.SMOOTH_STONE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)
            ), ItemGroup.BUILDING_BLOCKS);
    public static final Block POLISHED_STONE_STAIRS = registerBlock("polished_stone_stairs",
            new StairsBlock(DecoBlocks.POLISHED_STONE.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.POLISHED_STONE)
            ), ItemGroup.BUILDING_BLOCKS);

    public static final Block CALCITE_SLAB = registerBlock("calcite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.CALCITE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block TUFF_SLAB = registerBlock("tuff_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TUFF)), ItemGroup.BUILDING_BLOCKS);
    public static final Block DRIPSTONE_SLAB = registerBlock("dripstone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)), ItemGroup.BUILDING_BLOCKS);
    public static final Block POLISHED_STONE_SLAB = registerBlock("polished_stone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.POLISHED_STONE)), ItemGroup.BUILDING_BLOCKS);

    public static final Block STONE_WALL = registerBlock("stone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block POLISHED_ANDESITE_WALL = registerBlock("polished_andesite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_ANDESITE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block POLISHED_DIORITE_WALL = registerBlock("polished_diorite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_DIORITE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block POLISHED_GRANITE_WALL = registerBlock("polished_granite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_GRANITE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block CALCITE_WALL = registerBlock("calcite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.CALCITE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block TUFF_WALL = registerBlock("tuff_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TUFF)), ItemGroup.BUILDING_BLOCKS);
    public static final Block DRIPSTONE_WALL = registerBlock("dripstone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)), ItemGroup.BUILDING_BLOCKS);
    public static final Block SMOOTH_STONE_WALL = registerBlock("smooth_stone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block POLISHED_STONE_WALL = registerBlock("polished_stone_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.POLISHED_STONE)), ItemGroup.BUILDING_BLOCKS);

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
