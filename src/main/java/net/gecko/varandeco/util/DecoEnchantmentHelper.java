package net.gecko.varandeco.util;

import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.LivingEntity;

public class DecoEnchantmentHelper extends EnchantmentHelper {

    public static boolean hasFeatherFalling(LivingEntity entity) {
        return getEquipmentLevel(Enchantments.FEATHER_FALLING, entity) > 0;
    }
}
