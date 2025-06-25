package net.gecko.varandeco.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Items;

public class DecoFoodComponents {
    public static final FoodComponent LILAC_STEW = createStew(6).alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.MINING_FATIGUE, 100, 0), 1.0F).build();

    public static final FoodComponent MIGHTY_LAVENDER_STEW = createStew(6).alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 260, 0), 1.0F).build();

    private static FoodComponent.Builder createStew(int hunger) {
        return new FoodComponent.Builder().nutrition(hunger).saturationModifier(0.6F).usingConvertsTo(Items.BOWL);
    }
}
