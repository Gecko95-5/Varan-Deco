package net.gecko.varandeco.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.gecko.varandeco.entity.DecoEntities;

public class DecoEntityTagProvider extends FabricTagProvider.EntityTypeTagProvider {


    public DecoEntityTagProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected void generateTags() {
        getOrCreateTagBuilder(net.minecraft.tag.EntityTypeTags.IMPACT_PROJECTILES)
                .add(DecoEntities.SNOW_BRICK_PROJECTILE);
    }
}
