package net.gecko.varandeco.util;

import net.gecko.varandeco.VaranDeco;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class DecoTags {
    public static class Blocks {

        public static final TagKey<Block> DECO_CRAFTING_TABLES =
                createTag("deco_crafting_tables");

        public static final TagKey<Block> DECO_BARRELS =
                createTag("deco_barrels");

        public static final TagKey<Block> DECO_LADDERS =
                createTag("deco_ladders");

        public static final TagKey<Block> DECO_SMITHING_TABLES =
                createTag("deco_smithing_tables");

        public static final TagKey<Block> DECO_CARTOGRAPHY_TABLES =
                createTag("deco_cartography_tables");

        public static final TagKey<Block> DECO_BOOKSHELVES =
                createTag("deco_bookshelves");

        public static final TagKey<Block> WOODEN_LOGS =
                createTag("wooden_logs");

        public static final TagKey<Block> TERRACOTTA_STAIRS =
                createTag("terracotta_stairs");

        public static final TagKey<Block> TERRACOTTA_SLABS =
                createTag("terracotta_slabs");

        public static final TagKey<Block> TERRACOTTA_WALLS =
                createTag("terracotta_walls");

        public static final TagKey<Block> CONCRETE_STAIRS =
                createTag("concrete_stairs");

        public static final TagKey<Block> CONCRETE_SLABS =
                createTag("concrete_slabs");

        public static final TagKey<Block> CONCRETE_WALLS =
                createTag("concrete_walls");

        public static final TagKey<Block> HARDENED_GLASS =
                createTag("hardened_glass");

        public static final TagKey<Block> HARDENED_GLASS_PANES =
                createTag("hardened_glass_panes");

        public static final TagKey<Block> MOSAIC_GLASS =
                createTag("mosaic_glass");

        public static final TagKey<Block> MOSAIC_GLASS_PANES =
                createTag("mosaic_glass_panes");

        public static final TagKey<Block> DECO_FURNACES =
                createTag("deco_furnaces");

        public static final TagKey<Block> COPPER_BARS =
                createTag("copper_bars");

        public static final TagKey<Block> COPPER_LANTERN =
                createTag("copper_lantern");

        public static final TagKey<Block> METAL_BUTTONS =
                createTag("metal_buttons");

        public static final TagKey<Block> MOSAIC_WOOD =
                createTag("mosaic_wood");

        public static final TagKey<Block> MOSAIC_STAIRS =
                createTag("mosaic_stairs");

        public static final TagKey<Block> MOSAIC_SLABS =
                createTag("mosaic_slab");

        private static TagKey<Block> createTag(String name){
            return TagKey.of(Registries.BLOCK.getKey(), Identifier.of(VaranDeco.MOD_ID, name));
        }
    }
    public static class Items {
        public static final TagKey<Item> DECO_SMITHING_TABLES =
                createTag("deco_smithing_tables");

        public static final TagKey<Item> DECO_CRAFTING_TABLES =
                createTag("deco_crafting_tables");

        public static final TagKey<Item> DECO_BARRELS =
                createTag("deco_barrels");

        public static final TagKey<Item> DECO_BOOKSHELVES =
                createTag("deco_bookshelves");

        public static final TagKey<Item> WOODED_CRAFTING_TABLES =
                createTag("wooden_crafting_tables");

        public static final TagKey<Item> DECO_CARTOGRAPHY_TABLES =
                createTag("deco_cartography_tables");

        public static final TagKey<Item> DECO_LADDER =
                createTag("deco_ladder");

        public static final TagKey<Item> FURNACES =
                createTag("furnaces");

        public static final TagKey<Item> WOODEN_LOGS =
                createTag("wooden_logs");

        public static final TagKey<Item> METAL_BUTTONS =
                createTag("metal_buttons");

        public static final TagKey<Item> MOSAIC_WOOD =
                createTag("mosaic_wood");

        public static final TagKey<Item> MOSAIC_STAIRS =
                createTag("mosaic_stairs");

        public static final TagKey<Item> MOSAIC_SLABS =
                createTag("mosaic_slab");

        public static final TagKey<Item> SAPLINGSs =
                createTag("saplings");

        private static TagKey<Item> createTag(String name){
            return TagKey.of(Registries.ITEM.getKey(), Identifier.of(VaranDeco.MOD_ID, name));
        }
    }
}
