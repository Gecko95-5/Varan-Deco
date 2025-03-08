package net.gecko.varandeco;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.gecko.varandeco.datagen.DecoBlockTagProvider;
import net.gecko.varandeco.datagen.DecoLootTableGenerator;
import net.gecko.varandeco.datagen.DecoModelProvider;
import net.gecko.varandeco.datagen.DecoRecipeGenerator;
import net.minecraft.data.client.ModelProvider;

public class VaranDecoDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		fabricDataGenerator.addProvider(DecoLootTableGenerator::new);
		fabricDataGenerator.addProvider(DecoRecipeGenerator::new);
		fabricDataGenerator.addProvider(DecoModelProvider::new);
		fabricDataGenerator.addProvider(DecoBlockTagProvider::new);
	}
}
