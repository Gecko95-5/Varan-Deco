package net.gecko.varandeco;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;
import net.gecko.varandeco.block.DecoBlocks;
import net.gecko.varandeco.block.entity.DecoBlockEntities;
import net.gecko.varandeco.item.DecoItems;
import net.gecko.varandeco.util.DecoTags;
import net.gecko.varandeco.world.feature.DecoConfiguredFeatures;
import net.gecko.varandeco.world.gen.DecoWorldGeneration;
import net.minecraft.block.Blocks;
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

		FlammableBlockRegistry.getDefaultInstance().add(DecoBlocks.ROSE,60, 100);
		FlammableBlockRegistry.getDefaultInstance().add(DecoBlocks.ENDER_ROSE,60, 100);
		FlammableBlockRegistry.getDefaultInstance().add(DecoBlocks.WITHER_ROSE_BUSH,60, 100);
		FlammableBlockRegistry.getDefaultInstance().add(DecoBlocks.ENDER_ROSE_BUSH,60, 100);

		FlammableBlockRegistry.getDefaultInstance().add(DecoBlocks.RED_SUNFLOWER,60, 100);
		FlammableBlockRegistry.getDefaultInstance().add(DecoBlocks.NOVA_STARFLOWER,60, 100);

		FlammableBlockRegistry.getDefaultInstance().add(DecoBlocks.PAEONIA,60, 100);
		FlammableBlockRegistry.getDefaultInstance().add(DecoBlocks.LAVENDER,60, 100);

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

		OxidizableBlocksRegistry.registerWaxableBlockPair(DecoBlocks.COPPER_LANTERN, DecoBlocks.WAXED_COPPER_LANTERN);
		OxidizableBlocksRegistry.registerWaxableBlockPair(DecoBlocks.EXPOSED_COPPER_LANTERN, DecoBlocks.WAXED_EXPOSED_COPPER_LANTERN);
		OxidizableBlocksRegistry.registerWaxableBlockPair(DecoBlocks.WEATHERED_COPPER_LANTERN, DecoBlocks.WAXED_WEATHERED_COPPER_LANTERN);
		OxidizableBlocksRegistry.registerWaxableBlockPair(DecoBlocks.OXIDIZED_COPPER_LANTERN, DecoBlocks.WAXED_OXIDIZED_COPPER_LANTERN);

		OxidizableBlocksRegistry.registerOxidizableBlockPair(DecoBlocks.COPPER_LANTERN, DecoBlocks.EXPOSED_COPPER_LANTERN);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(DecoBlocks.EXPOSED_COPPER_LANTERN, DecoBlocks.WEATHERED_COPPER_LANTERN);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(DecoBlocks.WEATHERED_COPPER_LANTERN, DecoBlocks.OXIDIZED_COPPER_LANTERN);

		OxidizableBlocksRegistry.registerWaxableBlockPair(DecoBlocks.COPPER_SOUL_LANTERN, DecoBlocks.WAXED_COPPER_SOUL_LANTERN);
		OxidizableBlocksRegistry.registerWaxableBlockPair(DecoBlocks.EXPOSED_COPPER_SOUL_LANTERN, DecoBlocks.WAXED_EXPOSED_COPPER_SOUL_LANTERN);
		OxidizableBlocksRegistry.registerWaxableBlockPair(DecoBlocks.WEATHERED_COPPER_SOUL_LANTERN, DecoBlocks.WAXED_WEATHERED_COPPER_SOUL_LANTERN);
		OxidizableBlocksRegistry.registerWaxableBlockPair(DecoBlocks.OXIDIZED_COPPER_SOUL_LANTERN, DecoBlocks.WAXED_OXIDIZED_COPPER_SOUL_LANTERN);

		OxidizableBlocksRegistry.registerOxidizableBlockPair(DecoBlocks.COPPER_SOUL_LANTERN, DecoBlocks.EXPOSED_COPPER_SOUL_LANTERN);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(DecoBlocks.EXPOSED_COPPER_SOUL_LANTERN, DecoBlocks.WEATHERED_COPPER_SOUL_LANTERN);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(DecoBlocks.WEATHERED_COPPER_SOUL_LANTERN, DecoBlocks.OXIDIZED_COPPER_SOUL_LANTERN);

		OxidizableBlocksRegistry.registerWaxableBlockPair(DecoBlocks.COPPER_CHAIN, DecoBlocks.WAXED_COPPER_CHAIN);
		OxidizableBlocksRegistry.registerWaxableBlockPair(DecoBlocks.EXPOSED_COPPER_CHAIN, DecoBlocks.WAXED_EXPOSED_COPPER_CHAIN);
		OxidizableBlocksRegistry.registerWaxableBlockPair(DecoBlocks.WEATHERED_COPPER_CHAIN, DecoBlocks.WAXED_WEATHERED_COPPER_CHAIN);
		OxidizableBlocksRegistry.registerWaxableBlockPair(DecoBlocks.OXIDIZED_COPPER_CHAIN, DecoBlocks.WAXED_OXIDIZED_COPPER_CHAIN);

		OxidizableBlocksRegistry.registerOxidizableBlockPair(DecoBlocks.COPPER_CHAIN, DecoBlocks.EXPOSED_COPPER_CHAIN);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(DecoBlocks.EXPOSED_COPPER_CHAIN, DecoBlocks.WEATHERED_COPPER_CHAIN);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(DecoBlocks.WEATHERED_COPPER_CHAIN, DecoBlocks.OXIDIZED_COPPER_CHAIN);

		OxidizableBlocksRegistry.registerWaxableBlockPair(DecoBlocks.COPPER_WEIGHT_PRESSURE_PLATE, DecoBlocks.WAXED_COPPER_WEIGHT_PRESSURE_PLATE);
		OxidizableBlocksRegistry.registerWaxableBlockPair(EXPOSED_COPPER_WEIGHT_PRESSURE_PLATE, DecoBlocks.WAXED_EXPOSED_COPPER_WEIGHT_PRESSURE_PLATE);
		OxidizableBlocksRegistry.registerWaxableBlockPair(DecoBlocks.WEATHERED_COPPER_WEIGHT_PRESSURE_PLATE, DecoBlocks.WAXED_WEATHERED_COPPER_WEIGHT_PRESSURE_PLATE);
		OxidizableBlocksRegistry.registerWaxableBlockPair(DecoBlocks.OXIDIZED_COPPER_WEIGHT_PRESSURE_PLATE, DecoBlocks.WAXED_OXIDIZED_COPPER_WEIGHT_PRESSURE_PLATE);

		OxidizableBlocksRegistry.registerOxidizableBlockPair(DecoBlocks.COPPER_WEIGHT_PRESSURE_PLATE, EXPOSED_COPPER_WEIGHT_PRESSURE_PLATE);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(DecoBlocks.EXPOSED_COPPER_WEIGHT_PRESSURE_PLATE, DecoBlocks.WEATHERED_COPPER_WEIGHT_PRESSURE_PLATE);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(DecoBlocks.WEATHERED_COPPER_WEIGHT_PRESSURE_PLATE, DecoBlocks.OXIDIZED_COPPER_WEIGHT_PRESSURE_PLATE);

		FuelRegistry.INSTANCE.add(DecoBlocks.CHARCOAL_BLOCK,16000);
		FuelRegistry.INSTANCE.add(DecoTags.Items.WOODED_CRAFTING_TABLES,300);
		FuelRegistry.INSTANCE.add(DecoTags.Items.DECO_LADDER,300);
		FuelRegistry.INSTANCE.add(DecoTags.Items.DECO_CARTOGRAPHY_TABLES,300);
		FuelRegistry.INSTANCE.add(DecoTags.Items.DECO_SMITHING_TABLES,300);
		FuelRegistry.INSTANCE.add(DecoTags.Items.DECO_BARRELS,300);

		LOGGER.info("Hello Fabric world!");
	}
}