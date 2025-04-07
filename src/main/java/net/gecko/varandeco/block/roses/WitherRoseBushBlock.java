package net.gecko.varandeco.block.roses;

import net.gecko.varandeco.block.DecoBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.TallFlowerBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.Difficulty;
import net.minecraft.world.World;

public class WitherRoseBushBlock extends TallFlowerBlock {
    public WitherRoseBushBlock(Settings settings) {
        super(settings);
    }
    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return super.canPlantOnTop(floor, world, pos) || floor.isOf(Blocks.NETHERRACK) || floor.isOf(Blocks.SOUL_SAND) || floor.isOf(Blocks.SOUL_SOIL);
    }
    @Override
    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        if (!world.isClient && world.getDifficulty() != Difficulty.PEACEFUL) {
            if (entity instanceof LivingEntity livingEntity && !livingEntity.isInvulnerableTo(DamageSource.WITHER)) {
                livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.WITHER, 40));
            }
        }
    }
}
