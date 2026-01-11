package net.gecko.varandeco.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.gecko.varandeco.block.DecoBlocks;
import net.gecko.varandeco.item.DecoItems;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.CarrotsBlock;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.loot.condition.LootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.LimitCountLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.operator.BoundedIntUnaryOperator;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.predicate.StatePredicate;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;

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

        addDrop(DecoBlocks.OAK_MOSAIC_STAIRS);
        addDrop(DecoBlocks.BIRCH_MOSAIC_STAIRS);
        addDrop(DecoBlocks.SPRUCE_MOSAIC_STAIRS);
        addDrop(DecoBlocks.JUNGLE_MOSAIC_STAIRS);
        addDrop(DecoBlocks.ACACIA_MOSAIC_STAIRS);
        addDrop(DecoBlocks.DARK_OAK_MOSAIC_STAIRS);
        addDrop(DecoBlocks.MANGROVE_MOSAIC_STAIRS);
        addDrop(DecoBlocks.CHERRY_MOSAIC_STAIRS);
        addDrop(DecoBlocks.CRIMSON_MOSAIC_STAIRS);
        addDrop(DecoBlocks.WARPED_MOSAIC_STAIRS);
        addDrop(DecoBlocks.CACTUS_MOSAIC_STAIRS);
        addDrop(DecoBlocks.WOODEN_MOSAIC_STAIRS);

        addDrop(DecoBlocks.OAK_MOSAIC_SLAB, slabDrops(DecoBlocks.OAK_MOSAIC_SLAB));
        addDrop(DecoBlocks.BIRCH_MOSAIC_SLAB, slabDrops(DecoBlocks.BIRCH_MOSAIC_SLAB));
        addDrop(DecoBlocks.SPRUCE_MOSAIC_SLAB, slabDrops(DecoBlocks.SPRUCE_MOSAIC_SLAB));
        addDrop(DecoBlocks.JUNGLE_MOSAIC_SLAB, slabDrops(DecoBlocks.JUNGLE_MOSAIC_SLAB));
        addDrop(DecoBlocks.ACACIA_MOSAIC_SLAB, slabDrops(DecoBlocks.ACACIA_MOSAIC_SLAB));
        addDrop(DecoBlocks.DARK_OAK_MOSAIC_SLAB, slabDrops(DecoBlocks.DARK_OAK_MOSAIC_SLAB));
        addDrop(DecoBlocks.MANGROVE_MOSAIC_SLAB, slabDrops(DecoBlocks.MANGROVE_MOSAIC_SLAB));
        addDrop(DecoBlocks.CHERRY_MOSAIC_SLAB, slabDrops(DecoBlocks.CHERRY_MOSAIC_SLAB));
        addDrop(DecoBlocks.CRIMSON_MOSAIC_SLAB, slabDrops(DecoBlocks.CRIMSON_MOSAIC_SLAB));
        addDrop(DecoBlocks.WARPED_MOSAIC_SLAB, slabDrops(DecoBlocks.WARPED_MOSAIC_SLAB));
        addDrop(DecoBlocks.CACTUS_MOSAIC_SLAB, slabDrops(DecoBlocks.CACTUS_MOSAIC_SLAB));
        addDrop(DecoBlocks.WOODEN_MOSAIC_SLAB, slabDrops(DecoBlocks.WOODEN_MOSAIC_SLAB));

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

        addDrop(DecoBlocks.STANDING_STRIPPED_OAK_SIGN);
        addDrop(DecoBlocks.STANDING_STRIPPED_SPRUCE_SIGN);
        addDrop(DecoBlocks.STANDING_STRIPPED_BIRCH_SIGN);
        addDrop(DecoBlocks.STANDING_STRIPPED_JUNGLE_SIGN);
        addDrop(DecoBlocks.STANDING_STRIPPED_ACACIA_SIGN);
        addDrop(DecoBlocks.STANDING_STRIPPED_DARK_OAK_SIGN);
        addDrop(DecoBlocks.STANDING_STRIPPED_CHERRY_SIGN);
        addDrop(DecoBlocks.STANDING_STRIPPED_MANGROVE_SIGN);
        addDrop(DecoBlocks.STANDING_STRIPPED_CRIMSON_SIGN);
        addDrop(DecoBlocks.STANDING_STRIPPED_WARPED_SIGN);
        addDrop(DecoBlocks.STANDING_STRIPPED_WOODEN_SIGN);

        addDrop(DecoBlocks.STANDING_OAK_MOSAIC_SIGN);
        addDrop(DecoBlocks.STANDING_SPRUCE_MOSAIC_SIGN);
        addDrop(DecoBlocks.STANDING_BIRCH_MOSAIC_SIGN);
        addDrop(DecoBlocks.STANDING_JUNGLE_MOSAIC_SIGN);
        addDrop(DecoBlocks.STANDING_ACACIA_MOSAIC_SIGN);
        addDrop(DecoBlocks.STANDING_DARK_OAK_MOSAIC_SIGN);
        addDrop(DecoBlocks.STANDING_CHERRY_MOSAIC_SIGN);
        addDrop(DecoBlocks.STANDING_MANGROVE_MOSAIC_SIGN);
        addDrop(DecoBlocks.STANDING_BAMBOO_MOSAIC_SIGN);
        addDrop(DecoBlocks.STANDING_CRIMSON_MOSAIC_SIGN);
        addDrop(DecoBlocks.STANDING_WARPED_MOSAIC_SIGN);
        addDrop(DecoBlocks.STANDING_CACTUS_MOSAIC_SIGN);
        addDrop(DecoBlocks.STANDING_WOODEN_MOSAIC_SIGN);

        addDrop(DecoBlocks.HANGING_WOODEN_SIGN);

        addDrop(DecoBlocks.HANGING_OAK_MOSAIC_SIGN);
        addDrop(DecoBlocks.HANGING_SPRUCE_MOSAIC_SIGN);
        addDrop(DecoBlocks.HANGING_BIRCH_MOSAIC_SIGN);
        addDrop(DecoBlocks.HANGING_JUNGLE_MOSAIC_SIGN);
        addDrop(DecoBlocks.HANGING_ACACIA_MOSAIC_SIGN);
        addDrop(DecoBlocks.HANGING_DARK_OAK_MOSAIC_SIGN);
        addDrop(DecoBlocks.HANGING_MANGROVE_MOSAIC_SIGN);
        addDrop(DecoBlocks.HANGING_CHERRY_MOSAIC_SIGN);
        addDrop(DecoBlocks.HANGING_BAMBOO_MOSAIC_SIGN);
        addDrop(DecoBlocks.HANGING_CACTUS_MOSAIC_SIGN);
        addDrop(DecoBlocks.HANGING_WOODEN_MOSAIC_SIGN);
        addDrop(DecoBlocks.HANGING_CRIMSON_MOSAIC_SIGN);
        addDrop(DecoBlocks.HANGING_WARPED_MOSAIC_SIGN);
        addDrop(DecoBlocks.HANGING_OAK_PLANKS_SIGN);
        addDrop(DecoBlocks.HANGING_SPRUCE_PLANKS_SIGN);
        addDrop(DecoBlocks.HANGING_BIRCH_PLANKS_SIGN);
        addDrop(DecoBlocks.HANGING_JUNGLE_PLANKS_SIGN);
        addDrop(DecoBlocks.HANGING_ACACIA_PLANKS_SIGN);
        addDrop(DecoBlocks.HANGING_DARK_OAK_PLANKS_SIGN);
        addDrop(DecoBlocks.HANGING_MANGROVE_PLANKS_SIGN);
        addDrop(DecoBlocks.HANGING_CHERRY_PLANKS_SIGN);
        addDrop(DecoBlocks.HANGING_CACTUS_PLANKS_SIGN);
        addDrop(DecoBlocks.HANGING_WOODEN_PLANKS_SIGN);
        addDrop(DecoBlocks.HANGING_CRIMSON_PLANKS_SIGN);
        addDrop(DecoBlocks.HANGING_WARPED_PLANKS_SIGN);

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

        addDropWithSilkTouch(DecoBlocks.MOSAIC_BLACK_STAINED_GLASS);
        addDropWithSilkTouch(DecoBlocks.MOSAIC_LIGHT_BLUE_STAINED_GLASS);
        addDropWithSilkTouch(DecoBlocks.MOSAIC_LIGHT_GRAY_STAINED_GLASS);
        addDropWithSilkTouch(DecoBlocks.MOSAIC_WHITE_STAINED_GLASS);
        addDropWithSilkTouch(DecoBlocks.MOSAIC_GRAY_STAINED_GLASS);
        addDropWithSilkTouch(DecoBlocks.MOSAIC_RED_STAINED_GLASS);
        addDropWithSilkTouch(DecoBlocks.MOSAIC_ORANGE_STAINED_GLASS);
        addDropWithSilkTouch(DecoBlocks.MOSAIC_YELLOW_STAINED_GLASS);
        addDropWithSilkTouch(DecoBlocks.MOSAIC_LIME_STAINED_GLASS);
        addDropWithSilkTouch(DecoBlocks.MOSAIC_GREEN_STAINED_GLASS);
        addDropWithSilkTouch(DecoBlocks.MOSAIC_CYAN_STAINED_GLASS);
        addDropWithSilkTouch(DecoBlocks.MOSAIC_BLUE_STAINED_GLASS);
        addDropWithSilkTouch(DecoBlocks.MOSAIC_PURPLE_STAINED_GLASS);
        addDropWithSilkTouch(DecoBlocks.MOSAIC_PINK_STAINED_GLASS);
        addDropWithSilkTouch(DecoBlocks.MOSAIC_MAGENTA_STAINED_GLASS);
        addDropWithSilkTouch(DecoBlocks.MOSAIC_BROWN_STAINED_GLASS);

        addDropWithSilkTouch(DecoBlocks.MOSAIC_BLACK_STAINED_GLASS_PANE);
        addDropWithSilkTouch(DecoBlocks.MOSAIC_LIGHT_BLUE_STAINED_GLASS_PANE);
        addDropWithSilkTouch(DecoBlocks.MOSAIC_LIGHT_GRAY_STAINED_GLASS_PANE);
        addDropWithSilkTouch(DecoBlocks.MOSAIC_WHITE_STAINED_GLASS_PANE);
        addDropWithSilkTouch(DecoBlocks.MOSAIC_GRAY_STAINED_GLASS_PANE);
        addDropWithSilkTouch(DecoBlocks.MOSAIC_RED_STAINED_GLASS_PANE);
        addDropWithSilkTouch(DecoBlocks.MOSAIC_ORANGE_STAINED_GLASS_PANE);
        addDropWithSilkTouch(DecoBlocks.MOSAIC_YELLOW_STAINED_GLASS_PANE);
        addDropWithSilkTouch(DecoBlocks.MOSAIC_LIME_STAINED_GLASS_PANE);
        addDropWithSilkTouch(DecoBlocks.MOSAIC_GREEN_STAINED_GLASS_PANE);
        addDropWithSilkTouch(DecoBlocks.MOSAIC_CYAN_STAINED_GLASS_PANE);
        addDropWithSilkTouch(DecoBlocks.MOSAIC_BLUE_STAINED_GLASS_PANE);
        addDropWithSilkTouch(DecoBlocks.MOSAIC_PURPLE_STAINED_GLASS_PANE);
        addDropWithSilkTouch(DecoBlocks.MOSAIC_PINK_STAINED_GLASS_PANE);
        addDropWithSilkTouch(DecoBlocks.MOSAIC_MAGENTA_STAINED_GLASS_PANE);
        addDropWithSilkTouch(DecoBlocks.MOSAIC_BROWN_STAINED_GLASS_PANE);

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

        addDrop(DecoBlocks.IRON_BUTTON);
        addDrop(DecoBlocks.GOLD_BUTTON);

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


        addDrop(DecoBlocks.ANCIENT_ROSE_CROP,
                applyExplosionDecay(DecoBlocks.ANCIENT_ROSE_CROP,
                        LootTable.builder().pool(LootPool.builder().with(ItemEntry.builder(DecoItems.ANCIENT_ROSE_SEEDS)))));

        LootCondition.Builder builder3 = BlockStatePropertyLootCondition.builder(DecoBlocks.MIGHTY_LAVENDER_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(CarrotsBlock.AGE, 4));

        addDrop(DecoBlocks.ANCIENT_ROSE);
        pottedPlantDrops(DecoBlocks.POTTED_ANCIENT_ROSE);

        addDrop(DecoBlocks.MIGHTY_LAVENDER_CROP, this.applyExplosionDecay(DecoBlocks.MIGHTY_LAVENDER_CROP, LootTable.builder()
                                .pool(LootPool.builder().with(ItemEntry.builder(DecoItems.MIGHTY_LAVENDER_FLOWER)))
                        .pool(LootPool.builder().conditionally(builder3).with(ItemEntry.builder(DecoItems.MIGHTY_LAVENDER_FLOWER)
                                        .apply(ApplyBonusLootFunction.binomialWithBonusCount(Enchantments.FORTUNE, 0.5714286F,
                                                3))))));

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

        addDrop(DecoBlocks.CHERRY_WOOD_STAIRS);
        addDrop(DecoBlocks.CHERRY_WOOD_SLAB, slabDrops(DecoBlocks.CHERRY_WOOD_SLAB));
        addDrop(DecoBlocks.CHERRY_WOOD_WALL);

        addDrop(DecoBlocks.STRIPPED_CHERRY_WOOD_STAIRS);
        addDrop(DecoBlocks.STRIPPED_CHERRY_WOOD_SLAB, slabDrops(DecoBlocks.STRIPPED_CHERRY_WOOD_SLAB));
        addDrop(DecoBlocks.STRIPPED_CHERRY_WOOD_WALL);

        addDrop(DecoBlocks.CHERRY_NOTE_BLOCK);
        addDrop(DecoBlocks.BAMBOO_NOTE_BLOCK);

        addDrop(DecoBlocks.CHERRY_PALLET_DOOR, slabDrops(DecoBlocks.CHERRY_PALLET_DOOR));
        addDrop(DecoBlocks.CHERRY_PALLET_TRAPDOOR);

        addDrop(DecoBlocks.BAMBOO_PALLET_DOOR, slabDrops(DecoBlocks.BAMBOO_PALLET_DOOR));
        addDrop(DecoBlocks.BAMBOO_PALLET_TRAPDOOR);

        addDrop(DecoBlocks.MUSHROOM_BOOKSHELF);

        addDrop(DecoBlocks.MUSHROOM_MOSAIC);
        addDrop(DecoBlocks.MUSHROOM_MOSAIC_STAIRS);
        addDrop(DecoBlocks.MUSHROOM_MOSAIC_SLAB, slabDrops(DecoBlocks.MUSHROOM_MOSAIC_SLAB));

        addDrop(DecoBlocks.STANDING_MUSHROOM_STEM_SIGN);
        addDrop(DecoBlocks.STANDING_STRIPPED_CACTUS_SIGN);
        addDrop(DecoBlocks.STANDING_MUSHROOM_MOSAIC_SIGN);

        addDrop(DecoBlocks.HANGING_MUSHROOM_SIGN);
        addDrop(DecoBlocks.HANGING_CACTUS_SIGN);
        addDrop(DecoBlocks.HANGING_MUSHROOM_MOSAIC_SIGN);
        addDrop(DecoBlocks.HANGING_MUSHROOM_PLANKS_SIGN);

        addDrop(DecoBlocks.OAK_BOOKSHELF_STAIRS);
        addDrop(DecoBlocks.OAK_BOOKSHELF_SLAB, slabDrops(DecoBlocks.OAK_BOOKSHELF_SLAB));

        addDrop(DecoBlocks.SPRUCE_BOOKSHELF_STAIRS);
        addDrop(DecoBlocks.SPRUCE_BOOKSHELF_SLAB, slabDrops(DecoBlocks.SPRUCE_BOOKSHELF_SLAB));

        addDrop(DecoBlocks.BIRCH_BOOKSHELF_STAIRS);
        addDrop(DecoBlocks.BIRCH_BOOKSHELF_SLAB, slabDrops(DecoBlocks.BIRCH_BOOKSHELF_SLAB));

        addDrop(DecoBlocks.JUNGLE_BOOKSHELF_STAIRS);
        addDrop(DecoBlocks.JUNGLE_BOOKSHELF_SLAB, slabDrops(DecoBlocks.JUNGLE_BOOKSHELF_SLAB));

        addDrop(DecoBlocks.ACACIA_BOOKSHELF_STAIRS);
        addDrop(DecoBlocks.ACACIA_BOOKSHELF_SLAB, slabDrops(DecoBlocks.ACACIA_BOOKSHELF_SLAB));

        addDrop(DecoBlocks.DARK_OAK_BOOKSHELF_STAIRS);
        addDrop(DecoBlocks.DARK_OAK_BOOKSHELF_SLAB, slabDrops(DecoBlocks.DARK_OAK_BOOKSHELF_SLAB));

        addDrop(DecoBlocks.MANGROVE_BOOKSHELF_STAIRS);
        addDrop(DecoBlocks.MANGROVE_BOOKSHELF_SLAB, slabDrops(DecoBlocks.MANGROVE_BOOKSHELF_SLAB));

        addDrop(DecoBlocks.CHERRY_BOOKSHELF_STAIRS);
        addDrop(DecoBlocks.CHERRY_BOOKSHELF_SLAB, slabDrops(DecoBlocks.CHERRY_BOOKSHELF_SLAB));

        addDrop(DecoBlocks.BAMBOO_BOOKSHELF_STAIRS);
        addDrop(DecoBlocks.BAMBOO_BOOKSHELF_SLAB, slabDrops(DecoBlocks.BAMBOO_BOOKSHELF_SLAB));

        addDrop(DecoBlocks.CRIMSON_BOOKSHELF_STAIRS);
        addDrop(DecoBlocks.CRIMSON_BOOKSHELF_SLAB, slabDrops(DecoBlocks.CRIMSON_BOOKSHELF_SLAB));

        addDrop(DecoBlocks.WARPED_BOOKSHELF_STAIRS);
        addDrop(DecoBlocks.WARPED_BOOKSHELF_SLAB, slabDrops(DecoBlocks.WARPED_BOOKSHELF_SLAB));

        addDrop(DecoBlocks.CACTUS_BOOKSHELF_STAIRS);
        addDrop(DecoBlocks.CACTUS_BOOKSHELF_SLAB, slabDrops(DecoBlocks.CACTUS_BOOKSHELF_SLAB));

        addDrop(DecoBlocks.MUSHROOM_BOOKSHELF_STAIRS);
        addDrop(DecoBlocks.MUSHROOM_BOOKSHELF_SLAB, slabDrops(DecoBlocks.MUSHROOM_BOOKSHELF_SLAB));

        addDrop(DecoBlocks.WOODEN_BOOKSHELF_STAIRS);
        addDrop(DecoBlocks.WOODEN_BOOKSHELF_SLAB, slabDrops(DecoBlocks.WOODEN_BOOKSHELF_SLAB));

        addDrop(DecoBlocks.IRON_CAP_PLANKS);
        addDrop(DecoBlocks.IRON_CAP_STAIRS);
        addDrop(DecoBlocks.IRON_CAP_SLAB, slabDrops(DecoBlocks.IRON_CAP_SLAB));
        addDrop(DecoBlocks.IRON_CAP_FENCE);
        addDrop(DecoBlocks.IRON_CAP_FENCE_GATE);
        addDrop(DecoBlocks.IRON_CAP_PRESSURE_PLATE);
        addDrop(DecoBlocks.IRON_CAP_BUTTON);

        addDrop(DecoBlocks.IRON_CAP_DOOR, doorDrops(DecoBlocks.IRON_CAP_DOOR));
        addDrop(DecoBlocks.IRON_CAP_TRAPDOOR);
        addDrop(DecoBlocks.IRON_CAP_MOSAIC);
        addDrop(DecoBlocks.IRON_CAP_MOSAIC_STAIRS);
        addDrop(DecoBlocks.IRON_CAP_MOSAIC_SLAB, slabDrops(DecoBlocks.IRON_CAP_MOSAIC_SLAB));
        addDrop(DecoBlocks.IRON_CAP_HYPHAE_STAIRS);
        addDrop(DecoBlocks.IRON_CAP_HYPHAE_SLAB, slabDrops(DecoBlocks.IRON_CAP_HYPHAE_SLAB));
        addDrop(DecoBlocks.IRON_CAP_HYPHAE_WALL);

        addDrop(DecoBlocks.STRIPPED_IRON_CAP_HYPHAE_STAIRS);
        addDrop(DecoBlocks.STRIPPED_IRON_CAP_HYPHAE_SLAB, slabDrops(DecoBlocks.STRIPPED_IRON_CAP_HYPHAE_SLAB));
        addDrop(DecoBlocks.STRIPPED_IRON_CAP_HYPHAE_WALL);

        addDrop(DecoBlocks.IRON_CAP_MUSHROOM);
        pottedPlantDrops(DecoBlocks.POTTED_IRON_CAP_MUSHROOM);

        addDrop(DecoBlocks.IRON_CAP_MUSHROOM_BLOCK, block -> this.capMushroomBlockDrops(block, DecoBlocks.IRON_CAP_MUSHROOM));

        addDrop(DecoBlocks.SPORE_IRON_ORE, block -> dropsWithSilkTouch(block, this.applyExplosionDecay(block,
                        ItemEntry.builder(Items.IRON_NUGGET)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 3.0F)))
                                .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE)))));
    }
    public LootTable.Builder capMushroomBlockDrops(Block dropWithSilkTouch, ItemConvertible drop) {
        return dropsWithSilkTouch(
                dropWithSilkTouch,
                this.applyExplosionDecay(
                        dropWithSilkTouch,
                        ItemEntry.builder(drop)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(-2.0F, 1.0F)))
                                .apply(LimitCountLootFunction.builder(BoundedIntUnaryOperator.createMin(0)))
                )
        );
    }
}
