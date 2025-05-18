package net.gecko.varandeco.block.flowers;

import net.gecko.varandeco.block.DecoBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.TallFlowerBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.Difficulty;
import net.minecraft.world.World;

public class EnderRoseBushBlock extends TallFlowerBlock {
    public EnderRoseBushBlock(Settings settings) {
        super(settings);
    }
    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return super.canPlantOnTop(floor, world, pos) || floor.isOf(Blocks.END_STONE) || floor.isOf(DecoBlocks.VOID_STONE);
    }
    @Override
    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        if (!world.isClient && world.getDifficulty() != Difficulty.PEACEFUL) {
            if (entity instanceof LivingEntity livingEntity && !livingEntity.isInvulnerableTo(world.getDamageSources().magic())) {
                livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, 40));
            }
        }
    }
}
