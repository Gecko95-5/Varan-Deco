package net.gecko.varandeco;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.gecko.varandeco.block.DecoBlocks;
import net.gecko.varandeco.block.entity.DecoBlockEntities;
import net.gecko.varandeco.entity.DecoBoats;
import net.gecko.varandeco.entity.DecoEntities;
import net.gecko.varandeco.item.DecoItemGroup;
import net.gecko.varandeco.item.DecoItems;
import net.gecko.varandeco.potion.DecoPotion;
import net.gecko.varandeco.util.*;
import net.gecko.varandeco.world.gen.DecoWorldGeneration;
import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

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
		DecoComposterRecipes.registerCompostableItems();
		DecoEntities.registerDecoEntities();

		FuelRegistry.INSTANCE.add(DecoBlocks.CHARCOAL_BLOCK,16000);
		FuelRegistry.INSTANCE.add(DecoTags.Items.WOODEN_CRAFTING_TABLES,300);
		FuelRegistry.INSTANCE.add(DecoTags.Items.DECO_LADDER,300);
		FuelRegistry.INSTANCE.add(DecoTags.Items.WOODEN_CARTOGRAPHY_TABLES,300);
		FuelRegistry.INSTANCE.add(DecoTags.Items.WOODEN_SMITHING_TABLES,300);
		FuelRegistry.INSTANCE.add(DecoTags.Items.WOODEN_BARRELS,300);
        FuelRegistry.INSTANCE.add(DecoBlocks.COAL_BRICKS,3200);
        FuelRegistry.INSTANCE.add(DecoBlocks.CHISELED_COAL_BRICKS,3200);
        FuelRegistry.INSTANCE.add(DecoBlocks.COAL_BRICK_STAIRS,3200);
        FuelRegistry.INSTANCE.add(DecoBlocks.COAL_BRICK_SLAB,1600);
        FuelRegistry.INSTANCE.add(DecoBlocks.COAL_BRICK_WALL,3200);
        FuelRegistry.INSTANCE.add(DecoBlocks.COAL_STAIRS,16000);
        FuelRegistry.INSTANCE.add(DecoBlocks.COAL_SLAB,8000);
        FuelRegistry.INSTANCE.add(DecoBlocks.COAL_WALL,16000);
        FuelRegistry.INSTANCE.add(DecoBlocks.CHARCOAL_STAIRS,16000);
        FuelRegistry.INSTANCE.add(DecoBlocks.CHARCOAL_SLAB,8000);
        FuelRegistry.INSTANCE.add(DecoBlocks.CHARCOAL_WALL,16000);
		FuelRegistry.INSTANCE.add(DecoTags.Items.WOODEN_BOOKSHELVES,300);
		FuelRegistry.INSTANCE.add(DecoTags.Items.WOODEN_BOOKSHELF_SLABS,150);
		FuelRegistry.INSTANCE.add(DecoTags.Items.WOODEN_BOOKSHELF_STAIRS,300);
		FuelRegistry.INSTANCE.add(DecoTags.Items.MOSAIC_WOOD,300);
		FuelRegistry.INSTANCE.add(DecoTags.Items.MOSAIC_STAIRS,300);
		FuelRegistry.INSTANCE.add(DecoTags.Items.MOSAIC_SLABS,150);

        FuelRegistry.INSTANCE.add(DecoTags.Items.LOG_STAIRS,300);
        FuelRegistry.INSTANCE.add(DecoTags.Items.LOG_SLABS,150);
        FuelRegistry.INSTANCE.add(DecoTags.Items.LOG_WALLS,300);


		LOGGER.info("Hello Fabric world!");
	}
}