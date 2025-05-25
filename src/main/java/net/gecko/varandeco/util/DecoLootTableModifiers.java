package net.gecko.varandeco.util;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.gecko.varandeco.item.DecoItems;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

public class DecoLootTableModifiers {
    private static final Identifier PUFFERFISH_ID =
            new Identifier("minecraft", "entities/pufferfish");
    private static final Identifier GUARDIAN_ID =
            new Identifier("minecraft", "entities/guardian");
    private static final Identifier DIGGING_ID =
            new Identifier("minecraft", "gameplay/sniffer_digging");

    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (PUFFERFISH_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.01f))
                        .with(ItemEntry.builder(DecoItems.BUBBLE_ORB))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (GUARDIAN_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.01f))
                        .with(ItemEntry.builder(DecoItems.BUBBLE_ORB))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (DIGGING_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(0.5f))
                        .with(ItemEntry.builder(DecoItems.ANCIENT_ROSE_SEEDS))
                        .with(ItemEntry.builder(DecoItems.MIGHTY_LAVENDER_FLOWER))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
        });
    }
}