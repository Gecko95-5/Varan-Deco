package net.gecko.varandeco.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.SimpleFabricLootTableProvider;
import net.gecko.varandeco.VaranDeco;
import net.gecko.varandeco.block.DecoBlocks;
import net.minecraft.data.server.BlockLootTableGenerator;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.context.LootContextTypes;
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
    }
}
