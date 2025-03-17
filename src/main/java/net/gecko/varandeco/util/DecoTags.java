package net.gecko.varandeco.util;

import net.gecko.varandeco.VaranDeco;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class DecoTags {
    public static class Blocks {

        public static final TagKey<Block> CRAFTING_TABLES =
                createTag("crafting_tables");

        public static final TagKey<Block> BARRELS =
                createTag("barrels");

        private static TagKey<Block> createTag(String name){
            return TagKey.of(Registry.BLOCK_KEY, new Identifier(VaranDeco.MOD_ID, name));
        }
    }
    public static class Items {

        private static TagKey<Item> createTag(String name){
            return TagKey.of(Registry.ITEM_KEY, new Identifier(VaranDeco.MOD_ID, name));
        }
    }
}
