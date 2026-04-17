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
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
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
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cracked_stone_tiles"),
                BlockLootTableGenerator.drops(DecoBlocks.CRACKED_STONE_TILES));
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
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cracked_polished_blackstone_tiles"),
                BlockLootTableGenerator.drops(DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILES));
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
                BlockLootTableGenerator.drops(DecoBlocks.SNOW_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/snow_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.SNOW_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/snow_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.SNOW_WALL));

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
                BlockLootTableGenerator.drops(DecoBlocks.SNOW_BRICK_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/snow_brick_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.SNOW_BRICK_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/snow_brick_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.SNOW_BRICK_WALL));

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
                BlockLootTableGenerator.drops(DecoBlocks.BUBBLE_BLOCK, DecoItems.BUBBLE_ORB,
                        ConstantLootNumberProvider.create(2.0F)));
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
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/blue_nether_brick_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.BLUE_NETHER_BRICK_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/blue_nether_brick_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.BLUE_NETHER_BRICK_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/blue_nether_brick_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.BLUE_NETHER_BRICK_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/blue_nether_brick_fence"),
                BlockLootTableGenerator.drops(DecoBlocks.BLUE_NETHER_BRICK_FENCE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/blue_nether_brick_fence_gate"),
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
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/mushroom_crafting_table"),
                BlockLootTableGenerator.drops(DecoBlocks.MUSHROOM_CRAFTING_TABLE));

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
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/mushroom_barrel"),
                BlockLootTableGenerator.drops(DecoBlocks.MUSHROOM_BARREL));

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
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/mushroom_ladder"),
                BlockLootTableGenerator.drops(DecoBlocks.MUSHROOM_LADDER));

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
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/mushroom_smithing_table"),
                BlockLootTableGenerator.drops(DecoBlocks.MUSHROOM_SMITHING_TABLE));

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
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/mushroom_cartography_table"),
                BlockLootTableGenerator.drops(DecoBlocks.MUSHROOM_CARTOGRAPHY_TABLE));

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
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/hardened_tinted_glass"),
                BlockLootTableGenerator.drops(DecoBlocks.HARDENED_TINTED_GLASS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/hardened_glass_pane"),
                BlockLootTableGenerator.drops(DecoBlocks.HARDENED_GLASS_PANE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/hardened_tinted_glass_pane"),
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

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/end_stone_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.END_STONE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/end_stone_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.END_STONE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/end_stone_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.END_STONE_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/chiseled_end_stone"),
                BlockLootTableGenerator.drops(DecoBlocks.CHISELED_END_STONE));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/smooth_purpur"),
                BlockLootTableGenerator.drops(DecoBlocks.SMOOTH_PURPUR));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/smooth_purpur_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.SMOOTH_PURPUR_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/smooth_purpur_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.SMOOTH_PURPUR_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/smooth_purpur_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.SMOOTH_PURPUR_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/purpur_bricks"),
                BlockLootTableGenerator.drops(DecoBlocks.PURPUR_BRICKS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/purpur_brick_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.PURPUR_BRICK_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/purpur_brick_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.PURPUR_BRICK_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/purpur_brick_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.PURPUR_BRICK_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/chiseled_purpur"),
                BlockLootTableGenerator.drops(DecoBlocks.CHISELED_PURPUR));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/void_stone"),
                BlockLootTableGenerator.drops(DecoBlocks.VOID_STONE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/void_stone_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.VOID_STONE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/void_stone_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.VOID_STONE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/void_stone_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.VOID_STONE_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/void_stone_bricks"),
                BlockLootTableGenerator.drops(DecoBlocks.VOID_STONE_BRICKS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/void_stone_brick_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.VOID_STONE_BRICK_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/void_stone_brick_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.VOID_STONE_BRICK_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/void_stone_brick_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.VOID_STONE_BRICK_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/chiseled_void_stone"),
                BlockLootTableGenerator.drops(DecoBlocks.CHISELED_VOID_STONE));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/obsidian_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.OBSIDIAN_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/obsidian_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.OBSIDIAN_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/obsidian_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.OBSIDIAN_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/obsidian_bricks"),
                BlockLootTableGenerator.drops(DecoBlocks.OBSIDIAN_BRICKS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/obsidian_brick_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.OBSIDIAN_BRICK_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/obsidian_brick_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.OBSIDIAN_BRICK_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/obsidian_brick_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.OBSIDIAN_BRICK_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/obsidian_pillar"),
                BlockLootTableGenerator.drops(DecoBlocks.OBSIDIAN_PILLAR));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/chiseled_obsidian"),
                BlockLootTableGenerator.drops(DecoBlocks.CHISELED_OBSIDIAN));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/charcoal_block"),
                BlockLootTableGenerator.drops(DecoBlocks.CHARCOAL_BLOCK));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/flint_block"),
                BlockLootTableGenerator.drops(DecoBlocks.FLINT_BLOCK));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/echo_block"),
                BlockLootTableGenerator.drops(DecoBlocks.ECHO_BLOCK));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_iron"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_IRON));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_iron_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_IRON_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_iron_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.CUT_IRON_SLAB));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/light_iron_bars"),
                BlockLootTableGenerator.drops(DecoBlocks.LIGHT_IRON_BARS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/heavy_iron_bars"),
                BlockLootTableGenerator.drops(DecoBlocks.HEAVY_IRON_BARS));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/gold_door"),
                BlockLootTableGenerator.doorDrops(DecoBlocks.GOLD_DOOR));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/gold_trapdoor"),
                BlockLootTableGenerator.drops(DecoBlocks.GOLD_TRAPDOOR));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/polished_deepslate_pressure_plate"),
                BlockLootTableGenerator.drops(DecoBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/polished_deepslate_button"),
                BlockLootTableGenerator.drops(DecoBlocks.POLISHED_DEEPSLATE_BUTTON));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/heavy_copper_bars"),
                BlockLootTableGenerator.drops(DecoBlocks.HEAVY_COPPER_BARS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/waxed_heavy_copper_bars"),
                BlockLootTableGenerator.drops(DecoBlocks.WAXED_HEAVY_COPPER_BARS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/exposed_heavy_copper_bars"),
                BlockLootTableGenerator.drops(DecoBlocks.EXPOSED_HEAVY_COPPER_BARS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/waxed_exposed_heavy_copper_bars"),
                BlockLootTableGenerator.drops(DecoBlocks.WAXED_EXPOSED_HEAVY_COPPER_BARS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/weathered_heavy_copper_bars"),
                BlockLootTableGenerator.drops(DecoBlocks.WEATHERED_HEAVY_COPPER_BARS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/waxed_weathered_heavy_copper_bars"),
                BlockLootTableGenerator.drops(DecoBlocks.WAXED_WEATHERED_HEAVY_COPPER_BARS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/oxidized_heavy_copper_bars"),
                BlockLootTableGenerator.drops(DecoBlocks.OXIDIZED_HEAVY_COPPER_BARS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/waxed_oxidized_heavy_copper_bars"),
                BlockLootTableGenerator.drops(DecoBlocks.WAXED_OXIDIZED_HEAVY_COPPER_BARS));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/light_copper_bars"),
                BlockLootTableGenerator.drops(DecoBlocks.LIGHT_COPPER_BARS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/waxed_light_copper_bars"),
                BlockLootTableGenerator.drops(DecoBlocks.WAXED_LIGHT_COPPER_BARS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/exposed_light_copper_bars"),
                BlockLootTableGenerator.drops(DecoBlocks.EXPOSED_LIGHT_COPPER_BARS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/waxed_exposed_light_copper_bars"),
                BlockLootTableGenerator.drops(DecoBlocks.WAXED_EXPOSED_LIGHT_COPPER_BARS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/weathered_light_copper_bars"),
                BlockLootTableGenerator.drops(DecoBlocks.WEATHERED_LIGHT_COPPER_BARS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/waxed_weathered_light_copper_bars"),
                BlockLootTableGenerator.drops(DecoBlocks.WAXED_WEATHERED_LIGHT_COPPER_BARS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/oxidized_light_copper_bars"),
                BlockLootTableGenerator.drops(DecoBlocks.OXIDIZED_LIGHT_COPPER_BARS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/waxed_oxidized_light_copper_bars"),
                BlockLootTableGenerator.drops(DecoBlocks.WAXED_OXIDIZED_LIGHT_COPPER_BARS));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/copper_bars"),
                BlockLootTableGenerator.drops(DecoBlocks.COPPER_BARS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/waxed_copper_bars"),
                BlockLootTableGenerator.drops(DecoBlocks.WAXED_COPPER_BARS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/exposed_copper_bars"),
                BlockLootTableGenerator.drops(DecoBlocks.EXPOSED_COPPER_BARS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/waxed_exposed_copper_bars"),
                BlockLootTableGenerator.drops(DecoBlocks.WAXED_EXPOSED_COPPER_BARS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/weathered_copper_bars"),
                BlockLootTableGenerator.drops(DecoBlocks.WEATHERED_COPPER_BARS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/waxed_weathered_copper_bars"),
                BlockLootTableGenerator.drops(DecoBlocks.WAXED_WEATHERED_COPPER_BARS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/oxidized_copper_bars"),
                BlockLootTableGenerator.drops(DecoBlocks.OXIDIZED_COPPER_BARS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/waxed_oxidized_copper_bars"),
                BlockLootTableGenerator.drops(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/deepslate_pressure_plate"),
                BlockLootTableGenerator.drops(DecoBlocks.DEEPSLATE_PRESSURE_PLATE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/deepslate_button"),
                BlockLootTableGenerator.drops(DecoBlocks.DEEPSLATE_BUTTON));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cobbled_deepslate_pressure_plate"),
                BlockLootTableGenerator.drops(DecoBlocks.COBBLED_DEEPSLATE_PRESSURE_PLATE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cobbled_deepslate_button"),
                BlockLootTableGenerator.drops(DecoBlocks.COBBLED_DEEPSLATE_BUTTON));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cobblestone_pressure_plate"),
                BlockLootTableGenerator.drops(DecoBlocks.COBBLESTONE_PRESSURE_PLATE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cobblestone_button"),
                BlockLootTableGenerator.drops(DecoBlocks.COBBLESTONE_BUTTON));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/blackstone_pressure_plate"),
                BlockLootTableGenerator.drops(DecoBlocks.BLACKSTONE_PRESSURE_PLATE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/blackstone_button"),
                BlockLootTableGenerator.drops(DecoBlocks.BLACKSTONE_BUTTON));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/polished_stone_pressure_plate"),
                BlockLootTableGenerator.drops(DecoBlocks.POLISHED_STONE_PRESSURE_PLATE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/polished_stone_button"),
                BlockLootTableGenerator.drops(DecoBlocks.POLISHED_STONE_BUTTON));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/yellow_tulip"),
                BlockLootTableGenerator.drops(DecoBlocks.YELLOW_TULIP));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/potted_yellow_tulip"),
                BlockLootTableGenerator.pottedPlantDrops(DecoBlocks.POTTED_YELLOW_TULIP));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/purple_tulip"),
                BlockLootTableGenerator.drops(DecoBlocks.PURPLE_TULIP));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/potted_purple_tulip"),
                BlockLootTableGenerator.pottedPlantDrops(DecoBlocks.POTTED_PURPLE_TULIP));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/magenta_tulip"),
                BlockLootTableGenerator.drops(DecoBlocks.MAGENTA_TULIP));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/potted_magenta_tulip"),
                BlockLootTableGenerator.pottedPlantDrops(DecoBlocks.POTTED_MAGENTA_TULIP));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/blue_tulip"),
                BlockLootTableGenerator.drops(DecoBlocks.BLUE_TULIP));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/potted_blue_tulip"),
                BlockLootTableGenerator.pottedPlantDrops(DecoBlocks.POTTED_BLUE_TULIP));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/black_tulip"),
                BlockLootTableGenerator.drops(DecoBlocks.BLACK_TULIP));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/potted_black_tulip"),
                BlockLootTableGenerator.pottedPlantDrops(DecoBlocks.POTTED_BLACK_TULIP));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/green_tulip"),
                BlockLootTableGenerator.drops(DecoBlocks.GREEN_TULIP));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/potted_green_tulip"),
                BlockLootTableGenerator.pottedPlantDrops(DecoBlocks.POTTED_GREEN_TULIP));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cyan_tulip"),
                BlockLootTableGenerator.drops(DecoBlocks.CYAN_TULIP));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/potted_cyan_tulip"),
                BlockLootTableGenerator.pottedPlantDrops(DecoBlocks.POTTED_CYAN_TULIP));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/barberton_daisy"),
                BlockLootTableGenerator.drops(DecoBlocks.BARBERTON_DAISY));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/potted_barberton_daisy"),
                BlockLootTableGenerator.pottedPlantDrops(DecoBlocks.POTTED_BARBERTON_DAISY));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/blue_eyed_daisy"),
                BlockLootTableGenerator.drops(DecoBlocks.BLUE_EYED_DAISY));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/potted_blue_eyed_daisy"),
                BlockLootTableGenerator.pottedPlantDrops(DecoBlocks.POTTED_BLUE_EYED_DAISY));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/gerbera_daisy"),
                BlockLootTableGenerator.drops(DecoBlocks.GERBERA_DAISY));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/potted_gerbera_daisy"),
                BlockLootTableGenerator.pottedPlantDrops(DecoBlocks.POTTED_GERBERA_DAISY));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/michaelmas_daisy"),
                BlockLootTableGenerator.drops(DecoBlocks.MICHAELMAS_DAISY));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/potted_michaelmas_daisy"),
                BlockLootTableGenerator.pottedPlantDrops(DecoBlocks.POTTED_MICHAELMAS_DAISY));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/puffy_dandelion"),
                BlockLootTableGenerator.drops(DecoBlocks.PUFFY_DANDELION));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/potted_puffy_dandelion"),
                BlockLootTableGenerator.pottedPlantDrops(DecoBlocks.POTTED_PUFFY_DANDELION));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/california_poppy"),
                BlockLootTableGenerator.drops(DecoBlocks.CALIFORNIA_POPPY));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/potted_california_poppy"),
                BlockLootTableGenerator.pottedPlantDrops(DecoBlocks.POTTED_CALIFORNIA_POPPY));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/salmon_poppy"),
                BlockLootTableGenerator.drops(DecoBlocks.SALMON_POPPY));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/potted_salmon_poppy"),
                BlockLootTableGenerator.pottedPlantDrops(DecoBlocks.POTTED_SALMON_POPPY));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/white_orchid"),
                BlockLootTableGenerator.drops(DecoBlocks.WHITE_ORCHID));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/potted_white_orchid"),
                BlockLootTableGenerator.pottedPlantDrops(DecoBlocks.POTTED_WHITE_ORCHID));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/yellow_orchid"),
                BlockLootTableGenerator.drops(DecoBlocks.YELLOW_ORCHID));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/potted_yellow_orchid"),
                BlockLootTableGenerator.pottedPlantDrops(DecoBlocks.POTTED_YELLOW_ORCHID));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/pink_orchid"),
                BlockLootTableGenerator.drops(DecoBlocks.PINK_ORCHID));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/potted_pink_orchid"),
                BlockLootTableGenerator.pottedPlantDrops(DecoBlocks.POTTED_PINK_ORCHID));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/rose"),
                BlockLootTableGenerator.drops(DecoBlocks.ROSE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/potted_rose"),
                BlockLootTableGenerator.pottedPlantDrops(DecoBlocks.POTTED_ROSE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/ender_rose"),
                BlockLootTableGenerator.drops(DecoBlocks.ENDER_ROSE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/potted_ender_rose"),
                BlockLootTableGenerator.pottedPlantDrops(DecoBlocks.POTTED_ENDER_ROSE));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/paeonia"),
                BlockLootTableGenerator.drops(DecoBlocks.PAEONIA));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/potted_paeonia"),
                BlockLootTableGenerator.pottedPlantDrops(DecoBlocks.POTTED_PAEONIA));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/lavender"),
                BlockLootTableGenerator.drops(DecoBlocks.LAVENDER));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/potted_lavender"),
                BlockLootTableGenerator.pottedPlantDrops(DecoBlocks.POTTED_LAVENDER));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/blue_hibiscus"),
                BlockLootTableGenerator.drops(DecoBlocks.BLUE_HIBISCUS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/potted_blue_hibiscus"),
                BlockLootTableGenerator.pottedPlantDrops(DecoBlocks.POTTED_BLUE_HIBISCUS));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/bromeliad"),
                BlockLootTableGenerator.drops(DecoBlocks.BROMELIAD));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/potted_bromeliad"),
                BlockLootTableGenerator.pottedPlantDrops(DecoBlocks.POTTED_BROMELIAD));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/copper_chain"),
                BlockLootTableGenerator.drops(DecoBlocks.COPPER_CHAIN));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/waxed_copper_chain"),
                BlockLootTableGenerator.drops(DecoBlocks.WAXED_COPPER_CHAIN));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/exposed_copper_chain"),
                BlockLootTableGenerator.drops(DecoBlocks.EXPOSED_COPPER_CHAIN));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/waxed_exposed_copper_chain"),
                BlockLootTableGenerator.drops(DecoBlocks.WAXED_EXPOSED_COPPER_CHAIN));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/weathered_copper_chain"),
                BlockLootTableGenerator.drops(DecoBlocks.WEATHERED_COPPER_CHAIN));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/waxed_weathered_copper_chain"),
                BlockLootTableGenerator.drops(DecoBlocks.WAXED_WEATHERED_COPPER_CHAIN));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/oxidized_copper_chain"),
                BlockLootTableGenerator.drops(DecoBlocks.OXIDIZED_COPPER_CHAIN));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/waxed_oxidized_copper_chain"),
                BlockLootTableGenerator.drops(DecoBlocks.WAXED_OXIDIZED_COPPER_CHAIN));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/copper_lantern"),
                BlockLootTableGenerator.drops(DecoBlocks.COPPER_LANTERN));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/waxed_copper_lantern"),
                BlockLootTableGenerator.drops(DecoBlocks.WAXED_COPPER_LANTERN));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/exposed_copper_lantern"),
                BlockLootTableGenerator.drops(DecoBlocks.EXPOSED_COPPER_LANTERN));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/waxed_exposed_copper_lantern"),
                BlockLootTableGenerator.drops(DecoBlocks.WAXED_EXPOSED_COPPER_LANTERN));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/weathered_copper_lantern"),
                BlockLootTableGenerator.drops(DecoBlocks.WEATHERED_COPPER_LANTERN));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/waxed_weathered_copper_lantern"),
                BlockLootTableGenerator.drops(DecoBlocks.WAXED_WEATHERED_COPPER_LANTERN));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/oxidized_copper_lantern"),
                BlockLootTableGenerator.drops(DecoBlocks.OXIDIZED_COPPER_LANTERN));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/waxed_oxidized_copper_lantern"),
                BlockLootTableGenerator.drops(DecoBlocks.WAXED_OXIDIZED_COPPER_LANTERN));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/copper_soul_lantern"),
                BlockLootTableGenerator.drops(DecoBlocks.COPPER_SOUL_LANTERN));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/waxed_copper_soul_lantern"),
                BlockLootTableGenerator.drops(DecoBlocks.WAXED_COPPER_SOUL_LANTERN));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/exposed_copper_soul_lantern"),
                BlockLootTableGenerator.drops(DecoBlocks.EXPOSED_COPPER_SOUL_LANTERN));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/waxed_exposed_copper_soul_lantern"),
                BlockLootTableGenerator.drops(DecoBlocks.WAXED_EXPOSED_COPPER_SOUL_LANTERN));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/weathered_copper_soul_lantern"),
                BlockLootTableGenerator.drops(DecoBlocks.WEATHERED_COPPER_SOUL_LANTERN));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/waxed_weathered_copper_soul_lantern"),
                BlockLootTableGenerator.drops(DecoBlocks.WAXED_WEATHERED_COPPER_SOUL_LANTERN));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/oxidized_copper_soul_lantern"),
                BlockLootTableGenerator.drops(DecoBlocks.OXIDIZED_COPPER_SOUL_LANTERN));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/waxed_oxidized_copper_soul_lantern"),
                BlockLootTableGenerator.drops(DecoBlocks.WAXED_OXIDIZED_COPPER_SOUL_LANTERN));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/copper_weight_pressure_plate"),
                BlockLootTableGenerator.drops(DecoBlocks.COPPER_WEIGHT_PRESSURE_PLATE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/waxed_copper_weight_pressure_plate"),
                BlockLootTableGenerator.drops(DecoBlocks.WAXED_COPPER_WEIGHT_PRESSURE_PLATE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/exposed_copper_weight_pressure_plate"),
                BlockLootTableGenerator.drops(DecoBlocks.EXPOSED_COPPER_WEIGHT_PRESSURE_PLATE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/waxed_exposed_copper_weight_pressure_plate"),
                BlockLootTableGenerator.drops(DecoBlocks.WAXED_EXPOSED_COPPER_WEIGHT_PRESSURE_PLATE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/weathered_copper_weight_pressure_plate"),
                BlockLootTableGenerator.drops(DecoBlocks.WEATHERED_COPPER_WEIGHT_PRESSURE_PLATE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/waxed_weathered_copper_weight_pressure_plate"),
                BlockLootTableGenerator.drops(DecoBlocks.WAXED_WEATHERED_COPPER_WEIGHT_PRESSURE_PLATE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/oxidized_copper_weight_pressure_plate"),
                BlockLootTableGenerator.drops(DecoBlocks.OXIDIZED_COPPER_WEIGHT_PRESSURE_PLATE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/waxed_oxidized_copper_weight_pressure_plate"),
                BlockLootTableGenerator.drops(DecoBlocks.WAXED_OXIDIZED_COPPER_WEIGHT_PRESSURE_PLATE));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/white_block"),
                BlockLootTableGenerator.drops(DecoBlocks.WHITE_BLOCK));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/light_gray_block"),
                BlockLootTableGenerator.drops(DecoBlocks.LIGHT_GRAY_BLOCK));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/gray_block"),
                BlockLootTableGenerator.drops(DecoBlocks.GRAY_BLOCK));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/black_block"),
                BlockLootTableGenerator.drops(DecoBlocks.BLACK_BLOCK));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/brown_block"),
                BlockLootTableGenerator.drops(DecoBlocks.BROWN_BLOCK));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/red_block"),
                BlockLootTableGenerator.drops(DecoBlocks.RED_BLOCK));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/orange_block"),
                BlockLootTableGenerator.drops(DecoBlocks.ORANGE_BLOCK));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/yellow_block"),
                BlockLootTableGenerator.drops(DecoBlocks.YELLOW_BLOCK));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/lime_block"),
                BlockLootTableGenerator.drops(DecoBlocks.LIME_BLOCK));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/green_block"),
                BlockLootTableGenerator.drops(DecoBlocks.GREEN_BLOCK));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cyan_block"),
                BlockLootTableGenerator.drops(DecoBlocks.CYAN_BLOCK));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/light_blue_block"),
                BlockLootTableGenerator.drops(DecoBlocks.LIGHT_BLUE_BLOCK));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/blue_block"),
                BlockLootTableGenerator.drops(DecoBlocks.BLUE_BLOCK));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/purple_block"),
                BlockLootTableGenerator.drops(DecoBlocks.PURPLE_BLOCK));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/magenta_block"),
                BlockLootTableGenerator.drops(DecoBlocks.MAGENTA_BLOCK));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/pink_block"),
                BlockLootTableGenerator.drops(DecoBlocks.PINK_BLOCK));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/pastel_light_gray_block"),
                BlockLootTableGenerator.drops(DecoBlocks.PASTEL_LIGHT_GRAY_BLOCK));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/pastel_gray_block"),
                BlockLootTableGenerator.drops(DecoBlocks.PASTEL_GRAY_BLOCK));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/pastel_brown_block"),
                BlockLootTableGenerator.drops(DecoBlocks.PASTEL_BROWN_BLOCK));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/pastel_red_block"),
                BlockLootTableGenerator.drops(DecoBlocks.PASTEL_RED_BLOCK));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/pastel_orange_block"),
                BlockLootTableGenerator.drops(DecoBlocks.PASTEL_ORANGE_BLOCK));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/pastel_yellow_block"),
                BlockLootTableGenerator.drops(DecoBlocks.PASTEL_YELLOW_BLOCK));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/pastel_lime_block"),
                BlockLootTableGenerator.drops(DecoBlocks.PASTEL_LIME_BLOCK));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/pastel_green_block"),
                BlockLootTableGenerator.drops(DecoBlocks.PASTEL_GREEN_BLOCK));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/pastel_cyan_block"),
                BlockLootTableGenerator.drops(DecoBlocks.PASTEL_CYAN_BLOCK));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/pastel_light_blue_block"),
                BlockLootTableGenerator.drops(DecoBlocks.PASTEL_LIGHT_BLUE_BLOCK));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/pastel_blue_block"),
                BlockLootTableGenerator.drops(DecoBlocks.PASTEL_BLUE_BLOCK));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/pastel_purple_block"),
                BlockLootTableGenerator.drops(DecoBlocks.PASTEL_PURPLE_BLOCK));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/pastel_magenta_block"),
                BlockLootTableGenerator.drops(DecoBlocks.PASTEL_MAGENTA_BLOCK));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/pastel_pink_block"),
                BlockLootTableGenerator.drops(DecoBlocks.PASTEL_PINK_BLOCK));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/shaded_light_gray_block"),
                BlockLootTableGenerator.drops(DecoBlocks.SHADED_LIGHT_GRAY_BLOCK));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/shaded_gray_block"),
                BlockLootTableGenerator.drops(DecoBlocks.SHADED_GRAY_BLOCK));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/shaded_brown_block"),
                BlockLootTableGenerator.drops(DecoBlocks.SHADED_BROWN_BLOCK));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/shaded_red_block"),
                BlockLootTableGenerator.drops(DecoBlocks.SHADED_RED_BLOCK));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/shaded_orange_block"),
                BlockLootTableGenerator.drops(DecoBlocks.SHADED_ORANGE_BLOCK));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/shaded_yellow_block"),
                BlockLootTableGenerator.drops(DecoBlocks.SHADED_YELLOW_BLOCK));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/shaded_lime_block"),
                BlockLootTableGenerator.drops(DecoBlocks.SHADED_LIME_BLOCK));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/shaded_green_block"),
                BlockLootTableGenerator.drops(DecoBlocks.SHADED_GREEN_BLOCK));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/shaded_cyan_block"),
                BlockLootTableGenerator.drops(DecoBlocks.SHADED_CYAN_BLOCK));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/shaded_light_blue_block"),
                BlockLootTableGenerator.drops(DecoBlocks.SHADED_LIGHT_BLUE_BLOCK));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/shaded_blue_block"),
                BlockLootTableGenerator.drops(DecoBlocks.SHADED_BLUE_BLOCK));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/shaded_purple_block"),
                BlockLootTableGenerator.drops(DecoBlocks.SHADED_PURPLE_BLOCK));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/shaded_magenta_block"),
                BlockLootTableGenerator.drops(DecoBlocks.SHADED_MAGENTA_BLOCK));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/shaded_pink_block"),
                BlockLootTableGenerator.drops(DecoBlocks.SHADED_PINK_BLOCK));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/wooden_planks"),
                BlockLootTableGenerator.drops(DecoBlocks.WOODEN_PLANKS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/wooden_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.WOODEN_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/wooden_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.WOODEN_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/wooden_fence"),
                BlockLootTableGenerator.drops(DecoBlocks.WOODEN_FENCE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/wooden_fence_gate"),
                BlockLootTableGenerator.drops(DecoBlocks.WOODEN_FENCE_GATE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/wooden_pressure_plate"),
                BlockLootTableGenerator.drops(DecoBlocks.WOODEN_PRESSURE_PLATE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/wooden_button"),
                BlockLootTableGenerator.drops(DecoBlocks.WOODEN_BUTTON));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/wooden_log"),
                BlockLootTableGenerator.drops(DecoBlocks.WOODEN_LOG));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/wooden_wood"),
                BlockLootTableGenerator.drops(DecoBlocks.WOODEN_WOOD));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/stripped_wooden_log"),
                BlockLootTableGenerator.drops(DecoBlocks.STRIPPED_WOODEN_LOG));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/stripped_wooden_wood"),
                BlockLootTableGenerator.drops(DecoBlocks.STRIPPED_WOODEN_WOOD));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/wooden_door"),
                BlockLootTableGenerator.doorDrops(DecoBlocks.WOODEN_DOOR));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/wooden_trapdoor"),
                BlockLootTableGenerator.drops(DecoBlocks.WOODEN_TRAPDOOR));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/oak_crafting_table"),
                BlockLootTableGenerator.drops(DecoBlocks.OAK_CRAFTING_TABLE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/wooden_ladder"),
                BlockLootTableGenerator.drops(DecoBlocks.WOODEN_LADDER));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/standing_wooden_sign"),
                BlockLootTableGenerator.drops(DecoItems.WOODEN_SIGN));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/wall_wooden_sign"),
                BlockLootTableGenerator.drops(DecoItems.WOODEN_SIGN));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/wooden_sapling"),
                BlockLootTableGenerator.drops(DecoBlocks.WOODEN_SAPLING));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/potted_wooden_sapling"),
                BlockLootTableGenerator.pottedPlantDrops(DecoBlocks.POTTED_WOODEN_SAPLING));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/smooth_basalt_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.SMOOTH_BASALT_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/smooth_basalt_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.SMOOTH_BASALT_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/smooth_basalt_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.SMOOTH_BASALT_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/purpur_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.PURPUR_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/infested_polished_stone"),
                BlockLootTableGenerator.drops(DecoBlocks.INFESTED_POLISHED_STONE, DecoBlocks.POLISHED_STONE));
        
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/infested_stone_tiles"),
                BlockLootTableGenerator.drops(DecoBlocks.INFESTED_STONE_TILES, DecoBlocks.STONE_TILES));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/infested_cobbled_deepslate"),
                BlockLootTableGenerator.drops(DecoBlocks.INFESTED_COBBLED_DEEPSLATE, Items.COBBLED_DEEPSLATE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/infested_polished_deepslate"),
                BlockLootTableGenerator.drops(DecoBlocks.INFESTED_POLISHED_DEEPSLATE, Items.POLISHED_DEEPSLATE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/infested_deepslate_bricks"),
                BlockLootTableGenerator.drops(DecoBlocks.INFESTED_DEEPSLATE_BRICKS, Items.DEEPSLATE_BRICKS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/infested_deepslate_tiles"),
                BlockLootTableGenerator.drops(DecoBlocks.INFESTED_DEEPSLATE_TILES, Items.DEEPSLATE_TILES));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/infested_cracked_deepslate_bricks"),
                BlockLootTableGenerator.drops(DecoBlocks.INFESTED_CRACKED_DEEPSLATE_BRICKS, Items.CRACKED_DEEPSLATE_BRICKS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/infested_cracked_deepslate_tiles"),
                BlockLootTableGenerator.drops(DecoBlocks.INFESTED_CRACKED_DEEPSLATE_TILES, Items.CRACKED_DEEPSLATE_TILES));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/infested_mossy_cobblestone"),
                BlockLootTableGenerator.drops(DecoBlocks.INFESTED_MOSSY_COBBLESTONE, Items.MOSSY_COBBLESTONE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/infested_chiseled_deepslate"),
                BlockLootTableGenerator.drops(DecoBlocks.INFESTED_CHISELED_DEEPSLATE, Items.CHISELED_DEEPSLATE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/infested_calcite"),
                BlockLootTableGenerator.drops(DecoBlocks.INFESTED_CALCITE, Items.CALCITE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/infested_dripstone_block"),
                BlockLootTableGenerator.drops(DecoBlocks.INFESTED_DRIPSTONE_BLOCK, Items.DRIPSTONE_BLOCK));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/infested_tuff"),
                BlockLootTableGenerator.drops(DecoBlocks.INFESTED_TUFF, Items.TUFF));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/infested_granite"),
                BlockLootTableGenerator.drops(DecoBlocks.INFESTED_GRANITE, Items.GRANITE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/infested_polished_granite"),
                BlockLootTableGenerator.drops(DecoBlocks.INFESTED_POLISHED_GRANITE, Items.POLISHED_GRANITE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/infested_diorite"),
                BlockLootTableGenerator.drops(DecoBlocks.INFESTED_DIORITE, Items.DIORITE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/infested_polished_diorite"),
                BlockLootTableGenerator.drops(DecoBlocks.INFESTED_POLISHED_DIORITE, Items.POLISHED_DIORITE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/infested_andesite"),
                BlockLootTableGenerator.drops(DecoBlocks.INFESTED_ANDESITE, Items.ANDESITE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/infested_polished_andesite"),
                BlockLootTableGenerator.drops(DecoBlocks.INFESTED_POLISHED_ANDESITE, Items.POLISHED_ANDESITE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/infested_blackstone"),
                BlockLootTableGenerator.drops(DecoBlocks.INFESTED_BLACKSTONE, Items.BLACKSTONE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/infested_polished_blackstone"),
                BlockLootTableGenerator.drops(DecoBlocks.INFESTED_POLISHED_BLACKSTONE, Items.POLISHED_BLACKSTONE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/infested_polished_blackstone_bricks"),
                BlockLootTableGenerator.drops(DecoBlocks.INFESTED_POLISHED_BLACKSTONE_BRICKS, Items.POLISHED_BLACKSTONE_BRICKS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/infested_polished_blackstone_tiles"),
                BlockLootTableGenerator.drops(DecoBlocks.INFESTED_POLISHED_BLACKSTONE_TILES, DecoBlocks.POLISHED_BLACKSTONE_TILES));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/infested_cracked_polished_blackstone_bricks"),
                BlockLootTableGenerator.drops(DecoBlocks.INFESTED_CRACKED_POLISHED_BLACKSTONE_BRICKS, Items.CRACKED_POLISHED_BLACKSTONE_BRICKS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/infested_chiseled_polished_blackstone"),
                BlockLootTableGenerator.drops(DecoBlocks.INFESTED_CHISELED_POLISHED_BLACKSTONE, Items.CHISELED_POLISHED_BLACKSTONE));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/infested_cracked_stone_tiles"),
                BlockLootTableGenerator.drops(DecoBlocks.INFESTED_CRACKED_STONE_TILES, DecoBlocks.CRACKED_STONE_TILES));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/infested_cracked_polished_blackstone_tiles"),
                BlockLootTableGenerator.drops(DecoBlocks.INFESTED_CRACKED_POLISHED_BLACKSTONE_TILES, DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILES));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/deepslate_grindstone"),
                BlockLootTableGenerator.drops(DecoBlocks.DEEPSLATE_GRINDSTONE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/blackstone_grindstone"),
                BlockLootTableGenerator.drops(DecoBlocks.BLACKSTONE_GRINDSTONE));
        
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cobbled_sandstone"),
                BlockLootTableGenerator.drops(DecoBlocks.COBBLED_SANDSTONE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cobbled_red_sandstone"),
                BlockLootTableGenerator.drops(DecoBlocks.COBBLED_RED_SANDSTONE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cobbled_soul_soilstone"),
                BlockLootTableGenerator.drops(DecoBlocks.COBBLED_SOUL_SOILSTONE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/polished_sandstone"),
                BlockLootTableGenerator.drops(DecoBlocks.POLISHED_SANDSTONE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/polished_red_sandstone"),
                BlockLootTableGenerator.drops(DecoBlocks.POLISHED_RED_SANDSTONE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/polished_soul_soilstone"),
                BlockLootTableGenerator.drops(DecoBlocks.POLISHED_SOUL_SOILSTONE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/sandstone_bricks"),
                BlockLootTableGenerator.drops(DecoBlocks.SANDSTONE_BRICKS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/red_sandstone_bricks"),
                BlockLootTableGenerator.drops(DecoBlocks.RED_SANDSTONE_BRICKS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/soul_soilstone_bricks"),
                BlockLootTableGenerator.drops(DecoBlocks.SOUL_SOILSTONE_BRICKS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cobbled_sandstone_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.COBBLED_SANDSTONE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cobbled_sandstone_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.COBBLED_SANDSTONE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cobbled_sandstone_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.COBBLED_SANDSTONE_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cobbled_red_sandstone_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.COBBLED_RED_SANDSTONE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cobbled_red_sandstone_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.COBBLED_RED_SANDSTONE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cobbled_red_sandstone_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.COBBLED_RED_SANDSTONE_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cobbled_soul_soilstone_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.COBBLED_SOUL_SOILSTONE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cobbled_soul_soilstone_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.COBBLED_SOUL_SOILSTONE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cobbled_soul_soilstone_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.COBBLED_SOUL_SOILSTONE_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/polished_sandstone_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.POLISHED_SANDSTONE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/polished_sandstone_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.POLISHED_SANDSTONE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/polished_sandstone_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.POLISHED_SANDSTONE_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/polished_red_sandstone_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.POLISHED_RED_SANDSTONE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/polished_red_sandstone_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.POLISHED_RED_SANDSTONE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/polished_red_sandstone_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.POLISHED_RED_SANDSTONE_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/polished_soul_soilstone_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.POLISHED_SOUL_SOILSTONE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/polished_soul_soilstone_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.POLISHED_SOUL_SOILSTONE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/polished_soul_soilstone_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.POLISHED_SOUL_SOILSTONE_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/sandstone_brick_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.SANDSTONE_BRICK_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/sandstone_brick_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.SANDSTONE_BRICK_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/sandstone_brick_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.SANDSTONE_BRICK_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/red_sandstone_brick_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.RED_SANDSTONE_BRICK_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/red_sandstone_brick_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.RED_SANDSTONE_BRICK_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/red_sandstone_brick_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.RED_SANDSTONE_BRICK_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/soul_soilstone_brick_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.SOUL_SOILSTONE_BRICK_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/soul_soilstone_brick_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.SOUL_SOILSTONE_BRICK_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/soul_soilstone_brick_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.SOUL_SOILSTONE_BRICK_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/fragile_ice"),
                BlockLootTableGenerator.drops(DecoBlocks.FRAGILE_ICE, DecoItems.ICE_SHARD,
                        UniformLootNumberProvider.create(0.0F, 3.0f)));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/bubble_elevator_block_magma"),
                BlockLootTableGenerator.drops(DecoBlocks.BUBBLE_ELEVATOR_BLOCK_BUBBLE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/bubble_elevator_block_bubble"),
                BlockLootTableGenerator.drops(DecoBlocks.BUBBLE_ELEVATOR_BLOCK_BUBBLE));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/chiseled_polished_sandstone"),
                BlockLootTableGenerator.drops(DecoBlocks.CHISELED_POLISHED_SANDSTONE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/chiseled_polished_red_sandstone"),
                BlockLootTableGenerator.drops(DecoBlocks.CHISELED_POLISHED_RED_SANDSTONE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/chiseled_polished_soul_soilstone"),
                BlockLootTableGenerator.drops(DecoBlocks.CHISELED_POLISHED_SOUL_SOILSTONE));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_purpur"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_PURPUR));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_purpur_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_PURPUR_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_purpur_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.CUT_PURPUR_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_purpur_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_PURPUR_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/oak_wood_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.OAK_WOOD_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/oak_wood_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.OAK_WOOD_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/oak_wood_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.OAK_WOOD_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/stripped_oak_wood_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.STRIPPED_OAK_WOOD_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/stripped_oak_wood_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.STRIPPED_OAK_WOOD_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/stripped_oak_wood_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.STRIPPED_OAK_WOOD_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/spruce_wood_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.SPRUCE_WOOD_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/spruce_wood_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.SPRUCE_WOOD_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/spruce_wood_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.SPRUCE_WOOD_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/stripped_spruce_wood_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.STRIPPED_SPRUCE_WOOD_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/stripped_spruce_wood_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.STRIPPED_SPRUCE_WOOD_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/stripped_spruce_wood_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.STRIPPED_SPRUCE_WOOD_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/birch_wood_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.BIRCH_WOOD_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/birch_wood_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.BIRCH_WOOD_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/birch_wood_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.BIRCH_WOOD_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/stripped_birch_wood_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.STRIPPED_BIRCH_WOOD_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/stripped_birch_wood_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.STRIPPED_BIRCH_WOOD_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/stripped_birch_wood_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.STRIPPED_BIRCH_WOOD_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/jungle_wood_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.JUNGLE_WOOD_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/jungle_wood_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.JUNGLE_WOOD_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/jungle_wood_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.JUNGLE_WOOD_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/stripped_jungle_wood_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.STRIPPED_JUNGLE_WOOD_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/stripped_jungle_wood_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.STRIPPED_JUNGLE_WOOD_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/stripped_jungle_wood_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.STRIPPED_JUNGLE_WOOD_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/acacia_wood_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.ACACIA_WOOD_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/acacia_wood_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.ACACIA_WOOD_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/acacia_wood_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.ACACIA_WOOD_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/stripped_acacia_wood_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.STRIPPED_ACACIA_WOOD_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/stripped_acacia_wood_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.STRIPPED_ACACIA_WOOD_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/stripped_acacia_wood_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.STRIPPED_ACACIA_WOOD_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/dark_oak_wood_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.DARK_OAK_WOOD_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/dark_oak_wood_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.DARK_OAK_WOOD_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/dark_oak_wood_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.DARK_OAK_WOOD_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/stripped_dark_oak_wood_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.STRIPPED_DARK_OAK_WOOD_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/stripped_dark_oak_wood_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.STRIPPED_DARK_OAK_WOOD_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/stripped_dark_oak_wood_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.STRIPPED_DARK_OAK_WOOD_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/mangrove_wood_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.MANGROVE_WOOD_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/mangrove_wood_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.MANGROVE_WOOD_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/mangrove_wood_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.MANGROVE_WOOD_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/stripped_mangrove_wood_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.STRIPPED_MANGROVE_WOOD_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/stripped_mangrove_wood_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.STRIPPED_MANGROVE_WOOD_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/stripped_mangrove_wood_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.STRIPPED_MANGROVE_WOOD_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/crimson_hyphae_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.CRIMSON_HYPHAE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/crimson_hyphae_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.CRIMSON_HYPHAE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/crimson_hyphae_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.CRIMSON_HYPHAE_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/stripped_crimson_hyphae_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.STRIPPED_CRIMSON_HYPHAE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/stripped_crimson_hyphae_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.STRIPPED_CRIMSON_HYPHAE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/stripped_crimson_hyphae_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.STRIPPED_CRIMSON_HYPHAE_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/warped_hyphae_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.WARPED_HYPHAE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/warped_hyphae_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.WARPED_HYPHAE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/warped_hyphae_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.WARPED_HYPHAE_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/stripped_warped_hyphae_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.STRIPPED_WARPED_HYPHAE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/stripped_warped_hyphae_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.STRIPPED_WARPED_HYPHAE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/stripped_warped_hyphae_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.STRIPPED_WARPED_HYPHAE_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/wooden_wood_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.WOODEN_WOOD_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/wooden_wood_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.WOODEN_WOOD_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/wooden_wood_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.WOODEN_WOOD_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/stripped_wooden_wood_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.STRIPPED_WOODEN_WOOD_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/stripped_wooden_wood_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.STRIPPED_WOODEN_WOOD_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/stripped_wooden_wood_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.STRIPPED_WOODEN_WOOD_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/packed_netherrack"),
                BlockLootTableGenerator.drops(DecoBlocks.PACKED_NETHERRACK));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/packed_netherrack_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.PACKED_NETHERRACK_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/packed_netherrack_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.PACKED_NETHERRACK_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/packed_netherrack_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.PACKED_NETHERRACK_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/netherrack_bricks"),
                BlockLootTableGenerator.drops(DecoBlocks.NETHERRACK_BRICKS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/netherrack_brick_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.NETHERRACK_BRICK_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/netherrack_brick_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.NETHERRACK_BRICK_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/netherrack_brick_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.NETHERRACK_BRICK_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/chiseled_mud_bricks"),
                BlockLootTableGenerator.drops(DecoBlocks.CHISELED_MUD_BRICKS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/chiseled_netherrack_bricks"),
                BlockLootTableGenerator.drops(DecoBlocks.CHISELED_NETHERRACK_BRICKS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/chiseled_ice_bricks"),
                BlockLootTableGenerator.drops(DecoBlocks.CHISELED_ICE_BRICKS));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/smooth_glowstone"),
                BlockLootTableGenerator.drops(DecoBlocks.SMOOTH_GLOWSTONE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/basalt_bricks"),
                BlockLootTableGenerator.drops(DecoBlocks.BASALT_BRICKS));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/packed_cactus"),
                BlockLootTableGenerator.drops(DecoBlocks.PACKED_CACTUS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/stripped_cactus"),
                BlockLootTableGenerator.drops(DecoBlocks.STRIPPED_CACTUS));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/oak_pallet_door"),
                BlockLootTableGenerator.doorDrops(DecoBlocks.OAK_PALLET_DOOR));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/spruce_pallet_door"),
                BlockLootTableGenerator.doorDrops(DecoBlocks.SPRUCE_PALLET_DOOR));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/birch_pallet_door"),
                BlockLootTableGenerator.doorDrops(DecoBlocks.BIRCH_PALLET_DOOR));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/jungle_pallet_door"),
                BlockLootTableGenerator.doorDrops(DecoBlocks.JUNGLE_PALLET_DOOR));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/acacia_pallet_door"),
                BlockLootTableGenerator.doorDrops(DecoBlocks.ACACIA_PALLET_DOOR));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/dark_oak_pallet_door"),
                BlockLootTableGenerator.doorDrops(DecoBlocks.DARK_OAK_PALLET_DOOR));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/mangrove_pallet_door"),
                BlockLootTableGenerator.doorDrops(DecoBlocks.MANGROVE_PALLET_DOOR));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/crimson_pallet_door"),
                BlockLootTableGenerator.doorDrops(DecoBlocks.CRIMSON_PALLET_DOOR));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/warped_pallet_door"),
                BlockLootTableGenerator.doorDrops(DecoBlocks.WARPED_PALLET_DOOR));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cactus_pallet_door"),
                BlockLootTableGenerator.doorDrops(DecoBlocks.CACTUS_PALLET_DOOR));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/wooden_pallet_door"),
                BlockLootTableGenerator.doorDrops(DecoBlocks.WOODEN_PALLET_DOOR));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/oak_pallet_trapdoor"),
                BlockLootTableGenerator.drops(DecoBlocks.OAK_PALLET_TRAPDOOR));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/spruce_pallet_trapdoor"),
                BlockLootTableGenerator.drops(DecoBlocks.SPRUCE_PALLET_TRAPDOOR));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/birch_pallet_trapdoor"),
                BlockLootTableGenerator.drops(DecoBlocks.BIRCH_PALLET_TRAPDOOR));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/jungle_pallet_trapdoor"),
                BlockLootTableGenerator.drops(DecoBlocks.JUNGLE_PALLET_TRAPDOOR));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/acacia_pallet_trapdoor"),
                BlockLootTableGenerator.drops(DecoBlocks.ACACIA_PALLET_TRAPDOOR));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/dark_oak_pallet_trapdoor"),
                BlockLootTableGenerator.drops(DecoBlocks.DARK_OAK_PALLET_TRAPDOOR));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/mangrove_pallet_trapdoor"),
                BlockLootTableGenerator.drops(DecoBlocks.MANGROVE_PALLET_TRAPDOOR));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/crimson_pallet_trapdoor"),
                BlockLootTableGenerator.drops(DecoBlocks.CRIMSON_PALLET_TRAPDOOR));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/warped_pallet_trapdoor"),
                BlockLootTableGenerator.drops(DecoBlocks.WARPED_PALLET_TRAPDOOR));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cactus_pallet_trapdoor"),
                BlockLootTableGenerator.drops(DecoBlocks.CACTUS_PALLET_TRAPDOOR));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/wooden_pallet_trapdoor"),
                BlockLootTableGenerator.drops(DecoBlocks.WOODEN_PALLET_TRAPDOOR));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/white_lamp"),
                BlockLootTableGenerator.drops(DecoBlocks.WHITE_LAMP, DecoBlocks.SMOOTH_GLOWSTONE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/light_gray_lamp"),
                BlockLootTableGenerator.drops(DecoBlocks.LIGHT_GRAY_LAMP, DecoBlocks.SMOOTH_GLOWSTONE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/gray_lamp"),
                BlockLootTableGenerator.drops(DecoBlocks.GRAY_LAMP, DecoBlocks.SMOOTH_GLOWSTONE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/black_lamp"),
                BlockLootTableGenerator.drops(DecoBlocks.BLACK_LAMP, DecoBlocks.SMOOTH_GLOWSTONE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/brown_lamp"),
                BlockLootTableGenerator.drops(DecoBlocks.BROWN_LAMP, DecoBlocks.SMOOTH_GLOWSTONE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/red_lamp"),
                BlockLootTableGenerator.drops(DecoBlocks.RED_LAMP, DecoBlocks.SMOOTH_GLOWSTONE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/orange_lamp"),
                BlockLootTableGenerator.drops(DecoBlocks.ORANGE_LAMP, DecoBlocks.SMOOTH_GLOWSTONE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/yellow_lamp"),
                BlockLootTableGenerator.drops(DecoBlocks.YELLOW_LAMP, DecoBlocks.SMOOTH_GLOWSTONE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/lime_lamp"),
                BlockLootTableGenerator.drops(DecoBlocks.LIME_LAMP, DecoBlocks.SMOOTH_GLOWSTONE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/green_lamp"),
                BlockLootTableGenerator.drops(DecoBlocks.GREEN_LAMP, DecoBlocks.SMOOTH_GLOWSTONE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cyan_lamp"),
                BlockLootTableGenerator.drops(DecoBlocks.CYAN_LAMP, DecoBlocks.SMOOTH_GLOWSTONE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/light_blue_lamp"),
                BlockLootTableGenerator.drops(DecoBlocks.LIGHT_BLUE_LAMP, DecoBlocks.SMOOTH_GLOWSTONE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/blue_lamp"),
                BlockLootTableGenerator.drops(DecoBlocks.BLUE_LAMP, DecoBlocks.SMOOTH_GLOWSTONE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/purple_lamp"),
                BlockLootTableGenerator.drops(DecoBlocks.PURPLE_LAMP, DecoBlocks.SMOOTH_GLOWSTONE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/magenta_lamp"),
                BlockLootTableGenerator.drops(DecoBlocks.MAGENTA_LAMP, DecoBlocks.SMOOTH_GLOWSTONE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/pink_lamp"),
                BlockLootTableGenerator.drops(DecoBlocks.PINK_LAMP, DecoBlocks.SMOOTH_GLOWSTONE));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/mushroom_planks"),
                BlockLootTableGenerator.drops(DecoBlocks.MUSHROOM_PLANKS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/mushroom_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.MUSHROOM_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/mushroom_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.MUSHROOM_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/mushroom_fence"),
                BlockLootTableGenerator.drops(DecoBlocks.MUSHROOM_FENCE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/mushroom_fence_gate"),
                BlockLootTableGenerator.drops(DecoBlocks.MUSHROOM_FENCE_GATE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/mushroom_pressure_plate"),
                BlockLootTableGenerator.drops(DecoBlocks.MUSHROOM_PRESSURE_PLATE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/mushroom_button"),
                BlockLootTableGenerator.drops(DecoBlocks.MUSHROOM_BUTTON));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/mushroom_door"),
                BlockLootTableGenerator.doorDrops(DecoBlocks.MUSHROOM_DOOR));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/mushroom_trapdoor"),
                BlockLootTableGenerator.drops(DecoBlocks.MUSHROOM_TRAPDOOR));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/mushroom_pallet_door"),
                BlockLootTableGenerator.doorDrops(DecoBlocks.MUSHROOM_PALLET_DOOR));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/mushroom_pallet_trapdoor"),
                BlockLootTableGenerator.drops(DecoBlocks.MUSHROOM_PALLET_TRAPDOOR));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/standing_mushroom_sign"),
                BlockLootTableGenerator.drops(DecoItems.MUSHROOM_SIGN));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/wall_mushroom_sign"),
                BlockLootTableGenerator.drops(DecoItems.MUSHROOM_SIGN));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/mushroom_note_block"),
                BlockLootTableGenerator.drops(DecoBlocks.MUSHROOM_NOTE_BLOCK));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/oak_note_block"),
                BlockLootTableGenerator.drops(DecoBlocks.OAK_NOTE_BLOCK));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/spruce_note_block"),
                BlockLootTableGenerator.drops(DecoBlocks.SPRUCE_NOTE_BLOCK));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/birch_note_block"),
                BlockLootTableGenerator.drops(DecoBlocks.BIRCH_NOTE_BLOCK));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/jungle_note_block"),
                BlockLootTableGenerator.drops(DecoBlocks.JUNGLE_NOTE_BLOCK));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/dark_oak_note_block"),
                BlockLootTableGenerator.drops(DecoBlocks.DARK_OAK_NOTE_BLOCK));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/acaica_note_block"),
                BlockLootTableGenerator.drops(DecoBlocks.ACACIA_NOTE_BLOCK));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/mangrove_note_block"),
                BlockLootTableGenerator.drops(DecoBlocks.MANGROVE_NOTE_BLOCK));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/crimson_note_block"),
                BlockLootTableGenerator.drops(DecoBlocks.CRIMSON_NOTE_BLOCK));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/warped_note_block"),
                BlockLootTableGenerator.drops(DecoBlocks.WARPED_NOTE_BLOCK));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cactus_note_block"),
                BlockLootTableGenerator.drops(DecoBlocks.CACTUS_NOTE_BLOCK));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/polished_calcite"),
                BlockLootTableGenerator.drops(DecoBlocks.POLISHED_CALCITE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_calcite"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_CALCITE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/calcite_bricks"),
                BlockLootTableGenerator.drops(DecoBlocks.CALCITE_BRICKS));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_andesite"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_ANDESITE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/andesite_bricks"),
                BlockLootTableGenerator.drops(DecoBlocks.ANDESITE_BRICKS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_granite"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_GRANITE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/granite_bricks"),
                BlockLootTableGenerator.drops(DecoBlocks.GRANITE_BRICKS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_diorite"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_DIORITE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/diorite_bricks"),
                BlockLootTableGenerator.drops(DecoBlocks.DIORITE_BRICKS));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/polished_calcite_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.POLISHED_CALCITE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_calcite_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_CALCITE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/calcite_brick_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.CALCITE_BRICK_STAIRS));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_andesite_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_ANDESITE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/andesite_brick_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.ANDESITE_BRICK_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_granite_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_GRANITE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/granite_brick_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.GRANITE_BRICK_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_diorite_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_DIORITE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/diorite_brick_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.DIORITE_BRICK_STAIRS));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/polished_calcite_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.POLISHED_CALCITE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_calcite_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.CUT_CALCITE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/calcite_brick_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.CALCITE_BRICK_SLAB));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_andesite_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.CUT_ANDESITE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/andesite_brick_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.ANDESITE_BRICK_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_granite_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.CUT_GRANITE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/granite_brick_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.GRANITE_BRICK_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_diorite_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.CUT_DIORITE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/diorite_brick_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.DIORITE_BRICK_SLAB));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/polished_calcite_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.POLISHED_CALCITE_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_calcite_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_CALCITE_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/calcite_brick_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.CALCITE_BRICK_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_andesite_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_ANDESITE_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/andesite_brick_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.ANDESITE_BRICK_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_granite_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_GRANITE_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/granite_brick_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.GRANITE_BRICK_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_diorite_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_DIORITE_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/diorite_brick_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.DIORITE_BRICK_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_gold"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_GOLD));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_gold_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_GOLD_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_gold_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.CUT_GOLD_SLAB));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/iron_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.IRON_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/iron_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.IRON_SLAB));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/gold_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.GOLD_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/gold_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.GOLD_SLAB));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/copper_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.COPPER_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/copper_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.COPPER_SLAB));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/exposed_copper_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.EXPOSED_COPPER_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/exposed_copper_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.EXPOSED_COPPER_SLAB));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/weathered_copper_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.WEATHERED_COPPER_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/weathered_copper_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.WEATHERED_COPPER_SLAB));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/oxidized_copper_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.OXIDIZED_COPPER_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/oxidized_copper_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.OXIDIZED_COPPER_SLAB));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/waxed_copper_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.WAXED_COPPER_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/waxed_copper_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.WAXED_COPPER_SLAB));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/waxed_exposed_copper_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.WAXED_EXPOSED_COPPER_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/waxed_exposed_copper_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.WAXED_EXPOSED_COPPER_SLAB));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/waxed_weathered_copper_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.WAXED_WEATHERED_COPPER_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/waxed_weathered_copper_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.WAXED_WEATHERED_COPPER_SLAB));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/waxed_oxidized_copper_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.WAXED_OXIDIZED_COPPER_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/waxed_oxidized_copper_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.WAXED_OXIDIZED_COPPER_SLAB));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/raw_iron_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.RAW_IRON_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/raw_iron_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.RAW_IRON_SLAB));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/raw_gold_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.RAW_GOLD_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/raw_gold_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.RAW_GOLD_SLAB));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/raw_copper_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.RAW_COPPER_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/raw_copper_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.RAW_COPPER_SLAB));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/deepslate_lever"),
                BlockLootTableGenerator.drops(DecoBlocks.DEEPSLATE_LEVER));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cobbled_deepslate_lever"),
                BlockLootTableGenerator.drops(DecoBlocks.COBBLED_DEEPSLATE_LEVER));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/polished_deepslate_lever"),
                BlockLootTableGenerator.drops(DecoBlocks.POLISHED_DEEPSLATE_LEVER));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/stone_lever"),
                BlockLootTableGenerator.drops(DecoBlocks.STONE_LEVER));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/polished_stone_lever"),
                BlockLootTableGenerator.drops(DecoBlocks.POLISHED_STONE_LEVER));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/blackstone_lever"),
                BlockLootTableGenerator.drops(DecoBlocks.BLACKSTONE_LEVER));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/polished_blackstone_lever"),
                BlockLootTableGenerator.drops(DecoBlocks.POLISHED_BLACKSTONE_LEVER));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/light_gold_bars"),
                BlockLootTableGenerator.drops(DecoBlocks.LIGHT_GOLD_BARS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/gold_bars"),
                BlockLootTableGenerator.drops(DecoBlocks.GOLD_BARS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/heavy_gold_bars"),
                BlockLootTableGenerator.drops(DecoBlocks.HEAVY_GOLD_BARS));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/sanded_obsidian"),
                BlockLootTableGenerator.drops(DecoBlocks.SANDED_OBSIDIAN));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/sanded_obsidian_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.SANDED_OBSIDIAN_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/sanded_obsidian_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.SANDED_OBSIDIAN_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/sanded_obsidian_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.SANDED_OBSIDIAN_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/smooth_obsidian"),
                BlockLootTableGenerator.drops(DecoBlocks.SMOOTH_OBSIDIAN));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/smooth_obsidian_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.SMOOTH_OBSIDIAN_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/smooth_obsidian_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.SMOOTH_OBSIDIAN_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/smooth_obsidian_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.SMOOTH_OBSIDIAN_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_obsidian"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_OBSIDIAN));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_obsidian_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_OBSIDIAN_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_obsidian_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.CUT_OBSIDIAN_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_obsidian_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_OBSIDIAN_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/chiseled_magma_block"),
                BlockLootTableGenerator.drops(DecoBlocks.CHISELED_MAGMA_BLOCK));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/chiseled_bubble_block"),
                BlockLootTableGenerator.drops(DecoBlocks.CHISELED_BUBBLE_BLOCK));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/butter_cup"),
                BlockLootTableGenerator.drops(DecoBlocks.BUTTERCUP));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/potted_butter_cup"),
                BlockLootTableGenerator.pottedPlantDrops(DecoBlocks.POTTED_BUTTERCUP));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/nightshade"),
                BlockLootTableGenerator.drops(DecoBlocks.NIGHTSHADE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/potted_nightshade"),
                BlockLootTableGenerator.pottedPlantDrops(DecoBlocks.POTTED_NIGHTSHADE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/endershade"),
                BlockLootTableGenerator.drops(DecoBlocks.ENDERSHADE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/potted_endershade"),
                BlockLootTableGenerator.pottedPlantDrops(DecoBlocks.POTTED_ENDERSHADE));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/polished_end_stone"),
                BlockLootTableGenerator.drops(DecoBlocks.POLISHED_END_STONE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/smooth_end_stone"),
                BlockLootTableGenerator.drops(DecoBlocks.SMOOTH_END_STONE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/end_stone_tiles"),
                BlockLootTableGenerator.drops(DecoBlocks.END_STONE_TILES));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cracked_end_stone_tiles"),
                BlockLootTableGenerator.drops(DecoBlocks.CRACKED_END_STONE_TILES));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cracked_end_stone_bricks"),
                BlockLootTableGenerator.drops(DecoBlocks.CRACKED_END_STONE_BRICKS));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/polished_end_stone_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.POLISHED_END_STONE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/smooth_end_stone_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.SMOOTH_END_STONE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/end_stone_tile_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.END_STONE_TILE_STAIRS));


        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/polished_end_stone_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.POLISHED_END_STONE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/smooth_end_stone_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.SMOOTH_END_STONE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/end_stone_tile_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.END_STONE_TILE_SLAB));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/polished_end_stone_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.POLISHED_END_STONE_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/smooth_end_stone_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.SMOOTH_END_STONE_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/end_stone_tile_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.END_STONE_TILE_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/end_stone_pressure_plate"),
                BlockLootTableGenerator.drops(DecoBlocks.END_STONE_PRESSURE_PLATE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/end_stone_button"),
                BlockLootTableGenerator.drops(DecoBlocks.END_STONE_BUTTON));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/end_stone_lever"),
                BlockLootTableGenerator.drops(DecoBlocks.END_STONE_LEVER));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/polished_end_stone_pressure_plate"),
                BlockLootTableGenerator.drops(DecoBlocks.POLISHED_END_STONE_PRESSURE_PLATE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/polished_end_stone_button"),
                BlockLootTableGenerator.drops(DecoBlocks.POLISHED_END_STONE_BUTTON));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/polished_end_stone_lever"),
                BlockLootTableGenerator.drops(DecoBlocks.POLISHED_END_STONE_LEVER));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/end_stone_furnace"),
                BlockLootTableGenerator.drops(DecoBlocks.END_STONE_FURNACE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/end_stone_blast_furnace"),
                BlockLootTableGenerator.drops(DecoBlocks.END_STONE_BLAST_FURNACE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/end_stone_smoker"),
                BlockLootTableGenerator.drops(DecoBlocks.END_STONE_SMOKER));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/end_stone_stonecutter"),
                BlockLootTableGenerator.drops(DecoBlocks.END_STONE_STONECUTTER));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/end_stone_grindstone"),
                BlockLootTableGenerator.drops(DecoBlocks.END_STONE_GRINDSTONE));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/packed_grass"),
                BlockLootTableGenerator.drops(DecoBlocks.PACKED_GRASS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/packed_mycelium"),
                BlockLootTableGenerator.drops(DecoBlocks.PACKED_MYCELIUM));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/packed_podzol"),
                BlockLootTableGenerator.drops(DecoBlocks.PACKED_PODZOL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/packed_crimson_nylium"),
                BlockLootTableGenerator.drops(DecoBlocks.PACKED_CRIMSON_NYLIUM));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/packed_warped_nylium"),
                BlockLootTableGenerator.drops(DecoBlocks.PACKED_WARPED_NYLIUM));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/grass_carpet"),
                BlockLootTableGenerator.drops(DecoBlocks.GRASS_CARPET));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/mycelium_carpet"),
                BlockLootTableGenerator.drops(DecoBlocks.MYCELIUM_CARPET));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/podzol_carpet"),
                BlockLootTableGenerator.drops(DecoBlocks.PODZOL_CARPET));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/crimson_nylium_carpet"),
                BlockLootTableGenerator.drops(DecoBlocks.CRIMSON_NYLIUM_CARPET));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/warped_nylium_carpet"),
                BlockLootTableGenerator.drops(DecoBlocks.WARPED_NYLIUM_CARPET));
        
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/bedrock_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.BEDROCK_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/grass_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.GRASS_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/podzol_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.PODZOL_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/mycelium_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.MYCELIUM_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/crimson_nylium_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.CRIMSON_NYLIUM_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/warped_nylium_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.WARPED_NYLIUM_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/dirt_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.DIRT_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/coarse_dirt_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.COARSE_DIRT_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/rooted_dirt_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.ROOTED_DIRT_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/mud_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.MUD_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/clay_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.CLAY_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/bone_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.BONE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/moss_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.MOSS_STAIRS));
                
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/bedrock_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.BEDROCK_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/grass_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.GRASS_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/podzol_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.PODZOL_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/mycelium_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.MYCELIUM_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/crimson_nylium_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.CRIMSON_NYLIUM_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/warped_nylium_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.WARPED_NYLIUM_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/moss_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.MOSS_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/dirt_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.DIRT_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/coarse_dirt_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.COARSE_DIRT_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/rooted_dirt_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.ROOTED_DIRT_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/mud_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.MUD_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/clay_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.CLAY_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/bone_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.BONE_SLAB));
        
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/bedrock_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.BEDROCK_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/dirt_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.DIRT_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/coarse_dirt_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.COARSE_DIRT_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/rooted_dirt_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.ROOTED_DIRT_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/mud_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.MUD_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/clay_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.CLAY_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/bone_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.BONE_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cloud_block"),
                BlockLootTableGenerator.drops(DecoBlocks.CLOUD_BLOCK));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/solid_cloud"),
                BlockLootTableGenerator.drops(DecoBlocks.SOLID_CLOUD));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cloud_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.CLOUD_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cloud_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.CLOUD_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cloud_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.CLOUD_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cloud_bricks"),
                BlockLootTableGenerator.drops(DecoBlocks.CLOUD_BRICKS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cloud_brick_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.CLOUD_BRICK_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cloud_brick_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.CLOUD_BRICK_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cloud_brick_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.CLOUD_BRICK_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/chiseled_cloud_bricks"),
                BlockLootTableGenerator.drops(DecoBlocks.CHISELED_CLOUD_BRICKS));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/iron_ladder"),
                BlockLootTableGenerator.drops(DecoBlocks.IRON_LADDER));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/golden_ladder"),
                BlockLootTableGenerator.drops(DecoBlocks.GOLDEN_LADDER));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/copper_ladder"),
                BlockLootTableGenerator.drops(DecoBlocks.COPPER_LADDER));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/waxed_copper_ladder"),
                BlockLootTableGenerator.drops(DecoBlocks.WAXED_COPPER_LADDER));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/exposed_copper_ladder"),
                BlockLootTableGenerator.drops(DecoBlocks.EXPOSED_COPPER_LADDER));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/waxed_exposed_copper_ladder"),
                BlockLootTableGenerator.drops(DecoBlocks.WAXED_EXPOSED_COPPER_LADDER));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/weathered_copper_ladder"),
                BlockLootTableGenerator.drops(DecoBlocks.WEATHERED_COPPER_LADDER));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/waxed_weathered_copper_ladder"),
                BlockLootTableGenerator.drops(DecoBlocks.WAXED_WEATHERED_COPPER_LADDER));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/oxidized_copper_ladder"),
                BlockLootTableGenerator.drops(DecoBlocks.OXIDIZED_COPPER_LADDER));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/waxed_oxidized_copper_ladder"),
                BlockLootTableGenerator.drops(DecoBlocks.WAXED_OXIDIZED_COPPER_LADDER));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/alpine_poppy"),
                BlockLootTableGenerator.drops(DecoBlocks.ALPINE_POPPY));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/potted_alpine_poppy"),
                BlockLootTableGenerator.pottedPlantDrops(DecoBlocks.POTTED_ALPINE_POPPY));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/dead_eye_daisy"),
                BlockLootTableGenerator.drops(DecoBlocks.DEAD_EYE_DAISY));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/potted_dead_eye_daisy"),
                BlockLootTableGenerator.pottedPlantDrops(DecoBlocks.POTTED_DEAD_EYE_DAISY));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/popped_bluet"),
                BlockLootTableGenerator.drops(DecoBlocks.POPPED_BLUET));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/potted_popped_bluet"),
                BlockLootTableGenerator.pottedPlantDrops(DecoBlocks.POTTED_POPPED_BLUET));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/white_wool_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.WHITE_WOOL_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/white_wool_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.WHITE_WOOL_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/light_gray_wool_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.LIGHT_GRAY_WOOL_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/light_gray_wool_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.LIGHT_GRAY_WOOL_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/gray_wool_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.GRAY_WOOL_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/gray_wool_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.GRAY_WOOL_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/black_wool_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.BLACK_WOOL_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/black_wool_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.BLACK_WOOL_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/brown_wool_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.BROWN_WOOL_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/brown_wool_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.BROWN_WOOL_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/red_wool_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.RED_WOOL_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/red_wool_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.RED_WOOL_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/orange_wool_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.ORANGE_WOOL_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/orange_wool_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.ORANGE_WOOL_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/yellow_wool_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.YELLOW_WOOL_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/yellow_wool_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.YELLOW_WOOL_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/lime_wool_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.LIME_WOOL_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/lime_wool_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.LIME_WOOL_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/green_wool_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.GREEN_WOOL_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/green_wool_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.GREEN_WOOL_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cyan_wool_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.CYAN_WOOL_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cyan_wool_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.CYAN_WOOL_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/light_blue_wool_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.LIGHT_BLUE_WOOL_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/light_blue_wool_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.LIGHT_BLUE_WOOL_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/blue_wool_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.BLUE_WOOL_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/blue_wool_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.BLUE_WOOL_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/purple_wool_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.PURPLE_WOOL_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/purple_wool_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.PURPLE_WOOL_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/magenta_wool_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.MAGENTA_WOOL_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/magenta_wool_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.MAGENTA_WOOL_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/pink_wool_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.PINK_WOOL_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/pink_wool_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.PINK_WOOL_SLAB));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cracked_stone_brick_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.CRACKED_STONE_BRICK_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cracked_stone_brick_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.CRACKED_STONE_BRICK_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cracked_stone_brick_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.CRACKED_STONE_BRICK_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cracked_stone_tile_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.CRACKED_STONE_TILE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cracked_stone_tile_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.CRACKED_STONE_TILE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cracked_stone_tile_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.CRACKED_STONE_TILE_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cracked_deepslate_brick_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cracked_deepslate_brick_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.CRACKED_DEEPSLATE_BRICK_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cracked_deepslate_brick_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.CRACKED_DEEPSLATE_BRICK_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cracked_deepslate_tile_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.CRACKED_DEEPSLATE_TILE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cracked_deepslate_tile_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.CRACKED_DEEPSLATE_TILE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cracked_deepslate_tile_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.CRACKED_DEEPSLATE_TILE_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cracked_end_stone_brick_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.CRACKED_END_STONE_BRICK_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cracked_end_stone_brick_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.CRACKED_END_STONE_BRICK_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cracked_end_stone_brick_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.CRACKED_END_STONE_BRICK_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cracked_end_stone_tile_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.CRACKED_END_STONE_TILE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cracked_end_stone_tile_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.CRACKED_END_STONE_TILE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cracked_end_stone_tile_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.CRACKED_END_STONE_TILE_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cracked_polished_blackstone_brick_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cracked_polished_blackstone_brick_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cracked_polished_blackstone_brick_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cracked_polished_blackstone_tile_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cracked_polished_blackstone_tile_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cracked_polished_blackstone_tile_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILE_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cracked_nether_brick_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.CRACKED_NETHER_BRICK_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cracked_nether_brick_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.CRACKED_NETHER_BRICK_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cracked_nether_brick_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.CRACKED_NETHER_BRICK_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cracked_red_nether_brick_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.CRACKED_RED_NETHER_BRICK_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cracked_red_nether_brick_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.CRACKED_RED_NETHER_BRICK_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cracked_red_nether_brick_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.CRACKED_RED_NETHER_BRICK_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cracked_blue_nether_brick_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.CRACKED_BLUE_NETHER_BRICK_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cracked_blue_nether_brick_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.CRACKED_BLUE_NETHER_BRICK_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cracked_blue_nether_brick_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.CRACKED_BLUE_NETHER_BRICK_WALL));
        
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cracked_nether_brick_fence"),
                BlockLootTableGenerator.drops(DecoBlocks.CRACKED_NETHER_BRICK_FENCE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cracked_red_nether_brick_fence"),
                BlockLootTableGenerator.drops(DecoBlocks.CRACKED_RED_NETHER_BRICK_FENCE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cracked_blue_nether_brick_fence"),
                BlockLootTableGenerator.drops(DecoBlocks.CRACKED_BLUE_NETHER_BRICK_FENCE));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cracked_nether_brick_fence_gate"),
                BlockLootTableGenerator.drops(DecoBlocks.CRACKED_NETHER_BRICK_FENCE_GATE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cracked_red_nether_brick_fence_gate"),
                BlockLootTableGenerator.drops(DecoBlocks.CRACKED_RED_NETHER_BRICK_FENCE_GATE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cracked_blue_nether_brick_fence_gate"),
                BlockLootTableGenerator.drops(DecoBlocks.CRACKED_BLUE_NETHER_BRICK_FENCE_GATE));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/mossy_deepslate_bricks"),
                BlockLootTableGenerator.drops(DecoBlocks.MOSSY_DEEPSLATE_BRICKS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/mossy_deepslate_brick_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.MOSSY_DEEPSLATE_BRICK_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/mossy_deepslate_brick_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.MOSSY_DEEPSLATE_BRICK_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/mossy_deepslate_brick_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.MOSSY_DEEPSLATE_BRICK_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/mossy_polished_blackstone_bricks"),
                BlockLootTableGenerator.drops(DecoBlocks.MOSSY_POLISHED_BLACKSTONE_BRICKS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/mossy_polished_blackstone_brick_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.MOSSY_POLISHED_BLACKSTONE_BRICK_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/mossy_polished_blackstone_brick_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.MOSSY_POLISHED_BLACKSTONE_BRICK_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/mossy_polished_blackstone_brick_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.MOSSY_POLISHED_BLACKSTONE_BRICK_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/mossy_end_stone_bricks"),
                BlockLootTableGenerator.drops(DecoBlocks.MOSSY_END_STONE_BRICKS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/mossy_end_stone_brick_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.MOSSY_END_STONE_BRICK_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/mossy_end_stone_brick_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.MOSSY_END_STONE_BRICK_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/mossy_end_stone_brick_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.MOSSY_END_STONE_BRICK_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/lapis_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.LAPIS_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/lapis_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.LAPIS_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/lapis_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.LAPIS_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/lapis_bricks"),
                BlockLootTableGenerator.drops(DecoBlocks.LAPIS_BRICKS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/lapis_brick_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.LAPIS_BRICK_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/lapis_brick_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.LAPIS_BRICK_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/lapis_brick_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.LAPIS_BRICK_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_lapis"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_LAPIS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_lapis_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_LAPIS_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_lapis_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.CUT_LAPIS_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cut_lapis_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.CUT_LAPIS_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/smooth_lapis"),
                BlockLootTableGenerator.drops(DecoBlocks.SMOOTH_LAPIS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/smooth_lapis_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.SMOOTH_LAPIS_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/smooth_lapis_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.SMOOTH_LAPIS_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/smooth_lapis_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.SMOOTH_LAPIS_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/chiseled_lapis"),
                BlockLootTableGenerator.drops(DecoBlocks.CHISELED_LAPIS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/lapis_pillar"),
                BlockLootTableGenerator.drops(DecoBlocks.LAPIS_PILLAR));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/duel_cut_light_gray_concrete"),
                BlockLootTableGenerator.drops(DecoBlocks.DUEL_CUT_LIGHT_GRAY_CONCRETE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/duel_cut_gray_concrete"),
                BlockLootTableGenerator.drops(DecoBlocks.DUEL_CUT_GRAY_CONCRETE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/duel_cut_black_concrete"),
                BlockLootTableGenerator.drops(DecoBlocks.DUEL_CUT_BLACK_CONCRETE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/duel_cut_brown_concrete"),
                BlockLootTableGenerator.drops(DecoBlocks.DUEL_CUT_BROWN_CONCRETE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/duel_cut_red_concrete"),
                BlockLootTableGenerator.drops(DecoBlocks.DUEL_CUT_RED_CONCRETE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/duel_cut_yellow_concrete"),
                BlockLootTableGenerator.drops(DecoBlocks.DUEL_CUT_YELLOW_CONCRETE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/duel_cut_orange_concrete"),
                BlockLootTableGenerator.drops(DecoBlocks.DUEL_CUT_ORANGE_CONCRETE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/duel_cut_lime_concrete"),
                BlockLootTableGenerator.drops(DecoBlocks.DUEL_CUT_LIME_CONCRETE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/duel_cut_green_concrete"),
                BlockLootTableGenerator.drops(DecoBlocks.DUEL_CUT_GREEN_CONCRETE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/duel_cut_cyan_concrete"),
                BlockLootTableGenerator.drops(DecoBlocks.DUEL_CUT_CYAN_CONCRETE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/duel_cut_light_blue_concrete"),
                BlockLootTableGenerator.drops(DecoBlocks.DUEL_CUT_LIGHT_BLUE_CONCRETE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/duel_cut_blue_concrete"),
                BlockLootTableGenerator.drops(DecoBlocks.DUEL_CUT_BLUE_CONCRETE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/duel_cut_purple_concrete"),
                BlockLootTableGenerator.drops(DecoBlocks.DUEL_CUT_PURPLE_CONCRETE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/duel_cut_magenta_concrete"),
                BlockLootTableGenerator.drops(DecoBlocks.DUEL_CUT_MAGENTA_CONCRETE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/duel_cut_pink_concrete"),
                BlockLootTableGenerator.drops(DecoBlocks.DUEL_CUT_PINK_CONCRETE));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/duel_cut_light_gray_concrete_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.DUEL_CUT_LIGHT_GRAY_CONCRETE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/duel_cut_light_gray_concrete_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.DUEL_CUT_LIGHT_GRAY_CONCRETE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/duel_cut_light_gray_concrete_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.DUEL_CUT_LIGHT_GRAY_CONCRETE_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/duel_cut_gray_concrete_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.DUEL_CUT_GRAY_CONCRETE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/duel_cut_gray_concrete_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.DUEL_CUT_GRAY_CONCRETE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/duel_cut_gray_concrete_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.DUEL_CUT_GRAY_CONCRETE_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/duel_cut_black_concrete_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.DUEL_CUT_BLACK_CONCRETE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/duel_cut_black_concrete_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.DUEL_CUT_BLACK_CONCRETE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/duel_cut_black_concrete_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.DUEL_CUT_BLACK_CONCRETE_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/duel_cut_brown_concrete_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.DUEL_CUT_BROWN_CONCRETE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/duel_cut_brown_concrete_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.DUEL_CUT_BROWN_CONCRETE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/duel_cut_brown_concrete_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.DUEL_CUT_BROWN_CONCRETE_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/duel_cut_red_concrete_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.DUEL_CUT_RED_CONCRETE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/duel_cut_red_concrete_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.DUEL_CUT_RED_CONCRETE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/duel_cut_red_concrete_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.DUEL_CUT_RED_CONCRETE_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/duel_cut_orange_concrete_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.DUEL_CUT_ORANGE_CONCRETE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/duel_cut_orange_concrete_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.DUEL_CUT_ORANGE_CONCRETE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/duel_cut_orange_concrete_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.DUEL_CUT_ORANGE_CONCRETE_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/duel_cut_yellow_concrete_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.DUEL_CUT_YELLOW_CONCRETE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/duel_cut_yellow_concrete_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.DUEL_CUT_YELLOW_CONCRETE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/duel_cut_yellow_concrete_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.DUEL_CUT_YELLOW_CONCRETE_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/duel_cut_lime_concrete_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.DUEL_CUT_LIME_CONCRETE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/duel_cut_lime_concrete_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.DUEL_CUT_LIME_CONCRETE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/duel_cut_lime_concrete_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.DUEL_CUT_LIME_CONCRETE_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/duel_cut_green_concrete_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.DUEL_CUT_GREEN_CONCRETE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/duel_cut_green_concrete_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.DUEL_CUT_GREEN_CONCRETE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/duel_cut_green_concrete_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.DUEL_CUT_GREEN_CONCRETE_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/duel_cut_cyan_concrete_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.DUEL_CUT_CYAN_CONCRETE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/duel_cut_cyan_concrete_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.DUEL_CUT_CYAN_CONCRETE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/duel_cut_cyan_concrete_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.DUEL_CUT_CYAN_CONCRETE_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/duel_cut_light_blue_concrete_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.DUEL_CUT_LIGHT_BLUE_CONCRETE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/duel_cut_light_blue_concrete_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.DUEL_CUT_LIGHT_BLUE_CONCRETE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/duel_cut_light_blue_concrete_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.DUEL_CUT_LIGHT_BLUE_CONCRETE_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/duel_cut_blue_concrete_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.DUEL_CUT_BLUE_CONCRETE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/duel_cut_blue_concrete_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.DUEL_CUT_BLUE_CONCRETE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/duel_cut_blue_concrete_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.DUEL_CUT_BLUE_CONCRETE_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/duel_cut_purple_concrete_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.DUEL_CUT_PURPLE_CONCRETE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/duel_cut_purple_concrete_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.DUEL_CUT_PURPLE_CONCRETE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/duel_cut_purple_concrete_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.DUEL_CUT_PURPLE_CONCRETE_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/duel_cut_magenta_concrete_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.DUEL_CUT_MAGENTA_CONCRETE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/duel_cut_magenta_concrete_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.DUEL_CUT_MAGENTA_CONCRETE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/duel_cut_magenta_concrete_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.DUEL_CUT_MAGENTA_CONCRETE_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/duel_cut_pink_concrete_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.DUEL_CUT_PINK_CONCRETE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/duel_cut_pink_concrete_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.DUEL_CUT_PINK_CONCRETE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/duel_cut_pink_concrete_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.DUEL_CUT_PINK_CONCRETE_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/checkered_light_gray_concrete"),
                BlockLootTableGenerator.drops(DecoBlocks.CHECKERED_LIGHT_GRAY_CONCRETE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/checkered_gray_concrete"),
                BlockLootTableGenerator.drops(DecoBlocks.CHECKERED_GRAY_CONCRETE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/checkered_black_concrete"),
                BlockLootTableGenerator.drops(DecoBlocks.CHECKERED_BLACK_CONCRETE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/checkered_brown_concrete"),
                BlockLootTableGenerator.drops(DecoBlocks.CHECKERED_BROWN_CONCRETE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/checkered_red_concrete"),
                BlockLootTableGenerator.drops(DecoBlocks.CHECKERED_RED_CONCRETE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/checkered_yellow_concrete"),
                BlockLootTableGenerator.drops(DecoBlocks.CHECKERED_YELLOW_CONCRETE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/checkered_orange_concrete"),
                BlockLootTableGenerator.drops(DecoBlocks.CHECKERED_ORANGE_CONCRETE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/checkered_lime_concrete"),
                BlockLootTableGenerator.drops(DecoBlocks.CHECKERED_LIME_CONCRETE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/checkered_green_concrete"),
                BlockLootTableGenerator.drops(DecoBlocks.CHECKERED_GREEN_CONCRETE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/checkered_cyan_concrete"),
                BlockLootTableGenerator.drops(DecoBlocks.CHECKERED_CYAN_CONCRETE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/checkered_light_blue_concrete"),
                BlockLootTableGenerator.drops(DecoBlocks.CHECKERED_LIGHT_BLUE_CONCRETE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/checkered_blue_concrete"),
                BlockLootTableGenerator.drops(DecoBlocks.CHECKERED_BLUE_CONCRETE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/checkered_purple_concrete"),
                BlockLootTableGenerator.drops(DecoBlocks.CHECKERED_PURPLE_CONCRETE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/checkered_magenta_concrete"),
                BlockLootTableGenerator.drops(DecoBlocks.CHECKERED_MAGENTA_CONCRETE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/checkered_pink_concrete"),
                BlockLootTableGenerator.drops(DecoBlocks.CHECKERED_PINK_CONCRETE));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/checkered_light_gray_concrete_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.CHECKERED_LIGHT_GRAY_CONCRETE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/checkered_light_gray_concrete_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.CHECKERED_LIGHT_GRAY_CONCRETE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/checkered_light_gray_concrete_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.CHECKERED_LIGHT_GRAY_CONCRETE_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/checkered_gray_concrete_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.CHECKERED_GRAY_CONCRETE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/checkered_gray_concrete_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.CHECKERED_GRAY_CONCRETE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/checkered_gray_concrete_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.CHECKERED_GRAY_CONCRETE_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/checkered_black_concrete_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.CHECKERED_BLACK_CONCRETE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/checkered_black_concrete_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.CHECKERED_BLACK_CONCRETE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/checkered_black_concrete_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.CHECKERED_BLACK_CONCRETE_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/checkered_brown_concrete_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.CHECKERED_BROWN_CONCRETE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/checkered_brown_concrete_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.CHECKERED_BROWN_CONCRETE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/checkered_brown_concrete_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.CHECKERED_BROWN_CONCRETE_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/checkered_red_concrete_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.CHECKERED_RED_CONCRETE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/checkered_red_concrete_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.CHECKERED_RED_CONCRETE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/checkered_red_concrete_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.CHECKERED_RED_CONCRETE_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/checkered_orange_concrete_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.CHECKERED_ORANGE_CONCRETE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/checkered_orange_concrete_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.CHECKERED_ORANGE_CONCRETE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/checkered_orange_concrete_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.CHECKERED_ORANGE_CONCRETE_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/checkered_yellow_concrete_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.CHECKERED_YELLOW_CONCRETE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/checkered_yellow_concrete_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.CHECKERED_YELLOW_CONCRETE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/checkered_yellow_concrete_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.CHECKERED_YELLOW_CONCRETE_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/checkered_lime_concrete_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.CHECKERED_LIME_CONCRETE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/checkered_lime_concrete_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.CHECKERED_LIME_CONCRETE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/checkered_lime_concrete_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.CHECKERED_LIME_CONCRETE_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/checkered_green_concrete_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.CHECKERED_GREEN_CONCRETE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/checkered_green_concrete_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.CHECKERED_GREEN_CONCRETE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/checkered_green_concrete_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.CHECKERED_GREEN_CONCRETE_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/checkered_cyan_concrete_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.CHECKERED_CYAN_CONCRETE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/checkered_cyan_concrete_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.CHECKERED_CYAN_CONCRETE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/checkered_cyan_concrete_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.CHECKERED_CYAN_CONCRETE_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/checkered_light_blue_concrete_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.CHECKERED_LIGHT_BLUE_CONCRETE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/checkered_light_blue_concrete_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.CHECKERED_LIGHT_BLUE_CONCRETE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/checkered_light_blue_concrete_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.CHECKERED_LIGHT_BLUE_CONCRETE_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/checkered_blue_concrete_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.CHECKERED_BLUE_CONCRETE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/checkered_blue_concrete_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.CHECKERED_BLUE_CONCRETE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/checkered_blue_concrete_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.CHECKERED_BLUE_CONCRETE_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/checkered_purple_concrete_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.CHECKERED_PURPLE_CONCRETE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/checkered_purple_concrete_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.CHECKERED_PURPLE_CONCRETE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/checkered_purple_concrete_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.CHECKERED_PURPLE_CONCRETE_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/checkered_magenta_concrete_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.CHECKERED_MAGENTA_CONCRETE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/checkered_magenta_concrete_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.CHECKERED_MAGENTA_CONCRETE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/checkered_magenta_concrete_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.CHECKERED_MAGENTA_CONCRETE_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/checkered_pink_concrete_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.CHECKERED_PINK_CONCRETE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/checkered_pink_concrete_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.CHECKERED_PINK_CONCRETE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/checkered_pink_concrete_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.CHECKERED_PINK_CONCRETE_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/infested_mossy_deepslate_bricks"),
                BlockLootTableGenerator.drops(DecoBlocks.INFESTED_MOSSY_DEEPSLATE_BRICKS, DecoBlocks.MOSSY_DEEPSLATE_BRICKS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/infested_mossy_polished_blackstone_bricks"),
                BlockLootTableGenerator.drops(DecoBlocks.INFESTED_MOSSY_POLISHED_BLACKSTONE_BRICKS, DecoBlocks.MOSSY_POLISHED_BLACKSTONE_BRICKS));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/infested_cut_andesite"),
                BlockLootTableGenerator.drops(DecoBlocks.INFESTED_CUT_ANDESITE, DecoBlocks.CUT_ANDESITE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/infested_andesite_bricks"),
                BlockLootTableGenerator.drops(DecoBlocks.INFESTED_ANDESITE_BRICKS, DecoBlocks.ANDESITE_BRICKS));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/infested_cut_granite"),
                BlockLootTableGenerator.drops(DecoBlocks.INFESTED_CUT_GRANITE, DecoBlocks.CUT_GRANITE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/infested_granite_bricks"),
                BlockLootTableGenerator.drops(DecoBlocks.INFESTED_GRANITE_BRICKS, DecoBlocks.GRANITE_BRICKS));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/infested_cut_diorite"),
                BlockLootTableGenerator.drops(DecoBlocks.INFESTED_CUT_DIORITE, DecoBlocks.CUT_DIORITE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/infested_diorite_bricks"),
                BlockLootTableGenerator.drops(DecoBlocks.INFESTED_DIORITE_BRICKS, DecoBlocks.DIORITE_BRICKS));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/infested_polished_calcite"),
                BlockLootTableGenerator.drops(DecoBlocks.INFESTED_POLISHED_CALCITE, DecoBlocks.POLISHED_CALCITE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/infested_cut_calcite"),
                BlockLootTableGenerator.drops(DecoBlocks.INFESTED_CUT_CALCITE, DecoBlocks.CUT_CALCITE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/infested_calcite_bricks"),
                BlockLootTableGenerator.drops(DecoBlocks.INFESTED_CALCITE_BRICKS, DecoBlocks.CALCITE_BRICKS));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/iris"),
                BlockLootTableGenerator.drops(DecoBlocks.IRIS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/potted_iris"),
                BlockLootTableGenerator.pottedPlantDrops(DecoBlocks.POTTED_IRIS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/blue_delphinium"),
                BlockLootTableGenerator.drops(DecoBlocks.BLUE_DELPHINIUM));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/potted_blue_delphinium"),
                BlockLootTableGenerator.pottedPlantDrops(DecoBlocks.POTTED_BLUE_DELPHINIUM));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/cyan_orchid"),
                BlockLootTableGenerator.drops(DecoBlocks.CYAN_ORCHID));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/potted_cyan_orchid"),
                BlockLootTableGenerator.pottedPlantDrops(DecoBlocks.POTTED_CYAN_ORCHID));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/felicia_daisy"),
                BlockLootTableGenerator.drops(DecoBlocks.FELICIA_DAISY));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/potted_felicia_daisy"),
                BlockLootTableGenerator.pottedPlantDrops(DecoBlocks.POTTED_FELICIA_DAISY));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/jack_o_soul_lantern"),
                BlockLootTableGenerator.drops(DecoBlocks.JACK_O_SOUL_LANTERN));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/nether_brick_pillar"),
                BlockLootTableGenerator.drops(DecoBlocks.NETHER_BRICK_PILLAR));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/red_nether_brick_pillar"),
                BlockLootTableGenerator.drops(DecoBlocks.RED_NETHER_BRICK_PILLAR));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/blue_nether_brick_pillar"),
                BlockLootTableGenerator.drops(DecoBlocks.BLUE_NETHER_BRICK_PILLAR));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/dripstone_bricks"),
                BlockLootTableGenerator.drops(DecoBlocks.DRIPSTONE_BRICKS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/dripstone_brick_pillar"),
                BlockLootTableGenerator.drops(DecoBlocks.DRIPSTONE_BRICK_PILLAR));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/void_stone_brick_pillar"),
                BlockLootTableGenerator.drops(DecoBlocks.VOID_STONE_BRICK_PILLAR));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/casted_iron"),
                BlockLootTableGenerator.drops(DecoBlocks.CASTED_IRON));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/casted_iron_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.CASTED_IRON_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/casted_iron_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.CASTED_IRON_SLAB));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/dripstone_brick_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.DRIPSTONE_BRICK_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/dripstone_brick_pillar_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.DRIPSTONE_BRICK_PILLAR_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/void_stone_brick_pillar_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.VOID_STONE_BRICK_PILLAR_STAIRS));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/dripstone_brick_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.DRIPSTONE_BRICK_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/dripstone_brick_pillar_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.DRIPSTONE_BRICK_PILLAR_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/void_stone_brick_pillar_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.VOID_STONE_BRICK_PILLAR_SLAB));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/dripstone_brick_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.DRIPSTONE_BRICK_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/dripstone_brick_pillar_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.DRIPSTONE_BRICK_PILLAR_WALL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/void_stone_brick_pillar_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.VOID_STONE_BRICK_PILLAR_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/chiseled_dripstone"),
                BlockLootTableGenerator.drops(DecoBlocks.CHISELED_DRIPSTONE));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/tube_coral_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.TUBE_CORAL_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/tube_coral_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.TUBE_CORAL_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/tube_coral_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.TUBE_CORAL_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/brain_coral_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.BRAIN_CORAL_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/brain_coral_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.BRAIN_CORAL_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/brain_coral_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.BRAIN_CORAL_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/bubble_coral_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.BUBBLE_CORAL_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/bubble_coral_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.BUBBLE_CORAL_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/bubble_coral_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.BUBBLE_CORAL_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/fire_coral_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.FIRE_CORAL_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/fire_coral_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.FIRE_CORAL_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/fire_coral_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.FIRE_CORAL_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/horn_coral_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.HORN_CORAL_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/horn_coral_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.HORN_CORAL_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/horn_coral_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.HORN_CORAL_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/dead_tube_coral_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.DEAD_TUBE_CORAL_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/dead_tube_coral_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.DEAD_TUBE_CORAL_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/dead_tube_coral_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.DEAD_TUBE_CORAL_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/dead_brain_coral_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.DEAD_BRAIN_CORAL_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/dead_brain_coral_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.DEAD_BRAIN_CORAL_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/dead_brain_coral_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.DEAD_BRAIN_CORAL_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/dead_bubble_coral_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.DEAD_BUBBLE_CORAL_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/dead_bubble_coral_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.DEAD_BUBBLE_CORAL_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/dead_bubble_coral_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.DEAD_BUBBLE_CORAL_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/dead_fire_coral_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.DEAD_FIRE_CORAL_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/dead_fire_coral_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.DEAD_FIRE_CORAL_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/dead_fire_coral_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.DEAD_FIRE_CORAL_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/dead_horn_coral_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.DEAD_HORN_CORAL_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/dead_horn_coral_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.DEAD_HORN_CORAL_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/dead_horn_coral_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.DEAD_HORN_CORAL_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/hydrated_tube_coral"),
                BlockLootTableGenerator.drops(DecoBlocks.HYDRATED_TUBE_CORAL, Items.TUBE_CORAL,
                        ConstantLootNumberProvider.create(1.0F)));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/hydrated_brain_coral"),
                BlockLootTableGenerator.drops(DecoBlocks.HYDRATED_BRAIN_CORAL, Items.BRAIN_CORAL,
                        ConstantLootNumberProvider.create(1.0F)));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/hydrated_bubble_coral"),
                BlockLootTableGenerator.drops(DecoBlocks.HYDRATED_BUBBLE_CORAL, Items.BUBBLE_CORAL,
                        ConstantLootNumberProvider.create(1.0F)));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/hydrated_fire_coral"),
                BlockLootTableGenerator.drops(DecoBlocks.HYDRATED_FIRE_CORAL, Items.FIRE_CORAL,
                        ConstantLootNumberProvider.create(1.0F)));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/hydrated_horn_coral"),
                BlockLootTableGenerator.drops(DecoBlocks.HYDRATED_HORN_CORAL, Items.HORN_CORAL,
                        ConstantLootNumberProvider.create(1.0F)));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/hydrated_tube_coral_fan"),
                BlockLootTableGenerator.drops(DecoBlocks.HYDRATED_TUBE_CORAL_FAN, Items.TUBE_CORAL_FAN,
                        ConstantLootNumberProvider.create(1.0F)));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/hydrated_brain_coral_fan"),
                BlockLootTableGenerator.drops(DecoBlocks.HYDRATED_BRAIN_CORAL_FAN, Items.BRAIN_CORAL_FAN,
                        ConstantLootNumberProvider.create(1.0F)));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/hydrated_bubble_coral_fan"),
                BlockLootTableGenerator.drops(DecoBlocks.HYDRATED_BUBBLE_CORAL_FAN, Items.BUBBLE_CORAL_FAN,
                        ConstantLootNumberProvider.create(1.0F)));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/hydrated_fire_coral_fan"),
                BlockLootTableGenerator.drops(DecoBlocks.HYDRATED_FIRE_CORAL_FAN, Items.FIRE_CORAL_FAN,
                        ConstantLootNumberProvider.create(1.0F)));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/hydrated_horn_coral_fan"),
                BlockLootTableGenerator.drops(DecoBlocks.HYDRATED_HORN_CORAL_FAN, Items.HORN_CORAL_FAN,
                        ConstantLootNumberProvider.create(1.0F)));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/hydrated_tube_coral_block"),
                BlockLootTableGenerator.drops(DecoBlocks.HYDRATED_TUBE_CORAL_BLOCK, Items.TUBE_CORAL_BLOCK,
                        ConstantLootNumberProvider.create(1.0F)));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/hydrated_brain_coral_block"),
                BlockLootTableGenerator.drops(DecoBlocks.HYDRATED_BRAIN_CORAL_BLOCK, Items.BRAIN_CORAL_BLOCK,
                        ConstantLootNumberProvider.create(1.0F)));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/hydrated_bubble_coral_block"),
                BlockLootTableGenerator.drops(DecoBlocks.HYDRATED_BUBBLE_CORAL_BLOCK, Items.BUBBLE_CORAL_BLOCK,
                        ConstantLootNumberProvider.create(1.0F)));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/hydrated_fire_coral_block"),
                BlockLootTableGenerator.drops(DecoBlocks.HYDRATED_FIRE_CORAL_BLOCK, Items.FIRE_CORAL_BLOCK,
                        ConstantLootNumberProvider.create(1.0F)));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/hydrated_horn_coral_block"),
                BlockLootTableGenerator.drops(DecoBlocks.HYDRATED_HORN_CORAL_BLOCK, Items.HORN_CORAL_BLOCK,
                        ConstantLootNumberProvider.create(1.0F)));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/hydrated_tube_coral_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.HYDRATED_TUBE_CORAL_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/hydrated_tube_coral_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.HYDRATED_TUBE_CORAL_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/hydrated_tube_coral_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.HYDRATED_TUBE_CORAL_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/hydrated_brain_coral_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.HYDRATED_BRAIN_CORAL_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/hydrated_brain_coral_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.HYDRATED_BRAIN_CORAL_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/hydrated_brain_coral_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.HYDRATED_BRAIN_CORAL_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/hydrated_bubble_coral_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.HYDRATED_BUBBLE_CORAL_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/hydrated_bubble_coral_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.HYDRATED_BUBBLE_CORAL_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/hydrated_bubble_coral_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.HYDRATED_BUBBLE_CORAL_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/hydrated_fire_coral_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.HYDRATED_FIRE_CORAL_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/hydrated_fire_coral_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.HYDRATED_FIRE_CORAL_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/hydrated_fire_coral_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.HYDRATED_FIRE_CORAL_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/hydrated_horn_coral_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.HYDRATED_HORN_CORAL_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/hydrated_horn_coral_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.HYDRATED_HORN_CORAL_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/hydrated_horn_coral_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.HYDRATED_HORN_CORAL_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/hay_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.HAY_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/hay_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.HAY_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/hay_carpet"),
                BlockLootTableGenerator.drops(DecoBlocks.HAY_CARPET));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/nether_wart_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.NETHER_WART_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/nether_wart_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.NETHER_WART_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/warped_wart_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.WARPED_WART_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/warped_wart_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.WARPED_WART_SLAB));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/sculk_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.SCULK_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/sculk_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.SCULK_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/sculk_carpet"),
                BlockLootTableGenerator.drops(DecoBlocks.SCULK_CARPET));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/honeycomb_stairs"),
                BlockLootTableGenerator.drops(DecoBlocks.HONEYCOMB_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/honeycomb_slab"),
                BlockLootTableGenerator.slabDrops(DecoBlocks.HONEYCOMB_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/honeycomb_wall"),
                BlockLootTableGenerator.drops(DecoBlocks.HONEYCOMB_WALL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/glowing_glass"),
                BlockLootTableGenerator.dropsWithSilkTouch(DecoBlocks.GLOWING_GLASS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/glowing_glass_pane"),
                BlockLootTableGenerator.dropsWithSilkTouch(DecoBlocks.GLOWING_GLASS_PANE));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/hardened_glowing_glass"),
                BlockLootTableGenerator.drops(DecoBlocks.HARDENED_GLOWING_GLASS));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/hardened_glowing_glass_pane"),
                BlockLootTableGenerator.drops(DecoBlocks.HARDENED_GLOWING_GLASS_PANE));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/taiga_dandelion"),
                BlockLootTableGenerator.drops(DecoBlocks.TAIGA_DANDELION));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/potted_taiga_dandelion"),
                BlockLootTableGenerator.pottedPlantDrops(DecoBlocks.POTTED_TAIGA_DANDELION));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/fern_lavender"),
                BlockLootTableGenerator.drops(DecoBlocks.FERN_LAVENDER));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/potted_fern_lavender"),
                BlockLootTableGenerator.pottedPlantDrops(DecoBlocks.POTTED_FERN_LAVENDER));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/caramel_buttercup"),
                BlockLootTableGenerator.drops(DecoBlocks.CARAMEL_BUTTERCUP));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/potted_caramel_buttercup"),
                BlockLootTableGenerator.pottedPlantDrops(DecoBlocks.POTTED_CARAMEL_BUTTERCUP));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/silver_rose"),
                BlockLootTableGenerator.drops(DecoBlocks.SILVER_ROSE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/potted_silver_rose"),
                BlockLootTableGenerator.pottedPlantDrops(DecoBlocks.POTTED_SILVER_ROSE));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/alpine_speedwell"),
                BlockLootTableGenerator.drops(DecoBlocks.ALPINE_SPEEDWELL));
        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/potted_alpine_speedwell"),
                BlockLootTableGenerator.pottedPlantDrops(DecoBlocks.POTTED_ALPINE_SPEEDWELL));

        identifierBuilderBiConsumer.accept(new Identifier(VaranDeco.MOD_ID,"blocks/gold_chain"),
                BlockLootTableGenerator.drops(DecoBlocks.GOLD_CHAIN));

    }
}
