package net.gecko.varandeco.block.magmabubbleblocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.WallBlock;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class MagmaBrickWallBlock extends WallBlock {
    public MagmaBrickWallBlock(Settings settings) {
        super(settings);
    }
    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        if (!entity.bypassesSteppingEffects() && entity instanceof LivingEntity) {
            entity.serverDamage(world.getDamageSources().hotFloor(), 0.5F);
        }

        super.onSteppedOn(world, pos, state, entity);
    }
}
