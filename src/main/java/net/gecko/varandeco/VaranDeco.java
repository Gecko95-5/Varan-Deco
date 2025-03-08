package net.gecko.varandeco;

import net.fabricmc.api.ModInitializer;

import net.gecko.varandeco.block.DecoBlocks;
import net.gecko.varandeco.item.DecoItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VaranDeco implements ModInitializer {
	public static final String MOD_ID = "varan-deco";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		DecoItems.registerDecoItems();
		DecoBlocks.registerDecoBlocks();

		LOGGER.info("Hello Fabric world!");
	}
}