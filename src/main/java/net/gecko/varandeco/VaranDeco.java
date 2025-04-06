package net.gecko.varandeco;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;
import net.gecko.varandeco.block.DecoBlocks;
import net.gecko.varandeco.block.entity.DecoBlockEntities;
import net.gecko.varandeco.item.DecoItems;
import net.gecko.varandeco.world.feature.DecoConfiguredFeatures;
import net.gecko.varandeco.world.gen.DecoWorldGeneration;
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
		DecoConfiguredFeatures.registerConfiguredFeatures();
		DecoWorldGeneration.generateWorldGen();

		FlammableBlockRegistry.getDefaultInstance().add(DecoBlocks.CACTUS_PLANKS,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(Blocks.CACTUS,5,5);

		FlammableBlockRegistry.getDefaultInstance().add(DecoBlocks.YELLOW_TULIP,60, 100);
		FlammableBlockRegistry.getDefaultInstance().add(DecoBlocks.PURPLE_TULIP,60, 100);
		FlammableBlockRegistry.getDefaultInstance().add(DecoBlocks.MAGENTA_TULIP,60, 100);
		FlammableBlockRegistry.getDefaultInstance().add(DecoBlocks.BLACK_TULIP,60, 100);
		FlammableBlockRegistry.getDefaultInstance().add(DecoBlocks.GREEN_TULIP,60, 100);
		FlammableBlockRegistry.getDefaultInstance().add(DecoBlocks.BLUE_TULIP,60, 100);
		FlammableBlockRegistry.getDefaultInstance().add(DecoBlocks.CYAN_TULIP,60, 100);

		FlammableBlockRegistry.getDefaultInstance().add(DecoBlocks.BARBERTON_DAISY,60, 100);
		FlammableBlockRegistry.getDefaultInstance().add(DecoBlocks.BLUE_EYED_DAISY,60, 100);
		FlammableBlockRegistry.getDefaultInstance().add(DecoBlocks.GERBERA_DAISY,60, 100);
		FlammableBlockRegistry.getDefaultInstance().add(DecoBlocks.MICHAELMAS_DAISY,60, 100);

		FlammableBlockRegistry.getDefaultInstance().add(DecoBlocks.PUFFY_DANDELION,60, 100);

		FlammableBlockRegistry.getDefaultInstance().add(DecoBlocks.CALIFORNIA_POPPY,60, 100);
		FlammableBlockRegistry.getDefaultInstance().add(DecoBlocks.SALMON_POPPY,60, 100);

		FlammableBlockRegistry.getDefaultInstance().add(DecoBlocks.YELLOW_ORCHID,60, 100);
		FlammableBlockRegistry.getDefaultInstance().add(DecoBlocks.WHITE_ORCHID,60, 100);
		FlammableBlockRegistry.getDefaultInstance().add(DecoBlocks.PINK_ORCHID,60, 100);

		OxidizableBlocksRegistry.registerWaxableBlockPair(DecoBlocks.HEAVY_COPPER_BARS, DecoBlocks.WAXED_HEAVY_COPPER_BARS);
		OxidizableBlocksRegistry.registerWaxableBlockPair(DecoBlocks.EXPOSED_HEAVY_COPPER_BARS, DecoBlocks.WAXED_EXPOSED_HEAVY_COPPER_BARS);
		OxidizableBlocksRegistry.registerWaxableBlockPair(DecoBlocks.WEATHERED_HEAVY_COPPER_BARS, DecoBlocks.WAXED_WEATHERED_HEAVY_COPPER_BARS);
		OxidizableBlocksRegistry.registerWaxableBlockPair(DecoBlocks.OXIDIZED_HEAVY_COPPER_BARS, DecoBlocks.WAXED_OXIDIZED_HEAVY_COPPER_BARS);

		OxidizableBlocksRegistry.registerOxidizableBlockPair(DecoBlocks.HEAVY_COPPER_BARS, DecoBlocks.EXPOSED_HEAVY_COPPER_BARS);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(DecoBlocks.EXPOSED_HEAVY_COPPER_BARS, DecoBlocks.WEATHERED_HEAVY_COPPER_BARS);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(DecoBlocks.WEATHERED_HEAVY_COPPER_BARS, DecoBlocks.OXIDIZED_HEAVY_COPPER_BARS);

		OxidizableBlocksRegistry.registerWaxableBlockPair(DecoBlocks.COPPER_BARS, DecoBlocks.WAXED_COPPER_BARS);
		OxidizableBlocksRegistry.registerWaxableBlockPair(DecoBlocks.EXPOSED_COPPER_BARS, DecoBlocks.WAXED_EXPOSED_COPPER_BARS);
		OxidizableBlocksRegistry.registerWaxableBlockPair(DecoBlocks.WEATHERED_COPPER_BARS, DecoBlocks.WAXED_WEATHERED_COPPER_BARS);
		OxidizableBlocksRegistry.registerWaxableBlockPair(DecoBlocks.OXIDIZED_COPPER_BARS, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS);

		OxidizableBlocksRegistry.registerOxidizableBlockPair(DecoBlocks.COPPER_BARS, DecoBlocks.EXPOSED_COPPER_BARS);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(DecoBlocks.EXPOSED_COPPER_BARS, DecoBlocks.WEATHERED_COPPER_BARS);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(DecoBlocks.WEATHERED_COPPER_BARS, DecoBlocks.OXIDIZED_COPPER_BARS);

		OxidizableBlocksRegistry.registerWaxableBlockPair(DecoBlocks.LIGHT_COPPER_BARS, DecoBlocks.WAXED_LIGHT_COPPER_BARS);
		OxidizableBlocksRegistry.registerWaxableBlockPair(DecoBlocks.EXPOSED_LIGHT_COPPER_BARS, DecoBlocks.WAXED_EXPOSED_LIGHT_COPPER_BARS);
		OxidizableBlocksRegistry.registerWaxableBlockPair(DecoBlocks.WEATHERED_LIGHT_COPPER_BARS, DecoBlocks.WAXED_WEATHERED_LIGHT_COPPER_BARS);
		OxidizableBlocksRegistry.registerWaxableBlockPair(DecoBlocks.OXIDIZED_LIGHT_COPPER_BARS, DecoBlocks.WAXED_OXIDIZED_LIGHT_COPPER_BARS);

		OxidizableBlocksRegistry.registerOxidizableBlockPair(DecoBlocks.LIGHT_COPPER_BARS, DecoBlocks.EXPOSED_LIGHT_COPPER_BARS);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(DecoBlocks.EXPOSED_LIGHT_COPPER_BARS, DecoBlocks.WEATHERED_LIGHT_COPPER_BARS);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(DecoBlocks.WEATHERED_LIGHT_COPPER_BARS, DecoBlocks.OXIDIZED_LIGHT_COPPER_BARS);

		LOGGER.info("Hello Fabric world!");
	}
}