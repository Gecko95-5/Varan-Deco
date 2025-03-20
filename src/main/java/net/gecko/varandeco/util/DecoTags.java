package net.gecko.varandeco.util;

import net.gecko.varandeco.VaranDeco;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

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

        private static TagKey<Block> createTag(String name){
            return TagKey.of(Registry.BLOCK_KEY, new Identifier(VaranDeco.MOD_ID, name));
        }
    }
    public static class Items {
        public static final TagKey<Item> DECO_SMITHING_TABLES =
                createTag("deco_smithing_tables");

        public static final TagKey<Item> DECO_CRAFTING_TABLES =
                createTag("deco_crafting_tables");

        public static final TagKey<Item> DECO_BARRELS =
                createTag("deco_barrels");

        public static final TagKey<Item> DECO_CARTOGRAPHY_TABLES =
                createTag("deco_cartography_tables");

        private static TagKey<Item> createTag(String name){
            return TagKey.of(Registry.ITEM_KEY, new Identifier(VaranDeco.MOD_ID, name));
        }
    }
}
