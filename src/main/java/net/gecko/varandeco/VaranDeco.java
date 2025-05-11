package net.gecko.varandeco;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.gecko.varandeco.block.DecoBlocks;
import net.gecko.varandeco.block.entity.DecoBlockEntities;
import net.gecko.varandeco.item.DecoItems;
import net.gecko.varandeco.potion.DecoPotion;
import net.gecko.varandeco.util.*;
import net.gecko.varandeco.world.feature.DecoConfiguredFeatures;
import net.gecko.varandeco.world.gen.DecoWorldGeneration;
import net.minecraft.block.Blocks;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.color.world.FoliageColors;
import org.slf4j.Logger;

import static net.gecko.varandeco.block.DecoBlocks.EXPOSED_COPPER_WEIGHT_PRESSURE_PLATE;
import static org.slf4j.LoggerFactory.*;

public class VaranDeco implements ModInitializer {
	public static final String MOD_ID = "varan-deco";

	public static final Logger LOGGER = getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		DecoItems.registerDecoItems();
		DecoBlocks.registerDecoBlocks();
		DecoBlockEntities.registerBlockEntities();
		DecoConfiguredFeatures.registerConfiguredFeatures();
		DecoWorldGeneration.generateWorldGen();
		DecoCustomTrades.registerCustomTrades();
		DecoPotion.registerPotions();
		DecoFlammableBlocks.registerFlammableBlocks();
		DecoStrippableBlocks.registerStrippables();
		DecoOxidizableBlocks.registerOxidizableBlocks();
		DecoOxidizableBlocks.registerWaxableBlocks();
		DecoLootTableModifiers.modifyLootTables();

		ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) ->
						world != null && pos != null ? BiomeColors.getFoliageColor(world, pos) : FoliageColors.getDefaultColor(),
				DecoBlocks.WOODEN_LEAVES);
		ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 4764952, DecoBlocks.WOODEN_LEAVES.asItem());

		FuelRegistry.INSTANCE.add(DecoBlocks.CHARCOAL_BLOCK,16000);
		FuelRegistry.INSTANCE.add(DecoTags.Items.WOODED_CRAFTING_TABLES,300);
		FuelRegistry.INSTANCE.add(DecoTags.Items.DECO_LADDER,300);
		FuelRegistry.INSTANCE.add(DecoTags.Items.DECO_CARTOGRAPHY_TABLES,300);
		FuelRegistry.INSTANCE.add(DecoTags.Items.DECO_SMITHING_TABLES,300);
		FuelRegistry.INSTANCE.add(DecoTags.Items.DECO_BARRELS,300);

		LOGGER.info("Hello Fabric world!");
	}
}