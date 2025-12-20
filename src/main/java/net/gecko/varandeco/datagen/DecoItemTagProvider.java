package net.gecko.varandeco.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.gecko.varandeco.block.DecoBlocks;
import net.gecko.varandeco.item.DecoItems;
import net.gecko.varandeco.util.DecoTags;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.tag.ItemTags;

public class DecoItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public DecoItemTagProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected void generateTags() {
        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(DecoBlocks.CACTUS_PLANKS.asItem())
                .add(DecoBlocks.MUSHROOM_PLANKS.asItem())
                .add(DecoBlocks.WOODEN_PLANKS.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_STAIRS)
                .add(DecoBlocks.CACTUS_PLANK_STAIRS.asItem())
                .add(DecoBlocks.MUSHROOM_STAIRS.asItem())
                .add(DecoBlocks.WOODEN_STAIRS.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_SLABS)
                .add(DecoBlocks.CACTUS_PLANK_SLAB.asItem())
                .add(DecoBlocks.MUSHROOM_SLAB.asItem())
                .add(DecoBlocks.WOODEN_SLAB.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_FENCES)
                .add(DecoBlocks.CACTUS_PLANK_FENCE.asItem())
                .add(DecoBlocks.MUSHROOM_FENCE.asItem())
                .add(DecoBlocks.WOODEN_FENCE.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_BUTTONS)
                .add(DecoBlocks.CACTUS_PLANK_BUTTON.asItem())
                .add(DecoBlocks.MUSHROOM_BUTTON.asItem())
                .add(DecoBlocks.WOODEN_BUTTON.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_PRESSURE_PLATES)
                .add(DecoBlocks.CACTUS_PLANK_PRESSURE_PLATE.asItem())
                .add(DecoBlocks.MUSHROOM_PRESSURE_PLATE.asItem())
                .add(DecoBlocks.WOODEN_PRESSURE_PLATE.asItem());

        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .addTag(DecoTags.Items.WOODEN_LOGS);

        getOrCreateTagBuilder(DecoTags.Items.WOODEN_LOGS)
                .add(DecoBlocks.WOODEN_LOG.asItem())
                .add(DecoBlocks.WOODEN_WOOD.asItem())
                .add(DecoBlocks.STRIPPED_WOODEN_LOG.asItem())
                .add(DecoBlocks.STRIPPED_WOODEN_WOOD.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_DOORS)
                .add(DecoBlocks.CACTUS_DOOR.asItem())
                .add(DecoBlocks.MUSHROOM_DOOR.asItem())
                .add(DecoBlocks.WOODEN_DOOR.asItem())
                .add(DecoBlocks.OAK_PALLET_DOOR.asItem())
                .add(DecoBlocks.SPRUCE_PALLET_DOOR.asItem())
                .add(DecoBlocks.BIRCH_PALLET_DOOR.asItem())
                .add(DecoBlocks.JUNGLE_PALLET_DOOR.asItem())
                .add(DecoBlocks.ACACIA_PALLET_DOOR.asItem())
                .add(DecoBlocks.DARK_OAK_PALLET_DOOR.asItem())
                .add(DecoBlocks.MANGROVE_PALLET_DOOR.asItem())
                .add(DecoBlocks.CACTUS_PALLET_DOOR.asItem())
                .add(DecoBlocks.MUSHROOM_PALLET_DOOR.asItem())
                .add(DecoBlocks.WOODEN_PALLET_DOOR.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_TRAPDOORS)
                .add(DecoBlocks.CACTUS_TRAPDOOR.asItem())
                .add(DecoBlocks.MUSHROOM_TRAPDOOR.asItem())
                .add(DecoBlocks.WOODEN_TRAPDOOR.asItem())
                .add(DecoBlocks.OAK_PALLET_TRAPDOOR.asItem())
                .add(DecoBlocks.SPRUCE_PALLET_TRAPDOOR.asItem())
                .add(DecoBlocks.BIRCH_PALLET_TRAPDOOR.asItem())
                .add(DecoBlocks.JUNGLE_PALLET_TRAPDOOR.asItem())
                .add(DecoBlocks.ACACIA_PALLET_TRAPDOOR.asItem())
                .add(DecoBlocks.DARK_OAK_PALLET_TRAPDOOR.asItem())
                .add(DecoBlocks.MANGROVE_PALLET_TRAPDOOR.asItem())
                .add(DecoBlocks.CACTUS_PALLET_TRAPDOOR.asItem())
                .add(DecoBlocks.MUSHROOM_PALLET_TRAPDOOR.asItem())
                .add(DecoBlocks.WOODEN_PALLET_TRAPDOOR.asItem());

