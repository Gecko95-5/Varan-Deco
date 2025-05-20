package net.gecko.varandeco;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.gecko.varandeco.datagen.*;

public class VaranDecoDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		fabricDataGenerator.addProvider(DecoLootTableGenerator::new);
		fabricDataGenerator.addProvider(DecoRecipeGenerator::new);
		fabricDataGenerator.addProvider(DecoModelProvider::new);
		fabricDataGenerator.addProvider(DecoBlockTagProvider::new);
		fabricDataGenerator.addProvider(DecoItemTagProvider::new);
	}
}
