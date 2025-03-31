package net.gecko.varandeco;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;
import net.gecko.varandeco.block.DecoBlocks;
import net.gecko.varandeco.block.entity.DecoBlockEntities;
import net.gecko.varandeco.item.DecoItems;
import net.minecraft.block.Blocks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.slf4j.LoggerFactory.*;

public class VaranDeco implements ModInitializer {
	public static final String MOD_ID = "varan-deco";

	public static final Logger LOGGER = getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		DecoItems.registerDecoItems();
		DecoBlocks.registerDecoBlocks();
		DecoBlockEntities.registerBlockEntities();

		FlammableBlockRegistry.getDefaultInstance().add(DecoBlocks.CACTUS_PLANKS,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(Blocks.CACTUS,5,5);

		OxidizableBlocksRegistry.registerWaxableBlockPair(DecoBlocks.HEAVY_COPPER_BARS, DecoBlocks.WAXED_HEAVY_COPPER_BARS);
		OxidizableBlocksRegistry.registerWaxableBlockPair(DecoBlocks.EXPOSED_HEAVY_COPPER_BARS, DecoBlocks.WAXED_EXPOSED_HEAVY_COPPER_BARS);
		OxidizableBlocksRegistry.registerWaxableBlockPair(DecoBlocks.WEATHERED_HEAVY_COPPER_BARS, DecoBlocks.WAXED_WEATHERED_HEAVY_COPPER_BARS);
		OxidizableBlocksRegistry.registerWaxableBlockPair(DecoBlocks.OXIDIZED_HEAVY_COPPER_BARS, DecoBlocks.WAXED_OXIDIZED_HEAVY_COPPER_BARS);

		OxidizableBlocksRegistry.registerOxidizableBlockPair(DecoBlocks.HEAVY_COPPER_BARS, DecoBlocks.EXPOSED_HEAVY_COPPER_BARS);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(DecoBlocks.EXPOSED_HEAVY_COPPER_BARS, DecoBlocks.WEATHERED_HEAVY_COPPER_BARS);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(DecoBlocks.WEATHERED_HEAVY_COPPER_BARS, DecoBlocks.OXIDIZED_HEAVY_COPPER_BARS);

		LOGGER.info("Hello Fabric world!");
	}
}