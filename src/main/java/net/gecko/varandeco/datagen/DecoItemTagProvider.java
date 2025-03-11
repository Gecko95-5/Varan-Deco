package net.gecko.varandeco.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.gecko.varandeco.block.DecoBlocks;
import net.minecraft.tag.ItemTags;
import net.minecraft.tag.ItemTags;

public class DecoItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public DecoItemTagProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected void generateTags() {
        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(DecoBlocks.CACTUS_PLANKS.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_STAIRS)
                .add(DecoBlocks.CACTUS_PLANK_STAIRS.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_SLABS)
                .add(DecoBlocks.CACTUS_PLANK_SLAB.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_FENCES)
                .add(DecoBlocks.CACTUS_PLANK_FENCE.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_BUTTONS)
                .add(DecoBlocks.CACTUS_PLANK_BUTTON.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_PRESSURE_PLATES)
                .add(DecoBlocks.CACTUS_PLANK_PRESSURE_PLATE.asItem());
    }
}
