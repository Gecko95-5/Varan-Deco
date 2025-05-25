package net.gecko.varandeco.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.gecko.varandeco.block.DecoBlocks;
import net.gecko.varandeco.util.DecoTags;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class DecoItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public DecoItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }


    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
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

        getOrCreateTagBuilder(ItemTags.STONE_BUTTONS)
                .add(DecoBlocks.POLISHED_DEEPSLATE_BUTTON.asItem())
                .add(DecoBlocks.DEEPSLATE_BUTTON.asItem())
                .add(DecoBlocks.COBBLED_DEEPSLATE_BUTTON.asItem())
                .add(DecoBlocks.COBBLESTONE_BUTTON.asItem())
                .add(DecoBlocks.BLACKSTONE_BUTTON.asItem())
                .add(DecoBlocks.POLISHED_STONE_BUTTON.asItem());

        getOrCreateTagBuilder(DecoTags.Items.METAL_BUTTONS)
                .add(DecoBlocks.IRON_BUTTON.asItem())
                .add(DecoBlocks.GOLD_BUTTON.asItem())
                .add(DecoBlocks.COPPER_BUTTON.asItem())
                .add(DecoBlocks.EXPOSED_COPPER_BUTTON.asItem())
                .add(DecoBlocks.WEATHERED_COPPER_BUTTON.asItem())
                .add(DecoBlocks.OXIDIZED_COPPER_BUTTON.asItem())
                .add(DecoBlocks.WAXED_COPPER_BUTTON.asItem())
                .add(DecoBlocks.WAXED_EXPOSED_COPPER_BUTTON.asItem())
                .add(DecoBlocks.WAXED_WEATHERED_COPPER_BUTTON.asItem())
                .add(DecoBlocks.WAXED_OXIDIZED_COPPER_BUTTON.asItem());

        getOrCreateTagBuilder(ItemTags.BUTTONS)
                .addTag(DecoTags.Items.METAL_BUTTONS);

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
                .add(DecoBlocks.WOODEN_CRAFTING_TABLE.asItem())
                .add(DecoBlocks.CHERRY_CRAFTING_TABLE.asItem())
                .add(DecoBlocks.BAMBOO_CRAFTING_TABLE.asItem());

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
                .add(DecoBlocks.BAMBOO_LADDER.asItem())
                .add(DecoBlocks.CHERRY_LADDER.asItem());

        getOrCreateTagBuilder(DecoTags.Items.DECO_CARTOGRAPHY_TABLES)
                .add(DecoBlocks.OAK_CARTOGRAPHY_TABLE.asItem())
                .add(DecoBlocks.BIRCH_CARTOGRAPHY_TABLE.asItem())
                .add(DecoBlocks.SPRUCE_CARTOGRAPHY_TABLE.asItem())
                .add(DecoBlocks.JUNGLE_CARTOGRAPHY_TABLE.asItem())
                .add(DecoBlocks.ACACIA_CARTOGRAPHY_TABLE.asItem())
                .add(DecoBlocks.DARK_OAK_CARTOGRAPHY_TABLE.asItem())
                .add(DecoBlocks.MANGROVE_CARTOGRAPHY_TABLE.asItem())
                .add(DecoBlocks.CACTUS_CARTOGRAPHY_TABLE.asItem())
                .add(DecoBlocks.CHERRY_CARTOGRAPHY_TABLE.asItem())
                .add(DecoBlocks.BAMBOO_CARTOGRAPHY_TABLE.asItem());

        getOrCreateTagBuilder(DecoTags.Items.DECO_BOOKSHELVES)
                .add(DecoBlocks.BIRCH_BOOKSHELF.asItem())
                .add(DecoBlocks.SPRUCE_BOOKSHELF.asItem())
                .add(DecoBlocks.JUNGLE_BOOKSHELF.asItem())
                .add(DecoBlocks.ACACIA_BOOKSHELF.asItem())
                .add(DecoBlocks.DARK_OAK_BOOKSHELF.asItem())
                .add(DecoBlocks.MANGROVE_BOOKSHELF.asItem())
                .add(DecoBlocks.CACTUS_BOOKSHELF.asItem())
                .add(DecoBlocks.WOODEN_BOOKSHELF.asItem())
                .add(DecoBlocks.BAMBOO_BOOKSHELF.asItem())
                .add(DecoBlocks.CHERRY_BOOKSHELF.asItem());

        getOrCreateTagBuilder(DecoTags.Items.DECO_SMITHING_TABLES)
                .add(DecoBlocks.OAK_SMITHING_TABLE.asItem())
                .add(DecoBlocks.SPRUCE_SMITHING_TABLE.asItem())
                .add(DecoBlocks.BIRCH_SMITHING_TABLE.asItem())
                .add(DecoBlocks.ACACIA_SMITHING_TABLE.asItem())
                .add(DecoBlocks.DARK_OAK_SMITHING_TABLE.asItem())
                .add(DecoBlocks.MANGROVE_SMITHING_TABLE.asItem())
                .add(DecoBlocks.JUNGLE_SMITHING_TABLE.asItem())
                .add(DecoBlocks.CACTUS_SMITHING_TABLE.asItem())
                .add(DecoBlocks.BAMBOO_SMITHING_TABLE.asItem())
                .add(DecoBlocks.CHERRY_SMITHING_TABLE.asItem());

        getOrCreateTagBuilder(DecoTags.Items.DECO_BARRELS)
                .add(DecoBlocks.OAK_BARREL.asItem())
                .add(DecoBlocks.SPRUCE_BARREL.asItem())
                .add(DecoBlocks.BIRCH_BARREL.asItem())
                .add(DecoBlocks.JUNGLE_BARREL.asItem())
                .add(DecoBlocks.ACACIA_BARREL.asItem())
                .add(DecoBlocks.DARK_OAK_BARREL.asItem())
                .add(DecoBlocks.MANGROVE_BARREL.asItem())
                .add(DecoBlocks.CACTUS_BARREL.asItem())
                .add(DecoBlocks.CHERRY_BARREL.asItem())
                .add(DecoBlocks.BAMBOO_BARREL.asItem());

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

        getOrCreateTagBuilder(DecoTags.Items.MOSAIC_WOOD)
                .add(DecoBlocks.OAK_MOSAIC.asItem())
                .add(DecoBlocks.BIRCH_MOSAIC.asItem())
                .add(DecoBlocks.SPRUCE_MOSAIC.asItem())
                .add(DecoBlocks.JUNGLE_MOSAIC.asItem())
                .add(DecoBlocks.ACACIA_MOSAIC.asItem())
                .add(DecoBlocks.DARK_OAK_MOSAIC.asItem())
                .add(DecoBlocks.MANGROVE_MOSAIC.asItem())
                .add(DecoBlocks.CHERRY_MOSAIC.asItem())
                .add(DecoBlocks.CACTUS_MOSAIC.asItem())
                .add(DecoBlocks.WOODEN_MOSAIC.asItem());

        getOrCreateTagBuilder(DecoTags.Items.MOSAIC_STAIRS)
                .add(DecoBlocks.OAK_MOSAIC_STAIRS.asItem())
                .add(DecoBlocks.BIRCH_MOSAIC_STAIRS.asItem())
                .add(DecoBlocks.SPRUCE_MOSAIC_STAIRS.asItem())
                .add(DecoBlocks.JUNGLE_MOSAIC_STAIRS.asItem())
                .add(DecoBlocks.ACACIA_MOSAIC_STAIRS.asItem())
                .add(DecoBlocks.DARK_OAK_MOSAIC_STAIRS.asItem())
                .add(DecoBlocks.MANGROVE_MOSAIC_STAIRS.asItem())
                .add(DecoBlocks.CHERRY_MOSAIC_STAIRS.asItem())
                .add(DecoBlocks.CACTUS_MOSAIC_STAIRS.asItem())
                .add(DecoBlocks.WOODEN_MOSAIC_STAIRS.asItem());

        getOrCreateTagBuilder(DecoTags.Items.MOSAIC_SLABS)
                .add(DecoBlocks.OAK_MOSAIC_SLAB.asItem())
                .add(DecoBlocks.BIRCH_MOSAIC_SLAB.asItem())
                .add(DecoBlocks.SPRUCE_MOSAIC_SLAB.asItem())
                .add(DecoBlocks.JUNGLE_MOSAIC_SLAB.asItem())
                .add(DecoBlocks.ACACIA_MOSAIC_SLAB.asItem())
                .add(DecoBlocks.DARK_OAK_MOSAIC_SLAB.asItem())
                .add(DecoBlocks.MANGROVE_MOSAIC_SLAB.asItem())
                .add(DecoBlocks.CHERRY_MOSAIC_SLAB.asItem())
                .add(DecoBlocks.CACTUS_MOSAIC_SLAB.asItem())
                .add(DecoBlocks.WOODEN_MOSAIC_SLAB.asItem());

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
                .add(DecoBlocks.ANCIENT_ROSE.asItem());
    }
}
