package net.gecko.varandeco.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.SimpleFabricLootTableProvider;
import net.gecko.varandeco.VaranDeco;
import net.gecko.varandeco.block.DecoBlocks;
import net.gecko.varandeco.item.DecoItems;
import net.minecraft.data.server.BlockLootTableGenerator;
import net.minecraft.item.Items;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.context.LootContextTypes;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.util.Identifier;

import java.util.function.BiConsumer;

public class DecoLootTableGenerator extends SimpleFabricLootTableProvider {
    public DecoLootTableGenerator(FabricDataGenerator dataGenerator) {
        super(dataGenerator, LootContextTypes.BLOCK);
    }

    @Override
    public void accept(BiConsumer<Identifier, LootTable.Builder> identifierBuilderBiConsumer) {
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/polished_stone"),
                BlockLootTableGenerator.drops(DecoBlocks.POLISHED_STONE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/polished_stone_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.POLISHED_STONE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/polished_stone_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.POLISHED_STONE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/polished_stone_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.POLISHED_STONE_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/stone_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.STONE_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/polished_andesite_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.POLISHED_ANDESITE_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/polished_diorite_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.POLISHED_DIORITE_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/polished_granite_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.POLISHED_GRANITE_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/smooth_stone_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.SMOOTH_STONE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/smooth_stone_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.SMOOTH_STONE_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/dripstone_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.DRIPSTONE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/dripstone_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.DRIPSTONE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/dripstone_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.DRIPSTONE_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/calcite_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.CALCITE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/calcite_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.CALCITE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/calcite_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.CALCITE_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/tuff_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.TUFF_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/tuff_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.TUFF_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/tuff_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.TUFF_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/stone_tiles"),
                BlockLootTableGenerator.drops(DecoBlocks.STONE_TILES));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/stone_tile_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.STONE_TILE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/stone_tile_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.STONE_TILE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/stone_tile_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.STONE_TILE_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/packed_mud_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.PACKED_MUD_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/packed_mud_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.PACKED_MUD_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/packed_mud_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.PACKED_MUD_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/red_nether_brick_fence"),
                BlockLootTableGenerator.drops(DecoBlocks.RED_NETHER_BRICK_FENCE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/nether_brick_fence_gate"),
                BlockLootTableGenerator.drops(DecoBlocks.NETHER_BRICK_FENCE_GATE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/red_nether_brick_fence_gate"),
                BlockLootTableGenerator.drops(DecoBlocks.RED_NETHER_BRICK_FENCE_GATE));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/netherrack_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.NETHERRACK_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/netherrack_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.NETHERRACK_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/netherrack_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.NETHERRACK_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/magma_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.MAGMA_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/magma_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.MAGMA_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/magma_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.MAGMA_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/magma_bricks"),
                BlockLootTableGenerator.drops(DecoBlocks.MAGMA_BRICKS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/chiseled_magma_bricks"),
                BlockLootTableGenerator.drops(DecoBlocks.CHISELED_MAGMA_BRICKS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/magma_brick_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.MAGMA_BRICK_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/magma_brick_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.MAGMA_BRICK_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/magma_brick_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.MAGMA_BRICK_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/polished_blackstone_tiles"),
                BlockLootTableGenerator.drops(DecoBlocks.POLISHED_BLACKSTONE_TILES));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/polished_blackstone_tile_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.POLISHED_BLACKSTONE_TILE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/polished_blackstone_tile_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.POLISHED_BLACKSTONE_TILE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/polished_blackstone_tile_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.POLISHED_BLACKSTONE_TILE_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/polished_gilded_blackstone"),
                BlockLootTableGenerator.dropsWithSilkTouch(DecoBlocks.POLISHED_GLIDED_BLACKSTONE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/chiseled_gilded_blackstone"),
                BlockLootTableGenerator.dropsWithSilkTouch(DecoBlocks.CHISELED_GLIDED_BLACKSTONE));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/snow_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.SNOW_STAIRS, Items.SNOWBALL, ConstantLootNumberProvider.create(6.0F)));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/snow_slab"),
                BlockLootTableGenerator.drops(DecoBlocks.SNOW_SLAB, Items.SNOWBALL, ConstantLootNumberProvider.create(3.0F)));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/snow_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.SNOW_WALL, Items.SNOWBALL, ConstantLootNumberProvider.create(6.0F)));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/packed_ice_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.PACKED_ICE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/packed_ice_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.PACKED_ICE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/packed_ice_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.PACKED_ICE_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/blue_ice_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.BLUE_ICE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/blue_ice_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.BLUE_ICE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/blue_ice_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.BLUE_ICE_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/snow_bricks"),
                BlockLootTableGenerator.drops(DecoBlocks.SNOW_BRICKS, DecoItems.SNOW_BRICK, ConstantLootNumberProvider.create(4.0F)));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/chiseled_snow_bricks"),
                BlockLootTableGenerator.drops(DecoBlocks.CHISELED_SNOW_BRICKS, DecoItems.SNOW_BRICK, ConstantLootNumberProvider.create(8.0F)));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/snow_brick_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.SNOW_BRICK_STAIRS, DecoItems.SNOW_BRICK, ConstantLootNumberProvider.create(6.0F)));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/snow_brick_slab"),
                BlockLootTableGenerator.drops(DecoBlocks.SNOW_BRICK_SLAB, DecoItems.SNOW_BRICK, ConstantLootNumberProvider.create(3.0F)));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/snow_brick_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.SNOW_BRICK_WALL, DecoItems.SNOW_BRICK, ConstantLootNumberProvider.create(6.0F)));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/ice_bricks"),
                BlockLootTableGenerator.drops(DecoBlocks.ICE_BRICKS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/ice_brick_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.ICE_BRICK_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/ice_brick_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.ICE_BRICK_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/ice_brick_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.ICE_BRICK_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/black_ice"),
                BlockLootTableGenerator.dropsWithSilkTouch(DecoBlocks.BLACK_ICE));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_sandstone_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_SANDSTONE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_sandstone_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_SANDSTONE_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_red_sandstone_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_RED_SANDSTONE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_red_sandstone_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_RED_SANDSTONE_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/smooth_sandstone_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.SMOOTH_SANDSTONE_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/smooth_red_sandstone_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.SMOOTH_RED_SANDSTONE_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_sandstone_bricks"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_SANDSTONE_BRICKS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_sandstone_brick_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_SANDSTONE_BRICK_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_sandstone_brick_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.CUT_SANDSTONE_BRICK_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_sandstone_brick_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_SANDSTONE_BRICK_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_red_sandstone_bricks"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_RED_SANDSTONE_BRICKS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_red_sandstone_brick_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_RED_SANDSTONE_BRICK_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_red_sandstone_brick_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.CUT_RED_SANDSTONE_BRICK_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_red_sandstone_brick_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_RED_SANDSTONE_BRICK_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cactus_planks"),
                BlockLootTableGenerator.drops(DecoBlocks.CACTUS_PLANKS));
    }
}
