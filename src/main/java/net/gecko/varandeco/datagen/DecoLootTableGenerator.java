package net.gecko.varandeco.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.gecko.varandeco.block.DecoBlocks;
import net.gecko.varandeco.item.DecoItems;
import net.minecraft.item.Items;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;

public class DecoLootTableGenerator extends FabricBlockLootTableProvider {
    public DecoLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }
    @Override
    public void generate() {
        addDrop(DecoBlocks.POLISHED_STONE);
        addDrop(DecoBlocks.POLISHED_STONE_STAIRS);
        slabDrops(DecoBlocks.POLISHED_STONE_SLAB);
        addDrop(DecoBlocks.POLISHED_STONE_WALL);

        addDrop(DecoBlocks.STONE_WALL);
        addDrop(DecoBlocks.POLISHED_ANDESITE_WALL);
        addDrop(DecoBlocks.POLISHED_DIORITE_WALL);
        addDrop(DecoBlocks.POLISHED_GRANITE_WALL);

        addDrop(DecoBlocks.SMOOTH_STONE_STAIRS);
        addDrop(DecoBlocks.SMOOTH_STONE_WALL);

        addDrop(DecoBlocks.DRIPSTONE_STAIRS);
        slabDrops(DecoBlocks.DRIPSTONE_SLAB);
        addDrop(DecoBlocks.DRIPSTONE_WALL);
        addDrop(DecoBlocks.CALCITE_STAIRS);
        slabDrops(DecoBlocks.CALCITE_SLAB);
        addDrop(DecoBlocks.CALCITE_WALL);
        addDrop(DecoBlocks.TUFF_STAIRS);
        slabDrops(DecoBlocks.TUFF_SLAB);
        addDrop(DecoBlocks.TUFF_WALL);

        addDrop(DecoBlocks.STONE_TILES);
        addDrop(DecoBlocks.STONE_TILE_STAIRS);
        slabDrops(DecoBlocks.STONE_TILE_SLAB);
        addDrop(DecoBlocks.STONE_TILE_WALL);

        addDrop(DecoBlocks.PACKED_MUD_STAIRS);
        slabDrops(DecoBlocks.PACKED_MUD_SLAB);
        addDrop(DecoBlocks.PACKED_MUD_WALL);

        addDrop(DecoBlocks.RED_NETHER_BRICK_FENCE);
        addDrop(DecoBlocks.NETHER_BRICK_FENCE_GATE);
        addDrop(DecoBlocks.RED_NETHER_BRICK_FENCE_GATE);

        addDrop(DecoBlocks.NETHERRACK_STAIRS);
        slabDrops(DecoBlocks.NETHERRACK_SLAB);
        addDrop(DecoBlocks.NETHERRACK_WALL);

        addDrop(DecoBlocks.MAGMA_STAIRS);
        slabDrops(DecoBlocks.MAGMA_SLAB);
        addDrop(DecoBlocks.MAGMA_WALL);

        addDrop(DecoBlocks.MAGMA_BRICKS);
        addDrop(DecoBlocks.CHISELED_MAGMA_BRICKS);
        addDrop(DecoBlocks.MAGMA_BRICK_STAIRS);
        slabDrops(DecoBlocks.MAGMA_BRICK_SLAB);
        addDrop(DecoBlocks.MAGMA_BRICK_WALL);

        addDrop(DecoBlocks.POLISHED_BLACKSTONE_TILES);
        addDrop(DecoBlocks.POLISHED_BLACKSTONE_TILE_STAIRS);
        slabDrops(DecoBlocks.POLISHED_BLACKSTONE_TILE_SLAB);
        addDrop(DecoBlocks.POLISHED_BLACKSTONE_TILE_WALL);

        addDropWithSilkTouch(DecoBlocks.POLISHED_GLIDED_BLACKSTONE);
        addDropWithSilkTouch(DecoBlocks.CHISELED_GLIDED_BLACKSTONE);

        addDrop(DecoBlocks.SNOW_STAIRS);
        slabDrops(DecoBlocks.SNOW_SLAB);
        addDrop(DecoBlocks.SNOW_WALL);

        addDrop(DecoBlocks.PACKED_ICE_STAIRS);
        slabDrops(DecoBlocks.PACKED_ICE_SLAB);
        addDrop(DecoBlocks.PACKED_ICE_WALL);

        addDrop(DecoBlocks.BLUE_ICE_STAIRS);
        slabDrops(DecoBlocks.BLUE_ICE_SLAB);
        addDrop(DecoBlocks.BLUE_ICE_WALL);

        addDrop(DecoBlocks.SNOW_BRICKS, block -> this.drops(block, DecoItems.SNOW_BRICK, ConstantLootNumberProvider.create(4.0F)));
        addDrop(DecoBlocks.CHISELED_SNOW_BRICKS, block -> this.drops(block, DecoItems.SNOW_BRICK, ConstantLootNumberProvider.create(8.0F)));
        addDrop(DecoBlocks.SNOW_BRICK_STAIRS);
        slabDrops(DecoBlocks.SNOW_BRICK_SLAB);
        addDrop(DecoBlocks.SNOW_BRICK_WALL);

        addDrop(DecoBlocks.ICE_BRICKS);
        addDrop(DecoBlocks.ICE_BRICK_STAIRS);
        slabDrops(DecoBlocks.ICE_BRICK_SLAB);
        addDrop(DecoBlocks.ICE_BRICK_WALL);

        addDropWithSilkTouch(DecoBlocks.BLACK_ICE);

        addDrop(DecoBlocks.CUT_SANDSTONE_STAIRS);
        addDrop(DecoBlocks.CUT_SANDSTONE_WALL);

        addDrop(DecoBlocks.CUT_RED_SANDSTONE_STAIRS);
        addDrop(DecoBlocks.CUT_RED_SANDSTONE_WALL);

        addDrop(DecoBlocks.SMOOTH_SANDSTONE_WALL);
        addDrop(DecoBlocks.SMOOTH_RED_SANDSTONE_WALL);

        addDrop(DecoBlocks.CUT_SANDSTONE_BRICKS);
        addDrop(DecoBlocks.CUT_SANDSTONE_BRICK_STAIRS);
        slabDrops(DecoBlocks.CUT_SANDSTONE_BRICK_SLAB);
        addDrop(DecoBlocks.CUT_SANDSTONE_BRICK_WALL);

        addDrop(DecoBlocks.CUT_RED_SANDSTONE_BRICKS);
        addDrop(DecoBlocks.CUT_RED_SANDSTONE_BRICK_STAIRS);
        slabDrops(DecoBlocks.CUT_RED_SANDSTONE_BRICK_SLAB);
        addDrop(DecoBlocks.CUT_RED_SANDSTONE_BRICK_WALL);

        addDrop(DecoBlocks.CACTUS_PLANKS);
        addDrop(DecoBlocks.CACTUS_PLANK_STAIRS);
        slabDrops(DecoBlocks.CACTUS_PLANK_SLAB);
        addDrop(DecoBlocks.CACTUS_PLANK_FENCE);
        addDrop(DecoBlocks.CACTUS_PLANK_FENCE_GATE);
        addDrop(DecoBlocks.CACTUS_PLANK_PRESSURE_PLATE);
        addDrop(DecoBlocks.CACTUS_PLANK_BUTTON);

        doorDrops(DecoBlocks.CACTUS_DOOR);
        addDrop(DecoBlocks.CACTUS_TRAPDOOR);

        addDrop(DecoBlocks.STANDING_CACTUS_SIGN);
        addDrop(DecoBlocks.WALL_CACTUS_SIGN);

        addDrop(DecoBlocks.PRISMARINE_BRICK_WALL);
        addDrop(DecoBlocks.DARK_PRISMARINE_WALL);

        addDrop(DecoBlocks.CRYSTALLIZED_PRISMARINE);
        addDrop(DecoBlocks.CRYSTALLIZED_PRISMARINE_STAIRS);
        slabDrops(DecoBlocks.CRYSTALLIZED_PRISMARINE_SLAB);
        addDrop(DecoBlocks.CRYSTALLIZED_PRISMARINE_WALL);

        addDrop(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS);
        addDrop(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICK_STAIRS);
        slabDrops(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICK_SLAB);
        addDrop(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICK_WALL);

        addDrop(DecoBlocks.LIGHT_PRISMARINE);
        addDrop(DecoBlocks.LIGHT_PRISMARINE_STAIRS);
        slabDrops(DecoBlocks.LIGHT_PRISMARINE_SLAB);
        addDrop(DecoBlocks.LIGHT_PRISMARINE_WALL);

        addDrop(DecoBlocks.CHISELED_PRISMARINE_BRICKS);
        addDrop(DecoBlocks.CHISELED_CRYSTALLIZED_PRISMARINE_BRICKS);

        addDrop(DecoBlocks.BUBBLE_BLOCK);
        addDrop(DecoBlocks.BUBBLE_STAIRS);
        slabDrops(DecoBlocks.BUBBLE_SLAB);
        addDrop(DecoBlocks.BUBBLE_WALL);

        addDrop(DecoBlocks.BUBBLE_BRICKS);
        addDrop(DecoBlocks.BUBBLE_BRICK_STAIRS);
        slabDrops(DecoBlocks.BUBBLE_BRICK_SLAB);
        addDrop(DecoBlocks.BUBBLE_BRICK_WALL);
        addDrop(DecoBlocks.CHISELED_BUBBLE_BRICKS);

        addDrop(DecoBlocks.SOUL_SOILSTONE);
        addDrop(DecoBlocks.SOUL_SOILSTONE_STAIRS);
        slabDrops(DecoBlocks.SOUL_SOILSTONE_SLAB);
        addDrop(DecoBlocks.SOUL_SOILSTONE_WALL);

        addDrop(DecoBlocks.CUT_SOUL_SOILSTONE);
        addDrop(DecoBlocks.CUT_SOUL_SOILSTONE_STAIRS);
        slabDrops(DecoBlocks.CUT_SOUL_SOILSTONE_SLAB);
        addDrop(DecoBlocks.CUT_SOUL_SOILSTONE_WALL);

        addDrop(DecoBlocks.CHISELED_SOUL_SOILSTONE);

        addDrop(DecoBlocks.SMOOTH_SOUL_SOILSTONE);
        addDrop(DecoBlocks.SMOOTH_SOUL_SOILSTONE_STAIRS);
        slabDrops(DecoBlocks.SMOOTH_SOUL_SOILSTONE_SLAB);
        addDrop(DecoBlocks.SMOOTH_SOUL_SOILSTONE_WALL);

        addDrop(DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS);
        addDrop(DecoBlocks.CUT_SOUL_SOILSTONE_BRICK_STAIRS);
        slabDrops(DecoBlocks.CUT_SOUL_SOILSTONE_BRICK_SLAB);
        addDrop(DecoBlocks.CUT_SOUL_SOILSTONE_BRICK_WALL);

        addDrop(DecoBlocks.QUARTZ_WALL);
        addDrop(DecoBlocks.SMOOTH_QUARTZ_WALL);

        addDrop(DecoBlocks.QUARTZ_BRICK_STAIRS);
        slabDrops(DecoBlocks.QUARTZ_BRICK_SLAB);
        addDrop(DecoBlocks.QUARTZ_BRICK_WALL);

        addDrop(DecoBlocks.CUT_QUARTZ);
        addDrop(DecoBlocks.CUT_QUARTZ_STAIRS);
        slabDrops(DecoBlocks.CUT_QUARTZ_SLAB);
        addDrop(DecoBlocks.CUT_QUARTZ_WALL);

        addDrop(DecoBlocks.CHISELED_RED_NETHER_BRICKS);
        addDrop(DecoBlocks.CRACKED_RED_NETHER_BRICKS);

        addDrop(DecoBlocks.BLUE_NETHER_BRICKS);
        addDrop(DecoBlocks.BLUE_NETHER_BRICK_STAIRS);
        slabDrops(DecoBlocks.BLUE_NETHER_BRICK_SLAB);
        addDrop(DecoBlocks.BLUE_NETHER_BRICK_WALL);
        slabDrops(DecoBlocks.BLUE_NETHER_BRICK_FENCE);
        addDrop(DecoBlocks.BLUE_NETHER_BRICK_FENCE_GATE);

        addDrop(DecoBlocks.CHISELED_BLUE_NETHER_BRICKS);
        addDrop(DecoBlocks.CRACKED_BLUE_NETHER_BRICKS);

        addDrop(DecoBlocks.BIRCH_CRAFTING_TABLE);
        addDrop(DecoBlocks.SPRUCE_CRAFTING_TABLE);
        addDrop(DecoBlocks.JUNGLE_CRAFTING_TABLE);
        addDrop(DecoBlocks.ACACIA_CRAFTING_TABLE);
        addDrop(DecoBlocks.DARK_OAK_CRAFTING_TABLE);
        addDrop(DecoBlocks.MANGROVE_CRAFTING_TABLE);
        addDrop(DecoBlocks.CRIMSON_CRAFTING_TABLE);
        addDrop(DecoBlocks.WARPED_CRAFTING_TABLE);
        addDrop(DecoBlocks.CACTUS_CRAFTING_TABLE);
        addDrop(DecoBlocks.BAMBOO_CRAFTING_TABLE);
        addDrop(DecoBlocks.CHERRY_CRAFTING_TABLE);

        addDrop(DecoBlocks.OAK_BARREL);
        addDrop(DecoBlocks.SPRUCE_BARREL);
        addDrop(DecoBlocks.BIRCH_BARREL);
        addDrop(DecoBlocks.JUNGLE_BARREL);
        addDrop(DecoBlocks.ACACIA_BARREL);
        addDrop(DecoBlocks.DARK_OAK_BARREL);
        addDrop(DecoBlocks.MANGROVE_BARREL);
        addDrop(DecoBlocks.CRIMSON_BARREL);
        addDrop(DecoBlocks.WARPED_BARREL);
        addDrop(DecoBlocks.CACTUS_BARREL);
        addDrop(DecoBlocks.BAMBOO_BARREL);
        addDrop(DecoBlocks.CHERRY_BARREL);

        addDrop(DecoBlocks.BIRCH_LADDER);
        addDrop(DecoBlocks.SPRUCE_LADDER);
        addDrop(DecoBlocks.JUNGLE_LADDER);
        addDrop(DecoBlocks.ACACIA_LADDER);
        addDrop(DecoBlocks.DARK_OAK_LADDER);
        addDrop(DecoBlocks.MANGROVE_LADDER);
        addDrop(DecoBlocks.CRIMSON_LADDER);
        addDrop(DecoBlocks.WARPED_LADDER);
        addDrop(DecoBlocks.CACTUS_LADDER);
        addDrop(DecoBlocks.BAMBOO_LADDER);
        addDrop(DecoBlocks.CHERRY_LADDER);

        addDrop(DecoBlocks.BIRCH_BOOKSHELF, block -> this.drops(block, Items.BOOK, ConstantLootNumberProvider.create(3.0F)));
        addDrop(DecoBlocks.SPRUCE_BOOKSHELF, block -> this.drops(block, Items.BOOK, ConstantLootNumberProvider.create(3.0F)));
        addDrop(DecoBlocks.JUNGLE_BOOKSHELF, block -> this.drops(block, Items.BOOK, ConstantLootNumberProvider.create(3.0F)));
        addDrop(DecoBlocks.ACACIA_BOOKSHELF, block -> this.drops(block, Items.BOOK, ConstantLootNumberProvider.create(3.0F)));
        addDrop(DecoBlocks.DARK_OAK_BOOKSHELF, block -> this.drops(block, Items.BOOK, ConstantLootNumberProvider.create(3.0F)));
        addDrop(DecoBlocks.MANGROVE_BOOKSHELF, block -> this.drops(block, Items.BOOK, ConstantLootNumberProvider.create(3.0F)));
        addDrop(DecoBlocks.CRIMSON_BOOKSHELF, block -> this.drops(block, Items.BOOK, ConstantLootNumberProvider.create(3.0F)));
        addDrop(DecoBlocks.WARPED_BOOKSHELF, block -> this.drops(block, Items.BOOK, ConstantLootNumberProvider.create(3.0F)));
        addDrop(DecoBlocks.CACTUS_BOOKSHELF, block -> this.drops(block, Items.BOOK, ConstantLootNumberProvider.create(3.0F)));
        addDrop(DecoBlocks.BAMBOO_BOOKSHELF, block -> this.drops(block, Items.BOOK, ConstantLootNumberProvider.create(3.0F)));
        addDrop(DecoBlocks.CHERRY_BOOKSHELF, block -> this.drops(block, Items.BOOK, ConstantLootNumberProvider.create(3.0F)));
        
        addDrop(DecoBlocks.OAK_MOSAIC);
        addDrop(DecoBlocks.BIRCH_MOSAIC);
        addDrop(DecoBlocks.SPRUCE_MOSAIC);
        addDrop(DecoBlocks.JUNGLE_MOSAIC);
        addDrop(DecoBlocks.ACACIA_MOSAIC);
        addDrop(DecoBlocks.DARK_OAK_MOSAIC);
        addDrop(DecoBlocks.MANGROVE_MOSAIC);
        addDrop(DecoBlocks.CHERRY_MOSAIC);
        addDrop(DecoBlocks.CRIMSON_MOSAIC);
        addDrop(DecoBlocks.WARPED_MOSAIC);
        addDrop(DecoBlocks.CACTUS_MOSAIC);
        addDrop(DecoBlocks.WOODEN_MOSAIC);
                
        addDrop(DecoBlocks.OAK_SMITHING_TABLE);
        addDrop(DecoBlocks.SPRUCE_SMITHING_TABLE);
        addDrop(DecoBlocks.BIRCH_SMITHING_TABLE);
        addDrop(DecoBlocks.JUNGLE_SMITHING_TABLE);
        addDrop(DecoBlocks.ACACIA_SMITHING_TABLE);
        addDrop(DecoBlocks.DARK_OAK_SMITHING_TABLE);
        addDrop(DecoBlocks.MANGROVE_SMITHING_TABLE);
        addDrop(DecoBlocks.CRIMSON_SMITHING_TABLE);
        addDrop(DecoBlocks.WARPED_SMITHING_TABLE);
        addDrop(DecoBlocks.CACTUS_SMITHING_TABLE);
        addDrop(DecoBlocks.CHERRY_SMITHING_TABLE);
        addDrop(DecoBlocks.BAMBOO_SMITHING_TABLE);

        addDrop(DecoBlocks.OAK_CARTOGRAPHY_TABLE);
        addDrop(DecoBlocks.BIRCH_CARTOGRAPHY_TABLE);
        addDrop(DecoBlocks.SPRUCE_CARTOGRAPHY_TABLE);
        addDrop(DecoBlocks.JUNGLE_CARTOGRAPHY_TABLE);
        addDrop(DecoBlocks.ACACIA_CARTOGRAPHY_TABLE);
        addDrop(DecoBlocks.DARK_OAK_CARTOGRAPHY_TABLE);
        addDrop(DecoBlocks.MANGROVE_CARTOGRAPHY_TABLE);
        addDrop(DecoBlocks.CRIMSON_CARTOGRAPHY_TABLE);
        addDrop(DecoBlocks.WARPED_CARTOGRAPHY_TABLE);
        addDrop(DecoBlocks.CACTUS_CARTOGRAPHY_TABLE);
        addDrop(DecoBlocks.BAMBOO_CARTOGRAPHY_TABLE);
        addDrop(DecoBlocks.CHERRY_CARTOGRAPHY_TABLE);

        addDrop(DecoBlocks.TERRACOTTA_STAIRS);
        slabDrops(DecoBlocks.TERRACOTTA_SLAB);
        addDrop(DecoBlocks.TERRACOTTA_WALL);

        addDrop(DecoBlocks.WHITE_TERRACOTTA_STAIRS);
        slabDrops(DecoBlocks.WHITE_TERRACOTTA_SLAB);
        addDrop(DecoBlocks.WHITE_TERRACOTTA_WALL);
        addDrop(DecoBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS);
        slabDrops(DecoBlocks.LIGHT_GRAY_TERRACOTTA_SLAB);
        addDrop(DecoBlocks.LIGHT_GRAY_TERRACOTTA_WALL);
        addDrop(DecoBlocks.GRAY_TERRACOTTA_STAIRS);
        slabDrops(DecoBlocks.GRAY_TERRACOTTA_SLAB);
        addDrop(DecoBlocks.GRAY_TERRACOTTA_WALL);
        addDrop(DecoBlocks.BLACK_TERRACOTTA_STAIRS);
        slabDrops(DecoBlocks.BLACK_TERRACOTTA_SLAB);
        addDrop(DecoBlocks.BLACK_TERRACOTTA_WALL);
        addDrop(DecoBlocks.BROWN_TERRACOTTA_STAIRS);
        slabDrops(DecoBlocks.BROWN_TERRACOTTA_SLAB);
        addDrop(DecoBlocks.BROWN_TERRACOTTA_WALL);
        addDrop(DecoBlocks.RED_TERRACOTTA_STAIRS);
        slabDrops(DecoBlocks.RED_TERRACOTTA_SLAB);
        addDrop(DecoBlocks.RED_TERRACOTTA_WALL);
        addDrop(DecoBlocks.ORANGE_TERRACOTTA_STAIRS);
        slabDrops(DecoBlocks.ORANGE_TERRACOTTA_SLAB);
        addDrop(DecoBlocks.ORANGE_TERRACOTTA_WALL);
        addDrop(DecoBlocks.YELLOW_TERRACOTTA_STAIRS);
        slabDrops(DecoBlocks.YELLOW_TERRACOTTA_SLAB);
        addDrop(DecoBlocks.YELLOW_TERRACOTTA_WALL);
        addDrop(DecoBlocks.LIME_TERRACOTTA_STAIRS);
        slabDrops(DecoBlocks.LIME_TERRACOTTA_SLAB);
        addDrop(DecoBlocks.LIME_TERRACOTTA_WALL);
        addDrop(DecoBlocks.GREEN_TERRACOTTA_STAIRS);
        slabDrops(DecoBlocks.GREEN_TERRACOTTA_SLAB);
        addDrop(DecoBlocks.GREEN_TERRACOTTA_WALL);
        addDrop(DecoBlocks.CYAN_TERRACOTTA_STAIRS);
        slabDrops(DecoBlocks.CYAN_TERRACOTTA_SLAB);
        addDrop(DecoBlocks.CYAN_TERRACOTTA_WALL);
        addDrop(DecoBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS);
        slabDrops(DecoBlocks.LIGHT_BLUE_TERRACOTTA_SLAB);
        addDrop(DecoBlocks.LIGHT_BLUE_TERRACOTTA_WALL);
        addDrop(DecoBlocks.BLUE_TERRACOTTA_STAIRS);
        slabDrops(DecoBlocks.BLUE_TERRACOTTA_SLAB);
        addDrop(DecoBlocks.BLUE_TERRACOTTA_WALL);
        addDrop(DecoBlocks.PURPLE_TERRACOTTA_STAIRS);
        slabDrops(DecoBlocks.PURPLE_TERRACOTTA_SLAB);
        addDrop(DecoBlocks.PURPLE_TERRACOTTA_WALL);
        addDrop(DecoBlocks.MAGENTA_TERRACOTTA_STAIRS);
        slabDrops(DecoBlocks.MAGENTA_TERRACOTTA_SLAB);
        addDrop(DecoBlocks.MAGENTA_TERRACOTTA_WALL);
        addDrop(DecoBlocks.PINK_TERRACOTTA_STAIRS);
        slabDrops(DecoBlocks.PINK_TERRACOTTA_SLAB);
        addDrop(DecoBlocks.PINK_TERRACOTTA_WALL);

        addDrop(DecoBlocks.WHITE_CONCRETE_STAIRS);
        slabDrops(DecoBlocks.WHITE_CONCRETE_SLAB);
        addDrop(DecoBlocks.WHITE_CONCRETE_WALL);
        addDrop(DecoBlocks.LIGHT_GRAY_CONCRETE_STAIRS);
        slabDrops(DecoBlocks.LIGHT_GRAY_CONCRETE_SLAB);
        addDrop(DecoBlocks.LIGHT_GRAY_CONCRETE_WALL);
        addDrop(DecoBlocks.GRAY_CONCRETE_STAIRS);
        slabDrops(DecoBlocks.GRAY_CONCRETE_SLAB);
        addDrop(DecoBlocks.GRAY_CONCRETE_WALL);
        addDrop(DecoBlocks.BLACK_CONCRETE_STAIRS);
        slabDrops(DecoBlocks.BLACK_CONCRETE_SLAB);
        addDrop(DecoBlocks.BLACK_CONCRETE_WALL);
        addDrop(DecoBlocks.BROWN_CONCRETE_STAIRS);
        slabDrops(DecoBlocks.BROWN_CONCRETE_SLAB);
        addDrop(DecoBlocks.BROWN_CONCRETE_WALL);
        addDrop(DecoBlocks.RED_CONCRETE_STAIRS);
        slabDrops(DecoBlocks.RED_CONCRETE_SLAB);
        addDrop(DecoBlocks.RED_CONCRETE_WALL);
        addDrop(DecoBlocks.ORANGE_CONCRETE_STAIRS);
        slabDrops(DecoBlocks.ORANGE_CONCRETE_SLAB);
        addDrop(DecoBlocks.ORANGE_CONCRETE_WALL);
        addDrop(DecoBlocks.YELLOW_CONCRETE_STAIRS);
        slabDrops(DecoBlocks.YELLOW_CONCRETE_SLAB);
        addDrop(DecoBlocks.YELLOW_CONCRETE_WALL);
        addDrop(DecoBlocks.LIME_CONCRETE_STAIRS);
        slabDrops(DecoBlocks.LIME_CONCRETE_SLAB);
        addDrop(DecoBlocks.LIME_CONCRETE_WALL);
        addDrop(DecoBlocks.GREEN_CONCRETE_STAIRS);
        slabDrops(DecoBlocks.GREEN_CONCRETE_SLAB);
        addDrop(DecoBlocks.GREEN_CONCRETE_WALL);
        addDrop(DecoBlocks.CYAN_CONCRETE_STAIRS);
        slabDrops(DecoBlocks.CYAN_CONCRETE_SLAB);
        addDrop(DecoBlocks.CYAN_CONCRETE_WALL);
        addDrop(DecoBlocks.LIGHT_BLUE_CONCRETE_STAIRS);
        slabDrops(DecoBlocks.LIGHT_BLUE_CONCRETE_SLAB);
        addDrop(DecoBlocks.LIGHT_BLUE_CONCRETE_WALL);
        addDrop(DecoBlocks.BLUE_CONCRETE_STAIRS);
        slabDrops(DecoBlocks.BLUE_CONCRETE_SLAB);
        addDrop(DecoBlocks.BLUE_CONCRETE_WALL);
        addDrop(DecoBlocks.PURPLE_CONCRETE_STAIRS);
        slabDrops(DecoBlocks.PURPLE_CONCRETE_SLAB);
        addDrop(DecoBlocks.PURPLE_CONCRETE_WALL);
        addDrop(DecoBlocks.MAGENTA_CONCRETE_STAIRS);
        slabDrops(DecoBlocks.MAGENTA_CONCRETE_SLAB);
        addDrop(DecoBlocks.MAGENTA_CONCRETE_WALL);
        addDrop(DecoBlocks.PINK_CONCRETE_STAIRS);
        slabDrops(DecoBlocks.PINK_CONCRETE_SLAB);
        addDrop(DecoBlocks.PINK_CONCRETE_WALL);

        addDrop(DecoBlocks.TERRACOTTA_BRICKS);
        addDrop(DecoBlocks.WHITE_TERRACOTTA_BRICKS);
        addDrop(DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS);
        addDrop(DecoBlocks.GRAY_TERRACOTTA_BRICKS);
        addDrop(DecoBlocks.BLACK_TERRACOTTA_BRICKS);
        addDrop(DecoBlocks.BROWN_TERRACOTTA_BRICKS);
        addDrop(DecoBlocks.RED_TERRACOTTA_BRICKS);
        addDrop(DecoBlocks.ORANGE_TERRACOTTA_BRICKS);
        addDrop(DecoBlocks.YELLOW_TERRACOTTA_BRICKS);
        addDrop(DecoBlocks.LIME_TERRACOTTA_BRICKS);
        addDrop(DecoBlocks.GREEN_TERRACOTTA_BRICKS);
        addDrop(DecoBlocks.CYAN_TERRACOTTA_BRICKS);
        addDrop(DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS);
        addDrop(DecoBlocks.BLUE_TERRACOTTA_BRICKS);
        addDrop(DecoBlocks.PURPLE_TERRACOTTA_BRICKS);
        addDrop(DecoBlocks.MAGENTA_TERRACOTTA_BRICKS);
        addDrop(DecoBlocks.PINK_TERRACOTTA_BRICKS);

        addDrop(DecoBlocks.CUT_WHITE_CONCRETE);
        addDrop(DecoBlocks.CUT_LIGHT_GRAY_CONCRETE);
        addDrop(DecoBlocks.CUT_GRAY_CONCRETE);
        addDrop(DecoBlocks.CUT_BLACK_CONCRETE);
        addDrop(DecoBlocks.CUT_BROWN_CONCRETE);
        addDrop(DecoBlocks.CUT_RED_CONCRETE);
        addDrop(DecoBlocks.CUT_YELLOW_CONCRETE);
        addDrop(DecoBlocks.CUT_ORANGE_CONCRETE);
        addDrop(DecoBlocks.CUT_LIME_CONCRETE);
        addDrop(DecoBlocks.CUT_GREEN_CONCRETE);
        addDrop(DecoBlocks.CUT_CYAN_CONCRETE);
        addDrop(DecoBlocks.CUT_LIGHT_BLUE_CONCRETE);
        addDrop(DecoBlocks.CUT_BLUE_CONCRETE);
        addDrop(DecoBlocks.CUT_PURPLE_CONCRETE);
        addDrop(DecoBlocks.CUT_MAGENTA_CONCRETE);
        addDrop(DecoBlocks.CUT_PINK_CONCRETE);

        addDrop(DecoBlocks.WHITE_TERRACOTTA_BRICK_STAIRS);
        slabDrops(DecoBlocks.WHITE_TERRACOTTA_BRICK_SLAB);
        addDrop(DecoBlocks.WHITE_TERRACOTTA_BRICK_WALL);
        addDrop(DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS);
        slabDrops(DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_SLAB);
        addDrop(DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_WALL);
        addDrop(DecoBlocks.GRAY_TERRACOTTA_BRICK_STAIRS);
        slabDrops(DecoBlocks.GRAY_TERRACOTTA_BRICK_SLAB);
        addDrop(DecoBlocks.GRAY_TERRACOTTA_BRICK_WALL);
        addDrop(DecoBlocks.BLACK_TERRACOTTA_BRICK_STAIRS);
        slabDrops(DecoBlocks.BLACK_TERRACOTTA_BRICK_SLAB);
        addDrop(DecoBlocks.BLACK_TERRACOTTA_BRICK_WALL);
        addDrop(DecoBlocks.BROWN_TERRACOTTA_BRICK_STAIRS);
        slabDrops(DecoBlocks.BROWN_TERRACOTTA_BRICK_SLAB);
        addDrop(DecoBlocks.BROWN_TERRACOTTA_BRICK_WALL);
        addDrop(DecoBlocks.RED_TERRACOTTA_BRICK_STAIRS);
        slabDrops(DecoBlocks.RED_TERRACOTTA_BRICK_SLAB);
        addDrop(DecoBlocks.RED_TERRACOTTA_BRICK_WALL);
        addDrop(DecoBlocks.ORANGE_TERRACOTTA_BRICK_STAIRS);
        slabDrops(DecoBlocks.ORANGE_TERRACOTTA_BRICK_SLAB);
        addDrop(DecoBlocks.ORANGE_TERRACOTTA_BRICK_WALL);
        addDrop(DecoBlocks.YELLOW_TERRACOTTA_BRICK_STAIRS);
        slabDrops(DecoBlocks.YELLOW_TERRACOTTA_BRICK_SLAB);
        addDrop(DecoBlocks.YELLOW_TERRACOTTA_BRICK_WALL);
        addDrop(DecoBlocks.LIME_TERRACOTTA_BRICK_STAIRS);
        slabDrops(DecoBlocks.LIME_TERRACOTTA_BRICK_SLAB);
        addDrop(DecoBlocks.LIME_TERRACOTTA_BRICK_WALL);
        addDrop(DecoBlocks.GREEN_TERRACOTTA_BRICK_STAIRS);
        slabDrops(DecoBlocks.GREEN_TERRACOTTA_BRICK_SLAB);
        addDrop(DecoBlocks.GREEN_TERRACOTTA_BRICK_WALL);
        addDrop(DecoBlocks.CYAN_TERRACOTTA_BRICK_STAIRS);
        slabDrops(DecoBlocks.CYAN_TERRACOTTA_BRICK_SLAB);
        addDrop(DecoBlocks.CYAN_TERRACOTTA_BRICK_WALL);
        addDrop(DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS);
        slabDrops(DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_SLAB);
        addDrop(DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_WALL);
        addDrop(DecoBlocks.BLUE_TERRACOTTA_BRICK_STAIRS);
        slabDrops(DecoBlocks.BLUE_TERRACOTTA_BRICK_SLAB);
        addDrop(DecoBlocks.BLUE_TERRACOTTA_BRICK_WALL);
        addDrop(DecoBlocks.PURPLE_TERRACOTTA_BRICK_STAIRS);
        slabDrops(DecoBlocks.PURPLE_TERRACOTTA_BRICK_SLAB);
        addDrop(DecoBlocks.PURPLE_TERRACOTTA_BRICK_WALL);
        addDrop(DecoBlocks.MAGENTA_TERRACOTTA_BRICK_STAIRS);
        slabDrops(DecoBlocks.MAGENTA_TERRACOTTA_BRICK_SLAB);
        addDrop(DecoBlocks.MAGENTA_TERRACOTTA_BRICK_WALL);
        addDrop(DecoBlocks.PINK_TERRACOTTA_BRICK_STAIRS);
        slabDrops(DecoBlocks.PINK_TERRACOTTA_BRICK_SLAB);
        addDrop(DecoBlocks.PINK_TERRACOTTA_BRICK_WALL);

        addDrop(DecoBlocks.CUT_WHITE_CONCRETE_STAIRS);
        slabDrops(DecoBlocks.CUT_WHITE_CONCRETE_SLAB);
        addDrop(DecoBlocks.CUT_WHITE_CONCRETE_WALL);
        addDrop(DecoBlocks.CUT_LIGHT_GRAY_CONCRETE_STAIRS);
        slabDrops(DecoBlocks.CUT_LIGHT_GRAY_CONCRETE_SLAB);
        addDrop(DecoBlocks.CUT_LIGHT_GRAY_CONCRETE_WALL);
        addDrop(DecoBlocks.CUT_GRAY_CONCRETE_STAIRS);
        slabDrops(DecoBlocks.CUT_GRAY_CONCRETE_SLAB);
        addDrop(DecoBlocks.CUT_GRAY_CONCRETE_WALL);
        addDrop(DecoBlocks.CUT_BLACK_CONCRETE_STAIRS);
        slabDrops(DecoBlocks.CUT_BLACK_CONCRETE_SLAB);
        addDrop(DecoBlocks.CUT_BLACK_CONCRETE_WALL);
        addDrop(DecoBlocks.CUT_BROWN_CONCRETE_STAIRS);
        slabDrops(DecoBlocks.CUT_BROWN_CONCRETE_SLAB);
        addDrop(DecoBlocks.CUT_BROWN_CONCRETE_WALL);
        addDrop(DecoBlocks.CUT_RED_CONCRETE_STAIRS);
        slabDrops(DecoBlocks.CUT_RED_CONCRETE_SLAB);
        addDrop(DecoBlocks.CUT_RED_CONCRETE_WALL);
        addDrop(DecoBlocks.CUT_ORANGE_CONCRETE_STAIRS);
        slabDrops(DecoBlocks.CUT_ORANGE_CONCRETE_SLAB);
        addDrop(DecoBlocks.CUT_ORANGE_CONCRETE_WALL);
        addDrop(DecoBlocks.CUT_YELLOW_CONCRETE_STAIRS);
        slabDrops(DecoBlocks.CUT_YELLOW_CONCRETE_SLAB);
        addDrop(DecoBlocks.CUT_YELLOW_CONCRETE_WALL);
        addDrop(DecoBlocks.CUT_LIME_CONCRETE_STAIRS);
        slabDrops(DecoBlocks.CUT_LIME_CONCRETE_SLAB);
        addDrop(DecoBlocks.CUT_LIME_CONCRETE_WALL);
        addDrop(DecoBlocks.CUT_GREEN_CONCRETE_STAIRS);
        slabDrops(DecoBlocks.CUT_GREEN_CONCRETE_SLAB);
        addDrop(DecoBlocks.CUT_GREEN_CONCRETE_WALL);
        addDrop(DecoBlocks.CUT_CYAN_CONCRETE_STAIRS);
        slabDrops(DecoBlocks.CUT_CYAN_CONCRETE_SLAB);
        addDrop(DecoBlocks.CUT_CYAN_CONCRETE_WALL);
        addDrop(DecoBlocks.CUT_LIGHT_BLUE_CONCRETE_STAIRS);
        slabDrops(DecoBlocks.CUT_LIGHT_BLUE_CONCRETE_SLAB);
        addDrop(DecoBlocks.CUT_LIGHT_BLUE_CONCRETE_WALL);
        addDrop(DecoBlocks.CUT_BLUE_CONCRETE_STAIRS);
        slabDrops(DecoBlocks.CUT_BLUE_CONCRETE_SLAB);
        addDrop(DecoBlocks.CUT_BLUE_CONCRETE_WALL);
        addDrop(DecoBlocks.CUT_PURPLE_CONCRETE_STAIRS);
        slabDrops(DecoBlocks.CUT_PURPLE_CONCRETE_SLAB);
        addDrop(DecoBlocks.CUT_PURPLE_CONCRETE_WALL);
        addDrop(DecoBlocks.CUT_MAGENTA_CONCRETE_STAIRS);
        slabDrops(DecoBlocks.CUT_MAGENTA_CONCRETE_SLAB);
        addDrop(DecoBlocks.CUT_MAGENTA_CONCRETE_WALL);
        addDrop(DecoBlocks.CUT_PINK_CONCRETE_STAIRS);
        slabDrops(DecoBlocks.CUT_PINK_CONCRETE_SLAB);
        addDrop(DecoBlocks.CUT_PINK_CONCRETE_WALL);

        addDrop(DecoBlocks.WHITE_CONCRETE_PILLAR);
        addDrop(DecoBlocks.LIGHT_GRAY_CONCRETE_PILLAR);
        addDrop(DecoBlocks.GRAY_CONCRETE_PILLAR);
        addDrop(DecoBlocks.BLACK_CONCRETE_PILLAR);
        addDrop(DecoBlocks.BROWN_CONCRETE_PILLAR);
        addDrop(DecoBlocks.RED_CONCRETE_PILLAR);
        addDrop(DecoBlocks.YELLOW_CONCRETE_PILLAR);
        addDrop(DecoBlocks.ORANGE_CONCRETE_PILLAR);
        addDrop(DecoBlocks.LIME_CONCRETE_PILLAR);
        addDrop(DecoBlocks.GREEN_CONCRETE_PILLAR);
        addDrop(DecoBlocks.CYAN_CONCRETE_PILLAR);
        addDrop(DecoBlocks.LIGHT_BLUE_CONCRETE_PILLAR);
        addDrop(DecoBlocks.BLUE_CONCRETE_PILLAR);
        addDrop(DecoBlocks.PURPLE_CONCRETE_PILLAR);
        addDrop(DecoBlocks.MAGENTA_CONCRETE_PILLAR);
        addDrop(DecoBlocks.PINK_CONCRETE_PILLAR);

        addDropWithSilkTouch(DecoBlocks.TINTED_GLASS_PANE);

        addDrop(DecoBlocks.HARDENED_GLASS);
        addDrop(DecoBlocks.HARDENED_TINTED_GLASS);
        addDrop(DecoBlocks.HARDENED_GLASS_PANE);
        addDrop(DecoBlocks.HARDENED_TINTED_GLASS_PANE);

        addDrop(DecoBlocks.HARDENED_WHITE_STAINED_GLASS);
        addDrop(DecoBlocks.HARDENED_LIGHT_GRAY_STAINED_GLASS);
        addDrop(DecoBlocks.HARDENED_GRAY_STAINED_GLASS);
        addDrop(DecoBlocks.HARDENED_BLACK_STAINED_GLASS);
        addDrop(DecoBlocks.HARDENED_BROWN_STAINED_GLASS);
        addDrop(DecoBlocks.HARDENED_RED_STAINED_GLASS);
        addDrop(DecoBlocks.HARDENED_YELLOW_STAINED_GLASS);
        addDrop(DecoBlocks.HARDENED_ORANGE_STAINED_GLASS);
        addDrop(DecoBlocks.HARDENED_LIME_STAINED_GLASS);
        addDrop(DecoBlocks.HARDENED_GREEN_STAINED_GLASS);
        addDrop(DecoBlocks.HARDENED_CYAN_STAINED_GLASS);
        addDrop(DecoBlocks.HARDENED_LIGHT_BLUE_STAINED_GLASS);
        addDrop(DecoBlocks.HARDENED_BLUE_STAINED_GLASS);
        addDrop(DecoBlocks.HARDENED_PURPLE_STAINED_GLASS);
        addDrop(DecoBlocks.HARDENED_MAGENTA_STAINED_GLASS);
        addDrop(DecoBlocks.HARDENED_PINK_STAINED_GLASS);

        addDrop(DecoBlocks.HARDENED_WHITE_STAINED_GLASS_PANE);
        addDrop(DecoBlocks.HARDENED_LIGHT_GRAY_STAINED_GLASS_PANE);
        addDrop(DecoBlocks.HARDENED_GRAY_STAINED_GLASS_PANE);
        addDrop(DecoBlocks.HARDENED_BLACK_STAINED_GLASS_PANE);
        addDrop(DecoBlocks.HARDENED_BROWN_STAINED_GLASS_PANE);
        addDrop(DecoBlocks.HARDENED_RED_STAINED_GLASS_PANE);
        addDrop(DecoBlocks.HARDENED_YELLOW_STAINED_GLASS_PANE);
        addDrop(DecoBlocks.HARDENED_ORANGE_STAINED_GLASS_PANE);
        addDrop(DecoBlocks.HARDENED_LIME_STAINED_GLASS_PANE);
        addDrop(DecoBlocks.HARDENED_GREEN_STAINED_GLASS_PANE);
        addDrop(DecoBlocks.HARDENED_CYAN_STAINED_GLASS_PANE);
        addDrop(DecoBlocks.HARDENED_LIGHT_BLUE_STAINED_GLASS_PANE);
        addDrop(DecoBlocks.HARDENED_BLUE_STAINED_GLASS_PANE);
        addDrop(DecoBlocks.HARDENED_PURPLE_STAINED_GLASS_PANE);
        addDrop(DecoBlocks.HARDENED_MAGENTA_STAINED_GLASS_PANE);
        addDrop(DecoBlocks.HARDENED_PINK_STAINED_GLASS_PANE);

        addDrop(DecoBlocks.SMOOTH_DEEPSLATE);
        addDrop(DecoBlocks.SMOOTH_DEEPSLATE_STAIRS);
        slabDrops(DecoBlocks.SMOOTH_DEEPSLATE_SLAB);
        addDrop(DecoBlocks.SMOOTH_DEEPSLATE_WALL);

        addDrop(DecoBlocks.DEEPSLATE_FURNACE);

        addDrop(DecoBlocks.SMOOTH_BLACKSTONE);
        addDrop(DecoBlocks.SMOOTH_BLACKSTONE_STAIRS);
        slabDrops(DecoBlocks.SMOOTH_BLACKSTONE_SLAB);
        addDrop(DecoBlocks.SMOOTH_BLACKSTONE_WALL);

        addDrop(DecoBlocks.BLACKSTONE_FURNACE);

        addDrop(DecoBlocks.DEEPSLATE_BLAST_FURNACE);
        addDrop(DecoBlocks.BLACKSTONE_BLAST_FURNACE);

        addDrop(DecoBlocks.DEEPSLATE_SMOKER);
        addDrop(DecoBlocks.BLACKSTONE_SMOKER);

        addDrop(DecoBlocks.DEEPSLATE_STONECUTTER);
        addDrop(DecoBlocks.BLACKSTONE_STONECUTTER);

        addDrop(DecoBlocks.DEEPSLATE_STAIRS);
        slabDrops(DecoBlocks.DEEPSLATE_SLAB);
        addDrop(DecoBlocks.DEEPSLATE_WALL);

        addDrop(DecoBlocks.CHISELED_BRICKS);

        addDrop(DecoBlocks.END_STONE_STAIRS);
        slabDrops(DecoBlocks.END_STONE_SLAB);
        addDrop(DecoBlocks.END_STONE_WALL);

        addDrop(DecoBlocks.CHISELED_END_STONE);

        addDrop(DecoBlocks.SMOOTH_PURPUR);
        addDrop(DecoBlocks.SMOOTH_PURPUR_STAIRS);
        slabDrops(DecoBlocks.SMOOTH_PURPUR_SLAB);
        addDrop(DecoBlocks.SMOOTH_PURPUR_WALL);

        addDrop(DecoBlocks.PURPUR_BRICKS);
        addDrop(DecoBlocks.PURPUR_BRICK_STAIRS);
        slabDrops(DecoBlocks.PURPUR_BRICK_SLAB);
        addDrop(DecoBlocks.PURPUR_BRICK_WALL);

        addDrop(DecoBlocks.CHISELED_PURPUR);

        addDrop(DecoBlocks.VOID_STONE);
        addDrop(DecoBlocks.VOID_STONE_STAIRS);
        slabDrops(DecoBlocks.VOID_STONE_SLAB);
        addDrop(DecoBlocks.VOID_STONE_WALL);

        addDrop(DecoBlocks.VOID_STONE_BRICKS);
        addDrop(DecoBlocks.VOID_STONE_BRICK_STAIRS);
        slabDrops(DecoBlocks.VOID_STONE_BRICK_SLAB);
        addDrop(DecoBlocks.VOID_STONE_BRICK_WALL);

        addDrop(DecoBlocks.CHISELED_VOID_STONE);

        addDrop(DecoBlocks.OBSIDIAN_STAIRS);
        slabDrops(DecoBlocks.OBSIDIAN_SLAB);
        addDrop(DecoBlocks.OBSIDIAN_WALL);

        addDrop(DecoBlocks.OBSIDIAN_BRICKS);
        addDrop(DecoBlocks.OBSIDIAN_BRICK_STAIRS);
        slabDrops(DecoBlocks.OBSIDIAN_BRICK_SLAB);
        addDrop(DecoBlocks.OBSIDIAN_BRICK_WALL);

        addDrop(DecoBlocks.OBSIDIAN_PILLAR);
        addDrop(DecoBlocks.CHISELED_OBSIDIAN);

        addDrop(DecoBlocks.CHARCOAL_BLOCK);
        addDrop(DecoBlocks.FLINT_BLOCK);
        addDrop(DecoBlocks.ECHO_BLOCK);

        addDrop(DecoBlocks.CUT_IRON);
        addDrop(DecoBlocks.CUT_IRON_STAIRS);
        slabDrops(DecoBlocks.CUT_IRON_SLAB);

        addDrop(DecoBlocks.LIGHT_IRON_BARS);
        addDrop(DecoBlocks.HEAVY_IRON_BARS);

        doorDrops(DecoBlocks.GOLD_DOOR);
        addDrop(DecoBlocks.GOLD_TRAPDOOR);

        addDrop(DecoBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE);
        addDrop(DecoBlocks.POLISHED_DEEPSLATE_BUTTON);

        addDrop(DecoBlocks.HEAVY_COPPER_BARS);
        addDrop(DecoBlocks.WAXED_HEAVY_COPPER_BARS);
        addDrop(DecoBlocks.EXPOSED_HEAVY_COPPER_BARS);
        addDrop(DecoBlocks.WAXED_EXPOSED_HEAVY_COPPER_BARS);
        addDrop(DecoBlocks.WEATHERED_HEAVY_COPPER_BARS);
        addDrop(DecoBlocks.WAXED_WEATHERED_HEAVY_COPPER_BARS);
        addDrop(DecoBlocks.OXIDIZED_HEAVY_COPPER_BARS);
        addDrop(DecoBlocks.WAXED_OXIDIZED_HEAVY_COPPER_BARS);

        addDrop(DecoBlocks.LIGHT_COPPER_BARS);
        addDrop(DecoBlocks.WAXED_LIGHT_COPPER_BARS);
        addDrop(DecoBlocks.EXPOSED_LIGHT_COPPER_BARS);
        addDrop(DecoBlocks.WAXED_EXPOSED_LIGHT_COPPER_BARS);
        addDrop(DecoBlocks.WEATHERED_LIGHT_COPPER_BARS);
        addDrop(DecoBlocks.WAXED_WEATHERED_LIGHT_COPPER_BARS);
        addDrop(DecoBlocks.OXIDIZED_LIGHT_COPPER_BARS);
        addDrop(DecoBlocks.WAXED_OXIDIZED_LIGHT_COPPER_BARS);

        addDrop(DecoBlocks.COPPER_BARS);
        addDrop(DecoBlocks.WAXED_COPPER_BARS);
        addDrop(DecoBlocks.EXPOSED_COPPER_BARS);
        addDrop(DecoBlocks.WAXED_EXPOSED_COPPER_BARS);
        addDrop(DecoBlocks.WEATHERED_COPPER_BARS);
        addDrop(DecoBlocks.WAXED_WEATHERED_COPPER_BARS);
        addDrop(DecoBlocks.OXIDIZED_COPPER_BARS);
        addDrop(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS);

        addDrop(DecoBlocks.DEEPSLATE_PRESSURE_PLATE);
        addDrop(DecoBlocks.DEEPSLATE_BUTTON);

        addDrop(DecoBlocks.COBBLED_DEEPSLATE_PRESSURE_PLATE);
        addDrop(DecoBlocks.COBBLED_DEEPSLATE_BUTTON);

        addDrop(DecoBlocks.COBBLESTONE_PRESSURE_PLATE);
        addDrop(DecoBlocks.COBBLESTONE_BUTTON);

        addDrop(DecoBlocks.BLACKSTONE_PRESSURE_PLATE);
        addDrop(DecoBlocks.BLACKSTONE_BUTTON);

        addDrop(DecoBlocks.POLISHED_STONE_PRESSURE_PLATE);
        addDrop(DecoBlocks.POLISHED_STONE_BUTTON);

        addDrop(DecoBlocks.YELLOW_TULIP);
        pottedPlantDrops(DecoBlocks.POTTED_YELLOW_TULIP);
        addDrop(DecoBlocks.PURPLE_TULIP);
        pottedPlantDrops(DecoBlocks.POTTED_PURPLE_TULIP);
        addDrop(DecoBlocks.MAGENTA_TULIP);
        pottedPlantDrops(DecoBlocks.POTTED_MAGENTA_TULIP);
        addDrop(DecoBlocks.BLUE_TULIP);
        pottedPlantDrops(DecoBlocks.POTTED_BLUE_TULIP);
        addDrop(DecoBlocks.BLACK_TULIP);
        pottedPlantDrops(DecoBlocks.POTTED_BLACK_TULIP);
        addDrop(DecoBlocks.GREEN_TULIP);
        pottedPlantDrops(DecoBlocks.POTTED_GREEN_TULIP);
        addDrop(DecoBlocks.CYAN_TULIP);
        pottedPlantDrops(DecoBlocks.POTTED_CYAN_TULIP);

        addDrop(DecoBlocks.BARBERTON_DAISY);
        pottedPlantDrops(DecoBlocks.POTTED_BARBERTON_DAISY);
        addDrop(DecoBlocks.BLUE_EYED_DAISY);
        pottedPlantDrops(DecoBlocks.POTTED_BLUE_EYED_DAISY);
        addDrop(DecoBlocks.GERBERA_DAISY);
        pottedPlantDrops(DecoBlocks.POTTED_GERBERA_DAISY);
        addDrop(DecoBlocks.MICHAELMAS_DAISY);
        pottedPlantDrops(DecoBlocks.POTTED_MICHAELMAS_DAISY);

        addDrop(DecoBlocks.PUFFY_DANDELION);
        pottedPlantDrops(DecoBlocks.POTTED_PUFFY_DANDELION);

        addDrop(DecoBlocks.CALIFORNIA_POPPY);
        pottedPlantDrops(DecoBlocks.POTTED_CALIFORNIA_POPPY);
        addDrop(DecoBlocks.SALMON_POPPY);
        pottedPlantDrops(DecoBlocks.POTTED_SALMON_POPPY);

        addDrop(DecoBlocks.WHITE_ORCHID);
        pottedPlantDrops(DecoBlocks.POTTED_WHITE_ORCHID);
        addDrop(DecoBlocks.YELLOW_ORCHID);
        pottedPlantDrops(DecoBlocks.POTTED_YELLOW_ORCHID);
        addDrop(DecoBlocks.PINK_ORCHID);
        pottedPlantDrops(DecoBlocks.POTTED_PINK_ORCHID);

        addDrop(DecoBlocks.ROSE);
        pottedPlantDrops(DecoBlocks.POTTED_ROSE);
        addDrop(DecoBlocks.ENDER_ROSE);
        pottedPlantDrops(DecoBlocks.POTTED_ENDER_ROSE);

        addDrop(DecoBlocks.PAEONIA);
        pottedPlantDrops(DecoBlocks.POTTED_PAEONIA);
        addDrop(DecoBlocks.LAVENDER);
        pottedPlantDrops(DecoBlocks.POTTED_LAVENDER);

        addDrop(DecoBlocks.COPPER_CHAIN);
        addDrop(DecoBlocks.WAXED_COPPER_CHAIN);
        addDrop(DecoBlocks.EXPOSED_COPPER_CHAIN);
        addDrop(DecoBlocks.WAXED_EXPOSED_COPPER_CHAIN);
        addDrop(DecoBlocks.WEATHERED_COPPER_CHAIN);
        addDrop(DecoBlocks.WAXED_WEATHERED_COPPER_CHAIN);
        addDrop(DecoBlocks.OXIDIZED_COPPER_CHAIN);
        addDrop(DecoBlocks.WAXED_OXIDIZED_COPPER_CHAIN);

        addDrop(DecoBlocks.COPPER_LANTERN);
        addDrop(DecoBlocks.WAXED_COPPER_LANTERN);
        addDrop(DecoBlocks.EXPOSED_COPPER_LANTERN);
        addDrop(DecoBlocks.WAXED_EXPOSED_COPPER_LANTERN);
        addDrop(DecoBlocks.WEATHERED_COPPER_LANTERN);
        addDrop(DecoBlocks.WAXED_WEATHERED_COPPER_LANTERN);
        addDrop(DecoBlocks.OXIDIZED_COPPER_LANTERN);
        addDrop(DecoBlocks.WAXED_OXIDIZED_COPPER_LANTERN);

        addDrop(DecoBlocks.COPPER_SOUL_LANTERN);
        addDrop(DecoBlocks.WAXED_COPPER_SOUL_LANTERN);
        addDrop(DecoBlocks.EXPOSED_COPPER_SOUL_LANTERN);
        addDrop(DecoBlocks.WAXED_EXPOSED_COPPER_SOUL_LANTERN);
        addDrop(DecoBlocks.WEATHERED_COPPER_SOUL_LANTERN);
        addDrop(DecoBlocks.WAXED_WEATHERED_COPPER_SOUL_LANTERN);
        addDrop(DecoBlocks.OXIDIZED_COPPER_SOUL_LANTERN);
        addDrop(DecoBlocks.WAXED_OXIDIZED_COPPER_SOUL_LANTERN);

        addDrop(DecoBlocks.COPPER_WEIGHT_PRESSURE_PLATE);
        addDrop(DecoBlocks.WAXED_COPPER_WEIGHT_PRESSURE_PLATE);
        addDrop(DecoBlocks.EXPOSED_COPPER_WEIGHT_PRESSURE_PLATE);
        addDrop(DecoBlocks.WAXED_EXPOSED_COPPER_WEIGHT_PRESSURE_PLATE);
        addDrop(DecoBlocks.WEATHERED_COPPER_WEIGHT_PRESSURE_PLATE);
        addDrop(DecoBlocks.WAXED_WEATHERED_COPPER_WEIGHT_PRESSURE_PLATE);
        addDrop(DecoBlocks.OXIDIZED_COPPER_WEIGHT_PRESSURE_PLATE);
        addDrop(DecoBlocks.WAXED_OXIDIZED_COPPER_WEIGHT_PRESSURE_PLATE);

        addDrop(DecoBlocks.COPPER_BUTTON);
        addDrop(DecoBlocks.WAXED_COPPER_BUTTON);
        addDrop(DecoBlocks.COPPER_BUTTON);
        addDrop(DecoBlocks.WAXED_COPPER_BUTTON);
        addDrop(DecoBlocks.EXPOSED_COPPER_BUTTON);
        addDrop(DecoBlocks.WAXED_EXPOSED_COPPER_BUTTON);
        addDrop(DecoBlocks.WEATHERED_COPPER_BUTTON);
        addDrop(DecoBlocks.WAXED_WEATHERED_COPPER_BUTTON);
        addDrop(DecoBlocks.OXIDIZED_COPPER_BUTTON);
        addDrop(DecoBlocks.WAXED_OXIDIZED_COPPER_BUTTON);

        addDrop(DecoBlocks.WHITE_BLOCK);
        addDrop(DecoBlocks.LIGHT_GRAY_BLOCK);
        addDrop(DecoBlocks.GRAY_BLOCK);
        addDrop(DecoBlocks.BLACK_BLOCK);
        addDrop(DecoBlocks.BROWN_BLOCK);
        addDrop(DecoBlocks.RED_BLOCK);
        addDrop(DecoBlocks.ORANGE_BLOCK);
        addDrop(DecoBlocks.YELLOW_BLOCK);
        addDrop(DecoBlocks.LIME_BLOCK);
        addDrop(DecoBlocks.GREEN_BLOCK);
        addDrop(DecoBlocks.CYAN_BLOCK);
        addDrop(DecoBlocks.LIGHT_BLUE_BLOCK);
        addDrop(DecoBlocks.BLUE_BLOCK);
        addDrop(DecoBlocks.PURPLE_BLOCK);
        addDrop(DecoBlocks.MAGENTA_BLOCK);
        addDrop(DecoBlocks.PINK_BLOCK);

        addDrop(DecoBlocks.WOODEN_PLANKS);
        addDrop(DecoBlocks.WOODEN_STAIRS);
        slabDrops(DecoBlocks.WOODEN_SLAB);
        addDrop(DecoBlocks.WOODEN_FENCE);
        addDrop(DecoBlocks.WOODEN_FENCE_GATE);
        addDrop(DecoBlocks.WOODEN_PRESSURE_PLATE);
        addDrop(DecoBlocks.WOODEN_BUTTON);

        addDrop(DecoBlocks.WOODEN_LOG);
        addDrop(DecoBlocks.WOODEN_WOOD);
        addDrop(DecoBlocks.STRIPPED_WOODEN_LOG);
        addDrop(DecoBlocks.STRIPPED_WOODEN_WOOD);

        doorDrops(DecoBlocks.WOODEN_DOOR);
        addDrop(DecoBlocks.WOODEN_TRAPDOOR);

        addDrop(DecoBlocks.WOODEN_CRAFTING_TABLE);
        addDrop(DecoBlocks.WOODEN_LADDER);

        addDrop(DecoBlocks.STANDING_WOODEN_SIGN);
        addDrop(DecoBlocks.WALL_WOODEN_SIGN);

        addDrop(DecoBlocks.WOODEN_SAPLING);
        pottedPlantDrops(DecoBlocks.POTTED_WOODEN_SAPLING);
    }
}
