package net.gecko.varandeco;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fabricmc.fabric.api.registry.*;
import net.gecko.varandeco.block.DecoBlockSets;
import net.gecko.varandeco.block.DecoBlocks;
import net.gecko.varandeco.block.entity.DecoBlockEntities;
import net.gecko.varandeco.entity.DecoBoats;
import net.gecko.varandeco.item.DecoItemGroup;
import net.gecko.varandeco.item.DecoItems;
import net.gecko.varandeco.potion.DecoPotion;
import net.gecko.varandeco.util.*;
import net.gecko.varandeco.world.gen.DecoWorldGeneration;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.item.Items;
import net.minecraft.potion.Potions;
import net.minecraft.world.biome.FoliageColors;
import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.*;

public class VaranDeco implements ModInitializer {
	public static final String MOD_ID = "varan-deco";

	public static final Logger LOGGER = getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		DecoItemGroup.registerItemGroups();
		DecoItems.registerDecoItems();
		DecoBlocks.registerDecoBlocks();
		DecoBlockEntities.registerBlockEntities();
		DecoWorldGeneration.generateWorldGen();
		DecoCustomTrades.registerCustomTrades();
		DecoPotion.registerPotions();
		DecoBoats.registerBoats();
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
		FuelRegistry.INSTANCE.add(DecoTags.Items.DECO_BOOKSHELVES,300);
		FuelRegistry.INSTANCE.add(DecoTags.Items.MOSAIC_WOOD,300);
		FuelRegistry.INSTANCE.add(DecoTags.Items.MOSAIC_STAIRS,300);
		FuelRegistry.INSTANCE.add(DecoTags.Items.MOSAIC_SLABS,150);

		LOGGER.info("Hello Fabric world!");

		FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
			builder.registerPotionRecipe(Potions.AWKWARD, DecoItems.BUBBLE_ORB, DecoPotion.WATER_BUBBLE_POTION);
			builder.registerPotionRecipe(DecoPotion.WATER_BUBBLE_POTION, Items.REDSTONE, DecoPotion.LONG_WATER_BUBBLE_POTION);
			builder.registerPotionRecipe(DecoPotion.WATER_BUBBLE_POTION, Items.GLOWSTONE, DecoPotion.STRONG_WATER_BUBBLE_POTION);
			builder.registerPotionRecipe(Potions.WATER, DecoItems.WARPED_WART, Potions.AWKWARD);
		});
	}
}