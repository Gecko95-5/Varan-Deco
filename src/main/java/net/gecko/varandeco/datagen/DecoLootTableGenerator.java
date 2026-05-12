package net.gecko.varandeco.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.gecko.varandeco.block.DecoBlocks;
import net.gecko.varandeco.item.DecoItems;
import net.gecko.varandeco.util.DecoTags;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

import java.util.function.BiConsumer;


public class DecoLootTableGenerator extends FabricBlockLootTableProvider {
    public DecoLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }
    @Override
    public void generate() {
        addDrop(DecoBlocks.POLISHED_STONE);
        addDrop(DecoBlocks.POLISHED_STONE_STAIRS);
        addDrop(DecoBlocks.POLISHED_STONE_SLAB, slabDrops(DecoBlocks.POLISHED_STONE_SLAB));
        addDrop(DecoBlocks.POLISHED_STONE_WALL);

        addDrop(DecoBlocks.STONE_WALL);
        addDrop(DecoBlocks.POLISHED_ANDESITE_WALL);
        addDrop(DecoBlocks.POLISHED_DIORITE_WALL);
        addDrop(DecoBlocks.POLISHED_GRANITE_WALL);

        addDrop(DecoBlocks.SMOOTH_STONE_STAIRS);
        addDrop(DecoBlocks.SMOOTH_STONE_WALL);

        addDrop(DecoBlocks.DRIPSTONE_STAIRS);
        addDrop(DecoBlocks.DRIPSTONE_SLAB, slabDrops(DecoBlocks.DRIPSTONE_SLAB));
        addDrop(DecoBlocks.DRIPSTONE_WALL);
        addDrop(DecoBlocks.CALCITE_STAIRS);
        addDrop(DecoBlocks.CALCITE_SLAB, slabDrops(DecoBlocks.CALCITE_SLAB));
        addDrop(DecoBlocks.CALCITE_WALL);
        addDrop(DecoBlocks.TUFF_STAIRS);
        addDrop(DecoBlocks.TUFF_SLAB, slabDrops(DecoBlocks.TUFF_SLAB));
        addDrop(DecoBlocks.TUFF_WALL);

        addDrop(DecoBlocks.STONE_TILES);
        addDrop(DecoBlocks.STONE_TILE_STAIRS);
        addDrop(DecoBlocks.STONE_TILE_SLAB, slabDrops(DecoBlocks.STONE_TILE_SLAB));
        addDrop(DecoBlocks.STONE_TILE_WALL);
        addDrop(DecoBlocks.CRACKED_STONE_TILES);

        addDrop(DecoBlocks.PACKED_MUD_STAIRS);
        addDrop(DecoBlocks.PACKED_MUD_SLAB, slabDrops(DecoBlocks.PACKED_MUD_SLAB));
        addDrop(DecoBlocks.PACKED_MUD_WALL);

        addDrop(DecoBlocks.RED_NETHER_BRICK_FENCE);
        addDrop(DecoBlocks.NETHER_BRICK_FENCE_GATE);
        addDrop(DecoBlocks.RED_NETHER_BRICK_FENCE_GATE);

        addDrop(DecoBlocks.NETHERRACK_STAIRS);
        addDrop(DecoBlocks.NETHERRACK_SLAB, slabDrops(DecoBlocks.NETHERRACK_SLAB));
        addDrop(DecoBlocks.NETHERRACK_WALL);

        addDrop(DecoBlocks.MAGMA_STAIRS);
        addDrop(DecoBlocks.MAGMA_SLAB, slabDrops(DecoBlocks.MAGMA_SLAB));
        addDrop(DecoBlocks.MAGMA_WALL);

        addDrop(DecoBlocks.MAGMA_BRICKS);
        addDrop(DecoBlocks.CHISELED_MAGMA_BRICKS);
        addDrop(DecoBlocks.MAGMA_BRICK_STAIRS);
        addDrop(DecoBlocks.MAGMA_BRICK_SLAB, slabDrops(DecoBlocks.MAGMA_BRICK_SLAB));
        addDrop(DecoBlocks.MAGMA_BRICK_WALL);

        addDrop(DecoBlocks.POLISHED_BLACKSTONE_TILES);
        addDrop(DecoBlocks.POLISHED_BLACKSTONE_TILE_STAIRS);
        addDrop(DecoBlocks.POLISHED_BLACKSTONE_TILE_SLAB, slabDrops(DecoBlocks.POLISHED_BLACKSTONE_TILE_SLAB));
        addDrop(DecoBlocks.POLISHED_BLACKSTONE_TILE_WALL);
        addDrop(DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILES);

        addDropWithSilkTouch(DecoBlocks.POLISHED_GLIDED_BLACKSTONE);
        addDropWithSilkTouch(DecoBlocks.CHISELED_GLIDED_BLACKSTONE);

        addDrop(DecoBlocks.SNOW_STAIRS);
        addDrop(DecoBlocks.SNOW_SLAB, slabDrops(DecoBlocks.SNOW_SLAB));
        addDrop(DecoBlocks.SNOW_WALL);

        addDrop(DecoBlocks.PACKED_ICE_STAIRS);
        addDrop(DecoBlocks.PACKED_ICE_SLAB, slabDrops(DecoBlocks.PACKED_ICE_SLAB));
        addDrop(DecoBlocks.PACKED_ICE_WALL);

        addDrop(DecoBlocks.BLUE_ICE_STAIRS);
        addDrop(DecoBlocks.BLUE_ICE_SLAB, slabDrops(DecoBlocks.BLUE_ICE_SLAB));
        addDrop(DecoBlocks.BLUE_ICE_WALL);

        addDrop(DecoBlocks.SNOW_BRICKS, block -> this.drops(block, DecoItems.SNOW_BRICK, ConstantLootNumberProvider.create(4.0F)));
        addDrop(DecoBlocks.CHISELED_SNOW_BRICKS, block -> this.drops(block, DecoItems.SNOW_BRICK, ConstantLootNumberProvider.create(8.0F)));
        addDrop(DecoBlocks.SNOW_BRICK_STAIRS);
        addDrop(DecoBlocks.SNOW_BRICK_SLAB, slabDrops(DecoBlocks.SNOW_BRICK_SLAB));
        addDrop(DecoBlocks.SNOW_BRICK_WALL);

        addDrop(DecoBlocks.ICE_BRICKS);
        addDrop(DecoBlocks.ICE_BRICK_STAIRS);
        addDrop(DecoBlocks.ICE_BRICK_SLAB, slabDrops(DecoBlocks.ICE_BRICK_SLAB));
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
        addDrop(DecoBlocks.CUT_SANDSTONE_BRICK_SLAB, slabDrops(DecoBlocks.CUT_SANDSTONE_BRICK_SLAB));
        addDrop(DecoBlocks.CUT_SANDSTONE_BRICK_WALL);

        addDrop(DecoBlocks.CUT_RED_SANDSTONE_BRICKS);
        addDrop(DecoBlocks.CUT_RED_SANDSTONE_BRICK_STAIRS);
        addDrop(DecoBlocks.CUT_RED_SANDSTONE_BRICK_SLAB, slabDrops(DecoBlocks.CUT_RED_SANDSTONE_BRICK_SLAB));
        addDrop(DecoBlocks.CUT_RED_SANDSTONE_BRICK_WALL);

        addDrop(DecoBlocks.CACTUS_PLANKS);
        addDrop(DecoBlocks.CACTUS_PLANK_STAIRS);
        addDrop(DecoBlocks.CACTUS_PLANK_SLAB, slabDrops(DecoBlocks.CACTUS_PLANK_SLAB));
        addDrop(DecoBlocks.CACTUS_PLANK_FENCE);
        addDrop(DecoBlocks.CACTUS_PLANK_FENCE_GATE);
        addDrop(DecoBlocks.CACTUS_PLANK_PRESSURE_PLATE);
        addDrop(DecoBlocks.CACTUS_PLANK_BUTTON);

        addDrop(DecoBlocks.CACTUS_DOOR, doorDrops(DecoBlocks.CACTUS_DOOR));
        addDrop(DecoBlocks.CACTUS_TRAPDOOR);

        addDrop(DecoBlocks.STANDING_CACTUS_SIGN);

        addDrop(DecoBlocks.PRISMARINE_BRICK_WALL);
        addDrop(DecoBlocks.DARK_PRISMARINE_WALL);

        addDrop(DecoBlocks.CRYSTALLIZED_PRISMARINE);
        addDrop(DecoBlocks.CRYSTALLIZED_PRISMARINE_STAIRS);
        addDrop(DecoBlocks.CRYSTALLIZED_PRISMARINE_SLAB, slabDrops(DecoBlocks.CRYSTALLIZED_PRISMARINE_SLAB));
        addDrop(DecoBlocks.CRYSTALLIZED_PRISMARINE_WALL);

        addDrop(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS);
        addDrop(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICK_STAIRS);
        addDrop(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICK_SLAB, slabDrops(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICK_SLAB));
        addDrop(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICK_WALL);

        addDrop(DecoBlocks.LIGHT_PRISMARINE);
        addDrop(DecoBlocks.LIGHT_PRISMARINE_STAIRS);
        addDrop(DecoBlocks.LIGHT_PRISMARINE_SLAB, slabDrops(DecoBlocks.LIGHT_PRISMARINE_SLAB));
        addDrop(DecoBlocks.LIGHT_PRISMARINE_WALL);

        addDrop(DecoBlocks.CHISELED_PRISMARINE_BRICKS);
        addDrop(DecoBlocks.CHISELED_CRYSTALLIZED_PRISMARINE_BRICKS);

        addDrop(DecoBlocks.BUBBLE_BLOCK, block -> this.drops(block, DecoItems.BUBBLE_ORB, ConstantLootNumberProvider.create(2.0F)));
        addDrop(DecoBlocks.BUBBLE_STAIRS);
        addDrop(DecoBlocks.BUBBLE_SLAB, slabDrops(DecoBlocks.BUBBLE_SLAB));
        addDrop(DecoBlocks.BUBBLE_WALL);

        addDrop(DecoBlocks.BUBBLE_BRICKS);
        addDrop(DecoBlocks.BUBBLE_BRICK_STAIRS);
        addDrop(DecoBlocks.BUBBLE_BRICK_SLAB, slabDrops(DecoBlocks.BUBBLE_BRICK_SLAB));
        addDrop(DecoBlocks.BUBBLE_BRICK_WALL);
        addDrop(DecoBlocks.CHISELED_BUBBLE_BRICKS);

        addDrop(DecoBlocks.SOUL_SOILSTONE);
        addDrop(DecoBlocks.SOUL_SOILSTONE_STAIRS);
        addDrop(DecoBlocks.SOUL_SOILSTONE_SLAB, slabDrops(DecoBlocks.SOUL_SOILSTONE_SLAB));
        addDrop(DecoBlocks.SOUL_SOILSTONE_WALL);

        addDrop(DecoBlocks.CUT_SOUL_SOILSTONE);
        addDrop(DecoBlocks.CUT_SOUL_SOILSTONE_STAIRS);
        addDrop(DecoBlocks.CUT_SOUL_SOILSTONE_SLAB, slabDrops(DecoBlocks.CUT_SOUL_SOILSTONE_SLAB));
        addDrop(DecoBlocks.CUT_SOUL_SOILSTONE_WALL);

        addDrop(DecoBlocks.CHISELED_SOUL_SOILSTONE);

        addDrop(DecoBlocks.SMOOTH_SOUL_SOILSTONE);
        addDrop(DecoBlocks.SMOOTH_SOUL_SOILSTONE_STAIRS);
        addDrop(DecoBlocks.SMOOTH_SOUL_SOILSTONE_SLAB, slabDrops(DecoBlocks.SMOOTH_SOUL_SOILSTONE_SLAB));
        addDrop(DecoBlocks.SMOOTH_SOUL_SOILSTONE_WALL);

        addDrop(DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS);
        addDrop(DecoBlocks.CUT_SOUL_SOILSTONE_BRICK_STAIRS);
        addDrop(DecoBlocks.CUT_SOUL_SOILSTONE_BRICK_SLAB, slabDrops(DecoBlocks.CUT_SOUL_SOILSTONE_BRICK_SLAB));
        addDrop(DecoBlocks.CUT_SOUL_SOILSTONE_BRICK_WALL);

        addDrop(DecoBlocks.QUARTZ_WALL);
        addDrop(DecoBlocks.SMOOTH_QUARTZ_WALL);

        addDrop(DecoBlocks.QUARTZ_BRICK_STAIRS);
        addDrop(DecoBlocks.QUARTZ_BRICK_SLAB, slabDrops(DecoBlocks.QUARTZ_BRICK_SLAB));
        addDrop(DecoBlocks.QUARTZ_BRICK_WALL);

        addDrop(DecoBlocks.CUT_QUARTZ);
        addDrop(DecoBlocks.CUT_QUARTZ_STAIRS);
        addDrop(DecoBlocks.CUT_QUARTZ_SLAB, slabDrops(DecoBlocks.CUT_QUARTZ_SLAB));
        addDrop(DecoBlocks.CUT_QUARTZ_WALL);

        addDrop(DecoBlocks.CHISELED_RED_NETHER_BRICKS);
        addDrop(DecoBlocks.CRACKED_RED_NETHER_BRICKS);

        addDrop(DecoBlocks.BLUE_NETHER_BRICKS);
        addDrop(DecoBlocks.BLUE_NETHER_BRICK_STAIRS);
        addDrop(DecoBlocks.BLUE_NETHER_BRICK_SLAB, slabDrops(DecoBlocks.BLUE_NETHER_BRICK_SLAB));
        addDrop(DecoBlocks.BLUE_NETHER_BRICK_WALL);
        addDrop(DecoBlocks.BLUE_NETHER_BRICK_FENCE);
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

        addDrop(DecoBlocks.BIRCH_LADDER);
        addDrop(DecoBlocks.SPRUCE_LADDER);
        addDrop(DecoBlocks.JUNGLE_LADDER);
        addDrop(DecoBlocks.ACACIA_LADDER);
        addDrop(DecoBlocks.DARK_OAK_LADDER);
        addDrop(DecoBlocks.MANGROVE_LADDER);
        addDrop(DecoBlocks.CRIMSON_LADDER);
        addDrop(DecoBlocks.WARPED_LADDER);
        addDrop(DecoBlocks.CACTUS_LADDER);

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

        addDrop(DecoBlocks.TERRACOTTA_STAIRS);
        addDrop(DecoBlocks.TERRACOTTA_SLAB, slabDrops(DecoBlocks.TERRACOTTA_SLAB));
        addDrop(DecoBlocks.TERRACOTTA_WALL);

        addDrop(DecoBlocks.WHITE_TERRACOTTA_STAIRS);
        addDrop(DecoBlocks.WHITE_TERRACOTTA_SLAB, slabDrops(DecoBlocks.WHITE_TERRACOTTA_SLAB));
        addDrop(DecoBlocks.WHITE_TERRACOTTA_WALL);
        addDrop(DecoBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS);
        addDrop(DecoBlocks.LIGHT_GRAY_TERRACOTTA_SLAB, slabDrops(DecoBlocks.LIGHT_GRAY_TERRACOTTA_SLAB));
        addDrop(DecoBlocks.LIGHT_GRAY_TERRACOTTA_WALL);
        addDrop(DecoBlocks.GRAY_TERRACOTTA_STAIRS);
        addDrop(DecoBlocks.GRAY_TERRACOTTA_SLAB, slabDrops(DecoBlocks.GRAY_TERRACOTTA_SLAB));
        addDrop(DecoBlocks.GRAY_TERRACOTTA_WALL);
        addDrop(DecoBlocks.BLACK_TERRACOTTA_STAIRS);
        addDrop(DecoBlocks.BLACK_TERRACOTTA_SLAB, slabDrops(DecoBlocks.BLACK_TERRACOTTA_SLAB));
        addDrop(DecoBlocks.BLACK_TERRACOTTA_WALL);
        addDrop(DecoBlocks.BROWN_TERRACOTTA_STAIRS);
        addDrop(DecoBlocks.BROWN_TERRACOTTA_SLAB, slabDrops(DecoBlocks.BROWN_TERRACOTTA_SLAB));
        addDrop(DecoBlocks.BROWN_TERRACOTTA_WALL);
        addDrop(DecoBlocks.RED_TERRACOTTA_STAIRS);
        addDrop(DecoBlocks.RED_TERRACOTTA_SLAB, slabDrops(DecoBlocks.RED_TERRACOTTA_SLAB));
        addDrop(DecoBlocks.RED_TERRACOTTA_WALL);
        addDrop(DecoBlocks.ORANGE_TERRACOTTA_STAIRS);
        addDrop(DecoBlocks.ORANGE_TERRACOTTA_SLAB, slabDrops(DecoBlocks.ORANGE_TERRACOTTA_SLAB));
        addDrop(DecoBlocks.ORANGE_TERRACOTTA_WALL);
        addDrop(DecoBlocks.YELLOW_TERRACOTTA_STAIRS);
        addDrop(DecoBlocks.YELLOW_TERRACOTTA_SLAB, slabDrops(DecoBlocks.YELLOW_TERRACOTTA_SLAB));
        addDrop(DecoBlocks.YELLOW_TERRACOTTA_WALL);
        addDrop(DecoBlocks.LIME_TERRACOTTA_STAIRS);
        addDrop(DecoBlocks.LIME_TERRACOTTA_SLAB, slabDrops(DecoBlocks.LIME_TERRACOTTA_SLAB));
        addDrop(DecoBlocks.LIME_TERRACOTTA_WALL);
        addDrop(DecoBlocks.GREEN_TERRACOTTA_STAIRS);
        addDrop(DecoBlocks.GREEN_TERRACOTTA_SLAB, slabDrops(DecoBlocks.GREEN_TERRACOTTA_SLAB));
        addDrop(DecoBlocks.GREEN_TERRACOTTA_WALL);
        addDrop(DecoBlocks.CYAN_TERRACOTTA_STAIRS);
        addDrop(DecoBlocks.CYAN_TERRACOTTA_SLAB, slabDrops(DecoBlocks.CYAN_TERRACOTTA_SLAB));
        addDrop(DecoBlocks.CYAN_TERRACOTTA_WALL);
        addDrop(DecoBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS);
        addDrop(DecoBlocks.LIGHT_BLUE_TERRACOTTA_SLAB, slabDrops(DecoBlocks.LIGHT_BLUE_TERRACOTTA_SLAB));
        addDrop(DecoBlocks.LIGHT_BLUE_TERRACOTTA_WALL);
        addDrop(DecoBlocks.BLUE_TERRACOTTA_STAIRS);
        addDrop(DecoBlocks.BLUE_TERRACOTTA_SLAB, slabDrops(DecoBlocks.BLUE_TERRACOTTA_SLAB));
        addDrop(DecoBlocks.BLUE_TERRACOTTA_WALL);
        addDrop(DecoBlocks.PURPLE_TERRACOTTA_STAIRS);
        addDrop(DecoBlocks.PURPLE_TERRACOTTA_SLAB, slabDrops(DecoBlocks.PURPLE_TERRACOTTA_SLAB));
        addDrop(DecoBlocks.PURPLE_TERRACOTTA_WALL);
        addDrop(DecoBlocks.MAGENTA_TERRACOTTA_STAIRS);
        addDrop(DecoBlocks.MAGENTA_TERRACOTTA_SLAB, slabDrops(DecoBlocks.MAGENTA_TERRACOTTA_SLAB));
        addDrop(DecoBlocks.MAGENTA_TERRACOTTA_WALL);
        addDrop(DecoBlocks.PINK_TERRACOTTA_STAIRS);
        addDrop(DecoBlocks.PINK_TERRACOTTA_SLAB, slabDrops(DecoBlocks.PINK_TERRACOTTA_SLAB));
        addDrop(DecoBlocks.PINK_TERRACOTTA_WALL);

        addDrop(DecoBlocks.WHITE_CONCRETE_STAIRS);
        addDrop(DecoBlocks.WHITE_CONCRETE_SLAB, slabDrops(DecoBlocks.WHITE_CONCRETE_SLAB));
        addDrop(DecoBlocks.WHITE_CONCRETE_WALL);
        addDrop(DecoBlocks.LIGHT_GRAY_CONCRETE_STAIRS);
        addDrop(DecoBlocks.LIGHT_GRAY_CONCRETE_SLAB, slabDrops(DecoBlocks.LIGHT_GRAY_CONCRETE_SLAB));
        addDrop(DecoBlocks.LIGHT_GRAY_CONCRETE_WALL);
        addDrop(DecoBlocks.GRAY_CONCRETE_STAIRS);
        addDrop(DecoBlocks.GRAY_CONCRETE_SLAB, slabDrops(DecoBlocks.GRAY_CONCRETE_SLAB));
        addDrop(DecoBlocks.GRAY_CONCRETE_WALL);
        addDrop(DecoBlocks.BLACK_CONCRETE_STAIRS);
        addDrop(DecoBlocks.BLACK_CONCRETE_SLAB, slabDrops(DecoBlocks.BLACK_CONCRETE_SLAB));
        addDrop(DecoBlocks.BLACK_CONCRETE_WALL);
        addDrop(DecoBlocks.BROWN_CONCRETE_STAIRS);
        addDrop(DecoBlocks.BROWN_CONCRETE_SLAB, slabDrops(DecoBlocks.BROWN_CONCRETE_SLAB));
        addDrop(DecoBlocks.BROWN_CONCRETE_WALL);
        addDrop(DecoBlocks.RED_CONCRETE_STAIRS);
        addDrop(DecoBlocks.RED_CONCRETE_SLAB, slabDrops(DecoBlocks.RED_CONCRETE_SLAB));
        addDrop(DecoBlocks.RED_CONCRETE_WALL);
        addDrop(DecoBlocks.ORANGE_CONCRETE_STAIRS);
        addDrop(DecoBlocks.ORANGE_CONCRETE_SLAB, slabDrops(DecoBlocks.ORANGE_CONCRETE_SLAB));
        addDrop(DecoBlocks.ORANGE_CONCRETE_WALL);
        addDrop(DecoBlocks.YELLOW_CONCRETE_STAIRS);
        addDrop(DecoBlocks.YELLOW_CONCRETE_SLAB, slabDrops(DecoBlocks.YELLOW_CONCRETE_SLAB));
        addDrop(DecoBlocks.YELLOW_CONCRETE_WALL);
        addDrop(DecoBlocks.LIME_CONCRETE_STAIRS);
        addDrop(DecoBlocks.LIME_CONCRETE_SLAB, slabDrops(DecoBlocks.LIME_CONCRETE_SLAB));
        addDrop(DecoBlocks.LIME_CONCRETE_WALL);
        addDrop(DecoBlocks.GREEN_CONCRETE_STAIRS);
        addDrop(DecoBlocks.GREEN_CONCRETE_SLAB, slabDrops(DecoBlocks.GREEN_CONCRETE_SLAB));
        addDrop(DecoBlocks.GREEN_CONCRETE_WALL);
        addDrop(DecoBlocks.CYAN_CONCRETE_STAIRS);
        addDrop(DecoBlocks.CYAN_CONCRETE_SLAB, slabDrops(DecoBlocks.CYAN_CONCRETE_SLAB));
        addDrop(DecoBlocks.CYAN_CONCRETE_WALL);
        addDrop(DecoBlocks.LIGHT_BLUE_CONCRETE_STAIRS);
        addDrop(DecoBlocks.LIGHT_BLUE_CONCRETE_SLAB, slabDrops(DecoBlocks.LIGHT_BLUE_CONCRETE_SLAB));
        addDrop(DecoBlocks.LIGHT_BLUE_CONCRETE_WALL);
        addDrop(DecoBlocks.BLUE_CONCRETE_STAIRS);
        addDrop(DecoBlocks.BLUE_CONCRETE_SLAB, slabDrops(DecoBlocks.BLUE_CONCRETE_SLAB));
        addDrop(DecoBlocks.BLUE_CONCRETE_WALL);
        addDrop(DecoBlocks.PURPLE_CONCRETE_STAIRS);
        addDrop(DecoBlocks.PURPLE_CONCRETE_SLAB, slabDrops(DecoBlocks.PURPLE_CONCRETE_SLAB));
        addDrop(DecoBlocks.PURPLE_CONCRETE_WALL);
        addDrop(DecoBlocks.MAGENTA_CONCRETE_STAIRS);
        addDrop(DecoBlocks.MAGENTA_CONCRETE_SLAB, slabDrops(DecoBlocks.MAGENTA_CONCRETE_SLAB));
        addDrop(DecoBlocks.MAGENTA_CONCRETE_WALL);
        addDrop(DecoBlocks.PINK_CONCRETE_STAIRS);
        addDrop(DecoBlocks.PINK_CONCRETE_SLAB, slabDrops(DecoBlocks.PINK_CONCRETE_SLAB));
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
        addDrop(DecoBlocks.WHITE_TERRACOTTA_BRICK_SLAB, slabDrops(DecoBlocks.WHITE_TERRACOTTA_BRICK_SLAB));
        addDrop(DecoBlocks.WHITE_TERRACOTTA_BRICK_WALL);
        addDrop(DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS);
        addDrop(DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_SLAB, slabDrops(DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_SLAB));
        addDrop(DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_WALL);
        addDrop(DecoBlocks.GRAY_TERRACOTTA_BRICK_STAIRS);
        addDrop(DecoBlocks.GRAY_TERRACOTTA_BRICK_SLAB, slabDrops(DecoBlocks.GRAY_TERRACOTTA_BRICK_SLAB));
        addDrop(DecoBlocks.GRAY_TERRACOTTA_BRICK_WALL);
        addDrop(DecoBlocks.BLACK_TERRACOTTA_BRICK_STAIRS);
        addDrop(DecoBlocks.BLACK_TERRACOTTA_BRICK_SLAB, slabDrops(DecoBlocks.BLACK_TERRACOTTA_BRICK_SLAB));
        addDrop(DecoBlocks.BLACK_TERRACOTTA_BRICK_WALL);
        addDrop(DecoBlocks.BROWN_TERRACOTTA_BRICK_STAIRS);
        addDrop(DecoBlocks.BROWN_TERRACOTTA_BRICK_SLAB, slabDrops(DecoBlocks.BROWN_TERRACOTTA_BRICK_SLAB));
        addDrop(DecoBlocks.BROWN_TERRACOTTA_BRICK_WALL);
        addDrop(DecoBlocks.RED_TERRACOTTA_BRICK_STAIRS);
        addDrop(DecoBlocks.RED_TERRACOTTA_BRICK_SLAB, slabDrops(DecoBlocks.RED_TERRACOTTA_BRICK_SLAB));
        addDrop(DecoBlocks.RED_TERRACOTTA_BRICK_WALL);
        addDrop(DecoBlocks.ORANGE_TERRACOTTA_BRICK_STAIRS);
        addDrop(DecoBlocks.ORANGE_TERRACOTTA_BRICK_SLAB, slabDrops(DecoBlocks.ORANGE_TERRACOTTA_BRICK_SLAB));
        addDrop(DecoBlocks.ORANGE_TERRACOTTA_BRICK_WALL);
        addDrop(DecoBlocks.YELLOW_TERRACOTTA_BRICK_STAIRS);
        addDrop(DecoBlocks.YELLOW_TERRACOTTA_BRICK_SLAB, slabDrops(DecoBlocks.YELLOW_TERRACOTTA_BRICK_SLAB));
        addDrop(DecoBlocks.YELLOW_TERRACOTTA_BRICK_WALL);
        addDrop(DecoBlocks.LIME_TERRACOTTA_BRICK_STAIRS);
        addDrop(DecoBlocks.LIME_TERRACOTTA_BRICK_SLAB, slabDrops(DecoBlocks.LIME_TERRACOTTA_BRICK_SLAB));
        addDrop(DecoBlocks.LIME_TERRACOTTA_BRICK_WALL);
        addDrop(DecoBlocks.GREEN_TERRACOTTA_BRICK_STAIRS);
        addDrop(DecoBlocks.GREEN_TERRACOTTA_BRICK_SLAB, slabDrops(DecoBlocks.GREEN_TERRACOTTA_BRICK_SLAB));
        addDrop(DecoBlocks.GREEN_TERRACOTTA_BRICK_WALL);
        addDrop(DecoBlocks.CYAN_TERRACOTTA_BRICK_STAIRS);
        addDrop(DecoBlocks.CYAN_TERRACOTTA_BRICK_SLAB, slabDrops(DecoBlocks.CYAN_TERRACOTTA_BRICK_SLAB));
        addDrop(DecoBlocks.CYAN_TERRACOTTA_BRICK_WALL);
        addDrop(DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS);
        addDrop(DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_SLAB, slabDrops(DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_SLAB));
        addDrop(DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_WALL);
        addDrop(DecoBlocks.BLUE_TERRACOTTA_BRICK_STAIRS);
        addDrop(DecoBlocks.BLUE_TERRACOTTA_BRICK_SLAB, slabDrops(DecoBlocks.BLUE_TERRACOTTA_BRICK_SLAB));
        addDrop(DecoBlocks.BLUE_TERRACOTTA_BRICK_WALL);
        addDrop(DecoBlocks.PURPLE_TERRACOTTA_BRICK_STAIRS);
        addDrop(DecoBlocks.PURPLE_TERRACOTTA_BRICK_SLAB, slabDrops(DecoBlocks.PURPLE_TERRACOTTA_BRICK_SLAB));
        addDrop(DecoBlocks.PURPLE_TERRACOTTA_BRICK_WALL);
        addDrop(DecoBlocks.MAGENTA_TERRACOTTA_BRICK_STAIRS);
        addDrop(DecoBlocks.MAGENTA_TERRACOTTA_BRICK_SLAB, slabDrops(DecoBlocks.MAGENTA_TERRACOTTA_BRICK_SLAB));
        addDrop(DecoBlocks.MAGENTA_TERRACOTTA_BRICK_WALL);
        addDrop(DecoBlocks.PINK_TERRACOTTA_BRICK_STAIRS);
        addDrop(DecoBlocks.PINK_TERRACOTTA_BRICK_SLAB, slabDrops(DecoBlocks.PINK_TERRACOTTA_BRICK_SLAB));
        addDrop(DecoBlocks.PINK_TERRACOTTA_BRICK_WALL);

        addDrop(DecoBlocks.CUT_WHITE_CONCRETE_STAIRS);
        addDrop(DecoBlocks.CUT_WHITE_CONCRETE_SLAB, slabDrops(DecoBlocks.CUT_WHITE_CONCRETE_SLAB));
        addDrop(DecoBlocks.CUT_WHITE_CONCRETE_WALL);
        addDrop(DecoBlocks.CUT_LIGHT_GRAY_CONCRETE_STAIRS);
        addDrop(DecoBlocks.CUT_LIGHT_GRAY_CONCRETE_SLAB, slabDrops(DecoBlocks.CUT_LIGHT_GRAY_CONCRETE_SLAB));
        addDrop(DecoBlocks.CUT_LIGHT_GRAY_CONCRETE_WALL);
        addDrop(DecoBlocks.CUT_GRAY_CONCRETE_STAIRS);
        addDrop(DecoBlocks.CUT_GRAY_CONCRETE_SLAB, slabDrops(DecoBlocks.CUT_GRAY_CONCRETE_SLAB));
        addDrop(DecoBlocks.CUT_GRAY_CONCRETE_WALL);
        addDrop(DecoBlocks.CUT_BLACK_CONCRETE_STAIRS);
        addDrop(DecoBlocks.CUT_BLACK_CONCRETE_SLAB, slabDrops(DecoBlocks.CUT_BLACK_CONCRETE_SLAB));
        addDrop(DecoBlocks.CUT_BLACK_CONCRETE_WALL);
        addDrop(DecoBlocks.CUT_BROWN_CONCRETE_STAIRS);
        addDrop(DecoBlocks.CUT_BROWN_CONCRETE_SLAB, slabDrops(DecoBlocks.CUT_BROWN_CONCRETE_SLAB));
        addDrop(DecoBlocks.CUT_BROWN_CONCRETE_WALL);
        addDrop(DecoBlocks.CUT_RED_CONCRETE_STAIRS);
        addDrop(DecoBlocks.CUT_RED_CONCRETE_SLAB, slabDrops(DecoBlocks.CUT_RED_CONCRETE_SLAB));
        addDrop(DecoBlocks.CUT_RED_CONCRETE_WALL);
        addDrop(DecoBlocks.CUT_ORANGE_CONCRETE_STAIRS);
        addDrop(DecoBlocks.CUT_ORANGE_CONCRETE_SLAB, slabDrops(DecoBlocks.CUT_ORANGE_CONCRETE_SLAB));
        addDrop(DecoBlocks.CUT_ORANGE_CONCRETE_WALL);
        addDrop(DecoBlocks.CUT_YELLOW_CONCRETE_STAIRS);
        addDrop(DecoBlocks.CUT_YELLOW_CONCRETE_SLAB, slabDrops(DecoBlocks.CUT_YELLOW_CONCRETE_SLAB));
        addDrop(DecoBlocks.CUT_YELLOW_CONCRETE_WALL);
        addDrop(DecoBlocks.CUT_LIME_CONCRETE_STAIRS);
        addDrop(DecoBlocks.CUT_LIME_CONCRETE_SLAB, slabDrops(DecoBlocks.CUT_LIME_CONCRETE_SLAB));
        addDrop(DecoBlocks.CUT_LIME_CONCRETE_WALL);
        addDrop(DecoBlocks.CUT_GREEN_CONCRETE_STAIRS);
        addDrop(DecoBlocks.CUT_GREEN_CONCRETE_SLAB, slabDrops(DecoBlocks.CUT_GREEN_CONCRETE_SLAB));
        addDrop(DecoBlocks.CUT_GREEN_CONCRETE_WALL);
        addDrop(DecoBlocks.CUT_CYAN_CONCRETE_STAIRS);
        addDrop(DecoBlocks.CUT_CYAN_CONCRETE_SLAB, slabDrops(DecoBlocks.CUT_CYAN_CONCRETE_SLAB));
        addDrop(DecoBlocks.CUT_CYAN_CONCRETE_WALL);
        addDrop(DecoBlocks.CUT_LIGHT_BLUE_CONCRETE_STAIRS);
        addDrop(DecoBlocks.CUT_LIGHT_BLUE_CONCRETE_SLAB, slabDrops(DecoBlocks.CUT_LIGHT_BLUE_CONCRETE_SLAB));
        addDrop(DecoBlocks.CUT_LIGHT_BLUE_CONCRETE_WALL);
        addDrop(DecoBlocks.CUT_BLUE_CONCRETE_STAIRS);
        addDrop(DecoBlocks.CUT_BLUE_CONCRETE_SLAB, slabDrops(DecoBlocks.CUT_BLUE_CONCRETE_SLAB));
        addDrop(DecoBlocks.CUT_BLUE_CONCRETE_WALL);
        addDrop(DecoBlocks.CUT_PURPLE_CONCRETE_STAIRS);
        addDrop(DecoBlocks.CUT_PURPLE_CONCRETE_SLAB, slabDrops(DecoBlocks.CUT_PURPLE_CONCRETE_SLAB));
        addDrop(DecoBlocks.CUT_PURPLE_CONCRETE_WALL);
        addDrop(DecoBlocks.CUT_MAGENTA_CONCRETE_STAIRS);
        addDrop(DecoBlocks.CUT_MAGENTA_CONCRETE_SLAB, slabDrops(DecoBlocks.CUT_MAGENTA_CONCRETE_SLAB));
        addDrop(DecoBlocks.CUT_MAGENTA_CONCRETE_WALL);
        addDrop(DecoBlocks.CUT_PINK_CONCRETE_STAIRS);
        addDrop(DecoBlocks.CUT_PINK_CONCRETE_SLAB, slabDrops(DecoBlocks.CUT_PINK_CONCRETE_SLAB));
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
        addDrop(DecoBlocks.SMOOTH_DEEPSLATE_SLAB, slabDrops(DecoBlocks.SMOOTH_DEEPSLATE_SLAB));
        addDrop(DecoBlocks.SMOOTH_DEEPSLATE_WALL);

        addDrop(DecoBlocks.DEEPSLATE_FURNACE);

        addDrop(DecoBlocks.SMOOTH_BLACKSTONE);
        addDrop(DecoBlocks.SMOOTH_BLACKSTONE_STAIRS);
        addDrop(DecoBlocks.SMOOTH_BLACKSTONE_SLAB, slabDrops(DecoBlocks.SMOOTH_BLACKSTONE_SLAB));
        addDrop(DecoBlocks.SMOOTH_BLACKSTONE_WALL);

        addDrop(DecoBlocks.BLACKSTONE_FURNACE);

        addDrop(DecoBlocks.DEEPSLATE_BLAST_FURNACE);
        addDrop(DecoBlocks.BLACKSTONE_BLAST_FURNACE);

        addDrop(DecoBlocks.DEEPSLATE_SMOKER);
        addDrop(DecoBlocks.BLACKSTONE_SMOKER);

        addDrop(DecoBlocks.DEEPSLATE_STONECUTTER);
        addDrop(DecoBlocks.BLACKSTONE_STONECUTTER);

        addDrop(DecoBlocks.DEEPSLATE_STAIRS);
        addDrop(DecoBlocks.DEEPSLATE_SLAB, slabDrops(DecoBlocks.DEEPSLATE_SLAB));
        addDrop(DecoBlocks.DEEPSLATE_WALL);

        addDrop(DecoBlocks.CHISELED_BRICKS);

        addDrop(DecoBlocks.END_STONE_STAIRS);
        addDrop(DecoBlocks.END_STONE_SLAB, slabDrops(DecoBlocks.END_STONE_SLAB));
        addDrop(DecoBlocks.END_STONE_WALL);

        addDrop(DecoBlocks.CHISELED_END_STONE);

        addDrop(DecoBlocks.SMOOTH_PURPUR);
        addDrop(DecoBlocks.SMOOTH_PURPUR_STAIRS);
        addDrop(DecoBlocks.SMOOTH_PURPUR_SLAB, slabDrops(DecoBlocks.SMOOTH_PURPUR_SLAB));
        addDrop(DecoBlocks.SMOOTH_PURPUR_WALL);

        addDrop(DecoBlocks.PURPUR_BRICKS);
        addDrop(DecoBlocks.PURPUR_BRICK_STAIRS);
        addDrop(DecoBlocks.PURPUR_BRICK_SLAB, slabDrops(DecoBlocks.PURPUR_BRICK_SLAB));
        addDrop(DecoBlocks.PURPUR_BRICK_WALL);

        addDrop(DecoBlocks.CHISELED_PURPUR);

        addDrop(DecoBlocks.VOID_STONE);
        addDrop(DecoBlocks.VOID_STONE_STAIRS);
        addDrop(DecoBlocks.VOID_STONE_SLAB, slabDrops(DecoBlocks.VOID_STONE_SLAB));
        addDrop(DecoBlocks.VOID_STONE_WALL);

        addDrop(DecoBlocks.VOID_STONE_BRICKS);
        addDrop(DecoBlocks.VOID_STONE_BRICK_STAIRS);
        addDrop(DecoBlocks.VOID_STONE_BRICK_SLAB, slabDrops(DecoBlocks.VOID_STONE_BRICK_SLAB));
        addDrop(DecoBlocks.VOID_STONE_BRICK_WALL);

        addDrop(DecoBlocks.CHISELED_VOID_STONE);

        addDrop(DecoBlocks.OBSIDIAN_STAIRS);
        addDrop(DecoBlocks.OBSIDIAN_SLAB, slabDrops(DecoBlocks.OBSIDIAN_SLAB));
        addDrop(DecoBlocks.OBSIDIAN_WALL);

        addDrop(DecoBlocks.OBSIDIAN_BRICKS);
        addDrop(DecoBlocks.OBSIDIAN_BRICK_STAIRS);
        addDrop(DecoBlocks.OBSIDIAN_BRICK_SLAB, slabDrops(DecoBlocks.OBSIDIAN_BRICK_SLAB));
        addDrop(DecoBlocks.OBSIDIAN_BRICK_WALL);

        addDrop(DecoBlocks.OBSIDIAN_PILLAR);
        addDrop(DecoBlocks.CHISELED_OBSIDIAN);

        addDrop(DecoBlocks.CHARCOAL_BLOCK);
        addDrop(DecoBlocks.FLINT_BLOCK);
        addDrop(DecoBlocks.ECHO_BLOCK);

        addDrop(DecoBlocks.CUT_IRON);
        addDrop(DecoBlocks.CUT_IRON_STAIRS);
        addDrop(DecoBlocks.CUT_IRON_SLAB, slabDrops(DecoBlocks.CUT_IRON_SLAB));

        addDrop(DecoBlocks.LIGHT_IRON_BARS);
        addDrop(DecoBlocks.HEAVY_IRON_BARS);

        addDrop(DecoBlocks.GOLD_DOOR, doorDrops(DecoBlocks.GOLD_DOOR));
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

        addDrop(DecoBlocks.BLUE_HIBISCUS);
        pottedPlantDrops(DecoBlocks.POTTED_BLUE_HIBISCUS);
        addDrop(DecoBlocks.BROMELIAD);
        pottedPlantDrops(DecoBlocks.POTTED_BROMELIAD);

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

        addDrop(DecoBlocks.PASTEL_LIGHT_GRAY_BLOCK);
        addDrop(DecoBlocks.PASTEL_GRAY_BLOCK);
        addDrop(DecoBlocks.PASTEL_BROWN_BLOCK);
        addDrop(DecoBlocks.PASTEL_RED_BLOCK);
        addDrop(DecoBlocks.PASTEL_ORANGE_BLOCK);
        addDrop(DecoBlocks.PASTEL_YELLOW_BLOCK);
        addDrop(DecoBlocks.PASTEL_LIME_BLOCK);
        addDrop(DecoBlocks.PASTEL_GREEN_BLOCK);
        addDrop(DecoBlocks.PASTEL_CYAN_BLOCK);
        addDrop(DecoBlocks.PASTEL_LIGHT_BLUE_BLOCK);
        addDrop(DecoBlocks.PASTEL_BLUE_BLOCK);
        addDrop(DecoBlocks.PASTEL_PURPLE_BLOCK);
        addDrop(DecoBlocks.PASTEL_MAGENTA_BLOCK);
        addDrop(DecoBlocks.PASTEL_PINK_BLOCK);
        addDrop(DecoBlocks.SHADED_LIGHT_GRAY_BLOCK);
        addDrop(DecoBlocks.SHADED_GRAY_BLOCK);
        addDrop(DecoBlocks.SHADED_BROWN_BLOCK);
        addDrop(DecoBlocks.SHADED_RED_BLOCK);
        addDrop(DecoBlocks.SHADED_ORANGE_BLOCK);
        addDrop(DecoBlocks.SHADED_YELLOW_BLOCK);
        addDrop(DecoBlocks.SHADED_LIME_BLOCK);
        addDrop(DecoBlocks.SHADED_GREEN_BLOCK);
        addDrop(DecoBlocks.SHADED_CYAN_BLOCK);
        addDrop(DecoBlocks.SHADED_LIGHT_BLUE_BLOCK);
        addDrop(DecoBlocks.SHADED_BLUE_BLOCK);
        addDrop(DecoBlocks.SHADED_PURPLE_BLOCK);
        addDrop(DecoBlocks.SHADED_MAGENTA_BLOCK);
        addDrop(DecoBlocks.SHADED_PINK_BLOCK);

        addDrop(DecoBlocks.COPPER_WEIGHT_PRESSURE_PLATE);
        addDrop(DecoBlocks.WAXED_COPPER_WEIGHT_PRESSURE_PLATE);
        addDrop(DecoBlocks.EXPOSED_COPPER_WEIGHT_PRESSURE_PLATE);
        addDrop(DecoBlocks.WAXED_EXPOSED_COPPER_WEIGHT_PRESSURE_PLATE);
        addDrop(DecoBlocks.WEATHERED_COPPER_WEIGHT_PRESSURE_PLATE);
        addDrop(DecoBlocks.WAXED_WEATHERED_COPPER_WEIGHT_PRESSURE_PLATE);
        addDrop(DecoBlocks.OXIDIZED_COPPER_WEIGHT_PRESSURE_PLATE);
        addDrop(DecoBlocks.WAXED_OXIDIZED_COPPER_WEIGHT_PRESSURE_PLATE);

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
        addDrop(DecoBlocks.WOODEN_SLAB, slabDrops(DecoBlocks.WOODEN_SLAB));
        addDrop(DecoBlocks.WOODEN_FENCE);
        addDrop(DecoBlocks.WOODEN_FENCE_GATE);
        addDrop(DecoBlocks.WOODEN_PRESSURE_PLATE);
        addDrop(DecoBlocks.WOODEN_BUTTON);

        addDrop(DecoBlocks.WOODEN_LOG);
        addDrop(DecoBlocks.WOODEN_WOOD);
        addDrop(DecoBlocks.STRIPPED_WOODEN_LOG);
        addDrop(DecoBlocks.STRIPPED_WOODEN_WOOD);

        addDrop(DecoBlocks.WOODEN_DOOR, doorDrops(DecoBlocks.WOODEN_DOOR));
        addDrop(DecoBlocks.WOODEN_TRAPDOOR);

        addDrop(DecoBlocks.OAK_CRAFTING_TABLE);
        addDrop(DecoBlocks.WOODEN_LADDER);

        addDrop(DecoBlocks.STANDING_WOODEN_SIGN);

        addDrop(DecoBlocks.WOODEN_SAPLING);
        pottedPlantDrops(DecoBlocks.POTTED_WOODEN_SAPLING);

        addDrop(DecoBlocks.SMOOTH_BASALT_STAIRS);
        addDrop(DecoBlocks.SMOOTH_BASALT_SLAB, slabDrops(DecoBlocks.SMOOTH_BASALT_SLAB));
        addDrop(DecoBlocks.SMOOTH_BASALT_WALL);
        addDrop(DecoBlocks.PURPUR_WALL);
        addDropWithSilkTouch(DecoBlocks.INFESTED_POLISHED_STONE, DecoBlocks.POLISHED_STONE);
        addDropWithSilkTouch(DecoBlocks.INFESTED_STONE_TILES, DecoBlocks.STONE_TILES);
        addDropWithSilkTouch(DecoBlocks.INFESTED_COBBLED_DEEPSLATE, Blocks.COBBLED_DEEPSLATE);
        addDropWithSilkTouch(DecoBlocks.INFESTED_POLISHED_DEEPSLATE, Blocks.POLISHED_DEEPSLATE);
        addDropWithSilkTouch(DecoBlocks.INFESTED_DEEPSLATE_BRICKS, Blocks.DEEPSLATE_BRICKS);
        addDropWithSilkTouch(DecoBlocks.INFESTED_DEEPSLATE_TILES, Blocks.DEEPSLATE_TILES);
        addDropWithSilkTouch(DecoBlocks.INFESTED_CRACKED_DEEPSLATE_BRICKS, Blocks.CRACKED_DEEPSLATE_BRICKS);
        addDropWithSilkTouch(DecoBlocks.INFESTED_CRACKED_DEEPSLATE_TILES, Blocks.CRACKED_DEEPSLATE_TILES);
        addDropWithSilkTouch(DecoBlocks.INFESTED_MOSSY_COBBLESTONE, Blocks.MOSSY_COBBLESTONE);
        addDropWithSilkTouch(DecoBlocks.INFESTED_CHISELED_DEEPSLATE, Blocks.CHISELED_DEEPSLATE);
        addDropWithSilkTouch(DecoBlocks.INFESTED_CALCITE, Blocks.CALCITE);
        addDropWithSilkTouch(DecoBlocks.INFESTED_DRIPSTONE_BLOCK, Blocks.DRIPSTONE_BLOCK);
        addDropWithSilkTouch(DecoBlocks.INFESTED_TUFF, Blocks.TUFF);
        addDropWithSilkTouch(DecoBlocks.INFESTED_GRANITE, Blocks.GRANITE);
        addDropWithSilkTouch(DecoBlocks.INFESTED_POLISHED_GRANITE, Blocks.POLISHED_GRANITE);
        addDropWithSilkTouch(DecoBlocks.INFESTED_DIORITE, Blocks.DIORITE);
        addDropWithSilkTouch(DecoBlocks.INFESTED_POLISHED_DIORITE, Blocks.POLISHED_DIORITE);
        addDropWithSilkTouch(DecoBlocks.INFESTED_ANDESITE, Blocks.ANDESITE);
        addDropWithSilkTouch(DecoBlocks.INFESTED_POLISHED_ANDESITE, Blocks.POLISHED_ANDESITE);
        addDropWithSilkTouch(DecoBlocks.INFESTED_BLACKSTONE, Blocks.BLACKSTONE);
        addDropWithSilkTouch(DecoBlocks.INFESTED_POLISHED_BLACKSTONE, Blocks.POLISHED_BLACKSTONE);
        addDropWithSilkTouch(DecoBlocks.INFESTED_POLISHED_BLACKSTONE_BRICKS, Blocks.POLISHED_BLACKSTONE_BRICKS);
        addDropWithSilkTouch(DecoBlocks.INFESTED_POLISHED_BLACKSTONE_TILES, DecoBlocks.POLISHED_BLACKSTONE_TILES);
        addDropWithSilkTouch(DecoBlocks.INFESTED_CRACKED_POLISHED_BLACKSTONE_BRICKS, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS);
        addDropWithSilkTouch(DecoBlocks.INFESTED_CHISELED_POLISHED_BLACKSTONE, Blocks.CHISELED_POLISHED_BLACKSTONE);
        addDropWithSilkTouch(DecoBlocks.INFESTED_CRACKED_STONE_TILES, DecoBlocks.CRACKED_STONE_TILES);
        addDropWithSilkTouch(DecoBlocks.INFESTED_CRACKED_POLISHED_BLACKSTONE_TILES, DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILES);

        addDrop(DecoBlocks.DEEPSLATE_GRINDSTONE);
        addDrop(DecoBlocks.BLACKSTONE_GRINDSTONE);

        addDrop(DecoBlocks.COBBLED_SANDSTONE);
        addDrop(DecoBlocks.COBBLED_RED_SANDSTONE);
        addDrop(DecoBlocks.COBBLED_SOUL_SOILSTONE);
        addDrop(DecoBlocks.POLISHED_SANDSTONE);
        addDrop(DecoBlocks.POLISHED_RED_SANDSTONE);
        addDrop(DecoBlocks.POLISHED_SOUL_SOILSTONE);
        addDrop(DecoBlocks.SANDSTONE_BRICKS);
        addDrop(DecoBlocks.RED_SANDSTONE_BRICKS);
        addDrop(DecoBlocks.SOUL_SOILSTONE_BRICKS);
        addDrop(DecoBlocks.COBBLED_SANDSTONE_STAIRS);
        addDrop(DecoBlocks.COBBLED_SANDSTONE_SLAB, slabDrops(DecoBlocks.COBBLED_SANDSTONE_SLAB));
        addDrop(DecoBlocks.COBBLED_SANDSTONE_WALL);
        addDrop(DecoBlocks.COBBLED_RED_SANDSTONE_STAIRS);
        addDrop(DecoBlocks.COBBLED_RED_SANDSTONE_SLAB, slabDrops(DecoBlocks.COBBLED_RED_SANDSTONE_SLAB));
        addDrop(DecoBlocks.COBBLED_RED_SANDSTONE_WALL);
        addDrop(DecoBlocks.COBBLED_SOUL_SOILSTONE_STAIRS);
        addDrop(DecoBlocks.COBBLED_SOUL_SOILSTONE_SLAB, slabDrops(DecoBlocks.COBBLED_SOUL_SOILSTONE_SLAB));
        addDrop(DecoBlocks.COBBLED_SOUL_SOILSTONE_WALL);
        addDrop(DecoBlocks.POLISHED_SANDSTONE_STAIRS);
        addDrop(DecoBlocks.POLISHED_SANDSTONE_SLAB, slabDrops(DecoBlocks.POLISHED_SANDSTONE_SLAB));
        addDrop(DecoBlocks.POLISHED_SANDSTONE_WALL);
        addDrop(DecoBlocks.POLISHED_RED_SANDSTONE_STAIRS);
        addDrop(DecoBlocks.POLISHED_RED_SANDSTONE_SLAB, slabDrops(DecoBlocks.POLISHED_RED_SANDSTONE_SLAB));
        addDrop(DecoBlocks.POLISHED_RED_SANDSTONE_WALL);
        addDrop(DecoBlocks.POLISHED_SOUL_SOILSTONE_STAIRS);
        addDrop(DecoBlocks.POLISHED_SOUL_SOILSTONE_SLAB, slabDrops(DecoBlocks.POLISHED_SOUL_SOILSTONE_SLAB));
        addDrop(DecoBlocks.POLISHED_SOUL_SOILSTONE_WALL);
        addDrop(DecoBlocks.SANDSTONE_BRICK_STAIRS);
        addDrop(DecoBlocks.SANDSTONE_BRICK_SLAB, slabDrops(DecoBlocks.SANDSTONE_BRICK_SLAB));
        addDrop(DecoBlocks.SANDSTONE_BRICK_WALL);
        addDrop(DecoBlocks.RED_SANDSTONE_BRICK_STAIRS);
        addDrop(DecoBlocks.RED_SANDSTONE_BRICK_SLAB, slabDrops(DecoBlocks.RED_SANDSTONE_BRICK_SLAB));
        addDrop(DecoBlocks.RED_SANDSTONE_BRICK_WALL);
        addDrop(DecoBlocks.SOUL_SOILSTONE_BRICK_STAIRS);
        addDrop(DecoBlocks.SOUL_SOILSTONE_BRICK_SLAB, slabDrops(DecoBlocks.SOUL_SOILSTONE_BRICK_SLAB));
        addDrop(DecoBlocks.SOUL_SOILSTONE_BRICK_WALL);

        addDrop(DecoBlocks.FRAGILE_ICE, block -> this.drops(block, DecoItems.ICE_SHARD,
                        UniformLootNumberProvider.create(0.0F, 3.0f)));


        addDrop(DecoBlocks.BUBBLE_ELEVATOR_BLOCK_BUBBLE);
        addDrop(DecoBlocks.BUBBLE_ELEVATOR_BLOCK_MAGMA, DecoBlocks.BUBBLE_ELEVATOR_BLOCK_BUBBLE);

        addDrop(DecoBlocks.CHISELED_POLISHED_SANDSTONE);
        addDrop(DecoBlocks.CHISELED_POLISHED_RED_SANDSTONE);
        addDrop(DecoBlocks.CHISELED_POLISHED_SOUL_SOILSTONE);

        addDrop(Blocks.MAGMA_BLOCK, block -> this.drops(block, Items.MAGMA_CREAM, ConstantLootNumberProvider.create(2.0F)));

        addDrop(Blocks.ICE, block -> this.drops(block, DecoItems.ICE_SHARD,
                UniformLootNumberProvider.create(3.0F, 6.0f)));

        addDrop(Blocks.PACKED_ICE, block -> this.drops(block, DecoItems.ICE_SHARD,
                UniformLootNumberProvider.create(6.0F, 9.0f)));

        addDrop(Blocks.BLUE_ICE, block -> this.drops(block, DecoItems.ICE_SHARD,
                UniformLootNumberProvider.create(9.0F, 12.0f)));

        addDrop(DecoBlocks.CUT_PURPUR);
        addDrop(DecoBlocks.CUT_PURPUR_STAIRS);
        addDrop(DecoBlocks.CUT_PURPUR_SLAB, slabDrops(DecoBlocks.CUT_PURPUR_SLAB));
        addDrop(DecoBlocks.CUT_PURPUR_WALL);

        addDrop(DecoBlocks.OAK_WOOD_STAIRS);
        addDrop(DecoBlocks.OAK_WOOD_SLAB, slabDrops(DecoBlocks.OAK_WOOD_SLAB));
        addDrop(DecoBlocks.OAK_WOOD_WALL);
        addDrop(DecoBlocks.STRIPPED_OAK_WOOD_STAIRS);
        addDrop(DecoBlocks.STRIPPED_OAK_WOOD_SLAB, slabDrops(DecoBlocks.STRIPPED_OAK_WOOD_SLAB));
        addDrop(DecoBlocks.STRIPPED_OAK_WOOD_WALL);

        addDrop(DecoBlocks.SPRUCE_WOOD_STAIRS);
        addDrop(DecoBlocks.SPRUCE_WOOD_SLAB, slabDrops(DecoBlocks.SPRUCE_WOOD_SLAB));
        addDrop(DecoBlocks.SPRUCE_WOOD_WALL);
        addDrop(DecoBlocks.STRIPPED_SPRUCE_WOOD_STAIRS);
        addDrop(DecoBlocks.STRIPPED_SPRUCE_WOOD_SLAB, slabDrops(DecoBlocks.STRIPPED_SPRUCE_WOOD_SLAB));
        addDrop(DecoBlocks.STRIPPED_SPRUCE_WOOD_WALL);

        addDrop(DecoBlocks.BIRCH_WOOD_STAIRS);
        addDrop(DecoBlocks.BIRCH_WOOD_SLAB, slabDrops(DecoBlocks.BIRCH_WOOD_SLAB));
        addDrop(DecoBlocks.BIRCH_WOOD_WALL);
        addDrop(DecoBlocks.STRIPPED_BIRCH_WOOD_STAIRS);
        addDrop(DecoBlocks.STRIPPED_BIRCH_WOOD_SLAB, slabDrops(DecoBlocks.STRIPPED_BIRCH_WOOD_SLAB));
        addDrop(DecoBlocks.STRIPPED_BIRCH_WOOD_WALL);

        addDrop(DecoBlocks.JUNGLE_WOOD_STAIRS);
        addDrop(DecoBlocks.JUNGLE_WOOD_SLAB, slabDrops(DecoBlocks.JUNGLE_WOOD_SLAB));
        addDrop(DecoBlocks.JUNGLE_WOOD_WALL);
        addDrop(DecoBlocks.STRIPPED_JUNGLE_WOOD_STAIRS);
        addDrop(DecoBlocks.STRIPPED_JUNGLE_WOOD_SLAB, slabDrops(DecoBlocks.STRIPPED_JUNGLE_WOOD_SLAB));
        addDrop(DecoBlocks.STRIPPED_JUNGLE_WOOD_WALL);

        addDrop(DecoBlocks.ACACIA_WOOD_STAIRS);
        addDrop(DecoBlocks.ACACIA_WOOD_SLAB, slabDrops(DecoBlocks.ACACIA_WOOD_SLAB));
        addDrop(DecoBlocks.ACACIA_WOOD_WALL);
        addDrop(DecoBlocks.STRIPPED_ACACIA_WOOD_STAIRS);
        addDrop(DecoBlocks.STRIPPED_ACACIA_WOOD_SLAB, slabDrops(DecoBlocks.STRIPPED_ACACIA_WOOD_SLAB));
        addDrop(DecoBlocks.STRIPPED_ACACIA_WOOD_WALL);

        addDrop(DecoBlocks.DARK_OAK_WOOD_STAIRS);
        addDrop(DecoBlocks.DARK_OAK_WOOD_SLAB, slabDrops(DecoBlocks.DARK_OAK_WOOD_SLAB));
        addDrop(DecoBlocks.DARK_OAK_WOOD_WALL);
        addDrop(DecoBlocks.STRIPPED_DARK_OAK_WOOD_STAIRS);
        addDrop(DecoBlocks.STRIPPED_DARK_OAK_WOOD_SLAB, slabDrops(DecoBlocks.STRIPPED_DARK_OAK_WOOD_SLAB));
        addDrop(DecoBlocks.STRIPPED_DARK_OAK_WOOD_WALL);

        addDrop(DecoBlocks.MANGROVE_WOOD_STAIRS);
        addDrop(DecoBlocks.MANGROVE_WOOD_SLAB, slabDrops(DecoBlocks.MANGROVE_WOOD_SLAB));
        addDrop(DecoBlocks.MANGROVE_WOOD_WALL);
        addDrop(DecoBlocks.STRIPPED_MANGROVE_WOOD_STAIRS);
        addDrop(DecoBlocks.STRIPPED_MANGROVE_WOOD_SLAB, slabDrops(DecoBlocks.STRIPPED_MANGROVE_WOOD_SLAB));
        addDrop(DecoBlocks.STRIPPED_MANGROVE_WOOD_WALL);

        addDrop(DecoBlocks.CRIMSON_HYPHAE_STAIRS);
        addDrop(DecoBlocks.CRIMSON_HYPHAE_SLAB, slabDrops(DecoBlocks.CRIMSON_HYPHAE_SLAB));
        addDrop(DecoBlocks.CRIMSON_HYPHAE_WALL);
        addDrop(DecoBlocks.STRIPPED_CRIMSON_HYPHAE_STAIRS);
        addDrop(DecoBlocks.STRIPPED_CRIMSON_HYPHAE_SLAB, slabDrops(DecoBlocks.STRIPPED_CRIMSON_HYPHAE_SLAB));
        addDrop(DecoBlocks.STRIPPED_CRIMSON_HYPHAE_WALL);

        addDrop(DecoBlocks.WARPED_HYPHAE_STAIRS);
        addDrop(DecoBlocks.WARPED_HYPHAE_SLAB, slabDrops(DecoBlocks.WARPED_HYPHAE_SLAB));
        addDrop(DecoBlocks.WARPED_HYPHAE_WALL);
        addDrop(DecoBlocks.STRIPPED_WARPED_HYPHAE_STAIRS);
        addDrop(DecoBlocks.STRIPPED_WARPED_HYPHAE_SLAB, slabDrops(DecoBlocks.STRIPPED_WARPED_HYPHAE_SLAB));
        addDrop(DecoBlocks.STRIPPED_WARPED_HYPHAE_WALL);

        addDrop(DecoBlocks.WOODEN_WOOD_STAIRS);
        addDrop(DecoBlocks.WOODEN_WOOD_SLAB, slabDrops(DecoBlocks.WOODEN_WOOD_SLAB));
        addDrop(DecoBlocks.WOODEN_WOOD_WALL);
        addDrop(DecoBlocks.STRIPPED_WOODEN_WOOD_STAIRS);
        addDrop(DecoBlocks.STRIPPED_WOODEN_WOOD_SLAB, slabDrops(DecoBlocks.STRIPPED_WOODEN_WOOD_SLAB));
        addDrop(DecoBlocks.STRIPPED_WOODEN_WOOD_WALL);

        addDrop(DecoBlocks.PACKED_NETHERRACK);
        addDrop(DecoBlocks.PACKED_NETHERRACK_STAIRS);
        addDrop(DecoBlocks.PACKED_NETHERRACK_SLAB, slabDrops(DecoBlocks.PACKED_NETHERRACK_SLAB));
        addDrop(DecoBlocks.PACKED_NETHERRACK_WALL);

        addDrop(DecoBlocks.NETHERRACK_BRICKS);
        addDrop(DecoBlocks.NETHERRACK_BRICK_STAIRS);
        addDrop(DecoBlocks.NETHERRACK_BRICK_SLAB, slabDrops(DecoBlocks.NETHERRACK_BRICK_SLAB));
        addDrop(DecoBlocks.NETHERRACK_BRICK_WALL);

        addDrop(DecoBlocks.CHISELED_MUD_BRICKS);
        addDrop(DecoBlocks.CHISELED_NETHERRACK_BRICKS);
        addDrop(DecoBlocks.CHISELED_ICE_BRICKS);

        addDrop(DecoBlocks.SMOOTH_GLOWSTONE);
        addDrop(DecoBlocks.BASALT_BRICKS);

        addDrop(DecoBlocks.PACKED_CACTUS);
        addDrop(DecoBlocks.STRIPPED_CACTUS);

        addDrop(DecoBlocks.OAK_PALLET_DOOR, doorDrops(DecoBlocks.OAK_PALLET_DOOR));
        addDrop(DecoBlocks.SPRUCE_PALLET_DOOR, doorDrops(DecoBlocks.SPRUCE_PALLET_DOOR));
        addDrop(DecoBlocks.BIRCH_PALLET_DOOR, doorDrops(DecoBlocks.BIRCH_PALLET_DOOR));
        addDrop(DecoBlocks.JUNGLE_PALLET_DOOR, doorDrops(DecoBlocks.JUNGLE_PALLET_DOOR));
        addDrop(DecoBlocks.ACACIA_PALLET_DOOR, doorDrops(DecoBlocks.ACACIA_PALLET_DOOR));
        addDrop(DecoBlocks.DARK_OAK_PALLET_DOOR, doorDrops(DecoBlocks.DARK_OAK_PALLET_DOOR));
        addDrop(DecoBlocks.MANGROVE_PALLET_DOOR, doorDrops(DecoBlocks.MANGROVE_PALLET_DOOR));
        addDrop(DecoBlocks.CRIMSON_PALLET_DOOR, doorDrops(DecoBlocks.CRIMSON_PALLET_DOOR));
        addDrop(DecoBlocks.WARPED_PALLET_DOOR, doorDrops(DecoBlocks.WARPED_PALLET_DOOR));
        addDrop(DecoBlocks.CACTUS_PALLET_DOOR, doorDrops(DecoBlocks.CACTUS_PALLET_DOOR));
        addDrop(DecoBlocks.WOODEN_PALLET_DOOR, doorDrops(DecoBlocks.WOODEN_PALLET_DOOR));

        addDrop(DecoBlocks.OAK_PALLET_TRAPDOOR);
        addDrop(DecoBlocks.SPRUCE_PALLET_TRAPDOOR);
        addDrop(DecoBlocks.BIRCH_PALLET_TRAPDOOR);
        addDrop(DecoBlocks.JUNGLE_PALLET_TRAPDOOR);
        addDrop(DecoBlocks.ACACIA_PALLET_TRAPDOOR);
        addDrop(DecoBlocks.DARK_OAK_PALLET_TRAPDOOR);
        addDrop(DecoBlocks.MANGROVE_PALLET_TRAPDOOR);
        addDrop(DecoBlocks.CRIMSON_PALLET_TRAPDOOR);
        addDrop(DecoBlocks.WARPED_PALLET_TRAPDOOR);
        addDrop(DecoBlocks.CACTUS_PALLET_TRAPDOOR);
        addDrop(DecoBlocks.WOODEN_PALLET_TRAPDOOR);

        addDrop(DecoBlocks.WHITE_LAMP, DecoBlocks.SMOOTH_GLOWSTONE);
        addDrop(DecoBlocks.LIGHT_GRAY_LAMP, DecoBlocks.SMOOTH_GLOWSTONE);
        addDrop(DecoBlocks.GRAY_LAMP, DecoBlocks.SMOOTH_GLOWSTONE);
        addDrop(DecoBlocks.BLACK_LAMP, DecoBlocks.SMOOTH_GLOWSTONE);
        addDrop(DecoBlocks.BROWN_LAMP, DecoBlocks.SMOOTH_GLOWSTONE);
        addDrop(DecoBlocks.RED_LAMP, DecoBlocks.SMOOTH_GLOWSTONE);
        addDrop(DecoBlocks.ORANGE_LAMP, DecoBlocks.SMOOTH_GLOWSTONE);
        addDrop(DecoBlocks.YELLOW_LAMP, DecoBlocks.SMOOTH_GLOWSTONE);
        addDrop(DecoBlocks.LIME_LAMP, DecoBlocks.SMOOTH_GLOWSTONE);
        addDrop(DecoBlocks.GREEN_LAMP, DecoBlocks.SMOOTH_GLOWSTONE);
        addDrop(DecoBlocks.CYAN_LAMP, DecoBlocks.SMOOTH_GLOWSTONE);
        addDrop(DecoBlocks.LIGHT_BLUE_LAMP, DecoBlocks.SMOOTH_GLOWSTONE);
        addDrop(DecoBlocks.BLUE_LAMP, DecoBlocks.SMOOTH_GLOWSTONE);
        addDrop(DecoBlocks.PURPLE_LAMP, DecoBlocks.SMOOTH_GLOWSTONE);
        addDrop(DecoBlocks.MAGENTA_LAMP, DecoBlocks.SMOOTH_GLOWSTONE);
        addDrop(DecoBlocks.PINK_LAMP, DecoBlocks.SMOOTH_GLOWSTONE);

        addDrop(DecoBlocks.MUSHROOM_PLANKS);
        addDrop(DecoBlocks.MUSHROOM_STAIRS);
        addDrop(DecoBlocks.MUSHROOM_SLAB, slabDrops(DecoBlocks.MUSHROOM_SLAB));
        addDrop(DecoBlocks.MUSHROOM_FENCE);
        addDrop(DecoBlocks.MUSHROOM_FENCE_GATE);
        addDrop(DecoBlocks.MUSHROOM_PRESSURE_PLATE);
        addDrop(DecoBlocks.MUSHROOM_BUTTON);

        addDrop(DecoBlocks.MUSHROOM_DOOR, doorDrops(DecoBlocks.MUSHROOM_DOOR));
        addDrop(DecoBlocks.MUSHROOM_TRAPDOOR);

        addDrop(DecoBlocks.MUSHROOM_PALLET_DOOR, doorDrops(DecoBlocks.MUSHROOM_PALLET_DOOR));
        addDrop(DecoBlocks.MUSHROOM_PALLET_TRAPDOOR);

        addDrop(DecoBlocks.STANDING_MUSHROOM_SIGN);

        addDrop(DecoBlocks.MUSHROOM_CRAFTING_TABLE);
        addDrop(DecoBlocks.MUSHROOM_BARREL);
        addDrop(DecoBlocks.MUSHROOM_LADDER);
        addDrop(DecoBlocks.MUSHROOM_SMITHING_TABLE);
        addDrop(DecoBlocks.MUSHROOM_CARTOGRAPHY_TABLE);
        addDrop(DecoBlocks.MUSHROOM_NOTE_BLOCK);

        addDrop(DecoBlocks.OAK_NOTE_BLOCK);
        addDrop(DecoBlocks.SPRUCE_NOTE_BLOCK);
        addDrop(DecoBlocks.BIRCH_NOTE_BLOCK);
        addDrop(DecoBlocks.JUNGLE_NOTE_BLOCK);
        addDrop(DecoBlocks.DARK_OAK_NOTE_BLOCK);
        addDrop(DecoBlocks.ACACIA_NOTE_BLOCK);
        addDrop(DecoBlocks.MANGROVE_NOTE_BLOCK);
        addDrop(DecoBlocks.CRIMSON_NOTE_BLOCK);
        addDrop(DecoBlocks.WARPED_NOTE_BLOCK);
        addDrop(DecoBlocks.CACTUS_NOTE_BLOCK);

        addDrop(DecoBlocks.POLISHED_CALCITE);
        addDrop(DecoBlocks.CUT_CALCITE);
        addDrop(DecoBlocks.CALCITE_BRICKS);

        addDrop(DecoBlocks.CUT_ANDESITE);
        addDrop(DecoBlocks.ANDESITE_BRICKS);
        addDrop(DecoBlocks.CUT_GRANITE);
        addDrop(DecoBlocks.GRANITE_BRICKS);
        addDrop(DecoBlocks.CUT_DIORITE);
        addDrop(DecoBlocks.DIORITE_BRICKS);

        addDrop(DecoBlocks.POLISHED_CALCITE_STAIRS);
        addDrop(DecoBlocks.CUT_CALCITE_STAIRS);
        addDrop(DecoBlocks.CALCITE_BRICK_STAIRS);

        addDrop(DecoBlocks.CUT_ANDESITE_STAIRS);
        addDrop(DecoBlocks.ANDESITE_BRICK_STAIRS);
        addDrop(DecoBlocks.CUT_GRANITE_STAIRS);
        addDrop(DecoBlocks.GRANITE_BRICK_STAIRS);
        addDrop(DecoBlocks.CUT_DIORITE_STAIRS);
        addDrop(DecoBlocks.DIORITE_BRICK_STAIRS);

        addDrop(DecoBlocks.POLISHED_CALCITE_SLAB, slabDrops(DecoBlocks.POLISHED_CALCITE_SLAB));
        addDrop(DecoBlocks.CUT_CALCITE_SLAB, slabDrops(DecoBlocks.CUT_CALCITE_SLAB));
        addDrop(DecoBlocks.CALCITE_BRICK_SLAB, slabDrops(DecoBlocks.CALCITE_BRICK_SLAB));

        addDrop(DecoBlocks.CUT_ANDESITE_SLAB, slabDrops(DecoBlocks.CUT_ANDESITE_SLAB));
        addDrop(DecoBlocks.ANDESITE_BRICK_SLAB, slabDrops(DecoBlocks.ANDESITE_BRICK_SLAB));
        addDrop(DecoBlocks.CUT_GRANITE_SLAB, slabDrops(DecoBlocks.CUT_GRANITE_SLAB));
        addDrop(DecoBlocks.GRANITE_BRICK_SLAB, slabDrops(DecoBlocks.GRANITE_BRICK_SLAB));
        addDrop(DecoBlocks.CUT_DIORITE_SLAB, slabDrops(DecoBlocks.CUT_DIORITE_SLAB));
        addDrop(DecoBlocks.DIORITE_BRICK_SLAB, slabDrops(DecoBlocks.DIORITE_BRICK_SLAB));

        addDrop(DecoBlocks.POLISHED_CALCITE_WALL);
        addDrop(DecoBlocks.CUT_CALCITE_WALL);
        addDrop(DecoBlocks.CALCITE_BRICK_WALL);

        addDrop(DecoBlocks.CUT_ANDESITE_WALL);
        addDrop(DecoBlocks.ANDESITE_BRICK_WALL);
        addDrop(DecoBlocks.CUT_GRANITE_WALL);
        addDrop(DecoBlocks.GRANITE_BRICK_WALL);
        addDrop(DecoBlocks.CUT_DIORITE_WALL);
        addDrop(DecoBlocks.DIORITE_BRICK_WALL);

        addDrop(DecoBlocks.CUT_GOLD);
        addDrop(DecoBlocks.CUT_GOLD_STAIRS);
        addDrop(DecoBlocks.CUT_GOLD_SLAB, slabDrops(DecoBlocks.CUT_GOLD_SLAB));

        addDrop(DecoBlocks.IRON_STAIRS);
        addDrop(DecoBlocks.IRON_SLAB, slabDrops(DecoBlocks.IRON_SLAB));

        addDrop(DecoBlocks.GOLD_STAIRS);
        addDrop(DecoBlocks.GOLD_SLAB, slabDrops(DecoBlocks.GOLD_SLAB));

        addDrop(DecoBlocks.COPPER_STAIRS);
        addDrop(DecoBlocks.COPPER_SLAB, slabDrops(DecoBlocks.COPPER_SLAB));

        addDrop(DecoBlocks.EXPOSED_COPPER_STAIRS);
        addDrop(DecoBlocks.EXPOSED_COPPER_SLAB, slabDrops(DecoBlocks.EXPOSED_COPPER_SLAB));

        addDrop(DecoBlocks.WEATHERED_COPPER_STAIRS);
        addDrop(DecoBlocks.WEATHERED_COPPER_SLAB, slabDrops(DecoBlocks.WEATHERED_COPPER_SLAB));

        addDrop(DecoBlocks.OXIDIZED_COPPER_STAIRS);
        addDrop(DecoBlocks.OXIDIZED_COPPER_SLAB, slabDrops(DecoBlocks.OXIDIZED_COPPER_SLAB));

        addDrop(DecoBlocks.WAXED_COPPER_STAIRS);
        addDrop(DecoBlocks.WAXED_COPPER_SLAB, slabDrops(DecoBlocks.WAXED_COPPER_SLAB));

        addDrop(DecoBlocks.WAXED_EXPOSED_COPPER_STAIRS);
        addDrop(DecoBlocks.WAXED_EXPOSED_COPPER_SLAB, slabDrops(DecoBlocks.WAXED_EXPOSED_COPPER_SLAB));

        addDrop(DecoBlocks.WAXED_WEATHERED_COPPER_STAIRS);
        addDrop(DecoBlocks.WAXED_WEATHERED_COPPER_SLAB, slabDrops(DecoBlocks.WAXED_WEATHERED_COPPER_SLAB));

        addDrop(DecoBlocks.WAXED_OXIDIZED_COPPER_STAIRS);
        addDrop(DecoBlocks.WAXED_OXIDIZED_COPPER_SLAB, slabDrops(DecoBlocks.WAXED_OXIDIZED_COPPER_SLAB));

        addDrop(DecoBlocks.RAW_IRON_STAIRS);
        addDrop(DecoBlocks.RAW_IRON_SLAB, slabDrops(DecoBlocks.RAW_IRON_SLAB));

        addDrop(DecoBlocks.RAW_GOLD_STAIRS);
        addDrop(DecoBlocks.RAW_GOLD_SLAB, slabDrops(DecoBlocks.RAW_GOLD_SLAB));

        addDrop(DecoBlocks.RAW_COPPER_STAIRS);
        addDrop(DecoBlocks.RAW_COPPER_SLAB, slabDrops(DecoBlocks.RAW_COPPER_SLAB));

        addDrop(DecoBlocks.DEEPSLATE_LEVER);
        addDrop(DecoBlocks.COBBLED_DEEPSLATE_LEVER);
        addDrop(DecoBlocks.POLISHED_DEEPSLATE_LEVER);

        addDrop(DecoBlocks.STONE_LEVER);
        addDrop(DecoBlocks.POLISHED_STONE_LEVER);

        addDrop(DecoBlocks.BLACKSTONE_LEVER);
        addDrop(DecoBlocks.POLISHED_BLACKSTONE_LEVER);

        addDrop(DecoBlocks.LIGHT_GOLD_BARS);
        addDrop(DecoBlocks.GOLD_BARS);
        addDrop(DecoBlocks.HEAVY_GOLD_BARS);

        addDrop(DecoBlocks.SANDED_OBSIDIAN);
        addDrop(DecoBlocks.SANDED_OBSIDIAN_STAIRS);
        addDrop(DecoBlocks.SANDED_OBSIDIAN_SLAB, slabDrops(DecoBlocks.SANDED_OBSIDIAN_SLAB));
        addDrop(DecoBlocks.SANDED_OBSIDIAN_WALL);

        addDrop(DecoBlocks.SMOOTH_OBSIDIAN);
        addDrop(DecoBlocks.SMOOTH_OBSIDIAN_STAIRS);
        addDrop(DecoBlocks.SMOOTH_OBSIDIAN_SLAB, slabDrops(DecoBlocks.SMOOTH_OBSIDIAN_SLAB));
        addDrop(DecoBlocks.SMOOTH_OBSIDIAN_WALL);

        addDrop(DecoBlocks.CUT_OBSIDIAN);
        addDrop(DecoBlocks.CUT_OBSIDIAN_STAIRS);
        addDrop(DecoBlocks.CUT_OBSIDIAN_SLAB, slabDrops(DecoBlocks.CUT_OBSIDIAN_SLAB));
        addDrop(DecoBlocks.CUT_OBSIDIAN_WALL);

        addDrop(DecoBlocks.CHISELED_MAGMA_BLOCK);
        addDrop(DecoBlocks.CHISELED_BUBBLE_BLOCK);

        addDrop(DecoBlocks.BUTTERCUP);
        pottedPlantDrops(DecoBlocks.POTTED_BUTTERCUP);

        addDrop(DecoBlocks.NIGHTSHADE);
        pottedPlantDrops(DecoBlocks.POTTED_NIGHTSHADE);
        addDrop(DecoBlocks.ENDERSHADE);
        pottedPlantDrops(DecoBlocks.POTTED_ENDERSHADE);

        addDrop(DecoBlocks.POLISHED_END_STONE);
        addDrop(DecoBlocks.SMOOTH_END_STONE);
        addDrop(DecoBlocks.END_STONE_TILES);
        addDrop(DecoBlocks.CRACKED_END_STONE_TILES);
        addDrop(DecoBlocks.CRACKED_END_STONE_BRICKS);

        addDrop(DecoBlocks.POLISHED_END_STONE_STAIRS);
        addDrop(DecoBlocks.SMOOTH_END_STONE_STAIRS);
        addDrop(DecoBlocks.END_STONE_TILE_STAIRS);

        addDrop(DecoBlocks.POLISHED_END_STONE_SLAB, slabDrops(DecoBlocks.POLISHED_END_STONE_SLAB));
        addDrop(DecoBlocks.SMOOTH_END_STONE_SLAB, slabDrops(DecoBlocks.SMOOTH_END_STONE_SLAB));
        addDrop(DecoBlocks.END_STONE_TILE_SLAB, slabDrops(DecoBlocks.END_STONE_TILE_SLAB));

        addDrop(DecoBlocks.POLISHED_END_STONE_WALL);
        addDrop(DecoBlocks.SMOOTH_END_STONE_WALL);
        addDrop(DecoBlocks.END_STONE_TILE_WALL);

        addDrop(DecoBlocks.END_STONE_PRESSURE_PLATE);
        addDrop(DecoBlocks.END_STONE_BUTTON);
        addDrop(DecoBlocks.END_STONE_LEVER);

        addDrop(DecoBlocks.POLISHED_END_STONE_PRESSURE_PLATE);
        addDrop(DecoBlocks.POLISHED_END_STONE_BUTTON);
        addDrop(DecoBlocks.POLISHED_END_STONE_LEVER);

        addDrop(DecoBlocks.END_STONE_FURNACE);
        addDrop(DecoBlocks.END_STONE_BLAST_FURNACE);
        addDrop(DecoBlocks.END_STONE_SMOKER);
        addDrop(DecoBlocks.END_STONE_STONECUTTER);
        addDrop(DecoBlocks.END_STONE_GRINDSTONE);

        addDrop(DecoBlocks.PACKED_GRASS);
        addDrop(DecoBlocks.PACKED_MYCELIUM);
        addDrop(DecoBlocks.PACKED_PODZOL);
        addDrop(DecoBlocks.PACKED_CRIMSON_NYLIUM);
        addDrop(DecoBlocks.PACKED_WARPED_NYLIUM);

        addDrop(DecoBlocks.GRASS_CARPET);
        addDrop(DecoBlocks.MYCELIUM_CARPET);
        addDrop(DecoBlocks.PODZOL_CARPET);
        addDrop(DecoBlocks.CRIMSON_NYLIUM_CARPET);
        addDrop(DecoBlocks.WARPED_NYLIUM_CARPET);

        addDrop(DecoBlocks.BEDROCK_STAIRS);
        addDrop(DecoBlocks.GRASS_STAIRS);
        addDrop(DecoBlocks.PODZOL_STAIRS);
        addDrop(DecoBlocks.MYCELIUM_STAIRS);
        addDrop(DecoBlocks.CRIMSON_NYLIUM_STAIRS);
        addDrop(DecoBlocks.WARPED_NYLIUM_STAIRS);
        addDrop(DecoBlocks.DIRT_STAIRS);
        addDrop(DecoBlocks.COARSE_DIRT_STAIRS);
        addDrop(DecoBlocks.ROOTED_DIRT_STAIRS);
        addDrop(DecoBlocks.MUD_STAIRS);
        addDrop(DecoBlocks.CLAY_STAIRS);
        addDrop(DecoBlocks.BONE_STAIRS);
        addDrop(DecoBlocks.MOSS_STAIRS);

        addDrop(DecoBlocks.BEDROCK_SLAB, slabDrops(DecoBlocks.BEDROCK_SLAB));
        addDrop(DecoBlocks.GRASS_SLAB, slabDrops(DecoBlocks.GRASS_SLAB));
        addDrop(DecoBlocks.PODZOL_SLAB, slabDrops(DecoBlocks.PODZOL_SLAB));
        addDrop(DecoBlocks.MYCELIUM_SLAB, slabDrops(DecoBlocks.MYCELIUM_SLAB));
        addDrop(DecoBlocks.CRIMSON_NYLIUM_SLAB, slabDrops(DecoBlocks.CRIMSON_NYLIUM_SLAB));
        addDrop(DecoBlocks.WARPED_NYLIUM_SLAB, slabDrops(DecoBlocks.WARPED_NYLIUM_SLAB));
        addDrop(DecoBlocks.MOSS_SLAB, slabDrops(DecoBlocks.MOSS_SLAB));
        addDrop(DecoBlocks.DIRT_SLAB, slabDrops(DecoBlocks.DIRT_SLAB));
        addDrop(DecoBlocks.COARSE_DIRT_SLAB, slabDrops(DecoBlocks.COARSE_DIRT_SLAB));
        addDrop(DecoBlocks.ROOTED_DIRT_SLAB, slabDrops(DecoBlocks.ROOTED_DIRT_SLAB));
        addDrop(DecoBlocks.MUD_SLAB, slabDrops(DecoBlocks.MUD_SLAB));
        addDrop(DecoBlocks.CLAY_SLAB, slabDrops(DecoBlocks.CLAY_SLAB));
        addDrop(DecoBlocks.BONE_SLAB, slabDrops(DecoBlocks.BONE_SLAB));

        addDrop(DecoBlocks.BEDROCK_WALL);
        addDrop(DecoBlocks.DIRT_WALL);
        addDrop(DecoBlocks.COARSE_DIRT_WALL);
        addDrop(DecoBlocks.ROOTED_DIRT_WALL);
        addDrop(DecoBlocks.MUD_WALL);
        addDrop(DecoBlocks.CLAY_WALL);
        addDrop(DecoBlocks.BONE_WALL);

        addDrop(DecoBlocks.CLOUD_BLOCK);

        addDrop(DecoBlocks.SOLID_CLOUD);
        addDrop(DecoBlocks.CLOUD_STAIRS);
        addDrop(DecoBlocks.CLOUD_SLAB, slabDrops(DecoBlocks.BEDROCK_SLAB));
        addDrop(DecoBlocks.CLOUD_WALL);

        addDrop(DecoBlocks.CLOUD_BRICKS);
        addDrop(DecoBlocks.CLOUD_BRICK_STAIRS);
        addDrop(DecoBlocks.CLOUD_BRICK_SLAB, slabDrops(DecoBlocks.BEDROCK_SLAB));
        addDrop(DecoBlocks.CLOUD_BRICK_WALL);

        addDrop(DecoBlocks.CHISELED_CLOUD_BRICKS);

        addDrop(DecoBlocks.IRON_LADDER);
        addDrop(DecoBlocks.GOLDEN_LADDER);

        addDrop(DecoBlocks.COPPER_LADDER);
        addDrop(DecoBlocks.WAXED_COPPER_LADDER);

        addDrop(DecoBlocks.EXPOSED_COPPER_LADDER);
        addDrop(DecoBlocks.WAXED_EXPOSED_COPPER_LADDER);

        addDrop(DecoBlocks.WEATHERED_COPPER_LADDER);
        addDrop(DecoBlocks.WAXED_WEATHERED_COPPER_LADDER);

        addDrop(DecoBlocks.OXIDIZED_COPPER_LADDER);
        addDrop(DecoBlocks.WAXED_OXIDIZED_COPPER_LADDER);

        addDrop(DecoBlocks.ALPINE_POPPY);
        pottedPlantDrops(DecoBlocks.POTTED_ALPINE_POPPY);
        addDrop(DecoBlocks.DEAD_EYE_DAISY);
        pottedPlantDrops(DecoBlocks.POTTED_DEAD_EYE_DAISY);
        addDrop(DecoBlocks.POPPED_BLUET);
        pottedPlantDrops(DecoBlocks.POTTED_POPPED_BLUET);

        addDrop(DecoBlocks.WHITE_WOOL_STAIRS);
        addDrop(DecoBlocks.WHITE_WOOL_SLAB, slabDrops(DecoBlocks.WHITE_WOOL_SLAB));
        addDrop(DecoBlocks.LIGHT_GRAY_WOOL_STAIRS);
        addDrop(DecoBlocks.LIGHT_GRAY_WOOL_SLAB, slabDrops(DecoBlocks.LIGHT_GRAY_WOOL_SLAB));
        addDrop(DecoBlocks.GRAY_WOOL_STAIRS);
        addDrop(DecoBlocks.GRAY_WOOL_SLAB, slabDrops(DecoBlocks.GRAY_WOOL_SLAB));
        addDrop(DecoBlocks.BLACK_WOOL_STAIRS);
        addDrop(DecoBlocks.BLACK_WOOL_SLAB, slabDrops(DecoBlocks.BLACK_WOOL_SLAB));
        addDrop(DecoBlocks.BROWN_WOOL_STAIRS);
        addDrop(DecoBlocks.BROWN_WOOL_SLAB, slabDrops(DecoBlocks.BROWN_WOOL_SLAB));
        addDrop(DecoBlocks.RED_WOOL_STAIRS);
        addDrop(DecoBlocks.RED_WOOL_SLAB, slabDrops(DecoBlocks.RED_WOOL_SLAB));
        addDrop(DecoBlocks.ORANGE_WOOL_STAIRS);
        addDrop(DecoBlocks.ORANGE_WOOL_SLAB, slabDrops(DecoBlocks.ORANGE_WOOL_SLAB));
        addDrop(DecoBlocks.YELLOW_WOOL_STAIRS);
        addDrop(DecoBlocks.YELLOW_WOOL_SLAB, slabDrops(DecoBlocks.YELLOW_WOOL_SLAB));
        addDrop(DecoBlocks.LIME_WOOL_STAIRS);
        addDrop(DecoBlocks.LIME_WOOL_SLAB, slabDrops(DecoBlocks.LIME_WOOL_SLAB));
        addDrop(DecoBlocks.GREEN_WOOL_STAIRS);
        addDrop(DecoBlocks.GREEN_WOOL_SLAB, slabDrops(DecoBlocks.GREEN_WOOL_SLAB));
        addDrop(DecoBlocks.CYAN_WOOL_STAIRS);
        addDrop(DecoBlocks.CYAN_WOOL_SLAB, slabDrops(DecoBlocks.CYAN_WOOL_SLAB));
        addDrop(DecoBlocks.LIGHT_BLUE_WOOL_STAIRS);
        addDrop(DecoBlocks.LIGHT_BLUE_WOOL_SLAB, slabDrops(DecoBlocks.LIGHT_BLUE_WOOL_SLAB));
        addDrop(DecoBlocks.BLUE_WOOL_STAIRS);
        addDrop(DecoBlocks.BLUE_WOOL_SLAB, slabDrops(DecoBlocks.BLUE_WOOL_SLAB));
        addDrop(DecoBlocks.PURPLE_WOOL_STAIRS);
        addDrop(DecoBlocks.PURPLE_WOOL_SLAB, slabDrops(DecoBlocks.PURPLE_WOOL_SLAB));
        addDrop(DecoBlocks.MAGENTA_WOOL_STAIRS);
        addDrop(DecoBlocks.MAGENTA_WOOL_SLAB, slabDrops(DecoBlocks.MAGENTA_WOOL_SLAB));
        addDrop(DecoBlocks.PINK_WOOL_STAIRS);
        addDrop(DecoBlocks.PINK_WOOL_SLAB, slabDrops(DecoBlocks.PINK_WOOL_SLAB));

        addDrop(DecoBlocks.CRACKED_STONE_BRICK_STAIRS);
        addDrop(DecoBlocks.CRACKED_STONE_BRICK_SLAB, slabDrops(DecoBlocks.CRACKED_STONE_BRICK_SLAB));
        addDrop(DecoBlocks.CRACKED_STONE_BRICK_WALL);

        addDrop(DecoBlocks.CRACKED_STONE_TILE_STAIRS);
        addDrop(DecoBlocks.CRACKED_STONE_TILE_SLAB, slabDrops(DecoBlocks.CRACKED_STONE_TILE_SLAB));
        addDrop(DecoBlocks.CRACKED_STONE_TILE_WALL);

        addDrop(DecoBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS);
        addDrop(DecoBlocks.CRACKED_DEEPSLATE_BRICK_SLAB, slabDrops(DecoBlocks.CRACKED_DEEPSLATE_BRICK_SLAB));
        addDrop(DecoBlocks.CRACKED_DEEPSLATE_BRICK_WALL);

        addDrop(DecoBlocks.CRACKED_DEEPSLATE_TILE_STAIRS);
        addDrop(DecoBlocks.CRACKED_DEEPSLATE_TILE_SLAB, slabDrops(DecoBlocks.CRACKED_DEEPSLATE_TILE_SLAB));
        addDrop(DecoBlocks.CRACKED_DEEPSLATE_TILE_WALL);

        addDrop(DecoBlocks.CRACKED_END_STONE_BRICK_STAIRS);
        addDrop(DecoBlocks.CRACKED_END_STONE_BRICK_SLAB, slabDrops(DecoBlocks.CRACKED_END_STONE_BRICK_SLAB));
        addDrop(DecoBlocks.CRACKED_END_STONE_BRICK_WALL);

        addDrop(DecoBlocks.CRACKED_END_STONE_TILE_STAIRS);
        addDrop(DecoBlocks.CRACKED_END_STONE_TILE_SLAB, slabDrops(DecoBlocks.CRACKED_END_STONE_TILE_SLAB));
        addDrop(DecoBlocks.CRACKED_END_STONE_TILE_WALL);

        addDrop(DecoBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS);
        addDrop(DecoBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB, slabDrops(DecoBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB));
        addDrop(DecoBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL);

        addDrop(DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILE_STAIRS);
        addDrop(DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILE_SLAB, slabDrops(DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILE_SLAB));
        addDrop(DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILE_WALL);

        addDrop(DecoBlocks.CRACKED_NETHER_BRICK_STAIRS);
        addDrop(DecoBlocks.CRACKED_NETHER_BRICK_SLAB, slabDrops(DecoBlocks.CRACKED_NETHER_BRICK_SLAB));
        addDrop(DecoBlocks.CRACKED_NETHER_BRICK_WALL);

        addDrop(DecoBlocks.CRACKED_RED_NETHER_BRICK_STAIRS);
        addDrop(DecoBlocks.CRACKED_RED_NETHER_BRICK_SLAB, slabDrops(DecoBlocks.CRACKED_RED_NETHER_BRICK_SLAB));
        addDrop(DecoBlocks.CRACKED_RED_NETHER_BRICK_WALL);

        addDrop(DecoBlocks.CRACKED_BLUE_NETHER_BRICK_STAIRS);
        addDrop(DecoBlocks.CRACKED_BLUE_NETHER_BRICK_SLAB, slabDrops(DecoBlocks.CRACKED_BLUE_NETHER_BRICK_SLAB));
        addDrop(DecoBlocks.CRACKED_BLUE_NETHER_BRICK_WALL);

        addDrop(DecoBlocks.CRACKED_NETHER_BRICK_FENCE);
        addDrop(DecoBlocks.CRACKED_RED_NETHER_BRICK_FENCE);
        addDrop(DecoBlocks.CRACKED_BLUE_NETHER_BRICK_FENCE);

        addDrop(DecoBlocks.CRACKED_NETHER_BRICK_FENCE_GATE);
        addDrop(DecoBlocks.CRACKED_RED_NETHER_BRICK_FENCE_GATE);
        addDrop(DecoBlocks.CRACKED_BLUE_NETHER_BRICK_FENCE_GATE);

        addDrop(DecoBlocks.MOSSY_DEEPSLATE_BRICKS);
        addDrop(DecoBlocks.MOSSY_DEEPSLATE_BRICK_STAIRS);
        addDrop(DecoBlocks.MOSSY_DEEPSLATE_BRICK_SLAB, slabDrops(DecoBlocks.MOSSY_DEEPSLATE_BRICK_SLAB));
        addDrop(DecoBlocks.MOSSY_DEEPSLATE_BRICK_WALL);

        addDrop(DecoBlocks.MOSSY_POLISHED_BLACKSTONE_BRICKS);
        addDrop(DecoBlocks.MOSSY_POLISHED_BLACKSTONE_BRICK_STAIRS);
        addDrop(DecoBlocks.MOSSY_POLISHED_BLACKSTONE_BRICK_SLAB, slabDrops(DecoBlocks.MOSSY_POLISHED_BLACKSTONE_BRICK_SLAB));
        addDrop(DecoBlocks.MOSSY_POLISHED_BLACKSTONE_BRICK_WALL);

        addDrop(DecoBlocks.MOSSY_END_STONE_BRICKS);
        addDrop(DecoBlocks.MOSSY_END_STONE_BRICK_STAIRS);
        addDrop(DecoBlocks.MOSSY_END_STONE_BRICK_SLAB, slabDrops(DecoBlocks.MOSSY_END_STONE_BRICK_SLAB));
        addDrop(DecoBlocks.MOSSY_END_STONE_BRICK_WALL);

        addDrop(DecoBlocks.LAPIS_STAIRS);
        addDrop(DecoBlocks.LAPIS_SLAB, slabDrops(DecoBlocks.LAPIS_SLAB));
        addDrop(DecoBlocks.LAPIS_WALL);

        addDrop(DecoBlocks.LAPIS_BRICKS);
        addDrop(DecoBlocks.LAPIS_BRICK_STAIRS);
        addDrop(DecoBlocks.LAPIS_BRICK_SLAB, slabDrops(DecoBlocks.LAPIS_BRICK_SLAB));
        addDrop(DecoBlocks.LAPIS_BRICK_WALL);

        addDrop(DecoBlocks.CUT_LAPIS);
        addDrop(DecoBlocks.CUT_LAPIS_STAIRS);
        addDrop(DecoBlocks.CUT_LAPIS_SLAB, slabDrops(DecoBlocks.CUT_LAPIS_SLAB));
        addDrop(DecoBlocks.CUT_LAPIS_WALL);

        addDrop(DecoBlocks.SMOOTH_LAPIS);
        addDrop(DecoBlocks.SMOOTH_LAPIS_STAIRS);
        addDrop(DecoBlocks.SMOOTH_LAPIS_SLAB, slabDrops(DecoBlocks.SMOOTH_LAPIS_SLAB));
        addDrop(DecoBlocks.SMOOTH_LAPIS_WALL);

        addDrop(DecoBlocks.CHISELED_LAPIS);
        addDrop(DecoBlocks.LAPIS_PILLAR);

        addDropWithSilkTouch(DecoBlocks.INFESTED_MOSSY_DEEPSLATE_BRICKS, DecoBlocks.MOSSY_DEEPSLATE_BRICKS);
        addDropWithSilkTouch(DecoBlocks.INFESTED_MOSSY_POLISHED_BLACKSTONE_BRICKS, DecoBlocks.MOSSY_POLISHED_BLACKSTONE_BRICKS);

        addDropWithSilkTouch(DecoBlocks.INFESTED_CUT_ANDESITE, DecoBlocks.CUT_ANDESITE);
        addDropWithSilkTouch(DecoBlocks.INFESTED_ANDESITE_BRICKS, DecoBlocks.ANDESITE_BRICKS);

        addDropWithSilkTouch(DecoBlocks.INFESTED_CUT_GRANITE, DecoBlocks.CUT_GRANITE);
        addDropWithSilkTouch(DecoBlocks.INFESTED_GRANITE_BRICKS, DecoBlocks.GRANITE_BRICKS);

        addDropWithSilkTouch(DecoBlocks.INFESTED_CUT_DIORITE, DecoBlocks.CUT_DIORITE);
        addDropWithSilkTouch(DecoBlocks.INFESTED_DIORITE_BRICKS, DecoBlocks.DIORITE_BRICKS);

        addDropWithSilkTouch(DecoBlocks.INFESTED_POLISHED_CALCITE, DecoBlocks.POLISHED_CALCITE);
        addDropWithSilkTouch(DecoBlocks.INFESTED_CUT_CALCITE, DecoBlocks.CUT_CALCITE);
        addDropWithSilkTouch(DecoBlocks.INFESTED_CALCITE_BRICKS, DecoBlocks.CALCITE_BRICKS);

        addDrop(DecoBlocks.IRIS);
        pottedPlantDrops(DecoBlocks.POTTED_IRIS);
        addDrop(DecoBlocks.BLUE_DELPHINIUM);
        pottedPlantDrops(DecoBlocks.POTTED_BLUE_DELPHINIUM);
        addDrop(DecoBlocks.CYAN_ORCHID);
        pottedPlantDrops(DecoBlocks.POTTED_CYAN_ORCHID);
        addDrop(DecoBlocks.FELICIA_DAISY);
        pottedPlantDrops(DecoBlocks.POTTED_FELICIA_DAISY);

        addDrop(DecoBlocks.JACK_O_SOUL_LANTERN);

        addDrop(DecoBlocks.NETHER_BRICK_PILLAR);
        addDrop(DecoBlocks.RED_NETHER_BRICK_PILLAR);
        addDrop(DecoBlocks.BLUE_NETHER_BRICK_PILLAR);

        addDrop(DecoBlocks.DRIPSTONE_BRICKS);
        addDrop(DecoBlocks.DRIPSTONE_BRICK_PILLAR);
        addDrop(DecoBlocks.VOID_STONE_BRICK_PILLAR);

        addDrop(DecoBlocks.CASTED_IRON);
        addDrop(DecoBlocks.CASTED_IRON_STAIRS);
        addDrop(DecoBlocks.CASTED_IRON_SLAB, slabDrops(DecoBlocks.CASTED_IRON_SLAB));

        addDrop(DecoBlocks.DRIPSTONE_BRICK_STAIRS);
        addDrop(DecoBlocks.DRIPSTONE_BRICK_PILLAR_STAIRS);
        addDrop(DecoBlocks.VOID_STONE_BRICK_PILLAR_STAIRS);

        addDrop(DecoBlocks.DRIPSTONE_BRICK_SLAB, slabDrops(DecoBlocks.DRIPSTONE_BRICK_SLAB));
        addDrop(DecoBlocks.DRIPSTONE_BRICK_PILLAR_SLAB, slabDrops(DecoBlocks.DRIPSTONE_BRICK_SLAB));
        addDrop(DecoBlocks.VOID_STONE_BRICK_PILLAR_SLAB, slabDrops(DecoBlocks.DRIPSTONE_BRICK_SLAB));

        addDrop(DecoBlocks.DRIPSTONE_BRICK_WALL);
        addDrop(DecoBlocks.DRIPSTONE_BRICK_PILLAR_WALL);
        addDrop(DecoBlocks.VOID_STONE_BRICK_PILLAR_WALL);

        addDrop(DecoBlocks.CHISELED_DRIPSTONE);

        addDrop(DecoBlocks.TUBE_CORAL_STAIRS);
        addDrop(DecoBlocks.TUBE_CORAL_SLAB, slabDrops(DecoBlocks.TUBE_CORAL_SLAB));
        addDrop(DecoBlocks.TUBE_CORAL_WALL);

        addDrop(DecoBlocks.BRAIN_CORAL_STAIRS);
        addDrop(DecoBlocks.BRAIN_CORAL_SLAB, slabDrops(DecoBlocks.BRAIN_CORAL_SLAB));
        addDrop(DecoBlocks.BRAIN_CORAL_WALL);

        addDrop(DecoBlocks.BUBBLE_CORAL_STAIRS);
        addDrop(DecoBlocks.BUBBLE_CORAL_SLAB, slabDrops(DecoBlocks.BUBBLE_CORAL_SLAB));
        addDrop(DecoBlocks.BUBBLE_CORAL_WALL);

        addDrop(DecoBlocks.FIRE_CORAL_STAIRS);
        addDrop(DecoBlocks.FIRE_CORAL_SLAB, slabDrops(DecoBlocks.FIRE_CORAL_SLAB));
        addDrop(DecoBlocks.FIRE_CORAL_WALL);

        addDrop(DecoBlocks.HORN_CORAL_STAIRS);
        addDrop(DecoBlocks.HORN_CORAL_SLAB, slabDrops(DecoBlocks.HORN_CORAL_SLAB));
        addDrop(DecoBlocks.HORN_CORAL_WALL);

        addDrop(DecoBlocks.DEAD_TUBE_CORAL_STAIRS);
        addDrop(DecoBlocks.DEAD_TUBE_CORAL_SLAB, slabDrops(DecoBlocks.DEAD_TUBE_CORAL_SLAB));
        addDrop(DecoBlocks.DEAD_TUBE_CORAL_WALL);

        addDrop(DecoBlocks.DEAD_BRAIN_CORAL_STAIRS);
        addDrop(DecoBlocks.DEAD_BRAIN_CORAL_SLAB, slabDrops(DecoBlocks.DEAD_BRAIN_CORAL_SLAB));
        addDrop(DecoBlocks.DEAD_BRAIN_CORAL_WALL);

        addDrop(DecoBlocks.DEAD_BUBBLE_CORAL_STAIRS);
        addDrop(DecoBlocks.DEAD_BUBBLE_CORAL_SLAB, slabDrops(DecoBlocks.DEAD_BUBBLE_CORAL_SLAB));
        addDrop(DecoBlocks.DEAD_BUBBLE_CORAL_WALL);

        addDrop(DecoBlocks.DEAD_FIRE_CORAL_STAIRS);
        addDrop(DecoBlocks.DEAD_FIRE_CORAL_SLAB, slabDrops(DecoBlocks.DEAD_FIRE_CORAL_SLAB));
        addDrop(DecoBlocks.DEAD_FIRE_CORAL_WALL);

        addDrop(DecoBlocks.DEAD_HORN_CORAL_STAIRS);
        addDrop(DecoBlocks.DEAD_HORN_CORAL_SLAB, slabDrops(DecoBlocks.DEAD_HORN_CORAL_SLAB));
        addDrop(DecoBlocks.DEAD_HORN_CORAL_WALL);

        addDropWithSilkTouch(DecoBlocks.HYDRATED_TUBE_CORAL, Blocks.TUBE_CORAL);
        addDropWithSilkTouch(DecoBlocks.HYDRATED_BRAIN_CORAL, Blocks.BRAIN_CORAL);
        addDropWithSilkTouch(DecoBlocks.HYDRATED_BUBBLE_CORAL, Blocks.BUBBLE_CORAL);
        addDropWithSilkTouch(DecoBlocks.HYDRATED_FIRE_CORAL, Blocks.FIRE_CORAL);
        addDropWithSilkTouch(DecoBlocks.HYDRATED_HORN_CORAL, Blocks.HORN_CORAL);

        addDropWithSilkTouch(DecoBlocks.HYDRATED_TUBE_CORAL_FAN, Blocks.TUBE_CORAL_FAN);
        addDropWithSilkTouch(DecoBlocks.HYDRATED_BRAIN_CORAL_FAN, Blocks.BRAIN_CORAL_FAN);
        addDropWithSilkTouch(DecoBlocks.HYDRATED_BUBBLE_CORAL_FAN, Blocks.BUBBLE_CORAL_FAN);
        addDropWithSilkTouch(DecoBlocks.HYDRATED_FIRE_CORAL_FAN, Blocks.FIRE_CORAL_FAN);
        addDropWithSilkTouch(DecoBlocks.HYDRATED_HORN_CORAL_FAN, Blocks.HORN_CORAL_FAN);

        addDropWithSilkTouch(DecoBlocks.HYDRATED_TUBE_CORAL_BLOCK, Blocks.TUBE_CORAL_BLOCK);
        addDropWithSilkTouch(DecoBlocks.HYDRATED_BRAIN_CORAL_BLOCK, Blocks.BRAIN_CORAL_BLOCK);
        addDropWithSilkTouch(DecoBlocks.HYDRATED_BUBBLE_CORAL_BLOCK, Blocks.BUBBLE_CORAL_BLOCK);
        addDropWithSilkTouch(DecoBlocks.HYDRATED_FIRE_CORAL_BLOCK, Blocks.FIRE_CORAL_BLOCK);
        addDropWithSilkTouch(DecoBlocks.HYDRATED_HORN_CORAL_BLOCK, Blocks.HORN_CORAL_BLOCK);

        addDrop(DecoBlocks.HYDRATED_TUBE_CORAL_STAIRS);
        addDrop(DecoBlocks.HYDRATED_TUBE_CORAL_SLAB, slabDrops(DecoBlocks.HYDRATED_TUBE_CORAL_SLAB));
        addDrop(DecoBlocks.HYDRATED_TUBE_CORAL_WALL);

        addDrop(DecoBlocks.HYDRATED_BRAIN_CORAL_STAIRS);
        addDrop(DecoBlocks.HYDRATED_BRAIN_CORAL_SLAB, slabDrops(DecoBlocks.HYDRATED_BRAIN_CORAL_SLAB));
        addDrop(DecoBlocks.HYDRATED_BRAIN_CORAL_WALL);

        addDrop(DecoBlocks.HYDRATED_BUBBLE_CORAL_STAIRS);
        addDrop(DecoBlocks.HYDRATED_BUBBLE_CORAL_SLAB, slabDrops(DecoBlocks.HYDRATED_BUBBLE_CORAL_SLAB));
        addDrop(DecoBlocks.HYDRATED_BUBBLE_CORAL_WALL);

        addDrop(DecoBlocks.HYDRATED_FIRE_CORAL_STAIRS);
        addDrop(DecoBlocks.HYDRATED_FIRE_CORAL_SLAB, slabDrops(DecoBlocks.HYDRATED_FIRE_CORAL_SLAB));
        addDrop(DecoBlocks.HYDRATED_FIRE_CORAL_WALL);

        addDrop(DecoBlocks.HYDRATED_HORN_CORAL_STAIRS);
        addDrop(DecoBlocks.HYDRATED_HORN_CORAL_SLAB, slabDrops(DecoBlocks.HYDRATED_HORN_CORAL_SLAB));
        addDrop(DecoBlocks.HYDRATED_HORN_CORAL_WALL);

        addDrop(DecoBlocks.HAY_STAIRS);
        addDrop(DecoBlocks.HAY_SLAB, slabDrops(DecoBlocks.HAY_SLAB));
        addDrop(DecoBlocks.HAY_CARPET);

        addDrop(DecoBlocks.NETHER_WART_STAIRS);
        addDrop(DecoBlocks.NETHER_WART_SLAB, slabDrops(DecoBlocks.NETHER_WART_SLAB));
        addDrop(DecoBlocks.WARPED_WART_STAIRS);
        addDrop(DecoBlocks.WARPED_WART_SLAB, slabDrops(DecoBlocks.WARPED_WART_SLAB));

        addDrop(DecoBlocks.SCULK_STAIRS);
        addDrop(DecoBlocks.SCULK_SLAB, slabDrops(DecoBlocks.SCULK_SLAB));
        addDrop(DecoBlocks.SCULK_CARPET);

        addDrop(DecoBlocks.HONEYCOMB_STAIRS);
        addDrop(DecoBlocks.HONEYCOMB_SLAB, slabDrops(DecoBlocks.HONEYCOMB_SLAB));
        addDrop(DecoBlocks.HONEYCOMB_WALL);

        addDrop(DecoBlocks.DUEL_CUT_LIGHT_GRAY_CONCRETE);
        addDrop(DecoBlocks.DUEL_CUT_GRAY_CONCRETE);
        addDrop(DecoBlocks.DUEL_CUT_BLACK_CONCRETE);
        addDrop(DecoBlocks.DUEL_CUT_BROWN_CONCRETE);
        addDrop(DecoBlocks.DUEL_CUT_RED_CONCRETE);
        addDrop(DecoBlocks.DUEL_CUT_YELLOW_CONCRETE);
        addDrop(DecoBlocks.DUEL_CUT_ORANGE_CONCRETE);
        addDrop(DecoBlocks.DUEL_CUT_LIME_CONCRETE);
        addDrop(DecoBlocks.DUEL_CUT_GREEN_CONCRETE);
        addDrop(DecoBlocks.DUEL_CUT_CYAN_CONCRETE);
        addDrop(DecoBlocks.DUEL_CUT_LIGHT_BLUE_CONCRETE);
        addDrop(DecoBlocks.DUEL_CUT_BLUE_CONCRETE);
        addDrop(DecoBlocks.DUEL_CUT_PURPLE_CONCRETE);
        addDrop(DecoBlocks.DUEL_CUT_MAGENTA_CONCRETE);
        addDrop(DecoBlocks.DUEL_CUT_PINK_CONCRETE);

        addDrop(DecoBlocks.DUEL_CUT_LIGHT_GRAY_CONCRETE_STAIRS);
        addDrop(DecoBlocks.DUEL_CUT_LIGHT_GRAY_CONCRETE_SLAB, slabDrops(DecoBlocks.DUEL_CUT_LIGHT_GRAY_CONCRETE_SLAB));
        addDrop(DecoBlocks.DUEL_CUT_LIGHT_GRAY_CONCRETE_WALL);
        addDrop(DecoBlocks.DUEL_CUT_GRAY_CONCRETE_STAIRS);
        addDrop(DecoBlocks.DUEL_CUT_GRAY_CONCRETE_SLAB, slabDrops(DecoBlocks.DUEL_CUT_GRAY_CONCRETE_SLAB));
        addDrop(DecoBlocks.DUEL_CUT_GRAY_CONCRETE_WALL);
        addDrop(DecoBlocks.DUEL_CUT_BLACK_CONCRETE_STAIRS);
        addDrop(DecoBlocks.DUEL_CUT_BLACK_CONCRETE_SLAB, slabDrops(DecoBlocks.DUEL_CUT_BLACK_CONCRETE_SLAB));
        addDrop(DecoBlocks.DUEL_CUT_BLACK_CONCRETE_WALL);
        addDrop(DecoBlocks.DUEL_CUT_BROWN_CONCRETE_STAIRS);
        addDrop(DecoBlocks.DUEL_CUT_BROWN_CONCRETE_SLAB, slabDrops(DecoBlocks.DUEL_CUT_BROWN_CONCRETE_SLAB));
        addDrop(DecoBlocks.DUEL_CUT_BROWN_CONCRETE_WALL);
        addDrop(DecoBlocks.DUEL_CUT_RED_CONCRETE_STAIRS);
        addDrop(DecoBlocks.DUEL_CUT_RED_CONCRETE_SLAB, slabDrops(DecoBlocks.DUEL_CUT_RED_CONCRETE_SLAB));
        addDrop(DecoBlocks.DUEL_CUT_RED_CONCRETE_WALL);
        addDrop(DecoBlocks.DUEL_CUT_ORANGE_CONCRETE_STAIRS);
        addDrop(DecoBlocks.DUEL_CUT_ORANGE_CONCRETE_SLAB, slabDrops(DecoBlocks.DUEL_CUT_ORANGE_CONCRETE_SLAB));
        addDrop(DecoBlocks.DUEL_CUT_ORANGE_CONCRETE_WALL);
        addDrop(DecoBlocks.DUEL_CUT_YELLOW_CONCRETE_STAIRS);
        addDrop(DecoBlocks.DUEL_CUT_YELLOW_CONCRETE_SLAB, slabDrops(DecoBlocks.DUEL_CUT_YELLOW_CONCRETE_SLAB));
        addDrop(DecoBlocks.DUEL_CUT_YELLOW_CONCRETE_WALL);
        addDrop(DecoBlocks.DUEL_CUT_LIME_CONCRETE_STAIRS);
        addDrop(DecoBlocks.DUEL_CUT_LIME_CONCRETE_SLAB, slabDrops(DecoBlocks.DUEL_CUT_LIME_CONCRETE_SLAB));
        addDrop(DecoBlocks.DUEL_CUT_LIME_CONCRETE_WALL);
        addDrop(DecoBlocks.DUEL_CUT_GREEN_CONCRETE_STAIRS);
        addDrop(DecoBlocks.DUEL_CUT_GREEN_CONCRETE_SLAB, slabDrops(DecoBlocks.DUEL_CUT_GREEN_CONCRETE_SLAB));
        addDrop(DecoBlocks.DUEL_CUT_GREEN_CONCRETE_WALL);
        addDrop(DecoBlocks.DUEL_CUT_CYAN_CONCRETE_STAIRS);
        addDrop(DecoBlocks.DUEL_CUT_CYAN_CONCRETE_SLAB, slabDrops(DecoBlocks.DUEL_CUT_CYAN_CONCRETE_SLAB));
        addDrop(DecoBlocks.DUEL_CUT_CYAN_CONCRETE_WALL);
        addDrop(DecoBlocks.DUEL_CUT_LIGHT_BLUE_CONCRETE_STAIRS);
        addDrop(DecoBlocks.DUEL_CUT_LIGHT_BLUE_CONCRETE_SLAB, slabDrops(DecoBlocks.DUEL_CUT_LIGHT_BLUE_CONCRETE_SLAB));
        addDrop(DecoBlocks.DUEL_CUT_LIGHT_BLUE_CONCRETE_WALL);
        addDrop(DecoBlocks.DUEL_CUT_BLUE_CONCRETE_STAIRS);
        addDrop(DecoBlocks.DUEL_CUT_BLUE_CONCRETE_SLAB, slabDrops(DecoBlocks.DUEL_CUT_BLUE_CONCRETE_SLAB));
        addDrop(DecoBlocks.DUEL_CUT_BLUE_CONCRETE_WALL);
        addDrop(DecoBlocks.DUEL_CUT_PURPLE_CONCRETE_STAIRS);
        addDrop(DecoBlocks.DUEL_CUT_PURPLE_CONCRETE_SLAB, slabDrops(DecoBlocks.DUEL_CUT_PURPLE_CONCRETE_SLAB));
        addDrop(DecoBlocks.DUEL_CUT_PURPLE_CONCRETE_WALL);
        addDrop(DecoBlocks.DUEL_CUT_MAGENTA_CONCRETE_STAIRS);
        addDrop(DecoBlocks.DUEL_CUT_MAGENTA_CONCRETE_SLAB, slabDrops(DecoBlocks.DUEL_CUT_MAGENTA_CONCRETE_SLAB));
        addDrop(DecoBlocks.DUEL_CUT_MAGENTA_CONCRETE_WALL);
        addDrop(DecoBlocks.DUEL_CUT_PINK_CONCRETE_STAIRS);
        addDrop(DecoBlocks.DUEL_CUT_PINK_CONCRETE_SLAB, slabDrops(DecoBlocks.DUEL_CUT_PINK_CONCRETE_SLAB));
        addDrop(DecoBlocks.DUEL_CUT_PINK_CONCRETE_WALL);

        addDrop(DecoBlocks.CHECKERED_LIGHT_GRAY_CONCRETE);
        addDrop(DecoBlocks.CHECKERED_GRAY_CONCRETE);
        addDrop(DecoBlocks.CHECKERED_BLACK_CONCRETE);
        addDrop(DecoBlocks.CHECKERED_BROWN_CONCRETE);
        addDrop(DecoBlocks.CHECKERED_RED_CONCRETE);
        addDrop(DecoBlocks.CHECKERED_YELLOW_CONCRETE);
        addDrop(DecoBlocks.CHECKERED_ORANGE_CONCRETE);
        addDrop(DecoBlocks.CHECKERED_LIME_CONCRETE);
        addDrop(DecoBlocks.CHECKERED_GREEN_CONCRETE);
        addDrop(DecoBlocks.CHECKERED_CYAN_CONCRETE);
        addDrop(DecoBlocks.CHECKERED_LIGHT_BLUE_CONCRETE);
        addDrop(DecoBlocks.CHECKERED_BLUE_CONCRETE);
        addDrop(DecoBlocks.CHECKERED_PURPLE_CONCRETE);
        addDrop(DecoBlocks.CHECKERED_MAGENTA_CONCRETE);
        addDrop(DecoBlocks.CHECKERED_PINK_CONCRETE);

        addDrop(DecoBlocks.CHECKERED_LIGHT_GRAY_CONCRETE_STAIRS);
        addDrop(DecoBlocks.CHECKERED_LIGHT_GRAY_CONCRETE_SLAB, slabDrops(DecoBlocks.CHECKERED_LIGHT_GRAY_CONCRETE_SLAB));
        addDrop(DecoBlocks.CHECKERED_LIGHT_GRAY_CONCRETE_WALL);
        addDrop(DecoBlocks.CHECKERED_GRAY_CONCRETE_STAIRS);
        addDrop(DecoBlocks.CHECKERED_GRAY_CONCRETE_SLAB, slabDrops(DecoBlocks.CHECKERED_GRAY_CONCRETE_SLAB));
        addDrop(DecoBlocks.CHECKERED_GRAY_CONCRETE_WALL);
        addDrop(DecoBlocks.CHECKERED_BLACK_CONCRETE_STAIRS);
        addDrop(DecoBlocks.CHECKERED_BLACK_CONCRETE_SLAB, slabDrops(DecoBlocks.CHECKERED_BLACK_CONCRETE_SLAB));
        addDrop(DecoBlocks.CHECKERED_BLACK_CONCRETE_WALL);
        addDrop(DecoBlocks.CHECKERED_BROWN_CONCRETE_STAIRS);
        addDrop(DecoBlocks.CHECKERED_BROWN_CONCRETE_SLAB, slabDrops(DecoBlocks.CHECKERED_BROWN_CONCRETE_SLAB));
        addDrop(DecoBlocks.CHECKERED_BROWN_CONCRETE_WALL);
        addDrop(DecoBlocks.CHECKERED_RED_CONCRETE_STAIRS);
        addDrop(DecoBlocks.CHECKERED_RED_CONCRETE_SLAB, slabDrops(DecoBlocks.CHECKERED_RED_CONCRETE_SLAB));
        addDrop(DecoBlocks.CHECKERED_RED_CONCRETE_WALL);
        addDrop(DecoBlocks.CHECKERED_ORANGE_CONCRETE_STAIRS);
        addDrop(DecoBlocks.CHECKERED_ORANGE_CONCRETE_SLAB, slabDrops(DecoBlocks.CHECKERED_ORANGE_CONCRETE_SLAB));
        addDrop(DecoBlocks.CHECKERED_ORANGE_CONCRETE_WALL);
        addDrop(DecoBlocks.CHECKERED_YELLOW_CONCRETE_STAIRS);
        addDrop(DecoBlocks.CHECKERED_YELLOW_CONCRETE_SLAB, slabDrops(DecoBlocks.CHECKERED_YELLOW_CONCRETE_SLAB));
        addDrop(DecoBlocks.CHECKERED_YELLOW_CONCRETE_WALL);
        addDrop(DecoBlocks.CHECKERED_LIME_CONCRETE_STAIRS);
        addDrop(DecoBlocks.CHECKERED_LIME_CONCRETE_SLAB, slabDrops(DecoBlocks.CHECKERED_LIME_CONCRETE_SLAB));
        addDrop(DecoBlocks.CHECKERED_LIME_CONCRETE_WALL);
        addDrop(DecoBlocks.CHECKERED_GREEN_CONCRETE_STAIRS);
        addDrop(DecoBlocks.CHECKERED_GREEN_CONCRETE_SLAB, slabDrops(DecoBlocks.CHECKERED_GREEN_CONCRETE_SLAB));
        addDrop(DecoBlocks.CHECKERED_GREEN_CONCRETE_WALL);
        addDrop(DecoBlocks.CHECKERED_CYAN_CONCRETE_STAIRS);
        addDrop(DecoBlocks.CHECKERED_CYAN_CONCRETE_SLAB, slabDrops(DecoBlocks.CHECKERED_CYAN_CONCRETE_SLAB));
        addDrop(DecoBlocks.CHECKERED_CYAN_CONCRETE_WALL);
        addDrop(DecoBlocks.CHECKERED_LIGHT_BLUE_CONCRETE_STAIRS);
        addDrop(DecoBlocks.CHECKERED_LIGHT_BLUE_CONCRETE_SLAB, slabDrops(DecoBlocks.CHECKERED_LIGHT_BLUE_CONCRETE_SLAB));
        addDrop(DecoBlocks.CHECKERED_LIGHT_BLUE_CONCRETE_WALL);
        addDrop(DecoBlocks.CHECKERED_BLUE_CONCRETE_STAIRS);
        addDrop(DecoBlocks.CHECKERED_BLUE_CONCRETE_SLAB, slabDrops(DecoBlocks.CHECKERED_BLUE_CONCRETE_SLAB));
        addDrop(DecoBlocks.CHECKERED_BLUE_CONCRETE_WALL);
        addDrop(DecoBlocks.CHECKERED_PURPLE_CONCRETE_STAIRS);
        addDrop(DecoBlocks.CHECKERED_PURPLE_CONCRETE_SLAB, slabDrops(DecoBlocks.CHECKERED_PURPLE_CONCRETE_SLAB));
        addDrop(DecoBlocks.CHECKERED_PURPLE_CONCRETE_WALL);
        addDrop(DecoBlocks.CHECKERED_MAGENTA_CONCRETE_STAIRS);
        addDrop(DecoBlocks.CHECKERED_MAGENTA_CONCRETE_SLAB, slabDrops(DecoBlocks.CHECKERED_MAGENTA_CONCRETE_SLAB));
        addDrop(DecoBlocks.CHECKERED_MAGENTA_CONCRETE_WALL);
        addDrop(DecoBlocks.CHECKERED_PINK_CONCRETE_STAIRS);
        addDrop(DecoBlocks.CHECKERED_PINK_CONCRETE_SLAB, slabDrops(DecoBlocks.CHECKERED_PINK_CONCRETE_SLAB));
        addDrop(DecoBlocks.CHECKERED_PINK_CONCRETE_WALL);

        dropsWithSilkTouch(DecoBlocks.GLOWING_GLASS);
        dropsWithSilkTouch(DecoBlocks.GLOWING_GLASS_PANE);

        addDrop(DecoBlocks.HARDENED_GLOWING_GLASS);
        addDrop(DecoBlocks.HARDENED_GLOWING_GLASS_PANE);

        addDrop(DecoBlocks.TAIGA_DANDELION);
        pottedPlantDrops(DecoBlocks.POTTED_TAIGA_DANDELION);
        addDrop(DecoBlocks.FERN_LAVENDER);
        pottedPlantDrops(DecoBlocks.POTTED_FERN_LAVENDER);
        addDrop(DecoBlocks.CARAMEL_BUTTERCUP);
        pottedPlantDrops(DecoBlocks.POTTED_CARAMEL_BUTTERCUP);
        addDrop(DecoBlocks.SILVER_ROSE);
        pottedPlantDrops(DecoBlocks.POTTED_SILVER_ROSE);
        addDrop(DecoBlocks.ALPINE_SPEEDWELL);
        pottedPlantDrops(DecoBlocks.POTTED_ALPINE_SPEEDWELL);

        drops(DecoBlocks.GOLD_CHAIN);

        addDrop(DecoBlocks.COAL_STAIRS);
        addDrop(DecoBlocks.COAL_SLAB, slabDrops(DecoBlocks.COAL_SLAB));
        addDrop(DecoBlocks.COAL_WALL);

        addDrop(DecoBlocks.COAL_BRICKS);
        addDrop(DecoBlocks.COAL_BRICK_STAIRS);
        addDrop(DecoBlocks.COAL_BRICK_SLAB, slabDrops(DecoBlocks.COAL_BRICK_SLAB));
        addDrop(DecoBlocks.COAL_BRICK_WALL);

        addDrop(DecoBlocks.CHARCOAL_STAIRS);
        addDrop(DecoBlocks.CHARCOAL_SLAB, slabDrops(DecoBlocks.CHARCOAL_SLAB));
        addDrop(DecoBlocks.CHARCOAL_WALL);

        addDrop(DecoBlocks.HANGING_LAMP);

        addDrop(DecoBlocks.HANGING_WHITE_LAMP);
        addDrop(DecoBlocks.HANGING_LIGHT_GRAY_LAMP);
        addDrop(DecoBlocks.HANGING_GRAY_LAMP);
        addDrop(DecoBlocks.HANGING_BLACK_LAMP);
        addDrop(DecoBlocks.HANGING_BROWN_LAMP);
        addDrop(DecoBlocks.HANGING_RED_LAMP);
        addDrop(DecoBlocks.HANGING_ORANGE_LAMP);
        addDrop(DecoBlocks.HANGING_YELLOW_LAMP);
        addDrop(DecoBlocks.HANGING_LIME_LAMP);
        addDrop(DecoBlocks.HANGING_GREEN_LAMP);
        addDrop(DecoBlocks.HANGING_CYAN_LAMP);
        addDrop(DecoBlocks.HANGING_LIGHT_BLUE_LAMP);
        addDrop(DecoBlocks.HANGING_BLUE_LAMP);
        addDrop(DecoBlocks.HANGING_PURPLE_LAMP);
        addDrop(DecoBlocks.HANGING_MAGENTA_LAMP);
        addDrop(DecoBlocks.HANGING_PINK_LAMP);

        addDrop(DecoBlocks.SAND_SLAB, slabDrops(DecoBlocks.SAND_SLAB));
        addDrop(DecoBlocks.SAND_STAIRS);
        addDrop(DecoBlocks.SAND_CARPET);

        addDrop(DecoBlocks.RED_SAND_SLAB, slabDrops(DecoBlocks.RED_SAND_SLAB));
        addDrop(DecoBlocks.RED_SAND_STAIRS);
        addDrop(DecoBlocks.RED_SAND_CARPET);

        addDrop(DecoBlocks.GRAVEL_SLAB, slabDrops(DecoBlocks.GRAVEL_SLAB));
        addDrop(DecoBlocks.GRAVEL_STAIRS);
        addDrop(DecoBlocks.GRAVEL_CARPET);

        addDrop(DecoBlocks.FLINT_STAIRS);
        addDrop(DecoBlocks.FLINT_SLAB, slabDrops(DecoBlocks.FLINT_SLAB));
        addDrop(DecoBlocks.FLINT_WALL);

        addDrop(DecoBlocks.WHITE_SANDSTONE);
        addDrop(DecoBlocks.WHITE_SANDSTONE_STAIRS);
        addDrop(DecoBlocks.WHITE_SANDSTONE_SLAB, slabDrops(DecoBlocks.WHITE_SANDSTONE_SLAB));
        addDrop(DecoBlocks.WHITE_SANDSTONE_WALL);

        addDrop(DecoBlocks.CUT_WHITE_SANDSTONE);
        addDrop(DecoBlocks.CUT_WHITE_SANDSTONE_STAIRS);
        addDrop(DecoBlocks.CUT_WHITE_SANDSTONE_SLAB, slabDrops(DecoBlocks.CUT_WHITE_SANDSTONE_SLAB));
        addDrop(DecoBlocks.CUT_WHITE_SANDSTONE_WALL);

        addDrop(DecoBlocks.CHISELED_WHITE_SANDSTONE);

        addDrop(DecoBlocks.SMOOTH_WHITE_SANDSTONE);
        addDrop(DecoBlocks.SMOOTH_WHITE_SANDSTONE_STAIRS);
        addDrop(DecoBlocks.SMOOTH_WHITE_SANDSTONE_SLAB, slabDrops(DecoBlocks.SMOOTH_WHITE_SANDSTONE_SLAB));
        addDrop(DecoBlocks.SMOOTH_WHITE_SANDSTONE_WALL);

        addDrop(DecoBlocks.CUT_WHITE_SANDSTONE_BRICKS);
        addDrop(DecoBlocks.CUT_WHITE_SANDSTONE_BRICK_STAIRS);
        addDrop(DecoBlocks.CUT_WHITE_SANDSTONE_BRICK_SLAB, slabDrops(DecoBlocks.CUT_WHITE_SANDSTONE_BRICK_SLAB));
        addDrop(DecoBlocks.CUT_WHITE_SANDSTONE_BRICK_WALL);

        addDrop(DecoBlocks.COBBLED_WHITE_SANDSTONE);
        addDrop(DecoBlocks.COBBLED_WHITE_SANDSTONE_STAIRS);
        addDrop(DecoBlocks.COBBLED_WHITE_SANDSTONE_SLAB, slabDrops(DecoBlocks.COBBLED_WHITE_SANDSTONE_SLAB));
        addDrop(DecoBlocks.COBBLED_WHITE_SANDSTONE_WALL);

        addDrop(DecoBlocks.POLISHED_WHITE_SANDSTONE);
        addDrop(DecoBlocks.POLISHED_WHITE_SANDSTONE_STAIRS);
        addDrop(DecoBlocks.POLISHED_WHITE_SANDSTONE_SLAB, slabDrops(DecoBlocks.POLISHED_WHITE_SANDSTONE_SLAB));
        addDrop(DecoBlocks.POLISHED_WHITE_SANDSTONE_WALL);

        addDrop(DecoBlocks.WHITE_SANDSTONE_BRICKS);
        addDrop(DecoBlocks.WHITE_SANDSTONE_BRICK_STAIRS);
        addDrop(DecoBlocks.WHITE_SANDSTONE_BRICK_SLAB, slabDrops(DecoBlocks.WHITE_SANDSTONE_BRICK_SLAB));
        addDrop(DecoBlocks.WHITE_SANDSTONE_BRICK_WALL);

        addDrop(DecoBlocks.CHISELED_POLISHED_WHITE_SANDSTONE);

        addDrop(DecoBlocks.BLACK_SANDSTONE);
        addDrop(DecoBlocks.BLACK_SANDSTONE_STAIRS);
        addDrop(DecoBlocks.BLACK_SANDSTONE_SLAB, slabDrops(DecoBlocks.BLACK_SANDSTONE_SLAB));
        addDrop(DecoBlocks.BLACK_SANDSTONE_WALL);

        addDrop(DecoBlocks.CUT_BLACK_SANDSTONE);
        addDrop(DecoBlocks.CUT_BLACK_SANDSTONE_STAIRS);
        addDrop(DecoBlocks.CUT_BLACK_SANDSTONE_SLAB, slabDrops(DecoBlocks.CUT_BLACK_SANDSTONE_SLAB));
        addDrop(DecoBlocks.CUT_BLACK_SANDSTONE_WALL);

        addDrop(DecoBlocks.CHISELED_BLACK_SANDSTONE);

        addDrop(DecoBlocks.SMOOTH_BLACK_SANDSTONE);
        addDrop(DecoBlocks.SMOOTH_BLACK_SANDSTONE_STAIRS);
        addDrop(DecoBlocks.SMOOTH_BLACK_SANDSTONE_SLAB, slabDrops(DecoBlocks.SMOOTH_BLACK_SANDSTONE_SLAB));
        addDrop(DecoBlocks.SMOOTH_BLACK_SANDSTONE_WALL);

        addDrop(DecoBlocks.CUT_BLACK_SANDSTONE_BRICKS);
        addDrop(DecoBlocks.CUT_BLACK_SANDSTONE_BRICK_STAIRS);
        addDrop(DecoBlocks.CUT_BLACK_SANDSTONE_BRICK_SLAB, slabDrops(DecoBlocks.CUT_BLACK_SANDSTONE_BRICK_SLAB));
        addDrop(DecoBlocks.CUT_BLACK_SANDSTONE_BRICK_WALL);

        addDrop(DecoBlocks.COBBLED_BLACK_SANDSTONE);
        addDrop(DecoBlocks.COBBLED_BLACK_SANDSTONE_STAIRS);
        addDrop(DecoBlocks.COBBLED_BLACK_SANDSTONE_SLAB, slabDrops(DecoBlocks.COBBLED_BLACK_SANDSTONE_SLAB));
        addDrop(DecoBlocks.COBBLED_BLACK_SANDSTONE_WALL);

        addDrop(DecoBlocks.POLISHED_BLACK_SANDSTONE);
        addDrop(DecoBlocks.POLISHED_BLACK_SANDSTONE_STAIRS);
        addDrop(DecoBlocks.POLISHED_BLACK_SANDSTONE_SLAB, slabDrops(DecoBlocks.POLISHED_BLACK_SANDSTONE_SLAB));
        addDrop(DecoBlocks.POLISHED_BLACK_SANDSTONE_WALL);

        addDrop(DecoBlocks.BLACK_SANDSTONE_BRICKS);
        addDrop(DecoBlocks.BLACK_SANDSTONE_BRICK_STAIRS);
        addDrop(DecoBlocks.BLACK_SANDSTONE_BRICK_SLAB, slabDrops(DecoBlocks.BLACK_SANDSTONE_BRICK_SLAB));
        addDrop(DecoBlocks.BLACK_SANDSTONE_BRICK_WALL);

        addDrop(DecoBlocks.CHISELED_POLISHED_BLACK_SANDSTONE);

        addDrop(DecoBlocks.GOLD_LANTERN);
        addDrop(DecoBlocks.GOLD_SOUL_LANTERN);

        addDrop(DecoBlocks.WHITE_SAND);

        addDrop(DecoBlocks.WHITE_SAND_SLAB, slabDrops(DecoBlocks.WHITE_SAND_SLAB));
        addDrop(DecoBlocks.WHITE_SAND_STAIRS);
        addDrop(DecoBlocks.WHITE_SAND_CARPET);

        addDrop(DecoBlocks.BLACK_SAND);

        addDrop(DecoBlocks.BLACK_SAND_SLAB, slabDrops(DecoBlocks.BLACK_SAND_SLAB));
        addDrop(DecoBlocks.BLACK_SAND_STAIRS);
        addDrop(DecoBlocks.BLACK_SAND_CARPET);

        addDrop(DecoBlocks.IRON_BAR_DOOR, doorDrops(DecoBlocks.IRON_BAR_DOOR));
        addDrop(DecoBlocks.IRON_BAR_TRAPDOOR);

        addDrop(DecoBlocks.GOLD_BAR_DOOR, doorDrops(DecoBlocks.GOLD_BAR_DOOR));
        addDrop(DecoBlocks.GOLD_BAR_TRAPDOOR);

        addDrop(DecoBlocks.AMETHYST_STAIRS);
        addDrop(DecoBlocks.AMETHYST_SLAB, slabDrops(DecoBlocks.AMETHYST_SLAB));
        addDrop(DecoBlocks.AMETHYST_WALL);

        addDrop(DecoBlocks.ECHO_STAIRS);
        addDrop(DecoBlocks.ECHO_SLAB, slabDrops(DecoBlocks.ECHO_SLAB));
        addDrop(DecoBlocks.ECHO_WALL);

        addDrop(DecoBlocks.SHINED_AMETHYST);
        addDrop(DecoBlocks.SHINED_AMETHYST_STAIRS);
        addDrop(DecoBlocks.SHINED_AMETHYST_SLAB, slabDrops(DecoBlocks.SHINED_AMETHYST_SLAB));
        addDrop(DecoBlocks.SHINED_AMETHYST_WALL);

        addDrop(DecoBlocks.AMETHYST_PILLAR);

        addDrop(DecoBlocks.AMETHYST_BRICKS);
        addDrop(DecoBlocks.AMETHYST_BRICK_STAIRS);
        addDrop(DecoBlocks.AMETHYST_BRICK_SLAB, slabDrops(DecoBlocks.AMETHYST_BRICK_SLAB));
        addDrop(DecoBlocks.AMETHYST_BRICK_WALL);

        addDrop(DecoBlocks.SCATTERED_AMETHYST);
        addDrop(DecoBlocks.SCATTERED_AMETHYST_STAIRS);
        addDrop(DecoBlocks.SCATTERED_AMETHYST_SLAB, slabDrops(DecoBlocks.SCATTERED_AMETHYST_SLAB));
        addDrop(DecoBlocks.SCATTERED_AMETHYST_WALL);

        addDrop(DecoBlocks.SHINED_ECHO);
        addDrop(DecoBlocks.SHINED_ECHO_STAIRS);
        addDrop(DecoBlocks.SHINED_ECHO_SLAB, slabDrops(DecoBlocks.SHINED_ECHO_SLAB));
        addDrop(DecoBlocks.SHINED_ECHO_WALL);

        addDrop(DecoBlocks.ECHO_PILLAR);

        addDrop(DecoBlocks.ECHO_BRICKS);
        addDrop(DecoBlocks.ECHO_BRICK_STAIRS);
        addDrop(DecoBlocks.ECHO_BRICK_SLAB, slabDrops(DecoBlocks.ECHO_BRICK_SLAB));
        addDrop(DecoBlocks.ECHO_BRICK_WALL);

        addDrop(DecoBlocks.SCATTERED_ECHO);
        addDrop(DecoBlocks.SCATTERED_ECHO_STAIRS);
        addDrop(DecoBlocks.SCATTERED_ECHO_SLAB, slabDrops(DecoBlocks.SCATTERED_ECHO_SLAB));
        addDrop(DecoBlocks.SCATTERED_ECHO_WALL);
    }
}