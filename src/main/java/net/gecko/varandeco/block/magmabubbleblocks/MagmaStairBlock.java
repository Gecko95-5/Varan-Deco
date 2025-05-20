package net.gecko.varandeco.block.magmabubbleblocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.StairsBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class MagmaStairBlock extends StairsBlock {
    public MagmaStairBlock(BlockState baseBlockState, Settings settings) {
        super(baseBlockState, settings);
    }

    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        if (!entity.bypassesSteppingEffects() && entity instanceof LivingEntity) {
            entity.damage(world.getDamageSources().hotFloor(), 1.0F);
        }

        super.onSteppedOn(world, pos, state, entity);
    }
}
