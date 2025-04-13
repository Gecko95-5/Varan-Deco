package net.gecko.varandeco.potion;

import net.gecko.varandeco.VaranDeco;
import net.gecko.varandeco.item.DecoItems;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Items;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;
import net.minecraft.recipe.BrewingRecipeRegistry;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class DecoPotion {

    public static Potion WATER_BUBBLE_POTION;
    public static Potion STRONG_WATER_BUBBLE_POTION;
    public static Potion LONG_WATER_BUBBLE_POTION;


    public static Potion registerBubblePotion(String name) {
        return Registry.register(Registries.POTION, new Identifier(VaranDeco.MOD_ID, name),
                new Potion(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 1800, 0),
                        new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 1800, 0)));
    }    public static Potion registerStrongBubblePotion(String name) {
        return Registry.register(Registries.POTION, new Identifier(VaranDeco.MOD_ID, name),
                new Potion(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 900, 0),
                        new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 900, 1)));
    }
    public static Potion registerLongBubblePotion(String name) {
        return Registry.register(Registries.POTION, new Identifier(VaranDeco.MOD_ID, name),
                new Potion(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 4800, 0),
                        new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 4800, 0)));
    }
    public static void registerPotions(){
        WATER_BUBBLE_POTION = registerBubblePotion("bubble_potion");
        STRONG_WATER_BUBBLE_POTION = registerStrongBubblePotion("strong_bubble_potion");
        LONG_WATER_BUBBLE_POTION = registerLongBubblePotion("long_bubble_potion");

        registerPotionRecipes();
    }

    private static void registerPotionRecipes(){
        BrewingRecipeRegistry.registerPotionRecipe(Potions.AWKWARD, DecoItems.BUBBLE_ORB, DecoPotion.WATER_BUBBLE_POTION);
        BrewingRecipeRegistry.registerPotionRecipe(DecoPotion.WATER_BUBBLE_POTION, Items.REDSTONE, DecoPotion.LONG_WATER_BUBBLE_POTION);
        BrewingRecipeRegistry.registerPotionRecipe(DecoPotion.WATER_BUBBLE_POTION, Items.GLOWSTONE, DecoPotion.STRONG_WATER_BUBBLE_POTION);
        BrewingRecipeRegistry.registerPotionRecipe(Potions.WATER, DecoItems.WARPED_WART, Potions.AWKWARD);
    }
}
