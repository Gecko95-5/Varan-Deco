package net.gecko.varandeco.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class DecoFoodComponents {
    public static final FoodComponent LILAC_STEW = createStew().alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.MINING_FATIGUE, 100, 0), 1.0F).build();

    public static final FoodComponent MIGHTY_LAVENDER_STEW = createStew().alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 260, 0), 1.0F).build();

    public static final FoodComponent PINK_PETALS_STEW = createStew().alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 60, 0), 1.0F).build();

    private static FoodComponent.Builder createStew() {
        return new FoodComponent.Builder().hunger(6).saturationModifier(0.6F);
    }
}