        getOrCreateTagBuilder(ItemTags.SIGNS)
                .add(DecoBlocks.STANDING_CACTUS_SIGN.asItem())
                .add(DecoBlocks.WALL_CACTUS_SIGN.asItem())
                .add(DecoItems.CACTUS_SIGN.asItem())
                .add(DecoBlocks.STANDING_MUSHROOM_SIGN.asItem())
                .add(DecoBlocks.WALL_MUSHROOM_SIGN.asItem())
                .add(DecoItems.MUSHROOM_SIGN.asItem())
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
                .addTag(DecoTags.Items.WOODEN_CRAFTING_TABLES);

        getOrCreateTagBuilder(DecoTags.Items.DECO_BARRELS)
                .add(Blocks.BARREL.asItem())
                .add(DecoBlocks.CRIMSON_BARREL.asItem())
                .add(DecoBlocks.WARPED_BARREL.asItem())
                .addTag(DecoTags.Items.WOODEN_BARRELS);

        getOrCreateTagBuilder(DecoTags.Items.DECO_CARTOGRAPHY_TABLES)
                .add(Blocks.CARTOGRAPHY_TABLE.asItem())
                .add(DecoBlocks.CRIMSON_CARTOGRAPHY_TABLE.asItem())
                .add(DecoBlocks.WARPED_CARTOGRAPHY_TABLE.asItem())
                .addTag(DecoTags.Items.WOODEN_CARTOGRAPHY_TABLES);

        getOrCreateTagBuilder(DecoTags.Items.DECO_SMITHING_TABLES)
                .add(Blocks.SMITHING_TABLE.asItem())
                .add(DecoBlocks.CRIMSON_SMITHING_TABLE.asItem())
                .add(DecoBlocks.WARPED_SMITHING_TABLE.asItem())
                .addTag(DecoTags.Items.WOODEN_SMITHING_TABLES);

        getOrCreateTagBuilder(DecoTags.Items.WOODEN_CRAFTING_TABLES)
                .add(DecoBlocks.BIRCH_CRAFTING_TABLE.asItem())
                .add(DecoBlocks.SPRUCE_CRAFTING_TABLE.asItem())
                .add(DecoBlocks.JUNGLE_CRAFTING_TABLE.asItem())
                .add(DecoBlocks.ACACIA_CRAFTING_TABLE.asItem())
                .add(DecoBlocks.DARK_OAK_CRAFTING_TABLE.asItem())
                .add(DecoBlocks.MANGROVE_CRAFTING_TABLE.asItem())
                .add(DecoBlocks.CACTUS_CRAFTING_TABLE.asItem())
                .add(DecoBlocks.OAK_CRAFTING_TABLE.asItem())
                .add(DecoBlocks.MUSHROOM_CRAFTING_TABLE.asItem());

        getOrCreateTagBuilder(DecoTags.Items.DECO_LADDER)
                .add(Blocks.LADDER.asItem())
                .add(DecoBlocks.BIRCH_LADDER.asItem())
                .add(DecoBlocks.SPRUCE_LADDER.asItem())
                .add(DecoBlocks.JUNGLE_LADDER.asItem())
                .add(DecoBlocks.ACACIA_LADDER.asItem())
                .add(DecoBlocks.DARK_OAK_LADDER.asItem())
                .add(DecoBlocks.MANGROVE_LADDER.asItem())
                .add(DecoBlocks.CACTUS_LADDER.asItem())
                .add(DecoBlocks.WOODEN_LADDER.asItem())
                .add(DecoBlocks.MUSHROOM_LADDER.asItem());

        getOrCreateTagBuilder(DecoTags.Items.DECO_NOTE_BLOCKS)
                .add(Blocks.NOTE_BLOCK.asItem())
                .addTag(DecoTags.Items.WOODEN_NOTE_BLOCKS);

        getOrCreateTagBuilder(DecoTags.Items.WOODEN_CARTOGRAPHY_TABLES)
                .add(DecoBlocks.OAK_CARTOGRAPHY_TABLE.asItem())
                .add(DecoBlocks.BIRCH_CARTOGRAPHY_TABLE.asItem())
                .add(DecoBlocks.SPRUCE_CARTOGRAPHY_TABLE.asItem())
                .add(DecoBlocks.JUNGLE_CARTOGRAPHY_TABLE.asItem())
                .add(DecoBlocks.ACACIA_CARTOGRAPHY_TABLE.asItem())
                .add(DecoBlocks.DARK_OAK_CARTOGRAPHY_TABLE.asItem())
                .add(DecoBlocks.MANGROVE_CARTOGRAPHY_TABLE.asItem())
                .add(DecoBlocks.CACTUS_CARTOGRAPHY_TABLE.asItem())
                .add(DecoBlocks.MUSHROOM_CARTOGRAPHY_TABLE.asItem());

