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
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cactus_plank_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.CACTUS_PLANK_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cactus_plank_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.CACTUS_PLANK_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cactus_plank_fence"),
                BlockLootTableGenerator.drops(DecoBlocks.CACTUS_PLANK_FENCE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cactus_plank_fence_gate"),
                BlockLootTableGenerator.drops(DecoBlocks.CACTUS_PLANK_FENCE_GATE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cactus_plank_pressure_plate"),
                BlockLootTableGenerator.drops(DecoBlocks.CACTUS_PLANK_PRESSURE_PLATE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cactus_plank_button"),
                BlockLootTableGenerator.drops(DecoBlocks.CACTUS_PLANK_BUTTON));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cactus_door"),
                BlockLootTableGenerator.doorDrops(DecoBlocks.CACTUS_DOOR));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cactus_trapdoor"),
                BlockLootTableGenerator.drops(DecoBlocks.CACTUS_TRAPDOOR));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/standing_cactus_sign"),
                BlockLootTableGenerator.drops(DecoItems.CACTUS_SIGN));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/wall_cactus_sign"),
                BlockLootTableGenerator.drops(DecoItems.CACTUS_SIGN));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/prismarine_brick_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.PRISMARINE_BRICK_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/dark_prismarine_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.DARK_PRISMARINE_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/crystallized_prismarine"),
                BlockLootTableGenerator.drops(DecoBlocks.CRYSTALLIZED_PRISMARINE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/crystallized_prismarine_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.CRYSTALLIZED_PRISMARINE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/crystallized_prismarine_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.CRYSTALLIZED_PRISMARINE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/crystallized_prismarine_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.CRYSTALLIZED_PRISMARINE_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/crystallized_prismarine_bricks"),
                BlockLootTableGenerator.drops(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/crystallized_prismarine_brick_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICK_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/crystallized_prismarine_brick_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICK_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/crystallized_prismarine_brick_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICK_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/light_prismarine"),
                BlockLootTableGenerator.drops(DecoBlocks.LIGHT_PRISMARINE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/light_prismarine_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.LIGHT_PRISMARINE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/light_prismarine_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.LIGHT_PRISMARINE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/light_prismarine_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.LIGHT_PRISMARINE_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/chiseled_prismarine_bricks"),
                BlockLootTableGenerator.drops(DecoBlocks.CHISELED_PRISMARINE_BRICKS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/chiseled_crystallized_prismarine_bricks"),
                BlockLootTableGenerator.drops(DecoBlocks.CHISELED_CRYSTALLIZED_PRISMARINE_BRICKS));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/bubble_block"),
                BlockLootTableGenerator.drops(DecoBlocks.BUBBLE_BLOCK));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/bubble_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.BUBBLE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/bubble_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.BUBBLE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/bubble_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.BUBBLE_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/bubble_bricks"),
                BlockLootTableGenerator.drops(DecoBlocks.BUBBLE_BRICKS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/bubble_brick_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.BUBBLE_BRICK_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/bubble_brick_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.BUBBLE_BRICK_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/bubble_brick_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.BUBBLE_BRICK_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/chiseled_bubble_bricks"),
                BlockLootTableGenerator.drops(DecoBlocks.CHISELED_BUBBLE_BRICKS));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/soul_soilstone"),
                BlockLootTableGenerator.drops(DecoBlocks.SOUL_SOILSTONE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/soul_soilstone_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.SOUL_SOILSTONE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/soul_soilstone_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.SOUL_SOILSTONE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/soul_soilstone_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.SOUL_SOILSTONE_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_soul_soilstone"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_SOUL_SOILSTONE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_soul_soilstone_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_SOUL_SOILSTONE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_soul_soilstone_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.CUT_SOUL_SOILSTONE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_soul_soilstone_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_SOUL_SOILSTONE_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/chiseled_soul_soilstone"),
                BlockLootTableGenerator.drops(DecoBlocks.CHISELED_SOUL_SOILSTONE));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/smooth_soul_soilstone"),
                BlockLootTableGenerator.drops(DecoBlocks.SMOOTH_SOUL_SOILSTONE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/smooth_soul_soilstone_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.SMOOTH_SOUL_SOILSTONE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/smooth_soul_soilstone_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.SMOOTH_SOUL_SOILSTONE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/smooth_soul_soilstone_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.SMOOTH_SOUL_SOILSTONE_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_soul_soilstone_bricks"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_soul_soilstone_brick_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_SOUL_SOILSTONE_BRICK_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_soul_soilstone_brick_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.CUT_SOUL_SOILSTONE_BRICK_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_soul_soilstone_brick_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_SOUL_SOILSTONE_BRICK_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/quartz_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.QUARTZ_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/smooth_quartz_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.SMOOTH_QUARTZ_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/quartz_brick_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.QUARTZ_BRICK_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/quartz_brick_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.QUARTZ_BRICK_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/quartz_brick_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.QUARTZ_BRICK_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_quartz"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_QUARTZ));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_quartz_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_QUARTZ_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_quartz_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.CUT_QUARTZ_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_quartz_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_QUARTZ_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/chiseled_red_nether_bricks"),
                BlockLootTableGenerator.drops(DecoBlocks.CHISELED_RED_NETHER_BRICKS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cracked_red_nether_bricks"),
                BlockLootTableGenerator.drops(DecoBlocks.CRACKED_RED_NETHER_BRICKS));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/blue_nether_bricks"),
                BlockLootTableGenerator.drops(DecoBlocks.BLUE_NETHER_BRICKS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/blue_nether_bricks_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.BLUE_NETHER_BRICK_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/blue_nether_bricks_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.BLUE_NETHER_BRICK_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/blue_nether_bricks_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.BLUE_NETHER_BRICK_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/blue_nether_bricks_fence"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.BLUE_NETHER_BRICK_FENCE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/blue_nether_bricks_fence_gate"),
                BlockLootTableGenerator.drops(DecoBlocks.BLUE_NETHER_BRICK_FENCE_GATE));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/chiseled_blue_nether_bricks"),
                BlockLootTableGenerator.drops(DecoBlocks.CHISELED_BLUE_NETHER_BRICKS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cracked_blue_nether_bricks"),
                BlockLootTableGenerator.drops(DecoBlocks.CRACKED_BLUE_NETHER_BRICKS));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/birch_crafting_table"),
                BlockLootTableGenerator.drops(DecoBlocks.BIRCH_CRAFTING_TABLE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/spruce_crafting_table"),
                BlockLootTableGenerator.drops(DecoBlocks.SPRUCE_CRAFTING_TABLE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/jungle_crafting_table"),
                BlockLootTableGenerator.drops(DecoBlocks.JUNGLE_CRAFTING_TABLE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/acacia_crafting_table"),
                BlockLootTableGenerator.drops(DecoBlocks.ACACIA_CRAFTING_TABLE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/dark_oak_crafting_table"),
                BlockLootTableGenerator.drops(DecoBlocks.DARK_OAK_CRAFTING_TABLE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/mangrove_crafting_table"),
                BlockLootTableGenerator.drops(DecoBlocks.MANGROVE_CRAFTING_TABLE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/crimson_crafting_table"),
                BlockLootTableGenerator.drops(DecoBlocks.CRIMSON_CRAFTING_TABLE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/warped_crafting_table"),
                BlockLootTableGenerator.drops(DecoBlocks.WARPED_CRAFTING_TABLE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cactus_crafting_table"),
                BlockLootTableGenerator.drops(DecoBlocks.CACTUS_CRAFTING_TABLE));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/oak_barrel"),
                BlockLootTableGenerator.drops(DecoBlocks.OAK_BARREL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/spruce_barrel"),
                BlockLootTableGenerator.drops(DecoBlocks.SPRUCE_BARREL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/birch_barrel"),
                BlockLootTableGenerator.drops(DecoBlocks.BIRCH_BARREL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/jungle_barrel"),
                BlockLootTableGenerator.drops(DecoBlocks.JUNGLE_BARREL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/acacia_barrel"),
                BlockLootTableGenerator.drops(DecoBlocks.ACACIA_BARREL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/dark_oak_barrel"),
                BlockLootTableGenerator.drops(DecoBlocks.DARK_OAK_BARREL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/mangrove_barrel"),
                BlockLootTableGenerator.drops(DecoBlocks.MANGROVE_BARREL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/crimson_barrel"),
                BlockLootTableGenerator.drops(DecoBlocks.CRIMSON_BARREL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/warped_barrel"),
                BlockLootTableGenerator.drops(DecoBlocks.WARPED_BARREL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cactus_barrel"),
                BlockLootTableGenerator.drops(DecoBlocks.CACTUS_BARREL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/birch_ladder"),
                BlockLootTableGenerator.drops(DecoBlocks.BIRCH_LADDER));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/spruce_ladder"),
                BlockLootTableGenerator.drops(DecoBlocks.SPRUCE_LADDER));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/jungle_ladder"),
                BlockLootTableGenerator.drops(DecoBlocks.JUNGLE_LADDER));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/acacia_ladder"),
                BlockLootTableGenerator.drops(DecoBlocks.ACACIA_LADDER));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/dark_oak_ladder"),
                BlockLootTableGenerator.drops(DecoBlocks.DARK_OAK_LADDER));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/mangrove_ladder"),
                BlockLootTableGenerator.drops(DecoBlocks.MANGROVE_LADDER));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/crimson_ladder"),
                BlockLootTableGenerator.drops(DecoBlocks.CRIMSON_LADDER));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/warped_ladder"),
                BlockLootTableGenerator.drops(DecoBlocks.WARPED_LADDER));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cactus_ladder"),
                BlockLootTableGenerator.drops(DecoBlocks.CACTUS_LADDER));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/oak_smithing_table"),
                BlockLootTableGenerator.drops(DecoBlocks.OAK_SMITHING_TABLE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/spruce_smithing_table"),
                BlockLootTableGenerator.drops(DecoBlocks.SPRUCE_SMITHING_TABLE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/birch_smithing_table"),
                BlockLootTableGenerator.drops(DecoBlocks.BIRCH_SMITHING_TABLE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/jungle_smithing_table"),
                BlockLootTableGenerator.drops(DecoBlocks.JUNGLE_SMITHING_TABLE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/acacia_smithing_table"),
                BlockLootTableGenerator.drops(DecoBlocks.ACACIA_SMITHING_TABLE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/dark_oak_smithing_table"),
                BlockLootTableGenerator.drops(DecoBlocks.DARK_OAK_SMITHING_TABLE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/mangrove_smithing_table"),
                BlockLootTableGenerator.drops(DecoBlocks.MANGROVE_SMITHING_TABLE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/crimson_smithing_table"),
                BlockLootTableGenerator.drops(DecoBlocks.CRIMSON_SMITHING_TABLE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/warped_smithing_table"),
                BlockLootTableGenerator.drops(DecoBlocks.WARPED_SMITHING_TABLE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cactus_smithing_table"),
                BlockLootTableGenerator.drops(DecoBlocks.CACTUS_SMITHING_TABLE));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/oak_cartography_table"),
                BlockLootTableGenerator.drops(DecoBlocks.OAK_CARTOGRAPHY_TABLE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/birch_cartography_table"),
                BlockLootTableGenerator.drops(DecoBlocks.BIRCH_CARTOGRAPHY_TABLE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/spruce_cartography_table"),
                BlockLootTableGenerator.drops(DecoBlocks.SPRUCE_CARTOGRAPHY_TABLE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/jungle_cartography_table"),
                BlockLootTableGenerator.drops(DecoBlocks.JUNGLE_CARTOGRAPHY_TABLE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/acacia_cartography_table"),
                BlockLootTableGenerator.drops(DecoBlocks.ACACIA_CARTOGRAPHY_TABLE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/dark_oak_cartography_table"),
                BlockLootTableGenerator.drops(DecoBlocks.DARK_OAK_CARTOGRAPHY_TABLE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/mangrove_cartography_table"),
                BlockLootTableGenerator.drops(DecoBlocks.MANGROVE_CARTOGRAPHY_TABLE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/crimson_cartography_table"),
                BlockLootTableGenerator.drops(DecoBlocks.CRIMSON_CARTOGRAPHY_TABLE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/warped_cartography_table"),
                BlockLootTableGenerator.drops(DecoBlocks.WARPED_CARTOGRAPHY_TABLE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cactus_cartography_table"),
                BlockLootTableGenerator.drops(DecoBlocks.CACTUS_CARTOGRAPHY_TABLE));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/terracotta_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.TERRACOTTA_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/terracotta_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.TERRACOTTA_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/terracotta_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.TERRACOTTA_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/white_terracotta_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.WHITE_TERRACOTTA_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/white_terracotta_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.WHITE_TERRACOTTA_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/white_terracotta_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.WHITE_TERRACOTTA_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/light_gray_terracotta_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/light_gray_terracotta_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.LIGHT_GRAY_TERRACOTTA_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/light_gray_terracotta_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.LIGHT_GRAY_TERRACOTTA_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/gray_terracotta_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.GRAY_TERRACOTTA_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/gray_terracotta_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.GRAY_TERRACOTTA_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/gray_terracotta_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.GRAY_TERRACOTTA_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/black_terracotta_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.BLACK_TERRACOTTA_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/black_terracotta_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.BLACK_TERRACOTTA_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/black_terracotta_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.BLACK_TERRACOTTA_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/brown_terracotta_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.BROWN_TERRACOTTA_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/brown_terracotta_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.BROWN_TERRACOTTA_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/brown_terracotta_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.BROWN_TERRACOTTA_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/red_terracotta_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.RED_TERRACOTTA_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/red_terracotta_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.RED_TERRACOTTA_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/red_terracotta_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.RED_TERRACOTTA_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/orange_terracotta_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.ORANGE_TERRACOTTA_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/orange_terracotta_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.ORANGE_TERRACOTTA_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/orange_terracotta_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.ORANGE_TERRACOTTA_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/yellow_terracotta_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.YELLOW_TERRACOTTA_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/yellow_terracotta_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.YELLOW_TERRACOTTA_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/yellow_terracotta_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.YELLOW_TERRACOTTA_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/lime_terracotta_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.LIME_TERRACOTTA_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/lime_terracotta_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.LIME_TERRACOTTA_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/lime_terracotta_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.LIME_TERRACOTTA_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/green_terracotta_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.GREEN_TERRACOTTA_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/green_terracotta_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.GREEN_TERRACOTTA_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/green_terracotta_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.GREEN_TERRACOTTA_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cyan_terracotta_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.CYAN_TERRACOTTA_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cyan_terracotta_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.CYAN_TERRACOTTA_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cyan_terracotta_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.CYAN_TERRACOTTA_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/light_blue_terracotta_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/light_blue_terracotta_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.LIGHT_BLUE_TERRACOTTA_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/light_blue_terracotta_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.LIGHT_BLUE_TERRACOTTA_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/blue_terracotta_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.BLUE_TERRACOTTA_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/blue_terracotta_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.BLUE_TERRACOTTA_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/blue_terracotta_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.BLUE_TERRACOTTA_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/purple_terracotta_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.PURPLE_TERRACOTTA_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/purple_terracotta_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.PURPLE_TERRACOTTA_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/purple_terracotta_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.PURPLE_TERRACOTTA_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/magenta_terracotta_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.MAGENTA_TERRACOTTA_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/magenta_terracotta_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.MAGENTA_TERRACOTTA_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/magenta_terracotta_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.MAGENTA_TERRACOTTA_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/pink_terracotta_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.PINK_TERRACOTTA_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/pink_terracotta_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.PINK_TERRACOTTA_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/pink_terracotta_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.PINK_TERRACOTTA_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/white_concrete_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.WHITE_CONCRETE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/white_concrete_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.WHITE_CONCRETE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/white_concrete_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.WHITE_CONCRETE_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/light_gray_concrete_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.LIGHT_GRAY_CONCRETE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/light_gray_concrete_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.LIGHT_GRAY_CONCRETE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/light_gray_concrete_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.LIGHT_GRAY_CONCRETE_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/gray_concrete_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.GRAY_CONCRETE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/gray_concrete_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.GRAY_CONCRETE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/gray_concrete_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.GRAY_CONCRETE_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/black_concrete_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.BLACK_CONCRETE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/black_concrete_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.BLACK_CONCRETE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/black_concrete_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.BLACK_CONCRETE_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/brown_concrete_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.BROWN_CONCRETE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/brown_concrete_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.BROWN_CONCRETE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/brown_concrete_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.BROWN_CONCRETE_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/red_concrete_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.RED_CONCRETE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/red_concrete_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.RED_CONCRETE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/red_concrete_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.RED_CONCRETE_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/orange_concrete_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.ORANGE_CONCRETE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/orange_concrete_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.ORANGE_CONCRETE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/orange_concrete_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.ORANGE_CONCRETE_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/yellow_concrete_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.YELLOW_CONCRETE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/yellow_concrete_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.YELLOW_CONCRETE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/yellow_concrete_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.YELLOW_CONCRETE_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/lime_concrete_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.LIME_CONCRETE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/lime_concrete_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.LIME_CONCRETE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/lime_concrete_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.LIME_CONCRETE_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/green_concrete_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.GREEN_CONCRETE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/green_concrete_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.GREEN_CONCRETE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/green_concrete_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.GREEN_CONCRETE_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cyan_concrete_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.CYAN_CONCRETE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cyan_concrete_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.CYAN_CONCRETE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cyan_concrete_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.CYAN_CONCRETE_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/light_blue_concrete_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.LIGHT_BLUE_CONCRETE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/light_blue_concrete_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.LIGHT_BLUE_CONCRETE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/light_blue_concrete_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.LIGHT_BLUE_CONCRETE_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/blue_concrete_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.BLUE_CONCRETE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/blue_concrete_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.BLUE_CONCRETE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/blue_concrete_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.BLUE_CONCRETE_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/purple_concrete_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.PURPLE_CONCRETE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/purple_concrete_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.PURPLE_CONCRETE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/purple_concrete_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.PURPLE_CONCRETE_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/magenta_concrete_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.MAGENTA_CONCRETE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/magenta_concrete_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.MAGENTA_CONCRETE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/magenta_concrete_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.MAGENTA_CONCRETE_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/pink_concrete_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.PINK_CONCRETE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/pink_concrete_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.PINK_CONCRETE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/pink_concrete_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.PINK_CONCRETE_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/terracotta_bricks"),
                BlockLootTableGenerator.drops(DecoBlocks.TERRACOTTA_BRICKS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/white_terracotta_bricks"),
                BlockLootTableGenerator.drops(DecoBlocks.WHITE_TERRACOTTA_BRICKS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/light_gray_terracotta_bricks"),
                BlockLootTableGenerator.drops(DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/gray_terracotta_bricks"),
                BlockLootTableGenerator.drops(DecoBlocks.GRAY_TERRACOTTA_BRICKS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/black_terracotta_bricks"),
                BlockLootTableGenerator.drops(DecoBlocks.BLACK_TERRACOTTA_BRICKS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/brown_terracotta_bricks"),
                BlockLootTableGenerator.drops(DecoBlocks.BROWN_TERRACOTTA_BRICKS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/red_terracotta_bricks"),
                BlockLootTableGenerator.drops(DecoBlocks.RED_TERRACOTTA_BRICKS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/orange_terracotta_bricks"),
                BlockLootTableGenerator.drops(DecoBlocks.ORANGE_TERRACOTTA_BRICKS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/yellow_terracotta_bricks"),
                BlockLootTableGenerator.drops(DecoBlocks.YELLOW_TERRACOTTA_BRICKS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/lime_terracotta_bricks"),
                BlockLootTableGenerator.drops(DecoBlocks.LIME_TERRACOTTA_BRICKS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/green_terracotta_bricks"),
                BlockLootTableGenerator.drops(DecoBlocks.GREEN_TERRACOTTA_BRICKS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cyan_terracotta_bricks"),
                BlockLootTableGenerator.drops(DecoBlocks.CYAN_TERRACOTTA_BRICKS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/light_blue_terracotta_bricks"),
                BlockLootTableGenerator.drops(DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/blue_terracotta_bricks"),
                BlockLootTableGenerator.drops(DecoBlocks.BLUE_TERRACOTTA_BRICKS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/purple_terracotta_bricks"),
                BlockLootTableGenerator.drops(DecoBlocks.PURPLE_TERRACOTTA_BRICKS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/magenta_terracotta_bricks"),
                BlockLootTableGenerator.drops(DecoBlocks.MAGENTA_TERRACOTTA_BRICKS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/pink_terracotta_bricks"),
                BlockLootTableGenerator.drops(DecoBlocks.PINK_TERRACOTTA_BRICKS));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_white_concrete"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_WHITE_CONCRETE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_light_gray_concrete"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_LIGHT_GRAY_CONCRETE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_gray_concrete"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_GRAY_CONCRETE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_black_concrete"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_BLACK_CONCRETE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_brown_concrete"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_BROWN_CONCRETE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_red_concrete"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_RED_CONCRETE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_yellow_concrete"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_YELLOW_CONCRETE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_orange_concrete"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_ORANGE_CONCRETE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_lime_concrete"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_LIME_CONCRETE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_green_concrete"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_GREEN_CONCRETE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_cyan_concrete"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_CYAN_CONCRETE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_light_blue_concrete"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_LIGHT_BLUE_CONCRETE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_blue_concrete"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_BLUE_CONCRETE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_purple_concrete"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_PURPLE_CONCRETE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_magenta_concrete"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_MAGENTA_CONCRETE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_pink_concrete"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_PINK_CONCRETE));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/white_terracotta_brick_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.WHITE_TERRACOTTA_BRICK_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/white_terracotta_brick_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.WHITE_TERRACOTTA_BRICK_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/white_terracotta_brick_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.WHITE_TERRACOTTA_BRICK_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/light_gray_terracotta_brick_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/light_gray_terracotta_brick_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/light_gray_terracotta_brick_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/gray_terracotta_brick_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.GRAY_TERRACOTTA_BRICK_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/gray_terracotta_brick_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.GRAY_TERRACOTTA_BRICK_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/gray_terracotta_brick_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.GRAY_TERRACOTTA_BRICK_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/black_terracotta_brick_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.BLACK_TERRACOTTA_BRICK_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/black_terracotta_brick_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.BLACK_TERRACOTTA_BRICK_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/black_terracotta_brick_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.BLACK_TERRACOTTA_BRICK_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/brown_terracotta_brick_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.BROWN_TERRACOTTA_BRICK_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/brown_terracotta_brick_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.BROWN_TERRACOTTA_BRICK_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/brown_terracotta_brick_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.BROWN_TERRACOTTA_BRICK_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/red_terracotta_brick_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.RED_TERRACOTTA_BRICK_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/red_terracotta_brick_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.RED_TERRACOTTA_BRICK_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/red_terracotta_brick_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.RED_TERRACOTTA_BRICK_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/orange_terracotta_brick_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.ORANGE_TERRACOTTA_BRICK_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/orange_terracotta_brick_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.ORANGE_TERRACOTTA_BRICK_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/orange_terracotta_brick_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.ORANGE_TERRACOTTA_BRICK_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/yellow_terracotta_brick_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.YELLOW_TERRACOTTA_BRICK_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/yellow_terracotta_brick_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.YELLOW_TERRACOTTA_BRICK_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/yellow_terracotta_brick_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.YELLOW_TERRACOTTA_BRICK_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/lime_terracotta_brick_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.LIME_TERRACOTTA_BRICK_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/lime_terracotta_brick_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.LIME_TERRACOTTA_BRICK_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/lime_terracotta_brick_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.LIME_TERRACOTTA_BRICK_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/green_terracotta_brick_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.GREEN_TERRACOTTA_BRICK_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/green_terracotta_brick_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.GREEN_TERRACOTTA_BRICK_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/green_terracotta_brick_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.GREEN_TERRACOTTA_BRICK_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cyan_terracotta_brick_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.CYAN_TERRACOTTA_BRICK_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cyan_terracotta_brick_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.CYAN_TERRACOTTA_BRICK_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cyan_terracotta_brick_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.CYAN_TERRACOTTA_BRICK_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/light_blue_terracotta_brick_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/light_blue_terracotta_brick_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/light_blue_terracotta_brick_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/blue_terracotta_brick_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.BLUE_TERRACOTTA_BRICK_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/blue_terracotta_brick_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.BLUE_TERRACOTTA_BRICK_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/blue_terracotta_brick_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.BLUE_TERRACOTTA_BRICK_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/purple_terracotta_brick_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.PURPLE_TERRACOTTA_BRICK_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/purple_terracotta_brick_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.PURPLE_TERRACOTTA_BRICK_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/purple_terracotta_brick_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.PURPLE_TERRACOTTA_BRICK_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/magenta_terracotta_brick_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.MAGENTA_TERRACOTTA_BRICK_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/magenta_terracotta_brick_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.MAGENTA_TERRACOTTA_BRICK_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/magenta_terracotta_brick_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.MAGENTA_TERRACOTTA_BRICK_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/pink_terracotta_brick_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.PINK_TERRACOTTA_BRICK_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/pink_terracotta_brick_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.PINK_TERRACOTTA_BRICK_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/pink_terracotta_brick_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.PINK_TERRACOTTA_BRICK_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_white_concrete_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_WHITE_CONCRETE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_white_concrete_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.CUT_WHITE_CONCRETE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_white_concrete_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_WHITE_CONCRETE_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_light_gray_concrete_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_LIGHT_GRAY_CONCRETE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_light_gray_concrete_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.CUT_LIGHT_GRAY_CONCRETE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_light_gray_concrete_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_LIGHT_GRAY_CONCRETE_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_gray_concrete_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_GRAY_CONCRETE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_gray_concrete_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.CUT_GRAY_CONCRETE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_gray_concrete_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_GRAY_CONCRETE_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_black_concrete_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_BLACK_CONCRETE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_black_concrete_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.CUT_BLACK_CONCRETE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_black_concrete_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_BLACK_CONCRETE_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_brown_concrete_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_BROWN_CONCRETE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_brown_concrete_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.CUT_BROWN_CONCRETE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_brown_concrete_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_BROWN_CONCRETE_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_red_concrete_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_RED_CONCRETE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_red_concrete_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.CUT_RED_CONCRETE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_red_concrete_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_RED_CONCRETE_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_orange_concrete_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_ORANGE_CONCRETE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_orange_concrete_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.CUT_ORANGE_CONCRETE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_orange_concrete_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_ORANGE_CONCRETE_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_yellow_concrete_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_YELLOW_CONCRETE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_yellow_concrete_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.CUT_YELLOW_CONCRETE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_yellow_concrete_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_YELLOW_CONCRETE_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_lime_concrete_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_LIME_CONCRETE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_lime_concrete_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.CUT_LIME_CONCRETE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_lime_concrete_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_LIME_CONCRETE_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_green_concrete_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_GREEN_CONCRETE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_green_concrete_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.CUT_GREEN_CONCRETE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_green_concrete_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_GREEN_CONCRETE_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_cyan_concrete_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_CYAN_CONCRETE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_cyan_concrete_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.CUT_CYAN_CONCRETE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_cyan_concrete_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_CYAN_CONCRETE_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_light_blue_concrete_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_LIGHT_BLUE_CONCRETE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_light_blue_concrete_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.CUT_LIGHT_BLUE_CONCRETE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_light_blue_concrete_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_LIGHT_BLUE_CONCRETE_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_blue_concrete_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_BLUE_CONCRETE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_blue_concrete_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.CUT_BLUE_CONCRETE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_blue_concrete_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_BLUE_CONCRETE_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_purple_concrete_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_PURPLE_CONCRETE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_purple_concrete_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.CUT_PURPLE_CONCRETE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_purple_concrete_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_PURPLE_CONCRETE_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_magenta_concrete_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_MAGENTA_CONCRETE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_magenta_concrete_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.CUT_MAGENTA_CONCRETE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_magenta_concrete_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_MAGENTA_CONCRETE_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_pink_concrete_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_PINK_CONCRETE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_pink_concrete_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.CUT_PINK_CONCRETE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_pink_concrete_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_PINK_CONCRETE_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/white_concrete_pillar"),
                BlockLootTableGenerator.drops(DecoBlocks.WHITE_CONCRETE_PILLAR));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/light_gray_concrete_pillar"),
                BlockLootTableGenerator.drops(DecoBlocks.LIGHT_GRAY_CONCRETE_PILLAR));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/gray_concrete_pillar"),
                BlockLootTableGenerator.drops(DecoBlocks.GRAY_CONCRETE_PILLAR));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/black_concrete_pillar"),
                BlockLootTableGenerator.drops(DecoBlocks.BLACK_CONCRETE_PILLAR));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/brown_concrete_pillar"),
                BlockLootTableGenerator.drops(DecoBlocks.BROWN_CONCRETE_PILLAR));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/red_concrete_pillar"),
                BlockLootTableGenerator.drops(DecoBlocks.RED_CONCRETE_PILLAR));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/yellow_concrete_pillar"),
                BlockLootTableGenerator.drops(DecoBlocks.YELLOW_CONCRETE_PILLAR));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/orange_concrete_pillar"),
                BlockLootTableGenerator.drops(DecoBlocks.ORANGE_CONCRETE_PILLAR));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/lime_concrete_pillar"),
                BlockLootTableGenerator.drops(DecoBlocks.LIME_CONCRETE_PILLAR));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/green_concrete_pillar"),
                BlockLootTableGenerator.drops(DecoBlocks.GREEN_CONCRETE_PILLAR));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cyan_concrete_pillar"),
                BlockLootTableGenerator.drops(DecoBlocks.CYAN_CONCRETE_PILLAR));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/light_blue_concrete_pillar"),
                BlockLootTableGenerator.drops(DecoBlocks.LIGHT_BLUE_CONCRETE_PILLAR));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/blue_concrete_pillar"),
                BlockLootTableGenerator.drops(DecoBlocks.BLUE_CONCRETE_PILLAR));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/purple_concrete_pillar"),
                BlockLootTableGenerator.drops(DecoBlocks.PURPLE_CONCRETE_PILLAR));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/magenta_concrete_pillar"),
                BlockLootTableGenerator.drops(DecoBlocks.MAGENTA_CONCRETE_PILLAR));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/pink_concrete_pillar"),
                BlockLootTableGenerator.drops(DecoBlocks.PINK_CONCRETE_PILLAR));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/tinted_glass_pane"),
                BlockLootTableGenerator.dropsWithSilkTouch(DecoBlocks.TINTED_GLASS_PANE));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/hardened_glass"),
                BlockLootTableGenerator.drops(DecoBlocks.HARDENED_GLASS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/tinted_hardened_glass"),
                BlockLootTableGenerator.drops(DecoBlocks.HARDENED_TINTED_GLASS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/hardened_glass_pane"),
                BlockLootTableGenerator.drops(DecoBlocks.HARDENED_GLASS_PANE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/tinted_hardened_glass_pane"),
                BlockLootTableGenerator.drops(DecoBlocks.HARDENED_TINTED_GLASS_PANE));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/hardened_white_stained_glass"),
                BlockLootTableGenerator.drops(DecoBlocks.HARDENED_WHITE_STAINED_GLASS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/hardened_light_gray_stained_glass"),
                BlockLootTableGenerator.drops(DecoBlocks.HARDENED_LIGHT_GRAY_STAINED_GLASS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/hardened_gray_stained_glass"),
                BlockLootTableGenerator.drops(DecoBlocks.HARDENED_GRAY_STAINED_GLASS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/hardened_black_stained_glass"),
                BlockLootTableGenerator.drops(DecoBlocks.HARDENED_BLACK_STAINED_GLASS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/hardened_brown_stained_glass"),
                BlockLootTableGenerator.drops(DecoBlocks.HARDENED_BROWN_STAINED_GLASS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/hardened_red_stained_glass"),
                BlockLootTableGenerator.drops(DecoBlocks.HARDENED_RED_STAINED_GLASS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/hardened_yellow_stained_glass"),
                BlockLootTableGenerator.drops(DecoBlocks.HARDENED_YELLOW_STAINED_GLASS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/hardened_orange_stained_glass"),
                BlockLootTableGenerator.drops(DecoBlocks.HARDENED_ORANGE_STAINED_GLASS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/hardened_lime_stained_glass"),
                BlockLootTableGenerator.drops(DecoBlocks.HARDENED_LIME_STAINED_GLASS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/hardened_green_stained_glass"),
                BlockLootTableGenerator.drops(DecoBlocks.HARDENED_GREEN_STAINED_GLASS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/hardened_cyan_stained_glass"),
                BlockLootTableGenerator.drops(DecoBlocks.HARDENED_CYAN_STAINED_GLASS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/hardened_light_blue_stained_glass"),
                BlockLootTableGenerator.drops(DecoBlocks.HARDENED_LIGHT_BLUE_STAINED_GLASS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/hardened_blue_stained_glass"),
                BlockLootTableGenerator.drops(DecoBlocks.HARDENED_BLUE_STAINED_GLASS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/hardened_purple_stained_glass"),
                BlockLootTableGenerator.drops(DecoBlocks.HARDENED_PURPLE_STAINED_GLASS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/hardened_magenta_stained_glass"),
                BlockLootTableGenerator.drops(DecoBlocks.HARDENED_MAGENTA_STAINED_GLASS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/hardened_pink_stained_glass"),
                BlockLootTableGenerator.drops(DecoBlocks.HARDENED_PINK_STAINED_GLASS));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/hardened_white_stained_glass_pane"),
                BlockLootTableGenerator.drops(DecoBlocks.HARDENED_WHITE_STAINED_GLASS_PANE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/hardened_light_gray_stained_glass_pane"),
                BlockLootTableGenerator.drops(DecoBlocks.HARDENED_LIGHT_GRAY_STAINED_GLASS_PANE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/hardened_gray_stained_glass_pane"),
                BlockLootTableGenerator.drops(DecoBlocks.HARDENED_GRAY_STAINED_GLASS_PANE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/hardened_black_stained_glass_pane"),
                BlockLootTableGenerator.drops(DecoBlocks.HARDENED_BLACK_STAINED_GLASS_PANE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/hardened_brown_stained_glass_pane"),
                BlockLootTableGenerator.drops(DecoBlocks.HARDENED_BROWN_STAINED_GLASS_PANE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/hardened_red_stained_glass_pane"),
                BlockLootTableGenerator.drops(DecoBlocks.HARDENED_RED_STAINED_GLASS_PANE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/hardened_yellow_stained_glass_pane"),
                BlockLootTableGenerator.drops(DecoBlocks.HARDENED_YELLOW_STAINED_GLASS_PANE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/hardened_orange_stained_glass_pane"),
                BlockLootTableGenerator.drops(DecoBlocks.HARDENED_ORANGE_STAINED_GLASS_PANE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/hardened_lime_stained_glass_pane"),
                BlockLootTableGenerator.drops(DecoBlocks.HARDENED_LIME_STAINED_GLASS_PANE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/hardened_green_stained_glass_pane"),
                BlockLootTableGenerator.drops(DecoBlocks.HARDENED_GREEN_STAINED_GLASS_PANE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/hardened_cyan_stained_glass_pane"),
                BlockLootTableGenerator.drops(DecoBlocks.HARDENED_CYAN_STAINED_GLASS_PANE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/hardened_light_blue_stained_glass_pane"),
                BlockLootTableGenerator.drops(DecoBlocks.HARDENED_LIGHT_BLUE_STAINED_GLASS_PANE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/hardened_blue_stained_glass_pane"),
                BlockLootTableGenerator.drops(DecoBlocks.HARDENED_BLUE_STAINED_GLASS_PANE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/hardened_purple_stained_glass_pane"),
                BlockLootTableGenerator.drops(DecoBlocks.HARDENED_PURPLE_STAINED_GLASS_PANE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/hardened_magenta_stained_glass_pane"),
                BlockLootTableGenerator.drops(DecoBlocks.HARDENED_MAGENTA_STAINED_GLASS_PANE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/hardened_pink_stained_glass_pane"),
                BlockLootTableGenerator.drops(DecoBlocks.HARDENED_PINK_STAINED_GLASS_PANE));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/smooth_deepslate"),
                BlockLootTableGenerator.drops(DecoBlocks.SMOOTH_DEEPSLATE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/smooth_deepslate_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.SMOOTH_DEEPSLATE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/smooth_deepslate_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.SMOOTH_DEEPSLATE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/smooth_deepslate_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.SMOOTH_DEEPSLATE_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/deepslate_furnace"),
                BlockLootTableGenerator.drops(DecoBlocks.DEEPSLATE_FURNACE));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/smooth_blackstone"),
                BlockLootTableGenerator.drops(DecoBlocks.SMOOTH_BLACKSTONE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/smooth_blackstone_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.SMOOTH_BLACKSTONE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/smooth_blackstone_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.SMOOTH_BLACKSTONE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/smooth_blackstone_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.SMOOTH_BLACKSTONE_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/blackstone_furnace"),
                BlockLootTableGenerator.drops(DecoBlocks.BLACKSTONE_FURNACE));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/deepslate_blast_furnace"),
                BlockLootTableGenerator.drops(DecoBlocks.DEEPSLATE_BLAST_FURNACE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/blackstone_blast_furnace"),
                BlockLootTableGenerator.drops(DecoBlocks.BLACKSTONE_BLAST_FURNACE));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/deepslate_smoker"),
                BlockLootTableGenerator.drops(DecoBlocks.DEEPSLATE_SMOKER));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/blackstone_smoker"),
                BlockLootTableGenerator.drops(DecoBlocks.BLACKSTONE_SMOKER));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/deepslate_stonecutter"),
                BlockLootTableGenerator.drops(DecoBlocks.DEEPSLATE_STONECUTTER));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/blackstone_stonecutter"),
                BlockLootTableGenerator.drops(DecoBlocks.BLACKSTONE_STONECUTTER));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/deepslate_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.DEEPSLATE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/deepslate_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.DEEPSLATE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/deepslate_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.DEEPSLATE_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/chiseled_bricks"),
                BlockLootTableGenerator.drops(DecoBlocks.CHISELED_BRICKS));
    }
}
