package net.gecko.varandeco.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class DecoFoodComponents {
    public static final FoodComponent LILAC_STEW = createStew(6).alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.MINING_FATIGUE, 100, 0), 1.0F).build();

    private static FoodComponent.Builder createStew(int hunger) {
        return new FoodComponent.Builder().hunger(hunger).saturationModifier(0.6F);
    }
}