        getOrCreateTagBuilder(DecoTags.Items.WOODEN_SMITHING_TABLES)
                .add(DecoBlocks.OAK_SMITHING_TABLE.asItem())
                .add(DecoBlocks.SPRUCE_SMITHING_TABLE.asItem())
                .add(DecoBlocks.BIRCH_SMITHING_TABLE.asItem())
                .add(DecoBlocks.ACACIA_SMITHING_TABLE.asItem())
                .add(DecoBlocks.JUNGLE_SMITHING_TABLE.asItem())
                .add(DecoBlocks.DARK_OAK_SMITHING_TABLE.asItem())
                .add(DecoBlocks.MANGROVE_SMITHING_TABLE.asItem())
                .add(DecoBlocks.CACTUS_SMITHING_TABLE.asItem())
                .add(DecoBlocks.MUSHROOM_SMITHING_TABLE.asItem());

        getOrCreateTagBuilder(DecoTags.Items.WOODEN_BARRELS)
                .add(DecoBlocks.OAK_BARREL.asItem())
                .add(DecoBlocks.SPRUCE_BARREL.asItem())
                .add(DecoBlocks.BIRCH_BARREL.asItem())
                .add(DecoBlocks.JUNGLE_BARREL.asItem())
                .add(DecoBlocks.ACACIA_BARREL.asItem())
                .add(DecoBlocks.DARK_OAK_BARREL.asItem())
                .add(DecoBlocks.MANGROVE_BARREL.asItem())
                .add(DecoBlocks.MUSHROOM_BARREL.asItem())
                .add(DecoBlocks.CACTUS_BARREL.asItem());

        getOrCreateTagBuilder(DecoTags.Items.WOODEN_NOTE_BLOCKS)
                .add(DecoBlocks.MUSHROOM_NOTE_BLOCK.asItem())
                .add(DecoBlocks.OAK_NOTE_BLOCK.asItem())
                .add(DecoBlocks.SPRUCE_NOTE_BLOCK.asItem())
                .add(DecoBlocks.BIRCH_NOTE_BLOCK.asItem())
                .add(DecoBlocks.JUNGLE_NOTE_BLOCK.asItem())
                .add(DecoBlocks.DARK_OAK_NOTE_BLOCK.asItem())
                .add(DecoBlocks.ACACIA_NOTE_BLOCK.asItem())
                .add(DecoBlocks.MANGROVE_NOTE_BLOCK.asItem())
                .add(DecoBlocks.CRIMSON_NOTE_BLOCK.asItem())
                .add(DecoBlocks.WARPED_NOTE_BLOCK.asItem())
                .add(DecoBlocks.CACTUS_NOTE_BLOCK.asItem());

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

        getOrCreateTagBuilder(ItemTags.SMALL_FLOWERS)
                .add(DecoBlocks.YELLOW_TULIP.asItem())
                .add(DecoBlocks.PURPLE_TULIP.asItem())
                .add(DecoBlocks.MAGENTA_TULIP.asItem())
                .add(DecoBlocks.BLUE_TULIP.asItem())
                .add(DecoBlocks.BLACK_TULIP.asItem())
                .add(DecoBlocks.GREEN_TULIP.asItem())
                .add(DecoBlocks.CYAN_TULIP.asItem())
                .add(DecoBlocks.BARBERTON_DAISY.asItem())
                .add(DecoBlocks.BLUE_EYED_DAISY.asItem())
                .add(DecoBlocks.GERBERA_DAISY.asItem())
                .add(DecoBlocks.MICHAELMAS_DAISY.asItem())
                .add(DecoBlocks.PUFFY_DANDELION.asItem())
                .add(DecoBlocks.CALIFORNIA_POPPY.asItem())
                .add(DecoBlocks.SALMON_POPPY.asItem())
                .add(DecoBlocks.YELLOW_ORCHID.asItem())
                .add(DecoBlocks.WHITE_ORCHID.asItem())
                .add(DecoBlocks.PINK_ORCHID.asItem())
                .add(DecoBlocks.ROSE.asItem())
                .add(DecoBlocks.ENDER_ROSE.asItem())
                .add(DecoBlocks.PAEONIA.asItem())
                .add(DecoBlocks.LAVENDER.asItem())
                .add(DecoBlocks.BLUE_HIBISCUS.asItem())
                .add(DecoBlocks.BROMELIAD.asItem());

        getOrCreateTagBuilder(DecoTags.Items.WATER_ITEMS)
                .add(Items.WATER_BUCKET)
                .add(DecoItems.BUBBLE_ORB);

        getOrCreateTagBuilder(DecoTags.Items.MUSHROOMS)
                .add(Items.RED_MUSHROOM.asItem())
                .add(Items.BROWN_MUSHROOM.asItem());

        getOrCreateTagBuilder(DecoTags.Items.GIANT_MUSHROOM_BLOCKS)
                .add(Items.RED_MUSHROOM_BLOCK.asItem())
                .add(Items.BROWN_MUSHROOM_BLOCK.asItem());

        getOrCreateTagBuilder(DecoTags.Items.SOUL_GROUND_BLOCKS)
                .add(Items.SOUL_SAND.asItem())
                .add(Items.SOUL_SOIL.asItem());
    }
}
