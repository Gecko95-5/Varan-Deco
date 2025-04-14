package net.gecko.varandeco.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.gecko.varandeco.block.DecoBlocks;
import net.gecko.varandeco.item.DecoItems;
import net.gecko.varandeco.util.DecoTags;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.tag.BlockTags;
import net.minecraft.tag.ItemTags;

public class DecoItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public DecoItemTagProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected void generateTags() {
        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(DecoBlocks.CACTUS_PLANKS.asItem())
                .add(DecoBlocks.WOODEN_PLANKS.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_STAIRS)
                .add(DecoBlocks.CACTUS_PLANK_STAIRS.asItem())
                .add(DecoBlocks.WOODEN_STAIRS.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_SLABS)
                .add(DecoBlocks.CACTUS_PLANK_SLAB.asItem())
                .add(DecoBlocks.WOODEN_SLAB.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_FENCES)
                .add(DecoBlocks.CACTUS_PLANK_FENCE.asItem())
                .add(DecoBlocks.WOODEN_FENCE.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_BUTTONS)
                .add(DecoBlocks.CACTUS_PLANK_BUTTON.asItem())
                .add(DecoBlocks.WOODEN_BUTTON.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_PRESSURE_PLATES)
                .add(DecoBlocks.CACTUS_PLANK_PRESSURE_PLATE.asItem())
                .add(DecoBlocks.WOODEN_PRESSURE_PLATE.asItem());

        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .addTag(DecoTags.Items.WOODEN_LOGS);

        getOrCreateTagBuilder(DecoTags.Items.WOODEN_LOGS)
                .add(DecoBlocks.WOODEN_LOG.asItem())
                .add(DecoBlocks.WOODEN_WOOD.asItem())
                .add(DecoBlocks.STRIPPED_WOODEN_LOG.asItem())
                .add(DecoBlocks.STRIPPED_WOODEN_WOOD.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_DOORS)
                .add(DecoBlocks.CACTUS_DOOR.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_TRAPDOORS)
                .add(DecoBlocks.CACTUS_TRAPDOOR.asItem());

        getOrCreateTagBuilder(ItemTags.SIGNS)
                .add(DecoBlocks.STANDING_CACTUS_SIGN.asItem())
                .add(DecoBlocks.WALL_CACTUS_SIGN.asItem())
                .add(DecoItems.CACTUS_SIGN.asItem())
                .add(DecoBlocks.STANDING_WOODEN_SIGN.asItem())
                .add(DecoBlocks.WALL_WOODEN_SIGN.asItem())
                .add(DecoItems.WOODEN_SIGN.asItem());

        getOrCreateTagBuilder(ItemTags.SAPLINGS)
                .add(DecoBlocks.WOODEN_SAPLING.asItem());

        getOrCreateTagBuilder(ItemTags.LEAVES)
                .add(DecoBlocks.WOODEN_LEAVES.asItem());

        getOrCreateTagBuilder(DecoTags.Items.DECO_CRAFTING_TABLES)
                .add(Blocks.CRAFTING_TABLE.asItem())
                .add(DecoBlocks.CRIMSON_CRAFTING_TABLE.asItem())
                .add(DecoBlocks.WARPED_CRAFTING_TABLE.asItem())
                .addTag(DecoTags.Items.WOODED_CRAFTING_TABLES);

        getOrCreateTagBuilder(DecoTags.Items.WOODED_CRAFTING_TABLES)
                .add(DecoBlocks.BIRCH_CRAFTING_TABLE.asItem())
                .add(DecoBlocks.SPRUCE_CRAFTING_TABLE.asItem())
                .add(DecoBlocks.JUNGLE_CRAFTING_TABLE.asItem())
                .add(DecoBlocks.ACACIA_CRAFTING_TABLE.asItem())
                .add(DecoBlocks.DARK_OAK_CRAFTING_TABLE.asItem())
                .add(DecoBlocks.MANGROVE_CRAFTING_TABLE.asItem())
                .add(DecoBlocks.CACTUS_CRAFTING_TABLE.asItem())
                .add(DecoBlocks.WOODEN_CRAFTING_TABLE.asItem());

