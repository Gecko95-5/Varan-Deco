package net.gecko.varandeco.util;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.LivingEntity;
import net.minecraft.registry.entry.RegistryEntry;

public class DecoEnchantmentHelper extends EnchantmentHelper {

    public static boolean hasFeatherFalling(LivingEntity entity) {
        return getEquipmentLevel((RegistryEntry<Enchantment>) Enchantments.FEATHER_FALLING, entity) > 0;
    }
}