        getOrCreateTagBuilder(DecoTags.Items.DECO_LADDER)
                .add(Blocks.LADDER.asItem())
                .add(DecoBlocks.BIRCH_LADDER.asItem())
                .add(DecoBlocks.SPRUCE_LADDER.asItem())
                .add(DecoBlocks.JUNGLE_LADDER.asItem())
                .add(DecoBlocks.ACACIA_LADDER.asItem())
                .add(DecoBlocks.DARK_OAK_LADDER.asItem())
                .add(DecoBlocks.MANGROVE_LADDER.asItem())
                .add(DecoBlocks.CACTUS_LADDER.asItem())
                .add(DecoBlocks.WOODEN_LADDER.asItem());

        getOrCreateTagBuilder(DecoTags.Items.DECO_CARTOGRAPHY_TABLES)
                .add(DecoBlocks.OAK_CARTOGRAPHY_TABLE.asItem())
                .add(DecoBlocks.BIRCH_CARTOGRAPHY_TABLE.asItem())
                .add(DecoBlocks.SPRUCE_CARTOGRAPHY_TABLE.asItem())
                .add(DecoBlocks.JUNGLE_CARTOGRAPHY_TABLE.asItem())
                .add(DecoBlocks.ACACIA_CARTOGRAPHY_TABLE.asItem())
                .add(DecoBlocks.DARK_OAK_CARTOGRAPHY_TABLE.asItem())
                .add(DecoBlocks.MANGROVE_CARTOGRAPHY_TABLE.asItem())
                .add(DecoBlocks.CACTUS_CARTOGRAPHY_TABLE.asItem());

        getOrCreateTagBuilder(DecoTags.Items.DECO_SMITHING_TABLES)
                .add(DecoBlocks.OAK_SMITHING_TABLE.asItem())
                .add(DecoBlocks.SPRUCE_SMITHING_TABLE.asItem())
                .add(DecoBlocks.BIRCH_SMITHING_TABLE.asItem())
                .add(DecoBlocks.ACACIA_SMITHING_TABLE.asItem())
                .add(DecoBlocks.DARK_OAK_SMITHING_TABLE.asItem())
                .add(DecoBlocks.MANGROVE_SMITHING_TABLE.asItem())
                .add(DecoBlocks.CACTUS_SMITHING_TABLE.asItem());

        getOrCreateTagBuilder(DecoTags.Items.DECO_BARRELS)
                .add(DecoBlocks.OAK_BARREL.asItem())
                .add(DecoBlocks.SPRUCE_BARREL.asItem())
                .add(DecoBlocks.BIRCH_BARREL.asItem())
                .add(DecoBlocks.JUNGLE_BARREL.asItem())
                .add(DecoBlocks.ACACIA_BARREL.asItem())
                .add(DecoBlocks.DARK_OAK_BARREL.asItem())
                .add(DecoBlocks.MANGROVE_BARREL.asItem())
                .add(DecoBlocks.CACTUS_BARREL.asItem());

        getOrCreateTagBuilder(DecoTags.Items.FURNACES)
                .add(Items.FURNACE.asItem())
                .add(DecoBlocks.DEEPSLATE_FURNACE.asItem())
                .add(DecoBlocks.BLACKSTONE_FURNACE.asItem());

        getOrCreateTagBuilder(ItemTags.STONE_TOOL_MATERIALS)
                .add(Blocks.STONE.asItem())
                .add(Blocks.DEEPSLATE.asItem());

        getOrCreateTagBuilder(ItemTags.STONE_CRAFTING_MATERIALS)
                .add(Blocks.STONE.asItem())
                .add(Blocks.DEEPSLATE.asItem());

        getOrCreateTagBuilder(ItemTags.BUTTONS)
                .add(DecoBlocks.POLISHED_DEEPSLATE_BUTTON.asItem())
                .add(DecoBlocks.DEEPSLATE_BUTTON.asItem())
                .add(DecoBlocks.COBBLED_DEEPSLATE_BUTTON.asItem())
                .add(DecoBlocks.COBBLESTONE_BUTTON.asItem())
                .add(DecoBlocks.BLACKSTONE_BUTTON.asItem())
                .add(DecoBlocks.POLISHED_STONE_BUTTON.asItem());
    }
}
